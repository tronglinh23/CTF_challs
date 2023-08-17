package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class m {

    /* renamed from: c  reason: collision with root package name */
    public static final int f3433c = -1;

    /* renamed from: a  reason: collision with root package name */
    public SparseIntArray f3434a = new SparseIntArray();

    /* renamed from: b  reason: collision with root package name */
    public HashMap<Integer, HashSet<WeakReference<a>>> f3435b = new HashMap<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(int key, int newValue, int oldValue);
    }

    public void a(int key, a listener) {
        HashSet<WeakReference<a>> hashSet = this.f3435b.get(Integer.valueOf(key));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f3435b.put(Integer.valueOf(key), hashSet);
        }
        hashSet.add(new WeakReference<>(listener));
    }

    public void b() {
        this.f3435b.clear();
    }

    public void c(int key, int value) {
        int i7 = this.f3434a.get(key, -1);
        if (i7 == value) {
            return;
        }
        this.f3434a.put(key, value);
        HashSet<WeakReference<a>> hashSet = this.f3435b.get(Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        Iterator<WeakReference<a>> it = hashSet.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            a aVar = it.next().get();
            if (aVar != null) {
                aVar.a(key, value, i7);
            } else {
                z6 = true;
            }
        }
        if (z6) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<a>> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                WeakReference<a> next = it2.next();
                if (next.get() == null) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public int d(int key) {
        return this.f3434a.get(key, -1);
    }

    public void e(int key, a listener) {
        HashSet<WeakReference<a>> hashSet = this.f3435b.get(Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<a>> it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference<a> next = it.next();
            a aVar = next.get();
            if (aVar == null || aVar == listener) {
                arrayList.add(next);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void f(a listener) {
        Iterator<Integer> it = this.f3435b.keySet().iterator();
        while (it.hasNext()) {
            e(it.next().intValue(), listener);
        }
    }
}
