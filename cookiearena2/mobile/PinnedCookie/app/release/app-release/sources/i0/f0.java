package i0;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f10454a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f10455b;

    /* renamed from: c  reason: collision with root package name */
    public String f10456c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10457d;

    /* renamed from: e  reason: collision with root package name */
    public List<z> f10458e;

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        @d.u
        public static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        @d.u
        public static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        @d.u
        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        @d.u
        public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static String a(NotificationChannelGroup notificationChannelGroup) {
            String description;
            description = notificationChannelGroup.getDescription();
            return description;
        }

        @d.u
        public static boolean b(NotificationChannelGroup notificationChannelGroup) {
            boolean isBlocked;
            isBlocked = notificationChannelGroup.isBlocked();
            return isBlocked;
        }

        @d.u
        public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final f0 f10459a;

        public c(@d.o0 String str) {
            this.f10459a = new f0(str);
        }

        @d.o0
        public f0 a() {
            return this.f10459a;
        }

        @d.o0
        public c b(@d.q0 String str) {
            this.f10459a.f10456c = str;
            return this;
        }

        @d.o0
        public c c(@d.q0 CharSequence charSequence) {
            this.f10459a.f10455b = charSequence;
            return this;
        }
    }

    public f0(@d.o0 String str) {
        this.f10458e = Collections.emptyList();
        this.f10454a = (String) g1.s.l(str);
    }

    @d.o0
    public List<z> a() {
        return this.f10458e;
    }

    @d.w0(26)
    public final List<z> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            if (this.f10454a.equals(a.c(notificationChannel))) {
                arrayList.add(new z(notificationChannel));
            }
        }
        return arrayList;
    }

    @d.q0
    public String c() {
        return this.f10456c;
    }

    @d.o0
    public String d() {
        return this.f10454a;
    }

    @d.q0
    public CharSequence e() {
        return this.f10455b;
    }

    public NotificationChannelGroup f() {
        int i7 = Build.VERSION.SDK_INT;
        NotificationChannelGroup a7 = a.a(this.f10454a, this.f10455b);
        if (i7 >= 28) {
            b.c(a7, this.f10456c);
        }
        return a7;
    }

    public boolean g() {
        return this.f10457d;
    }

    @d.o0
    public c h() {
        return new c(this.f10454a).c(this.f10455b).b(this.f10456c);
    }

    @d.w0(28)
    public f0(@d.o0 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @d.w0(26)
    public f0(@d.o0 NotificationChannelGroup notificationChannelGroup, @d.o0 List<NotificationChannel> list) {
        this(a.d(notificationChannelGroup));
        this.f10455b = a.e(notificationChannelGroup);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            this.f10456c = b.a(notificationChannelGroup);
        }
        if (i7 >= 28) {
            this.f10457d = b.b(notificationChannelGroup);
            this.f10458e = b(a.b(notificationChannelGroup));
            return;
        }
        this.f10458e = b(list);
    }
}
