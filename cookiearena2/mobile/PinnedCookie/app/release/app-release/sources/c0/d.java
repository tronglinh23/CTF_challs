package c0;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
/* loaded from: classes.dex */
public class d implements w {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f7350g = false;

    /* renamed from: h  reason: collision with root package name */
    public static final String f7351h = "DesignTool";

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap<Pair<Integer, Integer>, String> f7352i;

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<String, String> f7353j;

    /* renamed from: a  reason: collision with root package name */
    public final s f7354a;

    /* renamed from: b  reason: collision with root package name */
    public u f7355b;

    /* renamed from: c  reason: collision with root package name */
    public String f7356c = null;

    /* renamed from: d  reason: collision with root package name */
    public String f7357d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f7358e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f7359f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        f7352i = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f7353j = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public d(s motionLayout) {
        this.f7354a = motionLayout;
    }

    public static void j(int dpi, androidx.constraintlayout.widget.e set, View view, HashMap<String, String> attributes, int from, int to) {
        String str = f7352i.get(Pair.create(Integer.valueOf(from), Integer.valueOf(to)));
        String str2 = attributes.get(str);
        if (str2 != null) {
            String str3 = f7353j.get(str);
            int k7 = str3 != null ? k(dpi, attributes.get(str3)) : 0;
            set.L(view.getId(), from, Integer.parseInt(str2), to, k7);
        }
    }

    public static int k(int dpi, String value) {
        int indexOf;
        if (value == null || (indexOf = value.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(value.substring(0, indexOf)).intValue() * dpi) / 160.0f);
    }

    public static void l(int dpi, androidx.constraintlayout.widget.e set, View view, HashMap<String, String> attributes) {
        String str = attributes.get("layout_editor_absoluteX");
        if (str != null) {
            set.W0(view.getId(), k(dpi, str));
        }
        String str2 = attributes.get("layout_editor_absoluteY");
        if (str2 != null) {
            set.X0(view.getId(), k(dpi, str2));
        }
    }

