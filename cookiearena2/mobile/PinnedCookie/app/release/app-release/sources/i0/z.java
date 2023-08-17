package i0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
/* loaded from: classes.dex */
public class z {

    /* renamed from: s  reason: collision with root package name */
    public static final String f10978s = "miscellaneous";

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f10979t = true;

    /* renamed from: u  reason: collision with root package name */
    public static final int f10980u = 0;
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public final String f10981a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f10982b;

    /* renamed from: c  reason: collision with root package name */
    public int f10983c;

    /* renamed from: d  reason: collision with root package name */
    public String f10984d;

    /* renamed from: e  reason: collision with root package name */
    public String f10985e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10986f;

    /* renamed from: g  reason: collision with root package name */
    public Uri f10987g;

    /* renamed from: h  reason: collision with root package name */
    public AudioAttributes f10988h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10989i;

    /* renamed from: j  reason: collision with root package name */
    public int f10990j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10991k;

    /* renamed from: l  reason: collision with root package name */
    public long[] f10992l;

    /* renamed from: m  reason: collision with root package name */
    public String f10993m;

    /* renamed from: n  reason: collision with root package name */
    public String f10994n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10995o;

    /* renamed from: p  reason: collision with root package name */
    public int f10996p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10997q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10998r;

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        @d.u
        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        @d.u
        public static NotificationChannel c(String str, CharSequence charSequence, int i7) {
            return new NotificationChannel(str, charSequence, i7);
        }

        @d.u
        public static void d(NotificationChannel notificationChannel, boolean z6) {
            notificationChannel.enableLights(z6);
        }

        @d.u
        public static void e(NotificationChannel notificationChannel, boolean z6) {
            notificationChannel.enableVibration(z6);
        }

        @d.u
        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        @d.u
        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        @d.u
        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @d.u
        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        @d.u
        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        @d.u
        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        @d.u
        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        @d.u
        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        @d.u
        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        @d.u
        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        @d.u
        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        @d.u
        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        @d.u
        public static void r(NotificationChannel notificationChannel, int i7) {
            notificationChannel.setLightColor(i7);
        }

        @d.u
        public static void s(NotificationChannel notificationChannel, boolean z6) {
            notificationChannel.setShowBadge(z6);
        }

