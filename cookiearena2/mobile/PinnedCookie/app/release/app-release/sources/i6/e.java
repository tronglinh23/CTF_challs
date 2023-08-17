package i6;

import u.v;
import v3.b1;
@v3.k(message = "changed in Okio 2.x")
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f11172a = new e();

    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@n6.d String str) {
        u4.l0.p(str, v.b.f17140e);
        return r0.l(str, 0, 0, 3, null);
    }

    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@n6.d String str, int i7, int i8) {
        u4.l0.p(str, v.b.f17140e);
        return r0.k(str, i7, i8);
    }
}
