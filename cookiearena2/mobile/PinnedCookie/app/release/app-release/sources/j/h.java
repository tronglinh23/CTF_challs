package j;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.a3;
import androidx.core.view.b3;
import androidx.core.view.z2;
import d.b1;
import java.util.ArrayList;
import java.util.Iterator;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f11369c;

    /* renamed from: d  reason: collision with root package name */
    public a3 f11370d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11371e;

    /* renamed from: b  reason: collision with root package name */
    public long f11368b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final b3 f11372f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<z2> f11367a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends b3 {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11373a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f11374b = 0;

        public a() {
        }

        @Override // androidx.core.view.b3, androidx.core.view.a3
        public void b(View view) {
            int i7 = this.f11374b + 1;
            this.f11374b = i7;
            if (i7 == h.this.f11367a.size()) {
                a3 a3Var = h.this.f11370d;
                if (a3Var != null) {
                    a3Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.b3, androidx.core.view.a3
        public void c(View view) {
            if (this.f11373a) {
                return;
            }
            this.f11373a = true;
            a3 a3Var = h.this.f11370d;
            if (a3Var != null) {
                a3Var.c(null);
            }
        }

        public void d() {
            this.f11374b = 0;
            this.f11373a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f11371e) {
            Iterator<z2> it = this.f11367a.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.f11371e = false;
        }
    }

    public void b() {
        this.f11371e = false;
    }

    public h c(z2 z2Var) {
        if (!this.f11371e) {
            this.f11367a.add(z2Var);
        }
        return this;
    }

    public h d(z2 z2Var, z2 z2Var2) {
        this.f11367a.add(z2Var);
        z2Var2.w(z2Var.e());
        this.f11367a.add(z2Var2);
        return this;
    }

    public h e(long j7) {
        if (!this.f11371e) {
            this.f11368b = j7;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f11371e) {
            this.f11369c = interpolator;
        }
        return this;
    }

    public h g(a3 a3Var) {
        if (!this.f11371e) {
            this.f11370d = a3Var;
        }
        return this;
    }

    public void h() {
        if (this.f11371e) {
            return;
        }
        Iterator<z2> it = this.f11367a.iterator();
        while (it.hasNext()) {
            z2 next = it.next();
            long j7 = this.f11368b;
            if (j7 >= 0) {
                next.s(j7);
            }
            Interpolator interpolator = this.f11369c;
            if (interpolator != null) {
                next.t(interpolator);
            }
            if (this.f11370d != null) {
                next.u(this.f11372f);
            }
            next.y();
        }
        this.f11371e = true;
    }
}
