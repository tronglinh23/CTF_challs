package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import d.b1;
import d.o0;
import d.u;
import d.w0;
import g1.s;
import m3.h;
/* loaded from: classes.dex */
public final class RemoteActionCompat implements h {
    @b1({b1.a.LIBRARY_GROUP})
    @o0

    /* renamed from: a  reason: collision with root package name */
    public IconCompat f3488a;
    @b1({b1.a.LIBRARY_GROUP})
    @o0

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f3489b;
    @b1({b1.a.LIBRARY_GROUP})
    @o0

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f3490c;
    @b1({b1.a.LIBRARY_GROUP})
    @o0

    /* renamed from: d  reason: collision with root package name */
    public PendingIntent f3491d;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: e  reason: collision with root package name */
    public boolean f3492e;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: f  reason: collision with root package name */
    public boolean f3493f;

    @w0(26)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @u
        public static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @u
        public static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @u
        public static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @u
        public static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @u
        public static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @u
        public static void g(RemoteAction remoteAction, boolean z6) {
            remoteAction.setEnabled(z6);
        }
    }

    @w0(28)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static void a(RemoteAction remoteAction, boolean z6) {
            remoteAction.setShouldShowIcon(z6);
        }

        @u
        public static boolean b(RemoteAction remoteAction) {
            boolean shouldShowIcon;
            shouldShowIcon = remoteAction.shouldShowIcon();
            return shouldShowIcon;
        }
    }

    public RemoteActionCompat(@o0 IconCompat iconCompat, @o0 CharSequence charSequence, @o0 CharSequence charSequence2, @o0 PendingIntent pendingIntent) {
        this.f3488a = (IconCompat) s.l(iconCompat);
        this.f3489b = (CharSequence) s.l(charSequence);
        this.f3490c = (CharSequence) s.l(charSequence2);
        this.f3491d = (PendingIntent) s.l(pendingIntent);
        this.f3492e = true;
        this.f3493f = true;
    }

    @o0
    @w0(26)
    public static RemoteActionCompat a(@o0 RemoteAction remoteAction) {
        s.l(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.g(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.g(a.f(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.h(b.b(remoteAction));
        }
        return remoteActionCompat;
    }

    @o0
    public PendingIntent b() {
        return this.f3491d;
    }

    @o0
    public CharSequence c() {
        return this.f3490c;
    }

    @o0
    public IconCompat d() {
        return this.f3488a;
    }

    @o0
    public CharSequence e() {
        return this.f3489b;
    }

    public boolean f() {
        return this.f3492e;
    }

    public void g(boolean z6) {
        this.f3492e = z6;
    }

    public void h(boolean z6) {
        this.f3493f = z6;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean i() {
        return this.f3493f;
    }

    @o0
    @w0(26)
    public RemoteAction j() {
        RemoteAction a7 = a.a(this.f3488a.F(), this.f3489b, this.f3490c, this.f3491d);
        a.g(a7, f());
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(a7, i());
        }
        return a7;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@o0 RemoteActionCompat remoteActionCompat) {
        s.l(remoteActionCompat);
        this.f3488a = remoteActionCompat.f3488a;
        this.f3489b = remoteActionCompat.f3489b;
        this.f3490c = remoteActionCompat.f3490c;
        this.f3491d = remoteActionCompat.f3491d;
        this.f3492e = remoteActionCompat.f3492e;
        this.f3493f = remoteActionCompat.f3493f;
    }
}
