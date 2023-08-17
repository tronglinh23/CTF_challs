package i0;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class q3 {

    /* renamed from: h  reason: collision with root package name */
    public static final String f10842h = "android.remoteinput.results";

    /* renamed from: i  reason: collision with root package name */
    public static final String f10843i = "android.remoteinput.resultsData";

    /* renamed from: j  reason: collision with root package name */
    public static final String f10844j = "android.remoteinput.dataTypeResultsData";

    /* renamed from: k  reason: collision with root package name */
    public static final String f10845k = "android.remoteinput.resultsSource";

    /* renamed from: l  reason: collision with root package name */
    public static final int f10846l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f10847m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f10848n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f10849o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f10850p = 2;

    /* renamed from: a  reason: collision with root package name */
    public final String f10851a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f10852b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence[] f10853c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10854d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10855e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f10856f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<String> f10857g;

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static ClipData a(Intent intent) {
            return intent.getClipData();
        }

        @d.u
        public static void b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    @d.w0(20)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(q3 q3Var) {
            RemoteInput.Builder addExtras = new RemoteInput.Builder(q3Var.o()).setLabel(q3Var.n()).setChoices(q3Var.h()).setAllowFreeFormInput(q3Var.f()).addExtras(q3Var.m());
            Set<String> g7 = q3Var.g();
            if (g7 != null) {
                Iterator<String> it = g7.iterator();
                while (it.hasNext()) {
                    c.d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                e.b(addExtras, q3Var.k());
            }
            return addExtras.build();
        }

        public static q3 c(Object obj) {
            RemoteInput remoteInput = (RemoteInput) obj;
            f a7 = new f(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            Set<String> b7 = c.b(remoteInput);
            if (b7 != null) {
                Iterator<String> it = b7.iterator();
                while (it.hasNext()) {
                    a7.d(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a7.g(e.a(remoteInput));
            }
            return a7.b();
        }

        @d.u
        public static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static void a(q3 q3Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(q3.c(q3Var), intent, map);
        }

        @d.u
        public static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @d.u
        public static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @d.u
        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z6) {
            return builder.setAllowDataType(str, z6);
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static int a(Intent intent) {
            int resultsSource;
            resultsSource = RemoteInput.getResultsSource(intent);
            return resultsSource;
        }

        @d.u
        public static void b(Intent intent, int i7) {
            RemoteInput.setResultsSource(intent, i7);
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static int a(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        @d.u
        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i7) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i7);
            return editChoicesBeforeSending;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final String f10858a;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f10861d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence[] f10862e;

        /* renamed from: b  reason: collision with root package name */
        public final Set<String> f10859b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f10860c = new Bundle();

        /* renamed from: f  reason: collision with root package name */
        public boolean f10863f = true;

        /* renamed from: g  reason: collision with root package name */
        public int f10864g = 0;

        public f(@d.o0 String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f10858a = str;
        }

        @d.o0
        public f a(@d.o0 Bundle bundle) {
            if (bundle != null) {
                this.f10860c.putAll(bundle);
            }
            return this;
        }

        @d.o0
        public q3 b() {
            return new q3(this.f10858a, this.f10861d, this.f10862e, this.f10863f, this.f10864g, this.f10860c, this.f10859b);
        }

        @d.o0
        public Bundle c() {
            return this.f10860c;
        }

        @d.o0
        public f d(@d.o0 String str, boolean z6) {
            if (z6) {
                this.f10859b.add(str);
            } else {
                this.f10859b.remove(str);
            }
            return this;
        }

        @d.o0
        public f e(boolean z6) {
            this.f10863f = z6;
            return this;
        }

        @d.o0
        public f f(@d.q0 CharSequence[] charSequenceArr) {
            this.f10862e = charSequenceArr;
            return this;
        }

        @d.o0
        public f g(int i7) {
            this.f10864g = i7;
            return this;
        }

        @d.o0
        public f h(@d.q0 CharSequence charSequence) {
            this.f10861d = charSequence;
            return this;
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface h {
    }

    public q3(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z6, int i7, Bundle bundle, Set<String> set) {
        this.f10851a = str;
        this.f10852b = charSequence;
        this.f10853c = charSequenceArr;
        this.f10854d = z6;
        this.f10855e = i7;
        this.f10856f = bundle;
        this.f10857g = set;
        if (k() == 2 && !f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(@d.o0 q3 q3Var, @d.o0 Intent intent, @d.o0 Map<String, Uri> map) {
        c.a(q3Var, intent, map);
    }

    public static void b(@d.o0 q3[] q3VarArr, @d.o0 Intent intent, @d.o0 Bundle bundle) {
        b.a(d(q3VarArr), intent, bundle);
    }

    @d.w0(20)
    public static RemoteInput c(q3 q3Var) {
        return b.b(q3Var);
    }

    @d.w0(20)
    public static RemoteInput[] d(q3[] q3VarArr) {
        if (q3VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[q3VarArr.length];
        for (int i7 = 0; i7 < q3VarArr.length; i7++) {
            remoteInputArr[i7] = c(q3VarArr[i7]);
        }
        return remoteInputArr;
    }

    @d.w0(20)
    public static q3 e(RemoteInput remoteInput) {
        return b.c(remoteInput);
    }

    @d.w0(16)
    public static Intent i(Intent intent) {
        ClipData a7 = a.a(intent);
        if (a7 == null) {
            return null;
        }
        ClipDescription description = a7.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f10842h)) {
            return a7.getItemAt(0).getIntent();
        }
        return null;
    }

    @d.q0
    public static Map<String, Uri> j(@d.o0 Intent intent, @d.o0 String str) {
        return c.c(intent, str);
    }

    public static String l(String str) {
        return f10844j + str;
    }

    @d.q0
    public static Bundle p(@d.o0 Intent intent) {
        return b.d(intent);
    }

    public static int q(@d.o0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(intent);
        }
        Intent i7 = i(intent);
        if (i7 == null) {
            return 0;
        }
        return i7.getExtras().getInt(f10845k, 0);
    }

    public static void s(@d.o0 Intent intent, int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            d.b(intent, i7);
            return;
        }
        Intent i8 = i(intent);
        if (i8 == null) {
            i8 = new Intent();
        }
        i8.putExtra(f10845k, i7);
        a.b(intent, ClipData.newIntent(f10842h, i8));
    }

    public boolean f() {
        return this.f10854d;
    }

    @d.q0
    public Set<String> g() {
        return this.f10857g;
    }

    @d.q0
    public CharSequence[] h() {
        return this.f10853c;
    }

    public int k() {
        return this.f10855e;
    }

    @d.o0
    public Bundle m() {
        return this.f10856f;
    }

    @d.q0
    public CharSequence n() {
        return this.f10852b;
    }

    @d.o0
    public String o() {
        return this.f10851a;
    }

    public boolean r() {
        return (f() || (h() != null && h().length != 0) || g() == null || g().isEmpty()) ? false : true;
    }
}