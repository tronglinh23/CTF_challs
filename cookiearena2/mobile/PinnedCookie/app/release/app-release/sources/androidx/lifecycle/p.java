package androidx.lifecycle;

import d.b1;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class p {
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public AtomicReference<Object> f4791a = new AtomicReference<>();

    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        @n6.d
        public static final C0055a Companion = new C0055a(null);

        /* renamed from: androidx.lifecycle.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0055a {

            /* renamed from: androidx.lifecycle.p$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0056a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f4792a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f4792a = iArr;
                }
            }

            public /* synthetic */ C0055a(u4.w wVar) {
                this();
            }

            @s4.m
            @n6.e
            public final a a(@n6.d b bVar) {
                u4.l0.p(bVar, "state");
                int i7 = C0056a.f4792a[bVar.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            return null;
                        }
                        return a.ON_PAUSE;
                    }
                    return a.ON_STOP;
                }
                return a.ON_DESTROY;
            }

            @s4.m
            @n6.e
            public final a b(@n6.d b bVar) {
                u4.l0.p(bVar, "state");
                int i7 = C0056a.f4792a[bVar.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 4) {
                            return null;
                        }
                        return a.ON_DESTROY;
                    }
                    return a.ON_PAUSE;
                }
                return a.ON_STOP;
            }

            @s4.m
            @n6.e
            public final a c(@n6.d b bVar) {
                u4.l0.p(bVar, "state");
                int i7 = C0056a.f4792a[bVar.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 5) {
                            return null;
                        }
                        return a.ON_CREATE;
                    }
                    return a.ON_RESUME;
                }
                return a.ON_START;
            }

            @s4.m
            @n6.e
            public final a d(@n6.d b bVar) {
                u4.l0.p(bVar, "state");
                int i7 = C0056a.f4792a[bVar.ordinal()];
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            return null;
                        }
                        return a.ON_RESUME;
                    }
                    return a.ON_START;
                }
                return a.ON_CREATE;
            }

            public C0055a() {
            }
        }

        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f4793a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f4793a = iArr;
            }
        }

        @s4.m
        @n6.e
        public static final a d(@n6.d b bVar) {
            return Companion.a(bVar);
        }

        @s4.m
        @n6.e
        public static final a e(@n6.d b bVar) {
            return Companion.b(bVar);
        }

        @s4.m
        @n6.e
        public static final a i(@n6.d b bVar) {
            return Companion.c(bVar);
        }

        @s4.m
        @n6.e
        public static final a j(@n6.d b bVar) {
            return Companion.d(bVar);
        }

        @n6.d
        public final b h() {
            switch (b.f4793a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean d(@n6.d b bVar) {
            u4.l0.p(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    @d.l0
    public abstract void a(@n6.d y yVar);

    @d.l0
    @n6.d
    public abstract b b();

    @n6.d
    public final AtomicReference<Object> c() {
        return this.f4791a;
    }

    @d.l0
    public abstract void d(@n6.d y yVar);

    public final void e(@n6.d AtomicReference<Object> atomicReference) {
        u4.l0.p(atomicReference, "<set-?>");
        this.f4791a = atomicReference;
    }
}
