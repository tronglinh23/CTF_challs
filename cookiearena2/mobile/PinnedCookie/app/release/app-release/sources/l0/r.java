package l0;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import d.b1;
import d.l1;
import d.q0;
import d.w0;
import i0.x2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k0.o0;
/* loaded from: classes.dex */
public class r {
    public static final String C = "extraPersonCount";
    public static final String D = "extraPerson_";
    public static final String E = "extraLocusId";
    public static final String F = "extraLongLived";
    public static final String G = "extraSliceUri";
    public static final int H = 1;
    public int A;
    public int B;

    /* renamed from: a  reason: collision with root package name */
    public Context f13202a;

    /* renamed from: b  reason: collision with root package name */
    public String f13203b;

    /* renamed from: c  reason: collision with root package name */
    public String f13204c;

    /* renamed from: d  reason: collision with root package name */
    public Intent[] f13205d;

    /* renamed from: e  reason: collision with root package name */
    public ComponentName f13206e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f13207f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f13208g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f13209h;

    /* renamed from: i  reason: collision with root package name */
    public IconCompat f13210i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13211j;

    /* renamed from: k  reason: collision with root package name */
    public x2[] f13212k;

    /* renamed from: l  reason: collision with root package name */
    public Set<String> f13213l;
    @q0

    /* renamed from: m  reason: collision with root package name */
    public o0 f13214m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13215n;

    /* renamed from: o  reason: collision with root package name */
    public int f13216o;

    /* renamed from: p  reason: collision with root package name */
    public PersistableBundle f13217p;

    /* renamed from: q  reason: collision with root package name */
    public Bundle f13218q;

    /* renamed from: r  reason: collision with root package name */
    public long f13219r;

    /* renamed from: s  reason: collision with root package name */
    public UserHandle f13220s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f13221t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f13222u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f13223v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f13224w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f13225x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f13226y = true;

    /* renamed from: z  reason: collision with root package name */
    public boolean f13227z;

