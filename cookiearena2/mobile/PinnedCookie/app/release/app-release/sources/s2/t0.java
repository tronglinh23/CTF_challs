package s2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import d.b1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import s2.j1;
import s2.q;
import s2.u0;
import s2.z;
import t2.a;
import u.v;
import u4.r1;
import v3.m2;
@r1({"SMAP\nNavInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 4 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,351:1\n1#2:352\n232#3,3:353\n232#3,3:356\n232#3,3:359\n232#3,3:362\n55#4,6:365\n*S KotlinDebug\n*F\n+ 1 NavInflater.kt\nandroidx/navigation/NavInflater\n*L\n109#1:353,3\n127#1:356,3\n142#1:359,3\n247#1:362,3\n284#1:365,6\n*E\n"})
/* loaded from: classes.dex */
public final class t0 {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final String f16448d = "argument";
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final String f16449e = "deepLink";
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final String f16450f = "action";
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public static final String f16451g = "include";
    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public static final String f16452h = "${applicationId}";
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Context f16454a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final e1 f16455b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final a f16447c = new a(null);
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f16453i = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final y0<?> a(@n6.d TypedValue typedValue, @n6.e y0<?> y0Var, @n6.d y0<?> y0Var2, @n6.e String str, @n6.d String str2) throws XmlPullParserException {
            u4.l0.p(typedValue, "value");
            u4.l0.p(y0Var2, "expectedNavType");
            u4.l0.p(str2, "foundType");
            if (y0Var == null || y0Var == y0Var2) {
                return y0Var == null ? y0Var2 : y0Var;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }

        public a() {
        }
    }

    public t0(@n6.d Context context, @n6.d e1 e1Var) {
        u4.l0.p(context, "context");
        u4.l0.p(e1Var, "navigatorProvider");
        this.f16454a = context;
        this.f16455b = e1Var;
    }

