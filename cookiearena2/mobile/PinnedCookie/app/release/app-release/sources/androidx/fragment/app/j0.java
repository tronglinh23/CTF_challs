package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<String> f4394k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<String> f4395l;

    /* renamed from: m  reason: collision with root package name */
    public b[] f4396m;

    /* renamed from: n  reason: collision with root package name */
    public int f4397n;

    /* renamed from: o  reason: collision with root package name */
    public String f4398o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<String> f4399p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<c> f4400q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<FragmentManager.n> f4401r;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<j0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public j0 createFromParcel(Parcel parcel) {
            return new j0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public j0[] newArray(int i7) {
            return new j0[i7];
        }
    }

    public j0() {
        this.f4398o = null;
        this.f4399p = new ArrayList<>();
        this.f4400q = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f4394k);
        parcel.writeStringList(this.f4395l);
        parcel.writeTypedArray(this.f4396m, i7);
        parcel.writeInt(this.f4397n);
        parcel.writeString(this.f4398o);
        parcel.writeStringList(this.f4399p);
        parcel.writeTypedList(this.f4400q);
        parcel.writeTypedList(this.f4401r);
    }

    public j0(Parcel parcel) {
        this.f4398o = null;
        this.f4399p = new ArrayList<>();
        this.f4400q = new ArrayList<>();
        this.f4394k = parcel.createStringArrayList();
        this.f4395l = parcel.createStringArrayList();
        this.f4396m = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f4397n = parcel.readInt();
        this.f4398o = parcel.readString();
        this.f4399p = parcel.createStringArrayList();
        this.f4400q = parcel.createTypedArrayList(c.CREATOR);
        this.f4401r = parcel.createTypedArrayList(FragmentManager.n.CREATOR);
    }
}
