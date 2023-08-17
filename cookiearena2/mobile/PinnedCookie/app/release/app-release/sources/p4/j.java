package p4;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import u4.r1;
import x3.k1;
import x3.l1;
@r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,177:1\n26#2:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/LinkFollowing\n*L\n142#1:178\n*E\n"})
/* loaded from: classes.dex */
public final class j {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final j f14770a = new j();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final LinkOption[] f14771b = {LinkOption.NOFOLLOW_LINKS};
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final LinkOption[] f14772c = new LinkOption[0];
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final Set<FileVisitOption> f14773d = l1.k();
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final Set<FileVisitOption> f14774e = k1.f(FileVisitOption.FOLLOW_LINKS);

    @n6.d
    public final LinkOption[] a(boolean z6) {
        return z6 ? f14772c : f14771b;
    }

    @n6.d
    public final Set<FileVisitOption> b(boolean z6) {
        return z6 ? f14774e : f14773d;
    }
}
