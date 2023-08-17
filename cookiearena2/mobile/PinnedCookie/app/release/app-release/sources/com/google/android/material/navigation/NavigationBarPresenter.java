package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.s;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;
import d.b1;
import d.o0;
import d.q0;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationBarPresenter implements n {
    private int id;
    private g menu;
    private NavigationBarMenuView menuView;
    private boolean updateSuspended = false;

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarPresenter.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        };
        @q0
        ParcelableSparseArray badgeSavedStates;
        int selectedItemId;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i7) {
            parcel.writeInt(this.selectedItemId);
            parcel.writeParcelable(this.badgeSavedStates, 0);
        }

        public SavedState(@o0 Parcel parcel) {
            this.selectedItemId = parcel.readInt();
            this.badgeSavedStates = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(@q0 g gVar, @q0 j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(@q0 g gVar, @q0 j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.id;
    }

    @Override // androidx.appcompat.view.menu.n
    @q0
    public o getMenuView(@q0 ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(@o0 Context context, @o0 g gVar) {
        this.menu = gVar;
        this.menuView.initialize(gVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(@q0 g gVar, boolean z6) {
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(@o0 Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.menuView.tryRestoreSelectedItemId(savedState.selectedItemId);
            this.menuView.restoreBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), savedState.badgeSavedStates));
        }
    }

    @Override // androidx.appcompat.view.menu.n
    @o0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.selectedItemId = this.menuView.getSelectedItemId();
        savedState.badgeSavedStates = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(@q0 s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(@q0 n.a aVar) {
    }

    public void setId(int i7) {
        this.id = i7;
    }

    public void setMenuView(@o0 NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    public void setUpdateSuspended(boolean z6) {
        this.updateSuspended = z6;
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z6) {
        if (this.updateSuspended) {
            return;
        }
        if (z6) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }
}
