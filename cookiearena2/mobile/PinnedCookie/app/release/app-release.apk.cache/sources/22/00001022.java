package h0;

import android.animation.Animator;
import d.w0;
import s2.t0;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.m2;

@r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,136:1\n95#1,14:137\n95#1,14:151\n95#1,14:165\n95#1,14:179\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n32#1:137,14\n43#1:151,14\n54#1:165,14\n64#1:179,14\n*E\n"})
/* loaded from: classes.dex */
public final class a {

    @r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n*L\n1#1,136:1\n*E\n"})
    /* renamed from: h0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0114a extends n0 implements t4.l<Animator, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final C0114a f10117l = new C0114a();

        public C0114a() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Animator animator) {
            b(animator);
            return m2.f17815a;
        }

        public final void b(@n6.d Animator animator) {
            l0.p(animator, "it");
        }
    }

    @r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.l<Animator, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f10118l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Animator animator) {
            b(animator);
            return m2.f17815a;
        }

        public final void b(@n6.d Animator animator) {
            l0.p(animator, "it");
        }
    }

    @r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,136:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.l<Animator, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final c f10119l = new c();

        public c() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Animator animator) {
            b(animator);
            return m2.f17815a;
        }

        public final void b(@n6.d Animator animator) {
            l0.p(animator, "it");
        }
    }

    @r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n*L\n1#1,136:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d extends n0 implements t4.l<Animator, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final d f10120l = new d();

        public d() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Animator animator) {
            b(animator);
            return m2.f17815a;
        }

        public final void b(@n6.d Animator animator) {
            l0.p(animator, "it");
        }
    }

    @r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n*L\n1#1,136:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l<Animator, m2> f10121a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<Animator, m2> f10122b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t4.l<Animator, m2> f10123c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ t4.l<Animator, m2> f10124d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(t4.l<? super Animator, m2> lVar, t4.l<? super Animator, m2> lVar2, t4.l<? super Animator, m2> lVar3, t4.l<? super Animator, m2> lVar4) {
            this.f10121a = lVar;
            this.f10122b = lVar2;
            this.f10123c = lVar3;
            this.f10124d = lVar4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10123c.O(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10122b.O(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10121a.O(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10124d.O(animator);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends n0 implements t4.l<Animator, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final f f10125l = new f();

        public f() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Animator animator) {
            b(animator);
            return m2.f17815a;
        }

        public final void b(@n6.d Animator animator) {
            l0.p(animator, "it");
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends n0 implements t4.l<Animator, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final g f10126l = new g();

        public g() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Animator animator) {
            b(animator);
            return m2.f17815a;
        }

        public final void b(@n6.d Animator animator) {
            l0.p(animator, "it");
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements Animator.AnimatorPauseListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l<Animator, m2> f10127a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<Animator, m2> f10128b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(t4.l<? super Animator, m2> lVar, t4.l<? super Animator, m2> lVar2) {
            this.f10127a = lVar;
            this.f10128b = lVar2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10127a.O(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10128b.O(animator);
        }
    }

    @r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n99#2:137\n96#3:138\n97#4:139\n*E\n"})
    /* loaded from: classes.dex */
    public static final class i implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l f10129a;

        public i(t4.l lVar) {
            this.f10129a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10129a.O(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }
    }

    @r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n99#2:137\n98#3:138\n97#4:139\n*E\n"})
    /* loaded from: classes.dex */
    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l f10130a;

        public j(t4.l lVar) {
            this.f10130a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10130a.O(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }
    }

    @r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,136:1\n96#2:137\n98#3:138\n97#4:139\n*E\n"})
    /* loaded from: classes.dex */
    public static final class k implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l f10131a;

        public k(t4.l lVar) {
            this.f10131a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10131a.O(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }
    }

    @r1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,136:1\n99#2:137\n96#3:138\n98#4:139\n*E\n"})
    /* loaded from: classes.dex */
    public static final class l implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.l f10132a;

