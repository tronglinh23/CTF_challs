package b6;

import i6.a0;
import i6.b0;
import i6.m0;
import i6.o0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import n6.d;
import s4.e;
import u.v;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public interface a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0082a f7273b = new C0082a(null);
    @d
    @e

    /* renamed from: a  reason: collision with root package name */
    public static final a f7272a = new C0082a.C0083a();

    /* renamed from: b6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0082a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C0082a f7274a = null;

        /* renamed from: b6.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0083a implements a {
            @Override // b6.a
            public void a(@d File file) throws IOException {
                l0.p(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // b6.a
            @d
            public o0 b(@d File file) throws FileNotFoundException {
                l0.p(file, "file");
                return a0.l(file);
            }

            @Override // b6.a
            @d
            public m0 c(@d File file) throws FileNotFoundException {
                l0.p(file, "file");
                try {
                    return b0.j(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return b0.j(file, false, 1, null);
                }
            }

            @Override // b6.a
            public void d(@d File file) throws IOException {
                l0.p(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : listFiles) {
                    l0.o(file2, "file");
                    if (file2.isDirectory()) {
                        d(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // b6.a
            @d
            public m0 e(@d File file) throws FileNotFoundException {
                l0.p(file, "file");
                try {
                    return a0.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return a0.a(file);
                }
            }

            @Override // b6.a
            public boolean f(@d File file) {
                l0.p(file, "file");
                return file.exists();
            }

            @Override // b6.a
            public void g(@d File file, @d File file2) throws IOException {
                l0.p(file, v.h.f17254c);
                l0.p(file2, "to");
                a(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // b6.a
            public long h(@d File file) {
                l0.p(file, "file");
                return file.length();
            }

            @d
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        public C0082a() {
        }

        public /* synthetic */ C0082a(w wVar) {
            this();
        }
    }

    void a(@d File file) throws IOException;

    @d
    o0 b(@d File file) throws FileNotFoundException;

    @d
    m0 c(@d File file) throws FileNotFoundException;

    void d(@d File file) throws IOException;

    @d
    m0 e(@d File file) throws FileNotFoundException;

    boolean f(@d File file);

    void g(@d File file, @d File file2) throws IOException;

    long h(@d File file);
}
