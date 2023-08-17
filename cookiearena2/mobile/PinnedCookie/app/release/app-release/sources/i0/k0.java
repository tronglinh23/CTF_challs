package i0;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import d.b1;
import f0.a;
import i0.x2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class k0 {
    public static final int A = 2;
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static final int A0 = 3;
    @SuppressLint({"ActionValue"})
    public static final String B = "android.title";
    public static final int B0 = 1;
    @SuppressLint({"ActionValue"})
    public static final String C = "android.title.big";
    public static final int C0 = 0;
    @SuppressLint({"ActionValue"})
    public static final String D = "android.text";
    public static final int D0 = -1;
    @SuppressLint({"ActionValue"})
    public static final String E = "android.subText";
    public static final String E0 = "call";
    @SuppressLint({"ActionValue"})
    public static final String F = "android.remoteInputHistory";
    public static final String F0 = "navigation";
    @SuppressLint({"ActionValue"})
    public static final String G = "android.infoText";
    public static final String G0 = "msg";
    @SuppressLint({"ActionValue"})
    public static final String H = "android.summaryText";
    public static final String H0 = "email";
    @SuppressLint({"ActionValue"})
    public static final String I = "android.bigText";
    public static final String I0 = "event";
    @SuppressLint({"ActionValue"})
    public static final String J = "android.icon";
    public static final String J0 = "promo";
    @SuppressLint({"ActionValue"})
    public static final String K = "android.largeIcon";
    public static final String K0 = "alarm";
    @SuppressLint({"ActionValue"})
    public static final String L = "android.largeIcon.big";
    public static final String L0 = "progress";
    @SuppressLint({"ActionValue"})
    public static final String M = "android.progress";
    public static final String M0 = "social";
    @SuppressLint({"ActionValue"})
    public static final String N = "android.progressMax";
    public static final String N0 = "err";
    @SuppressLint({"ActionValue"})
    public static final String O = "android.progressIndeterminate";
    public static final String O0 = "transport";
    @SuppressLint({"ActionValue"})
    public static final String P = "android.showChronometer";
    public static final String P0 = "sys";
    @SuppressLint({"ActionValue"})
    public static final String Q = "android.chronometerCountDown";
    public static final String Q0 = "service";
    @SuppressLint({"ActionValue"})
    public static final String R = "android.colorized";
    public static final String R0 = "reminder";
    @SuppressLint({"ActionValue"})
    public static final String S = "android.showWhen";
    public static final String S0 = "recommendation";
    @SuppressLint({"ActionValue"})
    public static final String T = "android.picture";
    public static final String T0 = "status";
    @SuppressLint({"ActionValue"})
    public static final String U = "android.pictureIcon";
    public static final String U0 = "workout";
    @SuppressLint({"ActionValue"})
    public static final String V = "android.pictureContentDescription";
    public static final String V0 = "location_sharing";
    @SuppressLint({"ActionValue"})
    public static final String W = "android.showBigPictureWhenCollapsed";
    public static final String W0 = "stopwatch";
    @SuppressLint({"ActionValue"})
    public static final String X = "android.textLines";
    public static final String X0 = "missed_call";
    @SuppressLint({"ActionValue"})
    public static final String Y = "android.template";
    public static final int Y0 = 0;
    public static final String Z = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final int Z0 = 1;

    /* renamed from: a  reason: collision with root package name */
    public static final String f10493a = "NotifCompat";
    @SuppressLint({"ActionValue"})
    @Deprecated

    /* renamed from: a0  reason: collision with root package name */
    public static final String f10494a0 = "android.people";

    /* renamed from: a1  reason: collision with root package name */
    public static final int f10495a1 = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: b  reason: collision with root package name */
    public static final String f10496b = "android.intent.category.NOTIFICATION_PREFERENCES";
    @SuppressLint({"ActionValue"})

    /* renamed from: b0  reason: collision with root package name */
    public static final String f10497b0 = "android.people.list";

    /* renamed from: b1  reason: collision with root package name */
    public static final int f10498b1 = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: c  reason: collision with root package name */
    public static final String f10499c = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: c0  reason: collision with root package name */
    public static final String f10500c0 = "android.backgroundImageUri";

    /* renamed from: c1  reason: collision with root package name */
    public static final int f10501c1 = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: d  reason: collision with root package name */
    public static final String f10502d = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: d0  reason: collision with root package name */
    public static final String f10503d0 = "android.mediaSession";

    /* renamed from: d1  reason: collision with root package name */
    public static final int f10504d1 = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: e  reason: collision with root package name */
    public static final String f10505e = "android.intent.extra.NOTIFICATION_TAG";
    @SuppressLint({"ActionValue"})

    /* renamed from: e0  reason: collision with root package name */
    public static final String f10506e0 = "android.compactActions";

    /* renamed from: e1  reason: collision with root package name */
    public static final String f10507e1 = "silent";
    @SuppressLint({"ActionValue"})

    /* renamed from: f  reason: collision with root package name */
    public static final String f10508f = "android.intent.extra.NOTIFICATION_ID";
    @SuppressLint({"ActionValue"})

    /* renamed from: f0  reason: collision with root package name */
    public static final String f10509f0 = "android.selfDisplayName";

    /* renamed from: f1  reason: collision with root package name */
    public static final int f10510f1 = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f10511g = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: g0  reason: collision with root package name */
    public static final String f10512g0 = "android.messagingStyleUser";

    /* renamed from: g1  reason: collision with root package name */
    public static final int f10513g1 = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f10514h = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: h0  reason: collision with root package name */
    public static final String f10515h0 = "android.conversationTitle";

    /* renamed from: h1  reason: collision with root package name */
    public static final int f10516h1 = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f10517i = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: i0  reason: collision with root package name */
    public static final String f10518i0 = "android.messages";

    /* renamed from: j  reason: collision with root package name */
    public static final int f10519j = 4;
    @SuppressLint({"ActionValue"})

    /* renamed from: j0  reason: collision with root package name */
    public static final String f10520j0 = "android.messages.historic";

    /* renamed from: k  reason: collision with root package name */
    public static final int f10521k = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: k0  reason: collision with root package name */
    public static final String f10522k0 = "android.isGroupConversation";

    /* renamed from: l  reason: collision with root package name */
    public static final int f10523l = 1;
    @SuppressLint({"ActionValue"})

    /* renamed from: l0  reason: collision with root package name */
    public static final String f10524l0 = "android.callType";

    /* renamed from: m  reason: collision with root package name */
    public static final int f10525m = 2;
    @SuppressLint({"ActionValue"})

    /* renamed from: m0  reason: collision with root package name */
    public static final String f10526m0 = "android.callIsVideo";

    /* renamed from: n  reason: collision with root package name */
    public static final int f10527n = 4;
    @SuppressLint({"ActionValue"})

    /* renamed from: n0  reason: collision with root package name */
    public static final String f10528n0 = "android.callPerson";

    /* renamed from: o  reason: collision with root package name */
    public static final int f10529o = 8;
    @SuppressLint({"ActionValue"})

    /* renamed from: o0  reason: collision with root package name */
    public static final String f10530o0 = "android.callPersonCompat";

    /* renamed from: p  reason: collision with root package name */
    public static final int f10531p = 16;
    @SuppressLint({"ActionValue"})

    /* renamed from: p0  reason: collision with root package name */
    public static final String f10532p0 = "android.verificationIcon";

    /* renamed from: q  reason: collision with root package name */
    public static final int f10533q = 32;
    @SuppressLint({"ActionValue"})

    /* renamed from: q0  reason: collision with root package name */
    public static final String f10534q0 = "android.verificationIconCompat";

    /* renamed from: r  reason: collision with root package name */
    public static final int f10535r = 64;
    @SuppressLint({"ActionValue"})

    /* renamed from: r0  reason: collision with root package name */
    public static final String f10536r0 = "android.verificationText";
    @Deprecated

    /* renamed from: s  reason: collision with root package name */
    public static final int f10537s = 128;
    @SuppressLint({"ActionValue"})

    /* renamed from: s0  reason: collision with root package name */
    public static final String f10538s0 = "android.answerIntent";

    /* renamed from: t  reason: collision with root package name */
    public static final int f10539t = 256;
    @SuppressLint({"ActionValue"})

    /* renamed from: t0  reason: collision with root package name */
    public static final String f10540t0 = "android.declineIntent";

    /* renamed from: u  reason: collision with root package name */
    public static final int f10541u = 512;
    @SuppressLint({"ActionValue"})

    /* renamed from: u0  reason: collision with root package name */
    public static final String f10542u0 = "android.hangUpIntent";

    /* renamed from: v  reason: collision with root package name */
    public static final int f10543v = 4096;
    @SuppressLint({"ActionValue"})

    /* renamed from: v0  reason: collision with root package name */
    public static final String f10544v0 = "android.answerColor";

    /* renamed from: w  reason: collision with root package name */
    public static final int f10545w = 0;
    @SuppressLint({"ActionValue"})

    /* renamed from: w0  reason: collision with root package name */
    public static final String f10546w0 = "android.declineColor";

    /* renamed from: x  reason: collision with root package name */
    public static final int f10547x = -1;
    @SuppressLint({"ActionValue"})

    /* renamed from: x0  reason: collision with root package name */
    public static final String f10548x0 = "android.hiddenConversationTitle";

    /* renamed from: y  reason: collision with root package name */
    public static final int f10549y = -2;
    @SuppressLint({"ActionValue"})

    /* renamed from: y0  reason: collision with root package name */
    public static final String f10550y0 = "android.audioContents";

    /* renamed from: z  reason: collision with root package name */
    public static final int f10551z = 1;
    @d.l

    /* renamed from: z0  reason: collision with root package name */
    public static final int f10552z0 = 0;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: m  reason: collision with root package name */
        public static final int f10553m = 0;

        /* renamed from: n  reason: collision with root package name */
        public static final int f10554n = 1;

        /* renamed from: o  reason: collision with root package name */
        public static final int f10555o = 2;

        /* renamed from: p  reason: collision with root package name */
        public static final int f10556p = 3;

        /* renamed from: q  reason: collision with root package name */
        public static final int f10557q = 4;

        /* renamed from: r  reason: collision with root package name */
        public static final int f10558r = 5;

        /* renamed from: s  reason: collision with root package name */
        public static final int f10559s = 6;

        /* renamed from: t  reason: collision with root package name */
        public static final int f10560t = 7;

        /* renamed from: u  reason: collision with root package name */
        public static final int f10561u = 8;

        /* renamed from: v  reason: collision with root package name */
        public static final int f10562v = 9;

        /* renamed from: w  reason: collision with root package name */
        public static final int f10563w = 10;

        /* renamed from: x  reason: collision with root package name */
        public static final String f10564x = "android.support.action.showsUserInterface";

        /* renamed from: y  reason: collision with root package name */
        public static final String f10565y = "android.support.action.semanticAction";

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f10566a;
        @d.q0

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f10567b;

        /* renamed from: c  reason: collision with root package name */
        public final q3[] f10568c;

        /* renamed from: d  reason: collision with root package name */
        public final q3[] f10569d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10570e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10571f;

        /* renamed from: g  reason: collision with root package name */
        public final int f10572g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f10573h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f10574i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f10575j;
        @d.q0

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f10576k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f10577l;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final IconCompat f10578a;

            /* renamed from: b  reason: collision with root package name */
            public final CharSequence f10579b;

            /* renamed from: c  reason: collision with root package name */
            public final PendingIntent f10580c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f10581d;

            /* renamed from: e  reason: collision with root package name */
            public final Bundle f10582e;

            /* renamed from: f  reason: collision with root package name */
            public ArrayList<q3> f10583f;

            /* renamed from: g  reason: collision with root package name */
            public int f10584g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f10585h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f10586i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f10587j;

            @d.w0(20)
            /* renamed from: i0.k0$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0125a {
                private C0125a() {
                }

                @d.u
                public static RemoteInput[] a(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            @d.w0(23)
            /* renamed from: i0.k0$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0126b {
                private C0126b() {
                }

                @d.u
                public static Icon a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            @d.w0(24)
            /* loaded from: classes.dex */
            public static class c {
                private c() {
                }

                @d.u
                public static boolean a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            @d.w0(28)
            /* loaded from: classes.dex */
            public static class d {
                private d() {
                }

                @d.u
                public static int a(Notification.Action action) {
                    int semanticAction;
                    semanticAction = action.getSemanticAction();
                    return semanticAction;
                }
            }

            @d.w0(29)
            /* loaded from: classes.dex */
            public static class e {
                private e() {
                }

                @d.u
                public static boolean a(Notification.Action action) {
                    boolean isContextual;
                    isContextual = action.isContextual();
                    return isContextual;
                }
            }

            @d.w0(31)
            /* loaded from: classes.dex */
            public static class f {
                private f() {
                }

                @d.u
                public static boolean a(Notification.Action action) {
                    boolean isAuthenticationRequired;
                    isAuthenticationRequired = action.isAuthenticationRequired();
                    return isAuthenticationRequired;
                }
            }

            public a(@d.q0 IconCompat iconCompat, @d.q0 CharSequence charSequence, @d.q0 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
            @d.o0
            @d.w0(19)
            public static a f(@d.o0 Notification.Action action) {
                a aVar = C0126b.a(action) != null ? new a(IconCompat.h(C0126b.a(action)), action.title, action.actionIntent) : new a(action.icon, action.title, action.actionIntent);
                RemoteInput[] a7 = C0125a.a(action);
                if (a7 != null && a7.length != 0) {
                    for (RemoteInput remoteInput : a7) {
                        aVar.b(q3.e(remoteInput));
                    }
                }
                int i7 = Build.VERSION.SDK_INT;
                aVar.f10581d = c.a(action);
                if (i7 >= 28) {
                    aVar.k(d.a(action));
                }
                if (i7 >= 29) {
                    aVar.j(e.a(action));
                }
                if (i7 >= 31) {
                    aVar.i(f.a(action));
                }
                return aVar;
            }

            @d.o0
            public a a(@d.q0 Bundle bundle) {
                if (bundle != null) {
                    this.f10582e.putAll(bundle);
                }
                return this;
            }

            @d.o0
            public a b(@d.q0 q3 q3Var) {
                if (this.f10583f == null) {
                    this.f10583f = new ArrayList<>();
                }
                if (q3Var != null) {
                    this.f10583f.add(q3Var);
                }
                return this;
            }

            @d.o0
            public b c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<q3> arrayList3 = this.f10583f;
                if (arrayList3 != null) {
                    Iterator<q3> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        q3 next = it.next();
                        if (next.r()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                q3[] q3VarArr = arrayList.isEmpty() ? null : (q3[]) arrayList.toArray(new q3[arrayList.size()]);
                return new b(this.f10578a, this.f10579b, this.f10580c, this.f10582e, arrayList2.isEmpty() ? null : (q3[]) arrayList2.toArray(new q3[arrayList2.size()]), q3VarArr, this.f10581d, this.f10584g, this.f10585h, this.f10586i, this.f10587j);
            }

            public final void d() {
                if (this.f10586i && this.f10580c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @d.o0
            public a e(@d.o0 InterfaceC0127b interfaceC0127b) {
                interfaceC0127b.a(this);
                return this;
            }

            @d.o0
            public Bundle g() {
                return this.f10582e;
            }

            @d.o0
            public a h(boolean z6) {
                this.f10581d = z6;
                return this;
            }

            @d.o0
            public a i(boolean z6) {
                this.f10587j = z6;
                return this;
            }

            @d.o0
            public a j(boolean z6) {
                this.f10586i = z6;
                return this;
            }

            @d.o0
            public a k(int i7) {
                this.f10584g = i7;
                return this;
            }

            @d.o0
            public a l(boolean z6) {
                this.f10585h = z6;
                return this;
            }

            public a(int i7, @d.q0 CharSequence charSequence, @d.q0 PendingIntent pendingIntent) {
                this(i7 != 0 ? IconCompat.r(null, "", i7) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(@d.o0 b bVar) {
                this(bVar.f(), bVar.f10575j, bVar.f10576k, new Bundle(bVar.f10566a), bVar.g(), bVar.b(), bVar.h(), bVar.f10571f, bVar.l(), bVar.k());
            }

            public a(@d.q0 IconCompat iconCompat, @d.q0 CharSequence charSequence, @d.q0 PendingIntent pendingIntent, @d.o0 Bundle bundle, @d.q0 q3[] q3VarArr, boolean z6, int i7, boolean z7, boolean z8, boolean z9) {
                this.f10581d = true;
                this.f10585h = true;
                this.f10578a = iconCompat;
                this.f10579b = n.A(charSequence);
                this.f10580c = pendingIntent;
                this.f10582e = bundle;
                this.f10583f = q3VarArr == null ? null : new ArrayList<>(Arrays.asList(q3VarArr));
                this.f10581d = z6;
                this.f10584g = i7;
                this.f10585h = z7;
                this.f10586i = z8;
                this.f10587j = z9;
            }
        }

        /* renamed from: i0.k0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0127b {
            @d.o0
            a a(@d.o0 a aVar);
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface c {
        }

        public b(int i7, @d.q0 CharSequence charSequence, @d.q0 PendingIntent pendingIntent) {
            this(i7 != 0 ? IconCompat.r(null, "", i7) : null, charSequence, pendingIntent);
        }

        @d.q0
        public PendingIntent a() {
            return this.f10576k;
        }

        public boolean b() {
            return this.f10570e;
        }

        @d.q0
        public q3[] c() {
            return this.f10569d;
        }

        @d.o0
        public Bundle d() {
            return this.f10566a;
        }

        @Deprecated
        public int e() {
            return this.f10574i;
        }

        @d.q0
        public IconCompat f() {
            int i7;
            if (this.f10567b == null && (i7 = this.f10574i) != 0) {
                this.f10567b = IconCompat.r(null, "", i7);
            }
            return this.f10567b;
        }

        @d.q0
        public q3[] g() {
            return this.f10568c;
        }

        public int h() {
            return this.f10572g;
        }

        public boolean i() {
            return this.f10571f;
        }

        @d.q0
        public CharSequence j() {
            return this.f10575j;
        }

        public boolean k() {
            return this.f10577l;
        }

        public boolean l() {
            return this.f10573h;
        }

        /* loaded from: classes.dex */
        public static final class d implements InterfaceC0127b {

            /* renamed from: e  reason: collision with root package name */
            public static final String f10588e = "android.wearable.EXTENSIONS";

            /* renamed from: f  reason: collision with root package name */
            public static final String f10589f = "flags";

            /* renamed from: g  reason: collision with root package name */
            public static final String f10590g = "inProgressLabel";

            /* renamed from: h  reason: collision with root package name */
            public static final String f10591h = "confirmLabel";

            /* renamed from: i  reason: collision with root package name */
            public static final String f10592i = "cancelLabel";

            /* renamed from: j  reason: collision with root package name */
            public static final int f10593j = 1;

            /* renamed from: k  reason: collision with root package name */
            public static final int f10594k = 2;

            /* renamed from: l  reason: collision with root package name */
            public static final int f10595l = 4;

            /* renamed from: m  reason: collision with root package name */
            public static final int f10596m = 1;

            /* renamed from: a  reason: collision with root package name */
            public int f10597a;

            /* renamed from: b  reason: collision with root package name */
            public CharSequence f10598b;

            /* renamed from: c  reason: collision with root package name */
            public CharSequence f10599c;

            /* renamed from: d  reason: collision with root package name */
            public CharSequence f10600d;

            public d() {
                this.f10597a = 1;
            }

            @Override // i0.k0.b.InterfaceC0127b
            @d.o0
            public a a(@d.o0 a aVar) {
                Bundle bundle = new Bundle();
                int i7 = this.f10597a;
                if (i7 != 1) {
                    bundle.putInt("flags", i7);
                }
                CharSequence charSequence = this.f10598b;
                if (charSequence != null) {
                    bundle.putCharSequence(f10590g, charSequence);
                }
                CharSequence charSequence2 = this.f10599c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f10591h, charSequence2);
                }
                CharSequence charSequence3 = this.f10600d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f10592i, charSequence3);
                }
                aVar.g().putBundle("android.wearable.EXTENSIONS", bundle);
                return aVar;
            }

            @d.o0
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public d clone() {
                d dVar = new d();
                dVar.f10597a = this.f10597a;
                dVar.f10598b = this.f10598b;
                dVar.f10599c = this.f10599c;
                dVar.f10600d = this.f10600d;
                return dVar;
            }

            @d.q0
            @Deprecated
            public CharSequence c() {
                return this.f10600d;
            }

            @d.q0
            @Deprecated
            public CharSequence d() {
                return this.f10599c;
            }

            public boolean e() {
                return (this.f10597a & 4) != 0;
            }

            public boolean f() {
                return (this.f10597a & 2) != 0;
            }

            @d.q0
            @Deprecated
            public CharSequence g() {
                return this.f10598b;
            }

            public boolean h() {
                return (this.f10597a & 1) != 0;
            }

            @d.o0
            public d i(boolean z6) {
                l(1, z6);
                return this;
            }

            @d.o0
            @Deprecated
            public d j(@d.q0 CharSequence charSequence) {
                this.f10600d = charSequence;
                return this;
            }

            @d.o0
            @Deprecated
            public d k(@d.q0 CharSequence charSequence) {
                this.f10599c = charSequence;
                return this;
            }

            public final void l(int i7, boolean z6) {
                if (z6) {
                    this.f10597a = i7 | this.f10597a;
                    return;
                }
                this.f10597a = (~i7) & this.f10597a;
            }

            @d.o0
            public d m(boolean z6) {
                l(4, z6);
                return this;
            }

            @d.o0
            public d n(boolean z6) {
                l(2, z6);
                return this;
            }

            @d.o0
            @Deprecated
            public d o(@d.q0 CharSequence charSequence) {
                this.f10598b = charSequence;
                return this;
            }

            public d(@d.o0 b bVar) {
                this.f10597a = 1;
                Bundle bundle = bVar.d().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f10597a = bundle.getInt("flags", 1);
                    this.f10598b = bundle.getCharSequence(f10590g);
                    this.f10599c = bundle.getCharSequence(f10591h);
                    this.f10600d = bundle.getCharSequence(f10592i);
                }
            }
        }

        public b(@d.q0 IconCompat iconCompat, @d.q0 CharSequence charSequence, @d.q0 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (q3[]) null, (q3[]) null, true, 0, true, false, false);
        }

        public b(int i7, @d.q0 CharSequence charSequence, @d.q0 PendingIntent pendingIntent, @d.q0 Bundle bundle, @d.q0 q3[] q3VarArr, @d.q0 q3[] q3VarArr2, boolean z6, int i8, boolean z7, boolean z8, boolean z9) {
            this(i7 != 0 ? IconCompat.r(null, "", i7) : null, charSequence, pendingIntent, bundle, q3VarArr, q3VarArr2, z6, i8, z7, z8, z9);
        }

        public b(@d.q0 IconCompat iconCompat, @d.q0 CharSequence charSequence, @d.q0 PendingIntent pendingIntent, @d.q0 Bundle bundle, @d.q0 q3[] q3VarArr, @d.q0 q3[] q3VarArr2, boolean z6, int i7, boolean z7, boolean z8, boolean z9) {
            this.f10571f = true;
            this.f10567b = iconCompat;
            if (iconCompat != null && iconCompat.w() == 2) {
                this.f10574i = iconCompat.t();
            }
            this.f10575j = n.A(charSequence);
            this.f10576k = pendingIntent;
            this.f10566a = bundle == null ? new Bundle() : bundle;
            this.f10568c = q3VarArr;
            this.f10569d = q3VarArr2;
            this.f10570e = z6;
            this.f10572g = i7;
            this.f10571f = z7;
            this.f10573h = z8;
            this.f10577l = z9;
        }
    }

    @d.w0(20)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static boolean a(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        @d.u
        public static CharSequence[] b(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        @d.u
        public static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        @d.u
        public static Bundle d(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        @d.u
        public static String e(Notification notification) {
            return notification.getGroup();
        }

        @d.u
        public static CharSequence f(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        @d.u
        public static RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        @d.u
        public static String h(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        @d.u
        public static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static Icon a(Notification.Action action) {
            return action.getIcon();
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class f {
        @d.u
        public static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        @d.u
        public static String b(Notification notification) {
            return notification.getChannelId();
        }

        @d.u
        public static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        @d.u
        public static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        @d.u
        public static String e(Notification notification) {
            return notification.getShortcutId();
        }

        @d.u
        public static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class g {
        @d.u
        public static int a(Notification.Action action) {
            int semanticAction;
            semanticAction = action.getSemanticAction();
            return semanticAction;
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class h {
        @d.u
        public static boolean a(Notification notification) {
            boolean allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = notification.getAllowSystemGeneratedContextualActions();
            return allowSystemGeneratedContextualActions;
        }

        @d.u
        public static Notification.BubbleMetadata b(Notification notification) {
            Notification.BubbleMetadata bubbleMetadata;
            bubbleMetadata = notification.getBubbleMetadata();
            return bubbleMetadata;
        }

        @d.u
        public static int c(RemoteInput remoteInput) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = remoteInput.getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        @d.u
        public static LocusId d(Notification notification) {
            LocusId locusId;
            locusId = notification.getLocusId();
            return locusId;
        }

        @d.u
        public static boolean e(Notification.Action action) {
            boolean isContextual;
            isContextual = action.isContextual();
            return isContextual;
        }
    }

    @d.w0(31)
    /* loaded from: classes.dex */
    public static class i {
        @d.u
        public static boolean a(Notification.Action action) {
            boolean isAuthenticationRequired;
            isAuthenticationRequired = action.isAuthenticationRequired();
            return isAuthenticationRequired;
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface j {
    }

    /* loaded from: classes.dex */
    public static class k extends y {

        /* renamed from: j  reason: collision with root package name */
        public static final String f10601j = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* renamed from: e  reason: collision with root package name */
        public IconCompat f10602e;

        /* renamed from: f  reason: collision with root package name */
        public IconCompat f10603f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10604g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f10605h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10606i;

        @d.w0(16)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            @d.u
            public static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            @d.u
            public static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            @d.w0(16)
            public static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @d.w0(16)
            public static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        @d.w0(23)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @d.w0(23)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @d.w0(31)
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            @d.w0(31)
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @d.w0(31)
            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @d.w0(31)
            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z6) {
                bigPictureStyle.showBigPictureWhenCollapsed(z6);
            }
        }

        public k() {
        }

        @d.q0
        public static IconCompat A(@d.q0 Parcelable parcelable) {
            if (parcelable != null) {
                if (parcelable instanceof Icon) {
                    return IconCompat.g((Icon) parcelable);
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.m((Bitmap) parcelable);
                }
                return null;
            }
            return null;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.q0
        public static IconCompat F(@d.q0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(k0.T);
            return parcelable != null ? A(parcelable) : A(bundle.getParcelable(k0.U));
        }

        @d.o0
        public k B(@d.q0 Bitmap bitmap) {
            this.f10603f = bitmap == null ? null : IconCompat.m(bitmap);
            this.f10604g = true;
            return this;
        }

        @d.o0
        @d.w0(23)
        public k C(@d.q0 Icon icon) {
            this.f10603f = icon == null ? null : IconCompat.g(icon);
            this.f10604g = true;
            return this;
        }

        @d.o0
        public k D(@d.q0 Bitmap bitmap) {
            this.f10602e = bitmap == null ? null : IconCompat.m(bitmap);
            return this;
        }

        @d.o0
        @d.w0(31)
        public k E(@d.q0 Icon icon) {
            this.f10602e = IconCompat.g(icon);
            return this;
        }

        @d.o0
        public k G(@d.q0 CharSequence charSequence) {
            this.f10721b = n.A(charSequence);
            return this;
        }

        @d.o0
        @d.w0(31)
        public k H(@d.q0 CharSequence charSequence) {
            this.f10605h = charSequence;
            return this;
        }

        @d.o0
        public k I(@d.q0 CharSequence charSequence) {
            this.f10722c = n.A(charSequence);
            this.f10723d = true;
            return this;
        }

        @d.o0
        @d.w0(31)
        public k J(boolean z6) {
            this.f10606i = z6;
            return this;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(i0.y yVar) {
            int i7 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle c7 = a.c(a.b(yVar.a()), this.f10721b);
            IconCompat iconCompat = this.f10602e;
            if (iconCompat != null) {
                if (i7 >= 31) {
                    c.a(c7, this.f10602e.G(yVar instanceof f2 ? ((f2) yVar).f() : null));
                } else if (iconCompat.w() == 1) {
                    c7 = a.a(c7, this.f10602e.s());
                }
            }
            if (this.f10604g) {
                if (this.f10603f == null) {
                    a.d(c7, null);
                } else {
                    b.a(c7, this.f10603f.G(yVar instanceof f2 ? ((f2) yVar).f() : null));
                }
            }
            if (this.f10723d) {
                a.e(c7, this.f10722c);
            }
            if (i7 >= 31) {
                c.c(c7, this.f10606i);
                c.b(c7, this.f10605h);
            }
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void g(@d.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(k0.L);
            bundle.remove(k0.T);
            bundle.remove(k0.U);
            bundle.remove(k0.W);
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0
        public String t() {
            return f10601j;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void y(@d.o0 Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey(k0.L)) {
                this.f10603f = A(bundle.getParcelable(k0.L));
                this.f10604g = true;
            }
            this.f10602e = F(bundle);
            this.f10606i = bundle.getBoolean(k0.W);
        }

        public k(@d.q0 n nVar) {
            z(nVar);
        }
    }

    /* loaded from: classes.dex */
    public static class l extends y {

        /* renamed from: f  reason: collision with root package name */
        public static final String f10607f = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f10608e;

        @d.w0(16)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            @d.u
            public static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            @d.u
            public static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            @d.u
            public static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        public l() {
        }

        @d.o0
        public l A(@d.q0 CharSequence charSequence) {
            this.f10608e = n.A(charSequence);
            return this;
        }

        @d.o0
        public l B(@d.q0 CharSequence charSequence) {
            this.f10721b = n.A(charSequence);
            return this;
        }

        @d.o0
        public l C(@d.q0 CharSequence charSequence) {
            this.f10722c = n.A(charSequence);
            this.f10723d = true;
            return this;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void a(@d.o0 Bundle bundle) {
            super.a(bundle);
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(i0.y yVar) {
            Notification.BigTextStyle a7 = a.a(a.c(a.b(yVar.a()), this.f10721b), this.f10608e);
            if (this.f10723d) {
                a.d(a7, this.f10722c);
            }
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void g(@d.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(k0.I);
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0
        public String t() {
            return f10607f;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void y(@d.o0 Bundle bundle) {
            super.y(bundle);
            this.f10608e = bundle.getCharSequence(k0.I);
        }

        public l(@d.q0 n nVar) {
            z(nVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class m {

        /* renamed from: h  reason: collision with root package name */
        public static final int f10609h = 1;

        /* renamed from: i  reason: collision with root package name */
        public static final int f10610i = 2;

        /* renamed from: a  reason: collision with root package name */
        public PendingIntent f10611a;

        /* renamed from: b  reason: collision with root package name */
        public PendingIntent f10612b;

        /* renamed from: c  reason: collision with root package name */
        public IconCompat f10613c;

        /* renamed from: d  reason: collision with root package name */
        public int f10614d;
        @d.q

        /* renamed from: e  reason: collision with root package name */
        public int f10615e;

        /* renamed from: f  reason: collision with root package name */
        public int f10616f;

        /* renamed from: g  reason: collision with root package name */
        public String f10617g;

        @d.w0(29)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.q0
            @d.w0(29)
            public static m a(@d.q0 Notification.BubbleMetadata bubbleMetadata) {
                PendingIntent intent;
                PendingIntent intent2;
                Icon icon;
                boolean autoExpandBubble;
                PendingIntent deleteIntent;
                boolean isNotificationSuppressed;
                int desiredHeight;
                int desiredHeightResId;
                int desiredHeightResId2;
                int desiredHeight2;
                if (bubbleMetadata == null) {
                    return null;
                }
                intent = bubbleMetadata.getIntent();
                if (intent == null) {
                    return null;
                }
                intent2 = bubbleMetadata.getIntent();
                icon = bubbleMetadata.getIcon();
                c cVar = new c(intent2, IconCompat.g(icon));
                autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
                c b7 = cVar.b(autoExpandBubble);
                deleteIntent = bubbleMetadata.getDeleteIntent();
                c c7 = b7.c(deleteIntent);
                isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
                c i7 = c7.i(isNotificationSuppressed);
                desiredHeight = bubbleMetadata.getDesiredHeight();
                if (desiredHeight != 0) {
                    desiredHeight2 = bubbleMetadata.getDesiredHeight();
                    i7.d(desiredHeight2);
                }
                desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
                if (desiredHeightResId != 0) {
                    desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
                    i7.e(desiredHeightResId2);
                }
                return i7.a();
            }

            @d.q0
            @d.w0(29)
            public static Notification.BubbleMetadata b(@d.q0 m mVar) {
                Notification.BubbleMetadata.Builder icon;
                Notification.BubbleMetadata.Builder intent;
                Notification.BubbleMetadata.Builder deleteIntent;
                Notification.BubbleMetadata.Builder autoExpandBubble;
                Notification.BubbleMetadata.Builder suppressNotification;
                Notification.BubbleMetadata build;
                if (mVar == null || mVar.g() == null) {
                    return null;
                }
                c1.a();
                icon = b1.a().setIcon(mVar.f().F());
                intent = icon.setIntent(mVar.g());
                deleteIntent = intent.setDeleteIntent(mVar.c());
                autoExpandBubble = deleteIntent.setAutoExpandBubble(mVar.b());
                suppressNotification = autoExpandBubble.setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    suppressNotification.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(mVar.e());
                }
                build = suppressNotification.build();
                return build;
            }
        }

        @d.w0(30)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @d.q0
            @d.w0(30)
            public static m a(@d.q0 Notification.BubbleMetadata bubbleMetadata) {
                String shortcutId;
                c cVar;
                PendingIntent intent;
                Icon icon;
                boolean autoExpandBubble;
                PendingIntent deleteIntent;
                boolean isNotificationSuppressed;
                int desiredHeight;
                int desiredHeightResId;
                int desiredHeightResId2;
                int desiredHeight2;
                String shortcutId2;
                if (bubbleMetadata == null) {
                    return null;
                }
                shortcutId = bubbleMetadata.getShortcutId();
                if (shortcutId != null) {
                    shortcutId2 = bubbleMetadata.getShortcutId();
                    cVar = new c(shortcutId2);
                } else {
                    intent = bubbleMetadata.getIntent();
                    icon = bubbleMetadata.getIcon();
                    cVar = new c(intent, IconCompat.g(icon));
                }
                autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
                c b7 = cVar.b(autoExpandBubble);
                deleteIntent = bubbleMetadata.getDeleteIntent();
                c c7 = b7.c(deleteIntent);
                isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
                c7.i(isNotificationSuppressed);
                desiredHeight = bubbleMetadata.getDesiredHeight();
                if (desiredHeight != 0) {
                    desiredHeight2 = bubbleMetadata.getDesiredHeight();
                    cVar.d(desiredHeight2);
                }
                desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
                if (desiredHeightResId != 0) {
                    desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
                    cVar.e(desiredHeightResId2);
                }
                return cVar.a();
            }

            @d.q0
            @d.w0(30)
            public static Notification.BubbleMetadata b(@d.q0 m mVar) {
                Notification.BubbleMetadata.Builder a7;
                Notification.BubbleMetadata.Builder deleteIntent;
                Notification.BubbleMetadata.Builder autoExpandBubble;
                Notification.BubbleMetadata build;
                if (mVar == null) {
                    return null;
                }
                if (mVar.h() != null) {
                    c1.a();
                    a7 = o1.a(mVar.h());
                } else {
                    c1.a();
                    a7 = n1.a(mVar.g(), mVar.f().F());
                }
                deleteIntent = a7.setDeleteIntent(mVar.c());
                autoExpandBubble = deleteIntent.setAutoExpandBubble(mVar.b());
                autoExpandBubble.setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    a7.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    a7.setDesiredHeightResId(mVar.e());
                }
                build = a7.build();
                return build;
            }
        }

        /* loaded from: classes.dex */
        public static final class c {

            /* renamed from: a  reason: collision with root package name */
            public PendingIntent f10618a;

            /* renamed from: b  reason: collision with root package name */
            public IconCompat f10619b;

            /* renamed from: c  reason: collision with root package name */
            public int f10620c;
            @d.q

            /* renamed from: d  reason: collision with root package name */
            public int f10621d;

            /* renamed from: e  reason: collision with root package name */
            public int f10622e;

            /* renamed from: f  reason: collision with root package name */
            public PendingIntent f10623f;

            /* renamed from: g  reason: collision with root package name */
            public String f10624g;

            @Deprecated
            public c() {
            }

            @SuppressLint({"SyntheticAccessor"})
            @d.o0
            public m a() {
                String str = this.f10624g;
                if (str == null && this.f10618a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f10619b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                m mVar = new m(this.f10618a, this.f10623f, this.f10619b, this.f10620c, this.f10621d, this.f10622e, str);
                mVar.j(this.f10622e);
                return mVar;
            }

            @d.o0
            public c b(boolean z6) {
                f(1, z6);
                return this;
            }

            @d.o0
            public c c(@d.q0 PendingIntent pendingIntent) {
                this.f10623f = pendingIntent;
                return this;
            }

            @d.o0
            public c d(@d.r(unit = 0) int i7) {
                this.f10620c = Math.max(i7, 0);
                this.f10621d = 0;
                return this;
            }

            @d.o0
            public c e(@d.q int i7) {
                this.f10621d = i7;
                this.f10620c = 0;
                return this;
            }

            @d.o0
            public final c f(int i7, boolean z6) {
                if (z6) {
                    this.f10622e = i7 | this.f10622e;
                } else {
                    this.f10622e = (~i7) & this.f10622e;
                }
                return this;
            }

            @d.o0
            public c g(@d.o0 IconCompat iconCompat) {
                if (this.f10624g == null) {
                    if (iconCompat != null) {
                        this.f10619b = iconCompat;
                        return this;
                    }
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @d.o0
            public c h(@d.o0 PendingIntent pendingIntent) {
                if (this.f10624g == null) {
                    if (pendingIntent != null) {
                        this.f10618a = pendingIntent;
                        return this;
                    }
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }

            @d.o0
            public c i(boolean z6) {
                f(2, z6);
                return this;
            }

            @d.w0(30)
            public c(@d.o0 String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.f10624g = str;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public c(@d.o0 PendingIntent pendingIntent, @d.o0 IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f10618a = pendingIntent;
                    this.f10619b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        @d.q0
        public static m a(@d.q0 Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i7 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        @d.q0
        public static Notification.BubbleMetadata k(@d.q0 m mVar) {
            if (mVar == null) {
                return null;
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                return b.b(mVar);
            }
            if (i7 == 29) {
                return a.b(mVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f10616f & 1) != 0;
        }

        @d.q0
        public PendingIntent c() {
            return this.f10612b;
        }

        @d.r(unit = 0)
        public int d() {
            return this.f10614d;
        }

        @d.q
        public int e() {
            return this.f10615e;
        }

        @d.q0
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat f() {
            return this.f10613c;
        }

        @d.q0
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent g() {
            return this.f10611a;
        }

        @d.q0
        public String h() {
            return this.f10617g;
        }

        public boolean i() {
            return (this.f10616f & 2) != 0;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void j(int i7) {
            this.f10616f = i7;
        }

        public m(@d.q0 PendingIntent pendingIntent, @d.q0 PendingIntent pendingIntent2, @d.q0 IconCompat iconCompat, int i7, @d.q int i8, int i9, @d.q0 String str) {
            this.f10611a = pendingIntent;
            this.f10613c = iconCompat;
            this.f10614d = i7;
            this.f10615e = i8;
            this.f10612b = pendingIntent2;
            this.f10616f = i9;
            this.f10617g = str;
        }
    }

    /* loaded from: classes.dex */
    public static class o extends y {

        /* renamed from: o  reason: collision with root package name */
        public static final String f10651o = "androidx.core.app.NotificationCompat$CallStyle";

        /* renamed from: p  reason: collision with root package name */
        public static final int f10652p = 0;

        /* renamed from: q  reason: collision with root package name */
        public static final int f10653q = 1;

        /* renamed from: r  reason: collision with root package name */
        public static final int f10654r = 2;

        /* renamed from: s  reason: collision with root package name */
        public static final int f10655s = 3;

        /* renamed from: t  reason: collision with root package name */
        public static final String f10656t = "key_action_priority";

        /* renamed from: e  reason: collision with root package name */
        public int f10657e;

        /* renamed from: f  reason: collision with root package name */
        public x2 f10658f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f10659g;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f10660h;

        /* renamed from: i  reason: collision with root package name */
        public PendingIntent f10661i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f10662j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f10663k;

        /* renamed from: l  reason: collision with root package name */
        public Integer f10664l;

        /* renamed from: m  reason: collision with root package name */
        public IconCompat f10665m;

        /* renamed from: n  reason: collision with root package name */
        public CharSequence f10666n;

        @d.w0(16)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static void a(Notification.CallStyle callStyle, Notification.Builder builder) {
                callStyle.setBuilder(builder);
            }
        }

        @d.w0(20)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @d.u
            public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
                return builder.addAction(action);
            }

            @d.u
            public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @d.u
            public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @d.u
            public static Notification.Action d(Notification.Action.Builder builder) {
                return builder.build();
            }

            @d.u
            public static Notification.Action.Builder e(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i7, charSequence, pendingIntent);
            }
        }

        @d.w0(21)
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            @d.u
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            @d.u
            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        @d.w0(23)
        /* loaded from: classes.dex */
        public static class d {
            private d() {
            }

            @d.u
            public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            @d.u
            public static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        @d.w0(24)
        /* loaded from: classes.dex */
        public static class e {
            private e() {
            }

            @d.u
            public static Notification.Builder a(Notification.Builder builder) {
                return builder.setActions(new Notification.Action[0]);
            }

            @d.u
            public static Notification.Action.Builder b(Notification.Action.Builder builder, boolean z6) {
                return builder.setAllowGeneratedReplies(z6);
            }
        }

        @d.w0(28)
        /* loaded from: classes.dex */
        public static class f {
            private f() {
            }

            @d.u
            public static Notification.Builder a(Notification.Builder builder, Person person) {
                Notification.Builder addPerson;
                addPerson = builder.addPerson(person);
                return addPerson;
            }
        }

        @d.w0(31)
        /* loaded from: classes.dex */
        public static class g {
            private g() {
            }

            @d.u
            public static Notification.CallStyle a(@d.o0 Person person, @d.o0 PendingIntent pendingIntent, @d.o0 PendingIntent pendingIntent2) {
                Notification.CallStyle forIncomingCall;
                forIncomingCall = Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
                return forIncomingCall;
            }

            @d.u
            public static Notification.CallStyle b(@d.o0 Person person, @d.o0 PendingIntent pendingIntent) {
                Notification.CallStyle forOngoingCall;
                forOngoingCall = Notification.CallStyle.forOngoingCall(person, pendingIntent);
                return forOngoingCall;
            }

            @d.u
            public static Notification.CallStyle c(@d.o0 Person person, @d.o0 PendingIntent pendingIntent, @d.o0 PendingIntent pendingIntent2) {
                Notification.CallStyle forScreeningCall;
                forScreeningCall = Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
                return forScreeningCall;
            }

            @d.u
            public static Notification.CallStyle d(Notification.CallStyle callStyle, @d.l int i7) {
                Notification.CallStyle answerButtonColorHint;
                answerButtonColorHint = callStyle.setAnswerButtonColorHint(i7);
                return answerButtonColorHint;
            }

            @d.u
            public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z6) {
                Notification.Action.Builder authenticationRequired;
                authenticationRequired = builder.setAuthenticationRequired(z6);
                return authenticationRequired;
            }

            @d.u
            public static Notification.CallStyle f(Notification.CallStyle callStyle, @d.l int i7) {
                Notification.CallStyle declineButtonColorHint;
                declineButtonColorHint = callStyle.setDeclineButtonColorHint(i7);
                return declineButtonColorHint;
            }

            @d.u
            public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z6) {
                Notification.CallStyle isVideo;
                isVideo = callStyle.setIsVideo(z6);
                return isVideo;
            }

            @d.u
            public static Notification.CallStyle h(Notification.CallStyle callStyle, @d.q0 Icon icon) {
                Notification.CallStyle verificationIcon;
                verificationIcon = callStyle.setVerificationIcon(icon);
                return verificationIcon;
            }

            @d.u
            public static Notification.CallStyle i(Notification.CallStyle callStyle, @d.q0 CharSequence charSequence) {
                Notification.CallStyle verificationText;
                verificationText = callStyle.setVerificationText(charSequence);
                return verificationText;
            }
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface h {
        }

        public o() {
        }

        @d.o0
        public static o A(@d.o0 x2 x2Var, @d.o0 PendingIntent pendingIntent, @d.o0 PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(1, x2Var, null, pendingIntent, pendingIntent2);
        }

        @d.o0
        public static o B(@d.o0 x2 x2Var, @d.o0 PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new o(2, x2Var, pendingIntent, null, null);
        }

        @d.o0
        public static o C(@d.o0 x2 x2Var, @d.o0 PendingIntent pendingIntent, @d.o0 PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(3, x2Var, pendingIntent, null, pendingIntent2);
        }

        @d.w0(20)
        public static Notification.Action D(b bVar) {
            int i7 = Build.VERSION.SDK_INT;
            IconCompat f7 = bVar.f();
            Notification.Action.Builder a7 = d.a(f7 == null ? null : f7.F(), bVar.j(), bVar.a());
            Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
            bundle.putBoolean(o2.f10766c, bVar.b());
            e.b(a7, bVar.b());
            if (i7 >= 31) {
                g.e(a7, bVar.k());
            }
            b.b(a7, bundle);
            q3[] g7 = bVar.g();
            if (g7 != null) {
                for (RemoteInput remoteInput : q3.d(g7)) {
                    b.c(a7, remoteInput);
                }
            }
            return b.d(a7);
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0
        @d.w0(20)
        public ArrayList<b> E() {
            b J = J();
            b I = I();
            ArrayList<b> arrayList = new ArrayList<>(3);
            arrayList.add(J);
            ArrayList<b> arrayList2 = this.f10720a.f10626b;
            int i7 = 2;
            if (arrayList2 != null) {
                for (b bVar : arrayList2) {
                    if (bVar.l()) {
                        arrayList.add(bVar);
                    } else if (!G(bVar) && i7 > 1) {
                        arrayList.add(bVar);
                        i7--;
                    }
                    if (I != null && i7 == 1) {
                        arrayList.add(I);
                        i7--;
                    }
                }
            }
            if (I != null && i7 >= 1) {
                arrayList.add(I);
            }
            return arrayList;
        }

        @d.q0
        public final String F() {
            int i7 = this.f10657e;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return null;
                    }
                    return this.f10720a.f10625a.getResources().getString(a.h.f9747g);
                }
                return this.f10720a.f10625a.getResources().getString(a.h.f9746f);
            }
            return this.f10720a.f10625a.getResources().getString(a.h.f9745e);
        }

        public final boolean G(b bVar) {
            return bVar != null && bVar.d().getBoolean(f10656t);
        }

        @d.o0
        @d.w0(20)
        public final b H(int i7, int i8, Integer num, int i9, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(k0.d.f(this.f10720a.f10625a, i9));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f10720a.f10625a.getResources().getString(i8));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            b c7 = new b.a(IconCompat.q(this.f10720a.f10625a, i7), spannableStringBuilder, pendingIntent).c();
            c7.d().putBoolean(f10656t, true);
            return c7;
        }

        @d.q0
        @d.w0(20)
        public final b I() {
            int i7 = a.d.f9671c;
            int i8 = a.d.f9669a;
            PendingIntent pendingIntent = this.f10659g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z6 = this.f10662j;
            return H(z6 ? i7 : i8, z6 ? a.h.f9742b : a.h.f9741a, this.f10663k, a.b.f9643c, pendingIntent);
        }

        @d.o0
        @d.w0(20)
        public final b J() {
            int i7 = a.d.f9673e;
            PendingIntent pendingIntent = this.f10660h;
            return pendingIntent == null ? H(i7, a.h.f9744d, this.f10664l, a.b.f9644d, this.f10661i) : H(i7, a.h.f9743c, this.f10664l, a.b.f9644d, pendingIntent);
        }

        @d.o0
        public o K(@d.l int i7) {
            this.f10663k = Integer.valueOf(i7);
            return this;
        }

        @d.o0
        public o L(@d.l int i7) {
            this.f10664l = Integer.valueOf(i7);
            return this;
        }

        @d.o0
        public o M(boolean z6) {
            this.f10662j = z6;
            return this;
        }

        @d.o0
        public o N(@d.q0 Bitmap bitmap) {
            this.f10665m = IconCompat.m(bitmap);
            return this;
        }

        @d.o0
        @d.w0(23)
        public o O(@d.q0 Icon icon) {
            this.f10665m = icon == null ? null : IconCompat.g(icon);
            return this;
        }

        @d.o0
        public o P(@d.q0 CharSequence charSequence) {
            this.f10666n = charSequence;
            return this;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void a(@d.o0 Bundle bundle) {
            super.a(bundle);
            bundle.putInt(k0.f10524l0, this.f10657e);
            bundle.putBoolean(k0.f10526m0, this.f10662j);
            x2 x2Var = this.f10658f;
            if (x2Var != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(k0.f10528n0, x2Var.k());
                } else {
                    bundle.putParcelable(k0.f10530o0, x2Var.m());
                }
            }
            IconCompat iconCompat = this.f10665m;
            if (iconCompat != null) {
                bundle.putParcelable(k0.f10532p0, iconCompat.G(this.f10720a.f10625a));
            }
            bundle.putCharSequence(k0.f10536r0, this.f10666n);
            bundle.putParcelable(k0.f10538s0, this.f10659g);
            bundle.putParcelable(k0.f10540t0, this.f10660h);
            bundle.putParcelable(k0.f10542u0, this.f10661i);
            Integer num = this.f10663k;
            if (num != null) {
                bundle.putInt(k0.f10544v0, num.intValue());
            }
            Integer num2 = this.f10664l;
            if (num2 != null) {
                bundle.putInt(k0.f10546w0, num2.intValue());
            }
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(i0.y yVar) {
            int i7 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r2 = null;
            Notification.CallStyle a7 = null;
            charSequence = null;
            if (i7 < 31) {
                Notification.Builder a8 = yVar.a();
                x2 x2Var = this.f10658f;
                a8.setContentTitle(x2Var != null ? x2Var.f() : null);
                Bundle bundle = this.f10720a.E;
                if (bundle != null && bundle.containsKey(k0.D)) {
                    charSequence = this.f10720a.E.getCharSequence(k0.D);
                }
                if (charSequence == null) {
                    charSequence = F();
                }
                a8.setContentText(charSequence);
                x2 x2Var2 = this.f10658f;
                if (x2Var2 != null) {
                    if (x2Var2.d() != null) {
                        d.b(a8, this.f10658f.d().G(this.f10720a.f10625a));
                    }
                    if (i7 >= 28) {
                        f.a(a8, this.f10658f.k());
                    } else {
                        c.a(a8, this.f10658f.g());
                    }
                }
                ArrayList<b> E = E();
                e.a(a8);
                Iterator<b> it = E.iterator();
                while (it.hasNext()) {
                    b.a(a8, D(it.next()));
                }
                c.b(a8, k0.E0);
                return;
            }
            int i8 = this.f10657e;
            if (i8 == 1) {
                a7 = g.a(this.f10658f.k(), this.f10660h, this.f10659g);
            } else if (i8 == 2) {
                a7 = g.b(this.f10658f.k(), this.f10661i);
            } else if (i8 == 3) {
                a7 = g.c(this.f10658f.k(), this.f10661i, this.f10659g);
            } else if (Log.isLoggable(k0.f10493a, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized call type in CallStyle: ");
                sb.append(String.valueOf(this.f10657e));
            }
            if (a7 != null) {
                e.a(yVar.a());
                a.a(a7, yVar.a());
                Integer num = this.f10663k;
                if (num != null) {
                    g.d(a7, num.intValue());
                }
                Integer num2 = this.f10664l;
                if (num2 != null) {
                    g.f(a7, num2.intValue());
                }
                g.i(a7, this.f10666n);
                IconCompat iconCompat = this.f10665m;
                if (iconCompat != null) {
                    g.h(a7, iconCompat.G(this.f10720a.f10625a));
                }
                g.g(a7, this.f10662j);
            }
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0
        public String t() {
            return f10651o;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void y(@d.o0 Bundle bundle) {
            super.y(bundle);
            this.f10657e = bundle.getInt(k0.f10524l0);
            this.f10662j = bundle.getBoolean(k0.f10526m0);
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey(k0.f10528n0)) {
                this.f10658f = x2.a(j0.a(bundle.getParcelable(k0.f10528n0)));
            } else if (bundle.containsKey(k0.f10530o0)) {
                this.f10658f = x2.b(bundle.getBundle(k0.f10530o0));
            }
            if (bundle.containsKey(k0.f10532p0)) {
                this.f10665m = IconCompat.g((Icon) bundle.getParcelable(k0.f10532p0));
            } else if (bundle.containsKey(k0.f10534q0)) {
                this.f10665m = IconCompat.e(bundle.getBundle(k0.f10534q0));
            }
            this.f10666n = bundle.getCharSequence(k0.f10536r0);
            this.f10659g = (PendingIntent) bundle.getParcelable(k0.f10538s0);
            this.f10660h = (PendingIntent) bundle.getParcelable(k0.f10540t0);
            this.f10661i = (PendingIntent) bundle.getParcelable(k0.f10542u0);
            this.f10663k = bundle.containsKey(k0.f10544v0) ? Integer.valueOf(bundle.getInt(k0.f10544v0)) : null;
            this.f10664l = bundle.containsKey(k0.f10546w0) ? Integer.valueOf(bundle.getInt(k0.f10546w0)) : null;
        }

        public o(@d.q0 n nVar) {
            z(nVar);
        }

        public o(int i7, @d.o0 x2 x2Var, @d.q0 PendingIntent pendingIntent, @d.q0 PendingIntent pendingIntent2, @d.q0 PendingIntent pendingIntent3) {
            if (x2Var != null && !TextUtils.isEmpty(x2Var.f())) {
                this.f10657e = i7;
                this.f10658f = x2Var;
                this.f10659g = pendingIntent3;
                this.f10660h = pendingIntent2;
                this.f10661i = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
    }

    /* loaded from: classes.dex */
    public static class q extends y {

        /* renamed from: e  reason: collision with root package name */
        public static final String f10695e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* renamed from: f  reason: collision with root package name */
        public static final int f10696f = 3;

        @d.w0(15)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static void a(RemoteViews remoteViews, int i7, CharSequence charSequence) {
                remoteViews.setContentDescription(i7, charSequence);
            }
        }

        @d.w0(16)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @d.u
            public static Notification.Builder a(Notification.Builder builder, Object obj) {
                return builder.setStyle((Notification.Style) obj);
            }
        }

        @d.w0(24)
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            @d.u
            public static Notification.DecoratedCustomViewStyle a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        public static List<b> C(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                if (!bVar.l()) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        public final RemoteViews A(RemoteViews remoteViews, boolean z6) {
            int min;
            boolean z7 = true;
            RemoteViews c7 = c(true, a.g.f9737d, false);
            c7.removeAllViews(a.e.L);
            List<b> C = C(this.f10720a.f10626b);
            if (!z6 || C == null || (min = Math.min(C.size(), 3)) <= 0) {
                z7 = false;
            } else {
                for (int i7 = 0; i7 < min; i7++) {
                    c7.addView(a.e.L, B(C.get(i7)));
                }
            }
            int i8 = z7 ? 0 : 8;
            c7.setViewVisibility(a.e.L, i8);
            c7.setViewVisibility(a.e.I, i8);
            e(c7, remoteViews);
            return c7;
        }

        public final RemoteViews B(b bVar) {
            boolean z6 = bVar.f10576k == null;
            RemoteViews remoteViews = new RemoteViews(this.f10720a.f10625a.getPackageName(), z6 ? a.g.f9736c : a.g.f9735b);
            IconCompat f7 = bVar.f();
            if (f7 != null) {
                remoteViews.setImageViewBitmap(a.e.J, o(f7, a.b.f9645e));
            }
            remoteViews.setTextViewText(a.e.K, bVar.f10575j);
            if (!z6) {
                remoteViews.setOnClickPendingIntent(a.e.H, bVar.f10576k);
            }
            a.a(remoteViews, a.e.H, bVar.f10575j);
            return remoteViews;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(i0.y yVar) {
            b.a(yVar.a(), c.a());
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0
        public String t() {
            return f10695e;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(i0.y yVar) {
            return null;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(i0.y yVar) {
            return null;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(i0.y yVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        @d.o0
        n a(@d.o0 n nVar);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface s {
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface v {
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface w {
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface x {
    }

    /* loaded from: classes.dex */
    public static abstract class y {
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: a  reason: collision with root package name */
        public n f10720a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f10721b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f10722c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f10723d = false;

        @d.w0(16)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static void a(RemoteViews remoteViews, int i7, int i8, float f7) {
                remoteViews.setTextViewTextSize(i7, i8, f7);
            }

            @d.u
            public static void b(RemoteViews remoteViews, int i7, int i8, int i9, int i10, int i11) {
                remoteViews.setViewPadding(i7, i8, i9, i10, i11);
            }
        }

        @d.w0(24)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @d.u
            public static void a(RemoteViews remoteViews, int i7, boolean z6) {
                remoteViews.setChronometerCountDown(i7, z6);
            }
        }

        public static float h(float f7, float f8, float f9) {
            return f7 < f8 ? f8 : f7 > f9 ? f9 : f7;
        }

        @d.q0
        public static y i(@d.q0 String str) {
            if (str != null) {
                char c7 = 65535;
                switch (str.hashCode()) {
                    case -716705180:
                        if (str.equals(q.f10695e)) {
                            c7 = 0;
                            break;
                        }
                        break;
                    case -171946061:
                        if (str.equals(k.f10601j)) {
                            c7 = 1;
                            break;
                        }
                        break;
                    case 714386739:
                        if (str.equals(o.f10651o)) {
                            c7 = 2;
                            break;
                        }
                        break;
                    case 912942987:
                        if (str.equals(t.f10697f)) {
                            c7 = 3;
                            break;
                        }
                        break;
                    case 919595044:
                        if (str.equals(l.f10607f)) {
                            c7 = 4;
                            break;
                        }
                        break;
                    case 2090799565:
                        if (str.equals(u.f10699j)) {
                            c7 = 5;
                            break;
                        }
                        break;
                }
                switch (c7) {
                    case 0:
                        return new q();
                    case 1:
                        return new k();
                    case 2:
                        return new o();
                    case 3:
                        return new t();
                    case 4:
                        return new l();
                    case 5:
                        return new u();
                    default:
                        return null;
                }
            }
            return null;
        }

        @d.q0
        public static y j(@d.q0 String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new k();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new l();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new t();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new u();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new q();
            }
            return null;
        }

        @d.q0
        public static y k(@d.o0 Bundle bundle) {
            y i7 = i(bundle.getString(k0.Z));
            return i7 != null ? i7 : (bundle.containsKey(k0.f10509f0) || bundle.containsKey(k0.f10512g0)) ? new u() : (bundle.containsKey(k0.T) || bundle.containsKey(k0.U)) ? new k() : bundle.containsKey(k0.I) ? new l() : bundle.containsKey(k0.X) ? new t() : bundle.containsKey(k0.f10524l0) ? new o() : j(bundle.getString(k0.Y));
        }

        @d.q0
        public static y l(@d.o0 Bundle bundle) {
            y k7 = k(bundle);
            if (k7 == null) {
                return null;
            }
            try {
                k7.y(bundle);
                return k7;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.q0
        public static y s(@d.o0 Notification notification) {
            Bundle n7 = k0.n(notification);
            if (n7 == null) {
                return null;
            }
            return l(n7);
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void a(@d.o0 Bundle bundle) {
            if (this.f10723d) {
                bundle.putCharSequence(k0.H, this.f10722c);
            }
            CharSequence charSequence = this.f10721b;
            if (charSequence != null) {
                bundle.putCharSequence(k0.C, charSequence);
            }
            String t6 = t();
            if (t6 != null) {
                bundle.putString(k0.Z, t6);
            }
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(i0.y yVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x019f  */
        @d.b1({d.b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews c(boolean r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.k0.y.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        @d.q0
        public Notification d() {
            n nVar = this.f10720a;
            if (nVar != null) {
                return nVar.h();
            }
            return null;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            remoteViews.removeAllViews(a.e.Z);
            remoteViews.addView(a.e.Z, remoteViews2.clone());
            remoteViews.setViewVisibility(a.e.Z, 0);
            a.b(remoteViews, a.e.f9688a0, 0, f(), 0, 0);
        }

        public final int f() {
            Resources resources = this.f10720a.f10625a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.c.f9667u);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.f9668v);
            float h7 = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - h7) * dimensionPixelSize) + (h7 * dimensionPixelSize2));
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void g(@d.o0 Bundle bundle) {
            bundle.remove(k0.H);
            bundle.remove(k0.C);
            bundle.remove(k0.Z);
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public Bitmap m(int i7, int i8) {
            return n(i7, i8, 0);
        }

        public final Bitmap n(int i7, int i8, int i9) {
            return p(IconCompat.q(this.f10720a.f10625a, i7), i8, i9);
        }

        public Bitmap o(@d.o0 IconCompat iconCompat, int i7) {
            return p(iconCompat, i7, 0);
        }

        public final Bitmap p(@d.o0 IconCompat iconCompat, int i7, int i8) {
            Drawable z6 = iconCompat.z(this.f10720a.f10625a);
            int intrinsicWidth = i8 == 0 ? z6.getIntrinsicWidth() : i8;
            if (i8 == 0) {
                i8 = z6.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i8, Bitmap.Config.ARGB_8888);
            z6.setBounds(0, 0, intrinsicWidth, i8);
            if (i7 != 0) {
                z6.mutate().setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            }
            z6.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        public final Bitmap q(int i7, int i8, int i9, int i10) {
            int i11 = a.d.f9682n;
            if (i10 == 0) {
                i10 = 0;
            }
            Bitmap n7 = n(i11, i10, i8);
            Canvas canvas = new Canvas(n7);
            Drawable mutate = this.f10720a.f10625a.getResources().getDrawable(i7).mutate();
            mutate.setFilterBitmap(true);
            int i12 = (i8 - i9) / 2;
            int i13 = i9 + i12;
            mutate.setBounds(i12, i12, i13, i13);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n7;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return false;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.q0
        public String t() {
            return null;
        }

        public final void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(a.e.f9726t0, 8);
            remoteViews.setViewVisibility(a.e.f9722r0, 8);
            remoteViews.setViewVisibility(a.e.f9720q0, 8);
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(i0.y yVar) {
            return null;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(i0.y yVar) {
            return null;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(i0.y yVar) {
            return null;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void y(@d.o0 Bundle bundle) {
            if (bundle.containsKey(k0.H)) {
                this.f10722c = bundle.getCharSequence(k0.H);
                this.f10723d = true;
            }
            this.f10721b = bundle.getCharSequence(k0.C);
        }

        public void z(@d.q0 n nVar) {
            if (this.f10720a != nVar) {
                this.f10720a = nVar;
                if (nVar != null) {
                    nVar.z0(this);
                }
            }
        }
    }

    @Deprecated
    public k0() {
    }

    @d.q0
    public static String A(@d.o0 Notification notification) {
        return f.e(notification);
    }

    @d.w0(19)
    public static boolean B(@d.o0 Notification notification) {
        return notification.extras.getBoolean(S);
    }

    @d.q0
    public static String C(@d.o0 Notification notification) {
        return c.i(notification);
    }

    @d.q0
    @d.w0(19)
    public static CharSequence D(@d.o0 Notification notification) {
        return notification.extras.getCharSequence(E);
    }

    public static long E(@d.o0 Notification notification) {
        return f.f(notification);
    }

    @d.w0(19)
    public static boolean F(@d.o0 Notification notification) {
        return notification.extras.getBoolean(P);
    }

    public static int G(@d.o0 Notification notification) {
        return notification.visibility;
    }

    public static boolean H(@d.o0 Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @d.q0
    public static b a(@d.o0 Notification notification, int i7) {
        return b(notification.actions[i7]);
    }

    @d.o0
    @d.w0(20)
    public static b b(@d.o0 Notification.Action action) {
        q3[] q3VarArr;
        int i7;
        RemoteInput[] g7 = c.g(action);
        if (g7 == null) {
            q3VarArr = null;
        } else {
            q3[] q3VarArr2 = new q3[g7.length];
            for (int i8 = 0; i8 < g7.length; i8++) {
                RemoteInput remoteInput = g7[i8];
                q3VarArr2[i8] = new q3(c.h(remoteInput), c.f(remoteInput), c.b(remoteInput), c.a(remoteInput), Build.VERSION.SDK_INT >= 29 ? h.c(remoteInput) : 0, c.d(remoteInput), null);
            }
            q3VarArr = q3VarArr2;
        }
        int i9 = Build.VERSION.SDK_INT;
        boolean z6 = c.c(action).getBoolean(o2.f10766c) || e.a(action);
        boolean z7 = c.c(action).getBoolean(b.f10564x, true);
        int a7 = i9 >= 28 ? g.a(action) : c.c(action).getInt(b.f10565y, 0);
        boolean e7 = i9 >= 29 ? h.e(action) : false;
        boolean a8 = i9 >= 31 ? i.a(action) : false;
        if (d.a(action) != null || (i7 = action.icon) == 0) {
            return new b(d.a(action) != null ? IconCompat.h(d.a(action)) : null, action.title, action.actionIntent, c.c(action), q3VarArr, (q3[]) null, z6, a7, z7, e7, a8);
        }
        return new b(i7, action.title, action.actionIntent, c.c(action), q3VarArr, (q3[]) null, z6, a7, z7, e7, a8);
    }

    public static int c(@d.o0 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(@d.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.a(notification);
        }
        return false;
    }

    public static boolean e(@d.o0 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int f(@d.o0 Notification notification) {
        return f.a(notification);
    }

    @d.q0
    public static m g(@d.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(h.b(notification));
        }
        return null;
    }

    @d.q0
    public static String h(@d.o0 Notification notification) {
        return notification.category;
    }

    @d.q0
    public static String i(@d.o0 Notification notification) {
        return f.b(notification);
    }

    public static int j(@d.o0 Notification notification) {
        return notification.color;
    }

    @d.q0
    @d.w0(19)
    public static CharSequence k(@d.o0 Notification notification) {
        return notification.extras.getCharSequence(G);
    }

    @d.q0
    @d.w0(19)
    public static CharSequence l(@d.o0 Notification notification) {
        return notification.extras.getCharSequence(D);
    }

    @d.q0
    @d.w0(19)
    public static CharSequence m(@d.o0 Notification notification) {
        return notification.extras.getCharSequence(B);
    }

    @d.q0
    public static Bundle n(@d.o0 Notification notification) {
        return notification.extras;
    }

    @d.q0
    public static String o(@d.o0 Notification notification) {
        return c.e(notification);
    }

    public static int p(@d.o0 Notification notification) {
        return f.c(notification);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static boolean q(@d.o0 Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @d.o0
    @d.w0(21)
    public static List<b> r(@d.o0 Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle(p.f10667d);
        if (bundle2 != null && (bundle = bundle2.getBundle(p.f10671h)) != null) {
            for (int i7 = 0; i7 < bundle.size(); i7++) {
                arrayList.add(o2.g(bundle.getBundle(Integer.toString(i7))));
            }
        }
        return arrayList;
    }

    public static boolean s(@d.o0 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @d.q0
    public static k0.o0 t(@d.o0 Notification notification) {
        LocusId d7;
        if (Build.VERSION.SDK_INT < 29 || (d7 = h.d(notification)) == null) {
            return null;
        }
        return k0.o0.d(d7);
    }

    @d.o0
    public static Notification[] u(@d.o0 Bundle bundle, @d.o0 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i7 = 0; i7 < parcelableArray.length; i7++) {
            notificationArr[i7] = (Notification) parcelableArray[i7];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean v(@d.o0 Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean w(@d.o0 Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @d.o0
    public static List<x2> x(@d.o0 Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(f10497b0);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(x2.a(j0.a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(f10494a0);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new x2.c().g(str).a());
                }
            }
        }
        return arrayList;
    }

    @d.q0
    public static Notification y(@d.o0 Notification notification) {
        return notification.publicVersion;
    }

    @d.q0
    public static CharSequence z(@d.o0 Notification notification) {
        return f.d(notification);
    }

    /* loaded from: classes.dex */
    public static final class p implements r {
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: d  reason: collision with root package name */
        public static final String f10667d = "android.car.EXTENSIONS";

        /* renamed from: e  reason: collision with root package name */
        public static final String f10668e = "large_icon";

        /* renamed from: f  reason: collision with root package name */
        public static final String f10669f = "car_conversation";

        /* renamed from: g  reason: collision with root package name */
        public static final String f10670g = "app_color";
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: h  reason: collision with root package name */
        public static final String f10671h = "invisible_actions";

        /* renamed from: i  reason: collision with root package name */
        public static final String f10672i = "author";

        /* renamed from: j  reason: collision with root package name */
        public static final String f10673j = "text";

        /* renamed from: k  reason: collision with root package name */
        public static final String f10674k = "messages";

        /* renamed from: l  reason: collision with root package name */
        public static final String f10675l = "remote_input";

        /* renamed from: m  reason: collision with root package name */
        public static final String f10676m = "on_reply";

        /* renamed from: n  reason: collision with root package name */
        public static final String f10677n = "on_read";

        /* renamed from: o  reason: collision with root package name */
        public static final String f10678o = "participants";

        /* renamed from: p  reason: collision with root package name */
        public static final String f10679p = "timestamp";

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f10680a;

        /* renamed from: b  reason: collision with root package name */
        public c f10681b;

        /* renamed from: c  reason: collision with root package name */
        public int f10682c;

        @d.w0(20)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static RemoteInput.Builder a(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @d.u
            public static RemoteInput b(RemoteInput.Builder builder) {
                return builder.build();
            }

            @d.u
            public static RemoteInput.Builder c(String str) {
                return new RemoteInput.Builder(str);
            }

            @d.u
            public static boolean d(RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            @d.u
            public static CharSequence[] e(RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            @d.u
            public static Bundle f(RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            @d.u
            public static CharSequence g(RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            @d.u
            public static String h(RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            @d.u
            public static RemoteInput.Builder i(RemoteInput.Builder builder, boolean z6) {
                return builder.setAllowFreeFormInput(z6);
            }

            @d.u
            public static RemoteInput.Builder j(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            @d.u
            public static RemoteInput.Builder k(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        @d.w0(29)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @d.u
            public static int a(RemoteInput remoteInput) {
                int editChoicesBeforeSending;
                editChoicesBeforeSending = remoteInput.getEditChoicesBeforeSending();
                return editChoicesBeforeSending;
            }
        }

        @Deprecated
        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public final String[] f10683a;

            /* renamed from: b  reason: collision with root package name */
            public final q3 f10684b;

            /* renamed from: c  reason: collision with root package name */
            public final PendingIntent f10685c;

            /* renamed from: d  reason: collision with root package name */
            public final PendingIntent f10686d;

            /* renamed from: e  reason: collision with root package name */
            public final String[] f10687e;

            /* renamed from: f  reason: collision with root package name */
            public final long f10688f;

            /* loaded from: classes.dex */
            public static class a {

                /* renamed from: a  reason: collision with root package name */
                public final List<String> f10689a = new ArrayList();

                /* renamed from: b  reason: collision with root package name */
                public final String f10690b;

                /* renamed from: c  reason: collision with root package name */
                public q3 f10691c;

                /* renamed from: d  reason: collision with root package name */
                public PendingIntent f10692d;

                /* renamed from: e  reason: collision with root package name */
                public PendingIntent f10693e;

                /* renamed from: f  reason: collision with root package name */
                public long f10694f;

                public a(@d.o0 String str) {
                    this.f10690b = str;
                }

                @d.o0
                public a a(@d.q0 String str) {
                    if (str != null) {
                        this.f10689a.add(str);
                    }
                    return this;
                }

                @d.o0
                public c b() {
                    List<String> list = this.f10689a;
                    return new c((String[]) list.toArray(new String[list.size()]), this.f10691c, this.f10693e, this.f10692d, new String[]{this.f10690b}, this.f10694f);
                }

                @d.o0
                public a c(long j7) {
                    this.f10694f = j7;
                    return this;
                }

                @d.o0
                public a d(@d.q0 PendingIntent pendingIntent) {
                    this.f10692d = pendingIntent;
                    return this;
                }

                @d.o0
                public a e(@d.q0 PendingIntent pendingIntent, @d.q0 q3 q3Var) {
                    this.f10691c = q3Var;
                    this.f10693e = pendingIntent;
                    return this;
                }
            }

            public c(@d.q0 String[] strArr, @d.q0 q3 q3Var, @d.q0 PendingIntent pendingIntent, @d.q0 PendingIntent pendingIntent2, @d.q0 String[] strArr2, long j7) {
                this.f10683a = strArr;
                this.f10684b = q3Var;
                this.f10686d = pendingIntent2;
                this.f10685c = pendingIntent;
                this.f10687e = strArr2;
                this.f10688f = j7;
            }

            public long a() {
                return this.f10688f;
            }

            @d.q0
            public String[] b() {
                return this.f10683a;
            }

            @d.q0
            public String c() {
                String[] strArr = this.f10687e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @d.q0
            public String[] d() {
                return this.f10687e;
            }

            @d.q0
            public PendingIntent e() {
                return this.f10686d;
            }

            @d.q0
            public q3 f() {
                return this.f10684b;
            }

            @d.q0
            public PendingIntent g() {
                return this.f10685c;
            }
        }

        public p() {
            this.f10682c = 0;
        }

        @d.w0(21)
        public static Bundle b(@d.o0 c cVar) {
            Bundle bundle = new Bundle();
            String str = (cVar.d() == null || cVar.d().length <= 1) ? null : cVar.d()[0];
            int length = cVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i7 = 0; i7 < length; i7++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", cVar.b()[i7]);
                bundle2.putString(f10672i, str);
                parcelableArr[i7] = bundle2;
            }
            bundle.putParcelableArray(f10674k, parcelableArr);
            q3 f7 = cVar.f();
            if (f7 != null) {
                RemoteInput.Builder c7 = a.c(f7.o());
                a.k(c7, f7.n());
                a.j(c7, f7.h());
                a.i(c7, f7.f());
                a.a(c7, f7.m());
                bundle.putParcelable(f10675l, a.b(c7));
            }
            bundle.putParcelable(f10676m, cVar.g());
            bundle.putParcelable(f10677n, cVar.e());
            bundle.putStringArray(f10678o, cVar.d());
            bundle.putLong(f10679p, cVar.a());
            return bundle;
        }

        @d.w0(21)
        public static c f(@d.q0 Bundle bundle) {
            String[] strArr;
            boolean z6;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(f10674k);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i7 = 0; i7 < length; i7++) {
                    Parcelable parcelable = parcelableArray[i7];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i7] = string;
                        if (string != null) {
                        }
                    }
                    z6 = false;
                    break;
                }
                z6 = true;
                if (!z6) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f10677n);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(f10676m);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(f10675l);
            String[] stringArray = bundle.getStringArray(f10678o);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new c(strArr, remoteInput != null ? new q3(a.h(remoteInput), a.g(remoteInput), a.e(remoteInput), a.d(remoteInput), Build.VERSION.SDK_INT >= 29 ? b.a(remoteInput) : 0, a.f(remoteInput), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong(f10679p));
        }

        @Override // i0.k0.r
        @d.o0
        public n a(@d.o0 n nVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f10680a;
            if (bitmap != null) {
                bundle.putParcelable(f10668e, bitmap);
            }
            int i7 = this.f10682c;
            if (i7 != 0) {
                bundle.putInt(f10670g, i7);
            }
            c cVar = this.f10681b;
            if (cVar != null) {
                bundle.putBundle(f10669f, b(cVar));
            }
            nVar.t().putBundle(f10667d, bundle);
            return nVar;
        }

        @d.l
        public int c() {
            return this.f10682c;
        }

        @d.q0
        public Bitmap d() {
            return this.f10680a;
        }

        @d.q0
        @Deprecated
        public c e() {
            return this.f10681b;
        }

        @d.o0
        public p g(@d.l int i7) {
            this.f10682c = i7;
            return this;
        }

        @d.o0
        public p h(@d.q0 Bitmap bitmap) {
            this.f10680a = bitmap;
            return this;
        }

        @d.o0
        @Deprecated
        public p i(@d.q0 c cVar) {
            this.f10681b = cVar;
            return this;
        }

        public p(@d.o0 Notification notification) {
            this.f10682c = 0;
            Bundle bundle = k0.n(notification) == null ? null : k0.n(notification).getBundle(f10667d);
            if (bundle != null) {
                this.f10680a = (Bitmap) bundle.getParcelable(f10668e);
                this.f10682c = bundle.getInt(f10670g, 0);
                this.f10681b = f(bundle.getBundle(f10669f));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class t extends y {

        /* renamed from: f  reason: collision with root package name */
        public static final String f10697f = "androidx.core.app.NotificationCompat$InboxStyle";

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<CharSequence> f10698e = new ArrayList<>();

        @d.w0(16)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static Notification.InboxStyle a(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.addLine(charSequence);
            }

            @d.u
            public static Notification.InboxStyle b(Notification.Builder builder) {
                return new Notification.InboxStyle(builder);
            }

            @d.u
            public static Notification.InboxStyle c(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setBigContentTitle(charSequence);
            }

            @d.u
            public static Notification.InboxStyle d(Notification.InboxStyle inboxStyle, CharSequence charSequence) {
                return inboxStyle.setSummaryText(charSequence);
            }
        }

        public t() {
        }

        @d.o0
        public t A(@d.q0 CharSequence charSequence) {
            if (charSequence != null) {
                this.f10698e.add(n.A(charSequence));
            }
            return this;
        }

        @d.o0
        public t B(@d.q0 CharSequence charSequence) {
            this.f10721b = n.A(charSequence);
            return this;
        }

        @d.o0
        public t C(@d.q0 CharSequence charSequence) {
            this.f10722c = n.A(charSequence);
            this.f10723d = true;
            return this;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(i0.y yVar) {
            Notification.InboxStyle c7 = a.c(a.b(yVar.a()), this.f10721b);
            if (this.f10723d) {
                a.d(c7, this.f10722c);
            }
            Iterator<CharSequence> it = this.f10698e.iterator();
            while (it.hasNext()) {
                a.a(c7, it.next());
            }
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void g(@d.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(k0.X);
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0
        public String t() {
            return f10697f;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void y(@d.o0 Bundle bundle) {
            super.y(bundle);
            this.f10698e.clear();
            if (bundle.containsKey(k0.X)) {
                Collections.addAll(this.f10698e, bundle.getCharSequenceArray(k0.X));
            }
        }

        public t(@d.q0 n nVar) {
            z(nVar);
        }
    }

    /* loaded from: classes.dex */
    public static class u extends y {

        /* renamed from: j  reason: collision with root package name */
        public static final String f10699j = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* renamed from: k  reason: collision with root package name */
        public static final int f10700k = 25;

        /* renamed from: e  reason: collision with root package name */
        public final List<e> f10701e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public final List<e> f10702f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public x2 f10703g;
        @d.q0

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f10704h;
        @d.q0

        /* renamed from: i  reason: collision with root package name */
        public Boolean f10705i;

        @d.w0(16)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            @d.u
            public static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            @d.u
            public static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            @d.u
            public static void d(Notification.Style style, Notification.Builder builder) {
                style.setBuilder(builder);
            }
        }

        @d.w0(24)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @d.u
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            @d.u
            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            @d.u
            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        @d.w0(26)
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            @d.u
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        @d.w0(28)
        /* loaded from: classes.dex */
        public static class d {
            private d() {
            }

            @d.u
            public static Notification.MessagingStyle a(Person person) {
                c2.a();
                return b2.a(person);
            }

            @d.u
            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z6) {
                Notification.MessagingStyle groupConversation;
                groupConversation = messagingStyle.setGroupConversation(z6);
                return groupConversation;
            }
        }

        public u() {
        }

        @d.q0
        public static u E(@d.o0 Notification notification) {
            y s6 = y.s(notification);
            if (s6 instanceof u) {
                return (u) s6;
            }
            return null;
        }

        @d.o0
        public u A(@d.q0 e eVar) {
            if (eVar != null) {
                this.f10702f.add(eVar);
                if (this.f10702f.size() > 25) {
                    this.f10702f.remove(0);
                }
            }
            return this;
        }

        @d.o0
        public u B(@d.q0 e eVar) {
            if (eVar != null) {
                this.f10701e.add(eVar);
                if (this.f10701e.size() > 25) {
                    this.f10701e.remove(0);
                }
            }
            return this;
        }

        @d.o0
        public u C(@d.q0 CharSequence charSequence, long j7, @d.q0 x2 x2Var) {
            B(new e(charSequence, j7, x2Var));
            return this;
        }

        @d.o0
        @Deprecated
        public u D(@d.q0 CharSequence charSequence, long j7, @d.q0 CharSequence charSequence2) {
            this.f10701e.add(new e(charSequence, j7, new x2.c().f(charSequence2).a()));
            if (this.f10701e.size() > 25) {
                this.f10701e.remove(0);
            }
            return this;
        }

        @d.q0
        public final e F() {
            for (int size = this.f10701e.size() - 1; size >= 0; size--) {
                e eVar = this.f10701e.get(size);
                if (eVar.g() != null && !TextUtils.isEmpty(eVar.g().f())) {
                    return eVar;
                }
            }
            if (this.f10701e.isEmpty()) {
                return null;
            }
            return this.f10701e.get(r0.size() - 1);
        }

        @d.q0
        public CharSequence G() {
            return this.f10704h;
        }

        @d.o0
        public List<e> H() {
            return this.f10702f;
        }

        @d.o0
        public List<e> I() {
            return this.f10701e;
        }

        @d.o0
        public x2 J() {
            return this.f10703g;
        }

        @d.q0
        @Deprecated
        public CharSequence K() {
            return this.f10703g.f();
        }

        public final boolean L() {
            for (int size = this.f10701e.size() - 1; size >= 0; size--) {
                e eVar = this.f10701e.get(size);
                if (eVar.g() != null && eVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        public boolean M() {
            n nVar = this.f10720a;
            if (nVar != null && nVar.f10625a.getApplicationInfo().targetSdkVersion < 28 && this.f10705i == null) {
                return this.f10704h != null;
            }
            Boolean bool = this.f10705i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @d.o0
        public final TextAppearanceSpan N(int i7) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i7), null);
        }

        public final CharSequence O(@d.o0 e eVar) {
            d1.a c7 = d1.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence f7 = eVar.g() == null ? "" : eVar.g().f();
            boolean isEmpty = TextUtils.isEmpty(f7);
            int i7 = androidx.core.view.u1.f3816t;
            if (isEmpty) {
                f7 = this.f10703g.f();
                if (this.f10720a.r() != 0) {
                    i7 = this.f10720a.r();
                }
            }
            CharSequence m7 = c7.m(f7);
            spannableStringBuilder.append(m7);
            spannableStringBuilder.setSpan(N(i7), spannableStringBuilder.length() - m7.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(c7.m(eVar.i() != null ? eVar.i() : ""));
            return spannableStringBuilder;
        }

        @d.o0
        public u P(@d.q0 CharSequence charSequence) {
            this.f10704h = charSequence;
            return this;
        }

        @d.o0
        public u Q(boolean z6) {
            this.f10705i = Boolean.valueOf(z6);
            return this;
        }

        @Override // i0.k0.y
        public void a(@d.o0 Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence(k0.f10509f0, this.f10703g.f());
            bundle.putBundle(k0.f10512g0, this.f10703g.m());
            bundle.putCharSequence(k0.f10548x0, this.f10704h);
            if (this.f10704h != null && this.f10705i.booleanValue()) {
                bundle.putCharSequence(k0.f10515h0, this.f10704h);
            }
            if (!this.f10701e.isEmpty()) {
                bundle.putParcelableArray(k0.f10518i0, e.a(this.f10701e));
            }
            if (!this.f10702f.isEmpty()) {
                bundle.putParcelableArray(k0.f10520j0, e.a(this.f10702f));
            }
            Boolean bool = this.f10705i;
            if (bool != null) {
                bundle.putBoolean(k0.f10522k0, bool.booleanValue());
            }
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(i0.y yVar) {
            Q(M());
            Notification.MessagingStyle a7 = Build.VERSION.SDK_INT >= 28 ? d.a(this.f10703g.k()) : b.b(this.f10703g.f());
            Iterator<e> it = this.f10701e.iterator();
            while (it.hasNext()) {
                b.a(a7, it.next().l());
            }
            Iterator<e> it2 = this.f10702f.iterator();
            while (it2.hasNext()) {
                c.a(a7, it2.next().l());
            }
            if (this.f10705i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                b.c(a7, this.f10704h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                d.b(a7, this.f10705i.booleanValue());
            }
            a.d(a7, yVar.a());
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void g(@d.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove(k0.f10512g0);
            bundle.remove(k0.f10509f0);
            bundle.remove(k0.f10515h0);
            bundle.remove(k0.f10548x0);
            bundle.remove(k0.f10518i0);
            bundle.remove(k0.f10520j0);
            bundle.remove(k0.f10522k0);
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0
        public String t() {
            return f10699j;
        }

        @Override // i0.k0.y
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void y(@d.o0 Bundle bundle) {
            super.y(bundle);
            this.f10701e.clear();
            if (bundle.containsKey(k0.f10512g0)) {
                this.f10703g = x2.b(bundle.getBundle(k0.f10512g0));
            } else {
                this.f10703g = new x2.c().f(bundle.getString(k0.f10509f0)).a();
            }
            CharSequence charSequence = bundle.getCharSequence(k0.f10515h0);
            this.f10704h = charSequence;
            if (charSequence == null) {
                this.f10704h = bundle.getCharSequence(k0.f10548x0);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(k0.f10518i0);
            if (parcelableArray != null) {
                this.f10701e.addAll(e.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(k0.f10520j0);
            if (parcelableArray2 != null) {
                this.f10702f.addAll(e.f(parcelableArray2));
            }
            if (bundle.containsKey(k0.f10522k0)) {
                this.f10705i = Boolean.valueOf(bundle.getBoolean(k0.f10522k0));
            }
        }

        @Deprecated
        public u(@d.o0 CharSequence charSequence) {
            this.f10703g = new x2.c().f(charSequence).a();
        }

        /* loaded from: classes.dex */
        public static final class e {

            /* renamed from: g  reason: collision with root package name */
            public static final String f10706g = "text";

            /* renamed from: h  reason: collision with root package name */
            public static final String f10707h = "time";

            /* renamed from: i  reason: collision with root package name */
            public static final String f10708i = "sender";

            /* renamed from: j  reason: collision with root package name */
            public static final String f10709j = "type";

            /* renamed from: k  reason: collision with root package name */
            public static final String f10710k = "uri";

            /* renamed from: l  reason: collision with root package name */
            public static final String f10711l = "extras";

            /* renamed from: m  reason: collision with root package name */
            public static final String f10712m = "person";

            /* renamed from: n  reason: collision with root package name */
            public static final String f10713n = "sender_person";

            /* renamed from: a  reason: collision with root package name */
            public final CharSequence f10714a;

            /* renamed from: b  reason: collision with root package name */
            public final long f10715b;
            @d.q0

            /* renamed from: c  reason: collision with root package name */
            public final x2 f10716c;

            /* renamed from: d  reason: collision with root package name */
            public Bundle f10717d;
            @d.q0

            /* renamed from: e  reason: collision with root package name */
            public String f10718e;
            @d.q0

            /* renamed from: f  reason: collision with root package name */
            public Uri f10719f;

            @d.w0(24)
            /* loaded from: classes.dex */
            public static class a {
                private a() {
                }

                @d.u
                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j7, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j7, charSequence2);
                }

                @d.u
                public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            @d.w0(28)
            /* loaded from: classes.dex */
            public static class b {
                private b() {
                }

                @d.u
                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j7, Person person) {
                    e2.a();
                    return d2.a(charSequence, j7, person);
                }
            }

            public e(@d.q0 CharSequence charSequence, long j7, @d.q0 x2 x2Var) {
                this.f10717d = new Bundle();
                this.f10714a = charSequence;
                this.f10715b = j7;
                this.f10716c = x2Var;
            }

            @d.o0
            public static Bundle[] a(@d.o0 List<e> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    bundleArr[i7] = list.get(i7).m();
                }
                return bundleArr;
            }

            @d.q0
            public static e e(@d.o0 Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        e eVar = new e(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey(f10712m) ? x2.b(bundle.getBundle(f10712m)) : (!bundle.containsKey(f10713n) || Build.VERSION.SDK_INT < 28) ? bundle.containsKey(f10708i) ? new x2.c().f(bundle.getCharSequence(f10708i)).a() : null : x2.a(j0.a(bundle.getParcelable(f10713n))));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            eVar.k(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            eVar.d().putAll(bundle.getBundle("extras"));
                        }
                        return eVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @d.o0
            public static List<e> f(@d.o0 Parcelable[] parcelableArr) {
                e e7;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (e7 = e((Bundle) parcelable)) != null) {
                        arrayList.add(e7);
                    }
                }
                return arrayList;
            }

            @d.q0
            public String b() {
                return this.f10718e;
            }

            @d.q0
            public Uri c() {
                return this.f10719f;
            }

            @d.o0
            public Bundle d() {
                return this.f10717d;
            }

            @d.q0
            public x2 g() {
                return this.f10716c;
            }

            @d.q0
            @Deprecated
            public CharSequence h() {
                x2 x2Var = this.f10716c;
                if (x2Var == null) {
                    return null;
                }
                return x2Var.f();
            }

            @d.q0
            public CharSequence i() {
                return this.f10714a;
            }

            public long j() {
                return this.f10715b;
            }

            @d.o0
            public e k(@d.q0 String str, @d.q0 Uri uri) {
                this.f10718e = str;
                this.f10719f = uri;
                return this;
            }

            @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
            @d.o0
            @d.w0(24)
            public Notification.MessagingStyle.Message l() {
                Notification.MessagingStyle.Message a7;
                x2 g7 = g();
                if (Build.VERSION.SDK_INT >= 28) {
                    a7 = b.a(i(), j(), g7 != null ? g7.k() : null);
                } else {
                    a7 = a.a(i(), j(), g7 != null ? g7.f() : null);
                }
                if (b() != null) {
                    a.b(a7, b(), c());
                }
                return a7;
            }

            @d.o0
            public final Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f10714a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f10715b);
                x2 x2Var = this.f10716c;
                if (x2Var != null) {
                    bundle.putCharSequence(f10708i, x2Var.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f10713n, this.f10716c.k());
                    } else {
                        bundle.putBundle(f10712m, this.f10716c.m());
                    }
                }
                String str = this.f10718e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f10719f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f10717d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @Deprecated
            public e(@d.q0 CharSequence charSequence, long j7, @d.q0 CharSequence charSequence2) {
                this(charSequence, j7, new x2.c().f(charSequence2).a());
            }
        }

        public u(@d.o0 x2 x2Var) {
            if (!TextUtils.isEmpty(x2Var.f())) {
                this.f10703g = x2Var;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* loaded from: classes.dex */
    public static final class z implements r {
        public static final String A = "displayIntent";
        public static final String B = "pages";
        public static final String C = "background";
        public static final String D = "contentIcon";
        public static final String E = "contentIconGravity";
        public static final String F = "contentActionIndex";
        public static final String G = "customSizePreset";
        public static final String H = "customContentHeight";
        public static final String I = "gravity";
        public static final String J = "hintScreenTimeout";
        public static final String K = "dismissalId";
        public static final String L = "bridgeTag";
        public static final int M = 1;
        public static final int N = 2;
        public static final int O = 4;
        public static final int P = 8;
        public static final int Q = 16;
        public static final int R = 32;
        public static final int S = 64;
        public static final int T = 1;
        public static final int U = 8388613;
        public static final int V = 80;

        /* renamed from: o  reason: collision with root package name */
        public static final int f10724o = -1;
        @Deprecated

        /* renamed from: p  reason: collision with root package name */
        public static final int f10725p = 0;
        @Deprecated

        /* renamed from: q  reason: collision with root package name */
        public static final int f10726q = 1;
        @Deprecated

        /* renamed from: r  reason: collision with root package name */
        public static final int f10727r = 2;
        @Deprecated

        /* renamed from: s  reason: collision with root package name */
        public static final int f10728s = 3;
        @Deprecated

        /* renamed from: t  reason: collision with root package name */
        public static final int f10729t = 4;
        @Deprecated

        /* renamed from: u  reason: collision with root package name */
        public static final int f10730u = 5;
        @Deprecated

        /* renamed from: v  reason: collision with root package name */
        public static final int f10731v = 0;
        @Deprecated

        /* renamed from: w  reason: collision with root package name */
        public static final int f10732w = -1;

        /* renamed from: x  reason: collision with root package name */
        public static final String f10733x = "android.wearable.EXTENSIONS";

        /* renamed from: y  reason: collision with root package name */
        public static final String f10734y = "actions";

        /* renamed from: z  reason: collision with root package name */
        public static final String f10735z = "flags";

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<b> f10736a;

        /* renamed from: b  reason: collision with root package name */
        public int f10737b;

        /* renamed from: c  reason: collision with root package name */
        public PendingIntent f10738c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Notification> f10739d;

        /* renamed from: e  reason: collision with root package name */
        public Bitmap f10740e;

        /* renamed from: f  reason: collision with root package name */
        public int f10741f;

        /* renamed from: g  reason: collision with root package name */
        public int f10742g;

        /* renamed from: h  reason: collision with root package name */
        public int f10743h;

        /* renamed from: i  reason: collision with root package name */
        public int f10744i;

        /* renamed from: j  reason: collision with root package name */
        public int f10745j;

        /* renamed from: k  reason: collision with root package name */
        public int f10746k;

        /* renamed from: l  reason: collision with root package name */
        public int f10747l;

        /* renamed from: m  reason: collision with root package name */
        public String f10748m;

        /* renamed from: n  reason: collision with root package name */
        public String f10749n;

        @d.w0(20)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @d.u
            public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @d.u
            public static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            @d.u
            public static Notification.Action.Builder d(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i7, charSequence, pendingIntent);
            }

            @d.u
            public static b e(ArrayList<Parcelable> arrayList, int i7) {
                return k0.b((Notification.Action) arrayList.get(i7));
            }
        }

        @d.w0(23)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @d.u
            public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        @d.w0(24)
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            @d.u
            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z6) {
                return builder.setAllowGeneratedReplies(z6);
            }
        }

        @d.w0(31)
        /* loaded from: classes.dex */
        public static class d {
            private d() {
            }

            @d.u
            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z6) {
                Notification.Action.Builder authenticationRequired;
                authenticationRequired = builder.setAuthenticationRequired(z6);
                return authenticationRequired;
            }
        }

        public z() {
            this.f10736a = new ArrayList<>();
            this.f10737b = 1;
            this.f10739d = new ArrayList<>();
            this.f10742g = 8388613;
            this.f10743h = -1;
            this.f10744i = 0;
            this.f10746k = 80;
        }

        @d.w0(20)
        public static Notification.Action i(b bVar) {
            int i7 = Build.VERSION.SDK_INT;
            IconCompat f7 = bVar.f();
            Notification.Action.Builder a7 = b.a(f7 == null ? null : f7.F(), bVar.j(), bVar.a());
            Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
            bundle.putBoolean(o2.f10766c, bVar.b());
            c.a(a7, bVar.b());
            if (i7 >= 31) {
                d.a(a7, bVar.k());
            }
            a.a(a7, bundle);
            q3[] g7 = bVar.g();
            if (g7 != null) {
                for (RemoteInput remoteInput : q3.d(g7)) {
                    a.b(a7, remoteInput);
                }
            }
            return a.c(a7);
        }

        @Deprecated
        public boolean A() {
            return (this.f10737b & 4) != 0;
        }

        @d.o0
        @Deprecated
        public List<Notification> B() {
            return this.f10739d;
        }

        public boolean C() {
            return (this.f10737b & 8) != 0;
        }

        @d.o0
        @Deprecated
        public z D(@d.q0 Bitmap bitmap) {
            this.f10740e = bitmap;
            return this;
        }

        @d.o0
        public z E(@d.q0 String str) {
            this.f10749n = str;
            return this;
        }

        @d.o0
        public z F(int i7) {
            this.f10743h = i7;
            return this;
        }

        @d.o0
        @Deprecated
        public z G(int i7) {
            this.f10741f = i7;
            return this;
        }

        @d.o0
        @Deprecated
        public z H(int i7) {
            this.f10742g = i7;
            return this;
        }

        @d.o0
        public z I(boolean z6) {
            N(1, z6);
            return this;
        }

        @d.o0
        @Deprecated
        public z J(int i7) {
            this.f10745j = i7;
            return this;
        }

        @d.o0
        @Deprecated
        public z K(int i7) {
            this.f10744i = i7;
            return this;
        }

        @d.o0
        public z L(@d.q0 String str) {
            this.f10748m = str;
            return this;
        }

        @d.o0
        @Deprecated
        public z M(@d.q0 PendingIntent pendingIntent) {
            this.f10738c = pendingIntent;
            return this;
        }

        public final void N(int i7, boolean z6) {
            if (z6) {
                this.f10737b = i7 | this.f10737b;
                return;
            }
            this.f10737b = (~i7) & this.f10737b;
        }

        @d.o0
        @Deprecated
        public z O(int i7) {
            this.f10746k = i7;
            return this;
        }

        @d.o0
        @Deprecated
        public z P(boolean z6) {
            N(32, z6);
            return this;
        }

        @d.o0
        @Deprecated
        public z Q(boolean z6) {
            N(16, z6);
            return this;
        }

        @d.o0
        public z R(boolean z6) {
            N(64, z6);
            return this;
        }

        @d.o0
        @Deprecated
        public z S(boolean z6) {
            N(2, z6);
            return this;
        }

        @d.o0
        @Deprecated
        public z T(int i7) {
            this.f10747l = i7;
            return this;
        }

        @d.o0
        @Deprecated
        public z U(boolean z6) {
            N(4, z6);
            return this;
        }

        @d.o0
        public z V(boolean z6) {
            N(8, z6);
            return this;
        }

        @Override // i0.k0.r
        @d.o0
        public n a(@d.o0 n nVar) {
            Bundle bundle = new Bundle();
            if (!this.f10736a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f10736a.size());
                Iterator<b> it = this.f10736a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i(it.next()));
                }
                bundle.putParcelableArrayList(f10734y, arrayList);
            }
            int i7 = this.f10737b;
            if (i7 != 1) {
                bundle.putInt("flags", i7);
            }
            PendingIntent pendingIntent = this.f10738c;
            if (pendingIntent != null) {
                bundle.putParcelable(A, pendingIntent);
            }
            if (!this.f10739d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f10739d;
                bundle.putParcelableArray(B, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f10740e;
            if (bitmap != null) {
                bundle.putParcelable(C, bitmap);
            }
            int i8 = this.f10741f;
            if (i8 != 0) {
                bundle.putInt(D, i8);
            }
            int i9 = this.f10742g;
            if (i9 != 8388613) {
                bundle.putInt(E, i9);
            }
            int i10 = this.f10743h;
            if (i10 != -1) {
                bundle.putInt(F, i10);
            }
            int i11 = this.f10744i;
            if (i11 != 0) {
                bundle.putInt(G, i11);
            }
            int i12 = this.f10745j;
            if (i12 != 0) {
                bundle.putInt(H, i12);
            }
            int i13 = this.f10746k;
            if (i13 != 80) {
                bundle.putInt(I, i13);
            }
            int i14 = this.f10747l;
            if (i14 != 0) {
                bundle.putInt(J, i14);
            }
            String str = this.f10748m;
            if (str != null) {
                bundle.putString(K, str);
            }
            String str2 = this.f10749n;
            if (str2 != null) {
                bundle.putString(L, str2);
            }
            nVar.t().putBundle("android.wearable.EXTENSIONS", bundle);
            return nVar;
        }

        @d.o0
        public z b(@d.o0 b bVar) {
            this.f10736a.add(bVar);
            return this;
        }

        @d.o0
        public z c(@d.o0 List<b> list) {
            this.f10736a.addAll(list);
            return this;
        }

        @d.o0
        @Deprecated
        public z d(@d.o0 Notification notification) {
            this.f10739d.add(notification);
            return this;
        }

        @d.o0
        @Deprecated
        public z e(@d.o0 List<Notification> list) {
            this.f10739d.addAll(list);
            return this;
        }

        @d.o0
        public z f() {
            this.f10736a.clear();
            return this;
        }

        @d.o0
        @Deprecated
        public z g() {
            this.f10739d.clear();
            return this;
        }

        @d.o0
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public z clone() {
            z zVar = new z();
            zVar.f10736a = new ArrayList<>(this.f10736a);
            zVar.f10737b = this.f10737b;
            zVar.f10738c = this.f10738c;
            zVar.f10739d = new ArrayList<>(this.f10739d);
            zVar.f10740e = this.f10740e;
            zVar.f10741f = this.f10741f;
            zVar.f10742g = this.f10742g;
            zVar.f10743h = this.f10743h;
            zVar.f10744i = this.f10744i;
            zVar.f10745j = this.f10745j;
            zVar.f10746k = this.f10746k;
            zVar.f10747l = this.f10747l;
            zVar.f10748m = this.f10748m;
            zVar.f10749n = this.f10749n;
            return zVar;
        }

        @d.o0
        public List<b> j() {
            return this.f10736a;
        }

        @d.q0
        @Deprecated
        public Bitmap k() {
            return this.f10740e;
        }

        @d.q0
        public String l() {
            return this.f10749n;
        }

        public int m() {
            return this.f10743h;
        }

        @Deprecated
        public int n() {
            return this.f10741f;
        }

        @Deprecated
        public int o() {
            return this.f10742g;
        }

        public boolean p() {
            return (this.f10737b & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.f10745j;
        }

        @Deprecated
        public int r() {
            return this.f10744i;
        }

        @d.q0
        public String s() {
            return this.f10748m;
        }

        @d.q0
        @Deprecated
        public PendingIntent t() {
            return this.f10738c;
        }

        @Deprecated
        public int u() {
            return this.f10746k;
        }

        @Deprecated
        public boolean v() {
            return (this.f10737b & 32) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.f10737b & 16) != 0;
        }

        public boolean x() {
            return (this.f10737b & 64) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.f10737b & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.f10747l;
        }

        public z(@d.o0 Notification notification) {
            this.f10736a = new ArrayList<>();
            this.f10737b = 1;
            this.f10739d = new ArrayList<>();
            this.f10742g = 8388613;
            this.f10743h = -1;
            this.f10744i = 0;
            this.f10746k = 80;
            Bundle n7 = k0.n(notification);
            Bundle bundle = n7 != null ? n7.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(f10734y);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        bVarArr[i7] = a.e(parcelableArrayList, i7);
                    }
                    Collections.addAll(this.f10736a, bVarArr);
                }
                this.f10737b = bundle.getInt("flags", 1);
                this.f10738c = (PendingIntent) bundle.getParcelable(A);
                Notification[] u6 = k0.u(bundle, B);
                if (u6 != null) {
                    Collections.addAll(this.f10739d, u6);
                }
                this.f10740e = (Bitmap) bundle.getParcelable(C);
                this.f10741f = bundle.getInt(D);
                this.f10742g = bundle.getInt(E, 8388613);
                this.f10743h = bundle.getInt(F, -1);
                this.f10744i = bundle.getInt(G, 0);
                this.f10745j = bundle.getInt(H);
                this.f10746k = bundle.getInt(I, 80);
                this.f10747l = bundle.getInt(J);
                this.f10748m = bundle.getString(K);
                this.f10749n = bundle.getString(L);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public static final int Y = 5120;
        public boolean A;
        public boolean B;
        public boolean C;
        public String D;
        public Bundle E;
        public int F;
        public int G;
        public Notification H;
        public RemoteViews I;
        public RemoteViews J;
        public RemoteViews K;
        public String L;
        public int M;
        public String N;
        public k0.o0 O;
        public long P;
        public int Q;
        public int R;
        public boolean S;
        public m T;
        public Notification U;
        public boolean V;
        public Object W;
        @Deprecated
        public ArrayList<String> X;
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: a  reason: collision with root package name */
        public Context f10625a;
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f10626b;
        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<x2> f10627c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f10628d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f10629e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f10630f;

        /* renamed from: g  reason: collision with root package name */
        public PendingIntent f10631g;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f10632h;

        /* renamed from: i  reason: collision with root package name */
        public RemoteViews f10633i;

        /* renamed from: j  reason: collision with root package name */
        public Bitmap f10634j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f10635k;

        /* renamed from: l  reason: collision with root package name */
        public int f10636l;

        /* renamed from: m  reason: collision with root package name */
        public int f10637m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f10638n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f10639o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f10640p;

        /* renamed from: q  reason: collision with root package name */
        public y f10641q;

        /* renamed from: r  reason: collision with root package name */
        public CharSequence f10642r;

        /* renamed from: s  reason: collision with root package name */
        public CharSequence f10643s;

        /* renamed from: t  reason: collision with root package name */
        public CharSequence[] f10644t;

        /* renamed from: u  reason: collision with root package name */
        public int f10645u;

        /* renamed from: v  reason: collision with root package name */
        public int f10646v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f10647w;

        /* renamed from: x  reason: collision with root package name */
        public String f10648x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f10649y;

        /* renamed from: z  reason: collision with root package name */
        public String f10650z;

        @d.w0(21)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @d.u
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            @d.u
            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            @d.u
            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i7) {
                return builder.setContentType(i7);
            }

            @d.u
            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i7) {
                return builder.setLegacyStreamType(i7);
            }

            @d.u
            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i7) {
                return builder.setUsage(i7);
            }
        }

        @d.w0(23)
        /* loaded from: classes.dex */
        public static class b {
            private b() {
            }

            @d.u
            public static Icon a(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        @d.w0(24)
        /* loaded from: classes.dex */
        public static class c {
            private c() {
            }

            @d.u
            public static RemoteViews a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @d.u
            public static RemoteViews b(Notification.Builder builder) {
                return builder.createContentView();
            }

            @d.u
            public static RemoteViews c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @d.u
            public static Notification.Builder d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        @d.w0(19)
        public n(@d.o0 Context context, @d.o0 Notification notification) {
            this(context, k0.i(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            y s6 = y.s(notification);
            P(k0.m(notification)).O(k0.l(notification)).M(k0.k(notification)).A0(k0.D(notification)).o0(k0.z(notification)).z0(s6).N(notification.contentIntent).Z(k0.o(notification)).b0(k0.H(notification)).f0(k0.t(notification)).H0(notification.when).r0(k0.B(notification)).E0(k0.F(notification)).D(k0.e(notification)).j0(k0.w(notification)).i0(k0.v(notification)).e0(k0.s(notification)).c0(notification.largeIcon).E(k0.f(notification)).G(k0.h(notification)).F(k0.g(notification)).h0(notification.number).B0(notification.tickerText).N(notification.contentIntent).U(notification.deleteIntent).Y(notification.fullScreenIntent, k0.q(notification)).y0(notification.sound, notification.audioStreamType).F0(notification.vibrate).d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).T(notification.defaults).k0(notification.priority).J(k0.j(notification)).G0(k0.G(notification)).m0(k0.y(notification)).w0(k0.C(notification)).D0(k0.E(notification)).p0(k0.A(notification)).l0(bundle.getInt(k0.N), bundle.getInt(k0.M), bundle.getBoolean(k0.O)).C(k0.d(notification)).u0(notification.icon, notification.iconLevel).c(u(notification, s6));
            this.W = b.a(notification);
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    b(b.a.f(action).c());
                }
            }
            List<b> r6 = k0.r(notification);
            if (!r6.isEmpty()) {
                Iterator<b> it = r6.iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(k0.f10494a0);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    g(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(k0.f10497b0)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    f(x2.a(j0.a(it2.next())));
                }
            }
            if (bundle.containsKey(k0.Q)) {
                I(bundle.getBoolean(k0.Q));
            }
            if (bundle.containsKey(k0.R)) {
                K(bundle.getBoolean(k0.R));
            }
        }

        @d.q0
        public static CharSequence A(@d.q0 CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, Y) : charSequence;
        }

        @d.q0
        @d.w0(19)
        public static Bundle u(@d.o0 Notification notification, @d.q0 y yVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(k0.B);
            bundle.remove(k0.D);
            bundle.remove(k0.G);
            bundle.remove(k0.E);
            bundle.remove(k0.f10499c);
            bundle.remove(k0.f10502d);
            bundle.remove(k0.S);
            bundle.remove(k0.M);
            bundle.remove(k0.N);
            bundle.remove(k0.O);
            bundle.remove(k0.Q);
            bundle.remove(k0.R);
            bundle.remove(k0.f10497b0);
            bundle.remove(k0.f10494a0);
            bundle.remove(n2.f10759d);
            bundle.remove(n2.f10757b);
            bundle.remove(n2.f10758c);
            bundle.remove(n2.f10756a);
            bundle.remove(n2.f10760e);
            Bundle bundle2 = bundle.getBundle(p.f10667d);
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove(p.f10671h);
                bundle.putBundle(p.f10667d, bundle3);
            }
            if (yVar != null) {
                yVar.g(bundle);
            }
            return bundle;
        }

        @d.o0
        public n A0(@d.q0 CharSequence charSequence) {
            this.f10642r = A(charSequence);
            return this;
        }

        @d.q0
        public final Bitmap B(@d.q0 Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f10625a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.c.f9653g);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.f9652f);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        @d.o0
        public n B0(@d.q0 CharSequence charSequence) {
            this.U.tickerText = A(charSequence);
            return this;
        }

        @d.o0
        public n C(boolean z6) {
            this.S = z6;
            return this;
        }

        @d.o0
        @Deprecated
        public n C0(@d.q0 CharSequence charSequence, @d.q0 RemoteViews remoteViews) {
            this.U.tickerText = A(charSequence);
            this.f10633i = remoteViews;
            return this;
        }

        @d.o0
        public n D(boolean z6) {
            W(16, z6);
            return this;
        }

        @d.o0
        public n D0(long j7) {
            this.P = j7;
            return this;
        }

        @d.o0
        public n E(int i7) {
            this.M = i7;
            return this;
        }

        @d.o0
        public n E0(boolean z6) {
            this.f10639o = z6;
            return this;
        }

        @d.o0
        public n F(@d.q0 m mVar) {
            this.T = mVar;
            return this;
        }

        @d.o0
        public n F0(@d.q0 long[] jArr) {
            this.U.vibrate = jArr;
            return this;
        }

        @d.o0
        public n G(@d.q0 String str) {
            this.D = str;
            return this;
        }

        @d.o0
        public n G0(int i7) {
            this.G = i7;
            return this;
        }

        @d.o0
        public n H(@d.o0 String str) {
            this.L = str;
            return this;
        }

        @d.o0
        public n H0(long j7) {
            this.U.when = j7;
            return this;
        }

        @d.o0
        @d.w0(24)
        public n I(boolean z6) {
            this.f10640p = z6;
            t().putBoolean(k0.Q, z6);
            return this;
        }

        public final boolean I0() {
            y yVar = this.f10641q;
            return yVar == null || !yVar.r();
        }

        @d.o0
        public n J(@d.l int i7) {
            this.F = i7;
            return this;
        }

        @d.o0
        public n K(boolean z6) {
            this.B = z6;
            this.C = true;
            return this;
        }

        @d.o0
        public n L(@d.q0 RemoteViews remoteViews) {
            this.U.contentView = remoteViews;
            return this;
        }

        @d.o0
        public n M(@d.q0 CharSequence charSequence) {
            this.f10635k = A(charSequence);
            return this;
        }

        @d.o0
        public n N(@d.q0 PendingIntent pendingIntent) {
            this.f10631g = pendingIntent;
            return this;
        }

        @d.o0
        public n O(@d.q0 CharSequence charSequence) {
            this.f10630f = A(charSequence);
            return this;
        }

        @d.o0
        public n P(@d.q0 CharSequence charSequence) {
            this.f10629e = A(charSequence);
            return this;
        }

        @d.o0
        public n Q(@d.q0 RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        @d.o0
        public n R(@d.q0 RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        @d.o0
        public n S(@d.q0 RemoteViews remoteViews) {
            this.K = remoteViews;
            return this;
        }

        @d.o0
        public n T(int i7) {
            Notification notification = this.U;
            notification.defaults = i7;
            if ((i7 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @d.o0
        public n U(@d.q0 PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        @d.o0
        public n V(@d.q0 Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public final void W(int i7, boolean z6) {
            if (z6) {
                Notification notification = this.U;
                notification.flags = i7 | notification.flags;
                return;
            }
            Notification notification2 = this.U;
            notification2.flags = (~i7) & notification2.flags;
        }

        @d.o0
        public n X(int i7) {
            this.R = i7;
            return this;
        }

        @d.o0
        public n Y(@d.q0 PendingIntent pendingIntent, boolean z6) {
            this.f10632h = pendingIntent;
            W(128, z6);
            return this;
        }

        @d.o0
        public n Z(@d.q0 String str) {
            this.f10648x = str;
            return this;
        }

        @d.o0
        public n a(int i7, @d.q0 CharSequence charSequence, @d.q0 PendingIntent pendingIntent) {
            this.f10626b.add(new b(i7, charSequence, pendingIntent));
            return this;
        }

        @d.o0
        public n a0(int i7) {
            this.Q = i7;
            return this;
        }

        @d.o0
        public n b(@d.q0 b bVar) {
            if (bVar != null) {
                this.f10626b.add(bVar);
            }
            return this;
        }

        @d.o0
        public n b0(boolean z6) {
            this.f10649y = z6;
            return this;
        }

        @d.o0
        public n c(@d.q0 Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.E;
                if (bundle2 == null) {
                    this.E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @d.o0
        public n c0(@d.q0 Bitmap bitmap) {
            this.f10634j = B(bitmap);
            return this;
        }

        @d.o0
        @d.w0(21)
        public n d(int i7, @d.q0 CharSequence charSequence, @d.q0 PendingIntent pendingIntent) {
            this.f10628d.add(new b(i7, charSequence, pendingIntent));
            return this;
        }

        @d.o0
        public n d0(@d.l int i7, int i8, int i9) {
            Notification notification = this.U;
            notification.ledARGB = i7;
            notification.ledOnMS = i8;
            notification.ledOffMS = i9;
            notification.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @d.o0
        @d.w0(21)
        public n e(@d.q0 b bVar) {
            if (bVar != null) {
                this.f10628d.add(bVar);
            }
            return this;
        }

        @d.o0
        public n e0(boolean z6) {
            this.A = z6;
            return this;
        }

        @d.o0
        public n f(@d.q0 x2 x2Var) {
            if (x2Var != null) {
                this.f10627c.add(x2Var);
            }
            return this;
        }

        @d.o0
        public n f0(@d.q0 k0.o0 o0Var) {
            this.O = o0Var;
            return this;
        }

        @d.o0
        @Deprecated
        public n g(@d.q0 String str) {
            if (str != null && !str.isEmpty()) {
                this.X.add(str);
            }
            return this;
        }

        @d.o0
        @Deprecated
        public n g0() {
            this.V = true;
            return this;
        }

        @d.o0
        public Notification h() {
            return new f2(this).c();
        }

        @d.o0
        public n h0(int i7) {
            this.f10636l = i7;
            return this;
        }

        @d.o0
        public n i() {
            this.f10626b.clear();
            return this;
        }

        @d.o0
        public n i0(boolean z6) {
            W(2, z6);
            return this;
        }

        @d.o0
        public n j() {
            this.f10628d.clear();
            Bundle bundle = this.E.getBundle(p.f10667d);
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove(p.f10671h);
                this.E.putBundle(p.f10667d, bundle2);
            }
            return this;
        }

        @d.o0
        public n j0(boolean z6) {
            W(8, z6);
            return this;
        }

        @d.o0
        public n k() {
            this.f10627c.clear();
            this.X.clear();
            return this;
        }

        @d.o0
        public n k0(int i7) {
            this.f10637m = i7;
            return this;
        }

        @d.q0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews l() {
            RemoteViews v6;
            if (this.J == null || !I0()) {
                f2 f2Var = new f2(this);
                y yVar = this.f10641q;
                return (yVar == null || (v6 = yVar.v(f2Var)) == null) ? c.a(c.d(this.f10625a, f2Var.c())) : v6;
            }
            return this.J;
        }

        @d.o0
        public n l0(int i7, int i8, boolean z6) {
            this.f10645u = i7;
            this.f10646v = i8;
            this.f10647w = z6;
            return this;
        }

        @d.q0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews m() {
            RemoteViews w6;
            if (this.I == null || !I0()) {
                f2 f2Var = new f2(this);
                y yVar = this.f10641q;
                return (yVar == null || (w6 = yVar.w(f2Var)) == null) ? c.b(c.d(this.f10625a, f2Var.c())) : w6;
            }
            return this.I;
        }

        @d.o0
        public n m0(@d.q0 Notification notification) {
            this.H = notification;
            return this;
        }

        @d.q0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews n() {
            RemoteViews x6;
            if (this.K == null || !I0()) {
                f2 f2Var = new f2(this);
                y yVar = this.f10641q;
                return (yVar == null || (x6 = yVar.x(f2Var)) == null) ? c.c(c.d(this.f10625a, f2Var.c())) : x6;
            }
            return this.K;
        }

        @d.o0
        public n n0(@d.q0 CharSequence[] charSequenceArr) {
            this.f10644t = charSequenceArr;
            return this;
        }

        @d.o0
        public n o(@d.o0 r rVar) {
            rVar.a(this);
            return this;
        }

        @d.o0
        public n o0(@d.q0 CharSequence charSequence) {
            this.f10643s = A(charSequence);
            return this;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews p() {
            return this.J;
        }

        @d.o0
        public n p0(@d.q0 String str) {
            this.N = str;
            return this;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.q0
        public m q() {
            return this.T;
        }

        @d.o0
        public n q0(@d.q0 l0.r rVar) {
            if (rVar == null) {
                return this;
            }
            this.N = rVar.k();
            if (this.O == null) {
                if (rVar.o() != null) {
                    this.O = rVar.o();
                } else if (rVar.k() != null) {
                    this.O = new k0.o0(rVar.k());
                }
            }
            if (this.f10629e == null) {
                P(rVar.w());
            }
            return this;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.l
        public int r() {
            return this.F;
        }

        @d.o0
        public n r0(boolean z6) {
            this.f10638n = z6;
            return this;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews s() {
            return this.I;
        }

        @d.o0
        public n s0(boolean z6) {
            this.V = z6;
            return this;
        }

        @d.o0
        public Bundle t() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        @d.o0
        public n t0(int i7) {
            this.U.icon = i7;
            return this;
        }

        @d.o0
        public n u0(int i7, int i8) {
            Notification notification = this.U;
            notification.icon = i7;
            notification.iconLevel = i8;
            return this;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public int v() {
            return this.R;
        }

        @d.o0
        @d.w0(23)
        public n v0(@d.o0 IconCompat iconCompat) {
            this.W = iconCompat.G(this.f10625a);
            return this;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w() {
            return this.K;
        }

        @d.o0
        public n w0(@d.q0 String str) {
            this.f10650z = str;
            return this;
        }

        @d.o0
        @Deprecated
        public Notification x() {
            return h();
        }

        @d.o0
        public n x0(@d.q0 Uri uri) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e7 = a.e(a.c(a.b(), 4), 5);
            this.U.audioAttributes = a.a(e7);
            return this;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public int y() {
            return this.f10637m;
        }

        @d.o0
        public n y0(@d.q0 Uri uri, int i7) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = i7;
            AudioAttributes.Builder d7 = a.d(a.c(a.b(), 4), i7);
            this.U.audioAttributes = a.a(d7);
            return this;
        }

        @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
        public long z() {
            if (this.f10638n) {
                return this.U.when;
            }
            return 0L;
        }

        @d.o0
        public n z0(@d.q0 y yVar) {
            if (this.f10641q != yVar) {
                this.f10641q = yVar;
                if (yVar != null) {
                    yVar.z(this);
                }
            }
            return this;
        }

        public n(@d.o0 Context context, @d.o0 String str) {
            this.f10626b = new ArrayList<>();
            this.f10627c = new ArrayList<>();
            this.f10628d = new ArrayList<>();
            this.f10638n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.f10625a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.f10637m = 0;
            this.X = new ArrayList<>();
            this.S = true;
        }

        @Deprecated
        public n(@d.o0 Context context) {
            this(context, (String) null);
        }
    }
}
