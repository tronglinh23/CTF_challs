package s2;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import d.b1;
import i0.x2;
import java.io.Serializable;
import u.v;
import u4.r1;

/* loaded from: classes.dex */
public abstract class y0<T> {
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final l f16555c = new l(null);
    @n6.d
    @s4.e

    /* renamed from: d  reason: collision with root package name */
    public static final y0<Integer> f16556d = new f();
    @n6.d
    @s4.e

    /* renamed from: e  reason: collision with root package name */
    public static final y0<Integer> f16557e = new i();
    @n6.d
    @s4.e

    /* renamed from: f  reason: collision with root package name */
    public static final y0<int[]> f16558f = new e();
    @n6.d
    @s4.e

    /* renamed from: g  reason: collision with root package name */
    public static final y0<Long> f16559g = new h();
    @n6.d
    @s4.e

    /* renamed from: h  reason: collision with root package name */
    public static final y0<long[]> f16560h = new g();
    @n6.d
    @s4.e

    /* renamed from: i  reason: collision with root package name */
    public static final y0<Float> f16561i = new d();
    @n6.d
    @s4.e

    /* renamed from: j  reason: collision with root package name */
    public static final y0<float[]> f16562j = new c();
    @n6.d
    @s4.e

    /* renamed from: k  reason: collision with root package name */
    public static final y0<Boolean> f16563k = new b();
    @n6.d
    @s4.e

    /* renamed from: l  reason: collision with root package name */
    public static final y0<boolean[]> f16564l = new a();
    @n6.d
    @s4.e

    /* renamed from: m  reason: collision with root package name */
    public static final y0<String> f16565m = new k();
    @n6.d
    @s4.e

    /* renamed from: n  reason: collision with root package name */
    public static final y0<String[]> f16566n = new j();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16567a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final String f16568b = "nav_type";

