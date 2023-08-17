package m0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import d.b1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import f0.a;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f13429a = 400;

    /* renamed from: b  reason: collision with root package name */
    public static final int f13430b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f13431c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f13432d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f13433e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f13434f = 500;

    @w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static int a(TypedArray typedArray, int i7) {
            return typedArray.getType(i7);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public static final class d implements b {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final e[] f13435a;

        public d(@o0 e[] eVarArr) {
            this.f13435a = eVarArr;
        }

        @o0
        public e[] a() {
            return this.f13435a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final String f13436a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13437b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13438c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13439d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13440e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13441f;

        public e(@o0 String str, int i7, boolean z6, @q0 String str2, int i8, int i9) {
            this.f13436a = str;
            this.f13437b = i7;
            this.f13438c = z6;
            this.f13439d = str2;
            this.f13440e = i8;
            this.f13441f = i9;
        }

        @o0
        public String a() {
            return this.f13436a;
        }

        public int b() {
            return this.f13441f;
        }

        public int c() {
            return this.f13440e;
        }

        @q0
        public String d() {
            return this.f13439d;
        }

        public int e() {
            return this.f13437b;
        }

        public boolean f() {
            return this.f13438c;
        }
    }

    public static int a(TypedArray typedArray, int i7) {
        return a.a(typedArray, i7);
    }

    @q0
    public static b b(@o0 XmlPullParser xmlPullParser, @o0 Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @o0
    public static List<List<byte[]>> c(@o0 Resources resources, @d.e int i7) {
        if (i7 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i7)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    @q0
    public static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @q0
    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.f9765j);
        String string = obtainAttributes.getString(a.j.f9766k);
        String string2 = obtainAttributes.getString(a.j.f9770o);
        String string3 = obtainAttributes.getString(a.j.f9771p);
        int resourceId = obtainAttributes.getResourceId(a.j.f9767l, 0);
        int integer = obtainAttributes.getInteger(a.j.f9768m, 1);
        int integer2 = obtainAttributes.getInteger(a.j.f9769n, 500);
        String string4 = obtainAttributes.getString(a.j.f9772q);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0181f(new a1.f(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d((e[]) arrayList.toArray(new e[0]));
    }

    public static e f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.j.f9773r);
        int i7 = obtainAttributes.getInt(obtainAttributes.hasValue(a.j.A) ? a.j.A : a.j.f9775t, 400);
        boolean z6 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(a.j.f9780y) ? a.j.f9780y : a.j.f9776u, 0);
        int i8 = obtainAttributes.hasValue(a.j.B) ? a.j.B : a.j.f9777v;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(a.j.f9781z) ? a.j.f9781z : a.j.f9778w);
        int i9 = obtainAttributes.getInt(i8, 0);
        int i10 = obtainAttributes.hasValue(a.j.f9779x) ? a.j.f9779x : a.j.f9774s;
        int resourceId = obtainAttributes.getResourceId(i10, 0);
        String string2 = obtainAttributes.getString(i10);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(string2, i7, z6, string, i9, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: m0.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0181f implements b {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final a1.f f13442a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13443b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13444c;
        @q0

        /* renamed from: d  reason: collision with root package name */
        public final String f13445d;

        @b1({b1.a.LIBRARY})
        public C0181f(@o0 a1.f fVar, int i7, int i8, @q0 String str) {
            this.f13442a = fVar;
            this.f13444c = i7;
            this.f13443b = i8;
            this.f13445d = str;
        }

        public int a() {
            return this.f13444c;
        }

        @o0
        public a1.f b() {
            return this.f13442a;
        }

        @b1({b1.a.LIBRARY})
        @q0
        public String c() {
            return this.f13445d;
        }

        public int d() {
            return this.f13443b;
        }

        public C0181f(@o0 a1.f fVar, int i7, int i8) {
            this(fVar, i7, i8, null);
        }
    }
}