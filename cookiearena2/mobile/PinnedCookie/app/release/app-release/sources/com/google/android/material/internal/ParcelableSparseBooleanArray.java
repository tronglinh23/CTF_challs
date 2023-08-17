package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import d.b1;
import d.o0;
@b1({b1.a.f8134l})
/* loaded from: classes.dex */
public class ParcelableSparseBooleanArray extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseBooleanArray> CREATOR = new Parcelable.Creator<ParcelableSparseBooleanArray>() { // from class: com.google.android.material.internal.ParcelableSparseBooleanArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public ParcelableSparseBooleanArray createFromParcel(@o0 Parcel parcel) {
            int readInt = parcel.readInt();
            ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(readInt);
            int[] iArr = new int[readInt];
            boolean[] zArr = new boolean[readInt];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i7 = 0; i7 < readInt; i7++) {
                parcelableSparseBooleanArray.put(iArr[i7], zArr[i7]);
            }
            return parcelableSparseBooleanArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @o0
        public ParcelableSparseBooleanArray[] newArray(int i7) {
            return new ParcelableSparseBooleanArray[i7];
        }
    };

    public ParcelableSparseBooleanArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i7) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i8 = 0; i8 < size(); i8++) {
            iArr[i8] = keyAt(i8);
            zArr[i8] = valueAt(i8);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }

    public ParcelableSparseBooleanArray(int i7) {
        super(i7);
    }

    public ParcelableSparseBooleanArray(@o0 SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            put(sparseBooleanArray.keyAt(i7), sparseBooleanArray.valueAt(i7));
        }
    }
}
