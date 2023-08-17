package o1;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import d.q0;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {
    private final Parcelable mSuperState;
    public static final a EMPTY_STATE = new C0196a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: o1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0196a extends a {
        public C0196a() {
            super((C0196a) null);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i7) {
            return new a[i7];
        }
    }

    public /* synthetic */ a(C0196a c0196a) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @q0
    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.mSuperState, i7);
    }

    public a() {
        this.mSuperState = null;
    }

    public a(@o0 Parcelable parcelable) {
        if (parcelable != null) {
            this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(@o0 Parcel parcel) {
        this(parcel, null);
    }

    public a(@o0 Parcel parcel, @q0 ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.mSuperState = readParcelable == null ? EMPTY_STATE : readParcelable;
    }
}
