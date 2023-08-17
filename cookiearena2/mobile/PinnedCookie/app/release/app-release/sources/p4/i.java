package p4;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import u4.l0;
/* loaded from: classes.dex */
public final class i extends SimpleFileVisitor<Path> {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final t4.p<Path, BasicFileAttributes, FileVisitResult> f14766a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final t4.p<Path, BasicFileAttributes, FileVisitResult> f14767b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final t4.p<Path, IOException, FileVisitResult> f14768c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public final t4.p<Path, IOException, FileVisitResult> f14769d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@n6.e t4.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @n6.e t4.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @n6.e t4.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @n6.e t4.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f14766a = pVar;
        this.f14767b = pVar2;
        this.f14768c = pVar3;
        this.f14769d = pVar4;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @n6.d
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public FileVisitResult postVisitDirectory(@n6.d Path path, @n6.e IOException iOException) {
        FileVisitResult J;
        l0.p(path, "dir");
        t4.p<Path, IOException, FileVisitResult> pVar = this.f14769d;
        if (pVar == null || (J = pVar.J(path, iOException)) == null) {
            FileVisitResult postVisitDirectory = super.postVisitDirectory(path, iOException);
            l0.o(postVisitDirectory, "super.postVisitDirectory(dir, exc)");
            return postVisitDirectory;
        }
        return J;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @n6.d
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@n6.d Path path, @n6.d BasicFileAttributes basicFileAttributes) {
        FileVisitResult J;
        l0.p(path, "dir");
        l0.p(basicFileAttributes, "attrs");
        t4.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f14766a;
        if (pVar == null || (J = pVar.J(path, basicFileAttributes)) == null) {
            FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
            l0.o(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
            return preVisitDirectory;
        }
        return J;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @n6.d
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@n6.d Path path, @n6.d BasicFileAttributes basicFileAttributes) {
        FileVisitResult J;
        l0.p(path, "file");
        l0.p(basicFileAttributes, "attrs");
        t4.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f14767b;
        if (pVar == null || (J = pVar.J(path, basicFileAttributes)) == null) {
            FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
            l0.o(visitFile, "super.visitFile(file, attrs)");
            return visitFile;
        }
        return J;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @n6.d
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFileFailed(@n6.d Path path, @n6.d IOException iOException) {
        FileVisitResult J;
        l0.p(path, "file");
        l0.p(iOException, "exc");
        t4.p<Path, IOException, FileVisitResult> pVar = this.f14768c;
        if (pVar == null || (J = pVar.J(path, iOException)) == null) {
            FileVisitResult visitFileFailed = super.visitFileFailed(path, iOException);
            l0.o(visitFileFailed, "super.visitFileFailed(file, exc)");
            return visitFileFailed;
        }
        return J;
    }
}
