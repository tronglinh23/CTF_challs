package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.q0;
import androidx.appcompat.widget.t1;
import androidx.core.view.y0;
import d.b1;
import d.j0;
import f.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final String f11327e = "SupportMenuInflater";

    /* renamed from: f  reason: collision with root package name */
    public static final String f11328f = "menu";

    /* renamed from: g  reason: collision with root package name */
    public static final String f11329g = "group";

    /* renamed from: h  reason: collision with root package name */
    public static final String f11330h = "item";

    /* renamed from: i  reason: collision with root package name */
    public static final int f11331i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final Class<?>[] f11332j;

    /* renamed from: k  reason: collision with root package name */
    public static final Class<?>[] f11333k;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f11334a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f11335b;

    /* renamed from: c  reason: collision with root package name */
    public Context f11336c;

    /* renamed from: d  reason: collision with root package name */
    public Object f11337d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f11338c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f11339a;

        /* renamed from: b  reason: collision with root package name */
        public Method f11340b;

        public a(Object obj, String str) {
            this.f11339a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f11340b = cls.getMethod(str, f11338c);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f11340b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f11340b.invoke(this.f11339a, menuItem)).booleanValue();
                }
                this.f11340b.invoke(this.f11339a, menuItem);
                return true;
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public static final int G = 0;
        public static final int H = 0;
        public static final int I = 0;
        public static final int J = 0;
        public static final int K = 0;
        public static final boolean L = false;
        public static final boolean M = true;
        public static final boolean N = true;
        public androidx.core.view.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f11341a;

        /* renamed from: b  reason: collision with root package name */
        public int f11342b;

        /* renamed from: c  reason: collision with root package name */
        public int f11343c;

        /* renamed from: d  reason: collision with root package name */
        public int f11344d;

        /* renamed from: e  reason: collision with root package name */
        public int f11345e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11346f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11347g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f11348h;

        /* renamed from: i  reason: collision with root package name */
        public int f11349i;

        /* renamed from: j  reason: collision with root package name */
        public int f11350j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f11351k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f11352l;

        /* renamed from: m  reason: collision with root package name */
        public int f11353m;

        /* renamed from: n  reason: collision with root package name */
        public char f11354n;

        /* renamed from: o  reason: collision with root package name */
        public int f11355o;

        /* renamed from: p  reason: collision with root package name */
        public char f11356p;

        /* renamed from: q  reason: collision with root package name */
        public int f11357q;

        /* renamed from: r  reason: collision with root package name */
        public int f11358r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f11359s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f11360t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f11361u;

        /* renamed from: v  reason: collision with root package name */
        public int f11362v;

        /* renamed from: w  reason: collision with root package name */
        public int f11363w;

        /* renamed from: x  reason: collision with root package name */
        public String f11364x;

        /* renamed from: y  reason: collision with root package name */
        public String f11365y;

        /* renamed from: z  reason: collision with root package name */
        public String f11366z;

        public b(Menu menu) {
            this.f11341a = menu;
            h();
        }

        public void a() {
            this.f11348h = true;
            i(this.f11341a.add(this.f11342b, this.f11349i, this.f11350j, this.f11351k));
        }

        public SubMenu b() {
            this.f11348h = true;
            SubMenu addSubMenu = this.f11341a.addSubMenu(this.f11342b, this.f11349i, this.f11350j, this.f11351k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f11348h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f11336c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e7) {
                Log.w(g.f11327e, "Cannot instantiate class: " + str, e7);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f11336c.obtainStyledAttributes(attributeSet, a.m.f9457d4);
            this.f11342b = obtainStyledAttributes.getResourceId(a.m.f9473f4, 0);
            this.f11343c = obtainStyledAttributes.getInt(a.m.f9489h4, 0);
            this.f11344d = obtainStyledAttributes.getInt(a.m.f9497i4, 0);
            this.f11345e = obtainStyledAttributes.getInt(a.m.f9505j4, 0);
            this.f11346f = obtainStyledAttributes.getBoolean(a.m.f9481g4, true);
            this.f11347g = obtainStyledAttributes.getBoolean(a.m.f9465e4, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            t1 F = t1.F(g.this.f11336c, attributeSet, a.m.f9513k4);
            this.f11349i = F.u(a.m.f9537n4, 0);
            this.f11350j = (F.o(a.m.f9559q4, this.f11343c) & u0.a.f17311c) | (F.o(a.m.f9566r4, this.f11344d) & 65535);
            this.f11351k = F.x(a.m.f9573s4);
            this.f11352l = F.x(a.m.f9580t4);
            this.f11353m = F.u(a.m.f9521l4, 0);
            this.f11354n = c(F.w(a.m.f9587u4));
            this.f11355o = F.o(a.m.B4, 4096);
            this.f11356p = c(F.w(a.m.f9594v4));
            this.f11357q = F.o(a.m.F4, 4096);
            if (F.C(a.m.f9601w4)) {
                this.f11358r = F.a(a.m.f9601w4, false) ? 1 : 0;
            } else {
                this.f11358r = this.f11345e;
            }
            this.f11359s = F.a(a.m.f9545o4, false);
            this.f11360t = F.a(a.m.f9552p4, this.f11346f);
            this.f11361u = F.a(a.m.f9529m4, this.f11347g);
            this.f11362v = F.o(a.m.G4, -1);
            this.f11366z = F.w(a.m.f9608x4);
            this.f11363w = F.u(a.m.f9615y4, 0);
            this.f11364x = F.w(a.m.A4);
            String w6 = F.w(a.m.f9622z4);
            this.f11365y = w6;
            boolean z6 = w6 != null;
            if (z6 && this.f11363w == 0 && this.f11364x == null) {
                this.A = (androidx.core.view.b) e(w6, g.f11333k, g.this.f11335b);
            } else {
                if (z6) {
                    Log.w(g.f11327e, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = F.x(a.m.C4);
            this.C = F.x(a.m.H4);
            if (F.C(a.m.E4)) {
                this.E = q0.e(F.o(a.m.E4, -1), this.E);
            } else {
                this.E = null;
            }
            if (F.C(a.m.D4)) {
                this.D = F.d(a.m.D4);
            } else {
                this.D = null;
            }
            F.I();
            this.f11348h = false;
        }

        public void h() {
            this.f11342b = 0;
            this.f11343c = 0;
            this.f11344d = 0;
            this.f11345e = 0;
            this.f11346f = true;
            this.f11347g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z6 = false;
            menuItem.setChecked(this.f11359s).setVisible(this.f11360t).setEnabled(this.f11361u).setCheckable(this.f11358r >= 1).setTitleCondensed(this.f11352l).setIcon(this.f11353m);
            int i7 = this.f11362v;
            if (i7 >= 0) {
                menuItem.setShowAsAction(i7);
            }
            if (this.f11366z != null) {
                if (g.this.f11336c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f11366z));
            }
            if (this.f11358r >= 2) {
                if (menuItem instanceof j) {
                    ((j) menuItem).w(true);
                } else if (menuItem instanceof k) {
                    ((k) menuItem).j(true);
                }
            }
            String str = this.f11364x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f11332j, g.this.f11334a));
                z6 = true;
            }
            int i8 = this.f11363w;
            if (i8 > 0) {
                if (z6) {
                    Log.w(g.f11327e, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i8);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                y0.l(menuItem, bVar);
            }
            y0.p(menuItem, this.B);
            y0.w(menuItem, this.C);
            y0.o(menuItem, this.f11354n, this.f11355o);
            y0.s(menuItem, this.f11356p, this.f11357q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                y0.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                y0.q(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f11332j = clsArr;
        f11333k = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f11336c = context;
        Object[] objArr = {context};
        this.f11334a = objArr;
        this.f11335b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f11337d == null) {
            this.f11337d = a(this.f11336c);
        }
        return this.f11337d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.b() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals(j.g.f11328f) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals(j.g.f11328f) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            j.g$b r0 = new j.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.b()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(@j0 int i7, Menu menu) {
        if (!(menu instanceof u0.a)) {
            super.inflate(i7, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f11336c.getResources().getLayout(i7);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (IOException e8) {
                throw new InflateException("Error inflating menu XML", e8);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
