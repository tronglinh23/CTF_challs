package f5;

import b4.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import u4.h0;
import u4.k1;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.b1;
import v3.b2;
import v3.e1;
import v3.g1;
import v3.m2;
import v3.q1;
import v3.q2;
import v3.t0;
import v3.u0;
import v3.x1;
import x3.e0;
import x3.l1;
import x3.o1;
import x3.p0;
@r1({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3094:1\n179#1,2:3095\n316#1,7:3097\n1306#1,3:3105\n739#1,4:3108\n704#1,4:3112\n722#1,4:3116\n775#1,4:3120\n999#1,3:3124\n1002#1,3:3134\n1019#1,3:3137\n1022#1,3:3147\n1306#1,3:3164\n1295#1,2:3167\n1#2:3104\n361#3,7:3127\n361#3,7:3140\n361#3,7:3150\n361#3,7:3157\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n87#1:3095,2\n99#1:3097,7\n458#1:3105,3\n658#1:3108,4\n674#1:3112,4\n689#1:3116,4\n760#1:3120,4\n970#1:3124,3\n970#1:3134,3\n985#1:3137,3\n985#1:3147,3\n1088#1:3164,3\n1126#1:3167,2\n970#1:3127,7\n985#1:3140,7\n1001#1:3150,7\n1021#1:3157,7\n*E\n"})
/* loaded from: classes.dex */
public class u extends f5.t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n2903#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements Iterable<T>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ f5.m f9876k;

        public a(f5.m mVar) {
            this.f9876k = mVar;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<T> iterator() {
            return this.f9876k.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a0<T> extends n0 implements t4.p<T, T, u0<? extends T, ? extends T>> {

        /* renamed from: l  reason: collision with root package name */
        public static final a0 f9877l = new a0();

        public a0() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final u0<T, T> J(T t6, T t7) {
            return q1.a(t6, t7);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> extends n0 implements t4.l<T, T> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f9878l = new b();

        public b() {
            super(1);
        }

        @Override // t4.l
        public final T O(T t6) {
            return t6;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @h4.f(c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", f = "_Sequences.kt", i = {0, 0, 0}, l = {2855}, m = "invokeSuspend", n = {"$this$result", "iterator", "next"}, s = {"L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class b0<R> extends h4.k implements t4.p<f5.o<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f9879m;

        /* renamed from: n  reason: collision with root package name */
        public Object f9880n;

        /* renamed from: o  reason: collision with root package name */
        public int f9881o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f9882p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9883q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ t4.p<T, T, R> f9884r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b0(f5.m<? extends T> mVar, t4.p<? super T, ? super T, ? extends R> pVar, e4.d<? super b0> dVar) {
            super(2, dVar);
            this.f9883q = mVar;
            this.f9884r = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b0 b0Var = new b0(this.f9883q, this.f9884r, dVar);
            b0Var.f9882p = obj;
            return b0Var;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            f5.o oVar;
            Object next;
            Iterator it;
            Object h7 = g4.d.h();
            int i7 = this.f9881o;
            if (i7 == 0) {
                e1.n(obj);
                f5.o oVar2 = (f5.o) this.f9882p;
                Iterator it2 = this.f9883q.iterator();
                if (!it2.hasNext()) {
                    return m2.f17815a;
                }
                oVar = oVar2;
                next = it2.next();
                it = it2;
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                Object obj2 = this.f9880n;
                it = (Iterator) this.f9879m;
                oVar = (f5.o) this.f9882p;
                e1.n(obj);
                next = obj2;
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                R J = this.f9884r.J(next, next2);
                this.f9882p = oVar;
                this.f9879m = it;
                this.f9880n = next2;
                this.f9881o = 1;
                if (oVar.a(J, this) == h7) {
                    return h7;
                }
                next = next2;
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super R> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((b0) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class c<T> extends n0 implements t4.l<Integer, T> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f9885l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i7) {
            super(1);
            this.f9885l = i7;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ Object O(Integer num) {
            return b(num.intValue());
        }

        public final T b(int i7) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f9885l + '.');
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class d<T> extends n0 implements t4.l<p0<? extends T>, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p<Integer, T, Boolean> f9886l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(t4.p<? super Integer, ? super T, Boolean> pVar) {
            super(1);
            this.f9886l = pVar;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d p0<? extends T> p0Var) {
            l0.p(p0Var, "it");
            return this.f9886l.J(Integer.valueOf(p0Var.e()), p0Var.f());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class e<T> extends n0 implements t4.l<p0<? extends T>, T> {

        /* renamed from: l  reason: collision with root package name */
        public static final e f9887l = new e();

        public e() {
            super(1);
        }

        @Override // t4.l
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final T O(@n6.d p0<? extends T> p0Var) {
            l0.p(p0Var, "it");
            return p0Var.f();
        }
    }

    @r1({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$filterIsInstance$1\n*L\n1#1,3094:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class f extends n0 implements t4.l<Object, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final f f9888l = new f();

        public f() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.e Object obj) {
            l0.y(3, "R");
            return Boolean.valueOf(obj instanceof Object);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class g<T> extends n0 implements t4.l<T, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final g f9889l = new g();

        public g() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.e T t6) {
            return Boolean.valueOf(t6 == null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public /* synthetic */ class h<R> extends h0 implements t4.l<Iterable<? extends R>, Iterator<? extends R>> {

        /* renamed from: t  reason: collision with root package name */
        public static final h f9890t = new h();

        public h() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: C0  reason: merged with bridge method [inline-methods] */
        public final Iterator<R> O(@n6.d Iterable<? extends R> iterable) {
            l0.p(iterable, "p0");
            return (Iterator<? extends R>) iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public /* synthetic */ class i<R> extends h0 implements t4.l<f5.m<? extends R>, Iterator<? extends R>> {

        /* renamed from: t  reason: collision with root package name */
        public static final i f9891t = new i();

        public i() {
            super(1, f5.m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: C0  reason: merged with bridge method [inline-methods] */
        public final Iterator<R> O(@n6.d f5.m<? extends R> mVar) {
            l0.p(mVar, "p0");
            return (Iterator<? extends R>) mVar.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public /* synthetic */ class j<R> extends h0 implements t4.l<Iterable<? extends R>, Iterator<? extends R>> {

        /* renamed from: t  reason: collision with root package name */
        public static final j f9892t = new j();

        public j() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: C0  reason: merged with bridge method [inline-methods] */
        public final Iterator<R> O(@n6.d Iterable<? extends R> iterable) {
            l0.p(iterable, "p0");
            return (Iterator<? extends R>) iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* loaded from: classes.dex */
    public /* synthetic */ class k<R> extends h0 implements t4.l<f5.m<? extends R>, Iterator<? extends R>> {

        /* renamed from: t  reason: collision with root package name */
        public static final k f9893t = new k();

        public k() {
            super(1, f5.m.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: C0  reason: merged with bridge method [inline-methods] */
        public final Iterator<R> O(@n6.d f5.m<? extends R> mVar) {
            l0.p(mVar, "p0");
            return (Iterator<? extends R>) mVar.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    @r1({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$groupingBy$1\n*L\n1#1,3094:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class l<K, T> implements x3.l0<T, K> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9894a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, K> f9895b;

        /* JADX WARN: Multi-variable type inference failed */
        public l(f5.m<? extends T> mVar, t4.l<? super T, ? extends K> lVar) {
            this.f9894a = mVar;
            this.f9895b = lVar;
        }

        @Override // x3.l0
        public K a(T t6) {
            return this.f9895b.O(t6);
        }

        @Override // x3.l0
        @n6.d
        public Iterator<T> b() {
            return this.f9894a.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class m<T> implements f5.m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9896a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T f9897b;

        /* loaded from: classes.dex */
        public static final class a extends n0 implements t4.l<T, Boolean> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ k1.a f9898l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ T f9899m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k1.a aVar, T t6) {
                super(1);
                this.f9898l = aVar;
                this.f9899m = t6;
            }

            @Override // t4.l
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final Boolean O(T t6) {
                boolean z6 = true;
                if (!this.f9898l.f17429k && l0.g(t6, this.f9899m)) {
                    this.f9898l.f17429k = true;
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public m(f5.m<? extends T> mVar, T t6) {
            this.f9896a = mVar;
            this.f9897b = t6;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            return u.p0(this.f9896a, new a(new k1.a(), this.f9897b)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class n<T> implements f5.m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9900a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T[] f9901b;

        /* loaded from: classes.dex */
        public static final class a extends n0 implements t4.l<T, Boolean> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ T[] f9902l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(T[] tArr) {
                super(1);
                this.f9902l = tArr;
            }

            @Override // t4.l
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final Boolean O(T t6) {
                return Boolean.valueOf(x3.p.T8(this.f9902l, t6));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public n(f5.m<? extends T> mVar, T[] tArr) {
            this.f9900a = mVar;
            this.f9901b = tArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            return u.u0(this.f9900a, new a(this.f9901b)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class o<T> implements f5.m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterable<T> f9903a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9904b;

        /* loaded from: classes.dex */
        public static final class a extends n0 implements t4.l<T, Boolean> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ Collection<T> f9905l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Collection<? extends T> collection) {
                super(1);
                this.f9905l = collection;
            }

            @Override // t4.l
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final Boolean O(T t6) {
                return Boolean.valueOf(this.f9905l.contains(t6));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o(Iterable<? extends T> iterable, f5.m<? extends T> mVar) {
            this.f9903a = iterable;
            this.f9904b = mVar;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            Collection q02 = x3.b0.q0(this.f9903a);
            return q02.isEmpty() ? this.f9904b.iterator() : u.u0(this.f9904b, new a(q02)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class p<T> implements f5.m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9906a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9907b;

        /* loaded from: classes.dex */
        public static final class a extends n0 implements t4.l<T, Boolean> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ List<T> f9908l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(List<? extends T> list) {
                super(1);
                this.f9908l = list;
            }

            @Override // t4.l
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final Boolean O(T t6) {
                return Boolean.valueOf(this.f9908l.contains(t6));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public p(f5.m<? extends T> mVar, f5.m<? extends T> mVar2) {
            this.f9906a = mVar;
            this.f9907b = mVar2;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            List c32 = u.c3(this.f9906a);
            return c32.isEmpty() ? this.f9907b.iterator() : u.u0(this.f9907b, new a(c32)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class q<T> extends n0 implements t4.l<T, T> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, m2> f9909l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(t4.l<? super T, m2> lVar) {
            super(1);
            this.f9909l = lVar;
        }

        @Override // t4.l
        public final T O(T t6) {
            this.f9909l.O(t6);
            return t6;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class r<T> extends n0 implements t4.p<Integer, T, T> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p<Integer, T, m2> f9910l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(t4.p<? super Integer, ? super T, m2> pVar) {
            super(2);
            this.f9910l = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // t4.p
        public /* bridge */ /* synthetic */ Object J(Integer num, Object obj) {
            return b(num.intValue(), obj);
        }

        public final T b(int i7, T t6) {
            this.f9910l.J(Integer.valueOf(i7), t6);
            return t6;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class s<T> extends n0 implements t4.l<T, T> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9911l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(f5.m<? extends T> mVar) {
            super(1);
            this.f9911l = mVar;
        }

        @Override // t4.l
        @n6.d
        public final T O(@n6.e T t6) {
            if (t6 != null) {
                return t6;
            }
            throw new IllegalArgumentException("null element found in " + this.f9911l + '.');
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @h4.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", i = {0, 1, 1}, l = {2290, 2294}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator"}, s = {"L$0", "L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class t<R> extends h4.k implements t4.p<f5.o<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f9912m;

        /* renamed from: n  reason: collision with root package name */
        public Object f9913n;

        /* renamed from: o  reason: collision with root package name */
        public int f9914o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f9915p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ R f9916q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9917r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ t4.p<R, T, R> f9918s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public t(R r6, f5.m<? extends T> mVar, t4.p<? super R, ? super T, ? extends R> pVar, e4.d<? super t> dVar) {
            super(2, dVar);
            this.f9916q = r6;
            this.f9917r = mVar;
            this.f9918s = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            t tVar = new t(this.f9916q, this.f9917r, this.f9918s, dVar);
            tVar.f9915p = obj;
            return tVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r7.f9914o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.f9913n
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r7.f9912m
                java.lang.Object r4 = r7.f9915p
                f5.o r4 = (f5.o) r4
                v3.e1.n(r8)
                r8 = r3
                goto L4c
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                java.lang.Object r1 = r7.f9915p
                f5.o r1 = (f5.o) r1
                v3.e1.n(r8)
                goto L42
            L2d:
                v3.e1.n(r8)
                java.lang.Object r8 = r7.f9915p
                r1 = r8
                f5.o r1 = (f5.o) r1
                R r8 = r7.f9916q
                r7.f9915p = r1
                r7.f9914o = r3
                java.lang.Object r8 = r1.a(r8, r7)
                if (r8 != r0) goto L42
                return r0
            L42:
                R r8 = r7.f9916q
                f5.m<T> r3 = r7.f9917r
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4c:
                r3 = r7
            L4d:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L6c
                java.lang.Object r5 = r1.next()
                t4.p<R, T, R> r6 = r3.f9918s
                java.lang.Object r8 = r6.J(r8, r5)
                r3.f9915p = r4
                r3.f9912m = r8
                r3.f9913n = r1
                r3.f9914o = r2
                java.lang.Object r5 = r4.a(r8, r3)
                if (r5 != r0) goto L4d
                return r0
            L6c:
                v3.m2 r8 = v3.m2.f17815a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: f5.u.t.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super R> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((t) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @h4.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", f = "_Sequences.kt", i = {0, 1, 1, 1}, l = {2318, 2323}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, s = {"L$0", "L$0", "L$1", "I$0"})
    /* renamed from: f5.u$u  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0108u<R> extends h4.k implements t4.p<f5.o<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f9919m;

        /* renamed from: n  reason: collision with root package name */
        public Object f9920n;

        /* renamed from: o  reason: collision with root package name */
        public int f9921o;

        /* renamed from: p  reason: collision with root package name */
        public int f9922p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f9923q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ R f9924r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9925s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ t4.q<Integer, R, T, R> f9926t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0108u(R r6, f5.m<? extends T> mVar, t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar, e4.d<? super C0108u> dVar) {
            super(2, dVar);
            this.f9924r = r6;
            this.f9925s = mVar;
            this.f9926t = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            C0108u c0108u = new C0108u(this.f9924r, this.f9925s, this.f9926t, dVar);
            c0108u.f9923q = obj;
            return c0108u;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r9.f9922p
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r9.f9921o
                java.lang.Object r3 = r9.f9920n
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r9.f9919m
                java.lang.Object r5 = r9.f9923q
                f5.o r5 = (f5.o) r5
                v3.e1.n(r10)
                r10 = r4
                r4 = r1
                goto L4f
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                java.lang.Object r1 = r9.f9923q
                f5.o r1 = (f5.o) r1
                v3.e1.n(r10)
                goto L45
            L30:
                v3.e1.n(r10)
                java.lang.Object r10 = r9.f9923q
                r1 = r10
                f5.o r1 = (f5.o) r1
                R r10 = r9.f9924r
                r9.f9923q = r1
                r9.f9922p = r3
                java.lang.Object r10 = r1.a(r10, r9)
                if (r10 != r0) goto L45
                return r0
            L45:
                R r10 = r9.f9924r
                f5.m<T> r3 = r9.f9925s
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = r1
            L4f:
                r1 = r9
            L50:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L7f
                java.lang.Object r6 = r3.next()
                t4.q<java.lang.Integer, R, T, R> r7 = r1.f9926t
                int r8 = r4 + 1
                if (r4 >= 0) goto L63
                x3.w.W()
            L63:
                java.lang.Integer r4 = h4.b.f(r4)
                java.lang.Object r4 = r7.I(r4, r10, r6)
                r1.f9923q = r5
                r1.f9919m = r4
                r1.f9920n = r3
                r1.f9921o = r8
                r1.f9922p = r2
                java.lang.Object r10 = r5.a(r4, r1)
                if (r10 != r0) goto L7c
                return r0
            L7c:
                r10 = r4
                r4 = r8
                goto L50
            L7f:
                v3.m2 r10 = v3.m2.f17815a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: f5.u.C0108u.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super R> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((C0108u) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @h4.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1}, l = {2348, 2351}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class v<S> extends h4.k implements t4.p<f5.o<? super S>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f9927m;

        /* renamed from: n  reason: collision with root package name */
        public Object f9928n;

        /* renamed from: o  reason: collision with root package name */
        public int f9929o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f9930p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9931q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ t4.p<S, T, S> f9932r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public v(f5.m<? extends T> mVar, t4.p<? super S, ? super T, ? extends S> pVar, e4.d<? super v> dVar) {
            super(2, dVar);
            this.f9931q = mVar;
            this.f9932r = pVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            v vVar = new v(this.f9931q, this.f9932r, dVar);
            vVar.f9930p = obj;
            return vVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            f5.o oVar;
            Object next;
            Iterator it;
            Object h7 = g4.d.h();
            int i7 = this.f9929o;
            if (i7 == 0) {
                e1.n(obj);
                oVar = (f5.o) this.f9930p;
                Iterator it2 = this.f9931q.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.f9930p = oVar;
                    this.f9927m = it2;
                    this.f9928n = next;
                    this.f9929o = 1;
                    if (oVar.a(next, this) == h7) {
                        return h7;
                    }
                    it = it2;
                }
                return m2.f17815a;
            } else if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                next = this.f9928n;
                it = (Iterator) this.f9927m;
                oVar = (f5.o) this.f9930p;
                e1.n(obj);
            }
            while (it.hasNext()) {
                next = this.f9932r.J(next, it.next());
                this.f9930p = oVar;
                this.f9927m = it;
                this.f9928n = next;
                this.f9929o = 2;
                if (oVar.a(next, this) == h7) {
                    return h7;
                }
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super S> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((v) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @h4.f(c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", f = "_Sequences.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {2377, 2381}, m = "invokeSuspend", n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    /* loaded from: classes.dex */
    public static final class w<S> extends h4.k implements t4.p<f5.o<? super S>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f9933m;

        /* renamed from: n  reason: collision with root package name */
        public Object f9934n;

        /* renamed from: o  reason: collision with root package name */
        public int f9935o;

        /* renamed from: p  reason: collision with root package name */
        public int f9936p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f9937q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9938r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ t4.q<Integer, S, T, S> f9939s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public w(f5.m<? extends T> mVar, t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar, e4.d<? super w> dVar) {
            super(2, dVar);
            this.f9938r = mVar;
            this.f9939s = qVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            w wVar = new w(this.f9938r, this.f9939s, dVar);
            wVar.f9937q = obj;
            return wVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r10.f9936p
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L38
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L22
                int r1 = r10.f9935o
                java.lang.Object r3 = r10.f9934n
                java.lang.Object r4 = r10.f9933m
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r10.f9937q
                f5.o r5 = (f5.o) r5
                v3.e1.n(r11)
                r11 = r10
                r9 = r3
                r3 = r1
                r1 = r9
                goto L60
            L22:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L2a:
                java.lang.Object r1 = r10.f9934n
                java.lang.Object r4 = r10.f9933m
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r10.f9937q
                f5.o r5 = (f5.o) r5
                v3.e1.n(r11)
                goto L5f
            L38:
                v3.e1.n(r11)
                java.lang.Object r11 = r10.f9937q
                r5 = r11
                f5.o r5 = (f5.o) r5
                f5.m<T> r11 = r10.f9938r
                java.util.Iterator r4 = r11.iterator()
                boolean r11 = r4.hasNext()
                if (r11 == 0) goto L8f
                java.lang.Object r1 = r4.next()
                r10.f9937q = r5
                r10.f9933m = r4
                r10.f9934n = r1
                r10.f9936p = r3
                java.lang.Object r11 = r5.a(r1, r10)
                if (r11 != r0) goto L5f
                return r0
            L5f:
                r11 = r10
            L60:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L8f
                t4.q<java.lang.Integer, S, T, S> r6 = r11.f9939s
                int r7 = r3 + 1
                if (r3 >= 0) goto L6f
                x3.w.W()
            L6f:
                java.lang.Integer r3 = h4.b.f(r3)
                java.lang.Object r8 = r4.next()
                java.lang.Object r3 = r6.I(r3, r1, r8)
                r11.f9937q = r5
                r11.f9933m = r4
                r11.f9934n = r3
                r11.f9935o = r7
                r11.f9936p = r2
                java.lang.Object r1 = r5.a(r3, r11)
                if (r1 != r0) goto L8c
                return r0
            L8c:
                r1 = r3
                r3 = r7
                goto L60
            L8f:
                v3.m2 r11 = v3.m2.f17815a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: f5.u.w.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super S> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((w) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class x<T> implements f5.m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9940a;

        /* JADX WARN: Multi-variable type inference failed */
        public x(f5.m<? extends T> mVar) {
            this.f9940a = mVar;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            List d32 = u.d3(this.f9940a);
            x3.a0.j0(d32);
            return d32.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class y<T> implements f5.m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f5.m<T> f9941a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Comparator<? super T> f9942b;

        /* JADX WARN: Multi-variable type inference failed */
        public y(f5.m<? extends T> mVar, Comparator<? super T> comparator) {
            this.f9941a = mVar;
            this.f9942b = comparator;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            List d32 = u.d3(this.f9941a);
            x3.a0.m0(d32, this.f9942b);
            return d32.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* loaded from: classes.dex */
    public static final class z<R, T> extends n0 implements t4.p<T, R, u0<? extends T, ? extends R>> {

        /* renamed from: l  reason: collision with root package name */
        public static final z f9943l = new z();

        public z() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final u0<T, R> J(T t6, R r6) {
            return q1.a(t6, r6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <T> T A0(f5.m<? extends T> mVar, t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        T t6 = null;
        for (T t7 : mVar) {
            if (lVar.O(t7).booleanValue()) {
                t6 = t7;
            }
        }
        return t6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R> R A1(f5.m<? extends T> mVar, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((T) it.next());
            while (it.hasNext()) {
                R O = lVar.O((T) it.next());
                if (comparator.compare(obj, O) < 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <T, R> f5.m<R> A2(@n6.d f5.m<? extends T> mVar, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "operation");
        return w2(mVar, r6, pVar);
    }

    public static final <T> T B0(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R> R B1(f5.m<? extends T> mVar, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((T) it.next());
            while (it.hasNext()) {
                R O = lVar.O((T) it.next());
                if (comparator.compare(obj, O) < 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        return null;
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <T, R> f5.m<R> B2(@n6.d f5.m<? extends T> mVar, R r6, @n6.d t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        l0.p(mVar, "<this>");
        l0.p(qVar, "operation");
        return x2(mVar, r6, qVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T C0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        for (T t6 : mVar) {
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @g1(version = "1.4")
    @n6.e
    public static final <T extends Comparable<? super T>> T C1(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static final <T> T C2(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Sequence has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @g1(version = "1.5")
    @k4.f
    public static final <T, R> R D0(f5.m<? extends T> mVar, t4.l<? super T, ? extends R> lVar) {
        R r6;
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                r6 = null;
                break;
            }
            r6 = lVar.O((T) it.next());
            if (r6 != null) {
                break;
            }
        }
        if (r6 != null) {
            return r6;
        }
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @g1(version = "1.4")
    @n6.e
    public static final Double D1(@n6.d f5.m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T D2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        T t6 = null;
        boolean z6 = false;
        for (T t7 : mVar) {
            if (lVar.O(t7).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z6 = true;
                t6 = t7;
            }
        }
        if (z6) {
            return t6;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @g1(version = "1.5")
    @k4.f
    public static final <T, R> R E0(f5.m<? extends T> mVar, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            R O = lVar.O((T) it.next());
            if (O != null) {
                return O;
            }
        }
        return null;
    }

    @g1(version = "1.4")
    @n6.e
    public static final Float E1(@n6.d f5.m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @n6.e
    public static final <T> T E2(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                return null;
            }
            return next;
        }
        return null;
    }

    @n6.e
    public static final <T> T F0(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @s4.h(name = "maxOrThrow")
    @g1(version = "1.7")
    public static final double F1(@n6.d f5.m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.e
    public static final <T> T F2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        boolean z6 = false;
        T t6 = null;
        for (T t7 : mVar) {
            if (lVar.O(t7).booleanValue()) {
                if (z6) {
                    return null;
                }
                z6 = true;
                t6 = t7;
            }
        }
        if (z6) {
            return t6;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @n6.e
    public static final <T> T G0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        for (T t6 : mVar) {
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
        }
        return null;
    }

    @s4.h(name = "maxOrThrow")
    @g1(version = "1.7")
    public static final float G1(@n6.d f5.m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T extends Comparable<? super T>> f5.m<T> G2(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return new x(mVar);
    }

    @n6.d
    public static final <T, R> f5.m<R> H0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends f5.m<? extends R>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return new f5.i(mVar, lVar, i.f9891t);
    }

    @s4.h(name = "maxOrThrow")
    @g1(version = "1.7")
    @n6.d
    public static final <T extends Comparable<? super T>> T H1(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T, R extends Comparable<? super R>> f5.m<T> H2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        return K2(mVar, new g.a(lVar));
    }

    @s4.h(name = "flatMapIndexedIterable")
    @g1(version = "1.4")
    @t0
    @n6.d
    public static final <T, R> f5.m<R> I0(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return f5.s.h(mVar, pVar, j.f9892t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @n6.e
    public static final <T> T I1(@n6.d f5.m<? extends T> mVar, @n6.d Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) < 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        return null;
    }

    @n6.d
    public static final <T, R extends Comparable<? super R>> f5.m<T> I2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        return K2(mVar, new g.c(lVar));
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R, C extends Collection<? super R>> C J0(f5.m<? extends T> mVar, C c7, t4.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i7), obj));
            i7 = i8;
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @s4.h(name = "maxWithOrThrow")
    @g1(version = "1.7")
    public static final <T> T J1(@n6.d f5.m<? extends T> mVar, @n6.d Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) < 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T extends Comparable<? super T>> f5.m<T> J2(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return K2(mVar, b4.g.x());
    }

    public static final <T> boolean K(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (!lVar.O((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @s4.h(name = "flatMapIndexedSequence")
    @g1(version = "1.4")
    @t0
    @n6.d
    public static final <T, R> f5.m<R> K0(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super Integer, ? super T, ? extends f5.m<? extends R>> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return f5.s.h(mVar, pVar, k.f9893t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @g1(version = "1.4")
    @n6.e
    public static final <T, R extends Comparable<? super R>> T K1(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                R O = lVar.O(next);
                do {
                    T next2 = it.next();
                    R O2 = lVar.O(next2);
                    next = next;
                    if (O.compareTo(O2) > 0) {
                        O = O2;
                        next = next2;
                    }
                } while (it.hasNext());
                return (T) next;
            }
            return next;
        }
        return null;
    }

    @n6.d
    public static final <T> f5.m<T> K2(@n6.d f5.m<? extends T> mVar, @n6.d Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        return new y(mVar, comparator);
    }

    public static final <T> boolean L(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return mVar.iterator().hasNext();
    }

    @s4.h(name = "flatMapIndexedSequenceTo")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R, C extends Collection<? super R>> C L0(f5.m<? extends T> mVar, C c7, t4.p<? super Integer, ? super T, ? extends f5.m<? extends R>> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            x3.b0.n0(c7, pVar.J(Integer.valueOf(i7), obj));
            i7 = i8;
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @s4.h(name = "minByOrThrow")
    @g1(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T L1(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                R O = lVar.O(next);
                do {
                    T next2 = it.next();
                    R O2 = lVar.O(next2);
                    next = next;
                    if (O.compareTo(O2) > 0) {
                        O = O2;
                        next = next2;
                    }
                } while (it.hasNext());
                return (T) next;
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final <T> int L2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Integer> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += lVar.O((T) it.next()).intValue();
        }
        return i7;
    }

    public static final <T> boolean M(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (lVar.O((T) it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @s4.h(name = "flatMapIterable")
    @g1(version = "1.4")
    @t0
    @n6.d
    public static final <T, R> f5.m<R> M0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends Iterable<? extends R>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return new f5.i(mVar, lVar, h.f9890t);
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> double M1(f5.m<? extends T> mVar, t4.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.O((T) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final <T> double M2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        while (it.hasNext()) {
            d7 += lVar.O((T) it.next()).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final <T> Iterable<T> N(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return new a(mVar);
    }

    @s4.h(name = "flatMapIterableTo")
    @g1(version = "1.4")
    @t0
    @n6.d
    public static final <T, R, C extends Collection<? super R>> C N0(@n6.d f5.m<? extends T> mVar, @n6.d C c7, @n6.d t4.l<? super T, ? extends Iterable<? extends R>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            x3.b0.o0(c7, lVar.O((T) it.next()));
        }
        return c7;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> float N1(f5.m<? extends T> mVar, t4.l<? super T, Float> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.O((T) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @s4.h(name = "sumOfByte")
    public static final int N2(@n6.d f5.m<Byte> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Byte> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += it.next().byteValue();
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k4.f
    public static final <T> f5.m<T> O(f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return mVar;
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C O0(@n6.d f5.m<? extends T> mVar, @n6.d C c7, @n6.d t4.l<? super T, ? extends f5.m<? extends R>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            x3.b0.n0(c7, lVar.O((T) it.next()));
        }
        return c7;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R O1(f5.m<? extends T> mVar, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            R O = lVar.O((T) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((T) it.next());
                if (O.compareTo(O2) > 0) {
                    O = O2;
                }
            }
            return O;
        }
        throw new NoSuchElementException();
    }

    @s4.h(name = "sumOfDouble")
    public static final double O2(@n6.d f5.m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        while (it.hasNext()) {
            d7 += it.next().doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final <T, K, V> Map<K, V> P(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            u0<? extends K, ? extends V> O = lVar.O((T) it.next());
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    public static final <T, R> R P0(@n6.d f5.m<? extends T> mVar, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "operation");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            r6 = pVar.J(r6, (T) it.next());
        }
        return r6;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R P1(f5.m<? extends T> mVar, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            R O = lVar.O((T) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((T) it.next());
                if (O.compareTo(O2) > 0) {
                    O = O2;
                }
            }
            return O;
        }
        return null;
    }

    @s4.h(name = "sumOfDouble")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> double P2(f5.m<? extends T> mVar, t4.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        while (it.hasNext()) {
            d7 += lVar.O((T) it.next()).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final <T, K> Map<K, T> Q(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(lVar.O(obj), obj);
        }
        return linkedHashMap;
    }

    public static final <T, R> R Q0(@n6.d f5.m<? extends T> mVar, R r6, @n6.d t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        l0.p(mVar, "<this>");
        l0.p(qVar, "operation");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            r6 = qVar.I(Integer.valueOf(i7), r6, obj);
            i7 = i8;
        }
        return r6;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> Double Q1(f5.m<? extends T> mVar, t4.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.O((T) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @s4.h(name = "sumOfFloat")
    public static final float Q2(@n6.d f5.m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        float f7 = 0.0f;
        while (it.hasNext()) {
            f7 += it.next().floatValue();
        }
        return f7;
    }

    @n6.d
    public static final <T, K, V> Map<K, V> R(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            linkedHashMap.put(lVar.O(obj), lVar2.O(obj));
        }
        return linkedHashMap;
    }

    public static final <T> void R0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, m2> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, s2.t0.f16450f);
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            lVar.O((T) it.next());
        }
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> Float R1(f5.m<? extends T> mVar, t4.l<? super T, Float> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.O((T) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @s4.h(name = "sumOfInt")
    public static final int R2(@n6.d f5.m<Integer> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Integer> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += it.next().intValue();
        }
        return i7;
    }

    @n6.d
    public static final <T, K, M extends Map<? super K, ? super T>> M S(@n6.d f5.m<? extends T> mVar, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m7.put(lVar.O(obj), obj);
        }
        return m7;
    }

    public static final <T> void S0(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super Integer, ? super T, m2> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, s2.t0.f16450f);
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            pVar.J(Integer.valueOf(i7), obj);
            i7 = i8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R> R S1(f5.m<? extends T> mVar, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((T) it.next());
            while (it.hasNext()) {
                R O = lVar.O((T) it.next());
                if (comparator.compare(obj, O) > 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        throw new NoSuchElementException();
    }

    @s4.h(name = "sumOfInt")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> int S2(f5.m<? extends T> mVar, t4.l<? super T, Integer> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += lVar.O((T) it.next()).intValue();
        }
        return i7;
    }

    @n6.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M T(@n6.d f5.m<? extends T> mVar, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        l0.p(mVar, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            m7.put(lVar.O(obj), lVar2.O(obj));
        }
        return m7;
    }

    @n6.d
    public static final <T, K> Map<K, List<T>> T0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K O = lVar.O(obj);
            Object obj2 = linkedHashMap.get(O);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(O, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R> R T1(f5.m<? extends T> mVar, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            Object obj = (R) lVar.O((T) it.next());
            while (it.hasNext()) {
                R O = lVar.O((T) it.next());
                if (comparator.compare(obj, O) > 0) {
                    obj = O;
                }
            }
            return (R) obj;
        }
        return null;
    }

    @s4.h(name = "sumOfLong")
    public static final long T2(@n6.d f5.m<Long> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Long> it = mVar.iterator();
        long j7 = 0;
        while (it.hasNext()) {
            j7 += it.next().longValue();
        }
        return j7;
    }

    @n6.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M U(@n6.d f5.m<? extends T> mVar, @n6.d M m7, @n6.d t4.l<? super T, ? extends u0<? extends K, ? extends V>> lVar) {
        l0.p(mVar, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            u0<? extends K, ? extends V> O = lVar.O((T) it.next());
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @n6.d
    public static final <T, K, V> Map<K, List<V>> U0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K O = lVar.O(obj);
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(obj));
        }
        return linkedHashMap;
    }

    @g1(version = "1.4")
    @n6.e
    public static final <T extends Comparable<? super T>> T U1(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    @s4.h(name = "sumOfLong")
    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> long U2(f5.m<? extends T> mVar, t4.l<? super T, Long> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        long j7 = 0;
        while (it.hasNext()) {
            j7 += lVar.O((T) it.next()).longValue();
        }
        return j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @n6.d
    public static final <K, V> Map<K, V> V(@n6.d f5.m<? extends K> mVar, @n6.d t4.l<? super K, ? extends V> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            linkedHashMap.put(obj, lVar.O(obj));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final <T, K, M extends Map<? super K, List<T>>> M V0(@n6.d f5.m<? extends T> mVar, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K O = lVar.O(obj);
            Object obj2 = m7.get(O);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m7.put(O, obj2);
            }
            ((List) obj2).add(obj);
        }
        return m7;
    }

    @g1(version = "1.4")
    @n6.e
    public static final Double V1(@n6.d f5.m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @s4.h(name = "sumOfShort")
    public static final int V2(@n6.d f5.m<Short> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Short> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += it.next().shortValue();
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M W(@n6.d f5.m<? extends K> mVar, @n6.d M m7, @n6.d t4.l<? super K, ? extends V> lVar) {
        l0.p(mVar, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "valueSelector");
        Iterator<? extends K> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (K) it.next();
            m7.put(obj, lVar.O(obj));
        }
        return m7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T, K, V, M extends Map<? super K, List<V>>> M W0(@n6.d f5.m<? extends T> mVar, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        l0.p(mVar, "<this>");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            K O = lVar.O(obj);
            Object obj2 = m7.get(O);
            if (obj2 == null) {
                obj2 = new ArrayList();
                m7.put(O, obj2);
            }
            ((List) obj2).add(lVar2.O(obj));
        }
        return m7;
    }

    @g1(version = "1.4")
    @n6.e
    public static final Float W1(@n6.d f5.m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @s4.h(name = "sumOfUInt")
    @g1(version = "1.5")
    @t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final <T> int W2(f5.m<? extends T> mVar, t4.l<? super T, x1> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        int l7 = x1.l(0);
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            l7 = x1.l(l7 + lVar.O((T) it.next()).l0());
        }
        return l7;
    }

    @s4.h(name = "averageOfByte")
    public static final double X(@n6.d f5.m<Byte> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Byte> it = mVar.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().byteValue();
            i7++;
            if (i7 < 0) {
                x3.w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @g1(version = "1.1")
    @n6.d
    public static final <T, K> x3.l0<T, K> X0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "keySelector");
        return new l(mVar, lVar);
    }

    @s4.h(name = "minOrThrow")
    @g1(version = "1.7")
    public static final double X1(@n6.d f5.m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @s4.h(name = "sumOfULong")
    @g1(version = "1.5")
    @t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final <T> long X2(f5.m<? extends T> mVar, t4.l<? super T, b2> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            l7 = b2.l(l7 + lVar.O((T) it.next()).l0());
        }
        return l7;
    }

    @s4.h(name = "averageOfDouble")
    public static final double Y(@n6.d f5.m<Double> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().doubleValue();
            i7++;
            if (i7 < 0) {
                x3.w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    public static final <T> int Y0(@n6.d f5.m<? extends T> mVar, T t6) {
        l0.p(mVar, "<this>");
        int i7 = 0;
        for (T t7 : mVar) {
            if (i7 < 0) {
                x3.w.W();
            }
            if (l0.g(t6, t7)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @s4.h(name = "minOrThrow")
    @g1(version = "1.7")
    public static final float Y1(@n6.d f5.m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T> f5.m<T> Y2(@n6.d f5.m<? extends T> mVar, int i7) {
        l0.p(mVar, "<this>");
        if (i7 >= 0) {
            return i7 == 0 ? f5.s.g() : mVar instanceof f5.e ? ((f5.e) mVar).a(i7) : new f5.w(mVar, i7);
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @s4.h(name = "averageOfFloat")
    public static final double Z(@n6.d f5.m<Float> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().floatValue();
            i7++;
            if (i7 < 0) {
                x3.w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    public static final <T> int Z0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i7 < 0) {
                x3.w.W();
            }
            if (lVar.O(obj).booleanValue()) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @s4.h(name = "minOrThrow")
    @g1(version = "1.7")
    @n6.d
    public static final <T extends Comparable<? super T>> T Z1(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T> f5.m<T> Z2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        return new f5.x(mVar, lVar);
    }

    @s4.h(name = "averageOfInt")
    public static final double a0(@n6.d f5.m<Integer> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Integer> it = mVar.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().intValue();
            i7++;
            if (i7 < 0) {
                x3.w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    public static final <T> int a1(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = -1;
        int i8 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (i8 < 0) {
                x3.w.W();
            }
            if (lVar.O(obj).booleanValue()) {
                i7 = i8;
            }
            i8++;
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @n6.e
    public static final <T> T a2(@n6.d f5.m<? extends T> mVar, @n6.d Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) > 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        return null;
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C a3(@n6.d f5.m<? extends T> mVar, @n6.d C c7) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            c7.add(it.next());
        }
        return c7;
    }

    @s4.h(name = "averageOfLong")
    public static final double b0(@n6.d f5.m<Long> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Long> it = mVar.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().longValue();
            i7++;
            if (i7 < 0) {
                x3.w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @n6.d
    public static final <T, A extends Appendable> A b1(@n6.d f5.m<? extends T> mVar, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super T, ? extends CharSequence> lVar) {
        l0.p(mVar, "<this>");
        l0.p(a7, "buffer");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (T t6 : mVar) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            i5.t.b(a7, t6, lVar);
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @s4.h(name = "minWithOrThrow")
    @g1(version = "1.7")
    public static final <T> T b2(@n6.d f5.m<? extends T> mVar, @n6.d Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            Object obj = (T) it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (comparator.compare(obj, next) > 0) {
                    obj = next;
                }
            }
            return (T) obj;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T> HashSet<T> b3(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return (HashSet) a3(mVar, new HashSet());
    }

    @s4.h(name = "averageOfShort")
    public static final double c0(@n6.d f5.m<Short> mVar) {
        l0.p(mVar, "<this>");
        Iterator<Short> it = mVar.iterator();
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        while (it.hasNext()) {
            d7 += it.next().shortValue();
            i7++;
            if (i7 < 0) {
                x3.w.V();
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @n6.d
    public static final <T> f5.m<T> c2(@n6.d f5.m<? extends T> mVar, @n6.d f5.m<? extends T> mVar2) {
        l0.p(mVar, "<this>");
        l0.p(mVar2, "elements");
        return new p(mVar2, mVar);
    }

    @n6.d
    public static final <T> List<T> c3(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return x3.w.Q(d3(mVar));
    }

    @g1(version = "1.2")
    @n6.d
    public static final <T> f5.m<List<T>> d0(@n6.d f5.m<? extends T> mVar, int i7) {
        l0.p(mVar, "<this>");
        return g3(mVar, i7, i7, true);
    }

    @n6.d
    public static final <T> String d1(@n6.d f5.m<? extends T> mVar, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super T, ? extends CharSequence> lVar) {
        l0.p(mVar, "<this>");
        l0.p(charSequence, "separator");
        l0.p(charSequence2, "prefix");
        l0.p(charSequence3, "postfix");
        l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) b1(mVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.d
    public static final <T> f5.m<T> d2(@n6.d f5.m<? extends T> mVar, @n6.d Iterable<? extends T> iterable) {
        l0.p(mVar, "<this>");
        l0.p(iterable, "elements");
        return new o(iterable, mVar);
    }

    @n6.d
    public static final <T> List<T> d3(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return (List) a3(mVar, new ArrayList());
    }

    @g1(version = "1.2")
    @n6.d
    public static final <T, R> f5.m<R> e0(@n6.d f5.m<? extends T> mVar, int i7, @n6.d t4.l<? super List<? extends T>, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return h3(mVar, i7, i7, true, lVar);
    }

    public static /* synthetic */ String e1(f5.m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return d1(mVar, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.d
    public static final <T> f5.m<T> e2(@n6.d f5.m<? extends T> mVar, T t6) {
        l0.p(mVar, "<this>");
        return new m(mVar, t6);
    }

    @n6.d
    public static final <T> Set<T> e3(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> boolean f0(@n6.d f5.m<? extends T> mVar, T t6) {
        l0.p(mVar, "<this>");
        return Y0(mVar, t6) >= 0;
    }

    public static final <T> T f1(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> f5.m<T> f2(@n6.d f5.m<? extends T> mVar, @n6.d T[] tArr) {
        l0.p(mVar, "<this>");
        l0.p(tArr, "elements");
        return tArr.length == 0 ? mVar : new n(mVar, tArr);
    }

    @n6.d
    public static final <T> Set<T> f3(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return l1.r((Set) a3(mVar, new LinkedHashSet()));
    }

    public static final <T> int g0(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            it.next();
            i7++;
            if (i7 < 0) {
                x3.w.V();
            }
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T g1(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        T t6 = null;
        boolean z6 = false;
        for (T t7 : mVar) {
            if (lVar.O(t7).booleanValue()) {
                z6 = true;
                t6 = t7;
            }
        }
        if (z6) {
            return t6;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @k4.f
    public static final <T> f5.m<T> g2(f5.m<? extends T> mVar, T t6) {
        l0.p(mVar, "<this>");
        return e2(mVar, t6);
    }

    @g1(version = "1.2")
    @n6.d
    public static final <T> f5.m<List<T>> g3(@n6.d f5.m<? extends T> mVar, int i7, int i8, boolean z6) {
        l0.p(mVar, "<this>");
        return o1.c(mVar, i7, i8, z6, false);
    }

    public static final <T> int h0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (lVar.O((T) it.next()).booleanValue() && (i7 = i7 + 1) < 0) {
                x3.w.V();
            }
        }
        return i7;
    }

    public static final <T> int h1(@n6.d f5.m<? extends T> mVar, T t6) {
        l0.p(mVar, "<this>");
        int i7 = -1;
        int i8 = 0;
        for (T t7 : mVar) {
            if (i8 < 0) {
                x3.w.W();
            }
            if (l0.g(t6, t7)) {
                i7 = i8;
            }
            i8++;
        }
        return i7;
    }

    public static final <T> boolean h2(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return !mVar.iterator().hasNext();
    }

    @g1(version = "1.2")
    @n6.d
    public static final <T, R> f5.m<R> h3(@n6.d f5.m<? extends T> mVar, int i7, int i8, boolean z6, @n6.d t4.l<? super List<? extends T>, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return k1(o1.c(mVar, i7, i8, z6, true), lVar);
    }

    @n6.d
    public static final <T> f5.m<T> i0(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return j0(mVar, b.f9878l);
    }

    @n6.e
    public static final <T> T i1(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        return null;
    }

    public static final <T> boolean i2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            if (lVar.O((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ f5.m i3(f5.m mVar, int i7, int i8, boolean z6, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return g3(mVar, i7, i8, z6);
    }

    @n6.d
    public static final <T, K> f5.m<T> j0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends K> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        return new f5.c(mVar, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.e
    public static final <T> T j1(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        T t6 = null;
        for (T t7 : mVar) {
            if (lVar.O(t7).booleanValue()) {
                t6 = t7;
            }
        }
        return t6;
    }

    @g1(version = "1.1")
    @n6.d
    public static final <T> f5.m<T> j2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, m2> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, s2.t0.f16450f);
        return k1(mVar, new q(lVar));
    }

    public static /* synthetic */ f5.m j3(f5.m mVar, int i7, int i8, boolean z6, t4.l lVar, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        return h3(mVar, i7, i8, z6, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> f5.m<T> k0(@n6.d f5.m<? extends T> mVar, int i7) {
        l0.p(mVar, "<this>");
        if (i7 >= 0) {
            return i7 == 0 ? mVar : mVar instanceof f5.e ? ((f5.e) mVar).b(i7) : new f5.d(mVar, i7);
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <T, R> f5.m<R> k1(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return new f5.z(mVar, lVar);
    }

    @g1(version = "1.4")
    @n6.d
    public static final <T> f5.m<T> k2(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super Integer, ? super T, m2> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, s2.t0.f16450f);
        return l1(mVar, new r(pVar));
    }

    @n6.d
    public static final <T> f5.m<p0<T>> k3(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return new f5.k(mVar);
    }

    @n6.d
    public static final <T> f5.m<T> l0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        return new f5.f(mVar, lVar);
    }

    @n6.d
    public static final <T, R> f5.m<R> l1(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return new f5.y(mVar, pVar);
    }

    @n6.d
    public static final <T> u0<List<T>, List<T>> l2(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (lVar.O(obj).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new u0<>(arrayList, arrayList2);
    }

    @n6.d
    public static final <T, R> f5.m<u0<T, R>> l3(@n6.d f5.m<? extends T> mVar, @n6.d f5.m<? extends R> mVar2) {
        l0.p(mVar, "<this>");
        l0.p(mVar2, "other");
        return new f5.l(mVar, mVar2, z.f9943l);
    }

    public static final <T> T m0(@n6.d f5.m<? extends T> mVar, int i7) {
        l0.p(mVar, "<this>");
        return (T) n0(mVar, i7, new c(i7));
    }

    @n6.d
    public static final <T, R> f5.m<R> m1(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return v0(new f5.y(mVar, pVar));
    }

    @n6.d
    public static final <T> f5.m<T> m2(@n6.d f5.m<? extends T> mVar, @n6.d f5.m<? extends T> mVar2) {
        l0.p(mVar, "<this>");
        l0.p(mVar2, "elements");
        return f5.s.i(f5.s.q(mVar, mVar2));
    }

    @n6.d
    public static final <T, R, V> f5.m<V> m3(@n6.d f5.m<? extends T> mVar, @n6.d f5.m<? extends R> mVar2, @n6.d t4.p<? super T, ? super R, ? extends V> pVar) {
        l0.p(mVar, "<this>");
        l0.p(mVar2, "other");
        l0.p(pVar, "transform");
        return new f5.l(mVar, mVar2, pVar);
    }

    public static final <T> T n0(@n6.d f5.m<? extends T> mVar, int i7, @n6.d t4.l<? super Integer, ? extends T> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "defaultValue");
        if (i7 < 0) {
            return lVar.O(Integer.valueOf(i7));
        }
        int i8 = 0;
        for (T t6 : mVar) {
            int i9 = i8 + 1;
            if (i7 == i8) {
                return t6;
            }
            i8 = i9;
        }
        return lVar.O(Integer.valueOf(i7));
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C n1(@n6.d f5.m<? extends T> mVar, @n6.d C c7, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            R J = pVar.J(Integer.valueOf(i7), obj);
            if (J != null) {
                c7.add(J);
            }
            i7 = i8;
        }
        return c7;
    }

    @n6.d
    public static final <T> f5.m<T> n2(@n6.d f5.m<? extends T> mVar, @n6.d Iterable<? extends T> iterable) {
        l0.p(mVar, "<this>");
        l0.p(iterable, "elements");
        return f5.s.i(f5.s.q(mVar, e0.v1(iterable)));
    }

    @g1(version = "1.2")
    @n6.d
    public static final <T> f5.m<u0<T, T>> n3(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return o3(mVar, a0.f9877l);
    }

    @n6.e
    public static final <T> T o0(@n6.d f5.m<? extends T> mVar, int i7) {
        l0.p(mVar, "<this>");
        if (i7 < 0) {
            return null;
        }
        int i8 = 0;
        for (T t6 : mVar) {
            int i9 = i8 + 1;
            if (i7 == i8) {
                return t6;
            }
            i8 = i9;
        }
        return null;
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C o1(@n6.d f5.m<? extends T> mVar, @n6.d C c7, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            c7.add(pVar.J(Integer.valueOf(i7), obj));
            i7 = i8;
        }
        return c7;
    }

    @n6.d
    public static final <T> f5.m<T> o2(@n6.d f5.m<? extends T> mVar, T t6) {
        l0.p(mVar, "<this>");
        return f5.s.i(f5.s.q(mVar, f5.s.q(t6)));
    }

    @g1(version = "1.2")
    @n6.d
    public static final <T, R> f5.m<R> o3(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super T, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "transform");
        return f5.q.b(new b0(mVar, pVar, null));
    }

    @n6.d
    public static final <T> f5.m<T> p0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        return new f5.h(mVar, true, lVar);
    }

    @n6.d
    public static final <T, R> f5.m<R> p1(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "transform");
        return v0(new f5.z(mVar, lVar));
    }

    @n6.d
    public static final <T> f5.m<T> p2(@n6.d f5.m<? extends T> mVar, @n6.d T[] tArr) {
        l0.p(mVar, "<this>");
        l0.p(tArr, "elements");
        return n2(mVar, x3.o.t(tArr));
    }

    @n6.d
    public static final <T> f5.m<T> q0(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super Integer, ? super T, Boolean> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "predicate");
        return new f5.z(new f5.h(new f5.k(mVar), true, new d(pVar)), e.f9887l);
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C q1(@n6.d f5.m<? extends T> mVar, @n6.d C c7, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            R O = lVar.O((T) it.next());
            if (O != null) {
                c7.add(O);
            }
        }
        return c7;
    }

    @k4.f
    public static final <T> f5.m<T> q2(f5.m<? extends T> mVar, T t6) {
        l0.p(mVar, "<this>");
        return o2(mVar, t6);
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C r0(@n6.d f5.m<? extends T> mVar, @n6.d C c7, @n6.d t4.p<? super Integer, ? super T, Boolean> pVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(pVar, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                x3.w.W();
            }
            if (pVar.J(Integer.valueOf(i7), obj).booleanValue()) {
                c7.add(obj);
            }
            i7 = i8;
        }
        return c7;
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C r1(@n6.d f5.m<? extends T> mVar, @n6.d C c7, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            c7.add(lVar.O((T) it.next()));
        }
        return c7;
    }

    public static final <S, T extends S> S r2(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super S, ? super T, ? extends S> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = pVar.J(next, (T) it.next());
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty sequence can't be reduced.");
    }

    public static final /* synthetic */ <R> f5.m<R> s0(f5.m<?> mVar) {
        l0.p(mVar, "<this>");
        l0.w();
        f5.m<R> p02 = p0(mVar, f.f9888l);
        l0.n(p02, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return p02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @g1(version = "1.4")
    @n6.e
    public static final <T, R extends Comparable<? super R>> T s1(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                R O = lVar.O(next);
                do {
                    T next2 = it.next();
                    R O2 = lVar.O(next2);
                    next = next;
                    if (O.compareTo(O2) < 0) {
                        O = O2;
                        next = next2;
                    }
                } while (it.hasNext());
                return (T) next;
            }
            return next;
        }
        return null;
    }

    public static final <S, T extends S> S s2(@n6.d f5.m<? extends T> mVar, @n6.d t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        l0.p(mVar, "<this>");
        l0.p(qVar, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            S next = it.next();
            int i7 = 1;
            while (it.hasNext()) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    x3.w.W();
                }
                next = qVar.I(Integer.valueOf(i7), next, (T) it.next());
                i7 = i8;
            }
            return (S) next;
        }
        throw new UnsupportedOperationException("Empty sequence can't be reduced.");
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C t0(f5.m<?> mVar, C c7) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        for (Object obj : mVar) {
            l0.y(3, "R");
            if (obj instanceof Object) {
                c7.add(obj);
            }
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @s4.h(name = "maxByOrThrow")
    @g1(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T t1(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                R O = lVar.O(next);
                do {
                    T next2 = it.next();
                    R O2 = lVar.O(next2);
                    next = next;
                    if (O.compareTo(O2) < 0) {
                        O = O2;
                        next = next2;
                    }
                } while (it.hasNext());
                return (T) next;
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @g1(version = "1.4")
    @n6.e
    public static final <S, T extends S> S t2(@n6.d f5.m<? extends T> mVar, @n6.d t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        l0.p(mVar, "<this>");
        l0.p(qVar, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            S next = it.next();
            int i7 = 1;
            while (it.hasNext()) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    x3.w.W();
                }
                next = qVar.I(Integer.valueOf(i7), next, (T) it.next());
                i7 = i8;
            }
            return (S) next;
        }
        return null;
    }

    @n6.d
    public static final <T> f5.m<T> u0(@n6.d f5.m<? extends T> mVar, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        return new f5.h(mVar, false, lVar);
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> double u1(f5.m<? extends T> mVar, t4.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.O((T) it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <S, T extends S> S u2(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super S, ? super T, ? extends S> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "operation");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            S next = it.next();
            while (it.hasNext()) {
                next = pVar.J(next, (T) it.next());
            }
            return (S) next;
        }
        return null;
    }

    @n6.d
    public static final <T> f5.m<T> v0(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        f5.m<T> u02 = u0(mVar, g.f9889l);
        l0.n(u02, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return u02;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> float v1(f5.m<? extends T> mVar, t4.l<? super T, Float> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.O((T) it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @n6.d
    public static final <T> f5.m<T> v2(@n6.d f5.m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return k1(mVar, new s(mVar));
    }

    @n6.d
    public static final <C extends Collection<? super T>, T> C w0(@n6.d f5.m<? extends T> mVar, @n6.d C c7) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        for (T t6 : mVar) {
            if (t6 != null) {
                c7.add(t6);
            }
        }
        return c7;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R w1(f5.m<? extends T> mVar, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            R O = lVar.O((T) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((T) it.next());
                if (O.compareTo(O2) < 0) {
                    O = O2;
                }
            }
            return O;
        }
        throw new NoSuchElementException();
    }

    @g1(version = "1.4")
    @n6.d
    public static final <T, R> f5.m<R> w2(@n6.d f5.m<? extends T> mVar, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "operation");
        return f5.q.b(new t(r6, mVar, pVar, null));
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C x0(@n6.d f5.m<? extends T> mVar, @n6.d C c7, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (!lVar.O(obj).booleanValue()) {
                c7.add(obj);
            }
        }
        return c7;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R x1(f5.m<? extends T> mVar, t4.l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            R O = lVar.O((T) it.next());
            while (it.hasNext()) {
                R O2 = lVar.O((T) it.next());
                if (O.compareTo(O2) < 0) {
                    O = O2;
                }
            }
            return O;
        }
        return null;
    }

    @g1(version = "1.4")
    @n6.d
    public static final <T, R> f5.m<R> x2(@n6.d f5.m<? extends T> mVar, R r6, @n6.d t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        l0.p(mVar, "<this>");
        l0.p(qVar, "operation");
        return f5.q.b(new C0108u(r6, mVar, qVar, null));
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C y0(@n6.d f5.m<? extends T> mVar, @n6.d C c7, @n6.d t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (lVar.O(obj).booleanValue()) {
                c7.add(obj);
            }
        }
        return c7;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> Double y1(f5.m<? extends T> mVar, t4.l<? super T, Double> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.O((T) it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.O((T) it.next()).doubleValue());
            }
            return Double.valueOf(doubleValue);
        }
        return null;
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <S, T extends S> f5.m<S> y2(@n6.d f5.m<? extends T> mVar, @n6.d t4.p<? super S, ? super T, ? extends S> pVar) {
        l0.p(mVar, "<this>");
        l0.p(pVar, "operation");
        return f5.q.b(new v(mVar, pVar, null));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @k4.f
    public static final <T> T z0(f5.m<? extends T> mVar, t4.l<? super T, Boolean> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "predicate");
        for (T t6 : mVar) {
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
        }
        return null;
    }

    @g1(version = "1.4")
    @t0
    @k4.f
    public static final <T> Float z1(f5.m<? extends T> mVar, t4.l<? super T, Float> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.O((T) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.O((T) it.next()).floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    @g1(version = "1.4")
    @n6.d
    public static final <S, T extends S> f5.m<S> z2(@n6.d f5.m<? extends T> mVar, @n6.d t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        l0.p(mVar, "<this>");
        l0.p(qVar, "operation");
        return f5.q.b(new w(mVar, qVar, null));
    }
}
