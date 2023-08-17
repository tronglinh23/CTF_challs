package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.m;
import d.o0;
import d.q0;
import o1.a;

/* loaded from: classes.dex */
public class ExtendableSavedState extends a {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        @Override // android.os.Parcelable.Creator
        @o0
        public ExtendableSavedState[] newArray(int i7) {
            return new ExtendableSavedState[i7];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @o0
        public ExtendableSavedState createFromParcel(@o0 Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.material.stateful.ExtendableSavedState$1, java.lang.ClassLoader] */
        @Override // android.os.Parcelable.Creator
        @q0
        public ExtendableSavedState createFromParcel(@o0 Parcel parcel) {
            ?? r12 = 0;
            return new ExtendableSavedState(parcel, r12);
        }
    };
    @o0
    public final m<String, Bundle> extendableStates;

    @o0
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + "}";
    }

    @Override // o1.a, android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        int size = this.extendableStates.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i8 = 0; i8 < size; i8++) {
            strArr[i8] = this.extendableStates.k(i8);
            bundleArr[i8] = this.extendableStates.o(i8);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new m<>();
    }

    private ExtendableSavedState(@o0 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new m<>(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            this.extendableStates.put(strArr[i7], bundleArr[i7]);
        }
    }
}