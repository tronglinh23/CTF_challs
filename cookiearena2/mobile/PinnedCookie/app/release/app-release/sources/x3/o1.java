package x3;

import java.util.Iterator;
import java.util.List;
import v3.m2;
/* loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, androidx.constraintlayout.widget.e.f2192d1}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.k implements t4.p<f5.o<? super List<? extends T>>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f18337m;

        /* renamed from: n  reason: collision with root package name */
        public Object f18338n;

        /* renamed from: o  reason: collision with root package name */
        public int f18339o;

        /* renamed from: p  reason: collision with root package name */
        public int f18340p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f18341q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ int f18342r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ int f18343s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ Iterator<T> f18344t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f18345u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ boolean f18346v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i7, int i8, Iterator<? extends T> it, boolean z6, boolean z7, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f18342r = i7;
            this.f18343s = i8;
            this.f18344t = it;
            this.f18345u = z6;
            this.f18346v = z7;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(this.f18342r, this.f18343s, this.f18344t, this.f18345u, this.f18346v, dVar);
            aVar.f18341q = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:16:0x0058). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011d -> B:59:0x0120). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x014b -> B:72:0x014e). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x3.o1.a.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super List<? extends T>> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b<T> implements f5.m<List<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f5.m f18347a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f18348b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f18349c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f18350d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f18351e;

        public b(f5.m mVar, int i7, int i8, boolean z6, boolean z7) {
            this.f18347a = mVar;
            this.f18348b = i7;
            this.f18349c = i8;
            this.f18350d = z6;
            this.f18351e = z7;
        }

        @Override // f5.m
        @n6.d
        public Iterator<List<? extends T>> iterator() {
            return o1.b(this.f18347a.iterator(), this.f18348b, this.f18349c, this.f18350d, this.f18351e);
        }
    }

    public static final void a(int i7, int i8) {
        String str;
        if (i7 > 0 && i8 > 0) {
            return;
        }
        if (i7 != i8) {
            str = "Both size " + i7 + " and step " + i8 + " must be greater than zero.";
        } else {
            str = "size " + i7 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @n6.d
    public static final <T> Iterator<List<T>> b(@n6.d Iterator<? extends T> it, int i7, int i8, boolean z6, boolean z7) {
        u4.l0.p(it, "iterator");
        return !it.hasNext() ? g0.f18303k : f5.q.a(new a(i7, i8, it, z7, z6, null));
    }

    @n6.d
    public static final <T> f5.m<List<T>> c(@n6.d f5.m<? extends T> mVar, int i7, int i8, boolean z6, boolean z7) {
        u4.l0.p(mVar, "<this>");
        a(i7, i8);
        return new b(mVar, i7, i8, z6, z7);
    }
}
