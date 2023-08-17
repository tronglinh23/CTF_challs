package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.p;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final String f4450k;

    /* renamed from: l  reason: collision with root package name */
    public final String f4451l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f4452m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4453n;

    /* renamed from: o  reason: collision with root package name */
    public final int f4454o;

    /* renamed from: p  reason: collision with root package name */
    public final String f4455p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f4456q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f4457r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f4458s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f4459t;

    /* renamed from: u  reason: collision with root package name */
    public final int f4460u;

    /* renamed from: v  reason: collision with root package name */
    public final String f4461v;

    /* renamed from: w  reason: collision with root package name */
    public final int f4462w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f4463x;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<p0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public p0 createFromParcel(Parcel parcel) {
            return new p0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public p0[] newArray(int i7) {
            return new p0[i7];
        }
    }

    public p0(Fragment fragment) {
        this.f4450k = fragment.getClass().getName();
        this.f4451l = fragment.mWho;
        this.f4452m = fragment.mFromLayout;
        this.f4453n = fragment.mFragmentId;
        this.f4454o = fragment.mContainerId;
        this.f4455p = fragment.mTag;
        this.f4456q = fragment.mRetainInstance;
        this.f4457r = fragment.mRemoving;
        this.f4458s = fragment.mDetached;
        this.f4459t = fragment.mHidden;
        this.f4460u = fragment.mMaxState.ordinal();
        this.f4461v = fragment.mTargetWho;
        this.f4462w = fragment.mTargetRequestCode;
        this.f4463x = fragment.mUserVisibleHint;
    }

    @d.o0
    public Fragment a(@d.o0 v vVar, @d.o0 ClassLoader classLoader) {
        Fragment a7 = vVar.a(classLoader, this.f4450k);
        a7.mWho = this.f4451l;
        a7.mFromLayout = this.f4452m;
        a7.mRestored = true;
        a7.mFragmentId = this.f4453n;
        a7.mContainerId = this.f4454o;
        a7.mTag = this.f4455p;
        a7.mRetainInstance = this.f4456q;
        a7.mRemoving = this.f4457r;
        a7.mDetached = this.f4458s;
        a7.mHidden = this.f4459t;
        a7.mMaxState = p.b.values()[this.f4460u];
        a7.mTargetWho = this.f4461v;
        a7.mTargetRequestCode = this.f4462w;
        a7.mUserVisibleHint = this.f4463x;
        return a7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @d.o0
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f4450k);
        sb.append(" (");
        sb.append(this.f4451l);
        sb.append(")}:");
        if (this.f4452m) {
            sb.append(" fromLayout");
        }
        if (this.f4454o != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4454o));
        }
        String str = this.f4455p;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f4455p);
        }
        if (this.f4456q) {
            sb.append(" retainInstance");
        }
        if (this.f4457r) {
            sb.append(" removing");
        }
        if (this.f4458s) {
            sb.append(" detached");
        }
        if (this.f4459t) {
            sb.append(" hidden");
        }
        if (this.f4461v != null) {
            sb.append(" targetWho=");
            sb.append(this.f4461v);
            sb.append(" targetRequestCode=");
            sb.append(this.f4462w);
        }
        if (this.f4463x) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f4450k);
        parcel.writeString(this.f4451l);
        parcel.writeInt(this.f4452m ? 1 : 0);
        parcel.writeInt(this.f4453n);
        parcel.writeInt(this.f4454o);
        parcel.writeString(this.f4455p);
        parcel.writeInt(this.f4456q ? 1 : 0);
        parcel.writeInt(this.f4457r ? 1 : 0);
        parcel.writeInt(this.f4458s ? 1 : 0);
        parcel.writeInt(this.f4459t ? 1 : 0);
        parcel.writeInt(this.f4460u);
        parcel.writeString(this.f4461v);
        parcel.writeInt(this.f4462w);
        parcel.writeInt(this.f4463x ? 1 : 0);
    }

    public p0(Parcel parcel) {
        this.f4450k = parcel.readString();
        this.f4451l = parcel.readString();
        this.f4452m = parcel.readInt() != 0;
        this.f4453n = parcel.readInt();
        this.f4454o = parcel.readInt();
        this.f4455p = parcel.readString();
        this.f4456q = parcel.readInt() != 0;
        this.f4457r = parcel.readInt() != 0;
        this.f4458s = parcel.readInt() != 0;
        this.f4459t = parcel.readInt() != 0;
        this.f4460u = parcel.readInt();
        this.f4461v = parcel.readString();
        this.f4462w = parcel.readInt();
        this.f4463x = parcel.readInt() != 0;
    }
}
