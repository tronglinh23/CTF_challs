package h1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import d.b1;
import d.w0;
import f0.a;
import h1.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z0.a;
/* loaded from: classes.dex */
public class f0 {
    public static final int A = 32;
    public static final int B = 64;
    public static final int C = 128;
    public static final int D = 256;
    public static final int E = 512;
    public static final int F = 1024;
    public static final int G = 2048;
    public static final int H = 4096;
    public static final int I = 8192;
    public static final int J = 16384;
    public static final int K = 32768;
    public static final int L = 65536;
    public static final int M = 131072;
    public static final int N = 262144;
    public static final int O = 524288;
    public static final int P = 1048576;
    public static final int Q = 2097152;
    public static final String R = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String S = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String T = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String U = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String V = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String W = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String X = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String Y = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String Z = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f10166a0 = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f10167b0 = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    @SuppressLint({"ActionValue"})

    /* renamed from: c0  reason: collision with root package name */
    public static final String f10168c0 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* renamed from: d  reason: collision with root package name */
    public static final String f10169d = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: d0  reason: collision with root package name */
    public static final int f10170d0 = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final String f10171e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* renamed from: e0  reason: collision with root package name */
    public static final int f10172e0 = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final String f10173f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* renamed from: f0  reason: collision with root package name */
    public static final int f10174f0 = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final String f10175g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* renamed from: g0  reason: collision with root package name */
    public static final int f10176g0 = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final String f10177h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* renamed from: h0  reason: collision with root package name */
    public static final int f10178h0 = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final String f10179i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* renamed from: i0  reason: collision with root package name */
    public static final int f10180i0 = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final String f10181j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* renamed from: j0  reason: collision with root package name */
    public static final int f10182j0 = 16;

    /* renamed from: k  reason: collision with root package name */
    public static final String f10183k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* renamed from: k0  reason: collision with root package name */
    public static final String f10184k0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";

    /* renamed from: l  reason: collision with root package name */
    public static final String f10185l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* renamed from: l0  reason: collision with root package name */
    public static final String f10186l0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";

    /* renamed from: m  reason: collision with root package name */
    public static final String f10187m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* renamed from: m0  reason: collision with root package name */
    public static final String f10188m0 = "android.core.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";

    /* renamed from: n  reason: collision with root package name */
    public static final String f10189n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* renamed from: n0  reason: collision with root package name */
    public static final int f10190n0 = 20000;

    /* renamed from: o  reason: collision with root package name */
    public static final String f10191o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";

    /* renamed from: o0  reason: collision with root package name */
    public static int f10192o0 = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final String f10193p = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";

    /* renamed from: q  reason: collision with root package name */
    public static final int f10194q = 1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f10195r = 2;

    /* renamed from: s  reason: collision with root package name */
    public static final int f10196s = 4;

    /* renamed from: t  reason: collision with root package name */
    public static final int f10197t = 8;

    /* renamed from: u  reason: collision with root package name */
    public static final int f10198u = 32;

    /* renamed from: v  reason: collision with root package name */
    public static final int f10199v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f10200w = 2;

    /* renamed from: x  reason: collision with root package name */
    public static final int f10201x = 4;

    /* renamed from: y  reason: collision with root package name */
    public static final int f10202y = 8;

    /* renamed from: z  reason: collision with root package name */
    public static final int f10203z = 16;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f10204a;
    @b1({b1.a.LIBRARY_GROUP_PREFIX})

    /* renamed from: b  reason: collision with root package name */
    public int f10205b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f10206c = -1;

    /* loaded from: classes.dex */
    public static class a {
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        @d.o0
        public static final a H;
        @d.o0
        public static final a I;
        @d.o0
        public static final a J;
        @d.o0
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        @d.o0
        public static final a Q;
        @d.o0
        public static final a R;
        @d.o0
        public static final a S;
        @d.o0
        public static final a T;
        @d.o0
        public static final a U;
        @d.o0
        public static final a V;

        /* renamed from: e  reason: collision with root package name */
        public static final String f10207e = "A11yActionCompat";

