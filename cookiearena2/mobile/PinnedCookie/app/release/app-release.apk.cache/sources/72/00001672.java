package m0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.view.u1;
import d.b1;
import d.n1;
import d.o0;
import d.q0;
import d.x;
import f0.a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f13424a = new ThreadLocal<>();

    @o0
    public static ColorStateList a(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @o0
    public static ColorStateList b(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    @o0
    public static TypedValue c() {
        ThreadLocal<TypedValue> threadLocal = f13424a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    @q0
    public static ColorStateList d(@o0 Resources resources, @n1 int i7, @q0 Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i7), theme);
        } catch (Exception e7) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e7);
            return null;
        }
    }

    public static ColorStateList e(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        Resources resources2 = resources;
        int i7 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i8 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i7 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray h7 = h(resources2, theme, attributeSet, a.j.f9759d);
                int resourceId = h7.getResourceId(a.j.f9760e, -1);
                if (resourceId == -1 || f(resources2, resourceId)) {
                    color = h7.getColor(a.j.f9760e, -65281);
                } else {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = h7.getColor(a.j.f9760e, -65281);
                    }
                }
                float f7 = 1.0f;
                if (h7.hasValue(a.j.f9761f)) {
                    f7 = h7.getFloat(a.j.f9761f, 1.0f);
                } else if (h7.hasValue(a.j.f9763h)) {
                    f7 = h7.getFloat(a.j.f9763h, 1.0f);
                }
                float f8 = (Build.VERSION.SDK_INT < 31 || !h7.hasValue(a.j.f9762g)) ? h7.getFloat(a.j.f9764i, -1.0f) : h7.getFloat(a.j.f9762g, -1.0f);
                h7.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i9 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != a.C0106a.f9624a && attributeNameResource != a.C0106a.f9636m) {
                        int i11 = i9 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i9] = attributeNameResource;
                        i9 = i11;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i9);
                iArr2 = h.a(iArr2, i8, g(color, f7, f8));
                iArr = (int[][]) h.c(iArr, i8, trimStateSet);
                i8++;
            }
            i7 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i8];
        int[][] iArr5 = new int[i8];
        System.arraycopy(iArr2, 0, iArr4, 0, i8);
        System.arraycopy(iArr, 0, iArr5, 0, i8);
        return new ColorStateList(iArr5, iArr4);
    }

    public static boolean f(@o0 Resources resources, @d.n int i7) {
        TypedValue c7 = c();
        resources.getValue(i7, c7, true);
        int i8 = c7.type;
        return i8 >= 28 && i8 <= 31;
    }

    @d.l
    public static int g(@d.l int i7, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d, to = 100.0d) float f8) {
        boolean z6 = f8 >= 0.0f && f8 <= 100.0f;
        if (f7 != 1.0f || z6) {
            int e7 = x0.a.e((int) ((Color.alpha(i7) * f7) + 0.5f), 0, 255);
            if (z6) {
                a c7 = a.c(i7);
                i7 = a.p(c7.j(), c7.i(), f8);
            }
            return (i7 & u1.f3815s) | (e7 << 24);
        }
        return i7;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}