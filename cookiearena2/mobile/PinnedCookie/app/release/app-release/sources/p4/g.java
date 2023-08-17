package p4;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import v3.g1;
@g1(version = "1.7")
@f
/* loaded from: classes.dex */
public interface g {
    void a(@n6.d t4.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void b(@n6.d t4.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void c(@n6.d t4.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void d(@n6.d t4.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);
}
