package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.b;
import d.o0;
import d.q0;
import d.w0;
import h.a;
import h.b;
import java.io.IOException;
import m0.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class e extends b {

    /* renamed from: s  reason: collision with root package name */
    public static final String f1020s = "StateListDrawableCompat";

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f1021t = false;

    /* renamed from: q  reason: collision with root package name */
    public a f1022q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1023r;

    /* loaded from: classes.dex */
    public static class a extends b.d {
        public int[][] J;

        public a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[g()];
            }
        }

        public int D(int[] iArr, Drawable drawable) {
            int a7 = a(drawable);
            this.J[a7] = iArr;
            return a7;
        }

        public int E(int[] iArr) {
            int[][] iArr2 = this.J;
            int i7 = i();
            for (int i8 = 0; i8 < i7; i8++) {
                if (StateSet.stateSetMatches(iArr2[i8], iArr)) {
                    return i8;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        public void r(int i7, int i8) {
            super.r(i7, i8);
            int[][] iArr = new int[i8];
            System.arraycopy(this.J, 0, iArr, 0, i7);
            this.J = iArr;
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        public void v() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.J = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

    public e() {
        this(null, null);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @w0(21)
    public void applyTheme(@o0 Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.b
    public void b() {
        super.b();
        this.f1023r = false;
    }

    @Override // androidx.appcompat.graphics.drawable.b
    public void i(@o0 b.d dVar) {
        super.i(dVar);
        if (dVar instanceof a) {
            this.f1022q = (a) dVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.f1023r && super.mutate() == this) {
            this.f1022q.v();
            this.f1023r = true;
        }
        return this;
    }

    public void n(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f1022q.D(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // androidx.appcompat.graphics.drawable.b
    public a o() {
        return new a(this.f1022q, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean onStateChange(@o0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int E = this.f1022q.E(iArr);
        if (E < 0) {
            E = this.f1022q.E(StateSet.WILD_CARD);
        }
        return h(E) || onStateChange;
    }

    public int[] p(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i7 = 0;
        for (int i8 = 0; i8 < attributeCount; i8++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i8);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i9 = i7 + 1;
                if (!attributeSet.getAttributeBooleanValue(i8, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i7] = attributeNameResource;
                i7 = i9;
            }
        }
        return StateSet.trimStateSet(iArr, i7);
    }

    public int q() {
        return this.f1022q.i();
    }

    public Drawable r(int i7) {
        return this.f1022q.h(i7);
    }

    public int s(int[] iArr) {
        return this.f1022q.E(iArr);
    }

    public a t() {
        return this.f1022q;
    }

    public int[] u(int i7) {
        return this.f1022q.J[i7];
    }

    public void v(@o0 Context context, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s6 = p.s(resources, theme, attributeSet, b.C0113b.f10108p);
        setVisible(s6.getBoolean(b.C0113b.f10110r, true), true);
        x(s6);
        m(resources);
        s6.recycle();
        w(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r4 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r4 != 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        r4 = h.a.c.a(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + androidx.appcompat.graphics.drawable.a.E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        r0.D(r3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            androidx.appcompat.graphics.drawable.e$a r0 = r7.f1022q
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L8:
            int r3 = r10.next()
            if (r3 == r2) goto L7a
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L17
            r5 = 3
            if (r3 == r5) goto L7a
        L17:
            r5 = 2
            if (r3 == r5) goto L1b
            goto L8
        L1b:
            if (r4 > r1) goto L8
            java.lang.String r3 = r10.getName()
            java.lang.String r4 = "item"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2a
            goto L8
        L2a:
            int[] r3 = h.b.C0113b.f10115w
            android.content.res.TypedArray r3 = m0.p.s(r9, r12, r11, r3)
            int r4 = h.b.C0113b.f10116x
            r6 = -1
            int r4 = r3.getResourceId(r4, r6)
            if (r4 <= 0) goto L42
            androidx.appcompat.widget.g1 r6 = androidx.appcompat.widget.g1.h()
            android.graphics.drawable.Drawable r4 = r6.j(r8, r4)
            goto L43
        L42:
            r4 = 0
        L43:
            r3.recycle()
            int[] r3 = r7.p(r11)
            if (r4 != 0) goto L76
        L4c:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L54
            goto L4c
        L54:
            if (r4 != r5) goto L5b
            android.graphics.drawable.Drawable r4 = h.a.c.a(r9, r10, r11, r12)
            goto L76
        L5b:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L76:
            r0.D(r3, r4)
            goto L8
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.e.w(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final void x(TypedArray typedArray) {
        a aVar = this.f1022q;
        aVar.f979d |= a.c.b(typedArray);
        aVar.f984i = typedArray.getBoolean(b.C0113b.f10111s, aVar.f984i);
        aVar.f987l = typedArray.getBoolean(b.C0113b.f10112t, aVar.f987l);
        aVar.A = typedArray.getInt(b.C0113b.f10113u, aVar.A);
        aVar.B = typedArray.getInt(b.C0113b.f10114v, aVar.B);
        aVar.f999x = typedArray.getBoolean(b.C0113b.f10109q, aVar.f999x);
    }

    public e(a aVar, Resources resources) {
        i(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public e(@q0 a aVar) {
        if (aVar != null) {
            i(aVar);
        }
    }
}
