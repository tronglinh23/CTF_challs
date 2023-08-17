package x3;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class b<T> implements Iterator<T>, v4.a {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public p1 f18275k = p1.NotReady;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public T f18276l;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18277a;

        static {
            int[] iArr = new int[p1.values().length];
            try {
                iArr[p1.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p1.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18277a = iArr;
        }
    }

    public abstract void a();

    public final void b() {
        this.f18275k = p1.Done;
    }

    public final void d(T t6) {
        this.f18276l = t6;
        this.f18275k = p1.Ready;
    }

    public final boolean f() {
        this.f18275k = p1.Failed;
        a();
        return this.f18275k == p1.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        p1 p1Var = this.f18275k;
        if (p1Var != p1.Failed) {
            int i7 = a.f18277a[p1Var.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    return f();
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f18275k = p1.NotReady;
            return this.f18276l;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
