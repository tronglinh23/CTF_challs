package p4;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import u4.l0;
@f
/* loaded from: classes.dex */
public final class c implements a {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final c f14753a = new c();

    @Override // p4.a
    @n6.d
    public b a(@n6.d Path path, @n6.d Path path2, boolean z6) {
        l0.p(path, "<this>");
        l0.p(path2, "target");
        LinkOption[] a7 = j.f14770a.a(z6);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a7, a7.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(a7, a7.length);
            l0.o(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
        }
        return b.CONTINUE;
    }
}
