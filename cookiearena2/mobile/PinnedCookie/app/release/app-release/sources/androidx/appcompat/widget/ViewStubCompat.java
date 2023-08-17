package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.b1;
import f.a;
import java.lang.ref.WeakReference;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b  reason: collision with root package name */
    public int f1406b;

    /* renamed from: c  reason: collision with root package name */
    public int f1407c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<View> f1408d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f1409e;

    /* renamed from: f  reason: collision with root package name */
    public a f1410f;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1406b != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1409e;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1406b, viewGroup, false);
                int i7 = this.f1407c;
                if (i7 != -1) {
                    inflate.setId(i7);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1408d = new WeakReference<>(inflate);
                a aVar = this.f1410f;
                if (aVar != null) {
                    aVar.a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1407c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1409e;
    }

    public int getLayoutResource() {
        return this.f1406b;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.f1407c = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1409e = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.f1406b = i7;
    }

    public void setOnInflateListener(a aVar) {
        this.f1410f = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        WeakReference<View> weakReference = this.f1408d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i7);
            return;
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            a();
        }
    }

    public ViewStubCompat(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f1406b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.e7, i7, 0);
        this.f1407c = obtainStyledAttributes.getResourceId(a.m.h7, -1);
        this.f1406b = obtainStyledAttributes.getResourceId(a.m.g7, 0);
        setId(obtainStyledAttributes.getResourceId(a.m.f7, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
