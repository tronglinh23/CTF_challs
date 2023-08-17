package p4;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import u4.h0;
import u4.l0;
import u4.n0;
import u4.r1;
import u4.s1;
import v3.g1;
import v3.j0;
import v3.m2;
@r1({"SMAP\nPathRecursiveFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,420:1\n336#1,2:424\n344#1:426\n344#1:427\n338#1,4:428\n336#1,2:432\n344#1:434\n338#1,4:435\n344#1:439\n336#1,6:440\n336#1,2:446\n344#1:448\n338#1,4:449\n1#2:421\n1855#3,2:422\n*S KotlinDebug\n*F\n+ 1 PathRecursiveFunctions.kt\nkotlin/io/path/PathsKt__PathRecursiveFunctionsKt\n*L\n352#1:424,2\n361#1:426\n364#1:427\n352#1:428,4\n372#1:432,2\n373#1:434\n372#1:435,4\n384#1:439\n392#1:440,6\n410#1:446,2\n411#1:448\n410#1:449,4\n274#1:422,2\n*E\n"})
/* loaded from: classes.dex */
public class s extends r {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14807a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f14808b;

        static {
            int[] iArr = new int[p4.b.values().length];
            try {
                iArr[p4.b.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p4.b.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p4.b.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14807a = iArr;
            int[] iArr2 = new int[k.values().length];
            try {
                iArr2[k.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[k.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f14808b = iArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.q {

        /* renamed from: l  reason: collision with root package name */
        public static final b f14809l = new b();

        public b() {
            super(3);
        }

        @Override // t4.q
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Void I(@n6.d Path path, @n6.d Path path2, @n6.d Exception exc) {
            l0.p(path, "<anonymous parameter 0>");
            l0.p(path2, "<anonymous parameter 1>");
            l0.p(exc, "exception");
            throw exc;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.q<p4.a, Path, Path, p4.b> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ boolean f14810l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z6) {
            super(3);
            this.f14810l = z6;
        }

        @Override // t4.q
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final p4.b I(@n6.d p4.a aVar, @n6.d Path path, @n6.d Path path2) {
            l0.p(aVar, "$this$copyToRecursively");
            l0.p(path, "src");
            l0.p(path2, "dst");
            LinkOption[] a7 = j.f14770a.a(this.f14810l);
            boolean isDirectory = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a7, a7.length);
            if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !isDirectory) {
                if (isDirectory) {
                    s.R(path2);
                }
                s1 s1Var = new s1(2);
                s1Var.b(a7);
                s1Var.a(StandardCopyOption.REPLACE_EXISTING);
                CopyOption[] copyOptionArr = (CopyOption[]) s1Var.d(new CopyOption[s1Var.c()]);
                l0.o(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
            }
            return p4.b.CONTINUE;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 implements t4.q {

        /* renamed from: l  reason: collision with root package name */
        public static final d f14811l = new d();

        public d() {
            super(3);
        }

        @Override // t4.q
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Void I(@n6.d Path path, @n6.d Path path2, @n6.d Exception exc) {
            l0.p(path, "<anonymous parameter 0>");
            l0.p(path2, "<anonymous parameter 1>");
            l0.p(exc, "exception");
            throw exc;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends n0 implements t4.q<p4.a, Path, Path, p4.b> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ boolean f14812l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z6) {
            super(3);
            this.f14812l = z6;
        }

        @Override // t4.q
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final p4.b I(@n6.d p4.a aVar, @n6.d Path path, @n6.d Path path2) {
            l0.p(aVar, "$this$null");
            l0.p(path, "src");
            l0.p(path2, "dst");
            return aVar.a(path, path2, this.f14812l);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends n0 implements t4.l<g, m2> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t4.q<p4.a, Path, Path, p4.b> f14813l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Path f14814m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ Path f14815n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ t4.q<Path, Path, Exception, k> f14816o;

        /* loaded from: classes.dex */
        public /* synthetic */ class a extends h0 implements t4.p<Path, BasicFileAttributes, FileVisitResult> {

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ t4.q<p4.a, Path, Path, p4.b> f14817t;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ Path f14818u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ Path f14819v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ t4.q<Path, Path, Exception, k> f14820w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(t4.q<? super p4.a, ? super Path, ? super Path, ? extends p4.b> qVar, Path path, Path path2, t4.q<? super Path, ? super Path, ? super Exception, ? extends k> qVar2) {
                super(2, l0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.f14817t = qVar;
                this.f14818u = path;
                this.f14819v = path2;
                this.f14820w = qVar2;
            }

            @Override // t4.p
            @n6.d
            /* renamed from: C0  reason: merged with bridge method [inline-methods] */
            public final FileVisitResult J(@n6.d Path path, @n6.d BasicFileAttributes basicFileAttributes) {
                l0.p(path, "p0");
                l0.p(basicFileAttributes, "p1");
                return s.M(this.f14817t, this.f14818u, this.f14819v, this.f14820w, path, basicFileAttributes);
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class b extends h0 implements t4.p<Path, BasicFileAttributes, FileVisitResult> {

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ t4.q<p4.a, Path, Path, p4.b> f14821t;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ Path f14822u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ Path f14823v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ t4.q<Path, Path, Exception, k> f14824w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(t4.q<? super p4.a, ? super Path, ? super Path, ? extends p4.b> qVar, Path path, Path path2, t4.q<? super Path, ? super Path, ? super Exception, ? extends k> qVar2) {
                super(2, l0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.f14821t = qVar;
                this.f14822u = path;
                this.f14823v = path2;
                this.f14824w = qVar2;
            }

            @Override // t4.p
            @n6.d
            /* renamed from: C0  reason: merged with bridge method [inline-methods] */
            public final FileVisitResult J(@n6.d Path path, @n6.d BasicFileAttributes basicFileAttributes) {
                l0.p(path, "p0");
                l0.p(basicFileAttributes, "p1");
                return s.M(this.f14821t, this.f14822u, this.f14823v, this.f14824w, path, basicFileAttributes);
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class c extends h0 implements t4.p<Path, Exception, FileVisitResult> {

            /* renamed from: t  reason: collision with root package name */
            public final /* synthetic */ t4.q<Path, Path, Exception, k> f14825t;

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ Path f14826u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ Path f14827v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(t4.q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, Path path, Path path2) {
                super(2, l0.a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                this.f14825t = qVar;
                this.f14826u = path;
                this.f14827v = path2;
            }

            @Override // t4.p
            @n6.d
            /* renamed from: C0  reason: merged with bridge method [inline-methods] */
            public final FileVisitResult J(@n6.d Path path, @n6.d Exception exc) {
                l0.p(path, "p0");
                l0.p(exc, "p1");
                return s.Q(this.f14825t, this.f14826u, this.f14827v, path, exc);
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends n0 implements t4.p<Path, IOException, FileVisitResult> {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ t4.q<Path, Path, Exception, k> f14828l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ Path f14829m;

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ Path f14830n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public d(t4.q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, Path path, Path path2) {
                super(2);
                this.f14828l = qVar;
                this.f14829m = path;
                this.f14830n = path2;
            }

            @Override // t4.p
            @n6.d
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final FileVisitResult J(@n6.d Path path, @n6.e IOException iOException) {
                l0.p(path, "directory");
                return iOException == null ? FileVisitResult.CONTINUE : s.Q(this.f14828l, this.f14829m, this.f14830n, path, iOException);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(t4.q<? super p4.a, ? super Path, ? super Path, ? extends p4.b> qVar, Path path, Path path2, t4.q<? super Path, ? super Path, ? super Exception, ? extends k> qVar2) {
            super(1);
            this.f14813l = qVar;
            this.f14814m = path;
            this.f14815n = path2;
            this.f14816o = qVar2;
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(g gVar) {
            b(gVar);
            return m2.f17815a;
        }

        public final void b(@n6.d g gVar) {
            l0.p(gVar, "$this$visitFileTree");
            gVar.c(new a(this.f14813l, this.f14814m, this.f14815n, this.f14816o));
            gVar.a(new b(this.f14813l, this.f14814m, this.f14815n, this.f14816o));
            gVar.d(new c(this.f14816o, this.f14814m, this.f14815n));
            gVar.b(new d(this.f14816o, this.f14814m, this.f14815n));
        }
    }

    public static final void J(p4.e eVar, t4.a<m2> aVar) {
        try {
            aVar.n();
        } catch (Exception e7) {
            eVar.a(e7);
        }
    }

    @g1(version = "1.8")
    @n6.d
    @p4.f
    public static final Path K(@n6.d Path path, @n6.d Path path2, @n6.d t4.q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, boolean z6, @n6.d t4.q<? super p4.a, ? super Path, ? super Path, ? extends p4.b> qVar2) {
        l0.p(path, "<this>");
        l0.p(path2, "target");
        l0.p(qVar, "onError");
        l0.p(qVar2, "copyAction");
        LinkOption[] a7 = j.f14770a.a(z6);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a7, a7.length);
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            boolean z7 = false;
            if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z6 || !Files.isSymbolicLink(path))) {
                boolean z8 = Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(path2);
                if (!z8 || !Files.isSameFile(path, path2)) {
                    if (l0.g(path.getFileSystem(), path2.getFileSystem())) {
                        if (z8) {
                            z7 = path2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                        } else {
                            Path parent = path2.getParent();
                            if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                                z7 = true;
                            }
                        }
                    }
                    if (z7) {
                        throw new FileSystemException(path.toString(), path2.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                    }
                }
            }
            t.B1(path, 0, z6, new f(qVar2, path, path2, qVar), 1, null);
            return path2;
        }
        throw new NoSuchFileException(path.toString(), path2.toString(), "The source file doesn't exist.");
    }

    @g1(version = "1.8")
    @n6.d
    @p4.f
    public static final Path L(@n6.d Path path, @n6.d Path path2, @n6.d t4.q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, boolean z6, boolean z7) {
        l0.p(path, "<this>");
        l0.p(path2, "target");
        l0.p(qVar, "onError");
        return z7 ? K(path, path2, qVar, z6, new c(z6)) : N(path, path2, qVar, z6, null, 8, null);
    }

    public static final FileVisitResult M(t4.q<? super p4.a, ? super Path, ? super Path, ? extends p4.b> qVar, Path path, Path path2, t4.q<? super Path, ? super Path, ? super Exception, ? extends k> qVar2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return Y(qVar.I(p4.c.f14753a, path3, P(path, path2, path3)));
        } catch (Exception e7) {
            return Q(qVar2, path, path2, path3, e7);
        }
    }

    public static /* synthetic */ Path N(Path path, Path path2, t4.q qVar, boolean z6, t4.q qVar2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            qVar = d.f14811l;
        }
        if ((i7 & 8) != 0) {
            qVar2 = new e(z6);
        }
        return K(path, path2, qVar, z6, qVar2);
    }

    public static /* synthetic */ Path O(Path path, Path path2, t4.q qVar, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            qVar = b.f14809l;
        }
        return L(path, path2, qVar, z6, z7);
    }

    public static final Path P(Path path, Path path2, Path path3) {
        Path resolve = path2.resolve(t.p1(path3, path).toString());
        l0.o(resolve, "target.resolve(relativePath.pathString)");
        return resolve;
    }

    public static final FileVisitResult Q(t4.q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, Path path, Path path2, Path path3, Exception exc) {
        return Z(qVar.I(path3, P(path, path2, path3), exc));
    }

    @g1(version = "1.8")
    @p4.f
    public static final void R(@n6.d Path path) {
        l0.p(path, "<this>");
        List<Exception> S = S(path);
        if ((!S.isEmpty()) == true) {
            FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            Iterator<T> it = S.iterator();
            while (it.hasNext()) {
                v3.p.a(fileSystemException, (Exception) it.next());
            }
            throw fileSystemException;
        }
    }

    public static final List<Exception> S(Path path) {
        DirectoryStream<Path> directoryStream;
        int i7 = 0;
        int i8 = 1;
        p4.e eVar = new p4.e(i7, i8, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                try {
                    if (directoryStream instanceof SecureDirectoryStream) {
                        eVar.g(parent);
                        Path fileName = path.getFileName();
                        l0.o(fileName, "this.fileName");
                        U((SecureDirectoryStream) directoryStream, fileName, eVar);
                    } else {
                        i7 = 1;
                    }
                    m2 m2Var = m2.f17815a;
                    n4.c.a(directoryStream, null);
                    i8 = i7;
                } finally {
                }
            }
        }
        if (i8 != 0) {
            W(path, eVar);
        }
        return eVar.d();
    }

    public static final void T(SecureDirectoryStream<Path> secureDirectoryStream, Path path, p4.e eVar) {
        SecureDirectoryStream<Path> secureDirectoryStream2;
        try {
            try {
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (Exception e7) {
                eVar.a(e7);
                return;
            }
        } catch (NoSuchFileException unused) {
            secureDirectoryStream2 = null;
        }
        if (secureDirectoryStream2 != null) {
            Iterator<Path> it = secureDirectoryStream2.iterator();
            while (it.hasNext()) {
                Path fileName = it.next().getFileName();
                l0.o(fileName, "entry.fileName");
                U(secureDirectoryStream2, fileName, eVar);
            }
            m2 m2Var = m2.f17815a;
            n4.c.a(secureDirectoryStream2, null);
        }
    }

    public static final void U(SecureDirectoryStream<Path> secureDirectoryStream, Path path, p4.e eVar) {
        eVar.b(path);
        try {
        } catch (Exception e7) {
            eVar.a(e7);
        }
        if (X(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int f7 = eVar.f();
            T(secureDirectoryStream, path, eVar);
            if (f7 == eVar.f()) {
                secureDirectoryStream.deleteDirectory(path);
                m2 m2Var = m2.f17815a;
            }
            eVar.c(path);
        }
        secureDirectoryStream.deleteFile(path);
        m2 m2Var2 = m2.f17815a;
        eVar.c(path);
    }

    public static final void V(Path path, p4.e eVar) {
        DirectoryStream<Path> directoryStream;
        try {
            try {
                directoryStream = Files.newDirectoryStream(path);
            } catch (NoSuchFileException unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                for (Path path2 : directoryStream) {
                    l0.o(path2, "entry");
                    W(path2, eVar);
                }
                m2 m2Var = m2.f17815a;
                n4.c.a(directoryStream, null);
            }
        } catch (Exception e7) {
            eVar.a(e7);
        }
    }

    public static final void W(Path path, p4.e eVar) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int f7 = eVar.f();
                V(path, eVar);
                if (f7 == eVar.f()) {
                    Files.deleteIfExists(path);
                }
            } else {
                Files.deleteIfExists(path);
            }
        } catch (Exception e7) {
            eVar.a(e7);
        }
    }

    public static final boolean X(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @p4.f
    public static final FileVisitResult Y(p4.b bVar) {
        int i7 = a.f14807a[bVar.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    return FileVisitResult.SKIP_SUBTREE;
                }
                throw new j0();
            }
            return FileVisitResult.TERMINATE;
        }
        return FileVisitResult.CONTINUE;
    }

    @p4.f
    public static final FileVisitResult Z(k kVar) {
        int i7 = a.f14808b[kVar.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                return FileVisitResult.SKIP_SUBTREE;
            }
            throw new j0();
        }
        return FileVisitResult.TERMINATE;
    }

    public static final <R> R a0(t4.a<? extends R> aVar) {
        try {
            return aVar.n();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
