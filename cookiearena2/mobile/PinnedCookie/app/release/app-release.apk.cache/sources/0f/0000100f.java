package g5;

import f5.m;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import s4.h;
import u4.l0;
import u4.r1;
import v3.g1;
import x3.o;

@h(name = "StreamsKt")
/* loaded from: classes.dex */
public final class b {

    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements m<T> {

        /* renamed from: a */
        public final /* synthetic */ Stream f10080a;

        public a(Stream stream) {
            this.f10080a = stream;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            Iterator<T> it = this.f10080a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    /* renamed from: g5.b$b */
    /* loaded from: classes.dex */
    public static final class C0110b implements m<Integer> {

        /* renamed from: a */
        public final /* synthetic */ IntStream f10081a;

        public C0110b(IntStream intStream) {
            this.f10081a = intStream;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f10081a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c implements m<Long> {

        /* renamed from: a */
        public final /* synthetic */ LongStream f10082a;

        public c(LongStream longStream) {
            this.f10082a = longStream;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f10082a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d implements m<Double> {

        /* renamed from: a */
        public final /* synthetic */ DoubleStream f10083a;

        public d(DoubleStream doubleStream) {
            this.f10083a = doubleStream;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f10083a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    public static /* synthetic */ Spliterator a(m mVar) {
        return g(mVar);
    }

    @g1(version = "1.2")
    @n6.d
    public static final m<Double> b(@n6.d DoubleStream doubleStream) {
        l0.p(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @g1(version = "1.2")
    @n6.d
    public static final m<Integer> c(@n6.d IntStream intStream) {
        l0.p(intStream, "<this>");
        return new C0110b(intStream);
    }

    @g1(version = "1.2")
    @n6.d
    public static final m<Long> d(@n6.d LongStream longStream) {
        l0.p(longStream, "<this>");
        return new c(longStream);
    }

    @g1(version = "1.2")
    @n6.d
    public static final <T> m<T> e(@n6.d Stream<T> stream) {
        l0.p(stream, "<this>");
        return new a(stream);
    }

    @g1(version = "1.2")
    @n6.d
    public static final <T> Stream<T> f(@n6.d final m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: g5.a
            @Override // java.util.function.Supplier
            public final Object get() {
                return b.a(m.this);
            }
        }, 16, false);
        l0.o(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    public static final Spliterator g(m mVar) {
        l0.p(mVar, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(mVar.iterator(), 16);
    }

    @g1(version = "1.2")
    @n6.d
    public static final List<Double> h(@n6.d DoubleStream doubleStream) {
        l0.p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        l0.o(array, "toArray()");
        return o.p(array);
    }

    @g1(version = "1.2")
    @n6.d
    public static final List<Integer> i(@n6.d IntStream intStream) {
        l0.p(intStream, "<this>");
        int[] array = intStream.toArray();
        l0.o(array, "toArray()");
        return o.r(array);
    }

    @g1(version = "1.2")
    @n6.d
    public static final List<Long> j(@n6.d LongStream longStream) {
        l0.p(longStream, "<this>");
        long[] array = longStream.toArray();
        l0.o(array, "toArray()");
        return o.s(array);
    }

    @g1(version = "1.2")
    @n6.d
    public static final <T> List<T> k(@n6.d Stream<T> stream) {
        l0.p(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        l0.o(collect, "collect(Collectors.toList<T>())");
        return (List) collect;
    }
}