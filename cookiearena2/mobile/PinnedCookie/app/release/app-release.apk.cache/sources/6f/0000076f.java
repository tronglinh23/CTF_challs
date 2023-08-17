package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.transition.d0;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class r extends FrameLayout {
    @d.o0

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f6754b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6755c;

    public r(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f6754b = viewGroup;
        viewGroup.setTag(d0.g.f6074w0, this);
        z0.b(this.f6754b).add(this);
        this.f6755c = true;
    }

    public static r b(@d.o0 ViewGroup viewGroup) {
        return (r) viewGroup.getTag(d0.g.f6074w0);
    }

    public static void d(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public static boolean e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(z0.a(viewGroup, i7));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    public static boolean f(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i7 = 1; i7 < min; i7++) {
            View view = arrayList.get(i7);
            View view2 = arrayList2.get(i7);
            if (view != view2) {
                return e(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    public void a(t tVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        d(tVar.f6796d, arrayList);
        int c7 = c(arrayList);
        if (c7 < 0 || c7 >= getChildCount()) {
            addView(tVar);
        } else {
            addView(tVar, c7);
        }
    }

    public final int c(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i7 = 0;
        while (i7 <= childCount) {
            int i8 = (i7 + childCount) / 2;
            d(((t) getChildAt(i8)).f6796d, arrayList2);
            if (f(arrayList, arrayList2)) {
                i7 = i8 + 1;
            } else {
                childCount = i8 - 1;
            }
            arrayList2.clear();
        }
        return i7;
    }

    public void g() {
        if (!this.f6755c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        z0.b(this.f6754b).remove(this);
        z0.b(this.f6754b).add(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f6755c) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f6754b.setTag(d0.g.f6074w0, null);
            z0.b(this.f6754b).remove(this);
            this.f6755c = false;
        }
    }
}