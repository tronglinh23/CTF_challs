package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import d.b1;
import h.a;
import h.b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: h  reason: collision with root package name */
    public static final String f1619h = "ResourceManagerInternal";

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f1620i = false;

    /* renamed from: k  reason: collision with root package name */
    public static final String f1622k = "appcompat_skip_skip";

    /* renamed from: l  reason: collision with root package name */
    public static final String f1623l = "android.graphics.drawable.VectorDrawable";

    /* renamed from: m  reason: collision with root package name */
    public static g1 f1624m;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, androidx.collection.n<ColorStateList>> f1626a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.collection.m<String, e> f1627b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.collection.n<String> f1628c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, androidx.collection.h<WeakReference<Drawable.ConstantState>>> f1629d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1630e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1631f;

    /* renamed from: g  reason: collision with root package name */
    public f f1632g;

    /* renamed from: j  reason: collision with root package name */
    public static final PorterDuff.Mode f1621j = PorterDuff.Mode.SRC_IN;

    /* renamed from: n  reason: collision with root package name */
    public static final c f1625n = new c(6);

    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // androidx.appcompat.widget.g1.e
        public Drawable a(@d.o0 Context context, @d.o0 XmlPullParser xmlPullParser, @d.o0 AttributeSet attributeSet, @d.q0 Resources.Theme theme) {
            try {
                return androidx.appcompat.graphics.drawable.a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e7) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e7);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // androidx.appcompat.widget.g1.e
        public Drawable a(@d.o0 Context context, @d.o0 XmlPullParser xmlPullParser, @d.o0 AttributeSet attributeSet, @d.q0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.c(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e7) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e7);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends androidx.collection.j<Integer, PorterDuffColorFilter> {
        public c(int i7) {
            super(i7);
        }

        public static int s(int i7, PorterDuff.Mode mode) {
            return ((i7 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter t(int i7, PorterDuff.Mode mode) {
            return f(Integer.valueOf(s(i7, mode)));
        }

        public PorterDuffColorFilter u(int i7, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return j(Integer.valueOf(s(i7, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // androidx.appcompat.widget.g1.e
        public Drawable a(@d.o0 Context context, @d.o0 XmlPullParser xmlPullParser, @d.o0 AttributeSet attributeSet, @d.q0 Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    a.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e7) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e7);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(@d.o0 Context context, @d.o0 XmlPullParser xmlPullParser, @d.o0 AttributeSet attributeSet, @d.q0 Resources.Theme theme);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface f {
        boolean a(@d.o0 Context context, @d.v int i7, @d.o0 Drawable drawable);

        @d.q0
        PorterDuff.Mode b(int i7);

        @d.q0
        Drawable c(@d.o0 g1 g1Var, @d.o0 Context context, @d.v int i7);

        @d.q0
        ColorStateList d(@d.o0 Context context, @d.v int i7);

        boolean e(@d.o0 Context context, @d.v int i7, @d.o0 Drawable drawable);
    }

    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // androidx.appcompat.widget.g1.e
        public Drawable a(@d.o0 Context context, @d.o0 XmlPullParser xmlPullParser, @d.o0 AttributeSet attributeSet, @d.q0 Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e7) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e7);
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized g1 h() {
        g1 g1Var;
        synchronized (g1.class) {
            if (f1624m == null) {
                g1 g1Var2 = new g1();
                f1624m = g1Var2;
                p(g1Var2);
            }
            g1Var = f1624m;
        }
        return g1Var;
    }

    public static synchronized PorterDuffColorFilter l(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter t6;
        synchronized (g1.class) {
            c cVar = f1625n;
            t6 = cVar.t(i7, mode);
            if (t6 == null) {
                t6 = new PorterDuffColorFilter(i7, mode);
                cVar.u(i7, mode, t6);
            }
        }
        return t6;
    }

    public static void p(@d.o0 g1 g1Var) {
    }

    public static boolean q(@d.o0 Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.i) || f1623l.equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, r1 r1Var, int[] iArr) {
        int[] state = drawable.getState();
        if (q0.a(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z6 = r1Var.f1768d;
        if (z6 || r1Var.f1767c) {
            drawable.setColorFilter(g(z6 ? r1Var.f1765a : null, r1Var.f1767c ? r1Var.f1766b : f1621j, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final void a(@d.o0 String str, @d.o0 e eVar) {
        if (this.f1627b == null) {
            this.f1627b = new androidx.collection.m<>();
        }
        this.f1627b.put(str, eVar);
    }

    public final synchronized boolean b(@d.o0 Context context, long j7, @d.o0 Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            androidx.collection.h<WeakReference<Drawable.ConstantState>> hVar = this.f1629d.get(context);
            if (hVar == null) {
                hVar = new androidx.collection.h<>();
                this.f1629d.put(context, hVar);
            }
            hVar.u(j7, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    public final void c(@d.o0 Context context, @d.v int i7, @d.o0 ColorStateList colorStateList) {
        if (this.f1626a == null) {
            this.f1626a = new WeakHashMap<>();
        }
        androidx.collection.n<ColorStateList> nVar = this.f1626a.get(context);
        if (nVar == null) {
            nVar = new androidx.collection.n<>();
            this.f1626a.put(context, nVar);
        }
        nVar.e(i7, colorStateList);
    }

    public final void d(@d.o0 Context context) {
        if (this.f1631f) {
            return;
        }
        this.f1631f = true;
        Drawable j7 = j(context, b.a.f10092a);
        if (j7 == null || !q(j7)) {
            this.f1631f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(@d.o0 Context context, @d.v int i7) {
        if (this.f1630e == null) {
            this.f1630e = new TypedValue();
        }
        TypedValue typedValue = this.f1630e;
        context.getResources().getValue(i7, typedValue, true);
        long e7 = e(typedValue);
        Drawable i8 = i(context, e7);
        if (i8 != null) {
            return i8;
        }
        f fVar = this.f1632g;
        Drawable c7 = fVar == null ? null : fVar.c(this, context, i7);
        if (c7 != null) {
            c7.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e7, c7);
        }
        return c7;
    }

    public final synchronized Drawable i(@d.o0 Context context, long j7) {
        androidx.collection.h<WeakReference<Drawable.ConstantState>> hVar = this.f1629d.get(context);
        if (hVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> o6 = hVar.o(j7);
        if (o6 != null) {
            Drawable.ConstantState constantState = o6.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            hVar.x(j7);
        }
        return null;
    }

    public synchronized Drawable j(@d.o0 Context context, @d.v int i7) {
        return k(context, i7, false);
    }

    public synchronized Drawable k(@d.o0 Context context, @d.v int i7, boolean z6) {
        Drawable r6;
        d(context);
        r6 = r(context, i7);
        if (r6 == null) {
            r6 = f(context, i7);
        }
        if (r6 == null) {
            r6 = k0.d.i(context, i7);
        }
        if (r6 != null) {
            r6 = v(context, i7, z6, r6);
        }
        if (r6 != null) {
            q0.b(r6);
        }
        return r6;
    }

    public synchronized ColorStateList m(@d.o0 Context context, @d.v int i7) {
        ColorStateList n7;
        n7 = n(context, i7);
        if (n7 == null) {
            f fVar = this.f1632g;
            n7 = fVar == null ? null : fVar.d(context, i7);
            if (n7 != null) {
                c(context, i7, n7);
            }
        }
        return n7;
    }

    public final ColorStateList n(@d.o0 Context context, @d.v int i7) {
        androidx.collection.n<ColorStateList> nVar;
        WeakHashMap<Context, androidx.collection.n<ColorStateList>> weakHashMap = this.f1626a;
        if (weakHashMap == null || (nVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return nVar.o(i7);
    }

    public PorterDuff.Mode o(int i7) {
        f fVar = this.f1632g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i7);
    }

    public final Drawable r(@d.o0 Context context, @d.v int i7) {
        int next;
        androidx.collection.m<String, e> mVar = this.f1627b;
        if (mVar == null || mVar.isEmpty()) {
            return null;
        }
        androidx.collection.n<String> nVar = this.f1628c;
        if (nVar != null) {
            String o6 = nVar.o(i7);
            if (f1622k.equals(o6) || (o6 != null && this.f1627b.get(o6) == null)) {
                return null;
            }
        } else {
            this.f1628c = new androidx.collection.n<>();
        }
        if (this.f1630e == null) {
            this.f1630e = new TypedValue();
        }
        TypedValue typedValue = this.f1630e;
        Resources resources = context.getResources();
        resources.getValue(i7, typedValue, true);
        long e7 = e(typedValue);
        Drawable i8 = i(context, e7);
        if (i8 != null) {
            return i8;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(androidx.appcompat.widget.d.f1523y)) {
            try {
                XmlResourceParser xml = resources.getXml(i7);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1628c.e(i7, name);
                e eVar = this.f1627b.get(name);
                if (eVar != null) {
                    i8 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i8 != null) {
                    i8.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e7, i8);
                }
            } catch (Exception e8) {
                Log.e(f1619h, "Exception while inflating drawable", e8);
            }
        }
        if (i8 == null) {
            this.f1628c.e(i7, f1622k);
        }
        return i8;
    }

    public synchronized void s(@d.o0 Context context) {
        androidx.collection.h<WeakReference<Drawable.ConstantState>> hVar = this.f1629d.get(context);
        if (hVar != null) {
            hVar.g();
        }
    }

    public synchronized Drawable t(@d.o0 Context context, @d.o0 d2 d2Var, @d.v int i7) {
        Drawable r6 = r(context, i7);
        if (r6 == null) {
            r6 = d2Var.a(i7);
        }
        if (r6 != null) {
            return v(context, i7, false, r6);
        }
        return null;
    }

    public synchronized void u(f fVar) {
        this.f1632g = fVar;
    }

    public final Drawable v(@d.o0 Context context, @d.v int i7, boolean z6, @d.o0 Drawable drawable) {
        ColorStateList m7 = m(context, i7);
        if (m7 == null) {
            f fVar = this.f1632g;
            if ((fVar == null || !fVar.e(context, i7, drawable)) && !x(context, i7, drawable) && z6) {
                return null;
            }
            return drawable;
        }
        if (q0.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable r6 = q0.c.r(drawable);
        q0.c.o(r6, m7);
        PorterDuff.Mode o6 = o(i7);
        if (o6 != null) {
            q0.c.p(r6, o6);
            return r6;
        }
        return r6;
    }

    public boolean x(@d.o0 Context context, @d.v int i7, @d.o0 Drawable drawable) {
        f fVar = this.f1632g;
        return fVar != null && fVar.a(context, i7, drawable);
    }
}
