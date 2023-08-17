package h1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import d.w0;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f10243b = -1;
    @d.q0

    /* renamed from: a  reason: collision with root package name */
    public final Object f10244a;

    @w0(16)
    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final o0 f10245a;

        public a(o0 o0Var) {
            this.f10245a = o0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
            f0 b7 = this.f10245a.b(i7);
            if (b7 == null) {
                return null;
            }
            return b7.f2();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i7) {
            List<f0> c7 = this.f10245a.c(str, i7);
            if (c7 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c7.size();
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(c7.get(i8).f2());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i7, int i8, Bundle bundle) {
            return this.f10245a.f(i7, i8, bundle);
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(o0 o0Var) {
            super(o0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i7) {
            f0 d7 = this.f10245a.d(i7);
            if (d7 == null) {
                return null;
            }
            return d7.f2();
        }
    }

    @w0(26)
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(o0 o0Var) {
            super(o0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f10245a.a(i7, f0.g2(accessibilityNodeInfo), str, bundle);
        }
    }

    public o0() {
        this.f10244a = new c(this);
    }

    public void a(int i7, @d.o0 f0 f0Var, @d.o0 String str, @d.q0 Bundle bundle) {
    }

    @d.q0
    public f0 b(int i7) {
        return null;
    }

    @d.q0
    public List<f0> c(@d.o0 String str, int i7) {
        return null;
    }

    @d.q0
    public f0 d(int i7) {
        return null;
    }

    @d.q0
    public Object e() {
        return this.f10244a;
    }

    public boolean f(int i7, int i8, @d.q0 Bundle bundle) {
        return false;
    }

    public o0(@d.q0 Object obj) {
        this.f10244a = obj;
    }
}
