package n4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import u4.l0;
import u4.r1;
import v3.j0;
import v3.m2;

/* loaded from: classes.dex */
public final class k implements f5.m<File> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final File f13834a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final l f13835b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final t4.l<File, Boolean> f13836c;
    @n6.e

    /* renamed from: d  reason: collision with root package name */
    public final t4.l<File, m2> f13837d;
    @n6.e

    /* renamed from: e  reason: collision with root package name */
    public final t4.p<File, IOException, m2> f13838e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13839f;

    @r1({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    /* loaded from: classes.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@n6.d File file) {
            super(file);
            l0.p(file, "rootDir");
        }
    }

    /* loaded from: classes.dex */
    public final class b extends x3.b<File> {
        @n6.d

        /* renamed from: m  reason: collision with root package name */
        public final ArrayDeque<c> f13840m;

        /* loaded from: classes.dex */
        public final class a extends a {

            /* renamed from: b  reason: collision with root package name */
            public boolean f13842b;
            @n6.e

            /* renamed from: c  reason: collision with root package name */
            public File[] f13843c;

            /* renamed from: d  reason: collision with root package name */
            public int f13844d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f13845e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ b f13846f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@n6.d b bVar, File file) {
                super(file);
                l0.p(file, "rootDir");
                this.f13846f = bVar;
            }

            @Override // n4.k.c
            @n6.e
            public File b() {
                if (!this.f13845e && this.f13843c == null) {
                    t4.l lVar = k.this.f13836c;
                    boolean z6 = false;
                    if (lVar != null && !((Boolean) lVar.O(a())).booleanValue()) {
                        z6 = true;
                    }
                    if (z6) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f13843c = listFiles;
                    if (listFiles == null) {
                        t4.p pVar = k.this.f13838e;
                        if (pVar != null) {
                            pVar.J(a(), new n4.a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f13845e = true;
                    }
                }
                File[] fileArr = this.f13843c;
                if (fileArr != null) {
                    int i7 = this.f13844d;
                    l0.m(fileArr);
                    if (i7 < fileArr.length) {
                        File[] fileArr2 = this.f13843c;
                        l0.m(fileArr2);
                        int i8 = this.f13844d;
                        this.f13844d = i8 + 1;
                        return fileArr2[i8];
                    }
                }
                if (!this.f13842b) {
                    this.f13842b = true;
                    return a();
                }
                t4.l lVar2 = k.this.f13837d;
                if (lVar2 != null) {
                    lVar2.O(a());
                }
                return null;
            }
        }

        @r1({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: n4.k$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0188b extends c {

            /* renamed from: b  reason: collision with root package name */
            public boolean f13847b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ b f13848c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0188b(@n6.d b bVar, File file) {
                super(file);
                l0.p(file, "rootFile");
                this.f13848c = bVar;
            }

            @Override // n4.k.c
            @n6.e
            public File b() {
                if (this.f13847b) {
                    return null;
                }
                this.f13847b = true;
                return a();
            }
        }

        /* loaded from: classes.dex */
        public final class c extends a {

            /* renamed from: b  reason: collision with root package name */
            public boolean f13849b;
            @n6.e

            /* renamed from: c  reason: collision with root package name */
            public File[] f13850c;

            /* renamed from: d  reason: collision with root package name */
            public int f13851d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ b f13852e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@n6.d b bVar, File file) {
                super(file);
                l0.p(file, "rootDir");
                this.f13852e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
                if (r0.length == 0) goto L33;
             */
            @Override // n4.k.c
            @n6.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f13849b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    n4.k$b r0 = r10.f13852e
                    n4.k r0 = n4.k.this
                    t4.l r0 = n4.k.e(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.O(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f13849b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f13850c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f13851d
                    u4.l0.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    n4.k$b r0 = r10.f13852e
                    n4.k r0 = n4.k.this
                    t4.l r0 = n4.k.g(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.a()
                    r0.O(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f13850c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f13850c = r0
                    if (r0 != 0) goto L7b
                    n4.k$b r0 = r10.f13852e
                    n4.k r0 = n4.k.this
                    t4.p r0 = n4.k.f(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.a()
                    n4.a r9 = new n4.a
                    java.io.File r4 = r10.a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.J(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f13850c
                    if (r0 == 0) goto L85
                    u4.l0.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    n4.k$b r0 = r10.f13852e
                    n4.k r0 = n4.k.this
                    t4.l r0 = n4.k.g(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.a()
                    r0.O(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f13850c
                    u4.l0.m(r0)
                    int r1 = r10.f13851d
                    int r2 = r1 + 1
                    r10.f13851d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: n4.k.b.c.b():java.io.File");
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f13853a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f13853a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f13840m = arrayDeque;
            if (k.this.f13834a.isDirectory()) {
                arrayDeque.push(g(k.this.f13834a));
            } else if (k.this.f13834a.isFile()) {
                arrayDeque.push(new C0188b(this, k.this.f13834a));
            } else {
                b();
            }
        }

        @Override // x3.b
        public void a() {
            File i7 = i();
            if (i7 != null) {
                d(i7);
            } else {
                b();
            }
        }

        public final a g(File file) {
            int i7 = d.f13853a[k.this.f13835b.ordinal()];
            if (i7 != 1) {
                if (i7 == 2) {
                    return new a(this, file);
                }
                throw new j0();
            }
            return new c(this, file);
        }

        public final File i() {
            File b7;
            while (true) {
                c peek = this.f13840m.peek();
                if (peek == null) {
                    return null;
                }
                b7 = peek.b();
                if (b7 == null) {
                    this.f13840m.pop();
                } else if (l0.g(b7, peek.a()) || !b7.isDirectory() || this.f13840m.size() >= k.this.f13839f) {
                    break;
                } else {
                    this.f13840m.push(g(b7));
                }
            }
            return b7;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final File f13854a;

        public c(@n6.d File file) {
            l0.p(file, "root");
            this.f13854a = file;
        }

        @n6.d
        public final File a() {
            return this.f13854a;
        }

        @n6.e
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(File file, l lVar, t4.l<? super File, Boolean> lVar2, t4.l<? super File, m2> lVar3, t4.p<? super File, ? super IOException, m2> pVar, int i7) {
        this.f13834a = file;
        this.f13835b = lVar;
        this.f13836c = lVar2;
        this.f13837d = lVar3;
        this.f13838e = pVar;
        this.f13839f = i7;
    }

    @n6.d
    public final k i(int i7) {
        if (i7 > 0) {
            return new k(this.f13834a, this.f13835b, this.f13836c, this.f13837d, this.f13838e, i7);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i7 + '.');
    }

    @Override // f5.m
    @n6.d
    public Iterator<File> iterator() {
        return new b();
    }

    @n6.d
    public final k j(@n6.d t4.l<? super File, Boolean> lVar) {
        l0.p(lVar, "function");
        return new k(this.f13834a, this.f13835b, lVar, this.f13837d, this.f13838e, this.f13839f);
    }

    @n6.d
    public final k k(@n6.d t4.p<? super File, ? super IOException, m2> pVar) {
        l0.p(pVar, "function");
        return new k(this.f13834a, this.f13835b, this.f13836c, this.f13837d, pVar, this.f13839f);
    }

    @n6.d
    public final k l(@n6.d t4.l<? super File, m2> lVar) {
        l0.p(lVar, "function");
        return new k(this.f13834a, this.f13835b, this.f13836c, lVar, this.f13838e, this.f13839f);
    }

    public /* synthetic */ k(File file, l lVar, t4.l lVar2, t4.l lVar3, t4.p pVar, int i7, int i8, u4.w wVar) {
        this(file, (i8 & 2) != 0 ? l.TOP_DOWN : lVar, lVar2, lVar3, pVar, (i8 & 32) != 0 ? Integer.MAX_VALUE : i7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@n6.d File file, @n6.d l lVar) {
        this(file, lVar, null, null, null, 0, 32, null);
        l0.p(file, "start");
        l0.p(lVar, "direction");
    }

    public /* synthetic */ k(File file, l lVar, int i7, u4.w wVar) {
        this(file, (i7 & 2) != 0 ? l.TOP_DOWN : lVar);
    }
}