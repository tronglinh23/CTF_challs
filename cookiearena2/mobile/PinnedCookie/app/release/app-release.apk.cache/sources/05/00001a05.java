package s2;

import s2.d;

/* loaded from: classes.dex */
public final class g {
    @n6.d
    public static final d.c a(@n6.e i0.i iVar, int i7) {
        d.c.a aVar = new d.c.a();
        if (iVar != null) {
            aVar.c(iVar);
        }
        aVar.a(i7);
        return aVar.b();
    }

    public static /* synthetic */ d.c b(i0.i iVar, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            iVar = null;
        }
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return a(iVar, i7);
    }
}