package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.k;
import c0.u;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: h  reason: collision with root package name */
    public static final String f2150h = "ConstraintLayoutStates";

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f2151i = false;

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f2152a;

    /* renamed from: b  reason: collision with root package name */
    public e f2153b;

    /* renamed from: c  reason: collision with root package name */
    public int f2154c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2155d = -1;

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<a> f2156e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public SparseArray<e> f2157f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    public g f2158g = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2159a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f2160b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f2161c;

        /* renamed from: d  reason: collision with root package name */
        public e f2162d;

        public a(Context context, XmlPullParser parser) {
            this.f2161c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.m.Ql);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.Rl) {
                    this.f2159a = obtainStyledAttributes.getResourceId(index, this.f2159a);
                } else if (index == k.m.Sl) {
                    this.f2161c = obtainStyledAttributes.getResourceId(index, this.f2161c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2161c);
                    context.getResources().getResourceName(this.f2161c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f2162d = eVar;
                        eVar.G(context, this.f2161c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b size) {
            this.f2160b.add(size);
        }

        public int b(float width, float height) {
            for (int i7 = 0; i7 < this.f2160b.size(); i7++) {
                if (this.f2160b.get(i7).a(width, height)) {
                    return i7;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2163a;

        /* renamed from: b  reason: collision with root package name */
        public float f2164b;

        /* renamed from: c  reason: collision with root package name */
        public float f2165c;

        /* renamed from: d  reason: collision with root package name */
        public float f2166d;

        /* renamed from: e  reason: collision with root package name */
        public float f2167e;

        /* renamed from: f  reason: collision with root package name */
        public int f2168f;

        /* renamed from: g  reason: collision with root package name */
        public e f2169g;

        public b(Context context, XmlPullParser parser) {
            this.f2164b = Float.NaN;
            this.f2165c = Float.NaN;
            this.f2166d = Float.NaN;
            this.f2167e = Float.NaN;
            this.f2168f = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.m.f0do);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.eo) {
                    this.f2168f = obtainStyledAttributes.getResourceId(index, this.f2168f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2168f);
                    context.getResources().getResourceName(this.f2168f);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f2169g = eVar;
                        eVar.G(context, this.f2168f);
                    }
                } else if (index == k.m.fo) {
                    this.f2167e = obtainStyledAttributes.getDimension(index, this.f2167e);
                } else if (index == k.m.go) {
                    this.f2165c = obtainStyledAttributes.getDimension(index, this.f2165c);
                } else if (index == k.m.ho) {
                    this.f2166d = obtainStyledAttributes.getDimension(index, this.f2166d);
                } else if (index == k.m.io) {
                    this.f2164b = obtainStyledAttributes.getDimension(index, this.f2164b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float widthDp, float heightDp) {
            if (Float.isNaN(this.f2164b) || widthDp >= this.f2164b) {
                if (Float.isNaN(this.f2165c) || heightDp >= this.f2165c) {
                    if (Float.isNaN(this.f2166d) || widthDp <= this.f2166d) {
                        return Float.isNaN(this.f2167e) || heightDp <= this.f2167e;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public c(Context context, ConstraintLayout layout, int resourceID) {
        this.f2152a = layout;
        a(context, resourceID);
    }

    public final void a(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c7 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals(u.K)) {
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    if (c7 == 2) {
                        aVar = new a(context, xml);
                        this.f2156e.put(aVar.f2159a, aVar);
                    } else if (c7 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    } else if (c7 == 4) {
                        c(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    public boolean b(int id, float width, float height) {
        int i7 = this.f2154c;
        if (i7 != id) {
            return true;
        }
        a valueAt = id == -1 ? this.f2156e.valueAt(0) : this.f2156e.get(i7);
        int i8 = this.f2155d;
        return (i8 == -1 || !valueAt.f2160b.get(i8).a(width, height)) && this.f2155d != valueAt.b(width, height);
    }

    public final void c(Context context, XmlPullParser parser) {
        e eVar = new e();
        int attributeCount = parser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = parser.getAttributeName(i7);
            String attributeValue = parser.getAttributeValue(i7);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.x0(context, parser);
                this.f2157f.put(identifier, eVar);
                return;
            }
        }
    }

    public void d(g constraintsChangedListener) {
        this.f2158g = constraintsChangedListener;
    }

    public void e(int id, float width, float height) {
        int b7;
        int i7 = this.f2154c;
        if (i7 == id) {
            a valueAt = id == -1 ? this.f2156e.valueAt(0) : this.f2156e.get(i7);
            int i8 = this.f2155d;
            if ((i8 == -1 || !valueAt.f2160b.get(i8).a(width, height)) && this.f2155d != (b7 = valueAt.b(width, height))) {
                e eVar = b7 == -1 ? this.f2153b : valueAt.f2160b.get(b7).f2169g;
                int i9 = b7 == -1 ? valueAt.f2161c : valueAt.f2160b.get(b7).f2168f;
                if (eVar == null) {
                    return;
                }
                this.f2155d = b7;
                g gVar = this.f2158g;
                if (gVar != null) {
                    gVar.b(-1, i9);
                }
                eVar.r(this.f2152a);
                g gVar2 = this.f2158g;
                if (gVar2 != null) {
                    gVar2.a(-1, i9);
                    return;
                }
                return;
            }
            return;
        }
        this.f2154c = id;
        a aVar = this.f2156e.get(id);
        int b8 = aVar.b(width, height);
        e eVar2 = b8 == -1 ? aVar.f2162d : aVar.f2160b.get(b8).f2169g;
        int i10 = b8 == -1 ? aVar.f2161c : aVar.f2160b.get(b8).f2168f;
        if (eVar2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("NO Constraint set found ! id=");
            sb.append(id);
            sb.append(", dim =");
            sb.append(width);
            sb.append(", ");
            sb.append(height);
            return;
        }
        this.f2155d = b8;
        g gVar3 = this.f2158g;
        if (gVar3 != null) {
            gVar3.b(id, i10);
        }
        eVar2.r(this.f2152a);
        g gVar4 = this.f2158g;
        if (gVar4 != null) {
            gVar4.a(id, i10);
        }
    }
}