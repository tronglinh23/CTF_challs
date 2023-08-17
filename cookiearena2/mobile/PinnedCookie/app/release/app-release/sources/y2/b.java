package y2;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.b;
import d.f1;
import u4.l0;
/* loaded from: classes.dex */
public final class b extends a {
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatActivity f18762f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@n6.d androidx.appcompat.app.AppCompatActivity r3, @n6.d y2.d r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            u4.l0.p(r3, r0)
            java.lang.String r0 = "configuration"
            u4.l0.p(r4, r0)
            androidx.appcompat.app.b$b r0 = r3.g()
            if (r0 == 0) goto L1f
            android.content.Context r0 = r0.e()
            java.lang.String r1 = "checkNotNull(activity.dr… }.actionBarThemedContext"
            u4.l0.o(r0, r1)
            r2.<init>(r0, r4)
            r2.f18762f = r3
            return
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Activity "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = " does not have an DrawerToggleDelegate set"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.b.<init>(androidx.appcompat.app.AppCompatActivity, y2.d):void");
    }

    @Override // y2.a
    public void c(@n6.e Drawable drawable, @f1 int i7) {
        androidx.appcompat.app.a f02 = this.f18762f.f0();
        if (f02 == null) {
            throw new IllegalStateException(("Activity " + this.f18762f + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        l0.o(f02, "checkNotNull(activity.su…ortActionBar()\"\n        }");
        f02.Y(drawable != null);
        b.InterfaceC0019b g7 = this.f18762f.g();
        if (g7 != null) {
            l0.o(g7, "checkNotNull(activity.dr…leDelegate set\"\n        }");
            g7.a(drawable, i7);
            return;
        }
        throw new IllegalStateException(("Activity " + this.f18762f + " does not have an DrawerToggleDelegate set").toString());
    }

    @Override // y2.a
    public void d(@n6.e CharSequence charSequence) {
        androidx.appcompat.app.a f02 = this.f18762f.f0();
        if (f02 != null) {
            l0.o(f02, "checkNotNull(activity.su…ortActionBar()\"\n        }");
            f02.A0(charSequence);
            return;
        }
        throw new IllegalStateException(("Activity " + this.f18762f + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
