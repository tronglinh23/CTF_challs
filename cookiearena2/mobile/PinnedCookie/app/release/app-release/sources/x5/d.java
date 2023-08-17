package x5;

import a6.n;
import i0.k0;
import java.io.IOException;
import r5.b0;
import r5.h0;
import r5.r;
import r5.v;
import u4.l0;
import x5.k;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public k.b f18420a;

    /* renamed from: b  reason: collision with root package name */
    public k f18421b;

    /* renamed from: c  reason: collision with root package name */
    public int f18422c;

    /* renamed from: d  reason: collision with root package name */
    public int f18423d;

    /* renamed from: e  reason: collision with root package name */
    public int f18424e;

    /* renamed from: f  reason: collision with root package name */
    public h0 f18425f;

    /* renamed from: g  reason: collision with root package name */
    public final h f18426g;
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public final r5.a f18427h;

    /* renamed from: i  reason: collision with root package name */
    public final e f18428i;

    /* renamed from: j  reason: collision with root package name */
    public final r f18429j;

    public d(@n6.d h hVar, @n6.d r5.a aVar, @n6.d e eVar, @n6.d r rVar) {
        l0.p(hVar, "connectionPool");
        l0.p(aVar, "address");
        l0.p(eVar, k0.E0);
        l0.p(rVar, "eventListener");
        this.f18426g = hVar;
        this.f18427h = aVar;
        this.f18428i = eVar;
        this.f18429j = rVar;
    }

    @n6.d
    public final y5.d a(@n6.d b0 b0Var, @n6.d y5.g gVar) {
        l0.p(b0Var, "client");
        l0.p(gVar, "chain");
        try {
            return c(gVar.m(), gVar.o(), gVar.q(), b0Var.g0(), b0Var.m0(), !l0.g(gVar.p().m(), "GET")).D(b0Var, gVar);
        } catch (IOException e7) {
            h(e7);
            throw new j(e7);
        } catch (j e8) {
            h(e8.c());
            throw e8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x5.f b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.d.b(int, int, int, int, boolean):x5.f");
    }

    public final f c(int i7, int i8, int i9, int i10, boolean z6, boolean z7) throws IOException {
        while (true) {
            f b7 = b(i7, i8, i9, i10, z6);
            if (b7.B(z7)) {
                return b7;
            }
            b7.G();
            if (this.f18425f == null) {
                k.b bVar = this.f18420a;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    k kVar = this.f18421b;
                    if (!(kVar != null ? kVar.b() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    @n6.d
    public final r5.a d() {
        return this.f18427h;
    }

    public final boolean e() {
        k kVar;
        if (this.f18422c == 0 && this.f18423d == 0 && this.f18424e == 0) {
            return false;
        }
        if (this.f18425f != null) {
            return true;
        }
        h0 f7 = f();
        if (f7 != null) {
            this.f18425f = f7;
            return true;
        }
        k.b bVar = this.f18420a;
        if ((bVar == null || !bVar.b()) && (kVar = this.f18421b) != null) {
            return kVar.b();
        }
        return true;
    }

    public final h0 f() {
        f r6;
        if (this.f18422c > 1 || this.f18423d > 1 || this.f18424e > 0 || (r6 = this.f18428i.r()) == null) {
            return null;
        }
        synchronized (r6) {
            if (r6.y() != 0) {
                return null;
            }
            if (s5.d.i(r6.c().d().w(), this.f18427h.w())) {
                return r6.c();
            }
            return null;
        }
    }

    public final boolean g(@n6.d v vVar) {
        l0.p(vVar, "url");
        v w6 = this.f18427h.w();
        return vVar.N() == w6.N() && l0.g(vVar.F(), w6.F());
    }

    public final void h(@n6.d IOException iOException) {
        l0.p(iOException, "e");
        this.f18425f = null;
        if ((iOException instanceof n) && ((n) iOException).f485k == a6.b.REFUSED_STREAM) {
            this.f18422c++;
        } else if (iOException instanceof a6.a) {
            this.f18423d++;
        } else {
            this.f18424e++;
        }
    }
}
