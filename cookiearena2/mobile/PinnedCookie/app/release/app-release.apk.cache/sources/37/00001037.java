package h1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import d.w0;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    @Deprecated
    /* loaded from: classes.dex */
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z6);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class b implements a {
    }

    /* renamed from: h1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class AccessibilityManagerAccessibilityStateChangeListenerC0116c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public a f10164b;

        public AccessibilityManagerAccessibilityStateChangeListenerC0116c(@d.o0 a aVar) {
            this.f10164b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC0116c) {
                return this.f10164b.equals(((AccessibilityManagerAccessibilityStateChangeListenerC0116c) obj).f10164b);
            }
            return false;
        }

        public int hashCode() {
            return this.f10164b.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z6) {
            this.f10164b.onAccessibilityStateChanged(z6);
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static boolean a(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
        }

        @d.u
        public static boolean b(AccessibilityManager accessibilityManager, e eVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void onTouchExplorationStateChanged(boolean z6);
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final e f10165a;

        public f(@d.o0 e eVar) {
            this.f10165a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f10165a.equals(((f) obj).f10165a);
            }
            return false;
        }

        public int hashCode() {
            return this.f10165a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z6) {
            this.f10165a.onTouchExplorationStateChanged(z6);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0116c(aVar));
    }

    public static boolean b(@d.o0 AccessibilityManager accessibilityManager, @d.o0 e eVar) {
        return d.a(accessibilityManager, eVar);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> c(AccessibilityManager accessibilityManager, int i7) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i7);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> d(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    @Deprecated
    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean f(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC0116c(aVar));
    }

    public static boolean g(@d.o0 AccessibilityManager accessibilityManager, @d.o0 e eVar) {
        return d.b(accessibilityManager, eVar);
    }
}