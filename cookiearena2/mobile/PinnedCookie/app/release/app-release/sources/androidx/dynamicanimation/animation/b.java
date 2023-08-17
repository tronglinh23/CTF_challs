package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.u1;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.b;
import d.b1;
import d.x;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {
    public static final float A = 1.0f;
    public static final float B = 0.1f;
    public static final float C = 0.00390625f;
    public static final float D = 0.002f;
    public static final float E = Float.MAX_VALUE;
    public static final float F = 0.75f;

    /* renamed from: m  reason: collision with root package name */
    public static final s f3969m = new g("translationX");

    /* renamed from: n  reason: collision with root package name */
    public static final s f3970n = new h("translationY");

    /* renamed from: o  reason: collision with root package name */
    public static final s f3971o = new i("translationZ");

    /* renamed from: p  reason: collision with root package name */
    public static final s f3972p = new j("scaleX");

    /* renamed from: q  reason: collision with root package name */
    public static final s f3973q = new k("scaleY");

    /* renamed from: r  reason: collision with root package name */
    public static final s f3974r = new l(c0.f.f7363i);

    /* renamed from: s  reason: collision with root package name */
    public static final s f3975s = new m("rotationX");

    /* renamed from: t  reason: collision with root package name */
    public static final s f3976t = new n("rotationY");

    /* renamed from: u  reason: collision with root package name */
    public static final s f3977u = new o("x");

    /* renamed from: v  reason: collision with root package name */
    public static final s f3978v = new a("y");

    /* renamed from: w  reason: collision with root package name */
    public static final s f3979w = new C0043b("z");

    /* renamed from: x  reason: collision with root package name */
    public static final s f3980x = new c("alpha");

    /* renamed from: y  reason: collision with root package name */
    public static final s f3981y = new d("scrollX");

    /* renamed from: z  reason: collision with root package name */
    public static final s f3982z = new e("scrollY");

    /* renamed from: a  reason: collision with root package name */
    public float f3983a;

    /* renamed from: b  reason: collision with root package name */
    public float f3984b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3985c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3986d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.dynamicanimation.animation.d f3987e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3988f;

    /* renamed from: g  reason: collision with root package name */
    public float f3989g;

    /* renamed from: h  reason: collision with root package name */
    public float f3990h;

    /* renamed from: i  reason: collision with root package name */
    public long f3991i;

    /* renamed from: j  reason: collision with root package name */
    public float f3992j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<q> f3993k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<r> f3994l;

    /* loaded from: classes.dex */
    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setY(f7);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0043b extends s {
        public C0043b(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return u1.F0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            u1.B2(view, f7);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setAlpha(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setScrollX((int) f7);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setScrollY((int) f7);
        }
    }

    /* loaded from: classes.dex */
    public class f extends androidx.dynamicanimation.animation.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.dynamicanimation.animation.e f3995a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, androidx.dynamicanimation.animation.e eVar) {
            super(str);
            this.f3995a = eVar;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float getValue(Object obj) {
            return this.f3995a.a();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void setValue(Object obj, float f7) {
            this.f3995a.b(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setTranslationX(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setTranslationY(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return u1.A0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            u1.w2(view, f7);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setScaleX(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setScaleY(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setRotation(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setRotationX(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setRotationY(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public float getValue(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f7) {
            view.setX(f7);
        }
    }

    /* loaded from: classes.dex */
    public static class p {

        /* renamed from: a  reason: collision with root package name */
        public float f3997a;

        /* renamed from: b  reason: collision with root package name */
        public float f3998b;
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(b bVar, boolean z6, float f7, float f8);
    }

    /* loaded from: classes.dex */
    public interface r {
        void a(b bVar, float f7, float f8);
    }

    /* loaded from: classes.dex */
    public static abstract class s extends androidx.dynamicanimation.animation.d<View> {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public b(androidx.dynamicanimation.animation.e eVar) {
        this.f3983a = 0.0f;
        this.f3984b = Float.MAX_VALUE;
        this.f3985c = false;
        this.f3988f = false;
        this.f3989g = Float.MAX_VALUE;
        this.f3990h = -Float.MAX_VALUE;
        this.f3991i = 0L;
        this.f3993k = new ArrayList<>();
        this.f3994l = new ArrayList<>();
        this.f3986d = null;
        this.f3987e = new f("FloatValueHolder", eVar);
        this.f3992j = 1.0f;
    }

    public static <T> void m(ArrayList<T> arrayList, T t6) {
        int indexOf = arrayList.indexOf(t6);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public static <T> void n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // androidx.dynamicanimation.animation.a.b
    @b1({b1.a.LIBRARY})
    public boolean a(long j7) {
        long j8 = this.f3991i;
        if (j8 == 0) {
            this.f3991i = j7;
            s(this.f3984b);
            return false;
        }
        this.f3991i = j7;
        boolean y6 = y(j7 - j8);
        float min = Math.min(this.f3984b, this.f3989g);
        this.f3984b = min;
        float max = Math.max(min, this.f3990h);
        this.f3984b = max;
        s(max);
        if (y6) {
            e(false);
        }
        return y6;
    }

    public T b(q qVar) {
        if (!this.f3993k.contains(qVar)) {
            this.f3993k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (k()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f3994l.contains(rVar)) {
            this.f3994l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f3988f) {
            e(true);
        }
    }

    public final void e(boolean z6) {
        this.f3988f = false;
        androidx.dynamicanimation.animation.a.e().h(this);
        this.f3991i = 0L;
        this.f3985c = false;
        for (int i7 = 0; i7 < this.f3993k.size(); i7++) {
            if (this.f3993k.get(i7) != null) {
                this.f3993k.get(i7).a(this, z6, this.f3984b, this.f3983a);
            }
        }
        n(this.f3993k);
    }

    public abstract float f(float f7, float f8);

    public float g() {
        return this.f3992j;
    }

    public final float h() {
        return this.f3987e.getValue(this.f3986d);
    }

    public float i() {
        return this.f3992j * 0.75f;
    }

    public abstract boolean j(float f7, float f8);

    public boolean k() {
        return this.f3988f;
    }

    public void l(q qVar) {
        m(this.f3993k, qVar);
    }

    public void o(r rVar) {
        m(this.f3994l, rVar);
    }

    public T p(float f7) {
        this.f3989g = f7;
        return this;
    }

    public T q(float f7) {
        this.f3990h = f7;
        return this;
    }

    public T r(@x(from = 0.0d, fromInclusive = false) float f7) {
        if (f7 > 0.0f) {
            this.f3992j = f7;
            v(f7 * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public void s(float f7) {
        this.f3987e.setValue(this.f3986d, f7);
        for (int i7 = 0; i7 < this.f3994l.size(); i7++) {
            if (this.f3994l.get(i7) != null) {
                this.f3994l.get(i7).a(this, this.f3984b, this.f3983a);
            }
        }
        n(this.f3994l);
    }

    public T t(float f7) {
        this.f3984b = f7;
        this.f3985c = true;
        return this;
    }

    public T u(float f7) {
        this.f3983a = f7;
        return this;
    }

    public abstract void v(float f7);

    public void w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f3988f) {
            return;
        }
        x();
    }

    public final void x() {
        if (this.f3988f) {
            return;
        }
        this.f3988f = true;
        if (!this.f3985c) {
            this.f3984b = h();
        }
        float f7 = this.f3984b;
        if (f7 > this.f3989g || f7 < this.f3990h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        androidx.dynamicanimation.animation.a.e().a(this, 0L);
    }

    public abstract boolean y(long j7);

    public <K> b(K k7, androidx.dynamicanimation.animation.d<K> dVar) {
        this.f3983a = 0.0f;
        this.f3984b = Float.MAX_VALUE;
        this.f3985c = false;
        this.f3988f = false;
        this.f3989g = Float.MAX_VALUE;
        this.f3990h = -Float.MAX_VALUE;
        this.f3991i = 0L;
        this.f3993k = new ArrayList<>();
        this.f3994l = new ArrayList<>();
        this.f3986d = k7;
        this.f3987e = dVar;
        if (dVar != f3974r && dVar != f3975s && dVar != f3976t) {
            if (dVar == f3980x) {
                this.f3992j = 0.00390625f;
                return;
            } else if (dVar != f3972p && dVar != f3973q) {
                this.f3992j = 1.0f;
                return;
            } else {
                this.f3992j = 0.00390625f;
                return;
            }
        }
        this.f3992j = 0.1f;
    }
}
