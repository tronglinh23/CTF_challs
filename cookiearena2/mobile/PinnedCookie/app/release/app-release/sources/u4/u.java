package u4;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import u.v;
@r1({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n442#3:215\n392#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
/* loaded from: classes.dex */
public final class u implements e5.d<Object>, t {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final a f17487l = new a(null);
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final Map<Class<? extends v3.v<?>>, Integer> f17488m;
    @n6.d

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap<String, String> f17489n;
    @n6.d

    /* renamed from: o  reason: collision with root package name */
    public static final HashMap<String, String> f17490o;
    @n6.d

    /* renamed from: p  reason: collision with root package name */
    public static final HashMap<String, String> f17491p;
    @n6.d

    /* renamed from: q  reason: collision with root package name */
    public static final Map<String, String> f17492q;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Class<?> f17493k;

    @r1({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        @n6.e
        public final String a(@n6.d Class<?> cls) {
            String str;
            l0.p(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) u.f17491p.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) u.f17491p.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
            if (r2 == null) goto L13;
         */
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(@n6.d java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                u4.l0.p(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb6
            Le:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L6c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L43
                u4.l0.o(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = i5.c0.q5(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L40
                goto L43
            L40:
                r1 = r2
                goto Lb6
            L43:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L64
                u4.l0.o(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = i5.c0.q5(r0, r8, r1, r3, r1)
                goto Lb6
            L64:
                u4.l0.o(r0, r5)
                java.lang.String r1 = i5.c0.p5(r0, r4, r1, r3, r1)
                goto Lb6
            L6c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto La1
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9e
                java.util.Map r0 = u4.u.w()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L9e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = r0.toString()
                r1 = r8
            L9e:
                if (r1 != 0) goto Lb6
                goto L40
            La1:
                java.util.Map r0 = u4.u.w()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb6
                java.lang.String r1 = r8.getSimpleName()
            Lb6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: u4.u.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(@n6.e Object obj, @n6.d Class<?> cls) {
            l0.p(cls, "jClass");
            Map map = u.f17488m;
            l0.n(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return u1.B(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = s4.a.g(s4.a.i(cls));
            }
            return cls.isInstance(obj);
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i7 = 0;
        List L = x3.w.L(t4.a.class, t4.l.class, t4.p.class, t4.q.class, t4.r.class, t4.s.class, t4.t.class, t4.u.class, t4.v.class, t4.w.class, t4.b.class, t4.c.class, t4.d.class, t4.e.class, t4.f.class, t4.g.class, t4.h.class, t4.i.class, t4.j.class, t4.k.class, t4.m.class, t4.n.class, t4.o.class);
        ArrayList arrayList = new ArrayList(x3.x.Y(L, 10));
        for (Object obj : L) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            arrayList.add(v3.q1.a((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f17488m = x3.a1.D0(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(v.b.f17141f, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(v.b.f17138c, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f17489n = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f17490o = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l0.o(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l0.o(str, "kotlinName");
            sb.append(i5.c0.t5(str, '.', null, 2, null));
            sb.append("CompanionObject");
            v3.u0 a7 = v3.q1.a(sb.toString(), str + ".Companion");
            hashMap3.put(a7.e(), a7.f());
        }
        for (Map.Entry<Class<? extends v3.v<?>>, Integer> entry : f17488m.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f17491p = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(x3.z0.j(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), i5.c0.t5((String) entry2.getValue(), '.', null, 2, null));
        }
        f17492q = linkedHashMap;
    }

    public u(@n6.d Class<?> cls) {
        l0.p(cls, "jClass");
        this.f17493k = cls;
    }

    @v3.g1(version = "1.3")
    public static /* synthetic */ void B() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void E() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void F() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void I() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void J() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void K() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void M() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void O() {
    }

    @v3.g1(version = "1.4")
    public static /* synthetic */ void P() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void T() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void U() {
    }

    @v3.g1(version = "1.1")
    public static /* synthetic */ void V() {
    }

    @v3.g1(version = "1.5")
    public static /* synthetic */ void W() {
    }

    @Override // e5.d
    @n6.d
    public Collection<e5.i<Object>> A() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    public boolean G() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    @v3.g1(version = "1.1")
    public boolean Q(@n6.e Object obj) {
        return f17487l.c(obj, n());
    }

    @Override // e5.b
    @n6.d
    public List<Annotation> R() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    @n6.d
    public List<e5.d<? extends Object>> S() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    public boolean Y() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    public boolean a0() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    @n6.e
    public e5.w b() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    @n6.e
    public String c0() {
        return f17487l.b(n());
    }

    @Override // e5.d
    public boolean d() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    public boolean equals(@n6.e Object obj) {
        return (obj instanceof u) && l0.g(s4.a.g(this), s4.a.g((e5.d) obj));
    }

    @Override // e5.d
    public boolean g() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    @n6.d
    public List<e5.s> h0() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    public int hashCode() {
        return s4.a.g(this).hashCode();
    }

    @Override // e5.d
    public boolean isOpen() {
        y();
        throw new v3.y();
    }

    @Override // e5.d, e5.h
    @n6.d
    public Collection<e5.c<?>> j() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    @n6.d
    public List<e5.t> k() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    @n6.e
    public Object m0() {
        y();
        throw new v3.y();
    }

    @Override // u4.t
    @n6.d
    public Class<?> n() {
        return this.f17493k;
    }

    @Override // e5.d
    @n6.e
    public String o() {
        return f17487l.a(n());
    }

    @Override // e5.d
    @n6.d
    public Collection<e5.d<?>> q() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    public boolean r() {
        y();
        throw new v3.y();
    }

    @Override // e5.d
    public boolean t0() {
        y();
        throw new v3.y();
    }

    @n6.d
    public String toString() {
        return n().toString() + l1.f17441b;
    }

    @Override // e5.d
    public boolean x() {
        y();
        throw new v3.y();
    }

    public final Void y() {
        throw new s4.q();
    }
}
