package p4;

import i5.b0;
import i5.e0;
import java.nio.file.Path;
import java.nio.file.Paths;
import u4.l0;
/* loaded from: classes.dex */
public final class m {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final m f14782a = new m();

    /* renamed from: b  reason: collision with root package name */
    public static final Path f14783b = Paths.get("", new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final Path f14784c = Paths.get("..", new String[0]);

    @n6.d
    public final Path a(@n6.d Path path, @n6.d Path path2) {
        l0.p(path, "path");
        l0.p(path2, "base");
        Path normalize = path2.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        for (int i7 = 0; i7 < min; i7++) {
            Path name = normalize.getName(i7);
            Path path3 = f14784c;
            if (!l0.g(name, path3)) {
                break;
            } else if (!l0.g(normalize2.getName(i7), path3)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (l0.g(normalize2, normalize) || !l0.g(normalize, f14783b)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            l0.o(separator, "rn.fileSystem.separator");
            normalize2 = b0.K1(obj, separator, false, 2, null) ? relativize.getFileSystem().getPath(e0.D6(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        l0.o(normalize2, "r");
        return normalize2;
    }
}
