package kotlinx.coroutines.internal;

import java.util.ArrayList;
import v3.m2;

@s4.f
/* loaded from: classes.dex */
public final class q<E> {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final Object f12838a;

    public /* synthetic */ q(Object obj) {
        this.f12838a = obj;
    }

    public static final /* synthetic */ q a(Object obj) {
        return new q(obj);
    }

    @n6.d
    public static <E> Object b(@n6.e Object obj) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, int i7, u4.w wVar) {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof q) && u4.l0.g(obj, ((q) obj2).j());
    }

    public static final boolean e(Object obj, Object obj2) {
        return u4.l0.g(obj, obj2);
    }

    public static final void f(Object obj, @n6.d t4.l<? super E, m2> lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.O(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            lVar.O((Object) arrayList.get(size));
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @n6.d
    public static final Object h(Object obj, E e7) {
        if (obj == null) {
            return b(e7);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e7);
            return b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e7);
        return b(arrayList);
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f12838a, obj);
    }

    public int hashCode() {
        return g(this.f12838a);
    }

    public final /* synthetic */ Object j() {
        return this.f12838a;
    }

    public String toString() {
        return i(this.f12838a);
    }
}