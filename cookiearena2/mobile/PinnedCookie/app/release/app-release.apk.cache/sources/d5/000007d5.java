package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.l;
import u4.l0;

/* loaded from: classes.dex */
public final class m implements l {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final a f7077d = new a(null);
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final t3.b f7078a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final b f7079b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final l.c f7080c;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public final void a(@n6.d t3.b bVar) {
            l0.p(bVar, "bounds");
            if (!((bVar.f() == 0 && bVar.b() == 0) ? false : true)) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (!(bVar.c() == 0 || bVar.e() == 0)) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final a f7081b = new a(null);
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public static final b f7082c = new b("FOLD");
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public static final b f7083d = new b("HINGE");
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final String f7084a;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(u4.w wVar) {
                this();
            }

            @n6.d
            public final b a() {
                return b.f7082c;
            }

            @n6.d
            public final b b() {
                return b.f7083d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f7084a = str;
        }

        @n6.d
        public String toString() {
            return this.f7084a;
        }
    }

    public m(@n6.d t3.b bVar, @n6.d b bVar2, @n6.d l.c cVar) {
        l0.p(bVar, "featureBounds");
        l0.p(bVar2, "type");
        l0.p(cVar, "state");
        this.f7078a = bVar;
        this.f7079b = bVar2;
        this.f7080c = cVar;
        f7077d.a(bVar);
    }

    @Override // androidx.window.layout.l
    @n6.d
    public l.b a() {
        return this.f7078a.f() > this.f7078a.b() ? l.b.f7071d : l.b.f7070c;
    }

    @Override // androidx.window.layout.l
    public boolean b() {
        b bVar = this.f7079b;
        b.a aVar = b.f7081b;
        if (l0.g(bVar, aVar.b())) {
            return true;
        }
        return l0.g(this.f7079b, aVar.a()) && l0.g(getState(), l.c.f7075d);
    }

    @Override // androidx.window.layout.l
    @n6.d
    public l.a c() {
        return (this.f7078a.f() == 0 || this.f7078a.b() == 0) ? l.a.f7066c : l.a.f7067d;
    }

    @n6.d
    public final b d() {
        return this.f7079b;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (l0.g(m.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                m mVar = (m) obj;
                return l0.g(this.f7078a, mVar.f7078a) && l0.g(this.f7079b, mVar.f7079b) && l0.g(getState(), mVar.getState());
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        return false;
    }

    @Override // androidx.window.layout.g
    @n6.d
    public Rect getBounds() {
        return this.f7078a.i();
    }

    @Override // androidx.window.layout.l
    @n6.d
    public l.c getState() {
        return this.f7080c;
    }

    public int hashCode() {
        return (((this.f7078a.hashCode() * 31) + this.f7079b.hashCode()) * 31) + getState().hashCode();
    }

    @n6.d
    public String toString() {
        return ((Object) m.class.getSimpleName()) + " { " + this.f7078a + ", type=" + this.f7079b + ", state=" + getState() + " }";
    }
}