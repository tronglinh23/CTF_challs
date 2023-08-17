package p4;

import java.nio.file.Path;
import java.util.Iterator;
import u4.l0;

/* loaded from: classes.dex */
public final class l {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Path f14778a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final Object f14779b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final l f14780c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public Iterator<l> f14781d;

    public l(@n6.d Path path, @n6.e Object obj, @n6.e l lVar) {
        l0.p(path, "path");
        this.f14778a = path;
        this.f14779b = obj;
        this.f14780c = lVar;
    }

    @n6.e
    public final Iterator<l> a() {
        return this.f14781d;
    }

    @n6.e
    public final Object b() {
        return this.f14779b;
    }

    @n6.e
    public final l c() {
        return this.f14780c;
    }

    @n6.d
    public final Path d() {
        return this.f14778a;
    }

    public final void e(@n6.e Iterator<l> it) {
        this.f14781d = it;
    }
}