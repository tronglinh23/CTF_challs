package l;

import d.b1;
import d.o0;
import d.q0;
import java.util.concurrent.Executor;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class c extends f {

    /* renamed from: c  reason: collision with root package name */
    public static volatile c f13190c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public static final Executor f13191d = new Executor() { // from class: l.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.j(runnable);
        }
    };
    @o0

    /* renamed from: e  reason: collision with root package name */
    public static final Executor f13192e = new Executor() { // from class: l.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.k(runnable);
        }
    };
    @o0

    /* renamed from: a  reason: collision with root package name */
    public f f13193a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final f f13194b;

    public c() {
        d dVar = new d();
        this.f13194b = dVar;
        this.f13193a = dVar;
    }

    @o0
    public static Executor g() {
        return f13192e;
    }

    @o0
    public static c h() {
        if (f13190c != null) {
            return f13190c;
        }
        synchronized (c.class) {
            if (f13190c == null) {
                f13190c = new c();
            }
        }
        return f13190c;
    }

    @o0
    public static Executor i() {
        return f13191d;
    }

    public static /* synthetic */ void j(Runnable runnable) {
        h().d(runnable);
    }

    public static /* synthetic */ void k(Runnable runnable) {
        h().a(runnable);
    }

    @Override // l.f
    public void a(@o0 Runnable runnable) {
        this.f13193a.a(runnable);
    }

    @Override // l.f
    public boolean c() {
        return this.f13193a.c();
    }

    @Override // l.f
    public void d(@o0 Runnable runnable) {
        this.f13193a.d(runnable);
    }

    public void l(@q0 f fVar) {
        if (fVar == null) {
            fVar = this.f13194b;
        }
        this.f13193a = fVar;
    }
}
