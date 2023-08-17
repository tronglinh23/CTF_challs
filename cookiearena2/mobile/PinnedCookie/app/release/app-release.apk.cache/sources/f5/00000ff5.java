package g1;

import d.o0;
import d.q0;

/* loaded from: classes.dex */
public final class r {

    /* loaded from: classes.dex */
    public interface a<T> {
        boolean a(@o0 T t6);

        @q0
        T b();
    }

    /* loaded from: classes.dex */
    public static class b<T> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Object[] f10051a;

        /* renamed from: b  reason: collision with root package name */
        public int f10052b;

        public b(int i7) {
            if (i7 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f10051a = new Object[i7];
        }

        @Override // g1.r.a
        public boolean a(@o0 T t6) {
            if (c(t6)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i7 = this.f10052b;
            Object[] objArr = this.f10051a;
            if (i7 < objArr.length) {
                objArr[i7] = t6;
                this.f10052b = i7 + 1;
                return true;
            }
            return false;
        }

        @Override // g1.r.a
        public T b() {
            int i7 = this.f10052b;
            if (i7 > 0) {
                int i8 = i7 - 1;
                Object[] objArr = this.f10051a;
                T t6 = (T) objArr[i8];
                objArr[i8] = null;
                this.f10052b = i7 - 1;
                return t6;
            }
            return null;
        }

        public final boolean c(@o0 T t6) {
            for (int i7 = 0; i7 < this.f10052b; i7++) {
                if (this.f10051a[i7] == t6) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c<T> extends b<T> {

        /* renamed from: c  reason: collision with root package name */
        public final Object f10053c;

        public c(int i7) {
            super(i7);
            this.f10053c = new Object();
        }

        @Override // g1.r.b, g1.r.a
        public boolean a(@o0 T t6) {
            boolean a7;
            synchronized (this.f10053c) {
                a7 = super.a(t6);
            }
            return a7;
        }

        @Override // g1.r.b, g1.r.a
        public T b() {
            T t6;
            synchronized (this.f10053c) {
                t6 = (T) super.b();
            }
            return t6;
        }
    }
}