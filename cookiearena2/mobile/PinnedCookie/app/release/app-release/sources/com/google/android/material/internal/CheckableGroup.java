package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.MaterialCheckable;
import d.b1;
import d.d0;
import d.k1;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
@b1({b1.a.LIBRARY_GROUP})
@k1
/* loaded from: classes.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables = new HashMap();
    private final Set<Integer> checkedIds = new HashSet();
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    /* loaded from: classes.dex */
    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@o0 Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(@o0 MaterialCheckable<T> materialCheckable) {
        int id = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        T t6 = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (t6 != null) {
            uncheckInternal(t6, false);
        }
        boolean add = this.checkedIds.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(@o0 MaterialCheckable<T> materialCheckable, boolean z6) {
        int id = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id))) {
            if (z6 && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id))) {
                materialCheckable.setChecked(true);
                return false;
            }
            boolean remove = this.checkedIds.remove(Integer.valueOf(id));
            if (materialCheckable.isChecked()) {
                materialCheckable.setChecked(false);
            }
            return remove;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t6) {
        this.checkables.put(Integer.valueOf(t6.getId()), t6);
        if (t6.isChecked()) {
            checkInternal(t6);
        }
        t6.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public /* bridge */ /* synthetic */ void onCheckedChanged(Object obj, boolean z6) {
                onCheckedChanged((AnonymousClass1) ((MaterialCheckable) obj), z6);
            }

            public void onCheckedChanged(T t7, boolean z6) {
                if (!z6) {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!checkableGroup.uncheckInternal(t7, checkableGroup.selectionRequired)) {
                        return;
                    }
                } else if (!CheckableGroup.this.checkInternal(t7)) {
                    return;
                }
                CheckableGroup.this.onCheckedStateChanged();
            }
        });
    }

    public void check(@d0 int i7) {
        T t6 = this.checkables.get(Integer.valueOf(i7));
        if (t6 != null && checkInternal(t6)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean z6 = !this.checkedIds.isEmpty();
        Iterator<T> it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (z6) {
            onCheckedStateChanged();
        }
    }

    @o0
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    @o0
    public List<Integer> getCheckedIdsSortedByChildOrder(@o0 ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @d0
    public int getSingleCheckedId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void removeCheckable(T t6) {
        t6.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(t6.getId()));
        this.checkedIds.remove(Integer.valueOf(t6.getId()));
    }

    public void setOnCheckedStateChangeListener(@q0 OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z6) {
        this.selectionRequired = z6;
    }

    public void setSingleSelection(boolean z6) {
        if (this.singleSelection != z6) {
            this.singleSelection = z6;
            clearCheck();
        }
    }

    public void uncheck(@d0 int i7) {
        T t6 = this.checkables.get(Integer.valueOf(i7));
        if (t6 != null && uncheckInternal(t6, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }
}
