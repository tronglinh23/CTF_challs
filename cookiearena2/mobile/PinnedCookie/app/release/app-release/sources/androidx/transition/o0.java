package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.j0;
import d.b1;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class o0 extends j0 {

    /* renamed from: p  reason: collision with root package name */
    public static final int f6714p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f6715q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f6716r = 4;

    /* renamed from: s  reason: collision with root package name */
    public static final int f6717s = 8;

    /* renamed from: t  reason: collision with root package name */
    public static final int f6718t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f6719u = 1;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<j0> f6720k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6721l;

    /* renamed from: m  reason: collision with root package name */
    public int f6722m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6723n;

    /* renamed from: o  reason: collision with root package name */
    public int f6724o;

    /* loaded from: classes.dex */
    public class a extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j0 f6725a;

        public a(j0 j0Var) {
            this.f6725a = j0Var;
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            this.f6725a.runAnimators();
            j0Var.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public o0 f6727a;

        public b(o0 o0Var) {
            this.f6727a = o0Var;
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionEnd(@d.o0 j0 j0Var) {
            o0 o0Var = this.f6727a;
            int i7 = o0Var.f6722m - 1;
            o0Var.f6722m = i7;
            if (i7 == 0) {
                o0Var.f6723n = false;
                o0Var.end();
            }
            j0Var.removeListener(this);
        }

        @Override // androidx.transition.l0, androidx.transition.j0.h
        public void onTransitionStart(@d.o0 j0 j0Var) {
            o0 o0Var = this.f6727a;
            if (o0Var.f6723n) {
                return;
            }
            o0Var.start();
            this.f6727a.f6723n = true;
        }
    }

    public o0() {
        this.f6720k = new ArrayList<>();
        this.f6721l = true;
        this.f6723n = false;
        this.f6724o = 0;
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: A  reason: merged with bridge method [inline-methods] */
    public o0 addTarget(@d.d0 int i7) {
        for (int i8 = 0; i8 < this.f6720k.size(); i8++) {
            this.f6720k.get(i8).addTarget(i7);
        }
        return (o0) super.addTarget(i7);
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: B  reason: merged with bridge method [inline-methods] */
    public o0 addTarget(@d.o0 View view) {
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7).addTarget(view);
        }
        return (o0) super.addTarget(view);
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: C  reason: merged with bridge method [inline-methods] */
    public o0 addTarget(@d.o0 Class<?> cls) {
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7).addTarget(cls);
        }
        return (o0) super.addTarget(cls);
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: D  reason: merged with bridge method [inline-methods] */
    public o0 addTarget(@d.o0 String str) {
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7).addTarget(str);
        }
        return (o0) super.addTarget(str);
    }

    @d.o0
    public o0 E(@d.o0 j0 j0Var) {
        F(j0Var);
        long j7 = this.mDuration;
        if (j7 >= 0) {
            j0Var.setDuration(j7);
        }
        if ((this.f6724o & 1) != 0) {
            j0Var.setInterpolator(getInterpolator());
        }
        if ((this.f6724o & 2) != 0) {
            j0Var.setPropagation(getPropagation());
        }
        if ((this.f6724o & 4) != 0) {
            j0Var.setPathMotion(getPathMotion());
        }
        if ((this.f6724o & 8) != 0) {
            j0Var.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    public final void F(@d.o0 j0 j0Var) {
        this.f6720k.add(j0Var);
        j0Var.mParent = this;
    }

    public int G() {
        return !this.f6721l ? 1 : 0;
    }

    @d.q0
    public j0 H(int i7) {
        if (i7 < 0 || i7 >= this.f6720k.size()) {
            return null;
        }
        return this.f6720k.get(i7);
    }

    public int I() {
        return this.f6720k.size();
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: J  reason: merged with bridge method [inline-methods] */
    public o0 removeListener(@d.o0 j0.h hVar) {
        return (o0) super.removeListener(hVar);
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: K  reason: merged with bridge method [inline-methods] */
    public o0 removeTarget(@d.d0 int i7) {
        for (int i8 = 0; i8 < this.f6720k.size(); i8++) {
            this.f6720k.get(i8).removeTarget(i7);
        }
        return (o0) super.removeTarget(i7);
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: L  reason: merged with bridge method [inline-methods] */
    public o0 removeTarget(@d.o0 View view) {
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7).removeTarget(view);
        }
        return (o0) super.removeTarget(view);
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: M  reason: merged with bridge method [inline-methods] */
    public o0 removeTarget(@d.o0 Class<?> cls) {
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7).removeTarget(cls);
        }
        return (o0) super.removeTarget(cls);
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: N  reason: merged with bridge method [inline-methods] */
    public o0 removeTarget(@d.o0 String str) {
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7).removeTarget(str);
        }
        return (o0) super.removeTarget(str);
    }

    @d.o0
    public o0 O(@d.o0 j0 j0Var) {
        this.f6720k.remove(j0Var);
        j0Var.mParent = null;
        return this;
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: P  reason: merged with bridge method [inline-methods] */
    public o0 setDuration(long j7) {
        ArrayList<j0> arrayList;
        super.setDuration(j7);
        if (this.mDuration >= 0 && (arrayList = this.f6720k) != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f6720k.get(i7).setDuration(j7);
            }
        }
        return this;
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: Q  reason: merged with bridge method [inline-methods] */
    public o0 setInterpolator(@d.q0 TimeInterpolator timeInterpolator) {
        this.f6724o |= 1;
        ArrayList<j0> arrayList = this.f6720k;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f6720k.get(i7).setInterpolator(timeInterpolator);
            }
        }
        return (o0) super.setInterpolator(timeInterpolator);
    }

    @d.o0
    public o0 R(int i7) {
        if (i7 == 0) {
            this.f6721l = true;
        } else if (i7 != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i7);
        } else {
            this.f6721l = false;
        }
        return this;
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: S  reason: merged with bridge method [inline-methods] */
    public o0 setStartDelay(long j7) {
        return (o0) super.setStartDelay(j7);
    }

    public final void T() {
        b bVar = new b(this);
        Iterator<j0> it = this.f6720k.iterator();
        while (it.hasNext()) {
            it.next().addListener(bVar);
        }
        this.f6722m = this.f6720k.size();
    }

    @Override // androidx.transition.j0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6720k.get(i7).cancel();
        }
    }

    @Override // androidx.transition.j0
    public void captureEndValues(@d.o0 r0 r0Var) {
        if (isValidTarget(r0Var.f6757b)) {
            Iterator<j0> it = this.f6720k.iterator();
            while (it.hasNext()) {
                j0 next = it.next();
                if (next.isValidTarget(r0Var.f6757b)) {
                    next.captureEndValues(r0Var);
                    r0Var.f6758c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.j0
    public void capturePropagationValues(r0 r0Var) {
        super.capturePropagationValues(r0Var);
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6720k.get(i7).capturePropagationValues(r0Var);
        }
    }

    @Override // androidx.transition.j0
    public void captureStartValues(@d.o0 r0 r0Var) {
        if (isValidTarget(r0Var.f6757b)) {
            Iterator<j0> it = this.f6720k.iterator();
            while (it.hasNext()) {
                j0 next = it.next();
                if (next.isValidTarget(r0Var.f6757b)) {
                    next.captureStartValues(r0Var);
                    r0Var.f6758c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.j0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, s0 s0Var, s0 s0Var2, ArrayList<r0> arrayList, ArrayList<r0> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            j0 j0Var = this.f6720k.get(i7);
            if (startDelay > 0 && (this.f6721l || i7 == 0)) {
                long startDelay2 = j0Var.getStartDelay();
                if (startDelay2 > 0) {
                    j0Var.setStartDelay(startDelay2 + startDelay);
                } else {
                    j0Var.setStartDelay(startDelay);
                }
            }
            j0Var.createAnimators(viewGroup, s0Var, s0Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.j0
    @d.o0
    public j0 excludeTarget(@d.o0 View view, boolean z6) {
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7).excludeTarget(view, z6);
        }
        return super.excludeTarget(view, z6);
    }

    @Override // androidx.transition.j0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6720k.get(i7).forceToEnd(viewGroup);
        }
    }

    @Override // androidx.transition.j0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        super.pause(view);
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6720k.get(i7).pause(view);
        }
    }

    @Override // androidx.transition.j0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        super.resume(view);
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6720k.get(i7).resume(view);
        }
    }

    @Override // androidx.transition.j0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if (this.f6720k.isEmpty()) {
            start();
            end();
            return;
        }
        T();
        if (this.f6721l) {
            Iterator<j0> it = this.f6720k.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7 - 1).addListener(new a(this.f6720k.get(i7)));
        }
        j0 j0Var = this.f6720k.get(0);
        if (j0Var != null) {
            j0Var.runAnimators();
        }
    }

    @Override // androidx.transition.j0
    public void setCanRemoveViews(boolean z6) {
        super.setCanRemoveViews(z6);
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6720k.get(i7).setCanRemoveViews(z6);
        }
    }

    @Override // androidx.transition.j0
    public void setEpicenterCallback(j0.f fVar) {
        super.setEpicenterCallback(fVar);
        this.f6724o |= 8;
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6720k.get(i7).setEpicenterCallback(fVar);
        }
    }

    @Override // androidx.transition.j0
    public void setPathMotion(z zVar) {
        super.setPathMotion(zVar);
        this.f6724o |= 4;
        if (this.f6720k != null) {
            for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
                this.f6720k.get(i7).setPathMotion(zVar);
            }
        }
    }

    @Override // androidx.transition.j0
    public void setPropagation(n0 n0Var) {
        super.setPropagation(n0Var);
        this.f6724o |= 2;
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f6720k.get(i7).setPropagation(n0Var);
        }
    }

    @Override // androidx.transition.j0
    public String toString(String str) {
        String j0Var = super.toString(str);
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            StringBuilder sb = new StringBuilder();
            sb.append(j0Var);
            sb.append("\n");
            sb.append(this.f6720k.get(i7).toString(str + "  "));
            j0Var = sb.toString();
        }
        return j0Var;
    }

    @Override // androidx.transition.j0
    @d.o0
    /* renamed from: z  reason: merged with bridge method [inline-methods] */
    public o0 addListener(@d.o0 j0.h hVar) {
        return (o0) super.addListener(hVar);
    }

    @Override // androidx.transition.j0
    /* renamed from: clone */
    public j0 mo0clone() {
        o0 o0Var = (o0) super.mo0clone();
        o0Var.f6720k = new ArrayList<>();
        int size = this.f6720k.size();
        for (int i7 = 0; i7 < size; i7++) {
            o0Var.F(this.f6720k.get(i7).mo0clone());
        }
        return o0Var;
    }

    @Override // androidx.transition.j0
    @d.o0
    public j0 excludeTarget(@d.o0 String str, boolean z6) {
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7).excludeTarget(str, z6);
        }
        return super.excludeTarget(str, z6);
    }

    @SuppressLint({"RestrictedApi"})
    public o0(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6720k = new ArrayList<>();
        this.f6721l = true;
        this.f6723n = false;
        this.f6724o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f6609i);
        R(m0.p.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.j0
    @d.o0
    public j0 excludeTarget(int i7, boolean z6) {
        for (int i8 = 0; i8 < this.f6720k.size(); i8++) {
            this.f6720k.get(i8).excludeTarget(i7, z6);
        }
        return super.excludeTarget(i7, z6);
    }

    @Override // androidx.transition.j0
    @d.o0
    public j0 excludeTarget(@d.o0 Class<?> cls, boolean z6) {
        for (int i7 = 0; i7 < this.f6720k.size(); i7++) {
            this.f6720k.get(i7).excludeTarget(cls, z6);
        }
        return super.excludeTarget(cls, z6);
    }
}
