package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class z {
    public static int a(RecyclerView.c0 c0Var, w wVar, View view, View view2, RecyclerView.o oVar, boolean z6) {
        if (oVar.getChildCount() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z6) {
            return Math.min(wVar.o(), wVar.d(view2) - wVar.g(view));
        }
        return Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1;
    }

    public static int b(RecyclerView.c0 c0Var, w wVar, View view, View view2, RecyclerView.o oVar, boolean z6, boolean z7) {
        if (oVar.getChildCount() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z7 ? Math.max(0, (c0Var.d() - Math.max(oVar.getPosition(view), oVar.getPosition(view2))) - 1) : Math.max(0, Math.min(oVar.getPosition(view), oVar.getPosition(view2)));
        if (z6) {
            return Math.round((max * (Math.abs(wVar.d(view2) - wVar.g(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1))) + (wVar.n() - wVar.g(view)));
        }
        return max;
    }

    public static int c(RecyclerView.c0 c0Var, w wVar, View view, View view2, RecyclerView.o oVar, boolean z6) {
        if (oVar.getChildCount() == 0 || c0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z6) {
            return (int) (((wVar.d(view2) - wVar.g(view)) / (Math.abs(oVar.getPosition(view) - oVar.getPosition(view2)) + 1)) * c0Var.d());
        }
        return c0Var.d();
    }
}