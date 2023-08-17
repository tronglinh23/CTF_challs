package s2;

import java.util.ArrayList;
import java.util.List;
import u4.r1;
@r1({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,193:1\n161#2:194\n161#2:195\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n*L\n131#1:194\n149#1:195\n*E\n"})
@i0
/* loaded from: classes.dex */
public class l0 extends h0<k0> {
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public final e1 f16382h;
    @d.d0

    /* renamed from: i  reason: collision with root package name */
    public int f16383i;
    @n6.e

    /* renamed from: j  reason: collision with root package name */
    public String f16384j;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final List<g0> f16385k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @v3.k(message = "Use routes to build your NavGraph instead", replaceWith = @v3.b1(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public l0(@n6.d e1 e1Var, @d.d0 int i7, @d.d0 int i8) {
        super(e1Var.e(o0.class), i7);
        u4.l0.p(e1Var, "provider");
        this.f16385k = new ArrayList();
        this.f16382h = e1Var;
        this.f16383i = i8;
    }

    public final void k(@n6.d g0 g0Var) {
        u4.l0.p(g0Var, "destination");
        this.f16385k.add(g0Var);
    }

    @Override // s2.h0
    @n6.d
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public k0 c() {
        k0 k0Var = (k0) super.c();
        k0Var.Q(this.f16385k);
        int i7 = this.f16383i;
        if (i7 == 0 && this.f16384j == null) {
            if (i() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.f16384j;
        if (str != null) {
            u4.l0.m(str);
            k0Var.f0(str);
        } else {
            k0Var.e0(i7);
        }
        return k0Var;
    }

    public final <D extends g0> void m(@n6.d h0<? extends D> h0Var) {
        u4.l0.p(h0Var, "navDestination");
        this.f16385k.add(h0Var.c());
    }

    @n6.d
    public final e1 n() {
        return this.f16382h;
    }

    public final void o(@n6.d g0 g0Var) {
        u4.l0.p(g0Var, "<this>");
        k(g0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@n6.d e1 e1Var, @n6.d String str, @n6.e String str2) {
        super(e1Var.e(o0.class), str2);
        u4.l0.p(e1Var, "provider");
        u4.l0.p(str, "startDestination");
        this.f16385k = new ArrayList();
        this.f16382h = e1Var;
        this.f16384j = str;
    }
}
