package androidx.customview.widget;

import android.graphics.Rect;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(T t6, Rect rect);
    }

    /* renamed from: androidx.customview.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0039b<T, V> {
        V a(T t6, int i7);

        int b(T t6);
    }

    /* loaded from: classes.dex */
    public static class c<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f3921a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f3922b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3923c;

        /* renamed from: d  reason: collision with root package name */
        public final a<T> f3924d;

        public c(boolean z6, a<T> aVar) {
            this.f3923c = z6;
            this.f3924d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t6, T t7) {
            Rect rect = this.f3921a;
            Rect rect2 = this.f3922b;
            this.f3924d.a(t6, rect);
            this.f3924d.a(t7, rect2);
            int i7 = rect.top;
            int i8 = rect2.top;
            if (i7 < i8) {
                return -1;
            }
            if (i7 > i8) {
                return 1;
            }
            int i9 = rect.left;
            int i10 = rect2.left;
            if (i9 < i10) {
                return this.f3923c ? 1 : -1;
            } else if (i9 > i10) {
                return this.f3923c ? -1 : 1;
            } else {
                int i11 = rect.bottom;
                int i12 = rect2.bottom;
                if (i11 < i12) {
                    return -1;
                }
                if (i11 > i12) {
                    return 1;
                }
                int i13 = rect.right;
                int i14 = rect2.right;
                if (i13 < i14) {
                    return this.f3923c ? 1 : -1;
                } else if (i13 > i14) {
                    return this.f3923c ? -1 : 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static boolean a(int i7, @o0 Rect rect, @o0 Rect rect2, @o0 Rect rect3) {
        boolean b7 = b(i7, rect, rect2);
        if (b(i7, rect, rect3) || !b7) {
            return false;
        }
        return !j(i7, rect, rect3) || i7 == 17 || i7 == 66 || k(i7, rect, rect2) < m(i7, rect, rect3);
    }

    public static boolean b(int i7, @o0 Rect rect, @o0 Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T c(@o0 L l7, @o0 InterfaceC0039b<L, T> interfaceC0039b, @o0 a<T> aVar, @q0 T t6, @o0 Rect rect, int i7) {
        Rect rect2 = new Rect(rect);
        if (i7 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i7 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i7 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            rect2.offset(0, -(rect.height() + 1));
        }
        int b7 = interfaceC0039b.b(l7);
        Rect rect3 = new Rect();
        T t7 = null;
        for (int i8 = 0; i8 < b7; i8++) {
            T a7 = interfaceC0039b.a(l7, i8);
            if (a7 != t6) {
                aVar.a(a7, rect3);
                if (h(i7, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t7 = a7;
                }
            }
        }
        return t7;
    }

    public static <L, T> T d(@o0 L l7, @o0 InterfaceC0039b<L, T> interfaceC0039b, @o0 a<T> aVar, @q0 T t6, int i7, boolean z6, boolean z7) {
        int b7 = interfaceC0039b.b(l7);
        ArrayList arrayList = new ArrayList(b7);
        for (int i8 = 0; i8 < b7; i8++) {
            arrayList.add(interfaceC0039b.a(l7, i8));
        }
        Collections.sort(arrayList, new c(z6, aVar));
        if (i7 != 1) {
            if (i7 == 2) {
                return (T) e(t6, arrayList, z7);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) f(t6, arrayList, z7);
    }

    public static <T> T e(T t6, ArrayList<T> arrayList, boolean z6) {
        int size = arrayList.size();
        int lastIndexOf = (t6 == null ? -1 : arrayList.lastIndexOf(t6)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z6 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static <T> T f(T t6, ArrayList<T> arrayList, boolean z6) {
        int size = arrayList.size();
        int indexOf = (t6 == null ? size : arrayList.indexOf(t6)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z6 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    public static int g(int i7, int i8) {
        return (i7 * 13 * i7) + (i8 * i8);
    }

    public static boolean h(int i7, @o0 Rect rect, @o0 Rect rect2, @o0 Rect rect3) {
        if (i(rect, rect2, i7)) {
            if (i(rect, rect3, i7) && !a(i7, rect, rect2, rect3)) {
                return !a(i7, rect, rect3, rect2) && g(k(i7, rect, rect2), o(i7, rect, rect2)) < g(k(i7, rect, rect3), o(i7, rect, rect3));
            }
            return true;
        }
        return false;
    }

    public static boolean i(@o0 Rect rect, @o0 Rect rect2, int i7) {
        if (i7 == 17) {
            int i8 = rect.right;
            int i9 = rect2.right;
            return (i8 > i9 || rect.left >= i9) && rect.left > rect2.left;
        } else if (i7 == 33) {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            return (i10 > i11 || rect.top >= i11) && rect.top > rect2.top;
        } else if (i7 == 66) {
            int i12 = rect.left;
            int i13 = rect2.left;
            return (i12 < i13 || rect.right <= i13) && rect.right < rect2.right;
        } else if (i7 == 130) {
            int i14 = rect.top;
            int i15 = rect2.top;
            return (i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static boolean j(int i7, @o0 Rect rect, @o0 Rect rect2) {
        if (i7 == 17) {
            return rect.left >= rect2.right;
        } else if (i7 == 33) {
            return rect.top >= rect2.bottom;
        } else if (i7 == 66) {
            return rect.right <= rect2.left;
        } else if (i7 == 130) {
            return rect.bottom <= rect2.top;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int k(int i7, @o0 Rect rect, @o0 Rect rect2) {
        return Math.max(0, l(i7, rect, rect2));
    }

    public static int l(int i7, @o0 Rect rect, @o0 Rect rect2) {
        int i8;
        int i9;
        if (i7 == 17) {
            i8 = rect.left;
            i9 = rect2.right;
        } else if (i7 == 33) {
            i8 = rect.top;
            i9 = rect2.bottom;
        } else if (i7 == 66) {
            i8 = rect2.left;
            i9 = rect.right;
        } else if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i8 = rect2.top;
            i9 = rect.bottom;
        }
        return i8 - i9;
    }

    public static int m(int i7, @o0 Rect rect, @o0 Rect rect2) {
        return Math.max(1, n(i7, rect, rect2));
    }

    public static int n(int i7, @o0 Rect rect, @o0 Rect rect2) {
        int i8;
        int i9;
        if (i7 == 17) {
            i8 = rect.left;
            i9 = rect2.left;
        } else if (i7 == 33) {
            i8 = rect.top;
            i9 = rect2.top;
        } else if (i7 == 66) {
            i8 = rect2.right;
            i9 = rect.right;
        } else if (i7 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            i8 = rect2.bottom;
            i9 = rect.bottom;
        }
        return i8 - i9;
    }

    public static int o(int i7, @o0 Rect rect, @o0 Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
