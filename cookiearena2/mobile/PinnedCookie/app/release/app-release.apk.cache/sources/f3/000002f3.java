package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.k;
import c0.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class n {

    /* renamed from: h  reason: collision with root package name */
    public static final String f3436h = "ConstraintLayoutStates";

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f3437i = false;

    /* renamed from: b  reason: collision with root package name */
    public e f3439b;

    /* renamed from: a  reason: collision with root package name */
    public int f3438a = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3440c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f3441d = -1;

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<a> f3442e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public SparseArray<e> f3443f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    public g f3444g = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3445a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f3446b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f3447c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3448d;

        public a(Context context, XmlPullParser parser) {
            this.f3447c = -1;
            this.f3448d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.m.Ql);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.Rl) {
                    this.f3445a = obtainStyledAttributes.getResourceId(index, this.f3445a);
                } else if (index == k.m.Sl) {
                    this.f3447c = obtainStyledAttributes.getResourceId(index, this.f3447c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3447c);
                    context.getResources().getResourceName(this.f3447c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f3448d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b size) {
            this.f3446b.add(size);
        }

        public int b(float width, float height) {
            for (int i7 = 0; i7 < this.f3446b.size(); i7++) {
                if (this.f3446b.get(i7).a(width, height)) {
                    return i7;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3449a;

        /* renamed from: b  reason: collision with root package name */
        public float f3450b;

        /* renamed from: c  reason: collision with root package name */
        public float f3451c;

        /* renamed from: d  reason: collision with root package name */
        public float f3452d;

        /* renamed from: e  reason: collision with root package name */
        public float f3453e;

        /* renamed from: f  reason: collision with root package name */
        public int f3454f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3455g;

        public b(Context context, XmlPullParser parser) {
            this.f3450b = Float.NaN;
            this.f3451c = Float.NaN;
            this.f3452d = Float.NaN;
            this.f3453e = Float.NaN;
            this.f3454f = -1;
            this.f3455g = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.m.f0do);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.eo) {
                    this.f3454f = obtainStyledAttributes.getResourceId(index, this.f3454f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3454f);
                    context.getResources().getResourceName(this.f3454f);
                    if ("layout".equals(resourceTypeName)) {
                        this.f3455g = true;
                    }
                } else if (index == k.m.fo) {
                    this.f3453e = obtainStyledAttributes.getDimension(index, this.f3453e);
                } else if (index == k.m.go) {
                    this.f3451c = obtainStyledAttributes.getDimension(index, this.f3451c);
                } else if (index == k.m.ho) {
                    this.f3452d = obtainStyledAttributes.getDimension(index, this.f3452d);
                } else if (index == k.m.io) {
                    this.f3450b = obtainStyledAttributes.getDimension(index, this.f3450b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float widthDp, float heightDp) {
            if (Float.isNaN(this.f3450b) || widthDp >= this.f3450b) {
                if (Float.isNaN(this.f3451c) || heightDp >= this.f3451c) {
                    if (Float.isNaN(this.f3452d) || widthDp <= this.f3452d) {
                        return Float.isNaN(this.f3453e) || heightDp <= this.f3453e;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public n(Context context, XmlPullParser parser) {
        b(context, parser);
    }

    public int a(int currentConstrainSettId, int stateId, float width, float height) {
        a aVar = this.f3442e.get(stateId);
        if (aVar == null) {
            return stateId;
        }
        if (width == -1.0f || height == -1.0f) {
            if (aVar.f3447c == currentConstrainSettId) {
                return currentConstrainSettId;
            }
            Iterator<b> it = aVar.f3446b.iterator();
            while (it.hasNext()) {
                if (currentConstrainSettId == it.next().f3454f) {
                    return currentConstrainSettId;
                }
            }
            return aVar.f3447c;
        }
        Iterator<b> it2 = aVar.f3446b.iterator();
        b bVar = null;
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.a(width, height)) {
                if (currentConstrainSettId == next.f3454f) {
                    return currentConstrainSettId;
                }
                bVar = next;
            }
        }
        return bVar != null ? bVar.f3454f : aVar.f3447c;
    }

    public final void b(Context context, XmlPullParser parser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.m.cm);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == k.m.dm) {
                this.f3438a = obtainStyledAttributes.getResourceId(index, this.f3438a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = parser.getEventType();
            a aVar = null;
            while (true) {
                char c7 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    String name = parser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c7 = 0;
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
                        aVar = new a(context, parser);
                        this.f3442e.put(aVar.f3445a, aVar);
                    } else if (c7 == 3) {
                        b bVar = new b(context, parser);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if (u.K.equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    public boolean c(int id, float width, float height) {
        int i7 = this.f3440c;
        if (i7 != id) {
            return true;
        }
        a valueAt = id == -1 ? this.f3442e.valueAt(0) : this.f3442e.get(i7);
        int i8 = this.f3441d;
        return (i8 == -1 || !valueAt.f3446b.get(i8).a(width, height)) && this.f3441d != valueAt.b(width, height);
    }

    public void d(g constraintsChangedListener) {
        this.f3444g = constraintsChangedListener;
    }

    public int e(int id, int width, int height) {
        return f(-1, id, width, height);
    }

    public int f(int currentId, int id, float width, float height) {
        int b7;
        if (currentId == id) {
            a valueAt = id == -1 ? this.f3442e.valueAt(0) : this.f3442e.get(this.f3440c);
            if (valueAt == null) {
                return -1;
            }
            return ((this.f3441d == -1 || !valueAt.f3446b.get(currentId).a(width, height)) && currentId != (b7 = valueAt.b(width, height))) ? b7 == -1 ? valueAt.f3447c : valueAt.f3446b.get(b7).f3454f : currentId;
        }
        a aVar = this.f3442e.get(id);
        if (aVar == null) {
            return -1;
        }
        int b8 = aVar.b(width, height);
        return b8 == -1 ? aVar.f3447c : aVar.f3446b.get(b8).f3454f;
    }
}