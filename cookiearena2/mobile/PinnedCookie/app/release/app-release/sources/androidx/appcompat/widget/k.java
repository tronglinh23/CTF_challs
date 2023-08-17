package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
public class k {
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f1684a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1685b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1686c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1687d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1688e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1689f;

    public k(@d.o0 CompoundButton compoundButton) {
        this.f1684a = compoundButton;
    }

    public void a() {
        Drawable a7 = k1.d.a(this.f1684a);
        if (a7 != null) {
            if (this.f1687d || this.f1688e) {
                Drawable mutate = q0.c.r(a7).mutate();
                if (this.f1687d) {
                    q0.c.o(mutate, this.f1685b);
                }
                if (this.f1688e) {
                    q0.c.p(mutate, this.f1686c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1684a.getDrawableState());
                }
                this.f1684a.setButtonDrawable(mutate);
            }
        }
    }

    public int b(int i7) {
        return i7;
    }

    public ColorStateList c() {
        return this.f1685b;
    }

    public PorterDuff.Mode d() {
        return this.f1686c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: all -> 0x008e, TryCatch #1 {all -> 0x008e, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0041, B:13:0x0049, B:15:0x0051, B:16:0x005e, B:18:0x0066, B:19:0x0071, B:21:0x0079), top: B:30:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #1 {all -> 0x008e, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:11:0x0041, B:13:0x0049, B:15:0x0051, B:16:0x005e, B:18:0x0066, B:19:0x0071, B:21:0x0079), top: B:30:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(@d.q0 android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f1684a
            android.content.Context r0 = r0.getContext()
            int[] r1 = f.a.m.f9607x3
            r2 = 0
            androidx.appcompat.widget.t1 r0 = androidx.appcompat.widget.t1.G(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f1684a
            android.content.Context r4 = r3.getContext()
            int[] r5 = f.a.m.f9607x3
            android.content.res.TypedArray r7 = r0.B()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.u1.z1(r3, r4, r5, r6, r7, r8, r9)
            int r11 = f.a.m.f9621z3     // Catch: java.lang.Throwable -> L8e
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L3e
            int r11 = f.a.m.f9621z3     // Catch: java.lang.Throwable -> L8e
            int r11 = r0.u(r11, r2)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L3e
            android.widget.CompoundButton r12 = r10.f1684a     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8e
            android.content.Context r1 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8e
            android.graphics.drawable.Drawable r11 = g.a.b(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8e
            r12.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L3e java.lang.Throwable -> L8e
            r11 = 1
            goto L3f
        L3e:
            r11 = r2
        L3f:
            if (r11 != 0) goto L5e
            int r11 = f.a.m.f9614y3     // Catch: java.lang.Throwable -> L8e
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L5e
            int r11 = f.a.m.f9614y3     // Catch: java.lang.Throwable -> L8e
            int r11 = r0.u(r11, r2)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L5e
            android.widget.CompoundButton r12 = r10.f1684a     // Catch: java.lang.Throwable -> L8e
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L8e
            android.graphics.drawable.Drawable r11 = g.a.b(r1, r11)     // Catch: java.lang.Throwable -> L8e
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L8e
        L5e:
            int r11 = f.a.m.A3     // Catch: java.lang.Throwable -> L8e
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L71
            android.widget.CompoundButton r11 = r10.f1684a     // Catch: java.lang.Throwable -> L8e
            int r12 = f.a.m.A3     // Catch: java.lang.Throwable -> L8e
            android.content.res.ColorStateList r12 = r0.d(r12)     // Catch: java.lang.Throwable -> L8e
            k1.d.d(r11, r12)     // Catch: java.lang.Throwable -> L8e
        L71:
            int r11 = f.a.m.B3     // Catch: java.lang.Throwable -> L8e
            boolean r11 = r0.C(r11)     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L8a
            android.widget.CompoundButton r11 = r10.f1684a     // Catch: java.lang.Throwable -> L8e
            int r12 = f.a.m.B3     // Catch: java.lang.Throwable -> L8e
            r1 = -1
            int r12 = r0.o(r12, r1)     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.q0.e(r12, r1)     // Catch: java.lang.Throwable -> L8e
            k1.d.e(r11, r12)     // Catch: java.lang.Throwable -> L8e
        L8a:
            r0.I()
            return
        L8e:
            r11 = move-exception
            r0.I()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.e(android.util.AttributeSet, int):void");
    }

    public void f() {
        if (this.f1689f) {
            this.f1689f = false;
            return;
        }
        this.f1689f = true;
        a();
    }

    public void g(ColorStateList colorStateList) {
        this.f1685b = colorStateList;
        this.f1687d = true;
        a();
    }

    public void h(@d.q0 PorterDuff.Mode mode) {
        this.f1686c = mode;
        this.f1688e = true;
        a();
    }
}
