package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import d.b1;
import f0.a;
import h1.f0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: androidx.core.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0034a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f3520a;

        public C0034a(a aVar) {
            this.f3520a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3520a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @d.w0(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            h1.o0 accessibilityNodeProvider = this.f3520a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3520a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            h1.f0 g22 = h1.f0.g2(accessibilityNodeInfo);
            g22.L1(u1.Z0(view));
            g22.p1(u1.N0(view));
            g22.E1(u1.J(view));
            g22.R1(u1.v0(view));
            this.f3520a.onInitializeAccessibilityNodeInfo(view, g22);
            g22.f(accessibilityNodeInfo.getText(), view);
            List<f0.a> actionList = a.getActionList(view);
            for (int i7 = 0; i7 < actionList.size(); i7++) {
                g22.b(actionList.get(i7));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3520a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3520a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            return this.f3520a.performAccessibilityAction(view, i7, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i7) {
            this.f3520a.sendAccessibilityEvent(view, i7);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3520a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @d.u
        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i7, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i7, bundle);
        }
    }

    public a() {
        this(DEFAULT_DELEGATE);
    }

    public static List<f0.a> getActionList(View view) {
        List<f0.a> list = (List) view.getTag(a.e.f9694d0);
        return list == null ? Collections.emptyList() : list;
    }

    public final boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] x6 = h1.f0.x(view.createAccessibilityNodeInfo().getText());
            for (int i7 = 0; x6 != null && i7 < x6.length; i7++) {
                if (clickableSpan.equals(x6[i7])) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(int i7, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a.e.f9696e0);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i7)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (a(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(@d.o0 View view, @d.o0 AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @d.q0
    public h1.o0 getAccessibilityNodeProvider(@d.o0 View view) {
        AccessibilityNodeProvider a7 = b.a(this.mOriginalDelegate, view);
        if (a7 != null) {
            return new h1.o0(a7);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(@d.o0 View view, @d.o0 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@d.o0 View view, @d.o0 h1.f0 f0Var) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, f0Var.f2());
    }

    public void onPopulateAccessibilityEvent(@d.o0 View view, @d.o0 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(@d.o0 ViewGroup viewGroup, @d.o0 View view, @d.o0 AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(@d.o0 View view, int i7, @d.q0 Bundle bundle) {
        List<f0.a> actionList = getActionList(view);
        boolean z6 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= actionList.size()) {
                break;
            }
            f0.a aVar = actionList.get(i8);
            if (aVar.b() == i7) {
                z6 = aVar.d(view, bundle);
                break;
            }
            i8++;
        }
        if (!z6) {
            z6 = b.b(this.mOriginalDelegate, view, i7, bundle);
        }
        return (z6 || i7 != a.e.f9687a || bundle == null) ? z6 : b(bundle.getInt(h1.a.f10134d, -1), view);
    }

    public void sendAccessibilityEvent(@d.o0 View view, int i7) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i7);
    }

    public void sendAccessibilityEventUnchecked(@d.o0 View view, @d.o0 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public a(@d.o0 View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0034a(this);
    }
}
