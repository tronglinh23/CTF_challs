package h;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.b1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
@b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public final class a {

    @w0(15)
    /* renamed from: h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0112a {
        @u
        public static void a(@o0 Resources resources, int i7, int i8, @o0 TypedValue typedValue, boolean z6) {
            resources.getValueForDensity(i7, i8, typedValue, z6);
        }
    }

    @w0(18)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static void a(@o0 ObjectAnimator objectAnimator, boolean z6) {
            objectAnimator.setAutoCancel(z6);
        }
    }

    @w0(21)
    /* loaded from: classes.dex */
    public static class c {
        @u
        @o0
        public static Drawable a(@o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @u
        public static int b(@o0 TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @u
        public static void c(@o0 Drawable drawable, @o0 Resources resources, @o0 XmlPullParser xmlPullParser, @o0 AttributeSet attributeSet, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }
}
