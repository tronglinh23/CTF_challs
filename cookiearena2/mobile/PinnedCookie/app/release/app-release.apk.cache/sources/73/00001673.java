package m0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import d.b1;
import d.o0;
import d.q0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final String f13425d = "ComplexColorCompat";

    /* renamed from: a  reason: collision with root package name */
    public final Shader f13426a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f13427b;

    /* renamed from: c  reason: collision with root package name */
    public int f13428c;

    public d(Shader shader, ColorStateList colorStateList, @d.l int i7) {
        this.f13426a = shader;
        this.f13427b = colorStateList;
        this.f13428c = i7;
    }

    @o0
    public static d a(@o0 Resources resources, @d.n int i7, @q0 Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i7);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return d(g.c(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return c(c.b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static d b(@d.l int i7) {
        return new d(null, null, i7);
    }

    public static d c(@o0 ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static d d(@o0 Shader shader) {
        return new d(shader, null, 0);
    }

    @q0
    public static d g(@o0 Resources resources, @d.n int i7, @q0 Resources.Theme theme) {
        try {
            return a(resources, i7, theme);
        } catch (Exception e7) {
            Log.e(f13425d, "Failed to inflate ComplexColor.", e7);
            return null;
        }
    }

    @d.l
    public int e() {
        return this.f13428c;
    }

    @q0
    public Shader f() {
        return this.f13426a;
    }

    public boolean h() {
        return this.f13426a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f13426a == null && (colorStateList = this.f13427b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f13427b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f13428c) {
                this.f13428c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(@d.l int i7) {
        this.f13428c = i7;
    }

    public boolean l() {
        return h() || this.f13428c != 0;
    }
}