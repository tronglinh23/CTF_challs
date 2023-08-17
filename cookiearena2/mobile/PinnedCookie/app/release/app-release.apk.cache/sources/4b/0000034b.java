package androidx.core.view;

import android.view.View;

/* loaded from: classes.dex */
public interface g1 extends i1 {
    void onNestedPreScroll(@d.o0 View view, int i7, int i8, @d.o0 int[] iArr, int i9);

    void onNestedScroll(@d.o0 View view, int i7, int i8, int i9, int i10, int i11);

    void onNestedScrollAccepted(@d.o0 View view, @d.o0 View view2, int i7, int i8);

    boolean onStartNestedScroll(@d.o0 View view, @d.o0 View view2, int i7, int i8);

    void onStopNestedScroll(@d.o0 View view, int i7);
}