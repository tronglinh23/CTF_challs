package z0;

import android.os.PersistableBundle;
@d.w0(22)
/* loaded from: classes.dex */
public final class t0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final t0 f19029a = new t0();

    @d.u
    @s4.m
    public static final void a(@n6.d PersistableBundle persistableBundle, @n6.e String str, boolean z6) {
        u4.l0.p(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(str, z6);
    }

    @d.u
    @s4.m
    public static final void b(@n6.d PersistableBundle persistableBundle, @n6.e String str, @n6.d boolean[] zArr) {
        u4.l0.p(persistableBundle, "persistableBundle");
        u4.l0.p(zArr, "value");
        persistableBundle.putBooleanArray(str, zArr);
    }
}
