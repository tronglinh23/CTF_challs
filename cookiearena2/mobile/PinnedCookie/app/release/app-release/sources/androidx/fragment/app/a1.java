package androidx.fragment.app;

import androidx.lifecycle.c1;
import k2.a;
import u4.l1;
import u4.r1;
/* loaded from: classes.dex */
public final class a1 {

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.a<androidx.lifecycle.e1> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4277l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f4277l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.e1 n() {
            androidx.lifecycle.e1 viewModelStore = this.f4277l.requireActivity().getViewModelStore();
            u4.l0.o(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b extends u4.n0 implements t4.a<k2.a> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4278l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f4278l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final k2.a n() {
            k2.a defaultViewModelCreationExtras = this.f4278l.requireActivity().getDefaultViewModelCreationExtras();
            u4.l0.o(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$3\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.a<c1.b> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4279l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f4279l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final c1.b n() {
            c1.b defaultViewModelProviderFactory = this.f4279l.requireActivity().getDefaultViewModelProviderFactory();
            u4.l0.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d extends u4.n0 implements t4.a<androidx.lifecycle.e1> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4280l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f4280l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.e1 n() {
            androidx.lifecycle.e1 viewModelStore = this.f4280l.requireActivity().getViewModelStore();
            u4.l0.o(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class e extends u4.n0 implements t4.a<k2.a> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.a<k2.a> f4281l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Fragment f4282m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(t4.a<? extends k2.a> aVar, Fragment fragment) {
            super(0);
            this.f4281l = aVar;
            this.f4282m = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final k2.a n() {
            k2.a n7;
            t4.a<k2.a> aVar = this.f4281l;
            if (aVar == null || (n7 = aVar.n()) == null) {
                k2.a defaultViewModelCreationExtras = this.f4282m.requireActivity().getDefaultViewModelCreationExtras();
                u4.l0.o(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
            return n7;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class f extends u4.n0 implements t4.a<c1.b> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4283l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f4283l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final c1.b n() {
            c1.b defaultViewModelProviderFactory = this.f4283l.requireActivity().getDefaultViewModelProviderFactory();
            u4.l0.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends u4.n0 implements t4.a<k2.a> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4284l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f4284l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final k2.a n() {
            k2.a defaultViewModelCreationExtras = this.f4284l.getDefaultViewModelCreationExtras();
            u4.l0.o(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends u4.n0 implements t4.a<k2.a> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f4285l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final k2.a n() {
            k2.a defaultViewModelCreationExtras = this.f4285l.getDefaultViewModelCreationExtras();
            u4.l0.o(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends u4.n0 implements t4.a<c1.b> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Fragment fragment) {
            super(0);
            this.f4286l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final c1.b n() {
            c1.b defaultViewModelProviderFactory = this.f4286l.getDefaultViewModelProviderFactory();
            u4.l0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$1\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class j extends u4.n0 implements t4.a<Fragment> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4287l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment) {
            super(0);
            this.f4287l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Fragment n() {
            return this.f4287l;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$2\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class k extends u4.n0 implements t4.a<androidx.lifecycle.e1> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ v3.d0<androidx.lifecycle.f1> f4288l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(v3.d0<? extends androidx.lifecycle.f1> d0Var) {
            super(0);
            this.f4288l = d0Var;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.e1 n() {
            return a1.o(this.f4288l).getViewModelStore();
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$3\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class l extends u4.n0 implements t4.a<k2.a> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ v3.d0<androidx.lifecycle.f1> f4289l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(v3.d0<? extends androidx.lifecycle.f1> d0Var) {
            super(0);
            this.f4289l = d0Var;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final k2.a n() {
            k2.a defaultViewModelCreationExtras;
            androidx.lifecycle.f1 o6 = a1.o(this.f4289l);
            androidx.lifecycle.o oVar = o6 instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) o6 : null;
            return (oVar == null || (defaultViewModelCreationExtras = oVar.getDefaultViewModelCreationExtras()) == null) ? a.C0139a.f11626b : defaultViewModelCreationExtras;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$4\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class m extends u4.n0 implements t4.a<c1.b> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4290l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ v3.d0<androidx.lifecycle.f1> f4291m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(Fragment fragment, v3.d0<? extends androidx.lifecycle.f1> d0Var) {
            super(0);
            this.f4290l = fragment;
            this.f4291m = d0Var;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final c1.b n() {
            c1.b defaultViewModelProviderFactory;
            androidx.lifecycle.f1 o6 = a1.o(this.f4291m);
            androidx.lifecycle.o oVar = o6 instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) o6 : null;
            if (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) {
                c1.b defaultViewModelProviderFactory2 = this.f4290l.getDefaultViewModelProviderFactory();
                u4.l0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
            return defaultViewModelProviderFactory;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$5\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class n extends u4.n0 implements t4.a<Fragment> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4292l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Fragment fragment) {
            super(0);
            this.f4292l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Fragment n() {
            return this.f4292l;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$6\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class o extends u4.n0 implements t4.a<androidx.lifecycle.e1> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ v3.d0<androidx.lifecycle.f1> f4293l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o(v3.d0<? extends androidx.lifecycle.f1> d0Var) {
            super(0);
            this.f4293l = d0Var;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.e1 n() {
            return a1.p(this.f4293l).getViewModelStore();
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$7\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class p extends u4.n0 implements t4.a<k2.a> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.a<k2.a> f4294l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ v3.d0<androidx.lifecycle.f1> f4295m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public p(t4.a<? extends k2.a> aVar, v3.d0<? extends androidx.lifecycle.f1> d0Var) {
            super(0);
            this.f4294l = aVar;
            this.f4295m = d0Var;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final k2.a n() {
            k2.a n7;
            t4.a<k2.a> aVar = this.f4294l;
            if (aVar == null || (n7 = aVar.n()) == null) {
                androidx.lifecycle.f1 p6 = a1.p(this.f4295m);
                androidx.lifecycle.o oVar = p6 instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) p6 : null;
                return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0139a.f11626b;
            }
            return n7;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$8\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class q extends u4.n0 implements t4.a<c1.b> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f4296l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ v3.d0<androidx.lifecycle.f1> f4297m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(Fragment fragment, v3.d0<? extends androidx.lifecycle.f1> d0Var) {
            super(0);
            this.f4296l = fragment;
            this.f4297m = d0Var;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final c1.b n() {
            c1.b defaultViewModelProviderFactory;
            androidx.lifecycle.f1 p6 = a1.p(this.f4297m);
            androidx.lifecycle.o oVar = p6 instanceof androidx.lifecycle.o ? (androidx.lifecycle.o) p6 : null;
            if (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) {
                c1.b defaultViewModelProviderFactory2 = this.f4296l.getDefaultViewModelProviderFactory();
                u4.l0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
            return defaultViewModelProviderFactory;
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$2\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class r extends u4.n0 implements t4.a<androidx.lifecycle.f1> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.a<androidx.lifecycle.f1> f4298l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(t4.a<? extends androidx.lifecycle.f1> aVar) {
            super(0);
            this.f4298l = aVar;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.f1 n() {
            return this.f4298l.n();
        }
    }

    @r1({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$viewModels$owner$4\n*L\n1#1,222:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class s extends u4.n0 implements t4.a<androidx.lifecycle.f1> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.a<androidx.lifecycle.f1> f4299l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(t4.a<? extends androidx.lifecycle.f1> aVar) {
            super(0);
            this.f4299l = aVar;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.f1 n() {
            return this.f4299l.n();
        }
    }

    @d.l0
    @v3.k(level = v3.m.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends androidx.lifecycle.z0> v3.d0<VM> c(Fragment fragment, t4.a<? extends c1.b> aVar) {
        u4.l0.p(fragment, "<this>");
        u4.l0.y(4, "VM");
        e5.d d7 = l1.d(androidx.lifecycle.z0.class);
        a aVar2 = new a(fragment);
        b bVar = new b(fragment);
        if (aVar == null) {
            aVar = new c(fragment);
        }
        return h(fragment, d7, aVar2, bVar, aVar);
    }

    @d.l0
    public static final /* synthetic */ <VM extends androidx.lifecycle.z0> v3.d0<VM> d(Fragment fragment, t4.a<? extends k2.a> aVar, t4.a<? extends c1.b> aVar2) {
        u4.l0.p(fragment, "<this>");
        u4.l0.y(4, "VM");
        e5.d d7 = l1.d(androidx.lifecycle.z0.class);
        d dVar = new d(fragment);
        e eVar = new e(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new f(fragment);
        }
        return h(fragment, d7, dVar, eVar, aVar2);
    }

    public static /* synthetic */ v3.d0 e(Fragment fragment, t4.a aVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        u4.l0.p(fragment, "<this>");
        u4.l0.y(4, "VM");
        e5.d d7 = l1.d(androidx.lifecycle.z0.class);
        a aVar2 = new a(fragment);
        b bVar = new b(fragment);
        if (aVar == null) {
            aVar = new c(fragment);
        }
        return h(fragment, d7, aVar2, bVar, aVar);
    }

    public static /* synthetic */ v3.d0 f(Fragment fragment, t4.a aVar, t4.a aVar2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        if ((i7 & 2) != 0) {
            aVar2 = null;
        }
        u4.l0.p(fragment, "<this>");
        u4.l0.y(4, "VM");
        e5.d d7 = l1.d(androidx.lifecycle.z0.class);
        d dVar = new d(fragment);
        e eVar = new e(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new f(fragment);
        }
        return h(fragment, d7, dVar, eVar, aVar2);
    }

    @d.l0
    @v3.k(level = v3.m.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    public static final /* synthetic */ v3.d0 g(Fragment fragment, e5.d dVar, t4.a aVar, t4.a aVar2) {
        u4.l0.p(fragment, "<this>");
        u4.l0.p(dVar, "viewModelClass");
        u4.l0.p(aVar, "storeProducer");
        return h(fragment, dVar, aVar, new g(fragment), aVar2);
    }

    @d.l0
    @n6.d
    public static final <VM extends androidx.lifecycle.z0> v3.d0<VM> h(@n6.d Fragment fragment, @n6.d e5.d<VM> dVar, @n6.d t4.a<? extends androidx.lifecycle.e1> aVar, @n6.d t4.a<? extends k2.a> aVar2, @n6.e t4.a<? extends c1.b> aVar3) {
        u4.l0.p(fragment, "<this>");
        u4.l0.p(dVar, "viewModelClass");
        u4.l0.p(aVar, "storeProducer");
        u4.l0.p(aVar2, "extrasProducer");
        if (aVar3 == null) {
            aVar3 = new i(fragment);
        }
        return new androidx.lifecycle.b1(dVar, aVar, aVar3, aVar2);
    }

    public static /* synthetic */ v3.d0 i(Fragment fragment, e5.d dVar, t4.a aVar, t4.a aVar2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            aVar2 = null;
        }
        return g(fragment, dVar, aVar, aVar2);
    }

    public static /* synthetic */ v3.d0 j(Fragment fragment, e5.d dVar, t4.a aVar, t4.a aVar2, t4.a aVar3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            aVar2 = new h(fragment);
        }
        if ((i7 & 8) != 0) {
            aVar3 = null;
        }
        return h(fragment, dVar, aVar, aVar2, aVar3);
    }

    @d.l0
    @v3.k(level = v3.m.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends androidx.lifecycle.z0> v3.d0<VM> k(Fragment fragment, t4.a<? extends androidx.lifecycle.f1> aVar, t4.a<? extends c1.b> aVar2) {
        u4.l0.p(fragment, "<this>");
        u4.l0.p(aVar, "ownerProducer");
        v3.d0 c7 = v3.f0.c(v3.h0.NONE, new r(aVar));
        u4.l0.y(4, "VM");
        e5.d d7 = l1.d(androidx.lifecycle.z0.class);
        k kVar = new k(c7);
        l lVar = new l(c7);
        if (aVar2 == null) {
            aVar2 = new m(fragment, c7);
        }
        return h(fragment, d7, kVar, lVar, aVar2);
    }

    @d.l0
    public static final /* synthetic */ <VM extends androidx.lifecycle.z0> v3.d0<VM> l(Fragment fragment, t4.a<? extends androidx.lifecycle.f1> aVar, t4.a<? extends k2.a> aVar2, t4.a<? extends c1.b> aVar3) {
        u4.l0.p(fragment, "<this>");
        u4.l0.p(aVar, "ownerProducer");
        v3.d0 c7 = v3.f0.c(v3.h0.NONE, new s(aVar));
        u4.l0.y(4, "VM");
        e5.d d7 = l1.d(androidx.lifecycle.z0.class);
        o oVar = new o(c7);
        p pVar = new p(aVar2, c7);
        if (aVar3 == null) {
            aVar3 = new q(fragment, c7);
        }
        return h(fragment, d7, oVar, pVar, aVar3);
    }

    public static /* synthetic */ v3.d0 m(Fragment fragment, t4.a aVar, t4.a aVar2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = new j(fragment);
        }
        if ((i7 & 2) != 0) {
            aVar2 = null;
        }
        u4.l0.p(fragment, "<this>");
        u4.l0.p(aVar, "ownerProducer");
        v3.d0 c7 = v3.f0.c(v3.h0.NONE, new r(aVar));
        u4.l0.y(4, "VM");
        e5.d d7 = l1.d(androidx.lifecycle.z0.class);
        k kVar = new k(c7);
        l lVar = new l(c7);
        if (aVar2 == null) {
            aVar2 = new m(fragment, c7);
        }
        return h(fragment, d7, kVar, lVar, aVar2);
    }

    public static /* synthetic */ v3.d0 n(Fragment fragment, t4.a aVar, t4.a aVar2, t4.a aVar3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = new n(fragment);
        }
        if ((i7 & 2) != 0) {
            aVar2 = null;
        }
        if ((i7 & 4) != 0) {
            aVar3 = null;
        }
        u4.l0.p(fragment, "<this>");
        u4.l0.p(aVar, "ownerProducer");
        v3.d0 c7 = v3.f0.c(v3.h0.NONE, new s(aVar));
        u4.l0.y(4, "VM");
        e5.d d7 = l1.d(androidx.lifecycle.z0.class);
        o oVar = new o(c7);
        p pVar = new p(aVar2, c7);
        if (aVar3 == null) {
            aVar3 = new q(fragment, c7);
        }
        return h(fragment, d7, oVar, pVar, aVar3);
    }

    public static final androidx.lifecycle.f1 o(v3.d0<? extends androidx.lifecycle.f1> d0Var) {
        return d0Var.getValue();
    }

    public static final androidx.lifecycle.f1 p(v3.d0<? extends androidx.lifecycle.f1> d0Var) {
        return d0Var.getValue();
    }
}
