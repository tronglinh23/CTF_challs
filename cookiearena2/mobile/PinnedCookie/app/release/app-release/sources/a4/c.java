package a4;

import androidx.cardview.widget.g;
import d5.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import k4.f;
import n6.e;
import s4.h;
import t4.l;
import t4.p;
import t4.q;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.b1;
import v3.b2;
import v3.c2;
import v3.g1;
import v3.h2;
import v3.i2;
import v3.k;
import v3.m2;
import v3.q1;
import v3.q2;
import v3.r;
import v3.t;
import v3.t0;
import v3.t1;
import v3.u0;
import v3.u1;
import v3.x1;
import v3.y1;
import x3.b0;
import x3.d0;
import x3.e0;
import x3.o;
import x3.p0;
import x3.q0;
import x3.s0;
import x3.v;
import x3.w;
import x3.x;
import x3.z0;
@r1({"SMAP\n_UArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,10877:1\n3919#1:10878\n3927#1:10879\n3935#1:10880\n3943#1:10881\n3919#1:10882\n3927#1:10883\n3935#1:10884\n3943#1:10885\n3919#1:10886\n3927#1:10887\n3935#1:10888\n3943#1:10889\n3919#1:10939\n3927#1:10940\n3935#1:10941\n3943#1:10942\n3919#1:10943\n3927#1:10944\n3935#1:10945\n3943#1:10946\n3919#1:10947\n3927#1:10948\n3935#1:10949\n3943#1:10950\n3919#1:11007\n3927#1:11008\n3935#1:11009\n3943#1:11010\n3919#1:11011\n3927#1:11012\n3935#1:11013\n3943#1:11014\n3919#1:11015\n3927#1:11016\n3935#1:11017\n3943#1:11018\n3919#1:11019\n3927#1:11020\n3935#1:11021\n3943#1:11022\n3919#1:11023\n3927#1:11024\n3935#1:11025\n3943#1:11026\n3919#1:11027\n3927#1:11028\n3935#1:11029\n3943#1:11030\n3919#1:11031\n3927#1:11032\n3935#1:11033\n3943#1:11034\n3919#1:11035\n3927#1:11036\n3935#1:11037\n3943#1:11038\n3919#1:11039\n3927#1:11040\n3935#1:11041\n3943#1:11042\n3919#1:11043\n3927#1:11044\n3935#1:11045\n3943#1:11046\n3919#1:11047\n3927#1:11048\n3935#1:11049\n3943#1:11050\n3919#1:11051\n3927#1:11052\n3935#1:11053\n3943#1:11054\n3919#1:11055\n3927#1:11056\n3935#1:11057\n3943#1:11058\n3919#1:11059\n3927#1:11060\n3935#1:11061\n3943#1:11062\n3919#1:11063\n3927#1:11064\n3935#1:11065\n3943#1:11066\n3919#1:11067\n3927#1:11068\n3935#1:11069\n3943#1:11070\n3919#1:11071\n3927#1:11072\n3935#1:11073\n3943#1:11074\n3919#1:11075\n3927#1:11076\n3935#1:11077\n3943#1:11078\n3919#1:11079\n3927#1:11080\n3935#1:11081\n3943#1:11082\n3919#1:11083\n3927#1:11084\n3935#1:11085\n3943#1:11086\n3919#1:11087\n3927#1:11088\n3935#1:11089\n3943#1:11090\n3919#1:11091\n3927#1:11092\n3935#1:11093\n3943#1:11094\n3919#1:11095\n3927#1:11096\n3935#1:11097\n3943#1:11098\n3919#1:11099\n3927#1:11100\n3935#1:11101\n3943#1:11102\n3919#1:11103\n3927#1:11104\n3935#1:11105\n3943#1:11106\n3919#1:11107\n3927#1:11108\n3935#1:11109\n3943#1:11110\n3919#1:11111\n3927#1:11112\n3935#1:11113\n3943#1:11114\n3919#1:11115\n3927#1:11116\n3935#1:11117\n3943#1:11118\n3919#1:11119\n3927#1:11120\n3935#1:11121\n3943#1:11122\n3919#1:11123\n3927#1:11124\n3935#1:11125\n3943#1:11126\n3919#1:11127\n3927#1:11128\n3935#1:11129\n3943#1:11130\n3919#1:11131\n3927#1:11132\n3935#1:11133\n3943#1:11134\n3919#1:11135\n3927#1:11136\n3935#1:11137\n3943#1:11138\n3919#1:11139\n3927#1:11140\n3935#1:11141\n3943#1:11142\n3919#1:11143\n3927#1:11144\n3935#1:11145\n3943#1:11146\n3919#1:11147\n3927#1:11148\n3935#1:11149\n3943#1:11150\n3919#1:11151\n3927#1:11152\n3935#1:11153\n3943#1:11154\n3919#1:11155\n3927#1:11156\n3935#1:11157\n3943#1:11158\n1663#2,6:10890\n1675#2,6:10896\n1639#2,6:10902\n1651#2,6:10908\n1771#2,6:10914\n1783#2,6:10920\n1747#2,6:10926\n1759#2,6:10932\n1#3:10938\n361#4,7:10951\n361#4,7:10958\n361#4,7:10965\n361#4,7:10972\n361#4,7:10979\n361#4,7:10986\n361#4,7:10993\n361#4,7:11000\n*S KotlinDebug\n*F\n+ 1 _UArrays.kt\nkotlin/collections/unsigned/UArraysKt___UArraysKt\n*L\n326#1:10878\n338#1:10879\n350#1:10880\n362#1:10881\n692#1:10882\n702#1:10883\n712#1:10884\n722#1:10885\n733#1:10886\n744#1:10887\n755#1:10888\n766#1:10889\n1718#1:10939\n1735#1:10940\n1752#1:10941\n1769#1:10942\n2546#1:10943\n2563#1:10944\n2580#1:10945\n2597#1:10946\n2913#1:10947\n2929#1:10948\n2945#1:10949\n2961#1:10950\n5717#1:11007\n5737#1:11008\n5757#1:11009\n5777#1:11010\n5798#1:11011\n5820#1:11012\n5842#1:11013\n5864#1:11014\n5977#1:11015\n5996#1:11016\n6015#1:11017\n6034#1:11018\n6056#1:11019\n6085#1:11020\n6114#1:11021\n6143#1:11022\n6168#1:11023\n6193#1:11024\n6218#1:11025\n6243#1:11026\n6273#1:11027\n6296#1:11028\n6319#1:11029\n6342#1:11030\n6365#1:11031\n6388#1:11032\n6411#1:11033\n6434#1:11034\n6455#1:11035\n6478#1:11036\n6501#1:11037\n6524#1:11038\n6547#1:11039\n6568#1:11040\n6589#1:11041\n6610#1:11042\n6631#1:11043\n6652#1:11044\n6673#1:11045\n6694#1:11046\n6713#1:11047\n6734#1:11048\n6755#1:11049\n6776#1:11050\n6799#1:11051\n6822#1:11052\n6845#1:11053\n6868#1:11054\n6889#1:11055\n6910#1:11056\n6931#1:11057\n6952#1:11058\n6969#1:11059\n6984#1:11060\n6999#1:11061\n7014#1:11062\n7033#1:11063\n7052#1:11064\n7071#1:11065\n7090#1:11066\n7105#1:11067\n7120#1:11068\n7135#1:11069\n7150#1:11070\n7169#1:11071\n7188#1:11072\n7207#1:11073\n7226#1:11074\n7248#1:11075\n7277#1:11076\n7306#1:11077\n7335#1:11078\n7360#1:11079\n7385#1:11080\n7410#1:11081\n7435#1:11082\n7465#1:11083\n7488#1:11084\n7511#1:11085\n7534#1:11086\n7557#1:11087\n7580#1:11088\n7603#1:11089\n7626#1:11090\n7647#1:11091\n7670#1:11092\n7693#1:11093\n7716#1:11094\n7739#1:11095\n7760#1:11096\n7781#1:11097\n7802#1:11098\n7823#1:11099\n7844#1:11100\n7865#1:11101\n7886#1:11102\n7905#1:11103\n7926#1:11104\n7947#1:11105\n7968#1:11106\n7991#1:11107\n8014#1:11108\n8037#1:11109\n8060#1:11110\n8081#1:11111\n8102#1:11112\n8123#1:11113\n8144#1:11114\n8161#1:11115\n8176#1:11116\n8191#1:11117\n8206#1:11118\n8225#1:11119\n8244#1:11120\n8263#1:11121\n8282#1:11122\n8297#1:11123\n8312#1:11124\n8327#1:11125\n8342#1:11126\n8560#1:11127\n8585#1:11128\n8610#1:11129\n8635#1:11130\n8660#1:11131\n8685#1:11132\n8710#1:11133\n8735#1:11134\n8759#1:11135\n8783#1:11136\n8807#1:11137\n8831#1:11138\n8856#1:11139\n8881#1:11140\n8906#1:11141\n8931#1:11142\n8953#1:11143\n8978#1:11144\n9003#1:11145\n9028#1:11146\n9053#1:11147\n9079#1:11148\n9105#1:11149\n9131#1:11150\n9156#1:11151\n9181#1:11152\n9206#1:11153\n9231#1:11154\n9257#1:11155\n9282#1:11156\n9307#1:11157\n9332#1:11158\n816#1:10890,6\n826#1:10896,6\n836#1:10902,6\n846#1:10908,6\n856#1:10914,6\n866#1:10920,6\n876#1:10926,6\n886#1:10932,6\n4935#1:10951,7\n4955#1:10958,7\n4975#1:10965,7\n4995#1:10972,7\n5016#1:10979,7\n5037#1:10986,7\n5058#1:10993,7\n5079#1:11000,7\n*E\n"})
/* loaded from: classes.dex */
public class c extends a4.b {

    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.a<Iterator<? extends x1>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int[] f213l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int[] iArr) {
            super(0);
            this.f213l = iArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<x1> n() {
            return y1.s(this.f213l);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.a<Iterator<? extends b2>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ long[] f214l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long[] jArr) {
            super(0);
            this.f214l = jArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<b2> n() {
            return c2.s(this.f214l);
        }
    }

    /* renamed from: a4.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0009c extends n0 implements t4.a<Iterator<? extends t1>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ byte[] f215l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0009c(byte[] bArr) {
            super(0);
            this.f215l = bArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<t1> n() {
            return u1.s(this.f215l);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0 implements t4.a<Iterator<? extends h2>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ short[] f216l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(short[] sArr) {
            super(0);
            this.f216l = sArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<h2> n() {
            return i2.s(this.f216l);
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long A0(long[] jArr) {
        l0.p(jArr, "$this$component1");
        return c2.m(jArr, 0);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] A1(byte[] bArr, int i7) {
        l0.p(bArr, "$this$copyOf");
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        l0.o(copyOf, "copyOf(this, newSize)");
        return u1.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<b2> A2(long[] jArr, p<? super Integer, ? super b2, Boolean> pVar) {
        l0.p(jArr, "$this$filterIndexed");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = c2.o(jArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            long m7 = c2.m(jArr, i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), b2.d(m7)).booleanValue()) {
                arrayList.add(b2.d(m7));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R, C extends Collection<? super R>> C A3(byte[] bArr, C c7, p<? super Integer, ? super t1, ? extends Iterable<? extends R>> pVar) {
        l0.p(bArr, "$this$flatMapIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int o6 = u1.o(bArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            b0.o0(c7, pVar.J(Integer.valueOf(i8), t1.d(u1.m(bArr, i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    @g1(version = "1.3")
    @e
    @t
    public static final x1 A4(@n6.d int[] iArr, int i7) {
        l0.p(iArr, "$this$getOrNull");
        if (i7 < 0 || i7 > x3.p.Ve(iArr)) {
            return null;
        }
        return x1.d(y1.m(iArr, i7));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> A5(int[] iArr, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$map");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(y1.o(iArr));
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            arrayList.add(lVar.O(x1.d(y1.m(iArr, i7))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R A6(short[] sArr, Comparator<? super R> comparator, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        Object obj = (R) lVar.O(h2.d(i2.m(sArr, 0)));
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(h2.d(i2.m(sArr, it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R A7(short[] sArr, Comparator<? super R> comparator, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$minOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(h2.d(i2.m(sArr, 0)));
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(h2.d(i2.m(sArr, it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte A8(byte[] bArr) {
        l0.p(bArr, "$this$random");
        return D8(bArr, b5.f.f7260k);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final void A9(int[] iArr, int i7, int i8) {
        l0.p(iArr, "$this$reverse");
        x3.p.zr(iArr, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final t1 Aa(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$singleOrNull");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        t1 t1Var = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (lVar.O(t1.d(m7)).booleanValue()) {
                if (z6) {
                    return null;
                }
                t1Var = t1.d(m7);
                z6 = true;
            }
        }
        if (z6) {
            return t1Var;
        }
        return null;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final long[] Ab(@n6.d long[] jArr) {
        l0.p(jArr, "$this$sortedArrayDescending");
        if (c2.r(jArr)) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        long[] f7 = c2.f(copyOf);
        nb(f7);
        return f7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<x1> Ac(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$takeLastWhile");
        l0.p(lVar, "predicate");
        for (int Ve = x3.p.Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.O(x1.d(y1.m(iArr, Ve))).booleanValue()) {
                return Q1(iArr, Ve + 1);
            }
        }
        return e0.Q5(y1.b(iArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short B0(short[] sArr) {
        l0.p(sArr, "$this$component1");
        return i2.m(sArr, 0);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] B1(long[] jArr) {
        l0.p(jArr, "$this$copyOf");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return c2.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<h2> B2(short[] sArr, p<? super Integer, ? super h2, Boolean> pVar) {
        l0.p(sArr, "$this$filterIndexed");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = i2.o(sArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            short m7 = i2.m(sArr, i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), h2.d(m7)).booleanValue()) {
                arrayList.add(h2.d(m7));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R, C extends Collection<? super R>> C B3(long[] jArr, C c7, p<? super Integer, ? super b2, ? extends Iterable<? extends R>> pVar) {
        l0.p(jArr, "$this$flatMapIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int o6 = c2.o(jArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            b0.o0(c7, pVar.J(Integer.valueOf(i8), b2.d(c2.m(jArr, i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    @g1(version = "1.3")
    @e
    @t
    public static final b2 B4(@n6.d long[] jArr, int i7) {
        l0.p(jArr, "$this$getOrNull");
        if (i7 < 0 || i7 > x3.p.We(jArr)) {
            return null;
        }
        return b2.d(c2.m(jArr, i7));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> B5(short[] sArr, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$map");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(i2.o(sArr));
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            arrayList.add(lVar.O(h2.d(i2.m(sArr, i7))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R B6(int[] iArr, Comparator<? super R> comparator, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$maxOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        Object obj = (R) lVar.O(x1.d(y1.m(iArr, 0)));
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(x1.d(y1.m(iArr, it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R B7(int[] iArr, Comparator<? super R> comparator, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$minOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(x1.d(y1.m(iArr, 0)));
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(x1.d(y1.m(iArr, it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.3")
    @t
    public static final long B8(@n6.d long[] jArr, @n6.d b5.f fVar) {
        l0.p(jArr, "$this$random");
        l0.p(fVar, "random");
        if (c2.r(jArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return c2.m(jArr, fVar.m(c2.o(jArr)));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void B9(short[] sArr) {
        l0.p(sArr, "$this$reverse");
        x3.p.Er(sArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final b2 Ba(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$singleOrNull");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        b2 b2Var = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (lVar.O(b2.d(m7)).booleanValue()) {
                if (z6) {
                    return null;
                }
                b2Var = b2.d(m7);
                z6 = true;
            }
        }
        if (z6) {
            return b2Var;
        }
        return null;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final short[] Bb(@n6.d short[] sArr) {
        l0.p(sArr, "$this$sortedArrayDescending");
        if (i2.r(sArr)) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        short[] f7 = i2.f(copyOf);
        pb(f7);
        return f7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<h2> Bc(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$takeLastWhile");
        l0.p(lVar, "predicate");
        for (int Ye = x3.p.Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.O(h2.d(i2.m(sArr, Ye))).booleanValue()) {
                return P1(sArr, Ye + 1);
            }
        }
        return e0.Q5(i2.b(sArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int C0(int[] iArr) {
        l0.p(iArr, "$this$component2");
        return y1.m(iArr, 1);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] C1(short[] sArr, int i7) {
        l0.p(sArr, "$this$copyOf");
        short[] copyOf = Arrays.copyOf(sArr, i7);
        l0.o(copyOf, "copyOf(this, newSize)");
        return i2.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super x1>> C C2(int[] iArr, C c7, p<? super Integer, ? super x1, Boolean> pVar) {
        l0.p(iArr, "$this$filterIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "predicate");
        int o6 = y1.o(iArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            int m7 = y1.m(iArr, i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), x1.d(m7)).booleanValue()) {
                c7.add(x1.d(m7));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C C3(long[] jArr, C c7, l<? super b2, ? extends Iterable<? extends R>> lVar) {
        l0.p(jArr, "$this$flatMapTo");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b0.o0(c7, lVar.O(b2.d(c2.m(jArr, i7))));
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K, V> Map<K, List<V>> C4(long[] jArr, l<? super b2, ? extends K> lVar, l<? super b2, ? extends V> lVar2) {
        l0.p(jArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            K O = lVar.O(b2.d(m7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(b2.d(m7)));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> C5(byte[] bArr, p<? super Integer, ? super t1, ? extends R> pVar) {
        l0.p(bArr, "$this$mapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(u1.o(bArr));
        int o6 = u1.o(bArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            arrayList.add(pVar.J(Integer.valueOf(i8), t1.d(u1.m(bArr, i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final x1 C6(@n6.d int[] iArr) {
        l0.p(iArr, "$this$maxOrNull");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            if (Integer.compareUnsigned(m7, m8) < 0) {
                m7 = m8;
            }
        }
        return x1.d(m7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R C7(long[] jArr, Comparator<? super R> comparator, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$minOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        Object obj = (R) lVar.O(b2.d(c2.m(jArr, 0)));
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(b2.d(c2.m(jArr, it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long C8(long[] jArr) {
        l0.p(jArr, "$this$random");
        return B8(jArr, b5.f.f7260k);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> C9(@n6.d int[] iArr) {
        l0.p(iArr, "$this$reversed");
        if (y1.r(iArr)) {
            return w.E();
        }
        List<x1> T5 = e0.T5(y1.b(iArr));
        d0.m1(T5);
        return T5;
    }

    @g1(version = "1.3")
    @e
    @t
    public static final b2 Ca(@n6.d long[] jArr) {
        l0.p(jArr, "$this$singleOrNull");
        if (c2.o(jArr) == 1) {
            return b2.d(c2.m(jArr, 0));
        }
        return null;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> Cb(@n6.d int[] iArr) {
        l0.p(iArr, "$this$sortedDescending");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        int[] f7 = y1.f(copyOf);
        Wa(f7);
        return C9(f7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<t1> Cc(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$takeWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (!lVar.O(t1.d(m7)).booleanValue()) {
                break;
            }
            arrayList.add(t1.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte D0(byte[] bArr) {
        l0.p(bArr, "$this$component2");
        return u1.m(bArr, 1);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] D1(int[] iArr, int i7) {
        l0.p(iArr, "$this$copyOf");
        int[] copyOf = Arrays.copyOf(iArr, i7);
        l0.o(copyOf, "copyOf(this, newSize)");
        return y1.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super h2>> C D2(short[] sArr, C c7, p<? super Integer, ? super h2, Boolean> pVar) {
        l0.p(sArr, "$this$filterIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "predicate");
        int o6 = i2.o(sArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            short m7 = i2.m(sArr, i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), h2.d(m7)).booleanValue()) {
                c7.add(h2.d(m7));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C D3(short[] sArr, C c7, l<? super h2, ? extends Iterable<? extends R>> lVar) {
        l0.p(sArr, "$this$flatMapTo");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b0.o0(c7, lVar.O(h2.d(i2.m(sArr, i7))));
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K, V> Map<K, List<V>> D4(short[] sArr, l<? super h2, ? extends K> lVar, l<? super h2, ? extends V> lVar2) {
        l0.p(sArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            K O = lVar.O(h2.d(m7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(h2.d(m7)));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> D5(int[] iArr, p<? super Integer, ? super x1, ? extends R> pVar) {
        l0.p(iArr, "$this$mapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(y1.o(iArr));
        int o6 = y1.o(iArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            arrayList.add(pVar.J(Integer.valueOf(i8), x1.d(y1.m(iArr, i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final t1 D6(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$maxOrNull");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            if (l0.t(m7 & t1.f17828n, m8 & t1.f17828n) < 0) {
                m7 = m8;
            }
        }
        return t1.d(m7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R D7(byte[] bArr, Comparator<? super R> comparator, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$minOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        Object obj = (R) lVar.O(t1.d(u1.m(bArr, 0)));
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(t1.d(u1.m(bArr, it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.3")
    @t
    public static final byte D8(@n6.d byte[] bArr, @n6.d b5.f fVar) {
        l0.p(bArr, "$this$random");
        l0.p(fVar, "random");
        if (u1.r(bArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return u1.m(bArr, fVar.m(u1.o(bArr)));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> D9(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$reversed");
        if (u1.r(bArr)) {
            return w.E();
        }
        List<t1> T5 = e0.T5(u1.b(bArr));
        d0.m1(T5);
        return T5;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final x1 Da(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$singleOrNull");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        x1 x1Var = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (lVar.O(x1.d(m7)).booleanValue()) {
                if (z6) {
                    return null;
                }
                x1Var = x1.d(m7);
                z6 = true;
            }
        }
        if (z6) {
            return x1Var;
        }
        return null;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> Db(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$sortedDescending");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        byte[] f7 = u1.f(copyOf);
        db(f7);
        return D9(f7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<b2> Dc(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$takeWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (!lVar.O(b2.d(m7)).booleanValue()) {
                break;
            }
            arrayList.add(b2.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long E0(long[] jArr) {
        l0.p(jArr, "$this$component2");
        return c2.m(jArr, 1);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] E1(long[] jArr, int i7) {
        l0.p(jArr, "$this$copyOf");
        long[] copyOf = Arrays.copyOf(jArr, i7);
        l0.o(copyOf, "copyOf(this, newSize)");
        return c2.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super t1>> C E2(byte[] bArr, C c7, p<? super Integer, ? super t1, Boolean> pVar) {
        l0.p(bArr, "$this$filterIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "predicate");
        int o6 = u1.o(bArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            byte m7 = u1.m(bArr, i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), t1.d(m7)).booleanValue()) {
                c7.add(t1.d(m7));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C E3(int[] iArr, C c7, l<? super x1, ? extends Iterable<? extends R>> lVar) {
        l0.p(iArr, "$this$flatMapTo");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b0.o0(c7, lVar.O(x1.d(y1.m(iArr, i7))));
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K> Map<K, List<t1>> E4(byte[] bArr, l<? super t1, ? extends K> lVar) {
        l0.p(bArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            K O = lVar.O(t1.d(m7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(t1.d(m7));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> E5(long[] jArr, p<? super Integer, ? super b2, ? extends R> pVar) {
        l0.p(jArr, "$this$mapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(c2.o(jArr));
        int o6 = c2.o(jArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            arrayList.add(pVar.J(Integer.valueOf(i8), b2.d(c2.m(jArr, i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final b2 E6(@n6.d long[] jArr) {
        l0.p(jArr, "$this$maxOrNull");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            if (Long.compareUnsigned(m7, m8) < 0) {
                m7 = m8;
            }
        }
        return b2.d(m7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R E7(short[] sArr, Comparator<? super R> comparator, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$minOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        Object obj = (R) lVar.O(h2.d(i2.m(sArr, 0)));
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(h2.d(i2.m(sArr, it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short E8(short[] sArr) {
        l0.p(sArr, "$this$random");
        return F8(sArr, b5.f.f7260k);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> E9(@n6.d long[] jArr) {
        l0.p(jArr, "$this$reversed");
        if (c2.r(jArr)) {
            return w.E();
        }
        List<b2> T5 = e0.T5(c2.b(jArr));
        d0.m1(T5);
        return T5;
    }

    @g1(version = "1.3")
    @e
    @t
    public static final h2 Ea(@n6.d short[] sArr) {
        l0.p(sArr, "$this$singleOrNull");
        if (i2.o(sArr) == 1) {
            return h2.d(i2.m(sArr, 0));
        }
        return null;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> Eb(@n6.d long[] jArr) {
        l0.p(jArr, "$this$sortedDescending");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        long[] f7 = c2.f(copyOf);
        eb(f7);
        return E9(f7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<x1> Ec(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$takeWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (!lVar.O(x1.d(m7)).booleanValue()) {
                break;
            }
            arrayList.add(x1.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short F0(short[] sArr) {
        l0.p(sArr, "$this$component2");
        return i2.m(sArr, 1);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] F1(short[] sArr) {
        l0.p(sArr, "$this$copyOf");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return i2.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super b2>> C F2(long[] jArr, C c7, p<? super Integer, ? super b2, Boolean> pVar) {
        l0.p(jArr, "$this$filterIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "predicate");
        int o6 = c2.o(jArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            long m7 = c2.m(jArr, i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), b2.d(m7)).booleanValue()) {
                c7.add(b2.d(m7));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C F3(byte[] bArr, C c7, l<? super t1, ? extends Iterable<? extends R>> lVar) {
        l0.p(bArr, "$this$flatMapTo");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b0.o0(c7, lVar.O(t1.d(u1.m(bArr, i7))));
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K, V> Map<K, List<V>> F4(int[] iArr, l<? super x1, ? extends K> lVar, l<? super x1, ? extends V> lVar2) {
        l0.p(iArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            K O = lVar.O(x1.d(m7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(x1.d(m7)));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> F5(short[] sArr, p<? super Integer, ? super h2, ? extends R> pVar) {
        l0.p(sArr, "$this$mapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(i2.o(sArr));
        int o6 = i2.o(sArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            arrayList.add(pVar.J(Integer.valueOf(i8), h2.d(i2.m(sArr, i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final h2 F6(@n6.d short[] sArr) {
        l0.p(sArr, "$this$maxOrNull");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            if (l0.t(m7 & h2.f17796n, 65535 & m8) < 0) {
                m7 = m8;
            }
        }
        return h2.d(m7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R F7(int[] iArr, Comparator<? super R> comparator, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$minOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        Object obj = (R) lVar.O(x1.d(y1.m(iArr, 0)));
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(x1.d(y1.m(iArr, it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.3")
    @t
    public static final short F8(@n6.d short[] sArr, @n6.d b5.f fVar) {
        l0.p(sArr, "$this$random");
        l0.p(fVar, "random");
        if (i2.r(sArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return i2.m(sArr, fVar.m(i2.o(sArr)));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> F9(@n6.d short[] sArr) {
        l0.p(sArr, "$this$reversed");
        if (i2.r(sArr)) {
            return w.E();
        }
        List<h2> T5 = e0.T5(i2.b(sArr));
        d0.m1(T5);
        return T5;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final h2 Fa(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$singleOrNull");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        h2 h2Var = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (lVar.O(h2.d(m7)).booleanValue()) {
                if (z6) {
                    return null;
                }
                h2Var = h2.d(m7);
                z6 = true;
            }
        }
        if (z6) {
            return h2Var;
        }
        return null;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> Fb(@n6.d short[] sArr) {
        l0.p(sArr, "$this$sortedDescending");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        short[] f7 = i2.f(copyOf);
        hb(f7);
        return F9(f7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<h2> Fc(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$takeWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (!lVar.O(h2.d(m7)).booleanValue()) {
                break;
            }
            arrayList.add(h2.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int G0(int[] iArr) {
        l0.p(iArr, "$this$component3");
        return y1.m(iArr, 2);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] G1(long[] jArr, int i7, int i8) {
        l0.p(jArr, "$this$copyOfRange");
        return c2.f(o.L1(jArr, i7, i8));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<t1> G2(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$filterNot");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (!lVar.O(t1.d(m7)).booleanValue()) {
                arrayList.add(t1.d(m7));
            }
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R G3(long[] jArr, R r6, p<? super R, ? super b2, ? extends R> pVar) {
        l0.p(jArr, "$this$fold");
        l0.p(pVar, "operation");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, b2.d(c2.m(jArr, i7)));
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K> Map<K, List<b2>> G4(long[] jArr, l<? super b2, ? extends K> lVar) {
        l0.p(jArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            K O = lVar.O(b2.d(m7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(b2.d(m7));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C G5(int[] iArr, C c7, p<? super Integer, ? super x1, ? extends R> pVar) {
        l0.p(iArr, "$this$mapIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int o6 = y1.o(iArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            c7.add(pVar.J(Integer.valueOf(i8), x1.d(y1.m(iArr, i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    @h(name = "maxOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final byte G6(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$max");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            if (l0.t(m7 & t1.f17828n, m8 & t1.f17828n) < 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final x1 G7(@n6.d int[] iArr) {
        l0.p(iArr, "$this$minOrNull");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            if (Integer.compareUnsigned(m7, m8) > 0) {
                m7 = m8;
            }
        }
        return x1.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final x1 G8(int[] iArr) {
        l0.p(iArr, "$this$randomOrNull");
        return H8(iArr, b5.f.f7260k);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] G9(int[] iArr) {
        l0.p(iArr, "$this$reversedArray");
        return y1.f(x3.p.Vr(iArr));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> Ga(@n6.d long[] jArr, @n6.d Iterable<Integer> iterable) {
        l0.p(jArr, "$this$slice");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(b2.d(c2.m(jArr, it.next().intValue())));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int Gb(int[] iArr) {
        l0.p(iArr, "$this$sum");
        return x1.l(x3.p.Bw(iArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] Gc(byte[] bArr) {
        l0.p(bArr, "$this$toByteArray");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte H0(byte[] bArr) {
        l0.p(bArr, "$this$component3");
        return u1.m(bArr, 2);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] H1(byte[] bArr, int i7, int i8) {
        l0.p(bArr, "$this$copyOfRange");
        return u1.f(o.G1(bArr, i7, i8));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<b2> H2(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$filterNot");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (!lVar.O(b2.d(m7)).booleanValue()) {
                arrayList.add(b2.d(m7));
            }
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R H3(byte[] bArr, R r6, p<? super R, ? super t1, ? extends R> pVar) {
        l0.p(bArr, "$this$fold");
        l0.p(pVar, "operation");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, t1.d(u1.m(bArr, i7)));
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K, V> Map<K, List<V>> H4(byte[] bArr, l<? super t1, ? extends K> lVar, l<? super t1, ? extends V> lVar2) {
        l0.p(bArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            K O = lVar.O(t1.d(m7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(t1.d(m7)));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C H5(short[] sArr, C c7, p<? super Integer, ? super h2, ? extends R> pVar) {
        l0.p(sArr, "$this$mapIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int o6 = i2.o(sArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            c7.add(pVar.J(Integer.valueOf(i8), h2.d(i2.m(sArr, i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    @h(name = "maxOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final int H6(@n6.d int[] iArr) {
        l0.p(iArr, "$this$max");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            if (Integer.compareUnsigned(m7, m8) < 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final t1 H7(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$minOrNull");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            if (l0.t(m7 & t1.f17828n, m8 & t1.f17828n) > 0) {
                m7 = m8;
            }
        }
        return t1.d(m7);
    }

    @g1(version = "1.4")
    @t
    @e
    @q2(markerClass = {r.class})
    public static final x1 H8(@n6.d int[] iArr, @n6.d b5.f fVar) {
        l0.p(iArr, "$this$randomOrNull");
        l0.p(fVar, "random");
        if (y1.r(iArr)) {
            return null;
        }
        return x1.d(y1.m(iArr, fVar.m(y1.o(iArr))));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] H9(byte[] bArr) {
        l0.p(bArr, "$this$reversedArray");
        return u1.f(x3.p.Rr(bArr));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> Ha(@n6.d int[] iArr, @n6.d Iterable<Integer> iterable) {
        l0.p(iArr, "$this$slice");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(x1.d(y1.m(iArr, it.next().intValue())));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int Hb(byte[] bArr) {
        l0.p(bArr, "$this$sum");
        int l7 = x1.l(0);
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = x1.l(l7 + x1.l(u1.m(bArr, i7) & t1.f17828n));
        }
        return l7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] Hc(int[] iArr) {
        l0.p(iArr, "$this$toIntArray");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long I0(long[] jArr) {
        l0.p(jArr, "$this$component3");
        return c2.m(jArr, 2);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] I1(short[] sArr, int i7, int i8) {
        l0.p(sArr, "$this$copyOfRange");
        return i2.f(o.N1(sArr, i7, i8));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<x1> I2(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$filterNot");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (!lVar.O(x1.d(m7)).booleanValue()) {
                arrayList.add(x1.d(m7));
            }
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R I3(int[] iArr, R r6, p<? super R, ? super x1, ? extends R> pVar) {
        l0.p(iArr, "$this$fold");
        l0.p(pVar, "operation");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, x1.d(y1.m(iArr, i7)));
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K> Map<K, List<x1>> I4(int[] iArr, l<? super x1, ? extends K> lVar) {
        l0.p(iArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            K O = lVar.O(x1.d(m7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(x1.d(m7));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C I5(byte[] bArr, C c7, p<? super Integer, ? super t1, ? extends R> pVar) {
        l0.p(bArr, "$this$mapIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int o6 = u1.o(bArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            c7.add(pVar.J(Integer.valueOf(i8), t1.d(u1.m(bArr, i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    @h(name = "maxOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final long I6(@n6.d long[] jArr) {
        l0.p(jArr, "$this$max");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            if (Long.compareUnsigned(m7, m8) < 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final b2 I7(@n6.d long[] jArr) {
        l0.p(jArr, "$this$minOrNull");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            if (Long.compareUnsigned(m7, m8) > 0) {
                m7 = m8;
            }
        }
        return b2.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final t1 I8(byte[] bArr) {
        l0.p(bArr, "$this$randomOrNull");
        return L8(bArr, b5.f.f7260k);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] I9(long[] jArr) {
        l0.p(jArr, "$this$reversedArray");
        return c2.f(x3.p.Wr(jArr));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> Ia(@n6.d short[] sArr, @n6.d Iterable<Integer> iterable) {
        l0.p(sArr, "$this$slice");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(h2.d(i2.m(sArr, it.next().intValue())));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long Ib(long[] jArr) {
        l0.p(jArr, "$this$sum");
        return b2.l(x3.p.Dw(jArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] Ic(long[] jArr) {
        l0.p(jArr, "$this$toLongArray");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short J0(short[] sArr) {
        l0.p(sArr, "$this$component3");
        return i2.m(sArr, 2);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] J1(int[] iArr, int i7, int i8) {
        l0.p(iArr, "$this$copyOfRange");
        return y1.f(o.K1(iArr, i7, i8));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<h2> J2(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$filterNot");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (!lVar.O(h2.d(m7)).booleanValue()) {
                arrayList.add(h2.d(m7));
            }
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R J3(short[] sArr, R r6, p<? super R, ? super h2, ? extends R> pVar) {
        l0.p(sArr, "$this$fold");
        l0.p(pVar, "operation");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, h2.d(i2.m(sArr, i7)));
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K> Map<K, List<h2>> J4(short[] sArr, l<? super h2, ? extends K> lVar) {
        l0.p(sArr, "$this$groupBy");
        l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            K O = lVar.O(h2.d(m7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(h2.d(m7));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C J5(long[] jArr, C c7, p<? super Integer, ? super b2, ? extends R> pVar) {
        l0.p(jArr, "$this$mapIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int o6 = c2.o(jArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            c7.add(pVar.J(Integer.valueOf(i8), b2.d(c2.m(jArr, i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    @h(name = "maxOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final short J6(@n6.d short[] sArr) {
        l0.p(sArr, "$this$max");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            if (l0.t(m7 & h2.f17796n, 65535 & m8) < 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final h2 J7(@n6.d short[] sArr) {
        l0.p(sArr, "$this$minOrNull");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            if (l0.t(m7 & h2.f17796n, 65535 & m8) > 0) {
                m7 = m8;
            }
        }
        return h2.d(m7);
    }

    @g1(version = "1.4")
    @t
    @e
    @q2(markerClass = {r.class})
    public static final b2 J8(@n6.d long[] jArr, @n6.d b5.f fVar) {
        l0.p(jArr, "$this$randomOrNull");
        l0.p(fVar, "random");
        if (c2.r(jArr)) {
            return null;
        }
        return b2.d(c2.m(jArr, fVar.m(c2.o(jArr))));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] J9(short[] sArr) {
        l0.p(sArr, "$this$reversedArray");
        return i2.f(x3.p.Yr(sArr));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> Ja(@n6.d byte[] bArr, @n6.d Iterable<Integer> iterable) {
        l0.p(bArr, "$this$slice");
        l0.p(iterable, "indices");
        int Y = x.Y(iterable, 10);
        if (Y == 0) {
            return w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(t1.d(u1.m(bArr, it.next().intValue())));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int Jb(short[] sArr) {
        l0.p(sArr, "$this$sum");
        int l7 = x1.l(0);
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = x1.l(l7 + x1.l(i2.m(sArr, i7) & h2.f17796n));
        }
        return l7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] Jc(short[] sArr) {
        l0.p(sArr, "$this$toShortArray");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int K0(int[] iArr) {
        l0.p(iArr, "$this$component4");
        return y1.m(iArr, 3);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int K1(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$count");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            if (lVar.O(t1.d(u1.m(bArr, i8))).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super b2>> C K2(long[] jArr, C c7, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$filterNotTo");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (!lVar.O(b2.d(m7)).booleanValue()) {
                c7.add(b2.d(m7));
            }
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R K3(byte[] bArr, R r6, q<? super Integer, ? super R, ? super t1, ? extends R> qVar) {
        l0.p(bArr, "$this$foldIndexed");
        l0.p(qVar, "operation");
        int o6 = u1.o(bArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            r6 = qVar.I(Integer.valueOf(i8), r6, t1.d(u1.m(bArr, i7)));
            i7++;
            i8++;
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K, M extends Map<? super K, List<x1>>> M K4(int[] iArr, M m7, l<? super x1, ? extends K> lVar) {
        l0.p(iArr, "$this$groupByTo");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m8 = y1.m(iArr, i7);
            K O = lVar.O(x1.d(m8));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(x1.d(m8));
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C K5(long[] jArr, C c7, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$mapTo");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            c7.add(lVar.O(b2.d(c2.m(jArr, i7))));
        }
        return c7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final t1 K6(@n6.d byte[] bArr, @n6.d Comparator<? super t1> comparator) {
        l0.p(bArr, "$this$maxWithOrNull");
        l0.p(comparator, "comparator");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            if (comparator.compare(t1.d(m7), t1.d(m8)) < 0) {
                m7 = m8;
            }
        }
        return t1.d(m7);
    }

    @h(name = "minOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final byte K7(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$min");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            if (l0.t(m7 & t1.f17828n, m8 & t1.f17828n) > 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final b2 K8(long[] jArr) {
        l0.p(jArr, "$this$randomOrNull");
        return J8(jArr, b5.f.f7260k);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R> List<R> K9(long[] jArr, R r6, p<? super R, ? super b2, ? extends R> pVar) {
        l0.p(jArr, "$this$runningFold");
        l0.p(pVar, "operation");
        if (c2.r(jArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(c2.o(jArr) + 1);
        arrayList.add(r6);
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, b2.d(c2.m(jArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> Ka(@n6.d short[] sArr, @n6.d d5.l lVar) {
        l0.p(sArr, "$this$slice");
        l0.p(lVar, "indices");
        return lVar.isEmpty() ? w.E() : a4.b.d(i2.f(o.N1(sArr, lVar.b().intValue(), lVar.g().intValue() + 1)));
    }

    @g1(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    @t
    @f
    public static final int Kb(byte[] bArr, l<? super t1, x1> lVar) {
        l0.p(bArr, "$this$sumBy");
        l0.p(lVar, "selector");
        int o6 = u1.o(bArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            i7 = x1.l(i7 + lVar.O(t1.d(u1.m(bArr, i8))).l0());
        }
        return i7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final x1[] Kc(@n6.d int[] iArr) {
        l0.p(iArr, "$this$toTypedArray");
        int o6 = y1.o(iArr);
        x1[] x1VarArr = new x1[o6];
        for (int i7 = 0; i7 < o6; i7++) {
            x1VarArr[i7] = x1.d(y1.m(iArr, i7));
        }
        return x1VarArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte L0(byte[] bArr) {
        l0.p(bArr, "$this$component4");
        return u1.m(bArr, 3);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int L1(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$count");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            if (lVar.O(b2.d(c2.m(jArr, i8))).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super h2>> C L2(short[] sArr, C c7, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$filterNotTo");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (!lVar.O(h2.d(m7)).booleanValue()) {
                c7.add(h2.d(m7));
            }
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R L3(short[] sArr, R r6, q<? super Integer, ? super R, ? super h2, ? extends R> qVar) {
        l0.p(sArr, "$this$foldIndexed");
        l0.p(qVar, "operation");
        int o6 = i2.o(sArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            r6 = qVar.I(Integer.valueOf(i8), r6, h2.d(i2.m(sArr, i7)));
            i7++;
            i8++;
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K, M extends Map<? super K, List<t1>>> M L4(byte[] bArr, M m7, l<? super t1, ? extends K> lVar) {
        l0.p(bArr, "$this$groupByTo");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m8 = u1.m(bArr, i7);
            K O = lVar.O(t1.d(m8));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(t1.d(m8));
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C L5(short[] sArr, C c7, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$mapTo");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            c7.add(lVar.O(h2.d(i2.m(sArr, i7))));
        }
        return c7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final x1 L6(@n6.d int[] iArr, @n6.d Comparator<? super x1> comparator) {
        l0.p(iArr, "$this$maxWithOrNull");
        l0.p(comparator, "comparator");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            if (comparator.compare(x1.d(m7), x1.d(m8)) < 0) {
                m7 = m8;
            }
        }
        return x1.d(m7);
    }

    @h(name = "minOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final int L7(@n6.d int[] iArr) {
        l0.p(iArr, "$this$min");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            if (Integer.compareUnsigned(m7, m8) > 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @e
    @q2(markerClass = {r.class})
    public static final t1 L8(@n6.d byte[] bArr, @n6.d b5.f fVar) {
        l0.p(bArr, "$this$randomOrNull");
        l0.p(fVar, "random");
        if (u1.r(bArr)) {
            return null;
        }
        return t1.d(u1.m(bArr, fVar.m(u1.o(bArr))));
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R> List<R> L9(byte[] bArr, R r6, p<? super R, ? super t1, ? extends R> pVar) {
        l0.p(bArr, "$this$runningFold");
        l0.p(pVar, "operation");
        if (u1.r(bArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(u1.o(bArr) + 1);
        arrayList.add(r6);
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, t1.d(u1.m(bArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> La(@n6.d long[] jArr, @n6.d d5.l lVar) {
        l0.p(jArr, "$this$slice");
        l0.p(lVar, "indices");
        return lVar.isEmpty() ? w.E() : a4.b.c(c2.f(o.L1(jArr, lVar.b().intValue(), lVar.g().intValue() + 1)));
    }

    @g1(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    @t
    @f
    public static final int Lb(long[] jArr, l<? super b2, x1> lVar) {
        l0.p(jArr, "$this$sumBy");
        l0.p(lVar, "selector");
        int o6 = c2.o(jArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            i7 = x1.l(i7 + lVar.O(b2.d(c2.m(jArr, i8))).l0());
        }
        return i7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final t1[] Lc(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$toTypedArray");
        int o6 = u1.o(bArr);
        t1[] t1VarArr = new t1[o6];
        for (int i7 = 0; i7 < o6; i7++) {
            t1VarArr[i7] = t1.d(u1.m(bArr, i7));
        }
        return t1VarArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long M0(long[] jArr) {
        l0.p(jArr, "$this$component4");
        return c2.m(jArr, 3);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int M1(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$count");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            if (lVar.O(x1.d(y1.m(iArr, i8))).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super x1>> C M2(int[] iArr, C c7, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$filterNotTo");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (!lVar.O(x1.d(m7)).booleanValue()) {
                c7.add(x1.d(m7));
            }
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R M3(long[] jArr, R r6, q<? super Integer, ? super R, ? super b2, ? extends R> qVar) {
        l0.p(jArr, "$this$foldIndexed");
        l0.p(qVar, "operation");
        int o6 = c2.o(jArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            r6 = qVar.I(Integer.valueOf(i8), r6, b2.d(c2.m(jArr, i7)));
            i7++;
            i8++;
        }
        return r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @t
    @f
    public static final <K, V, M extends Map<? super K, List<V>>> M M4(int[] iArr, M m7, l<? super x1, ? extends K> lVar, l<? super x1, ? extends V> lVar2) {
        l0.p(iArr, "$this$groupByTo");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m8 = y1.m(iArr, i7);
            K O = lVar.O(x1.d(m8));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(x1.d(m8)));
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C M5(int[] iArr, C c7, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$mapTo");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            c7.add(lVar.O(x1.d(y1.m(iArr, i7))));
        }
        return c7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final h2 M6(@n6.d short[] sArr, @n6.d Comparator<? super h2> comparator) {
        l0.p(sArr, "$this$maxWithOrNull");
        l0.p(comparator, "comparator");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            if (comparator.compare(h2.d(m7), h2.d(m8)) < 0) {
                m7 = m8;
            }
        }
        return h2.d(m7);
    }

    @h(name = "minOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final long M7(@n6.d long[] jArr) {
        l0.p(jArr, "$this$min");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            if (Long.compareUnsigned(m7, m8) > 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final h2 M8(short[] sArr) {
        l0.p(sArr, "$this$randomOrNull");
        return N8(sArr, b5.f.f7260k);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R> List<R> M9(int[] iArr, R r6, p<? super R, ? super x1, ? extends R> pVar) {
        l0.p(iArr, "$this$runningFold");
        l0.p(pVar, "operation");
        if (y1.r(iArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(y1.o(iArr) + 1);
        arrayList.add(r6);
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, x1.d(y1.m(iArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> Ma(@n6.d byte[] bArr, @n6.d d5.l lVar) {
        l0.p(bArr, "$this$slice");
        l0.p(lVar, "indices");
        return lVar.isEmpty() ? w.E() : a4.b.b(u1.f(o.G1(bArr, lVar.b().intValue(), lVar.g().intValue() + 1)));
    }

    @g1(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    @t
    @f
    public static final int Mb(int[] iArr, l<? super x1, x1> lVar) {
        l0.p(iArr, "$this$sumBy");
        l0.p(lVar, "selector");
        int o6 = y1.o(iArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            i7 = x1.l(i7 + lVar.O(x1.d(y1.m(iArr, i8))).l0());
        }
        return i7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final b2[] Mc(@n6.d long[] jArr) {
        l0.p(jArr, "$this$toTypedArray");
        int o6 = c2.o(jArr);
        b2[] b2VarArr = new b2[o6];
        for (int i7 = 0; i7 < o6; i7++) {
            b2VarArr[i7] = b2.d(c2.m(jArr, i7));
        }
        return b2VarArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short N0(short[] sArr) {
        l0.p(sArr, "$this$component4");
        return i2.m(sArr, 3);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int N1(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$count");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            if (lVar.O(h2.d(i2.m(sArr, i8))).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super t1>> C N2(byte[] bArr, C c7, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$filterNotTo");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (!lVar.O(t1.d(m7)).booleanValue()) {
                c7.add(t1.d(m7));
            }
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R N3(int[] iArr, R r6, q<? super Integer, ? super R, ? super x1, ? extends R> qVar) {
        l0.p(iArr, "$this$foldIndexed");
        l0.p(qVar, "operation");
        int o6 = y1.o(iArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            r6 = qVar.I(Integer.valueOf(i8), r6, x1.d(y1.m(iArr, i7)));
            i7++;
            i8++;
        }
        return r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @t
    @f
    public static final <K, V, M extends Map<? super K, List<V>>> M N4(long[] jArr, M m7, l<? super b2, ? extends K> lVar, l<? super b2, ? extends V> lVar2) {
        l0.p(jArr, "$this$groupByTo");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m8 = c2.m(jArr, i7);
            K O = lVar.O(b2.d(m8));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(b2.d(m8)));
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, C extends Collection<? super R>> C N5(byte[] bArr, C c7, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$mapTo");
        l0.p(c7, "destination");
        l0.p(lVar, "transform");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            c7.add(lVar.O(t1.d(u1.m(bArr, i7))));
        }
        return c7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final b2 N6(@n6.d long[] jArr, @n6.d Comparator<? super b2> comparator) {
        l0.p(jArr, "$this$maxWithOrNull");
        l0.p(comparator, "comparator");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            if (comparator.compare(b2.d(m7), b2.d(m8)) < 0) {
                m7 = m8;
            }
        }
        return b2.d(m7);
    }

    @h(name = "minOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final short N7(@n6.d short[] sArr) {
        l0.p(sArr, "$this$min");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            if (l0.t(m7 & h2.f17796n, 65535 & m8) > 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @e
    @q2(markerClass = {r.class})
    public static final h2 N8(@n6.d short[] sArr, @n6.d b5.f fVar) {
        l0.p(sArr, "$this$randomOrNull");
        l0.p(fVar, "random");
        if (i2.r(sArr)) {
            return null;
        }
        return h2.d(i2.m(sArr, fVar.m(i2.o(sArr))));
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R> List<R> N9(short[] sArr, R r6, p<? super R, ? super h2, ? extends R> pVar) {
        l0.p(sArr, "$this$runningFold");
        l0.p(pVar, "operation");
        if (i2.r(sArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(i2.o(sArr) + 1);
        arrayList.add(r6);
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, h2.d(i2.m(sArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> Na(@n6.d int[] iArr, @n6.d d5.l lVar) {
        l0.p(iArr, "$this$slice");
        l0.p(lVar, "indices");
        return lVar.isEmpty() ? w.E() : a4.b.a(y1.f(o.K1(iArr, lVar.b().intValue(), lVar.g().intValue() + 1)));
    }

    @g1(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    @t
    @f
    public static final int Nb(short[] sArr, l<? super h2, x1> lVar) {
        l0.p(sArr, "$this$sumBy");
        l0.p(lVar, "selector");
        int o6 = i2.o(sArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            i7 = x1.l(i7 + lVar.O(h2.d(i2.m(sArr, i8))).l0());
        }
        return i7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final h2[] Nc(@n6.d short[] sArr) {
        l0.p(sArr, "$this$toTypedArray");
        int o6 = i2.o(sArr);
        h2[] h2VarArr = new h2[o6];
        for (int i7 = 0; i7 < o6; i7++) {
            h2VarArr[i7] = h2.d(i2.m(sArr, i7));
        }
        return h2VarArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int O0(int[] iArr) {
        l0.p(iArr, "$this$component5");
        return y1.m(iArr, 4);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> O1(@n6.d byte[] bArr, int i7) {
        l0.p(bArr, "$this$drop");
        if (i7 >= 0) {
            return uc(bArr, u.u(u1.o(bArr) - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super b2>> C O2(long[] jArr, C c7, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$filterTo");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (lVar.O(b2.d(m7)).booleanValue()) {
                c7.add(b2.d(m7));
            }
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R O3(long[] jArr, R r6, p<? super b2, ? super R, ? extends R> pVar) {
        l0.p(jArr, "$this$foldRight");
        l0.p(pVar, "operation");
        for (int We = x3.p.We(jArr); We >= 0; We--) {
            r6 = pVar.J(b2.d(c2.m(jArr, We)), r6);
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K, M extends Map<? super K, List<b2>>> M O4(long[] jArr, M m7, l<? super b2, ? extends K> lVar) {
        l0.p(jArr, "$this$groupByTo");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m8 = c2.m(jArr, i7);
            K O = lVar.O(b2.d(m8));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(b2.d(m8));
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> t1 O5(byte[] bArr, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$maxByOrNull");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        int Re = x3.p.Re(bArr);
        if (Re == 0) {
            return t1.d(m7);
        }
        R O = lVar.O(t1.d(m7));
        s0 it = new d5.l(1, Re).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            R O2 = lVar.O(t1.d(m8));
            if (O.compareTo(O2) < 0) {
                m7 = m8;
                O = O2;
            }
        }
        return t1.d(m7);
    }

    @h(name = "maxWithOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final byte O6(@n6.d byte[] bArr, @n6.d Comparator<? super t1> comparator) {
        l0.p(bArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            if (comparator.compare(t1.d(m7), t1.d(m8)) < 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final t1 O7(@n6.d byte[] bArr, @n6.d Comparator<? super t1> comparator) {
        l0.p(bArr, "$this$minWithOrNull");
        l0.p(comparator, "comparator");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            if (comparator.compare(t1.d(m7), t1.d(m8)) > 0) {
                m7 = m8;
            }
        }
        return t1.d(m7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte O8(byte[] bArr, p<? super t1, ? super t1, t1> pVar) {
        l0.p(bArr, "$this$reduce");
        l0.p(pVar, "operation");
        if (u1.r(bArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            m7 = pVar.J(t1.d(m7), t1.d(u1.m(bArr, it.b()))).j0();
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R> List<R> O9(byte[] bArr, R r6, q<? super Integer, ? super R, ? super t1, ? extends R> qVar) {
        l0.p(bArr, "$this$runningFoldIndexed");
        l0.p(qVar, "operation");
        if (u1.r(bArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(u1.o(bArr) + 1);
        arrayList.add(r6);
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, t1.d(u1.m(bArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final int[] Oa(@n6.d int[] iArr, @n6.d Collection<Integer> collection) {
        l0.p(iArr, "$this$sliceArray");
        l0.p(collection, "indices");
        return y1.f(x3.p.Gu(iArr, collection));
    }

    @g1(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    @t
    @f
    public static final double Ob(byte[] bArr, l<? super t1, Double> lVar) {
        l0.p(bArr, "$this$sumByDouble");
        l0.p(lVar, "selector");
        int o6 = u1.o(bArr);
        double d7 = g.f1896q;
        for (int i7 = 0; i7 < o6; i7++) {
            d7 += lVar.O(t1.d(u1.m(bArr, i7))).doubleValue();
        }
        return d7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] Oc(byte[] bArr) {
        l0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return u1.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte P0(byte[] bArr) {
        l0.p(bArr, "$this$component5");
        return u1.m(bArr, 4);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> P1(@n6.d short[] sArr, int i7) {
        l0.p(sArr, "$this$drop");
        if (i7 >= 0) {
            return vc(sArr, u.u(i2.o(sArr) - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super h2>> C P2(short[] sArr, C c7, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$filterTo");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (lVar.O(h2.d(m7)).booleanValue()) {
                c7.add(h2.d(m7));
            }
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R P3(byte[] bArr, R r6, p<? super t1, ? super R, ? extends R> pVar) {
        l0.p(bArr, "$this$foldRight");
        l0.p(pVar, "operation");
        for (int Re = x3.p.Re(bArr); Re >= 0; Re--) {
            r6 = pVar.J(t1.d(u1.m(bArr, Re)), r6);
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <K, M extends Map<? super K, List<h2>>> M P4(short[] sArr, M m7, l<? super h2, ? extends K> lVar) {
        l0.p(sArr, "$this$groupByTo");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m8 = i2.m(sArr, i7);
            K O = lVar.O(h2.d(m8));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(h2.d(m8));
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> b2 P5(long[] jArr, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxByOrNull");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        int We = x3.p.We(jArr);
        if (We == 0) {
            return b2.d(m7);
        }
        R O = lVar.O(b2.d(m7));
        s0 it = new d5.l(1, We).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            R O2 = lVar.O(b2.d(m8));
            if (O.compareTo(O2) < 0) {
                m7 = m8;
                O = O2;
            }
        }
        return b2.d(m7);
    }

    @h(name = "maxWithOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final int P6(@n6.d int[] iArr, @n6.d Comparator<? super x1> comparator) {
        l0.p(iArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            if (comparator.compare(x1.d(m7), x1.d(m8)) < 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final x1 P7(@n6.d int[] iArr, @n6.d Comparator<? super x1> comparator) {
        l0.p(iArr, "$this$minWithOrNull");
        l0.p(comparator, "comparator");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            if (comparator.compare(x1.d(m7), x1.d(m8)) > 0) {
                m7 = m8;
            }
        }
        return x1.d(m7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int P8(int[] iArr, p<? super x1, ? super x1, x1> pVar) {
        l0.p(iArr, "$this$reduce");
        l0.p(pVar, "operation");
        if (y1.r(iArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            m7 = pVar.J(x1.d(m7), x1.d(y1.m(iArr, it.b()))).l0();
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R> List<R> P9(short[] sArr, R r6, q<? super Integer, ? super R, ? super h2, ? extends R> qVar) {
        l0.p(sArr, "$this$runningFoldIndexed");
        l0.p(qVar, "operation");
        if (i2.r(sArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(i2.o(sArr) + 1);
        arrayList.add(r6);
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, h2.d(i2.m(sArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final short[] Pa(@n6.d short[] sArr, @n6.d d5.l lVar) {
        l0.p(sArr, "$this$sliceArray");
        l0.p(lVar, "indices");
        return i2.f(x3.p.Lu(sArr, lVar));
    }

    @g1(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    @t
    @f
    public static final double Pb(long[] jArr, l<? super b2, Double> lVar) {
        l0.p(jArr, "$this$sumByDouble");
        l0.p(lVar, "selector");
        int o6 = c2.o(jArr);
        double d7 = g.f1896q;
        for (int i7 = 0; i7 < o6; i7++) {
            d7 += lVar.O(b2.d(c2.m(jArr, i7))).doubleValue();
        }
        return d7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final byte[] Pc(@n6.d t1[] t1VarArr) {
        l0.p(t1VarArr, "<this>");
        int length = t1VarArr.length;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr[i7] = t1VarArr[i7].j0();
        }
        return u1.f(bArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long Q0(long[] jArr) {
        l0.p(jArr, "$this$component5");
        return c2.m(jArr, 4);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> Q1(@n6.d int[] iArr, int i7) {
        l0.p(iArr, "$this$drop");
        if (i7 >= 0) {
            return wc(iArr, u.u(y1.o(iArr) - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super x1>> C Q2(int[] iArr, C c7, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$filterTo");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (lVar.O(x1.d(m7)).booleanValue()) {
                c7.add(x1.d(m7));
            }
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R Q3(int[] iArr, R r6, p<? super x1, ? super R, ? extends R> pVar) {
        l0.p(iArr, "$this$foldRight");
        l0.p(pVar, "operation");
        for (int Ve = x3.p.Ve(iArr); Ve >= 0; Ve--) {
            r6 = pVar.J(x1.d(y1.m(iArr, Ve)), r6);
        }
        return r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @t
    @f
    public static final <K, V, M extends Map<? super K, List<V>>> M Q4(short[] sArr, M m7, l<? super h2, ? extends K> lVar, l<? super h2, ? extends V> lVar2) {
        l0.p(sArr, "$this$groupByTo");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m8 = i2.m(sArr, i7);
            K O = lVar.O(h2.d(m8));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(h2.d(m8)));
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> x1 Q5(int[] iArr, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$maxByOrNull");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        int Ve = x3.p.Ve(iArr);
        if (Ve == 0) {
            return x1.d(m7);
        }
        R O = lVar.O(x1.d(m7));
        s0 it = new d5.l(1, Ve).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            R O2 = lVar.O(x1.d(m8));
            if (O.compareTo(O2) < 0) {
                m7 = m8;
                O = O2;
            }
        }
        return x1.d(m7);
    }

    @h(name = "maxWithOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final long Q6(@n6.d long[] jArr, @n6.d Comparator<? super b2> comparator) {
        l0.p(jArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            if (comparator.compare(b2.d(m7), b2.d(m8)) < 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final h2 Q7(@n6.d short[] sArr, @n6.d Comparator<? super h2> comparator) {
        l0.p(sArr, "$this$minWithOrNull");
        l0.p(comparator, "comparator");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            if (comparator.compare(h2.d(m7), h2.d(m8)) > 0) {
                m7 = m8;
            }
        }
        return h2.d(m7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long Q8(long[] jArr, p<? super b2, ? super b2, b2> pVar) {
        l0.p(jArr, "$this$reduce");
        l0.p(pVar, "operation");
        if (c2.r(jArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            m7 = pVar.J(b2.d(m7), b2.d(c2.m(jArr, it.b()))).l0();
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R> List<R> Q9(long[] jArr, R r6, q<? super Integer, ? super R, ? super b2, ? extends R> qVar) {
        l0.p(jArr, "$this$runningFoldIndexed");
        l0.p(qVar, "operation");
        if (c2.r(jArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(c2.o(jArr) + 1);
        arrayList.add(r6);
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, b2.d(c2.m(jArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final long[] Qa(@n6.d long[] jArr, @n6.d d5.l lVar) {
        l0.p(jArr, "$this$sliceArray");
        l0.p(lVar, "indices");
        return c2.f(x3.p.Hu(jArr, lVar));
    }

    @g1(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    @t
    @f
    public static final double Qb(int[] iArr, l<? super x1, Double> lVar) {
        l0.p(iArr, "$this$sumByDouble");
        l0.p(lVar, "selector");
        int o6 = y1.o(iArr);
        double d7 = g.f1896q;
        for (int i7 = 0; i7 < o6; i7++) {
            d7 += lVar.O(x1.d(y1.m(iArr, i7))).doubleValue();
        }
        return d7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] Qc(int[] iArr) {
        l0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return y1.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short R0(short[] sArr) {
        l0.p(sArr, "$this$component5");
        return i2.m(sArr, 4);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> R1(@n6.d long[] jArr, int i7) {
        l0.p(jArr, "$this$drop");
        if (i7 >= 0) {
            return xc(jArr, u.u(c2.o(jArr) - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <C extends Collection<? super t1>> C R2(byte[] bArr, C c7, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$filterTo");
        l0.p(c7, "destination");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (lVar.O(t1.d(m7)).booleanValue()) {
                c7.add(t1.d(m7));
            }
        }
        return c7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R R3(short[] sArr, R r6, p<? super h2, ? super R, ? extends R> pVar) {
        l0.p(sArr, "$this$foldRight");
        l0.p(pVar, "operation");
        for (int Ye = x3.p.Ye(sArr); Ye >= 0; Ye--) {
            r6 = pVar.J(h2.d(i2.m(sArr, Ye)), r6);
        }
        return r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @t
    @f
    public static final <K, V, M extends Map<? super K, List<V>>> M R4(byte[] bArr, M m7, l<? super t1, ? extends K> lVar, l<? super t1, ? extends V> lVar2) {
        l0.p(bArr, "$this$groupByTo");
        l0.p(m7, "destination");
        l0.p(lVar, "keySelector");
        l0.p(lVar2, "valueTransform");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m8 = u1.m(bArr, i7);
            K O = lVar.O(t1.d(m8));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(t1.d(m8)));
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> h2 R5(short[] sArr, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxByOrNull");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        int Ye = x3.p.Ye(sArr);
        if (Ye == 0) {
            return h2.d(m7);
        }
        R O = lVar.O(h2.d(m7));
        s0 it = new d5.l(1, Ye).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            R O2 = lVar.O(h2.d(m8));
            if (O.compareTo(O2) < 0) {
                m7 = m8;
                O = O2;
            }
        }
        return h2.d(m7);
    }

    @h(name = "maxWithOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final short R6(@n6.d short[] sArr, @n6.d Comparator<? super h2> comparator) {
        l0.p(sArr, "$this$maxWith");
        l0.p(comparator, "comparator");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            if (comparator.compare(h2.d(m7), h2.d(m8)) < 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @e
    @t
    public static final b2 R7(@n6.d long[] jArr, @n6.d Comparator<? super b2> comparator) {
        l0.p(jArr, "$this$minWithOrNull");
        l0.p(comparator, "comparator");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            if (comparator.compare(b2.d(m7), b2.d(m8)) > 0) {
                m7 = m8;
            }
        }
        return b2.d(m7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short R8(short[] sArr, p<? super h2, ? super h2, h2> pVar) {
        l0.p(sArr, "$this$reduce");
        l0.p(pVar, "operation");
        if (i2.r(sArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            m7 = pVar.J(h2.d(m7), h2.d(i2.m(sArr, it.b()))).j0();
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R> List<R> R9(int[] iArr, R r6, q<? super Integer, ? super R, ? super x1, ? extends R> qVar) {
        l0.p(iArr, "$this$runningFoldIndexed");
        l0.p(qVar, "operation");
        if (y1.r(iArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(y1.o(iArr) + 1);
        arrayList.add(r6);
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, x1.d(y1.m(iArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final byte[] Ra(@n6.d byte[] bArr, @n6.d d5.l lVar) {
        l0.p(bArr, "$this$sliceArray");
        l0.p(lVar, "indices");
        return u1.f(x3.p.xu(bArr, lVar));
    }

    @g1(version = "1.3")
    @k(message = "Use sumOf instead.", replaceWith = @b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    @t
    @f
    public static final double Rb(short[] sArr, l<? super h2, Double> lVar) {
        l0.p(sArr, "$this$sumByDouble");
        l0.p(lVar, "selector");
        int o6 = i2.o(sArr);
        double d7 = g.f1896q;
        for (int i7 = 0; i7 < o6; i7++) {
            d7 += lVar.O(h2.d(i2.m(sArr, i7))).doubleValue();
        }
        return d7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final int[] Rc(@n6.d x1[] x1VarArr) {
        l0.p(x1VarArr, "<this>");
        int length = x1VarArr.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = x1VarArr[i7].l0();
        }
        return y1.f(iArr);
    }

    @g1(version = "1.4")
    @t
    public static final boolean S0(@e short[] sArr, @e short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> S1(@n6.d byte[] bArr, int i7) {
        l0.p(bArr, "$this$dropLast");
        if (i7 >= 0) {
            return qc(bArr, u.u(u1.o(bArr) - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @g1(version = "1.3")
    @t
    @f
    public static final t1 S2(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$find");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (lVar.O(t1.d(m7)).booleanValue()) {
                return t1.d(m7);
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R S3(byte[] bArr, R r6, q<? super Integer, ? super t1, ? super R, ? extends R> qVar) {
        l0.p(bArr, "$this$foldRightIndexed");
        l0.p(qVar, "operation");
        for (int Re = x3.p.Re(bArr); Re >= 0; Re--) {
            r6 = qVar.I(Integer.valueOf(Re), t1.d(u1.m(bArr, Re)), r6);
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int S4(long[] jArr, long j7) {
        l0.p(jArr, "$this$indexOf");
        return x3.p.ig(jArr, j7);
    }

    @h(name = "maxByOrThrow-U")
    @g1(version = "1.7")
    @t
    @f
    public static final <R extends Comparable<? super R>> byte S5(byte[] bArr, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        byte m7 = u1.m(bArr, 0);
        int Re = x3.p.Re(bArr);
        if (Re == 0) {
            return m7;
        }
        R O = lVar.O(t1.d(m7));
        s0 it = new d5.l(1, Re).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            R O2 = lVar.O(t1.d(m8));
            if (O.compareTo(O2) < 0) {
                m7 = m8;
                O = O2;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> t1 S6(byte[] bArr, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$minByOrNull");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        int Re = x3.p.Re(bArr);
        if (Re == 0) {
            return t1.d(m7);
        }
        R O = lVar.O(t1.d(m7));
        s0 it = new d5.l(1, Re).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            R O2 = lVar.O(t1.d(m8));
            if (O.compareTo(O2) > 0) {
                m7 = m8;
                O = O2;
            }
        }
        return t1.d(m7);
    }

    @h(name = "minWithOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final byte S7(@n6.d byte[] bArr, @n6.d Comparator<? super t1> comparator) {
        l0.p(bArr, "$this$minWith");
        l0.p(comparator, "comparator");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            if (comparator.compare(t1.d(m7), t1.d(m8)) > 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int S8(int[] iArr, q<? super Integer, ? super x1, ? super x1, x1> qVar) {
        l0.p(iArr, "$this$reduceIndexed");
        l0.p(qVar, "operation");
        if (y1.r(iArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            m7 = qVar.I(Integer.valueOf(b7), x1.d(m7), x1.d(y1.m(iArr, b7))).l0();
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final List<t1> S9(byte[] bArr, p<? super t1, ? super t1, t1> pVar) {
        l0.p(bArr, "$this$runningReduce");
        l0.p(pVar, "operation");
        if (u1.r(bArr)) {
            return w.E();
        }
        byte m7 = u1.m(bArr, 0);
        ArrayList arrayList = new ArrayList(u1.o(bArr));
        arrayList.add(t1.d(m7));
        int o6 = u1.o(bArr);
        for (int i7 = 1; i7 < o6; i7++) {
            m7 = pVar.J(t1.d(m7), t1.d(u1.m(bArr, i7))).j0();
            arrayList.add(t1.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final long[] Sa(@n6.d long[] jArr, @n6.d Collection<Integer> collection) {
        l0.p(jArr, "$this$sliceArray");
        l0.p(collection, "indices");
        return c2.f(x3.p.Iu(jArr, collection));
    }

    @h(name = "sumOfDouble")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double Sb(byte[] bArr, l<? super t1, Double> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = u1.o(bArr);
        double d7 = g.f1896q;
        for (int i7 = 0; i7 < o6; i7++) {
            d7 += lVar.O(t1.d(u1.m(bArr, i7))).doubleValue();
        }
        return d7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] Sc(long[] jArr) {
        l0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return c2.f(copyOf);
    }

    @g1(version = "1.4")
    @t
    public static final boolean T0(@e int[] iArr, @e int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> T1(@n6.d short[] sArr, int i7) {
        l0.p(sArr, "$this$dropLast");
        if (i7 >= 0) {
            return rc(sArr, u.u(i2.o(sArr) - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @g1(version = "1.3")
    @t
    @f
    public static final b2 T2(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$find");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (lVar.O(b2.d(m7)).booleanValue()) {
                return b2.d(m7);
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R T3(short[] sArr, R r6, q<? super Integer, ? super h2, ? super R, ? extends R> qVar) {
        l0.p(sArr, "$this$foldRightIndexed");
        l0.p(qVar, "operation");
        for (int Ye = x3.p.Ye(sArr); Ye >= 0; Ye--) {
            r6 = qVar.I(Integer.valueOf(Ye), h2.d(i2.m(sArr, Ye)), r6);
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int T4(short[] sArr, short s6) {
        l0.p(sArr, "$this$indexOf");
        return x3.p.kg(sArr, s6);
    }

    @h(name = "maxByOrThrow-U")
    @g1(version = "1.7")
    @t
    @f
    public static final <R extends Comparable<? super R>> int T5(int[] iArr, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        int m7 = y1.m(iArr, 0);
        int Ve = x3.p.Ve(iArr);
        if (Ve == 0) {
            return m7;
        }
        R O = lVar.O(x1.d(m7));
        s0 it = new d5.l(1, Ve).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            R O2 = lVar.O(x1.d(m8));
            if (O.compareTo(O2) < 0) {
                m7 = m8;
                O = O2;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> b2 T6(long[] jArr, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$minByOrNull");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        int We = x3.p.We(jArr);
        if (We == 0) {
            return b2.d(m7);
        }
        R O = lVar.O(b2.d(m7));
        s0 it = new d5.l(1, We).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            R O2 = lVar.O(b2.d(m8));
            if (O.compareTo(O2) > 0) {
                m7 = m8;
                O = O2;
            }
        }
        return b2.d(m7);
    }

    @h(name = "minWithOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final int T7(@n6.d int[] iArr, @n6.d Comparator<? super x1> comparator) {
        l0.p(iArr, "$this$minWith");
        l0.p(comparator, "comparator");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            if (comparator.compare(x1.d(m7), x1.d(m8)) > 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte T8(byte[] bArr, q<? super Integer, ? super t1, ? super t1, t1> qVar) {
        l0.p(bArr, "$this$reduceIndexed");
        l0.p(qVar, "operation");
        if (u1.r(bArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            m7 = qVar.I(Integer.valueOf(b7), t1.d(m7), t1.d(u1.m(bArr, b7))).j0();
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final List<x1> T9(int[] iArr, p<? super x1, ? super x1, x1> pVar) {
        l0.p(iArr, "$this$runningReduce");
        l0.p(pVar, "operation");
        if (y1.r(iArr)) {
            return w.E();
        }
        int m7 = y1.m(iArr, 0);
        ArrayList arrayList = new ArrayList(y1.o(iArr));
        arrayList.add(x1.d(m7));
        int o6 = y1.o(iArr);
        for (int i7 = 1; i7 < o6; i7++) {
            m7 = pVar.J(x1.d(m7), x1.d(y1.m(iArr, i7))).l0();
            arrayList.add(x1.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final short[] Ta(@n6.d short[] sArr, @n6.d Collection<Integer> collection) {
        l0.p(sArr, "$this$sliceArray");
        l0.p(collection, "indices");
        return i2.f(x3.p.Mu(sArr, collection));
    }

    @h(name = "sumOfDouble")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double Tb(int[] iArr, l<? super x1, Double> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = y1.o(iArr);
        double d7 = g.f1896q;
        for (int i7 = 0; i7 < o6; i7++) {
            d7 += lVar.O(x1.d(y1.m(iArr, i7))).doubleValue();
        }
        return d7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final long[] Tc(@n6.d b2[] b2VarArr) {
        l0.p(b2VarArr, "<this>");
        int length = b2VarArr.length;
        long[] jArr = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            jArr[i7] = b2VarArr[i7].l0();
        }
        return c2.f(jArr);
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ boolean U0(int[] iArr, int[] iArr2) {
        l0.p(iArr, "$this$contentEquals");
        l0.p(iArr2, "other");
        return T0(iArr, iArr2);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> U1(@n6.d int[] iArr, int i7) {
        l0.p(iArr, "$this$dropLast");
        if (i7 >= 0) {
            return sc(iArr, u.u(y1.o(iArr) - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @g1(version = "1.3")
    @t
    @f
    public static final x1 U2(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$find");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (lVar.O(x1.d(m7)).booleanValue()) {
                return x1.d(m7);
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R U3(long[] jArr, R r6, q<? super Integer, ? super b2, ? super R, ? extends R> qVar) {
        l0.p(jArr, "$this$foldRightIndexed");
        l0.p(qVar, "operation");
        for (int We = x3.p.We(jArr); We >= 0; We--) {
            r6 = qVar.I(Integer.valueOf(We), b2.d(c2.m(jArr, We)), r6);
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int U4(byte[] bArr, byte b7) {
        l0.p(bArr, "$this$indexOf");
        return x3.p.dg(bArr, b7);
    }

    @h(name = "maxByOrThrow-U")
    @g1(version = "1.7")
    @t
    @f
    public static final <R extends Comparable<? super R>> long U5(long[] jArr, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        long m7 = c2.m(jArr, 0);
        int We = x3.p.We(jArr);
        if (We == 0) {
            return m7;
        }
        R O = lVar.O(b2.d(m7));
        s0 it = new d5.l(1, We).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            R O2 = lVar.O(b2.d(m8));
            if (O.compareTo(O2) < 0) {
                m7 = m8;
                O = O2;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> x1 U6(int[] iArr, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$minByOrNull");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        int Ve = x3.p.Ve(iArr);
        if (Ve == 0) {
            return x1.d(m7);
        }
        R O = lVar.O(x1.d(m7));
        s0 it = new d5.l(1, Ve).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            R O2 = lVar.O(x1.d(m8));
            if (O.compareTo(O2) > 0) {
                m7 = m8;
                O = O2;
            }
        }
        return x1.d(m7);
    }

    @h(name = "minWithOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final long U7(@n6.d long[] jArr, @n6.d Comparator<? super b2> comparator) {
        l0.p(jArr, "$this$minWith");
        l0.p(comparator, "comparator");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            if (comparator.compare(b2.d(m7), b2.d(m8)) > 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short U8(short[] sArr, q<? super Integer, ? super h2, ? super h2, h2> qVar) {
        l0.p(sArr, "$this$reduceIndexed");
        l0.p(qVar, "operation");
        if (i2.r(sArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            m7 = qVar.I(Integer.valueOf(b7), h2.d(m7), h2.d(i2.m(sArr, b7))).j0();
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final List<b2> U9(long[] jArr, p<? super b2, ? super b2, b2> pVar) {
        l0.p(jArr, "$this$runningReduce");
        l0.p(pVar, "operation");
        if (c2.r(jArr)) {
            return w.E();
        }
        long m7 = c2.m(jArr, 0);
        ArrayList arrayList = new ArrayList(c2.o(jArr));
        arrayList.add(b2.d(m7));
        int o6 = c2.o(jArr);
        for (int i7 = 1; i7 < o6; i7++) {
            m7 = pVar.J(b2.d(m7), b2.d(c2.m(jArr, i7))).l0();
            arrayList.add(b2.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final int[] Ua(@n6.d int[] iArr, @n6.d d5.l lVar) {
        l0.p(iArr, "$this$sliceArray");
        l0.p(lVar, "indices");
        return y1.f(x3.p.Fu(iArr, lVar));
    }

    @h(name = "sumOfDouble")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double Ub(long[] jArr, l<? super b2, Double> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = c2.o(jArr);
        double d7 = g.f1896q;
        for (int i7 = 0; i7 < o6; i7++) {
            d7 += lVar.O(b2.d(c2.m(jArr, i7))).doubleValue();
        }
        return d7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final short[] Uc(@n6.d h2[] h2VarArr) {
        l0.p(h2VarArr, "<this>");
        int length = h2VarArr.length;
        short[] sArr = new short[length];
        for (int i7 = 0; i7 < length; i7++) {
            sArr[i7] = h2VarArr[i7].j0();
        }
        return i2.f(sArr);
    }

    @g1(version = "1.4")
    @t
    public static final boolean V0(@e byte[] bArr, @e byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> V1(@n6.d long[] jArr, int i7) {
        l0.p(jArr, "$this$dropLast");
        if (i7 >= 0) {
            return tc(jArr, u.u(c2.o(jArr) - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @g1(version = "1.3")
    @t
    @f
    public static final h2 V2(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$find");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (lVar.O(h2.d(m7)).booleanValue()) {
                return h2.d(m7);
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> R V3(int[] iArr, R r6, q<? super Integer, ? super x1, ? super R, ? extends R> qVar) {
        l0.p(iArr, "$this$foldRightIndexed");
        l0.p(qVar, "operation");
        for (int Ve = x3.p.Ve(iArr); Ve >= 0; Ve--) {
            r6 = qVar.I(Integer.valueOf(Ve), x1.d(y1.m(iArr, Ve)), r6);
        }
        return r6;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int V4(int[] iArr, int i7) {
        l0.p(iArr, "$this$indexOf");
        return x3.p.hg(iArr, i7);
    }

    @h(name = "maxByOrThrow-U")
    @g1(version = "1.7")
    @t
    @f
    public static final <R extends Comparable<? super R>> short V5(short[] sArr, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxBy");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        short m7 = i2.m(sArr, 0);
        int Ye = x3.p.Ye(sArr);
        if (Ye == 0) {
            return m7;
        }
        R O = lVar.O(h2.d(m7));
        s0 it = new d5.l(1, Ye).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            R O2 = lVar.O(h2.d(m8));
            if (O.compareTo(O2) < 0) {
                m7 = m8;
                O = O2;
            }
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <R extends Comparable<? super R>> h2 V6(short[] sArr, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$minByOrNull");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        int Ye = x3.p.Ye(sArr);
        if (Ye == 0) {
            return h2.d(m7);
        }
        R O = lVar.O(h2.d(m7));
        s0 it = new d5.l(1, Ye).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            R O2 = lVar.O(h2.d(m8));
            if (O.compareTo(O2) > 0) {
                m7 = m8;
                O = O2;
            }
        }
        return h2.d(m7);
    }

    @h(name = "minWithOrThrow-U")
    @g1(version = "1.7")
    @t
    public static final short V7(@n6.d short[] sArr, @n6.d Comparator<? super h2> comparator) {
        l0.p(sArr, "$this$minWith");
        l0.p(comparator, "comparator");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            if (comparator.compare(h2.d(m7), h2.d(m8)) > 0) {
                m7 = m8;
            }
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long V8(long[] jArr, q<? super Integer, ? super b2, ? super b2, b2> qVar) {
        l0.p(jArr, "$this$reduceIndexed");
        l0.p(qVar, "operation");
        if (c2.r(jArr)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            m7 = qVar.I(Integer.valueOf(b7), b2.d(m7), b2.d(c2.m(jArr, b7))).l0();
        }
        return m7;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final List<h2> V9(short[] sArr, p<? super h2, ? super h2, h2> pVar) {
        l0.p(sArr, "$this$runningReduce");
        l0.p(pVar, "operation");
        if (i2.r(sArr)) {
            return w.E();
        }
        short m7 = i2.m(sArr, 0);
        ArrayList arrayList = new ArrayList(i2.o(sArr));
        arrayList.add(h2.d(m7));
        int o6 = i2.o(sArr);
        for (int i7 = 1; i7 < o6; i7++) {
            m7 = pVar.J(h2.d(m7), h2.d(i2.m(sArr, i7))).j0();
            arrayList.add(h2.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final byte[] Va(@n6.d byte[] bArr, @n6.d Collection<Integer> collection) {
        l0.p(bArr, "$this$sliceArray");
        l0.p(collection, "indices");
        return u1.f(x3.p.yu(bArr, collection));
    }

    @h(name = "sumOfDouble")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double Vb(short[] sArr, l<? super h2, Double> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = i2.o(sArr);
        double d7 = g.f1896q;
        for (int i7 = 0; i7 < o6; i7++) {
            d7 += lVar.O(h2.d(i2.m(sArr, i7))).doubleValue();
        }
        return d7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] Vc(short[] sArr) {
        l0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return i2.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean W(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$all");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (!lVar.O(t1.d(u1.m(bArr, i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ boolean W0(byte[] bArr, byte[] bArr2) {
        l0.p(bArr, "$this$contentEquals");
        l0.p(bArr2, "other");
        return V0(bArr, bArr2);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<t1> W1(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$dropLastWhile");
        l0.p(lVar, "predicate");
        for (int Re = x3.p.Re(bArr); -1 < Re; Re--) {
            if (!lVar.O(t1.d(u1.m(bArr, Re))).booleanValue()) {
                return qc(bArr, Re + 1);
            }
        }
        return w.E();
    }

    @g1(version = "1.3")
    @t
    @f
    public static final t1 W2(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$findLast");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr) - 1;
        if (o6 >= 0) {
            while (true) {
                int i7 = o6 - 1;
                byte m7 = u1.m(bArr, o6);
                if (lVar.O(t1.d(m7)).booleanValue()) {
                    return t1.d(m7);
                }
                if (i7 < 0) {
                    break;
                }
                o6 = i7;
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void W3(byte[] bArr, l<? super t1, m2> lVar) {
        l0.p(bArr, "$this$forEach");
        l0.p(lVar, s2.t0.f16450f);
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            lVar.O(t1.d(u1.m(bArr, i7)));
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int W4(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$indexOfFirst");
        l0.p(lVar, "predicate");
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(t1.d(t1.l(bArr[i7]))).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double W5(byte[] bArr, l<? super t1, Double> lVar) {
        l0.p(bArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(t1.d(u1.m(bArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(t1.d(u1.m(bArr, it.b()))).doubleValue());
        }
        return doubleValue;
    }

    @h(name = "minByOrThrow-U")
    @g1(version = "1.7")
    @t
    @f
    public static final <R extends Comparable<? super R>> byte W6(byte[] bArr, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        byte m7 = u1.m(bArr, 0);
        int Re = x3.p.Re(bArr);
        if (Re == 0) {
            return m7;
        }
        R O = lVar.O(t1.d(m7));
        s0 it = new d5.l(1, Re).iterator();
        while (it.hasNext()) {
            byte m8 = u1.m(bArr, it.b());
            R O2 = lVar.O(t1.d(m8));
            if (O.compareTo(O2) > 0) {
                m7 = m8;
                O = O2;
            }
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean W7(int[] iArr) {
        l0.p(iArr, "$this$none");
        return y1.r(iArr);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final x1 W8(int[] iArr, q<? super Integer, ? super x1, ? super x1, x1> qVar) {
        l0.p(iArr, "$this$reduceIndexedOrNull");
        l0.p(qVar, "operation");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            m7 = qVar.I(Integer.valueOf(b7), x1.d(m7), x1.d(y1.m(iArr, b7))).l0();
        }
        return x1.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final List<x1> W9(int[] iArr, q<? super Integer, ? super x1, ? super x1, x1> qVar) {
        l0.p(iArr, "$this$runningReduceIndexed");
        l0.p(qVar, "operation");
        if (y1.r(iArr)) {
            return w.E();
        }
        int m7 = y1.m(iArr, 0);
        ArrayList arrayList = new ArrayList(y1.o(iArr));
        arrayList.add(x1.d(m7));
        int o6 = y1.o(iArr);
        for (int i7 = 1; i7 < o6; i7++) {
            m7 = qVar.I(Integer.valueOf(i7), x1.d(m7), x1.d(y1.m(iArr, i7))).l0();
            arrayList.add(x1.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    public static final void Wa(@n6.d int[] iArr) {
        l0.p(iArr, "$this$sort");
        if (y1.o(iArr) > 1) {
            x3.r1.l(iArr, 0, y1.o(iArr));
        }
    }

    @h(name = "sumOfInt")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final int Wb(byte[] bArr, l<? super t1, Integer> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = u1.o(bArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            i7 += lVar.O(t1.d(u1.m(bArr, i8))).intValue();
        }
        return i7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final Iterable<p0<x1>> Wc(@n6.d int[] iArr) {
        l0.p(iArr, "$this$withIndex");
        return new q0(new a(iArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean X(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$all");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (!lVar.O(b2.d(c2.m(jArr, i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @g1(version = "1.4")
    @t
    public static final boolean X0(@e long[] jArr, @e long[] jArr2) {
        if (jArr == null) {
            jArr = null;
        }
        if (jArr2 == null) {
            jArr2 = null;
        }
        return Arrays.equals(jArr, jArr2);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<b2> X1(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$dropLastWhile");
        l0.p(lVar, "predicate");
        for (int We = x3.p.We(jArr); -1 < We; We--) {
            if (!lVar.O(b2.d(c2.m(jArr, We))).booleanValue()) {
                return tc(jArr, We + 1);
            }
        }
        return w.E();
    }

    @g1(version = "1.3")
    @t
    @f
    public static final b2 X2(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$findLast");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr) - 1;
        if (o6 >= 0) {
            while (true) {
                int i7 = o6 - 1;
                long m7 = c2.m(jArr, o6);
                if (lVar.O(b2.d(m7)).booleanValue()) {
                    return b2.d(m7);
                }
                if (i7 < 0) {
                    break;
                }
                o6 = i7;
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void X3(long[] jArr, l<? super b2, m2> lVar) {
        l0.p(jArr, "$this$forEach");
        l0.p(lVar, s2.t0.f16450f);
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            lVar.O(b2.d(c2.m(jArr, i7)));
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int X4(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$indexOfFirst");
        l0.p(lVar, "predicate");
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(b2.d(b2.l(jArr[i7]))).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final float X5(byte[] bArr, l<? super t1, Float> lVar) {
        l0.p(bArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(t1.d(u1.m(bArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(t1.d(u1.m(bArr, it.b()))).floatValue());
        }
        return floatValue;
    }

    @h(name = "minByOrThrow-U")
    @g1(version = "1.7")
    @t
    @f
    public static final <R extends Comparable<? super R>> int X6(int[] iArr, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        int m7 = y1.m(iArr, 0);
        int Ve = x3.p.Ve(iArr);
        if (Ve == 0) {
            return m7;
        }
        R O = lVar.O(x1.d(m7));
        s0 it = new d5.l(1, Ve).iterator();
        while (it.hasNext()) {
            int m8 = y1.m(iArr, it.b());
            R O2 = lVar.O(x1.d(m8));
            if (O.compareTo(O2) > 0) {
                m7 = m8;
                O = O2;
            }
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean X7(byte[] bArr) {
        l0.p(bArr, "$this$none");
        return u1.r(bArr);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final t1 X8(byte[] bArr, q<? super Integer, ? super t1, ? super t1, t1> qVar) {
        l0.p(bArr, "$this$reduceIndexedOrNull");
        l0.p(qVar, "operation");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            m7 = qVar.I(Integer.valueOf(b7), t1.d(m7), t1.d(u1.m(bArr, b7))).j0();
        }
        return t1.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final List<t1> X9(byte[] bArr, q<? super Integer, ? super t1, ? super t1, t1> qVar) {
        l0.p(bArr, "$this$runningReduceIndexed");
        l0.p(qVar, "operation");
        if (u1.r(bArr)) {
            return w.E();
        }
        byte m7 = u1.m(bArr, 0);
        ArrayList arrayList = new ArrayList(u1.o(bArr));
        arrayList.add(t1.d(m7));
        int o6 = u1.o(bArr);
        for (int i7 = 1; i7 < o6; i7++) {
            m7 = qVar.I(Integer.valueOf(i7), t1.d(m7), t1.d(u1.m(bArr, i7))).j0();
            arrayList.add(t1.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    public static final void Xa(@n6.d long[] jArr, int i7, int i8) {
        l0.p(jArr, "$this$sort");
        x3.c.f18278k.d(i7, i8, c2.o(jArr));
        x3.r1.i(jArr, i7, i8);
    }

    @h(name = "sumOfInt")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final int Xb(int[] iArr, l<? super x1, Integer> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = y1.o(iArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            i7 += lVar.O(x1.d(y1.m(iArr, i8))).intValue();
        }
        return i7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final Iterable<p0<t1>> Xc(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$withIndex");
        return new q0(new C0009c(bArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean Y(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$all");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (!lVar.O(x1.d(y1.m(iArr, i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ boolean Y0(short[] sArr, short[] sArr2) {
        l0.p(sArr, "$this$contentEquals");
        l0.p(sArr2, "other");
        return S0(sArr, sArr2);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<x1> Y1(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$dropLastWhile");
        l0.p(lVar, "predicate");
        for (int Ve = x3.p.Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.O(x1.d(y1.m(iArr, Ve))).booleanValue()) {
                return sc(iArr, Ve + 1);
            }
        }
        return w.E();
    }

    @g1(version = "1.3")
    @t
    @f
    public static final x1 Y2(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$findLast");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr) - 1;
        if (o6 >= 0) {
            while (true) {
                int i7 = o6 - 1;
                int m7 = y1.m(iArr, o6);
                if (lVar.O(x1.d(m7)).booleanValue()) {
                    return x1.d(m7);
                }
                if (i7 < 0) {
                    break;
                }
                o6 = i7;
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void Y3(int[] iArr, l<? super x1, m2> lVar) {
        l0.p(iArr, "$this$forEach");
        l0.p(lVar, s2.t0.f16450f);
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            lVar.O(x1.d(y1.m(iArr, i7)));
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int Y4(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$indexOfFirst");
        l0.p(lVar, "predicate");
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(x1.d(x1.l(iArr[i7]))).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R Y5(byte[] bArr, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(t1.d(u1.m(bArr, 0)));
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(t1.d(u1.m(bArr, it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @h(name = "minByOrThrow-U")
    @g1(version = "1.7")
    @t
    @f
    public static final <R extends Comparable<? super R>> long Y6(long[] jArr, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        long m7 = c2.m(jArr, 0);
        int We = x3.p.We(jArr);
        if (We == 0) {
            return m7;
        }
        R O = lVar.O(b2.d(m7));
        s0 it = new d5.l(1, We).iterator();
        while (it.hasNext()) {
            long m8 = c2.m(jArr, it.b());
            R O2 = lVar.O(b2.d(m8));
            if (O.compareTo(O2) > 0) {
                m7 = m8;
                O = O2;
            }
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean Y7(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$none");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (lVar.O(t1.d(u1.m(bArr, i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final h2 Y8(short[] sArr, q<? super Integer, ? super h2, ? super h2, h2> qVar) {
        l0.p(sArr, "$this$reduceIndexedOrNull");
        l0.p(qVar, "operation");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            m7 = qVar.I(Integer.valueOf(b7), h2.d(m7), h2.d(i2.m(sArr, b7))).j0();
        }
        return h2.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final List<h2> Y9(short[] sArr, q<? super Integer, ? super h2, ? super h2, h2> qVar) {
        l0.p(sArr, "$this$runningReduceIndexed");
        l0.p(qVar, "operation");
        if (i2.r(sArr)) {
            return w.E();
        }
        short m7 = i2.m(sArr, 0);
        ArrayList arrayList = new ArrayList(i2.o(sArr));
        arrayList.add(h2.d(m7));
        int o6 = i2.o(sArr);
        for (int i7 = 1; i7 < o6; i7++) {
            m7 = qVar.I(Integer.valueOf(i7), h2.d(m7), h2.d(i2.m(sArr, i7))).j0();
            arrayList.add(h2.d(m7));
        }
        return arrayList;
    }

    public static /* synthetic */ void Ya(long[] jArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = c2.o(jArr);
        }
        Xa(jArr, i7, i8);
    }

    @h(name = "sumOfInt")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final int Yb(long[] jArr, l<? super b2, Integer> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = c2.o(jArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            i7 += lVar.O(b2.d(c2.m(jArr, i8))).intValue();
        }
        return i7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final Iterable<p0<b2>> Yc(@n6.d long[] jArr) {
        l0.p(jArr, "$this$withIndex");
        return new q0(new b(jArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean Z(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$all");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (!lVar.O(h2.d(i2.m(sArr, i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ boolean Z0(long[] jArr, long[] jArr2) {
        l0.p(jArr, "$this$contentEquals");
        l0.p(jArr2, "other");
        return X0(jArr, jArr2);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<h2> Z1(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$dropLastWhile");
        l0.p(lVar, "predicate");
        for (int Ye = x3.p.Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.O(h2.d(i2.m(sArr, Ye))).booleanValue()) {
                return rc(sArr, Ye + 1);
            }
        }
        return w.E();
    }

    @g1(version = "1.3")
    @t
    @f
    public static final h2 Z2(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$findLast");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr) - 1;
        if (o6 >= 0) {
            while (true) {
                int i7 = o6 - 1;
                short m7 = i2.m(sArr, o6);
                if (lVar.O(h2.d(m7)).booleanValue()) {
                    return h2.d(m7);
                }
                if (i7 < 0) {
                    break;
                }
                o6 = i7;
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void Z3(short[] sArr, l<? super h2, m2> lVar) {
        l0.p(sArr, "$this$forEach");
        l0.p(lVar, s2.t0.f16450f);
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            lVar.O(h2.d(i2.m(sArr, i7)));
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int Z4(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$indexOfFirst");
        l0.p(lVar, "predicate");
        int length = sArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(h2.d(h2.l(sArr[i7]))).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double Z5(long[] jArr, l<? super b2, Double> lVar) {
        l0.p(jArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(b2.d(c2.m(jArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(b2.d(c2.m(jArr, it.b()))).doubleValue());
        }
        return doubleValue;
    }

    @h(name = "minByOrThrow-U")
    @g1(version = "1.7")
    @t
    @f
    public static final <R extends Comparable<? super R>> short Z6(short[] sArr, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$minBy");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        short m7 = i2.m(sArr, 0);
        int Ye = x3.p.Ye(sArr);
        if (Ye == 0) {
            return m7;
        }
        R O = lVar.O(h2.d(m7));
        s0 it = new d5.l(1, Ye).iterator();
        while (it.hasNext()) {
            short m8 = i2.m(sArr, it.b());
            R O2 = lVar.O(h2.d(m8));
            if (O.compareTo(O2) > 0) {
                m7 = m8;
                O = O2;
            }
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean Z7(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$none");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (lVar.O(b2.d(c2.m(jArr, i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final b2 Z8(long[] jArr, q<? super Integer, ? super b2, ? super b2, b2> qVar) {
        l0.p(jArr, "$this$reduceIndexedOrNull");
        l0.p(qVar, "operation");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            m7 = qVar.I(Integer.valueOf(b7), b2.d(m7), b2.d(c2.m(jArr, b7))).l0();
        }
        return b2.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final List<b2> Z9(long[] jArr, q<? super Integer, ? super b2, ? super b2, b2> qVar) {
        l0.p(jArr, "$this$runningReduceIndexed");
        l0.p(qVar, "operation");
        if (c2.r(jArr)) {
            return w.E();
        }
        long m7 = c2.m(jArr, 0);
        ArrayList arrayList = new ArrayList(c2.o(jArr));
        arrayList.add(b2.d(m7));
        int o6 = c2.o(jArr);
        for (int i7 = 1; i7 < o6; i7++) {
            m7 = qVar.I(Integer.valueOf(i7), b2.d(m7), b2.d(c2.m(jArr, i7))).l0();
            arrayList.add(b2.d(m7));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    public static final void Za(@n6.d byte[] bArr, int i7, int i8) {
        l0.p(bArr, "$this$sort");
        x3.c.f18278k.d(i7, i8, u1.o(bArr));
        x3.r1.j(bArr, i7, i8);
    }

    @h(name = "sumOfInt")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final int Zb(short[] sArr, l<? super h2, Integer> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = i2.o(sArr);
        int i7 = 0;
        for (int i8 = 0; i8 < o6; i8++) {
            i7 += lVar.O(h2.d(i2.m(sArr, i8))).intValue();
        }
        return i7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final Iterable<p0<h2>> Zc(@n6.d short[] sArr) {
        l0.p(sArr, "$this$withIndex");
        return new q0(new d(sArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean a0(int[] iArr) {
        l0.p(iArr, "$this$any");
        return x3.p.M5(iArr);
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ int a1(int[] iArr) {
        l0.p(iArr, "$this$contentHashCode");
        return e1(iArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<t1> a2(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$dropWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = u1.o(bArr);
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (z6) {
                arrayList.add(t1.d(m7));
            } else if (!lVar.O(t1.d(m7)).booleanValue()) {
                arrayList.add(t1.d(m7));
                z6 = true;
            }
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int a3(int[] iArr) {
        l0.p(iArr, "$this$first");
        return x1.l(x3.p.oc(iArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void a4(byte[] bArr, p<? super Integer, ? super t1, m2> pVar) {
        l0.p(bArr, "$this$forEachIndexed");
        l0.p(pVar, s2.t0.f16450f);
        int o6 = u1.o(bArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            pVar.J(Integer.valueOf(i8), t1.d(u1.m(bArr, i7)));
            i7++;
            i8++;
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int a5(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$indexOfLast");
        l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i7 = length - 1;
            if (lVar.O(t1.d(t1.l(bArr[length]))).booleanValue()) {
                return length;
            }
            if (i7 < 0) {
                return -1;
            }
            length = i7;
        }
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final float a6(long[] jArr, l<? super b2, Float> lVar) {
        l0.p(jArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(b2.d(c2.m(jArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(b2.d(c2.m(jArr, it.b()))).floatValue());
        }
        return floatValue;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double a7(byte[] bArr, l<? super t1, Double> lVar) {
        l0.p(bArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(t1.d(u1.m(bArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(t1.d(u1.m(bArr, it.b()))).doubleValue());
        }
        return doubleValue;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean a8(long[] jArr) {
        l0.p(jArr, "$this$none");
        return c2.r(jArr);
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final t1 a9(byte[] bArr, p<? super t1, ? super t1, t1> pVar) {
        l0.p(bArr, "$this$reduceOrNull");
        l0.p(pVar, "operation");
        if (u1.r(bArr)) {
            return null;
        }
        byte m7 = u1.m(bArr, 0);
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            m7 = pVar.J(t1.d(m7), t1.d(u1.m(bArr, it.b()))).j0();
        }
        return t1.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final <R> List<R> aa(long[] jArr, R r6, p<? super R, ? super b2, ? extends R> pVar) {
        l0.p(jArr, "$this$scan");
        l0.p(pVar, "operation");
        if (c2.r(jArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(c2.o(jArr) + 1);
        arrayList.add(r6);
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, b2.d(c2.m(jArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    public static /* synthetic */ void ab(byte[] bArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = u1.o(bArr);
        }
        Za(bArr, i7, i8);
    }

    @h(name = "sumOfLong")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final long ac(byte[] bArr, l<? super t1, Long> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = u1.o(bArr);
        long j7 = 0;
        for (int i7 = 0; i7 < o6; i7++) {
            j7 += lVar.O(t1.d(u1.m(bArr, i7))).longValue();
        }
        return j7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> ad(int[] iArr, Iterable<? extends R> iterable, p<? super x1, ? super R, ? extends V> pVar) {
        l0.p(iArr, "$this$zip");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int o6 = y1.o(iArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), o6));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= o6) {
                break;
            }
            arrayList.add(pVar.J(x1.d(y1.m(iArr, i7)), obj));
            i7++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean b0(byte[] bArr) {
        l0.p(bArr, "$this$any");
        return x3.p.E5(bArr);
    }

    @g1(version = "1.4")
    @t
    public static final int b1(@e byte[] bArr) {
        if (bArr == null) {
            bArr = null;
        }
        return Arrays.hashCode(bArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<b2> b2(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$dropWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = c2.o(jArr);
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (z6) {
                arrayList.add(b2.d(m7));
            } else if (!lVar.O(b2.d(m7)).booleanValue()) {
                arrayList.add(b2.d(m7));
                z6 = true;
            }
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte b3(byte[] bArr) {
        l0.p(bArr, "$this$first");
        return t1.l(x3.p.gc(bArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void b4(int[] iArr, p<? super Integer, ? super x1, m2> pVar) {
        l0.p(iArr, "$this$forEachIndexed");
        l0.p(pVar, s2.t0.f16450f);
        int o6 = y1.o(iArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            pVar.J(Integer.valueOf(i8), x1.d(y1.m(iArr, i7)));
            i7++;
            i8++;
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int b5(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$indexOfLast");
        l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i7 = length - 1;
            if (lVar.O(b2.d(b2.l(jArr[length]))).booleanValue()) {
                return length;
            }
            if (i7 < 0) {
                return -1;
            }
            length = i7;
        }
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R b6(long[] jArr, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(b2.d(c2.m(jArr, 0)));
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(b2.d(c2.m(jArr, it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final float b7(byte[] bArr, l<? super t1, Float> lVar) {
        l0.p(bArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(t1.d(u1.m(bArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(t1.d(u1.m(bArr, it.b()))).floatValue());
        }
        return floatValue;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean b8(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$none");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (lVar.O(x1.d(y1.m(iArr, i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final x1 b9(int[] iArr, p<? super x1, ? super x1, x1> pVar) {
        l0.p(iArr, "$this$reduceOrNull");
        l0.p(pVar, "operation");
        if (y1.r(iArr)) {
            return null;
        }
        int m7 = y1.m(iArr, 0);
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            m7 = pVar.J(x1.d(m7), x1.d(y1.m(iArr, it.b()))).l0();
        }
        return x1.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final <R> List<R> ba(byte[] bArr, R r6, p<? super R, ? super t1, ? extends R> pVar) {
        l0.p(bArr, "$this$scan");
        l0.p(pVar, "operation");
        if (u1.r(bArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(u1.o(bArr) + 1);
        arrayList.add(r6);
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, t1.d(u1.m(bArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    public static final void bb(@n6.d short[] sArr, int i7, int i8) {
        l0.p(sArr, "$this$sort");
        x3.c.f18278k.d(i7, i8, i2.o(sArr));
        x3.r1.k(sArr, i7, i8);
    }

    @h(name = "sumOfLong")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final long bc(int[] iArr, l<? super x1, Long> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = y1.o(iArr);
        long j7 = 0;
        for (int i7 = 0; i7 < o6; i7++) {
            j7 += lVar.O(x1.d(y1.m(iArr, i7))).longValue();
        }
        return j7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> bd(long[] jArr, R[] rArr, p<? super b2, ? super R, ? extends V> pVar) {
        l0.p(jArr, "$this$zip");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(c2.o(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(b2.d(c2.m(jArr, i7)), rArr[i7]));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean c0(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$any");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (lVar.O(t1.d(u1.m(bArr, i7))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ int c1(byte[] bArr) {
        l0.p(bArr, "$this$contentHashCode");
        return b1(bArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<x1> c2(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$dropWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = y1.o(iArr);
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (z6) {
                arrayList.add(x1.d(m7));
            } else if (!lVar.O(x1.d(m7)).booleanValue()) {
                arrayList.add(x1.d(m7));
                z6 = true;
            }
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte c3(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$first");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (lVar.O(t1.d(m7)).booleanValue()) {
                return m7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void c4(long[] jArr, p<? super Integer, ? super b2, m2> pVar) {
        l0.p(jArr, "$this$forEachIndexed");
        l0.p(pVar, s2.t0.f16450f);
        int o6 = c2.o(jArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            pVar.J(Integer.valueOf(i8), b2.d(c2.m(jArr, i7)));
            i7++;
            i8++;
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int c5(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$indexOfLast");
        l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i7 = length - 1;
            if (lVar.O(x1.d(x1.l(iArr[length]))).booleanValue()) {
                return length;
            }
            if (i7 < 0) {
                return -1;
            }
            length = i7;
        }
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double c6(int[] iArr, l<? super x1, Double> lVar) {
        l0.p(iArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(x1.d(y1.m(iArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(x1.d(y1.m(iArr, it.b()))).doubleValue());
        }
        return doubleValue;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R c7(byte[] bArr, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(t1.d(u1.m(bArr, 0)));
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(t1.d(u1.m(bArr, it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean c8(short[] sArr) {
        l0.p(sArr, "$this$none");
        return i2.r(sArr);
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final b2 c9(long[] jArr, p<? super b2, ? super b2, b2> pVar) {
        l0.p(jArr, "$this$reduceOrNull");
        l0.p(pVar, "operation");
        if (c2.r(jArr)) {
            return null;
        }
        long m7 = c2.m(jArr, 0);
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            m7 = pVar.J(b2.d(m7), b2.d(c2.m(jArr, it.b()))).l0();
        }
        return b2.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final <R> List<R> ca(int[] iArr, R r6, p<? super R, ? super x1, ? extends R> pVar) {
        l0.p(iArr, "$this$scan");
        l0.p(pVar, "operation");
        if (y1.r(iArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(y1.o(iArr) + 1);
        arrayList.add(r6);
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, x1.d(y1.m(iArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    public static /* synthetic */ void cb(short[] sArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = i2.o(sArr);
        }
        bb(sArr, i7, i8);
    }

    @h(name = "sumOfLong")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final long cc(long[] jArr, l<? super b2, Long> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = c2.o(jArr);
        long j7 = 0;
        for (int i7 = 0; i7 < o6; i7++) {
            j7 += lVar.O(b2.d(c2.m(jArr, i7))).longValue();
        }
        return j7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final <R> List<u0<x1, R>> cd(@n6.d int[] iArr, @n6.d R[] rArr) {
        l0.p(iArr, "$this$zip");
        l0.p(rArr, "other");
        int min = Math.min(y1.o(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            int m7 = y1.m(iArr, i7);
            arrayList.add(q1.a(x1.d(m7), rArr[i7]));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean d0(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$any");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (lVar.O(b2.d(c2.m(jArr, i7))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ int d1(long[] jArr) {
        l0.p(jArr, "$this$contentHashCode");
        return h1(jArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<h2> d2(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$dropWhile");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = i2.o(sArr);
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (z6) {
                arrayList.add(h2.d(m7));
            } else if (!lVar.O(h2.d(m7)).booleanValue()) {
                arrayList.add(h2.d(m7));
                z6 = true;
            }
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long d3(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$first");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (lVar.O(b2.d(m7)).booleanValue()) {
                return m7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void d4(short[] sArr, p<? super Integer, ? super h2, m2> pVar) {
        l0.p(sArr, "$this$forEachIndexed");
        l0.p(pVar, s2.t0.f16450f);
        int o6 = i2.o(sArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            pVar.J(Integer.valueOf(i8), h2.d(i2.m(sArr, i7)));
            i7++;
            i8++;
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int d5(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$indexOfLast");
        l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i7 = length - 1;
            if (lVar.O(h2.d(h2.l(sArr[length]))).booleanValue()) {
                return length;
            }
            if (i7 < 0) {
                return -1;
            }
            length = i7;
        }
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final float d6(int[] iArr, l<? super x1, Float> lVar) {
        l0.p(iArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(x1.d(y1.m(iArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(x1.d(y1.m(iArr, it.b()))).floatValue());
        }
        return floatValue;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double d7(long[] jArr, l<? super b2, Double> lVar) {
        l0.p(jArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(b2.d(c2.m(jArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(b2.d(c2.m(jArr, it.b()))).doubleValue());
        }
        return doubleValue;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean d8(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$none");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (lVar.O(h2.d(i2.m(sArr, i7))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final h2 d9(short[] sArr, p<? super h2, ? super h2, h2> pVar) {
        l0.p(sArr, "$this$reduceOrNull");
        l0.p(pVar, "operation");
        if (i2.r(sArr)) {
            return null;
        }
        short m7 = i2.m(sArr, 0);
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            m7 = pVar.J(h2.d(m7), h2.d(i2.m(sArr, it.b()))).j0();
        }
        return h2.d(m7);
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final <R> List<R> da(short[] sArr, R r6, p<? super R, ? super h2, ? extends R> pVar) {
        l0.p(sArr, "$this$scan");
        l0.p(pVar, "operation");
        if (i2.r(sArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(i2.o(sArr) + 1);
        arrayList.add(r6);
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = pVar.J(r6, h2.d(i2.m(sArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    public static final void db(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$sort");
        if (u1.o(bArr) > 1) {
            x3.r1.j(bArr, 0, u1.o(bArr));
        }
    }

    @h(name = "sumOfLong")
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final long dc(short[] sArr, l<? super h2, Long> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int o6 = i2.o(sArr);
        long j7 = 0;
        for (int i7 = 0; i7 < o6; i7++) {
            j7 += lVar.O(h2.d(i2.m(sArr, i7))).longValue();
        }
        return j7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final <R> List<u0<b2, R>> dd(@n6.d long[] jArr, @n6.d Iterable<? extends R> iterable) {
        l0.p(jArr, "$this$zip");
        l0.p(iterable, "other");
        int o6 = c2.o(jArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), o6));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= o6) {
                break;
            }
            arrayList.add(q1.a(b2.d(c2.m(jArr, i7)), r6));
            i7++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean e0(long[] jArr) {
        l0.p(jArr, "$this$any");
        return x3.p.O5(jArr);
    }

    @g1(version = "1.4")
    @t
    public static final int e1(@e int[] iArr) {
        if (iArr == null) {
            iArr = null;
        }
        return Arrays.hashCode(iArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short e2(short[] sArr, int i7, l<? super Integer, h2> lVar) {
        l0.p(sArr, "$this$elementAtOrElse");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > x3.p.Ye(sArr)) ? lVar.O(Integer.valueOf(i7)).j0() : i2.m(sArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long e3(long[] jArr) {
        l0.p(jArr, "$this$first");
        return b2.l(x3.p.qc(jArr));
    }

    @n6.d
    public static final d5.l e4(@n6.d int[] iArr) {
        l0.p(iArr, "$this$indices");
        return x3.p.Me(iArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int e5(int[] iArr) {
        l0.p(iArr, "$this$last");
        return x1.l(x3.p.Xh(iArr));
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R e6(int[] iArr, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(x1.d(y1.m(iArr, 0)));
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(x1.d(y1.m(iArr, it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final float e7(long[] jArr, l<? super b2, Float> lVar) {
        l0.p(jArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(b2.d(c2.m(jArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(b2.d(c2.m(jArr, it.b()))).floatValue());
        }
        return floatValue;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final byte[] e8(byte[] bArr, l<? super t1, m2> lVar) {
        l0.p(bArr, "$this$onEach");
        l0.p(lVar, s2.t0.f16450f);
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            lVar.O(t1.d(u1.m(bArr, i7)));
        }
        return bArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte e9(byte[] bArr, p<? super t1, ? super t1, t1> pVar) {
        l0.p(bArr, "$this$reduceRight");
        l0.p(pVar, "operation");
        int Re = x3.p.Re(bArr);
        if (Re >= 0) {
            byte m7 = u1.m(bArr, Re);
            for (int i7 = Re - 1; i7 >= 0; i7--) {
                m7 = pVar.J(t1.d(u1.m(bArr, i7)), t1.d(m7)).j0();
            }
            return m7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final <R> List<R> ea(byte[] bArr, R r6, q<? super Integer, ? super R, ? super t1, ? extends R> qVar) {
        l0.p(bArr, "$this$scanIndexed");
        l0.p(qVar, "operation");
        if (u1.r(bArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(u1.o(bArr) + 1);
        arrayList.add(r6);
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, t1.d(u1.m(bArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    public static final void eb(@n6.d long[] jArr) {
        l0.p(jArr, "$this$sort");
        if (c2.o(jArr) > 1) {
            x3.r1.i(jArr, 0, c2.o(jArr));
        }
    }

    @h(name = "sumOfUByte")
    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final int ec(@n6.d t1[] t1VarArr) {
        l0.p(t1VarArr, "<this>");
        int i7 = 0;
        for (t1 t1Var : t1VarArr) {
            i7 = x1.l(i7 + x1.l(t1Var.j0() & t1.f17828n));
        }
        return i7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final <R> List<u0<x1, R>> ed(@n6.d int[] iArr, @n6.d Iterable<? extends R> iterable) {
        l0.p(iArr, "$this$zip");
        l0.p(iterable, "other");
        int o6 = y1.o(iArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), o6));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= o6) {
                break;
            }
            arrayList.add(q1.a(x1.d(y1.m(iArr, i7)), r6));
            i7++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean f0(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$any");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (lVar.O(x1.d(y1.m(iArr, i7))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @g1(version = "1.4")
    @t
    public static final int f1(@e short[] sArr) {
        if (sArr == null) {
            sArr = null;
        }
        return Arrays.hashCode(sArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int f2(int[] iArr, int i7, l<? super Integer, x1> lVar) {
        l0.p(iArr, "$this$elementAtOrElse");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > x3.p.Ve(iArr)) ? lVar.O(Integer.valueOf(i7)).l0() : y1.m(iArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int f3(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$first");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (lVar.O(x1.d(m7)).booleanValue()) {
                return m7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.3")
    @t
    public static /* synthetic */ void f4(int[] iArr) {
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte f5(byte[] bArr) {
        l0.p(bArr, "$this$last");
        return t1.l(x3.p.Ph(bArr));
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double f6(short[] sArr, l<? super h2, Double> lVar) {
        l0.p(sArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(h2.d(i2.m(sArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(h2.d(i2.m(sArr, it.b()))).doubleValue());
        }
        return doubleValue;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R f7(long[] jArr, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(b2.d(c2.m(jArr, 0)));
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(b2.d(c2.m(jArr, it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final long[] f8(long[] jArr, l<? super b2, m2> lVar) {
        l0.p(jArr, "$this$onEach");
        l0.p(lVar, s2.t0.f16450f);
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            lVar.O(b2.d(c2.m(jArr, i7)));
        }
        return jArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int f9(int[] iArr, p<? super x1, ? super x1, x1> pVar) {
        l0.p(iArr, "$this$reduceRight");
        l0.p(pVar, "operation");
        int Ve = x3.p.Ve(iArr);
        if (Ve >= 0) {
            int m7 = y1.m(iArr, Ve);
            for (int i7 = Ve - 1; i7 >= 0; i7--) {
                m7 = pVar.J(x1.d(y1.m(iArr, i7)), x1.d(m7)).l0();
            }
            return m7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final <R> List<R> fa(short[] sArr, R r6, q<? super Integer, ? super R, ? super h2, ? extends R> qVar) {
        l0.p(sArr, "$this$scanIndexed");
        l0.p(qVar, "operation");
        if (i2.r(sArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(i2.o(sArr) + 1);
        arrayList.add(r6);
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, h2.d(i2.m(sArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    public static final void fb(@n6.d int[] iArr, int i7, int i8) {
        l0.p(iArr, "$this$sort");
        x3.c.f18278k.d(i7, i8, y1.o(iArr));
        x3.r1.l(iArr, i7, i8);
    }

    @h(name = "sumOfUInt")
    @g1(version = "1.5")
    @t0
    @t
    @f
    @q2(markerClass = {t.class})
    public static final int fc(byte[] bArr, l<? super t1, x1> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int l7 = x1.l(0);
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = x1.l(l7 + lVar.O(t1.d(u1.m(bArr, i7))).l0());
        }
        return l7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <V> List<V> fd(byte[] bArr, byte[] bArr2, p<? super t1, ? super t1, ? extends V> pVar) {
        l0.p(bArr, "$this$zip");
        l0.p(bArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(u1.o(bArr), u1.o(bArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(t1.d(u1.m(bArr, i7)), t1.d(u1.m(bArr2, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean g0(short[] sArr) {
        l0.p(sArr, "$this$any");
        return x3.p.S5(sArr);
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ int g1(short[] sArr) {
        l0.p(sArr, "$this$contentHashCode");
        return f1(sArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long g2(long[] jArr, int i7, l<? super Integer, b2> lVar) {
        l0.p(jArr, "$this$elementAtOrElse");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > x3.p.We(jArr)) ? lVar.O(Integer.valueOf(i7)).l0() : c2.m(jArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short g3(short[] sArr) {
        l0.p(sArr, "$this$first");
        return h2.l(x3.p.uc(sArr));
    }

    @n6.d
    public static final d5.l g4(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$indices");
        return x3.p.Ie(bArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte g5(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$last");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr) - 1;
        if (o6 >= 0) {
            while (true) {
                int i7 = o6 - 1;
                byte m7 = u1.m(bArr, o6);
                if (!lVar.O(t1.d(m7)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    o6 = i7;
                } else {
                    return m7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final float g6(short[] sArr, l<? super h2, Float> lVar) {
        l0.p(sArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(h2.d(i2.m(sArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(h2.d(i2.m(sArr, it.b()))).floatValue());
        }
        return floatValue;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double g7(int[] iArr, l<? super x1, Double> lVar) {
        l0.p(iArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(x1.d(y1.m(iArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(x1.d(y1.m(iArr, it.b()))).doubleValue());
        }
        return doubleValue;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final int[] g8(int[] iArr, l<? super x1, m2> lVar) {
        l0.p(iArr, "$this$onEach");
        l0.p(lVar, s2.t0.f16450f);
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            lVar.O(x1.d(y1.m(iArr, i7)));
        }
        return iArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long g9(long[] jArr, p<? super b2, ? super b2, b2> pVar) {
        l0.p(jArr, "$this$reduceRight");
        l0.p(pVar, "operation");
        int We = x3.p.We(jArr);
        if (We >= 0) {
            long m7 = c2.m(jArr, We);
            for (int i7 = We - 1; i7 >= 0; i7--) {
                m7 = pVar.J(b2.d(c2.m(jArr, i7)), b2.d(m7)).l0();
            }
            return m7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final <R> List<R> ga(long[] jArr, R r6, q<? super Integer, ? super R, ? super b2, ? extends R> qVar) {
        l0.p(jArr, "$this$scanIndexed");
        l0.p(qVar, "operation");
        if (c2.r(jArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(c2.o(jArr) + 1);
        arrayList.add(r6);
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, b2.d(c2.m(jArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    public static /* synthetic */ void gb(int[] iArr, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = y1.o(iArr);
        }
        fb(iArr, i7, i8);
    }

    @h(name = "sumOfUInt")
    @g1(version = "1.5")
    @t0
    @t
    @f
    @q2(markerClass = {t.class})
    public static final int gc(int[] iArr, l<? super x1, x1> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int l7 = x1.l(0);
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = x1.l(l7 + lVar.O(x1.d(y1.m(iArr, i7))).l0());
        }
        return l7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final <R> List<u0<h2, R>> gd(@n6.d short[] sArr, @n6.d Iterable<? extends R> iterable) {
        l0.p(sArr, "$this$zip");
        l0.p(iterable, "other");
        int o6 = i2.o(sArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), o6));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= o6) {
                break;
            }
            arrayList.add(q1.a(h2.d(i2.m(sArr, i7)), r6));
            i7++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final boolean h0(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$any");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            if (lVar.O(h2.d(i2.m(sArr, i7))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @g1(version = "1.4")
    @t
    public static final int h1(@e long[] jArr) {
        if (jArr == null) {
            jArr = null;
        }
        return Arrays.hashCode(jArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte h2(byte[] bArr, int i7, l<? super Integer, t1> lVar) {
        l0.p(bArr, "$this$elementAtOrElse");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > x3.p.Re(bArr)) ? lVar.O(Integer.valueOf(i7)).j0() : u1.m(bArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short h3(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$first");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (lVar.O(h2.d(m7)).booleanValue()) {
                return m7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.3")
    @t
    public static /* synthetic */ void h4(byte[] bArr) {
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long h5(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$last");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr) - 1;
        if (o6 >= 0) {
            while (true) {
                int i7 = o6 - 1;
                long m7 = c2.m(jArr, o6);
                if (!lVar.O(b2.d(m7)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    o6 = i7;
                } else {
                    return m7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R h6(short[] sArr, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxOf");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(h2.d(i2.m(sArr, 0)));
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(h2.d(i2.m(sArr, it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final float h7(int[] iArr, l<? super x1, Float> lVar) {
        l0.p(iArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(x1.d(y1.m(iArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(x1.d(y1.m(iArr, it.b()))).floatValue());
        }
        return floatValue;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final short[] h8(short[] sArr, l<? super h2, m2> lVar) {
        l0.p(sArr, "$this$onEach");
        l0.p(lVar, s2.t0.f16450f);
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            lVar.O(h2.d(i2.m(sArr, i7)));
        }
        return sArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short h9(short[] sArr, p<? super h2, ? super h2, h2> pVar) {
        l0.p(sArr, "$this$reduceRight");
        l0.p(pVar, "operation");
        int Ye = x3.p.Ye(sArr);
        if (Ye >= 0) {
            short m7 = i2.m(sArr, Ye);
            for (int i7 = Ye - 1; i7 >= 0; i7--) {
                m7 = pVar.J(h2.d(i2.m(sArr, i7)), h2.d(m7)).j0();
            }
            return m7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final <R> List<R> ha(int[] iArr, R r6, q<? super Integer, ? super R, ? super x1, ? extends R> qVar) {
        l0.p(iArr, "$this$scanIndexed");
        l0.p(qVar, "operation");
        if (y1.r(iArr)) {
            return v.k(r6);
        }
        ArrayList arrayList = new ArrayList(y1.o(iArr) + 1);
        arrayList.add(r6);
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, x1.d(y1.m(iArr, i7)));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    public static final void hb(@n6.d short[] sArr) {
        l0.p(sArr, "$this$sort");
        if (i2.o(sArr) > 1) {
            x3.r1.k(sArr, 0, i2.o(sArr));
        }
    }

    @h(name = "sumOfUInt")
    @g1(version = "1.5")
    @t0
    @t
    @f
    @q2(markerClass = {t.class})
    public static final int hc(long[] jArr, l<? super b2, x1> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int l7 = x1.l(0);
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = x1.l(l7 + lVar.O(b2.d(c2.m(jArr, i7))).l0());
        }
        return l7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final <R> List<u0<t1, R>> hd(@n6.d byte[] bArr, @n6.d Iterable<? extends R> iterable) {
        l0.p(bArr, "$this$zip");
        l0.p(iterable, "other");
        int o6 = u1.o(bArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), o6));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= o6) {
                break;
            }
            arrayList.add(q1.a(t1.d(u1.m(bArr, i7)), r6));
            i7++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] i0(byte[] bArr) {
        l0.p(bArr, "$this$asByteArray");
        return bArr;
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ String i1(int[] iArr) {
        l0.p(iArr, "$this$contentToString");
        return m1(iArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final t1 i2(byte[] bArr, int i7) {
        l0.p(bArr, "$this$elementAtOrNull");
        return y4(bArr, i7);
    }

    @g1(version = "1.3")
    @e
    @t
    public static final x1 i3(@n6.d int[] iArr) {
        l0.p(iArr, "$this$firstOrNull");
        if (y1.r(iArr)) {
            return null;
        }
        return x1.d(y1.m(iArr, 0));
    }

    @n6.d
    public static final d5.l i4(@n6.d long[] jArr) {
        l0.p(jArr, "$this$indices");
        return x3.p.Ne(jArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long i5(long[] jArr) {
        l0.p(jArr, "$this$last");
        return b2.l(x3.p.Zh(jArr));
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R i6(byte[] bArr, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        R O = lVar.O(t1.d(u1.m(bArr, 0)));
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(t1.d(u1.m(bArr, it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R i7(int[] iArr, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(x1.d(y1.m(iArr, 0)));
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(x1.d(y1.m(iArr, it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final byte[] i8(byte[] bArr, p<? super Integer, ? super t1, m2> pVar) {
        l0.p(bArr, "$this$onEachIndexed");
        l0.p(pVar, s2.t0.f16450f);
        int o6 = u1.o(bArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            pVar.J(Integer.valueOf(i8), t1.d(u1.m(bArr, i7)));
            i7++;
            i8++;
        }
        return bArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int i9(int[] iArr, q<? super Integer, ? super x1, ? super x1, x1> qVar) {
        l0.p(iArr, "$this$reduceRightIndexed");
        l0.p(qVar, "operation");
        int Ve = x3.p.Ve(iArr);
        if (Ve >= 0) {
            int m7 = y1.m(iArr, Ve);
            for (int i7 = Ve - 1; i7 >= 0; i7--) {
                m7 = qVar.I(Integer.valueOf(i7), x1.d(y1.m(iArr, i7)), x1.d(m7)).l0();
            }
            return m7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @g1(version = "1.4")
    @t
    public static final void ia(@n6.d int[] iArr) {
        l0.p(iArr, "$this$shuffle");
        ja(iArr, b5.f.f7260k);
    }

    @g1(version = "1.3")
    @t
    public static final void ib(@n6.d int[] iArr) {
        l0.p(iArr, "$this$sortDescending");
        if (y1.o(iArr) > 1) {
            Wa(iArr);
            x3.p.yr(iArr);
        }
    }

    @h(name = "sumOfUInt")
    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final int ic(@n6.d x1[] x1VarArr) {
        l0.p(x1VarArr, "<this>");
        int i7 = 0;
        for (x1 x1Var : x1VarArr) {
            i7 = x1.l(i7 + x1Var.l0());
        }
        return i7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <V> List<V> id(int[] iArr, int[] iArr2, p<? super x1, ? super x1, ? extends V> pVar) {
        l0.p(iArr, "$this$zip");
        l0.p(iArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(y1.o(iArr), y1.o(iArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(x1.d(y1.m(iArr, i7)), x1.d(y1.m(iArr2, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] j0(int[] iArr) {
        l0.p(iArr, "$this$asIntArray");
        return iArr;
    }

    @g1(version = "1.4")
    @n6.d
    @t
    public static final String j1(@e byte[] bArr) {
        String h32;
        return (bArr == null || (h32 = e0.h3(u1.b(bArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : h32;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final h2 j2(short[] sArr, int i7) {
        l0.p(sArr, "$this$elementAtOrNull");
        return z4(sArr, i7);
    }

    @g1(version = "1.3")
    @e
    @t
    public static final t1 j3(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$firstOrNull");
        if (u1.r(bArr)) {
            return null;
        }
        return t1.d(u1.m(bArr, 0));
    }

    @g1(version = "1.3")
    @t
    public static /* synthetic */ void j4(long[] jArr) {
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int j5(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$last");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr) - 1;
        if (o6 >= 0) {
            while (true) {
                int i7 = o6 - 1;
                int m7 = y1.m(iArr, o6);
                if (!lVar.O(x1.d(m7)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    o6 = i7;
                } else {
                    return m7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Double j6(byte[] bArr, l<? super t1, Double> lVar) {
        l0.p(bArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        double doubleValue = lVar.O(t1.d(u1.m(bArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(t1.d(u1.m(bArr, it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final double j7(short[] sArr, l<? super h2, Double> lVar) {
        l0.p(sArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(h2.d(i2.m(sArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(h2.d(i2.m(sArr, it.b()))).doubleValue());
        }
        return doubleValue;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final int[] j8(int[] iArr, p<? super Integer, ? super x1, m2> pVar) {
        l0.p(iArr, "$this$onEachIndexed");
        l0.p(pVar, s2.t0.f16450f);
        int o6 = y1.o(iArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            pVar.J(Integer.valueOf(i8), x1.d(y1.m(iArr, i7)));
            i7++;
            i8++;
        }
        return iArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte j9(byte[] bArr, q<? super Integer, ? super t1, ? super t1, t1> qVar) {
        l0.p(bArr, "$this$reduceRightIndexed");
        l0.p(qVar, "operation");
        int Re = x3.p.Re(bArr);
        if (Re >= 0) {
            byte m7 = u1.m(bArr, Re);
            for (int i7 = Re - 1; i7 >= 0; i7--) {
                m7 = qVar.I(Integer.valueOf(i7), t1.d(u1.m(bArr, i7)), t1.d(m7)).j0();
            }
            return m7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @g1(version = "1.4")
    @t
    public static final void ja(@n6.d int[] iArr, @n6.d b5.f fVar) {
        l0.p(iArr, "$this$shuffle");
        l0.p(fVar, "random");
        for (int Ve = x3.p.Ve(iArr); Ve > 0; Ve--) {
            int m7 = fVar.m(Ve + 1);
            int m8 = y1.m(iArr, Ve);
            y1.t(iArr, Ve, y1.m(iArr, m7));
            y1.t(iArr, m7, m8);
        }
    }

    @g1(version = "1.4")
    @t
    public static final void jb(@n6.d long[] jArr, int i7, int i8) {
        l0.p(jArr, "$this$sortDescending");
        Xa(jArr, i7, i8);
        x3.p.Br(jArr, i7, i8);
    }

    @h(name = "sumOfUInt")
    @g1(version = "1.5")
    @t0
    @t
    @f
    @q2(markerClass = {t.class})
    public static final int jc(short[] sArr, l<? super h2, x1> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        int l7 = x1.l(0);
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = x1.l(l7 + lVar.O(h2.d(i2.m(sArr, i7))).l0());
        }
        return l7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> jd(byte[] bArr, R[] rArr, p<? super t1, ? super R, ? extends V> pVar) {
        l0.p(bArr, "$this$zip");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(u1.o(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(t1.d(u1.m(bArr, i7)), rArr[i7]));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] k0(long[] jArr) {
        l0.p(jArr, "$this$asLongArray");
        return jArr;
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ String k1(byte[] bArr) {
        l0.p(bArr, "$this$contentToString");
        return j1(bArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final x1 k2(int[] iArr, int i7) {
        l0.p(iArr, "$this$elementAtOrNull");
        return A4(iArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final t1 k3(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$firstOrNull");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (lVar.O(t1.d(m7)).booleanValue()) {
                return t1.d(m7);
            }
        }
        return null;
    }

    @n6.d
    public static final d5.l k4(@n6.d short[] sArr) {
        l0.p(sArr, "$this$indices");
        return x3.p.Pe(sArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short k5(short[] sArr) {
        l0.p(sArr, "$this$last");
        return h2.l(x3.p.di(sArr));
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Float k6(byte[] bArr, l<? super t1, Float> lVar) {
        l0.p(bArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        float floatValue = lVar.O(t1.d(u1.m(bArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(t1.d(u1.m(bArr, it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final float k7(short[] sArr, l<? super h2, Float> lVar) {
        l0.p(sArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(h2.d(i2.m(sArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(h2.d(i2.m(sArr, it.b()))).floatValue());
        }
        return floatValue;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final long[] k8(long[] jArr, p<? super Integer, ? super b2, m2> pVar) {
        l0.p(jArr, "$this$onEachIndexed");
        l0.p(pVar, s2.t0.f16450f);
        int o6 = c2.o(jArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            pVar.J(Integer.valueOf(i8), b2.d(c2.m(jArr, i7)));
            i7++;
            i8++;
        }
        return jArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short k9(short[] sArr, q<? super Integer, ? super h2, ? super h2, h2> qVar) {
        l0.p(sArr, "$this$reduceRightIndexed");
        l0.p(qVar, "operation");
        int Ye = x3.p.Ye(sArr);
        if (Ye >= 0) {
            short m7 = i2.m(sArr, Ye);
            for (int i7 = Ye - 1; i7 >= 0; i7--) {
                m7 = qVar.I(Integer.valueOf(i7), h2.d(i2.m(sArr, i7)), h2.d(m7)).j0();
            }
            return m7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @g1(version = "1.4")
    @t
    public static final void ka(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$shuffle");
        na(bArr, b5.f.f7260k);
    }

    @g1(version = "1.4")
    @t
    public static final void kb(@n6.d byte[] bArr, int i7, int i8) {
        l0.p(bArr, "$this$sortDescending");
        Za(bArr, i7, i8);
        x3.p.rr(bArr, i7, i8);
    }

    @h(name = "sumOfULong")
    @g1(version = "1.5")
    @t0
    @t
    @f
    @q2(markerClass = {t.class})
    public static final long kc(byte[] bArr, l<? super t1, b2> lVar) {
        l0.p(bArr, "$this$sumOf");
        l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = b2.l(l7 + lVar.O(t1.d(u1.m(bArr, i7))).l0());
        }
        return l7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <V> List<V> kd(long[] jArr, long[] jArr2, p<? super b2, ? super b2, ? extends V> pVar) {
        l0.p(jArr, "$this$zip");
        l0.p(jArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(c2.o(jArr), c2.o(jArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(b2.d(c2.m(jArr, i7)), b2.d(c2.m(jArr2, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] l0(short[] sArr) {
        l0.p(sArr, "$this$asShortArray");
        return sArr;
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ String l1(long[] jArr) {
        l0.p(jArr, "$this$contentToString");
        return p1(jArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final b2 l2(long[] jArr, int i7) {
        l0.p(jArr, "$this$elementAtOrNull");
        return B4(jArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final b2 l3(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$firstOrNull");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (lVar.O(b2.d(m7)).booleanValue()) {
                return b2.d(m7);
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    public static /* synthetic */ void l4(short[] sArr) {
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short l5(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$last");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr) - 1;
        if (o6 >= 0) {
            while (true) {
                int i7 = o6 - 1;
                short m7 = i2.m(sArr, o6);
                if (!lVar.O(h2.d(m7)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    o6 = i7;
                } else {
                    return m7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R l6(long[] jArr, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        R O = lVar.O(b2.d(c2.m(jArr, 0)));
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(b2.d(c2.m(jArr, it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R l7(short[] sArr, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$minOf");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(h2.d(i2.m(sArr, 0)));
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(h2.d(i2.m(sArr, it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final short[] l8(short[] sArr, p<? super Integer, ? super h2, m2> pVar) {
        l0.p(sArr, "$this$onEachIndexed");
        l0.p(pVar, s2.t0.f16450f);
        int o6 = i2.o(sArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            pVar.J(Integer.valueOf(i8), h2.d(i2.m(sArr, i7)));
            i7++;
            i8++;
        }
        return sArr;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long l9(long[] jArr, q<? super Integer, ? super b2, ? super b2, b2> qVar) {
        l0.p(jArr, "$this$reduceRightIndexed");
        l0.p(qVar, "operation");
        int We = x3.p.We(jArr);
        if (We >= 0) {
            long m7 = c2.m(jArr, We);
            for (int i7 = We - 1; i7 >= 0; i7--) {
                m7 = qVar.I(Integer.valueOf(i7), b2.d(c2.m(jArr, i7)), b2.d(m7)).l0();
            }
            return m7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @g1(version = "1.4")
    @t
    public static final void la(@n6.d long[] jArr, @n6.d b5.f fVar) {
        l0.p(jArr, "$this$shuffle");
        l0.p(fVar, "random");
        for (int We = x3.p.We(jArr); We > 0; We--) {
            int m7 = fVar.m(We + 1);
            long m8 = c2.m(jArr, We);
            c2.t(jArr, We, c2.m(jArr, m7));
            c2.t(jArr, m7, m8);
        }
    }

    @g1(version = "1.4")
    @t
    public static final void lb(@n6.d short[] sArr, int i7, int i8) {
        l0.p(sArr, "$this$sortDescending");
        bb(sArr, i7, i8);
        x3.p.Fr(sArr, i7, i8);
    }

    @h(name = "sumOfULong")
    @g1(version = "1.5")
    @t0
    @t
    @f
    @q2(markerClass = {t.class})
    public static final long lc(int[] iArr, l<? super x1, b2> lVar) {
        l0.p(iArr, "$this$sumOf");
        l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = b2.l(l7 + lVar.O(x1.d(y1.m(iArr, i7))).l0());
        }
        return l7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> ld(long[] jArr, Iterable<? extends R> iterable, p<? super b2, ? super R, ? extends V> pVar) {
        l0.p(jArr, "$this$zip");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int o6 = c2.o(jArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), o6));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= o6) {
                break;
            }
            arrayList.add(pVar.J(b2.d(c2.m(jArr, i7)), obj));
            i7++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] m0(byte[] bArr) {
        l0.p(bArr, "<this>");
        return u1.f(bArr);
    }

    @g1(version = "1.4")
    @n6.d
    @t
    public static final String m1(@e int[] iArr) {
        String h32;
        return (iArr == null || (h32 = e0.h3(y1.b(iArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : h32;
    }

    @g1(version = "1.3")
    @t
    public static final void m2(@n6.d int[] iArr, int i7, int i8, int i9) {
        l0.p(iArr, "$this$fill");
        o.l2(iArr, i7, i8, i9);
    }

    @g1(version = "1.3")
    @e
    @t
    public static final b2 m3(@n6.d long[] jArr) {
        l0.p(jArr, "$this$firstOrNull");
        if (c2.r(jArr)) {
            return null;
        }
        return b2.d(c2.m(jArr, 0));
    }

    public static final int m4(@n6.d int[] iArr) {
        l0.p(iArr, "$this$lastIndex");
        return x3.p.Ve(iArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int m5(long[] jArr, long j7) {
        l0.p(jArr, "$this$lastIndexOf");
        return x3.p.mi(jArr, j7);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Double m6(long[] jArr, l<? super b2, Double> lVar) {
        l0.p(jArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        double doubleValue = lVar.O(b2.d(c2.m(jArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(b2.d(c2.m(jArr, it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R m7(byte[] bArr, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        R O = lVar.O(t1.d(u1.m(bArr, 0)));
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(t1.d(u1.m(bArr, it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] m8(long[] jArr, long j7) {
        l0.p(jArr, "$this$plus");
        return c2.f(o.U3(jArr, j7));
    }

    @g1(version = "1.4")
    @t
    @f
    public static final x1 m9(int[] iArr, q<? super Integer, ? super x1, ? super x1, x1> qVar) {
        l0.p(iArr, "$this$reduceRightIndexedOrNull");
        l0.p(qVar, "operation");
        int Ve = x3.p.Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int m7 = y1.m(iArr, Ve);
        for (int i7 = Ve - 1; i7 >= 0; i7--) {
            m7 = qVar.I(Integer.valueOf(i7), x1.d(y1.m(iArr, i7)), x1.d(m7)).l0();
        }
        return x1.d(m7);
    }

    @g1(version = "1.4")
    @t
    public static final void ma(@n6.d long[] jArr) {
        l0.p(jArr, "$this$shuffle");
        la(jArr, b5.f.f7260k);
    }

    @g1(version = "1.3")
    @t
    public static final void mb(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$sortDescending");
        if (u1.o(bArr) > 1) {
            db(bArr);
            x3.p.qr(bArr);
        }
    }

    @h(name = "sumOfULong")
    @g1(version = "1.5")
    @t0
    @t
    @f
    @q2(markerClass = {t.class})
    public static final long mc(long[] jArr, l<? super b2, b2> lVar) {
        l0.p(jArr, "$this$sumOf");
        l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = b2.l(l7 + lVar.O(b2.d(c2.m(jArr, i7))).l0());
        }
        return l7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> md(byte[] bArr, Iterable<? extends R> iterable, p<? super t1, ? super R, ? extends V> pVar) {
        l0.p(bArr, "$this$zip");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int o6 = u1.o(bArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), o6));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= o6) {
                break;
            }
            arrayList.add(pVar.J(t1.d(u1.m(bArr, i7)), obj));
            i7++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] n0(int[] iArr) {
        l0.p(iArr, "<this>");
        return y1.f(iArr);
    }

    @g1(version = "1.4")
    @n6.d
    @t
    public static final String n1(@e short[] sArr) {
        String h32;
        return (sArr == null || (h32 = e0.h3(i2.b(sArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : h32;
    }

    public static /* synthetic */ void n2(int[] iArr, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = y1.o(iArr);
        }
        m2(iArr, i7, i8, i9);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final x1 n3(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$firstOrNull");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (lVar.O(x1.d(m7)).booleanValue()) {
                return x1.d(m7);
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    public static /* synthetic */ void n4(int[] iArr) {
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int n5(short[] sArr, short s6) {
        l0.p(sArr, "$this$lastIndexOf");
        return x3.p.oi(sArr, s6);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Float n6(long[] jArr, l<? super b2, Float> lVar) {
        l0.p(jArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        float floatValue = lVar.O(b2.d(c2.m(jArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(b2.d(c2.m(jArr, it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Double n7(byte[] bArr, l<? super t1, Double> lVar) {
        l0.p(bArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        double doubleValue = lVar.O(t1.d(u1.m(bArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(t1.d(u1.m(bArr, it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final int[] n8(@n6.d int[] iArr, @n6.d Collection<x1> collection) {
        l0.p(iArr, "$this$plus");
        l0.p(collection, "elements");
        int o6 = y1.o(iArr);
        int[] copyOf = Arrays.copyOf(iArr, y1.o(iArr) + collection.size());
        l0.o(copyOf, "copyOf(this, newSize)");
        Iterator<x1> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[o6] = it.next().l0();
            o6++;
        }
        return y1.f(copyOf);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final t1 n9(byte[] bArr, q<? super Integer, ? super t1, ? super t1, t1> qVar) {
        l0.p(bArr, "$this$reduceRightIndexedOrNull");
        l0.p(qVar, "operation");
        int Re = x3.p.Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte m7 = u1.m(bArr, Re);
        for (int i7 = Re - 1; i7 >= 0; i7--) {
            m7 = qVar.I(Integer.valueOf(i7), t1.d(u1.m(bArr, i7)), t1.d(m7)).j0();
        }
        return t1.d(m7);
    }

    @g1(version = "1.4")
    @t
    public static final void na(@n6.d byte[] bArr, @n6.d b5.f fVar) {
        l0.p(bArr, "$this$shuffle");
        l0.p(fVar, "random");
        for (int Re = x3.p.Re(bArr); Re > 0; Re--) {
            int m7 = fVar.m(Re + 1);
            byte m8 = u1.m(bArr, Re);
            u1.t(bArr, Re, u1.m(bArr, m7));
            u1.t(bArr, m7, m8);
        }
    }

    @g1(version = "1.3")
    @t
    public static final void nb(@n6.d long[] jArr) {
        l0.p(jArr, "$this$sortDescending");
        if (c2.o(jArr) > 1) {
            eb(jArr);
            x3.p.Ar(jArr);
        }
    }

    @h(name = "sumOfULong")
    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final long nc(@n6.d b2[] b2VarArr) {
        l0.p(b2VarArr, "<this>");
        long j7 = 0;
        for (b2 b2Var : b2VarArr) {
            j7 = b2.l(j7 + b2Var.l0());
        }
        return j7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> nd(int[] iArr, R[] rArr, p<? super x1, ? super R, ? extends V> pVar) {
        l0.p(iArr, "$this$zip");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(y1.o(iArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(x1.d(y1.m(iArr, i7)), rArr[i7]));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] o0(long[] jArr) {
        l0.p(jArr, "<this>");
        return c2.f(jArr);
    }

    @g1(version = "1.3")
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    @v3.l(hiddenSince = "1.4")
    @t
    public static final /* synthetic */ String o1(short[] sArr) {
        l0.p(sArr, "$this$contentToString");
        return n1(sArr);
    }

    @g1(version = "1.3")
    @t
    public static final void o2(@n6.d short[] sArr, short s6, int i7, int i8) {
        l0.p(sArr, "$this$fill");
        o.o2(sArr, s6, i7, i8);
    }

    @g1(version = "1.3")
    @e
    @t
    public static final h2 o3(@n6.d short[] sArr) {
        l0.p(sArr, "$this$firstOrNull");
        if (i2.r(sArr)) {
            return null;
        }
        return h2.d(i2.m(sArr, 0));
    }

    public static final int o4(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$lastIndex");
        return x3.p.Re(bArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int o5(byte[] bArr, byte b7) {
        l0.p(bArr, "$this$lastIndexOf");
        return x3.p.hi(bArr, b7);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R o6(int[] iArr, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        R O = lVar.O(x1.d(y1.m(iArr, 0)));
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(x1.d(y1.m(iArr, it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Float o7(byte[] bArr, l<? super t1, Float> lVar) {
        l0.p(bArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        float floatValue = lVar.O(t1.d(u1.m(bArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(t1.d(u1.m(bArr, it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] o8(short[] sArr, short s6) {
        l0.p(sArr, "$this$plus");
        return i2.f(o.b4(sArr, s6));
    }

    @g1(version = "1.4")
    @t
    @f
    public static final h2 o9(short[] sArr, q<? super Integer, ? super h2, ? super h2, h2> qVar) {
        l0.p(sArr, "$this$reduceRightIndexedOrNull");
        l0.p(qVar, "operation");
        int Ye = x3.p.Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short m7 = i2.m(sArr, Ye);
        for (int i7 = Ye - 1; i7 >= 0; i7--) {
            m7 = qVar.I(Integer.valueOf(i7), h2.d(i2.m(sArr, i7)), h2.d(m7)).j0();
        }
        return h2.d(m7);
    }

    @g1(version = "1.4")
    @t
    public static final void oa(@n6.d short[] sArr) {
        l0.p(sArr, "$this$shuffle");
        pa(sArr, b5.f.f7260k);
    }

    @g1(version = "1.4")
    @t
    public static final void ob(@n6.d int[] iArr, int i7, int i8) {
        l0.p(iArr, "$this$sortDescending");
        fb(iArr, i7, i8);
        x3.p.zr(iArr, i7, i8);
    }

    @h(name = "sumOfULong")
    @g1(version = "1.5")
    @t0
    @t
    @f
    @q2(markerClass = {t.class})
    public static final long oc(short[] sArr, l<? super h2, b2> lVar) {
        l0.p(sArr, "$this$sumOf");
        l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            l7 = b2.l(l7 + lVar.O(h2.d(i2.m(sArr, i7))).l0());
        }
        return l7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<u0<x1, x1>> od(@n6.d int[] iArr, @n6.d int[] iArr2) {
        l0.p(iArr, "$this$zip");
        l0.p(iArr2, "other");
        int min = Math.min(y1.o(iArr), y1.o(iArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(q1.a(x1.d(y1.m(iArr, i7)), x1.d(y1.m(iArr2, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] p0(short[] sArr) {
        l0.p(sArr, "<this>");
        return i2.f(sArr);
    }

    @g1(version = "1.4")
    @n6.d
    @t
    public static final String p1(@e long[] jArr) {
        String h32;
        return (jArr == null || (h32 = e0.h3(c2.b(jArr), ", ", "[", "]", 0, null, null, 56, null)) == null) ? "null" : h32;
    }

    public static /* synthetic */ void p2(short[] sArr, short s6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = i2.o(sArr);
        }
        o2(sArr, s6, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final h2 p3(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$firstOrNull");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (lVar.O(h2.d(m7)).booleanValue()) {
                return h2.d(m7);
            }
        }
        return null;
    }

    @g1(version = "1.3")
    @t
    public static /* synthetic */ void p4(byte[] bArr) {
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int p5(int[] iArr, int i7) {
        l0.p(iArr, "$this$lastIndexOf");
        return x3.p.li(iArr, i7);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Double p6(int[] iArr, l<? super x1, Double> lVar) {
        l0.p(iArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        double doubleValue = lVar.O(x1.d(y1.m(iArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(x1.d(y1.m(iArr, it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R p7(long[] jArr, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        R O = lVar.O(b2.d(c2.m(jArr, 0)));
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(b2.d(c2.m(jArr, it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] p8(int[] iArr, int[] iArr2) {
        l0.p(iArr, "$this$plus");
        l0.p(iArr2, "elements");
        return y1.f(o.T3(iArr, iArr2));
    }

    @g1(version = "1.4")
    @t
    @f
    public static final b2 p9(long[] jArr, q<? super Integer, ? super b2, ? super b2, b2> qVar) {
        l0.p(jArr, "$this$reduceRightIndexedOrNull");
        l0.p(qVar, "operation");
        int We = x3.p.We(jArr);
        if (We < 0) {
            return null;
        }
        long m7 = c2.m(jArr, We);
        for (int i7 = We - 1; i7 >= 0; i7--) {
            m7 = qVar.I(Integer.valueOf(i7), b2.d(c2.m(jArr, i7)), b2.d(m7)).l0();
        }
        return b2.d(m7);
    }

    @g1(version = "1.4")
    @t
    public static final void pa(@n6.d short[] sArr, @n6.d b5.f fVar) {
        l0.p(sArr, "$this$shuffle");
        l0.p(fVar, "random");
        for (int Ye = x3.p.Ye(sArr); Ye > 0; Ye--) {
            int m7 = fVar.m(Ye + 1);
            short m8 = i2.m(sArr, Ye);
            i2.t(sArr, Ye, i2.m(sArr, m7));
            i2.t(sArr, m7, m8);
        }
    }

    @g1(version = "1.3")
    @t
    public static final void pb(@n6.d short[] sArr) {
        l0.p(sArr, "$this$sortDescending");
        if (i2.o(sArr) > 1) {
            hb(sArr);
            x3.p.Er(sArr);
        }
    }

    @h(name = "sumOfUShort")
    @g1(version = "1.5")
    @q2(markerClass = {t.class})
    public static final int pc(@n6.d h2[] h2VarArr) {
        l0.p(h2VarArr, "<this>");
        int i7 = 0;
        for (h2 h2Var : h2VarArr) {
            i7 = x1.l(i7 + x1.l(h2Var.j0() & h2.f17796n));
        }
        return i7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> pd(short[] sArr, R[] rArr, p<? super h2, ? super R, ? extends V> pVar) {
        l0.p(sArr, "$this$zip");
        l0.p(rArr, "other");
        l0.p(pVar, "transform");
        int min = Math.min(i2.o(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(h2.d(i2.m(sArr, i7)), rArr[i7]));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <V> Map<t1, V> q0(byte[] bArr, l<? super t1, ? extends V> lVar) {
        l0.p(bArr, "$this$associateWith");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(z0.j(u1.o(bArr)), 16));
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            linkedHashMap.put(t1.d(m7), lVar.O(t1.d(m7)));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] q1(long[] jArr, long[] jArr2, int i7, int i8, int i9) {
        l0.p(jArr, "$this$copyInto");
        l0.p(jArr2, "destination");
        o.b1(jArr, jArr2, i7, i8, i9);
        return jArr2;
    }

    @g1(version = "1.3")
    @t
    public static final void q2(@n6.d long[] jArr, long j7, int i7, int i8) {
        l0.p(jArr, "$this$fill");
        o.m2(jArr, j7, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> q3(byte[] bArr, l<? super t1, ? extends Iterable<? extends R>> lVar) {
        l0.p(bArr, "$this$flatMap");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b0.o0(arrayList, lVar.O(t1.d(u1.m(bArr, i7))));
        }
        return arrayList;
    }

    public static final int q4(@n6.d long[] jArr) {
        l0.p(jArr, "$this$lastIndex");
        return x3.p.We(jArr);
    }

    @g1(version = "1.3")
    @e
    @t
    public static final x1 q5(@n6.d int[] iArr) {
        l0.p(iArr, "$this$lastOrNull");
        if (y1.r(iArr)) {
            return null;
        }
        return x1.d(y1.m(iArr, y1.o(iArr) - 1));
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Float q6(int[] iArr, l<? super x1, Float> lVar) {
        l0.p(iArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        float floatValue = lVar.O(x1.d(y1.m(iArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(x1.d(y1.m(iArr, it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Double q7(long[] jArr, l<? super b2, Double> lVar) {
        l0.p(jArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        double doubleValue = lVar.O(b2.d(c2.m(jArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(b2.d(c2.m(jArr, it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] q8(byte[] bArr, byte b7) {
        l0.p(bArr, "$this$plus");
        return u1.f(o.F3(bArr, b7));
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final t1 q9(byte[] bArr, p<? super t1, ? super t1, t1> pVar) {
        l0.p(bArr, "$this$reduceRightOrNull");
        l0.p(pVar, "operation");
        int Re = x3.p.Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte m7 = u1.m(bArr, Re);
        for (int i7 = Re - 1; i7 >= 0; i7--) {
            m7 = pVar.J(t1.d(u1.m(bArr, i7)), t1.d(m7)).j0();
        }
        return t1.d(m7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int qa(int[] iArr) {
        l0.p(iArr, "$this$single");
        return x1.l(x3.p.Dt(iArr));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> qb(@n6.d int[] iArr) {
        l0.p(iArr, "$this$sorted");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        int[] f7 = y1.f(copyOf);
        Wa(f7);
        return a4.b.a(f7);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> qc(@n6.d byte[] bArr, int i7) {
        l0.p(bArr, "$this$take");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            if (i7 >= u1.o(bArr)) {
                return e0.Q5(u1.b(bArr));
            }
            if (i7 == 1) {
                return v.k(t1.d(u1.m(bArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i7);
            int o6 = u1.o(bArr);
            int i8 = 0;
            for (int i9 = 0; i9 < o6; i9++) {
                arrayList.add(t1.d(u1.m(bArr, i9)));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final <R> List<u0<b2, R>> qd(@n6.d long[] jArr, @n6.d R[] rArr) {
        l0.p(jArr, "$this$zip");
        l0.p(rArr, "other");
        int min = Math.min(c2.o(jArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            long m7 = c2.m(jArr, i7);
            arrayList.add(q1.a(b2.d(m7), rArr[i7]));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <V> Map<b2, V> r0(long[] jArr, l<? super b2, ? extends V> lVar) {
        l0.p(jArr, "$this$associateWith");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(z0.j(c2.o(jArr)), 16));
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            linkedHashMap.put(b2.d(m7), lVar.O(b2.d(m7)));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ long[] r1(long[] jArr, long[] jArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = c2.o(jArr);
        }
        l0.p(jArr, "$this$copyInto");
        l0.p(jArr2, "destination");
        o.b1(jArr, jArr2, i7, i8, i9);
        return jArr2;
    }

    public static /* synthetic */ void r2(long[] jArr, long j7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = c2.o(jArr);
        }
        q2(jArr, j7, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> r3(long[] jArr, l<? super b2, ? extends Iterable<? extends R>> lVar) {
        l0.p(jArr, "$this$flatMap");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b0.o0(arrayList, lVar.O(b2.d(c2.m(jArr, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    public static /* synthetic */ void r4(long[] jArr) {
    }

    @g1(version = "1.3")
    @e
    @t
    public static final t1 r5(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$lastOrNull");
        if (u1.r(bArr)) {
            return null;
        }
        return t1.d(u1.m(bArr, u1.o(bArr) - 1));
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R r6(short[] sArr, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        R O = lVar.O(h2.d(i2.m(sArr, 0)));
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(h2.d(i2.m(sArr, it.b())));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Float r7(long[] jArr, l<? super b2, Float> lVar) {
        l0.p(jArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        float floatValue = lVar.O(b2.d(c2.m(jArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(b2.d(c2.m(jArr, it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] r8(byte[] bArr, byte[] bArr2) {
        l0.p(bArr, "$this$plus");
        l0.p(bArr2, "elements");
        return u1.f(o.H3(bArr, bArr2));
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final x1 r9(int[] iArr, p<? super x1, ? super x1, x1> pVar) {
        l0.p(iArr, "$this$reduceRightOrNull");
        l0.p(pVar, "operation");
        int Ve = x3.p.Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int m7 = y1.m(iArr, Ve);
        for (int i7 = Ve - 1; i7 >= 0; i7--) {
            m7 = pVar.J(x1.d(y1.m(iArr, i7)), x1.d(m7)).l0();
        }
        return x1.d(m7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte ra(byte[] bArr) {
        l0.p(bArr, "$this$single");
        return t1.l(x3.p.vt(bArr));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> rb(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$sorted");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        byte[] f7 = u1.f(copyOf);
        db(f7);
        return a4.b.b(f7);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> rc(@n6.d short[] sArr, int i7) {
        l0.p(sArr, "$this$take");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            if (i7 >= i2.o(sArr)) {
                return e0.Q5(i2.b(sArr));
            }
            if (i7 == 1) {
                return v.k(h2.d(i2.m(sArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i7);
            int o6 = i2.o(sArr);
            int i8 = 0;
            for (int i9 = 0; i9 < o6; i9++) {
                arrayList.add(h2.d(i2.m(sArr, i9)));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <V> List<V> rd(short[] sArr, short[] sArr2, p<? super h2, ? super h2, ? extends V> pVar) {
        l0.p(sArr, "$this$zip");
        l0.p(sArr2, "other");
        l0.p(pVar, "transform");
        int min = Math.min(i2.o(sArr), i2.o(sArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(h2.d(i2.m(sArr, i7)), h2.d(i2.m(sArr2, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <V> Map<x1, V> s0(int[] iArr, l<? super x1, ? extends V> lVar) {
        l0.p(iArr, "$this$associateWith");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(z0.j(y1.o(iArr)), 16));
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            linkedHashMap.put(x1.d(m7), lVar.O(x1.d(m7)));
        }
        return linkedHashMap;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] s1(short[] sArr, short[] sArr2, int i7, int i8, int i9) {
        l0.p(sArr, "$this$copyInto");
        l0.p(sArr2, "destination");
        o.d1(sArr, sArr2, i7, i8, i9);
        return sArr2;
    }

    @g1(version = "1.3")
    @t
    public static final void s2(@n6.d byte[] bArr, byte b7, int i7, int i8) {
        l0.p(bArr, "$this$fill");
        o.h2(bArr, b7, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> s3(int[] iArr, l<? super x1, ? extends Iterable<? extends R>> lVar) {
        l0.p(iArr, "$this$flatMap");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b0.o0(arrayList, lVar.O(x1.d(y1.m(iArr, i7))));
        }
        return arrayList;
    }

    public static final int s4(@n6.d short[] sArr) {
        l0.p(sArr, "$this$lastIndex");
        return x3.p.Ye(sArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final t1 s5(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$lastOrNull");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr) - 1;
        if (o6 < 0) {
            return null;
        }
        while (true) {
            int i7 = o6 - 1;
            byte m7 = u1.m(bArr, o6);
            if (lVar.O(t1.d(m7)).booleanValue()) {
                return t1.d(m7);
            }
            if (i7 < 0) {
                return null;
            }
            o6 = i7;
        }
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Double s6(short[] sArr, l<? super h2, Double> lVar) {
        l0.p(sArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        double doubleValue = lVar.O(h2.d(i2.m(sArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(h2.d(i2.m(sArr, it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R s7(int[] iArr, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        R O = lVar.O(x1.d(y1.m(iArr, 0)));
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(x1.d(y1.m(iArr, it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final long[] s8(@n6.d long[] jArr, @n6.d Collection<b2> collection) {
        l0.p(jArr, "$this$plus");
        l0.p(collection, "elements");
        int o6 = c2.o(jArr);
        long[] copyOf = Arrays.copyOf(jArr, c2.o(jArr) + collection.size());
        l0.o(copyOf, "copyOf(this, newSize)");
        Iterator<b2> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[o6] = it.next().l0();
            o6++;
        }
        return c2.f(copyOf);
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final b2 s9(long[] jArr, p<? super b2, ? super b2, b2> pVar) {
        l0.p(jArr, "$this$reduceRightOrNull");
        l0.p(pVar, "operation");
        int We = x3.p.We(jArr);
        if (We < 0) {
            return null;
        }
        long m7 = c2.m(jArr, We);
        for (int i7 = We - 1; i7 >= 0; i7--) {
            m7 = pVar.J(b2.d(c2.m(jArr, i7)), b2.d(m7)).l0();
        }
        return b2.d(m7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte sa(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$single");
        l0.p(lVar, "predicate");
        int o6 = u1.o(bArr);
        t1 t1Var = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (lVar.O(t1.d(m7)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                t1Var = t1.d(m7);
                z6 = true;
            }
        }
        if (z6) {
            return t1Var.j0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> sb(@n6.d long[] jArr) {
        l0.p(jArr, "$this$sorted");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        long[] f7 = c2.f(copyOf);
        eb(f7);
        return a4.b.c(f7);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> sc(@n6.d int[] iArr, int i7) {
        l0.p(iArr, "$this$take");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            if (i7 >= y1.o(iArr)) {
                return e0.Q5(y1.b(iArr));
            }
            if (i7 == 1) {
                return v.k(x1.d(y1.m(iArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i7);
            int o6 = y1.o(iArr);
            int i8 = 0;
            for (int i9 = 0; i9 < o6; i9++) {
                arrayList.add(x1.d(y1.m(iArr, i9)));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R, V> List<V> sd(short[] sArr, Iterable<? extends R> iterable, p<? super h2, ? super R, ? extends V> pVar) {
        l0.p(sArr, "$this$zip");
        l0.p(iterable, "other");
        l0.p(pVar, "transform");
        int o6 = i2.o(sArr);
        ArrayList arrayList = new ArrayList(Math.min(x.Y(iterable, 10), o6));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= o6) {
                break;
            }
            arrayList.add(pVar.J(h2.d(i2.m(sArr, i7)), obj));
            i7++;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <V> Map<h2, V> t0(short[] sArr, l<? super h2, ? extends V> lVar) {
        l0.p(sArr, "$this$associateWith");
        l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(z0.j(i2.o(sArr)), 16));
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            linkedHashMap.put(h2.d(m7), lVar.O(h2.d(m7)));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ short[] t1(short[] sArr, short[] sArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = i2.o(sArr);
        }
        l0.p(sArr, "$this$copyInto");
        l0.p(sArr2, "destination");
        o.d1(sArr, sArr2, i7, i8, i9);
        return sArr2;
    }

    public static /* synthetic */ void t2(byte[] bArr, byte b7, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = u1.o(bArr);
        }
        s2(bArr, b7, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> t3(short[] sArr, l<? super h2, ? extends Iterable<? extends R>> lVar) {
        l0.p(sArr, "$this$flatMap");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            b0.o0(arrayList, lVar.O(h2.d(i2.m(sArr, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    public static /* synthetic */ void t4(short[] sArr) {
    }

    @g1(version = "1.3")
    @t
    @f
    public static final b2 t5(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$lastOrNull");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr) - 1;
        if (o6 < 0) {
            return null;
        }
        while (true) {
            int i7 = o6 - 1;
            long m7 = c2.m(jArr, o6);
            if (lVar.O(b2.d(m7)).booleanValue()) {
                return b2.d(m7);
            }
            if (i7 < 0) {
                return null;
            }
            o6 = i7;
        }
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Float t6(short[] sArr, l<? super h2, Float> lVar) {
        l0.p(sArr, "$this$maxOfOrNull");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        float floatValue = lVar.O(h2.d(i2.m(sArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(h2.d(i2.m(sArr, it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Double t7(int[] iArr, l<? super x1, Double> lVar) {
        l0.p(iArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        double doubleValue = lVar.O(x1.d(y1.m(iArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(x1.d(y1.m(iArr, it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short[] t8(short[] sArr, short[] sArr2) {
        l0.p(sArr, "$this$plus");
        l0.p(sArr2, "elements");
        return i2.f(o.c4(sArr, sArr2));
    }

    @g1(version = "1.4")
    @t
    @f
    @q2(markerClass = {r.class})
    public static final h2 t9(short[] sArr, p<? super h2, ? super h2, h2> pVar) {
        l0.p(sArr, "$this$reduceRightOrNull");
        l0.p(pVar, "operation");
        int Ye = x3.p.Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short m7 = i2.m(sArr, Ye);
        for (int i7 = Ye - 1; i7 >= 0; i7--) {
            m7 = pVar.J(h2.d(i2.m(sArr, i7)), h2.d(m7)).j0();
        }
        return h2.d(m7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long ta(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$single");
        l0.p(lVar, "predicate");
        int o6 = c2.o(jArr);
        b2 b2Var = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (lVar.O(b2.d(m7)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                b2Var = b2.d(m7);
                z6 = true;
            }
        }
        if (z6) {
            return b2Var.l0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> tb(@n6.d short[] sArr) {
        l0.p(sArr, "$this$sorted");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        short[] f7 = i2.f(copyOf);
        hb(f7);
        return a4.b.d(f7);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> tc(@n6.d long[] jArr, int i7) {
        l0.p(jArr, "$this$take");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            if (i7 >= c2.o(jArr)) {
                return e0.Q5(c2.b(jArr));
            }
            if (i7 == 1) {
                return v.k(b2.d(c2.m(jArr, 0)));
            }
            ArrayList arrayList = new ArrayList(i7);
            int o6 = c2.o(jArr);
            int i8 = 0;
            for (int i9 = 0; i9 < o6; i9++) {
                arrayList.add(b2.d(c2.m(jArr, i9)));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<u0<t1, t1>> td(@n6.d byte[] bArr, @n6.d byte[] bArr2) {
        l0.p(bArr, "$this$zip");
        l0.p(bArr2, "other");
        int min = Math.min(u1.o(bArr), u1.o(bArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(q1.a(t1.d(u1.m(bArr, i7)), t1.d(u1.m(bArr2, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <V, M extends Map<? super x1, ? super V>> M u0(int[] iArr, M m7, l<? super x1, ? extends V> lVar) {
        l0.p(iArr, "$this$associateWithTo");
        l0.p(m7, "destination");
        l0.p(lVar, "valueSelector");
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m8 = y1.m(iArr, i7);
            m7.put(x1.d(m8), lVar.O(x1.d(m8)));
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] u1(byte[] bArr, byte[] bArr2, int i7, int i8, int i9) {
        l0.p(bArr, "$this$copyInto");
        l0.p(bArr2, "destination");
        o.W0(bArr, bArr2, i7, i8, i9);
        return bArr2;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<t1> u2(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$filter");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m7 = u1.m(bArr, i7);
            if (lVar.O(t1.d(m7)).booleanValue()) {
                arrayList.add(t1.d(m7));
            }
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> List<R> u3(byte[] bArr, p<? super Integer, ? super t1, ? extends Iterable<? extends R>> pVar) {
        l0.p(bArr, "$this$flatMapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int o6 = u1.o(bArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            b0.o0(arrayList, pVar.J(Integer.valueOf(i8), t1.d(u1.m(bArr, i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short u4(short[] sArr, int i7, l<? super Integer, h2> lVar) {
        l0.p(sArr, "$this$getOrElse");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > x3.p.Ye(sArr)) ? lVar.O(Integer.valueOf(i7)).j0() : i2.m(sArr, i7);
    }

    @g1(version = "1.3")
    @e
    @t
    public static final b2 u5(@n6.d long[] jArr) {
        l0.p(jArr, "$this$lastOrNull");
        if (c2.r(jArr)) {
            return null;
        }
        return b2.d(c2.m(jArr, c2.o(jArr) - 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R u6(long[] jArr, Comparator<? super R> comparator, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(b2.d(c2.m(jArr, 0)));
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(b2.d(c2.m(jArr, it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Float u7(int[] iArr, l<? super x1, Float> lVar) {
        l0.p(iArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            return null;
        }
        float floatValue = lVar.O(x1.d(y1.m(iArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(x1.d(y1.m(iArr, it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final short[] u8(@n6.d short[] sArr, @n6.d Collection<h2> collection) {
        l0.p(sArr, "$this$plus");
        l0.p(collection, "elements");
        int o6 = i2.o(sArr);
        short[] copyOf = Arrays.copyOf(sArr, i2.o(sArr) + collection.size());
        l0.o(copyOf, "copyOf(this, newSize)");
        Iterator<h2> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[o6] = it.next().j0();
            o6++;
        }
        return i2.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void u9(int[] iArr) {
        l0.p(iArr, "$this$reverse");
        x3.p.yr(iArr);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long ua(long[] jArr) {
        l0.p(jArr, "$this$single");
        return b2.l(x3.p.Ft(jArr));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final int[] ub(@n6.d int[] iArr) {
        l0.p(iArr, "$this$sortedArray");
        if (y1.r(iArr)) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        int[] f7 = y1.f(copyOf);
        Wa(f7);
        return f7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<t1> uc(@n6.d byte[] bArr, int i7) {
        l0.p(bArr, "$this$takeLast");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            int o6 = u1.o(bArr);
            if (i7 >= o6) {
                return e0.Q5(u1.b(bArr));
            }
            if (i7 == 1) {
                return v.k(t1.d(u1.m(bArr, o6 - 1)));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = o6 - i7; i8 < o6; i8++) {
                arrayList.add(t1.d(u1.m(bArr, i8)));
            }
            return arrayList;
        }
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<u0<h2, h2>> ud(@n6.d short[] sArr, @n6.d short[] sArr2) {
        l0.p(sArr, "$this$zip");
        l0.p(sArr2, "other");
        int min = Math.min(i2.o(sArr), i2.o(sArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(q1.a(h2.d(i2.m(sArr, i7)), h2.d(i2.m(sArr2, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <V, M extends Map<? super t1, ? super V>> M v0(byte[] bArr, M m7, l<? super t1, ? extends V> lVar) {
        l0.p(bArr, "$this$associateWithTo");
        l0.p(m7, "destination");
        l0.p(lVar, "valueSelector");
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            byte m8 = u1.m(bArr, i7);
            m7.put(t1.d(m8), lVar.O(t1.d(m8)));
        }
        return m7;
    }

    public static /* synthetic */ byte[] v1(byte[] bArr, byte[] bArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = u1.o(bArr);
        }
        l0.p(bArr, "$this$copyInto");
        l0.p(bArr2, "destination");
        o.W0(bArr, bArr2, i7, i8, i9);
        return bArr2;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<b2> v2(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$filter");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m7 = c2.m(jArr, i7);
            if (lVar.O(b2.d(m7)).booleanValue()) {
                arrayList.add(b2.d(m7));
            }
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> List<R> v3(int[] iArr, p<? super Integer, ? super x1, ? extends Iterable<? extends R>> pVar) {
        l0.p(iArr, "$this$flatMapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int o6 = y1.o(iArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            b0.o0(arrayList, pVar.J(Integer.valueOf(i8), x1.d(y1.m(iArr, i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int v4(int[] iArr, int i7, l<? super Integer, x1> lVar) {
        l0.p(iArr, "$this$getOrElse");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > x3.p.Ve(iArr)) ? lVar.O(Integer.valueOf(i7)).l0() : y1.m(iArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final x1 v5(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$lastOrNull");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr) - 1;
        if (o6 < 0) {
            return null;
        }
        while (true) {
            int i7 = o6 - 1;
            int m7 = y1.m(iArr, o6);
            if (lVar.O(x1.d(m7)).booleanValue()) {
                return x1.d(m7);
            }
            if (i7 < 0) {
                return null;
            }
            o6 = i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R v6(byte[] bArr, Comparator<? super R> comparator, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$maxOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(t1.d(u1.m(bArr, 0)));
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(t1.d(u1.m(bArr, it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R extends Comparable<? super R>> R v7(short[] sArr, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        R O = lVar.O(h2.d(i2.m(sArr, 0)));
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(h2.d(i2.m(sArr, it.b())));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] v8(int[] iArr, int i7) {
        l0.p(iArr, "$this$plus");
        return y1.f(o.R3(iArr, i7));
    }

    @g1(version = "1.4")
    @t
    @f
    public static final void v9(long[] jArr, int i7, int i8) {
        l0.p(jArr, "$this$reverse");
        x3.p.Br(jArr, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int va(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$single");
        l0.p(lVar, "predicate");
        int o6 = y1.o(iArr);
        x1 x1Var = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (lVar.O(x1.d(m7)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                x1Var = x1.d(m7);
                z6 = true;
            }
        }
        if (z6) {
            return x1Var.l0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final byte[] vb(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$sortedArray");
        if (u1.r(bArr)) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        byte[] f7 = u1.f(copyOf);
        db(f7);
        return f7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<h2> vc(@n6.d short[] sArr, int i7) {
        l0.p(sArr, "$this$takeLast");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            int o6 = i2.o(sArr);
            if (i7 >= o6) {
                return e0.Q5(i2.b(sArr));
            }
            if (i7 == 1) {
                return v.k(h2.d(i2.m(sArr, o6 - 1)));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = o6 - i7; i8 < o6; i8++) {
                arrayList.add(h2.d(i2.m(sArr, i8)));
            }
            return arrayList;
        }
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final <R> List<u0<t1, R>> vd(@n6.d byte[] bArr, @n6.d R[] rArr) {
        l0.p(bArr, "$this$zip");
        l0.p(rArr, "other");
        int min = Math.min(u1.o(bArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            byte m7 = u1.m(bArr, i7);
            arrayList.add(q1.a(t1.d(m7), rArr[i7]));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <V, M extends Map<? super b2, ? super V>> M w0(long[] jArr, M m7, l<? super b2, ? extends V> lVar) {
        l0.p(jArr, "$this$associateWithTo");
        l0.p(m7, "destination");
        l0.p(lVar, "valueSelector");
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            long m8 = c2.m(jArr, i7);
            m7.put(b2.d(m8), lVar.O(b2.d(m8)));
        }
        return m7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] w1(int[] iArr, int[] iArr2, int i7, int i8, int i9) {
        l0.p(iArr, "$this$copyInto");
        l0.p(iArr2, "destination");
        o.a1(iArr, iArr2, i7, i8, i9);
        return iArr2;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<x1> w2(int[] iArr, l<? super x1, Boolean> lVar) {
        l0.p(iArr, "$this$filter");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = y1.o(iArr);
        for (int i7 = 0; i7 < o6; i7++) {
            int m7 = y1.m(iArr, i7);
            if (lVar.O(x1.d(m7)).booleanValue()) {
                arrayList.add(x1.d(m7));
            }
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> List<R> w3(long[] jArr, p<? super Integer, ? super b2, ? extends Iterable<? extends R>> pVar) {
        l0.p(jArr, "$this$flatMapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int o6 = c2.o(jArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            b0.o0(arrayList, pVar.J(Integer.valueOf(i8), b2.d(c2.m(jArr, i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long w4(long[] jArr, int i7, l<? super Integer, b2> lVar) {
        l0.p(jArr, "$this$getOrElse");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > x3.p.We(jArr)) ? lVar.O(Integer.valueOf(i7)).l0() : c2.m(jArr, i7);
    }

    @g1(version = "1.3")
    @e
    @t
    public static final h2 w5(@n6.d short[] sArr) {
        l0.p(sArr, "$this$lastOrNull");
        if (i2.r(sArr)) {
            return null;
        }
        return h2.d(i2.m(sArr, i2.o(sArr) - 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R w6(short[] sArr, Comparator<? super R> comparator, l<? super h2, ? extends R> lVar) {
        l0.p(sArr, "$this$maxOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(h2.d(i2.m(sArr, 0)));
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(h2.d(i2.m(sArr, it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Double w7(short[] sArr, l<? super h2, Double> lVar) {
        l0.p(sArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        double doubleValue = lVar.O(h2.d(i2.m(sArr, 0))).doubleValue();
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(h2.d(i2.m(sArr, it.b()))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final long[] w8(long[] jArr, long[] jArr2) {
        l0.p(jArr, "$this$plus");
        l0.p(jArr2, "elements");
        return c2.f(o.W3(jArr, jArr2));
    }

    @g1(version = "1.4")
    @t
    @f
    public static final void w9(byte[] bArr, int i7, int i8) {
        l0.p(bArr, "$this$reverse");
        x3.p.rr(bArr, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short wa(short[] sArr) {
        l0.p(sArr, "$this$single");
        return h2.l(x3.p.Jt(sArr));
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final long[] wb(@n6.d long[] jArr) {
        l0.p(jArr, "$this$sortedArray");
        if (c2.r(jArr)) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        long[] f7 = c2.f(copyOf);
        eb(f7);
        return f7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<x1> wc(@n6.d int[] iArr, int i7) {
        l0.p(iArr, "$this$takeLast");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            int o6 = y1.o(iArr);
            if (i7 >= o6) {
                return e0.Q5(y1.b(iArr));
            }
            if (i7 == 1) {
                return v.k(x1.d(y1.m(iArr, o6 - 1)));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = o6 - i7; i8 < o6; i8++) {
                arrayList.add(x1.d(y1.m(iArr, i8)));
            }
            return arrayList;
        }
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final <R> List<u0<h2, R>> wd(@n6.d short[] sArr, @n6.d R[] rArr) {
        l0.p(sArr, "$this$zip");
        l0.p(rArr, "other");
        int min = Math.min(i2.o(sArr), rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            short m7 = i2.m(sArr, i7);
            arrayList.add(q1.a(h2.d(m7), rArr[i7]));
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t
    @f
    public static final <V, M extends Map<? super h2, ? super V>> M x0(short[] sArr, M m7, l<? super h2, ? extends V> lVar) {
        l0.p(sArr, "$this$associateWithTo");
        l0.p(m7, "destination");
        l0.p(lVar, "valueSelector");
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m8 = i2.m(sArr, i7);
            m7.put(h2.d(m8), lVar.O(h2.d(m8)));
        }
        return m7;
    }

    public static /* synthetic */ int[] x1(int[] iArr, int[] iArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = y1.o(iArr);
        }
        l0.p(iArr, "$this$copyInto");
        l0.p(iArr2, "destination");
        o.a1(iArr, iArr2, i7, i8, i9);
        return iArr2;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<h2> x2(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$filter");
        l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = i2.o(sArr);
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (lVar.O(h2.d(m7)).booleanValue()) {
                arrayList.add(h2.d(m7));
            }
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> List<R> x3(short[] sArr, p<? super Integer, ? super h2, ? extends Iterable<? extends R>> pVar) {
        l0.p(sArr, "$this$flatMapIndexed");
        l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int o6 = i2.o(sArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            b0.o0(arrayList, pVar.J(Integer.valueOf(i8), h2.d(i2.m(sArr, i7))));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte x4(byte[] bArr, int i7, l<? super Integer, t1> lVar) {
        l0.p(bArr, "$this$getOrElse");
        l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > x3.p.Re(bArr)) ? lVar.O(Integer.valueOf(i7)).j0() : u1.m(bArr, i7);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final h2 x5(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$lastOrNull");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr) - 1;
        if (o6 < 0) {
            return null;
        }
        while (true) {
            int i7 = o6 - 1;
            short m7 = i2.m(sArr, o6);
            if (lVar.O(h2.d(m7)).booleanValue()) {
                return h2.d(m7);
            }
            if (i7 < 0) {
                return null;
            }
            o6 = i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R x6(int[] iArr, Comparator<? super R> comparator, l<? super x1, ? extends R> lVar) {
        l0.p(iArr, "$this$maxOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (y1.r(iArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(x1.d(y1.m(iArr, 0)));
        s0 it = new d5.l(1, x3.p.Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(x1.d(y1.m(iArr, it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final Float x7(short[] sArr, l<? super h2, Float> lVar) {
        l0.p(sArr, "$this$minOfOrNull");
        l0.p(lVar, "selector");
        if (i2.r(sArr)) {
            return null;
        }
        float floatValue = lVar.O(h2.d(i2.m(sArr, 0))).floatValue();
        s0 it = new d5.l(1, x3.p.Ye(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(h2.d(i2.m(sArr, it.b()))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final byte[] x8(@n6.d byte[] bArr, @n6.d Collection<t1> collection) {
        l0.p(bArr, "$this$plus");
        l0.p(collection, "elements");
        int o6 = u1.o(bArr);
        byte[] copyOf = Arrays.copyOf(bArr, u1.o(bArr) + collection.size());
        l0.o(copyOf, "copyOf(this, newSize)");
        Iterator<t1> it = collection.iterator();
        while (it.hasNext()) {
            copyOf[o6] = it.next().j0();
            o6++;
        }
        return u1.f(copyOf);
    }

    @g1(version = "1.4")
    @t
    @f
    public static final void x9(short[] sArr, int i7, int i8) {
        l0.p(sArr, "$this$reverse");
        x3.p.Fr(sArr, i7, i8);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final short xa(short[] sArr, l<? super h2, Boolean> lVar) {
        l0.p(sArr, "$this$single");
        l0.p(lVar, "predicate");
        int o6 = i2.o(sArr);
        h2 h2Var = null;
        boolean z6 = false;
        for (int i7 = 0; i7 < o6; i7++) {
            short m7 = i2.m(sArr, i7);
            if (lVar.O(h2.d(m7)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                h2Var = h2.d(m7);
                z6 = true;
            }
        }
        if (z6) {
            return h2Var.j0();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final short[] xb(@n6.d short[] sArr) {
        l0.p(sArr, "$this$sortedArray");
        if (i2.r(sArr)) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        short[] f7 = i2.f(copyOf);
        hb(f7);
        return f7;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<b2> xc(@n6.d long[] jArr, int i7) {
        l0.p(jArr, "$this$takeLast");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return w.E();
        } else {
            int o6 = c2.o(jArr);
            if (i7 >= o6) {
                return e0.Q5(c2.b(jArr));
            }
            if (i7 == 1) {
                return v.k(b2.d(c2.m(jArr, o6 - 1)));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = o6 - i7; i8 < o6; i8++) {
                arrayList.add(b2.d(c2.m(jArr, i8)));
            }
            return arrayList;
        }
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final List<u0<b2, b2>> xd(@n6.d long[] jArr, @n6.d long[] jArr2) {
        l0.p(jArr, "$this$zip");
        l0.p(jArr2, "other");
        int min = Math.min(c2.o(jArr), c2.o(jArr2));
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(q1.a(b2.d(c2.m(jArr, i7)), b2.d(c2.m(jArr2, i7))));
        }
        return arrayList;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int y0(int[] iArr) {
        l0.p(iArr, "$this$component1");
        return y1.m(iArr, 0);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int[] y1(int[] iArr) {
        l0.p(iArr, "$this$copyOf");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return y1.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<t1> y2(byte[] bArr, p<? super Integer, ? super t1, Boolean> pVar) {
        l0.p(bArr, "$this$filterIndexed");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = u1.o(bArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            byte m7 = u1.m(bArr, i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), t1.d(m7)).booleanValue()) {
                arrayList.add(t1.d(m7));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R, C extends Collection<? super R>> C y3(int[] iArr, C c7, p<? super Integer, ? super x1, ? extends Iterable<? extends R>> pVar) {
        l0.p(iArr, "$this$flatMapIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int o6 = y1.o(iArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            b0.o0(c7, pVar.J(Integer.valueOf(i8), x1.d(y1.m(iArr, i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    @g1(version = "1.3")
    @e
    @t
    public static final t1 y4(@n6.d byte[] bArr, int i7) {
        l0.p(bArr, "$this$getOrNull");
        if (i7 < 0 || i7 > x3.p.Re(bArr)) {
            return null;
        }
        return t1.d(u1.m(bArr, i7));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> y5(byte[] bArr, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$map");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(u1.o(bArr));
        int o6 = u1.o(bArr);
        for (int i7 = 0; i7 < o6; i7++) {
            arrayList.add(lVar.O(t1.d(u1.m(bArr, i7))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R y6(long[] jArr, Comparator<? super R> comparator, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$maxOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            return null;
        }
        Object obj = (R) lVar.O(b2.d(c2.m(jArr, 0)));
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(b2.d(c2.m(jArr, it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R y7(long[] jArr, Comparator<? super R> comparator, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$minOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (c2.r(jArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(b2.d(c2.m(jArr, 0)));
        s0 it = new d5.l(1, x3.p.We(jArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(b2.d(c2.m(jArr, it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final int y8(int[] iArr) {
        l0.p(iArr, "$this$random");
        return z8(iArr, b5.f.f7260k);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void y9(byte[] bArr) {
        l0.p(bArr, "$this$reverse");
        x3.p.qr(bArr);
    }

    @g1(version = "1.3")
    @e
    @t
    public static final x1 ya(@n6.d int[] iArr) {
        l0.p(iArr, "$this$singleOrNull");
        if (y1.o(iArr) == 1) {
            return x1.d(y1.m(iArr, 0));
        }
        return null;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final int[] yb(@n6.d int[] iArr) {
        l0.p(iArr, "$this$sortedArrayDescending");
        if (y1.r(iArr)) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        int[] f7 = y1.f(copyOf);
        ib(f7);
        return f7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<t1> yc(byte[] bArr, l<? super t1, Boolean> lVar) {
        l0.p(bArr, "$this$takeLastWhile");
        l0.p(lVar, "predicate");
        for (int Re = x3.p.Re(bArr); -1 < Re; Re--) {
            if (!lVar.O(t1.d(u1.m(bArr, Re))).booleanValue()) {
                return O1(bArr, Re + 1);
            }
        }
        return e0.Q5(u1.b(bArr));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte z0(byte[] bArr) {
        l0.p(bArr, "$this$component1");
        return u1.m(bArr, 0);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final byte[] z1(byte[] bArr) {
        l0.p(bArr, "$this$copyOf");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        return u1.f(copyOf);
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<x1> z2(int[] iArr, p<? super Integer, ? super x1, Boolean> pVar) {
        l0.p(iArr, "$this$filterIndexed");
        l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int o6 = y1.o(iArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            int m7 = y1.m(iArr, i7);
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), x1.d(m7)).booleanValue()) {
                arrayList.add(x1.d(m7));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R, C extends Collection<? super R>> C z3(short[] sArr, C c7, p<? super Integer, ? super h2, ? extends Iterable<? extends R>> pVar) {
        l0.p(sArr, "$this$flatMapIndexedTo");
        l0.p(c7, "destination");
        l0.p(pVar, "transform");
        int o6 = i2.o(sArr);
        int i7 = 0;
        int i8 = 0;
        while (i7 < o6) {
            b0.o0(c7, pVar.J(Integer.valueOf(i8), h2.d(i2.m(sArr, i7))));
            i7++;
            i8++;
        }
        return c7;
    }

    @g1(version = "1.3")
    @e
    @t
    public static final h2 z4(@n6.d short[] sArr, int i7) {
        l0.p(sArr, "$this$getOrNull");
        if (i7 < 0 || i7 > x3.p.Ye(sArr)) {
            return null;
        }
        return h2.d(i2.m(sArr, i7));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final <R> List<R> z5(long[] jArr, l<? super b2, ? extends R> lVar) {
        l0.p(jArr, "$this$map");
        l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(c2.o(jArr));
        int o6 = c2.o(jArr);
        for (int i7 = 0; i7 < o6; i7++) {
            arrayList.add(lVar.O(b2.d(c2.m(jArr, i7))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R z6(byte[] bArr, Comparator<? super R> comparator, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$maxOfWithOrNull");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            return null;
        }
        Object obj = (R) lVar.O(t1.d(u1.m(bArr, 0)));
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(t1.d(u1.m(bArr, it.b())));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.4")
    @t0
    @t
    @f
    public static final <R> R z7(byte[] bArr, Comparator<? super R> comparator, l<? super t1, ? extends R> lVar) {
        l0.p(bArr, "$this$minOfWith");
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        if (u1.r(bArr)) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(t1.d(u1.m(bArr, 0)));
        s0 it = new d5.l(1, x3.p.Re(bArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(t1.d(u1.m(bArr, it.b())));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @g1(version = "1.3")
    @t
    public static final int z8(@n6.d int[] iArr, @n6.d b5.f fVar) {
        l0.p(iArr, "$this$random");
        l0.p(fVar, "random");
        if (y1.r(iArr)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return y1.m(iArr, fVar.m(y1.o(iArr)));
    }

    @g1(version = "1.3")
    @t
    @f
    public static final void z9(long[] jArr) {
        l0.p(jArr, "$this$reverse");
        x3.p.Ar(jArr);
    }

    @g1(version = "1.3")
    @e
    @t
    public static final t1 za(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$singleOrNull");
        if (u1.o(bArr) == 1) {
            return t1.d(u1.m(bArr, 0));
        }
        return null;
    }

    @g1(version = "1.3")
    @n6.d
    @t
    public static final byte[] zb(@n6.d byte[] bArr) {
        l0.p(bArr, "$this$sortedArrayDescending");
        if (u1.r(bArr)) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        byte[] f7 = u1.f(copyOf);
        mb(f7);
        return f7;
    }

    @g1(version = "1.3")
    @t
    @f
    public static final List<b2> zc(long[] jArr, l<? super b2, Boolean> lVar) {
        l0.p(jArr, "$this$takeLastWhile");
        l0.p(lVar, "predicate");
        for (int We = x3.p.We(jArr); -1 < We; We--) {
            if (!lVar.O(b2.d(c2.m(jArr, We))).booleanValue()) {
                return R1(jArr, We + 1);
            }
        }
        return e0.Q5(c2.b(jArr));
    }
}
