package i0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class v3 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10930a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b  reason: collision with root package name */
    public static final String f10931b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: c  reason: collision with root package name */
    public static final String f10932c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: d  reason: collision with root package name */
    public static final String f10933d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: e  reason: collision with root package name */
    public static final String f10934e = ".sharecompat_";

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static String a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @d.u
        public static void b(@d.o0 Intent intent, @d.o0 ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(k0.i.f11472b), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i7 = 1; i7 < size; i7++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i7)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @d.u
        public static void c(@d.o0 Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public final Context f10935a;
        @d.o0

        /* renamed from: b  reason: collision with root package name */
        public final Intent f10936b;
        @d.q0

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f10937c;
        @d.q0

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<String> f10938d;
        @d.q0

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<String> f10939e;
        @d.q0

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<String> f10940f;
        @d.q0

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<Uri> f10941g;

        public b(@d.o0 Context context) {
            Activity activity;
            this.f10935a = (Context) g1.s.l(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f10936b = action;
            action.putExtra(v3.f10930a, context.getPackageName());
            action.putExtra(v3.f10931b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f10936b.putExtra(v3.f10932c, componentName);
                this.f10936b.putExtra(v3.f10933d, componentName);
            }
        }

        @d.o0
        @Deprecated
        public static b k(@d.o0 Activity activity) {
            return new b(activity);
        }

        @d.o0
        public b a(@d.o0 String str) {
            if (this.f10940f == null) {
                this.f10940f = new ArrayList<>();
            }
            this.f10940f.add(str);
            return this;
        }

        @d.o0
        public b b(@d.o0 String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @d.o0
        public b c(@d.o0 String str) {
            if (this.f10939e == null) {
                this.f10939e = new ArrayList<>();
            }
            this.f10939e.add(str);
            return this;
        }

        @d.o0
        public b d(@d.o0 String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @d.o0
        public b e(@d.o0 String str) {
            if (this.f10938d == null) {
                this.f10938d = new ArrayList<>();
            }
            this.f10938d.add(str);
            return this;
        }

        @d.o0
        public b f(@d.o0 String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @d.o0
        public b g(@d.o0 Uri uri) {
            if (this.f10941g == null) {
                this.f10941g = new ArrayList<>();
            }
            this.f10941g.add(uri);
            return this;
        }

        public final void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f10936b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f10936b.putExtra(str, strArr);
        }

        public final void i(@d.q0 String str, @d.o0 String[] strArr) {
            Intent m7 = m();
            String[] stringArrayExtra = m7.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            m7.putExtra(str, strArr2);
        }

        @d.o0
        public Intent j() {
            return Intent.createChooser(m(), this.f10937c);
        }

        @d.o0
        public Context l() {
            return this.f10935a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
            if (r0.size() > 1) goto L17;
         */
        @d.o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.content.Intent m() {
            /*
                r4 = this;
                java.util.ArrayList<java.lang.String> r0 = r4.f10938d
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.String r2 = "android.intent.extra.EMAIL"
                r4.h(r2, r0)
                r4.f10938d = r1
            Lc:
                java.util.ArrayList<java.lang.String> r0 = r4.f10939e
                if (r0 == 0) goto L17
                java.lang.String r2 = "android.intent.extra.CC"
                r4.h(r2, r0)
                r4.f10939e = r1
            L17:
                java.util.ArrayList<java.lang.String> r0 = r4.f10940f
                if (r0 == 0) goto L22
                java.lang.String r2 = "android.intent.extra.BCC"
                r4.h(r2, r0)
                r4.f10940f = r1
            L22:
                java.util.ArrayList<android.net.Uri> r0 = r4.f10941g
                r1 = 0
                if (r0 == 0) goto L2f
                int r0 = r0.size()
                r2 = 1
                if (r0 <= r2) goto L2f
                goto L30
            L2f:
                r2 = r1
            L30:
                java.lang.String r0 = "android.intent.extra.STREAM"
                if (r2 != 0) goto L65
                android.content.Intent r2 = r4.f10936b
                java.lang.String r3 = "android.intent.action.SEND"
                r2.setAction(r3)
                java.util.ArrayList<android.net.Uri> r2 = r4.f10941g
                if (r2 == 0) goto L5a
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L5a
                android.content.Intent r2 = r4.f10936b
                java.util.ArrayList<android.net.Uri> r3 = r4.f10941g
                java.lang.Object r1 = r3.get(r1)
                android.os.Parcelable r1 = (android.os.Parcelable) r1
                r2.putExtra(r0, r1)
                android.content.Intent r0 = r4.f10936b
                java.util.ArrayList<android.net.Uri> r1 = r4.f10941g
                i0.v3.a.b(r0, r1)
                goto L7a
            L5a:
                android.content.Intent r1 = r4.f10936b
                r1.removeExtra(r0)
                android.content.Intent r0 = r4.f10936b
                i0.v3.a.c(r0)
                goto L7a
            L65:
                android.content.Intent r1 = r4.f10936b
                java.lang.String r2 = "android.intent.action.SEND_MULTIPLE"
                r1.setAction(r2)
                android.content.Intent r1 = r4.f10936b
                java.util.ArrayList<android.net.Uri> r2 = r4.f10941g
                r1.putParcelableArrayListExtra(r0, r2)
                android.content.Intent r0 = r4.f10936b
                java.util.ArrayList<android.net.Uri> r1 = r4.f10941g
                i0.v3.a.b(r0, r1)
            L7a:
                android.content.Intent r0 = r4.f10936b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.v3.b.m():android.content.Intent");
        }

        @d.o0
        public b n(@d.f1 int i7) {
            return o(this.f10935a.getText(i7));
        }

        @d.o0
        public b o(@d.q0 CharSequence charSequence) {
            this.f10937c = charSequence;
            return this;
        }

        @d.o0
        public b p(@d.q0 String[] strArr) {
            this.f10936b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @d.o0
        public b q(@d.q0 String[] strArr) {
            this.f10936b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @d.o0
        public b r(@d.q0 String[] strArr) {
            if (this.f10938d != null) {
                this.f10938d = null;
            }
            this.f10936b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @d.o0
        public b s(@d.q0 String str) {
            this.f10936b.putExtra(k0.i.f11472b, str);
            if (!this.f10936b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @d.o0
        public b t(@d.q0 Uri uri) {
            this.f10941g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @d.o0
        public b u(@d.q0 String str) {
            this.f10936b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @d.o0
        public b v(@d.q0 CharSequence charSequence) {
            this.f10936b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @d.o0
        public b w(@d.q0 String str) {
            this.f10936b.setType(str);
            return this;
        }

        public void x() {
            this.f10935a.startActivity(j());
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: f  reason: collision with root package name */
        public static final String f10942f = "IntentReader";
        @d.o0

        /* renamed from: a  reason: collision with root package name */
        public final Context f10943a;
        @d.o0

        /* renamed from: b  reason: collision with root package name */
        public final Intent f10944b;
        @d.q0

        /* renamed from: c  reason: collision with root package name */
        public final String f10945c;
        @d.q0

        /* renamed from: d  reason: collision with root package name */
        public final ComponentName f10946d;
        @d.q0

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<Uri> f10947e;

        public c(@d.o0 Activity activity) {
            this((Context) g1.s.l(activity), activity.getIntent());
        }

        @d.o0
        @Deprecated
        public static c a(@d.o0 Activity activity) {
            return new c(activity);
        }

        public static void t(StringBuilder sb, CharSequence charSequence, int i7, int i8) {
            while (i7 < i8) {
                char charAt = charSequence.charAt(i7);
                if (charAt == '<') {
                    sb.append("&lt;");
                } else if (charAt == '>') {
                    sb.append("&gt;");
                } else if (charAt == '&') {
                    sb.append("&amp;");
                } else if (charAt > '~' || charAt < ' ') {
                    sb.append("&#");
                    sb.append((int) charAt);
                    sb.append(";");
                } else if (charAt == ' ') {
                    while (true) {
                        int i9 = i7 + 1;
                        if (i9 >= i8 || charSequence.charAt(i9) != ' ') {
                            break;
                        }
                        sb.append("&nbsp;");
                        i7 = i9;
                    }
                    sb.append(' ');
                } else {
                    sb.append(charAt);
                }
                i7++;
            }
        }

        @d.q0
        public ComponentName b() {
            return this.f10946d;
        }

        @d.q0
        public Drawable c() {
            if (this.f10946d == null) {
                return null;
            }
            try {
                return this.f10943a.getPackageManager().getActivityIcon(this.f10946d);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e(f10942f, "Could not retrieve icon for calling activity", e7);
                return null;
            }
        }

        @d.q0
        public Drawable d() {
            if (this.f10945c == null) {
                return null;
            }
            try {
                return this.f10943a.getPackageManager().getApplicationIcon(this.f10945c);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e(f10942f, "Could not retrieve icon for calling application", e7);
                return null;
            }
        }

        @d.q0
        public CharSequence e() {
            if (this.f10945c == null) {
                return null;
            }
            PackageManager packageManager = this.f10943a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f10945c, 0));
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e(f10942f, "Could not retrieve label for calling application", e7);
                return null;
            }
        }

        @d.q0
        public String f() {
            return this.f10945c;
        }

        @d.q0
        public String[] g() {
            return this.f10944b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @d.q0
        public String[] h() {
            return this.f10944b.getStringArrayExtra("android.intent.extra.CC");
        }

        @d.q0
        public String[] i() {
            return this.f10944b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @d.q0
        public String j() {
            String stringExtra = this.f10944b.getStringExtra(k0.i.f11472b);
            if (stringExtra == null) {
                CharSequence o6 = o();
                return o6 instanceof Spanned ? Html.toHtml((Spanned) o6) : o6 != null ? a.a(o6) : stringExtra;
            }
            return stringExtra;
        }

        @d.q0
        public Uri k() {
            return (Uri) this.f10944b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @d.q0
        public Uri l(int i7) {
            if (this.f10947e == null && q()) {
                this.f10947e = this.f10944b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f10947e;
            if (arrayList != null) {
                return arrayList.get(i7);
            }
            if (i7 == 0) {
                return (Uri) this.f10944b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i7);
        }

        public int m() {
            if (this.f10947e == null && q()) {
                this.f10947e = this.f10944b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f10947e;
            return arrayList != null ? arrayList.size() : this.f10944b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @d.q0
        public String n() {
            return this.f10944b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @d.q0
        public CharSequence o() {
            return this.f10944b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @d.q0
        public String p() {
            return this.f10944b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f10944b.getAction());
        }

        public boolean r() {
            String action = this.f10944b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f10944b.getAction());
        }

        public c(@d.o0 Context context, @d.o0 Intent intent) {
            this.f10943a = (Context) g1.s.l(context);
            this.f10944b = (Intent) g1.s.l(intent);
            this.f10945c = v3.f(intent);
            this.f10946d = v3.d(intent);
        }
    }

    @Deprecated
    public static void a(@d.o0 Menu menu, @d.d0 int i7, @d.o0 b bVar) {
        MenuItem findItem = menu.findItem(i7);
        if (findItem != null) {
            b(findItem, bVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i7 + " in the supplied menu");
    }

    @Deprecated
    public static void b(@d.o0 MenuItem menuItem, @d.o0 b bVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(bVar.l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f10934e + bVar.l().getClass().getName());
        shareActionProvider.setShareIntent(bVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @d.q0
    public static ComponentName c(@d.o0 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @d.q0
    public static ComponentName d(@d.o0 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f10932c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f10933d) : componentName;
    }

    @d.q0
    public static String e(@d.o0 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : f(intent);
    }

    @d.q0
    public static String f(@d.o0 Intent intent) {
        String stringExtra = intent.getStringExtra(f10930a);
        return stringExtra == null ? intent.getStringExtra(f10931b) : stringExtra;
    }
}
