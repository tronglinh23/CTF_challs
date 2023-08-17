package z0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import z0.a;
/* loaded from: classes.dex */
public final class h {

    @d.w0(33)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static <T> T a(@d.o0 Bundle bundle, @d.q0 String str, @d.o0 Class<T> cls) {
            Object parcelable;
            parcelable = bundle.getParcelable(str, cls);
            return (T) parcelable;
        }

        @d.u
        public static <T> T[] b(@d.o0 Bundle bundle, @d.q0 String str, @d.o0 Class<T> cls) {
            Object[] parcelableArray;
            parcelableArray = bundle.getParcelableArray(str, cls);
            return (T[]) parcelableArray;
        }

        @d.u
        public static <T> ArrayList<T> c(@d.o0 Bundle bundle, @d.q0 String str, @d.o0 Class<? extends T> cls) {
            ArrayList<T> parcelableArrayList;
            parcelableArrayList = bundle.getParcelableArrayList(str, cls);
            return parcelableArrayList;
        }

        @d.u
        public static <T> SparseArray<T> d(@d.o0 Bundle bundle, @d.q0 String str, @d.o0 Class<? extends T> cls) {
            SparseArray<T> sparseParcelableArray;
            sparseParcelableArray = bundle.getSparseParcelableArray(str, cls);
            return sparseParcelableArray;
        }
    }

    @d.q0
    @d.s0(markerClass = {a.b.class})
    public static <T> T a(@d.o0 Bundle bundle, @d.q0 String str, @d.o0 Class<T> cls) {
        if (z0.a.l()) {
            return (T) a.a(bundle, str, cls);
        }
        T t6 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t6)) {
            return t6;
        }
        return null;
    }

    @d.q0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @d.s0(markerClass = {a.b.class})
    public static Parcelable[] b(@d.o0 Bundle bundle, @d.q0 String str, @d.o0 Class<? extends Parcelable> cls) {
        return z0.a.l() ? (Parcelable[]) a.b(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    @d.q0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @d.s0(markerClass = {a.b.class})
    public static <T> ArrayList<T> c(@d.o0 Bundle bundle, @d.q0 String str, @d.o0 Class<? extends T> cls) {
        return z0.a.l() ? a.c(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    @d.q0
    @d.s0(markerClass = {a.b.class})
    public static <T> SparseArray<T> d(@d.o0 Bundle bundle, @d.q0 String str, @d.o0 Class<? extends T> cls) {
        return z0.a.l() ? a.d(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }
}
