package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.n1;
import androidx.core.view.u1;
import d.b1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class y0 {

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f4581k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4582l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4583m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4584n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4585o;

        public a(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4581k = i7;
            this.f4582l = arrayList;
            this.f4583m = arrayList2;
            this.f4584n = arrayList3;
            this.f4585o = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i7 = 0; i7 < this.f4581k; i7++) {
                u1.t2((View) this.f4582l.get(i7), (String) this.f4583m.get(i7));
                u1.t2((View) this.f4584n.get(i7), (String) this.f4585o.get(i7));
            }
        }
    }

    public static void d(List<View> list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (u1.x0(view) != null) {
            list.add(view);
        }
        for (int i7 = size; i7 < list.size(); i7++) {
            View view2 = list.get(i7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (!g(list, childAt, size) && u1.x0(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean g(List<View> list, View view, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (list.get(i8) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(@d.o0 Object obj, @d.o0 View view);

    public abstract void b(@d.o0 Object obj, @d.o0 ArrayList<View> arrayList);

    public abstract void c(@d.o0 ViewGroup viewGroup, @d.q0 Object obj);

    public abstract boolean e(@d.o0 Object obj);

    public abstract Object f(@d.q0 Object obj);

    public void h(View view, Rect rect) {
        if (u1.O0(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(@d.q0 Object obj, @d.q0 Object obj2, @d.q0 Object obj3);

    public abstract Object k(@d.q0 Object obj, @d.q0 Object obj2, @d.q0 Object obj3);

    public ArrayList<String> l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = arrayList.get(i7);
            arrayList2.add(u1.x0(view));
            u1.t2(view, null);
        }
        return arrayList2;
    }

    public abstract void m(@d.o0 Object obj, @d.o0 View view);

    public abstract void n(@d.o0 Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2);

    public abstract void o(@d.o0 Object obj, @d.o0 View view, @d.o0 ArrayList<View> arrayList);

    public abstract void p(@d.o0 Object obj, @d.q0 Object obj2, @d.q0 ArrayList<View> arrayList, @d.q0 Object obj3, @d.q0 ArrayList<View> arrayList2, @d.q0 Object obj4, @d.q0 ArrayList<View> arrayList3);

    public abstract void q(@d.o0 Object obj, @d.o0 Rect rect);

    public abstract void r(@d.o0 Object obj, @d.q0 View view);

    public void s(@d.o0 Fragment fragment, @d.o0 Object obj, @d.o0 z0.j jVar, @d.o0 Runnable runnable) {
        runnable.run();
    }

    public void t(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = arrayList.get(i7);
            String x02 = u1.x0(view2);
            arrayList4.add(x02);
            if (x02 != null) {
                u1.t2(view2, null);
                String str = map.get(x02);
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i8))) {
                        u1.t2(arrayList2.get(i8), x02);
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        n1.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void u(@d.o0 Object obj, @d.o0 View view, @d.o0 ArrayList<View> arrayList);

    public abstract void v(@d.q0 Object obj, @d.q0 ArrayList<View> arrayList, @d.q0 ArrayList<View> arrayList2);

    public abstract Object w(@d.q0 Object obj);
}