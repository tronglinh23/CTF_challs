package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.core.view.u1;
import d.b1;
import d.l;
import d.o0;
import d.q0;
import d.v;
import d.w0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import m0.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.a1;
/* loaded from: classes.dex */
public class i extends androidx.vectordrawable.graphics.drawable.h {

    /* renamed from: l  reason: collision with root package name */
    public static final String f6912l = "VectorDrawableCompat";

    /* renamed from: m  reason: collision with root package name */
    public static final PorterDuff.Mode f6913m = PorterDuff.Mode.SRC_IN;

    /* renamed from: n  reason: collision with root package name */
    public static final String f6914n = "clip-path";

    /* renamed from: o  reason: collision with root package name */
    public static final String f6915o = "group";

    /* renamed from: p  reason: collision with root package name */
    public static final String f6916p = "path";

    /* renamed from: q  reason: collision with root package name */
    public static final String f6917q = "vector";

    /* renamed from: r  reason: collision with root package name */
    public static final int f6918r = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final int f6919s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final int f6920t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final int f6921u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f6922v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f6923w = 2;

    /* renamed from: x  reason: collision with root package name */
    public static final int f6924x = 2048;

    /* renamed from: y  reason: collision with root package name */
    public static final boolean f6925y = false;

    /* renamed from: c  reason: collision with root package name */
    public h f6926c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuffColorFilter f6927d;

    /* renamed from: e  reason: collision with root package name */
    public ColorFilter f6928e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6929f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6930g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable.ConstantState f6931h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f6932i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f6933j;

    /* renamed from: k  reason: collision with root package name */
    public final Rect f6934k;