        /* renamed from: a  reason: collision with root package name */
        public final Object f10229a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10230b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends q0.a> f10231c;
        @b1({b1.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: d  reason: collision with root package name */
        public final q0 f10232d;

        /* renamed from: f  reason: collision with root package name */
        public static final a f10208f = new a(1, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f10209g = new a(2, null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f10210h = new a(4, null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f10211i = new a(8, null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f10212j = new a(16, null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f10213k = new a(32, null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f10214l = new a(64, null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f10215m = new a(128, null);

        /* renamed from: n  reason: collision with root package name */
        public static final a f10216n = new a(256, (CharSequence) null, q0.b.class);

        /* renamed from: o  reason: collision with root package name */
        public static final a f10217o = new a(512, (CharSequence) null, q0.b.class);

        /* renamed from: p  reason: collision with root package name */
        public static final a f10218p = new a(1024, (CharSequence) null, q0.c.class);

        /* renamed from: q  reason: collision with root package name */
        public static final a f10219q = new a(2048, (CharSequence) null, q0.c.class);

        /* renamed from: r  reason: collision with root package name */
        public static final a f10220r = new a(4096, null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f10221s = new a(8192, null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f10222t = new a(16384, null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f10223u = new a(32768, null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f10224v = new a(65536, null);

        /* renamed from: w  reason: collision with root package name */
        public static final a f10225w = new a(131072, (CharSequence) null, q0.g.class);

        /* renamed from: x  reason: collision with root package name */
        public static final a f10226x = new a(262144, null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f10227y = new a(524288, null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f10228z = new a(1048576, null);
        public static final a A = new a(2097152, (CharSequence) null, q0.h.class);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            int i7 = Build.VERSION.SDK_INT;
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, q0.e.class);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            if (i7 >= 29) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction22;
            } else {
                accessibilityAction = null;
            }
            H = new a(accessibilityAction, 16908358, null, null, null);
            if (i7 >= 29) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction21;
            } else {
                accessibilityAction2 = null;
            }
            I = new a(accessibilityAction2, 16908359, null, null, null);
            if (i7 >= 29) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction20;
            } else {
                accessibilityAction3 = null;
            }
            J = new a(accessibilityAction3, 16908360, null, null, null);
            if (i7 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction19;
            } else {
                accessibilityAction4 = null;
            }
            K = new a(accessibilityAction4, 16908361, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, q0.f.class);
            N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, q0.d.class);
            if (i7 >= 28) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction5 = accessibilityAction18;
            } else {
                accessibilityAction5 = null;
            }
            O = new a(accessibilityAction5, 16908356, null, null, null);
            if (i7 >= 28) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction6 = accessibilityAction17;
            } else {
                accessibilityAction6 = null;
            }
            P = new a(accessibilityAction6, 16908357, null, null, null);
            if (i7 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction7 = accessibilityAction16;
            } else {
                accessibilityAction7 = null;
            }
            Q = new a(accessibilityAction7, 16908362, null, null, null);
            if (i7 >= 30) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction8 = accessibilityAction15;
            } else {
                accessibilityAction8 = null;
            }
            R = new a(accessibilityAction8, 16908372, null, null, null);
            if (i7 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction9 = accessibilityAction14;
            } else {
                accessibilityAction9 = null;
            }
            S = new a(accessibilityAction9, 16908373, null, null, null);
            if (i7 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction10 = accessibilityAction13;
            } else {
                accessibilityAction10 = null;
            }
            T = new a(accessibilityAction10, 16908374, null, null, null);
            if (i7 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction11 = accessibilityAction12;
            } else {
                accessibilityAction11 = null;
            }
            U = new a(accessibilityAction11, 16908375, null, null, null);
            V = new a(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, 16908376, null, null, null);
        }

        public a(int i7, CharSequence charSequence) {
            this(null, i7, charSequence, null, null);
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, q0 q0Var) {
            return new a(null, this.f10230b, charSequence, q0Var, this.f10231c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f10229a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f10229a).getLabel();
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) {
            q0.a newInstance;
            if (this.f10232d != null) {
                Class<? extends q0.a> cls = this.f10231c;
                q0.a aVar = null;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e7) {
                        e = e7;
                    }
                    try {
                        newInstance.a(bundle);
                        aVar = newInstance;
                    } catch (Exception e8) {
                        e = e8;
                        aVar = newInstance;
                        Class<? extends q0.a> cls2 = this.f10231c;
                        Log.e(f10207e, "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        return this.f10232d.perform(view, aVar);
                    }
                }
                return this.f10232d.perform(view, aVar);
            }
            return false;
        }

        public boolean equals(@d.q0 Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.f10229a;
                return obj2 == null ? aVar.f10229a == null : obj2.equals(aVar.f10229a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f10229a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @d.o0
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String o6 = f0.o(this.f10230b);
            if (o6.equals("ACTION_UNKNOWN") && c() != null) {
                o6 = c().toString();
            }
            sb.append(o6);
            return sb.toString();
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public a(int i7, CharSequence charSequence, q0 q0Var) {
            this(null, i7, charSequence, q0Var, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i7, CharSequence charSequence, Class<? extends q0.a> cls) {
            this(null, i7, charSequence, null, cls);
        }

        public a(Object obj, int i7, CharSequence charSequence, q0 q0Var, Class<? extends q0.a> cls) {
            this.f10230b = i7;
            this.f10232d = q0Var;
            if (obj == null) {
                this.f10229a = new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence);
            } else {
                this.f10229a = obj;
            }
            this.f10231c = cls;
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static Bundle a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    @w0(33)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static AccessibilityNodeInfo.ExtraRenderingInfo a(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfo.ExtraRenderingInfo extraRenderingInfo;
            extraRenderingInfo = accessibilityNodeInfo.getExtraRenderingInfo();
            return extraRenderingInfo;
        }

        @d.u
        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean isTextSelectable;
            isTextSelectable = accessibilityNodeInfo.isTextSelectable();
            return isTextSelectable;
        }

        @d.u
        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, boolean z6) {
            accessibilityNodeInfo.setTextSelectable(z6);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: b  reason: collision with root package name */
        public static final int f10233b = 0;

        /* renamed from: c  reason: collision with root package name */
        public static final int f10234c = 1;

        /* renamed from: d  reason: collision with root package name */
        public static final int f10235d = 2;

        /* renamed from: a  reason: collision with root package name */
        public final Object f10236a;

        public d(Object obj) {
            this.f10236a = obj;
        }

        public static d e(int i7, int i8, boolean z6) {
            return new d(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i8, z6));
        }

        public static d f(int i7, int i8, boolean z6, int i9) {
            return new d(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i8, z6, i9));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f10236a).getColumnCount();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f10236a).getRowCount();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f10236a).getSelectionMode();
        }

        public boolean d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f10236a).isHierarchical();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Object f10237a;

        public e(Object obj) {
            this.f10237a = obj;
        }

        public static e g(int i7, int i8, int i9, int i10, boolean z6) {
            return new e(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i8, i9, i10, z6));
        }

