package a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.k;
import c0.p;
/* loaded from: classes.dex */
public class e extends p {
    public static final int A = 2;
    public static final int B = 3;
    public static final int C = -1;

    /* renamed from: w  reason: collision with root package name */
    public static final String f53w = "FadeMove";

    /* renamed from: x  reason: collision with root package name */
    public static final int f54x = -1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f55y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f56z = 1;

    /* renamed from: o  reason: collision with root package name */
    public float f57o;

    /* renamed from: p  reason: collision with root package name */
    public int f58p;

    /* renamed from: q  reason: collision with root package name */
    public int f59q;

    /* renamed from: r  reason: collision with root package name */
    public int f60r;

    /* renamed from: s  reason: collision with root package name */
    public int f61s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f62t;

    /* renamed from: u  reason: collision with root package name */
    public int f63u;

    /* renamed from: v  reason: collision with root package name */
    public int f64v;

    public e(Context context) {
        super(context);
        this.f57o = 0.1f;
        this.f58p = 49;
        this.f59q = 50;
        this.f60r = 0;
        this.f61s = 0;
        this.f62t = true;
        this.f63u = -1;
        this.f64v = -1;
    }

    public final void K(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.wj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.Aj) {
                    int i8 = obtainStyledAttributes.getInt(index, this.f58p);
                    this.f58p = i8;
                    this.f58p = Math.max(Math.min(i8, 99), 0);
                } else if (index == k.m.yj) {
                    int i9 = obtainStyledAttributes.getInt(index, this.f59q);
                    this.f59q = i9;
                    this.f59q = Math.max(Math.min(i9, 99), 0);
                } else if (index == k.m.Cj) {
                    this.f60r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f60r);
                } else if (index == k.m.Dj) {
                    this.f61s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f61s);
                } else if (index == k.m.xj) {
                    this.f57o = obtainStyledAttributes.getFloat(index, this.f57o);
                } else if (index == k.m.zj) {
                    this.f64v = obtainStyledAttributes.getInt(index, this.f64v);
                } else if (index == k.m.Bj) {
                    this.f62t = obtainStyledAttributes.getBoolean(index, this.f62t);
                } else if (index == k.m.Ej) {
                    this.f63u = obtainStyledAttributes.getResourceId(index, this.f63u);
                }
            }
            int i10 = this.f58p;
            int i11 = this.f59q;
            if (i10 == i11) {
                if (i10 > 0) {
                    this.f58p = i10 - 1;
                } else {
                    this.f59q = i11 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // c0.p, c0.q
    public boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x017d, code lost:
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0191, code lost:
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a1, code lost:
        if (r15 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
        if (r15 == 0.0f) goto L57;
     */
    @Override // c0.p, c0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(c0.s r22, java.util.HashMap<android.view.View, c0.o> r23) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e.f(c0.s, java.util.HashMap):void");
    }

    public e(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f57o = 0.1f;
        this.f58p = 49;
        this.f59q = 50;
        this.f60r = 0;
        this.f61s = 0;
        this.f62t = true;
        this.f63u = -1;
        this.f64v = -1;
        K(context, attrs);
    }

    public e(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f57o = 0.1f;
        this.f58p = 49;
        this.f59q = 50;
        this.f60r = 0;
        this.f61s = 0;
        this.f62t = true;
        this.f63u = -1;
        this.f64v = -1;
        K(context, attrs);
    }
}
