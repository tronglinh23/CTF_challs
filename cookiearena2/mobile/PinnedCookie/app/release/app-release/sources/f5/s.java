package f5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.e1;
import v3.g1;
import v3.m2;
import v3.q1;
import v3.u0;
/* loaded from: classes.dex */
public class s extends r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,680:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.a<Iterator<T>> f9852a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.a<? extends Iterator<? extends T>> aVar) {
            this.f9852a = aVar;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            return this.f9852a.n();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,680:1\n30#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b<T> implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Iterator f9853a;

        public b(Iterator it) {
            this.f9853a = it;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            return this.f9853a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @h4.f(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
    /* loaded from: classes.dex */
    public static final class c<R> extends h4.k implements t4.p<o<? super R>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f9854m;

        /* renamed from: n  reason: collision with root package name */
        public int f9855n;

        /* renamed from: o  reason: collision with root package name */
        public int f9856o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f9857p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ m<T> f9858q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ t4.p<Integer, T, C> f9859r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ t4.l<C, Iterator<R>> f9860s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(m<? extends T> mVar, t4.p<? super Integer, ? super T, ? extends C> pVar, t4.l<? super C, ? extends Iterator<? extends R>> lVar, e4.d<? super c> dVar) {
            super(2, dVar);
            this.f9858q = mVar;
            this.f9859r = pVar;
            this.f9860s = lVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            c cVar = new c(this.f9858q, this.f9859r, this.f9860s, dVar);
            cVar.f9857p = obj;
            return cVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            o oVar;
            int i7;
            Iterator it;
            Object h7 = g4.d.h();
            int i8 = this.f9856o;
            if (i8 == 0) {
                e1.n(obj);
                oVar = (o) this.f9857p;
                i7 = 0;
                it = this.f9858q.iterator();
            } else if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                int i9 = this.f9855n;
                it = (Iterator) this.f9854m;
                oVar = (o) this.f9857p;
                e1.n(obj);
                i7 = i9;
            }
            while (it.hasNext()) {
                Object next = it.next();
                t4.p<Integer, T, C> pVar = this.f9859r;
                int i10 = i7 + 1;
                if (i7 < 0) {
                    x3.w.W();
                }
                Iterator<R> O = this.f9860s.O(pVar.J(h4.b.f(i7), next));
                this.f9857p = oVar;
                this.f9854m = it;
                this.f9855n = i10;
                this.f9856o = 1;
                if (oVar.j(O, this) == h7) {
                    return h7;
                }
                i7 = i10;
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d o<? super R> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((c) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class d<T> extends n0 implements t4.l<m<? extends T>, Iterator<? extends T>> {

        /* renamed from: l  reason: collision with root package name */
        public static final d f9861l = new d();

        public d() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<T> O(@n6.d m<? extends T> mVar) {
            l0.p(mVar, "it");
            return (Iterator<? extends T>) mVar.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class e<T> extends n0 implements t4.l<Iterable<? extends T>, Iterator<? extends T>> {

        /* renamed from: l  reason: collision with root package name */
        public static final e f9862l = new e();

        public e() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<T> O(@n6.d Iterable<? extends T> iterable) {
            l0.p(iterable, "it");
            return (Iterator<? extends T>) iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class f<T> extends n0 implements t4.l<T, T> {

        /* renamed from: l  reason: collision with root package name */
        public static final f f9863l = new f();

        public f() {
            super(1);
        }

        @Override // t4.l
        public final T O(T t6) {
            return t6;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class g<T> extends n0 implements t4.l<T, T> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.a<T> f9864l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(t4.a<? extends T> aVar) {
            super(1);
            this.f9864l = aVar;
        }

        @Override // t4.l
        @n6.e
        public final T O(@n6.d T t6) {
            l0.p(t6, "it");
            return this.f9864l.n();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class h<T> extends n0 implements t4.a<T> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ T f9865l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(T t6) {
            super(0);
            this.f9865l = t6;
        }

        @Override // t4.a
        @n6.e
        public final T n() {
            return this.f9865l;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class i<T> extends h4.k implements t4.p<o<? super T>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f9866m;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f9867n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ m<T> f9868o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ t4.a<m<T>> f9869p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(m<? extends T> mVar, t4.a<? extends m<? extends T>> aVar, e4.d<? super i> dVar) {
            super(2, dVar);
            this.f9868o = mVar;
            this.f9869p = aVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            i iVar = new i(this.f9868o, this.f9869p, dVar);
            iVar.f9867n = obj;
            return iVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f9866m;
            if (i7 == 0) {
                e1.n(obj);
                o oVar = (o) this.f9867n;
                Iterator<? extends T> it = this.f9868o.iterator();
                if (it.hasNext()) {
                    this.f9866m = 1;
                    if (oVar.j(it, this) == h7) {
                        return h7;
                    }
                } else {
                    m<T> n7 = this.f9869p.n();
                    this.f9866m = 2;
                    if (oVar.f(n7, this) == h7) {
                        return h7;
                    }
                }
            } else if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d o<? super T> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((i) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class j<T> extends h4.k implements t4.p<o<? super T>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f9870m;

        /* renamed from: n  reason: collision with root package name */
        public int f9871n;

        /* renamed from: o  reason: collision with root package name */
        public /* synthetic */ Object f9872o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ m<T> f9873p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ b5.f f9874q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(m<? extends T> mVar, b5.f fVar, e4.d<? super j> dVar) {
            super(2, dVar);
            this.f9873p = mVar;
            this.f9874q = fVar;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            j jVar = new j(this.f9873p, this.f9874q, dVar);
            jVar.f9872o = obj;
            return jVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            List d32;
            o oVar;
            Object h7 = g4.d.h();
            int i7 = this.f9871n;
            if (i7 == 0) {
                e1.n(obj);
                o oVar2 = (o) this.f9872o;
                d32 = u.d3(this.f9873p);
                oVar = oVar2;
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                d32 = (List) this.f9870m;
                oVar = (o) this.f9872o;
                e1.n(obj);
            }
            while ((!d32.isEmpty()) != false) {
                int m7 = this.f9874q.m(d32.size());
                Object L0 = x3.b0.L0(d32);
                if (m7 < d32.size()) {
                    L0 = d32.set(m7, L0);
                }
                this.f9872o = oVar;
                this.f9870m = d32;
                this.f9871n = 1;
                if (oVar.a(L0, this) == h7) {
                    return h7;
                }
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d o<? super T> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((j) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    @k4.f
    public static final <T> m<T> d(t4.a<? extends Iterator<? extends T>> aVar) {
        l0.p(aVar, "iterator");
        return new a(aVar);
    }

    @n6.d
    public static final <T> m<T> e(@n6.d Iterator<? extends T> it) {
        l0.p(it, "<this>");
        return f(new b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T> m<T> f(@n6.d m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return mVar instanceof f5.a ? mVar : new f5.a(mVar);
    }

    @n6.d
    public static final <T> m<T> g() {
        return f5.g.f9813a;
    }

    @n6.d
    public static final <T, C, R> m<R> h(@n6.d m<? extends T> mVar, @n6.d t4.p<? super Integer, ? super T, ? extends C> pVar, @n6.d t4.l<? super C, ? extends Iterator<? extends R>> lVar) {
        l0.p(mVar, "source");
        l0.p(pVar, "transform");
        l0.p(lVar, "iterator");
        return q.b(new c(mVar, pVar, lVar, null));
    }

    @n6.d
    public static final <T> m<T> i(@n6.d m<? extends m<? extends T>> mVar) {
        l0.p(mVar, "<this>");
        return j(mVar, d.f9861l);
    }

    public static final <T, R> m<R> j(m<? extends T> mVar, t4.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return mVar instanceof z ? ((z) mVar).e(lVar) : new f5.i(mVar, f.f9863l, lVar);
    }

    @s4.h(name = "flattenSequenceOfIterable")
    @n6.d
    public static final <T> m<T> k(@n6.d m<? extends Iterable<? extends T>> mVar) {
        l0.p(mVar, "<this>");
        return j(mVar, e.f9862l);
    }

    @k4.h
    @n6.d
    public static final <T> m<T> l(@n6.e T t6, @n6.d t4.l<? super T, ? extends T> lVar) {
        l0.p(lVar, "nextFunction");
        return t6 == null ? f5.g.f9813a : new f5.j(new h(t6), lVar);
    }

    @n6.d
    public static final <T> m<T> m(@n6.d t4.a<? extends T> aVar) {
        l0.p(aVar, "nextFunction");
        return f(new f5.j(aVar, new g(aVar)));
    }

    @n6.d
    public static final <T> m<T> n(@n6.d t4.a<? extends T> aVar, @n6.d t4.l<? super T, ? extends T> lVar) {
        l0.p(aVar, "seedFunction");
        l0.p(lVar, "nextFunction");
        return new f5.j(aVar, lVar);
    }

    @g1(version = "1.3")
    @n6.d
    public static final <T> m<T> o(@n6.d m<? extends T> mVar, @n6.d t4.a<? extends m<? extends T>> aVar) {
        l0.p(mVar, "<this>");
        l0.p(aVar, "defaultValue");
        return q.b(new i(mVar, aVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @k4.f
    public static final <T> m<T> p(m<? extends T> mVar) {
        return mVar == 0 ? g() : mVar;
    }

    @n6.d
    public static final <T> m<T> q(@n6.d T... tArr) {
        l0.p(tArr, "elements");
        return tArr.length == 0 ? g() : x3.p.l6(tArr);
    }

    @g1(version = "1.4")
    @n6.d
    public static final <T> m<T> r(@n6.d m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return s(mVar, b5.f.f7260k);
    }

    @g1(version = "1.4")
    @n6.d
    public static final <T> m<T> s(@n6.d m<? extends T> mVar, @n6.d b5.f fVar) {
        l0.p(mVar, "<this>");
        l0.p(fVar, "random");
        return q.b(new j(mVar, fVar, null));
    }

    @n6.d
    public static final <T, R> u0<List<T>, List<R>> t(@n6.d m<? extends u0<? extends T, ? extends R>> mVar) {
        l0.p(mVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (u0<? extends T, ? extends R> u0Var : mVar) {
            arrayList.add(u0Var.e());
            arrayList2.add(u0Var.f());
        }
        return q1.a(arrayList, arrayList2);
    }
}
