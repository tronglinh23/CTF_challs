package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    public final List<String> f4332k;

    /* renamed from: l  reason: collision with root package name */
    public final List<b> f4333l;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i7) {
            return new c[i7];
        }
    }

    public c(List<String> list, List<b> list2) {
        this.f4332k = list;
        this.f4333l = list2;
    }

    @d.o0
    public List<androidx.fragment.app.a> a(@d.o0 FragmentManager fragmentManager, Map<String, Fragment> map) {
        HashMap hashMap = new HashMap(this.f4332k.size());
        for (String str : this.f4332k) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                Bundle C = fragmentManager.I0().C(str, null);
                if (C != null) {
                    ClassLoader classLoader = fragmentManager.K0().k().getClassLoader();
                    Fragment a7 = ((p0) C.getParcelable("state")).a(fragmentManager.H0(), classLoader);
                    a7.mSavedFragmentState = C;
                    if (C.getBundle(q0.f4467h) == null) {
                        a7.mSavedFragmentState.putBundle(q0.f4467h, new Bundle());
                    }
                    Bundle bundle = C.getBundle(q0.f4472m);
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    a7.setArguments(bundle);
                    hashMap.put(a7.mWho, a7);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.f4333l.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c(fragmentManager, hashMap));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@d.o0 Parcel parcel, int i7) {
        parcel.writeStringList(this.f4332k);
        parcel.writeTypedList(this.f4333l);
    }

    public c(@d.o0 Parcel parcel) {
        this.f4332k = parcel.createStringArrayList();
        this.f4333l = parcel.createTypedArrayList(b.CREATOR);
    }
}
