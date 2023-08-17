package s2;

import android.content.Intent;
import android.net.Uri;
import d.b1;
import u4.r1;

/* loaded from: classes.dex */
public class e0 {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final Uri f16302a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final String f16303b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final String f16304c;

    @r1({"SMAP\nNavDeepLinkRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkRequest.kt\nandroidx/navigation/NavDeepLinkRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public static final C0242a f16305d = new C0242a(null);
        @n6.e

        /* renamed from: a  reason: collision with root package name */
        public Uri f16306a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public String f16307b;
        @n6.e

        /* renamed from: c  reason: collision with root package name */
        public String f16308c;

        /* renamed from: s2.e0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0242a {
            public /* synthetic */ C0242a(u4.w wVar) {
                this();
            }

            @n6.d
            @s4.m
            public final a a(@n6.d String str) {
                u4.l0.p(str, t0.f16450f);
                if (str.length() > 0) {
                    a aVar = new a(null);
                    aVar.e(str);
                    return aVar;
                }
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
            }

            @n6.d
            @s4.m
            public final a b(@n6.d String str) {
                u4.l0.p(str, "mimeType");
                a aVar = new a(null);
                aVar.f(str);
                return aVar;
            }

            @n6.d
            @s4.m
            public final a c(@n6.d Uri uri) {
                u4.l0.p(uri, "uri");
                a aVar = new a(null);
                aVar.g(uri);
                return aVar;
            }

            public C0242a() {
            }
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        @s4.m
        public static final a b(@n6.d String str) {
            return f16305d.a(str);
        }

        @n6.d
        @s4.m
        public static final a c(@n6.d String str) {
            return f16305d.b(str);
        }

        @n6.d
        @s4.m
        public static final a d(@n6.d Uri uri) {
            return f16305d.c(uri);
        }

        @n6.d
        public final e0 a() {
            return new e0(this.f16306a, this.f16307b, this.f16308c);
        }

        @n6.d
        public final a e(@n6.d String str) {
            u4.l0.p(str, t0.f16450f);
            if (str.length() > 0) {
                this.f16307b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.".toString());
        }

        @n6.d
        public final a f(@n6.d String str) {
            u4.l0.p(str, "mimeType");
            if (new i5.o("^[-\\w*.]+/[-\\w+*.]+$").k(str)) {
                this.f16308c = str;
                return this;
            }
            throw new IllegalArgumentException(("The given mimeType " + str + " does not match to required \"type/subtype\" format").toString());
        }

        @n6.d
        public final a g(@n6.d Uri uri) {
            u4.l0.p(uri, "uri");
            this.f16306a = uri;
            return this;
        }

        public a() {
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public e0(@n6.e Uri uri, @n6.e String str, @n6.e String str2) {
        this.f16302a = uri;
        this.f16303b = str;
        this.f16304c = str2;
    }

    @n6.e
    public String a() {
        return this.f16303b;
    }

    @n6.e
    public String b() {
        return this.f16304c;
    }

    @n6.e
    public Uri c() {
        return this.f16302a;
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (c() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb.append(" action=");
            sb.append(a());
        }
        if (b() != null) {
            sb.append(" mimetype=");
            sb.append(b());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        u4.l0.o(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @d.b1({b1.a.LIBRARY_GROUP})
    public e0(@n6.d Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        u4.l0.p(intent, "intent");
    }
}