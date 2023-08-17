package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.d0;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public Context f6528a;

    /* renamed from: b  reason: collision with root package name */
    public int f6529b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f6530c;

    /* renamed from: d  reason: collision with root package name */
    public View f6531d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f6532e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f6533f;

    public f0(@d.o0 ViewGroup viewGroup) {
        this.f6529b = -1;
        this.f6530c = viewGroup;
    }

    @d.q0
    public static f0 c(@d.o0 ViewGroup viewGroup) {
        return (f0) viewGroup.getTag(d0.g.R1);
    }

    @d.o0
    public static f0 d(@d.o0 ViewGroup viewGroup, @d.j0 int i7, @d.o0 Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(d0.g.U1);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(d0.g.U1, sparseArray);
        }
        f0 f0Var = (f0) sparseArray.get(i7);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(viewGroup, i7, context);
        sparseArray.put(i7, f0Var2);
        return f0Var2;
    }

    public static void g(@d.o0 ViewGroup viewGroup, @d.q0 f0 f0Var) {
        viewGroup.setTag(d0.g.R1, f0Var);
    }

    public void a() {
        if (this.f6529b > 0 || this.f6531d != null) {
            e().removeAllViews();
            if (this.f6529b > 0) {
                LayoutInflater.from(this.f6528a).inflate(this.f6529b, this.f6530c);
            } else {
                this.f6530c.addView(this.f6531d);
            }
        }
        Runnable runnable = this.f6532e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f6530c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f6530c) != this || (runnable = this.f6533f) == null) {
            return;
        }
        runnable.run();
    }

    @d.o0
    public ViewGroup e() {
        return this.f6530c;
    }

    public boolean f() {
        return this.f6529b > 0;
    }

    public void h(@d.q0 Runnable runnable) {
        this.f6532e = runnable;
    }

    public void i(@d.q0 Runnable runnable) {
        this.f6533f = runnable;
    }

    public f0(ViewGroup viewGroup, int i7, Context context) {
        this.f6528a = context;
        this.f6530c = viewGroup;
        this.f6529b = i7;
    }

    public f0(@d.o0 ViewGroup viewGroup, @d.o0 View view) {
        this.f6529b = -1;
        this.f6530c = viewGroup;
        this.f6531d = view;
    }
}