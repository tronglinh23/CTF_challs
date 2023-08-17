package o2;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.n;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.z;
import androidx.lifecycle.z0;
import d.l0;
import d.o0;
import d.q0;
import g1.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import o2.a;
import p2.c;

/* loaded from: classes.dex */
public class b extends o2.a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f14263c = "LoaderManager";

    /* renamed from: d  reason: collision with root package name */
    public static boolean f14264d = false;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final z f14265a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final c f14266b;

    /* loaded from: classes.dex */
    public static class a<D> extends h0<D> implements c.InterfaceC0206c<D> {

        /* renamed from: m  reason: collision with root package name */
        public final int f14267m;
        @q0

        /* renamed from: n  reason: collision with root package name */
        public final Bundle f14268n;
        @o0

        /* renamed from: o  reason: collision with root package name */
        public final p2.c<D> f14269o;

        /* renamed from: p  reason: collision with root package name */
        public z f14270p;

        /* renamed from: q  reason: collision with root package name */
        public C0198b<D> f14271q;

        /* renamed from: r  reason: collision with root package name */
        public p2.c<D> f14272r;

        public a(int i7, @q0 Bundle bundle, @o0 p2.c<D> cVar, @q0 p2.c<D> cVar2) {
            this.f14267m = i7;
            this.f14268n = bundle;
            this.f14269o = cVar;
            this.f14272r = cVar2;
            cVar.u(i7, this);
        }

        @Override // p2.c.InterfaceC0206c
        public void a(@o0 p2.c<D> cVar, @q0 D d7) {
            if (b.f14264d) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r(d7);
                return;
            }
            if (b.f14264d) {
                Log.w(b.f14263c, "onLoadComplete was incorrectly called on a background thread");
            }
            o(d7);
        }

        @Override // androidx.lifecycle.LiveData
        public void m() {
            if (b.f14264d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            this.f14269o.y();
        }

        @Override // androidx.lifecycle.LiveData
        public void n() {
            if (b.f14264d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            this.f14269o.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void p(@o0 i0<? super D> i0Var) {
            super.p(i0Var);
            this.f14270p = null;
            this.f14271q = null;
        }

        @Override // androidx.lifecycle.h0, androidx.lifecycle.LiveData
        public void r(D d7) {
            super.r(d7);
            p2.c<D> cVar = this.f14272r;
            if (cVar != null) {
                cVar.w();
                this.f14272r = null;
            }
        }

        @l0
        public p2.c<D> s(boolean z6) {
            if (b.f14264d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            this.f14269o.b();
            this.f14269o.a();
            C0198b<D> c0198b = this.f14271q;
            if (c0198b != null) {
                p(c0198b);
                if (z6) {
                    c0198b.d();
                }
            }
            this.f14269o.B(this);
            if ((c0198b == null || c0198b.c()) && !z6) {
                return this.f14269o;
            }
            this.f14269o.w();
            return this.f14272r;
        }

        public void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f14267m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f14268n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f14269o);
            this.f14269o.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f14271q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f14271q);
                this.f14271q.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(u().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f14267m);
            sb.append(" : ");
            i.a(this.f14269o, sb);
            sb.append("}}");
            return sb.toString();
        }

        @o0
        public p2.c<D> u() {
            return this.f14269o;
        }

        public boolean v() {
            C0198b<D> c0198b;
            return (!h() || (c0198b = this.f14271q) == null || c0198b.c()) ? false : true;
        }

        public void w() {
            z zVar = this.f14270p;
            C0198b<D> c0198b = this.f14271q;
            if (zVar == null || c0198b == null) {
                return;
            }
            super.p(c0198b);
            k(zVar, c0198b);
        }

        @l0
        @o0
        public p2.c<D> x(@o0 z zVar, @o0 a.InterfaceC0197a<D> interfaceC0197a) {
            C0198b<D> c0198b = new C0198b<>(this.f14269o, interfaceC0197a);
            k(zVar, c0198b);
            C0198b<D> c0198b2 = this.f14271q;
            if (c0198b2 != null) {
                p(c0198b2);
            }
            this.f14270p = zVar;
            this.f14271q = c0198b;
            return this.f14269o;
        }
    }

    /* renamed from: o2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0198b<D> implements i0<D> {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final p2.c<D> f14273a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final a.InterfaceC0197a<D> f14274b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f14275c = false;

        public C0198b(@o0 p2.c<D> cVar, @o0 a.InterfaceC0197a<D> interfaceC0197a) {
            this.f14273a = cVar;
            this.f14274b = interfaceC0197a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f14275c);
        }

        @Override // androidx.lifecycle.i0
        public void b(@q0 D d7) {
            if (b.f14264d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f14273a);
                sb.append(": ");
                sb.append(this.f14273a.d(d7));
            }
            this.f14274b.a(this.f14273a, d7);
            this.f14275c = true;
        }

        public boolean c() {
            return this.f14275c;
        }

        @l0
        public void d() {
            if (this.f14275c) {
                if (b.f14264d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f14273a);
                }
                this.f14274b.c(this.f14273a);
            }
        }

        public String toString() {
            return this.f14274b.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends z0 {

        /* renamed from: f  reason: collision with root package name */
        public static final c1.b f14276f = new a();

        /* renamed from: d  reason: collision with root package name */
        public n<a> f14277d = new n<>();

        /* renamed from: e  reason: collision with root package name */
        public boolean f14278e = false;

        /* loaded from: classes.dex */
        public static class a implements c1.b {
            @Override // androidx.lifecycle.c1.b
            @o0
            public <T extends z0> T a(@o0 Class<T> cls) {
                return new c();
            }
        }

        @o0
        public static c j(e1 e1Var) {
            return (c) new c1(e1Var, f14276f).a(c.class);
        }

        @Override // androidx.lifecycle.z0
        public void f() {
            super.f();
            int E = this.f14277d.E();
            for (int i7 = 0; i7 < E; i7++) {
                this.f14277d.F(i7).s(true);
            }
            this.f14277d.g();
        }

        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f14277d.E() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i7 = 0; i7 < this.f14277d.E(); i7++) {
                    a F = this.f14277d.F(i7);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f14277d.t(i7));
                    printWriter.print(": ");
                    printWriter.println(F.toString());
                    F.t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void i() {
            this.f14278e = false;
        }

        public <D> a<D> k(int i7) {
            return this.f14277d.o(i7);
        }

        public boolean l() {
            int E = this.f14277d.E();
            for (int i7 = 0; i7 < E; i7++) {
                if (this.f14277d.F(i7).v()) {
                    return true;
                }
            }
            return false;
        }

        public boolean m() {
            return this.f14278e;
        }

        public void n() {
            int E = this.f14277d.E();
            for (int i7 = 0; i7 < E; i7++) {
                this.f14277d.F(i7).w();
            }
        }

        public void o(int i7, @o0 a aVar) {
            this.f14277d.u(i7, aVar);
        }

        public void p(int i7) {
            this.f14277d.x(i7);
        }

        public void q() {
            this.f14278e = true;
        }
    }

    public b(@o0 z zVar, @o0 e1 e1Var) {
        this.f14265a = zVar;
        this.f14266b = c.j(e1Var);
    }

    @Override // o2.a
    @l0
    public void a(int i7) {
        if (this.f14266b.m()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f14264d) {
            StringBuilder sb = new StringBuilder();
            sb.append("destroyLoader in ");
            sb.append(this);
            sb.append(" of ");
            sb.append(i7);
        }
        a k7 = this.f14266b.k(i7);
        if (k7 != null) {
            k7.s(true);
            this.f14266b.p(i7);
        }
    }

    @Override // o2.a
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f14266b.h(str, fileDescriptor, printWriter, strArr);
    }

    @Override // o2.a
    @q0
    public <D> p2.c<D> e(int i7) {
        if (this.f14266b.m()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a<D> k7 = this.f14266b.k(i7);
        if (k7 != null) {
            return k7.u();
        }
        return null;
    }

    @Override // o2.a
    public boolean f() {
        return this.f14266b.l();
    }

    @Override // o2.a
    @l0
    @o0
    public <D> p2.c<D> g(int i7, @q0 Bundle bundle, @o0 a.InterfaceC0197a<D> interfaceC0197a) {
        if (this.f14266b.m()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a<D> k7 = this.f14266b.k(i7);
            if (f14264d) {
                StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
            }
            if (k7 == null) {
                return j(i7, bundle, interfaceC0197a, null);
            }
            if (f14264d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(k7);
            }
            return k7.x(this.f14265a, interfaceC0197a);
        }
        throw new IllegalStateException("initLoader must be called on the main thread");
    }

    @Override // o2.a
    public void h() {
        this.f14266b.n();
    }

    @Override // o2.a
    @l0
    @o0
    public <D> p2.c<D> i(int i7, @q0 Bundle bundle, @o0 a.InterfaceC0197a<D> interfaceC0197a) {
        if (this.f14266b.m()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f14264d) {
                StringBuilder sb = new StringBuilder();
                sb.append("restartLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
            }
            a<D> k7 = this.f14266b.k(i7);
            return j(i7, bundle, interfaceC0197a, k7 != null ? k7.s(false) : null);
        }
        throw new IllegalStateException("restartLoader must be called on the main thread");
    }

    @l0
    @o0
    public final <D> p2.c<D> j(int i7, @q0 Bundle bundle, @o0 a.InterfaceC0197a<D> interfaceC0197a, @q0 p2.c<D> cVar) {
        try {
            this.f14266b.q();
            p2.c<D> b7 = interfaceC0197a.b(i7, bundle);
            if (b7 != null) {
                if (b7.getClass().isMemberClass() && !Modifier.isStatic(b7.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b7);
                }
                a aVar = new a(i7, bundle, b7, cVar);
                if (f14264d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Created new loader ");
                    sb.append(aVar);
                }
                this.f14266b.o(i7, aVar);
                this.f14266b.i();
                return aVar.x(this.f14265a, interfaceC0197a);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f14266b.i();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        i.a(this.f14265a, sb);
        sb.append("}}");
        return sb.toString();
    }
}