package f5;

import java.util.Iterator;
import u4.l0;
import v3.b2;
import v3.g1;
import v3.h2;
import v3.q2;
import v3.t1;
import v3.x1;

/* loaded from: classes.dex */
public class b0 {
    @s4.h(name = "sumOfUByte")
    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int a(@n6.d m<t1> mVar) {
        l0.p(mVar, "<this>");
        Iterator<t1> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 = x1.l(i7 + x1.l(it.next().j0() & t1.f17828n));
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int b(@n6.d m<x1> mVar) {
        l0.p(mVar, "<this>");
        Iterator<x1> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 = x1.l(i7 + it.next().l0());
        }
        return i7;
    }

    @s4.h(name = "sumOfULong")
    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final long c(@n6.d m<b2> mVar) {
        l0.p(mVar, "<this>");
        Iterator<b2> it = mVar.iterator();
        long j7 = 0;
        while (it.hasNext()) {
            j7 = b2.l(j7 + it.next().l0());
        }
        return j7;
    }

    @s4.h(name = "sumOfUShort")
    @g1(version = "1.5")
    @q2(markerClass = {v3.t.class})
    public static final int d(@n6.d m<h2> mVar) {
        l0.p(mVar, "<this>");
        Iterator<h2> it = mVar.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 = x1.l(i7 + x1.l(it.next().j0() & h2.f17796n));
        }
        return i7;
    }
}