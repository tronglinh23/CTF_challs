package l0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import d.b1;
import d.l1;
import d.m1;
import d.o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13247a = "ShortcutXmlParser";

    /* renamed from: b  reason: collision with root package name */
    public static final String f13248b = "android.app.shortcuts";

    /* renamed from: c  reason: collision with root package name */
    public static final String f13249c = "shortcut";

    /* renamed from: d  reason: collision with root package name */
    public static final String f13250d = "shortcutId";

    /* renamed from: e  reason: collision with root package name */
    public static volatile ArrayList<String> f13251e;

    /* renamed from: f  reason: collision with root package name */
    public static final Object f13252f = new Object();

    public static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(m0.p.f13469a, str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @m1
    @o0
    public static List<String> b(@o0 Context context) {
        if (f13251e == null) {
            synchronized (f13252f) {
                if (f13251e == null) {
                    f13251e = new ArrayList<>();
                    f13251e.addAll(e(context));
                }
            }
        }
        return f13251e;
    }

    @o0
    public static XmlResourceParser c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f13248b);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @l1
    @o0
    public static List<String> d(@o0 XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String a7;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f13249c.equals(name) && (a7 = a(xmlPullParser, f13250d)) != null) {
                arrayList.add(a7);
            }
        }
        return arrayList;
    }

    @o0
    public static Set<String> e(@o0 Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f13248b)) {
                        XmlResourceParser c7 = c(context, activityInfo);
                        hashSet.addAll(d(c7));
                        if (c7 != null) {
                            c7.close();
                        }
                    }
                }
            } catch (Exception e7) {
                Log.e(f13247a, "Failed to parse the Xml resource: ", e7);
            }
        }
        return hashSet;
    }
}
