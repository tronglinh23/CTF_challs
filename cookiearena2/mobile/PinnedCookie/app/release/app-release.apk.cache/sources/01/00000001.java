package a;

import android.content.Context;
import d.o0;
import d.q0;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Set<d> f2a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public volatile Context f3b;

    public void a(@o0 d dVar) {
        if (this.f3b != null) {
            dVar.a(this.f3b);
        }
        this.f2a.add(dVar);
    }

    public void b() {
        this.f3b = null;
    }

    public void c(@o0 Context context) {
        this.f3b = context;
        Iterator<d> it = this.f2a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    @q0
    public Context d() {
        return this.f3b;
    }

    public void e(@o0 d dVar) {
        this.f2a.remove(dVar);
    }
}