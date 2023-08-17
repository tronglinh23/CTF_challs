package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public class j extends RecyclerView.n {

    /* renamed from: d  reason: collision with root package name */
    public static final int f5458d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f5459e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final String f5460f = "DividerItem";

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f5461g = {16843284};

    /* renamed from: a  reason: collision with root package name */
    public Drawable f5462a;

    /* renamed from: b  reason: collision with root package name */
    public int f5463b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f5464c = new Rect();

    public j(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5461g);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f5462a = drawable;
        if (drawable == null) {
            Log.w(f5460f, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        setOrientation(i7);
    }

    public final void f(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i7;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i7 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i7, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i7 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView.getChildAt(i8);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f5464c);
            int round = this.f5464c.right + Math.round(childAt.getTranslationX());
            this.f5462a.setBounds(round - this.f5462a.getIntrinsicWidth(), i7, round, height);
            this.f5462a.draw(canvas);
        }
        canvas.restore();
    }

    public final void g(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i7;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i7 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i7, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i7 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView.getChildAt(i8);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f5464c);
            int round = this.f5464c.bottom + Math.round(childAt.getTranslationY());
            this.f5462a.setBounds(i7, round - this.f5462a.getIntrinsicHeight(), width, round);
            this.f5462a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        Drawable drawable = this.f5462a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f5463b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @q0
    public Drawable h() {
        return this.f5462a;
    }

    public void i(@o0 Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f5462a = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (recyclerView.getLayoutManager() == null || this.f5462a == null) {
            return;
        }
        if (this.f5463b == 1) {
            g(canvas, recyclerView);
        } else {
            f(canvas, recyclerView);
        }
    }

    public void setOrientation(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f5463b = i7;
    }
}
