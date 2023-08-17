package s2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import d.b1;
import i0.x2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s2.e0;
import s2.z;
import t2.a;
import u4.r1;
import u4.u1;
import v3.m2;
@r1({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,829:1\n232#2,3:830\n1#3:833\n288#4,2:834\n1549#4:837\n1620#4,3:838\n1855#4,2:849\n1855#4,2:852\n1855#4,2:855\n29#5:836\n1206#6,2:841\n1206#6,2:843\n1206#6,2:845\n1206#6,2:847\n32#7:851\n33#7:854\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n191#1:830,3\n231#1:834,2\n467#1:837\n467#1:838,3\n710#1:849,2\n718#1:852,2\n722#1:855,2\n373#1:836\n686#1:841,2\n687#1:843,2\n690#1:845,2\n694#1:847,2\n715#1:851\n715#1:854\n*E\n"})
/* loaded from: classes.dex */
public class g0 {
    @n6.d

    /* renamed from: t  reason: collision with root package name */
    public static final b f16312t = new b(null);
    @n6.d

    /* renamed from: u  reason: collision with root package name */
    public static final Map<String, Class<?>> f16313u = new LinkedHashMap();
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final String f16314k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public k0 f16315l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public String f16316m;
    @n6.e

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f16317n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public final List<z> f16318o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public final androidx.collection.n<l> f16319p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public Map<String, q> f16320q;

    /* renamed from: r  reason: collision with root package name */
    public int f16321r;
    @n6.e

    /* renamed from: s  reason: collision with root package name */
    public String f16322s;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @w3.e(w3.a.BINARY)
    @w3.f(allowedTargets = {w3.b.ANNOTATION_CLASS, w3.b.CLASS})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface a {
        Class<?> value();
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* loaded from: classes.dex */
        public static final class a extends u4.n0 implements t4.l<g0, g0> {

            /* renamed from: l  reason: collision with root package name */
            public static final a f16323l = new a();

            public a() {
                super(1);
            }

            @Override // t4.l
            @n6.e
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final g0 O(@n6.d g0 g0Var) {
                u4.l0.p(g0Var, "it");
                return g0Var.u();
            }
        }

        public /* synthetic */ b(u4.w wVar) {
            this();
        }

        @s4.m
        public static /* synthetic */ void d(g0 g0Var) {
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        @n6.d
        public final String a(@n6.e String str) {
            if (str != null) {
                return "android-app://androidx.navigation/" + str;
            }
            return "";
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        @n6.d
        @s4.m
        public final String b(@n6.d Context context, int i7) {
            String valueOf;
            u4.l0.p(context, "context");
            if (i7 <= 16777215) {
                return String.valueOf(i7);
            }
            try {
                valueOf = context.getResources().getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i7);
            }
            u4.l0.o(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        @n6.d
        public final f5.m<g0> c(@n6.d g0 g0Var) {
            u4.l0.p(g0Var, "<this>");
            return f5.s.l(g0Var, a.f16323l);
        }

        @n6.d
        @s4.m
        public final <C> Class<? extends C> e(@n6.d Context context, @n6.d String str, @n6.d Class<? extends C> cls) {
            String str2;
            u4.l0.p(context, "context");
            u4.l0.p(str, "name");
            u4.l0.p(cls, "expectedClassType");
            if (str.charAt(0) == '.') {
                str2 = context.getPackageName() + str;
            } else {
                str2 = str;
            }
            Class<? extends C> cls2 = (Class) g0.f16313u.get(str2);
            if (cls2 == null) {
                try {
                    cls2 = (Class<? extends C>) Class.forName(str2, true, context.getClassLoader());
                    g0.f16313u.put(str, cls2);
                } catch (ClassNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            }
            u4.l0.m(cls2);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            throw new IllegalArgumentException((str2 + " must be a subclass of " + cls).toString());
        }

        @d.b1({b1.a.LIBRARY_GROUP})
        @n6.d
        @s4.m
        public final <C> Class<? extends C> f(@n6.d Context context, @n6.d String str, @n6.d Class<? extends C> cls) {
            u4.l0.p(context, "context");
            u4.l0.p(str, "name");
            u4.l0.p(cls, "expectedClassType");
            return g0.D(context, str, cls);
        }

        public b() {
        }
    }

    @r1({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,829:1\n1855#2,2:830\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n127#1:830,2\n*E\n"})
    @d.b1({b1.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final g0 f16324k;
        @n6.e

        /* renamed from: l  reason: collision with root package name */
        public final Bundle f16325l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f16326m;

        /* renamed from: n  reason: collision with root package name */
        public final int f16327n;

        /* renamed from: o  reason: collision with root package name */
        public final boolean f16328o;

        /* renamed from: p  reason: collision with root package name */
        public final int f16329p;

        public c(@n6.d g0 g0Var, @n6.e Bundle bundle, boolean z6, int i7, boolean z7, int i8) {
            u4.l0.p(g0Var, "destination");
            this.f16324k = g0Var;
            this.f16325l = bundle;
            this.f16326m = z6;
            this.f16327n = i7;
            this.f16328o = z7;
            this.f16329p = i8;
        }

        @Override // java.lang.Comparable
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public int compareTo(@n6.d c cVar) {
            u4.l0.p(cVar, "other");
            boolean z6 = this.f16326m;
            if (!z6 || cVar.f16326m) {
                if (z6 || !cVar.f16326m) {
                    int i7 = this.f16327n - cVar.f16327n;
                    if (i7 > 0) {
                        return 1;
                    }
                    if (i7 < 0) {
                        return -1;
                    }
                    Bundle bundle = this.f16325l;
                    if (bundle == null || cVar.f16325l != null) {
                        if (bundle != null || cVar.f16325l == null) {
                            if (bundle != null) {
                                int size = bundle.size();
                                Bundle bundle2 = cVar.f16325l;
                                u4.l0.m(bundle2);
                                int size2 = size - bundle2.size();
                                if (size2 > 0) {
                                    return 1;
                                }
                                if (size2 < 0) {
                                    return -1;
                                }
                            }
                            boolean z7 = this.f16328o;
                            if (!z7 || cVar.f16328o) {
                                if (z7 || !cVar.f16328o) {
                                    return this.f16329p - cVar.f16329p;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }

        @n6.d
        public final g0 d() {
            return this.f16324k;
        }

        @n6.e
        public final Bundle e() {
            return this.f16325l;
        }

        public final boolean h(@n6.e Bundle bundle) {
            Bundle bundle2;
            Object obj;
            if (bundle == null || (bundle2 = this.f16325l) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            u4.l0.o(keySet, "matchingArgs.keySet()");
            for (String str : keySet) {
                if (!bundle.containsKey(str)) {
                    return false;
                }
                q qVar = this.f16324k.n().get(str);
                Object obj2 = null;
                y0<Object> b7 = qVar != null ? qVar.b() : null;
                if (b7 != null) {
                    Bundle bundle3 = this.f16325l;
                    u4.l0.o(str, x2.f10960j);
                    obj = b7.b(bundle3, str);
                } else {
                    obj = null;
                }
                if (b7 != null) {
                    u4.l0.o(str, x2.f10960j);
                    obj2 = b7.b(bundle, str);
                }
                if (!u4.l0.g(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends u4.n0 implements t4.l<String, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ z f16330l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(z zVar) {
            super(1);
            this.f16330l = zVar;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d String str) {
            u4.l0.p(str, x2.f10960j);
            return Boolean.valueOf(!this.f16330l.j().contains(str));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends u4.n0 implements t4.l<String, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Bundle f16331l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Bundle bundle) {
            super(1);
            this.f16331l = bundle;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d String str) {
            u4.l0.p(str, x2.f10960j);
            return Boolean.valueOf(!this.f16331l.containsKey(str));
        }
    }

    public g0(@n6.d String str) {
        u4.l0.p(str, "navigatorName");
        this.f16314k = str;
        this.f16318o = new ArrayList();
        this.f16319p = new androidx.collection.n<>();
        this.f16320q = new LinkedHashMap();
    }

    @n6.d
    @s4.m
    public static final <C> Class<? extends C> D(@n6.d Context context, @n6.d String str, @n6.d Class<? extends C> cls) {
        return f16312t.e(context, str, cls);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    @s4.m
    public static final <C> Class<? extends C> E(@n6.d Context context, @n6.d String str, @n6.d Class<? extends C> cls) {
        return f16312t.f(context, str, cls);
    }

    public static /* synthetic */ int[] k(g0 g0Var, g0 g0Var2, int i7, Object obj) {
        if (obj == null) {
            if ((i7 & 1) != 0) {
                g0Var2 = null;
            }
            return g0Var.j(g0Var2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    @s4.m
    public static final String p(@n6.d Context context, int i7) {
        return f16312t.b(context, i7);
    }

    @n6.d
    public static final f5.m<g0> q(@n6.d g0 g0Var) {
        return f16312t.c(g0Var);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public final c A(@n6.d String str) {
        u4.l0.p(str, "route");
        e0.a.C0242a c0242a = e0.a.f16305d;
        Uri parse = Uri.parse(f16312t.a(str));
        u4.l0.h(parse, "Uri.parse(this)");
        e0 a7 = c0242a.c(parse).a();
        return this instanceof k0 ? ((k0) this).c0(a7) : B(a7);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public c B(@n6.d e0 e0Var) {
        u4.l0.p(e0Var, "navDeepLinkRequest");
        if (this.f16318o.isEmpty()) {
            return null;
        }
        c cVar = null;
        for (z zVar : this.f16318o) {
            Uri c7 = e0Var.c();
            Bundle o6 = c7 != null ? zVar.o(c7, n()) : null;
            int h7 = zVar.h(c7);
            String a7 = e0Var.a();
            boolean z6 = a7 != null && u4.l0.g(a7, zVar.i());
            String b7 = e0Var.b();
            int u6 = b7 != null ? zVar.u(b7) : -1;
            if (o6 == null) {
                if (z6 || u6 > -1) {
                    if (y(zVar, c7, n())) {
                    }
                }
            }
            c cVar2 = new c(this, o6, zVar.z(), h7, z6, u6);
            if (cVar == null || cVar2.compareTo(cVar) > 0) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    @d.i
    public void C(@n6.d Context context, @n6.d AttributeSet attributeSet) {
        u4.l0.p(context, "context");
        u4.l0.p(attributeSet, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a.b.f16822y);
        u4.l0.o(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        M(obtainAttributes.getString(a.b.B));
        if (obtainAttributes.hasValue(a.b.A)) {
            J(obtainAttributes.getResourceId(a.b.A, 0));
            this.f16316m = f16312t.b(context, this.f16321r);
        }
        this.f16317n = obtainAttributes.getText(a.b.f16823z);
        m2 m2Var = m2.f17815a;
        obtainAttributes.recycle();
    }

    public final void F(@d.d0 int i7, @d.d0 int i8) {
        G(i7, new l(i8, null, null, 6, null));
    }

    public final void G(@d.d0 int i7, @n6.d l lVar) {
        u4.l0.p(lVar, t0.f16450f);
        if (N()) {
            if (!(i7 != 0)) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            this.f16319p.u(i7, lVar);
            return;
        }
        throw new UnsupportedOperationException("Cannot add action " + i7 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void H(@d.d0 int i7) {
        this.f16319p.x(i7);
    }

    public final void I(@n6.d String str) {
        u4.l0.p(str, "argumentName");
        this.f16320q.remove(str);
    }

    public final void J(@d.d0 int i7) {
        this.f16321r = i7;
        this.f16316m = null;
    }

    public final void K(@n6.e CharSequence charSequence) {
        this.f16317n = charSequence;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final void L(@n6.e k0 k0Var) {
        this.f16315l = k0Var;
    }

    public final void M(@n6.e String str) {
        Object obj;
        if (str == null) {
            J(0);
        } else if ((!i5.b0.V1(str)) != true) {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        } else {
            String a7 = f16312t.a(str);
            J(a7.hashCode());
            d(a7);
        }
        List<z> list = this.f16318o;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (u4.l0.g(((z) obj).y(), f16312t.a(this.f16322s))) {
                break;
            }
        }
        u1.a(list).remove(obj);
        this.f16322s = str;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public boolean N() {
        return true;
    }

    public final void b(@n6.d String str, @n6.d q qVar) {
        u4.l0.p(str, "argumentName");
        u4.l0.p(qVar, t0.f16448d);
        this.f16320q.put(str, qVar);
    }

    public final void d(@n6.d String str) {
        u4.l0.p(str, "uriPattern");
        f(new z.a().g(str).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@n6.e java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.g0.equals(java.lang.Object):boolean");
    }

    public final void f(@n6.d z zVar) {
        u4.l0.p(zVar, "navDeepLink");
        List<String> a7 = s.a(n(), new d(zVar));
        if (a7.isEmpty()) {
            this.f16318o.add(zVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + zVar.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + a7).toString());
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.e
    public final Bundle g(@n6.e Bundle bundle) {
        if (bundle == null) {
            Map<String, q> map = this.f16320q;
            if (map == null || map.isEmpty()) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, q> entry : this.f16320q.entrySet()) {
            entry.getValue().e(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, q> entry2 : this.f16320q.entrySet()) {
                String key = entry2.getKey();
                q value = entry2.getValue();
                if (!value.f(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.b().c() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public int hashCode() {
        Set<String> keySet;
        int i7 = this.f16321r * 31;
        String str = this.f16322s;
        int hashCode = i7 + (str != null ? str.hashCode() : 0);
        for (z zVar : this.f16318o) {
            int i8 = hashCode * 31;
            String y6 = zVar.y();
            int hashCode2 = (i8 + (y6 != null ? y6.hashCode() : 0)) * 31;
            String i9 = zVar.i();
            int hashCode3 = (hashCode2 + (i9 != null ? i9.hashCode() : 0)) * 31;
            String t6 = zVar.t();
            hashCode = hashCode3 + (t6 != null ? t6.hashCode() : 0);
        }
        Iterator k7 = androidx.collection.o.k(this.f16319p);
        while (k7.hasNext()) {
            l lVar = (l) k7.next();
            int b7 = ((hashCode * 31) + lVar.b()) * 31;
            u0 c7 = lVar.c();
            hashCode = b7 + (c7 != null ? c7.hashCode() : 0);
            Bundle a7 = lVar.a();
            if (a7 != null && (keySet = a7.keySet()) != null) {
                u4.l0.o(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i10 = hashCode * 31;
                    Bundle a8 = lVar.a();
                    u4.l0.m(a8);
                    Object obj = a8.get(str2);
                    hashCode = i10 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : n().keySet()) {
            int hashCode4 = ((hashCode * 31) + str3.hashCode()) * 31;
            q qVar = n().get(str3);
            hashCode = hashCode4 + (qVar != null ? qVar.hashCode() : 0);
        }
        return hashCode;
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    @s4.i
    public final int[] i() {
        return k(this, null, 1, null);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    @s4.i
    public final int[] j(@n6.e g0 g0Var) {
        x3.k kVar = new x3.k();
        k0 k0Var = this;
        while (true) {
            u4.l0.m(k0Var);
            k0 k0Var2 = k0Var.f16315l;
            if ((g0Var != null ? g0Var.f16315l : null) != null) {
                k0 k0Var3 = g0Var.f16315l;
                u4.l0.m(k0Var3);
                if (k0Var3.S(k0Var.f16321r) == k0Var) {
                    kVar.d(k0Var);
                    break;
                }
            }
            if (k0Var2 == null || k0Var2.a0() != k0Var.f16321r) {
                kVar.d(k0Var);
            }
            if (u4.l0.g(k0Var2, g0Var) || k0Var2 == null) {
                break;
            }
            k0Var = k0Var2;
        }
        List Q5 = x3.e0.Q5(kVar);
        ArrayList arrayList = new ArrayList(x3.x.Y(Q5, 10));
        Iterator it = Q5.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((g0) it.next()).f16321r));
        }
        return x3.e0.P5(arrayList);
    }

    @n6.e
    public final String l(@n6.d Context context, @n6.e Bundle bundle) {
        q qVar;
        u4.l0.p(context, "context");
        CharSequence charSequence = this.f16317n;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (bundle == null || !bundle.containsKey(group)) {
                throw new IllegalArgumentException("Could not find \"" + group + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + i5.h0.f11093b);
            }
            matcher.appendReplacement(stringBuffer, "");
            if (u4.l0.g((group == null || (qVar = n().get(group)) == null) ? null : qVar.b(), y0.f16557e)) {
                String string = context.getString(bundle.getInt(group));
                u4.l0.o(string, "context.getString(bundle.getInt(argName))");
                stringBuffer.append(string);
            } else {
                stringBuffer.append(bundle.getString(group));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @n6.e
    public final l m(@d.d0 int i7) {
        l o6 = this.f16319p.s() ? null : this.f16319p.o(i7);
        if (o6 == null) {
            k0 k0Var = this.f16315l;
            if (k0Var != null) {
                return k0Var.m(i7);
            }
            return null;
        }
        return o6;
    }

    @n6.d
    public final Map<String, q> n() {
        return x3.a1.F0(this.f16320q);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    public String o() {
        String str = this.f16316m;
        return str == null ? String.valueOf(this.f16321r) : str;
    }

    @d.d0
    public final int r() {
        return this.f16321r;
    }

    @n6.e
    public final CharSequence s() {
        return this.f16317n;
    }

    @n6.d
    public final String t() {
        return this.f16314k;
    }

    @n6.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f16316m;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f16321r));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f16322s;
        if (!(str2 == null || i5.b0.V1(str2))) {
            sb.append(" route=");
            sb.append(this.f16322s);
        }
        if (this.f16317n != null) {
            sb.append(" label=");
            sb.append(this.f16317n);
        }
        String sb2 = sb.toString();
        u4.l0.o(sb2, "sb.toString()");
        return sb2;
    }

    @n6.e
    public final k0 u() {
        return this.f16315l;
    }

    @n6.e
    public final String v() {
        return this.f16322s;
    }

    public boolean w(@n6.d Uri uri) {
        u4.l0.p(uri, t0.f16449e);
        return x(new e0(uri, null, null));
    }

    public boolean x(@n6.d e0 e0Var) {
        u4.l0.p(e0Var, "deepLinkRequest");
        return B(e0Var) != null;
    }

    public final boolean y(z zVar, Uri uri, Map<String, q> map) {
        return s.a(map, new e(zVar.p(uri, map))).isEmpty();
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    public final boolean z(@n6.d String str, @n6.e Bundle bundle) {
        u4.l0.p(str, "route");
        if (u4.l0.g(this.f16322s, str)) {
            return true;
        }
        c A = A(str);
        if (u4.l0.g(this, A != null ? A.d() : null)) {
            return A.h(bundle);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(@n6.d d1<? extends g0> d1Var) {
        this(e1.f16309b.a(d1Var.getClass()));
        u4.l0.p(d1Var, "navigator");
    }
}
