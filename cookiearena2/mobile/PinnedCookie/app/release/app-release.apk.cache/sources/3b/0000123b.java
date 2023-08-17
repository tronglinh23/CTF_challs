package i6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes.dex */
public final class a0 {
    @n6.d
    public static final m0 a(@n6.d File file) throws FileNotFoundException {
        return b0.b(file);
    }

    @s4.h(name = "blackhole")
    @n6.d
    public static final m0 b() {
        return c0.a();
    }

    @n6.d
    public static final n c(@n6.d m0 m0Var) {
        return c0.b(m0Var);
    }

    @n6.d
    public static final o d(@n6.d o0 o0Var) {
        return c0.c(o0Var);
    }

    public static final boolean e(@n6.d AssertionError assertionError) {
        return b0.d(assertionError);
    }

    @n6.d
    @s4.i
    public static final m0 f(@n6.d File file) throws FileNotFoundException {
        return b0.j(file, false, 1, null);
    }

    @n6.d
    @s4.i
    public static final m0 g(@n6.d File file, boolean z6) throws FileNotFoundException {
        return b0.f(file, z6);
    }

    @n6.d
    public static final m0 h(@n6.d OutputStream outputStream) {
        return b0.g(outputStream);
    }

    @n6.d
    public static final m0 i(@n6.d Socket socket) throws IOException {
        return b0.h(socket);
    }

    @n6.d
    @IgnoreJRERequirement
    public static final m0 j(@n6.d Path path, @n6.d OpenOption... openOptionArr) throws IOException {
        return b0.i(path, openOptionArr);
    }

    @n6.d
    public static final o0 l(@n6.d File file) throws FileNotFoundException {
        return b0.k(file);
    }

    @n6.d
    public static final o0 m(@n6.d InputStream inputStream) {
        return b0.l(inputStream);
    }

    @n6.d
    public static final o0 n(@n6.d Socket socket) throws IOException {
        return b0.m(socket);
    }

    @n6.d
    @IgnoreJRERequirement
    public static final o0 o(@n6.d Path path, @n6.d OpenOption... openOptionArr) throws IOException {
        return b0.n(path, openOptionArr);
    }
}