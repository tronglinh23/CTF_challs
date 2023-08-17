package z0;

import android.os.PersistableBundle;

@d.w0(21)
/* loaded from: classes.dex */
public final class s0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f19028a = new s0();

    @d.u
    @n6.d
    @s4.m
    public static final PersistableBundle a(int i7) {
        return new PersistableBundle(i7);
    }

    @d.u
    @s4.m
    public static final void b(@n6.d PersistableBundle persistableBundle, @n6.e String str, @n6.e Object obj) {
        u4.l0.p(persistableBundle, "persistableBundle");
        if (obj == null) {
            persistableBundle.putString(str, null);
        } else if (obj instanceof Boolean) {
            t0.a(persistableBundle, str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
        } else if (obj instanceof boolean[]) {
            t0.b(persistableBundle, str, (boolean[]) obj);
        } else if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
        } else if (!(obj instanceof Object[])) {
            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + i5.h0.f11093b);
        } else {
            Class<?> componentType = obj.getClass().getComponentType();
            u4.l0.m(componentType);
            if (String.class.isAssignableFrom(componentType)) {
                u4.l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                persistableBundle.putStringArray(str, (String[]) obj);
                return;
            }
            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + i5.h0.f11093b);
        }
    }
}