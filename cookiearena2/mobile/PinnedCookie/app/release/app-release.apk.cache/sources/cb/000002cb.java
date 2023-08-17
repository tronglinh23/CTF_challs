package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.k;
import androidx.core.view.u1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final String f2122i = "TransitionLayout";

    /* renamed from: a  reason: collision with root package name */
    public boolean f2123a;

    /* renamed from: b  reason: collision with root package name */
    public String f2124b;

    /* renamed from: c  reason: collision with root package name */
    public b f2125c;

    /* renamed from: d  reason: collision with root package name */
    public int f2126d;

    /* renamed from: e  reason: collision with root package name */
    public float f2127e;

    /* renamed from: f  reason: collision with root package name */
    public String f2128f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2129g;

    /* renamed from: h  reason: collision with root package name */
    public int f2130h;

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0030a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2131a;

        static {
            int[] iArr = new int[b.values().length];
            f2131a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2131a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2131a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2131a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2131a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2131a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2131a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2131a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String name, b attributeType) {
        this.f2123a = false;
        this.f2124b = name;
        this.f2125c = attributeType;
    }

    public static int b(int c7) {
        int i7 = (c7 & (~(c7 >> 31))) - 255;
        return (i7 & (i7 >> 31)) + 255;
    }

    public static HashMap<String, a> d(HashMap<String, a> base, View view) {
        HashMap<String, a> hashMap = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : base.keySet()) {
            a aVar = base.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap.put(str, new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
            } catch (NoSuchMethodException e8) {
                e8.printStackTrace();
            } catch (InvocationTargetException e9) {
                e9.printStackTrace();
            }
        }
        return hashMap;
    }

    public static void q(Context context, XmlPullParser parser, HashMap<String, a> custom) {
        b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), k.m.pd);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            if (index == k.m.qd) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == k.m.Ad) {
                str = obtainStyledAttributes.getString(index);
                z6 = true;
            } else if (index == k.m.rd) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == k.m.td) {
                    bVar = b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == k.m.sd) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == k.m.xd) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == k.m.ud) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == k.m.vd) {
                    bVar = b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == k.m.wd) {
                    bVar = b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == k.m.zd) {
                    bVar = b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == k.m.yd) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            custom.put(str, new a(str, bVar2, obj, z6));
        }
        obtainStyledAttributes.recycle();
    }

    public static void r(View view, HashMap<String, a> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            a aVar = map.get(str);
            String str2 = aVar.f2123a ? str : "set" + str;
            try {
                switch (C0030a.f2131a[aVar.f2125c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f2126d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f2129g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f2128f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f2130h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f2130h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f2126d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f2127e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f2127e));
                        break;
                }
            } catch (IllegalAccessException e7) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e7.printStackTrace();
            } catch (NoSuchMethodException e8) {
                Log.e("TransitionLayout", e8.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(str2);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e9) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e9.printStackTrace();
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f2124b;
        if (this.f2123a) {
            str = str2;
        } else {
            str = "set" + str2;
        }
        try {
            switch (C0030a.f2131a[this.f2125c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f2126d));
                    return;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.f2129g));
                    return;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f2128f);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.f2130h));
                    return;
                case 5:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.f2130h);
                    method.invoke(view, colorDrawable);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f2127e));
                    return;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.f2127e));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e7) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e7.printStackTrace();
        } catch (NoSuchMethodException e8) {
            Log.e("TransitionLayout", e8.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" must have a method ");
            sb.append(str);
            Log.e("TransitionLayout", sb.toString());
        } catch (InvocationTargetException e9) {
            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
            e9.printStackTrace();
        }
    }

    public boolean c(a constraintAttribute) {
        b bVar;
        if (constraintAttribute == null || (bVar = this.f2125c) != constraintAttribute.f2125c) {
            return false;
        }
        switch (C0030a.f2131a[bVar.ordinal()]) {
            case 1:
            case 6:
                return this.f2126d == constraintAttribute.f2126d;
            case 2:
                return this.f2129g == constraintAttribute.f2129g;
            case 3:
                return this.f2126d == constraintAttribute.f2126d;
            case 4:
            case 5:
                return this.f2130h == constraintAttribute.f2130h;
            case 7:
                return this.f2127e == constraintAttribute.f2127e;
            case 8:
                return this.f2127e == constraintAttribute.f2127e;
            default:
                return false;
        }
    }

    public int e() {
        return this.f2130h;
    }

    public float f() {
        return this.f2127e;
    }

    public int g() {
        return this.f2126d;
    }

    public String h() {
        return this.f2124b;
    }

    public String i() {
        return this.f2128f;
    }

    public b j() {
        return this.f2125c;
    }

    public float k() {
        switch (C0030a.f2131a[this.f2125c.ordinal()]) {
            case 2:
                return this.f2129g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f2126d;
            case 7:
                return this.f2127e;
            case 8:
                return this.f2127e;
            default:
                return Float.NaN;
        }
    }

    public void l(float[] ret) {
        switch (C0030a.f2131a[this.f2125c.ordinal()]) {
            case 2:
                ret[0] = this.f2129g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i7 = (this.f2130h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                ret[0] = pow;
                ret[1] = pow2;
                ret[2] = pow3;
                ret[3] = i7 / 255.0f;
                return;
            case 6:
                ret[0] = this.f2126d;
                return;
            case 7:
                ret[0] = this.f2127e;
                return;
            case 8:
                ret[0] = this.f2127e;
                return;
            default:
                return;
        }
    }

    public boolean m() {
        return this.f2129g;
    }

    public boolean n() {
        int i7 = C0030a.f2131a[this.f2125c.ordinal()];
        return (i7 == 1 || i7 == 2 || i7 == 3) ? false : true;
    }

    public boolean o() {
        return this.f2123a;
    }

    public int p() {
        int i7 = C0030a.f2131a[this.f2125c.ordinal()];
        return (i7 == 4 || i7 == 5) ? 4 : 1;
    }

    public void s(int value) {
        this.f2130h = value;
    }

    public void t(float value) {
        this.f2127e = value;
    }

    public void u(int value) {
        this.f2126d = value;
    }

    public void v(String value) {
        this.f2128f = value;
    }

    public void w(Object value) {
        switch (C0030a.f2131a[this.f2125c.ordinal()]) {
            case 1:
            case 6:
                this.f2126d = ((Integer) value).intValue();
                return;
            case 2:
                this.f2129g = ((Boolean) value).booleanValue();
                return;
            case 3:
                this.f2128f = (String) value;
                return;
            case 4:
            case 5:
                this.f2130h = ((Integer) value).intValue();
                return;
            case 7:
                this.f2127e = ((Float) value).floatValue();
                return;
            case 8:
                this.f2127e = ((Float) value).floatValue();
                return;
            default:
                return;
        }
    }

    public void x(float[] value) {
        switch (C0030a.f2131a[this.f2125c.ordinal()]) {
            case 1:
            case 6:
                this.f2126d = (int) value[0];
                return;
            case 2:
                this.f2129g = ((double) value[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int HSVToColor = Color.HSVToColor(value);
                this.f2130h = HSVToColor;
                this.f2130h = (b((int) (value[3] * 255.0f)) << 24) | (HSVToColor & u1.f3815s);
                return;
            case 7:
                this.f2127e = value[0];
                return;
            case 8:
                this.f2127e = value[0];
                return;
            default:
                return;
        }
    }

    public a(String name, b attributeType, Object value, boolean method) {
        this.f2124b = name;
        this.f2125c = attributeType;
        this.f2123a = method;
        w(value);
    }

    public a(a source, Object value) {
        this.f2123a = false;
        this.f2124b = source.f2124b;
        this.f2125c = source.f2125c;
        w(value);
    }
}