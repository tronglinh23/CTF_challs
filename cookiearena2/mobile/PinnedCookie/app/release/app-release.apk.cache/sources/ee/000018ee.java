package q;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f15063a = false;

    /* loaded from: classes.dex */
    public interface a<T> {
        boolean a(T t6);

        T b();

        void c(T[] tArr, int i7);
    }

    /* loaded from: classes.dex */
    public static class b<T> implements a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Object[] f15064a;

        /* renamed from: b  reason: collision with root package name */
        public int f15065b;

        public b(int i7) {
            if (i7 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f15064a = new Object[i7];
        }

        @Override // q.g.a
        public boolean a(T t6) {
            int i7 = this.f15065b;
            Object[] objArr = this.f15064a;
            if (i7 < objArr.length) {
                objArr[i7] = t6;
                this.f15065b = i7 + 1;
                return true;
            }
            return false;
        }

        @Override // q.g.a
        public T b() {
            int i7 = this.f15065b;
            if (i7 > 0) {
                int i8 = i7 - 1;
                Object[] objArr = this.f15064a;
                T t6 = (T) objArr[i8];
                objArr[i8] = null;
                this.f15065b = i7 - 1;
                return t6;
            }
            return null;
        }

        @Override // q.g.a
        public void c(T[] tArr, int i7) {
            if (i7 > tArr.length) {
                i7 = tArr.length;
            }
            for (int i8 = 0; i8 < i7; i8++) {
                T t6 = tArr[i8];
                int i9 = this.f15065b;
                Object[] objArr = this.f15064a;
                if (i9 < objArr.length) {
                    objArr[i9] = t6;
                    this.f15065b = i9 + 1;
                }
            }
        }

        public final boolean d(T t6) {
            for (int i7 = 0; i7 < this.f15065b; i7++) {
                if (this.f15064a[i7] == t6) {
                    return true;
                }
            }
            return false;
        }
    }
}