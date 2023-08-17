package r3;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import d.o0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f15606b;

    /* renamed from: a  reason: collision with root package name */
    public LinearLayoutManager f15607a;

    /* renamed from: r3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0226a implements Comparator<int[]> {
        public C0226a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f15606b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public a(@o0 LinearLayoutManager linearLayoutManager) {
        this.f15607a = linearLayoutManager;
    }

    public static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                if (c(viewGroup.getChildAt(i7))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a() {
        int top;
        int i7;
        int bottom;
        int i8;
        int childCount = this.f15607a.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z6 = this.f15607a.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, childCount, 2);
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.f15607a.getChildAt(i9);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f15606b;
            int[] iArr2 = iArr[i9];
            if (z6) {
                top = childAt.getLeft();
                i7 = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i7 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i7;
            int[] iArr3 = iArr[i9];
            if (z6) {
                bottom = childAt.getRight();
                i8 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i8 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i8;
        }
        Arrays.sort(iArr, new C0226a());
        for (int i10 = 1; i10 < childCount; i10++) {
            if (iArr[i10 - 1][1] != iArr[i10][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i11 = iArr4[1];
        int i12 = iArr4[0];
        return i12 <= 0 && iArr[childCount - 1][1] >= i11 - i12;
    }

    public final boolean b() {
        int childCount = this.f15607a.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (c(this.f15607a.getChildAt(i7))) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return (!a() || this.f15607a.getChildCount() <= 1) && b();
    }
}
