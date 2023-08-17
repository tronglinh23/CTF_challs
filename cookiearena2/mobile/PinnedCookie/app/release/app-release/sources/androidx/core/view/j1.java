package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class j1 {

    /* renamed from: a  reason: collision with root package name */
    public int f3654a;

    /* renamed from: b  reason: collision with root package name */
    public int f3655b;

    public j1(@d.o0 ViewGroup viewGroup) {
    }

    public int a() {
        return this.f3654a | this.f3655b;
    }

    public void b(@d.o0 View view, @d.o0 View view2, int i7) {
        c(view, view2, i7, 0);
    }

    public void c(@d.o0 View view, @d.o0 View view2, int i7, int i8) {
        if (i8 == 1) {
            this.f3655b = i7;
        } else {
            this.f3654a = i7;
        }
    }

    public void d(@d.o0 View view) {
        e(view, 0);
    }

    public void e(@d.o0 View view, int i7) {
        if (i7 == 1) {
            this.f3655b = 0;
        } else {
            this.f3654a = 0;
        }
    }
}
