package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.layout.l;
import androidx.window.layout.m;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d.l1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t3.g;
import u4.l0;
import u4.n0;
/* loaded from: classes.dex */
public final class o {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final a f7092b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final String f7093c = o.class.getSimpleName();
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final g.b f7094a;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        @l1
        public final int a(@n6.d SidecarDeviceState sidecarDeviceState) {
            l0.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (invoke != null) {
                        return ((Integer) invoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(@n6.d SidecarDeviceState sidecarDeviceState) {
            l0.p(sidecarDeviceState, "sidecarDeviceState");
            int a7 = a(sidecarDeviceState);
            if (a7 < 0 || a7 > 4) {
                return 0;
            }
            return a7;
        }

        @n6.d
        @SuppressLint({"BanUncheckedReflection"})
        @l1
        public final List<SidecarDisplayFeature> c(@n6.d SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            l0.p(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? x3.w.E() : list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                    if (invoke != null) {
                        return (List) invoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return x3.w.E();
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @l1
        public final void d(@n6.d SidecarDeviceState sidecarDeviceState, int i7) {
            l0.p(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i7;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i7));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @l1
        public final void e(@n6.d SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @n6.d List<SidecarDisplayFeature> list) {
            l0.p(sidecarWindowLayoutInfo, "info");
            l0.p(list, "displayFeatures");
            try {
                try {
                    sidecarWindowLayoutInfo.displayFeatures = list;
                } catch (NoSuchFieldError unused) {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, list);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f7095l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d SidecarDisplayFeature sidecarDisplayFeature) {
            l0.p(sidecarDisplayFeature, "$this$require");
            boolean z6 = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final c f7096l = new c();

        public c() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d SidecarDisplayFeature sidecarDisplayFeature) {
            l0.p(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 implements t4.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final d f7097l = new d();

        public d() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d SidecarDisplayFeature sidecarDisplayFeature) {
            l0.p(sidecarDisplayFeature, "$this$require");
            boolean z6 = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n0 implements t4.l<SidecarDisplayFeature, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final e f7098l = new e();

        public e() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d SidecarDisplayFeature sidecarDisplayFeature) {
            l0.p(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [t3.g$b, u4.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.o.<init>():void");
    }

    public final boolean a(@n6.e SidecarDeviceState sidecarDeviceState, @n6.e SidecarDeviceState sidecarDeviceState2) {
        if (l0.g(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = f7092b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (l0.g(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return l0.g(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean c(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 1;
            if (!b(list.get(i7), list2.get(i7))) {
                return false;
            }
            i7 = i8;
        }
        return true;
    }

    public final boolean d(@n6.e SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @n6.e SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (l0.g(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = f7092b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    @n6.d
    public final w e(@n6.e SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @n6.d SidecarDeviceState sidecarDeviceState) {
        l0.p(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new w(x3.w.E());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a aVar = f7092b;
        aVar.d(sidecarDeviceState2, aVar.b(sidecarDeviceState));
        return new w(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    @n6.d
    public final List<g> f(@n6.d List<SidecarDisplayFeature> list, @n6.d SidecarDeviceState sidecarDeviceState) {
        l0.p(list, "sidecarDisplayFeatures");
        l0.p(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g g7 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g7 != null) {
                arrayList.add(g7);
            }
        }
        return arrayList;
    }

    @n6.e
    public final g g(@n6.d SidecarDisplayFeature sidecarDisplayFeature, @n6.d SidecarDeviceState sidecarDeviceState) {
        m.b a7;
        l.c cVar;
        l0.p(sidecarDisplayFeature, "feature");
        l0.p(sidecarDeviceState, "deviceState");
        g.a aVar = t3.g.f16838a;
        String str = f7093c;
        l0.o(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) g.a.b(aVar, sidecarDisplayFeature, str, this.f7094a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f7095l).c("Feature bounds must not be 0", c.f7096l).c("TYPE_FOLD must have 0 area", d.f7097l).c("Feature be pinned to either left or top", e.f7098l).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            a7 = m.b.f7081b.a();
        } else if (type != 2) {
            return null;
        } else {
            a7 = m.b.f7081b.b();
        }
        int b7 = f7092b.b(sidecarDeviceState);
        if (b7 == 0 || b7 == 1) {
            return null;
        }
        if (b7 == 2) {
            cVar = l.c.f7075d;
        } else if (b7 == 3) {
            cVar = l.c.f7074c;
        } else if (b7 == 4) {
            return null;
        } else {
            cVar = l.c.f7074c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        l0.o(rect, "feature.rect");
        return new m(new t3.b(rect), a7, cVar);
    }

    public o(@n6.d g.b bVar) {
        l0.p(bVar, "verificationMode");
        this.f7094a = bVar;
    }

    public /* synthetic */ o(g.b bVar, int i7, u4.w wVar) {
        this((i7 & 1) != 0 ? g.b.QUIET : bVar);
    }
}
