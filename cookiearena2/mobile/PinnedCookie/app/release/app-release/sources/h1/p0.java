package h1;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import d.w0;
import java.util.List;
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityRecord f10246a;

    @w0(15)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @d.u
        public static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @d.u
        public static void c(AccessibilityRecord accessibilityRecord, int i7) {
            accessibilityRecord.setMaxScrollX(i7);
        }

        @d.u
        public static void d(AccessibilityRecord accessibilityRecord, int i7) {
            accessibilityRecord.setMaxScrollY(i7);
        }
    }

    @w0(16)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static void a(AccessibilityRecord accessibilityRecord, View view, int i7) {
            accessibilityRecord.setSource(view, i7);
        }
    }

    @Deprecated
    public p0(Object obj) {
        this.f10246a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static p0 A(p0 p0Var) {
        return new p0(AccessibilityRecord.obtain(p0Var.f10246a));
    }

    public static void N(@d.o0 AccessibilityRecord accessibilityRecord, int i7) {
        a.c(accessibilityRecord, i7);
    }

    public static void P(@d.o0 AccessibilityRecord accessibilityRecord, int i7) {
        a.d(accessibilityRecord, i7);
    }

    public static void Y(@d.o0 AccessibilityRecord accessibilityRecord, @d.q0 View view, int i7) {
        b.a(accessibilityRecord, view, i7);
    }

    public static int j(@d.o0 AccessibilityRecord accessibilityRecord) {
        return a.a(accessibilityRecord);
    }

    public static int l(@d.o0 AccessibilityRecord accessibilityRecord) {
        return a.b(accessibilityRecord);
    }

    @Deprecated
    public static p0 z() {
        return new p0(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f10246a.recycle();
    }

    @Deprecated
    public void C(int i7) {
        this.f10246a.setAddedCount(i7);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f10246a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z6) {
        this.f10246a.setChecked(z6);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f10246a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f10246a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i7) {
        this.f10246a.setCurrentItemIndex(i7);
    }

    @Deprecated
    public void I(boolean z6) {
        this.f10246a.setEnabled(z6);
    }

    @Deprecated
    public void J(int i7) {
        this.f10246a.setFromIndex(i7);
    }

    @Deprecated
    public void K(boolean z6) {
        this.f10246a.setFullScreen(z6);
    }

    @Deprecated
    public void L(int i7) {
        this.f10246a.setItemCount(i7);
    }

    @Deprecated
    public void M(int i7) {
        N(this.f10246a, i7);
    }

    @Deprecated
    public void O(int i7) {
        P(this.f10246a, i7);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f10246a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z6) {
        this.f10246a.setPassword(z6);
    }

    @Deprecated
    public void S(int i7) {
        this.f10246a.setRemovedCount(i7);
    }

    @Deprecated
    public void T(int i7) {
        this.f10246a.setScrollX(i7);
    }

    @Deprecated
    public void U(int i7) {
        this.f10246a.setScrollY(i7);
    }

    @Deprecated
    public void V(boolean z6) {
        this.f10246a.setScrollable(z6);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void W(View view) {
        this.f10246a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i7) {
        Y(this.f10246a, view, i7);
    }

    @Deprecated
    public void Z(int i7) {
        this.f10246a.setToIndex(i7);
    }

    @Deprecated
    public int a() {
        return this.f10246a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f10246a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f10246a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f10246a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f10246a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            AccessibilityRecord accessibilityRecord = this.f10246a;
            return accessibilityRecord == null ? p0Var.f10246a == null : accessibilityRecord.equals(p0Var.f10246a);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.f10246a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f10246a;
    }

    @Deprecated
    public int h() {
        return this.f10246a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f10246a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return j(this.f10246a);
    }

    @Deprecated
    public int k() {
        return l(this.f10246a);
    }

    @Deprecated
    public Parcelable m() {
        return this.f10246a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f10246a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f10246a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f10246a.getScrollY();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public f0 q() {
        return f0.h2(this.f10246a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f10246a.getText();
    }

    @Deprecated
    public int s() {
        return this.f10246a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f10246a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f10246a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f10246a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f10246a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f10246a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f10246a.isScrollable();
    }
}
