package x3;

import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes.dex */
public class y extends x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements Iterator<T>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Enumeration<T> f18396k;

        public a(Enumeration<T> enumeration) {
            this.f18396k = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18396k.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f18396k.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @n6.d
    public static final <T> Iterator<T> c0(@n6.d Enumeration<T> enumeration) {
        u4.l0.p(enumeration, "<this>");
        return new a(enumeration);
    }
}