    public final g0 a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i7) throws XmlPullParserException, IOException {
        int depth;
        e1 e1Var = this.f16455b;
        String name = xmlResourceParser.getName();
        u4.l0.o(name, "parser.name");
        g0 a7 = e1Var.f(name).a();
        a7.C(this.f16454a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (u4.l0.g(f16448d, name2)) {
                    f(resources, a7, attributeSet, i7);
                } else if (u4.l0.g(f16449e, name2)) {
                    g(resources, a7, attributeSet);
                } else if (u4.l0.g(f16450f, name2)) {
                    c(resources, a7, attributeSet, xmlResourceParser, i7);
                } else if (u4.l0.g("include", name2) && (a7 instanceof k0)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, j1.c.f16368i);
                    u4.l0.o(obtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((k0) a7).P(b(obtainAttributes.getResourceId(j1.c.f16369j, 0)));
                    m2 m2Var = m2.f17815a;
                    obtainAttributes.recycle();
                } else if (a7 instanceof k0) {
                    ((k0) a7).P(a(resources, xmlResourceParser, attributeSet, i7));
                }
            }
        }
        return a7;
    }

    @n6.d
    @SuppressLint({"ResourceType"})
    public final k0 b(@d.n0 int i7) {
        int next;
        Resources resources = this.f16454a.getResources();
        XmlResourceParser xml = resources.getXml(i7);
        u4.l0.o(xml, "res.getXml(graphResId)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e7) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i7) + " line " + xml.getLineNumber(), e7);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            u4.l0.o(resources, "res");
            u4.l0.o(asAttributeSet, "attrs");
            g0 a7 = a(resources, xml, asAttributeSet, i7);
            if (a7 instanceof k0) {
                return (k0) a7;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }

    public final void c(Resources resources, g0 g0Var, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i7) throws IOException, XmlPullParserException {
        int depth;
        Context context = this.f16454a;
        int[] iArr = a.b.f16798a;
        u4.l0.o(iArr, "NavAction");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(a.b.f16799b, 0);
        l lVar = new l(obtainStyledAttributes.getResourceId(a.b.f16800c, 0), null, null, 6, null);
        u0.a aVar = new u0.a();
        aVar.d(obtainStyledAttributes.getBoolean(a.b.f16803f, false));
        aVar.m(obtainStyledAttributes.getBoolean(a.b.f16809l, false));
        aVar.h(obtainStyledAttributes.getResourceId(a.b.f16806i, -1), obtainStyledAttributes.getBoolean(a.b.f16807j, false), obtainStyledAttributes.getBoolean(a.b.f16808k, false));
        aVar.b(obtainStyledAttributes.getResourceId(a.b.f16801d, -1));
        aVar.c(obtainStyledAttributes.getResourceId(a.b.f16802e, -1));
        aVar.e(obtainStyledAttributes.getResourceId(a.b.f16804g, -1));
        aVar.f(obtainStyledAttributes.getResourceId(a.b.f16805h, -1));
        lVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && u4.l0.g(f16448d, xmlResourceParser.getName())) {
                e(resources, bundle, attributeSet, i7);
            }
        }
        if (!bundle.isEmpty()) {
            lVar.d(bundle);
        }
        g0Var.G(resourceId, lVar);
        obtainStyledAttributes.recycle();
    }

    public final q d(TypedArray typedArray, Resources resources, int i7) throws XmlPullParserException {
        q.a aVar = new q.a();
        int i8 = 0;
        aVar.c(typedArray.getBoolean(a.b.f16814q, false));
        ThreadLocal<TypedValue> threadLocal = f16453i;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(a.b.f16813p);
        Object obj = null;
        y0<Object> a7 = string != null ? y0.f16555c.a(string, resources.getResourcePackageName(i7)) : null;
        if (typedArray.getValue(a.b.f16812o, typedValue)) {
            y0<Object> y0Var = y0.f16557e;
            if (a7 == y0Var) {
                int i9 = typedValue.resourceId;
                if (i9 != 0) {
                    i8 = i9;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + a7.c() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i8);
            } else {
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    if (a7 != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + a7.c() + ". You must use a \"" + y0Var.c() + "\" type to reference other resources.");
                    }
                    obj = Integer.valueOf(i10);
                    a7 = y0Var;
                } else if (a7 == y0.f16565m) {
                    obj = typedArray.getString(a.b.f16812o);
                } else {
                    int i11 = typedValue.type;
                    if (i11 == 3) {
                        String obj2 = typedValue.string.toString();
                        if (a7 == null) {
                            a7 = y0.f16555c.b(obj2);
                        }
                        obj = a7.n(obj2);
                    } else if (i11 == 4) {
                        a7 = f16447c.a(typedValue, a7, y0.f16561i, string, v.b.f17138c);
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i11 == 5) {
                        a7 = f16447c.a(typedValue, a7, y0.f16556d, string, v.b.f17142g);
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i11 == 18) {
                        a7 = f16447c.a(typedValue, a7, y0.f16563k, string, v.b.f17141f);
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else if (i11 < 16 || i11 > 31) {
                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                    } else {
                        y0<Object> y0Var2 = y0.f16561i;
                        if (a7 == y0Var2) {
                            a7 = f16447c.a(typedValue, a7, y0Var2, string, v.b.f17138c);
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            a7 = f16447c.a(typedValue, a7, y0.f16556d, string, v.b.f17137b);
                            obj = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (obj != null) {
            aVar.b(obj);
        }
        if (a7 != null) {
            aVar.d(a7);
        }
        return aVar.a();
    }

    public final void e(Resources resources, Bundle bundle, AttributeSet attributeSet, int i7) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.b.f16810m);
        u4.l0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(a.b.f16811n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        u4.l0.o(string, "array.getString(R.stylea…uments must have a name\")");
        q d7 = d(obtainAttributes, resources, i7);
        if (d7.c()) {
            d7.e(string, bundle);
        }
        m2 m2Var = m2.f17815a;
        obtainAttributes.recycle();
    }

    public final void f(Resources resources, g0 g0Var, AttributeSet attributeSet, int i7) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.b.f16810m);
        u4.l0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = obtainAttributes.getString(a.b.f16811n);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        u4.l0.o(string, "array.getString(R.stylea…uments must have a name\")");
        g0Var.b(string, d(obtainAttributes, resources, i7));
        m2 m2Var = m2.f17815a;
        obtainAttributes.recycle();
    }

    public final void g(Resources resources, g0 g0Var, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.b.f16815r);
        u4.l0.o(obtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = obtainAttributes.getString(a.b.f16819v);
        String string2 = obtainAttributes.getString(a.b.f16817t);
        String string3 = obtainAttributes.getString(a.b.f16818u);
        if (string == null || string.length() == 0) {
            if (string2 == null || string2.length() == 0) {
                if (string3 == null || string3.length() == 0) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        z.a aVar = new z.a();
        if (string != null) {
            String packageName = this.f16454a.getPackageName();
            u4.l0.o(packageName, "context.packageName");
            aVar.g(i5.b0.l2(string, f16452h, packageName, false, 4, null));
        }
        if (!(string2 == null || string2.length() == 0)) {
            String packageName2 = this.f16454a.getPackageName();
            u4.l0.o(packageName2, "context.packageName");
            aVar.e(i5.b0.l2(string2, f16452h, packageName2, false, 4, null));
        }
        if (string3 != null) {
            String packageName3 = this.f16454a.getPackageName();
            u4.l0.o(packageName3, "context.packageName");
            aVar.f(i5.b0.l2(string3, f16452h, packageName3, false, 4, null));
        }
        g0Var.f(aVar.a());
        m2 m2Var = m2.f17815a;
        obtainAttributes.recycle();
    }
}
