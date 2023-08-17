package i6;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import v3.b1;

@v3.k(message = "changed in Okio 2.x")
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f11166a = new c();

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    public final m0 a(@n6.d File file) {
        u4.l0.p(file, "file");
        return a0.a(file);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    public final m0 b() {
        return a0.b();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "sink.buffer()", imports = {"okio.buffer"}))
    public final n c(@n6.d m0 m0Var) {
        u4.l0.p(m0Var, "sink");
        return a0.c(m0Var);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "source.buffer()", imports = {"okio.buffer"}))
    public final o d(@n6.d o0 o0Var) {
        u4.l0.p(o0Var, "source");
        return a0.d(o0Var);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "file.sink()", imports = {"okio.sink"}))
    public final m0 e(@n6.d File file) {
        u4.l0.p(file, "file");
        return b0.j(file, false, 1, null);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "outputStream.sink()", imports = {"okio.sink"}))
    public final m0 f(@n6.d OutputStream outputStream) {
        u4.l0.p(outputStream, "outputStream");
        return a0.h(outputStream);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "socket.sink()", imports = {"okio.sink"}))
    public final m0 g(@n6.d Socket socket) {
        u4.l0.p(socket, "socket");
        return a0.i(socket);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "path.sink(*options)", imports = {"okio.sink"}))
    public final m0 h(@n6.d Path path, @n6.d OpenOption... openOptionArr) {
        u4.l0.p(path, "path");
        u4.l0.p(openOptionArr, "options");
        return a0.j(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "file.source()", imports = {"okio.source"}))
    public final o0 i(@n6.d File file) {
        u4.l0.p(file, "file");
        return a0.l(file);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "inputStream.source()", imports = {"okio.source"}))
    public final o0 j(@n6.d InputStream inputStream) {
        u4.l0.p(inputStream, "inputStream");
        return a0.m(inputStream);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "socket.source()", imports = {"okio.source"}))
    public final o0 k(@n6.d Socket socket) {
        u4.l0.p(socket, "socket");
        return a0.n(socket);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "path.source(*options)", imports = {"okio.source"}))
    public final o0 l(@n6.d Path path, @n6.d OpenOption... openOptionArr) {
        u4.l0.p(path, "path");
        u4.l0.p(openOptionArr, "options");
        return a0.o(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }
}