package g1;

import android.annotation.SuppressLint;
import android.util.AtomicFile;
import d.w0;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import u4.l0;
import u4.r1;
import v3.m2;
@r1({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,84:1\n34#1,13:85\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n53#1:85,13\n*E\n"})
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class d {
    @n6.d
    @w0(17)
    public static final byte[] a(@n6.d AtomicFile atomicFile) {
        l0.p(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        l0.o(readFully, "readFully()");
        return readFully;
    }

    @n6.d
    @w0(17)
    public static final String b(@n6.d AtomicFile atomicFile, @n6.d Charset charset) {
        l0.p(atomicFile, "<this>");
        l0.p(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        l0.o(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            charset = i5.f.f11071b;
        }
        return b(atomicFile, charset);
    }

    @w0(17)
    public static final void d(@n6.d AtomicFile atomicFile, @n6.d t4.l<? super FileOutputStream, m2> lVar) {
        l0.p(atomicFile, "<this>");
        l0.p(lVar, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            l0.o(startWrite, "stream");
            lVar.O(startWrite);
            u4.i0.d(1);
            atomicFile.finishWrite(startWrite);
            u4.i0.c(1);
        } catch (Throwable th) {
            u4.i0.d(1);
            atomicFile.failWrite(startWrite);
            u4.i0.c(1);
            throw th;
        }
    }

    @w0(17)
    public static final void e(@n6.d AtomicFile atomicFile, @n6.d byte[] bArr) {
        l0.p(atomicFile, "<this>");
        l0.p(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            l0.o(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @w0(17)
    public static final void f(@n6.d AtomicFile atomicFile, @n6.d String str, @n6.d Charset charset) {
        l0.p(atomicFile, "<this>");
        l0.p(str, "text");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            charset = i5.f.f11071b;
        }
        f(atomicFile, str, charset);
    }
}
