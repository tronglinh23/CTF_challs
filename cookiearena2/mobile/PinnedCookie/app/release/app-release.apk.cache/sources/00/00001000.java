package g1;

import android.annotation.SuppressLint;
import android.util.Range;
import d.w0;
import d5.g;
import u4.l0;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements d5.g<T> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Range<T> f10060k;

        public a(Range<T> range) {
            this.f10060k = range;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // d5.g, d5.r
        public boolean a(@n6.d Comparable comparable) {
            return g.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Comparable] */
        @Override // d5.g, d5.r
        public Comparable b() {
            return this.f10060k.getLower();
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Comparable] */
        @Override // d5.g
        public Comparable g() {
            return this.f10060k.getUpper();
        }

        @Override // d5.g, d5.r
        public boolean isEmpty() {
            return g.a.b(this);
        }
    }

    @n6.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> a(@n6.d Range<T> range, @n6.d Range<T> range2) {
        l0.p(range, "<this>");
        l0.p(range2, "other");
        Range<T> intersect = range.intersect(range2);
        l0.o(intersect, "intersect(other)");
        return intersect;
    }

    @n6.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> b(@n6.d Range<T> range, @n6.d Range<T> range2) {
        l0.p(range, "<this>");
        l0.p(range2, "other");
        Range<T> extend = range.extend(range2);
        l0.o(extend, "extend(other)");
        return extend;
    }

    @n6.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> c(@n6.d Range<T> range, @n6.d T t6) {
        l0.p(range, "<this>");
        l0.p(t6, "value");
        Range<T> extend = range.extend((Range<T>) t6);
        l0.o(extend, "extend(value)");
        return extend;
    }

    @n6.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> d(@n6.d T t6, @n6.d T t7) {
        l0.p(t6, "<this>");
        l0.p(t7, "that");
        return new Range<>(t6, t7);
    }

    @n6.d
    @w0(21)
    public static final <T extends Comparable<? super T>> d5.g<T> e(@n6.d Range<T> range) {
        l0.p(range, "<this>");
        return new a(range);
    }

    @n6.d
    @w0(21)
    public static final <T extends Comparable<? super T>> Range<T> f(@n6.d d5.g<T> gVar) {
        l0.p(gVar, "<this>");
        return new Range<>(gVar.b(), gVar.g());
    }
}