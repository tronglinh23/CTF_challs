package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import d.l;
import d.o0;
import d.q0;
import d.w0;
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f959n = false;

    /* renamed from: o  reason: collision with root package name */
    public static final String f960o = "DrawableContainerCompat";

    /* renamed from: p  reason: collision with root package name */
    public static final boolean f961p = true;

    /* renamed from: b  reason: collision with root package name */
    public d f962b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f963c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f964d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f965e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f967g;

    /* renamed from: i  reason: collision with root package name */
    public boolean f969i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f970j;

    /* renamed from: k  reason: collision with root package name */
    public long f971k;

    /* renamed from: l  reason: collision with root package name */
    public long f972l;

    /* renamed from: m  reason: collision with root package name */
    public c f973m;

    /* renamed from: f  reason: collision with root package name */
    public int f966f = 255;

    /* renamed from: h  reason: collision with root package name */
    public int f968h = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    @w0(21)
    /* renamed from: androidx.appcompat.graphics.drawable.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0023b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: b  reason: collision with root package name */
        public Drawable.Callback f975b;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f975b;
            this.f975b = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f975b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@o0 Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j7) {
            Drawable.Callback callback = this.f975b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j7);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
            Drawable.Callback callback = this.f975b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final b f976a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f977b;

        /* renamed from: c  reason: collision with root package name */
        public int f978c;

        /* renamed from: d  reason: collision with root package name */
        public int f979d;

        /* renamed from: e  reason: collision with root package name */
        public int f980e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f981f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f982g;

        /* renamed from: h  reason: collision with root package name */
        public int f983h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f984i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f985j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f986k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f987l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f988m;

        /* renamed from: n  reason: collision with root package name */
        public int f989n;

        /* renamed from: o  reason: collision with root package name */
        public int f990o;

        /* renamed from: p  reason: collision with root package name */
        public int f991p;

        /* renamed from: q  reason: collision with root package name */
        public int f992q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f993r;

        /* renamed from: s  reason: collision with root package name */
        public int f994s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f995t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f996u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f997v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f998w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f999x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f1000y;

        /* renamed from: z  reason: collision with root package name */
        public int f1001z;

        public d(d dVar, b bVar, Resources resources) {
            this.f984i = false;
            this.f987l = false;
            this.f999x = true;
            this.A = 0;
            this.B = 0;
            this.f976a = bVar;
            this.f977b = resources != null ? resources : dVar != null ? dVar.f977b : null;
            int g7 = b.g(resources, dVar != null ? dVar.f978c : 0);
            this.f978c = g7;
            if (dVar == null) {
                this.f982g = new Drawable[10];
                this.f983h = 0;
                return;
            }
            this.f979d = dVar.f979d;
            this.f980e = dVar.f980e;
            this.f997v = true;
            this.f998w = true;
            this.f984i = dVar.f984i;
            this.f987l = dVar.f987l;
            this.f999x = dVar.f999x;
            this.f1000y = dVar.f1000y;
            this.f1001z = dVar.f1001z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f978c == g7) {
                if (dVar.f985j) {
                    this.f986k = dVar.f986k != null ? new Rect(dVar.f986k) : null;
                    this.f985j = true;
                }
                if (dVar.f988m) {
                    this.f989n = dVar.f989n;
                    this.f990o = dVar.f990o;
                    this.f991p = dVar.f991p;
                    this.f992q = dVar.f992q;
                    this.f988m = true;
                }
            }
            if (dVar.f993r) {
                this.f994s = dVar.f994s;
                this.f993r = true;
            }
            if (dVar.f995t) {
                this.f996u = dVar.f996u;
                this.f995t = true;
            }
            Drawable[] drawableArr = dVar.f982g;
            this.f982g = new Drawable[drawableArr.length];
            this.f983h = dVar.f983h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f981f;
            if (sparseArray != null) {
                this.f981f = sparseArray.clone();
            } else {
                this.f981f = new SparseArray<>(this.f983h);
            }
            int i7 = this.f983h;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f981f.put(i8, constantState);
                    } else {
                        this.f982g[i8] = drawableArr[i8];
                    }
                }
            }
        }

        public final boolean A(int i7, int i8) {
            int i9 = this.f983h;
            Drawable[] drawableArr = this.f982g;
            boolean z6 = false;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    boolean m7 = q0.c.m(drawable, i7);
                    if (i10 == i8) {
                        z6 = m7;
                    }
                }
            }
            this.f1001z = i7;
            return z6;
        }

        public final void B(boolean z6) {
            this.f984i = z6;
        }

        public final void C(Resources resources) {
            if (resources != null) {
                this.f977b = resources;
                int g7 = b.g(resources, this.f978c);
                int i7 = this.f978c;
                this.f978c = g7;
                if (i7 != g7) {
                    this.f988m = false;
                    this.f985j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i7 = this.f983h;
            if (i7 >= this.f982g.length) {
                r(i7, i7 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f976a);
            this.f982g[i7] = drawable;
            this.f983h++;
            this.f980e = drawable.getChangingConfigurations() | this.f980e;
            s();
            this.f986k = null;
            this.f985j = false;
            this.f988m = false;
            this.f997v = false;
            return i7;
        }

        @w0(21)
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i7 = this.f983h;
                Drawable[] drawableArr = this.f982g;
                for (int i8 = 0; i8 < i7; i8++) {
                    Drawable drawable = drawableArr[i8];
                    if (drawable != null && q0.c.b(drawable)) {
                        q0.c.a(drawableArr[i8], theme);
                        this.f980e |= drawableArr[i8].getChangingConfigurations();
                    }
                }
                C(C0023b.c(theme));
            }
        }

        public boolean c() {
            if (this.f997v) {
                return this.f998w;
            }
            f();
            this.f997v = true;
            int i7 = this.f983h;
            Drawable[] drawableArr = this.f982g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (drawableArr[i8].getConstantState() == null) {
                    this.f998w = false;
                    return false;
                }
            }
            this.f998w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @w0(21)
        public boolean canApplyTheme() {
            int i7 = this.f983h;
            Drawable[] drawableArr = this.f982g;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f981f.get(i8);
                    if (constantState != null && C0023b.a(constantState)) {
                        return true;
                    }
                } else if (q0.c.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            this.f1000y = false;
        }

        public void e() {
            this.f988m = true;
            f();
            int i7 = this.f983h;
            Drawable[] drawableArr = this.f982g;
            this.f990o = -1;
            this.f989n = -1;
            this.f992q = 0;
            this.f991p = 0;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f989n) {
                    this.f989n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f990o) {
                    this.f990o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f991p) {
                    this.f991p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f992q) {
                    this.f992q = minimumHeight;
                }
            }
        }

        public final void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f981f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    this.f982g[this.f981f.keyAt(i7)] = w(this.f981f.valueAt(i7).newDrawable(this.f977b));
                }
                this.f981f = null;
            }
        }

        public final int g() {
            return this.f982g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f979d | this.f980e;
        }

        public final Drawable h(int i7) {
            int indexOfKey;
            Drawable drawable = this.f982g[i7];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f981f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
                return null;
            }
            Drawable w6 = w(this.f981f.valueAt(indexOfKey).newDrawable(this.f977b));
            this.f982g[i7] = w6;
            this.f981f.removeAt(indexOfKey);
            if (this.f981f.size() == 0) {
                this.f981f = null;
            }
            return w6;
        }

        public final int i() {
            return this.f983h;
        }

        public final int j() {
            if (!this.f988m) {
                e();
            }
            return this.f990o;
        }

        public final int k() {
            if (!this.f988m) {
                e();
            }
            return this.f992q;
        }

        public final int l() {
            if (!this.f988m) {
                e();
            }
            return this.f991p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f984i) {
                return null;
            }
            Rect rect2 = this.f986k;
            if (rect2 != null || this.f985j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i7 = this.f983h;
            Drawable[] drawableArr = this.f982g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (drawableArr[i8].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i9 = rect3.left;
                    if (i9 > rect.left) {
                        rect.left = i9;
                    }
                    int i10 = rect3.top;
                    if (i10 > rect.top) {
                        rect.top = i10;
                    }
                    int i11 = rect3.right;
                    if (i11 > rect.right) {
                        rect.right = i11;
                    }
                    int i12 = rect3.bottom;
                    if (i12 > rect.bottom) {
                        rect.bottom = i12;
                    }
                }
            }
            this.f985j = true;
            this.f986k = rect;
            return rect;
        }

        public final int n() {
            if (!this.f988m) {
                e();
            }
            return this.f989n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if (this.f993r) {
                return this.f994s;
            }
            f();
            int i7 = this.f983h;
            Drawable[] drawableArr = this.f982g;
            int opacity = i7 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i8 = 1; i8 < i7; i8++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i8].getOpacity());
            }
            this.f994s = opacity;
            this.f993r = true;
            return opacity;
        }

        public void r(int i7, int i8) {
            Drawable[] drawableArr = new Drawable[i8];
            Drawable[] drawableArr2 = this.f982g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f982g = drawableArr;
        }

        public void s() {
            this.f993r = false;
            this.f995t = false;
        }

        public final boolean t() {
            return this.f987l;
        }

        public final boolean u() {
            if (this.f995t) {
                return this.f996u;
            }
            f();
            int i7 = this.f983h;
            Drawable[] drawableArr = this.f982g;
            boolean z6 = false;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    break;
                } else if (drawableArr[i8].isStateful()) {
                    z6 = true;
                    break;
                } else {
                    i8++;
                }
            }
            this.f996u = z6;
            this.f995t = true;
            return z6;
        }

        public void v() {
            int i7 = this.f983h;
            Drawable[] drawableArr = this.f982g;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f1000y = true;
        }

        public final Drawable w(Drawable drawable) {
            q0.c.m(drawable, this.f1001z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f976a);
            return mutate;
        }

        public final void x(boolean z6) {
            this.f987l = z6;
        }

        public final void y(int i7) {
            this.A = i7;
        }

        public final void z(int i7) {
            this.B = i7;
        }
    }

    public static int g(@q0 Resources resources, int i7) {
        if (resources != null) {
            i7 = resources.getDisplayMetrics().densityDpi;
        }
        if (i7 == 0) {
            return 160;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f967g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f964d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f971k
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f966f
            r3.setAlpha(r9)
            r13.f971k = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.b$d r10 = r13.f962b
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f966f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f971k = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f965e
            if (r9 == 0) goto L61
            long r10 = r13.f972l
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f965e = r0
            r13.f972l = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.b$d r4 = r13.f962b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f966f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f972l = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f970j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    @w0(21)
    public void applyTheme(@o0 Resources.Theme theme) {
        this.f962b.b(theme);
    }

    public void b() {
        this.f962b.d();
        this.f969i = false;
    }

    public d c() {
        return this.f962b;
    }

    @Override // android.graphics.drawable.Drawable
    @w0(21)
    public boolean canApplyTheme() {
        return this.f962b.canApplyTheme();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f968h;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        Drawable drawable = this.f964d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f965e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e(Drawable drawable) {
        if (this.f973m == null) {
            this.f973m = new c();
        }
        drawable.setCallback(this.f973m.b(drawable.getCallback()));
        try {
            if (this.f962b.A <= 0 && this.f967g) {
                drawable.setAlpha(this.f966f);
            }
            d dVar = this.f962b;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    q0.c.o(drawable, dVar.F);
                }
                d dVar2 = this.f962b;
                if (dVar2.I) {
                    q0.c.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f962b.f999x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            q0.c.m(drawable, q0.c.f(this));
            q0.c.j(drawable, this.f962b.C);
            Rect rect = this.f963c;
            if (rect != null) {
                q0.c.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f973m.a());
        }
    }

    public final boolean f() {
        return isAutoMirrored() && q0.c.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f966f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f962b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f962b.c()) {
            this.f962b.f979d = getChangingConfigurations();
            return this.f962b;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable getCurrent() {
        return this.f964d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@o0 Rect rect) {
        Rect rect2 = this.f963c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f962b.t()) {
            return this.f962b.j();
        }
        Drawable drawable = this.f964d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f962b.t()) {
            return this.f962b.n();
        }
        Drawable drawable = this.f964d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f962b.t()) {
            return this.f962b.k();
        }
        Drawable drawable = this.f964d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f962b.t()) {
            return this.f962b.l();
        }
        Drawable drawable = this.f964d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f964d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f962b.q();
    }

    @Override // android.graphics.drawable.Drawable
    @w0(21)
    public void getOutline(@o0 Outline outline) {
        Drawable drawable = this.f964d;
        if (drawable != null) {
            C0023b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        boolean padding;
        Rect m7 = this.f962b.m();
        if (m7 != null) {
            rect.set(m7);
            padding = (m7.right | ((m7.left | m7.top) | m7.bottom)) != 0;
        } else {
            Drawable drawable = this.f964d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f968h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f962b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f965e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f964d
            if (r0 == 0) goto L29
            r9.f965e = r0
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f962b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f972l = r0
            goto L35
        L29:
            r9.f965e = r4
            r9.f972l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f964d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f962b
            int r1 = r0.f983h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.h(r10)
            r9.f964d = r0
            r9.f968h = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.b$d r10 = r9.f962b
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f971k = r2
        L51:
            r9.e(r0)
            goto L5a
        L55:
            r9.f964d = r4
            r10 = -1
            r9.f968h = r10
        L5a:
            long r0 = r9.f971k
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f972l
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f970j
            if (r10 != 0) goto L73
            androidx.appcompat.graphics.drawable.b$a r10 = new androidx.appcompat.graphics.drawable.b$a
            r10.<init>()
            r9.f970j = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.h(int):boolean");
    }

    public void i(d dVar) {
        this.f962b = dVar;
        int i7 = this.f968h;
        if (i7 >= 0) {
            Drawable h7 = dVar.h(i7);
            this.f964d = h7;
            if (h7 != null) {
                e(h7);
            }
        }
        this.f965e = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@o0 Drawable drawable) {
        d dVar = this.f962b;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable != this.f964d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f962b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f962b.u();
    }

    public void j(int i7) {
        h(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z6;
        Drawable drawable = this.f965e;
        boolean z7 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f965e = null;
            z6 = true;
        } else {
            z6 = false;
        }
        Drawable drawable2 = this.f964d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f967g) {
                this.f964d.setAlpha(this.f966f);
            }
        }
        if (this.f972l != 0) {
            this.f972l = 0L;
            z6 = true;
        }
        if (this.f971k != 0) {
            this.f971k = 0L;
        } else {
            z7 = z6;
        }
        if (z7) {
            invalidateSelf();
        }
    }

    public void k(int i7) {
        this.f962b.A = i7;
    }

    public void l(int i7) {
        this.f962b.B = i7;
    }

    public final void m(Resources resources) {
        this.f962b.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f969i && super.mutate() == this) {
            d c7 = c();
            c7.v();
            i(c7);
            this.f969i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f965e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f964d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i7) {
        return this.f962b.A(i7, d());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        Drawable drawable = this.f965e;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f964d;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@o0 int[] iArr) {
        Drawable drawable = this.f965e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f964d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j7) {
        if (drawable != this.f964d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (this.f967g && this.f966f == i7) {
            return;
        }
        this.f967g = true;
        this.f966f = i7;
        Drawable drawable = this.f964d;
        if (drawable != null) {
            if (this.f971k == 0) {
                drawable.setAlpha(i7);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        d dVar = this.f962b;
        if (dVar.C != z6) {
            dVar.C = z6;
            Drawable drawable = this.f964d;
            if (drawable != null) {
                q0.c.j(drawable, z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f962b;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f964d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        d dVar = this.f962b;
        if (dVar.f999x != z6) {
            dVar.f999x = z6;
            Drawable drawable = this.f964d;
            if (drawable != null) {
                drawable.setDither(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f8) {
        Drawable drawable = this.f964d;
        if (drawable != null) {
            q0.c.k(drawable, f7, f8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Rect rect = this.f963c;
        if (rect == null) {
            this.f963c = new Rect(i7, i8, i9, i10);
        } else {
            rect.set(i7, i8, i9, i10);
        }
        Drawable drawable = this.f964d;
        if (drawable != null) {
            q0.c.l(drawable, i7, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@l int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f962b;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            q0.c.o(this.f964d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        d dVar = this.f962b;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            q0.c.p(this.f964d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        Drawable drawable = this.f965e;
        if (drawable != null) {
            drawable.setVisible(z6, z7);
        }
        Drawable drawable2 = this.f964d;
        if (drawable2 != null) {
            drawable2.setVisible(z6, z7);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
        if (drawable != this.f964d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
