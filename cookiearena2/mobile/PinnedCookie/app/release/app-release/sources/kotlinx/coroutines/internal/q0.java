package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlinx.coroutines.i2;
import v3.d1;
import v3.q1;
/* loaded from: classes.dex */
public final class q0 {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final String f12839a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final String f12840b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* renamed from: c  reason: collision with root package name */
    public static final String f12841c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f12842d;

    static {
        Object b7;
        Object b8;
        try {
            d1.a aVar = v3.d1.f17778l;
            b7 = v3.d1.b(h4.a.class.getCanonicalName());
        } catch (Throwable th) {
            d1.a aVar2 = v3.d1.f17778l;
            b7 = v3.d1.b(v3.e1.a(th));
        }
        if (v3.d1.e(b7) != null) {
            b7 = f12839a;
        }
        f12841c = (String) b7;
        try {
            d1.a aVar3 = v3.d1.f17778l;
            b8 = v3.d1.b(q0.class.getCanonicalName());
        } catch (Throwable th2) {
            d1.a aVar4 = v3.d1.f17778l;
            b8 = v3.d1.b(v3.e1.a(th2));
        }
        if (v3.d1.e(b8) != null) {
            b8 = f12840b;
        }
        f12842d = (String) b8;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @n6.d
    @i2
    public static final StackTraceElement d(@n6.d String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    public static final <E extends Throwable> v3.u0<E, StackTraceElement[]> e(E e7) {
        boolean z6;
        Throwable cause = e7.getCause();
        if (cause == null || !u4.l0.g(cause.getClass(), e7.getClass())) {
            return q1.a(e7, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e7.getStackTrace();
        int length = stackTrace.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                z6 = false;
                break;
            } else if (k(stackTrace[i7])) {
                z6 = true;
                break;
            } else {
                i7++;
            }
        }
        return z6 ? q1.a(cause, stackTrace) : q1.a(e7, new StackTraceElement[0]);
    }

    public static final <E extends Throwable> E f(E e7, E e8, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(d("Coroutine boundary"));
        StackTraceElement[] stackTrace = e7.getStackTrace();
        int i7 = i(stackTrace, f12841c);
        int i8 = 0;
        if (i7 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e8.setStackTrace((StackTraceElement[]) array);
                return e8;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + i7];
        for (int i9 = 0; i9 < i7; i9++) {
            stackTraceElementArr[i9] = stackTrace[i9];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i8 + i7] = it.next();
            i8++;
        }
        e8.setStackTrace(stackTraceElementArr);
        return e8;
    }

    public static final ArrayDeque<StackTraceElement> g(h4.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement k02 = eVar.k0();
        if (k02 != null) {
            arrayDeque.add(k02);
        }
        while (true) {
            eVar = eVar.v();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement k03 = eVar.k0();
            if (k03 != null) {
                arrayDeque.add(k03);
            }
        }
    }

    public static final boolean h(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && u4.l0.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && u4.l0.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && u4.l0.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    public static final int i(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (u4.l0.g(str, stackTraceElementArr[i7].getClassName())) {
                return i7;
            }
        }
        return -1;
    }

    public static final void j(@n6.d Throwable th, @n6.d Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean k(@n6.d StackTraceElement stackTraceElement) {
        return i5.b0.v2(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    public static final void l(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            } else if (k(stackTraceElementArr[i7])) {
                break;
            } else {
                i7++;
            }
        }
        int i8 = i7 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i8 > length2) {
            return;
        }
        while (true) {
            if (h(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i8) {
                return;
            }
            length2--;
        }
    }

    @n6.e
    public static final Object m(@n6.d Throwable th, @n6.d e4.d<?> dVar) {
        throw th;
    }

    public static final Object n(Throwable th, e4.d<?> dVar) {
        throw th;
    }

    public static final <E extends Throwable> E o(E e7, h4.e eVar) {
        v3.u0 e8 = e(e7);
        Throwable th = (Throwable) e8.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e8.b();
        Throwable s6 = s(th);
        if (s6 == null) {
            return e7;
        }
        ArrayDeque<StackTraceElement> g7 = g(eVar);
        if (g7.isEmpty()) {
            return e7;
        }
        if (th != e7) {
            l(stackTraceElementArr, g7);
        }
        return (E) f(th, s6, g7);
    }

    @n6.d
    public static final <E extends Throwable> E p(@n6.d E e7) {
        return e7;
    }

    @n6.d
    public static final <E extends Throwable> E q(@n6.d E e7, @n6.d e4.d<?> dVar) {
        return e7;
    }

    public static final <E extends Throwable> E r(E e7) {
        StackTraceElement[] stackTrace = e7.getStackTrace();
        int length = stackTrace.length;
        int i7 = i(stackTrace, f12842d);
        int i8 = i7 + 1;
        int i9 = i(stackTrace, f12841c);
        int i10 = 0;
        int i11 = (length - i7) - (i9 == -1 ? 0 : length - i9);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i11];
        while (i10 < i11) {
            stackTraceElementArr[i10] = i10 == 0 ? d("Coroutine boundary") : stackTrace[(i8 + i10) - 1];
            i10++;
        }
        e7.setStackTrace(stackTraceElementArr);
        return e7;
    }

    public static final <E extends Throwable> E s(E e7) {
        E e8 = (E) n.h(e7);
        if (e8 == null) {
            return null;
        }
        if ((e7 instanceof kotlinx.coroutines.m0) || u4.l0.g(e8.getMessage(), e7.getMessage())) {
            return e8;
        }
        return null;
    }

    @n6.d
    public static final <E extends Throwable> E t(@n6.d E e7) {
        return e7;
    }

    @n6.d
    public static final <E extends Throwable> E u(@n6.d E e7) {
        E e8 = (E) e7.getCause();
        if (e8 != null && u4.l0.g(e8.getClass(), e7.getClass())) {
            StackTraceElement[] stackTrace = e7.getStackTrace();
            int length = stackTrace.length;
            boolean z6 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                } else if (k(stackTrace[i7])) {
                    z6 = true;
                    break;
                } else {
                    i7++;
                }
            }
            if (z6) {
                return e8;
            }
        }
        return e7;
    }
}
