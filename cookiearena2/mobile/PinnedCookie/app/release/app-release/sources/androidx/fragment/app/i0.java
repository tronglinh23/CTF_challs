package androidx.fragment.app;

import java.util.Collection;
import java.util.Map;
@Deprecated
/* loaded from: classes.dex */
public class i0 {
    @d.q0

    /* renamed from: a  reason: collision with root package name */
    public final Collection<Fragment> f4387a;
    @d.q0

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, i0> f4388b;
    @d.q0

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, androidx.lifecycle.e1> f4389c;

    public i0(@d.q0 Collection<Fragment> collection, @d.q0 Map<String, i0> map, @d.q0 Map<String, androidx.lifecycle.e1> map2) {
        this.f4387a = collection;
        this.f4388b = map;
        this.f4389c = map2;
    }

    @d.q0
    public Map<String, i0> a() {
        return this.f4388b;
    }

    @d.q0
    public Collection<Fragment> b() {
        return this.f4387a;
    }

    @d.q0
    public Map<String, androidx.lifecycle.e1> c() {
        return this.f4389c;
    }

    public boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f4387a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
