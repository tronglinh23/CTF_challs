package u3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import i5.c0;
import java.util.HashSet;
import java.util.Set;
import s3.a;
import u4.l0;
import x3.l1;
@t3.d
/* loaded from: classes.dex */
public final class z {
    public final ComponentName a(String str, CharSequence charSequence) {
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                String obj = charSequence.toString();
                if (obj.charAt(0) == '.') {
                    return new ComponentName(str, l0.C(str, obj));
                }
                int r32 = c0.r3(obj, '/', 0, false, 6, null);
                if (r32 > 0) {
                    str = obj.substring(0, r32);
                    l0.o(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    obj = obj.substring(r32 + 1);
                    l0.o(obj, "this as java.lang.String).substring(startIndex)");
                }
                if (l0.g(obj, "*") || c0.r3(obj, '.', 0, false, 6, null) >= 0) {
                    return new ComponentName(str, obj);
                }
                return new ComponentName(str, str + '.' + obj);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    public final a b(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, a.c.f16628a, 0, 0);
        String string = obtainStyledAttributes.getString(a.c.f16630c);
        String string2 = obtainStyledAttributes.getString(a.c.f16629b);
        String packageName = context.getApplicationContext().getPackageName();
        l0.o(packageName, "packageName");
        return new a(a(packageName, string), string2);
    }

    public final b c(Context context, XmlResourceParser xmlResourceParser) {
        return new b(l1.k(), context.getTheme().obtainStyledAttributes(xmlResourceParser, a.c.f16631d, 0, 0).getBoolean(a.c.f16632e, false));
    }

    public final u d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, a.c.f16633f, 0, 0);
        String string = obtainStyledAttributes.getString(a.c.f16634g);
        String string2 = obtainStyledAttributes.getString(a.c.f16636i);
        String string3 = obtainStyledAttributes.getString(a.c.f16635h);
        String packageName = context.getApplicationContext().getPackageName();
        l0.o(packageName, "packageName");
        return new u(a(packageName, string), a(packageName, string2), string3);
    }

    public final v e(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, a.c.f16637j, 0, 0);
        float f7 = obtainStyledAttributes.getFloat(a.c.f16644q, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(a.c.f16643p, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(a.c.f16642o, 0.0f);
        int i7 = obtainStyledAttributes.getInt(a.c.f16641n, 3);
        return new v(l1.k(), obtainStyledAttributes.getBoolean(a.c.f16639l, false), obtainStyledAttributes.getBoolean(a.c.f16640m, true), obtainStyledAttributes.getBoolean(a.c.f16638k, false), dimension, dimension2, f7, i7);
    }

    public final w f(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, a.c.f16645r, 0, 0);
        String string = obtainStyledAttributes.getString(a.c.f16646s);
        float f7 = obtainStyledAttributes.getFloat(a.c.f16650w, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(a.c.f16649v, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(a.c.f16648u, 0.0f);
        int i7 = obtainStyledAttributes.getInt(a.c.f16647t, 3);
        String packageName = context.getApplicationContext().getPackageName();
        l0.o(packageName, "packageName");
        ComponentName a7 = a(packageName, string);
        Set k7 = l1.k();
        Intent component = new Intent().setComponent(a7);
        l0.o(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new w(k7, component, dimension, dimension2, f7, i7);
    }

    @n6.e
    public final Set<m> g(@n6.d Context context, int i7) {
        l0.p(context, "context");
        return h(context, i7);
    }

    public final Set<m> h(Context context, int i7) {
        w h7;
        b c7;
        v e7;
        try {
            XmlResourceParser xml = context.getResources().getXml(i7);
            l0.o(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            b bVar = null;
            v vVar = null;
            w wVar = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || l0.g("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (bVar != null || wVar != null) {
                                        a b7 = b(context, xml);
                                        if (bVar == null) {
                                            if (wVar != null) {
                                                hashSet.remove(wVar);
                                                h7 = wVar.h(b7);
                                                hashSet.add(h7);
                                                wVar = h7;
                                                break;
                                            }
                                        } else {
                                            hashSet.remove(bVar);
                                            c7 = bVar.c(b7);
                                            hashSet.add(c7);
                                            bVar = c7;
                                            break;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    e7 = e(context, xml);
                                    hashSet.add(e7);
                                    bVar = null;
                                    wVar = null;
                                    vVar = e7;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (vVar != null) {
                                        u d7 = d(context, xml);
                                        hashSet.remove(vVar);
                                        e7 = vVar.j(d7);
                                        hashSet.add(e7);
                                        vVar = e7;
                                        break;
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    c7 = c(context, xml);
                                    hashSet.add(c7);
                                    vVar = null;
                                    wVar = null;
                                    bVar = c7;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    h7 = f(context, xml);
                                    hashSet.add(h7);
                                    bVar = null;
                                    vVar = null;
                                    wVar = h7;
                                    break;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
