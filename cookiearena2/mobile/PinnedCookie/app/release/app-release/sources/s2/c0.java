package s2;

import s2.z;
import u4.r1;
@r1({"SMAP\nNavDeepLinkDslBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkDslBuilder.kt\nandroidx/navigation/NavDeepLinkDslBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
@b0
/* loaded from: classes.dex */
public final class c0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final z.a f16265a = new z.a();
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public String f16266b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public String f16267c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public String f16268d;

    @n6.d
    public final z a() {
        z.a aVar = this.f16265a;
        String str = this.f16266b;
        if ((str == null && this.f16267c == null && this.f16268d == null) ? false : true) {
            if (str != null) {
                aVar.g(str);
            }
            String str2 = this.f16267c;
            if (str2 != null) {
                aVar.e(str2);
            }
            String str3 = this.f16268d;
            if (str3 != null) {
                aVar.f(str3);
            }
            return aVar.a();
        }
        throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.".toString());
    }

    @n6.e
    public final String b() {
        return this.f16267c;
    }

    @n6.e
    public final String c() {
        return this.f16268d;
    }

    @n6.e
    public final String d() {
        return this.f16266b;
    }

    public final void e(@n6.e String str) {
        if (str != null) {
            if (str.length() == 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
        }
        this.f16267c = str;
    }

    public final void f(@n6.e String str) {
        this.f16268d = str;
    }

    public final void g(@n6.e String str) {
        this.f16266b = str;
    }
}
