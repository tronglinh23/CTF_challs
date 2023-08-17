package androidx.window.layout;
/* loaded from: classes.dex */
public interface l extends g {

    /* loaded from: classes.dex */
    public static final class a {
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final C0073a f7065b = new C0073a(null);
        @n6.d
        @s4.e

        /* renamed from: c  reason: collision with root package name */
        public static final a f7066c = new a("NONE");
        @n6.d
        @s4.e

        /* renamed from: d  reason: collision with root package name */
        public static final a f7067d = new a("FULL");
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final String f7068a;

        /* renamed from: androidx.window.layout.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0073a {
            public /* synthetic */ C0073a(u4.w wVar) {
                this();
            }

            public C0073a() {
            }
        }

        public a(String str) {
            this.f7068a = str;
        }

        @n6.d
        public String toString() {
            return this.f7068a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final a f7069b = new a(null);
        @n6.d
        @s4.e

        /* renamed from: c  reason: collision with root package name */
        public static final b f7070c = new b("VERTICAL");
        @n6.d
        @s4.e

        /* renamed from: d  reason: collision with root package name */
        public static final b f7071d = new b("HORIZONTAL");
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final String f7072a;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(u4.w wVar) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.f7072a = str;
        }

        @n6.d
        public String toString() {
            return this.f7072a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final a f7073b = new a(null);
        @n6.d
        @s4.e

        /* renamed from: c  reason: collision with root package name */
        public static final c f7074c = new c("FLAT");
        @n6.d
        @s4.e

        /* renamed from: d  reason: collision with root package name */
        public static final c f7075d = new c("HALF_OPENED");
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final String f7076a;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(u4.w wVar) {
                this();
            }

            public a() {
            }
        }

        public c(String str) {
            this.f7076a = str;
        }

        @n6.d
        public String toString() {
            return this.f7076a;
        }
    }

    @n6.d
    b a();

    boolean b();

    @n6.d
    a c();

    @n6.d
    c getState();
}
