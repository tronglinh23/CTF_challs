package v3;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
/* loaded from: classes.dex */
public class p {
    @k4.e
    @g1(version = "1.1")
    public static final void a(@n6.d Throwable th, @n6.d Throwable th2) {
        u4.l0.p(th, "<this>");
        u4.l0.p(th2, "exception");
        if (th != th2) {
            k4.m.f11768a.a(th, th2);
        }
    }

    @n6.d
    public static final StackTraceElement[] b(@n6.d Throwable th) {
        u4.l0.p(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        u4.l0.m(stackTrace);
        return stackTrace;
    }

    public static /* synthetic */ void c(Throwable th) {
    }

    @n6.d
    public static final List<Throwable> d(@n6.d Throwable th) {
        u4.l0.p(th, "<this>");
        return k4.m.f11768a.d(th);
    }

    @g1(version = "1.4")
    public static /* synthetic */ void e(Throwable th) {
    }

    @k4.f
    public static final void f(Throwable th) {
        u4.l0.p(th, "<this>");
        th.printStackTrace();
    }

    @k4.f
    public static final void g(Throwable th, PrintStream printStream) {
        u4.l0.p(th, "<this>");
        u4.l0.p(printStream, "stream");
        th.printStackTrace(printStream);
    }

    @k4.f
    public static final void h(Throwable th, PrintWriter printWriter) {
        u4.l0.p(th, "<this>");
        u4.l0.p(printWriter, "writer");
        th.printStackTrace(printWriter);
    }

    @g1(version = "1.4")
    @n6.d
    public static final String i(@n6.d Throwable th) {
        u4.l0.p(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        u4.l0.o(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
