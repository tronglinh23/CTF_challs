package i4;

import java.io.Serializable;
import java.lang.Enum;
import n6.e;
import u4.l0;
import v3.g1;
import v3.r;
import x3.p;
@g1(version = "1.8")
@r
/* loaded from: classes.dex */
public final class c<T extends Enum<T>> extends x3.c<T> implements a<T>, Serializable {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final t4.a<T[]> f11013l;
    @e

    /* renamed from: m  reason: collision with root package name */
    public volatile T[] f11014m;

    public c(@n6.d t4.a<T[]> aVar) {
        l0.p(aVar, "entriesProvider");
        this.f11013l = aVar;
    }

    @Override // x3.c, x3.a
    public int a() {
        return f().length;
    }

    public boolean b(@n6.d T t6) {
        l0.p(t6, "element");
        return ((Enum) p.qf(f(), t6.ordinal())) == t6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x3.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return b((Enum) obj);
        }
        return false;
    }

    @Override // x3.c, java.util.List
    @n6.d
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public T get(int i7) {
        T[] f7 = f();
        x3.c.f18278k.b(i7, f7.length);
        return f7[i7];
    }

    public final T[] f() {
        T[] tArr = this.f11014m;
        if (tArr != null) {
            return tArr;
        }
        T[] n7 = this.f11013l.n();
        this.f11014m = n7;
        return n7;
    }

    public int g(@n6.d T t6) {
        l0.p(t6, "element");
        int ordinal = t6.ordinal();
        if (((Enum) p.qf(f(), ordinal)) == t6) {
            return ordinal;
        }
        return -1;
    }

    public int i(@n6.d T t6) {
        l0.p(t6, "element");
        return indexOf(t6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x3.c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return -1;
    }

    public final Object j() {
        return new d(f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x3.c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return i((Enum) obj);
        }
        return -1;
    }
}
