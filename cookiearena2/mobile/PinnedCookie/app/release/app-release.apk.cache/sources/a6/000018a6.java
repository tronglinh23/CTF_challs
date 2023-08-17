package p4;

import i5.b0;
import i5.c0;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s2.t0;
import u4.i0;
import u4.l0;
import u4.r1;
import v3.a1;
import v3.b1;
import v3.g1;
import v3.m2;
import v3.q2;
import v3.y;
import x3.e0;
import x3.k1;
import x3.l1;

@r1({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1132:1\n26#2:1133\n26#2:1137\n1#3:1134\n1855#4,2:1135\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1133\n574#1:1137\n440#1:1135,2\n*E\n"})
/* loaded from: classes.dex */
public class t extends s {
    @n6.d
    @a1
    public static final Void A0(@n6.d Path path, @n6.d Class<?> cls) {
        l0.p(path, "path");
        l0.p(cls, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + '.');
    }

    @g1(version = "1.7")
    @f
    public static final void A1(@n6.d Path path, @n6.d FileVisitor<Path> fileVisitor, int i7, boolean z6) {
        l0.p(path, "<this>");
        l0.p(fileVisitor, "visitor");
        Files.walkFileTree(path, z6 ? k1.f(FileVisitOption.FOLLOW_LINKS) : l1.k(), i7, fileVisitor);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final /* synthetic */ <V extends FileAttributeView> V B0(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        l0.y(4, "V");
        V v6 = (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (v6 != null) {
            return v6;
        }
        l0.y(4, "V");
        A0(path, FileAttributeView.class);
        throw new y();
    }

    public static /* synthetic */ void B1(Path path, int i7, boolean z6, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        z1(path, i7, z6, lVar);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final /* synthetic */ <V extends FileAttributeView> V C0(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        l0.y(4, "V");
        return (V) Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    public static /* synthetic */ void C1(Path path, FileVisitor fileVisitor, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        A1(path, fileVisitor, i7, z6);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final long D0(Path path) throws IOException {
        l0.p(path, "<this>");
        return Files.size(path);
    }

    @g1(version = "1.7")
    @n6.d
    @f
    public static final f5.m<Path> D1(@n6.d Path path, @n6.d p... pVarArr) {
        l0.p(path, "<this>");
        l0.p(pVarArr, "options");
        return new n(path, pVarArr);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final FileStore E0(Path path) throws IOException {
        l0.p(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        l0.o(fileStore, "getFileStore(this)");
        return fileStore;
    }

    @g1(version = "1.7")
    @n6.d
    @f
    public static final FileVisitor<Path> F0(@n6.d t4.l<? super g, m2> lVar) {
        l0.p(lVar, "builderAction");
        h hVar = new h();
        lVar.O(hVar);
        return hVar.e();
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final void G0(Path path, String str, t4.l<? super Path, m2> lVar) throws IOException {
        l0.p(path, "<this>");
        l0.p(str, "glob");
        l0.p(lVar, t0.f16450f);
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            l0.o(newDirectoryStream, "it");
            Iterator<Path> it = newDirectoryStream.iterator();
            while (it.hasNext()) {
                lVar.O(it.next());
            }
            m2 m2Var = m2.f17815a;
            i0.d(1);
            n4.c.a(newDirectoryStream, null);
            i0.c(1);
        } finally {
        }
    }

    public static /* synthetic */ void H0(Path path, String str, t4.l lVar, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            str = "*";
        }
        l0.p(path, "<this>");
        l0.p(str, "glob");
        l0.p(lVar, t0.f16450f);
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            l0.o(newDirectoryStream, "it");
            Iterator<Path> it = newDirectoryStream.iterator();
            while (it.hasNext()) {
                lVar.O(it.next());
            }
            m2 m2Var = m2.f17815a;
            i0.d(1);
            n4.c.a(newDirectoryStream, null);
            i0.c(1);
        } finally {
        }
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Object I0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(str, "attribute");
        l0.p(linkOptionArr, "options");
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @n6.d
    public static final String J0(@n6.d Path path) {
        String obj;
        String r52;
        l0.p(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (obj = fileName.toString()) == null || (r52 = c0.r5(obj, '.', "")) == null) ? "" : r52;
    }

    @g1(version = "1.5")
    @q2(markerClass = {f.class})
    public static /* synthetic */ void K0(Path path) {
    }

    public static final String L0(Path path) {
        l0.p(path, "<this>");
        return N0(path);
    }

    @g1(version = "1.4")
    @v3.k(level = v3.m.ERROR, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @b1(expression = "invariantSeparatorsPathString", imports = {}))
    @k4.f
    @f
    public static /* synthetic */ void M0(Path path) {
    }

    @n6.d
    public static final String N0(@n6.d Path path) {
        l0.p(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (l0.g(separator, "/")) {
            return path.toString();
        }
        String obj = path.toString();
        l0.o(separator, "separator");
        return b0.l2(obj, separator, "/", false, 4, null);
    }

    @g1(version = "1.5")
    @q2(markerClass = {f.class})
    public static /* synthetic */ void O0(Path path) {
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final FileTime P0(Path path, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    @n6.d
    public static final String Q0(@n6.d Path path) {
        l0.p(path, "<this>");
        Path fileName = path.getFileName();
        String obj = fileName != null ? fileName.toString() : null;
        return obj == null ? "" : obj;
    }

    @g1(version = "1.5")
    @q2(markerClass = {f.class})
    public static /* synthetic */ void R0(Path path) {
    }

    @n6.d
    public static final String S0(@n6.d Path path) {
        String obj;
        String C5;
        l0.p(path, "<this>");
        Path fileName = path.getFileName();
        return (fileName == null || (obj = fileName.toString()) == null || (C5 = c0.C5(obj, ".", null, 2, null)) == null) ? "" : C5;
    }

    @g1(version = "1.5")
    @q2(markerClass = {f.class})
    public static /* synthetic */ void T0(Path path) {
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final UserPrincipal U0(Path path, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    public static final String V0(Path path) {
        l0.p(path, "<this>");
        return path.toString();
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static /* synthetic */ void W0(Path path) {
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Set<PosixFilePermission> X0(Path path, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean Y0(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean Z0(Path path) {
        l0.p(path, "<this>");
        return Files.isExecutable(path);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean a1(Path path) throws IOException {
        l0.p(path, "<this>");
        return Files.isHidden(path);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path b0(String str) {
        l0.p(str, "path");
        Path path = Paths.get(str, new String[0]);
        l0.o(path, "get(path)");
        return path;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean b1(Path path) {
        l0.p(path, "<this>");
        return Files.isReadable(path);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path c0(String str, String... strArr) {
        l0.p(str, "base");
        l0.p(strArr, "subpaths");
        Path path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        l0.o(path, "get(base, *subpaths)");
        return path;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean c1(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path d0(Path path) {
        l0.p(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        l0.o(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean d1(Path path, Path path2) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, "other");
        return Files.isSameFile(path, path2);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final String e0(Path path) {
        l0.p(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean e1(Path path) {
        l0.p(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path f0(Path path, Path path2, boolean z6) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, "target");
        CopyOption[] copyOptionArr = z6 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(copy, "copy(this, target, *options)");
        return copy;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean f1(Path path) {
        l0.p(path, "<this>");
        return Files.isWritable(path);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path g0(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, "target");
        l0.p(copyOptionArr, "options");
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(copy, "copy(this, target, *options)");
        return copy;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {f.class})
    public static final List<Path> g1(@n6.d Path path, @n6.d String str) throws IOException {
        l0.p(path, "<this>");
        l0.p(str, "glob");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            l0.o(newDirectoryStream, "it");
            List<Path> Q5 = e0.Q5(newDirectoryStream);
            n4.c.a(newDirectoryStream, null);
            return Q5;
        } finally {
        }
    }

    public static /* synthetic */ Path h0(Path path, Path path2, boolean z6, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        l0.p(path, "<this>");
        l0.p(path2, "target");
        CopyOption[] copyOptionArr = z6 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(copy, "copy(this, target, *options)");
        return copy;
    }

    public static /* synthetic */ List h1(Path path, String str, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            str = "*";
        }
        return g1(path, str);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path i0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(fileAttributeArr, "attributes");
        Path createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createDirectories, "createDirectories(this, *attributes)");
        return createDirectories;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path i1(Path path, Path path2, boolean z6) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, "target");
        CopyOption[] copyOptionArr = z6 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(move, "move(this, target, *options)");
        return move;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path j0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(fileAttributeArr, "attributes");
        Path createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createDirectory, "createDirectory(this, *attributes)");
        return createDirectory;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path j1(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, "target");
        l0.p(copyOptionArr, "options");
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(move, "move(this, target, *options)");
        return move;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path k0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(fileAttributeArr, "attributes");
        Path createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createFile, "createFile(this, *attributes)");
        return createFile;
    }

    public static /* synthetic */ Path k1(Path path, Path path2, boolean z6, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        l0.p(path, "<this>");
        l0.p(path2, "target");
        CopyOption[] copyOptionArr = z6 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(move, "move(this, target, *options)");
        return move;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path l0(Path path, Path path2) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, "target");
        Path createLink = Files.createLink(path, path2);
        l0.o(createLink, "createLink(this, target)");
        return createLink;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean l1(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path m0(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, "target");
        l0.p(fileAttributeArr, "attributes");
        Path createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return createSymbolicLink;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final /* synthetic */ <A extends BasicFileAttributes> A m1(Path path, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        l0.y(4, "A");
        A a7 = (A) Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(a7, "readAttributes(this, A::class.java, *options)");
        return a7;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path n0(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Map<String, Object> n1(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(str, "attributes");
        l0.p(linkOptionArr, "options");
        Map<String, Object> readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(readAttributes, "readAttributes(this, attributes, *options)");
        return readAttributes;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {f.class})
    public static final Path o0(@n6.e Path path, @n6.e String str, @n6.d FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(fileAttributeArr, "attributes");
        if (path != null) {
            Path createTempDirectory = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            l0.o(createTempDirectory, "createTempDirectory(dire…ory, prefix, *attributes)");
            return createTempDirectory;
        }
        Path createTempDirectory2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempDirectory2, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory2;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path o1(Path path) throws IOException {
        l0.p(path, "<this>");
        Path readSymbolicLink = Files.readSymbolicLink(path);
        l0.o(readSymbolicLink, "readSymbolicLink(this)");
        return readSymbolicLink;
    }

    public static /* synthetic */ Path p0(String str, FileAttribute[] fileAttributeArr, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            str = null;
        }
        l0.p(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {f.class})
    public static final Path p1(@n6.d Path path, @n6.d Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "base");
        try {
            return m.f14782a.a(path, path2);
        } catch (IllegalArgumentException e7) {
            throw new IllegalArgumentException(e7.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e7);
        }
    }

    public static /* synthetic */ Path q0(Path path, String str, FileAttribute[] fileAttributeArr, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            str = null;
        }
        return o0(path, str, fileAttributeArr);
    }

    @g1(version = "1.5")
    @n6.e
    @q2(markerClass = {f.class})
    public static final Path q1(@n6.d Path path, @n6.d Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "base");
        try {
            return m.f14782a.a(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path r0(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {f.class})
    public static final Path r1(@n6.d Path path, @n6.d Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "base");
        Path q12 = q1(path, path2);
        return q12 == null ? path : q12;
    }

    @g1(version = "1.5")
    @n6.d
    @q2(markerClass = {f.class})
    public static final Path s0(@n6.e Path path, @n6.e String str, @n6.e String str2, @n6.d FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(fileAttributeArr, "attributes");
        if (path != null) {
            Path createTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            l0.o(createTempFile, "createTempFile(directory…fix, suffix, *attributes)");
            return createTempFile;
        }
        Path createTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempFile2, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile2;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path s1(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(str, "attribute");
        l0.p(linkOptionArr, "options");
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(attribute, "setAttribute(this, attribute, value, *options)");
        return attribute;
    }

    public static /* synthetic */ Path t0(String str, String str2, FileAttribute[] fileAttributeArr, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        l0.p(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path t1(Path path, FileTime fileTime) throws IOException {
        l0.p(path, "<this>");
        l0.p(fileTime, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        l0.o(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    public static /* synthetic */ Path u0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i7, Object obj) throws IOException {
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        return s0(path, str, str2, fileAttributeArr);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path u1(Path path, UserPrincipal userPrincipal) throws IOException {
        l0.p(path, "<this>");
        l0.p(userPrincipal, "value");
        Path owner = Files.setOwner(path, userPrincipal);
        l0.o(owner, "setOwner(this, value)");
        return owner;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final void v0(Path path) throws IOException {
        l0.p(path, "<this>");
        Files.delete(path);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path v1(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        l0.p(path, "<this>");
        l0.p(set, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, set);
        l0.o(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean w0(Path path) throws IOException {
        l0.p(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path w1(URI uri) {
        l0.p(uri, "<this>");
        Path path = Paths.get(uri);
        l0.o(path, "get(this)");
        return path;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path x0(Path path, String str) {
        l0.p(path, "<this>");
        l0.p(str, "other");
        Path resolve = path.resolve(str);
        l0.o(resolve, "this.resolve(other)");
        return resolve;
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final <T> T x1(Path path, String str, t4.l<? super f5.m<? extends Path>, ? extends T> lVar) throws IOException {
        l0.p(path, "<this>");
        l0.p(str, "glob");
        l0.p(lVar, "block");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            l0.o(newDirectoryStream, "it");
            T O = lVar.O(e0.v1(newDirectoryStream));
            i0.d(1);
            n4.c.a(newDirectoryStream, null);
            i0.c(1);
            return O;
        } finally {
        }
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final Path y0(Path path, Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "other");
        Path resolve = path.resolve(path2);
        l0.o(resolve, "this.resolve(other)");
        return resolve;
    }

    public static /* synthetic */ Object y1(Path path, String str, t4.l lVar, int i7, Object obj) throws IOException {
        if ((i7 & 1) != 0) {
            str = "*";
        }
        l0.p(path, "<this>");
        l0.p(str, "glob");
        l0.p(lVar, "block");
        DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            l0.o(newDirectoryStream, "it");
            Object O = lVar.O(e0.v1(newDirectoryStream));
            i0.d(1);
            n4.c.a(newDirectoryStream, null);
            i0.c(1);
            return O;
        } finally {
        }
    }

    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {f.class})
    public static final boolean z0(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @g1(version = "1.7")
    @f
    public static final void z1(@n6.d Path path, int i7, boolean z6, @n6.d t4.l<? super g, m2> lVar) {
        l0.p(path, "<this>");
        l0.p(lVar, "builderAction");
        A1(path, F0(lVar), i7, z6);
    }
}