package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.u1;
import c3.a;
/* loaded from: classes.dex */
public class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f5573a = new o();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f7 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            if (childAt != view) {
                float R = u1.R(childAt);
                if (R > f7) {
                    f7 = R;
                }
            }
        }
        return f7;
    }

    @Override // androidx.recyclerview.widget.n
    public void a(View view) {
        Object tag = view.getTag(a.e.V);
        if (tag instanceof Float) {
            u1.N1(view, ((Float) tag).floatValue());
        }
        view.setTag(a.e.V, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.n
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.n
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f7, float f8, int i7, boolean z6) {
    }

    @Override // androidx.recyclerview.widget.n
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f7, float f8, int i7, boolean z6) {
        if (z6 && view.getTag(a.e.V) == null) {
            Float valueOf = Float.valueOf(u1.R(view));
            u1.N1(view, e(recyclerView, view) + 1.0f);
            view.setTag(a.e.V, valueOf);
        }
        view.setTranslationX(f7);
        view.setTranslationY(f8);
    }
}
