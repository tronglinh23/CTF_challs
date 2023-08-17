package androidx.coordinatorlayout.widget;

import androidx.collection.m;
import d.b1;
import d.o0;
import d.q0;
import g1.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
@b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final r.a<ArrayList<T>> f3480a = new r.b(10);

    /* renamed from: b  reason: collision with root package name */
    public final m<T, ArrayList<T>> f3481b = new m<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<T> f3482c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<T> f3483d = new HashSet<>();

    public void a(@o0 T t6, @o0 T t7) {
        if (!this.f3481b.containsKey(t6) || !this.f3481b.containsKey(t7)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f3481b.get(t6);
        if (arrayList == null) {
            arrayList = f();
            this.f3481b.put(t6, arrayList);
        }
        arrayList.add(t7);
    }

    public void b(@o0 T t6) {
        if (this.f3481b.containsKey(t6)) {
            return;
        }
        this.f3481b.put(t6, null);
    }

    public void c() {
        int size = this.f3481b.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList<T> o6 = this.f3481b.o(i7);
            if (o6 != null) {
                k(o6);
            }
        }
        this.f3481b.clear();
    }

    public boolean d(@o0 T t6) {
        return this.f3481b.containsKey(t6);
    }

    public final void e(T t6, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t6)) {
            return;
        }
        if (hashSet.contains(t6)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t6);
        ArrayList<T> arrayList2 = this.f3481b.get(t6);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                e(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(t6);
        arrayList.add(t6);
    }

    @o0
    public final ArrayList<T> f() {
        ArrayList<T> b7 = this.f3480a.b();
        return b7 == null ? new ArrayList<>() : b7;
    }

    @q0
    public List g(@o0 T t6) {
        return this.f3481b.get(t6);
    }

    @q0
    public List<T> h(@o0 T t6) {
        int size = this.f3481b.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList<T> o6 = this.f3481b.o(i7);
            if (o6 != null && o6.contains(t6)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3481b.k(i7));
            }
        }
        return arrayList;
    }

    @o0
    public ArrayList<T> i() {
        this.f3482c.clear();
        this.f3483d.clear();
        int size = this.f3481b.size();
        for (int i7 = 0; i7 < size; i7++) {
            e(this.f3481b.k(i7), this.f3482c, this.f3483d);
        }
        return this.f3482c;
    }

    public boolean j(@o0 T t6) {
        int size = this.f3481b.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList<T> o6 = this.f3481b.o(i7);
            if (o6 != null && o6.contains(t6)) {
                return true;
            }
        }
        return false;
    }

    public final void k(@o0 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3480a.a(arrayList);
    }

    public int l() {
        return this.f3481b.size();
    }
}
