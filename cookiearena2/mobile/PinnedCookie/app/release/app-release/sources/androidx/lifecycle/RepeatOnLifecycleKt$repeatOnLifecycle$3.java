package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.z2;
import u4.r1;
import v3.m2;
@h4.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

    /* renamed from: o  reason: collision with root package name */
    public int f4632o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f4633p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ p f4634q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ p.b f4635r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> f4636s;

    @r1({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    @h4.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", i = {0, 0}, l = {166}, m = "invokeSuspend", n = {"launchedJob", "observer"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends h4.o implements t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public Object f4637o;

        /* renamed from: p  reason: collision with root package name */
        public Object f4638p;

        /* renamed from: q  reason: collision with root package name */
        public Object f4639q;

        /* renamed from: r  reason: collision with root package name */
        public Object f4640r;

        /* renamed from: s  reason: collision with root package name */
        public Object f4641s;

        /* renamed from: t  reason: collision with root package name */
        public Object f4642t;

        /* renamed from: u  reason: collision with root package name */
        public int f4643u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ p f4644v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p.b f4645w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.u0 f4646x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ t4.p<kotlinx.coroutines.u0, e4.d<? super m2>, Object> f4647y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(p pVar, p.b bVar, kotlinx.coroutines.u0 u0Var, t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar2, e4.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.f4644v = pVar;
            this.f4645w = bVar;
            this.f4646x = u0Var;
            this.f4647y = pVar2;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new AnonymousClass1(this.f4644v, this.f4645w, this.f4646x, this.f4647y, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T, java.lang.Object] */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d kotlinx.coroutines.u0 u0Var, @n6.e e4.d<? super m2> dVar) {
            return ((AnonymousClass1) H(u0Var, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(p pVar, p.b bVar, t4.p<? super kotlinx.coroutines.u0, ? super e4.d<? super m2>, ? extends Object> pVar2, e4.d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.f4634q = pVar;
        this.f4635r = bVar;
        this.f4636s = pVar2;
    }

    @Override // h4.a
    @n6.d
    public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f4634q, this.f4635r, this.f4636s, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f4633p = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // h4.a
    @n6.e
    public final Object Q(@n6.d Object obj) {
        Object h7 = g4.d.h();
        int i7 = this.f4632o;
        if (i7 == 0) {
            v3.e1.n(obj);
            kotlinx.coroutines.u0 u0Var = (kotlinx.coroutines.u0) this.f4633p;
            z2 c12 = m1.e().c1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4634q, this.f4635r, u0Var, this.f4636s, null);
            this.f4632o = 1;
            if (kotlinx.coroutines.j.h(c12, anonymousClass1, this) == h7) {
                return h7;
            }
        } else if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            v3.e1.n(obj);
        }
        return m2.f17815a;
    }

    @Override // t4.p
    @n6.e
    /* renamed from: a0  reason: merged with bridge method [inline-methods] */
    public final Object J(@n6.d kotlinx.coroutines.u0 u0Var, @n6.e e4.d<? super m2> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) H(u0Var, dVar)).Q(m2.f17815a);
    }
}
