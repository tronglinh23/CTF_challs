package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import d.b1;
import i0.x2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import u4.r1;
import v3.q1;
import x3.m1;
@r1({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* loaded from: classes.dex */
public final class r0 {
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public static final String f4811g = "values";
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public static final String f4812h = "keys";
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f4814a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a.c> f4815b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, b<?>> f4816c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, kotlinx.coroutines.flow.e0<Object>> f4817d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final a.c f4818e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final a f4810f = new a(null);
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public static final Class<? extends Object>[] f4813i = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        @n6.d
        @s4.m
        public final r0 a(@n6.e Bundle bundle, @n6.e Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new r0();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    u4.l0.o(str, x2.f10960j);
                    hashMap.put(str, bundle2.get(str));
                }
                return new r0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(r0.f4812h);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(r0.f4811g);
            if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Object obj = parcelableArrayList.get(i7);
                    u4.l0.n(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
                }
                return new r0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        public final boolean b(@n6.e Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : r0.f4813i) {
                u4.l0.m(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public r0(@n6.d Map<String, ? extends Object> map) {
        u4.l0.p(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4814a = linkedHashMap;
        this.f4815b = new LinkedHashMap();
        this.f4816c = new LinkedHashMap();
        this.f4817d = new LinkedHashMap();
        this.f4818e = new a.c() { // from class: androidx.lifecycle.q0
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle p6;
                p6 = r0.p(r0.this);
                return p6;
            }
        };
        linkedHashMap.putAll(map);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    @s4.m
    public static final r0 g(@n6.e Bundle bundle, @n6.e Bundle bundle2) {
        return f4810f.a(bundle, bundle2);
    }

    public static final Bundle p(r0 r0Var) {
        u4.l0.p(r0Var, "this$0");
        for (Map.Entry entry : x3.a1.F0(r0Var.f4815b).entrySet()) {
            r0Var.q((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = r0Var.f4814a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(r0Var.f4814a.get(str));
        }
        return z0.i.b(q1.a(f4812h, arrayList), q1.a(f4811g, arrayList2));
    }

    @d.l0
    public final void e(@n6.d String str) {
        u4.l0.p(str, x2.f10960j);
        this.f4815b.remove(str);
    }

    @d.l0
    public final boolean f(@n6.d String str) {
        u4.l0.p(str, x2.f10960j);
        return this.f4814a.containsKey(str);
    }

    @d.l0
    @n6.e
    public final <T> T h(@n6.d String str) {
        u4.l0.p(str, x2.f10960j);
        try {
            return (T) this.f4814a.get(str);
        } catch (ClassCastException unused) {
            n(str);
            return null;
        }
    }

    @d.l0
    @n6.d
    public final <T> h0<T> i(@n6.d String str) {
        u4.l0.p(str, x2.f10960j);
        h0<T> k7 = k(str, false, null);
        u4.l0.n(k7, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return k7;
    }

    @d.l0
    @n6.d
    public final <T> h0<T> j(@n6.d String str, T t6) {
        u4.l0.p(str, x2.f10960j);
        return k(str, true, t6);
    }

    public final <T> h0<T> k(String str, boolean z6, T t6) {
        b<?> bVar;
        b<?> bVar2 = this.f4816c.get(str);
        b<?> bVar3 = bVar2 instanceof h0 ? bVar2 : null;
        if (bVar3 != null) {
            return bVar3;
        }
        if (this.f4814a.containsKey(str)) {
            bVar = new b<>(this, str, this.f4814a.get(str));
        } else if (z6) {
            this.f4814a.put(str, t6);
            bVar = new b<>(this, str, t6);
        } else {
            bVar = new b<>(this, str);
        }
        this.f4816c.put(str, bVar);
        return bVar;
    }

    @d.l0
    @n6.d
    public final <T> kotlinx.coroutines.flow.t0<T> l(@n6.d String str, T t6) {
        u4.l0.p(str, x2.f10960j);
        Map<String, kotlinx.coroutines.flow.e0<Object>> map = this.f4817d;
        kotlinx.coroutines.flow.e0<Object> e0Var = map.get(str);
        if (e0Var == null) {
            if (!this.f4814a.containsKey(str)) {
                this.f4814a.put(str, t6);
            }
            e0Var = kotlinx.coroutines.flow.v0.a(this.f4814a.get(str));
            this.f4817d.put(str, e0Var);
            map.put(str, e0Var);
        }
        kotlinx.coroutines.flow.t0<T> m7 = kotlinx.coroutines.flow.k.m(e0Var);
        u4.l0.n(m7, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return m7;
    }

    @d.l0
    @n6.d
    public final Set<String> m() {
        return m1.D(m1.D(this.f4814a.keySet(), this.f4815b.keySet()), this.f4816c.keySet());
    }

    @d.l0
    @n6.e
    public final <T> T n(@n6.d String str) {
        u4.l0.p(str, x2.f10960j);
        T t6 = (T) this.f4814a.remove(str);
        b<?> remove = this.f4816c.remove(str);
        if (remove != null) {
            remove.s();
        }
        this.f4817d.remove(str);
        return t6;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public final a.c o() {
        return this.f4818e;
    }

    @d.l0
    public final <T> void q(@n6.d String str, @n6.e T t6) {
        u4.l0.p(str, x2.f10960j);
        if (!f4810f.b(t6)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            u4.l0.m(t6);
            sb.append(t6.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        b<?> bVar = this.f4816c.get(str);
        b<?> bVar2 = bVar instanceof h0 ? bVar : null;
        if (bVar2 != null) {
            bVar2.r(t6);
        } else {
            this.f4814a.put(str, t6);
        }
        kotlinx.coroutines.flow.e0<Object> e0Var = this.f4817d.get(str);
        if (e0Var == null) {
            return;
        }
        e0Var.setValue(t6);
    }

    @d.l0
    public final void r(@n6.d String str, @n6.d a.c cVar) {
        u4.l0.p(str, x2.f10960j);
        u4.l0.p(cVar, "provider");
        this.f4815b.put(str, cVar);
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends h0<T> {
        @n6.d

        /* renamed from: m  reason: collision with root package name */
        public String f4819m;
        @n6.e

        /* renamed from: n  reason: collision with root package name */
        public r0 f4820n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@n6.e r0 r0Var, @n6.d String str, T t6) {
            super(t6);
            u4.l0.p(str, x2.f10960j);
            this.f4819m = str;
            this.f4820n = r0Var;
        }

        @Override // androidx.lifecycle.h0, androidx.lifecycle.LiveData
        public void r(T t6) {
            r0 r0Var = this.f4820n;
            if (r0Var != null) {
                r0Var.f4814a.put(this.f4819m, t6);
                kotlinx.coroutines.flow.e0 e0Var = (kotlinx.coroutines.flow.e0) r0Var.f4817d.get(this.f4819m);
                if (e0Var != null) {
                    e0Var.setValue(t6);
                }
            }
            super.r(t6);
        }

        public final void s() {
            this.f4820n = null;
        }

        public b(@n6.e r0 r0Var, @n6.d String str) {
            u4.l0.p(str, x2.f10960j);
            this.f4819m = str;
            this.f4820n = r0Var;
        }
    }

    public r0() {
        this.f4814a = new LinkedHashMap();
        this.f4815b = new LinkedHashMap();
        this.f4816c = new LinkedHashMap();
        this.f4817d = new LinkedHashMap();
        this.f4818e = new a.c() { // from class: androidx.lifecycle.q0
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle p6;
                p6 = r0.p(r0.this);
                return p6;
            }
        };
    }
}