        @d.u
        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        @d.u
        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        @d.u
        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        @d.u
        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static boolean a(NotificationChannel notificationChannel) {
            boolean canBubble;
            canBubble = notificationChannel.canBubble();
            return canBubble;
        }
    }

    @d.w0(30)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static String a(NotificationChannel notificationChannel) {
            String conversationId;
            conversationId = notificationChannel.getConversationId();
            return conversationId;
        }

        @d.u
        public static String b(NotificationChannel notificationChannel) {
            String parentChannelId;
            parentChannelId = notificationChannel.getParentChannelId();
            return parentChannelId;
        }

        @d.u
        public static boolean c(NotificationChannel notificationChannel) {
            boolean isImportantConversation;
            isImportantConversation = notificationChannel.isImportantConversation();
            return isImportantConversation;
        }

        @d.u
        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final z f10999a;

        public d(@d.o0 String str, int i7) {
            this.f10999a = new z(str, i7);
        }

        @d.o0
        public z a() {
            return this.f10999a;
        }

        @d.o0
        public d b(@d.o0 String str, @d.o0 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                z zVar = this.f10999a;
                zVar.f10993m = str;
                zVar.f10994n = str2;
            }
            return this;
        }

        @d.o0
        public d c(@d.q0 String str) {
            this.f10999a.f10984d = str;
            return this;
        }

        @d.o0
        public d d(@d.q0 String str) {
            this.f10999a.f10985e = str;
            return this;
        }

        @d.o0
        public d e(int i7) {
            this.f10999a.f10983c = i7;
            return this;
        }

        @d.o0
        public d f(int i7) {
            this.f10999a.f10990j = i7;
            return this;
        }

        @d.o0
        public d g(boolean z6) {
            this.f10999a.f10989i = z6;
            return this;
        }

        @d.o0
        public d h(@d.q0 CharSequence charSequence) {
            this.f10999a.f10982b = charSequence;
            return this;
        }

        @d.o0
        public d i(boolean z6) {
            this.f10999a.f10986f = z6;
            return this;
        }

        @d.o0
        public d j(@d.q0 Uri uri, @d.q0 AudioAttributes audioAttributes) {
            z zVar = this.f10999a;
            zVar.f10987g = uri;
            zVar.f10988h = audioAttributes;
            return this;
        }

        @d.o0
        public d k(boolean z6) {
            this.f10999a.f10991k = z6;
            return this;
        }

        @d.o0
        public d l(@d.q0 long[] jArr) {
            z zVar = this.f10999a;
            zVar.f10991k = jArr != null && jArr.length > 0;
            zVar.f10992l = jArr;
            return this;
        }
    }

    public z(@d.o0 String str, int i7) {
        this.f10986f = true;
        this.f10987g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f10990j = 0;
        this.f10981a = (String) g1.s.l(str);
        this.f10983c = i7;
        this.f10988h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.f10997q;
    }

    public boolean b() {
        return this.f10995o;
    }

    public boolean c() {
        return this.f10986f;
    }

    @d.q0
    public AudioAttributes d() {
        return this.f10988h;
    }

    @d.q0
    public String e() {
        return this.f10994n;
    }

    @d.q0
    public String f() {
        return this.f10984d;
    }

    @d.q0
    public String g() {
        return this.f10985e;
    }

    @d.o0
    public String h() {
        return this.f10981a;
    }

    public int i() {
        return this.f10983c;
    }

    public int j() {
        return this.f10990j;
    }

    public int k() {
        return this.f10996p;
    }

    @d.q0
    public CharSequence l() {
        return this.f10982b;
    }

    public NotificationChannel m() {
        String str;
        String str2;
        int i7 = Build.VERSION.SDK_INT;
        NotificationChannel c7 = a.c(this.f10981a, this.f10982b, this.f10983c);
        a.p(c7, this.f10984d);
        a.q(c7, this.f10985e);
        a.s(c7, this.f10986f);
        a.t(c7, this.f10987g, this.f10988h);
        a.d(c7, this.f10989i);
        a.r(c7, this.f10990j);
        a.u(c7, this.f10992l);
        a.e(c7, this.f10991k);
        if (i7 >= 30 && (str = this.f10993m) != null && (str2 = this.f10994n) != null) {
            c.d(c7, str, str2);
        }
        return c7;
    }

    @d.q0
    public String n() {
        return this.f10993m;
    }

    @d.q0
    public Uri o() {
        return this.f10987g;
    }

    @d.q0
    public long[] p() {
        return this.f10992l;
    }

    public boolean q() {
        return this.f10998r;
    }

    public boolean r() {
        return this.f10989i;
    }

    public boolean s() {
        return this.f10991k;
    }

    @d.o0
    public d t() {
        return new d(this.f10981a, this.f10983c).h(this.f10982b).c(this.f10984d).d(this.f10985e).i(this.f10986f).j(this.f10987g, this.f10988h).g(this.f10989i).f(this.f10990j).k(this.f10991k).l(this.f10992l).b(this.f10993m, this.f10994n);
    }

    @d.w0(26)
    public z(@d.o0 NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f10982b = a.m(notificationChannel);
        this.f10984d = a.g(notificationChannel);
        this.f10985e = a.h(notificationChannel);
        this.f10986f = a.b(notificationChannel);
        this.f10987g = a.n(notificationChannel);
        this.f10988h = a.f(notificationChannel);
        this.f10989i = a.v(notificationChannel);
        this.f10990j = a.k(notificationChannel);
        this.f10991k = a.w(notificationChannel);
        this.f10992l = a.o(notificationChannel);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.f10993m = c.b(notificationChannel);
            this.f10994n = c.a(notificationChannel);
        }
        this.f10995o = a.a(notificationChannel);
        this.f10996p = a.l(notificationChannel);
        if (i7 >= 29) {
            this.f10997q = b.a(notificationChannel);
        }
        if (i7 >= 30) {
            this.f10998r = c.c(notificationChannel);
        }
    }
}
