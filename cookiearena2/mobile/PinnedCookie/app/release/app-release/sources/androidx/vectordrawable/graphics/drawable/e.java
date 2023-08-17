package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.google.android.material.card.MaterialCardViewHelper;
import d.b1;
import java.io.IOException;
import java.util.ArrayList;
import m0.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.a1;
import u.v;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6895a = "AnimatorInflater";

    /* renamed from: b  reason: collision with root package name */
    public static final int f6896b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f6897c = 100;

    /* renamed from: d  reason: collision with root package name */
    public static final int f6898d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f6899e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f6900f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f6901g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final int f6902h = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f6903i = false;

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<a1.b[]> {

        /* renamed from: a  reason: collision with root package name */
        public a1.b[] f6904a;

        public a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public a1.b[] evaluate(float f7, a1.b[] bVarArr, a1.b[] bVarArr2) {
            if (a1.b(bVarArr, bVarArr2)) {
                if (!a1.b(this.f6904a, bVarArr)) {
                    this.f6904a = a1.f(bVarArr);
                }
                for (int i7 = 0; i7 < bVarArr.length; i7++) {
                    this.f6904a[i7].d(bVarArr[i7], bVarArr2[i7], f7);
                }
                return this.f6904a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }

        public a(a1.b[] bVarArr) {
            this.f6904a = bVarArr;
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f7) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe c(Keyframe keyframe, float f7) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f7) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f7) : Keyframe.ofObject(f7);
    }

    public static void d(Keyframe[] keyframeArr, float f7, int i7, int i8) {
        float f8 = f7 / ((i8 - i7) + 2);
        while (i7 <= i8) {
            keyframeArr[i7].setFraction(keyframeArr[i7 - 1].getFraction() + f8);
            i7++;
        }
    }

    public static void e(Object[] objArr, String str) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            Keyframe keyframe = (Keyframe) objArr[i7];
            StringBuilder sb = new StringBuilder();
            sb.append("Keyframe ");
            sb.append(i7);
            sb.append(": fraction ");
            Object obj = "null";
            sb.append(keyframe.getFraction() < 0.0f ? "null" : Float.valueOf(keyframe.getFraction()));
            sb.append(", , value : ");
            if (keyframe.hasValue()) {
                obj = keyframe.getValue();
            }
            sb.append(obj);
        }
    }

    public static PropertyValuesHolder f(TypedArray typedArray, int i7, int i8, int i9, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i8);
        boolean z6 = peekValue != null;
        int i10 = z6 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i9);
        boolean z7 = peekValue2 != null;
        int i11 = z7 ? peekValue2.type : 0;
        if (i7 == 4) {
            i7 = ((z6 && i(i10)) || (z7 && i(i11))) ? 3 : 0;
        }
        boolean z8 = i7 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i7 != 2) {
            f a7 = i7 == 3 ? f.a() : null;
            if (z8) {
                if (z6) {
                    float dimension = i10 == 5 ? typedArray.getDimension(i8, 0.0f) : typedArray.getFloat(i8, 0.0f);
                    if (z7) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z6) {
                int dimension2 = i10 == 5 ? (int) typedArray.getDimension(i8, 0.0f) : i(i10) ? typedArray.getColor(i8, 0) : typedArray.getInt(i8, 0);
                if (z7) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : i(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z7) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : i(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
            }
            if (propertyValuesHolder == null || a7 == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(a7);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i8);
        String string2 = typedArray.getString(i9);
        a1.b[] d7 = a1.d(string);
        a1.b[] d8 = a1.d(string2);
        if (d7 == null && d8 == null) {
            return null;
        }
        if (d7 == null) {
            if (d8 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), d8);
            }
            return null;
        }
        a aVar = new a();
        if (d8 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d7);
        } else if (!a1.b(d7, d8)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d7, d8);
        }
        return ofObject;
    }

    public static int g(TypedArray typedArray, int i7, int i8) {
        TypedValue peekValue = typedArray.peekValue(i7);
        boolean z6 = peekValue != null;
        int i9 = z6 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i8);
        boolean z7 = peekValue2 != null;
        return ((z6 && i(i9)) || (z7 && i(z7 ? peekValue2.type : 0))) ? 3 : 0;
    }

    public static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6838h0);
        int i7 = 0;
        TypedValue t6 = p.t(s6, xmlPullParser, "value", 0);
        if ((t6 != null) && i(t6.type)) {
            i7 = 3;
        }
        s6.recycle();
        return i7;
    }

    public static boolean i(int i7) {
        return i7 >= 28 && i7 <= 31;
    }

    public static Animator j(Context context, @d.b int i7) throws Resources.NotFoundException {
        return AnimatorInflater.loadAnimator(context, i7);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @d.b int i7) throws Resources.NotFoundException {
        return l(context, resources, theme, i7, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @d.b int i7, float f7) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i7);
                    return a(context, resources, theme, xmlResourceParser, f7);
                } catch (XmlPullParserException e7) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i7));
                    notFoundException.initCause(e7);
                    throw notFoundException;
                }
            } catch (IOException e8) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i7));
                notFoundException2.initCause(e8);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f7, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.R);
        TypedArray s7 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6848m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, s6, s7, f7, xmlPullParser);
        int l7 = p.l(s6, xmlPullParser, "interpolator", 0, 0);
        if (l7 > 0) {
            valueAnimator.setInterpolator(d.b(context, l7));
        }
        s6.recycle();
        if (s7 != null) {
            s7.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i7, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6838h0);
        float j7 = p.j(s6, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue t6 = p.t(s6, xmlPullParser, "value", 0);
        boolean z6 = t6 != null;
        if (i7 == 4) {
            i7 = (z6 && i(t6.type)) ? 3 : 0;
        }
        Keyframe ofInt = z6 ? i7 != 0 ? (i7 == 1 || i7 == 3) ? Keyframe.ofInt(j7, p.k(s6, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(j7, p.j(s6, xmlPullParser, "value", 0, 0.0f)) : i7 == 0 ? Keyframe.ofFloat(j7) : Keyframe.ofInt(j7);
        int l7 = p.l(s6, xmlPullParser, "interpolator", 1, 0);
        if (l7 > 0) {
            ofInt.setInterpolator(d.b(context, l7));
        }
        s6.recycle();
        return ofInt;
    }

    public static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f7, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f7, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i7) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i7 == 4) {
                    i7 = h(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe n7 = n(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i7, xmlPullParser);
                if (n7 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(n7);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i8 = 0; i8 < size; i8++) {
                Keyframe keyframe3 = keyframeArr[i8];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i8 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i9 = size - 1;
                        if (i8 == i9) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i10 = i8;
                            for (int i11 = i8 + 1; i11 < i9 && keyframeArr[i11].getFraction() < 0.0f; i11++) {
                                i10 = i11;
                            }
                            d(keyframeArr, keyframeArr[i10 + 1].getFraction() - keyframeArr[i8 - 1].getFraction(), i8, i10);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i7 == 3) {
                propertyValuesHolder.setEvaluator(f.a());
            }
        }
        return propertyValuesHolder;
    }

    public static PropertyValuesHolder[] q(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i7;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6828c0);
                    String m7 = p.m(s6, xmlPullParser, "propertyName", 3);
                    int k7 = p.k(s6, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder p6 = p(context, resources, theme, xmlPullParser, m7, k7);
                    if (p6 == null) {
                        p6 = f(s6, k7, 0, 1, m7);
                    }
                    if (p6 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(p6);
                    }
                    s6.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i7 = 0; i7 < size; i7++) {
                propertyValuesHolderArr[i7] = (PropertyValuesHolder) arrayList.get(i7);
            }
        }
        return propertyValuesHolderArr;
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f7, XmlPullParser xmlPullParser) {
        long k7 = p.k(typedArray, xmlPullParser, v.h.f17253b, 1, MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION);
        long k8 = p.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int k9 = p.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (p.r(xmlPullParser, "valueFrom") && p.r(xmlPullParser, "valueTo")) {
            if (k9 == 4) {
                k9 = g(typedArray, 5, 6);
            }
            PropertyValuesHolder f8 = f(typedArray, k9, 5, 6, "");
            if (f8 != null) {
                valueAnimator.setValues(f8);
            }
        }
        valueAnimator.setDuration(k7);
        valueAnimator.setStartDelay(k8);
        valueAnimator.setRepeatCount(p.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(p.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, k9, f7, xmlPullParser);
        }
    }

    public static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i7, float f7, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m7 = p.m(typedArray, xmlPullParser, "pathData", 1);
        if (m7 == null) {
            objectAnimator.setPropertyName(p.m(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m8 = p.m(typedArray, xmlPullParser, "propertyXName", 2);
        String m9 = p.m(typedArray, xmlPullParser, "propertyYName", 3);
        if (i7 != 2) {
        }
        if (m8 != null || m9 != null) {
            t(a1.e(m7), objectAnimator, f7 * 0.5f, m8, m9);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    public static void t(Path path, ObjectAnimator objectAnimator, float f7, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f8 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f9 = 0.0f;
        do {
            f9 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f9));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f9 / f7)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f10 = f9 / ((float) (min - 1));
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f8 - ((Float) arrayList.get(i8)).floatValue(), fArr3, null);
            fArr[i7] = fArr3[0];
            fArr2[i7] = fArr3[1];
            f8 += f10;
            int i9 = i8 + 1;
            if (i9 < arrayList.size() && f8 > ((Float) arrayList.get(i9)).floatValue()) {
                pathMeasure2.nextContour();
                i8 = i9;
            }
            i7++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
