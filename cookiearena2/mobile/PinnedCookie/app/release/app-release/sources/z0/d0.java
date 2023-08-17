package z0;

import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z0.a;
/* loaded from: classes.dex */
public final class d0 {

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static <T extends Parcelable> List<T> a(@d.o0 Parcel parcel, @d.o0 List<T> list, @d.q0 ClassLoader classLoader) {
            List<T> readParcelableList;
            readParcelableList = parcel.readParcelableList(list, classLoader);
            return readParcelableList;
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static Parcelable.Creator<?> a(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader) {
            Parcelable.Creator<?> readParcelableCreator;
            readParcelableCreator = parcel.readParcelableCreator(classLoader);
            return readParcelableCreator;
        }
    }

    @d.w0(33)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static <T> T[] a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            Object[] readArray;
            readArray = parcel.readArray(classLoader, cls);
            return (T[]) readArray;
        }

        @d.u
        public static <T> ArrayList<T> b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            ArrayList<T> readArrayList;
            readArrayList = parcel.readArrayList(classLoader, cls);
            return readArrayList;
        }

        @d.u
        public static <V, K> HashMap<K, V> c(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            HashMap<K, V> readHashMap;
            readHashMap = parcel.readHashMap(classLoader, cls, cls2);
            return readHashMap;
        }

        @d.u
        public static <T> void d(@d.o0 Parcel parcel, @d.o0 List<? super T> list, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        @d.u
        public static <K, V> void e(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        @d.u
        public static <T extends Parcelable> T f(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
            Object readParcelable;
            readParcelable = parcel.readParcelable(classLoader, cls);
            return (T) readParcelable;
        }

        @d.u
        public static <T> T[] g(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
            Object[] readParcelableArray;
            readParcelableArray = parcel.readParcelableArray(classLoader, cls);
            return (T[]) readParcelableArray;
        }

        @d.u
        public static <T> Parcelable.Creator<T> h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            Parcelable.Creator<T> readParcelableCreator;
            readParcelableCreator = parcel.readParcelableCreator(classLoader, cls);
            return readParcelableCreator;
        }

        @d.u
        public static <T> List<T> i(@d.o0 Parcel parcel, @d.o0 List<T> list, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
            List<T> readParcelableList;
            readParcelableList = parcel.readParcelableList(list, classLoader, cls);
            return readParcelableList;
        }

        @d.u
        public static <T extends Serializable> T j(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
            Object readSerializable;
            readSerializable = parcel.readSerializable(classLoader, cls);
            return (T) readSerializable;
        }

        @d.u
        public static <T> SparseArray<T> k(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            SparseArray<T> readSparseArray;
            readSparseArray = parcel.readSparseArray(classLoader, cls);
            return readSparseArray;
        }
    }

    @d.q0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @d.s0(markerClass = {a.b.class})
    public static <T> Object[] a(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
        return z0.a.l() ? c.a(parcel, classLoader, cls) : parcel.readArray(classLoader);
    }

    @d.q0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @d.s0(markerClass = {a.b.class})
    public static <T> ArrayList<T> b(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<? extends T> cls) {
        return z0.a.l() ? c.b(parcel, classLoader, cls) : parcel.readArrayList(classLoader);
    }

    public static boolean c(@d.o0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @d.q0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @d.s0(markerClass = {a.b.class})
    public static <K, V> HashMap<K, V> d(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<? extends K> cls, @d.o0 Class<? extends V> cls2) {
        return z0.a.l() ? c.c(parcel, classLoader, cls, cls2) : parcel.readHashMap(classLoader);
    }

    @d.s0(markerClass = {a.b.class})
    public static <T> void e(@d.o0 Parcel parcel, @d.o0 List<? super T> list, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
        if (z0.a.l()) {
            c.d(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    @d.s0(markerClass = {a.b.class})
    public static <K, V> void f(@d.o0 Parcel parcel, @d.o0 Map<? super K, ? super V> map, @d.q0 ClassLoader classLoader, @d.o0 Class<K> cls, @d.o0 Class<V> cls2) {
        if (z0.a.l()) {
            c.e(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @d.q0
    @d.s0(markerClass = {a.b.class})
    public static <T extends Parcelable> T g(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
        if (z0.a.l()) {
            return (T) c.f(parcel, classLoader, cls);
        }
        T t6 = (T) parcel.readParcelable(classLoader);
        if (t6 == null || cls.isInstance(t6)) {
            return t6;
        }
        throw new BadParcelableException("Parcelable " + t6.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
    }

    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Deprecated
    @d.q0
    @d.s0(markerClass = {a.b.class})
    public static <T> T[] h(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
        if (z0.a.l()) {
            return (T[]) c.g(parcel, classLoader, cls);
        }
        T[] tArr = (T[]) parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(Parcelable.class)) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i7 = 0; i7 < tArr.length; i7++) {
            try {
                tArr2[i7] = cls.cast(tArr[i7]);
            } catch (ClassCastException unused) {
                throw new BadParcelableException("Parcelable at index " + i7 + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
            }
        }
        return tArr2;
    }

    @d.q0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @d.s0(markerClass = {a.b.class})
    public static <T> Parcelable[] i(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
        return z0.a.l() ? (Parcelable[]) c.g(parcel, classLoader, cls) : parcel.readParcelableArray(classLoader);
    }

    @d.q0
    @d.s0(markerClass = {a.b.class})
    @d.w0(30)
    public static <T> Parcelable.Creator<T> j(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
        return z0.a.l() ? c.h(parcel, classLoader, cls) : (Parcelable.Creator<T>) b.a(parcel, classLoader);
    }

    @d.o0
    @d.s0(markerClass = {a.b.class})
    @d.w0(api = 29)
    public static <T> List<T> k(@d.o0 Parcel parcel, @d.o0 List<T> list, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
        return z0.a.l() ? c.i(parcel, list, classLoader, cls) : a.a(parcel, list, classLoader);
    }

    @d.q0
    @d.s0(markerClass = {a.b.class})
    public static <T extends Serializable> T l(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<T> cls) {
        return z0.a.k() ? (T) c.j(parcel, classLoader, cls) : (T) parcel.readSerializable();
    }

    @d.q0
    @d.s0(markerClass = {a.b.class})
    public static <T> SparseArray<T> m(@d.o0 Parcel parcel, @d.q0 ClassLoader classLoader, @d.o0 Class<? extends T> cls) {
        return z0.a.l() ? c.k(parcel, classLoader, cls) : parcel.readSparseArray(classLoader);
    }

    public static void n(@d.o0 Parcel parcel, boolean z6) {
        parcel.writeInt(z6 ? 1 : 0);
    }
}
