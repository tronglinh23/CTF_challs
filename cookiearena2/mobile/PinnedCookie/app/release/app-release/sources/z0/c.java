package z0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import i0.x2;
@d.w0(21)
/* loaded from: classes.dex */
public final class c {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final c f19013a = new c();

    @d.u
    @s4.m
    public static final void a(@n6.d Bundle bundle, @n6.d String str, @n6.e Size size) {
        u4.l0.p(bundle, "bundle");
        u4.l0.p(str, x2.f10960j);
        bundle.putSize(str, size);
    }

    @d.u
    @s4.m
    public static final void b(@n6.d Bundle bundle, @n6.d String str, @n6.e SizeF sizeF) {
        u4.l0.p(bundle, "bundle");
        u4.l0.p(str, x2.f10960j);
        bundle.putSizeF(str, sizeF);
    }
}
