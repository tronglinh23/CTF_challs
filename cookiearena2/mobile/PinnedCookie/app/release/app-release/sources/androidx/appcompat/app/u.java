package androidx.appcompat.app;

import android.util.AttributeSet;
import d.o0;
import d.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class u {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Deque<WeakReference<XmlPullParser>> f906a = new ArrayDeque();

    public static boolean b(@q0 XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3) {
                    return xmlPullParser.getEventType() == 1;
                }
                return true;
            } catch (XmlPullParserException unused) {
                return true;
            }
        }
        return true;
    }

    @q0
    public static XmlPullParser c(@o0 Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    public static boolean d(@o0 XmlPullParser xmlPullParser, @q0 XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    public boolean a(@o0 AttributeSet attributeSet) {
        if (attributeSet instanceof XmlPullParser) {
            XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
            if (xmlPullParser.getDepth() == 1) {
                XmlPullParser c7 = c(this.f906a);
                this.f906a.push(new WeakReference<>(xmlPullParser));
                return d(xmlPullParser, c7);
            }
            return false;
        }
        return false;
    }
}
