package p2;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import d.l0;
import d.o0;
import d.q0;
import g1.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class c<D> {

    /* renamed from: a  reason: collision with root package name */
    public int f14608a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0206c<D> f14609b;

    /* renamed from: c  reason: collision with root package name */
    public b<D> f14610c;

    /* renamed from: d  reason: collision with root package name */
    public Context f14611d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14612e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14613f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14614g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14615h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14616i = false;

    /* loaded from: classes.dex */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            c.this.p();
        }
    }

    /* loaded from: classes.dex */
    public interface b<D> {
        void a(@o0 c<D> cVar);
    }

    /* renamed from: p2.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0206c<D> {
        void a(@o0 c<D> cVar, @q0 D d7);
    }

    public c(@o0 Context context) {
        this.f14611d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z6 = this.f14615h;
        this.f14615h = false;
        this.f14616i |= z6;
        return z6;
    }

    @l0
    public void B(@o0 InterfaceC0206c<D> interfaceC0206c) {
        InterfaceC0206c<D> interfaceC0206c2 = this.f14609b;
        if (interfaceC0206c2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC0206c2 != interfaceC0206c) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f14609b = null;
    }

    @l0
    public void C(@o0 b<D> bVar) {
        b<D> bVar2 = this.f14610c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f14610c = null;
    }

    @l0
    public void a() {
        this.f14613f = true;
        n();
    }

    @l0
    public boolean b() {
        return o();
    }

    public void c() {
        this.f14616i = false;
    }

    @o0
    public String d(@q0 D d7) {
        StringBuilder sb = new StringBuilder(64);
        i.a(d7, sb);
        sb.append("}");
        return sb.toString();
    }

    @l0
    public void e() {
        b<D> bVar = this.f14610c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    @l0
    public void f(@q0 D d7) {
        InterfaceC0206c<D> interfaceC0206c = this.f14609b;
        if (interfaceC0206c != null) {
            interfaceC0206c.a(this, d7);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f14608a);
        printWriter.print(" mListener=");
        printWriter.println(this.f14609b);
        if (this.f14612e || this.f14615h || this.f14616i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f14612e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f14615h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f14616i);
        }
        if (this.f14613f || this.f14614g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f14613f);
            printWriter.print(" mReset=");
            printWriter.println(this.f14614g);
        }
    }

    @l0
    public void h() {
        q();
    }

    @o0
    public Context i() {
        return this.f14611d;
    }

    public int j() {
        return this.f14608a;
    }

    public boolean k() {
        return this.f14613f;
    }

    public boolean l() {
        return this.f14614g;
    }

    public boolean m() {
        return this.f14612e;
    }

    @l0
    public void n() {
    }

    @l0
    public boolean o() {
        return false;
    }

    @l0
    public void p() {
        if (this.f14612e) {
            h();
        } else {
            this.f14615h = true;
        }
    }

    @l0
    public void q() {
    }

    @l0
    public void r() {
    }

    @l0
    public void s() {
    }

    @l0
    public void t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        i.a(this, sb);
        sb.append(" id=");
        sb.append(this.f14608a);
        sb.append("}");
        return sb.toString();
    }

    @l0
    public void u(int i7, @o0 InterfaceC0206c<D> interfaceC0206c) {
        if (this.f14609b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f14609b = interfaceC0206c;
        this.f14608a = i7;
    }

    @l0
    public void v(@o0 b<D> bVar) {
        if (this.f14610c != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f14610c = bVar;
    }

    @l0
    public void w() {
        r();
        this.f14614g = true;
        this.f14612e = false;
        this.f14613f = false;
        this.f14615h = false;
        this.f14616i = false;
    }

    public void x() {
        if (this.f14616i) {
            p();
        }
    }

    @l0
    public final void y() {
        this.f14612e = true;
        this.f14614g = false;
        this.f14613f = false;
        s();
    }

    @l0
    public void z() {
        this.f14612e = false;
        t();
    }
}