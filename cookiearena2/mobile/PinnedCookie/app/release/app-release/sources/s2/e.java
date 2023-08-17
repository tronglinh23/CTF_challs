package s2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import s2.d;
@i0
/* loaded from: classes.dex */
public final class e extends h0<d.b> {
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public Context f16296h;
    @n6.e

    /* renamed from: i  reason: collision with root package name */
    public String f16297i;
    @n6.e

    /* renamed from: j  reason: collision with root package name */
    public e5.d<? extends Activity> f16298j;
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public String f16299k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public Uri f16300l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public String f16301m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @v3.k(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @v3.b1(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public e(@n6.d d dVar, @d.d0 int i7) {
        super(dVar, i7);
        u4.l0.p(dVar, "navigator");
        this.f16296h = dVar.getContext();
    }

    @Override // s2.h0
    @n6.d
    /* renamed from: k  reason: merged with bridge method [inline-methods] */
    public d.b c() {
        d.b bVar = (d.b) super.c();
        bVar.a0(this.f16297i);
        e5.d<? extends Activity> dVar = this.f16298j;
        if (dVar != null) {
            bVar.W(new ComponentName(this.f16296h, s4.a.d(dVar)));
        }
        bVar.V(this.f16299k);
        bVar.X(this.f16300l);
        bVar.Y(this.f16301m);
        return bVar;
    }

    @n6.e
    public final String l() {
        return this.f16299k;
    }

    @n6.e
    public final e5.d<? extends Activity> m() {
        return this.f16298j;
    }

    @n6.e
    public final Uri n() {
        return this.f16300l;
    }

    @n6.e
    public final String o() {
        return this.f16301m;
    }

    @n6.e
    public final String p() {
        return this.f16297i;
    }

    public final void q(@n6.e String str) {
        this.f16299k = str;
    }

    public final void r(@n6.e e5.d<? extends Activity> dVar) {
        this.f16298j = dVar;
    }

    public final void s(@n6.e Uri uri) {
        this.f16300l = uri;
    }

    public final void t(@n6.e String str) {
        this.f16301m = str;
    }

    public final void u(@n6.e String str) {
        this.f16297i = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@n6.d d dVar, @n6.d String str) {
        super(dVar, str);
        u4.l0.p(dVar, "navigator");
        u4.l0.p(str, "route");
        this.f16296h = dVar.getContext();
    }
}
