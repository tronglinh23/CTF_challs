package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import d.b1;
@d.b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public TypedValue f1327b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1328c;

    /* renamed from: d  reason: collision with root package name */
    public TypedValue f1329d;

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1330e;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f1331f;

    /* renamed from: g  reason: collision with root package name */
    public TypedValue f1332g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f1333h;

    /* renamed from: i  reason: collision with root package name */
    public a f1334i;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@d.o0 Context context) {
        this(context, null);
    }

    @d.b1({b1.a.LIBRARY})
    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    @d.b1({b1.a.LIBRARY})
    public void b(int i7, int i8, int i9, int i10) {
        this.f1333h.set(i7, i8, i9, i10);
        if (androidx.core.view.u1.U0(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1331f == null) {
            this.f1331f = new TypedValue();
        }
        return this.f1331f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1332g == null) {
            this.f1332g = new TypedValue();
        }
        return this.f1332g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1329d == null) {
            this.f1329d = new TypedValue();
        }
        return this.f1329d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1330e == null) {
            this.f1330e = new TypedValue();
        }
        return this.f1330e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1327b == null) {
            this.f1327b = new TypedValue();
        }
        return this.f1327b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1328c == null) {
            this.f1328c = new TypedValue();
        }
        return this.f1328c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1334i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1334i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1334i = aVar;
    }

    public ContentFrameLayout(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f1333h = new Rect();
    }
}
