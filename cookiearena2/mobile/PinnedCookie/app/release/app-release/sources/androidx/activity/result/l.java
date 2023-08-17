package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import d.q0;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class l implements Parcelable {
    @o0
    public static final Parcelable.Creator<l> CREATOR = new a();
    @o0

    /* renamed from: k  reason: collision with root package name */
    public final IntentSender f595k;
    @q0

    /* renamed from: l  reason: collision with root package name */
    public final Intent f596l;

    /* renamed from: m  reason: collision with root package name */
    public final int f597m;

    /* renamed from: n  reason: collision with root package name */
    public final int f598n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i7) {
            return new l[i7];
        }
    }

    public l(@o0 IntentSender intentSender, @q0 Intent intent, int i7, int i8) {
        this.f595k = intentSender;
        this.f596l = intent;
        this.f597m = i7;
        this.f598n = i8;
    }

    @q0
    public Intent a() {
        return this.f596l;
    }

    public int b() {
        return this.f597m;
    }

    public int c() {
        return this.f598n;
    }

    @o0
    public IntentSender d() {
        return this.f595k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@o0 Parcel parcel, int i7) {
        parcel.writeParcelable(this.f595k, i7);
        parcel.writeParcelable(this.f596l, i7);
        parcel.writeInt(this.f597m);
        parcel.writeInt(this.f598n);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public IntentSender f599a;

        /* renamed from: b  reason: collision with root package name */
        public Intent f600b;

        /* renamed from: c  reason: collision with root package name */
        public int f601c;

        /* renamed from: d  reason: collision with root package name */
        public int f602d;

        public b(@o0 IntentSender intentSender) {
            this.f599a = intentSender;
        }

        @o0
        public l a() {
            return new l(this.f599a, this.f600b, this.f601c, this.f602d);
        }

        @o0
        public b b(@q0 Intent intent) {
            this.f600b = intent;
            return this;
        }

        @o0
        public b c(int i7, int i8) {
            this.f602d = i7;
            this.f601c = i8;
            return this;
        }

        public b(@o0 PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    public l(@o0 Parcel parcel) {
        this.f595k = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f596l = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f597m = parcel.readInt();
        this.f598n = parcel.readInt();
    }
}
