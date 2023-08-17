package p4;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import u4.l0;
@f
/* loaded from: classes.dex */
public final class h implements g {
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public t4.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f14761a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public t4.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f14762b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public t4.p<? super Path, ? super IOException, ? extends FileVisitResult> f14763c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public t4.p<? super Path, ? super IOException, ? extends FileVisitResult> f14764d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14765e;

    @Override // p4.g
    public void a(@n6.d t4.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        l0.p(pVar, "function");
        f();
        g(this.f14762b, "onVisitFile");
        this.f14762b = pVar;
    }

    @Override // p4.g
    public void b(@n6.d t4.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        l0.p(pVar, "function");
        f();
        g(this.f14764d, "onPostVisitDirectory");
        this.f14764d = pVar;
    }

    @Override // p4.g
    public void c(@n6.d t4.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        l0.p(pVar, "function");
        f();
        g(this.f14761a, "onPreVisitDirectory");
        this.f14761a = pVar;
    }

    @Override // p4.g
    public void d(@n6.d t4.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        l0.p(pVar, "function");
        f();
        g(this.f14763c, "onVisitFileFailed");
        this.f14763c = pVar;
    }

    @n6.d
    public final FileVisitor<Path> e() {
        f();
        this.f14765e = true;
        return new i(this.f14761a, this.f14762b, this.f14763c, this.f14764d);
    }

    public final void f() {
        if (this.f14765e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    public final void g(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }
}
