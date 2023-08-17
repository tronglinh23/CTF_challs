package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.p;
import androidx.lifecycle.z;
import d.l0;
import d.o0;
import d.q0;
import d.s0;
import d.w0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import z0.a;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    @q0

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f525a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<k> f526b;

    /* renamed from: c  reason: collision with root package name */
    public g1.e<Boolean> f527c;

    /* renamed from: d  reason: collision with root package name */
    public OnBackInvokedCallback f528d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f529e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f530f;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements androidx.lifecycle.v, d {

        /* renamed from: k  reason: collision with root package name */
        public final androidx.lifecycle.p f531k;

        /* renamed from: l  reason: collision with root package name */
        public final k f532l;
        @q0

        /* renamed from: m  reason: collision with root package name */
        public d f533m;

        public LifecycleOnBackPressedCancellable(@o0 androidx.lifecycle.p pVar, @o0 k kVar) {
            this.f531k = pVar;
            this.f532l = kVar;
            pVar.a(this);
        }

        @Override // androidx.activity.d
        public void cancel() {
            this.f531k.d(this);
            this.f532l.h(this);
            d dVar = this.f533m;
            if (dVar != null) {
                dVar.cancel();
                this.f533m = null;
            }
        }

        @Override // androidx.lifecycle.v
        public void d(@o0 z zVar, @o0 p.a aVar) {
            if (aVar == p.a.ON_START) {
                this.f533m = OnBackPressedDispatcher.this.d(this.f532l);
            } else if (aVar != p.a.ON_STOP) {
                if (aVar == p.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                d dVar = this.f533m;
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }
    }

    @w0(33)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new r(runnable);
        }

        @d.u
        public static void b(Object obj, int i7, Object obj2) {
            n.a(obj).registerOnBackInvokedCallback(i7, o.a(obj2));
        }

        @d.u
        public static void c(Object obj, Object obj2) {
            n.a(obj).unregisterOnBackInvokedCallback(o.a(obj2));
        }
    }

    /* loaded from: classes.dex */
    public class b implements d {

        /* renamed from: k  reason: collision with root package name */
        public final k f535k;

        public b(k kVar) {
            this.f535k = kVar;
        }

        @Override // androidx.activity.d
        @s0(markerClass = {a.b.class})
        public void cancel() {
            OnBackPressedDispatcher.this.f526b.remove(this.f535k);
            this.f535k.h(this);
            if (z0.a.k()) {
                this.f535k.j(null);
                OnBackPressedDispatcher.this.i();
            }
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Boolean bool) {
        if (z0.a.k()) {
            i();
        }
    }

    @l0
    public void b(@o0 k kVar) {
        d(kVar);
    }

    @l0
    @SuppressLint({"LambdaLast"})
    @s0(markerClass = {a.b.class})
    public void c(@o0 z zVar, @o0 k kVar) {
        androidx.lifecycle.p lifecycle = zVar.getLifecycle();
        if (lifecycle.b() == p.b.DESTROYED) {
            return;
        }
        kVar.d(new LifecycleOnBackPressedCancellable(lifecycle, kVar));
        if (z0.a.k()) {
            i();
            kVar.j(this.f527c);
        }
    }

    @l0
    @o0
    @s0(markerClass = {a.b.class})
    public d d(@o0 k kVar) {
        this.f526b.add(kVar);
        b bVar = new b(kVar);
        kVar.d(bVar);
        if (z0.a.k()) {
            i();
            kVar.j(this.f527c);
        }
        return bVar;
    }

    @l0
    public boolean e() {
        Iterator<k> descendingIterator = this.f526b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().f()) {
                return true;
            }
        }
        return false;
    }

    @l0
    public void g() {
        Iterator<k> descendingIterator = this.f526b.descendingIterator();
        while (descendingIterator.hasNext()) {
            k next = descendingIterator.next();
            if (next.f()) {
                next.e();
                return;
            }
        }
        Runnable runnable = this.f525a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @w0(33)
    public void h(@o0 OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f529e = onBackInvokedDispatcher;
        i();
    }

    @w0(33)
    public void i() {
        boolean e7 = e();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f529e;
        if (onBackInvokedDispatcher != null) {
            if (e7 && !this.f530f) {
                a.b(onBackInvokedDispatcher, 0, this.f528d);
                this.f530f = true;
            } else if (e7 || !this.f530f) {
            } else {
                a.c(onBackInvokedDispatcher, this.f528d);
                this.f530f = false;
            }
        }
    }

    @s0(markerClass = {a.b.class})
    public OnBackPressedDispatcher(@q0 Runnable runnable) {
        this.f526b = new ArrayDeque<>();
        this.f530f = false;
        this.f525a = runnable;
        if (z0.a.k()) {
            this.f527c = new g1.e() { // from class: androidx.activity.l
                @Override // g1.e
                public final void accept(Object obj) {
                    OnBackPressedDispatcher.this.f((Boolean) obj);
                }
            };
            this.f528d = a.a(new Runnable() { // from class: androidx.activity.m
                @Override // java.lang.Runnable
                public final void run() {
                    OnBackPressedDispatcher.this.g();
                }
            });
        }
    }
}
