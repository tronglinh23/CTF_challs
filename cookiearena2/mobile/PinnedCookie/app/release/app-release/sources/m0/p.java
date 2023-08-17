package m0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.b1;
import d.h1;
import d.o0;
import d.q0;
import org.xmlpull.v1.XmlPullParser;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13469a = "http://schemas.android.com/apk/res/android";

    public static int a(@o0 Context context, int i7, int i8) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId != 0 ? i7 : i8;
    }

    public static boolean b(@o0 TypedArray typedArray, @h1 int i7, @h1 int i8, boolean z6) {
        return typedArray.getBoolean(i7, typedArray.getBoolean(i8, z6));
    }

    @q0
    public static Drawable c(@o0 TypedArray typedArray, @h1 int i7, @h1 int i8) {
        Drawable drawable = typedArray.getDrawable(i7);
        return drawable == null ? typedArray.getDrawable(i8) : drawable;
    }

    public static int d(@o0 TypedArray typedArray, @h1 int i7, @h1 int i8, int i9) {
        return typedArray.getInt(i7, typedArray.getInt(i8, i9));
    }

    public static boolean e(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @h1 int i7, boolean z6) {
        return !r(xmlPullParser, str) ? z6 : typedArray.getBoolean(i7, z6);
    }

    @d.l
    public static int f(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @h1 int i7, @d.l int i8) {
        return !r(xmlPullParser, str) ? i8 : typedArray.getColor(i7, i8);
    }

    @q0
    public static ColorStateList g(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme, @o0 String str, @h1 int i7) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i8 = typedValue.type;
            if (i8 != 2) {
                return (i8 < 28 || i8 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme) : h(typedValue);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i7 + ": " + typedValue);
        }
        return null;
    }

    @o0
    public static ColorStateList h(@o0 TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d i(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @q0 Resources.Theme theme, @o0 String str, @h1 int i7, @d.l int i8) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i9 = typedValue.type;
            if (i9 >= 28 && i9 <= 31) {
                return d.b(typedValue.data);
            }
            d g7 = d.g(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme);
            if (g7 != null) {
                return g7;
            }
        }
        return d.b(i8);
    }

    public static float j(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @h1 int i7, float f7) {
        return !r(xmlPullParser, str) ? f7 : typedArray.getFloat(i7, f7);
    }

    public static int k(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @h1 int i7, int i8) {
        return !r(xmlPullParser, str) ? i8 : typedArray.getInt(i7, i8);
    }

    @d.c
    public static int l(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @h1 int i7, @d.c int i8) {
        return !r(xmlPullParser, str) ? i8 : typedArray.getResourceId(i7, i8);
    }

    @q0
    public static String m(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, @h1 int i7) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i7);
        }
        return null;
    }

    @d.c
    public static int n(@o0 TypedArray typedArray, @h1 int i7, @h1 int i8, @d.c int i9) {
        return typedArray.getResourceId(i7, typedArray.getResourceId(i8, i9));
    }

    @q0
    public static String o(@o0 TypedArray typedArray, @h1 int i7, @h1 int i8) {
        String string = typedArray.getString(i7);
        return string == null ? typedArray.getString(i8) : string;
    }

    @q0
    public static CharSequence p(@o0 TypedArray typedArray, @h1 int i7, @h1 int i8) {
        CharSequence text = typedArray.getText(i7);
        return text == null ? typedArray.getText(i8) : text;
    }

    @q0
    public static CharSequence[] q(@o0 TypedArray typedArray, @h1 int i7, @h1 int i8) {
        CharSequence[] textArray = typedArray.getTextArray(i7);
        return textArray == null ? typedArray.getTextArray(i8) : textArray;
    }

    public static boolean r(@o0 XmlPullParser xmlPullParser, @o0 String str) {
        return xmlPullParser.getAttributeValue(f13469a, str) != null;
    }

    @o0
    public static TypedArray s(@o0 Resources resources, @q0 Resources.Theme theme, @o0 AttributeSet attributeSet, @o0 int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @q0
    public static TypedValue t(@o0 TypedArray typedArray, @o0 XmlPullParser xmlPullParser, @o0 String str, int i7) {
        if (r(xmlPullParser, str)) {
            return typedArray.peekValue(i7);
        }
        return null;
    }
}
