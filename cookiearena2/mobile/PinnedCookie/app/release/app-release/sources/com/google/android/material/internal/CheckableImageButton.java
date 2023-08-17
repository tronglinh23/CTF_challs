package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.q;
import androidx.core.view.u1;
import d.b1;
import d.o0;
import f.a;
import h1.f0;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class CheckableImageButton extends q implements Checkable {
    private static final int[] DRAWABLE_STATE_CHECKED = {16842912};
    private boolean checkable;
    private boolean checked;
    private boolean pressable;

    /* loaded from: classes.dex */
    public static class SavedState extends o1.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.internal.CheckableImageButton.SavedState.1
            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @o0
            public SavedState createFromParcel(@o0 Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        boolean checked;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(@o0 Parcel parcel) {
            this.checked = parcel.readInt() == 1;
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(@o0 Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.checked ? 1 : 0);
        }

        public SavedState(@o0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isPressable() {
        return this.pressable;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i7) {
        if (this.checked) {
            int[] iArr = DRAWABLE_STATE_CHECKED;
            return View.mergeDrawableStates(super.onCreateDrawableState(i7 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i7);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.checked);
    }

    @Override // android.view.View
    @o0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    public void setCheckable(boolean z6) {
        if (this.checkable != z6) {
            this.checkable = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.checkable || this.checked == z6) {
            return;
        }
        this.checked = z6;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z6) {
        this.pressable = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.pressable) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.K1);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.checkable = true;
        this.pressable = true;
        u1.B1(this, new androidx.core.view.a() { // from class: com.google.android.material.internal.CheckableImageButton.1
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityEvent(View view, @o0 AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, @o0 f0 f0Var) {
                super.onInitializeAccessibilityNodeInfo(view, f0Var);
                f0Var.Z0(CheckableImageButton.this.isCheckable());
                f0Var.a1(CheckableImageButton.this.isChecked());
            }
        });
    }
}