    /* loaded from: classes.dex */
    public static class b extends f {
        public b() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (p.r(xmlPullParser, "pathData")) {
                TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.I);
                j(s6, xmlPullParser);
                s6.recycle();
            }
        }

        public final void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6962b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f6961a = a1.d(string2);
            }
            this.f6963c = p.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f6982a;

        /* renamed from: b  reason: collision with root package name */
        public g f6983b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f6984c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f6985d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6986e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f6987f;

        /* renamed from: g  reason: collision with root package name */
        public int[] f6988g;

        /* renamed from: h  reason: collision with root package name */
        public ColorStateList f6989h;

        /* renamed from: i  reason: collision with root package name */
        public PorterDuff.Mode f6990i;

        /* renamed from: j  reason: collision with root package name */
        public int f6991j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f6992k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f6993l;

        /* renamed from: m  reason: collision with root package name */
        public Paint f6994m;

        public h(h hVar) {
            this.f6984c = null;
            this.f6985d = i.f6913m;
            if (hVar != null) {
                this.f6982a = hVar.f6982a;
                g gVar = new g(hVar.f6983b);
                this.f6983b = gVar;
                if (hVar.f6983b.f6970e != null) {
                    gVar.f6970e = new Paint(hVar.f6983b.f6970e);
                }
                if (hVar.f6983b.f6969d != null) {
                    this.f6983b.f6969d = new Paint(hVar.f6983b.f6969d);
                }
                this.f6984c = hVar.f6984c;
                this.f6985d = hVar.f6985d;
                this.f6986e = hVar.f6986e;
            }
        }

        public boolean a(int i7, int i8) {
            return i7 == this.f6987f.getWidth() && i8 == this.f6987f.getHeight();
        }

        public boolean b() {
            return !this.f6993l && this.f6989h == this.f6984c && this.f6990i == this.f6985d && this.f6992k == this.f6986e && this.f6991j == this.f6983b.getRootAlpha();
        }

        public void c(int i7, int i8) {
            if (this.f6987f == null || !a(i7, i8)) {
                this.f6987f = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                this.f6993l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f6987f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.f6994m == null) {
                    Paint paint = new Paint();
                    this.f6994m = paint;
                    paint.setFilterBitmap(true);
                }
                this.f6994m.setAlpha(this.f6983b.getRootAlpha());
                this.f6994m.setColorFilter(colorFilter);
                return this.f6994m;
            }
            return null;
        }

        public boolean f() {
            return this.f6983b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f6983b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6982a;
        }

        public boolean h(int[] iArr) {
            boolean g7 = this.f6983b.g(iArr);
            this.f6993l |= g7;
            return g7;
        }

        public void i() {
            this.f6989h = this.f6984c;
            this.f6990i = this.f6985d;
            this.f6991j = this.f6983b.getRootAlpha();
            this.f6992k = this.f6986e;
            this.f6993l = false;
        }

        public void j(int i7, int i8) {
            this.f6987f.eraseColor(0);
            this.f6983b.b(new Canvas(this.f6987f), i7, i8, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f6984c = null;
            this.f6985d = i.f6913m;
            this.f6983b = new g();
        }
    }

    public i() {
        this.f6930g = true;
        this.f6932i = new float[9];
        this.f6933j = new Matrix();
        this.f6934k = new Rect();
        this.f6926c = new h();
    }

    public static int a(int i7, float f7) {
        return (i7 & u1.f3815s) | (((int) (Color.alpha(i7) * f7)) << 24);
    }

    @q0
    public static i b(@o0 Resources resources, @v int i7, @q0 Resources.Theme theme) {
        i iVar = new i();
        iVar.f6911b = m0.i.g(resources, i7, theme);
        iVar.f6931h = new C0072i(iVar.f6911b.getConstantState());
        return iVar;
    }

    public static i c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    public static PorterDuff.Mode h(int i7, PorterDuff.Mode mode) {
        if (i7 != 3) {
            if (i7 != 5) {
                if (i7 != 9) {
                    switch (i7) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public float d() {
        g gVar;
        h hVar = this.f6926c;
        if (hVar == null || (gVar = hVar.f6983b) == null) {
            return 1.0f;
        }
        float f7 = gVar.f6974i;
        if (f7 != 0.0f) {
            float f8 = gVar.f6975j;
            if (f8 != 0.0f) {
                float f9 = gVar.f6977l;
                if (f9 != 0.0f) {
                    float f10 = gVar.f6976k;
                    if (f10 == 0.0f) {
                        return 1.0f;
                    }
                    return Math.min(f10 / f7, f9 / f8);
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f6934k);
        if (this.f6934k.width() <= 0 || this.f6934k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f6928e;
        if (colorFilter == null) {
            colorFilter = this.f6927d;
        }
        canvas.getMatrix(this.f6933j);
        this.f6933j.getValues(this.f6932i);
        float abs = Math.abs(this.f6932i[0]);
        float abs2 = Math.abs(this.f6932i[4]);
        float abs3 = Math.abs(this.f6932i[1]);
        float abs4 = Math.abs(this.f6932i[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f6934k.width() * abs));
        int min2 = Math.min(2048, (int) (this.f6934k.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f6934k;
        canvas.translate(rect.left, rect.top);
        if (g()) {
            canvas.translate(this.f6934k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f6934k.offsetTo(0, 0);
        this.f6926c.c(min, min2);
        if (!this.f6930g) {
            this.f6926c.j(min, min2);
        } else if (!this.f6926c.b()) {
            this.f6926c.j(min, min2);
            this.f6926c.i();
        }
        this.f6926c.d(canvas, colorFilter, this.f6934k);
        canvas.restoreToCount(save);
    }

    public Object e(String str) {
        return this.f6926c.f6983b.f6981p.get(str);
    }

    public final void f(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f6926c;
        g gVar = hVar.f6983b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f6973h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z6 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6948b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f6981p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f6982a = cVar.f6964d | hVar.f6982a;
                    z6 = false;
                } else if (f6914n.equals(name)) {
                    b bVar = new b();
                    bVar.i(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6948b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f6981p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f6982a = bVar.f6964d | hVar.f6982a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6948b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f6981p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f6982a = dVar2.f6957k | hVar.f6982a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z6) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final boolean g() {
        return isAutoMirrored() && q0.c.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6911b;
        return drawable != null ? q0.c.d(drawable) : this.f6926c.f6983b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6926c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6911b;
        return drawable != null ? q0.c.e(drawable) : this.f6928e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6911b != null) {
            return new C0072i(this.f6911b.getConstantState());
        }
        this.f6926c.f6982a = getChangingConfigurations();
        return this.f6926c;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6926c.f6983b.f6975j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6926c.f6983b.f6974i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void i(d dVar, int i7) {
        String str = "";
        for (int i8 = 0; i8 < i7; i8++) {
            str = str + "    ";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("current group is :");
        sb.append(dVar.getGroupName());
        sb.append(" rotation is ");
        sb.append(dVar.f6949c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("matrix is :");
        sb2.append(dVar.getLocalMatrix().toString());
        for (int i9 = 0; i9 < dVar.f6948b.size(); i9++) {
            e eVar = dVar.f6948b.get(i9);
            if (eVar instanceof d) {
                i((d) eVar, i7 + 1);
            } else {
                ((f) eVar).g(i7 + 1);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6911b;
        return drawable != null ? q0.c.h(drawable) : this.f6926c.f6986e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f6926c) != null && (hVar.g() || ((colorStateList = this.f6926c.f6984c) != null && colorStateList.isStateful())));
    }

    public void j(boolean z6) {
        this.f6930g = z6;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final void k(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f6926c;
        g gVar = hVar.f6983b;
        hVar.f6985d = h(p.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g7 = p.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g7 != null) {
            hVar.f6984c = g7;
        }
        hVar.f6986e = p.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f6986e);
        gVar.f6976k = p.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f6976k);
        float j7 = p.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f6977l);
        gVar.f6977l = j7;
        if (gVar.f6976k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j7 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            gVar.f6974i = typedArray.getDimension(3, gVar.f6974i);
            float dimension = typedArray.getDimension(2, gVar.f6975j);
            gVar.f6975j = dimension;
            if (gVar.f6974i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                gVar.setAlpha(p.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f6979n = string;
                    gVar.f6981p.put(string, gVar);
                }
            }
        }
    }

    public PorterDuffColorFilter l(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6929f && super.mutate() == this) {
            this.f6926c = new h(this.f6926c);
            this.f6929f = true;
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z6;
        PorterDuff.Mode mode;
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f6926c;
        ColorStateList colorStateList = hVar.f6984c;
        if (colorStateList == null || (mode = hVar.f6985d) == null) {
            z6 = false;
        } else {
            this.f6927d = l(this.f6927d, colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f6926c.f6983b.getRootAlpha() != i7) {
            this.f6926c.f6983b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.j(drawable, z6);
        } else {
            this.f6926c.f6986e = z6;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z6) {
        super.setFilterBitmap(z6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTint(int i7) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.n(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f6926c;
        if (hVar.f6984c != colorStateList) {
            hVar.f6984c = colorStateList;
            this.f6927d = l(this.f6927d, colorStateList, hVar.f6985d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.p(drawable, mode);
            return;
        }
        h hVar = this.f6926c;
        if (hVar.f6985d != mode) {
            hVar.f6985d = mode;
            this.f6927d = l(this.f6927d, hVar.f6984c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.setVisible(z6, z7) : super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @w0(24)
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0072i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f6995a;

        public C0072i(Drawable.ConstantState constantState) {
            this.f6995a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6995a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6995a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f6911b = (VectorDrawable) this.f6995a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f6911b = (VectorDrawable) this.f6995a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f6911b = (VectorDrawable) this.f6995a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f6928e = colorFilter;
        invalidateSelf();
    }

    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: e  reason: collision with root package name */
        public static final int f6960e = 0;

        /* renamed from: a  reason: collision with root package name */
        public a1.b[] f6961a;

        /* renamed from: b  reason: collision with root package name */
        public String f6962b;

        /* renamed from: c  reason: collision with root package name */
        public int f6963c;

        /* renamed from: d  reason: collision with root package name */
        public int f6964d;

        public f() {
            super();
            this.f6961a = null;
            this.f6963c = 0;
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(a1.b[] bVarArr) {
            String str = " ";
            for (int i7 = 0; i7 < bVarArr.length; i7++) {
                str = str + bVarArr[i7].f14483a + ":";
                for (float f7 : bVarArr[i7].f14484b) {
                    str = str + f7 + ",";
                }
            }
            return str;
        }

        public void g(int i7) {
            String str = "";
            for (int i8 = 0; i8 < i7; i8++) {
                str = str + "    ";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("current path is :");
            sb.append(this.f6962b);
            sb.append(" pathData is ");
            sb.append(f(this.f6961a));
        }

        public a1.b[] getPathData() {
            return this.f6961a;
        }

        public String getPathName() {
            return this.f6962b;
        }

        public void h(Path path) {
            path.reset();
            a1.b[] bVarArr = this.f6961a;
            if (bVarArr != null) {
                a1.b.e(bVarArr, path);
            }
        }

        public void setPathData(a1.b[] bVarArr) {
            if (a1.b(this.f6961a, bVarArr)) {
                a1.k(this.f6961a, bVarArr);
            } else {
                this.f6961a = a1.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f6961a = null;
            this.f6963c = 0;
            this.f6962b = fVar.f6962b;
            this.f6964d = fVar.f6964d;
            this.f6961a = a1.f(fVar.f6961a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f6926c;
        hVar.f6983b = new g();
        TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6823a);
        k(s6, xmlPullParser, theme);
        s6.recycle();
        hVar.f6982a = getChangingConfigurations();
        hVar.f6993l = true;
        f(resources, xmlPullParser, attributeSet, theme);
        this.f6927d = l(this.f6927d, hVar.f6984c, hVar.f6985d);
    }

    public i(@o0 h hVar) {
        this.f6930g = true;
        this.f6932i = new float[9];
        this.f6933j = new Matrix();
        this.f6934k = new Rect();
        this.f6926c = hVar;
        this.f6927d = l(this.f6927d, hVar.f6984c, hVar.f6985d);
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: f  reason: collision with root package name */
        public int[] f6935f;

        /* renamed from: g  reason: collision with root package name */
        public m0.d f6936g;

        /* renamed from: h  reason: collision with root package name */
        public float f6937h;

        /* renamed from: i  reason: collision with root package name */
        public m0.d f6938i;

        /* renamed from: j  reason: collision with root package name */
        public float f6939j;

        /* renamed from: k  reason: collision with root package name */
        public float f6940k;

        /* renamed from: l  reason: collision with root package name */
        public float f6941l;

        /* renamed from: m  reason: collision with root package name */
        public float f6942m;

        /* renamed from: n  reason: collision with root package name */
        public float f6943n;

        /* renamed from: o  reason: collision with root package name */
        public Paint.Cap f6944o;

        /* renamed from: p  reason: collision with root package name */
        public Paint.Join f6945p;

        /* renamed from: q  reason: collision with root package name */
        public float f6946q;

        public c() {
            this.f6937h = 0.0f;
            this.f6939j = 1.0f;
            this.f6940k = 1.0f;
            this.f6941l = 0.0f;
            this.f6942m = 1.0f;
            this.f6943n = 0.0f;
            this.f6944o = Paint.Cap.BUTT;
            this.f6945p = Paint.Join.MITER;
            this.f6946q = 4.0f;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            return this.f6938i.i() || this.f6936g.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            return this.f6936g.j(iArr) | this.f6938i.j(iArr);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public void c(Resources.Theme theme) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean d() {
            return this.f6935f != null;
        }

        public float getFillAlpha() {
            return this.f6940k;
        }

        @l
        public int getFillColor() {
            return this.f6938i.e();
        }

        public float getStrokeAlpha() {
            return this.f6939j;
        }

        @l
        public int getStrokeColor() {
            return this.f6936g.e();
        }

        public float getStrokeWidth() {
            return this.f6937h;
        }

        public float getTrimPathEnd() {
            return this.f6942m;
        }

        public float getTrimPathOffset() {
            return this.f6943n;
        }

        public float getTrimPathStart() {
            return this.f6941l;
        }

        public final Paint.Cap i(int i7, Paint.Cap cap) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join j(int i7, Paint.Join join) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6861t);
            l(s6, xmlPullParser, theme);
            s6.recycle();
        }

        public final void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f6935f = null;
            if (p.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f6962b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f6961a = a1.d(string2);
                }
                this.f6938i = p.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f6940k = p.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f6940k);
                this.f6944o = i(p.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f6944o);
                this.f6945p = j(p.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f6945p);
                this.f6946q = p.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f6946q);
                this.f6936g = p.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f6939j = p.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f6939j);
                this.f6937h = p.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f6937h);
                this.f6942m = p.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f6942m);
                this.f6943n = p.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f6943n);
                this.f6941l = p.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f6941l);
                this.f6963c = p.k(typedArray, xmlPullParser, "fillType", 13, this.f6963c);
            }
        }

        public void setFillAlpha(float f7) {
            this.f6940k = f7;
        }

        public void setFillColor(int i7) {
            this.f6938i.k(i7);
        }

        public void setStrokeAlpha(float f7) {
            this.f6939j = f7;
        }

        public void setStrokeColor(int i7) {
            this.f6936g.k(i7);
        }

        public void setStrokeWidth(float f7) {
            this.f6937h = f7;
        }

        public void setTrimPathEnd(float f7) {
            this.f6942m = f7;
        }

        public void setTrimPathOffset(float f7) {
            this.f6943n = f7;
        }

        public void setTrimPathStart(float f7) {
            this.f6941l = f7;
        }

        public c(c cVar) {
            super(cVar);
            this.f6937h = 0.0f;
            this.f6939j = 1.0f;
            this.f6940k = 1.0f;
            this.f6941l = 0.0f;
            this.f6942m = 1.0f;
            this.f6943n = 0.0f;
            this.f6944o = Paint.Cap.BUTT;
            this.f6945p = Paint.Join.MITER;
            this.f6946q = 4.0f;
            this.f6935f = cVar.f6935f;
            this.f6936g = cVar.f6936g;
            this.f6937h = cVar.f6937h;
            this.f6939j = cVar.f6939j;
            this.f6938i = cVar.f6938i;
            this.f6963c = cVar.f6963c;
            this.f6940k = cVar.f6940k;
            this.f6941l = cVar.f6941l;
            this.f6942m = cVar.f6942m;
            this.f6943n = cVar.f6943n;
            this.f6944o = cVar.f6944o;
            this.f6945p = cVar.f6945p;
            this.f6946q = cVar.f6946q;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q  reason: collision with root package name */
        public static final Matrix f6965q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f6966a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f6967b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f6968c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f6969d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f6970e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f6971f;

        /* renamed from: g  reason: collision with root package name */
        public int f6972g;

        /* renamed from: h  reason: collision with root package name */
        public final d f6973h;

        /* renamed from: i  reason: collision with root package name */
        public float f6974i;

        /* renamed from: j  reason: collision with root package name */
        public float f6975j;

        /* renamed from: k  reason: collision with root package name */
        public float f6976k;

        /* renamed from: l  reason: collision with root package name */
        public float f6977l;

        /* renamed from: m  reason: collision with root package name */
        public int f6978m;

        /* renamed from: n  reason: collision with root package name */
        public String f6979n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f6980o;

        /* renamed from: p  reason: collision with root package name */
        public final androidx.collection.a<String, Object> f6981p;

        public g() {
            this.f6968c = new Matrix();
            this.f6974i = 0.0f;
            this.f6975j = 0.0f;
            this.f6976k = 0.0f;
            this.f6977l = 0.0f;
            this.f6978m = 255;
            this.f6979n = null;
            this.f6980o = null;
            this.f6981p = new androidx.collection.a<>();
            this.f6973h = new d();
            this.f6966a = new Path();
            this.f6967b = new Path();
        }

        public static float a(float f7, float f8, float f9, float f10) {
            return (f7 * f10) - (f8 * f9);
        }

        public void b(Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            c(this.f6973h, f6965q, canvas, i7, i8, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            dVar.f6947a.set(matrix);
            dVar.f6947a.preConcat(dVar.f6956j);
            canvas.save();
            for (int i9 = 0; i9 < dVar.f6948b.size(); i9++) {
                e eVar = dVar.f6948b.get(i9);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f6947a, canvas, i7, i8, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i7, i8, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            float f7 = i7 / this.f6976k;
            float f8 = i8 / this.f6977l;
            float min = Math.min(f7, f8);
            Matrix matrix = dVar.f6947a;
            this.f6968c.set(matrix);
            this.f6968c.postScale(f7, f8);
            float e7 = e(matrix);
            if (e7 == 0.0f) {
                return;
            }
            fVar.h(this.f6966a);
            Path path = this.f6966a;
            this.f6967b.reset();
            if (fVar.e()) {
                this.f6967b.setFillType(fVar.f6963c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f6967b.addPath(path, this.f6968c);
                canvas.clipPath(this.f6967b);
                return;
            }
            c cVar = (c) fVar;
            float f9 = cVar.f6941l;
            if (f9 != 0.0f || cVar.f6942m != 1.0f) {
                float f10 = cVar.f6943n;
                float f11 = (f9 + f10) % 1.0f;
                float f12 = (cVar.f6942m + f10) % 1.0f;
                if (this.f6971f == null) {
                    this.f6971f = new PathMeasure();
                }
                this.f6971f.setPath(this.f6966a, false);
                float length = this.f6971f.getLength();
                float f13 = f11 * length;
                float f14 = f12 * length;
                path.reset();
                if (f13 > f14) {
                    this.f6971f.getSegment(f13, length, path, true);
                    this.f6971f.getSegment(0.0f, f14, path, true);
                } else {
                    this.f6971f.getSegment(f13, f14, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f6967b.addPath(path, this.f6968c);
            if (cVar.f6938i.l()) {
                m0.d dVar2 = cVar.f6938i;
                if (this.f6970e == null) {
                    Paint paint = new Paint(1);
                    this.f6970e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f6970e;
                if (dVar2.h()) {
                    Shader f15 = dVar2.f();
                    f15.setLocalMatrix(this.f6968c);
                    paint2.setShader(f15);
                    paint2.setAlpha(Math.round(cVar.f6940k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(dVar2.e(), cVar.f6940k));
                }
                paint2.setColorFilter(colorFilter);
                this.f6967b.setFillType(cVar.f6963c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f6967b, paint2);
            }
            if (cVar.f6936g.l()) {
                m0.d dVar3 = cVar.f6936g;
                if (this.f6969d == null) {
                    Paint paint3 = new Paint(1);
                    this.f6969d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f6969d;
                Paint.Join join = cVar.f6945p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f6944o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f6946q);
                if (dVar3.h()) {
                    Shader f16 = dVar3.f();
                    f16.setLocalMatrix(this.f6968c);
                    paint4.setShader(f16);
                    paint4.setAlpha(Math.round(cVar.f6939j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(dVar3.e(), cVar.f6939j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f6937h * min * e7);
                canvas.drawPath(this.f6967b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a7 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a7) / max;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f6980o == null) {
                this.f6980o = Boolean.valueOf(this.f6973h.a());
            }
            return this.f6980o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f6973h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f6978m;
        }

        public void setAlpha(float f7) {
            setRootAlpha((int) (f7 * 255.0f));
        }

        public void setRootAlpha(int i7) {
            this.f6978m = i7;
        }

        public g(g gVar) {
            this.f6968c = new Matrix();
            this.f6974i = 0.0f;
            this.f6975j = 0.0f;
            this.f6976k = 0.0f;
            this.f6977l = 0.0f;
            this.f6978m = 255;
            this.f6979n = null;
            this.f6980o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f6981p = aVar;
            this.f6973h = new d(gVar.f6973h, aVar);
            this.f6966a = new Path(gVar.f6966a);
            this.f6967b = new Path(gVar.f6967b);
            this.f6974i = gVar.f6974i;
            this.f6975j = gVar.f6975j;
            this.f6976k = gVar.f6976k;
            this.f6977l = gVar.f6977l;
            this.f6972g = gVar.f6972g;
            this.f6978m = gVar.f6978m;
            this.f6979n = gVar.f6979n;
            String str = gVar.f6979n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f6980o = gVar.f6980o;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f6947a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f6948b;

        /* renamed from: c  reason: collision with root package name */
        public float f6949c;

        /* renamed from: d  reason: collision with root package name */
        public float f6950d;

        /* renamed from: e  reason: collision with root package name */
        public float f6951e;

        /* renamed from: f  reason: collision with root package name */
        public float f6952f;

        /* renamed from: g  reason: collision with root package name */
        public float f6953g;

        /* renamed from: h  reason: collision with root package name */
        public float f6954h;

        /* renamed from: i  reason: collision with root package name */
        public float f6955i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f6956j;

        /* renamed from: k  reason: collision with root package name */
        public int f6957k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f6958l;

        /* renamed from: m  reason: collision with root package name */
        public String f6959m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f bVar;
            this.f6947a = new Matrix();
            this.f6948b = new ArrayList<>();
            this.f6949c = 0.0f;
            this.f6950d = 0.0f;
            this.f6951e = 0.0f;
            this.f6952f = 1.0f;
            this.f6953g = 1.0f;
            this.f6954h = 0.0f;
            this.f6955i = 0.0f;
            Matrix matrix = new Matrix();
            this.f6956j = matrix;
            this.f6959m = null;
            this.f6949c = dVar.f6949c;
            this.f6950d = dVar.f6950d;
            this.f6951e = dVar.f6951e;
            this.f6952f = dVar.f6952f;
            this.f6953g = dVar.f6953g;
            this.f6954h = dVar.f6954h;
            this.f6955i = dVar.f6955i;
            this.f6958l = dVar.f6958l;
            String str = dVar.f6959m;
            this.f6959m = str;
            this.f6957k = dVar.f6957k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f6956j);
            ArrayList<e> arrayList = dVar.f6948b;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                e eVar = arrayList.get(i7);
                if (eVar instanceof d) {
                    this.f6948b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f6948b.add(bVar);
                    String str2 = bVar.f6962b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            for (int i7 = 0; i7 < this.f6948b.size(); i7++) {
                if (this.f6948b.get(i7).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            boolean z6 = false;
            for (int i7 = 0; i7 < this.f6948b.size(); i7++) {
                z6 |= this.f6948b.get(i7).b(iArr);
            }
            return z6;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6843k);
            e(s6, xmlPullParser);
            s6.recycle();
        }

        public final void d() {
            this.f6956j.reset();
            this.f6956j.postTranslate(-this.f6950d, -this.f6951e);
            this.f6956j.postScale(this.f6952f, this.f6953g);
            this.f6956j.postRotate(this.f6949c, 0.0f, 0.0f);
            this.f6956j.postTranslate(this.f6954h + this.f6950d, this.f6955i + this.f6951e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f6958l = null;
            this.f6949c = p.j(typedArray, xmlPullParser, c0.f.f7363i, 5, this.f6949c);
            this.f6950d = typedArray.getFloat(1, this.f6950d);
            this.f6951e = typedArray.getFloat(2, this.f6951e);
            this.f6952f = p.j(typedArray, xmlPullParser, "scaleX", 3, this.f6952f);
            this.f6953g = p.j(typedArray, xmlPullParser, "scaleY", 4, this.f6953g);
            this.f6954h = p.j(typedArray, xmlPullParser, "translateX", 6, this.f6954h);
            this.f6955i = p.j(typedArray, xmlPullParser, "translateY", 7, this.f6955i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6959m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f6959m;
        }

        public Matrix getLocalMatrix() {
            return this.f6956j;
        }

        public float getPivotX() {
            return this.f6950d;
        }

        public float getPivotY() {
            return this.f6951e;
        }

        public float getRotation() {
            return this.f6949c;
        }

        public float getScaleX() {
            return this.f6952f;
        }

        public float getScaleY() {
            return this.f6953g;
        }

        public float getTranslateX() {
            return this.f6954h;
        }

        public float getTranslateY() {
            return this.f6955i;
        }

        public void setPivotX(float f7) {
            if (f7 != this.f6950d) {
                this.f6950d = f7;
                d();
            }
        }

        public void setPivotY(float f7) {
            if (f7 != this.f6951e) {
                this.f6951e = f7;
                d();
            }
        }

        public void setRotation(float f7) {
            if (f7 != this.f6949c) {
                this.f6949c = f7;
                d();
            }
        }

        public void setScaleX(float f7) {
            if (f7 != this.f6952f) {
                this.f6952f = f7;
                d();
            }
        }

        public void setScaleY(float f7) {
            if (f7 != this.f6953g) {
                this.f6953g = f7;
                d();
            }
        }

        public void setTranslateX(float f7) {
            if (f7 != this.f6954h) {
                this.f6954h = f7;
                d();
            }
        }

        public void setTranslateY(float f7) {
            if (f7 != this.f6955i) {
                this.f6955i = f7;
                d();
            }
        }

        public d() {
            super();
            this.f6947a = new Matrix();
            this.f6948b = new ArrayList<>();
            this.f6949c = 0.0f;
            this.f6950d = 0.0f;
            this.f6951e = 0.0f;
            this.f6952f = 1.0f;
            this.f6953g = 1.0f;
            this.f6954h = 0.0f;
            this.f6955i = 0.0f;
            this.f6956j = new Matrix();
            this.f6959m = null;
        }
    }
}
