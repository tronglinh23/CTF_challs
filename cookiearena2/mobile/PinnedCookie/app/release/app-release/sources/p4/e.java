package p4;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f14757a;

    /* renamed from: b  reason: collision with root package name */
    public int f14758b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final List<Exception> f14759c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public Path f14760d;

    public e() {
        this(0, 1, null);
    }

    public final void a(@n6.d Exception exc) {
        l0.p(exc, "exception");
        this.f14758b++;
        if (this.f14759c.size() < this.f14757a) {
            if (this.f14760d != null) {
                Throwable initCause = new FileSystemException(String.valueOf(this.f14760d)).initCause(exc);
                l0.n(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exc = (FileSystemException) initCause;
            }
            this.f14759c.add(exc);
        }
    }

    public final void b(@n6.d Path path) {
        l0.p(path, "name");
        Path path2 = this.f14760d;
        this.f14760d = path2 != null ? path2.resolve(path) : null;
    }

    public final void c(@n6.d Path path) {
        l0.p(path, "name");
        Path path2 = this.f14760d;
        if (!l0.g(path, path2 != null ? path2.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Path path3 = this.f14760d;
        this.f14760d = path3 != null ? path3.getParent() : null;
    }

    @n6.d
    public final List<Exception> d() {
        return this.f14759c;
    }

    @n6.e
    public final Path e() {
        return this.f14760d;
    }

    public final int f() {
        return this.f14758b;
    }

    public final void g(@n6.e Path path) {
        this.f14760d = path;
    }

    public e(int i7) {
        this.f14757a = i7;
        this.f14759c = new ArrayList();
    }

    public /* synthetic */ e(int i7, int i8, w wVar) {
        this((i8 & 1) != 0 ? 64 : i7);
    }
}
