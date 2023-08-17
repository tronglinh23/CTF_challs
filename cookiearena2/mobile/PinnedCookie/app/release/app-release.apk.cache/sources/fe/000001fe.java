package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d extends DataSetObservable {
    public static final Object A = new Object();
    public static final Map<String, d> B = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f1512n = false;

    /* renamed from: o  reason: collision with root package name */
    public static final String f1513o = "d";

    /* renamed from: p  reason: collision with root package name */
    public static final String f1514p = "historical-records";

    /* renamed from: q  reason: collision with root package name */
    public static final String f1515q = "historical-record";

    /* renamed from: r  reason: collision with root package name */
    public static final String f1516r = "activity";

    /* renamed from: s  reason: collision with root package name */
    public static final String f1517s = "time";

    /* renamed from: t  reason: collision with root package name */
    public static final String f1518t = "weight";

    /* renamed from: u  reason: collision with root package name */
    public static final String f1519u = "activity_choser_model_history.xml";

    /* renamed from: v  reason: collision with root package name */
    public static final int f1520v = 50;

    /* renamed from: w  reason: collision with root package name */
    public static final int f1521w = 5;

    /* renamed from: x  reason: collision with root package name */
    public static final float f1522x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    public static final String f1523y = ".xml";

    /* renamed from: z  reason: collision with root package name */
    public static final int f1524z = -1;

    /* renamed from: d  reason: collision with root package name */
    public final Context f1528d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1529e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f1530f;

    /* renamed from: m  reason: collision with root package name */
    public f f1537m;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1525a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f1526b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<e> f1527c = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public c f1531g = new C0027d();

    /* renamed from: h  reason: collision with root package name */
    public int f1532h = 50;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1533i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1534j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1535k = true;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1536l = false;

    /* loaded from: classes.dex */
    public interface a {
        void setActivityChooserModel(d dVar);
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: k  reason: collision with root package name */
        public final ResolveInfo f1538k;

        /* renamed from: l  reason: collision with root package name */
        public float f1539l;

        public b(ResolveInfo resolveInfo) {
            this.f1538k = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.f1539l) - Float.floatToIntBits(this.f1539l);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.f1539l) == Float.floatToIntBits(((b) obj).f1539l);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1539l) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f1538k.toString() + "; weight:" + new BigDecimal(this.f1539l) + "]";
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    /* renamed from: androidx.appcompat.widget.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0027d implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final float f1540b = 0.95f;

        /* renamed from: a  reason: collision with root package name */
        public final Map<ComponentName, b> f1541a = new HashMap();

        @Override // androidx.appcompat.widget.d.c
        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f1541a;
            map.clear();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                b bVar = list.get(i7);
                bVar.f1539l = 0.0f;
                ActivityInfo activityInfo = bVar.f1538k.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f7 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f1542a);
                if (bVar2 != null) {
                    bVar2.f1539l += eVar.f1544c * f7;
                    f7 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f1542a;

        /* renamed from: b  reason: collision with root package name */
        public final long f1543b;

        /* renamed from: c  reason: collision with root package name */
        public final float f1544c;

        public e(String str, long j7, float f7) {
            this(ComponentName.unflattenFromString(str), j7, f7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                ComponentName componentName = this.f1542a;
                if (componentName == null) {
                    if (eVar.f1542a != null) {
                        return false;
                    }
                } else if (!componentName.equals(eVar.f1542a)) {
                    return false;
                }
                return this.f1543b == eVar.f1543b && Float.floatToIntBits(this.f1544c) == Float.floatToIntBits(eVar.f1544c);
            }
            return false;
        }

        public int hashCode() {
            ComponentName componentName = this.f1542a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j7 = this.f1543b;
            return ((((hashCode + 31) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + Float.floatToIntBits(this.f1544c);
        }

        public String toString() {
            return "[; activity:" + this.f1542a + "; time:" + this.f1543b + "; weight:" + new BigDecimal(this.f1544c) + "]";
        }

        public e(ComponentName componentName, long j7, float f7) {
            this.f1542a = componentName;
            this.f1543b = j7;
            this.f1544c = f7;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a(d dVar, Intent intent);
    }

    /* loaded from: classes.dex */
    public final class g extends AsyncTask<Object, Void, Void> {
        public g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
            if (r15 != null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
            r15.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
            if (r15 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
            if (r15 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
            if (r15 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
            return null;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d.g.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    public d(Context context, String str) {
        this.f1528d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f1523y)) {
            this.f1529e = str;
            return;
        }
        this.f1529e = str + f1523y;
    }

    public static d d(Context context, String str) {
        d dVar;
        synchronized (A) {
            Map<String, d> map = B;
            dVar = map.get(str);
            if (dVar == null) {
                dVar = new d(context, str);
                map.put(str, dVar);
            }
        }
        return dVar;
    }

    public final boolean a(e eVar) {
        boolean add = this.f1527c.add(eVar);
        if (add) {
            this.f1535k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return add;
    }

    public Intent b(int i7) {
        synchronized (this.f1525a) {
            if (this.f1530f == null) {
                return null;
            }
            c();
            ActivityInfo activityInfo = this.f1526b.get(i7).f1538k.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f1530f);
            intent.setComponent(componentName);
            if (this.f1537m != null) {
                if (this.f1537m.a(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new e(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final void c() {
        boolean l7 = l() | o();
        n();
        if (l7) {
            v();
            notifyChanged();
        }
    }

    public ResolveInfo e(int i7) {
        ResolveInfo resolveInfo;
        synchronized (this.f1525a) {
            c();
            resolveInfo = this.f1526b.get(i7).f1538k;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f1525a) {
            c();
            size = this.f1526b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f1525a) {
            c();
            List<b> list = this.f1526b;
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (list.get(i7).f1538k == resolveInfo) {
                    return i7;
                }
            }
            return -1;
        }
    }

    public ResolveInfo h() {
        synchronized (this.f1525a) {
            c();
            if (this.f1526b.isEmpty()) {
                return null;
            }
            return this.f1526b.get(0).f1538k;
        }
    }

    public int i() {
        int i7;
        synchronized (this.f1525a) {
            i7 = this.f1532h;
        }
        return i7;
    }

    public int j() {
        int size;
        synchronized (this.f1525a) {
            c();
            size = this.f1527c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f1525a) {
            intent = this.f1530f;
        }
        return intent;
    }

    public final boolean l() {
        if (!this.f1536l || this.f1530f == null) {
            return false;
        }
        this.f1536l = false;
        this.f1526b.clear();
        List<ResolveInfo> queryIntentActivities = this.f1528d.getPackageManager().queryIntentActivities(this.f1530f, 0);
        int size = queryIntentActivities.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f1526b.add(new b(queryIntentActivities.get(i7)));
        }
        return true;
    }

    public final void m() {
        if (!this.f1534j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f1535k) {
            this.f1535k = false;
            if (TextUtils.isEmpty(this.f1529e)) {
                return;
            }
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1527c), this.f1529e);
        }
    }

    public final void n() {
        int size = this.f1527c.size() - this.f1532h;
        if (size <= 0) {
            return;
        }
        this.f1535k = true;
        for (int i7 = 0; i7 < size; i7++) {
            this.f1527c.remove(0);
        }
    }

    public final boolean o() {
        if (this.f1533i && this.f1535k && !TextUtils.isEmpty(this.f1529e)) {
            this.f1533i = false;
            this.f1534j = true;
            p();
            return true;
        }
        return false;
    }

    public final void p() {
        XmlPullParser newPullParser;
        try {
            FileInputStream openFileInput = this.f1528d.openFileInput(this.f1529e);
            try {
                try {
                    try {
                        newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        for (int i7 = 0; i7 != 1 && i7 != 2; i7 = newPullParser.next()) {
                        }
                    } catch (XmlPullParserException e7) {
                        Log.e(f1513o, "Error reading historical recrod file: " + this.f1529e, e7);
                        if (openFileInput == null) {
                            return;
                        }
                    }
                } catch (IOException e8) {
                    Log.e(f1513o, "Error reading historical recrod file: " + this.f1529e, e8);
                    if (openFileInput == null) {
                        return;
                    }
                }
                if (!f1514p.equals(newPullParser.getName())) {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
                List<e> list = this.f1527c;
                list.clear();
                while (true) {
                    int next = newPullParser.next();
                    if (next == 1) {
                        if (openFileInput == null) {
                            return;
                        }
                    } else if (next != 3 && next != 4) {
                        if (!f1515q.equals(newPullParser.getName())) {
                            throw new XmlPullParserException("Share records file not well-formed.");
                        }
                        list.add(new e(newPullParser.getAttributeValue(null, f1516r), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                    }
                }
                try {
                    openFileInput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    public void q(c cVar) {
        synchronized (this.f1525a) {
            if (this.f1531g == cVar) {
                return;
            }
            this.f1531g = cVar;
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void r(int i7) {
        synchronized (this.f1525a) {
            c();
            b bVar = this.f1526b.get(i7);
            b bVar2 = this.f1526b.get(0);
            float f7 = bVar2 != null ? (bVar2.f1539l - bVar.f1539l) + 5.0f : 1.0f;
            ActivityInfo activityInfo = bVar.f1538k.activityInfo;
            a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f7));
        }
    }

    public void s(int i7) {
        synchronized (this.f1525a) {
            if (this.f1532h == i7) {
                return;
            }
            this.f1532h = i7;
            n();
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f1525a) {
            if (this.f1530f == intent) {
                return;
            }
            this.f1530f = intent;
            this.f1536l = true;
            c();
        }
    }

    public void u(f fVar) {
        synchronized (this.f1525a) {
            this.f1537m = fVar;
        }
    }

    public final boolean v() {
        if (this.f1531g == null || this.f1530f == null || this.f1526b.isEmpty() || this.f1527c.isEmpty()) {
            return false;
        }
        this.f1531g.a(this.f1530f, this.f1526b, Collections.unmodifiableList(this.f1527c));
        return true;
    }
}