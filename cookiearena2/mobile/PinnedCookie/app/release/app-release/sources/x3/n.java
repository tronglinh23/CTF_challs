package x3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v3.c2;
import v3.i2;
import v3.u1;
import v3.y1;
@u4.r1({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes.dex */
public class n extends m {
    @s4.h(name = "contentDeepEquals")
    @v3.g1(version = "1.3")
    @v3.a1
    public static final <T> boolean g(@n6.e T[] tArr, @n6.e T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            T t6 = tArr[i7];
            T t7 = tArr2[i7];
            if (t6 != t7) {
                if (t6 == null || t7 == null) {
                    return false;
                }
                if ((t6 instanceof Object[]) && (t7 instanceof Object[])) {
                    if (!g((Object[]) t6, (Object[]) t7)) {
                        return false;
                    }
                } else if ((t6 instanceof byte[]) && (t7 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) t6, (byte[]) t7)) {
                        return false;
                    }
                } else if ((t6 instanceof short[]) && (t7 instanceof short[])) {
                    if (!Arrays.equals((short[]) t6, (short[]) t7)) {
                        return false;
                    }
                } else if ((t6 instanceof int[]) && (t7 instanceof int[])) {
                    if (!Arrays.equals((int[]) t6, (int[]) t7)) {
                        return false;
                    }
                } else if ((t6 instanceof long[]) && (t7 instanceof long[])) {
                    if (!Arrays.equals((long[]) t6, (long[]) t7)) {
                        return false;
                    }
                } else if ((t6 instanceof float[]) && (t7 instanceof float[])) {
                    if (!Arrays.equals((float[]) t6, (float[]) t7)) {
                        return false;
                    }
                } else if ((t6 instanceof double[]) && (t7 instanceof double[])) {
                    if (!Arrays.equals((double[]) t6, (double[]) t7)) {
                        return false;
                    }
                } else if ((t6 instanceof char[]) && (t7 instanceof char[])) {
                    if (!Arrays.equals((char[]) t6, (char[]) t7)) {
                        return false;
                    }
                } else if ((t6 instanceof boolean[]) && (t7 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) t6, (boolean[]) t7)) {
                        return false;
                    }
                } else if ((t6 instanceof u1) && (t7 instanceof u1)) {
                    if (!a4.c.V0(((u1) t6).v(), ((u1) t7).v())) {
                        return false;
                    }
                } else if ((t6 instanceof i2) && (t7 instanceof i2)) {
                    if (!a4.c.S0(((i2) t6).v(), ((i2) t7).v())) {
                        return false;
                    }
                } else if ((t6 instanceof y1) && (t7 instanceof y1)) {
                    if (!a4.c.T0(((y1) t6).v(), ((y1) t7).v())) {
                        return false;
                    }
                } else if ((t6 instanceof c2) && (t7 instanceof c2)) {
                    if (!a4.c.X0(((c2) t6).v(), ((c2) t7).v())) {
                        return false;
                    }
                } else if (!u4.l0.g(t6, t7)) {
                    return false;
                }
            }
        }
        return true;
    }

    @s4.h(name = "contentDeepToString")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <T> String h(@n6.e T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((d5.u.B(tArr.length, 429496729) * 5) + 2);
        i(tArr, sb, new ArrayList());
        String sb2 = sb.toString();
        u4.l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final <T> void i(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(", ");
            }
            T t6 = tArr[i7];
            if (t6 == null) {
                sb.append("null");
            } else if (t6 instanceof Object[]) {
                i((Object[]) t6, sb, list);
            } else if (t6 instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) t6);
                u4.l0.o(arrays, "toString(this)");
                sb.append(arrays);
            } else if (t6 instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) t6);
                u4.l0.o(arrays2, "toString(this)");
                sb.append(arrays2);
            } else if (t6 instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) t6);
                u4.l0.o(arrays3, "toString(this)");
                sb.append(arrays3);
            } else if (t6 instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) t6);
                u4.l0.o(arrays4, "toString(this)");
                sb.append(arrays4);
            } else if (t6 instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) t6);
                u4.l0.o(arrays5, "toString(this)");
                sb.append(arrays5);
            } else if (t6 instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) t6);
                u4.l0.o(arrays6, "toString(this)");
                sb.append(arrays6);
            } else if (t6 instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) t6);
                u4.l0.o(arrays7, "toString(this)");
                sb.append(arrays7);
            } else if (t6 instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) t6);
                u4.l0.o(arrays8, "toString(this)");
                sb.append(arrays8);
            } else if (t6 instanceof u1) {
                sb.append(a4.c.j1(((u1) t6).v()));
            } else if (t6 instanceof i2) {
                sb.append(a4.c.n1(((i2) t6).v()));
            } else if (t6 instanceof y1) {
                sb.append(a4.c.m1(((y1) t6).v()));
            } else if (t6 instanceof c2) {
                sb.append(a4.c.p1(((c2) t6).v()));
            } else {
                sb.append(t6.toString());
            }
        }
        sb.append(']');
        list.remove(w.G(list));
    }

    @n6.d
    public static final <T> List<T> j(@n6.d T[][] tArr) {
        u4.l0.p(tArr, "<this>");
        int i7 = 0;
        for (T[] tArr2 : tArr) {
            i7 += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(i7);
        for (T[] tArr3 : tArr) {
            b0.p0(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lt4/a<+TR;>;)TR; */
    @v3.g1(version = "1.3")
    @k4.f
    public static final Object k(Object[] objArr, t4.a aVar) {
        u4.l0.p(aVar, "defaultValue");
        return objArr.length == 0 ? aVar.n() : objArr;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final boolean l(Object[] objArr) {
        if (objArr != null) {
            return objArr.length == 0;
        }
        return true;
    }

    @n6.d
    public static final <T, R> v3.u0<List<T>, List<R>> m(@n6.d v3.u0<? extends T, ? extends R>[] u0VarArr) {
        u4.l0.p(u0VarArr, "<this>");
        ArrayList arrayList = new ArrayList(u0VarArr.length);
        ArrayList arrayList2 = new ArrayList(u0VarArr.length);
        for (v3.u0<? extends T, ? extends R> u0Var : u0VarArr) {
            arrayList.add(u0Var.e());
            arrayList2.add(u0Var.f());
        }
        return v3.q1.a(arrayList, arrayList2);
    }
}
