package j0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import i5.h0;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11377a = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace((char) h0.f11094c, '.');

    /* renamed from: j0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0131a implements a {
        @Override // j0.a
        public void a(boolean z6, boolean z7) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f11378c = 1;

        /* renamed from: j0.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0132a implements a {

            /* renamed from: c  reason: collision with root package name */
            public IBinder f11379c;

            public C0132a(IBinder iBinder) {
                this.f11379c = iBinder;
            }

            @Override // j0.a
            public void a(boolean z6, boolean z7) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f11377a);
                    obtain.writeInt(z6 ? 1 : 0);
                    obtain.writeInt(z7 ? 1 : 0);
                    this.f11379c.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11379c;
            }

            public String c() {
                return a.f11377a;
            }
        }

        public b() {
            attachInterface(this, a.f11377a);
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f11377a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0132a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
            String str = a.f11377a;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i8);
            } else {
                a(parcel.readInt() != 0, parcel.readInt() != 0);
                return true;
            }
        }
    }

    void a(boolean z6, boolean z7) throws RemoteException;
}