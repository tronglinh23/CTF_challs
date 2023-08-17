package x3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

@u4.r1({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3420:1\n14166#2,14:3421\n14189#2,14:3435\n14212#2,14:3449\n14235#2,14:3463\n14258#2,14:3477\n14281#2,14:3491\n14304#2,14:3505\n14327#2,14:3519\n14350#2,14:3533\n16752#2,14:3547\n16775#2,14:3561\n16798#2,14:3575\n16821#2,14:3589\n16844#2,14:3603\n16867#2,14:3617\n16890#2,14:3631\n16913#2,14:3645\n16936#2,14:3659\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2812#1:3421,14\n2819#1:3435,14\n2826#1:3449,14\n2833#1:3463,14\n2840#1:3477,14\n2847#1:3491,14\n2854#1:3505,14\n2861#1:3519,14\n2868#1:3533,14\n3010#1:3547,14\n3017#1:3561,14\n3024#1:3575,14\n3031#1:3589,14\n3038#1:3603,14\n3045#1:3617,14\n3052#1:3631,14\n3059#1:3645,14\n3066#1:3659,14\n*E\n"})
/* loaded from: classes.dex */
public class o extends n {

    /* loaded from: classes.dex */
    public static final class a extends x3.c<Byte> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ byte[] f18329l;

        public a(byte[] bArr) {
            this.f18329l = bArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return this.f18329l.length;
        }

        public boolean b(byte b7) {
            return p.N8(this.f18329l, b7);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return b(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // x3.c, java.util.List
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Byte get(int i7) {
            return Byte.valueOf(this.f18329l[i7]);
        }

        public int f(byte b7) {
            return p.dg(this.f18329l, b7);
        }

        public int g(byte b7) {
            return p.hi(this.f18329l, b7);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return f(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f18329l.length == 0;
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return g(((Number) obj).byteValue());
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x3.c<Short> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ short[] f18330l;

        public b(short[] sArr) {
            this.f18330l = sArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return this.f18330l.length;
        }

        public boolean b(short s6) {
            return p.U8(this.f18330l, s6);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return b(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // x3.c, java.util.List
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Short get(int i7) {
            return Short.valueOf(this.f18330l[i7]);
        }

        public int f(short s6) {
            return p.kg(this.f18330l, s6);
        }

        public int g(short s6) {
            return p.oi(this.f18330l, s6);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return f(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f18330l.length == 0;
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return g(((Number) obj).shortValue());
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends x3.c<Integer> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int[] f18331l;

        public c(int[] iArr) {
            this.f18331l = iArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return this.f18331l.length;
        }

        public boolean b(int i7) {
            return p.R8(this.f18331l, i7);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return b(((Number) obj).intValue());
            }
            return false;
        }

        @Override // x3.c, java.util.List
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Integer get(int i7) {
            return Integer.valueOf(this.f18331l[i7]);
        }

        public int f(int i7) {
            return p.hg(this.f18331l, i7);
        }

        public int g(int i7) {
            return p.li(this.f18331l, i7);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return f(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f18331l.length == 0;
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return g(((Number) obj).intValue());
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends x3.c<Long> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ long[] f18332l;

        public d(long[] jArr) {
            this.f18332l = jArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return this.f18332l.length;
        }

        public boolean b(long j7) {
            return p.S8(this.f18332l, j7);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return b(((Number) obj).longValue());
            }
            return false;
        }

        @Override // x3.c, java.util.List
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Long get(int i7) {
            return Long.valueOf(this.f18332l[i7]);
        }

        public int f(long j7) {
            return p.ig(this.f18332l, j7);
        }

        public int g(long j7) {
            return p.mi(this.f18332l, j7);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return f(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f18332l.length == 0;
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return g(((Number) obj).longValue());
            }
            return -1;
        }
    }

    @u4.r1({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3420:1\n12794#2,2:3421\n1687#2,6:3423\n1795#2,6:3429\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3421,2\n201#1:3423,6\n202#1:3429,6\n*E\n"})
    /* loaded from: classes.dex */
    public static final class e extends x3.c<Float> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ float[] f18333l;

        public e(float[] fArr) {
            this.f18333l = fArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return this.f18333l.length;
        }

        public boolean b(float f7) {
            for (float f8 : this.f18333l) {
                if (Float.floatToIntBits(f8) == Float.floatToIntBits(f7)) {
                    return true;
                }
            }
            return false;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return b(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // x3.c, java.util.List
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Float get(int i7) {
            return Float.valueOf(this.f18333l[i7]);
        }

        public int f(float f7) {
            float[] fArr = this.f18333l;
            int length = fArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (Float.floatToIntBits(fArr[i7]) == Float.floatToIntBits(f7)) {
                    return i7;
                }
            }
            return -1;
        }

        public int g(float f7) {
            float[] fArr = this.f18333l;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i7 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f7)) {
                    return length;
                }
                if (i7 < 0) {
                    return -1;
                }
                length = i7;
            }
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return f(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f18333l.length == 0;
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return g(((Number) obj).floatValue());
            }
            return -1;
        }
    }

    @u4.r1({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3420:1\n12804#2,2:3421\n1699#2,6:3423\n1807#2,6:3429\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3421,2\n215#1:3423,6\n216#1:3429,6\n*E\n"})
    /* loaded from: classes.dex */
    public static final class f extends x3.c<Double> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ double[] f18334l;

        public f(double[] dArr) {
            this.f18334l = dArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return this.f18334l.length;
        }

        public boolean b(double d7) {
            for (double d8 : this.f18334l) {
                if (Double.doubleToLongBits(d8) == Double.doubleToLongBits(d7)) {
                    return true;
                }
            }
            return false;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return b(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // x3.c, java.util.List
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Double get(int i7) {
            return Double.valueOf(this.f18334l[i7]);
        }

        public int f(double d7) {
            double[] dArr = this.f18334l;
            int length = dArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (Double.doubleToLongBits(dArr[i7]) == Double.doubleToLongBits(d7)) {
                    return i7;
                }
            }
            return -1;
        }

        public int g(double d7) {
            double[] dArr = this.f18334l;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i7 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d7)) {
                    return length;
                }
                if (i7 < 0) {
                    return -1;
                }
                length = i7;
            }
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return f(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f18334l.length == 0;
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return g(((Number) obj).doubleValue());
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends x3.c<Boolean> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ boolean[] f18335l;

        public g(boolean[] zArr) {
            this.f18335l = zArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return this.f18335l.length;
        }

        public boolean b(boolean z6) {
            return p.V8(this.f18335l, z6);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return b(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // x3.c, java.util.List
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Boolean get(int i7) {
            return Boolean.valueOf(this.f18335l[i7]);
        }

        public int f(boolean z6) {
            return p.lg(this.f18335l, z6);
        }

        public int g(boolean z6) {
            return p.pi(this.f18335l, z6);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return f(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f18335l.length == 0;
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return g(((Boolean) obj).booleanValue());
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends x3.c<Character> implements RandomAccess {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ char[] f18336l;

        public h(char[] cArr) {
            this.f18336l = cArr;
        }

        @Override // x3.c, x3.a
        public int a() {
            return this.f18336l.length;
        }

        public boolean b(char c7) {
            return p.O8(this.f18336l, c7);
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return b(((Character) obj).charValue());
            }
            return false;
        }

        @Override // x3.c, java.util.List
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Character get(int i7) {
            return Character.valueOf(this.f18336l[i7]);
        }

        public int f(char c7) {
            return p.eg(this.f18336l, c7);
        }

        public int g(char c7) {
            return p.ii(this.f18336l, c7);
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return f(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // x3.a, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f18336l.length == 0;
        }

        @Override // x3.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return g(((Character) obj).charValue());
            }
            return -1;
        }
    }

    public static final int A(@n6.d int[] iArr, int i7, int i8, int i9) {
        u4.l0.p(iArr, "<this>");
        return Arrays.binarySearch(iArr, i8, i9, i7);
    }

    @s4.h(name = "contentHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final int A0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @k4.f
    public static final <T> T[] A1(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        u4.l0.o(tArr2, "copyOf(this, size)");
        return tArr2;
    }

    @n6.d
    public static final <C extends Collection<? super R>, R> C A2(@n6.d Object[] objArr, @n6.d C c7, @n6.d Class<R> cls) {
        u4.l0.p(objArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(cls, "klass");
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                c7.add(obj);
            }
        }
        return c7;
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float A3(float[] fArr, Comparator comparator) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.eo(fArr, comparator);
    }

    public static /* synthetic */ void A4(char[] cArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = cArr.length;
        }
        k4(cArr, i7, i8);
    }

    public static final int B(@n6.d long[] jArr, long j7, int i7, int i8) {
        u4.l0.p(jArr, "<this>");
        return Arrays.binarySearch(jArr, i7, i8, j7);
    }

    @s4.h(name = "contentHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final <T> int B0(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @k4.f
    public static final <T> T[] B1(T[] tArr, int i7) {
        u4.l0.p(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i7);
        u4.l0.o(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte B2(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return p.il(bArr);
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer B3(int[] iArr, Comparator comparator) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.fo(iArr, comparator);
    }

    public static /* synthetic */ void B4(double[] dArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = dArr.length;
        }
        m4(dArr, i7, i8);
    }

    public static final <T> int C(@n6.d T[] tArr, T t6, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        return Arrays.binarySearch(tArr, i7, i8, t6);
    }

    @s4.h(name = "contentHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final int C0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @k4.f
    public static final short[] C1(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character C2(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return p.jl(cArr);
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long C3(long[] jArr, Comparator comparator) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.go(jArr, comparator);
    }

    public static /* synthetic */ void C4(float[] fArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = fArr.length;
        }
        o4(fArr, i7, i8);
    }

    public static final <T> int D(@n6.d T[] tArr, T t6, @n6.d Comparator<? super T> comparator, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return Arrays.binarySearch(tArr, i7, i8, t6, comparator);
    }

    @s4.h(name = "contentHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final int D0(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @k4.f
    public static final short[] D1(short[] sArr, int i7) {
        u4.l0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, i7);
        u4.l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable D2(Comparable[] comparableArr) {
        u4.l0.p(comparableArr, "<this>");
        return p.kl(comparableArr);
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object D3(Object[] objArr, Comparator comparator) {
        u4.l0.p(objArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.ho(objArr, comparator);
    }

    public static /* synthetic */ void D4(int[] iArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = iArr.length;
        }
        q4(iArr, i7, i8);
    }

    public static final int E(@n6.d short[] sArr, short s6, int i7, int i8) {
        u4.l0.p(sArr, "<this>");
        return Arrays.binarySearch(sArr, i7, i8, s6);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String E0(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        String arrays = Arrays.toString(bArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @k4.f
    public static final boolean[] E1(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double E2(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return p.ll(dArr);
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short E3(short[] sArr, Comparator comparator) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.io(sArr, comparator);
    }

    public static /* synthetic */ void E4(long[] jArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = jArr.length;
        }
        s4(jArr, i7, i8);
    }

    public static /* synthetic */ int F(byte[] bArr, byte b7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        return w(bArr, b7, i7, i8);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String F0(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        String arrays = Arrays.toString(cArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @k4.f
    public static final boolean[] F1(boolean[] zArr, int i7) {
        u4.l0.p(zArr, "<this>");
        boolean[] copyOf = Arrays.copyOf(zArr, i7);
        u4.l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double F2(Double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return p.ml(dArr);
    }

    @n6.d
    public static final byte[] F3(@n6.d byte[] bArr, byte b7) {
        u4.l0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + 1);
        copyOf[length] = b7;
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ void F4(Comparable[] comparableArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = comparableArr.length;
        }
        u4(comparableArr, i7, i8);
    }

    public static /* synthetic */ int G(char[] cArr, char c7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = cArr.length;
        }
        return x(cArr, c7, i7, i8);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String G0(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        String arrays = Arrays.toString(dArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRange")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final byte[] G1(@n6.d byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "<this>");
        m.c(i8, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        u4.l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float G2(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return p.nl(fArr);
    }

    @n6.d
    public static final byte[] G3(@n6.d byte[] bArr, @n6.d Collection<Byte> collection) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(collection, "elements");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, collection.size() + length);
        Iterator<Byte> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().byteValue();
            length++;
        }
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ void G4(Object[] objArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = objArr.length;
        }
        w4(objArr, i7, i8);
    }

    public static /* synthetic */ int H(double[] dArr, double d7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = dArr.length;
        }
        return y(dArr, d7, i7, i8);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String H0(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        String arrays = Arrays.toString(fArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRange")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final char[] H1(@n6.d char[] cArr, int i7, int i8) {
        u4.l0.p(cArr, "<this>");
        m.c(i8, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i7, i8);
        u4.l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float H2(Float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return p.ol(fArr);
    }

    @n6.d
    public static final byte[] H3(@n6.d byte[] bArr, @n6.d byte[] bArr2) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ void H4(short[] sArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = sArr.length;
        }
        y4(sArr, i7, i8);
    }

    public static /* synthetic */ int I(float[] fArr, float f7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = fArr.length;
        }
        return z(fArr, f7, i7, i8);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String I0(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        String arrays = Arrays.toString(iArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRange")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final double[] I1(@n6.d double[] dArr, int i7, int i8) {
        u4.l0.p(dArr, "<this>");
        m.c(i8, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i7, i8);
        u4.l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer I2(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return p.pl(iArr);
    }

    @n6.d
    public static final char[] I3(@n6.d char[] cArr, char c7) {
        u4.l0.p(cArr, "<this>");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, length + 1);
        copyOf[length] = c7;
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    public static final <T> void I4(@n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static /* synthetic */ int J(int[] iArr, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = iArr.length;
        }
        return A(iArr, i7, i8, i9);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String J0(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        String arrays = Arrays.toString(jArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRange")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final float[] J1(@n6.d float[] fArr, int i7, int i8) {
        u4.l0.p(fArr, "<this>");
        m.c(i8, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i7, i8);
        u4.l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long J2(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return p.ql(jArr);
    }

    @n6.d
    public static final char[] J3(@n6.d char[] cArr, @n6.d Collection<Character> collection) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(collection, "elements");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, collection.size() + length);
        Iterator<Character> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().charValue();
            length++;
        }
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    public static final <T> void J4(@n6.d T[] tArr, @n6.d Comparator<? super T> comparator, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        Arrays.sort(tArr, i7, i8, comparator);
    }

    public static /* synthetic */ int K(long[] jArr, long j7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = jArr.length;
        }
        return B(jArr, j7, i7, i8);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ <T> String K0(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        String arrays = Arrays.toString(tArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRange")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final int[] K1(@n6.d int[] iArr, int i7, int i8) {
        u4.l0.p(iArr, "<this>");
        m.c(i8, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i7, i8);
        u4.l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @v3.k(message = "Use maxOrNull instead.", replaceWith = @v3.b1(expression = "this.maxOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short K2(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return p.rl(sArr);
    }

    @n6.d
    public static final char[] K3(@n6.d char[] cArr, @n6.d char[] cArr2) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(cArr2, "elements");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, copyOf, length, length2);
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    public static /* synthetic */ void K4(Object[] objArr, Comparator comparator, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = objArr.length;
        }
        J4(objArr, comparator, i7, i8);
    }

    public static /* synthetic */ int L(Object[] objArr, Object obj, int i7, int i8, int i9, Object obj2) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = objArr.length;
        }
        return C(objArr, obj, i7, i8);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String L0(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        String arrays = Arrays.toString(sArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRange")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final long[] L1(@n6.d long[] jArr, int i7, int i8) {
        u4.l0.p(jArr, "<this>");
        m.c(i8, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i7, i8);
        u4.l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean L2(boolean[] zArr, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z6 = zArr[0];
        int Ze = p.Ze(zArr);
        if (Ze == 0) {
            return Boolean.valueOf(z6);
        }
        R O = lVar.O(Boolean.valueOf(z6));
        s0 it = new d5.l(1, Ze).iterator();
        while (it.hasNext()) {
            boolean z7 = zArr[it.b()];
            R O2 = lVar.O(Boolean.valueOf(z7));
            if (O.compareTo(O2) < 0) {
                z6 = z7;
                O = O2;
            }
        }
        return Boolean.valueOf(z6);
    }

    @n6.d
    public static final double[] L3(@n6.d double[] dArr, double d7) {
        u4.l0.p(dArr, "<this>");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, length + 1);
        copyOf[length] = d7;
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigDecimal L4(byte[] bArr, t4.l<? super Byte, ? extends BigDecimal> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (byte b7 : bArr) {
            valueOf = valueOf.add(lVar.O(Byte.valueOf(b7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static /* synthetic */ int M(Object[] objArr, Object obj, Comparator comparator, int i7, int i8, int i9, Object obj2) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = objArr.length;
        }
        return D(objArr, obj, comparator, i7, i8);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ String M0(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        String arrays = Arrays.toString(zArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRange")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final <T> T[] M1(@n6.d T[] tArr, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        m.c(i8, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i7, i8);
        u4.l0.o(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte M2(byte[] bArr, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        int Re = p.Re(bArr);
        if (Re == 0) {
            return Byte.valueOf(b7);
        }
        R O = lVar.O(Byte.valueOf(b7));
        s0 it = new d5.l(1, Re).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            R O2 = lVar.O(Byte.valueOf(b8));
            if (O.compareTo(O2) < 0) {
                b7 = b8;
                O = O2;
            }
        }
        return Byte.valueOf(b7);
    }

    @n6.d
    public static final double[] M3(@n6.d double[] dArr, @n6.d Collection<Double> collection) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(collection, "elements");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, collection.size() + length);
        Iterator<Double> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().doubleValue();
            length++;
        }
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigDecimal M4(char[] cArr, t4.l<? super Character, ? extends BigDecimal> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (char c7 : cArr) {
            valueOf = valueOf.add(lVar.O(Character.valueOf(c7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static /* synthetic */ int N(short[] sArr, short s6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = sArr.length;
        }
        return E(sArr, s6, i7, i8);
    }

    @s4.h(name = "contentToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final String N0(byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRange")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final short[] N1(@n6.d short[] sArr, int i7, int i8) {
        u4.l0.p(sArr, "<this>");
        m.c(i8, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i7, i8);
        u4.l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character N2(char[] cArr, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        int Se = p.Se(cArr);
        if (Se == 0) {
            return Character.valueOf(c7);
        }
        R O = lVar.O(Character.valueOf(c7));
        s0 it = new d5.l(1, Se).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            R O2 = lVar.O(Character.valueOf(c8));
            if (O.compareTo(O2) < 0) {
                c7 = c8;
                O = O2;
            }
        }
        return Character.valueOf(c7);
    }

    @n6.d
    public static final double[] N3(@n6.d double[] dArr, @n6.d double[] dArr2) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, copyOf, length, length2);
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigDecimal N4(double[] dArr, t4.l<? super Double, ? extends BigDecimal> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (double d7 : dArr) {
            valueOf = valueOf.add(lVar.O(Double.valueOf(d7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "contentDeepEqualsInline")
    @v3.g1(version = "1.1")
    @k4.h
    @k4.f
    public static final <T> boolean O(T[] tArr, T[] tArr2) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(tArr2, "other");
        return n.g(tArr, tArr2);
    }

    @s4.h(name = "contentToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final String O0(char[] cArr) {
        String arrays = Arrays.toString(cArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRange")
    @v3.g1(version = "1.3")
    @n6.d
    @v3.a1
    public static final boolean[] O1(@n6.d boolean[] zArr, int i7, int i8) {
        u4.l0.p(zArr, "<this>");
        m.c(i8, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i7, i8);
        u4.l0.o(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double O2(double[] dArr, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        int Te = p.Te(dArr);
        if (Te == 0) {
            return Double.valueOf(d7);
        }
        R O = lVar.O(Double.valueOf(d7));
        s0 it = new d5.l(1, Te).iterator();
        while (it.hasNext()) {
            double d8 = dArr[it.b()];
            R O2 = lVar.O(Double.valueOf(d8));
            if (O.compareTo(O2) < 0) {
                O = O2;
                d7 = d8;
            }
        }
        return Double.valueOf(d7);
    }

    @n6.d
    public static final float[] O3(@n6.d float[] fArr, float f7) {
        u4.l0.p(fArr, "<this>");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
        copyOf[length] = f7;
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigDecimal O4(float[] fArr, t4.l<? super Float, ? extends BigDecimal> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (float f7 : fArr) {
            valueOf = valueOf.add(lVar.O(Float.valueOf(f7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "contentDeepEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final <T> boolean P(T[] tArr, T[] tArr2) {
        return k4.m.a(1, 3, 0) ? n.g(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @s4.h(name = "contentToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final String P0(double[] dArr) {
        String arrays = Arrays.toString(dArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRangeInline")
    @k4.f
    public static final byte[] P1(byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "<this>");
        if (k4.m.a(1, 3, 0)) {
            return G1(bArr, i7, i8);
        }
        if (i8 <= bArr.length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i8);
            u4.l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i8 + ", size: " + bArr.length);
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float P2(float[] fArr, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        int Ue = p.Ue(fArr);
        if (Ue == 0) {
            return Float.valueOf(f7);
        }
        R O = lVar.O(Float.valueOf(f7));
        s0 it = new d5.l(1, Ue).iterator();
        while (it.hasNext()) {
            float f8 = fArr[it.b()];
            R O2 = lVar.O(Float.valueOf(f8));
            if (O.compareTo(O2) < 0) {
                f7 = f8;
                O = O2;
            }
        }
        return Float.valueOf(f7);
    }

    @n6.d
    public static final float[] P3(@n6.d float[] fArr, @n6.d Collection<Float> collection) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(collection, "elements");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, collection.size() + length);
        Iterator<Float> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().floatValue();
            length++;
        }
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigDecimal P4(int[] iArr, t4.l<? super Integer, ? extends BigDecimal> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (int i7 : iArr) {
            valueOf = valueOf.add(lVar.O(Integer.valueOf(i7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "contentDeepHashCodeInline")
    @v3.g1(version = "1.1")
    @k4.h
    @k4.f
    public static final <T> int Q(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return m.b(tArr);
    }

    @s4.h(name = "contentToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final String Q0(float[] fArr) {
        String arrays = Arrays.toString(fArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRangeInline")
    @k4.f
    public static final char[] Q1(char[] cArr, int i7, int i8) {
        u4.l0.p(cArr, "<this>");
        if (k4.m.a(1, 3, 0)) {
            return H1(cArr, i7, i8);
        }
        if (i8 <= cArr.length) {
            char[] copyOfRange = Arrays.copyOfRange(cArr, i7, i8);
            u4.l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i8 + ", size: " + cArr.length);
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer Q2(int[] iArr, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        int Ve = p.Ve(iArr);
        if (Ve == 0) {
            return Integer.valueOf(i7);
        }
        R O = lVar.O(Integer.valueOf(i7));
        s0 it = new d5.l(1, Ve).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            R O2 = lVar.O(Integer.valueOf(i8));
            if (O.compareTo(O2) < 0) {
                i7 = i8;
                O = O2;
            }
        }
        return Integer.valueOf(i7);
    }

    @n6.d
    public static final float[] Q3(@n6.d float[] fArr, @n6.d float[] fArr2) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigDecimal Q4(long[] jArr, t4.l<? super Long, ? extends BigDecimal> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (long j7 : jArr) {
            valueOf = valueOf.add(lVar.O(Long.valueOf(j7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "contentDeepHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final <T> int R(T[] tArr) {
        return k4.m.a(1, 3, 0) ? m.b(tArr) : Arrays.deepHashCode(tArr);
    }

    @s4.h(name = "contentToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final String R0(int[] iArr) {
        String arrays = Arrays.toString(iArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRangeInline")
    @k4.f
    public static final double[] R1(double[] dArr, int i7, int i8) {
        u4.l0.p(dArr, "<this>");
        if (k4.m.a(1, 3, 0)) {
            return I1(dArr, i7, i8);
        }
        if (i8 <= dArr.length) {
            double[] copyOfRange = Arrays.copyOfRange(dArr, i7, i8);
            u4.l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i8 + ", size: " + dArr.length);
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long R2(long[] jArr, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        int We = p.We(jArr);
        if (We == 0) {
            return Long.valueOf(j7);
        }
        R O = lVar.O(Long.valueOf(j7));
        s0 it = new d5.l(1, We).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            R O2 = lVar.O(Long.valueOf(j8));
            if (O.compareTo(O2) < 0) {
                O = O2;
                j7 = j8;
            }
        }
        return Long.valueOf(j7);
    }

    @n6.d
    public static final int[] R3(@n6.d int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i7;
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> BigDecimal R4(T[] tArr, t4.l<? super T, ? extends BigDecimal> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (T t6 : tArr) {
            valueOf = valueOf.add(lVar.O(t6));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "contentDeepToStringInline")
    @v3.g1(version = "1.1")
    @k4.h
    @k4.f
    public static final <T> String S(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return n.h(tArr);
    }

    @s4.h(name = "contentToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final String S0(long[] jArr) {
        String arrays = Arrays.toString(jArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRangeInline")
    @k4.f
    public static final float[] S1(float[] fArr, int i7, int i8) {
        u4.l0.p(fArr, "<this>");
        if (k4.m.a(1, 3, 0)) {
            return J1(fArr, i7, i8);
        }
        if (i8 <= fArr.length) {
            float[] copyOfRange = Arrays.copyOfRange(fArr, i7, i8);
            u4.l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i8 + ", size: " + fArr.length);
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T S2(T[] tArr, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t6 = tArr[0];
        int Xe = p.Xe(tArr);
        if (Xe != 0) {
            R O = lVar.O(t6);
            s0 it = new d5.l(1, Xe).iterator();
            while (it.hasNext()) {
                T t7 = tArr[it.b()];
                R O2 = lVar.O(t7);
                if (O.compareTo(O2) < 0) {
                    t6 = t7;
                    O = O2;
                }
            }
        }
        return t6;
    }

    @n6.d
    public static final int[] S3(@n6.d int[] iArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(collection, "elements");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, collection.size() + length);
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().intValue();
            length++;
        }
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigDecimal S4(short[] sArr, t4.l<? super Short, ? extends BigDecimal> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (short s6 : sArr) {
            valueOf = valueOf.add(lVar.O(Short.valueOf(s6)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "contentDeepToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final <T> String T(T[] tArr) {
        if (k4.m.a(1, 3, 0)) {
            return n.h(tArr);
        }
        String deepToString = Arrays.deepToString(tArr);
        u4.l0.o(deepToString, "deepToString(this)");
        return deepToString;
    }

    @s4.h(name = "contentToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final <T> String T0(T[] tArr) {
        String arrays = Arrays.toString(tArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRangeInline")
    @k4.f
    public static final int[] T1(int[] iArr, int i7, int i8) {
        u4.l0.p(iArr, "<this>");
        if (k4.m.a(1, 3, 0)) {
            return K1(iArr, i7, i8);
        }
        if (i8 <= iArr.length) {
            int[] copyOfRange = Arrays.copyOfRange(iArr, i7, i8);
            u4.l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i8 + ", size: " + iArr.length);
    }

    @v3.k(message = "Use maxByOrNull instead.", replaceWith = @v3.b1(expression = "this.maxByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short T2(short[] sArr, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        int Ye = p.Ye(sArr);
        if (Ye == 0) {
            return Short.valueOf(s6);
        }
        R O = lVar.O(Short.valueOf(s6));
        s0 it = new d5.l(1, Ye).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            R O2 = lVar.O(Short.valueOf(s7));
            if (O.compareTo(O2) < 0) {
                s6 = s7;
                O = O2;
            }
        }
        return Short.valueOf(s6);
    }

    @n6.d
    public static final int[] T3(@n6.d int[] iArr, @n6.d int[] iArr2) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigDecimal")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigDecimal T4(boolean[] zArr, t4.l<? super Boolean, ? extends BigDecimal> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (boolean z6 : zArr) {
            valueOf = valueOf.add(lVar.O(Boolean.valueOf(z6)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ boolean U(byte[] bArr, byte[] bArr2) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(bArr2, "other");
        return Arrays.equals(bArr, bArr2);
    }

    @s4.h(name = "contentToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final String U0(short[] sArr) {
        String arrays = Arrays.toString(sArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRangeInline")
    @k4.f
    public static final long[] U1(long[] jArr, int i7, int i8) {
        u4.l0.p(jArr, "<this>");
        if (k4.m.a(1, 3, 0)) {
            return L1(jArr, i7, i8);
        }
        if (i8 <= jArr.length) {
            long[] copyOfRange = Arrays.copyOfRange(jArr, i7, i8);
            u4.l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i8 + ", size: " + jArr.length);
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean U2(boolean[] zArr, Comparator comparator) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.Cl(zArr, comparator);
    }

    @n6.d
    public static final long[] U3(@n6.d long[] jArr, long j7) {
        u4.l0.p(jArr, "<this>");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
        copyOf[length] = j7;
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigInteger U4(byte[] bArr, t4.l<? super Byte, ? extends BigInteger> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (byte b7 : bArr) {
            valueOf = valueOf.add(lVar.O(Byte.valueOf(b7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ boolean V(char[] cArr, char[] cArr2) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(cArr2, "other");
        return Arrays.equals(cArr, cArr2);
    }

    @s4.h(name = "contentToStringNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final String V0(boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        u4.l0.o(arrays, "toString(this)");
        return arrays;
    }

    @s4.h(name = "copyOfRangeInline")
    @k4.f
    public static final <T> T[] V1(T[] tArr, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        if (k4.m.a(1, 3, 0)) {
            return (T[]) M1(tArr, i7, i8);
        }
        if (i8 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i7, i8);
            u4.l0.o(tArr2, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return tArr2;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i8 + ", size: " + tArr.length);
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte V2(byte[] bArr, Comparator comparator) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.Dl(bArr, comparator);
    }

    @n6.d
    public static final long[] V3(@n6.d long[] jArr, @n6.d Collection<Long> collection) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(collection, "elements");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, collection.size() + length);
        Iterator<Long> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().longValue();
            length++;
        }
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigInteger V4(char[] cArr, t4.l<? super Character, ? extends BigInteger> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (char c7 : cArr) {
            valueOf = valueOf.add(lVar.O(Character.valueOf(c7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ boolean W(double[] dArr, double[] dArr2) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(dArr2, "other");
        return Arrays.equals(dArr, dArr2);
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final byte[] W0(@n6.d byte[] bArr, @n6.d byte[] bArr2, int i7, int i8, int i9) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(bArr2, "destination");
        System.arraycopy(bArr, i8, bArr2, i7, i9 - i8);
        return bArr2;
    }

    @s4.h(name = "copyOfRangeInline")
    @k4.f
    public static final short[] W1(short[] sArr, int i7, int i8) {
        u4.l0.p(sArr, "<this>");
        if (k4.m.a(1, 3, 0)) {
            return N1(sArr, i7, i8);
        }
        if (i8 <= sArr.length) {
            short[] copyOfRange = Arrays.copyOfRange(sArr, i7, i8);
            u4.l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i8 + ", size: " + sArr.length);
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character W2(char[] cArr, Comparator comparator) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.El(cArr, comparator);
    }

    @n6.d
    public static final long[] W3(@n6.d long[] jArr, @n6.d long[] jArr2) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigInteger W4(double[] dArr, t4.l<? super Double, ? extends BigInteger> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (double d7 : dArr) {
            valueOf = valueOf.add(lVar.O(Double.valueOf(d7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ boolean X(float[] fArr, float[] fArr2) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(fArr2, "other");
        return Arrays.equals(fArr, fArr2);
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final char[] X0(@n6.d char[] cArr, @n6.d char[] cArr2, int i7, int i8, int i9) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(cArr2, "destination");
        System.arraycopy(cArr, i8, cArr2, i7, i9 - i8);
        return cArr2;
    }

    @s4.h(name = "copyOfRangeInline")
    @k4.f
    public static final boolean[] X1(boolean[] zArr, int i7, int i8) {
        u4.l0.p(zArr, "<this>");
        if (k4.m.a(1, 3, 0)) {
            return O1(zArr, i7, i8);
        }
        if (i8 <= zArr.length) {
            boolean[] copyOfRange = Arrays.copyOfRange(zArr, i7, i8);
            u4.l0.o(copyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i8 + ", size: " + zArr.length);
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double X2(double[] dArr, Comparator comparator) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.Fl(dArr, comparator);
    }

    @n6.d
    public static final <T> T[] X3(@n6.d T[] tArr, T t6) {
        u4.l0.p(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t6;
        u4.l0.o(tArr2, "result");
        return tArr2;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigInteger X4(float[] fArr, t4.l<? super Float, ? extends BigInteger> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (float f7 : fArr) {
            valueOf = valueOf.add(lVar.O(Float.valueOf(f7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ boolean Y(int[] iArr, int[] iArr2) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iArr2, "other");
        return Arrays.equals(iArr, iArr2);
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final double[] Y0(@n6.d double[] dArr, @n6.d double[] dArr2, int i7, int i8, int i9) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(dArr2, "destination");
        System.arraycopy(dArr, i8, dArr2, i7, i9 - i8);
        return dArr2;
    }

    @k4.f
    public static final byte Y1(byte[] bArr, int i7) {
        u4.l0.p(bArr, "<this>");
        return bArr[i7];
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float Y2(float[] fArr, Comparator comparator) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.Gl(fArr, comparator);
    }

    @n6.d
    public static final <T> T[] Y3(@n6.d T[] tArr, @n6.d Collection<? extends T> collection) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(collection, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        u4.l0.o(tArr2, "result");
        return tArr2;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigInteger Y4(int[] iArr, t4.l<? super Integer, ? extends BigInteger> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (int i7 : iArr) {
            valueOf = valueOf.add(lVar.O(Integer.valueOf(i7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ boolean Z(long[] jArr, long[] jArr2) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(jArr2, "other");
        return Arrays.equals(jArr, jArr2);
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final float[] Z0(@n6.d float[] fArr, @n6.d float[] fArr2, int i7, int i8, int i9) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(fArr2, "destination");
        System.arraycopy(fArr, i8, fArr2, i7, i9 - i8);
        return fArr2;
    }

    @k4.f
    public static final char Z1(char[] cArr, int i7) {
        u4.l0.p(cArr, "<this>");
        return cArr[i7];
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer Z2(int[] iArr, Comparator comparator) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.Hl(iArr, comparator);
    }

    @n6.d
    public static final <T> T[] Z3(@n6.d T[] tArr, @n6.d T[] tArr2) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        u4.l0.o(tArr3, "result");
        return tArr3;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigInteger Z4(long[] jArr, t4.l<? super Long, ? extends BigInteger> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (long j7 : jArr) {
            valueOf = valueOf.add(lVar.O(Long.valueOf(j7)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ <T> boolean a0(T[] tArr, T[] tArr2) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(tArr2, "other");
        return Arrays.equals(tArr, tArr2);
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final int[] a1(@n6.d int[] iArr, @n6.d int[] iArr2, int i7, int i8, int i9) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iArr2, "destination");
        System.arraycopy(iArr, i8, iArr2, i7, i9 - i8);
        return iArr2;
    }

    @k4.f
    public static final double a2(double[] dArr, int i7) {
        u4.l0.p(dArr, "<this>");
        return dArr[i7];
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long a3(long[] jArr, Comparator comparator) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.Il(jArr, comparator);
    }

    @n6.d
    public static final short[] a4(@n6.d short[] sArr, @n6.d Collection<Short> collection) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(collection, "elements");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, collection.size() + length);
        Iterator<Short> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().shortValue();
            length++;
        }
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> BigInteger a5(T[] tArr, t4.l<? super T, ? extends BigInteger> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (T t6 : tArr) {
            valueOf = valueOf.add(lVar.O(t6));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ boolean b0(short[] sArr, short[] sArr2) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(sArr2, "other");
        return Arrays.equals(sArr, sArr2);
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final long[] b1(@n6.d long[] jArr, @n6.d long[] jArr2, int i7, int i8, int i9) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(jArr2, "destination");
        System.arraycopy(jArr, i8, jArr2, i7, i9 - i8);
        return jArr2;
    }

    @k4.f
    public static final float b2(float[] fArr, int i7) {
        u4.l0.p(fArr, "<this>");
        return fArr[i7];
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object b3(Object[] objArr, Comparator comparator) {
        u4.l0.p(objArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.Jl(objArr, comparator);
    }

    @n6.d
    public static final short[] b4(@n6.d short[] sArr, short s6) {
        u4.l0.p(sArr, "<this>");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, length + 1);
        copyOf[length] = s6;
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigInteger b5(short[] sArr, t4.l<? super Short, ? extends BigInteger> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (short s6 : sArr) {
            valueOf = valueOf.add(lVar.O(Short.valueOf(s6)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ boolean c0(boolean[] zArr, boolean[] zArr2) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(zArr2, "other");
        return Arrays.equals(zArr, zArr2);
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final <T> T[] c1(@n6.d T[] tArr, @n6.d T[] tArr2, int i7, int i8, int i9) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(tArr2, "destination");
        System.arraycopy(tArr, i8, tArr2, i7, i9 - i8);
        return tArr2;
    }

    @k4.f
    public static final int c2(int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        return iArr[i7];
    }

    @v3.k(message = "Use maxWithOrNull instead.", replaceWith = @v3.b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short c3(short[] sArr, Comparator comparator) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.Kl(sArr, comparator);
    }

    @n6.d
    public static final short[] c4(@n6.d short[] sArr, @n6.d short[] sArr2) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(sArr2, "elements");
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] copyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, copyOf, length, length2);
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @s4.h(name = "sumOfBigInteger")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final BigInteger c5(boolean[] zArr, t4.l<? super Boolean, ? extends BigInteger> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        u4.l0.o(valueOf, "valueOf(this.toLong())");
        for (boolean z6 : zArr) {
            valueOf = valueOf.add(lVar.O(Boolean.valueOf(z6)));
            u4.l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @s4.h(name = "contentEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean d0(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final short[] d1(@n6.d short[] sArr, @n6.d short[] sArr2, int i7, int i8, int i9) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(sArr2, "destination");
        System.arraycopy(sArr, i8, sArr2, i7, i9 - i8);
        return sArr2;
    }

    @k4.f
    public static final long d2(long[] jArr, int i7) {
        u4.l0.p(jArr, "<this>");
        return jArr[i7];
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte d3(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return p.Gn(bArr);
    }

    @n6.d
    public static final boolean[] d4(@n6.d boolean[] zArr, @n6.d Collection<Boolean> collection) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(collection, "elements");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, collection.size() + length);
        Iterator<Boolean> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next().booleanValue();
            length++;
        }
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @n6.d
    public static final SortedSet<Byte> d5(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return (SortedSet) p.Jy(bArr, new TreeSet());
    }

    @s4.h(name = "contentEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean e0(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @v3.g1(version = "1.3")
    @n6.d
    public static final boolean[] e1(@n6.d boolean[] zArr, @n6.d boolean[] zArr2, int i7, int i8, int i9) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(zArr2, "destination");
        System.arraycopy(zArr, i8, zArr2, i7, i9 - i8);
        return zArr2;
    }

    @k4.f
    public static final <T> T e2(T[] tArr, int i7) {
        u4.l0.p(tArr, "<this>");
        return tArr[i7];
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character e3(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return p.Hn(cArr);
    }

    @n6.d
    public static final boolean[] e4(@n6.d boolean[] zArr, boolean z6) {
        u4.l0.p(zArr, "<this>");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        copyOf[length] = z6;
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @n6.d
    public static final SortedSet<Character> e5(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return (SortedSet) p.Ky(cArr, new TreeSet());
    }

    @s4.h(name = "contentEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean f0(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    public static /* synthetic */ byte[] f1(byte[] bArr, byte[] bArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = bArr.length;
        }
        return W0(bArr, bArr2, i7, i8, i9);
    }

    @k4.f
    public static final short f2(short[] sArr, int i7) {
        u4.l0.p(sArr, "<this>");
        return sArr[i7];
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable f3(Comparable[] comparableArr) {
        u4.l0.p(comparableArr, "<this>");
        return p.In(comparableArr);
    }

    @n6.d
    public static final boolean[] f4(@n6.d boolean[] zArr, @n6.d boolean[] zArr2) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        u4.l0.o(copyOf, "result");
        return copyOf;
    }

    @n6.d
    public static final SortedSet<Double> f5(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return (SortedSet) p.Ly(dArr, new TreeSet());
    }

    @s4.h(name = "contentEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean g0(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    public static /* synthetic */ char[] g1(char[] cArr, char[] cArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = cArr.length;
        }
        return X0(cArr, cArr2, i7, i8, i9);
    }

    @k4.f
    public static final boolean g2(boolean[] zArr, int i7) {
        u4.l0.p(zArr, "<this>");
        return zArr[i7];
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double g3(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return p.Jn(dArr);
    }

    @k4.f
    public static final <T> T[] g4(T[] tArr, T t6) {
        u4.l0.p(tArr, "<this>");
        return (T[]) X3(tArr, t6);
    }

    @n6.d
    public static final SortedSet<Float> g5(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return (SortedSet) p.My(fArr, new TreeSet());
    }

    @s4.h(name = "contentEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean h0(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    public static /* synthetic */ double[] h1(double[] dArr, double[] dArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = dArr.length;
        }
        return Y0(dArr, dArr2, i7, i8, i9);
    }

    public static final void h2(@n6.d byte[] bArr, byte b7, int i7, int i8) {
        u4.l0.p(bArr, "<this>");
        Arrays.fill(bArr, i7, i8, b7);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double h3(Double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return p.Kn(dArr);
    }

    public static final void h4(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @n6.d
    public static final SortedSet<Integer> h5(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return (SortedSet) p.Ny(iArr, new TreeSet());
    }

    @s4.h(name = "contentEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean i0(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    public static /* synthetic */ float[] i1(float[] fArr, float[] fArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = fArr.length;
        }
        return Z0(fArr, fArr2, i7, i8, i9);
    }

    public static final void i2(@n6.d char[] cArr, char c7, int i7, int i8) {
        u4.l0.p(cArr, "<this>");
        Arrays.fill(cArr, i7, i8, c7);
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float i3(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return p.Ln(fArr);
    }

    public static final void i4(@n6.d byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "<this>");
        Arrays.sort(bArr, i7, i8);
    }

    @n6.d
    public static final SortedSet<Long> i5(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return (SortedSet) p.Oy(jArr, new TreeSet());
    }

    @s4.h(name = "contentEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final <T> boolean j0(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    public static /* synthetic */ int[] j1(int[] iArr, int[] iArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = iArr.length;
        }
        return a1(iArr, iArr2, i7, i8, i9);
    }

    public static final void j2(@n6.d double[] dArr, double d7, int i7, int i8) {
        u4.l0.p(dArr, "<this>");
        Arrays.fill(dArr, i7, i8, d7);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float j3(Float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return p.Mn(fArr);
    }

    public static final void j4(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @n6.d
    public static final <T extends Comparable<? super T>> SortedSet<T> j5(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return (SortedSet) p.Py(tArr, new TreeSet());
    }

    @s4.h(name = "contentEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean k0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static /* synthetic */ long[] k1(long[] jArr, long[] jArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = jArr.length;
        }
        return b1(jArr, jArr2, i7, i8, i9);
    }

    public static final void k2(@n6.d float[] fArr, float f7, int i7, int i8) {
        u4.l0.p(fArr, "<this>");
        Arrays.fill(fArr, i7, i8, f7);
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Integer k3(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return p.Nn(iArr);
    }

    public static final void k4(@n6.d char[] cArr, int i7, int i8) {
        u4.l0.p(cArr, "<this>");
        Arrays.sort(cArr, i7, i8);
    }

    @n6.d
    public static final <T> SortedSet<T> k5(@n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return (SortedSet) p.Py(tArr, new TreeSet(comparator));
    }

    @s4.h(name = "contentEqualsNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean l0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    public static /* synthetic */ Object[] l1(Object[] objArr, Object[] objArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        return c1(objArr, objArr2, i7, i8, i9);
    }

    public static final void l2(@n6.d int[] iArr, int i7, int i8, int i9) {
        u4.l0.p(iArr, "<this>");
        Arrays.fill(iArr, i8, i9, i7);
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Long l3(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return p.On(jArr);
    }

    public static final void l4(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @n6.d
    public static final SortedSet<Short> l5(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return (SortedSet) p.Qy(sArr, new TreeSet());
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ int m0(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return Arrays.hashCode(bArr);
    }

    public static /* synthetic */ short[] m1(short[] sArr, short[] sArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = sArr.length;
        }
        return d1(sArr, sArr2, i7, i8, i9);
    }

    public static final void m2(@n6.d long[] jArr, long j7, int i7, int i8) {
        u4.l0.p(jArr, "<this>");
        Arrays.fill(jArr, i7, i8, j7);
    }

    @v3.k(message = "Use minOrNull instead.", replaceWith = @v3.b1(expression = "this.minOrNull()", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Short m3(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return p.Pn(sArr);
    }

    public static final void m4(@n6.d double[] dArr, int i7, int i8) {
        u4.l0.p(dArr, "<this>");
        Arrays.sort(dArr, i7, i8);
    }

    @n6.d
    public static final SortedSet<Boolean> m5(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return (SortedSet) p.Ry(zArr, new TreeSet());
    }

    @n6.d
    public static final List<Byte> n(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return new a(bArr);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ int n0(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return Arrays.hashCode(cArr);
    }

    public static /* synthetic */ boolean[] n1(boolean[] zArr, boolean[] zArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = zArr.length;
        }
        return e1(zArr, zArr2, i7, i8, i9);
    }

    public static final <T> void n2(@n6.d T[] tArr, T t6, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        Arrays.fill(tArr, i7, i8, t6);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean n3(boolean[] zArr, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z6 = zArr[0];
        int Ze = p.Ze(zArr);
        if (Ze == 0) {
            return Boolean.valueOf(z6);
        }
        R O = lVar.O(Boolean.valueOf(z6));
        s0 it = new d5.l(1, Ze).iterator();
        while (it.hasNext()) {
            boolean z7 = zArr[it.b()];
            R O2 = lVar.O(Boolean.valueOf(z7));
            if (O.compareTo(O2) > 0) {
                z6 = z7;
                O = O2;
            }
        }
        return Boolean.valueOf(z6);
    }

    public static final void n4(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @n6.d
    public static final Boolean[] n5(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            boolArr[i7] = Boolean.valueOf(zArr[i7]);
        }
        return boolArr;
    }

    @n6.d
    public static final List<Character> o(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return new h(cArr);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ int o0(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return Arrays.hashCode(dArr);
    }

    @k4.f
    public static final byte[] o1(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static final void o2(@n6.d short[] sArr, short s6, int i7, int i8) {
        u4.l0.p(sArr, "<this>");
        Arrays.fill(sArr, i7, i8, s6);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte o3(byte[] bArr, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        int Re = p.Re(bArr);
        if (Re == 0) {
            return Byte.valueOf(b7);
        }
        R O = lVar.O(Byte.valueOf(b7));
        s0 it = new d5.l(1, Re).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            R O2 = lVar.O(Byte.valueOf(b8));
            if (O.compareTo(O2) > 0) {
                b7 = b8;
                O = O2;
            }
        }
        return Byte.valueOf(b7);
    }

    public static final void o4(@n6.d float[] fArr, int i7, int i8) {
        u4.l0.p(fArr, "<this>");
        Arrays.sort(fArr, i7, i8);
    }

    @n6.d
    public static final Byte[] o5(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            bArr2[i7] = Byte.valueOf(bArr[i7]);
        }
        return bArr2;
    }

    @n6.d
    public static final List<Double> p(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return new f(dArr);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ int p0(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return Arrays.hashCode(fArr);
    }

    @k4.f
    public static final byte[] p1(byte[] bArr, int i7) {
        u4.l0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        u4.l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final void p2(@n6.d boolean[] zArr, boolean z6, int i7, int i8) {
        u4.l0.p(zArr, "<this>");
        Arrays.fill(zArr, i7, i8, z6);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Character p3(char[] cArr, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        int Se = p.Se(cArr);
        if (Se == 0) {
            return Character.valueOf(c7);
        }
        R O = lVar.O(Character.valueOf(c7));
        s0 it = new d5.l(1, Se).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            R O2 = lVar.O(Character.valueOf(c8));
            if (O.compareTo(O2) > 0) {
                c7 = c8;
                O = O2;
            }
        }
        return Character.valueOf(c7);
    }

    public static final void p4(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @n6.d
    public static final Character[] p5(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            chArr[i7] = Character.valueOf(cArr[i7]);
        }
        return chArr;
    }

    @n6.d
    public static final List<Float> q(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return new e(fArr);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ int q0(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return Arrays.hashCode(iArr);
    }

    @k4.f
    public static final char[] q1(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void q2(byte[] bArr, byte b7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = bArr.length;
        }
        h2(bArr, b7, i7, i8);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Double q3(double[] dArr, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        int Te = p.Te(dArr);
        if (Te == 0) {
            return Double.valueOf(d7);
        }
        R O = lVar.O(Double.valueOf(d7));
        s0 it = new d5.l(1, Te).iterator();
        while (it.hasNext()) {
            double d8 = dArr[it.b()];
            R O2 = lVar.O(Double.valueOf(d8));
            if (O.compareTo(O2) > 0) {
                O = O2;
                d7 = d8;
            }
        }
        return Double.valueOf(d7);
    }

    public static final void q4(@n6.d int[] iArr, int i7, int i8) {
        u4.l0.p(iArr, "<this>");
        Arrays.sort(iArr, i7, i8);
    }

    @n6.d
    public static final Double[] q5(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            dArr2[i7] = Double.valueOf(dArr[i7]);
        }
        return dArr2;
    }

    @n6.d
    public static final List<Integer> r(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return new c(iArr);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ int r0(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return Arrays.hashCode(jArr);
    }

    @k4.f
    public static final char[] r1(char[] cArr, int i7) {
        u4.l0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, i7);
        u4.l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static /* synthetic */ void r2(char[] cArr, char c7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = cArr.length;
        }
        i2(cArr, c7, i7, i8);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Float r3(float[] fArr, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        int Ue = p.Ue(fArr);
        if (Ue == 0) {
            return Float.valueOf(f7);
        }
        R O = lVar.O(Float.valueOf(f7));
        s0 it = new d5.l(1, Ue).iterator();
        while (it.hasNext()) {
            float f8 = fArr[it.b()];
            R O2 = lVar.O(Float.valueOf(f8));
            if (O.compareTo(O2) > 0) {
                f7 = f8;
                O = O2;
            }
        }
        return Float.valueOf(f7);
    }

    public static final void r4(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    @n6.d
    public static final Float[] r5(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            fArr2[i7] = Float.valueOf(fArr[i7]);
        }
        return fArr2;
    }

    @n6.d
    public static final List<Long> s(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return new d(jArr);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ <T> int s0(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return Arrays.hashCode(tArr);
    }

    @k4.f
    public static final double[] s1(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void s2(double[] dArr, double d7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = dArr.length;
        }
        j2(dArr, d7, i7, i8);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer s3(int[] iArr, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        int Ve = p.Ve(iArr);
        if (Ve == 0) {
            return Integer.valueOf(i7);
        }
        R O = lVar.O(Integer.valueOf(i7));
        s0 it = new d5.l(1, Ve).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            R O2 = lVar.O(Integer.valueOf(i8));
            if (O.compareTo(O2) > 0) {
                i7 = i8;
                O = O2;
            }
        }
        return Integer.valueOf(i7);
    }

    public static final void s4(@n6.d long[] jArr, int i7, int i8) {
        u4.l0.p(jArr, "<this>");
        Arrays.sort(jArr, i7, i8);
    }

    @n6.d
    public static final Integer[] s5(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            numArr[i7] = Integer.valueOf(iArr[i7]);
        }
        return numArr;
    }

    @n6.d
    public static final <T> List<T> t(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        List<T> a7 = q.a(tArr);
        u4.l0.o(a7, "asList(this)");
        return a7;
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ int t0(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return Arrays.hashCode(sArr);
    }

    @k4.f
    public static final double[] t1(double[] dArr, int i7) {
        u4.l0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, i7);
        u4.l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static /* synthetic */ void t2(float[] fArr, float f7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = fArr.length;
        }
        k2(fArr, f7, i7, i8);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Long t3(long[] jArr, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        int We = p.We(jArr);
        if (We == 0) {
            return Long.valueOf(j7);
        }
        R O = lVar.O(Long.valueOf(j7));
        s0 it = new d5.l(1, We).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            R O2 = lVar.O(Long.valueOf(j8));
            if (O.compareTo(O2) > 0) {
                O = O2;
                j7 = j8;
            }
        }
        return Long.valueOf(j7);
    }

    @k4.f
    public static final <T extends Comparable<? super T>> void t4(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        v4(tArr);
    }

    @n6.d
    public static final Long[] t5(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            lArr[i7] = Long.valueOf(jArr[i7]);
        }
        return lArr;
    }

    @n6.d
    public static final List<Short> u(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return new b(sArr);
    }

    @v3.g1(version = "1.1")
    @v3.k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @k4.f
    public static final /* synthetic */ int u0(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return Arrays.hashCode(zArr);
    }

    @k4.f
    public static final float[] u1(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void u2(int[] iArr, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = iArr.length;
        }
        l2(iArr, i7, i8, i9);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T u3(T[] tArr, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t6 = tArr[0];
        int Xe = p.Xe(tArr);
        if (Xe != 0) {
            R O = lVar.O(t6);
            s0 it = new d5.l(1, Xe).iterator();
            while (it.hasNext()) {
                T t7 = tArr[it.b()];
                R O2 = lVar.O(t7);
                if (O.compareTo(O2) > 0) {
                    t6 = t7;
                    O = O2;
                }
            }
        }
        return t6;
    }

    @v3.g1(version = "1.4")
    public static final <T extends Comparable<? super T>> void u4(@n6.d T[] tArr, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        Arrays.sort(tArr, i7, i8);
    }

    @n6.d
    public static final Short[] u5(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            shArr[i7] = Short.valueOf(sArr[i7]);
        }
        return shArr;
    }

    @n6.d
    public static final List<Boolean> v(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return new g(zArr);
    }

    @s4.h(name = "contentHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final int v0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @k4.f
    public static final float[] v1(float[] fArr, int i7) {
        u4.l0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, i7);
        u4.l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static /* synthetic */ void v2(long[] jArr, long j7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = jArr.length;
        }
        m2(jArr, j7, i7, i8);
    }

    @v3.k(message = "Use minByOrNull instead.", replaceWith = @v3.b1(expression = "this.minByOrNull(selector)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <R extends Comparable<? super R>> Short v3(short[] sArr, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        int Ye = p.Ye(sArr);
        if (Ye == 0) {
            return Short.valueOf(s6);
        }
        R O = lVar.O(Short.valueOf(s6));
        s0 it = new d5.l(1, Ye).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            R O2 = lVar.O(Short.valueOf(s7));
            if (O.compareTo(O2) > 0) {
                s6 = s7;
                O = O2;
            }
        }
        return Short.valueOf(s6);
    }

    public static final <T> void v4(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final int w(@n6.d byte[] bArr, byte b7, int i7, int i8) {
        u4.l0.p(bArr, "<this>");
        return Arrays.binarySearch(bArr, i7, i8, b7);
    }

    @s4.h(name = "contentHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final int w0(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @k4.f
    public static final int[] w1(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void w2(Object[] objArr, Object obj, int i7, int i8, int i9, Object obj2) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = objArr.length;
        }
        n2(objArr, obj, i7, i8);
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Boolean w3(boolean[] zArr, Comparator comparator) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.ao(zArr, comparator);
    }

    public static final <T> void w4(@n6.d T[] tArr, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        Arrays.sort(tArr, i7, i8);
    }

    public static final int x(@n6.d char[] cArr, char c7, int i7, int i8) {
        u4.l0.p(cArr, "<this>");
        return Arrays.binarySearch(cArr, i7, i8, c7);
    }

    @s4.h(name = "contentHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final int x0(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @k4.f
    public static final int[] x1(int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, i7);
        u4.l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static /* synthetic */ void x2(short[] sArr, short s6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = sArr.length;
        }
        o2(sArr, s6, i7, i8);
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Byte x3(byte[] bArr, Comparator comparator) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.bo(bArr, comparator);
    }

    public static final void x4(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    public static final int y(@n6.d double[] dArr, double d7, int i7, int i8) {
        u4.l0.p(dArr, "<this>");
        return Arrays.binarySearch(dArr, i7, i8, d7);
    }

    @s4.h(name = "contentHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final int y0(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @k4.f
    public static final long[] y1(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static /* synthetic */ void y2(boolean[] zArr, boolean z6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = zArr.length;
        }
        p2(zArr, z6, i7, i8);
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Character y3(char[] cArr, Comparator comparator) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.co(cArr, comparator);
    }

    public static final void y4(@n6.d short[] sArr, int i7, int i8) {
        u4.l0.p(sArr, "<this>");
        Arrays.sort(sArr, i7, i8);
    }

    public static final int z(@n6.d float[] fArr, float f7, int i7, int i8) {
        u4.l0.p(fArr, "<this>");
        return Arrays.binarySearch(fArr, i7, i8, f7);
    }

    @s4.h(name = "contentHashCodeNullable")
    @v3.g1(version = "1.4")
    @k4.f
    public static final int z0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @k4.f
    public static final long[] z1(long[] jArr, int i7) {
        u4.l0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, i7);
        u4.l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    @n6.d
    public static final <R> List<R> z2(@n6.d Object[] objArr, @n6.d Class<R> cls) {
        u4.l0.p(objArr, "<this>");
        u4.l0.p(cls, "klass");
        return (List) A2(objArr, new ArrayList(), cls);
    }

    @v3.k(message = "Use minWithOrNull instead.", replaceWith = @v3.b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @v3.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double z3(double[] dArr, Comparator comparator) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return p.m1do(dArr, comparator);
    }

    public static /* synthetic */ void z4(byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = bArr.length;
        }
        i4(bArr, i7, i8);
    }
}