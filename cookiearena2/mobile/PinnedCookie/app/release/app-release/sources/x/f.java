package x;
/* loaded from: classes.dex */
public class f implements e, w.e {

    /* renamed from: a  reason: collision with root package name */
    public final w.h f18248a;

    /* renamed from: b  reason: collision with root package name */
    public int f18249b;

    /* renamed from: c  reason: collision with root package name */
    public y.h f18250c;

    /* renamed from: d  reason: collision with root package name */
    public int f18251d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f18252e = -1;

    /* renamed from: f  reason: collision with root package name */
    public float f18253f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public Object f18254g;

    public f(w.h hVar) {
        this.f18248a = hVar;
    }

    @Override // x.e, w.e
    public y.e a() {
        if (this.f18250c == null) {
            this.f18250c = new y.h();
        }
        return this.f18250c;
    }

    @Override // x.e, w.e
    public void b() {
        this.f18250c.B2(this.f18249b);
        int i7 = this.f18251d;
        if (i7 != -1) {
            this.f18250c.w2(i7);
            return;
        }
        int i8 = this.f18252e;
        if (i8 != -1) {
            this.f18250c.x2(i8);
        } else {
            this.f18250c.y2(this.f18253f);
        }
    }

    @Override // w.e
    public void c(y.e eVar) {
        if (eVar instanceof y.h) {
            this.f18250c = (y.h) eVar;
        } else {
            this.f18250c = null;
        }
    }

    @Override // w.e
    public void d(Object obj) {
        this.f18254g = obj;
    }

    @Override // w.e
    public e e() {
        return null;
    }

    public f f(Object obj) {
        this.f18251d = -1;
        this.f18252e = this.f18248a.f(obj);
        this.f18253f = 0.0f;
        return this;
    }

    public int g() {
        return this.f18249b;
    }

    @Override // w.e
    public Object getKey() {
        return this.f18254g;
    }

    public f h(float f7) {
        this.f18251d = -1;
        this.f18252e = -1;
        this.f18253f = f7;
        return this;
    }

    public void i(int i7) {
        this.f18249b = i7;
    }

    public f j(Object obj) {
        this.f18251d = this.f18248a.f(obj);
        this.f18252e = -1;
        this.f18253f = 0.0f;
        return this;
    }
}
