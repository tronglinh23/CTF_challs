package n4;

import java.io.InputStream;
import java.nio.charset.Charset;
import u4.l0;
import v3.g1;

@s4.h(name = "ConsoleKt")
/* loaded from: classes.dex */
public final class d {
    @k4.f
    public static final void a(byte b7) {
        System.out.print(Byte.valueOf(b7));
    }

    @k4.f
    public static final void b(char c7) {
        System.out.print(c7);
    }

    @k4.f
    public static final void c(double d7) {
        System.out.print(d7);
    }

    @k4.f
    public static final void d(float f7) {
        System.out.print(f7);
    }

    @k4.f
    public static final void e(int i7) {
        System.out.print(i7);
    }

    @k4.f
    public static final void f(long j7) {
        System.out.print(j7);
    }

    @k4.f
    public static final void g(Object obj) {
        System.out.print(obj);
    }

    @k4.f
    public static final void h(short s6) {
        System.out.print(Short.valueOf(s6));
    }

    @k4.f
    public static final void i(boolean z6) {
        System.out.print(z6);
    }

    @k4.f
    public static final void j(char[] cArr) {
        l0.p(cArr, "message");
        System.out.print(cArr);
    }

    @k4.f
    public static final void k() {
        System.out.println();
    }

    @k4.f
    public static final void l(byte b7) {
        System.out.println(Byte.valueOf(b7));
    }

    @k4.f
    public static final void m(char c7) {
        System.out.println(c7);
    }

    @k4.f
    public static final void n(double d7) {
        System.out.println(d7);
    }

    @k4.f
    public static final void o(float f7) {
        System.out.println(f7);
    }

    @k4.f
    public static final void p(int i7) {
        System.out.println(i7);
    }

    @k4.f
    public static final void q(long j7) {
        System.out.println(j7);
    }

    @k4.f
    public static final void r(Object obj) {
        System.out.println(obj);
    }

    @k4.f
    public static final void s(short s6) {
        System.out.println(Short.valueOf(s6));
    }

    @k4.f
    public static final void t(boolean z6) {
        System.out.println(z6);
    }

    @k4.f
    public static final void u(char[] cArr) {
        l0.p(cArr, "message");
        System.out.println(cArr);
    }

    @n6.e
    public static final String v() {
        r rVar = r.f13861a;
        InputStream inputStream = System.in;
        l0.o(inputStream, "`in`");
        Charset defaultCharset = Charset.defaultCharset();
        l0.o(defaultCharset, "defaultCharset()");
        return rVar.d(inputStream, defaultCharset);
    }

    @g1(version = "1.6")
    @n6.d
    public static final String w() {
        String x6 = x();
        if (x6 != null) {
            return x6;
        }
        throw new v("EOF has already been reached");
    }

    @g1(version = "1.6")
    @n6.e
    public static final String x() {
        return v();
    }
}