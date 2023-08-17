package androidx.activity;

import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.z0;
import u4.l0;
import u4.l1;
import u4.n0;
import v3.d0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: androidx.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0014a extends n0 implements t4.a<e1> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f537l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0014a(ComponentActivity componentActivity) {
            super(0);
            this.f537l = componentActivity;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final e1 n() {
            e1 viewModelStore = this.f537l.getViewModelStore();
            l0.o(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.a<k2.a> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f538l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f538l = componentActivity;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final k2.a n() {
            k2.a defaultViewModelCreationExtras = this.f538l.getDefaultViewModelCreationExtras();
            l0.o(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.a<e1> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f539l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f539l = componentActivity;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final e1 n() {
            e1 viewModelStore = this.f539l.getViewModelStore();
            l0.o(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 implements t4.a<k2.a> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.a<k2.a> f540l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f541m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(t4.a<? extends k2.a> aVar, ComponentActivity componentActivity) {
            super(0);
            this.f540l = aVar;
            this.f541m = componentActivity;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final k2.a n() {
            k2.a n7;
            t4.a<k2.a> aVar = this.f540l;
            if (aVar == null || (n7 = aVar.n()) == null) {
                k2.a defaultViewModelCreationExtras = this.f541m.getDefaultViewModelCreationExtras();
                l0.o(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
            return n7;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n0 implements t4.a<c1.b> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f542l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f542l = componentActivity;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final c1.b n() {
            c1.b defaultViewModelProviderFactory = this.f542l.getDefaultViewModelProviderFactory();
            l0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends n0 implements t4.a<c1.b> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f543l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f543l = componentActivity;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final c1.b n() {
            c1.b defaultViewModelProviderFactory = this.f543l.getDefaultViewModelProviderFactory();
            l0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @d.l0
    @v3.k(level = v3.m.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    public static final /* synthetic */ <VM extends z0> d0<VM> a(ComponentActivity componentActivity, t4.a<? extends c1.b> aVar) {
        l0.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new e(componentActivity);
        }
        l0.y(4, "VM");
        return new b1(l1.d(z0.class), new C0014a(componentActivity), aVar, new b(componentActivity));
    }

    @d.l0
    public static final /* synthetic */ <VM extends z0> d0<VM> b(ComponentActivity componentActivity, t4.a<? extends k2.a> aVar, t4.a<? extends c1.b> aVar2) {
        l0.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new f(componentActivity);
        }
        l0.y(4, "VM");
        return new b1(l1.d(z0.class), new c(componentActivity), aVar2, new d(aVar, componentActivity));
    }

    public static /* synthetic */ d0 c(ComponentActivity componentActivity, t4.a aVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        l0.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new e(componentActivity);
        }
        l0.y(4, "VM");
        return new b1(l1.d(z0.class), new C0014a(componentActivity), aVar, new b(componentActivity));
    }

    public static /* synthetic */ d0 d(ComponentActivity componentActivity, t4.a aVar, t4.a aVar2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            aVar = null;
        }
        if ((i7 & 2) != 0) {
            aVar2 = null;
        }
        l0.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new f(componentActivity);
        }
        l0.y(4, "VM");
        return new b1(l1.d(z0.class), new c(componentActivity), aVar2, new d(aVar, componentActivity));
    }
}
