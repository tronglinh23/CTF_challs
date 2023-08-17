package t3;

import t3.g;
import t4.l;
import u4.l0;

/* loaded from: classes.dex */
public final class h<T> extends g<T> {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final T f16843b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final String f16844c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final g.b f16845d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final f f16846e;

    public h(@n6.d T t6, @n6.d String str, @n6.d g.b bVar, @n6.d f fVar) {
        l0.p(t6, "value");
        l0.p(str, "tag");
        l0.p(bVar, "verificationMode");
        l0.p(fVar, "logger");
        this.f16843b = t6;
        this.f16844c = str;
        this.f16845d = bVar;
        this.f16846e = fVar;
    }

    @Override // t3.g
    @n6.d
    public T a() {
        return this.f16843b;
    }

    @Override // t3.g
    @n6.d
    public g<T> c(@n6.d String str, @n6.d l<? super T, Boolean> lVar) {
        l0.p(str, "message");
        l0.p(lVar, "condition");
        return lVar.O((T) this.f16843b).booleanValue() ? this : new e(this.f16843b, this.f16844c, str, this.f16846e, this.f16845d);
    }

    @n6.d
    public final f d() {
        return this.f16846e;
    }

    @n6.d
    public final String e() {
        return this.f16844c;
    }

    @n6.d
    public final T f() {
        return this.f16843b;
    }

    @n6.d
    public final g.b g() {
        return this.f16845d;
    }
}