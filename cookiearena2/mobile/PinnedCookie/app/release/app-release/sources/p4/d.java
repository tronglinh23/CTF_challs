package p4;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import u4.l0;
import u4.r1;
@r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: classes.dex */
public final class d extends SimpleFileVisitor<Path> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14754a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public l f14755b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public x3.k<l> f14756c = new x3.k<>();

    public d(boolean z6) {
        this.f14754a = z6;
    }

    public final boolean a() {
        return this.f14754a;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @n6.d
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@n6.d Path path, @n6.d BasicFileAttributes basicFileAttributes) {
        l0.p(path, "dir");
        l0.p(basicFileAttributes, "attrs");
        this.f14756c.add(new l(path, basicFileAttributes.fileKey(), this.f14755b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        l0.o(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    @n6.d
    public final List<l> c(@n6.d l lVar) {
        l0.p(lVar, "directoryNode");
        this.f14755b = lVar;
        Files.walkFileTree(lVar.d(), j.f14770a.b(this.f14754a), 1, this);
        this.f14756c.w();
        x3.k<l> kVar = this.f14756c;
        this.f14756c = new x3.k<>();
        return kVar;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @n6.d
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@n6.d Path path, @n6.d BasicFileAttributes basicFileAttributes) {
        l0.p(path, "file");
        l0.p(basicFileAttributes, "attrs");
        this.f14756c.add(new l(path, null, this.f14755b));
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        l0.o(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }
}
