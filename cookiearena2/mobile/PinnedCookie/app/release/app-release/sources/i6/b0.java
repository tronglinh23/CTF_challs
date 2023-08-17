package i6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.logging.Logger;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* loaded from: classes.dex */
public final /* synthetic */ class b0 {

    /* renamed from: a */
    public static final Logger f11165a = Logger.getLogger("okio.Okio");

    @n6.d
    public static final m0 b(@n6.d File file) throws FileNotFoundException {
        u4.l0.p(file, "$this$appendingSink");
        return a0.h(new FileOutputStream(file, true));
    }

    public static final Logger c() {
        return f11165a;
    }

    public static final boolean d(@n6.d AssertionError assertionError) {
        u4.l0.p(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            return message != null ? i5.c0.W2(message, "getsockname failed", false, 2, null) : false;
        }
        return false;
    }

    @n6.d
    @s4.i
    public static final m0 e(@n6.d File file) throws FileNotFoundException {
        return j(file, false, 1, null);
    }

    @n6.d
    @s4.i
    public static final m0 f(@n6.d File file, boolean z6) throws FileNotFoundException {
        u4.l0.p(file, "$this$sink");
        return a0.h(new FileOutputStream(file, z6));
    }

    @n6.d
    public static final m0 g(@n6.d OutputStream outputStream) {
        u4.l0.p(outputStream, "$this$sink");
        return new e0(outputStream, new q0());
    }

    @n6.d
    public static final m0 h(@n6.d Socket socket) throws IOException {
        u4.l0.p(socket, "$this$sink");
        n0 n0Var = new n0(socket);
        OutputStream outputStream = socket.getOutputStream();
        u4.l0.o(outputStream, "getOutputStream()");
        return n0Var.z(new e0(outputStream, n0Var));
    }

    @n6.d
    @IgnoreJRERequirement
    public static final m0 i(@n6.d Path path, @n6.d OpenOption... openOptionArr) throws IOException {
        u4.l0.p(path, "$this$sink");
        u4.l0.p(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        u4.l0.o(newOutputStream, "Files.newOutputStream(this, *options)");
        return a0.h(newOutputStream);
    }

    public static /* synthetic */ m0 j(File file, boolean z6, int i7, Object obj) throws FileNotFoundException {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        return a0.g(file, z6);
    }

    @n6.d
    public static final o0 k(@n6.d File file) throws FileNotFoundException {
        u4.l0.p(file, "$this$source");
        return a0.m(new FileInputStream(file));
    }

    @n6.d
    public static final o0 l(@n6.d InputStream inputStream) {
        u4.l0.p(inputStream, "$this$source");
        return new z(inputStream, new q0());
    }

    @n6.d
    public static final o0 m(@n6.d Socket socket) throws IOException {
        u4.l0.p(socket, "$this$source");
        n0 n0Var = new n0(socket);
        InputStream inputStream = socket.getInputStream();
        u4.l0.o(inputStream, "getInputStream()");
        return n0Var.A(new z(inputStream, n0Var));
    }

    @n6.d
    @IgnoreJRERequirement
    public static final o0 n(@n6.d Path path, @n6.d OpenOption... openOptionArr) throws IOException {
        u4.l0.p(path, "$this$source");
        u4.l0.p(openOptionArr, "options");
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        u4.l0.o(newInputStream, "Files.newInputStream(this, *options)");
        return a0.m(newInputStream);
    }
}
