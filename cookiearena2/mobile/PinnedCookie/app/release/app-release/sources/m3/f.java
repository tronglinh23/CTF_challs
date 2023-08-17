package m3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import d.b1;
import java.lang.reflect.Method;
@b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public class f extends e {
    public static final boolean B = false;
    public static final String C = "VersionedParcelParcel";
    public int A;

    /* renamed from: t  reason: collision with root package name */
    public final SparseIntArray f13525t;

    /* renamed from: u  reason: collision with root package name */
    public final Parcel f13526u;

    /* renamed from: v  reason: collision with root package name */
    public final int f13527v;

    /* renamed from: w  reason: collision with root package name */
    public final int f13528w;

    /* renamed from: x  reason: collision with root package name */
    public final String f13529x;

    /* renamed from: y  reason: collision with root package name */
    public int f13530y;

    /* renamed from: z  reason: collision with root package name */
    public int f13531z;

    public f(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // m3.e
    public void C0(double d7) {
        this.f13526u.writeDouble(d7);
    }

    @Override // m3.e
    public boolean F(int i7) {
        while (this.f13531z < this.f13528w) {
            int i8 = this.A;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            this.f13526u.setDataPosition(this.f13531z);
            int readInt = this.f13526u.readInt();
            this.A = this.f13526u.readInt();
            this.f13531z += readInt;
        }
        return this.A == i7;
    }

    @Override // m3.e
    public float G() {
        return this.f13526u.readFloat();
    }

    @Override // m3.e
    public void H0(float f7) {
        this.f13526u.writeFloat(f7);
    }

    @Override // m3.e
    public int L() {
        return this.f13526u.readInt();
    }

    @Override // m3.e
    public void L0(int i7) {
        this.f13526u.writeInt(i7);
    }

    @Override // m3.e
    public long Q() {
        return this.f13526u.readLong();
    }

    @Override // m3.e
    public void Q0(long j7) {
        this.f13526u.writeLong(j7);
    }

    @Override // m3.e
    public <T extends Parcelable> T V() {
        return (T) this.f13526u.readParcelable(getClass().getClassLoader());
    }

    @Override // m3.e
    public void W0(Parcelable parcelable) {
        this.f13526u.writeParcelable(parcelable, 0);
    }

    @Override // m3.e
    public void a() {
        int i7 = this.f13530y;
        if (i7 >= 0) {
            int i8 = this.f13525t.get(i7);
            int dataPosition = this.f13526u.dataPosition();
            this.f13526u.setDataPosition(i8);
            this.f13526u.writeInt(dataPosition - i8);
            this.f13526u.setDataPosition(dataPosition);
        }
    }

    @Override // m3.e
    public e c() {
        Parcel parcel = this.f13526u;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f13531z;
        if (i7 == this.f13527v) {
            i7 = this.f13528w;
        }
        return new f(parcel, dataPosition, i7, this.f13529x + "  ", this.f13521a, this.f13522b, this.f13523c);
    }

    @Override // m3.e
    public String c0() {
        return this.f13526u.readString();
    }

    @Override // m3.e
    public IBinder e0() {
        return this.f13526u.readStrongBinder();
    }

    @Override // m3.e
    public void e1(String str) {
        this.f13526u.writeString(str);
    }

    @Override // m3.e
    public void g1(IBinder iBinder) {
        this.f13526u.writeStrongBinder(iBinder);
    }

    @Override // m3.e
    public void i0(int i7) {
        a();
        this.f13530y = i7;
        this.f13525t.put(i7, this.f13526u.dataPosition());
        L0(0);
        L0(i7);
    }

    @Override // m3.e
    public void i1(IInterface iInterface) {
        this.f13526u.writeStrongInterface(iInterface);
    }

    @Override // m3.e
    public boolean l() {
        return this.f13526u.readInt() != 0;
    }

    @Override // m3.e
    public void m0(boolean z6) {
        this.f13526u.writeInt(z6 ? 1 : 0);
    }

    @Override // m3.e
    public Bundle p() {
        return this.f13526u.readBundle(getClass().getClassLoader());
    }

    @Override // m3.e
    public void q0(Bundle bundle) {
        this.f13526u.writeBundle(bundle);
    }

    @Override // m3.e
    public byte[] s() {
        int readInt = this.f13526u.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f13526u.readByteArray(bArr);
        return bArr;
    }

    @Override // m3.e
    public void t0(byte[] bArr) {
        if (bArr == null) {
            this.f13526u.writeInt(-1);
            return;
        }
        this.f13526u.writeInt(bArr.length);
        this.f13526u.writeByteArray(bArr);
    }

    @Override // m3.e
    public CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f13526u);
    }

    @Override // m3.e
    public void v0(byte[] bArr, int i7, int i8) {
        if (bArr == null) {
            this.f13526u.writeInt(-1);
            return;
        }
        this.f13526u.writeInt(bArr.length);
        this.f13526u.writeByteArray(bArr, i7, i8);
    }

    @Override // m3.e
    public double y() {
        return this.f13526u.readDouble();
    }

    @Override // m3.e
    public void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f13526u, 0);
    }

    public f(Parcel parcel, int i7, int i8, String str, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f13525t = new SparseIntArray();
        this.f13530y = -1;
        this.A = -1;
        this.f13526u = parcel;
        this.f13527v = i7;
        this.f13528w = i8;
        this.f13531z = i7;
        this.f13529x = str;
    }
}
