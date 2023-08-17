package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import d.q0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a implements Parcelable {
    @o0
    public static final Parcelable.Creator<a> CREATOR = new C0015a();

    /* renamed from: k  reason: collision with root package name */
    public final int f585k;
    @q0

    /* renamed from: l  reason: collision with root package name */
    public final Intent f586l;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0015a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@o0 Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public a(int i7, @q0 Intent intent) {
        this.f585k = i7;
        this.f586l = intent;
    }

    @o0
    public static String c(int i7) {
        return i7 != -1 ? i7 != 0 ? String.valueOf(i7) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @q0
    public Intent a() {
        return this.f586l;
    }

    public int b() {
        return this.f585k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f585k) + ", data=" + this.f586l + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i7) {
        parcel.writeInt(this.f585k);
        parcel.writeInt(this.f586l == null ? 0 : 1);
        Intent intent = this.f586l;
        if (intent != null) {
            intent.writeToParcel(parcel, i7);
        }
    }

    public a(Parcel parcel) {
        this.f585k = parcel.readInt();
        this.f586l = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}