        public l(t4.l lVar) {
            this.f10132a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@n6.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@n6.d Animator animator) {
            l0.p(animator, "animator");
            this.f10132a.O(animator);
        }
    }

    @n6.d
    public static final Animator.AnimatorListener a(@n6.d Animator animator, @n6.d t4.l<? super Animator, m2> lVar, @n6.d t4.l<? super Animator, m2> lVar2, @n6.d t4.l<? super Animator, m2> lVar3, @n6.d t4.l<? super Animator, m2> lVar4) {
        l0.p(animator, "<this>");
        l0.p(lVar, "onEnd");
        l0.p(lVar2, "onStart");
        l0.p(lVar3, "onCancel");
        l0.p(lVar4, "onRepeat");
        e eVar = new e(lVar4, lVar, lVar3, lVar2);
        animator.addListener(eVar);
        return eVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, t4.l lVar, t4.l lVar2, t4.l lVar3, t4.l lVar4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            lVar = C0114a.f10117l;
        }
        if ((i7 & 2) != 0) {
            lVar2 = b.f10118l;
        }
        if ((i7 & 4) != 0) {
            lVar3 = c.f10119l;
        }
        if ((i7 & 8) != 0) {
            lVar4 = d.f10120l;
        }
        l0.p(animator, "<this>");
        l0.p(lVar, "onEnd");
        l0.p(lVar2, "onStart");
        l0.p(lVar3, "onCancel");
        l0.p(lVar4, "onRepeat");
        e eVar = new e(lVar4, lVar, lVar3, lVar2);
        animator.addListener(eVar);
        return eVar;
    }

    @n6.d
    @w0(19)
    public static final Animator.AnimatorPauseListener c(@n6.d Animator animator, @n6.d t4.l<? super Animator, m2> lVar, @n6.d t4.l<? super Animator, m2> lVar2) {
        l0.p(animator, "<this>");
        l0.p(lVar, "onResume");
        l0.p(lVar2, "onPause");
        h hVar = new h(lVar2, lVar);
        h0.b.a(animator, hVar);
        return hVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, t4.l lVar, t4.l lVar2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            lVar = f.f10125l;
        }
        if ((i7 & 2) != 0) {
            lVar2 = g.f10126l;
        }
        return c(animator, lVar, lVar2);
    }

    @n6.d
    public static final Animator.AnimatorListener e(@n6.d Animator animator, @n6.d t4.l<? super Animator, m2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, t0.f16450f);
        i iVar = new i(lVar);
        animator.addListener(iVar);
        return iVar;
    }

    @n6.d
    public static final Animator.AnimatorListener f(@n6.d Animator animator, @n6.d t4.l<? super Animator, m2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, t0.f16450f);
        j jVar = new j(lVar);
        animator.addListener(jVar);
        return jVar;
    }

    @n6.d
    @w0(19)
    public static final Animator.AnimatorPauseListener g(@n6.d Animator animator, @n6.d t4.l<? super Animator, m2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, t0.f16450f);
        return d(animator, null, lVar, 1, null);
    }

    @n6.d
    public static final Animator.AnimatorListener h(@n6.d Animator animator, @n6.d t4.l<? super Animator, m2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, t0.f16450f);
        k kVar = new k(lVar);
        animator.addListener(kVar);
        return kVar;
    }

    @n6.d
    @w0(19)
    public static final Animator.AnimatorPauseListener i(@n6.d Animator animator, @n6.d t4.l<? super Animator, m2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, t0.f16450f);
        return d(animator, lVar, null, 2, null);
    }

    @n6.d
    public static final Animator.AnimatorListener j(@n6.d Animator animator, @n6.d t4.l<? super Animator, m2> lVar) {
        l0.p(animator, "<this>");
        l0.p(lVar, t0.f16450f);
        l lVar2 = new l(lVar);
        animator.addListener(lVar2);
        return lVar2;
    }
}