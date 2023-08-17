package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.u0;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.Map;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: y  reason: collision with root package name */
    public static final String f4300y = "FragmentManager";

    /* renamed from: k  reason: collision with root package name */
    public final int[] f4301k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<String> f4302l;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f4303m;

    /* renamed from: n  reason: collision with root package name */
    public final int[] f4304n;

    /* renamed from: o  reason: collision with root package name */
    public final int f4305o;

    /* renamed from: p  reason: collision with root package name */
    public final String f4306p;

    /* renamed from: q  reason: collision with root package name */
    public final int f4307q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4308r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f4309s;

    /* renamed from: t  reason: collision with root package name */
    public final int f4310t;

    /* renamed from: u  reason: collision with root package name */
    public final CharSequence f4311u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f4312v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f4313w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f4314x;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i7) {
            return new b[i7];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f4529c.size();
        this.f4301k = new int[size * 6];
        if (aVar.f4535i) {
            this.f4302l = new ArrayList<>(size);
            this.f4303m = new int[size];
            this.f4304n = new int[size];
            int i7 = 0;
            int i8 = 0;
            while (i7 < size) {
                u0.a aVar2 = aVar.f4529c.get(i7);
                int i9 = i8 + 1;
                this.f4301k[i8] = aVar2.f4546a;
                ArrayList<String> arrayList = this.f4302l;
                Fragment fragment = aVar2.f4547b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f4301k;
                int i10 = i9 + 1;
                iArr[i9] = aVar2.f4548c ? 1 : 0;
                int i11 = i10 + 1;
                iArr[i10] = aVar2.f4549d;
                int i12 = i11 + 1;
                iArr[i11] = aVar2.f4550e;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f4551f;
                iArr[i13] = aVar2.f4552g;
                this.f4303m[i7] = aVar2.f4553h.ordinal();
                this.f4304n[i7] = aVar2.f4554i.ordinal();
                i7++;
                i8 = i13 + 1;
            }
            this.f4305o = aVar.f4534h;
            this.f4306p = aVar.f4537k;
            this.f4307q = aVar.P;
            this.f4308r = aVar.f4538l;
            this.f4309s = aVar.f4539m;
            this.f4310t = aVar.f4540n;
            this.f4311u = aVar.f4541o;
            this.f4312v = aVar.f4542p;
            this.f4313w = aVar.f4543q;
            this.f4314x = aVar.f4544r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(@d.o0 androidx.fragment.app.a aVar) {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            boolean z6 = true;
            if (i7 >= this.f4301k.length) {
                aVar.f4534h = this.f4305o;
                aVar.f4537k = this.f4306p;
                aVar.f4535i = true;
                aVar.f4538l = this.f4308r;
                aVar.f4539m = this.f4309s;
                aVar.f4540n = this.f4310t;
                aVar.f4541o = this.f4311u;
                aVar.f4542p = this.f4312v;
                aVar.f4543q = this.f4313w;
                aVar.f4544r = this.f4314x;
                return;
            }
            u0.a aVar2 = new u0.a();
            int i9 = i7 + 1;
            aVar2.f4546a = this.f4301k[i7];
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i8);
                sb.append(" base fragment #");
                sb.append(this.f4301k[i9]);
            }
            aVar2.f4553h = p.b.values()[this.f4303m[i8]];
            aVar2.f4554i = p.b.values()[this.f4304n[i8]];
            int[] iArr = this.f4301k;
            int i10 = i9 + 1;
            if (iArr[i9] == 0) {
                z6 = false;
            }
            aVar2.f4548c = z6;
            int i11 = i10 + 1;
            int i12 = iArr[i10];
            aVar2.f4549d = i12;
            int i13 = i11 + 1;
            int i14 = iArr[i11];
            aVar2.f4550e = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f4551f = i16;
            int i17 = iArr[i15];
            aVar2.f4552g = i17;
            aVar.f4530d = i12;
            aVar.f4531e = i14;
            aVar.f4532f = i16;
            aVar.f4533g = i17;
            aVar.m(aVar2);
            i8++;
            i7 = i15 + 1;
        }
    }

    @d.o0
    public androidx.fragment.app.a b(@d.o0 FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.P = this.f4307q;
        for (int i7 = 0; i7 < this.f4302l.size(); i7++) {
            String str = this.f4302l.get(i7);
            if (str != null) {
                aVar.f4529c.get(i7).f4547b = fragmentManager.o0(str);
            }
        }
        aVar.U(1);
        return aVar;
    }

    @d.o0
    public androidx.fragment.app.a c(@d.o0 FragmentManager fragmentManager, @d.o0 Map<String, Fragment> map) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        for (int i7 = 0; i7 < this.f4302l.size(); i7++) {
            String str = this.f4302l.get(i7);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f4306p + " failed due to missing saved state for Fragment (" + str + ")");
                }
                aVar.f4529c.get(i7).f4547b = fragment;
            }
        }
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f4301k);
        parcel.writeStringList(this.f4302l);
        parcel.writeIntArray(this.f4303m);
        parcel.writeIntArray(this.f4304n);
        parcel.writeInt(this.f4305o);
        parcel.writeString(this.f4306p);
        parcel.writeInt(this.f4307q);
        parcel.writeInt(this.f4308r);
        TextUtils.writeToParcel(this.f4309s, parcel, 0);
        parcel.writeInt(this.f4310t);
        TextUtils.writeToParcel(this.f4311u, parcel, 0);
        parcel.writeStringList(this.f4312v);
        parcel.writeStringList(this.f4313w);
        parcel.writeInt(this.f4314x ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f4301k = parcel.createIntArray();
        this.f4302l = parcel.createStringArrayList();
        this.f4303m = parcel.createIntArray();
        this.f4304n = parcel.createIntArray();
        this.f4305o = parcel.readInt();
        this.f4306p = parcel.readString();
        this.f4307q = parcel.readInt();
        this.f4308r = parcel.readInt();
        this.f4309s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4310t = parcel.readInt();
        this.f4311u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4312v = parcel.createStringArrayList();
        this.f4313w = parcel.createStringArrayList();
        this.f4314x = parcel.readInt() != 0;
    }
}
