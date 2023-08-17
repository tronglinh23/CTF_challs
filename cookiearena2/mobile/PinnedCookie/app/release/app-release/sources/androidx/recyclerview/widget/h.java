package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class h extends a0 {
    public static TimeInterpolator A = null;

    /* renamed from: z  reason: collision with root package name */
    public static final boolean f5365z = false;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f5366o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f5367p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<j> f5368q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<i> f5369r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.f0>> f5370s = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<ArrayList<j>> f5371t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<ArrayList<i>> f5372u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f5373v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f5374w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f5375x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f5376y = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5377k;

        public a(ArrayList arrayList) {
            this.f5377k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5377k.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                h.this.b0(jVar.f5411a, jVar.f5412b, jVar.f5413c, jVar.f5414d, jVar.f5415e);
            }
            this.f5377k.clear();
            h.this.f5371t.remove(this.f5377k);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5379k;

        public b(ArrayList arrayList) {
            this.f5379k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5379k.iterator();
            while (it.hasNext()) {
                h.this.a0((i) it.next());
            }
            this.f5379k.clear();
            h.this.f5372u.remove(this.f5379k);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5381k;

        public c(ArrayList arrayList) {
            this.f5381k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5381k.iterator();
            while (it.hasNext()) {
                h.this.Z((RecyclerView.f0) it.next());
            }
            this.f5381k.clear();
            h.this.f5370s.remove(this.f5381k);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f5383a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5384b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f5385c;

        public d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5383a = f0Var;
            this.f5384b = viewPropertyAnimator;
            this.f5385c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5384b.setListener(null);
            this.f5385c.setAlpha(1.0f);
            h.this.N(this.f5383a);
            h.this.f5375x.remove(this.f5383a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.O(this.f5383a);
        }
    }

    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f5387a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f5388b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5389c;

        public e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5387a = f0Var;
            this.f5388b = view;
            this.f5389c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5388b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5389c.setListener(null);
            h.this.H(this.f5387a);
            h.this.f5373v.remove(this.f5387a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.I(this.f5387a);
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f5391a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f5392b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f5393c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f5394d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5395e;

        public f(RecyclerView.f0 f0Var, int i7, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5391a = f0Var;
            this.f5392b = i7;
            this.f5393c = view;
            this.f5394d = i8;
            this.f5395e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f5392b != 0) {
                this.f5393c.setTranslationX(0.0f);
            }
            if (this.f5394d != 0) {
                this.f5393c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5395e.setListener(null);
            h.this.L(this.f5391a);
            h.this.f5374w.remove(this.f5391a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.M(this.f5391a);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f5397a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5398b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f5399c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5397a = iVar;
            this.f5398b = viewPropertyAnimator;
            this.f5399c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5398b.setListener(null);
            this.f5399c.setAlpha(1.0f);
            this.f5399c.setTranslationX(0.0f);
            this.f5399c.setTranslationY(0.0f);
            h.this.J(this.f5397a.f5405a, true);
            h.this.f5376y.remove(this.f5397a.f5405a);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.K(this.f5397a.f5405a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0064h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f5401a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5402b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f5403c;

        public C0064h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5401a = iVar;
            this.f5402b = viewPropertyAnimator;
            this.f5403c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5402b.setListener(null);
            this.f5403c.setAlpha(1.0f);
            this.f5403c.setTranslationX(0.0f);
            this.f5403c.setTranslationY(0.0f);
            h.this.J(this.f5401a.f5406b, false);
            h.this.f5376y.remove(this.f5401a.f5406b);
            h.this.e0();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            h.this.K(this.f5401a.f5406b, false);
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.f0 f5411a;

        /* renamed from: b  reason: collision with root package name */
        public int f5412b;

        /* renamed from: c  reason: collision with root package name */
        public int f5413c;

        /* renamed from: d  reason: collision with root package name */
        public int f5414d;

        /* renamed from: e  reason: collision with root package name */
        public int f5415e;

        public j(RecyclerView.f0 f0Var, int i7, int i8, int i9, int i10) {
            this.f5411a = f0Var;
            this.f5412b = i7;
            this.f5413c = i8;
            this.f5414d = i9;
            this.f5415e = i10;
        }
    }

    @Override // androidx.recyclerview.widget.a0
    public boolean D(RecyclerView.f0 f0Var) {
        i0(f0Var);
        f0Var.itemView.setAlpha(0.0f);
        this.f5367p.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.a0
    public boolean E(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i7, int i8, int i9, int i10) {
        if (f0Var == f0Var2) {
            return F(f0Var, i7, i8, i9, i10);
        }
        float translationX = f0Var.itemView.getTranslationX();
        float translationY = f0Var.itemView.getTranslationY();
        float alpha = f0Var.itemView.getAlpha();
        i0(f0Var);
        int i11 = (int) ((i9 - i7) - translationX);
        int i12 = (int) ((i10 - i8) - translationY);
        f0Var.itemView.setTranslationX(translationX);
        f0Var.itemView.setTranslationY(translationY);
        f0Var.itemView.setAlpha(alpha);
        if (f0Var2 != null) {
            i0(f0Var2);
            f0Var2.itemView.setTranslationX(-i11);
            f0Var2.itemView.setTranslationY(-i12);
            f0Var2.itemView.setAlpha(0.0f);
        }
        this.f5369r.add(new i(f0Var, f0Var2, i7, i8, i9, i10));
        return true;
    }

    @Override // androidx.recyclerview.widget.a0
    public boolean F(RecyclerView.f0 f0Var, int i7, int i8, int i9, int i10) {
        View view = f0Var.itemView;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) f0Var.itemView.getTranslationY());
        i0(f0Var);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            L(f0Var);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        this.f5368q.add(new j(f0Var, translationX, translationY, i9, i10));
        return true;
    }

    @Override // androidx.recyclerview.widget.a0
    public boolean G(RecyclerView.f0 f0Var) {
        i0(f0Var);
        this.f5366o.add(f0Var);
        return true;
    }

    public void Z(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f5373v.add(f0Var);
        animate.alpha(1.0f).setDuration(m()).setListener(new e(f0Var, view, animate)).start();
    }

    public void a0(i iVar) {
        RecyclerView.f0 f0Var = iVar.f5405a;
        View view = f0Var == null ? null : f0Var.itemView;
        RecyclerView.f0 f0Var2 = iVar.f5406b;
        View view2 = f0Var2 != null ? f0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(n());
            this.f5376y.add(iVar.f5405a);
            duration.translationX(iVar.f5409e - iVar.f5407c);
            duration.translationY(iVar.f5410f - iVar.f5408d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f5376y.add(iVar.f5406b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(n()).alpha(1.0f).setListener(new C0064h(iVar, animate, view2)).start();
        }
    }

    public void b0(RecyclerView.f0 f0Var, int i7, int i8, int i9, int i10) {
        View view = f0Var.itemView;
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        if (i11 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i12 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f5374w.add(f0Var);
        animate.setDuration(o()).setListener(new f(f0Var, i11, view, i12, animate)).start();
    }

    public final void c0(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f5375x.add(f0Var);
        animate.setDuration(p()).alpha(0.0f).setListener(new d(f0Var, animate, view)).start();
    }

    public void d0(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void e0() {
        if (q()) {
            return;
        }
        j();
    }

    public final void f0(List<i> list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (h0(iVar, f0Var) && iVar.f5405a == null && iVar.f5406b == null) {
                list.remove(iVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(@o0 RecyclerView.f0 f0Var, @o0 List<Object> list) {
        return !list.isEmpty() || super.g(f0Var, list);
    }

    public final void g0(i iVar) {
        RecyclerView.f0 f0Var = iVar.f5405a;
        if (f0Var != null) {
            h0(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.f5406b;
        if (f0Var2 != null) {
            h0(iVar, f0Var2);
        }
    }

    public final boolean h0(i iVar, RecyclerView.f0 f0Var) {
        boolean z6 = false;
        if (iVar.f5406b == f0Var) {
            iVar.f5406b = null;
        } else if (iVar.f5405a != f0Var) {
            return false;
        } else {
            iVar.f5405a = null;
            z6 = true;
        }
        f0Var.itemView.setAlpha(1.0f);
        f0Var.itemView.setTranslationX(0.0f);
        f0Var.itemView.setTranslationY(0.0f);
        J(f0Var, z6);
        return true;
    }

    public final void i0(RecyclerView.f0 f0Var) {
        if (A == null) {
            A = new ValueAnimator().getInterpolator();
        }
        f0Var.itemView.animate().setInterpolator(A);
        k(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        view.animate().cancel();
        int size = this.f5368q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f5368q.get(size).f5411a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                L(f0Var);
                this.f5368q.remove(size);
            }
        }
        f0(this.f5369r, f0Var);
        if (this.f5366o.remove(f0Var)) {
            view.setAlpha(1.0f);
            N(f0Var);
        }
        if (this.f5367p.remove(f0Var)) {
            view.setAlpha(1.0f);
            H(f0Var);
        }
        for (int size2 = this.f5372u.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f5372u.get(size2);
            f0(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f5372u.remove(size2);
            }
        }
        for (int size3 = this.f5371t.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f5371t.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f5411a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    L(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5371t.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f5370s.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.f5370s.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                H(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f5370s.remove(size5);
                }
            }
        }
        this.f5375x.remove(f0Var);
        this.f5373v.remove(f0Var);
        this.f5376y.remove(f0Var);
        this.f5374w.remove(f0Var);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l() {
        int size = this.f5368q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f5368q.get(size);
            View view = jVar.f5411a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            L(jVar.f5411a);
            this.f5368q.remove(size);
        }
        for (int size2 = this.f5366o.size() - 1; size2 >= 0; size2--) {
            N(this.f5366o.get(size2));
            this.f5366o.remove(size2);
        }
        int size3 = this.f5367p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.f5367p.get(size3);
            f0Var.itemView.setAlpha(1.0f);
            H(f0Var);
            this.f5367p.remove(size3);
        }
        for (int size4 = this.f5369r.size() - 1; size4 >= 0; size4--) {
            g0(this.f5369r.get(size4));
        }
        this.f5369r.clear();
        if (q()) {
            for (int size5 = this.f5371t.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f5371t.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f5411a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    L(jVar2.f5411a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5371t.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f5370s.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList2 = this.f5370s.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                    f0Var2.itemView.setAlpha(1.0f);
                    H(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5370s.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f5372u.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f5372u.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    g0(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5372u.remove(arrayList3);
                    }
                }
            }
            d0(this.f5375x);
            d0(this.f5374w);
            d0(this.f5373v);
            d0(this.f5376y);
            j();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean q() {
        return (this.f5367p.isEmpty() && this.f5369r.isEmpty() && this.f5368q.isEmpty() && this.f5366o.isEmpty() && this.f5374w.isEmpty() && this.f5375x.isEmpty() && this.f5373v.isEmpty() && this.f5376y.isEmpty() && this.f5371t.isEmpty() && this.f5370s.isEmpty() && this.f5372u.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void x() {
        boolean z6 = !this.f5366o.isEmpty();
        boolean z7 = !this.f5368q.isEmpty();
        boolean z8 = !this.f5369r.isEmpty();
        boolean z9 = !this.f5367p.isEmpty();
        if (z6 || z7 || z9 || z8) {
            Iterator<RecyclerView.f0> it = this.f5366o.iterator();
            while (it.hasNext()) {
                c0(it.next());
            }
            this.f5366o.clear();
            if (z7) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f5368q);
                this.f5371t.add(arrayList);
                this.f5368q.clear();
                a aVar = new a(arrayList);
                if (z6) {
                    u1.q1(arrayList.get(0).f5411a.itemView, aVar, p());
                } else {
                    aVar.run();
                }
            }
            if (z8) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f5369r);
                this.f5372u.add(arrayList2);
                this.f5369r.clear();
                b bVar = new b(arrayList2);
                if (z6) {
                    u1.q1(arrayList2.get(0).f5405a.itemView, bVar, p());
                } else {
                    bVar.run();
                }
            }
            if (z9) {
                ArrayList<RecyclerView.f0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f5367p);
                this.f5370s.add(arrayList3);
                this.f5367p.clear();
                c cVar = new c(arrayList3);
                if (z6 || z7 || z8) {
                    u1.q1(arrayList3.get(0).itemView, cVar, (z6 ? p() : 0L) + Math.max(z7 ? o() : 0L, z8 ? n() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.f0 f5405a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.f0 f5406b;

        /* renamed from: c  reason: collision with root package name */
        public int f5407c;

        /* renamed from: d  reason: collision with root package name */
        public int f5408d;

        /* renamed from: e  reason: collision with root package name */
        public int f5409e;

        /* renamed from: f  reason: collision with root package name */
        public int f5410f;

        public i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f5405a = f0Var;
            this.f5406b = f0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f5405a + ", newHolder=" + this.f5406b + ", fromX=" + this.f5407c + ", fromY=" + this.f5408d + ", toX=" + this.f5409e + ", toY=" + this.f5410f + '}';
        }

        public i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i7, int i8, int i9, int i10) {
            this(f0Var, f0Var2);
            this.f5407c = i7;
            this.f5408d = i8;
            this.f5409e = i9;
            this.f5410f = i10;
        }
    }
}
