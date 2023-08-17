package m0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import d.b1;
import d.o0;
import d.q0;
import f0.a;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final int f13446a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f13447b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f13448c = 2;

    public static a a(@q0 a aVar, @d.l int i7, @d.l int i8, boolean z6, @d.l int i9) {
        return aVar != null ? aVar : z6 ? new a(i7, i9, i8) : new a(i7, i8);
    }

    public static Shader b(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return c(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static Shader c(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray s6 = p.s(resources, theme, attributeSet, a.j.C);
        float j7 = p.j(s6, xmlPullParser, "startX", a.j.L, 0.0f);
        float j8 = p.j(s6, xmlPullParser, "startY", a.j.M, 0.0f);
        float j9 = p.j(s6, xmlPullParser, "endX", a.j.N, 0.0f);
        float j10 = p.j(s6, xmlPullParser, "endY", a.j.O, 0.0f);
        float j11 = p.j(s6, xmlPullParser, "centerX", a.j.G, 0.0f);
        float j12 = p.j(s6, xmlPullParser, "centerY", a.j.H, 0.0f);
        int k7 = p.k(s6, xmlPullParser, "type", a.j.F, 0);
        int f7 = p.f(s6, xmlPullParser, "startColor", a.j.D, 0);
        boolean r6 = p.r(xmlPullParser, "centerColor");
        int f8 = p.f(s6, xmlPullParser, "centerColor", a.j.K, 0);
        int f9 = p.f(s6, xmlPullParser, "endColor", a.j.E, 0);
        int k8 = p.k(s6, xmlPullParser, "tileMode", a.j.J, 0);
        float j13 = p.j(s6, xmlPullParser, "gradientRadius", a.j.I, 0.0f);
        s6.recycle();
        a a7 = a(d(resources, xmlPullParser, attributeSet, theme), f7, f9, r6, f8);
        if (k7 != 1) {
            return k7 != 2 ? new LinearGradient(j7, j8, j9, j10, a7.f13449a, a7.f13450b, e(k8)) : new SweepGradient(j11, j12, a7.f13449a, a7.f13450b);
        } else if (j13 > 0.0f) {
            return new RadialGradient(j11, j12, j13, a7.f13449a, a7.f13450b, e(k8));
        } else {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static m0.g.a d(@d.o0 android.content.res.Resources r8, @d.o0 org.xmlpull.v1.XmlPullParser r9, @d.o0 android.util.AttributeSet r10, @d.q0 android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = f0.a.j.P
            android.content.res.TypedArray r3 = m0.p.s(r8, r11, r10, r3)
            int r5 = f0.a.j.Q
            boolean r5 = r3.hasValue(r5)
            int r6 = f0.a.j.R
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = f0.a.j.Q
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = f0.a.j.R
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            m0.g$a r8 = new m0.g$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.g.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):m0.g$a");
    }

    public static Shader.TileMode e(int i7) {
        return i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f13449a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f13450b;

        public a(@o0 List<Integer> list, @o0 List<Float> list2) {
            int size = list.size();
            this.f13449a = new int[size];
            this.f13450b = new float[size];
            for (int i7 = 0; i7 < size; i7++) {
                this.f13449a[i7] = list.get(i7).intValue();
                this.f13450b[i7] = list2.get(i7).floatValue();
            }
        }

        public a(@d.l int i7, @d.l int i8) {
            this.f13449a = new int[]{i7, i8};
            this.f13450b = new float[]{0.0f, 1.0f};
        }

        public a(@d.l int i7, @d.l int i8, @d.l int i9) {
            this.f13449a = new int[]{i7, i8, i9};
            this.f13450b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}