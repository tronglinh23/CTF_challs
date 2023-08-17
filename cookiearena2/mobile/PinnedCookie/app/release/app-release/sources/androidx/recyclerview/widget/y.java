package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.u1;
import d.o0;
import d.q0;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class y extends androidx.core.view.a {
    private final a mItemDelegate;
    final RecyclerView mRecyclerView;

    /* loaded from: classes.dex */
    public static class a extends androidx.core.view.a {

        /* renamed from: a  reason: collision with root package name */
        public final y f5636a;

        /* renamed from: b  reason: collision with root package name */
        public Map<View, androidx.core.view.a> f5637b = new WeakHashMap();

        public a(@o0 y yVar) {
            this.f5636a = yVar;
        }

        public androidx.core.view.a c(View view) {
            return this.f5637b.remove(view);
        }

        public void d(View view) {
            androidx.core.view.a E = u1.E(view);
            if (E == null || E == this) {
                return;
            }
            this.f5637b.put(view, E);
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5637b.get(view);
            return aVar != null ? aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        @q0
        public h1.o0 getAccessibilityNodeProvider(@o0 View view) {
            androidx.core.view.a aVar = this.f5637b.get(view);
            return aVar != null ? aVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5637b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, h1.f0 f0Var) {
            if (this.f5636a.shouldIgnore() || this.f5636a.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, f0Var);
                return;
            }
            this.f5636a.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, f0Var);
            androidx.core.view.a aVar = this.f5637b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, f0Var);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, f0Var);
            }
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5637b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(@o0 ViewGroup viewGroup, @o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5637b.get(viewGroup);
            return aVar != null ? aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
            if (this.f5636a.shouldIgnore() || this.f5636a.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i7, bundle);
            }
            androidx.core.view.a aVar = this.f5637b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i7, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i7, bundle)) {
                return true;
            }
            return this.f5636a.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i7, bundle);
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEvent(@o0 View view, int i7) {
            androidx.core.view.a aVar = this.f5637b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i7);
            } else {
                super.sendAccessibilityEvent(view, i7);
            }
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEventUnchecked(@o0 View view, @o0 AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f5637b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public y(@o0 RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        androidx.core.view.a itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof a)) {
            this.mItemDelegate = new a(this);
        } else {
            this.mItemDelegate = (a) itemDelegate;
        }
    }

    @o0
    public androidx.core.view.a getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, h1.f0 f0Var) {
        super.onInitializeAccessibilityNodeInfo(view, f0Var);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(f0Var);
    }

    @Override // androidx.core.view.a
    public boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        if (super.performAccessibilityAction(view, i7, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i7, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
