package kotlinx.coroutines;

import e4.g;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class z1 extends o0 implements Closeable {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final a f13187m = new a(null);

    @v3.r
    /* loaded from: classes.dex */
    public static final class a extends e4.b<o0, z1> {

        /* renamed from: kotlinx.coroutines.z1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0177a extends u4.n0 implements t4.l<g.b, z1> {

            /* renamed from: l  reason: collision with root package name */
            public static final C0177a f13188l = new C0177a();

            public C0177a() {
                super(1);
            }

            @Override // t4.l
            @n6.e
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public final z1 O(@n6.d g.b bVar) {
                if (bVar instanceof z1) {
                    return (z1) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public a() {
            super(o0.f12924l, C0177a.f13188l);
        }
    }

    @n6.d
    public abstract Executor a1();

    public abstract void close();
}