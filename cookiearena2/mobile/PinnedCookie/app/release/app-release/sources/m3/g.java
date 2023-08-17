package m3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import d.b1;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import m3.e;
@b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public class g extends e {
    public static final Charset C = Charset.forName("UTF-16");
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 6;
    public static final int K = 7;
    public static final int L = 8;
    public static final int M = 9;
    public static final int N = 10;
    public static final int O = 11;
    public static final int P = 12;
    public static final int Q = 13;
    public static final int R = 14;
    public int A;
    public int B;

    /* renamed from: t  reason: collision with root package name */
    public final DataInputStream f13532t;

    /* renamed from: u  reason: collision with root package name */
    public final DataOutputStream f13533u;

    /* renamed from: v  reason: collision with root package name */
    public DataInputStream f13534v;

    /* renamed from: w  reason: collision with root package name */
    public DataOutputStream f13535w;

    /* renamed from: x  reason: collision with root package name */
    public b f13536x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f13537y;

    /* renamed from: z  reason: collision with root package name */
    public int f13538z;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteArrayOutputStream f13540a;

        /* renamed from: b  reason: collision with root package name */
        public final DataOutputStream f13541b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13542c;

        /* renamed from: d  reason: collision with root package name */
        public final DataOutputStream f13543d;

        public b(int i7, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f13540a = byteArrayOutputStream;
            this.f13541b = new DataOutputStream(byteArrayOutputStream);
            this.f13542c = i7;
            this.f13543d = dataOutputStream;
        }

        public void a() throws IOException {
            this.f13541b.flush();
            int size = this.f13540a.size();
            this.f13543d.writeInt((this.f13542c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f13543d.writeInt(size);
            }
            this.f13540a.writeTo(this.f13543d);
        }
    }

    public g(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // m3.e
    public void C0(double d7) {
        try {
            this.f13535w.writeDouble(d7);
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public boolean F(int i7) {
        while (true) {
            try {
                int i8 = this.A;
                if (i8 == i7) {
                    return true;
                }
                if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                    return false;
                }
                if (this.f13538z < this.B) {
                    this.f13532t.skip(r2 - r1);
                }
                this.B = -1;
                int readInt = this.f13532t.readInt();
                this.f13538z = 0;
                int i9 = readInt & 65535;
                if (i9 == 65535) {
                    i9 = this.f13532t.readInt();
                }
                this.A = (readInt >> 16) & 65535;
                this.B = i9;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // m3.e
    public float G() {
        try {
            return this.f13534v.readFloat();
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public void H0(float f7) {
        try {
            this.f13535w.writeFloat(f7);
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public int L() {
        try {
            return this.f13534v.readInt();
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public void L0(int i7) {
        try {
            this.f13535w.writeInt(i7);
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public long Q() {
        try {
            return this.f13534v.readLong();
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public void Q0(long j7) {
        try {
            this.f13535w.writeLong(j7);
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public <T extends Parcelable> T V() {
        return null;
    }

    @Override // m3.e
    public void W0(Parcelable parcelable) {
        if (!this.f13537y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // m3.e
    public void a() {
        b bVar = this.f13536x;
        if (bVar != null) {
            try {
                if (bVar.f13540a.size() != 0) {
                    this.f13536x.a();
                }
                this.f13536x = null;
            } catch (IOException e7) {
                throw new e.b(e7);
            }
        }
    }

    @Override // m3.e
    public e c() {
        return new g(this.f13534v, this.f13535w, this.f13521a, this.f13522b, this.f13523c);
    }

    @Override // m3.e
    public String c0() {
        try {
            int readInt = this.f13534v.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.f13534v.readFully(bArr);
                return new String(bArr, C);
            }
            return null;
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public IBinder e0() {
        return null;
    }

    @Override // m3.e
    public void e1(String str) {
        try {
            if (str == null) {
                this.f13535w.writeInt(-1);
                return;
            }
            byte[] bytes = str.getBytes(C);
            this.f13535w.writeInt(bytes.length);
            this.f13535w.write(bytes);
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public void g1(IBinder iBinder) {
        if (!this.f13537y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // m3.e
    public boolean i() {
        return true;
    }

    @Override // m3.e
    public void i0(int i7) {
        a();
        b bVar = new b(i7, this.f13533u);
        this.f13536x = bVar;
        this.f13535w = bVar.f13541b;
    }

    @Override // m3.e
    public void i1(IInterface iInterface) {
        if (!this.f13537y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // m3.e
    public void j0(boolean z6, boolean z7) {
        if (!z6) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f13537y = z7;
    }

    @Override // m3.e
    public boolean l() {
        try {
            return this.f13534v.readBoolean();
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public void m0(boolean z6) {
        try {
            this.f13535w.writeBoolean(z6);
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    public final void o1(int i7, String str, Bundle bundle) {
        switch (i7) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, p());
                return;
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i7);
        }
    }

    @Override // m3.e
    public Bundle p() {
        int L2 = L();
        if (L2 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i7 = 0; i7 < L2; i7++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    public final void p1(Object obj) {
        if (obj == null) {
            L0(0);
        } else if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
        } else if (obj instanceof String) {
            L0(3);
            e1((String) obj);
        } else if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
        } else if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
        } else if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
        } else if (obj instanceof Integer) {
            L0(9);
            L0(((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
        } else if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
        } else if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // m3.e
    public void q0(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f13535w.writeInt(-1);
                return;
            }
            Set<String> keySet = bundle.keySet();
            this.f13535w.writeInt(keySet.size());
            for (String str : keySet) {
                e1(str);
                p1(bundle.get(str));
            }
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public byte[] s() {
        try {
            int readInt = this.f13534v.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.f13534v.readFully(bArr);
                return bArr;
            }
            return null;
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public void t0(byte[] bArr) {
        try {
            if (bArr == null) {
                this.f13535w.writeInt(-1);
                return;
            }
            this.f13535w.writeInt(bArr.length);
            this.f13535w.write(bArr);
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public CharSequence v() {
        return null;
    }

    @Override // m3.e
    public void v0(byte[] bArr, int i7, int i8) {
        try {
            if (bArr == null) {
                this.f13535w.writeInt(-1);
                return;
            }
            this.f13535w.writeInt(i8);
            this.f13535w.write(bArr, i7, i8);
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public double y() {
        try {
            return this.f13534v.readDouble();
        } catch (IOException e7) {
            throw new e.b(e7);
        }
    }

    @Override // m3.e
    public void y0(CharSequence charSequence) {
        if (!this.f13537y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    public g(InputStream inputStream, OutputStream outputStream, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f13538z = 0;
        this.A = -1;
        this.B = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f13532t = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f13533u = dataOutputStream;
        this.f13534v = dataInputStream;
        this.f13535w = dataOutputStream;
    }

    /* loaded from: classes.dex */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            g gVar = g.this;
            int i7 = gVar.B;
            if (i7 != -1 && gVar.f13538z >= i7) {
                throw new IOException();
            }
            int read = super.read();
            g.this.f13538z++;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j7) throws IOException {
            g gVar = g.this;
            int i7 = gVar.B;
            if (i7 == -1 || gVar.f13538z < i7) {
                long skip = super.skip(j7);
                if (skip > 0) {
                    g.this.f13538z += (int) skip;
                }
                return skip;
            }
            throw new IOException();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) throws IOException {
            g gVar = g.this;
            int i9 = gVar.B;
            if (i9 != -1 && gVar.f13538z >= i9) {
                throw new IOException();
            }
            int read = super.read(bArr, i7, i8);
            if (read > 0) {
                g.this.f13538z += read;
            }
            return read;
        }
    }
}
