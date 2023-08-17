package k0;

import android.content.LocusId;
import android.os.Build;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11510a;

    /* renamed from: b  reason: collision with root package name */
    public final LocusId f11511b;

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class a {
        @d.o0
        public static LocusId a(@d.o0 String str) {
            n0.a();
            return m0.a(str);
        }

        @d.o0
        public static String b(@d.o0 LocusId locusId) {
            String id;
            id = locusId.getId();
            return id;
        }
    }

    public o0(@d.o0 String str) {
        this.f11510a = (String) g1.s.q(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11511b = a.a(str);
        } else {
            this.f11511b = null;
        }
    }

    @d.o0
    @d.w0(29)
    public static o0 d(@d.o0 LocusId locusId) {
        g1.s.m(locusId, "locusId cannot be null");
        return new o0((String) g1.s.q(a.b(locusId), "id cannot be empty"));
    }

    @d.o0
    public String a() {
        return this.f11510a;
    }

    @d.o0
    public final String b() {
        return this.f11510a.length() + "_chars";
    }

    @d.o0
    @d.w0(29)
    public LocusId c() {
        return this.f11511b;
    }

    public boolean equals(@d.q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            String str = this.f11510a;
            return str == null ? o0Var.f11510a == null : str.equals(o0Var.f11510a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11510a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @d.o0
    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}