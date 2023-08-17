package s2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.p;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class u implements Parcelable {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final String f16457k;

    /* renamed from: l  reason: collision with root package name */
    public final int f16458l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f16459m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public final Bundle f16460n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final b f16456o = new b(null);
    @n6.d
    @s4.e
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public u createFromParcel(@n6.d Parcel parcel) {
            u4.l0.p(parcel, "inParcel");
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i7) {
            return new u[i7];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(u4.w wVar) {
            this();
        }

        public b() {
        }
    }

    public u(@n6.d t tVar) {
        u4.l0.p(tVar, "entry");
        this.f16457k = tVar.f();
        this.f16458l = tVar.e().r();
        this.f16459m = tVar.c();
        Bundle bundle = new Bundle();
        this.f16460n = bundle;
        tVar.j(bundle);
    }

    @n6.e
    public final Bundle a() {
        return this.f16459m;
    }

    public final int b() {
        return this.f16458l;
    }

    @n6.d
    public final String c() {
        return this.f16457k;
    }

    @n6.d
    public final Bundle d() {
        return this.f16460n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @n6.d
    public final t f(@n6.d Context context, @n6.d g0 g0Var, @n6.d p.b bVar, @n6.e y yVar) {
        u4.l0.p(context, "context");
        u4.l0.p(g0Var, "destination");
        u4.l0.p(bVar, "hostLifecycleState");
        Bundle bundle = this.f16459m;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return t.f16429p.a(context, g0Var, bundle, bVar, yVar, this.f16457k, this.f16460n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n6.d Parcel parcel, int i7) {
        u4.l0.p(parcel, "parcel");
        parcel.writeString(this.f16457k);
        parcel.writeInt(this.f16458l);
        parcel.writeBundle(this.f16459m);
        parcel.writeBundle(this.f16460n);
    }

    public u(@n6.d Parcel parcel) {
        u4.l0.p(parcel, "inParcel");
        String readString = parcel.readString();
        u4.l0.m(readString);
        this.f16457k = readString;
        this.f16458l = parcel.readInt();
        this.f16459m = parcel.readBundle(u.class.getClassLoader());
        Bundle readBundle = parcel.readBundle(u.class.getClassLoader());
        u4.l0.m(readBundle);
        this.f16460n = readBundle;
    }
}
