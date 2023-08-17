package o2;

import android.os.Bundle;
import androidx.lifecycle.f1;
import androidx.lifecycle.z;
import d.l0;
import d.o0;
import d.q0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p2.c;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: o2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0197a<D> {
        @l0
        void a(@o0 c<D> cVar, D d7);

        @l0
        @o0
        c<D> b(int i7, @q0 Bundle bundle);

        @l0
        void c(@o0 c<D> cVar);
    }

    public static void c(boolean z6) {
        b.f14264d = z6;
    }

    @o0
    public static <T extends z & f1> a d(@o0 T t6) {
        return new b(t6, t6.getViewModelStore());
    }

    @l0
    public abstract void a(int i7);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @q0
    public abstract <D> c<D> e(int i7);

    public boolean f() {
        return false;
    }

    @l0
    @o0
    public abstract <D> c<D> g(int i7, @q0 Bundle bundle, @o0 InterfaceC0197a<D> interfaceC0197a);

    public abstract void h();

    @l0
    @o0
    public abstract <D> c<D> i(int i7, @q0 Bundle bundle, @o0 InterfaceC0197a<D> interfaceC0197a);
}
