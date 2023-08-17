package j0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import i5.h0;
import j0.a;
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: b  reason: collision with root package name */
    public static final String f11380b = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace((char) h0.f11094c, '.');

    /* loaded from: classes.dex */
    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // j0.b
        public void b(j0.a aVar) throws RemoteException {
        }
    }

    /* renamed from: j0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0133b extends Binder implements b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f11381c = 1;

        /* renamed from: j0.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements b {

            /* renamed from: c  reason: collision with root package name */
            public IBinder f11382c;

            public a(IBinder iBinder) {
                this.f11382c = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11382c;
            }

            @Override // j0.b
            public void b(j0.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f11380b);
                    obtain.writeStrongInterface(aVar);
                    this.f11382c.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String c() {
                return b.f11380b;
            }
        }

        public AbstractBinderC0133b() {
            attachInterface(this, b.f11380b);
        }

        public static b c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f11380b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
            String str = b.f11380b;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i8);
            } else {
                b(a.b.c(parcel.readStrongBinder()));
                return true;
            }
        }
    }

    void b(j0.a aVar) throws RemoteException;
}