    public static void m(androidx.constraintlayout.widget.e set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (type == 0) {
                set.f1(view.getId(), Float.parseFloat(str));
            } else if (type == 1) {
                set.A1(view.getId(), Float.parseFloat(str));
            }
        }
    }

    public static void n(int dpi, androidx.constraintlayout.widget.e set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int k7 = !str.equalsIgnoreCase("wrap_content") ? k(dpi, str) : -2;
            if (type == 0) {
                set.W(view.getId(), k7);
            } else {
                set.P(view.getId(), k7);
            }
        }
    }

    public String A() {
        if (this.f7356c != null && this.f7357d != null) {
            float y6 = y();
            if (y6 <= 0.01f) {
                return this.f7356c;
            }
            if (y6 >= 0.99f) {
                return this.f7357d;
            }
        }
        return this.f7356c;
    }

    public boolean B() {
        return (this.f7356c == null || this.f7357d == null) ? false : true;
    }

    public void C(Object keyFrame, String tag, Object value) {
        if (keyFrame instanceof f) {
            ((f) keyFrame).j(tag, value);
            this.f7354a.r0();
            this.f7354a.f7614t = true;
        }
    }

    public void D(String id) {
        if (id == null) {
            id = "motion_base";
        }
        if (this.f7356c == id) {
            return;
        }
        this.f7356c = id;
        this.f7357d = null;
        s sVar = this.f7354a;
        if (sVar.f7578b == null) {
            sVar.f7578b = this.f7355b;
        }
        int m02 = sVar.m0(id);
        this.f7358e = m02;
        if (m02 != 0) {
            if (m02 == this.f7354a.getStartState()) {
                this.f7354a.setProgress(0.0f);
            } else if (m02 == this.f7354a.getEndState()) {
                this.f7354a.setProgress(1.0f);
            } else {
                this.f7354a.E0(m02);
                this.f7354a.setProgress(1.0f);
            }
        }
        this.f7354a.requestLayout();
    }

    public void E(String start, String end) {
        s sVar = this.f7354a;
        if (sVar.f7578b == null) {
            sVar.f7578b = this.f7355b;
        }
        int m02 = sVar.m0(start);
        int m03 = this.f7354a.m0(end);
        this.f7354a.w0(m02, m03);
        this.f7358e = m02;
        this.f7359f = m03;
        this.f7356c = start;
        this.f7357d = end;
    }

    public void F(Object view, int debugMode) {
        o oVar;
        if ((view instanceof View) && (oVar = this.f7354a.f7598l.get(view)) != null) {
            oVar.S(debugMode);
            this.f7354a.invalidate();
        }
    }

    @Override // c0.w
    public long a() {
        return this.f7354a.getTransitionTimeMs();
    }

    @Override // c0.w
    public int b(int cmd, String type, Object viewObject, float[] in, int inLength, float[] out, int outLength) {
        o oVar;
        View view = (View) viewObject;
        if (cmd != 0) {
            s sVar = this.f7354a;
            if (sVar.f7578b == null || view == null || (oVar = sVar.f7598l.get(view)) == null) {
                return -1;
            }
        } else {
            oVar = null;
        }
        if (cmd != 0) {
            if (cmd == 1) {
                int t6 = this.f7354a.f7578b.t() / 16;
                oVar.f(out, t6);
                return t6;
            } else if (cmd == 2) {
                int t7 = this.f7354a.f7578b.t() / 16;
                oVar.e(out, null);
                return t7;
            } else if (cmd != 3) {
                return -1;
            } else {
                int t8 = this.f7354a.f7578b.t() / 16;
                return oVar.l(type, out, outLength);
            }
        }
        return 1;
    }

    @Override // c0.w
    public boolean c(Object view, int position, int type, float x6, float y6) {
        if (view instanceof View) {
            s sVar = this.f7354a;
            if (sVar.f7578b != null) {
                o oVar = sVar.f7598l.get(view);
                s sVar2 = this.f7354a;
                int i7 = (int) (sVar2.f7604o * 100.0f);
                if (oVar != null) {
                    View view2 = (View) view;
                    if (sVar2.f7578b.S(view2, i7)) {
                        float y7 = oVar.y(2, x6, y6);
                        float y8 = oVar.y(5, x6, y6);
                        this.f7354a.f7578b.l0(view2, i7, "motion:percentX", Float.valueOf(y7));
                        this.f7354a.f7578b.l0(view2, i7, "motion:percentY", Float.valueOf(y8));
                        this.f7354a.r0();
                        this.f7354a.S(true);
                        this.f7354a.invalidate();
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // c0.w
    public void d(float position) {
        s sVar = this.f7354a;
        if (sVar.f7578b == null) {
            sVar.f7578b = this.f7355b;
        }
        sVar.setProgress(position);
        this.f7354a.S(true);
        this.f7354a.requestLayout();
        this.f7354a.invalidate();
    }

    @Override // c0.w
    public Boolean e(Object keyFrame, Object view, float x6, float y6, String[] attribute, float[] value) {
        if (keyFrame instanceof k) {
            View view2 = (View) view;
            this.f7354a.f7598l.get(view2).N(view2, (k) keyFrame, x6, y6, attribute, value);
            this.f7354a.r0();
            this.f7354a.f7614t = true;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // c0.w
    public void f(int dpi, String constraintSetId, Object opaqueView, Object opaqueAttributes) {
        View view = (View) opaqueView;
        HashMap hashMap = (HashMap) opaqueAttributes;
        int m02 = this.f7354a.m0(constraintSetId);
        androidx.constraintlayout.widget.e o6 = this.f7354a.f7578b.o(m02);
        if (o6 == null) {
            return;
        }
        o6.E(view.getId());
        n(dpi, o6, view, hashMap, 0);
        n(dpi, o6, view, hashMap, 1);
        j(dpi, o6, view, hashMap, 6, 6);
        j(dpi, o6, view, hashMap, 6, 7);
        j(dpi, o6, view, hashMap, 7, 7);
        j(dpi, o6, view, hashMap, 7, 6);
        j(dpi, o6, view, hashMap, 1, 1);
        j(dpi, o6, view, hashMap, 1, 2);
        j(dpi, o6, view, hashMap, 2, 2);
        j(dpi, o6, view, hashMap, 2, 1);
        j(dpi, o6, view, hashMap, 3, 3);
        j(dpi, o6, view, hashMap, 3, 4);
        j(dpi, o6, view, hashMap, 4, 3);
        j(dpi, o6, view, hashMap, 4, 4);
        j(dpi, o6, view, hashMap, 5, 5);
        m(o6, view, hashMap, 0);
        m(o6, view, hashMap, 1);
        l(dpi, o6, view, hashMap);
        this.f7354a.J0(m02, o6);
        this.f7354a.requestLayout();
    }

    @Override // c0.w
    public void g(Object view, int position, String name, Object value) {
        u uVar = this.f7354a.f7578b;
        if (uVar != null) {
            uVar.l0((View) view, position, name, value);
            s sVar = this.f7354a;
            sVar.f7610r = position / 100.0f;
            sVar.f7606p = 0.0f;
            sVar.r0();
            this.f7354a.S(true);
        }
    }

    @Override // c0.w
    public float h(Object view, int type, float x6, float y6) {
        o oVar;
        if ((view instanceof View) && (oVar = this.f7354a.f7598l.get((View) view)) != null) {
            return oVar.y(type, x6, y6);
        }
        return 0.0f;
    }

    @Override // c0.w
    public Object i(Object viewObject, float x6, float y6) {
        o oVar;
        View view = (View) viewObject;
        s sVar = this.f7354a;
        if (sVar.f7578b == null) {
            return -1;
        }
        if (view == null || (oVar = sVar.f7598l.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return oVar.B(viewGroup.getWidth(), viewGroup.getHeight(), x6, y6);
    }

    public void o(boolean disable) {
        this.f7354a.O(disable);
    }

    public void p(String set) {
        s sVar = this.f7354a;
        if (sVar.f7578b == null) {
            sVar.f7578b = this.f7355b;
        }
        int m02 = sVar.m0(set);
        System.out.println(" dumping  " + set + " (" + m02 + ")");
        try {
            this.f7354a.f7578b.o(m02).g0(this.f7354a.f7578b, new int[0]);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public int q(Object view, float[] key) {
        u uVar = this.f7354a.f7578b;
        if (uVar == null) {
            return -1;
        }
        int t6 = uVar.t() / 16;
        o oVar = this.f7354a.f7598l.get(view);
        if (oVar == null) {
            return 0;
        }
        oVar.e(key, null);
        return t6;
    }

    public int r(Object view, float[] path, int len) {
        s sVar = this.f7354a;
        if (sVar.f7578b == null) {
            return -1;
        }
        o oVar = sVar.f7598l.get(view);
        if (oVar == null) {
            return 0;
        }
        oVar.f(path, len);
        return len;
    }

    public void s(Object view, float[] path) {
        u uVar = this.f7354a.f7578b;
        if (uVar == null) {
            return;
        }
        int t6 = uVar.t() / 16;
        o oVar = this.f7354a.f7598l.get(view);
        if (oVar == null) {
            return;
        }
        oVar.h(path, t6);
    }

    public String t() {
        int endState = this.f7354a.getEndState();
        if (this.f7359f == endState) {
            return this.f7357d;
        }
        String a02 = this.f7354a.a0(endState);
        if (a02 != null) {
            this.f7357d = a02;
            this.f7359f = endState;
        }
        return a02;
    }

    public int u(Object view, int type, int[] info) {
        o oVar = this.f7354a.f7598l.get((View) view);
        if (oVar == null) {
            return 0;
        }
        return oVar.x(type, info);
    }

    public int v(Object view, int[] type, float[] pos) {
        o oVar = this.f7354a.f7598l.get((View) view);
        if (oVar == null) {
            return 0;
        }
        return oVar.z(type, pos);
    }

    public Object w(int type, int target, int position) {
        s sVar = this.f7354a;
        u uVar = sVar.f7578b;
        if (uVar == null) {
            return null;
        }
        return uVar.y(sVar.getContext(), type, target, position);
    }

    public Object x(Object view, int type, int position) {
        if (this.f7354a.f7578b == null) {
            return null;
        }
        int id = ((View) view).getId();
        s sVar = this.f7354a;
        return sVar.f7578b.y(sVar.getContext(), type, id, position);
    }

    public float y() {
        return this.f7354a.getProgress();
    }

    public String z() {
        int startState = this.f7354a.getStartState();
        if (this.f7358e == startState) {
            return this.f7356c;
        }
        String a02 = this.f7354a.a0(startState);
        if (a02 != null) {
            this.f7356c = a02;
            this.f7358e = startState;
        }
        return this.f7354a.a0(startState);
    }
}