    /* loaded from: classes.dex */
    public static final class a extends y0<boolean[]> {
        public a() {
            super(true);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return "boolean[]";
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public boolean[] b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (boolean[]) bundle.get(str);
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public boolean[] n(@n6.d String str) {
            u4.l0.p(str, "value");
            return new boolean[]{y0.f16563k.n(str).booleanValue()};
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: o  reason: merged with bridge method [inline-methods] */
        public boolean[] j(@n6.d String str, @n6.e boolean[] zArr) {
            boolean[] f42;
            u4.l0.p(str, "value");
            return (zArr == null || (f42 = x3.o.f4(zArr, i(str))) == null) ? i(str) : f42;
        }

        @Override // s2.y0
        /* renamed from: p  reason: merged with bridge method [inline-methods] */
        public void k(@n6.d Bundle bundle, @n6.d String str, @n6.e boolean[] zArr) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y0<Boolean> {
        public b() {
            super(false);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return v.b.f17141f;
        }

        @Override // s2.y0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Boolean bool) {
            o(bundle, str, bool.booleanValue());
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public Boolean b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (Boolean) bundle.get(str);
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public Boolean n(@n6.d String str) {
            boolean z6;
            u4.l0.p(str, "value");
            if (u4.l0.g(str, "true")) {
                z6 = true;
            } else if (!u4.l0.g(str, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            } else {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        }

        public void o(@n6.d Bundle bundle, @n6.d String str, boolean z6) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putBoolean(str, z6);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends y0<float[]> {
        public c() {
            super(true);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return "float[]";
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public float[] b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (float[]) bundle.get(str);
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public float[] n(@n6.d String str) {
            u4.l0.p(str, "value");
            return new float[]{y0.f16561i.n(str).floatValue()};
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: o  reason: merged with bridge method [inline-methods] */
        public float[] j(@n6.d String str, @n6.e float[] fArr) {
            float[] Q3;
            u4.l0.p(str, "value");
            return (fArr == null || (Q3 = x3.o.Q3(fArr, i(str))) == null) ? i(str) : Q3;
        }

        @Override // s2.y0
        /* renamed from: p  reason: merged with bridge method [inline-methods] */
        public void k(@n6.d Bundle bundle, @n6.d String str, @n6.e float[] fArr) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putFloatArray(str, fArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends y0<Float> {
        public d() {
            super(false);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return v.b.f17138c;
        }

        @Override // s2.y0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Float f7) {
            o(bundle, str, f7.floatValue());
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public Float b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            Object obj = bundle.get(str);
            u4.l0.n(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public Float n(@n6.d String str) {
            u4.l0.p(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        public void o(@n6.d Bundle bundle, @n6.d String str, float f7) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putFloat(str, f7);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends y0<int[]> {
        public e() {
            super(true);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return "integer[]";
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public int[] b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (int[]) bundle.get(str);
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public int[] n(@n6.d String str) {
            u4.l0.p(str, "value");
            return new int[]{y0.f16556d.n(str).intValue()};
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: o  reason: merged with bridge method [inline-methods] */
        public int[] j(@n6.d String str, @n6.e int[] iArr) {
            int[] T3;
            u4.l0.p(str, "value");
            return (iArr == null || (T3 = x3.o.T3(iArr, i(str))) == null) ? i(str) : T3;
        }

        @Override // s2.y0
        /* renamed from: p  reason: merged with bridge method [inline-methods] */
        public void k(@n6.d Bundle bundle, @n6.d String str, @n6.e int[] iArr) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putIntArray(str, iArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends y0<Integer> {
        public f() {
            super(false);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return v.b.f17137b;
        }

        @Override // s2.y0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Integer num) {
            o(bundle, str, num.intValue());
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public Integer b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            Object obj = bundle.get(str);
            u4.l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public Integer n(@n6.d String str) {
            int parseInt;
            u4.l0.p(str, "value");
            if (i5.b0.v2(str, "0x", false, 2, null)) {
                String substring = str.substring(2);
                u4.l0.o(substring, "this as java.lang.String).substring(startIndex)");
                parseInt = Integer.parseInt(substring, i5.d.a(16));
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        public void o(@n6.d Bundle bundle, @n6.d String str, int i7) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putInt(str, i7);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends y0<long[]> {
        public g() {
            super(true);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return "long[]";
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public long[] b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (long[]) bundle.get(str);
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public long[] n(@n6.d String str) {
            u4.l0.p(str, "value");
            return new long[]{y0.f16559g.n(str).longValue()};
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: o  reason: merged with bridge method [inline-methods] */
        public long[] j(@n6.d String str, @n6.e long[] jArr) {
            long[] W3;
            u4.l0.p(str, "value");
            return (jArr == null || (W3 = x3.o.W3(jArr, i(str))) == null) ? i(str) : W3;
        }

        @Override // s2.y0
        /* renamed from: p  reason: merged with bridge method [inline-methods] */
        public void k(@n6.d Bundle bundle, @n6.d String str, @n6.e long[] jArr) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putLongArray(str, jArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends y0<Long> {
        public h() {
            super(false);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return "long";
        }

        @Override // s2.y0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Long l7) {
            o(bundle, str, l7.longValue());
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public Long b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            Object obj = bundle.get(str);
            u4.l0.n(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public Long n(@n6.d String str) {
            String str2;
            long parseLong;
            u4.l0.p(str, "value");
            if (i5.b0.K1(str, "L", false, 2, null)) {
                str2 = str.substring(0, str.length() - 1);
                u4.l0.o(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            if (i5.b0.v2(str, "0x", false, 2, null)) {
                String substring = str2.substring(2);
                u4.l0.o(substring, "this as java.lang.String).substring(startIndex)");
                parseLong = Long.parseLong(substring, i5.d.a(16));
            } else {
                parseLong = Long.parseLong(str2);
            }
            return Long.valueOf(parseLong);
        }

        public void o(@n6.d Bundle bundle, @n6.d String str, long j7) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putLong(str, j7);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends y0<Integer> {
        public i() {
            super(false);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return "reference";
        }

        @Override // s2.y0
        public /* bridge */ /* synthetic */ void k(Bundle bundle, String str, Integer num) {
            o(bundle, str, num.intValue());
        }

        @Override // s2.y0
        @n6.d
        @d.c
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public Integer b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            Object obj = bundle.get(str);
            u4.l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public Integer n(@n6.d String str) {
            int parseInt;
            u4.l0.p(str, "value");
            if (i5.b0.v2(str, "0x", false, 2, null)) {
                String substring = str.substring(2);
                u4.l0.o(substring, "this as java.lang.String).substring(startIndex)");
                parseInt = Integer.parseInt(substring, i5.d.a(16));
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        public void o(@n6.d Bundle bundle, @n6.d String str, @d.c int i7) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putInt(str, i7);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends y0<String[]> {
        public j() {
            super(true);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return "string[]";
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public String[] b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (String[]) bundle.get(str);
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public String[] n(@n6.d String str) {
            u4.l0.p(str, "value");
            return new String[]{str};
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: o  reason: merged with bridge method [inline-methods] */
        public String[] j(@n6.d String str, @n6.e String[] strArr) {
            String[] strArr2;
            u4.l0.p(str, "value");
            return (strArr == null || (strArr2 = (String[]) x3.o.Z3(strArr, i(str))) == null) ? i(str) : strArr2;
        }

        @Override // s2.y0
        /* renamed from: p  reason: merged with bridge method [inline-methods] */
        public void k(@n6.d Bundle bundle, @n6.d String str, @n6.e String[] strArr) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putStringArray(str, strArr);
        }
    }

    @r1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$Companion$StringType$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,936:1\n1#2:937\n*E\n"})
    /* loaded from: classes.dex */
    public static final class k extends y0<String> {
        public k() {
            super(true);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            return v.b.f17140e;
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public String b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (String) bundle.get(str);
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: n  reason: merged with bridge method [inline-methods] */
        public String n(@n6.d String str) {
            u4.l0.p(str, "value");
            if (u4.l0.g(str, "null")) {
                return null;
            }
            return str;
        }

        @Override // s2.y0
        /* renamed from: o  reason: merged with bridge method [inline-methods] */
        public void k(@n6.d Bundle bundle, @n6.d String str, @n6.e String str2) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            bundle.putString(str, str2);
        }

        @Override // s2.y0
        @n6.d
        /* renamed from: p  reason: merged with bridge method [inline-methods] */
        public String l(@n6.e String str) {
            String encode = str != null ? Uri.encode(str) : null;
            return encode == null ? "null" : encode;
        }
    }

    /* loaded from: classes.dex */
    public static final class l {
        public /* synthetic */ l(u4.w wVar) {
            this();
        }

        @n6.d
        @s4.m
        public y0<?> a(@n6.e String str, @n6.e String str2) {
            String str3;
            y0<Integer> y0Var = y0.f16556d;
            if (u4.l0.g(y0Var.c(), str)) {
                return y0Var;
            }
            y0 y0Var2 = y0.f16558f;
            if (u4.l0.g(y0Var2.c(), str)) {
                return y0Var2;
            }
            y0<Long> y0Var3 = y0.f16559g;
            if (u4.l0.g(y0Var3.c(), str)) {
                return y0Var3;
            }
            y0 y0Var4 = y0.f16560h;
            if (u4.l0.g(y0Var4.c(), str)) {
                return y0Var4;
            }
            y0<Boolean> y0Var5 = y0.f16563k;
            if (u4.l0.g(y0Var5.c(), str)) {
                return y0Var5;
            }
            y0 y0Var6 = y0.f16564l;
            if (u4.l0.g(y0Var6.c(), str)) {
                return y0Var6;
            }
            y0<String> y0Var7 = y0.f16565m;
            if (u4.l0.g(y0Var7.c(), str)) {
                return y0Var7;
            }
            y0 y0Var8 = y0.f16566n;
            if (u4.l0.g(y0Var8.c(), str)) {
                return y0Var8;
            }
            y0<Float> y0Var9 = y0.f16561i;
            if (u4.l0.g(y0Var9.c(), str)) {
                return y0Var9;
            }
            y0 y0Var10 = y0.f16562j;
            if (u4.l0.g(y0Var10.c(), str)) {
                return y0Var10;
            }
            y0<Integer> y0Var11 = y0.f16557e;
            if (u4.l0.g(y0Var11.c(), str)) {
                return y0Var11;
            }
            if (str == null || str.length() == 0) {
                return y0Var7;
            }
            try {
                if (!i5.b0.v2(str, ".", false, 2, null) || str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2 + str;
                }
                if (i5.b0.K1(str, r5.v.f16052o, false, 2, null)) {
                    str3 = str3.substring(0, str3.length() - 2);
                    u4.l0.o(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                    Class<?> cls = Class.forName(str3);
                    if (Parcelable.class.isAssignableFrom(cls)) {
                        u4.l0.n(cls, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        return new n(cls);
                    } else if (Serializable.class.isAssignableFrom(cls)) {
                        u4.l0.n(cls, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new p(cls);
                    }
                } else {
                    Class<?> cls2 = Class.forName(str3);
                    if (Parcelable.class.isAssignableFrom(cls2)) {
                        u4.l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                        return new o(cls2);
                    } else if (Enum.class.isAssignableFrom(cls2)) {
                        u4.l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                        return new m(cls2);
                    } else if (Serializable.class.isAssignableFrom(cls2)) {
                        u4.l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new q(cls2);
                    }
                }
                throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException(e7);
            }
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        @n6.d
        @s4.m
        public final y0<Object> b(@n6.d String str) {
            u4.l0.p(str, "value");
            try {
                try {
                    try {
                        try {
                            y0<Integer> y0Var = y0.f16556d;
                            y0Var.n(str);
                            u4.l0.n(y0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return y0Var;
                        } catch (IllegalArgumentException unused) {
                            y0<Float> y0Var2 = y0.f16561i;
                            y0Var2.n(str);
                            u4.l0.n(y0Var2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return y0Var2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        y0<String> y0Var3 = y0.f16565m;
                        u4.l0.n(y0Var3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return y0Var3;
                    }
                } catch (IllegalArgumentException unused3) {
                    y0<Long> y0Var4 = y0.f16559g;
                    y0Var4.n(str);
                    u4.l0.n(y0Var4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return y0Var4;
                }
            } catch (IllegalArgumentException unused4) {
                y0<Boolean> y0Var5 = y0.f16563k;
                y0Var5.n(str);
                u4.l0.n(y0Var5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var5;
            }
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        @n6.d
        @s4.m
        public final y0<Object> c(@n6.e Object obj) {
            y0<Object> qVar;
            if (obj instanceof Integer) {
                y0<Integer> y0Var = y0.f16556d;
                u4.l0.n(y0Var, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var;
            } else if (obj instanceof int[]) {
                y0<int[]> y0Var2 = y0.f16558f;
                u4.l0.n(y0Var2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var2;
            } else if (obj instanceof Long) {
                y0<Long> y0Var3 = y0.f16559g;
                u4.l0.n(y0Var3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var3;
            } else if (obj instanceof long[]) {
                y0<long[]> y0Var4 = y0.f16560h;
                u4.l0.n(y0Var4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var4;
            } else if (obj instanceof Float) {
                y0<Float> y0Var5 = y0.f16561i;
                u4.l0.n(y0Var5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var5;
            } else if (obj instanceof float[]) {
                y0<float[]> y0Var6 = y0.f16562j;
                u4.l0.n(y0Var6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var6;
            } else if (obj instanceof Boolean) {
                y0<Boolean> y0Var7 = y0.f16563k;
                u4.l0.n(y0Var7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var7;
            } else if (obj instanceof boolean[]) {
                y0<boolean[]> y0Var8 = y0.f16564l;
                u4.l0.n(y0Var8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var8;
            } else if ((obj instanceof String) || obj == null) {
                y0<String> y0Var9 = y0.f16565m;
                u4.l0.n(y0Var9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var9;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                y0<String[]> y0Var10 = y0.f16566n;
                u4.l0.n(y0Var10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return y0Var10;
            } else {
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    u4.l0.m(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        u4.l0.n(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        qVar = new n<>(componentType2);
                        return qVar;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    u4.l0.m(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        u4.l0.n(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        qVar = new p<>(componentType4);
                        return qVar;
                    }
                }
                if (obj instanceof Parcelable) {
                    qVar = new o<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    qVar = new m<>(obj.getClass());
                } else if (!(obj instanceof Serializable)) {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                } else {
                    qVar = new q<>(obj.getClass());
                }
                return qVar;
            }
        }

        public l() {
        }
    }

    @r1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,936:1\n1#2:937\n1282#3,2:938\n*S KotlinDebug\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$EnumType\n*L\n859#1:938,2\n*E\n"})
    /* loaded from: classes.dex */
    public static final class m<D extends Enum<?>> extends q<D> {
        @n6.d

        /* renamed from: p  reason: collision with root package name */
        public final Class<D> f16569p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(@n6.d Class<D> cls) {
            super(false, cls);
            u4.l0.p(cls, "type");
            if (cls.isEnum()) {
                this.f16569p = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // s2.y0.q, s2.y0
        @n6.d
        public String c() {
            String name = this.f16569p.getName();
            u4.l0.o(name, "type.name");
            return name;
        }

        @Override // s2.y0.q
        @n6.d
        /* renamed from: p  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D n(@n6.d String str) {
            D d7;
            u4.l0.p(str, "value");
            D[] enumConstants = this.f16569p.getEnumConstants();
            u4.l0.o(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    d7 = null;
                    break;
                }
                d7 = enumConstants[i7];
                if (i5.b0.L1(d7.name(), str, true)) {
                    break;
                }
                i7++;
            }
            D d8 = d7;
            if (d8 != null) {
                return d8;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f16569p.getName() + '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class n<D extends Parcelable> extends y0<D[]> {
        @n6.d

        /* renamed from: o  reason: collision with root package name */
        public final Class<D[]> f16570o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@n6.d Class<D> cls) {
            super(true);
            u4.l0.p(cls, "type");
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                Class<D[]> cls2 = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
                u4.l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                this.f16570o = cls2;
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            String name = this.f16570o.getName();
            u4.l0.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@n6.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !u4.l0.g(n.class, obj.getClass())) {
                return false;
            }
            return u4.l0.g(this.f16570o, ((n) obj).f16570o);
        }

        public int hashCode() {
            return this.f16570o.hashCode();
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public D[] b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        @Override // s2.y0
        @n6.d
        public D[] n(@n6.d String str) {
            u4.l0.p(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // s2.y0
        /* renamed from: o  reason: merged with bridge method [inline-methods] */
        public void k(@n6.d Bundle bundle, @n6.d String str, @n6.e D[] dArr) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            this.f16570o.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class o<D> extends y0<D> {
        @n6.d

        /* renamed from: o  reason: collision with root package name */
        public final Class<D> f16571o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(@n6.d Class<D> cls) {
            super(true);
            u4.l0.p(cls, "type");
            boolean z6 = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z6 = false;
            }
            if (z6) {
                this.f16571o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // s2.y0
        @n6.e
        public D b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (D) bundle.get(str);
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            String name = this.f16571o.getName();
            u4.l0.o(name, "type.name");
            return name;
        }

        public boolean equals(@n6.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !u4.l0.g(o.class, obj.getClass())) {
                return false;
            }
            return u4.l0.g(this.f16571o, ((o) obj).f16571o);
        }

        public int hashCode() {
            return this.f16571o.hashCode();
        }

        @Override // s2.y0
        /* renamed from: i */
        public D n(@n6.d String str) {
            u4.l0.p(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // s2.y0
        public void k(@n6.d Bundle bundle, @n6.d String str, D d7) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            this.f16571o.cast(d7);
            if (d7 == null || (d7 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d7);
            } else if (d7 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d7);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class p<D extends Serializable> extends y0<D[]> {
        @n6.d

        /* renamed from: o  reason: collision with root package name */
        public final Class<D[]> f16572o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(@n6.d Class<D> cls) {
            super(true);
            u4.l0.p(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                Class<D[]> cls2 = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
                u4.l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                this.f16572o = cls2;
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            String name = this.f16572o.getName();
            u4.l0.o(name, "arrayType.name");
            return name;
        }

        public boolean equals(@n6.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !u4.l0.g(p.class, obj.getClass())) {
                return false;
            }
            return u4.l0.g(this.f16572o, ((p) obj).f16572o);
        }

        public int hashCode() {
            return this.f16572o.hashCode();
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public D[] b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        @Override // s2.y0
        @n6.d
        public D[] n(@n6.d String str) {
            u4.l0.p(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s2.y0
        /* renamed from: o  reason: merged with bridge method [inline-methods] */
        public void k(@n6.d Bundle bundle, @n6.d String str, @n6.e D[] dArr) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            this.f16572o.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    public y0(boolean z6) {
        this.f16567a = z6;
    }

    @n6.d
    @s4.m
    public static y0<?> a(@n6.e String str, @n6.e String str2) {
        return f16555c.a(str, str2);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    @s4.m
    public static final y0<Object> d(@n6.d String str) {
        return f16555c.b(str);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    @s4.m
    public static final y0<Object> e(@n6.e Object obj) {
        return f16555c.c(obj);
    }

    @n6.e
    public abstract T b(@n6.d Bundle bundle, @n6.d String str);

    @n6.d
    public String c() {
        return this.f16568b;
    }

    public boolean f() {
        return this.f16567a;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final T g(@n6.d Bundle bundle, @n6.d String str, @n6.d String str2) {
        u4.l0.p(bundle, "bundle");
        u4.l0.p(str, x2.f10960j);
        u4.l0.p(str2, "value");
        T n7 = n(str2);
        k(bundle, str, n7);
        return n7;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final T h(@n6.d Bundle bundle, @n6.d String str, @n6.e String str2, T t6) {
        u4.l0.p(bundle, "bundle");
        u4.l0.p(str, x2.f10960j);
        if (bundle.containsKey(str)) {
            if (str2 != null) {
                T j7 = j(str2, t6);
                k(bundle, str, j7);
                return j7;
            }
            return t6;
        }
        throw new IllegalArgumentException("There is no previous value in this bundle.");
    }

    /* renamed from: i */
    public abstract T n(@n6.d String str);

    public T j(@n6.d String str, T t6) {
        u4.l0.p(str, "value");
        return n(str);
    }

    public abstract void k(@n6.d Bundle bundle, @n6.d String str, T t6);

    @n6.d
    public String l(T t6) {
        return String.valueOf(t6);
    }

    @n6.d
    public String toString() {
        return c();
    }

    @r1({"SMAP\nNavType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavType.kt\nandroidx/navigation/NavType$SerializableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,936:1\n1#2:937\n*E\n"})
    /* loaded from: classes.dex */
    public static class q<D extends Serializable> extends y0<D> {
        @n6.d

        /* renamed from: o  reason: collision with root package name */
        public final Class<D> f16573o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@n6.d Class<D> cls) {
            super(true);
            u4.l0.p(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                if (true ^ cls.isEnum()) {
                    this.f16573o = cls;
                    return;
                }
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // s2.y0
        @n6.d
        public String c() {
            String name = this.f16573o.getName();
            u4.l0.o(name, "type.name");
            return name;
        }

        public boolean equals(@n6.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                return u4.l0.g(this.f16573o, ((q) obj).f16573o);
            }
            return false;
        }

        public int hashCode() {
            return this.f16573o.hashCode();
        }

        @Override // s2.y0
        @n6.e
        /* renamed from: m  reason: merged with bridge method [inline-methods] */
        public D b(@n6.d Bundle bundle, @n6.d String str) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            return (D) bundle.get(str);
        }

        @Override // s2.y0
        @n6.d
        public D n(@n6.d String str) {
            u4.l0.p(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // s2.y0
        /* renamed from: o  reason: merged with bridge method [inline-methods] */
        public void k(@n6.d Bundle bundle, @n6.d String str, @n6.d D d7) {
            u4.l0.p(bundle, "bundle");
            u4.l0.p(str, x2.f10960j);
            u4.l0.p(d7, "value");
            this.f16573o.cast(d7);
            bundle.putSerializable(str, d7);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z6, @n6.d Class<D> cls) {
            super(z6);
            u4.l0.p(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f16573o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}