package p4;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import u4.i0;
import u4.l0;
import u4.r1;
import v3.m2;
@f
/* loaded from: classes.dex */
public final class n implements f5.m<Path> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Path f14785a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final p[] f14786b;

    @r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n98#1:178,15\n*E\n"})
    @h4.f(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class a extends h4.k implements t4.p<f5.o<? super Path>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f14787m;

        /* renamed from: n  reason: collision with root package name */
        public Object f14788n;

        /* renamed from: o  reason: collision with root package name */
        public Object f14789o;

        /* renamed from: p  reason: collision with root package name */
        public Object f14790p;

        /* renamed from: q  reason: collision with root package name */
        public Object f14791q;

        /* renamed from: r  reason: collision with root package name */
        public int f14792r;

        /* renamed from: s  reason: collision with root package name */
        public /* synthetic */ Object f14793s;

        public a(e4.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f14793s = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f2 -> B:11:0x0080). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f4 -> B:11:0x0080). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p4.n.a.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super Path> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    @r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,177:1\n45#2,15:178\n45#2,15:193\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n67#1:178,15\n78#1:193,15\n*E\n"})
    @h4.f(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    /* loaded from: classes.dex */
    public static final class b extends h4.k implements t4.p<f5.o<? super Path>, e4.d<? super m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f14795m;

        /* renamed from: n  reason: collision with root package name */
        public Object f14796n;

        /* renamed from: o  reason: collision with root package name */
        public Object f14797o;

        /* renamed from: p  reason: collision with root package name */
        public Object f14798p;

        /* renamed from: q  reason: collision with root package name */
        public Object f14799q;

        /* renamed from: r  reason: collision with root package name */
        public int f14800r;

        /* renamed from: s  reason: collision with root package name */
        public /* synthetic */ Object f14801s;

        public b(e4.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f14801s = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01cf  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01cd -> B:36:0x0140). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01cf -> B:36:0x0140). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 536
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p4.n.b.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super Path> oVar, @n6.e e4.d<? super m2> dVar) {
            return ((b) H(oVar, dVar)).Q(m2.f17815a);
        }
    }

    public n(@n6.d Path path, @n6.d p[] pVarArr) {
        l0.p(path, "start");
        l0.p(pVarArr, "options");
        this.f14785a = path;
        this.f14786b = pVarArr;
    }

    public final Iterator<Path> g() {
        return f5.q.a(new a(null));
    }

    public final Iterator<Path> h() {
        return f5.q.a(new b(null));
    }

    public final boolean i() {
        return x3.p.T8(this.f14786b, p.FOLLOW_LINKS);
    }

    @Override // f5.m
    @n6.d
    public Iterator<Path> iterator() {
        return l() ? g() : h();
    }

    public final boolean j() {
        return x3.p.T8(this.f14786b, p.INCLUDE_DIRECTORIES);
    }

    public final LinkOption[] k() {
        return j.f14770a.a(i());
    }

    public final boolean l() {
        return x3.p.T8(this.f14786b, p.BREADTH_FIRST);
    }

    public final Object m(f5.o<? super Path> oVar, l lVar, d dVar, t4.l<? super List<l>, m2> lVar2, e4.d<? super m2> dVar2) {
        boolean c7;
        Path d7 = lVar.d();
        LinkOption[] k7 = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(k7, k7.length);
        if (Files.isDirectory(d7, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            c7 = o.c(lVar);
            if (c7) {
                throw new FileSystemLoopException(d7.toString());
            }
            if (j()) {
                i0.e(0);
                oVar.a(d7, dVar2);
                i0.e(1);
            }
            LinkOption[] k8 = k();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(k8, k8.length);
            if (Files.isDirectory(d7, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                lVar2.O(dVar.c(lVar));
            }
        } else if (Files.exists(d7, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            i0.e(0);
            oVar.a(d7, dVar2);
            i0.e(1);
            return m2.f17815a;
        }
        return m2.f17815a;
    }
}
