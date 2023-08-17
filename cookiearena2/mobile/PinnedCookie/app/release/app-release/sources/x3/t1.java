package x3;

import java.util.Collection;
import java.util.Iterator;
import v3.b2;
import v3.c2;
import v3.h2;
import v3.i2;
import v3.q2;
import v3.u1;
import v3.x1;
import v3.y1;
/* loaded from: classes.dex */
public class t1 {
    @s4.h(name = "sumOfUByte")
    @v3.g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int a(@n6.d Iterable<v3.t1> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<v3.t1> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 = x1.l(i7 + x1.l(it.next().j0() & v3.t1.f17828n));
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int b(@n6.d Iterable<x1> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<x1> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 = x1.l(i7 + it.next().l0());
        }
        return i7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final long c(@n6.d Iterable<b2> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<b2> it = iterable.iterator();
        long j7 = 0;
        while (it.hasNext()) {
            j7 = b2.l(j7 + it.next().l0());
        }
        return j7;
    }

    @s4.h(name = "sumOfUShort")
    @v3.g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int d(@n6.d Iterable<h2> iterable) {
        u4.l0.p(iterable, "<this>");
        Iterator<h2> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 = x1.l(i7 + x1.l(it.next().j0() & h2.f17796n));
        }
        return i7;
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.t
    public static final byte[] e(@n6.d Collection<v3.t1> collection) {
        u4.l0.p(collection, "<this>");
        byte[] d7 = u1.d(collection.size());
        Iterator<v3.t1> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            u1.t(d7, i7, it.next().j0());
            i7++;
        }
        return d7;
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.t
    public static final int[] f(@n6.d Collection<x1> collection) {
        u4.l0.p(collection, "<this>");
        int[] d7 = y1.d(collection.size());
        Iterator<x1> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            y1.t(d7, i7, it.next().l0());
            i7++;
        }
        return d7;
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.t
    public static final long[] g(@n6.d Collection<b2> collection) {
        u4.l0.p(collection, "<this>");
        long[] d7 = c2.d(collection.size());
        Iterator<b2> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            c2.t(d7, i7, it.next().l0());
            i7++;
        }
        return d7;
    }

    @v3.g1(version = "1.3")
    @n6.d
    @v3.t
    public static final short[] h(@n6.d Collection<h2> collection) {
        u4.l0.p(collection, "<this>");
        short[] d7 = i2.d(collection.size());
        Iterator<h2> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i2.t(d7, i7, it.next().j0());
            i7++;
        }
        return d7;
    }
}