        public static e h(int i7, int i8, int i9, int i10, boolean z6, boolean z7) {
            return new e(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i8, i9, i10, z6, z7));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10237a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10237a).getColumnSpan();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10237a).getRowIndex();
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10237a).getRowSpan();
        }

        @Deprecated
        public boolean e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10237a).isHeading();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f10237a).isSelected();
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: b  reason: collision with root package name */
        public static final int f10238b = 0;

        /* renamed from: c  reason: collision with root package name */
        public static final int f10239c = 1;

        /* renamed from: d  reason: collision with root package name */
        public static final int f10240d = 2;

        /* renamed from: a  reason: collision with root package name */
        public final Object f10241a;

        public f(Object obj) {
            this.f10241a = obj;
        }

        public static f e(int i7, float f7, float f8, float f9) {
            return new f(AccessibilityNodeInfo.RangeInfo.obtain(i7, f7, f8, f9));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f10241a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f10241a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f10241a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f10241a).getType();
        }
    }

    @Deprecated
    public f0(Object obj) {
        this.f10204a = (AccessibilityNodeInfo) obj;
    }

    public static f0 H0() {
        return g2(AccessibilityNodeInfo.obtain());
    }

    public static f0 I0(View view) {
        return g2(AccessibilityNodeInfo.obtain(view));
    }

    public static f0 J0(View view, int i7) {
        return h2(AccessibilityNodeInfo.obtain(view, i7));
    }

    public static f0 K0(f0 f0Var) {
        return g2(AccessibilityNodeInfo.obtain(f0Var.f10204a));
    }

    public static f0 g2(@d.o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new f0(accessibilityNodeInfo);
    }

    public static f0 h2(Object obj) {
        if (obj != null) {
            return new f0(obj);
        }
        return null;
    }

    public static String o(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                switch (i7) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i7) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i7) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i7) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] x(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public CharSequence A() {
        return this.f10204a.getContentDescription();
    }

    public boolean A0() {
        boolean isScreenReaderFocusable;
        if (Build.VERSION.SDK_INT >= 28) {
            isScreenReaderFocusable = this.f10204a.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }
        return r(1);
    }

    public void A1(long j7) {
        b.a(this.f10204a).putLong(f10193p, j7);
    }

    public int B() {
        return this.f10204a.getDrawingOrder();
    }

    public boolean B0() {
        return this.f10204a.isScrollable();
    }

    public void B1(int i7) {
        this.f10204a.setMovementGranularities(i7);
    }

    public CharSequence C() {
        return this.f10204a.getError();
    }

    public boolean C0() {
        return this.f10204a.isSelected();
    }

    public void C1(boolean z6) {
        this.f10204a.setMultiLine(z6);
    }

    @d.q0
    public AccessibilityNodeInfo.ExtraRenderingInfo D() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.a(this.f10204a);
        }
        return null;
    }

    public boolean D0() {
        return this.f10204a.isShowingHintText();
    }

    public void D1(CharSequence charSequence) {
        this.f10204a.setPackageName(charSequence);
    }

    public Bundle E() {
        return b.a(this.f10204a);
    }

    public boolean E0() {
        boolean isTextEntryKey;
        if (Build.VERSION.SDK_INT >= 29) {
            isTextEntryKey = this.f10204a.isTextEntryKey();
            return isTextEntryKey;
        }
        return r(8);
    }

    public void E1(@d.q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10204a.setPaneTitle(charSequence);
        } else {
            b.a(this.f10204a).putCharSequence(f10171e, charSequence);
        }
    }

    @d.q0
    public CharSequence F() {
        return this.f10204a.getHintText();
    }

    public boolean F0() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.b(this.f10204a);
        }
        return false;
    }

    public void F1(View view) {
        this.f10205b = -1;
        this.f10204a.setParent(view);
    }

    @Deprecated
    public Object G() {
        return this.f10204a;
    }

    public boolean G0() {
        return this.f10204a.isVisibleToUser();
    }

    public void G1(View view, int i7) {
        this.f10205b = i7;
        this.f10204a.setParent(view, i7);
    }

    public int H() {
        return this.f10204a.getInputType();
    }

    public void H1(boolean z6) {
        this.f10204a.setPassword(z6);
    }

    public f0 I() {
        return h2(this.f10204a.getLabelFor());
    }

    public void I1(f fVar) {
        this.f10204a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) fVar.f10241a);
    }

    public f0 J() {
        return h2(this.f10204a.getLabeledBy());
    }

    @SuppressLint({"GetterSetterNames"})
    public void J1(boolean z6) {
        V0(32, z6);
    }

    public int K() {
        return this.f10204a.getLiveRegion();
    }

    public void K1(@d.q0 CharSequence charSequence) {
        b.a(this.f10204a).putCharSequence(f10169d, charSequence);
    }

    public int L() {
        return this.f10204a.getMaxTextLength();
    }

    public boolean L0(int i7) {
        return this.f10204a.performAction(i7);
    }

    public void L1(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10204a.setScreenReaderFocusable(z6);
        } else {
            V0(1, z6);
        }
    }

    public long M() {
        return b.a(this.f10204a).getLong(f10193p);
    }

    public boolean M0(int i7, Bundle bundle) {
        return this.f10204a.performAction(i7, bundle);
    }

    public void M1(boolean z6) {
        this.f10204a.setScrollable(z6);
    }

    public int N() {
        return this.f10204a.getMovementGranularities();
    }

    @Deprecated
    public void N0() {
    }

    public void N1(boolean z6) {
        this.f10204a.setSelected(z6);
    }

    public final SparseArray<WeakReference<ClickableSpan>> O(View view) {
        SparseArray<WeakReference<ClickableSpan>> U2 = U(view);
        if (U2 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(a.e.f9696e0, sparseArray);
            return sparseArray;
        }
        return U2;
    }

    public boolean O0() {
        return this.f10204a.refresh();
    }

    public void O1(boolean z6) {
        this.f10204a.setShowingHintText(z6);
    }

    public CharSequence P() {
        return this.f10204a.getPackageName();
    }

    public boolean P0(a aVar) {
        return this.f10204a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f10229a);
    }

    public void P1(View view) {
        this.f10206c = -1;
        this.f10204a.setSource(view);
    }

    @d.q0
    public CharSequence Q() {
        CharSequence paneTitle;
        if (Build.VERSION.SDK_INT >= 28) {
            paneTitle = this.f10204a.getPaneTitle();
            return paneTitle;
        }
        return b.a(this.f10204a).getCharSequence(f10171e);
    }

    public boolean Q0(View view) {
        return this.f10204a.removeChild(view);
    }

    public void Q1(View view, int i7) {
        this.f10206c = i7;
        this.f10204a.setSource(view, i7);
    }

    public f0 R() {
        return h2(this.f10204a.getParent());
    }

    public boolean R0(View view, int i7) {
        return this.f10204a.removeChild(view, i7);
    }

    public void R1(@d.q0 CharSequence charSequence) {
        if (z0.a.h()) {
            this.f10204a.setStateDescription(charSequence);
        } else {
            b.a(this.f10204a).putCharSequence(f10189n, charSequence);
        }
    }

    public f S() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f10204a.getRangeInfo();
        if (rangeInfo != null) {
            return new f(rangeInfo);
        }
        return null;
    }

    public final void S0(View view) {
        SparseArray<WeakReference<ClickableSpan>> U2 = U(view);
        if (U2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < U2.size(); i7++) {
                if (U2.valueAt(i7).get() == null) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                U2.remove(((Integer) arrayList.get(i8)).intValue());
            }
        }
    }

    public void S1(CharSequence charSequence) {
        this.f10204a.setText(charSequence);
    }

    @d.q0
    public CharSequence T() {
        return b.a(this.f10204a).getCharSequence(f10169d);
    }

    public void T0(boolean z6) {
        this.f10204a.setAccessibilityFocused(z6);
    }

    public void T1(boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10204a.setTextEntryKey(z6);
        } else {
            V0(8, z6);
        }
    }

    public final SparseArray<WeakReference<ClickableSpan>> U(View view) {
        return (SparseArray) view.getTag(a.e.f9696e0);
    }

    public void U0(@d.o0 List<String> list) {
        this.f10204a.setAvailableExtraData(list);
    }

    public void U1(boolean z6) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.c(this.f10204a, z6);
        }
    }

    @d.q0
    public CharSequence V() {
        CharSequence stateDescription;
        if (z0.a.h()) {
            stateDescription = this.f10204a.getStateDescription();
            return stateDescription;
        }
        return b.a(this.f10204a).getCharSequence(f10189n);
    }

    public final void V0(int i7, boolean z6) {
        Bundle E2 = E();
        if (E2 != null) {
            int i8 = E2.getInt(f10177h, 0) & (~i7);
            if (!z6) {
                i7 = 0;
            }
            E2.putInt(f10177h, i7 | i8);
        }
    }

    public void V1(int i7, int i8) {
        this.f10204a.setTextSelection(i7, i8);
    }

    public CharSequence W() {
        if (i0()) {
            List<Integer> i7 = i(f10181j);
            List<Integer> i8 = i(f10183k);
            List<Integer> i9 = i(f10185l);
            List<Integer> i10 = i(f10179i);
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f10204a.getText(), 0, this.f10204a.getText().length()));
            for (int i11 = 0; i11 < i7.size(); i11++) {
                spannableString.setSpan(new h1.a(i10.get(i11).intValue(), this, E().getInt(f10187m)), i7.get(i11).intValue(), i8.get(i11).intValue(), i9.get(i11).intValue());
            }
            return spannableString;
        }
        return this.f10204a.getText();
    }

    @Deprecated
    public void W0(Rect rect) {
        this.f10204a.setBoundsInParent(rect);
    }

    public void W1(@d.q0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10204a.setTooltipText(charSequence);
        } else {
            b.a(this.f10204a).putCharSequence(f10173f, charSequence);
        }
    }

    public int X() {
        return this.f10204a.getTextSelectionEnd();
    }

    public void X0(Rect rect) {
        this.f10204a.setBoundsInScreen(rect);
    }

    public void X1(@d.o0 g gVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f10204a.setTouchDelegateInfo(gVar.f10242a);
        }
    }

    public int Y() {
        return this.f10204a.getTextSelectionStart();
    }

    public void Y0(boolean z6) {
        this.f10204a.setCanOpenPopup(z6);
    }

    public void Y1(View view) {
        this.f10204a.setTraversalAfter(view);
    }

    @d.q0
    public CharSequence Z() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT >= 28) {
            tooltipText = this.f10204a.getTooltipText();
            return tooltipText;
        }
        return b.a(this.f10204a).getCharSequence(f10173f);
    }

    public void Z0(boolean z6) {
        this.f10204a.setCheckable(z6);
    }

    public void Z1(View view, int i7) {
        this.f10204a.setTraversalAfter(view, i7);
    }

    public void a(int i7) {
        this.f10204a.addAction(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r2.f10204a.getTouchDelegateInfo();
     */
    @d.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h1.f0.g a0() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.f10204a
            android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = h1.n.a(r0)
            if (r0 == 0) goto L14
            h1.f0$g r1 = new h1.f0$g
            r1.<init>(r0)
            return r1
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.f0.a0():h1.f0$g");
    }

    public void a1(boolean z6) {
        this.f10204a.setChecked(z6);
    }

    public void a2(View view) {
        this.f10204a.setTraversalBefore(view);
    }

    public void b(a aVar) {
        this.f10204a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f10229a);
    }

    public f0 b0() {
        return h2(this.f10204a.getTraversalAfter());
    }

    public void b1(CharSequence charSequence) {
        this.f10204a.setClassName(charSequence);
    }

    public void b2(View view, int i7) {
        this.f10204a.setTraversalBefore(view, i7);
    }

    public void c(View view) {
        this.f10204a.addChild(view);
    }

    public f0 c0() {
        return h2(this.f10204a.getTraversalBefore());
    }

    public void c1(boolean z6) {
        this.f10204a.setClickable(z6);
    }

    @d.s0(markerClass = {a.b.class})
    public void c2(@d.q0 String str) {
        if (z0.a.k()) {
            this.f10204a.setUniqueId(str);
        } else {
            b.a(this.f10204a).putString(f10191o, str);
        }
    }

    public void d(View view, int i7) {
        this.f10204a.addChild(view, i7);
    }

    @d.q0
    @d.s0(markerClass = {a.b.class})
    public String d0() {
        String uniqueId;
        if (z0.a.k()) {
            uniqueId = this.f10204a.getUniqueId();
            return uniqueId;
        }
        return b.a(this.f10204a).getString(f10191o);
    }

    public void d1(Object obj) {
        this.f10204a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((d) obj).f10236a);
    }

    public void d2(String str) {
        this.f10204a.setViewIdResourceName(str);
    }

    public final void e(ClickableSpan clickableSpan, Spanned spanned, int i7) {
        i(f10181j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i(f10183k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i(f10185l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i(f10179i).add(Integer.valueOf(i7));
    }

    public String e0() {
        return this.f10204a.getViewIdResourceName();
    }

    public void e1(Object obj) {
        this.f10204a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((e) obj).f10237a);
    }

    public void e2(boolean z6) {
        this.f10204a.setVisibleToUser(z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof f0)) {
            f0 f0Var = (f0) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f10204a;
            if (accessibilityNodeInfo == null) {
                if (f0Var.f10204a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(f0Var.f10204a)) {
                return false;
            }
            return this.f10206c == f0Var.f10206c && this.f10205b == f0Var.f10205b;
        }
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
    }

    public r0 f0() {
        return r0.v(this.f10204a.getWindow());
    }

    public void f1(CharSequence charSequence) {
        this.f10204a.setContentDescription(charSequence);
    }

    public AccessibilityNodeInfo f2() {
        return this.f10204a;
    }

    public boolean g() {
        return this.f10204a.canOpenPopup();
    }

    public int g0() {
        return this.f10204a.getWindowId();
    }

    public void g1(boolean z6) {
        this.f10204a.setContentInvalid(z6);
    }

    public final void h() {
        b.a(this.f10204a).remove(f10181j);
        b.a(this.f10204a).remove(f10183k);
        b.a(this.f10204a).remove(f10185l);
        b.a(this.f10204a).remove(f10179i);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean h0() {
        return r(32);
    }

    public void h1(boolean z6) {
        this.f10204a.setContextClickable(z6);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f10204a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = b.a(this.f10204a).getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            b.a(this.f10204a).putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final boolean i0() {
        return !i(f10181j).isEmpty();
    }

    public void i1(boolean z6) {
        this.f10204a.setDismissable(z6);
    }

    public List<f0> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f10204a.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(g2(findAccessibilityNodeInfosByText.get(i7)));
        }
        return arrayList;
    }

    public final int j0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                if (clickableSpan.equals(sparseArray.valueAt(i7).get())) {
                    return sparseArray.keyAt(i7);
                }
            }
        }
        int i8 = f10192o0;
        f10192o0 = i8 + 1;
        return i8;
    }

    public void j1(int i7) {
        this.f10204a.setDrawingOrder(i7);
    }

    public List<f0> k(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f10204a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = findAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(g2(it.next()));
        }
        return arrayList;
    }

    public boolean k0() {
        return this.f10204a.isAccessibilityFocused();
    }

    public void k1(boolean z6) {
        this.f10204a.setEditable(z6);
    }

    public f0 l(int i7) {
        return h2(this.f10204a.findFocus(i7));
    }

    public boolean l0() {
        return this.f10204a.isCheckable();
    }

    public void l1(boolean z6) {
        this.f10204a.setEnabled(z6);
    }

    public f0 m(int i7) {
        return h2(this.f10204a.focusSearch(i7));
    }

    public boolean m0() {
        return this.f10204a.isChecked();
    }

    public void m1(CharSequence charSequence) {
        this.f10204a.setError(charSequence);
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f10204a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.add(new a(actionList.get(i7)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public boolean n0() {
        return this.f10204a.isClickable();
    }

    public void n1(boolean z6) {
        this.f10204a.setFocusable(z6);
    }

    public boolean o0() {
        return this.f10204a.isContentInvalid();
    }

    public void o1(boolean z6) {
        this.f10204a.setFocused(z6);
    }

    @Deprecated
    public int p() {
        return this.f10204a.getActions();
    }

    public boolean p0() {
        return this.f10204a.isContextClickable();
    }

    public void p1(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10204a.setHeading(z6);
        } else {
            V0(2, z6);
        }
    }

    @d.o0
    public List<String> q() {
        return this.f10204a.getAvailableExtraData();
    }

    public boolean q0() {
        return this.f10204a.isDismissable();
    }

    public void q1(@d.q0 CharSequence charSequence) {
        this.f10204a.setHintText(charSequence);
    }

    public final boolean r(int i7) {
        Bundle E2 = E();
        return E2 != null && (E2.getInt(f10177h, 0) & i7) == i7;
    }

    public boolean r0() {
        return this.f10204a.isEditable();
    }

    public void r1(boolean z6) {
        this.f10204a.setImportantForAccessibility(z6);
    }

    @Deprecated
    public void s(Rect rect) {
        this.f10204a.getBoundsInParent(rect);
    }

    public boolean s0() {
        return this.f10204a.isEnabled();
    }

    public void s1(int i7) {
        this.f10204a.setInputType(i7);
    }

    public void t(Rect rect) {
        this.f10204a.getBoundsInScreen(rect);
    }

    public boolean t0() {
        return this.f10204a.isFocusable();
    }

    public void t1(View view) {
        this.f10204a.setLabelFor(view);
    }

    @d.o0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        s(rect);
        sb.append("; boundsInParent: " + rect);
        t(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(P());
        sb.append("; className: ");
        sb.append(w());
        sb.append("; text: ");
        sb.append(W());
        sb.append("; contentDescription: ");
        sb.append(A());
        sb.append("; viewId: ");
        sb.append(e0());
        sb.append("; uniqueId: ");
        sb.append(d0());
        sb.append("; checkable: ");
        sb.append(l0());
        sb.append("; checked: ");
        sb.append(m0());
        sb.append("; focusable: ");
        sb.append(t0());
        sb.append("; focused: ");
        sb.append(u0());
        sb.append("; selected: ");
        sb.append(C0());
        sb.append("; clickable: ");
        sb.append(n0());
        sb.append("; longClickable: ");
        sb.append(x0());
        sb.append("; enabled: ");
        sb.append(s0());
        sb.append("; password: ");
        sb.append(z0());
        sb.append("; scrollable: " + B0());
        sb.append("; [");
        List<a> n7 = n();
        for (int i7 = 0; i7 < n7.size(); i7++) {
            a aVar = n7.get(i7);
            String o6 = o(aVar.b());
            if (o6.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                o6 = aVar.c().toString();
            }
            sb.append(o6);
            if (i7 != n7.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public f0 u(int i7) {
        return h2(this.f10204a.getChild(i7));
    }

    public boolean u0() {
        return this.f10204a.isFocused();
    }

    public void u1(View view, int i7) {
        this.f10204a.setLabelFor(view, i7);
    }

    public int v() {
        return this.f10204a.getChildCount();
    }

    public boolean v0() {
        boolean isHeading;
        if (Build.VERSION.SDK_INT >= 28) {
            isHeading = this.f10204a.isHeading();
            return isHeading;
        } else if (r(2)) {
            return true;
        } else {
            e z6 = z();
            return z6 != null && z6.e();
        }
    }

    public void v1(View view) {
        this.f10204a.setLabeledBy(view);
    }

    public CharSequence w() {
        return this.f10204a.getClassName();
    }

    public boolean w0() {
        return this.f10204a.isImportantForAccessibility();
    }

    public void w1(View view, int i7) {
        this.f10204a.setLabeledBy(view, i7);
    }

    public boolean x0() {
        return this.f10204a.isLongClickable();
    }

    public void x1(int i7) {
        this.f10204a.setLiveRegion(i7);
    }

    public d y() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f10204a.getCollectionInfo();
        if (collectionInfo != null) {
            return new d(collectionInfo);
        }
        return null;
    }

    public boolean y0() {
        return this.f10204a.isMultiLine();
    }

    public void y1(boolean z6) {
        this.f10204a.setLongClickable(z6);
    }

    public e z() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f10204a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new e(collectionItemInfo);
        }
        return null;
    }

    public boolean z0() {
        return this.f10204a.isPassword();
    }

    public void z1(int i7) {
        this.f10204a.setMaxTextLength(i7);
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final AccessibilityNodeInfo.TouchDelegateInfo f10242a;

        public g(@d.o0 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                n0.a();
                this.f10242a = m0.a(map);
                return;
            }
            this.f10242a = null;
        }

        @d.q0
        public Region a(@d.g0(from = 0) int i7) {
            Region regionAt;
            if (Build.VERSION.SDK_INT >= 29) {
                regionAt = this.f10242a.getRegionAt(i7);
                return regionAt;
            }
            return null;
        }

        @d.g0(from = 0)
        public int b() {
            int regionCount;
            if (Build.VERSION.SDK_INT >= 29) {
                regionCount = this.f10242a.getRegionCount();
                return regionCount;
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
            r3 = r2.f10242a.getTargetForRegion(r3);
         */
        @d.q0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h1.f0 c(@d.o0 android.graphics.Region r3) {
            /*
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L13
                android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo r0 = r2.f10242a
                android.view.accessibility.AccessibilityNodeInfo r3 = h1.j0.a(r0, r3)
                if (r3 == 0) goto L13
                h1.f0 r3 = h1.f0.g2(r3)
                return r3
            L13:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: h1.f0.g.c(android.graphics.Region):h1.f0");
        }

        public g(@d.o0 AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f10242a = touchDelegateInfo;
        }
    }

    public f0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f10204a = accessibilityNodeInfo;
    }
}
