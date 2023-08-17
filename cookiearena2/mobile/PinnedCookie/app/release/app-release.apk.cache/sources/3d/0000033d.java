package androidx.core.view;

/* loaded from: classes.dex */
public interface e1 {
    boolean dispatchNestedFling(float f7, float f8, boolean z6);

    boolean dispatchNestedPreFling(float f7, float f8);

    boolean dispatchNestedPreScroll(int i7, int i8, @d.q0 int[] iArr, @d.q0 int[] iArr2);

    boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, @d.q0 int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z6);

    boolean startNestedScroll(int i7);

    void stopNestedScroll();
}