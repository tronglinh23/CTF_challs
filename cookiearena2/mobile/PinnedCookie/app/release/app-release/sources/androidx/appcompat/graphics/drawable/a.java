package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.appcompat.graphics.drawable.b;
import androidx.appcompat.graphics.drawable.e;
import androidx.collection.h;
import d.o0;
import d.q0;
import d.v;
import h.a;
import h.b;
import java.io.IOException;
import m0.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q0.n;
/* loaded from: classes.dex */
public class a extends androidx.appcompat.graphics.drawable.e implements n {
    public static final String A = "transition";
    public static final String B = "item";
    public static final String C = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    public static final String D = ": <transition> tag requires 'fromId' & 'toId' attributes";
    public static final String E = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* renamed from: z  reason: collision with root package name */
    public static final String f946z = "a";

    /* renamed from: u  reason: collision with root package name */
    public c f947u;

    /* renamed from: v  reason: collision with root package name */
    public g f948v;

    /* renamed from: w  reason: collision with root package name */
    public int f949w;

    /* renamed from: x  reason: collision with root package name */
    public int f950x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f951y;

    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f952a;

        public b(Animatable animatable) {
            super();
            this.f952a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f952a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f952a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e.a {
        public static final long M = 4294967296L;
        public static final long N = 8589934592L;
        public h<Long> K;
        public androidx.collection.n<Integer> L;

        public c(@q0 c cVar, @o0 a aVar, @q0 Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new h<>();
            this.L = new androidx.collection.n<>();
        }

        public static long H(int i7, int i8) {
            return i8 | (i7 << 32);
        }

        public int F(@o0 int[] iArr, @o0 Drawable drawable, int i7) {
            int D = super.D(iArr, drawable);
            this.L.u(D, Integer.valueOf(i7));
            return D;
        }

        public int G(int i7, int i8, @o0 Drawable drawable, boolean z6) {
            int a7 = super.a(drawable);
            long H = H(i7, i8);
            long j7 = z6 ? N : 0L;
            long j8 = a7;
            this.K.e(H, Long.valueOf(j8 | j7));
            if (z6) {
                this.K.e(H(i8, i7), Long.valueOf(M | j8 | j7));
            }
            return a7;
        }

        public int I(int i7) {
            if (i7 < 0) {
                return 0;
            }
            return this.L.p(i7, 0).intValue();
        }

        public int J(@o0 int[] iArr) {
            int E = super.E(iArr);
            return E >= 0 ? E : super.E(StateSet.WILD_CARD);
        }

        public int K(int i7, int i8) {
            return (int) this.K.p(H(i7, i8), -1L).longValue();
        }

        public boolean L(int i7, int i8) {
            return (this.K.p(H(i7, i8), -1L).longValue() & M) != 0;
        }

        public boolean M(int i7, int i8) {
            return (this.K.p(H(i7, i8), -1L).longValue() & N) != 0;
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, androidx.appcompat.graphics.drawable.b.d
        public void v() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.vectordrawable.graphics.drawable.c f953a;

        public d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f953a = cVar;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f953a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f953a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f954a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f955b;

        public e(AnimationDrawable animationDrawable, boolean z6, boolean z7) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i7 = z6 ? numberOfFrames - 1 : 0;
            int i8 = z6 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z6);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i7, i8);
            a.b.a(ofInt, true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f955b = z7;
            this.f954a = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public boolean a() {
            return this.f955b;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void b() {
            this.f954a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f954a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f954a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f956a;

        /* renamed from: b  reason: collision with root package name */
        public int f957b;

        /* renamed from: c  reason: collision with root package name */
        public int f958c;

        public f(AnimationDrawable animationDrawable, boolean z6) {
            b(animationDrawable, z6);
        }

        public int a() {
            return this.f958c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z6) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f957b = numberOfFrames;
            int[] iArr = this.f956a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f956a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f956a;
            int i7 = 0;
            for (int i8 = 0; i8 < numberOfFrames; i8++) {
                int duration = animationDrawable.getDuration(z6 ? (numberOfFrames - i8) - 1 : i8);
                iArr2[i8] = duration;
                i7 += duration;
            }
            this.f958c = i7;
            return i7;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            int i7 = (int) ((f7 * this.f958c) + 0.5f);
            int i8 = this.f957b;
            int[] iArr = this.f956a;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = iArr[i9];
                if (i7 < i10) {
                    break;
                }
                i7 -= i10;
                i9++;
            }
            return (i9 / i8) + (i9 < i8 ? i7 / this.f958c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    @q0
    public static a B(@o0 Context context, @v int i7, @q0 Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i7);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C(context, resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e7) {
            Log.e(f946z, "parser error", e7);
            return null;
        } catch (XmlPullParserException e8) {
            Log.e(f946z, "parser error", e8);
            return null;
        }
    }

    @o0
    public static a C(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.v(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void w(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    E(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(A)) {
                    F(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void x(TypedArray typedArray) {
        c cVar = this.f947u;
        cVar.f979d |= a.c.b(typedArray);
        cVar.B(typedArray.getBoolean(b.C0113b.f10096d, cVar.f984i));
        cVar.x(typedArray.getBoolean(b.C0113b.f10097e, cVar.f987l));
        cVar.y(typedArray.getInt(b.C0113b.f10098f, cVar.A));
        cVar.z(typedArray.getInt(b.C0113b.f10099g, cVar.B));
        setDither(typedArray.getBoolean(b.C0113b.f10094b, cVar.f999x));
    }

    @Override // androidx.appcompat.graphics.drawable.e
    /* renamed from: A  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c o() {
        return new c(this.f947u, this, null);
    }

    public final void D() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r5 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r7.getName().equals(androidx.vectordrawable.graphics.drawable.i.f6917q) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        r5 = androidx.vectordrawable.graphics.drawable.i.c(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        r5 = h.a.c.a(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + androidx.appcompat.graphics.drawable.a.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        return r4.f947u.F(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + androidx.appcompat.graphics.drawable.a.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        r5 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r5 != 4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int E(@d.o0 android.content.Context r5, @d.o0 android.content.res.Resources r6, @d.o0 org.xmlpull.v1.XmlPullParser r7, @d.o0 android.util.AttributeSet r8, @d.q0 android.content.res.Resources.Theme r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int[] r0 = h.b.C0113b.f10100h
            android.content.res.TypedArray r0 = m0.p.s(r6, r9, r8, r0)
            int r1 = h.b.C0113b.f10101i
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = h.b.C0113b.f10102j
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            androidx.appcompat.widget.g1 r3 = androidx.appcompat.widget.g1.h()
            android.graphics.drawable.Drawable r5 = r3.j(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.p(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L65
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L4c
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            androidx.vectordrawable.graphics.drawable.i r5 = androidx.vectordrawable.graphics.drawable.i.c(r6, r7, r8, r9)
            goto L65
        L47:
            android.graphics.drawable.Drawable r5 = h.a.c.a(r6, r7, r8, r9)
            goto L65
        L4c:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            if (r5 == 0) goto L6e
            androidx.appcompat.graphics.drawable.a$c r6 = r4.f947u
            int r5 = r6.F(r0, r5, r1)
            return r5
        L6e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.a.E(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r4 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r10.getName().equals(androidx.vectordrawable.graphics.drawable.c.f6877k) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        r4 = androidx.vectordrawable.graphics.drawable.c.c(r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        r4 = h.a.c.a(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.a.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r1 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r3 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        return r7.f947u.G(r1, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.a.D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.a.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r4 != 4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F(@d.o0 android.content.Context r8, @d.o0 android.content.res.Resources r9, @d.o0 org.xmlpull.v1.XmlPullParser r10, @d.o0 android.util.AttributeSet r11, @d.q0 android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            int[] r0 = h.b.C0113b.f10103k
            android.content.res.TypedArray r0 = m0.p.s(r9, r12, r11, r0)
            int r1 = h.b.C0113b.f10106n
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = h.b.C0113b.f10105m
            int r3 = r0.getResourceId(r3, r2)
            int r4 = h.b.C0113b.f10104l
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.g1 r5 = androidx.appcompat.widget.g1.h()
            android.graphics.drawable.Drawable r4 = r5.j(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = h.b.C0113b.f10107o
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L6d
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L54
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            androidx.vectordrawable.graphics.drawable.c r4 = androidx.vectordrawable.graphics.drawable.c.c(r8, r9, r10, r11, r12)
            goto L6d
        L4f:
            android.graphics.drawable.Drawable r4 = h.a.c.a(r9, r10, r11, r12)
            goto L6d
        L54:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6d:
            if (r4 == 0) goto L95
            if (r1 == r2) goto L7a
            if (r3 == r2) goto L7a
            androidx.appcompat.graphics.drawable.a$c r8 = r7.f947u
            int r8 = r8.G(r1, r3, r4, r5)
            return r8
        L7a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L95:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.a.F(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    public final boolean G(int i7) {
        int d7;
        int K;
        g bVar;
        g gVar = this.f948v;
        if (gVar == null) {
            d7 = d();
        } else if (i7 == this.f949w) {
            return true;
        } else {
            if (i7 == this.f950x && gVar.a()) {
                gVar.b();
                this.f949w = this.f950x;
                this.f950x = i7;
                return true;
            }
            d7 = this.f949w;
            gVar.d();
        }
        this.f948v = null;
        this.f950x = -1;
        this.f949w = -1;
        c cVar = this.f947u;
        int I = cVar.I(d7);
        int I2 = cVar.I(i7);
        if (I2 == 0 || I == 0 || (K = cVar.K(I, I2)) < 0) {
            return false;
        }
        boolean M = cVar.M(I, I2);
        h(K);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.L(I, I2), M);
        } else if (!(current instanceof androidx.vectordrawable.graphics.drawable.c)) {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        } else {
            bVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        }
        bVar.c();
        this.f948v = bVar;
        this.f950x = d7;
        this.f949w = i7;
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b
    public void b() {
        super.b();
        this.f951y = false;
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b
    public void i(@o0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof c) {
            this.f947u = (c) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f948v;
        if (gVar != null) {
            gVar.d();
            this.f948v = null;
            h(this.f949w);
            this.f949w = -1;
            this.f950x = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.f951y && super.mutate() == this) {
            this.f947u.v();
            this.f951y = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean onStateChange(@o0 int[] iArr) {
        int J = this.f947u.J(iArr);
        boolean z6 = J != d() && (G(J) || h(J));
        Drawable current = getCurrent();
        return current != null ? z6 | current.setState(iArr) : z6;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        g gVar = this.f948v;
        if (gVar != null && (visible || z7)) {
            if (z6) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.e
    public void v(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s6 = p.s(resources, theme, attributeSet, b.C0113b.f10093a);
        setVisible(s6.getBoolean(b.C0113b.f10095c, true), true);
        x(s6);
        m(resources);
        s6.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        D();
    }

    public void y(@o0 int[] iArr, @o0 Drawable drawable, int i7) {
        g1.n.d(drawable);
        this.f947u.F(iArr, drawable, i7);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void z(int i7, int i8, @o0 T t6, boolean z6) {
        g1.n.d(t6);
        this.f947u.G(i7, i8, t6, z6);
    }

    public a(@q0 c cVar, @q0 Resources resources) {
        super(null);
        this.f949w = -1;
        this.f950x = -1;
        i(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
