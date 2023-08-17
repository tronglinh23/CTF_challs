package w5;

import a6.f;
import i0.s;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import u4.i0;
import u4.l0;
import u4.t1;

/* loaded from: classes.dex */
public final class b {
    @n6.d
    public static final String b(long j7) {
        String str;
        if (j7 <= -999500000) {
            str = ((j7 - 500000000) / ((long) f.S)) + " s ";
        } else if (j7 <= -999500) {
            str = ((j7 - ((long) s.a.f10887f)) / 1000000) + " ms";
        } else if (j7 <= 0) {
            str = ((j7 - 500) / 1000) + " µs";
        } else if (j7 < 999500) {
            str = ((j7 + 500) / 1000) + " µs";
        } else if (j7 < 999500000) {
            str = ((j7 + ((long) s.a.f10887f)) / 1000000) + " ms";
        } else {
            str = ((j7 + 500000000) / ((long) f.S)) + " s ";
        }
        t1 t1Var = t1.f17486a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        l0.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public static final void c(a aVar, c cVar, String str) {
        Logger a7 = d.f18230j.a();
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.h());
        sb.append(' ');
        t1 t1Var = t1.f17486a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        l0.o(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.b());
        a7.fine(sb.toString());
    }

    public static final <T> T d(@n6.d a aVar, @n6.d c cVar, @n6.d t4.a<? extends T> aVar2) {
        long j7;
        l0.p(aVar, "task");
        l0.p(cVar, "queue");
        l0.p(aVar2, "block");
        boolean isLoggable = d.f18230j.a().isLoggable(Level.FINE);
        if (isLoggable) {
            j7 = cVar.k().h().d();
            c(aVar, cVar, "starting");
        } else {
            j7 = -1;
        }
        try {
            T n7 = aVar2.n();
            i0.d(1);
            if (isLoggable) {
                c(aVar, cVar, "finished run in " + b(cVar.k().h().d() - j7));
            }
            i0.c(1);
            return n7;
        } catch (Throwable th) {
            i0.d(1);
            if (isLoggable) {
                c(aVar, cVar, "failed a run in " + b(cVar.k().h().d() - j7));
            }
            i0.c(1);
            throw th;
        }
    }

    public static final void e(@n6.d a aVar, @n6.d c cVar, @n6.d t4.a<String> aVar2) {
        l0.p(aVar, "task");
        l0.p(cVar, "queue");
        l0.p(aVar2, "messageBlock");
        if (d.f18230j.a().isLoggable(Level.FINE)) {
            c(aVar, cVar, aVar2.n());
        }
    }
}