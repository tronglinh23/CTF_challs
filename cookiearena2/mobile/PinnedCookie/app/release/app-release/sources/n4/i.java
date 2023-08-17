package n4;

import java.io.File;
import java.util.List;
import u4.l0;
import x3.e0;
/* loaded from: classes.dex */
public final class i {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final File f13829a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final List<File> f13830b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@n6.d File file, @n6.d List<? extends File> list) {
        l0.p(file, "root");
        l0.p(list, "segments");
        this.f13829a = file;
        this.f13830b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i d(i iVar, File file, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            file = iVar.f13829a;
        }
        if ((i7 & 2) != 0) {
            list = iVar.f13830b;
        }
        return iVar.c(file, list);
    }

    @n6.d
    public final File a() {
        return this.f13829a;
    }

    @n6.d
    public final List<File> b() {
        return this.f13830b;
    }

    @n6.d
    public final i c(@n6.d File file, @n6.d List<? extends File> list) {
        l0.p(file, "root");
        l0.p(list, "segments");
        return new i(file, list);
    }

    @n6.d
    public final File e() {
        return this.f13829a;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return l0.g(this.f13829a, iVar.f13829a) && l0.g(this.f13830b, iVar.f13830b);
        }
        return false;
    }

    @n6.d
    public final String f() {
        String path = this.f13829a.getPath();
        l0.o(path, "root.path");
        return path;
    }

    @n6.d
    public final List<File> g() {
        return this.f13830b;
    }

    public final int h() {
        return this.f13830b.size();
    }

    public int hashCode() {
        return (this.f13829a.hashCode() * 31) + this.f13830b.hashCode();
    }

    public final boolean i() {
        String path = this.f13829a.getPath();
        l0.o(path, "root.path");
        return path.length() > 0;
    }

    @n6.d
    public final File j(int i7, int i8) {
        if (i7 < 0 || i7 > i8 || i8 > h()) {
            throw new IllegalArgumentException();
        }
        List<File> subList = this.f13830b.subList(i7, i8);
        String str = File.separator;
        l0.o(str, "separator");
        return new File(e0.h3(subList, str, null, null, 0, null, null, 62, null));
    }

    @n6.d
    public String toString() {
        return "FilePathComponents(root=" + this.f13829a + ", segments=" + this.f13830b + ')';
    }
}
