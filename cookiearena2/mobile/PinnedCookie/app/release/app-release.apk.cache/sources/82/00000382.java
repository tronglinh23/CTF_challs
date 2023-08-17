package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final int f3656b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f3657c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f3658d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f3659e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f3660f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f3661g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f3662h = 1;
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public final g f3663a;

    @d.w0(31)
    /* loaded from: classes.dex */
    public static final class a {
        @d.u
        @d.o0
        public static Pair<ContentInfo, ContentInfo> a(@d.o0 ContentInfo contentInfo, @d.o0 final Predicate<ClipData.Item> predicate) {
            ClipData clip;
            ContentInfo.Builder clip2;
            ContentInfo build;
            ContentInfo.Builder clip3;
            ContentInfo build2;
            clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean test = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = test ? contentInfo : null;
                if (test) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> h7 = k.h(clip, new g1.y() { // from class: androidx.core.view.j
                @Override // g1.y
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (h7.first == null) {
                return Pair.create(null, contentInfo);
            }
            if (h7.second == null) {
                return Pair.create(contentInfo, null);
            }
            androidx.core.view.i.a();
            clip2 = androidx.core.view.h.a(contentInfo).setClip((ClipData) h7.first);
            build = clip2.build();
            androidx.core.view.i.a();
            clip3 = androidx.core.view.h.a(contentInfo).setClip((ClipData) h7.second);
            build2 = clip3.build();
            return Pair.create(build, build2);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        @d.o0
        k a();

        void b(@d.o0 ClipData clipData);

        void c(int i7);

        void d(@d.q0 Bundle bundle);

        void e(@d.q0 Uri uri);

        void f(int i7);
    }

    @d.w0(31)
    /* loaded from: classes.dex */
    public static final class f implements g {
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f3671a;

        public f(@d.o0 ContentInfo contentInfo) {
            this.f3671a = androidx.core.view.d.a(g1.s.l(contentInfo));
        }

        @Override // androidx.core.view.k.g
        @d.q0
        public Uri a() {
            Uri linkUri;
            linkUri = this.f3671a.getLinkUri();
            return linkUri;
        }

        @Override // androidx.core.view.k.g
        @d.o0
        public ClipData b() {
            ClipData clip;
            clip = this.f3671a.getClip();
            return clip;
        }

        @Override // androidx.core.view.k.g
        public int c() {
            int flags;
            flags = this.f3671a.getFlags();
            return flags;
        }

        @Override // androidx.core.view.k.g
        @d.o0
        public ContentInfo d() {
            return this.f3671a;
        }

        @Override // androidx.core.view.k.g
        @d.q0
        public Bundle e() {
            Bundle extras;
            extras = this.f3671a.getExtras();
            return extras;
        }

        @Override // androidx.core.view.k.g
        public int f() {
            int source;
            source = this.f3671a.getSource();
            return source;
        }

        @d.o0
        public String toString() {
            return "ContentInfoCompat{" + this.f3671a + "}";
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        @d.q0
        Uri a();

        @d.o0
        ClipData b();

        int c();

        @d.q0
        ContentInfo d();

        @d.q0
        Bundle e();

        int f();
    }

    /* loaded from: classes.dex */
    public static final class h implements g {
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f3672a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3673b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3674c;
        @d.q0

        /* renamed from: d  reason: collision with root package name */
        public final Uri f3675d;
        @d.q0

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f3676e;

        public h(e eVar) {
            this.f3672a = (ClipData) g1.s.l(eVar.f3666a);
            this.f3673b = g1.s.g(eVar.f3667b, 0, 5, "source");
            this.f3674c = g1.s.k(eVar.f3668c, 1);
            this.f3675d = eVar.f3669d;
            this.f3676e = eVar.f3670e;
        }

        @Override // androidx.core.view.k.g
        @d.q0
        public Uri a() {
            return this.f3675d;
        }

        @Override // androidx.core.view.k.g
        @d.o0
        public ClipData b() {
            return this.f3672a;
        }

        @Override // androidx.core.view.k.g
        public int c() {
            return this.f3674c;
        }

        @Override // androidx.core.view.k.g
        @d.q0
        public ContentInfo d() {
            return null;
        }

        @Override // androidx.core.view.k.g
        @d.q0
        public Bundle e() {
            return this.f3676e;
        }

        @Override // androidx.core.view.k.g
        public int f() {
            return this.f3673b;
        }

        @d.o0
        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f3672a.getDescription());
            sb.append(", source=");
            sb.append(k.k(this.f3673b));
            sb.append(", flags=");
            sb.append(k.b(this.f3674c));
            if (this.f3675d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f3675d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f3676e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface i {
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface j {
    }

    public k(@d.o0 g gVar) {
        this.f3663a = gVar;
    }

    @d.o0
    public static ClipData a(@d.o0 ClipDescription clipDescription, @d.o0 List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i7 = 1; i7 < list.size(); i7++) {
            clipData.addItem(list.get(i7));
        }
        return clipData;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.o0
    public static String b(int i7) {
        return (i7 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i7);
    }

    @d.o0
    public static Pair<ClipData, ClipData> h(@d.o0 ClipData clipData, @d.o0 g1.y<ClipData.Item> yVar) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i7 = 0; i7 < clipData.getItemCount(); i7++) {
            ClipData.Item itemAt = clipData.getItemAt(i7);
            if (yVar.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        return arrayList == null ? Pair.create(null, clipData) : arrayList2 == null ? Pair.create(clipData, null) : Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    @d.o0
    @d.w0(31)
    public static Pair<ContentInfo, ContentInfo> i(@d.o0 ContentInfo contentInfo, @d.o0 Predicate<ClipData.Item> predicate) {
        return a.a(contentInfo, predicate);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.o0
    public static String k(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @d.o0
    @d.w0(31)
    public static k m(@d.o0 ContentInfo contentInfo) {
        return new k(new f(contentInfo));
    }

    @d.o0
    public ClipData c() {
        return this.f3663a.b();
    }

    @d.q0
    public Bundle d() {
        return this.f3663a.e();
    }

    public int e() {
        return this.f3663a.c();
    }

    @d.q0
    public Uri f() {
        return this.f3663a.a();
    }

    public int g() {
        return this.f3663a.f();
    }

    @d.o0
    public Pair<k, k> j(@d.o0 g1.y<ClipData.Item> yVar) {
        ClipData b7 = this.f3663a.b();
        if (b7.getItemCount() == 1) {
            boolean test = yVar.test(b7.getItemAt(0));
            return Pair.create(test ? this : null, test ? null : this);
        }
        Pair<ClipData, ClipData> h7 = h(b7, yVar);
        return h7.first == null ? Pair.create(null, this) : h7.second == null ? Pair.create(this, null) : Pair.create(new b(this).b((ClipData) h7.first).a(), new b(this).b((ClipData) h7.second).a());
    }

    @d.o0
    @d.w0(31)
    public ContentInfo l() {
        ContentInfo d7 = this.f3663a.d();
        Objects.requireNonNull(d7);
        return androidx.core.view.d.a(d7);
    }

    @d.o0
    public String toString() {
        return this.f3663a.toString();
    }

    @d.w0(31)
    /* loaded from: classes.dex */
    public static final class c implements d {
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f3665a;

        public c(@d.o0 ClipData clipData, int i7) {
            androidx.core.view.i.a();
            this.f3665a = p.a(clipData, i7);
        }

        @Override // androidx.core.view.k.d
        @d.o0
        public k a() {
            ContentInfo build;
            build = this.f3665a.build();
            return new k(new f(build));
        }

        @Override // androidx.core.view.k.d
        public void b(@d.o0 ClipData clipData) {
            this.f3665a.setClip(clipData);
        }

        @Override // androidx.core.view.k.d
        public void c(int i7) {
            this.f3665a.setSource(i7);
        }

        @Override // androidx.core.view.k.d
        public void d(@d.q0 Bundle bundle) {
            this.f3665a.setExtras(bundle);
        }

        @Override // androidx.core.view.k.d
        public void e(@d.q0 Uri uri) {
            this.f3665a.setLinkUri(uri);
        }

        @Override // androidx.core.view.k.d
        public void f(int i7) {
            this.f3665a.setFlags(i7);
        }

        public c(@d.o0 k kVar) {
            androidx.core.view.i.a();
            this.f3665a = androidx.core.view.h.a(kVar.l());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements d {
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public ClipData f3666a;

        /* renamed from: b  reason: collision with root package name */
        public int f3667b;

        /* renamed from: c  reason: collision with root package name */
        public int f3668c;
        @d.q0

        /* renamed from: d  reason: collision with root package name */
        public Uri f3669d;
        @d.q0

        /* renamed from: e  reason: collision with root package name */
        public Bundle f3670e;

        public e(@d.o0 ClipData clipData, int i7) {
            this.f3666a = clipData;
            this.f3667b = i7;
        }

        @Override // androidx.core.view.k.d
        @d.o0
        public k a() {
            return new k(new h(this));
        }

        @Override // androidx.core.view.k.d
        public void b(@d.o0 ClipData clipData) {
            this.f3666a = clipData;
        }

        @Override // androidx.core.view.k.d
        public void c(int i7) {
            this.f3667b = i7;
        }

        @Override // androidx.core.view.k.d
        public void d(@d.q0 Bundle bundle) {
            this.f3670e = bundle;
        }

        @Override // androidx.core.view.k.d
        public void e(@d.q0 Uri uri) {
            this.f3669d = uri;
        }

        @Override // androidx.core.view.k.d
        public void f(int i7) {
            this.f3668c = i7;
        }

        public e(@d.o0 k kVar) {
            this.f3666a = kVar.c();
            this.f3667b = kVar.g();
            this.f3668c = kVar.e();
            this.f3669d = kVar.f();
            this.f3670e = kVar.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public final d f3664a;

        public b(@d.o0 k kVar) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3664a = new c(kVar);
            } else {
                this.f3664a = new e(kVar);
            }
        }

        @d.o0
        public k a() {
            return this.f3664a.a();
        }

        @d.o0
        public b b(@d.o0 ClipData clipData) {
            this.f3664a.b(clipData);
            return this;
        }

        @d.o0
        public b c(@d.q0 Bundle bundle) {
            this.f3664a.d(bundle);
            return this;
        }

        @d.o0
        public b d(int i7) {
            this.f3664a.f(i7);
            return this;
        }

        @d.o0
        public b e(@d.q0 Uri uri) {
            this.f3664a.e(uri);
            return this;
        }

        @d.o0
        public b f(int i7) {
            this.f3664a.c(i7);
            return this;
        }

        public b(@d.o0 ClipData clipData, int i7) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3664a = new c(clipData, i7);
            } else {
                this.f3664a = new e(clipData, i7);
            }
        }
    }
}