package c0;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    public static final int f7438b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final String f7439c = "CustomMethod";

    /* renamed from: d  reason: collision with root package name */
    public static final String f7440d = "CustomAttribute";

    /* renamed from: e  reason: collision with root package name */
    public static HashMap<String, Constructor<? extends f>> f7441e = null;

    /* renamed from: f  reason: collision with root package name */
    public static final String f7442f = "KeyFrames";

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, ArrayList<f>> f7443a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends f>> hashMap = new HashMap<>();
        f7441e = hashMap;
        try {
            hashMap.put("KeyAttribute", g.class.getConstructor(new Class[0]));
            f7441e.put("KeyPosition", j.class.getConstructor(new Class[0]));
            f7441e.put("KeyCycle", h.class.getConstructor(new Class[0]));
            f7441e.put("KeyTimeCycle", l.class.getConstructor(new Class[0]));
            f7441e.put("KeyTrigger", m.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e7) {
            Log.e(f7442f, "unable to load", e7);
        }
    }

    public i() {
    }

    public static String f(int viewId, Context context) {
        return context.getResources().getResourceEntryName(viewId);
    }

    public void a(o motionController) {
        ArrayList<f> arrayList = this.f7443a.get(-1);
        if (arrayList != null) {
            motionController.b(arrayList);
        }
    }

    public void b(o motionController) {
        ArrayList<f> arrayList = this.f7443a.get(Integer.valueOf(motionController.f7548c));
        if (arrayList != null) {
            motionController.b(arrayList);
        }
        ArrayList<f> arrayList2 = this.f7443a.get(-1);
        if (arrayList2 != null) {
            Iterator<f> it = arrayList2.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next.g(((ConstraintLayout.b) motionController.f7547b.getLayoutParams()).f2035c0)) {
                    motionController.a(next);
                }
            }
        }
    }

    public void c(f key) {
        if (!this.f7443a.containsKey(Integer.valueOf(key.f7382b))) {
            this.f7443a.put(Integer.valueOf(key.f7382b), new ArrayList<>());
        }
        ArrayList<f> arrayList = this.f7443a.get(Integer.valueOf(key.f7382b));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<f> d(int id) {
        return this.f7443a.get(Integer.valueOf(id));
    }

    public Set<Integer> e() {
        return this.f7443a.keySet();
    }

    public i(Context context, XmlPullParser parser) {
        Exception e7;
        f fVar;
        Constructor<? extends f> constructor;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap2;
        try {
            int eventType = parser.getEventType();
            f fVar2 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(parser.getName())) {
                        return;
                    }
                } else {
                    String name = parser.getName();
                    if (f7441e.containsKey(name)) {
                        try {
                            constructor = f7441e.get(name);
                        } catch (Exception e8) {
                            f fVar3 = fVar2;
                            e7 = e8;
                            fVar = fVar3;
                        }
                        if (constructor != null) {
                            fVar = constructor.newInstance(new Object[0]);
                            try {
                                fVar.f(context, Xml.asAttributeSet(parser));
                                c(fVar);
                            } catch (Exception e9) {
                                e7 = e9;
                                Log.e(f7442f, "unable to create ", e7);
                                fVar2 = fVar;
                                eventType = parser.next();
                            }
                            fVar2 = fVar;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                            break;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (fVar2 != null && (hashMap2 = fVar2.f7385e) != null) {
                            androidx.constraintlayout.widget.a.q(context, parser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && fVar2 != null && (hashMap = fVar2.f7385e) != null) {
                        androidx.constraintlayout.widget.a.q(context, parser, hashMap);
                    }
                }
                eventType = parser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
