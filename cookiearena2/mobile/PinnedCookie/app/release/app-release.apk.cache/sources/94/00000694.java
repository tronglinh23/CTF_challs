package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public class f0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f5322a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<a<T>> f5323b = new SparseArray<>(10);

    /* renamed from: c  reason: collision with root package name */
    public a<T> f5324c;

    /* loaded from: classes.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T[] f5325a;

        /* renamed from: b  reason: collision with root package name */
        public int f5326b;

        /* renamed from: c  reason: collision with root package name */
        public int f5327c;

        /* renamed from: d  reason: collision with root package name */
        public a<T> f5328d;

        public a(Class<T> cls, int i7) {
            this.f5325a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i7));
        }

        public boolean a(int i7) {
            int i8 = this.f5326b;
            return i8 <= i7 && i7 < i8 + this.f5327c;
        }

        public T b(int i7) {
            return this.f5325a[i7 - this.f5326b];
        }
    }

    public f0(int i7) {
        this.f5322a = i7;
    }

    public a<T> a(a<T> aVar) {
        int indexOfKey = this.f5323b.indexOfKey(aVar.f5326b);
        if (indexOfKey < 0) {
            this.f5323b.put(aVar.f5326b, aVar);
            return null;
        }
        a<T> valueAt = this.f5323b.valueAt(indexOfKey);
        this.f5323b.setValueAt(indexOfKey, aVar);
        if (this.f5324c == valueAt) {
            this.f5324c = aVar;
        }
        return valueAt;
    }

    public void b() {
        this.f5323b.clear();
    }

    public a<T> c(int i7) {
        return this.f5323b.valueAt(i7);
    }

    public T d(int i7) {
        a<T> aVar = this.f5324c;
        if (aVar == null || !aVar.a(i7)) {
            int indexOfKey = this.f5323b.indexOfKey(i7 - (i7 % this.f5322a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f5324c = this.f5323b.valueAt(indexOfKey);
        }
        return this.f5324c.b(i7);
    }

    public a<T> e(int i7) {
        a<T> aVar = this.f5323b.get(i7);
        if (this.f5324c == aVar) {
            this.f5324c = null;
        }
        this.f5323b.delete(i7);
        return aVar;
    }

    public int f() {
        return this.f5323b.size();
    }
}