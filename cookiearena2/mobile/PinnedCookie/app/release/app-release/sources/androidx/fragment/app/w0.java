package androidx.fragment.app;

import android.view.View;
import i0.w3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import u4.r1;
@r1({"SMAP\nFragmentTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n515#2:123\n500#2,6:124\n125#3:130\n152#3,3:131\n125#3:134\n152#3,3:135\n125#3:138\n152#3,3:139\n1855#4,2:142\n*S KotlinDebug\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n*L\n50#1:123\n50#1:124,6\n53#1:130\n53#1:131,3\n98#1:134\n98#1:135,3\n99#1:138\n99#1:139,3\n113#1:142,2\n*E\n"})
/* loaded from: classes.dex */
public final class w0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f4561a;
    @s4.e
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public static final y0 f4562b;
    @s4.e
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public static final y0 f4563c;

    static {
        w0 w0Var = new w0();
        f4561a = w0Var;
        f4562b = new x0();
        f4563c = w0Var.c();
    }

    @s4.m
    public static final void a(@n6.d Fragment fragment, @n6.d Fragment fragment2, boolean z6, @n6.d androidx.collection.a<String, View> aVar, boolean z7) {
        u4.l0.p(fragment, "inFragment");
        u4.l0.p(fragment2, "outFragment");
        u4.l0.p(aVar, "sharedElements");
        w3 enterTransitionCallback = z6 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(aVar.size());
            Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(aVar.size());
            Iterator<Map.Entry<String, View>> it2 = aVar.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z7) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    @s4.m
    @n6.e
    public static final String b(@n6.d androidx.collection.a<String, String> aVar, @n6.d String str) {
        u4.l0.p(aVar, "<this>");
        u4.l0.p(str, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : aVar.entrySet()) {
            if (u4.l0.g(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) x3.e0.B2(arrayList);
    }

    @s4.m
    public static final void d(@n6.d androidx.collection.a<String, String> aVar, @n6.d androidx.collection.a<String, View> aVar2) {
        u4.l0.p(aVar, "<this>");
        u4.l0.p(aVar2, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!aVar2.containsKey(aVar.o(size))) {
                aVar.m(size);
            }
        }
    }

    @s4.m
    public static final void e(@n6.d List<? extends View> list, int i7) {
        u4.l0.p(list, "views");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i7);
        }
    }

    @s4.m
    public static final boolean f() {
        return (f4562b == null && f4563c == null) ? false : true;
    }

    public final y0 c() {
        try {
            u4.l0.n(androidx.transition.p.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (y0) androidx.transition.p.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
