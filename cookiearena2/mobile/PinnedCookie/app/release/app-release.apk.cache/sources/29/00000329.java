package androidx.core.view;

/* loaded from: classes.dex */
public interface c1 extends e1 {
    boolean dispatchNestedPreScroll(int i7, int i8, @d.q0 int[] iArr, @d.q0 int[] iArr2, int i9);

    boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, @d.q0 int[] iArr, int i11);

    boolean hasNestedScrollingParent(int i7);

    boolean startNestedScroll(int i7, int i8);

    void stopNestedScroll(int i7);
}