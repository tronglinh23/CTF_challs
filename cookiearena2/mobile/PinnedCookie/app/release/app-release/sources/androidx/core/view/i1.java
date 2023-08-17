package androidx.core.view;

import android.view.View;
/* loaded from: classes.dex */
public interface i1 {
    int getNestedScrollAxes();

    boolean onNestedFling(@d.o0 View view, float f7, float f8, boolean z6);

    boolean onNestedPreFling(@d.o0 View view, float f7, float f8);

    void onNestedPreScroll(@d.o0 View view, int i7, int i8, @d.o0 int[] iArr);

    void onNestedScroll(@d.o0 View view, int i7, int i8, int i9, int i10);

    void onNestedScrollAccepted(@d.o0 View view, @d.o0 View view2, int i7);

    boolean onStartNestedScroll(@d.o0 View view, @d.o0 View view2, int i7);

    void onStopNestedScroll(@d.o0 View view);
}
