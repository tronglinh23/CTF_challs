package n4;

import i5.b0;
import i5.c0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.m2;
import x3.e0;

@r1({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1266#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* loaded from: classes.dex */
public class q extends p {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.p {

        /* renamed from: l  reason: collision with root package name */
        public static final a f13859l = new a();

        public a() {
            super(2);
        }

        @Override // t4.p
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Void J(@n6.d File file, @n6.d IOException iOException) {
            l0.p(file, "<anonymous parameter 0>");
            l0.p(iOException, "exception");
            throw iOException;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.p<File, IOException, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.p<File, IOException, u> f13860l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(t4.p<? super File, ? super IOException, ? extends u> pVar) {
            super(2);
            this.f13860l = pVar;
        }

        @Override // t4.p
        public /* bridge */ /* synthetic */ m2 J(File file, IOException iOException) {
            b(file, iOException);
            return m2.f17815a;
        }

        public final void b(@n6.d File file, @n6.d IOException iOException) {
            l0.p(file, "f");
            l0.p(iOException, "e");
            if (this.f13860l.J(file, iOException) == u.TERMINATE) {
                throw new x(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean N(@n6.d java.io.File r11, @n6.d java.io.File r12, boolean r13, @n6.d t4.p<? super java.io.File, ? super java.io.IOException, ? extends n4.u> r14) {
        /*
            java.lang.String r0 = "<this>"
            u4.l0.p(r11, r0)
            java.lang.String r0 = "target"
            u4.l0.p(r12, r0)
            java.lang.String r0 = "onError"
            u4.l0.p(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2e
            n4.t r12 = new n4.t
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r7 = 2
            r8 = 0
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.J(r11, r12)
            n4.u r12 = n4.u.TERMINATE
            if (r11 == r12) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            return r1
        L2e:
            n4.k r0 = n4.p.M(r11)     // Catch: n4.x -> Ldc
            n4.q$b r3 = new n4.q$b     // Catch: n4.x -> Ldc
            r3.<init>(r14)     // Catch: n4.x -> Ldc
            n4.k r0 = r0.k(r3)     // Catch: n4.x -> Ldc
            java.util.Iterator r0 = r0.iterator()     // Catch: n4.x -> Ldc
        L3f:
            boolean r3 = r0.hasNext()     // Catch: n4.x -> Ldc
            if (r3 == 0) goto Ldb
            java.lang.Object r3 = r0.next()     // Catch: n4.x -> Ldc
            java.io.File r3 = (java.io.File) r3     // Catch: n4.x -> Ldc
            boolean r4 = r3.exists()     // Catch: n4.x -> Ldc
            if (r4 != 0) goto L66
            n4.t r10 = new n4.t     // Catch: n4.x -> Ldc
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: n4.x -> Ldc
            java.lang.Object r3 = r14.J(r3, r10)     // Catch: n4.x -> Ldc
            n4.u r4 = n4.u.TERMINATE     // Catch: n4.x -> Ldc
            if (r3 != r4) goto L3f
            return r2
        L66:
            java.lang.String r4 = n0(r3, r11)     // Catch: n4.x -> Ldc
            java.io.File r5 = new java.io.File     // Catch: n4.x -> Ldc
            r5.<init>(r12, r4)     // Catch: n4.x -> Ldc
            boolean r4 = r5.exists()     // Catch: n4.x -> Ldc
            if (r4 == 0) goto Lac
            boolean r4 = r3.isDirectory()     // Catch: n4.x -> Ldc
            if (r4 == 0) goto L81
            boolean r4 = r5.isDirectory()     // Catch: n4.x -> Ldc
            if (r4 != 0) goto Lac
        L81:
            if (r13 != 0) goto L85
        L83:
            r4 = r1
            goto L9a
        L85:
            boolean r4 = r5.isDirectory()     // Catch: n4.x -> Ldc
            if (r4 == 0) goto L92
            boolean r4 = V(r5)     // Catch: n4.x -> Ldc
            if (r4 != 0) goto L99
            goto L83
        L92:
            boolean r4 = r5.delete()     // Catch: n4.x -> Ldc
            if (r4 != 0) goto L99
            goto L83
        L99:
            r4 = r2
        L9a:
            if (r4 == 0) goto Lac
            n4.h r4 = new n4.h     // Catch: n4.x -> Ldc
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch: n4.x -> Ldc
            java.lang.Object r3 = r14.J(r5, r4)     // Catch: n4.x -> Ldc
            n4.u r4 = n4.u.TERMINATE     // Catch: n4.x -> Ldc
            if (r3 != r4) goto L3f
            return r2
        Lac:
            boolean r4 = r3.isDirectory()     // Catch: n4.x -> Ldc
            if (r4 == 0) goto Lb6
            r5.mkdirs()     // Catch: n4.x -> Ldc
            goto L3f
        Lb6:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = Q(r4, r5, r6, r7, r8, r9)     // Catch: n4.x -> Ldc
            long r4 = r4.length()     // Catch: n4.x -> Ldc
            long r6 = r3.length()     // Catch: n4.x -> Ldc
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L3f
            java.io.IOException r4 = new java.io.IOException     // Catch: n4.x -> Ldc
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch: n4.x -> Ldc
            java.lang.Object r3 = r14.J(r3, r4)     // Catch: n4.x -> Ldc
            n4.u r4 = n4.u.TERMINATE     // Catch: n4.x -> Ldc
            if (r3 != r4) goto L3f
            return r2
        Ldb:
            return r1
        Ldc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.q.N(java.io.File, java.io.File, boolean, t4.p):boolean");
    }

    public static /* synthetic */ boolean O(File file, File file2, boolean z6, t4.p pVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        if ((i7 & 4) != 0) {
            pVar = a.f13859l;
        }
        return N(file, file2, z6, pVar);
    }

    @n6.d
    public static final File P(@n6.d File file, @n6.d File file2, boolean z6, int i7) {
        l0.p(file, "<this>");
        l0.p(file2, "target");
        if (file.exists()) {
            if (file2.exists()) {
                if (!z6) {
                    throw new h(file, file2, "The destination file already exists.");
                }
                if (!file2.delete()) {
                    throw new h(file, file2, "Tried to overwrite the destination, but failed to delete it.");
                }
            }
            if (!file.isDirectory()) {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    n4.b.k(fileInputStream, fileOutputStream, i7);
                    c.a(fileOutputStream, null);
                    c.a(fileInputStream, null);
                } finally {
                }
            } else if (!file2.mkdirs()) {
                throw new j(file, file2, "Failed to create target directory.");
            }
            return file2;
        }
        throw new t(file, null, "The source file doesn't exist.", 2, null);
    }

    public static /* synthetic */ File Q(File file, File file2, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 8192;
        }
        return P(file, file2, z6, i7);
    }

    @n6.d
    @v3.k(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File R(@n6.d String str, @n6.e String str2, @n6.e File file) {
        l0.p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            l0.o(createTempFile, "dir");
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    public static /* synthetic */ File S(String str, String str2, File file, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "tmp";
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            file = null;
        }
        return R(str, str2, file);
    }

    @n6.d
    @v3.k(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File T(@n6.d String str, @n6.e String str2, @n6.e File file) {
        l0.p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        l0.o(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static /* synthetic */ File U(String str, String str2, File file, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "tmp";
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            file = null;
        }
        return T(str, str2, file);
    }

    public static final boolean V(@n6.d File file) {
        l0.p(file, "<this>");
        while (true) {
            boolean z6 = true;
            for (File file2 : p.L(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z6) {
                        break;
                    }
                }
                z6 = false;
            }
            return z6;
        }
    }

    public static final boolean W(@n6.d File file, @n6.d File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "other");
        i f7 = n.f(file);
        i f8 = n.f(file2);
        if (f8.i()) {
            return l0.g(file, file2);
        }
        int h7 = f7.h() - f8.h();
        if (h7 < 0) {
            return false;
        }
        return f7.g().subList(h7, f7.h()).equals(f8.g());
    }

    public static final boolean X(@n6.d File file, @n6.d String str) {
        l0.p(file, "<this>");
        l0.p(str, "other");
        return W(file, new File(str));
    }

    @n6.d
    public static final String Y(@n6.d File file) {
        l0.p(file, "<this>");
        String name = file.getName();
        l0.o(name, "name");
        return c0.r5(name, '.', "");
    }

    @n6.d
    public static final String Z(@n6.d File file) {
        l0.p(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            l0.o(path, "path");
            return b0.k2(path, File.separatorChar, '/', false, 4, null);
        }
        String path2 = file.getPath();
        l0.o(path2, "path");
        return path2;
    }

    @n6.d
    public static final String a0(@n6.d File file) {
        l0.p(file, "<this>");
        String name = file.getName();
        l0.o(name, "name");
        return c0.C5(name, ".", null, 2, null);
    }

    @n6.d
    public static final File b0(@n6.d File file) {
        l0.p(file, "<this>");
        i f7 = n.f(file);
        File e7 = f7.e();
        List<File> c02 = c0(f7.g());
        String str = File.separator;
        l0.o(str, "separator");
        return i0(e7, e0.h3(c02, str, null, null, 0, null, null, 62, null));
    }

    public static final List<File> c0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!l0.g(name, ".")) {
                if (!l0.g(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || l0.g(((File) e0.k3(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    public static final i d0(i iVar) {
        return new i(iVar.e(), c0(iVar.g()));
    }

    @n6.d
    public static final File e0(@n6.d File file, @n6.d File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "base");
        return new File(n0(file, file2));
    }

    @n6.e
    public static final File f0(@n6.d File file, @n6.d File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "base");
        String o02 = o0(file, file2);
        if (o02 != null) {
            return new File(o02);
        }
        return null;
    }

    @n6.d
    public static final File g0(@n6.d File file, @n6.d File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "base");
        String o02 = o0(file, file2);
        return o02 != null ? new File(o02) : file;
    }

    @n6.d
    public static final File h0(@n6.d File file, @n6.d File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "relative");
        if (n.d(file2)) {
            return file2;
        }
        String file3 = file.toString();
        l0.o(file3, "this.toString()");
        if ((file3.length() == 0) || c0.b3(file3, File.separatorChar, false, 2, null)) {
            return new File(file3 + file2);
        }
        return new File(file3 + File.separatorChar + file2);
    }

    @n6.d
    public static final File i0(@n6.d File file, @n6.d String str) {
        l0.p(file, "<this>");
        l0.p(str, "relative");
        return h0(file, new File(str));
    }

    @n6.d
    public static final File j0(@n6.d File file, @n6.d File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "relative");
        i f7 = n.f(file);
        return h0(h0(f7.e(), f7.h() == 0 ? new File("..") : f7.j(0, f7.h() - 1)), file2);
    }

    @n6.d
    public static final File k0(@n6.d File file, @n6.d String str) {
        l0.p(file, "<this>");
        l0.p(str, "relative");
        return j0(file, new File(str));
    }

    public static final boolean l0(@n6.d File file, @n6.d File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "other");
        i f7 = n.f(file);
        i f8 = n.f(file2);
        if (l0.g(f7.e(), f8.e()) && f7.h() >= f8.h()) {
            return f7.g().subList(0, f8.h()).equals(f8.g());
        }
        return false;
    }

    public static final boolean m0(@n6.d File file, @n6.d String str) {
        l0.p(file, "<this>");
        l0.p(str, "other");
        return l0(file, new File(str));
    }

    @n6.d
    public static final String n0(@n6.d File file, @n6.d File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "base");
        String o02 = o0(file, file2);
        if (o02 != null) {
            return o02;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    public static final String o0(File file, File file2) {
        i d02 = d0(n.f(file));
        i d03 = d0(n.f(file2));
        if (l0.g(d02.e(), d03.e())) {
            int h7 = d03.h();
            int h8 = d02.h();
            int min = Math.min(h8, h7);
            int i7 = 0;
            while (i7 < min && l0.g(d02.g().get(i7), d03.g().get(i7))) {
                i7++;
            }
            StringBuilder sb = new StringBuilder();
            int i8 = h7 - 1;
            if (i7 <= i8) {
                while (!l0.g(d03.g().get(i8).getName(), "..")) {
                    sb.append("..");
                    if (i8 != i7) {
                        sb.append(File.separatorChar);
                    }
                    if (i8 != i7) {
                        i8--;
                    }
                }
                return null;
            }
            if (i7 < h8) {
                if (i7 < h7) {
                    sb.append(File.separatorChar);
                }
                List X1 = e0.X1(d02.g(), i7);
                String str = File.separator;
                l0.o(str, "separator");
                e0.e3(X1, sb, (r14 & 2) != 0 ? ", " : str, (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
            }
            return sb.toString();
        }
        return null;
    }
}