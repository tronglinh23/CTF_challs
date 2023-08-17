package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import d.b1;
import d.o0;
@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new Parcelable.Creator<ParcelableSparseIntArray>() { // from class: com.google.android.material.internal.ParcelableSparseIntArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public ParcelableSparseIntArray createFromParcel(@o0 Parcel parcel) {
            int readInt = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(readInt);
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i7 = 0; i7 < readInt; i7++) {
                parcelableSparseIntArray.put(iArr[i7], iArr2[i7]);
            }
            return parcelableSparseIntArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public ParcelableSparseIntArray[] newArray(int i7) {
            return new ParcelableSparseIntArray[i7];
        }
    };

    public ParcelableSparseIntArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i7) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i8 = 0; i8 < size(); i8++) {
            iArr[i8] = keyAt(i8);
            iArr2[i8] = valueAt(i8);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }

    public ParcelableSparseIntArray(int i7) {
        super(i7);
    }

    public ParcelableSparseIntArray(@o0 SparseIntArray sparseIntArray) {
        for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
            put(sparseIntArray.keyAt(i7), sparseIntArray.valueAt(i7));
        }
    }
}