    @w0(33)
    /* loaded from: classes.dex */
    public static class a {
        public static void a(@d.o0 ShortcutInfo.Builder builder, int i7) {
            builder.setExcludedFromSurfaces(i7);
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @w0(25)
    public static List<r> c(@d.o0 Context context, @d.o0 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, it.next()).c());
        }
        return arrayList;
    }

    @q0
    @w0(25)
    public static o0 p(@d.o0 ShortcutInfo shortcutInfo) {
        LocusId locusId;
        LocusId locusId2;
        if (Build.VERSION.SDK_INT >= 29) {
            locusId = shortcutInfo.getLocusId();
            if (locusId == null) {
                return null;
            }
            locusId2 = shortcutInfo.getLocusId();
            return o0.d(locusId2);
        }
        return q(shortcutInfo.getExtras());
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    @w0(25)
    public static o0 q(@q0 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(E)) == null) {
            return null;
        }
        return new o0(string);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @l1
    @w0(25)
    public static boolean s(@q0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(F)) {
            return false;
        }
        return persistableBundle.getBoolean(F);
    }

    @w0(25)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    @l1
    public static x2[] u(@d.o0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(C)) {
            return null;
        }
        int i7 = persistableBundle.getInt(C);
        x2[] x2VarArr = new x2[i7];
        int i8 = 0;
        while (i8 < i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(D);
            int i9 = i8 + 1;
            sb.append(i9);
            x2VarArr[i8] = x2.c(persistableBundle.getPersistableBundle(sb.toString()));
            i8 = i9;
        }
        return x2VarArr;
    }

    public boolean A() {
        return this.f13221t;
    }

    public boolean B() {
        return this.f13224w;
    }

    public boolean C() {
        return this.f13222u;
    }

    public boolean D() {
        return this.f13226y;
    }

    public boolean E(int i7) {
        return (i7 & this.B) != 0;
    }

    public boolean F() {
        return this.f13225x;
    }

    public boolean G() {
        return this.f13223v;
    }

    @w0(25)
    public ShortcutInfo H() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f13202a, this.f13203b).setShortLabel(this.f13207f).setIntents(this.f13205d);
        IconCompat iconCompat = this.f13210i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.G(this.f13202a));
        }
        if (!TextUtils.isEmpty(this.f13208g)) {
            intents.setLongLabel(this.f13208g);
        }
        if (!TextUtils.isEmpty(this.f13209h)) {
            intents.setDisabledMessage(this.f13209h);
        }
        ComponentName componentName = this.f13206e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f13213l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f13216o);
        PersistableBundle persistableBundle = this.f13217p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            x2[] x2VarArr = this.f13212k;
            if (x2VarArr != null && x2VarArr.length > 0) {
                int length = x2VarArr.length;
                Person[] personArr = new Person[length];
                for (int i7 = 0; i7 < length; i7++) {
                    personArr[i7] = this.f13212k[i7].k();
                }
                intents.setPersons(personArr);
            }
            o0 o0Var = this.f13214m;
            if (o0Var != null) {
                intents.setLocusId(o0Var.c());
            }
            intents.setLongLived(this.f13215n);
        } else {
            intents.setExtras(b());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.B);
        }
        return intents.build();
    }

    public Intent a(Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f13205d[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f13207f.toString());
        if (this.f13210i != null) {
            Drawable drawable = null;
            if (this.f13211j) {
                PackageManager packageManager = this.f13202a.getPackageManager();
                ComponentName componentName = this.f13206e;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f13202a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f13210i.c(intent, drawable, this.f13202a);
        }
        return intent;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @w0(22)
    public final PersistableBundle b() {
        if (this.f13217p == null) {
            this.f13217p = new PersistableBundle();
        }
        x2[] x2VarArr = this.f13212k;
        if (x2VarArr != null && x2VarArr.length > 0) {
            this.f13217p.putInt(C, x2VarArr.length);
            int i7 = 0;
            while (i7 < this.f13212k.length) {
                PersistableBundle persistableBundle = this.f13217p;
                StringBuilder sb = new StringBuilder();
                sb.append(D);
                int i8 = i7 + 1;
                sb.append(i8);
                persistableBundle.putPersistableBundle(sb.toString(), this.f13212k[i7].n());
                i7 = i8;
            }
        }
        o0 o0Var = this.f13214m;
        if (o0Var != null) {
            this.f13217p.putString(E, o0Var.a());
        }
        this.f13217p.putBoolean(F, this.f13215n);
        return this.f13217p;
    }

    @q0
    public ComponentName d() {
        return this.f13206e;
    }

    @q0
    public Set<String> e() {
        return this.f13213l;
    }

    @q0
    public CharSequence f() {
        return this.f13209h;
    }

    public int g() {
        return this.A;
    }

    public int h() {
        return this.B;
    }

    @q0
    public PersistableBundle i() {
        return this.f13217p;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public IconCompat j() {
        return this.f13210i;
    }

    @d.o0
    public String k() {
        return this.f13203b;
    }

    @d.o0
    public Intent l() {
        return this.f13205d[r0.length - 1];
    }

    @d.o0
    public Intent[] m() {
        Intent[] intentArr = this.f13205d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long n() {
        return this.f13219r;
    }

    @q0
    public o0 o() {
        return this.f13214m;
    }

    @q0
    public CharSequence r() {
        return this.f13208g;
    }

    @d.o0
    public String t() {
        return this.f13204c;
    }

    public int v() {
        return this.f13216o;
    }

    @d.o0
    public CharSequence w() {
        return this.f13207f;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    public Bundle x() {
        return this.f13218q;
    }

    @q0
    public UserHandle y() {
        return this.f13220s;
    }

    public boolean z() {
        return this.f13227z;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final r f13228a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f13229b;

        /* renamed from: c  reason: collision with root package name */
        public Set<String> f13230c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, Map<String, List<String>>> f13231d;

        /* renamed from: e  reason: collision with root package name */
        public Uri f13232e;

        public b(@d.o0 Context context, @d.o0 String str) {
            r rVar = new r();
            this.f13228a = rVar;
            rVar.f13202a = context;
            rVar.f13203b = str;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @d.o0
        public b a(@d.o0 String str) {
            if (this.f13230c == null) {
                this.f13230c = new HashSet();
            }
            this.f13230c.add(str);
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @d.o0
        public b b(@d.o0 String str, @d.o0 String str2, @d.o0 List<String> list) {
            a(str);
            if (!list.isEmpty()) {
                if (this.f13231d == null) {
                    this.f13231d = new HashMap();
                }
                if (this.f13231d.get(str) == null) {
                    this.f13231d.put(str, new HashMap());
                }
                this.f13231d.get(str).put(str2, list);
            }
            return this;
        }

        @d.o0
        public r c() {
            if (TextUtils.isEmpty(this.f13228a.f13207f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            r rVar = this.f13228a;
            Intent[] intentArr = rVar.f13205d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f13229b) {
                if (rVar.f13214m == null) {
                    rVar.f13214m = new o0(rVar.f13203b);
                }
                this.f13228a.f13215n = true;
            }
            if (this.f13230c != null) {
                r rVar2 = this.f13228a;
                if (rVar2.f13213l == null) {
                    rVar2.f13213l = new HashSet();
                }
                this.f13228a.f13213l.addAll(this.f13230c);
            }
            if (this.f13231d != null) {
                r rVar3 = this.f13228a;
                if (rVar3.f13217p == null) {
                    rVar3.f13217p = new PersistableBundle();
                }
                for (String str : this.f13231d.keySet()) {
                    Map<String, List<String>> map = this.f13231d.get(str);
                    this.f13228a.f13217p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f13228a.f13217p.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f13232e != null) {
                r rVar4 = this.f13228a;
                if (rVar4.f13217p == null) {
                    rVar4.f13217p = new PersistableBundle();
                }
                this.f13228a.f13217p.putString(r.G, y0.f.a(this.f13232e));
            }
            return this.f13228a;
        }

        @d.o0
        public b d(@d.o0 ComponentName componentName) {
            this.f13228a.f13206e = componentName;
            return this;
        }

        @d.o0
        public b e() {
            this.f13228a.f13211j = true;
            return this;
        }

        @d.o0
        public b f(@d.o0 Set<String> set) {
            this.f13228a.f13213l = set;
            return this;
        }

        @d.o0
        public b g(@d.o0 CharSequence charSequence) {
            this.f13228a.f13209h = charSequence;
            return this;
        }

        @d.o0
        public b h(int i7) {
            this.f13228a.B = i7;
            return this;
        }

        @d.o0
        public b i(@d.o0 PersistableBundle persistableBundle) {
            this.f13228a.f13217p = persistableBundle;
            return this;
        }

        @d.o0
        public b j(IconCompat iconCompat) {
            this.f13228a.f13210i = iconCompat;
            return this;
        }

        @d.o0
        public b k(@d.o0 Intent intent) {
            return l(new Intent[]{intent});
        }

        @d.o0
        public b l(@d.o0 Intent[] intentArr) {
            this.f13228a.f13205d = intentArr;
            return this;
        }

        @d.o0
        public b m() {
            this.f13229b = true;
            return this;
        }

        @d.o0
        public b n(@q0 o0 o0Var) {
            this.f13228a.f13214m = o0Var;
            return this;
        }

        @d.o0
        public b o(@d.o0 CharSequence charSequence) {
            this.f13228a.f13208g = charSequence;
            return this;
        }

        @d.o0
        @Deprecated
        public b p() {
            this.f13228a.f13215n = true;
            return this;
        }

        @d.o0
        public b q(boolean z6) {
            this.f13228a.f13215n = z6;
            return this;
        }

        @d.o0
        public b r(@d.o0 x2 x2Var) {
            return s(new x2[]{x2Var});
        }

        @d.o0
        public b s(@d.o0 x2[] x2VarArr) {
            this.f13228a.f13212k = x2VarArr;
            return this;
        }

        @d.o0
        public b t(int i7) {
            this.f13228a.f13216o = i7;
            return this;
        }

        @d.o0
        public b u(@d.o0 CharSequence charSequence) {
            this.f13228a.f13207f = charSequence;
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @d.o0
        public b v(@d.o0 Uri uri) {
            this.f13232e = uri;
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @d.o0
        public b w(@d.o0 Bundle bundle) {
            this.f13228a.f13218q = (Bundle) g1.s.l(bundle);
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public b(@d.o0 r rVar) {
            r rVar2 = new r();
            this.f13228a = rVar2;
            rVar2.f13202a = rVar.f13202a;
            rVar2.f13203b = rVar.f13203b;
            rVar2.f13204c = rVar.f13204c;
            Intent[] intentArr = rVar.f13205d;
            rVar2.f13205d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            rVar2.f13206e = rVar.f13206e;
            rVar2.f13207f = rVar.f13207f;
            rVar2.f13208g = rVar.f13208g;
            rVar2.f13209h = rVar.f13209h;
            rVar2.A = rVar.A;
            rVar2.f13210i = rVar.f13210i;
            rVar2.f13211j = rVar.f13211j;
            rVar2.f13220s = rVar.f13220s;
            rVar2.f13219r = rVar.f13219r;
            rVar2.f13221t = rVar.f13221t;
            rVar2.f13222u = rVar.f13222u;
            rVar2.f13223v = rVar.f13223v;
            rVar2.f13224w = rVar.f13224w;
            rVar2.f13225x = rVar.f13225x;
            rVar2.f13226y = rVar.f13226y;
            rVar2.f13214m = rVar.f13214m;
            rVar2.f13215n = rVar.f13215n;
            rVar2.f13227z = rVar.f13227z;
            rVar2.f13216o = rVar.f13216o;
            x2[] x2VarArr = rVar.f13212k;
            if (x2VarArr != null) {
                rVar2.f13212k = (x2[]) Arrays.copyOf(x2VarArr, x2VarArr.length);
            }
            if (rVar.f13213l != null) {
                rVar2.f13213l = new HashSet(rVar.f13213l);
            }
            PersistableBundle persistableBundle = rVar.f13217p;
            if (persistableBundle != null) {
                rVar2.f13217p = persistableBundle;
            }
            rVar2.B = rVar.B;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @w0(25)
        public b(@d.o0 Context context, @d.o0 ShortcutInfo shortcutInfo) {
            boolean isCached;
            int disabledReason;
            r rVar = new r();
            this.f13228a = rVar;
            rVar.f13202a = context;
            rVar.f13203b = shortcutInfo.getId();
            rVar.f13204c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            rVar.f13205d = (Intent[]) Arrays.copyOf(intents, intents.length);
            rVar.f13206e = shortcutInfo.getActivity();
            rVar.f13207f = shortcutInfo.getShortLabel();
            rVar.f13208g = shortcutInfo.getLongLabel();
            rVar.f13209h = shortcutInfo.getDisabledMessage();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                disabledReason = shortcutInfo.getDisabledReason();
                rVar.A = disabledReason;
            } else {
                rVar.A = shortcutInfo.isEnabled() ? 0 : 3;
            }
            rVar.f13213l = shortcutInfo.getCategories();
            rVar.f13212k = r.u(shortcutInfo.getExtras());
            rVar.f13220s = shortcutInfo.getUserHandle();
            rVar.f13219r = shortcutInfo.getLastChangedTimestamp();
            if (i7 >= 30) {
                isCached = shortcutInfo.isCached();
                rVar.f13221t = isCached;
            }
            rVar.f13222u = shortcutInfo.isDynamic();
            rVar.f13223v = shortcutInfo.isPinned();
            rVar.f13224w = shortcutInfo.isDeclaredInManifest();
            rVar.f13225x = shortcutInfo.isImmutable();
            rVar.f13226y = shortcutInfo.isEnabled();
            rVar.f13227z = shortcutInfo.hasKeyFieldsOnly();
            rVar.f13214m = r.p(shortcutInfo);
            rVar.f13216o = shortcutInfo.getRank();
            rVar.f13217p = shortcutInfo.getExtras();
        }
    }
}
