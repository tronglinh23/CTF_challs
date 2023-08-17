package m3;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import d.b1;
import d.o0;
import d.w0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: d  reason: collision with root package name */
    public static final String f13505d = "VersionedParcel";

    /* renamed from: e  reason: collision with root package name */
    public static final int f13506e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f13507f = -2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f13508g = -3;

    /* renamed from: h  reason: collision with root package name */
    public static final int f13509h = -4;

    /* renamed from: i  reason: collision with root package name */
    public static final int f13510i = -5;

    /* renamed from: j  reason: collision with root package name */
    public static final int f13511j = -6;

    /* renamed from: k  reason: collision with root package name */
    public static final int f13512k = -7;

    /* renamed from: l  reason: collision with root package name */
    public static final int f13513l = -9;

    /* renamed from: m  reason: collision with root package name */
    public static final int f13514m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f13515n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f13516o = 3;

    /* renamed from: p  reason: collision with root package name */
    public static final int f13517p = 4;

    /* renamed from: q  reason: collision with root package name */
    public static final int f13518q = 5;

    /* renamed from: r  reason: collision with root package name */
    public static final int f13519r = 7;

    /* renamed from: s  reason: collision with root package name */
    public static final int f13520s = 8;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.collection.a<String, Method> f13521a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.collection.a<String, Method> f13522b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.collection.a<String, Class> f13523c;

    /* loaded from: classes.dex */
    public class a extends ObjectInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(Throwable th) {
            super(th);
        }
    }

    public e(androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        this.f13521a = aVar;
        this.f13522b = aVar2;
        this.f13523c = aVar3;
    }

    @o0
    public static Throwable f(@o0 Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public double[] A() {
        int L = L();
        if (L < 0) {
            return null;
        }
        double[] dArr = new double[L];
        for (int i7 = 0; i7 < L; i7++) {
            dArr[i7] = y();
        }
        return dArr;
    }

    public final <T> void A0(Collection<T> collection) {
        if (collection == null) {
            L0(-1);
            return;
        }
        int size = collection.size();
        L0(size);
        if (size > 0) {
            int g7 = g(collection.iterator().next());
            L0(g7);
            switch (g7) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        l1((h) it.next());
                    }
                    return;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        W0((Parcelable) it2.next());
                    }
                    return;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        Y0((Serializable) it3.next());
                    }
                    return;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        e1((String) it4.next());
                    }
                    return;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        g1((IBinder) it5.next());
                    }
                    return;
                case 6:
                default:
                    return;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        L0(((Integer) it6.next()).intValue());
                    }
                    return;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        H0(((Float) it7.next()).floatValue());
                    }
                    return;
            }
        }
    }

    public double[] B(double[] dArr, int i7) {
        return !F(i7) ? dArr : A();
    }

    public final <T> void B0(Collection<T> collection, int i7) {
        i0(i7);
        A0(collection);
    }

    public final Exception C(int i7, String str) {
        return b(i7, str);
    }

    public abstract void C0(double d7);

    public Exception D(Exception exc, int i7) {
        int E;
        return (F(i7) && (E = E()) != 0) ? C(E, c0()) : exc;
    }

    public void D0(double d7, int i7) {
        i0(i7);
        C0(d7);
    }

    public final int E() {
        return L();
    }

    public void E0(double[] dArr) {
        if (dArr == null) {
            L0(-1);
            return;
        }
        L0(dArr.length);
        for (double d7 : dArr) {
            C0(d7);
        }
    }

    public abstract boolean F(int i7);

    public void F0(double[] dArr, int i7) {
        i0(i7);
        E0(dArr);
    }

    public abstract float G();

    public void G0(Exception exc, int i7) {
        i0(i7);
        if (exc == null) {
            V0();
            return;
        }
        int i8 = ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) ? -9 : exc instanceof SecurityException ? -1 : exc instanceof BadParcelableException ? -2 : exc instanceof IllegalArgumentException ? -3 : exc instanceof NullPointerException ? -4 : exc instanceof IllegalStateException ? -5 : exc instanceof NetworkOnMainThreadException ? -6 : exc instanceof UnsupportedOperationException ? -7 : 0;
        L0(i8);
        if (i8 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        e1(exc.getMessage());
        if (i8 != -9) {
            return;
        }
        W0((Parcelable) exc);
    }

    public float H(float f7, int i7) {
        return !F(i7) ? f7 : G();
    }

    public abstract void H0(float f7);

    public float[] I() {
        int L = L();
        if (L < 0) {
            return null;
        }
        float[] fArr = new float[L];
        for (int i7 = 0; i7 < L; i7++) {
            fArr[i7] = G();
        }
        return fArr;
    }

    public void I0(float f7, int i7) {
        i0(i7);
        H0(f7);
    }

    public float[] J(float[] fArr, int i7) {
        return !F(i7) ? fArr : I();
    }

    public void J0(float[] fArr) {
        if (fArr == null) {
            L0(-1);
            return;
        }
        L0(fArr.length);
        for (float f7 : fArr) {
            H0(f7);
        }
    }

    public <T extends h> T K(String str, e eVar) {
        try {
            return (T) e(str).invoke(null, eVar);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    public void K0(float[] fArr, int i7) {
        i0(i7);
        J0(fArr);
    }

    public abstract int L();

    public abstract void L0(int i7);

    public int M(int i7, int i8) {
        return !F(i8) ? i7 : L();
    }

    public void M0(int i7, int i8) {
        i0(i8);
        L0(i7);
    }

    public int[] N() {
        int L = L();
        if (L < 0) {
            return null;
        }
        int[] iArr = new int[L];
        for (int i7 = 0; i7 < L; i7++) {
            iArr[i7] = L();
        }
        return iArr;
    }

    public void N0(int[] iArr) {
        if (iArr == null) {
            L0(-1);
            return;
        }
        L0(iArr.length);
        for (int i7 : iArr) {
            L0(i7);
        }
    }

    public int[] O(int[] iArr, int i7) {
        return !F(i7) ? iArr : N();
    }

    public void O0(int[] iArr, int i7) {
        i0(i7);
        N0(iArr);
    }

    public <T> List<T> P(List<T> list, int i7) {
        return !F(i7) ? list : (List) x(new ArrayList());
    }

    public <T> void P0(List<T> list, int i7) {
        B0(list, i7);
    }

    public abstract long Q();

    public abstract void Q0(long j7);

    public long R(long j7, int i7) {
        return !F(i7) ? j7 : Q();
    }

    public void R0(long j7, int i7) {
        i0(i7);
        Q0(j7);
    }

    public long[] S() {
        int L = L();
        if (L < 0) {
            return null;
        }
        long[] jArr = new long[L];
        for (int i7 = 0; i7 < L; i7++) {
            jArr[i7] = Q();
        }
        return jArr;
    }

    public void S0(long[] jArr) {
        if (jArr == null) {
            L0(-1);
            return;
        }
        L0(jArr.length);
        for (long j7 : jArr) {
            Q0(j7);
        }
    }

    public long[] T(long[] jArr, int i7) {
        return !F(i7) ? jArr : S();
    }

    public void T0(long[] jArr, int i7) {
        i0(i7);
        S0(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> U(Map<K, V> map, int i7) {
        if (F(i7)) {
            int L = L();
            if (L < 0) {
                return null;
            }
            androidx.collection.a aVar = new androidx.collection.a();
            if (L == 0) {
                return aVar;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            x(arrayList);
            x(arrayList2);
            for (int i8 = 0; i8 < L; i8++) {
                aVar.put(arrayList.get(i8), arrayList2.get(i8));
            }
            return aVar;
        }
        return map;
    }

    public <K, V> void U0(Map<K, V> map, int i7) {
        i0(i7);
        if (map == null) {
            L0(-1);
            return;
        }
        int size = map.size();
        L0(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        A0(arrayList);
        A0(arrayList2);
    }

    public abstract <T extends Parcelable> T V();

    public void V0() {
        L0(0);
    }

    public <T extends Parcelable> T W(T t6, int i7) {
        return !F(i7) ? t6 : (T) V();
    }

    public abstract void W0(Parcelable parcelable);

    public Serializable X() {
        String c02 = c0();
        if (c02 == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(s())).readObject();
        } catch (IOException e7) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + c02 + ")", e7);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + c02 + ")", e8);
        }
    }

    public void X0(Parcelable parcelable, int i7) {
        i0(i7);
        W0(parcelable);
    }

    public <T> Set<T> Y(Set<T> set, int i7) {
        return !F(i7) ? set : (Set) x(new androidx.collection.c());
    }

    public final void Y0(Serializable serializable) {
        if (serializable == null) {
            e1(null);
            return;
        }
        String name = serializable.getClass().getName();
        e1(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            t0(byteArrayOutputStream.toByteArray());
        } catch (IOException e7) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e7);
        }
    }

    @w0(api = 21)
    public Size Z(Size size, int i7) {
        if (F(i7)) {
            if (l()) {
                return new Size(L(), L());
            }
            return null;
        }
        return size;
    }

    public void Z0(Serializable serializable, int i7) {
        i0(i7);
        Y0(serializable);
    }

    public abstract void a();

    @w0(api = 21)
    public SizeF a0(SizeF sizeF, int i7) {
        if (F(i7)) {
            if (l()) {
                return new SizeF(G(), G());
            }
            return null;
        }
        return sizeF;
    }

    public <T> void a1(Set<T> set, int i7) {
        B0(set, i7);
    }

    public final Exception b(int i7, String str) {
        switch (i7) {
            case f13513l /* -9 */:
                return (Exception) V();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i7 + " msg " + str);
            case f13512k /* -7 */:
                return new UnsupportedOperationException(str);
            case f13511j /* -6 */:
                return new NetworkOnMainThreadException();
            case f13510i /* -5 */:
                return new IllegalStateException(str);
            case -4:
                return new NullPointerException(str);
            case -3:
                return new IllegalArgumentException(str);
            case -2:
                return new BadParcelableException(str);
            case -1:
                return new SecurityException(str);
        }
    }

    public SparseBooleanArray b0(SparseBooleanArray sparseBooleanArray, int i7) {
        if (F(i7)) {
            int L = L();
            if (L < 0) {
                return null;
            }
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(L);
            for (int i8 = 0; i8 < L; i8++) {
                sparseBooleanArray2.put(L(), l());
            }
            return sparseBooleanArray2;
        }
        return sparseBooleanArray;
    }

    @w0(api = 21)
    public void b1(Size size, int i7) {
        i0(i7);
        m0(size != null);
        if (size != null) {
            L0(size.getWidth());
            L0(size.getHeight());
        }
    }

    public abstract e c();

    public abstract String c0();

    @w0(api = 21)
    public void c1(SizeF sizeF, int i7) {
        i0(i7);
        m0(sizeF != null);
        if (sizeF != null) {
            H0(sizeF.getWidth());
            H0(sizeF.getHeight());
        }
    }

    public final Class d(Class<? extends h> cls) throws ClassNotFoundException {
        Class cls2 = this.f13523c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f13523c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public String d0(String str, int i7) {
        return !F(i7) ? str : c0();
    }

    public void d1(SparseBooleanArray sparseBooleanArray, int i7) {
        i0(i7);
        if (sparseBooleanArray == null) {
            L0(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        L0(size);
        for (int i8 = 0; i8 < size; i8++) {
            L0(sparseBooleanArray.keyAt(i8));
            m0(sparseBooleanArray.valueAt(i8));
        }
    }

    public final Method e(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f13521a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, e.class.getClassLoader()).getDeclaredMethod("read", e.class);
            this.f13521a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract IBinder e0();

    public abstract void e1(String str);

    public IBinder f0(IBinder iBinder, int i7) {
        return !F(i7) ? iBinder : e0();
    }

    public void f1(String str, int i7) {
        i0(i7);
        e1(str);
    }

    public final <T> int g(T t6) {
        if (t6 instanceof String) {
            return 4;
        }
        if (t6 instanceof Parcelable) {
            return 2;
        }
        if (t6 instanceof h) {
            return 1;
        }
        if (t6 instanceof Serializable) {
            return 3;
        }
        if (t6 instanceof IBinder) {
            return 5;
        }
        if (t6 instanceof Integer) {
            return 7;
        }
        if (t6 instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(t6.getClass().getName() + " cannot be VersionedParcelled");
    }

    public <T extends h> T g0() {
        String c02 = c0();
        if (c02 == null) {
            return null;
        }
        return (T) K(c02, c());
    }

    public abstract void g1(IBinder iBinder);

    public final Method h(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f13522b.get(cls.getName());
        if (method == null) {
            Class d7 = d(cls);
            System.currentTimeMillis();
            Method declaredMethod = d7.getDeclaredMethod("write", cls, e.class);
            this.f13522b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public <T extends h> T h0(T t6, int i7) {
        return !F(i7) ? t6 : (T) g0();
    }

    public void h1(IBinder iBinder, int i7) {
        i0(i7);
        g1(iBinder);
    }

    public boolean i() {
        return false;
    }

    public abstract void i0(int i7);

    public abstract void i1(IInterface iInterface);

    public <T> T[] j(T[] tArr) {
        int L = L();
        if (L < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(L);
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    arrayList.add(g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    arrayList.add(V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    arrayList.add(X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    arrayList.add(c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    arrayList.add(e0());
                    L--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public void j0(boolean z6, boolean z7) {
    }

    public void j1(IInterface iInterface, int i7) {
        i0(i7);
        i1(iInterface);
    }

    public <T> T[] k(T[] tArr, int i7) {
        return !F(i7) ? tArr : (T[]) j(tArr);
    }

    public <T> void k0(T[] tArr) {
        if (tArr == null) {
            L0(-1);
            return;
        }
        int length = tArr.length;
        L0(length);
        if (length > 0) {
            int i7 = 0;
            int g7 = g(tArr[0]);
            L0(g7);
            if (g7 == 1) {
                while (i7 < length) {
                    l1((h) tArr[i7]);
                    i7++;
                }
            } else if (g7 == 2) {
                while (i7 < length) {
                    W0((Parcelable) tArr[i7]);
                    i7++;
                }
            } else if (g7 == 3) {
                while (i7 < length) {
                    Y0((Serializable) tArr[i7]);
                    i7++;
                }
            } else if (g7 == 4) {
                while (i7 < length) {
                    e1((String) tArr[i7]);
                    i7++;
                }
            } else if (g7 != 5) {
            } else {
                while (i7 < length) {
                    g1((IBinder) tArr[i7]);
                    i7++;
                }
            }
        }
    }

    public <T extends h> void k1(T t6, e eVar) {
        try {
            h(t6.getClass()).invoke(null, t6, eVar);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (!(e10.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
            }
            throw ((RuntimeException) e10.getCause());
        }
    }

    public abstract boolean l();

    public <T> void l0(T[] tArr, int i7) {
        i0(i7);
        k0(tArr);
    }

    public void l1(h hVar) {
        if (hVar == null) {
            e1(null);
            return;
        }
        n1(hVar);
        e c7 = c();
        k1(hVar, c7);
        c7.a();
    }

    public boolean m(boolean z6, int i7) {
        return !F(i7) ? z6 : l();
    }

    public abstract void m0(boolean z6);

    public void m1(h hVar, int i7) {
        i0(i7);
        l1(hVar);
    }

    public boolean[] n() {
        int L = L();
        if (L < 0) {
            return null;
        }
        boolean[] zArr = new boolean[L];
        for (int i7 = 0; i7 < L; i7++) {
            zArr[i7] = L() != 0;
        }
        return zArr;
    }

    public void n0(boolean z6, int i7) {
        i0(i7);
        m0(z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n1(h hVar) {
        try {
            e1(d(hVar.getClass()).getName());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(hVar.getClass().getSimpleName() + " does not have a Parcelizer", e7);
        }
    }

    public boolean[] o(boolean[] zArr, int i7) {
        return !F(i7) ? zArr : n();
    }

    public void o0(boolean[] zArr) {
        if (zArr == null) {
            L0(-1);
            return;
        }
        L0(zArr.length);
        for (boolean z6 : zArr) {
            L0(z6 ? 1 : 0);
        }
    }

    public abstract Bundle p();

    public void p0(boolean[] zArr, int i7) {
        i0(i7);
        o0(zArr);
    }

    public Bundle q(Bundle bundle, int i7) {
        return !F(i7) ? bundle : p();
    }

    public abstract void q0(Bundle bundle);

    public byte r(byte b7, int i7) {
        return !F(i7) ? b7 : (byte) (L() & 255);
    }

    public void r0(Bundle bundle, int i7) {
        i0(i7);
        q0(bundle);
    }

    public abstract byte[] s();

    public void s0(byte b7, int i7) {
        i0(i7);
        L0(b7);
    }

    public byte[] t(byte[] bArr, int i7) {
        return !F(i7) ? bArr : s();
    }

    public abstract void t0(byte[] bArr);

    public char[] u(char[] cArr, int i7) {
        if (F(i7)) {
            int L = L();
            if (L < 0) {
                return null;
            }
            char[] cArr2 = new char[L];
            for (int i8 = 0; i8 < L; i8++) {
                cArr2[i8] = (char) L();
            }
            return cArr2;
        }
        return cArr;
    }

    public void u0(byte[] bArr, int i7) {
        i0(i7);
        t0(bArr);
    }

    public abstract CharSequence v();

    public abstract void v0(byte[] bArr, int i7, int i8);

    public CharSequence w(CharSequence charSequence, int i7) {
        return !F(i7) ? charSequence : v();
    }

    public void w0(byte[] bArr, int i7, int i8, int i9) {
        i0(i9);
        v0(bArr, i7, i8);
    }

    public final <T, S extends Collection<T>> S x(S s6) {
        int L = L();
        if (L < 0) {
            return null;
        }
        if (L != 0) {
            int L2 = L();
            if (L < 0) {
                return null;
            }
            if (L2 == 1) {
                while (L > 0) {
                    s6.add(g0());
                    L--;
                }
            } else if (L2 == 2) {
                while (L > 0) {
                    s6.add(V());
                    L--;
                }
            } else if (L2 == 3) {
                while (L > 0) {
                    s6.add(X());
                    L--;
                }
            } else if (L2 == 4) {
                while (L > 0) {
                    s6.add(c0());
                    L--;
                }
            } else if (L2 == 5) {
                while (L > 0) {
                    s6.add(e0());
                    L--;
                }
            }
        }
        return s6;
    }

    public void x0(char[] cArr, int i7) {
        i0(i7);
        if (cArr == null) {
            L0(-1);
            return;
        }
        L0(cArr.length);
        for (char c7 : cArr) {
            L0(c7);
        }
    }

    public abstract double y();

    public abstract void y0(CharSequence charSequence);

    public double z(double d7, int i7) {
        return !F(i7) ? d7 : y();
    }

    public void z0(CharSequence charSequence, int i7) {
        i0(i7);
        y0(charSequence);
    }
}