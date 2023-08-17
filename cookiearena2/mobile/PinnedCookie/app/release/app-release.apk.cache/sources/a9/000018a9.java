package p5;

import java.util.Arrays;
import kotlinx.coroutines.flow.t0;
import p5.d;
import u4.l0;
import v3.d1;
import v3.m2;

/* loaded from: classes.dex */
public abstract class b<S extends d<?>> {
    @n6.e

    /* renamed from: k  reason: collision with root package name */
    public S[] f14832k;

    /* renamed from: l  reason: collision with root package name */
    public int f14833l;

    /* renamed from: m  reason: collision with root package name */
    public int f14834m;
    @n6.e

    /* renamed from: n  reason: collision with root package name */
    public a0 f14835n;

    public static final /* synthetic */ int d(b bVar) {
        return bVar.f14833l;
    }

    public static final /* synthetic */ d[] e(b bVar) {
        return bVar.f14832k;
    }

    public static /* synthetic */ void q() {
    }

    @n6.d
    public final t0<Integer> A() {
        a0 a0Var;
        synchronized (this) {
            a0Var = this.f14835n;
            if (a0Var == null) {
                a0Var = new a0(this.f14833l);
                this.f14835n = a0Var;
            }
        }
        return a0Var;
    }

    @n6.d
    public final S g() {
        S s6;
        a0 a0Var;
        synchronized (this) {
            S[] sArr = this.f14832k;
            if (sArr == null) {
                sArr = l(2);
                this.f14832k = sArr;
            } else if (this.f14833l >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                l0.o(copyOf, "copyOf(this, newSize)");
                this.f14832k = (S[]) ((d[]) copyOf);
                sArr = (S[]) ((d[]) copyOf);
            }
            int i7 = this.f14834m;
            do {
                s6 = sArr[i7];
                if (s6 == null) {
                    s6 = i();
                    sArr[i7] = s6;
                }
                i7++;
                if (i7 >= sArr.length) {
                    i7 = 0;
                }
            } while (!s6.a(this));
            this.f14834m = i7;
            this.f14833l++;
            a0Var = this.f14835n;
        }
        if (a0Var != null) {
            a0Var.h0(1);
        }
        return s6;
    }

    @n6.d
    public abstract S i();

    @n6.d
    public abstract S[] l(int i7);

    public final void m(@n6.d t4.l<? super S, m2> lVar) {
        d[] dVarArr;
        if (this.f14833l == 0 || (dVarArr = this.f14832k) == null) {
            return;
        }
        for (d dVar : dVarArr) {
            if (dVar != null) {
                lVar.O(dVar);
            }
        }
    }

    public final void n(@n6.d S s6) {
        a0 a0Var;
        int i7;
        e4.d<m2>[] b7;
        synchronized (this) {
            int i8 = this.f14833l - 1;
            this.f14833l = i8;
            a0Var = this.f14835n;
            if (i8 == 0) {
                this.f14834m = 0;
            }
            b7 = s6.b(this);
        }
        for (e4.d<m2> dVar : b7) {
            if (dVar != null) {
                d1.a aVar = d1.f17778l;
                dVar.D(d1.b(m2.f17815a));
            }
        }
        if (a0Var != null) {
            a0Var.h0(-1);
        }
    }

    public final int o() {
        return this.f14833l;
    }

    @n6.e
    public final S[] p() {
        return this.f14832k;
    }
}