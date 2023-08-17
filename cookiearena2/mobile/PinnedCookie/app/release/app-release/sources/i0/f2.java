package i0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import d.b1;
import i0.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f2 implements y {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10460a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f10461b;

    /* renamed from: c  reason: collision with root package name */
    public final k0.n f10462c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteViews f10463d;

    /* renamed from: e  reason: collision with root package name */
    public RemoteViews f10464e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Bundle> f10465f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f10466g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    public int f10467h;

    /* renamed from: i  reason: collision with root package name */
    public RemoteViews f10468i;

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        @d.u
        public static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setPriority(i7);
        }

        @d.u
        public static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        @d.u
        public static Notification.Builder d(Notification.Builder builder, boolean z6) {
            return builder.setUsesChronometer(z6);
        }
    }

    @d.w0(17)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static Notification.Builder a(Notification.Builder builder, boolean z6) {
            return builder.setShowWhen(z6);
        }
    }

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    @d.w0(20)
    /* loaded from: classes.dex */
    public static class d {
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

        @d.u
        public static String f(Notification notification) {
            return notification.getGroup();
        }

        @d.u
        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @d.u
        public static Notification.Builder h(Notification.Builder builder, boolean z6) {
            return builder.setGroupSummary(z6);
        }

        @d.u
        public static Notification.Builder i(Notification.Builder builder, boolean z6) {
            return builder.setLocalOnly(z6);
        }

        @d.u
        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @d.u
        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @d.u
        public static Notification.Builder c(Notification.Builder builder, int i7) {
            return builder.setColor(i7);
        }

        @d.u
        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @d.u
        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        @d.u
        public static Notification.Builder f(Notification.Builder builder, int i7) {
            return builder.setVisibility(i7);
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class f {
        @d.u
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @d.u
        public static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class g {
        @d.u
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z6) {
            return builder.setAllowGeneratedReplies(z6);
        }

        @d.u
        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @d.u
        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @d.u
        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @d.u
        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class h {
        @d.u
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @d.u
        public static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setBadgeIconType(i7);
        }

        @d.u
        public static Notification.Builder c(Notification.Builder builder, boolean z6) {
            return builder.setColorized(z6);
        }

        @d.u
        public static Notification.Builder d(Notification.Builder builder, int i7) {
            return builder.setGroupAlertBehavior(i7);
        }

        @d.u
        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        @d.u
        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        @d.u
        public static Notification.Builder g(Notification.Builder builder, long j7) {
            return builder.setTimeoutAfter(j7);
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class i {
        @d.u
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            Notification.Builder addPerson;
            addPerson = builder.addPerson(person);
            return addPerson;
        }

        @d.u
        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i7) {
            Notification.Action.Builder semanticAction;
            semanticAction = builder.setSemanticAction(i7);
            return semanticAction;
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class j {
        @d.u
        public static Notification.Builder a(Notification.Builder builder, boolean z6) {
            Notification.Builder allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z6);
            return allowSystemGeneratedContextualActions;
        }

        @d.u
        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            Notification.Builder bubbleMetadata2;
            bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
            return bubbleMetadata2;
        }

        @d.u
        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z6) {
            Notification.Action.Builder contextual;
            contextual = builder.setContextual(z6);
            return contextual;
        }

        @d.u
        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            Notification.Builder locusId;
            locusId = builder.setLocusId(k2.a(obj));
            return locusId;
        }
    }

    @d.w0(31)
    /* loaded from: classes.dex */
    public static class k {
        @d.u
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z6) {
            Notification.Action.Builder authenticationRequired;
            authenticationRequired = builder.setAuthenticationRequired(z6);
            return authenticationRequired;
        }

        @d.u
        public static Notification.Builder b(Notification.Builder builder, int i7) {
            Notification.Builder foregroundServiceBehavior;
            foregroundServiceBehavior = builder.setForegroundServiceBehavior(i7);
            return foregroundServiceBehavior;
        }
    }

    public f2(k0.n nVar) {
        int i7;
        this.f10462c = nVar;
        Context context = nVar.f10625a;
        this.f10460a = context;
        Notification.Builder a7 = h.a(context, nVar.L);
        this.f10461b = a7;
        Notification notification = nVar.U;
        a7.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, nVar.f10633i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(nVar.f10629e).setContentText(nVar.f10630f).setContentInfo(nVar.f10635k).setContentIntent(nVar.f10631g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(nVar.f10632h, (notification.flags & 128) != 0).setLargeIcon(nVar.f10634j).setNumber(nVar.f10636l).setProgress(nVar.f10645u, nVar.f10646v, nVar.f10647w);
        a.b(a.d(a.c(a7, nVar.f10642r), nVar.f10639o), nVar.f10637m);
        Iterator<k0.b> it = nVar.f10626b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = nVar.E;
        if (bundle != null) {
            this.f10466g.putAll(bundle);
        }
        int i8 = Build.VERSION.SDK_INT;
        this.f10463d = nVar.I;
        this.f10464e = nVar.J;
        b.a(this.f10461b, nVar.f10638n);
        d.i(this.f10461b, nVar.A);
        d.g(this.f10461b, nVar.f10648x);
        d.j(this.f10461b, nVar.f10650z);
        d.h(this.f10461b, nVar.f10649y);
        this.f10467h = nVar.Q;
        e.b(this.f10461b, nVar.D);
        e.c(this.f10461b, nVar.F);
        e.f(this.f10461b, nVar.G);
        e.d(this.f10461b, nVar.H);
        e.e(this.f10461b, notification.sound, notification.audioAttributes);
        List e7 = i8 < 28 ? e(g(nVar.f10627c), nVar.X) : nVar.X;
        if (e7 != null && !e7.isEmpty()) {
            Iterator it2 = e7.iterator();
            while (it2.hasNext()) {
                e.a(this.f10461b, (String) it2.next());
            }
        }
        this.f10468i = nVar.K;
        if (nVar.f10628d.size() > 0) {
            Bundle bundle2 = nVar.t().getBundle(k0.p.f10667d);
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i9 = 0; i9 < nVar.f10628d.size(); i9++) {
                bundle4.putBundle(Integer.toString(i9), o2.j(nVar.f10628d.get(i9)));
            }
            bundle2.putBundle(k0.p.f10671h, bundle4);
            bundle3.putBundle(k0.p.f10671h, bundle4);
            nVar.t().putBundle(k0.p.f10667d, bundle2);
            this.f10466g.putBundle(k0.p.f10667d, bundle3);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = nVar.W;
        if (obj != null) {
            f.b(this.f10461b, obj);
        }
        c.a(this.f10461b, nVar.E);
        g.e(this.f10461b, nVar.f10644t);
        RemoteViews remoteViews = nVar.I;
        if (remoteViews != null) {
            g.c(this.f10461b, remoteViews);
        }
        RemoteViews remoteViews2 = nVar.J;
        if (remoteViews2 != null) {
            g.b(this.f10461b, remoteViews2);
        }
        RemoteViews remoteViews3 = nVar.K;
        if (remoteViews3 != null) {
            g.d(this.f10461b, remoteViews3);
        }
        h.b(this.f10461b, nVar.M);
        h.e(this.f10461b, nVar.f10643s);
        h.f(this.f10461b, nVar.N);
        h.g(this.f10461b, nVar.P);
        h.d(this.f10461b, nVar.Q);
        if (nVar.C) {
            h.c(this.f10461b, nVar.B);
        }
        if (!TextUtils.isEmpty(nVar.L)) {
            this.f10461b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i10 >= 28) {
            Iterator<x2> it3 = nVar.f10627c.iterator();
            while (it3.hasNext()) {
                i.a(this.f10461b, it3.next().k());
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            j.a(this.f10461b, nVar.S);
            j.b(this.f10461b, k0.m.k(nVar.T));
            k0.o0 o0Var = nVar.O;
            if (o0Var != null) {
                j.d(this.f10461b, o0Var.c());
            }
        }
        if (i11 >= 31 && (i7 = nVar.R) != 0) {
            k.b(this.f10461b, i7);
        }
        if (nVar.V) {
            if (this.f10462c.f10649y) {
                this.f10467h = 2;
            } else {
                this.f10467h = 1;
            }
            this.f10461b.setVibrate(null);
            this.f10461b.setSound(null);
            int i12 = notification.defaults & (-2) & (-3);
            notification.defaults = i12;
            this.f10461b.setDefaults(i12);
            if (TextUtils.isEmpty(this.f10462c.f10648x)) {
                d.g(this.f10461b, k0.f10507e1);
            }
            h.d(this.f10461b, this.f10467h);
        }
    }

    @d.q0
    public static List<String> e(@d.q0 List<String> list, @d.q0 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.c cVar = new androidx.collection.c(list.size() + list2.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    @d.q0
    public static List<String> g(@d.q0 List<x2> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<x2> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().j());
        }
        return arrayList;
    }

    @Override // i0.y
    public Notification.Builder a() {
        return this.f10461b;
    }

    public final void b(k0.b bVar) {
        IconCompat f7 = bVar.f();
        Notification.Action.Builder a7 = f.a(f7 != null ? f7.F() : null, bVar.j(), bVar.a());
        if (bVar.g() != null) {
            for (RemoteInput remoteInput : q3.d(bVar.g())) {
                d.c(a7, remoteInput);
            }
        }
        Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle.putBoolean(o2.f10766c, bVar.b());
        int i7 = Build.VERSION.SDK_INT;
        g.a(a7, bVar.b());
        bundle.putInt(k0.b.f10565y, bVar.h());
        if (i7 >= 28) {
            i.b(a7, bVar.h());
        }
        if (i7 >= 29) {
            j.c(a7, bVar.l());
        }
        if (i7 >= 31) {
            k.a(a7, bVar.k());
        }
        bundle.putBoolean(k0.b.f10564x, bVar.i());
        d.b(a7, bundle);
        d.a(this.f10461b, d.d(a7));
    }

    public Notification c() {
        Bundle n7;
        RemoteViews x6;
        RemoteViews v6;
        k0.y yVar = this.f10462c.f10641q;
        if (yVar != null) {
            yVar.b(this);
        }
        RemoteViews w6 = yVar != null ? yVar.w(this) : null;
        Notification d7 = d();
        if (w6 != null) {
            d7.contentView = w6;
        } else {
            RemoteViews remoteViews = this.f10462c.I;
            if (remoteViews != null) {
                d7.contentView = remoteViews;
            }
        }
        if (yVar != null && (v6 = yVar.v(this)) != null) {
            d7.bigContentView = v6;
        }
        if (yVar != null && (x6 = this.f10462c.f10641q.x(this)) != null) {
            d7.headsUpContentView = x6;
        }
        if (yVar != null && (n7 = k0.n(d7)) != null) {
            yVar.a(n7);
        }
        return d7;
    }

    public Notification d() {
        return a.a(this.f10461b);
    }

    public Context f() {
        return this.f10460a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }
}
