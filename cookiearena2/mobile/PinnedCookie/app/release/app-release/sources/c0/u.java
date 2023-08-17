package c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.k;
import c0.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class u {
    public static final int A = -1;
    public static final int B = -2;
    public static final int C = -1;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final String G = "MotionScene";
    public static final String H = "Transition";
    public static final String I = "OnSwipe";
    public static final String J = "OnClick";
    public static final String K = "StateSet";
    public static final String L = "Include";
    public static final String M = "include";
    public static final String N = "KeyFrameSet";
    public static final String O = "ConstraintSet";
    public static final String P = "ViewTransition";
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 4;
    public static final int V = 5;
    public static final int W = 6;

    /* renamed from: v  reason: collision with root package name */
    public static final String f7698v = "MotionScene";

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f7699w = false;

    /* renamed from: x  reason: collision with root package name */
    public static final int f7700x = 8;

    /* renamed from: y  reason: collision with root package name */
    public static final int f7701y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f7702z = 1;

    /* renamed from: a  reason: collision with root package name */
    public final s f7703a;

    /* renamed from: n  reason: collision with root package name */
    public MotionEvent f7716n;

    /* renamed from: q  reason: collision with root package name */
    public s.i f7719q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f7720r;

    /* renamed from: s  reason: collision with root package name */
    public final c0 f7721s;

    /* renamed from: t  reason: collision with root package name */
    public float f7722t;

    /* renamed from: u  reason: collision with root package name */
    public float f7723u;

    /* renamed from: b  reason: collision with root package name */
    public androidx.constraintlayout.widget.n f7704b = null;

    /* renamed from: c  reason: collision with root package name */
    public b f7705c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7706d = false;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<b> f7707e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b f7708f = null;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<b> f7709g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.e> f7710h = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    public HashMap<String, Integer> f7711i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public SparseIntArray f7712j = new SparseIntArray();

    /* renamed from: k  reason: collision with root package name */
    public boolean f7713k = false;

    /* renamed from: l  reason: collision with root package name */
    public int f7714l = 400;

    /* renamed from: m  reason: collision with root package name */
    public int f7715m = 0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7717o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7718p = false;

    /* loaded from: classes.dex */
    public class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u.d f7724a;

        public a(final u this$0, final u.d val$easing) {
            this.f7724a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v6) {
            return (float) this.f7724a.a(v6);
        }
    }

    public u(s layout) {
        this.f7703a = layout;
        this.f7721s = new c0(layout);
    }

    public static String A(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + c.i(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    public static String q0(String id) {
        if (id == null) {
            return "";
        }
        int indexOf = id.indexOf(47);
        return indexOf < 0 ? id : id.substring(indexOf + 1);
    }

    public float B() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return 0.0f;
        }
        return this.f7705c.f7744l.i();
    }

    public float C() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return 0.0f;
        }
        return this.f7705c.f7744l.j();
    }

    public boolean D() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return false;
        }
        return this.f7705c.f7744l.k();
    }

    public float E(View view, int position) {
        return 0.0f;
    }

    public float F(float dx, float dy) {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return 0.0f;
        }
        return this.f7705c.f7744l.l(dx, dy);
    }

    public final int G(int stateId) {
        int e7;
        androidx.constraintlayout.widget.n nVar = this.f7704b;
        return (nVar == null || (e7 = nVar.e(stateId, -1, -1)) == -1) ? stateId : e7;
    }

    public int H() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return 0;
        }
        return this.f7705c.f7744l.m();
    }

    public float I() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return 0.0f;
        }
        return this.f7705c.f7744l.n();
    }

    public float J() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return 0.0f;
        }
        return this.f7705c.f7744l.o();
    }

    public float K() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return 0.0f;
        }
        return this.f7705c.f7744l.p();
    }

    public float L() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return 0.0f;
        }
        return this.f7705c.f7744l.q();
    }

    public float M() {
        b bVar = this.f7705c;
        if (bVar != null) {
            return bVar.f7741i;
        }
        return 0.0f;
    }

    public int N() {
        b bVar = this.f7705c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f7736d;
    }

    public b O(int id) {
        Iterator<b> it = this.f7707e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f7733a == id) {
                return next;
            }
        }
        return null;
    }

    public int P(int stateId) {
        Iterator<b> it = this.f7707e.iterator();
        while (it.hasNext()) {
            if (it.next().f7736d == stateId) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> Q(int stateId) {
        int G2 = G(stateId);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.f7707e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f7736d == G2 || next.f7735c == G2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean R(int key) {
        int i7 = this.f7712j.get(key);
        int size = this.f7712j.size();
        while (i7 > 0) {
            if (i7 == key) {
                return true;
            }
            int i8 = size - 1;
            if (size < 0) {
                return true;
            }
            i7 = this.f7712j.get(i7);
            size = i8;
        }
        return false;
    }

    public boolean S(View view, int position) {
        b bVar = this.f7705c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f7743k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f7381a == position) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean T() {
        return this.f7719q != null;
    }

    public boolean U(int id) {
        return this.f7721s.h(id);
    }

    public final void V(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                char c7 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.f7713k) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c7 = 5;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c7 = '\b';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -687739768:
                            if (name.equals(L)) {
                                c7 = 7;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c7 = '\t';
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 269306229:
                            if (name.equals(H)) {
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 312750793:
                            if (name.equals(J)) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 327855227:
                            if (name.equals(I)) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals(K)) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                c7 = 6;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case 0:
                            c0(context, xml);
                            break;
                        case 1:
                            ArrayList<b> arrayList = this.f7707e;
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.f7705c == null && !bVar.f7734b) {
                                this.f7705c = bVar;
                                if (bVar.f7744l != null) {
                                    this.f7705c.f7744l.D(this.f7720r);
                                }
                            }
                            if (!bVar.f7734b) {
                                break;
                            } else {
                                if (bVar.f7735c == -1) {
                                    this.f7708f = bVar;
                                } else {
                                    this.f7709g.add(bVar);
                                }
                                this.f7707e.remove(bVar);
                                break;
                            }
                            break;
                        case 2:
                            if (bVar == null) {
                                String resourceEntryName = context.getResources().getResourceEntryName(resourceId);
                                int lineNumber = xml.getLineNumber();
                                StringBuilder sb = new StringBuilder();
                                sb.append(" OnSwipe (");
                                sb.append(resourceEntryName);
                                sb.append(".xml:");
                                sb.append(lineNumber);
                                sb.append(")");
                            }
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f7744l = new x(context, this.f7703a, xml);
                                break;
                            }
                        case 3:
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.v(context, xml);
                                break;
                            }
                        case 4:
                            this.f7704b = new androidx.constraintlayout.widget.n(context, xml);
                            break;
                        case 5:
                            Z(context, xml);
                            break;
                        case 6:
                        case 7:
                            b0(context, xml);
                            break;
                        case '\b':
                            i iVar = new i(context, xml);
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f7743k.add(iVar);
                                break;
                            }
                        case '\t':
                            this.f7721s.b(new b0(context, xml));
                            break;
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

    public int W(String id) {
        Integer num = this.f7711i.get(id);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String X(int id) {
        for (Map.Entry<String, Integer> entry : this.f7711i.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == id) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void Y(boolean changed, int left, int top, int right, int bottom) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int Z(Context context, XmlPullParser parser) {
        boolean z6;
        boolean z7;
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.a1(false);
        int attributeCount = parser.getAttributeCount();
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < attributeCount; i9++) {
            String attributeName = parser.getAttributeName(i9);
            String attributeValue = parser.getAttributeValue(i9);
            if (this.f7713k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z6 = false;
                        break;
                    }
                    z6 = true;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z6 = true;
                        break;
                    }
                    z6 = true;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        z6 = true;
                        break;
                    }
                    z6 = true;
                    break;
                default:
                    z6 = true;
                    break;
            }
            switch (z6) {
                case false:
                    i8 = v(context, attributeValue);
                    break;
                case true:
                    try {
                        eVar.f2259d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z7 = false;
                                    break;
                                }
                                z7 = true;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z7 = true;
                                    break;
                                }
                                z7 = true;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z7 = true;
                                    break;
                                }
                                z7 = true;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z7 = true;
                                    break;
                                }
                                z7 = true;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z7 = true;
                                    break;
                                }
                                z7 = true;
                                break;
                            default:
                                z7 = true;
                                break;
                        }
                        switch (z7) {
                            case false:
                                eVar.f2259d = 4;
                                continue;
                            case true:
                                eVar.f2259d = 2;
                                continue;
                            case true:
                                eVar.f2259d = 0;
                                continue;
                            case true:
                                eVar.f2259d = 1;
                                continue;
                            case true:
                                eVar.f2259d = 3;
                                continue;
                        }
                    }
                    break;
                case true:
                    i7 = v(context, attributeValue);
                    this.f7711i.put(q0(attributeValue), Integer.valueOf(i7));
                    eVar.f2257b = c.i(context, i7);
                    break;
            }
        }
        if (i7 != -1) {
            if (this.f7703a.f7624y != 0) {
                eVar.z1(true);
            }
            eVar.x0(context, parser);
            if (i8 != -1) {
                this.f7712j.put(i7, i8);
            }
            this.f7710h.put(i7, eVar);
        }
        return i7;
    }

    public final int a0(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return Z(context, xml);
                }
            }
            return -1;
        } catch (IOException e7) {
            e7.printStackTrace();
            return -1;
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    public final void b0(Context context, XmlPullParser mainParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(mainParser), k.m.No);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == k.m.Oo) {
                a0(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void c0(Context context, XmlPullParser parser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.m.pk);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == k.m.qk) {
                int i8 = obtainStyledAttributes.getInt(index, this.f7714l);
                this.f7714l = i8;
                if (i8 < 8) {
                    this.f7714l = 8;
                }
            } else if (index == k.m.rk) {
                this.f7715m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void d0(float dx, float dy) {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return;
        }
        this.f7705c.f7744l.w(dx, dy);
    }

    public void e0(float dx, float dy) {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return;
        }
        this.f7705c.f7744l.x(dx, dy);
    }

    public void f(s motionLayout, int currentState) {
        Iterator<b> it = this.f7707e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f7745m.size() > 0) {
                Iterator it2 = next.f7745m.iterator();
                while (it2.hasNext()) {
                    ((b.a) it2.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it3 = this.f7709g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.f7745m.size() > 0) {
                Iterator it4 = next2.f7745m.iterator();
                while (it4.hasNext()) {
                    ((b.a) it4.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it5 = this.f7707e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.f7745m.size() > 0) {
                Iterator it6 = next3.f7745m.iterator();
                while (it6.hasNext()) {
                    ((b.a) it6.next()).a(motionLayout, currentState, next3);
                }
            }
        }
        Iterator<b> it7 = this.f7709g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.f7745m.size() > 0) {
                Iterator it8 = next4.f7745m.iterator();
                while (it8.hasNext()) {
                    ((b.a) it8.next()).a(motionLayout, currentState, next4);
                }
            }
        }
    }

    public void f0(MotionEvent event, int currentState, s motionLayout) {
        s.i iVar;
        MotionEvent motionEvent;
        RectF rectF = new RectF();
        if (this.f7719q == null) {
            this.f7719q = this.f7703a.n0();
        }
        this.f7719q.c(event);
        if (currentState != -1) {
            int action = event.getAction();
            boolean z6 = false;
            if (action == 0) {
                this.f7722t = event.getRawX();
                this.f7723u = event.getRawY();
                this.f7716n = event;
                this.f7717o = false;
                if (this.f7705c.f7744l != null) {
                    RectF g7 = this.f7705c.f7744l.g(this.f7703a, rectF);
                    if (g7 != null && !g7.contains(this.f7716n.getX(), this.f7716n.getY())) {
                        this.f7716n = null;
                        this.f7717o = true;
                        return;
                    }
                    RectF r6 = this.f7705c.f7744l.r(this.f7703a, rectF);
                    if (r6 == null || r6.contains(this.f7716n.getX(), this.f7716n.getY())) {
                        this.f7718p = false;
                    } else {
                        this.f7718p = true;
                    }
                    this.f7705c.f7744l.A(this.f7722t, this.f7723u);
                    return;
                }
                return;
            } else if (action == 2 && !this.f7717o) {
                float rawY = event.getRawY() - this.f7723u;
                float rawX = event.getRawX() - this.f7722t;
                if ((rawX == androidx.cardview.widget.g.f1896q && rawY == androidx.cardview.widget.g.f1896q) || (motionEvent = this.f7716n) == null) {
                    return;
                }
                b j7 = j(currentState, rawX, rawY, motionEvent);
                if (j7 != null) {
                    motionLayout.setTransition(j7);
                    RectF r7 = this.f7705c.f7744l.r(this.f7703a, rectF);
                    if (r7 != null && !r7.contains(this.f7716n.getX(), this.f7716n.getY())) {
                        z6 = true;
                    }
                    this.f7718p = z6;
                    this.f7705c.f7744l.G(this.f7722t, this.f7723u);
                }
            }
        }
        if (this.f7717o) {
            return;
        }
        b bVar = this.f7705c;
        if (bVar != null && bVar.f7744l != null && !this.f7718p) {
            this.f7705c.f7744l.u(event, this.f7719q, currentState, this);
        }
        this.f7722t = event.getRawX();
        this.f7723u = event.getRawY();
        if (event.getAction() != 1 || (iVar = this.f7719q) == null) {
            return;
        }
        iVar.f();
        this.f7719q = null;
        int i7 = motionLayout.f7588g;
        if (i7 != -1) {
            i(motionLayout, i7);
        }
    }

    public void g(b transition) {
        int w6 = w(transition);
        if (w6 == -1) {
            this.f7707e.add(transition);
        } else {
            this.f7707e.set(w6, transition);
        }
    }

    public final void g0(int key, s motionLayout) {
        androidx.constraintlayout.widget.e eVar = this.f7710h.get(key);
        eVar.f2258c = eVar.f2257b;
        int i7 = this.f7712j.get(key);
        if (i7 > 0) {
            g0(i7, motionLayout);
            androidx.constraintlayout.widget.e eVar2 = this.f7710h.get(i7);
            if (eVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + c.i(this.f7703a.getContext(), i7));
                return;
            }
            eVar.f2258c += "/" + eVar2.f2258c;
            eVar.J0(eVar2);
        } else {
            eVar.f2258c += "  layout";
            eVar.I0(motionLayout);
        }
        eVar.q(eVar);
    }

    public boolean h(int viewTransitionId, o motionController) {
        return this.f7721s.e(viewTransitionId, motionController);
    }

    public void h0(s motionLayout) {
        for (int i7 = 0; i7 < this.f7710h.size(); i7++) {
            int keyAt = this.f7710h.keyAt(i7);
            if (R(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            g0(keyAt, motionLayout);
        }
    }

    public boolean i(s motionLayout, int currentState) {
        b bVar;
        if (T() || this.f7706d) {
            return false;
        }
        Iterator<b> it = this.f7707e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f7746n != 0 && ((bVar = this.f7705c) != next || !bVar.L(2))) {
                if (currentState == next.f7736d && (next.f7746n == 4 || next.f7746n == 2)) {
                    s.m mVar = s.m.FINISHED;
                    motionLayout.setState(mVar);
                    motionLayout.setTransition(next);
                    if (next.f7746n == 4) {
                        motionLayout.B0();
                        motionLayout.setState(s.m.SETUP);
                        motionLayout.setState(s.m.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.S(true);
                        motionLayout.setState(s.m.SETUP);
                        motionLayout.setState(s.m.MOVING);
                        motionLayout.setState(mVar);
                        motionLayout.o0();
                    }
                    return true;
                } else if (currentState == next.f7735c && (next.f7746n == 3 || next.f7746n == 1)) {
                    s.m mVar2 = s.m.FINISHED;
                    motionLayout.setState(mVar2);
                    motionLayout.setTransition(next);
                    if (next.f7746n == 3) {
                        motionLayout.D0();
                        motionLayout.setState(s.m.SETUP);
                        motionLayout.setState(s.m.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.S(true);
                        motionLayout.setState(s.m.SETUP);
                        motionLayout.setState(s.m.MOVING);
                        motionLayout.setState(mVar2);
                        motionLayout.o0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void i0(b transition) {
        int w6 = w(transition);
        if (w6 != -1) {
            this.f7707e.remove(w6);
        }
    }

    public b j(int currentState, float dx, float dy, MotionEvent lastTouchDown) {
        if (currentState != -1) {
            List<b> Q2 = Q(currentState);
            RectF rectF = new RectF();
            float f7 = 0.0f;
            b bVar = null;
            for (b bVar2 : Q2) {
                if (!bVar2.f7747o && bVar2.f7744l != null) {
                    bVar2.f7744l.D(this.f7720r);
                    RectF r6 = bVar2.f7744l.r(this.f7703a, rectF);
                    if (r6 == null || lastTouchDown == null || r6.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                        RectF g7 = bVar2.f7744l.g(this.f7703a, rectF);
                        if (g7 == null || lastTouchDown == null || g7.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                            float a7 = bVar2.f7744l.a(dx, dy);
                            if (bVar2.f7744l.f7800l && lastTouchDown != null) {
                                a7 = ((float) (Math.atan2(dy + r10, dx + r9) - Math.atan2(lastTouchDown.getX() - bVar2.f7744l.f7797i, lastTouchDown.getY() - bVar2.f7744l.f7798j))) * 10.0f;
                            }
                            float f8 = a7 * (bVar2.f7735c == currentState ? -1.0f : 1.1f);
                            if (f8 > f7) {
                                bVar = bVar2;
                                f7 = f8;
                            }
                        }
                    }
                }
            }
            return bVar;
        }
        return this.f7705c;
    }

    public void j0(int id, androidx.constraintlayout.widget.e set) {
        this.f7710h.put(id, set);
    }

    public void k(boolean disable) {
        this.f7706d = disable;
    }

    public void k0(int duration) {
        b bVar = this.f7705c;
        if (bVar != null) {
            bVar.O(duration);
        } else {
            this.f7714l = duration;
        }
    }

    public void l(int id, boolean enable) {
        this.f7721s.f(id, enable);
    }

    public void l0(View view, int position, String name, Object value) {
        b bVar = this.f7705c;
        if (bVar == null) {
            return;
        }
        Iterator it = bVar.f7743k.iterator();
        while (it.hasNext()) {
            Iterator<f> it2 = ((i) it.next()).d(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f7381a == position) {
                    if (value != null) {
                        ((Float) value).floatValue();
                    }
                    name.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public int m() {
        b bVar = this.f7705c;
        if (bVar != null) {
            return bVar.f7748p;
        }
        return -1;
    }

    public void m0(boolean rtl) {
        this.f7720r = rtl;
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return;
        }
        this.f7705c.f7744l.D(this.f7720r);
    }

    public int n() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return 0;
        }
        return this.f7705c.f7744l.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.n r0 = r6.f7704b
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.e(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.n r2 = r6.f7704b
            int r2 = r2.e(r8, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r7
        L17:
            r2 = r8
        L18:
            c0.u$b r3 = r6.f7705c
            if (r3 == 0) goto L2b
            int r3 = c0.u.b.a(r3)
            if (r3 != r8) goto L2b
            c0.u$b r3 = r6.f7705c
            int r3 = c0.u.b.c(r3)
            if (r3 != r7) goto L2b
            return
        L2b:
            java.util.ArrayList<c0.u$b> r3 = r6.f7707e
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r3.next()
            c0.u$b r4 = (c0.u.b) r4
            int r5 = c0.u.b.a(r4)
            if (r5 != r2) goto L49
            int r5 = c0.u.b.c(r4)
            if (r5 == r0) goto L55
        L49:
            int r5 = c0.u.b.a(r4)
            if (r5 != r8) goto L31
            int r5 = c0.u.b.c(r4)
            if (r5 != r7) goto L31
        L55:
            r6.f7705c = r4
            if (r4 == 0) goto L6a
            c0.x r7 = c0.u.b.l(r4)
            if (r7 == 0) goto L6a
            c0.u$b r7 = r6.f7705c
            c0.x r7 = c0.u.b.l(r7)
            boolean r8 = r6.f7720r
            r7.D(r8)
        L6a:
            return
        L6b:
            c0.u$b r7 = r6.f7708f
            java.util.ArrayList<c0.u$b> r3 = r6.f7709g
            java.util.Iterator r3 = r3.iterator()
        L73:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r3.next()
            c0.u$b r4 = (c0.u.b) r4
            int r5 = c0.u.b.a(r4)
            if (r5 != r8) goto L73
            r7 = r4
            goto L73
        L87:
            c0.u$b r8 = new c0.u$b
            r8.<init>(r6, r7)
            c0.u.b.d(r8, r0)
            c0.u.b.b(r8, r2)
            if (r0 == r1) goto L99
            java.util.ArrayList<c0.u$b> r7 = r6.f7707e
            r7.add(r8)
        L99:
            r6.f7705c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.u.n0(int, int):void");
    }

    public androidx.constraintlayout.widget.e o(int id) {
        return p(id, -1, -1);
    }

    public void o0(b transition) {
        this.f7705c = transition;
        if (transition == null || transition.f7744l == null) {
            return;
        }
        this.f7705c.f7744l.D(this.f7720r);
    }

    public androidx.constraintlayout.widget.e p(int id, int width, int height) {
        int e7;
        if (this.f7713k) {
            System.out.println("id " + id);
            System.out.println("size " + this.f7710h.size());
        }
        androidx.constraintlayout.widget.n nVar = this.f7704b;
        if (nVar != null && (e7 = nVar.e(id, width, height)) != -1) {
            id = e7;
        }
        if (this.f7710h.get(id) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + c.i(this.f7703a.getContext(), id) + " In MotionScene");
            SparseArray<androidx.constraintlayout.widget.e> sparseArray = this.f7710h;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.f7710h.get(id);
    }

    public void p0() {
        b bVar = this.f7705c;
        if (bVar == null || bVar.f7744l == null) {
            return;
        }
        this.f7705c.f7744l.H();
    }

    public androidx.constraintlayout.widget.e q(Context context, String id) {
        if (this.f7713k) {
            System.out.println("id " + id);
            System.out.println("size " + this.f7710h.size());
        }
        for (int i7 = 0; i7 < this.f7710h.size(); i7++) {
            int keyAt = this.f7710h.keyAt(i7);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.f7713k) {
                System.out.println("Id for <" + i7 + "> is <" + resourceName + "> looking for <" + id + ">");
            }
            if (id.equals(resourceName)) {
                return this.f7710h.get(keyAt);
            }
        }
        return null;
    }

    public int[] r() {
        int size = this.f7710h.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = this.f7710h.keyAt(i7);
        }
        return iArr;
    }

    public boolean r0() {
        Iterator<b> it = this.f7707e.iterator();
        while (it.hasNext()) {
            if (it.next().f7744l != null) {
                return true;
            }
        }
        b bVar = this.f7705c;
        return (bVar == null || bVar.f7744l == null) ? false : true;
    }

    public ArrayList<b> s() {
        return this.f7707e;
    }

    public boolean s0(s layout) {
        return layout == this.f7703a && layout.f7578b == this;
    }

    public int t() {
        b bVar = this.f7705c;
        return bVar != null ? bVar.f7740h : this.f7714l;
    }

    public void t0(int id, View... view) {
        this.f7721s.m(id, view);
    }

    public int u() {
        b bVar = this.f7705c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f7735c;
    }

    public final int v(Context context, String idString) {
        int i7;
        if (idString.contains("/")) {
            i7 = context.getResources().getIdentifier(idString.substring(idString.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f7713k) {
                System.out.println("id getMap res = " + i7);
            }
        } else {
            i7 = -1;
        }
        if (i7 == -1) {
            if (idString.length() > 1) {
                return Integer.parseInt(idString.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
            return i7;
        }
        return i7;
    }

    public final int w(b transition) {
        int i7 = transition.f7733a;
        if (i7 != -1) {
            for (int i8 = 0; i8 < this.f7707e.size(); i8++) {
                if (this.f7707e.get(i8).f7733a == i7) {
                    return i8;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    public Interpolator x() {
        int i7 = this.f7705c.f7737e;
        if (i7 != -2) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    if (i7 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(this, u.d.c(this.f7705c.f7738f));
        }
        return AnimationUtils.loadInterpolator(this.f7703a.getContext(), this.f7705c.f7739g);
    }

    public f y(Context context, int type, int target, int position) {
        b bVar = this.f7705c;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.f7743k.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            for (Integer num : iVar.e()) {
                if (target == num.intValue()) {
                    Iterator<f> it2 = iVar.d(num.intValue()).iterator();
                    while (it2.hasNext()) {
                        f next = it2.next();
                        if (next.f7381a == position && next.f7384d == type) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void z(o motionController) {
        b bVar = this.f7705c;
        if (bVar != null) {
            Iterator it = bVar.f7743k.iterator();
            while (it.hasNext()) {
                ((i) it.next()).b(motionController);
            }
            return;
        }
        b bVar2 = this.f7708f;
        if (bVar2 != null) {
            Iterator it2 = bVar2.f7743k.iterator();
            while (it2.hasNext()) {
                ((i) it2.next()).b(motionController);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final int A = -2;
        public static final int B = -1;
        public static final int C = 0;
        public static final int D = 1;
        public static final int E = 2;
        public static final int F = 3;
        public static final int G = 4;
        public static final int H = 5;
        public static final int I = 6;

        /* renamed from: s  reason: collision with root package name */
        public static final int f7725s = 0;

        /* renamed from: t  reason: collision with root package name */
        public static final int f7726t = 1;

        /* renamed from: u  reason: collision with root package name */
        public static final int f7727u = 2;

        /* renamed from: v  reason: collision with root package name */
        public static final int f7728v = 3;

        /* renamed from: w  reason: collision with root package name */
        public static final int f7729w = 4;

        /* renamed from: x  reason: collision with root package name */
        public static final int f7730x = 1;

        /* renamed from: y  reason: collision with root package name */
        public static final int f7731y = 2;

        /* renamed from: z  reason: collision with root package name */
        public static final int f7732z = 4;

        /* renamed from: a  reason: collision with root package name */
        public int f7733a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7734b;

        /* renamed from: c  reason: collision with root package name */
        public int f7735c;

        /* renamed from: d  reason: collision with root package name */
        public int f7736d;

        /* renamed from: e  reason: collision with root package name */
        public int f7737e;

        /* renamed from: f  reason: collision with root package name */
        public String f7738f;

        /* renamed from: g  reason: collision with root package name */
        public int f7739g;

        /* renamed from: h  reason: collision with root package name */
        public int f7740h;

        /* renamed from: i  reason: collision with root package name */
        public float f7741i;

        /* renamed from: j  reason: collision with root package name */
        public final u f7742j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList<i> f7743k;

        /* renamed from: l  reason: collision with root package name */
        public x f7744l;

        /* renamed from: m  reason: collision with root package name */
        public ArrayList<a> f7745m;

        /* renamed from: n  reason: collision with root package name */
        public int f7746n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f7747o;

        /* renamed from: p  reason: collision with root package name */
        public int f7748p;

        /* renamed from: q  reason: collision with root package name */
        public int f7749q;

        /* renamed from: r  reason: collision with root package name */
        public int f7750r;

        public b(u motionScene, b global) {
            this.f7733a = -1;
            this.f7734b = false;
            this.f7735c = -1;
            this.f7736d = -1;
            this.f7737e = 0;
            this.f7738f = null;
            this.f7739g = -1;
            this.f7740h = 400;
            this.f7741i = 0.0f;
            this.f7743k = new ArrayList<>();
            this.f7744l = null;
            this.f7745m = new ArrayList<>();
            this.f7746n = 0;
            this.f7747o = false;
            this.f7748p = -1;
            this.f7749q = 0;
            this.f7750r = 0;
            this.f7742j = motionScene;
            this.f7740h = motionScene.f7714l;
            if (global != null) {
                this.f7748p = global.f7748p;
                this.f7737e = global.f7737e;
                this.f7738f = global.f7738f;
                this.f7739g = global.f7739g;
                this.f7740h = global.f7740h;
                this.f7743k = global.f7743k;
                this.f7741i = global.f7741i;
                this.f7749q = global.f7749q;
            }
        }

        public int A() {
            return this.f7740h;
        }

        public int B() {
            return this.f7735c;
        }

        public int C() {
            return this.f7733a;
        }

        public List<i> D() {
            return this.f7743k;
        }

        public int E() {
            return this.f7749q;
        }

        public List<a> F() {
            return this.f7745m;
        }

        public int G() {
            return this.f7748p;
        }

        public float H() {
            return this.f7741i;
        }

        public int I() {
            return this.f7736d;
        }

        public x J() {
            return this.f7744l;
        }

        public boolean K() {
            return !this.f7747o;
        }

        public boolean L(int flag) {
            return (flag & this.f7750r) != 0;
        }

        public void M(int id) {
            a aVar;
            Iterator<a> it = this.f7745m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (aVar.f7757c == id) {
                    break;
                }
            }
            if (aVar != null) {
                this.f7745m.remove(aVar);
            }
        }

        public void N(int type) {
            this.f7746n = type;
        }

        public void O(int duration) {
            this.f7740h = Math.max(duration, 8);
        }

        public void P(boolean enable) {
            Q(enable);
        }

        public void Q(boolean enable) {
            this.f7747o = !enable;
        }

        public void R(int interpolator, String interpolatorString, int interpolatorID) {
            this.f7737e = interpolator;
            this.f7738f = interpolatorString;
            this.f7739g = interpolatorID;
        }

        public void S(int mode) {
            this.f7749q = mode;
        }

        public void T(v onSwipe) {
            this.f7744l = onSwipe == null ? null : new x(this.f7742j.f7703a, onSwipe);
        }

        public void U(int touchUpMode) {
            x J = J();
            if (J != null) {
                J.F(touchUpMode);
            }
        }

        public void V(int arcMode) {
            this.f7748p = arcMode;
        }

        public void W(float stagger) {
            this.f7741i = stagger;
        }

        public void X(int flag) {
            this.f7750r = flag;
        }

        public void t(i keyFrames) {
            this.f7743k.add(keyFrames);
        }

        public void u(int id, int action) {
            Iterator<a> it = this.f7745m.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f7757c == id) {
                    next.f7758d = action;
                    return;
                }
            }
            this.f7745m.add(new a(this, id, action));
        }

        public void v(Context context, XmlPullParser parser) {
            this.f7745m.add(new a(context, this, parser));
        }

        public String w(Context context) {
            String resourceEntryName = this.f7736d == -1 ? "null" : context.getResources().getResourceEntryName(this.f7736d);
            if (this.f7735c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f7735c);
        }

        public final void x(u motionScene, Context context, TypedArray a7) {
            int indexCount = a7.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = a7.getIndex(i7);
                if (index == k.m.Un) {
                    this.f7735c = a7.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f7735c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
                        eVar.w0(context, this.f7735c);
                        motionScene.f7710h.append(this.f7735c, eVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f7735c = motionScene.a0(context, this.f7735c);
                    }
                } else if (index == k.m.Vn) {
                    this.f7736d = a7.getResourceId(index, this.f7736d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f7736d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
                        eVar2.w0(context, this.f7736d);
                        motionScene.f7710h.append(this.f7736d, eVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f7736d = motionScene.a0(context, this.f7736d);
                    }
                } else if (index == k.m.Yn) {
                    int i8 = a7.peekValue(index).type;
                    if (i8 == 1) {
                        int resourceId = a7.getResourceId(index, -1);
                        this.f7739g = resourceId;
                        if (resourceId != -1) {
                            this.f7737e = -2;
                        }
                    } else if (i8 == 3) {
                        String string = a7.getString(index);
                        this.f7738f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f7739g = a7.getResourceId(index, -1);
                                this.f7737e = -2;
                            } else {
                                this.f7737e = -1;
                            }
                        }
                    } else {
                        this.f7737e = a7.getInteger(index, this.f7737e);
                    }
                } else if (index == k.m.Wn) {
                    int i9 = a7.getInt(index, this.f7740h);
                    this.f7740h = i9;
                    if (i9 < 8) {
                        this.f7740h = 8;
                    }
                } else if (index == k.m.ao) {
                    this.f7741i = a7.getFloat(index, this.f7741i);
                } else if (index == k.m.Tn) {
                    this.f7746n = a7.getInteger(index, this.f7746n);
                } else if (index == k.m.Sn) {
                    this.f7733a = a7.getResourceId(index, this.f7733a);
                } else if (index == k.m.bo) {
                    this.f7747o = a7.getBoolean(index, this.f7747o);
                } else if (index == k.m.Zn) {
                    this.f7748p = a7.getInteger(index, -1);
                } else if (index == k.m.Xn) {
                    this.f7749q = a7.getInteger(index, 0);
                } else if (index == k.m.co) {
                    this.f7750r = a7.getInteger(index, 0);
                }
            }
            if (this.f7736d == -1) {
                this.f7734b = true;
            }
        }

        public final void y(u motionScene, Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.Rn);
            x(motionScene, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int z() {
            return this.f7746n;
        }

        /* loaded from: classes.dex */
        public static class a implements View.OnClickListener {

            /* renamed from: e  reason: collision with root package name */
            public static final int f7751e = 1;

            /* renamed from: f  reason: collision with root package name */
            public static final int f7752f = 17;

            /* renamed from: g  reason: collision with root package name */
            public static final int f7753g = 16;

            /* renamed from: h  reason: collision with root package name */
            public static final int f7754h = 256;

            /* renamed from: i  reason: collision with root package name */
            public static final int f7755i = 4096;

            /* renamed from: b  reason: collision with root package name */
            public final b f7756b;

            /* renamed from: c  reason: collision with root package name */
            public int f7757c;

            /* renamed from: d  reason: collision with root package name */
            public int f7758d;

            public a(Context context, b transition, XmlPullParser parser) {
                this.f7757c = -1;
                this.f7758d = 17;
                this.f7756b = transition;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.m.wk);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i7 = 0; i7 < indexCount; i7++) {
                    int index = obtainStyledAttributes.getIndex(i7);
                    if (index == k.m.yk) {
                        this.f7757c = obtainStyledAttributes.getResourceId(index, this.f7757c);
                    } else if (index == k.m.xk) {
                        this.f7758d = obtainStyledAttributes.getInt(index, this.f7758d);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void a(s motionLayout, int currentState, b transition) {
                int i7 = this.f7757c;
                s sVar = motionLayout;
                if (i7 != -1) {
                    sVar = motionLayout.findViewById(i7);
                }
                if (sVar == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f7757c);
                    return;
                }
                int i8 = transition.f7736d;
                int i9 = transition.f7735c;
                if (i8 == -1) {
                    sVar.setOnClickListener(this);
                    return;
                }
                int i10 = this.f7758d;
                boolean z6 = false;
                boolean z7 = ((i10 & 1) != 0 && currentState == i8) | ((i10 & 1) != 0 && currentState == i8) | ((i10 & 256) != 0 && currentState == i8) | ((i10 & 16) != 0 && currentState == i9);
                if ((i10 & 4096) != 0 && currentState == i9) {
                    z6 = true;
                }
                if (z7 || z6) {
                    sVar.setOnClickListener(this);
                }
            }

            public boolean b(b current, s tl) {
                b bVar = this.f7756b;
                if (bVar == current) {
                    return true;
                }
                int i7 = bVar.f7735c;
                int i8 = this.f7756b.f7736d;
                if (i8 == -1) {
                    return tl.f7588g != i7;
                }
                int i9 = tl.f7588g;
                return i9 == i8 || i9 == i7;
            }

            public void c(s motionLayout) {
                int i7 = this.f7757c;
                if (i7 == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i7);
                if (findViewById != null) {
                    findViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.f7757c);
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r8) {
                /*
                    Method dump skipped, instructions count: 233
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: c0.u.b.a.onClick(android.view.View):void");
            }

            public a(b transition, int id, int action) {
                this.f7756b = transition;
                this.f7757c = id;
                this.f7758d = action;
            }
        }

        public b(int id, u motionScene, int constraintSetStartId, int constraintSetEndId) {
            this.f7733a = -1;
            this.f7734b = false;
            this.f7735c = -1;
            this.f7736d = -1;
            this.f7737e = 0;
            this.f7738f = null;
            this.f7739g = -1;
            this.f7740h = 400;
            this.f7741i = 0.0f;
            this.f7743k = new ArrayList<>();
            this.f7744l = null;
            this.f7745m = new ArrayList<>();
            this.f7746n = 0;
            this.f7747o = false;
            this.f7748p = -1;
            this.f7749q = 0;
            this.f7750r = 0;
            this.f7733a = id;
            this.f7742j = motionScene;
            this.f7736d = constraintSetStartId;
            this.f7735c = constraintSetEndId;
            this.f7740h = motionScene.f7714l;
            this.f7749q = motionScene.f7715m;
        }

        public b(u motionScene, Context context, XmlPullParser parser) {
            this.f7733a = -1;
            this.f7734b = false;
            this.f7735c = -1;
            this.f7736d = -1;
            this.f7737e = 0;
            this.f7738f = null;
            this.f7739g = -1;
            this.f7740h = 400;
            this.f7741i = 0.0f;
            this.f7743k = new ArrayList<>();
            this.f7744l = null;
            this.f7745m = new ArrayList<>();
            this.f7746n = 0;
            this.f7747o = false;
            this.f7748p = -1;
            this.f7749q = 0;
            this.f7750r = 0;
            this.f7740h = motionScene.f7714l;
            this.f7749q = motionScene.f7715m;
            this.f7742j = motionScene;
            y(motionScene, context, Xml.asAttributeSet(parser));
        }
    }

    public u(Context context, s layout, int resourceID) {
        this.f7703a = layout;
        this.f7721s = new c0(layout);
        V(context, resourceID);
        this.f7710h.put(k.g.V1, new androidx.constraintlayout.widget.e());
        this.f7711i.put("motion_base", Integer.valueOf(k.g.V1));
    }
}
