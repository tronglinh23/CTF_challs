package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class k0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f6683b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final androidx.collection.a<String, Constructor<?>> f6684c = new androidx.collection.a<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f6685a;

    public k0(@d.o0 Context context) {
        this.f6685a = context;
    }

    @d.o0
    public static k0 d(@d.o0 Context context) {
        return new k0(context);
    }

    public final Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue == null) {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
        try {
            androidx.collection.a<String, Constructor<?>> aVar = f6684c;
            synchronized (aVar) {
                Constructor<?> constructor = aVar.get(attributeValue);
                if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f6685a.getClassLoader()).asSubclass(cls)) != 0) {
                    constructor = asSubclass.getConstructor(f6683b);
                    constructor.setAccessible(true);
                    aVar.put(attributeValue, constructor);
                }
                newInstance = constructor.newInstance(this.f6685a, attributeSet);
            }
            return newInstance;
        } catch (Exception e7) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x017d, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.transition.j0 b(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, androidx.transition.j0 r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.k0.b(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, androidx.transition.j0):androidx.transition.j0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.transition.m0 c(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L54
        L12:
            r3 = 1
            if (r2 == r3) goto L54
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2b
            androidx.transition.m0 r1 = new androidx.transition.m0
            r1.<init>()
            goto L5
        L2b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            if (r1 == 0) goto L39
            r4.h(r6, r5, r7, r1)
            goto L5
        L39:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.k0.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.m0");
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(XmlPullParser xmlPullParser, AttributeSet attributeSet, j0 j0Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (!xmlPullParser.getName().equals("target")) {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
                TypedArray obtainStyledAttributes = this.f6685a.obtainStyledAttributes(attributeSet, i0.f6601a);
                int l7 = m0.p.l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                if (l7 != 0) {
                    j0Var.addTarget(l7);
                } else {
                    int l8 = m0.p.l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (l8 != 0) {
                        j0Var.excludeTarget(l8, true);
                    } else {
                        String m7 = m0.p.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                        if (m7 != null) {
                            j0Var.addTarget(m7);
                        } else {
                            String m8 = m0.p.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                            if (m8 != null) {
                                j0Var.excludeTarget(m8, true);
                            } else {
                                String m9 = m0.p.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                if (m9 != null) {
                                    try {
                                        j0Var.excludeTarget(Class.forName(m9), true);
                                    } catch (ClassNotFoundException e7) {
                                        obtainStyledAttributes.recycle();
                                        throw new RuntimeException("Could not create " + m9, e7);
                                    }
                                } else {
                                    String m10 = m0.p.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (m10 != null) {
                                        j0Var.addTarget(Class.forName(m10));
                                    }
                                }
                            }
                        }
                    }
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    public j0 f(int i7) {
        XmlResourceParser xml = this.f6685a.getResources().getXml(i7);
        try {
            try {
                return b(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e7) {
                throw new InflateException(xml.getPositionDescription() + ": " + e7.getMessage(), e7);
            } catch (XmlPullParserException e8) {
                throw new InflateException(e8.getMessage(), e8);
            }
        } finally {
            xml.close();
        }
    }

    public m0 g(int i7, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f6685a.getResources().getXml(i7);
        try {
            try {
                return c(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e7) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e7.getMessage());
                inflateException.initCause(e7);
                throw inflateException;
            } catch (XmlPullParserException e8) {
                InflateException inflateException2 = new InflateException(e8.getMessage());
                inflateException2.initCause(e8);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, m0 m0Var) throws Resources.NotFoundException {
        j0 f7;
        TypedArray obtainStyledAttributes = this.f6685a.obtainStyledAttributes(attributeSet, i0.f6602b);
        int l7 = m0.p.l(obtainStyledAttributes, xmlPullParser, androidx.appcompat.graphics.drawable.a.A, 2, -1);
        int l8 = m0.p.l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        f0 d7 = l8 < 0 ? null : f0.d(viewGroup, l8, this.f6685a);
        int l9 = m0.p.l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        f0 d8 = l9 >= 0 ? f0.d(viewGroup, l9, this.f6685a) : null;
        if (l7 >= 0 && (f7 = f(l7)) != null) {
            if (d8 == null) {
                throw new RuntimeException("No toScene for transition ID " + l7);
            } else if (d7 == null) {
                m0Var.l(d8, f7);
            } else {
                m0Var.k(d7, d8, f7);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
