package x3;

import a0.b;
import b4.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import v3.b2;
import v3.m2;
import v3.q2;
import v3.x1;
@u4.r1({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,24693:1\n12794#1,2:24694\n12804#1,2:24696\n1282#1,2:24698\n1290#1,2:24700\n1298#1,2:24702\n1306#1,2:24704\n1314#1,2:24706\n1322#1,2:24708\n1330#1,2:24710\n1338#1,2:24712\n1346#1,2:24714\n2298#1,5:24716\n2311#1,5:24721\n2324#1,5:24726\n2337#1,5:24731\n2350#1,5:24736\n2363#1,5:24741\n2376#1,5:24746\n2389#1,5:24751\n2402#1,5:24756\n4307#1,2:24762\n4317#1,2:24764\n4327#1,2:24766\n4337#1,2:24768\n4347#1,2:24770\n4357#1,2:24772\n4367#1,2:24774\n4377#1,2:24776\n4387#1,2:24778\n3974#1:24780\n13644#1,2:24781\n3975#1,2:24783\n13646#1:24785\n3977#1:24786\n3988#1:24787\n13654#1,2:24788\n3989#1,2:24790\n13656#1:24792\n3991#1:24793\n4002#1:24794\n13664#1,2:24795\n4003#1,2:24797\n13666#1:24799\n4005#1:24800\n4016#1:24801\n13674#1,2:24802\n4017#1,2:24804\n13676#1:24806\n4019#1:24807\n4030#1:24808\n13684#1,2:24809\n4031#1,2:24811\n13686#1:24813\n4033#1:24814\n4044#1:24815\n13694#1,2:24816\n4045#1,2:24818\n13696#1:24820\n4047#1:24821\n4058#1:24822\n13704#1,2:24823\n4059#1,2:24825\n13706#1:24827\n4061#1:24828\n4072#1:24829\n13714#1,2:24830\n4073#1,2:24832\n13716#1:24834\n4075#1:24835\n4086#1:24836\n13724#1,2:24837\n4087#1,2:24839\n13726#1:24841\n4089#1:24842\n13644#1,3:24843\n13654#1,3:24846\n13664#1,3:24849\n13674#1,3:24852\n13684#1,3:24855\n13694#1,3:24858\n13704#1,3:24861\n13714#1,3:24864\n13724#1,3:24867\n4107#1,2:24870\n4217#1,2:24872\n4227#1,2:24874\n4237#1,2:24876\n4247#1,2:24878\n4257#1,2:24880\n4267#1,2:24882\n4277#1,2:24884\n4287#1,2:24886\n4297#1,2:24888\n9358#1,4:24890\n9373#1,4:24894\n9388#1,4:24898\n9403#1,4:24902\n9418#1,4:24906\n9433#1,4:24910\n9448#1,4:24914\n9463#1,4:24918\n9478#1,4:24922\n9071#1,4:24926\n9087#1,4:24930\n9103#1,4:24934\n9119#1,4:24938\n9135#1,4:24942\n9151#1,4:24946\n9167#1,4:24950\n9183#1,4:24954\n9199#1,4:24958\n9215#1,4:24962\n9231#1,4:24966\n9247#1,4:24970\n9263#1,4:24974\n9279#1,4:24978\n9295#1,4:24982\n9311#1,4:24986\n9327#1,4:24990\n9343#1,4:24994\n9646#1,4:24998\n10664#1,5:25002\n10675#1,5:25007\n10686#1,5:25012\n10697#1,5:25017\n10708#1,5:25022\n10719#1,5:25027\n10730#1,5:25032\n10741#1,5:25037\n10752#1,5:25042\n10767#1,5:25047\n11008#1,3:25052\n11011#1,3:25062\n11025#1,3:25065\n11028#1,3:25075\n11042#1,3:25078\n11045#1,3:25088\n11059#1,3:25091\n11062#1,3:25101\n11076#1,3:25104\n11079#1,3:25114\n11093#1,3:25117\n11096#1,3:25127\n11110#1,3:25130\n11113#1,3:25140\n11127#1,3:25143\n11130#1,3:25153\n11144#1,3:25156\n11147#1,3:25166\n11162#1,3:25169\n11165#1,3:25179\n11180#1,3:25182\n11183#1,3:25192\n11198#1,3:25195\n11201#1,3:25205\n11216#1,3:25208\n11219#1,3:25218\n11234#1,3:25221\n11237#1,3:25231\n11252#1,3:25234\n11255#1,3:25244\n11270#1,3:25247\n11273#1,3:25257\n11288#1,3:25260\n11291#1,3:25270\n11306#1,3:25273\n11309#1,3:25283\n11670#1,3:25412\n11680#1,3:25415\n11690#1,3:25418\n11700#1,3:25421\n11710#1,3:25424\n11720#1,3:25427\n11730#1,3:25430\n11740#1,3:25433\n11750#1,3:25436\n11536#1,4:25439\n11549#1,4:25443\n11562#1,4:25447\n11575#1,4:25451\n11588#1,4:25455\n11601#1,4:25459\n11614#1,4:25463\n11627#1,4:25467\n11640#1,4:25471\n11525#1:25475\n13644#1,2:25476\n13646#1:25479\n11526#1:25480\n13644#1,3:25481\n11661#1:25484\n13579#1:25485\n13580#1:25487\n11662#1:25488\n13579#1,2:25489\n13644#1,3:25491\n13654#1,3:25494\n13664#1,3:25497\n13674#1,3:25500\n13684#1,3:25503\n13694#1,3:25506\n13704#1,3:25509\n13714#1,3:25512\n13724#1,3:25515\n20893#1,2:25518\n20895#1,6:25521\n21109#1,2:25527\n21111#1,6:25530\n23305#1,6:25536\n23321#1,6:25542\n23337#1,6:25548\n23353#1,6:25554\n23369#1,6:25560\n23385#1,6:25566\n23401#1,6:25572\n23417#1,6:25578\n23433#1,6:25584\n23539#1,8:25590\n23557#1,8:25598\n23575#1,8:25606\n23593#1,8:25614\n23611#1,8:25622\n23629#1,8:25630\n23647#1,8:25638\n23665#1,8:25646\n23683#1,8:25654\n23781#1,6:25662\n23797#1,6:25668\n23813#1,6:25674\n23829#1,6:25680\n23845#1,6:25686\n23861#1,6:25692\n23877#1,6:25698\n23893#1,6:25704\n1#2:24761\n1#2:25478\n1#2:25486\n1#2:25520\n1#2:25529\n361#3,7:25055\n361#3,7:25068\n361#3,7:25081\n361#3,7:25094\n361#3,7:25107\n361#3,7:25120\n361#3,7:25133\n361#3,7:25146\n361#3,7:25159\n361#3,7:25172\n361#3,7:25185\n361#3,7:25198\n361#3,7:25211\n361#3,7:25224\n361#3,7:25237\n361#3,7:25250\n361#3,7:25263\n361#3,7:25276\n361#3,7:25286\n361#3,7:25293\n361#3,7:25300\n361#3,7:25307\n361#3,7:25314\n361#3,7:25321\n361#3,7:25328\n361#3,7:25335\n361#3,7:25342\n361#3,7:25349\n361#3,7:25356\n361#3,7:25363\n361#3,7:25370\n361#3,7:25377\n361#3,7:25384\n361#3,7:25391\n361#3,7:25398\n361#3,7:25405\n*S KotlinDebug\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n556#1:24694,2\n565#1:24696,2\n832#1:24698,2\n842#1:24700,2\n852#1:24702,2\n862#1:24704,2\n872#1:24706,2\n882#1:24708,2\n892#1:24710,2\n902#1:24712,2\n912#1:24714,2\n922#1:24716,5\n932#1:24721,5\n942#1:24726,5\n952#1:24731,5\n962#1:24736,5\n972#1:24741,5\n982#1:24746,5\n992#1:24751,5\n1002#1:24756,5\n3792#1:24762,2\n3801#1:24764,2\n3810#1:24766,2\n3819#1:24768,2\n3828#1:24770,2\n3837#1:24772,2\n3846#1:24774,2\n3855#1:24776,2\n3864#1:24778,2\n3875#1:24780\n3875#1:24781,2\n3875#1:24783,2\n3875#1:24785\n3875#1:24786\n3886#1:24787\n3886#1:24788,2\n3886#1:24790,2\n3886#1:24792\n3886#1:24793\n3897#1:24794\n3897#1:24795,2\n3897#1:24797,2\n3897#1:24799\n3897#1:24800\n3908#1:24801\n3908#1:24802,2\n3908#1:24804,2\n3908#1:24806\n3908#1:24807\n3919#1:24808\n3919#1:24809,2\n3919#1:24811,2\n3919#1:24813\n3919#1:24814\n3930#1:24815\n3930#1:24816,2\n3930#1:24818,2\n3930#1:24820\n3930#1:24821\n3941#1:24822\n3941#1:24823,2\n3941#1:24825,2\n3941#1:24827\n3941#1:24828\n3952#1:24829\n3952#1:24830,2\n3952#1:24832,2\n3952#1:24834\n3952#1:24835\n3963#1:24836\n3963#1:24837,2\n3963#1:24839,2\n3963#1:24841\n3963#1:24842\n3974#1:24843,3\n3988#1:24846,3\n4002#1:24849,3\n4016#1:24852,3\n4030#1:24855,3\n4044#1:24858,3\n4058#1:24861,3\n4072#1:24864,3\n4086#1:24867,3\n4098#1:24870,2\n4117#1:24872,2\n4126#1:24874,2\n4135#1:24876,2\n4144#1:24878,2\n4153#1:24880,2\n4162#1:24882,2\n4171#1:24884,2\n4180#1:24886,2\n4189#1:24888,2\n8677#1:24890,4\n8692#1:24894,4\n8707#1:24898,4\n8722#1:24902,4\n8737#1:24906,4\n8752#1:24910,4\n8767#1:24914,4\n8782#1:24918,4\n8797#1:24922,4\n8812#1:24926,4\n8827#1:24930,4\n8842#1:24934,4\n8857#1:24938,4\n8872#1:24942,4\n8887#1:24946,4\n8902#1:24950,4\n8917#1:24954,4\n8932#1:24958,4\n8946#1:24962,4\n8960#1:24966,4\n8974#1:24970,4\n8988#1:24974,4\n9002#1:24978,4\n9016#1:24982,4\n9030#1:24986,4\n9044#1:24990,4\n9058#1:24994,4\n9497#1:24998,4\n10242#1:25002,5\n10251#1:25007,5\n10260#1:25012,5\n10269#1:25017,5\n10278#1:25022,5\n10287#1:25027,5\n10296#1:25032,5\n10305#1:25037,5\n10314#1:25042,5\n10327#1:25047,5\n10783#1:25052,3\n10783#1:25062,3\n10795#1:25065,3\n10795#1:25075,3\n10807#1:25078,3\n10807#1:25088,3\n10819#1:25091,3\n10819#1:25101,3\n10831#1:25104,3\n10831#1:25114,3\n10843#1:25117,3\n10843#1:25127,3\n10855#1:25130,3\n10855#1:25140,3\n10867#1:25143,3\n10867#1:25153,3\n10879#1:25156,3\n10879#1:25166,3\n10892#1:25169,3\n10892#1:25179,3\n10905#1:25182,3\n10905#1:25192,3\n10918#1:25195,3\n10918#1:25205,3\n10931#1:25208,3\n10931#1:25218,3\n10944#1:25221,3\n10944#1:25231,3\n10957#1:25234,3\n10957#1:25244,3\n10970#1:25247,3\n10970#1:25257,3\n10983#1:25260,3\n10983#1:25270,3\n10996#1:25273,3\n10996#1:25283,3\n11335#1:25412,3\n11345#1:25415,3\n11355#1:25418,3\n11365#1:25421,3\n11375#1:25424,3\n11385#1:25427,3\n11395#1:25430,3\n11405#1:25433,3\n11415#1:25436,3\n11425#1:25439,4\n11435#1:25443,4\n11445#1:25447,4\n11455#1:25451,4\n11465#1:25455,4\n11475#1:25459,4\n11485#1:25463,4\n11495#1:25467,4\n11505#1:25471,4\n11515#1:25475\n11515#1:25476,2\n11515#1:25479\n11515#1:25480\n11525#1:25481,3\n11653#1:25484\n11653#1:25485\n11653#1:25487\n11653#1:25488\n11661#1:25489,2\n19161#1:25491,3\n19173#1:25494,3\n19185#1:25497,3\n19197#1:25500,3\n19209#1:25503,3\n19221#1:25506,3\n19233#1:25509,3\n19245#1:25512,3\n19257#1:25515,3\n21725#1:25518,2\n21725#1:25521,6\n21887#1:25527,2\n21887#1:25530,6\n23214#1:25536,6\n23224#1:25542,6\n23234#1:25548,6\n23244#1:25554,6\n23254#1:25560,6\n23264#1:25566,6\n23274#1:25572,6\n23284#1:25578,6\n23294#1:25584,6\n23448#1:25590,8\n23458#1:25598,8\n23468#1:25606,8\n23478#1:25614,8\n23488#1:25622,8\n23498#1:25630,8\n23508#1:25638,8\n23518#1:25646,8\n23528#1:25654,8\n23700#1:25662,6\n23710#1:25668,6\n23720#1:25674,6\n23730#1:25680,6\n23740#1:25686,6\n23750#1:25692,6\n23760#1:25698,6\n23770#1:25704,6\n11515#1:25478\n11653#1:25486\n21725#1:25520\n21887#1:25529\n10783#1:25055,7\n10795#1:25068,7\n10807#1:25081,7\n10819#1:25094,7\n10831#1:25107,7\n10843#1:25120,7\n10855#1:25133,7\n10867#1:25146,7\n10879#1:25159,7\n10892#1:25172,7\n10905#1:25185,7\n10918#1:25198,7\n10931#1:25211,7\n10944#1:25224,7\n10957#1:25237,7\n10970#1:25250,7\n10983#1:25263,7\n10996#1:25276,7\n11010#1:25286,7\n11027#1:25293,7\n11044#1:25300,7\n11061#1:25307,7\n11078#1:25314,7\n11095#1:25321,7\n11112#1:25328,7\n11129#1:25335,7\n11146#1:25342,7\n11164#1:25349,7\n11182#1:25356,7\n11200#1:25363,7\n11218#1:25370,7\n11236#1:25377,7\n11254#1:25384,7\n11272#1:25391,7\n11290#1:25398,7\n11308#1:25405,7\n*E\n"})
/* loaded from: classes.dex */
public class p extends x3.o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24236#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> implements Iterable<T>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Object[] f18352k;

        public a(Object[] objArr) {
            this.f18352k = objArr;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<T> iterator() {
            return u4.i.a(this.f18352k);
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends u4.n0 implements t4.a<Iterator<? extends Boolean>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ boolean[] f18353l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(boolean[] zArr) {
            super(0);
            this.f18353l = zArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<Boolean> n() {
            return u4.j.a(this.f18353l);
        }
    }

    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24244#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b implements Iterable<Byte>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ byte[] f18354k;

        public b(byte[] bArr) {
            this.f18354k = bArr;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<Byte> iterator() {
            return u4.j.b(this.f18354k);
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends u4.n0 implements t4.a<Iterator<? extends Character>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ char[] f18355l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(char[] cArr) {
            super(0);
            this.f18355l = cArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<Character> n() {
            return u4.j.c(this.f18355l);
        }
    }

    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24252#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c implements Iterable<Short>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ short[] f18356k;

        public c(short[] sArr) {
            this.f18356k = sArr;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<Short> iterator() {
            return u4.j.h(this.f18356k);
        }
    }

    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24260#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d implements Iterable<Integer>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int[] f18357k;

        public d(int[] iArr) {
            this.f18357k = iArr;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<Integer> iterator() {
            return u4.j.f(this.f18357k);
        }
    }

    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24268#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class e implements Iterable<Long>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ long[] f18358k;

        public e(long[] jArr) {
            this.f18358k = jArr;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<Long> iterator() {
            return u4.j.g(this.f18358k);
        }
    }

    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24276#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class f implements Iterable<Float>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ float[] f18359k;

        public f(float[] fArr) {
            this.f18359k = fArr;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<Float> iterator() {
            return u4.j.e(this.f18359k);
        }
    }

    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24284#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class g implements Iterable<Double>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ double[] f18360k;

        public g(double[] dArr) {
            this.f18360k = dArr;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<Double> iterator() {
            return u4.j.d(this.f18360k);
        }
    }

    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24292#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class h implements Iterable<Boolean>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ boolean[] f18361k;

        public h(boolean[] zArr) {
            this.f18361k = zArr;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<Boolean> iterator() {
            return u4.j.a(this.f18361k);
        }
    }

    @u4.r1({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,70:1\n24300#2:71\n*E\n"})
    /* loaded from: classes.dex */
    public static final class i implements Iterable<Character>, v4.a {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ char[] f18362k;

        public i(char[] cArr) {
            this.f18362k = cArr;
        }

        @Override // java.lang.Iterable
        @n6.d
        public Iterator<Character> iterator() {
            return u4.j.c(this.f18362k);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24310#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class j<T> implements f5.m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object[] f18363a;

        public j(Object[] objArr) {
            this.f18363a = objArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<T> iterator() {
            return u4.i.a(this.f18363a);
        }
    }

    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24320#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class k implements f5.m<Byte> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f18364a;

        public k(byte[] bArr) {
            this.f18364a = bArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Byte> iterator() {
            return u4.j.b(this.f18364a);
        }
    }

    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24330#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class l implements f5.m<Short> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ short[] f18365a;

        public l(short[] sArr) {
            this.f18365a = sArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Short> iterator() {
            return u4.j.h(this.f18365a);
        }
    }

    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24340#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class m implements f5.m<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f18366a;

        public m(int[] iArr) {
            this.f18366a = iArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Integer> iterator() {
            return u4.j.f(this.f18366a);
        }
    }

    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24350#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class n implements f5.m<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long[] f18367a;

        public n(long[] jArr) {
            this.f18367a = jArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Long> iterator() {
            return u4.j.g(this.f18367a);
        }
    }

    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24360#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class o implements f5.m<Float> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float[] f18368a;

        public o(float[] fArr) {
            this.f18368a = fArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Float> iterator() {
            return u4.j.e(this.f18368a);
        }
    }

    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24370#2:681\n*E\n"})
    /* renamed from: x3.p$p  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0265p implements f5.m<Double> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ double[] f18369a;

        public C0265p(double[] dArr) {
            this.f18369a = dArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Double> iterator() {
            return u4.j.d(this.f18369a);
        }
    }

    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24380#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class q implements f5.m<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f18370a;

        public q(boolean[] zArr) {
            this.f18370a = zArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Boolean> iterator() {
            return u4.j.a(this.f18370a);
        }
    }

    @u4.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,680:1\n24390#2:681\n*E\n"})
    /* loaded from: classes.dex */
    public static final class r implements f5.m<Character> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ char[] f18371a;

        public r(char[] cArr) {
            this.f18371a = cArr;
        }

        @Override // f5.m
        @n6.d
        public Iterator<Character> iterator() {
            return u4.j.c(this.f18371a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    @u4.r1({"SMAP\n_Arrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt$groupingBy$1\n*L\n1#1,24693:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class s<K, T> implements l0<T, K> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ T[] f18372a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<T, K> f18373b;

        /* JADX WARN: Multi-variable type inference failed */
        public s(T[] tArr, t4.l<? super T, ? extends K> lVar) {
            this.f18372a = tArr;
            this.f18373b = lVar;
        }

        @Override // x3.l0
        public K a(T t6) {
            return this.f18373b.O(t6);
        }

        @Override // x3.l0
        @n6.d
        public Iterator<T> b() {
            return u4.i.a(this.f18372a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class t<T> extends u4.n0 implements t4.a<Iterator<? extends T>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ T[] f18374l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(T[] tArr) {
            super(0);
            this.f18374l = tArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<T> n() {
            return u4.i.a(this.f18374l);
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends u4.n0 implements t4.a<Iterator<? extends Byte>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ byte[] f18375l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(byte[] bArr) {
            super(0);
            this.f18375l = bArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<Byte> n() {
            return u4.j.b(this.f18375l);
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends u4.n0 implements t4.a<Iterator<? extends Short>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ short[] f18376l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(short[] sArr) {
            super(0);
            this.f18376l = sArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<Short> n() {
            return u4.j.h(this.f18376l);
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends u4.n0 implements t4.a<Iterator<? extends Integer>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int[] f18377l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(int[] iArr) {
            super(0);
            this.f18377l = iArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<Integer> n() {
            return u4.j.f(this.f18377l);
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends u4.n0 implements t4.a<Iterator<? extends Long>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ long[] f18378l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(long[] jArr) {
            super(0);
            this.f18378l = jArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<Long> n() {
            return u4.j.g(this.f18378l);
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends u4.n0 implements t4.a<Iterator<? extends Float>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ float[] f18379l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(float[] fArr) {
            super(0);
            this.f18379l = fArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<Float> n() {
            return u4.j.e(this.f18379l);
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends u4.n0 implements t4.a<Iterator<? extends Double>> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ double[] f18380l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(double[] dArr) {
            super(0);
            this.f18380l = dArr;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Iterator<Double> n() {
            return u4.j.d(this.f18380l);
        }
    }

    public static final boolean A5(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (long j7 : jArr) {
            if (!lVar.O(Long.valueOf(j7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <K, V> Map<K, V> A6(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends K> lVar, @n6.d t4.l<? super Character, ? extends V> lVar2) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(cArr.length), 16));
        for (char c7 : cArr) {
            linkedHashMap.put(lVar.O(Character.valueOf(c7)), lVar2.O(Character.valueOf(c7)));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V, M extends Map<? super Character, ? super V>> M A7(char[] cArr, M m7, t4.l<? super Character, ? extends V> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        for (char c7 : cArr) {
            m7.put(Character.valueOf(c7), lVar.O(Character.valueOf(c7)));
        }
        return m7;
    }

    @k4.f
    public static final long A8(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr[3];
    }

    @n6.d
    public static final <K> List<Float> A9(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends K> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (float f7 : fArr) {
            if (hashSet.add(lVar.O(Float.valueOf(f7)))) {
                arrayList.add(Float.valueOf(f7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <R> List<v3.u0<Float, R>> AA(@n6.d float[] fArr, @n6.d Iterable<? extends R> iterable) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(iterable, "other");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(Float.valueOf(fArr[i7]), r6));
            i7++;
        }
        return arrayList;
    }

    @k4.f
    public static final Byte Aa(byte[] bArr, int i7) {
        u4.l0.p(bArr, "<this>");
        return kf(bArr, i7);
    }

    @n6.d
    public static final <C extends Collection<? super Integer>> C Ab(@n6.d int[] iArr, @n6.d C c7, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (int i7 : iArr) {
            if (!lVar.O(Integer.valueOf(i7)).booleanValue()) {
                c7.add(Integer.valueOf(i7));
            }
        }
        return c7;
    }

    @n6.e
    public static final Boolean Ac(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[0]);
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C Ad(@n6.d float[] fArr, @n6.d C c7, @n6.d t4.l<? super Float, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (float f7 : fArr) {
            x3.b0.o0(c7, lVar.O(Float.valueOf(f7)));
        }
        return c7;
    }

    public static final void Ae(@n6.d char[] cArr, @n6.d t4.p<? super Integer, ? super Character, m2> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = cArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Character.valueOf(cArr[i7]));
            i7++;
            i8++;
        }
    }

    @n6.d
    public static final <K> Map<K, List<Integer>> Af(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends K> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i7 : iArr) {
            K O = lVar.O(Integer.valueOf(i7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(Integer.valueOf(i7));
        }
        return linkedHashMap;
    }

    public static final int Ag(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(Long.valueOf(jArr[length])).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final String Ah(@n6.d float[] fArr, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Float, ? extends CharSequence> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) ih(fArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.e
    public static final Integer Ai(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Float Aj(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        int Ue = Ue(fArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Ak(double[] dArr, t4.l<? super Double, Double> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Double.valueOf(dArr[0])).doubleValue();
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Double.valueOf(dArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    @n6.d
    public static final <T extends Comparable<? super T>> T Al(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t6 = tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t7 = tArr[it.b()];
            if (t6.compareTo(t7) < 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float Am(long[] jArr, t4.l<? super Long, Float> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Long.valueOf(jArr[0])).floatValue();
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Long.valueOf(jArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R An(float[] fArr, Comparator<? super R> comparator, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Float.valueOf(fArr[0]));
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Float.valueOf(fArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean Ao(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr.length == 0;
    }

    @v3.g1(version = "1.3")
    public static final short Ap(@n6.d short[] sArr, @n6.d b5.f fVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(fVar, "random");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[fVar.m(sArr.length)];
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Float Aq(@n6.d float[] fArr, @n6.d t4.p<? super Float, ? super Float, Float> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            f7 = pVar.J(Float.valueOf(f7), Float.valueOf(fArr[it.b()])).floatValue();
        }
        return Float.valueOf(f7);
    }

    public static final void Ar(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        int length = (jArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int We = We(jArr);
        s0 it = new d5.l(0, length).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            long j7 = jArr[b7];
            jArr[b7] = jArr[We];
            jArr[We] = j7;
            We--;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Boolean> As(boolean[] zArr, t4.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (zArr.length == 0) {
            return x3.w.E();
        }
        boolean z6 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z6));
        int length = zArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            z6 = pVar.J(Boolean.valueOf(z6), Boolean.valueOf(zArr[i7])).booleanValue();
            arrayList.add(Boolean.valueOf(z6));
        }
        return arrayList;
    }

    public static final double At(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Double d7 = null;
        boolean z6 = false;
        for (double d8 : dArr) {
            if (lVar.O(Double.valueOf(d8)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                d7 = Double.valueOf(d8);
                z6 = true;
            }
        }
        if (z6) {
            u4.l0.n(d7, "null cannot be cast to non-null type kotlin.Double");
            return d7.doubleValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final char[] Au(@n6.d char[] cArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(collection, "indices");
        char[] cArr2 = new char[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            cArr2[i7] = cArr[it.next().intValue()];
            i7++;
        }
        return cArr2;
    }

    @n6.d
    public static final float[] Av(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        Xu(copyOf);
        return copyOf;
    }

    public static final int Aw(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        int i7 = 0;
        for (byte b7 : bArr) {
            i7 += b7;
        }
        return i7;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final long Ax(short[] sArr, t4.l<? super Short, Long> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        long j7 = 0;
        for (short s6 : sArr) {
            j7 += lVar.O(Short.valueOf(s6)).longValue();
        }
        return j7;
    }

    @n6.d
    public static final List<Float> Ay(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f7 : fArr) {
            if (!lVar.O(Float.valueOf(f7)).booleanValue()) {
                break;
            }
            arrayList.add(Float.valueOf(f7));
        }
        return arrayList;
    }

    @n6.d
    public static final Set<Float> Az(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return (Set) My(fArr, new LinkedHashSet(z0.j(fArr.length)));
    }

    public static final <T> boolean B5(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (T t6 : tArr) {
            if (!lVar.O(t6).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <K> Map<K, Double> B6(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends K> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(dArr.length), 16));
        for (double d7 : dArr) {
            linkedHashMap.put(lVar.O(Double.valueOf(d7)), Double.valueOf(d7));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V, M extends Map<? super Double, ? super V>> M B7(double[] dArr, M m7, t4.l<? super Double, ? extends V> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        for (double d7 : dArr) {
            m7.put(Double.valueOf(d7), lVar.O(Double.valueOf(d7)));
        }
        return m7;
    }

    @k4.f
    public static final <T> T B8(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr[3];
    }

    @n6.d
    public static final <K> List<Integer> B9(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends K> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (hashSet.add(lVar.O(Integer.valueOf(i7)))) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <R, V> List<V> BA(@n6.d float[] fArr, @n6.d Iterable<? extends R> iterable, @n6.d t4.p<? super Float, ? super R, ? extends V> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(iterable, "other");
        u4.l0.p(pVar, "transform");
        int length = fArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(Float.valueOf(fArr[i7]), obj));
            i7++;
        }
        return arrayList;
    }

    @k4.f
    public static final Character Ba(char[] cArr, int i7) {
        u4.l0.p(cArr, "<this>");
        return lf(cArr, i7);
    }

    @n6.d
    public static final <C extends Collection<? super Long>> C Bb(@n6.d long[] jArr, @n6.d C c7, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (long j7 : jArr) {
            if (!lVar.O(Long.valueOf(j7)).booleanValue()) {
                c7.add(Long.valueOf(j7));
            }
        }
        return c7;
    }

    @n6.e
    public static final Boolean Bc(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (boolean z6 : zArr) {
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                return Boolean.valueOf(z6);
            }
        }
        return null;
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C Bd(@n6.d int[] iArr, @n6.d C c7, @n6.d t4.l<? super Integer, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (int i7 : iArr) {
            x3.b0.o0(c7, lVar.O(Integer.valueOf(i7)));
        }
        return c7;
    }

    public static final void Be(@n6.d double[] dArr, @n6.d t4.p<? super Integer, ? super Double, m2> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = dArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Double.valueOf(dArr[i7]));
            i7++;
            i8++;
        }
    }

    @n6.d
    public static final <K, V> Map<K, List<V>> Bf(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends K> lVar, @n6.d t4.l<? super Integer, ? extends V> lVar2) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i7 : iArr) {
            K O = lVar.O(Integer.valueOf(i7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(Integer.valueOf(i7)));
        }
        return linkedHashMap;
    }

    public static final <T> int Bg(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(tArr[length]).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final String Bh(@n6.d int[] iArr, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Integer, ? extends CharSequence> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) jh(iArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.e
    public static final Integer Bi(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            int i8 = iArr[length];
            if (lVar.O(Integer.valueOf(i8)).booleanValue()) {
                return Integer.valueOf(i8);
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Integer Bj(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        int Ve = Ve(iArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Bk(float[] fArr, t4.l<? super Float, Double> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Float.valueOf(fArr[0])).doubleValue();
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Float.valueOf(fArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final short Bl(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            if (s6 < s7) {
                s6 = s7;
            }
        }
        return s6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> float Bm(T[] tArr, t4.l<? super T, Float> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(tArr[0]).floatValue();
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(tArr[it.b()]).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Bn(int[] iArr, Comparator<? super R> comparator, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Integer.valueOf(iArr[0]));
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Integer.valueOf(iArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean Bo(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final boolean Bp(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return Cp(zArr, b5.f.f7260k);
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Integer Bq(@n6.d int[] iArr, @n6.d t4.p<? super Integer, ? super Integer, Integer> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            i7 = pVar.J(Integer.valueOf(i7), Integer.valueOf(iArr[it.b()])).intValue();
        }
        return Integer.valueOf(i7);
    }

    @v3.g1(version = "1.4")
    public static final void Br(@n6.d long[] jArr, int i7, int i8) {
        u4.l0.p(jArr, "<this>");
        x3.c.f18278k.d(i7, i8, jArr.length);
        int i9 = (i7 + i8) / 2;
        if (i7 == i9) {
            return;
        }
        int i10 = i8 - 1;
        while (i7 < i9) {
            long j7 = jArr[i7];
            jArr[i7] = jArr[i10];
            jArr[i10] = j7;
            i10--;
            i7++;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Byte> Bs(byte[] bArr, t4.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (bArr.length == 0) {
            return x3.w.E();
        }
        byte b7 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b7));
        int length = bArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            b7 = qVar.I(Integer.valueOf(i7), Byte.valueOf(b7), Byte.valueOf(bArr[i7])).byteValue();
            arrayList.add(Byte.valueOf(b7));
        }
        return arrayList;
    }

    public static final float Bt(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length == 1) {
                return fArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @n6.d
    public static final double[] Bu(@n6.d double[] dArr, @n6.d d5.l lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? new double[0] : x3.o.I1(dArr, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final int[] Bv(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        Zu(copyOf);
        return copyOf;
    }

    public static final int Bw(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += i8;
        }
        return i7;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final long Bx(boolean[] zArr, t4.l<? super Boolean, Long> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        long j7 = 0;
        for (boolean z6 : zArr) {
            j7 += lVar.O(Boolean.valueOf(z6)).longValue();
        }
        return j7;
    }

    @n6.d
    public static final List<Integer> By(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (!lVar.O(Integer.valueOf(i7)).booleanValue()) {
                break;
            }
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList;
    }

    @n6.d
    public static final Set<Integer> Bz(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return (Set) Ny(iArr, new LinkedHashSet(z0.j(iArr.length)));
    }

    public static final boolean C5(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (short s6 : sArr) {
            if (!lVar.O(Short.valueOf(s6)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <K, V> Map<K, V> C6(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends K> lVar, @n6.d t4.l<? super Double, ? extends V> lVar2) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(dArr.length), 16));
        for (double d7 : dArr) {
            linkedHashMap.put(lVar.O(Double.valueOf(d7)), lVar2.O(Double.valueOf(d7)));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V, M extends Map<? super Float, ? super V>> M C7(float[] fArr, M m7, t4.l<? super Float, ? extends V> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        for (float f7 : fArr) {
            m7.put(Float.valueOf(f7), lVar.O(Float.valueOf(f7)));
        }
        return m7;
    }

    @k4.f
    public static final short C8(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr[3];
    }

    @n6.d
    public static final <K> List<Long> C9(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends K> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (long j7 : jArr) {
            if (hashSet.add(lVar.O(Long.valueOf(j7)))) {
                arrayList.add(Long.valueOf(j7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final List<v3.u0<Float, Float>> CA(@n6.d float[] fArr, @n6.d float[] fArr2) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(fArr2, "other");
        int min = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(v3.q1.a(Float.valueOf(fArr[i7]), Float.valueOf(fArr2[i7])));
        }
        return arrayList;
    }

    @k4.f
    public static final Double Ca(double[] dArr, int i7) {
        u4.l0.p(dArr, "<this>");
        return mf(dArr, i7);
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C Cb(@n6.d T[] tArr, @n6.d C c7, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (T t6 : tArr) {
            if (!lVar.O(t6).booleanValue()) {
                c7.add(t6);
            }
        }
        return c7;
    }

    @n6.e
    public static final Byte Cc(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C Cd(@n6.d long[] jArr, @n6.d C c7, @n6.d t4.l<? super Long, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (long j7 : jArr) {
            x3.b0.o0(c7, lVar.O(Long.valueOf(j7)));
        }
        return c7;
    }

    public static final void Ce(@n6.d float[] fArr, @n6.d t4.p<? super Integer, ? super Float, m2> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Float.valueOf(fArr[i7]));
            i7++;
            i8++;
        }
    }

    @n6.d
    public static final <K> Map<K, List<Long>> Cf(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends K> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j7 : jArr) {
            K O = lVar.O(Long.valueOf(j7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(Long.valueOf(j7));
        }
        return linkedHashMap;
    }

    public static final int Cg(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(Short.valueOf(sArr[length])).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final String Ch(@n6.d long[] jArr, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Long, ? extends CharSequence> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) kh(jArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.e
    public static final Long Ci(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[jArr.length - 1]);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Long Cj(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        int We = We(jArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Ck(int[] iArr, t4.l<? super Integer, Double> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Integer.valueOf(iArr[0])).doubleValue();
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Integer.valueOf(iArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Boolean Cl(@n6.d boolean[] zArr, @n6.d Comparator<? super Boolean> comparator) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z6 = zArr[0];
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            boolean z7 = zArr[it.b()];
            if (comparator.compare(Boolean.valueOf(z6), Boolean.valueOf(z7)) < 0) {
                z6 = z7;
            }
        }
        return Boolean.valueOf(z6);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float Cm(short[] sArr, t4.l<? super Short, Float> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Short.valueOf(sArr[0])).floatValue();
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Short.valueOf(sArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Cn(long[] jArr, Comparator<? super R> comparator, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Long.valueOf(jArr[0]));
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Long.valueOf(jArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean Co(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr.length == 0;
    }

    @v3.g1(version = "1.3")
    public static final boolean Cp(@n6.d boolean[] zArr, @n6.d b5.f fVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(fVar, "random");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[fVar.m(zArr.length)];
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Long Cq(@n6.d long[] jArr, @n6.d t4.p<? super Long, ? super Long, Long> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            j7 = pVar.J(Long.valueOf(j7), Long.valueOf(jArr[it.b()])).longValue();
        }
        return Long.valueOf(j7);
    }

    public static final <T> void Cr(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Xe = Xe(tArr);
        s0 it = new d5.l(0, length).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            T t6 = tArr[b7];
            tArr[b7] = tArr[Xe];
            tArr[Xe] = t6;
            Xe--;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Character> Cs(char[] cArr, t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (cArr.length == 0) {
            return x3.w.E();
        }
        char c7 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c7));
        int length = cArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            c7 = qVar.I(Integer.valueOf(i7), Character.valueOf(c7), Character.valueOf(cArr[i7])).charValue();
            arrayList.add(Character.valueOf(c7));
        }
        return arrayList;
    }

    public static final float Ct(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Float f7 = null;
        boolean z6 = false;
        for (float f8 : fArr) {
            if (lVar.O(Float.valueOf(f8)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                f7 = Float.valueOf(f8);
                z6 = true;
            }
        }
        if (z6) {
            u4.l0.n(f7, "null cannot be cast to non-null type kotlin.Float");
            return f7.floatValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final double[] Cu(@n6.d double[] dArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(collection, "indices");
        double[] dArr2 = new double[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            dArr2[i7] = dArr[it.next().intValue()];
            i7++;
        }
        return dArr2;
    }

    @n6.d
    public static final long[] Cv(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        bv(copyOf);
        return copyOf;
    }

    public static final int Cw(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        int i7 = 0;
        for (short s6 : sArr) {
            i7 += s6;
        }
        return i7;
    }

    @s4.h(name = "sumOfShort")
    public static final int Cx(@n6.d Short[] shArr) {
        u4.l0.p(shArr, "<this>");
        int i7 = 0;
        for (Short sh : shArr) {
            i7 += sh.shortValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Long> Cy(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j7 : jArr) {
            if (!lVar.O(Long.valueOf(j7)).booleanValue()) {
                break;
            }
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    @n6.d
    public static final Set<Long> Cz(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return (Set) Oy(jArr, new LinkedHashSet(z0.j(jArr.length)));
    }

    public static final boolean D5(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (boolean z6 : zArr) {
            if (!lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <K> Map<K, Float> D6(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends K> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(fArr.length), 16));
        for (float f7 : fArr) {
            linkedHashMap.put(lVar.O(Float.valueOf(f7)), Float.valueOf(f7));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V, M extends Map<? super Integer, ? super V>> M D7(int[] iArr, M m7, t4.l<? super Integer, ? extends V> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        for (int i7 : iArr) {
            m7.put(Integer.valueOf(i7), lVar.O(Integer.valueOf(i7)));
        }
        return m7;
    }

    @k4.f
    public static final boolean D8(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr[3];
    }

    @n6.d
    public static final <T, K> List<T> D9(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t6 : tArr) {
            if (hashSet.add(lVar.O(t6))) {
                arrayList.add(t6);
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <V> List<V> DA(@n6.d float[] fArr, @n6.d float[] fArr2, @n6.d t4.p<? super Float, ? super Float, ? extends V> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(fArr2, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(fArr.length, fArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Float.valueOf(fArr[i7]), Float.valueOf(fArr2[i7])));
        }
        return arrayList;
    }

    @k4.f
    public static final Float Da(float[] fArr, int i7) {
        u4.l0.p(fArr, "<this>");
        return nf(fArr, i7);
    }

    @n6.d
    public static final <C extends Collection<? super Short>> C Db(@n6.d short[] sArr, @n6.d C c7, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (short s6 : sArr) {
            if (!lVar.O(Short.valueOf(s6)).booleanValue()) {
                c7.add(Short.valueOf(s6));
            }
        }
        return c7;
    }

    @n6.e
    public static final Byte Dc(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (byte b7 : bArr) {
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                return Byte.valueOf(b7);
            }
        }
        return null;
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C Dd(@n6.d T[] tArr, @n6.d C c7, @n6.d t4.l<? super T, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (T t6 : tArr) {
            x3.b0.o0(c7, lVar.O(t6));
        }
        return c7;
    }

    public static final void De(@n6.d int[] iArr, @n6.d t4.p<? super Integer, ? super Integer, m2> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Integer.valueOf(iArr[i7]));
            i7++;
            i8++;
        }
    }

    @n6.d
    public static final <K, V> Map<K, List<V>> Df(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends K> lVar, @n6.d t4.l<? super Long, ? extends V> lVar2) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (long j7 : jArr) {
            K O = lVar.O(Long.valueOf(j7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(Long.valueOf(j7)));
        }
        return linkedHashMap;
    }

    public static final int Dg(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(Boolean.valueOf(zArr[length])).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <T> String Dh(@n6.d T[] tArr, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super T, ? extends CharSequence> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) lh(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.e
    public static final Long Di(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            long j7 = jArr[length];
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                return Long.valueOf(j7);
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <T, R extends Comparable<? super R>> T Dj(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t6 = tArr[0];
        int Xe = Xe(tArr);
        if (Xe == 0) {
            return t6;
        }
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
        return t6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Dk(long[] jArr, t4.l<? super Long, Double> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Long.valueOf(jArr[0])).doubleValue();
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Long.valueOf(jArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Byte Dl(@n6.d byte[] bArr, @n6.d Comparator<? super Byte> comparator) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            if (comparator.compare(Byte.valueOf(b7), Byte.valueOf(b8)) < 0) {
                b7 = b8;
            }
        }
        return Byte.valueOf(b7);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float Dm(boolean[] zArr, t4.l<? super Boolean, Float> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Boolean.valueOf(zArr[0])).floatValue();
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Boolean.valueOf(zArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> R Dn(T[] tArr, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(tArr[0]);
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(tArr[it.b()]);
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean Do(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Boolean Dp(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return Ep(zArr, b5.f.f7260k);
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <S, T extends S> S Dq(@n6.d T[] tArr, @n6.d t4.p<? super S, ? super T, ? extends S> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (S) tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            obj = (S) pVar.J(obj, (Object) tArr[it.b()]);
        }
        return (S) obj;
    }

    @v3.g1(version = "1.4")
    public static final <T> void Dr(@n6.d T[] tArr, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        x3.c.f18278k.d(i7, i8, tArr.length);
        int i9 = (i7 + i8) / 2;
        if (i7 == i9) {
            return;
        }
        int i10 = i8 - 1;
        while (i7 < i9) {
            T t6 = tArr[i7];
            tArr[i7] = tArr[i10];
            tArr[i10] = t6;
            i10--;
            i7++;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Double> Ds(double[] dArr, t4.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (dArr.length == 0) {
            return x3.w.E();
        }
        double d7 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d7));
        int length = dArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            d7 = qVar.I(Integer.valueOf(i7), Double.valueOf(d7), Double.valueOf(dArr[i7])).doubleValue();
            arrayList.add(Double.valueOf(d7));
        }
        return arrayList;
    }

    public static final int Dt(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length == 1) {
                return iArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @n6.d
    public static final float[] Du(@n6.d float[] fArr, @n6.d d5.l lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? new float[0] : x3.o.J1(fArr, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final <T extends Comparable<? super T>> T[] Dv(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        x3.o.I4(tArr2, b4.g.x());
        return tArr2;
    }

    public static final long Dw(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        long j7 = 0;
        for (long j8 : jArr) {
            j7 += j8;
        }
        return j7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int Dx(byte[] bArr, t4.l<? super Byte, x1> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (byte b7 : bArr) {
            l7 = x1.l(l7 + lVar.O(Byte.valueOf(b7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final <T> List<T> Dy(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t6 : tArr) {
            if (!lVar.O(t6).booleanValue()) {
                break;
            }
            arrayList.add(t6);
        }
        return arrayList;
    }

    @n6.d
    public static final <T> Set<T> Dz(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return (Set) Py(tArr, new LinkedHashSet(z0.j(tArr.length)));
    }

    public static final boolean E5(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    @n6.d
    public static final <K, V> Map<K, V> E6(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends K> lVar, @n6.d t4.l<? super Float, ? extends V> lVar2) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(fArr.length), 16));
        for (float f7 : fArr) {
            linkedHashMap.put(lVar.O(Float.valueOf(f7)), lVar2.O(Float.valueOf(f7)));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V, M extends Map<? super Long, ? super V>> M E7(long[] jArr, M m7, t4.l<? super Long, ? extends V> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        for (long j7 : jArr) {
            m7.put(Long.valueOf(j7), lVar.O(Long.valueOf(j7)));
        }
        return m7;
    }

    @k4.f
    public static final byte E8(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr[4];
    }

    @n6.d
    public static final <K> List<Short> E9(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends K> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (short s6 : sArr) {
            if (hashSet.add(lVar.O(Short.valueOf(s6)))) {
                arrayList.add(Short.valueOf(s6));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <R> List<v3.u0<Float, R>> EA(@n6.d float[] fArr, @n6.d R[] rArr) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(rArr, "other");
        int min = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            float f7 = fArr[i7];
            arrayList.add(v3.q1.a(Float.valueOf(f7), rArr[i7]));
        }
        return arrayList;
    }

    @k4.f
    public static final Integer Ea(int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        return of(iArr, i7);
    }

    @n6.d
    public static final <C extends Collection<? super Boolean>> C Eb(@n6.d boolean[] zArr, @n6.d C c7, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (boolean z6 : zArr) {
            if (!lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                c7.add(Boolean.valueOf(z6));
            }
        }
        return c7;
    }

    @n6.e
    public static final Character Ec(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[0]);
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C Ed(@n6.d short[] sArr, @n6.d C c7, @n6.d t4.l<? super Short, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (short s6 : sArr) {
            x3.b0.o0(c7, lVar.O(Short.valueOf(s6)));
        }
        return c7;
    }

    public static final void Ee(@n6.d long[] jArr, @n6.d t4.p<? super Integer, ? super Long, m2> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = jArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Long.valueOf(jArr[i7]));
            i7++;
            i8++;
        }
    }

    @n6.d
    public static final <T, K> Map<K, List<T>> Ef(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t6 : tArr) {
            K O = lVar.O(t6);
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(t6);
        }
        return linkedHashMap;
    }

    @n6.d
    public static final Set<Byte> Eg(@n6.d byte[] bArr, @n6.d Iterable<Byte> iterable) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Byte> xz = xz(bArr);
        x3.b0.P0(xz, iterable);
        return xz;
    }

    @n6.d
    public static final String Eh(@n6.d short[] sArr, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Short, ? extends CharSequence> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) mh(sArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.e
    public static final <T> T Ei(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Short Ej(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        int Ye = Ye(sArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> Double Ek(T[] tArr, t4.l<? super T, Double> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(tArr[0]).doubleValue();
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(tArr[it.b()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Character El(@n6.d char[] cArr, @n6.d Comparator<? super Character> comparator) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            if (comparator.compare(Character.valueOf(c7), Character.valueOf(c8)) < 0) {
                c7 = c8;
            }
        }
        return Character.valueOf(c7);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Em(byte[] bArr, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Byte.valueOf(bArr[0]));
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Byte.valueOf(bArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R En(short[] sArr, Comparator<? super R> comparator, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Short.valueOf(sArr[0]));
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Short.valueOf(sArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final <T> boolean Eo(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr.length == 0;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Boolean Ep(@n6.d boolean[] zArr, @n6.d b5.f fVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(fVar, "random");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[fVar.m(zArr.length)]);
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Short Eq(@n6.d short[] sArr, @n6.d t4.p<? super Short, ? super Short, Short> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            s6 = pVar.J(Short.valueOf(s6), Short.valueOf(sArr[it.b()])).shortValue();
        }
        return Short.valueOf(s6);
    }

    public static final void Er(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        int length = (sArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Ye = Ye(sArr);
        s0 it = new d5.l(0, length).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            short s6 = sArr[b7];
            sArr[b7] = sArr[Ye];
            sArr[Ye] = s6;
            Ye--;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Float> Es(float[] fArr, t4.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (fArr.length == 0) {
            return x3.w.E();
        }
        float f7 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f7));
        int length = fArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            f7 = qVar.I(Integer.valueOf(i7), Float.valueOf(f7), Float.valueOf(fArr[i7])).floatValue();
            arrayList.add(Float.valueOf(f7));
        }
        return arrayList;
    }

    public static final int Et(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Integer num = null;
        boolean z6 = false;
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                num = Integer.valueOf(i7);
                z6 = true;
            }
        }
        if (z6) {
            u4.l0.n(num, "null cannot be cast to non-null type kotlin.Int");
            return num.intValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final float[] Eu(@n6.d float[] fArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(collection, "indices");
        float[] fArr2 = new float[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            fArr2[i7] = fArr[it.next().intValue()];
            i7++;
        }
        return fArr2;
    }

    @n6.d
    public static final short[] Ev(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        fv(copyOf);
        return copyOf;
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final int Ew(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Integer> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (byte b7 : bArr) {
            i7 += lVar.O(Byte.valueOf(b7)).intValue();
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int Ex(char[] cArr, t4.l<? super Character, x1> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (char c7 : cArr) {
            l7 = x1.l(l7 + lVar.O(Character.valueOf(c7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final List<Short> Ey(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s6 : sArr) {
            if (!lVar.O(Short.valueOf(s6)).booleanValue()) {
                break;
            }
            arrayList.add(Short.valueOf(s6));
        }
        return arrayList;
    }

    @n6.d
    public static final Set<Short> Ez(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return (Set) Qy(sArr, new LinkedHashSet(z0.j(sArr.length)));
    }

    public static final boolean F5(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (byte b7 : bArr) {
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final <K> Map<K, Integer> F6(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends K> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(iArr.length), 16));
        for (int i7 : iArr) {
            linkedHashMap.put(lVar.O(Integer.valueOf(i7)), Integer.valueOf(i7));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M F7(@n6.d K[] kArr, @n6.d M m7, @n6.d t4.l<? super K, ? extends V> lVar) {
        u4.l0.p(kArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        for (K k7 : kArr) {
            m7.put(k7, lVar.O(k7));
        }
        return m7;
    }

    @k4.f
    public static final char F8(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr[4];
    }

    @n6.d
    public static final <K> List<Boolean> F9(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends K> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (boolean z6 : zArr) {
            if (hashSet.add(lVar.O(Boolean.valueOf(z6)))) {
                arrayList.add(Boolean.valueOf(z6));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <R, V> List<V> FA(@n6.d float[] fArr, @n6.d R[] rArr, @n6.d t4.p<? super Float, ? super R, ? extends V> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(fArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Float.valueOf(fArr[i7]), rArr[i7]));
        }
        return arrayList;
    }

    @k4.f
    public static final Long Fa(long[] jArr, int i7) {
        u4.l0.p(jArr, "<this>");
        return pf(jArr, i7);
    }

    @n6.d
    public static final <C extends Collection<? super Byte>> C Fb(@n6.d byte[] bArr, @n6.d C c7, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (byte b7 : bArr) {
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                c7.add(Byte.valueOf(b7));
            }
        }
        return c7;
    }

    @n6.e
    public static final Character Fc(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                return Character.valueOf(c7);
            }
        }
        return null;
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C Fd(@n6.d boolean[] zArr, @n6.d C c7, @n6.d t4.l<? super Boolean, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (boolean z6 : zArr) {
            x3.b0.o0(c7, lVar.O(Boolean.valueOf(z6)));
        }
        return c7;
    }

    public static final <T> void Fe(@n6.d T[] tArr, @n6.d t4.p<? super Integer, ? super T, m2> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), tArr[i7]);
            i7++;
            i8++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T, K, V> Map<K, List<V>> Ff(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (b.a aVar : tArr) {
            K O = lVar.O(aVar);
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(aVar));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final Set<Character> Fg(@n6.d char[] cArr, @n6.d Iterable<Character> iterable) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Character> yz = yz(cArr);
        x3.b0.P0(yz, iterable);
        return yz;
    }

    @n6.d
    public static final String Fh(@n6.d boolean[] zArr, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Boolean, ? extends CharSequence> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) nh(zArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.e
    public static final <T> T Fi(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = tArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            T t6 = tArr[length];
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> byte Fj(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b7 = bArr[0];
        int Re = Re(bArr);
        if (Re == 0) {
            return b7;
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
        return b7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Fk(short[] sArr, t4.l<? super Short, Double> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Short.valueOf(sArr[0])).doubleValue();
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Short.valueOf(sArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Double Fl(@n6.d double[] dArr, @n6.d Comparator<? super Double> comparator) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            double d8 = dArr[it.b()];
            if (comparator.compare(Double.valueOf(d7), Double.valueOf(d8)) < 0) {
                d7 = d8;
            }
        }
        return Double.valueOf(d7);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Fm(char[] cArr, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Character.valueOf(cArr[0]));
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Character.valueOf(cArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Fn(boolean[] zArr, Comparator<? super R> comparator, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Boolean.valueOf(zArr[0]));
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Boolean.valueOf(zArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final <T> boolean Fo(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (T t6 : tArr) {
            if (lVar.O(t6).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Byte Fp(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return Gp(bArr, b5.f.f7260k);
    }

    public static final byte Fq(@n6.d byte[] bArr, @n6.d t4.p<? super Byte, ? super Byte, Byte> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Re = Re(bArr);
        if (Re >= 0) {
            byte b7 = bArr[Re];
            for (int i7 = Re - 1; i7 >= 0; i7--) {
                b7 = pVar.J(Byte.valueOf(bArr[i7]), Byte.valueOf(b7)).byteValue();
            }
            return b7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @v3.g1(version = "1.4")
    public static final void Fr(@n6.d short[] sArr, int i7, int i8) {
        u4.l0.p(sArr, "<this>");
        x3.c.f18278k.d(i7, i8, sArr.length);
        int i9 = (i7 + i8) / 2;
        if (i7 == i9) {
            return;
        }
        int i10 = i8 - 1;
        while (i7 < i9) {
            short s6 = sArr[i7];
            sArr[i7] = sArr[i10];
            sArr[i10] = s6;
            i10--;
            i7++;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Integer> Fs(int[] iArr, t4.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (iArr.length == 0) {
            return x3.w.E();
        }
        int i7 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i7));
        int length = iArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            i7 = qVar.I(Integer.valueOf(i8), Integer.valueOf(i7), Integer.valueOf(iArr[i8])).intValue();
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList;
    }

    public static final long Ft(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length == 1) {
                return jArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @n6.d
    public static final int[] Fu(@n6.d int[] iArr, @n6.d d5.l lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? new int[0] : x3.o.K1(iArr, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final <T> T[] Fv(@n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        u4.l0.o(tArr2, "copyOf(this, size)");
        x3.o.I4(tArr2, comparator);
        return tArr2;
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final int Fw(@n6.d char[] cArr, @n6.d t4.l<? super Character, Integer> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (char c7 : cArr) {
            i7 += lVar.O(Character.valueOf(c7)).intValue();
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int Fx(double[] dArr, t4.l<? super Double, x1> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (double d7 : dArr) {
            l7 = x1.l(l7 + lVar.O(Double.valueOf(d7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final List<Boolean> Fy(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z6 : zArr) {
            if (!lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                break;
            }
            arrayList.add(Boolean.valueOf(z6));
        }
        return arrayList;
    }

    @n6.d
    public static final Set<Boolean> Fz(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return (Set) Ry(zArr, new LinkedHashSet(z0.j(zArr.length)));
    }

    public static final boolean G5(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    @n6.d
    public static final <K, V> Map<K, V> G6(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends K> lVar, @n6.d t4.l<? super Integer, ? extends V> lVar2) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(iArr.length), 16));
        for (int i7 : iArr) {
            linkedHashMap.put(lVar.O(Integer.valueOf(i7)), lVar2.O(Integer.valueOf(i7)));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V, M extends Map<? super Short, ? super V>> M G7(short[] sArr, M m7, t4.l<? super Short, ? extends V> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        for (short s6 : sArr) {
            m7.put(Short.valueOf(s6), lVar.O(Short.valueOf(s6)));
        }
        return m7;
    }

    @k4.f
    public static final double G8(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr[4];
    }

    @n6.d
    public static final List<Byte> G9(@n6.d byte[] bArr, int i7) {
        u4.l0.p(bArr, "<this>");
        if (i7 >= 0) {
            return fy(bArr, d5.u.u(bArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R> List<v3.u0<Integer, R>> GA(@n6.d int[] iArr, @n6.d Iterable<? extends R> iterable) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iterable, "other");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(Integer.valueOf(iArr[i7]), r6));
            i7++;
        }
        return arrayList;
    }

    @k4.f
    public static final <T> T Ga(T[] tArr, int i7) {
        u4.l0.p(tArr, "<this>");
        return (T) qf(tArr, i7);
    }

    @n6.d
    public static final <C extends Collection<? super Character>> C Gb(@n6.d char[] cArr, @n6.d C c7, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (char c8 : cArr) {
            if (lVar.O(Character.valueOf(c8)).booleanValue()) {
                c7.add(Character.valueOf(c8));
            }
        }
        return c7;
    }

    @n6.e
    public static final Double Gc(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[0]);
    }

    public static final <R> R Gd(@n6.d byte[] bArr, R r6, @n6.d t4.p<? super R, ? super Byte, ? extends R> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (byte b7 : bArr) {
            r6 = pVar.J(r6, Byte.valueOf(b7));
        }
        return r6;
    }

    public static final void Ge(@n6.d short[] sArr, @n6.d t4.p<? super Integer, ? super Short, m2> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Short.valueOf(sArr[i7]));
            i7++;
            i8++;
        }
    }

    @n6.d
    public static final <K> Map<K, List<Short>> Gf(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends K> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s6 : sArr) {
            K O = lVar.O(Short.valueOf(s6));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(Short.valueOf(s6));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final Set<Double> Gg(@n6.d double[] dArr, @n6.d Iterable<Double> iterable) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Double> zz = zz(dArr);
        x3.b0.P0(zz, iterable);
        return zz;
    }

    public static /* synthetic */ String Gh(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return xh(bArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.e
    public static final Short Gi(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[sArr.length - 1]);
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> char Gj(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c7 = cArr[0];
        int Se = Se(cArr);
        if (Se == 0) {
            return c7;
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
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Gk(boolean[] zArr, t4.l<? super Boolean, Double> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Boolean.valueOf(zArr[0])).doubleValue();
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Boolean.valueOf(zArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float Gl(@n6.d float[] fArr, @n6.d Comparator<? super Float> comparator) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            float f8 = fArr[it.b()];
            if (comparator.compare(Float.valueOf(f7), Float.valueOf(f8)) < 0) {
                f7 = f8;
            }
        }
        return Float.valueOf(f7);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Gm(double[] dArr, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Double.valueOf(dArr[0]));
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Double.valueOf(dArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Byte Gn(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            if (b7 > b8) {
                b7 = b8;
            }
        }
        return Byte.valueOf(b7);
    }

    public static final boolean Go(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr.length == 0;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Byte Gp(@n6.d byte[] bArr, @n6.d b5.f fVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(fVar, "random");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[fVar.m(bArr.length)]);
    }

    public static final char Gq(@n6.d char[] cArr, @n6.d t4.p<? super Character, ? super Character, Character> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Se = Se(cArr);
        if (Se >= 0) {
            char c7 = cArr[Se];
            for (int i7 = Se - 1; i7 >= 0; i7--) {
                c7 = pVar.J(Character.valueOf(cArr[i7]), Character.valueOf(c7)).charValue();
            }
            return c7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    public static final void Gr(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        int length = (zArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Ze = Ze(zArr);
        s0 it = new d5.l(0, length).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            boolean z6 = zArr[b7];
            zArr[b7] = zArr[Ze];
            zArr[Ze] = z6;
            Ze--;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Long> Gs(long[] jArr, t4.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (jArr.length == 0) {
            return x3.w.E();
        }
        long j7 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j7));
        int length = jArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            j7 = qVar.I(Integer.valueOf(i7), Long.valueOf(j7), Long.valueOf(jArr[i7])).longValue();
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    public static final long Gt(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Long l7 = null;
        boolean z6 = false;
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                l7 = Long.valueOf(j7);
                z6 = true;
            }
        }
        if (z6) {
            u4.l0.n(l7, "null cannot be cast to non-null type kotlin.Long");
            return l7.longValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final int[] Gu(@n6.d int[] iArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(collection, "indices");
        int[] iArr2 = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr2[i7] = iArr[it.next().intValue()];
            i7++;
        }
        return iArr2;
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Byte> Gv(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        return gw(bArr, new g.a(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final int Gw(@n6.d double[] dArr, @n6.d t4.l<? super Double, Integer> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (double d7 : dArr) {
            i7 += lVar.O(Double.valueOf(d7)).intValue();
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int Gx(float[] fArr, t4.l<? super Float, x1> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (float f7 : fArr) {
            l7 = x1.l(l7 + lVar.O(Float.valueOf(f7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final boolean[] Gy(@n6.d Boolean[] boolArr) {
        u4.l0.p(boolArr, "<this>");
        int length = boolArr.length;
        boolean[] zArr = new boolean[length];
        for (int i7 = 0; i7 < length; i7++) {
            zArr[i7] = boolArr[i7].booleanValue();
        }
        return zArr;
    }

    @n6.d
    public static final Set<Byte> Gz(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? (Set) Jy(bArr, new LinkedHashSet(z0.j(bArr.length))) : k1.f(Byte.valueOf(bArr[0])) : l1.k();
    }

    public static final boolean H5(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final <K> Map<K, Long> H6(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends K> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(jArr.length), 16));
        for (long j7 : jArr) {
            linkedHashMap.put(lVar.O(Long.valueOf(j7)), Long.valueOf(j7));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V, M extends Map<? super Boolean, ? super V>> M H7(boolean[] zArr, M m7, t4.l<? super Boolean, ? extends V> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        for (boolean z6 : zArr) {
            m7.put(Boolean.valueOf(z6), lVar.O(Boolean.valueOf(z6)));
        }
        return m7;
    }

    @k4.f
    public static final float H8(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr[4];
    }

    @n6.d
    public static final List<Character> H9(@n6.d char[] cArr, int i7) {
        u4.l0.p(cArr, "<this>");
        if (i7 >= 0) {
            return gy(cArr, d5.u.u(cArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R, V> List<V> HA(@n6.d int[] iArr, @n6.d Iterable<? extends R> iterable, @n6.d t4.p<? super Integer, ? super R, ? extends V> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iterable, "other");
        u4.l0.p(pVar, "transform");
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(Integer.valueOf(iArr[i7]), obj));
            i7++;
        }
        return arrayList;
    }

    @k4.f
    public static final Short Ha(short[] sArr, int i7) {
        u4.l0.p(sArr, "<this>");
        return rf(sArr, i7);
    }

    @n6.d
    public static final <C extends Collection<? super Double>> C Hb(@n6.d double[] dArr, @n6.d C c7, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (double d7 : dArr) {
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                c7.add(Double.valueOf(d7));
            }
        }
        return c7;
    }

    @n6.e
    public static final Double Hc(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (double d7 : dArr) {
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                return Double.valueOf(d7);
            }
        }
        return null;
    }

    public static final <R> R Hd(@n6.d char[] cArr, R r6, @n6.d t4.p<? super R, ? super Character, ? extends R> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (char c7 : cArr) {
            r6 = pVar.J(r6, Character.valueOf(c7));
        }
        return r6;
    }

    public static final void He(@n6.d boolean[] zArr, @n6.d t4.p<? super Integer, ? super Boolean, m2> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Boolean.valueOf(zArr[i7]));
            i7++;
            i8++;
        }
    }

    @n6.d
    public static final <K, V> Map<K, List<V>> Hf(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends K> lVar, @n6.d t4.l<? super Short, ? extends V> lVar2) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (short s6 : sArr) {
            K O = lVar.O(Short.valueOf(s6));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(Short.valueOf(s6)));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final Set<Float> Hg(@n6.d float[] fArr, @n6.d Iterable<Float> iterable) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Float> Az = Az(fArr);
        x3.b0.P0(Az, iterable);
        return Az;
    }

    public static /* synthetic */ String Hh(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return yh(cArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.e
    public static final Short Hi(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            short s6 = sArr[length];
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                return Short.valueOf(s6);
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> double Hj(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d7 = dArr[0];
        int Te = Te(dArr);
        if (Te == 0) {
            return d7;
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
        return d7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float Hk(byte[] bArr, t4.l<? super Byte, Float> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Byte.valueOf(bArr[0])).floatValue();
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Byte.valueOf(bArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Integer Hl(@n6.d int[] iArr, @n6.d Comparator<? super Integer> comparator) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            if (comparator.compare(Integer.valueOf(i7), Integer.valueOf(i8)) < 0) {
                i7 = i8;
            }
        }
        return Integer.valueOf(i7);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Hm(float[] fArr, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Float.valueOf(fArr[0]));
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Float.valueOf(fArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Character Hn(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            if (u4.l0.t(c7, c8) > 0) {
                c7 = c8;
            }
        }
        return Character.valueOf(c7);
    }

    public static final boolean Ho(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Character Hp(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return Ip(cArr, b5.f.f7260k);
    }

    public static final double Hq(@n6.d double[] dArr, @n6.d t4.p<? super Double, ? super Double, Double> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Te = Te(dArr);
        if (Te >= 0) {
            double d7 = dArr[Te];
            for (int i7 = Te - 1; i7 >= 0; i7--) {
                d7 = pVar.J(Double.valueOf(dArr[i7]), Double.valueOf(d7)).doubleValue();
            }
            return d7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @v3.g1(version = "1.4")
    public static final void Hr(@n6.d boolean[] zArr, int i7, int i8) {
        u4.l0.p(zArr, "<this>");
        x3.c.f18278k.d(i7, i8, zArr.length);
        int i9 = (i7 + i8) / 2;
        if (i7 == i9) {
            return;
        }
        int i10 = i8 - 1;
        while (i7 < i9) {
            boolean z6 = zArr[i7];
            zArr[i7] = zArr[i10];
            zArr[i10] = z6;
            i10--;
            i7++;
        }
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <S, T extends S> List<S> Hs(@n6.d T[] tArr, @n6.d t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (tArr.length == 0) {
            return x3.w.E();
        }
        S s6 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s6);
        int length = tArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            s6 = qVar.I(Integer.valueOf(i7), s6, (Object) tArr[i7]);
            arrayList.add(s6);
        }
        return arrayList;
    }

    public static final <T> T Ht(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @n6.d
    public static final long[] Hu(@n6.d long[] jArr, @n6.d d5.l lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? new long[0] : x3.o.L1(jArr, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Character> Hv(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        return hw(cArr, new g.a(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final int Hw(@n6.d float[] fArr, @n6.d t4.l<? super Float, Integer> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (float f7 : fArr) {
            i7 += lVar.O(Float.valueOf(f7)).intValue();
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int Hx(int[] iArr, t4.l<? super Integer, x1> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (int i7 : iArr) {
            l7 = x1.l(l7 + lVar.O(Integer.valueOf(i7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final byte[] Hy(@n6.d Byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr2[i7] = bArr[i7].byteValue();
        }
        return bArr2;
    }

    @n6.d
    public static final Set<Character> Hz(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? (Set) Ky(cArr, new LinkedHashSet(z0.j(d5.u.B(cArr.length, 128)))) : k1.f(Character.valueOf(cArr[0])) : l1.k();
    }

    public static final boolean I5(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    @n6.d
    public static final <K, V> Map<K, V> I6(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends K> lVar, @n6.d t4.l<? super Long, ? extends V> lVar2) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(jArr.length), 16));
        for (long j7 : jArr) {
            linkedHashMap.put(lVar.O(Long.valueOf(j7)), lVar2.O(Long.valueOf(j7)));
        }
        return linkedHashMap;
    }

    public static final double I7(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (byte b7 : bArr) {
            d7 += b7;
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @k4.f
    public static final int I8(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr[4];
    }

    @n6.d
    public static final List<Double> I9(@n6.d double[] dArr, int i7) {
        u4.l0.p(dArr, "<this>");
        if (i7 >= 0) {
            return hy(dArr, d5.u.u(dArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final List<v3.u0<Integer, Integer>> IA(@n6.d int[] iArr, @n6.d int[] iArr2) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iArr2, "other");
        int min = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(v3.q1.a(Integer.valueOf(iArr[i7]), Integer.valueOf(iArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Byte> Ia(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b7 : bArr) {
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                arrayList.add(Byte.valueOf(b7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <C extends Collection<? super Float>> C Ib(@n6.d float[] fArr, @n6.d C c7, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (float f7 : fArr) {
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                c7.add(Float.valueOf(f7));
            }
        }
        return c7;
    }

    @n6.e
    public static final Float Ic(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static final <R> R Id(@n6.d double[] dArr, R r6, @n6.d t4.p<? super R, ? super Double, ? extends R> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (double d7 : dArr) {
            r6 = pVar.J(r6, Double.valueOf(d7));
        }
        return r6;
    }

    @n6.d
    public static final d5.l Ie(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return new d5.l(0, Re(bArr));
    }

    @n6.d
    public static final <K> Map<K, List<Boolean>> If(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends K> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z6 : zArr) {
            K O = lVar.O(Boolean.valueOf(z6));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(Boolean.valueOf(z6));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final Set<Integer> Ig(@n6.d int[] iArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Integer> Bz = Bz(iArr);
        x3.b0.P0(Bz, iterable);
        return Bz;
    }

    public static /* synthetic */ String Ih(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return zh(dArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.d
    public static final <R> List<R> Ii(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b7 : bArr) {
            arrayList.add(lVar.O(Byte.valueOf(b7)));
        }
        return arrayList;
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> float Ij(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f7 = fArr[0];
        int Ue = Ue(fArr);
        if (Ue == 0) {
            return f7;
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
        return f7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float Ik(char[] cArr, t4.l<? super Character, Float> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Character.valueOf(cArr[0])).floatValue();
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Character.valueOf(cArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Long Il(@n6.d long[] jArr, @n6.d Comparator<? super Long> comparator) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            if (comparator.compare(Long.valueOf(j7), Long.valueOf(j8)) < 0) {
                j7 = j8;
            }
        }
        return Long.valueOf(j7);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Im(int[] iArr, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Integer.valueOf(iArr[0]));
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Integer.valueOf(iArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <T extends Comparable<? super T>> T In(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t6 = tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t7 = tArr[it.b()];
            if (t6.compareTo(t7) > 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    public static final boolean Io(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr.length == 0;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Character Ip(@n6.d char[] cArr, @n6.d b5.f fVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(fVar, "random");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[fVar.m(cArr.length)]);
    }

    public static final float Iq(@n6.d float[] fArr, @n6.d t4.p<? super Float, ? super Float, Float> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Ue = Ue(fArr);
        if (Ue >= 0) {
            float f7 = fArr[Ue];
            for (int i7 = Ue - 1; i7 >= 0; i7--) {
                f7 = pVar.J(Float.valueOf(fArr[i7]), Float.valueOf(f7)).floatValue();
            }
            return f7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final List<Byte> Ir(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return x3.w.E();
        }
        List<Byte> oz = oz(bArr);
        d0.m1(oz);
        return oz;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Short> Is(short[] sArr, t4.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (sArr.length == 0) {
            return x3.w.E();
        }
        short s6 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s6));
        int length = sArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            s6 = qVar.I(Integer.valueOf(i7), Short.valueOf(s6), Short.valueOf(sArr[i7])).shortValue();
            arrayList.add(Short.valueOf(s6));
        }
        return arrayList;
    }

    public static final <T> T It(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        T t6 = null;
        boolean z6 = false;
        for (T t7 : tArr) {
            if (lVar.O(t7).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                z6 = true;
                t6 = t7;
            }
        }
        if (z6) {
            return t6;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final long[] Iu(@n6.d long[] jArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(collection, "indices");
        long[] jArr2 = new long[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr2[i7] = jArr[it.next().intValue()];
            i7++;
        }
        return jArr2;
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Double> Iv(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        return iw(dArr, new g.a(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final int Iw(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Integer> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += lVar.O(Integer.valueOf(i8)).intValue();
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int Ix(long[] jArr, t4.l<? super Long, x1> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (long j7 : jArr) {
            l7 = x1.l(l7 + lVar.O(Long.valueOf(j7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final char[] Iy(@n6.d Character[] chArr) {
        u4.l0.p(chArr, "<this>");
        int length = chArr.length;
        char[] cArr = new char[length];
        for (int i7 = 0; i7 < length; i7++) {
            cArr[i7] = chArr[i7].charValue();
        }
        return cArr;
    }

    @n6.d
    public static final Set<Double> Iz(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? (Set) Ly(dArr, new LinkedHashSet(z0.j(dArr.length))) : k1.f(Double.valueOf(dArr[0])) : l1.k();
    }

    public static final boolean J5(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (double d7 : dArr) {
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final <T, K> Map<K, T> J6(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(tArr.length), 16));
        for (T t6 : tArr) {
            linkedHashMap.put(lVar.O(t6), t6);
        }
        return linkedHashMap;
    }

    public static final double J7(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (double d8 : dArr) {
            d7 += d8;
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @k4.f
    public static final long J8(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr[4];
    }

    @n6.d
    public static final List<Float> J9(@n6.d float[] fArr, int i7) {
        u4.l0.p(fArr, "<this>");
        if (i7 >= 0) {
            return iy(fArr, d5.u.u(fArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <V> List<V> JA(@n6.d int[] iArr, @n6.d int[] iArr2, @n6.d t4.p<? super Integer, ? super Integer, ? extends V> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iArr2, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(iArr.length, iArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Integer.valueOf(iArr[i7]), Integer.valueOf(iArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Character> Ja(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                arrayList.add(Character.valueOf(c7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <C extends Collection<? super Integer>> C Jb(@n6.d int[] iArr, @n6.d C c7, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                c7.add(Integer.valueOf(i7));
            }
        }
        return c7;
    }

    @n6.e
    public static final Float Jc(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (float f7 : fArr) {
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                return Float.valueOf(f7);
            }
        }
        return null;
    }

    public static final <R> R Jd(@n6.d float[] fArr, R r6, @n6.d t4.p<? super R, ? super Float, ? extends R> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (float f7 : fArr) {
            r6 = pVar.J(r6, Float.valueOf(f7));
        }
        return r6;
    }

    @n6.d
    public static final d5.l Je(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return new d5.l(0, Se(cArr));
    }

    @n6.d
    public static final <K, V> Map<K, List<V>> Jf(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends K> lVar, @n6.d t4.l<? super Boolean, ? extends V> lVar2) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (boolean z6 : zArr) {
            K O = lVar.O(Boolean.valueOf(z6));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(Boolean.valueOf(z6)));
        }
        return linkedHashMap;
    }

    @n6.d
    public static final Set<Long> Jg(@n6.d long[] jArr, @n6.d Iterable<Long> iterable) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Long> Cz = Cz(jArr);
        x3.b0.P0(Cz, iterable);
        return Cz;
    }

    public static /* synthetic */ String Jh(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return Ah(fArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.d
    public static final <R> List<R> Ji(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c7 : cArr) {
            arrayList.add(lVar.O(Character.valueOf(c7)));
        }
        return arrayList;
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> int Jj(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i7 = iArr[0];
        int Ve = Ve(iArr);
        if (Ve == 0) {
            return i7;
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
        return i7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float Jk(double[] dArr, t4.l<? super Double, Float> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Double.valueOf(dArr[0])).floatValue();
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Double.valueOf(dArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <T> T Jl(@n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t6 = tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t7 = tArr[it.b()];
            if (comparator.compare(t6, t7) < 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Jm(long[] jArr, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Long.valueOf(jArr[0]));
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Long.valueOf(jArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Double Jn(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            d7 = Math.min(d7, dArr[it.b()]);
        }
        return Double.valueOf(d7);
    }

    public static final boolean Jo(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (boolean z6 : zArr) {
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Double Jp(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return Kp(dArr, b5.f.f7260k);
    }

    public static final int Jq(@n6.d int[] iArr, @n6.d t4.p<? super Integer, ? super Integer, Integer> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Ve = Ve(iArr);
        if (Ve >= 0) {
            int i7 = iArr[Ve];
            for (int i8 = Ve - 1; i8 >= 0; i8--) {
                i7 = pVar.J(Integer.valueOf(iArr[i8]), Integer.valueOf(i7)).intValue();
            }
            return i7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final List<Character> Jr(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return x3.w.E();
        }
        List<Character> pz = pz(cArr);
        d0.m1(pz);
        return pz;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Boolean> Js(boolean[] zArr, t4.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (zArr.length == 0) {
            return x3.w.E();
        }
        boolean z6 = zArr[0];
        ArrayList arrayList = new ArrayList(zArr.length);
        arrayList.add(Boolean.valueOf(z6));
        int length = zArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            z6 = qVar.I(Integer.valueOf(i7), Boolean.valueOf(z6), Boolean.valueOf(zArr[i7])).booleanValue();
            arrayList.add(Boolean.valueOf(z6));
        }
        return arrayList;
    }

    public static final short Jt(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            if (length == 1) {
                return sArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @n6.d
    public static final <T> T[] Ju(@n6.d T[] tArr, @n6.d d5.l lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? (T[]) x3.o.M1(tArr, 0, 0) : (T[]) x3.o.M1(tArr, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Float> Jv(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        return jw(fArr, new g.a(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final int Jw(@n6.d long[] jArr, @n6.d t4.l<? super Long, Integer> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (long j7 : jArr) {
            i7 += lVar.O(Long.valueOf(j7)).intValue();
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final <T> int Jx(T[] tArr, t4.l<? super T, x1> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (T t6 : tArr) {
            l7 = x1.l(l7 + lVar.O(t6).l0());
        }
        return l7;
    }

    @n6.d
    public static final <C extends Collection<? super Byte>> C Jy(@n6.d byte[] bArr, @n6.d C c7) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(c7, "destination");
        for (byte b7 : bArr) {
            c7.add(Byte.valueOf(b7));
        }
        return c7;
    }

    @n6.d
    public static final Set<Float> Jz(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? (Set) My(fArr, new LinkedHashSet(z0.j(fArr.length))) : k1.f(Float.valueOf(fArr[0])) : l1.k();
    }

    public static final boolean K5(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    @n6.d
    public static final <T, K, V> Map<K, V> K6(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(tArr.length), 16));
        for (T t6 : tArr) {
            linkedHashMap.put(lVar.O(t6), lVar2.O(t6));
        }
        return linkedHashMap;
    }

    public static final double K7(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (float f7 : fArr) {
            d7 += f7;
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @k4.f
    public static final <T> T K8(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr[4];
    }

    @n6.d
    public static final List<Integer> K9(@n6.d int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        if (i7 >= 0) {
            return jy(iArr, d5.u.u(iArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R> List<v3.u0<Integer, R>> KA(@n6.d int[] iArr, @n6.d R[] rArr) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(rArr, "other");
        int min = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            int i8 = iArr[i7];
            arrayList.add(v3.q1.a(Integer.valueOf(i8), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Double> Ka(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d7 : dArr) {
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                arrayList.add(Double.valueOf(d7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <C extends Collection<? super Long>> C Kb(@n6.d long[] jArr, @n6.d C c7, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                c7.add(Long.valueOf(j7));
            }
        }
        return c7;
    }

    @n6.e
    public static final Integer Kc(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static final <R> R Kd(@n6.d int[] iArr, R r6, @n6.d t4.p<? super R, ? super Integer, ? extends R> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int i7 : iArr) {
            r6 = pVar.J(r6, Integer.valueOf(i7));
        }
        return r6;
    }

    @n6.d
    public static final d5.l Ke(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return new d5.l(0, Te(dArr));
    }

    @n6.d
    public static final <K, M extends Map<? super K, List<Byte>>> M Kf(@n6.d byte[] bArr, @n6.d M m7, @n6.d t4.l<? super Byte, ? extends K> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (byte b7 : bArr) {
            K O = lVar.O(Byte.valueOf(b7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(Byte.valueOf(b7));
        }
        return m7;
    }

    @n6.d
    public static final <T> Set<T> Kg(@n6.d T[] tArr, @n6.d Iterable<? extends T> iterable) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<T> Dz = Dz(tArr);
        x3.b0.P0(Dz, iterable);
        return Dz;
    }

    public static /* synthetic */ String Kh(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return Bh(iArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.d
    public static final <R> List<R> Ki(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d7 : dArr) {
            arrayList.add(lVar.O(Double.valueOf(d7)));
        }
        return arrayList;
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> long Kj(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j7 = jArr[0];
        int We = We(jArr);
        if (We == 0) {
            return j7;
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
        return j7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float Kk(float[] fArr, t4.l<? super Float, Float> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Float.valueOf(fArr[0])).floatValue();
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Float.valueOf(fArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Short Kl(@n6.d short[] sArr, @n6.d Comparator<? super Short> comparator) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            if (comparator.compare(Short.valueOf(s6), Short.valueOf(s7)) < 0) {
                s6 = s7;
            }
        }
        return Short.valueOf(s6);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R Km(T[] tArr, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(tArr[0]);
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(tArr[it.b()]);
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Double Kn(@n6.d Double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        s0 it = new d5.l(1, Xe(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it.b()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final byte[] Ko(byte[] bArr, t4.l<? super Byte, m2> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (byte b7 : bArr) {
            lVar.O(Byte.valueOf(b7));
        }
        return bArr;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Double Kp(@n6.d double[] dArr, @n6.d b5.f fVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(fVar, "random");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[fVar.m(dArr.length)]);
    }

    public static final long Kq(@n6.d long[] jArr, @n6.d t4.p<? super Long, ? super Long, Long> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "operation");
        int We = We(jArr);
        if (We >= 0) {
            long j7 = jArr[We];
            for (int i7 = We - 1; i7 >= 0; i7--) {
                j7 = pVar.J(Long.valueOf(jArr[i7]), Long.valueOf(j7)).longValue();
            }
            return j7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final List<Double> Kr(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return x3.w.E();
        }
        List<Double> qz = qz(dArr);
        d0.m1(qz);
        return qz;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Ks(byte[] bArr, R r6, t4.p<? super R, ? super Byte, ? extends R> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (bArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r6);
        for (byte b7 : bArr) {
            r6 = pVar.J(r6, Byte.valueOf(b7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    public static final short Kt(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Short sh = null;
        boolean z6 = false;
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                sh = Short.valueOf(s6);
                z6 = true;
            }
        }
        if (z6) {
            u4.l0.n(sh, "null cannot be cast to non-null type kotlin.Short");
            return sh.shortValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <T> T[] Ku(@n6.d T[] tArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(collection, "indices");
        T[] tArr2 = (T[]) x3.m.a(tArr, collection.size());
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            tArr2[i7] = tArr[it.next().intValue()];
            i7++;
        }
        return tArr2;
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Integer> Kv(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        return kw(iArr, new g.a(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final <T> int Kw(@n6.d T[] tArr, @n6.d t4.l<? super T, Integer> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (T t6 : tArr) {
            i7 += lVar.O(t6).intValue();
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int Kx(short[] sArr, t4.l<? super Short, x1> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (short s6 : sArr) {
            l7 = x1.l(l7 + lVar.O(Short.valueOf(s6)).l0());
        }
        return l7;
    }

    @n6.d
    public static final <C extends Collection<? super Character>> C Ky(@n6.d char[] cArr, @n6.d C c7) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(c7, "destination");
        for (char c8 : cArr) {
            c7.add(Character.valueOf(c8));
        }
        return c7;
    }

    @n6.d
    public static final Set<Integer> Kz(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? (Set) Ny(iArr, new LinkedHashSet(z0.j(iArr.length))) : k1.f(Integer.valueOf(iArr[0])) : l1.k();
    }

    public static final boolean L5(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (float f7 : fArr) {
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final <K> Map<K, Short> L6(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends K> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(sArr.length), 16));
        for (short s6 : sArr) {
            linkedHashMap.put(lVar.O(Short.valueOf(s6)), Short.valueOf(s6));
        }
        return linkedHashMap;
    }

    public static final double L7(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (int i8 : iArr) {
            d7 += i8;
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @k4.f
    public static final short L8(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr[4];
    }

    @n6.d
    public static final List<Long> L9(@n6.d long[] jArr, int i7) {
        u4.l0.p(jArr, "<this>");
        if (i7 >= 0) {
            return ky(jArr, d5.u.u(jArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R, V> List<V> LA(@n6.d int[] iArr, @n6.d R[] rArr, @n6.d t4.p<? super Integer, ? super R, ? extends V> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(iArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Integer.valueOf(iArr[i7]), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Float> La(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f7 : fArr) {
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                arrayList.add(Float.valueOf(f7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C Lb(@n6.d T[] tArr, @n6.d C c7, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (T t6 : tArr) {
            if (lVar.O(t6).booleanValue()) {
                c7.add(t6);
            }
        }
        return c7;
    }

    @n6.e
    public static final Integer Lc(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                return Integer.valueOf(i7);
            }
        }
        return null;
    }

    public static final <R> R Ld(@n6.d long[] jArr, R r6, @n6.d t4.p<? super R, ? super Long, ? extends R> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (long j7 : jArr) {
            r6 = pVar.J(r6, Long.valueOf(j7));
        }
        return r6;
    }

    @n6.d
    public static final d5.l Le(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return new d5.l(0, Ue(fArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Lf(@n6.d byte[] bArr, @n6.d M m7, @n6.d t4.l<? super Byte, ? extends K> lVar, @n6.d t4.l<? super Byte, ? extends V> lVar2) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (byte b7 : bArr) {
            K O = lVar.O(Byte.valueOf(b7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(Byte.valueOf(b7)));
        }
        return m7;
    }

    @n6.d
    public static final Set<Short> Lg(@n6.d short[] sArr, @n6.d Iterable<Short> iterable) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Short> Ez = Ez(sArr);
        x3.b0.P0(Ez, iterable);
        return Ez;
    }

    public static /* synthetic */ String Lh(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return Ch(jArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.d
    public static final <R> List<R> Li(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f7 : fArr) {
            arrayList.add(lVar.O(Float.valueOf(f7)));
        }
        return arrayList;
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T Lj(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t6 = tArr[0];
        int Xe = Xe(tArr);
        if (Xe == 0) {
            return t6;
        }
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
        return t6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float Lk(int[] iArr, t4.l<? super Integer, Float> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Integer.valueOf(iArr[0])).floatValue();
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Integer.valueOf(iArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final byte Ll(@n6.d byte[] bArr, @n6.d Comparator<? super Byte> comparator) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            if (comparator.compare(Byte.valueOf(b7), Byte.valueOf(b8)) < 0) {
                b7 = b8;
            }
        }
        return b7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Lm(short[] sArr, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Short.valueOf(sArr[0]));
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Short.valueOf(sArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float Ln(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            f7 = Math.min(f7, fArr[it.b()]);
        }
        return Float.valueOf(f7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final char[] Lo(char[] cArr, t4.l<? super Character, m2> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (char c7 : cArr) {
            lVar.O(Character.valueOf(c7));
        }
        return cArr;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Float Lp(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return Mp(fArr, b5.f.f7260k);
    }

    public static final <S, T extends S> S Lq(@n6.d T[] tArr, @n6.d t4.p<? super T, ? super S, ? extends S> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Xe = Xe(tArr);
        if (Xe >= 0) {
            Object obj = (S) tArr[Xe];
            for (int i7 = Xe - 1; i7 >= 0; i7--) {
                obj = (S) pVar.J((Object) tArr[i7], obj);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final List<Float> Lr(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return x3.w.E();
        }
        List<Float> rz = rz(fArr);
        d0.m1(rz);
        return rz;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Ls(char[] cArr, R r6, t4.p<? super R, ? super Character, ? extends R> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (cArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r6);
        for (char c7 : cArr) {
            r6 = pVar.J(r6, Character.valueOf(c7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    public static final boolean Lt(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length == 1) {
                return zArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @n6.d
    public static final short[] Lu(@n6.d short[] sArr, @n6.d d5.l lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? new short[0] : x3.o.N1(sArr, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Long> Lv(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        return lw(jArr, new g.a(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final int Lw(@n6.d short[] sArr, @n6.d t4.l<? super Short, Integer> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (short s6 : sArr) {
            i7 += lVar.O(Short.valueOf(s6)).intValue();
        }
        return i7;
    }

    @s4.h(name = "sumOfUInt")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final int Lx(boolean[] zArr, t4.l<? super Boolean, x1> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        int l7 = x1.l(0);
        for (boolean z6 : zArr) {
            l7 = x1.l(l7 + lVar.O(Boolean.valueOf(z6)).l0());
        }
        return l7;
    }

    @n6.d
    public static final <C extends Collection<? super Double>> C Ly(@n6.d double[] dArr, @n6.d C c7) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(c7, "destination");
        for (double d7 : dArr) {
            c7.add(Double.valueOf(d7));
        }
        return c7;
    }

    @n6.d
    public static final Set<Long> Lz(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? (Set) Oy(jArr, new LinkedHashSet(z0.j(jArr.length))) : k1.f(Long.valueOf(jArr[0])) : l1.k();
    }

    public static final boolean M5(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    @n6.d
    public static final <K, V> Map<K, V> M6(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends K> lVar, @n6.d t4.l<? super Short, ? extends V> lVar2) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(sArr.length), 16));
        for (short s6 : sArr) {
            linkedHashMap.put(lVar.O(Short.valueOf(s6)), lVar2.O(Short.valueOf(s6)));
        }
        return linkedHashMap;
    }

    public static final double M7(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (long j7 : jArr) {
            d7 += j7;
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @k4.f
    public static final boolean M8(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr[4];
    }

    @n6.d
    public static final <T> List<T> M9(@n6.d T[] tArr, int i7) {
        u4.l0.p(tArr, "<this>");
        if (i7 >= 0) {
            return ly(tArr, d5.u.u(tArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R> List<v3.u0<Long, R>> MA(@n6.d long[] jArr, @n6.d Iterable<? extends R> iterable) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(iterable, "other");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(Long.valueOf(jArr[i7]), r6));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Integer> Ma(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <C extends Collection<? super Short>> C Mb(@n6.d short[] sArr, @n6.d C c7, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                c7.add(Short.valueOf(s6));
            }
        }
        return c7;
    }

    @n6.e
    public static final Long Mc(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Md(@n6.d T[] tArr, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (b.a aVar : tArr) {
            r6 = pVar.J(r6, aVar);
        }
        return r6;
    }

    @n6.d
    public static final d5.l Me(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return new d5.l(0, Ve(iArr));
    }

    @n6.d
    public static final <K, M extends Map<? super K, List<Character>>> M Mf(@n6.d char[] cArr, @n6.d M m7, @n6.d t4.l<? super Character, ? extends K> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (char c7 : cArr) {
            K O = lVar.O(Character.valueOf(c7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(Character.valueOf(c7));
        }
        return m7;
    }

    @n6.d
    public static final Set<Boolean> Mg(@n6.d boolean[] zArr, @n6.d Iterable<Boolean> iterable) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Boolean> Fz = Fz(zArr);
        x3.b0.P0(Fz, iterable);
        return Fz;
    }

    public static /* synthetic */ String Mh(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return Dh(objArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.d
    public static final <R> List<R> Mi(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i7 : iArr) {
            arrayList.add(lVar.O(Integer.valueOf(i7)));
        }
        return arrayList;
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> short Mj(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s6 = sArr[0];
        int Ye = Ye(sArr);
        if (Ye == 0) {
            return s6;
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
        return s6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float Mk(long[] jArr, t4.l<? super Long, Float> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Long.valueOf(jArr[0])).floatValue();
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Long.valueOf(jArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final char Ml(@n6.d char[] cArr, @n6.d Comparator<? super Character> comparator) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            if (comparator.compare(Character.valueOf(c7), Character.valueOf(c8)) < 0) {
                c7 = c8;
            }
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Mm(boolean[] zArr, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Boolean.valueOf(zArr[0]));
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Boolean.valueOf(zArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float Mn(@n6.d Float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        s0 it = new d5.l(1, Xe(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it.b()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final double[] Mo(double[] dArr, t4.l<? super Double, m2> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (double d7 : dArr) {
            lVar.O(Double.valueOf(d7));
        }
        return dArr;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Float Mp(@n6.d float[] fArr, @n6.d b5.f fVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(fVar, "random");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fVar.m(fArr.length)]);
    }

    public static final short Mq(@n6.d short[] sArr, @n6.d t4.p<? super Short, ? super Short, Short> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Ye = Ye(sArr);
        if (Ye >= 0) {
            short s6 = sArr[Ye];
            for (int i7 = Ye - 1; i7 >= 0; i7--) {
                s6 = pVar.J(Short.valueOf(sArr[i7]), Short.valueOf(s6)).shortValue();
            }
            return s6;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final List<Integer> Mr(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return x3.w.E();
        }
        List<Integer> sz = sz(iArr);
        d0.m1(sz);
        return sz;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Ms(double[] dArr, R r6, t4.p<? super R, ? super Double, ? extends R> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (dArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r6);
        for (double d7 : dArr) {
            r6 = pVar.J(r6, Double.valueOf(d7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    public static final boolean Mt(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Boolean bool = null;
        boolean z6 = false;
        for (boolean z7 : zArr) {
            if (lVar.O(Boolean.valueOf(z7)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                bool = Boolean.valueOf(z7);
                z6 = true;
            }
        }
        if (z6) {
            u4.l0.n(bool, "null cannot be cast to non-null type kotlin.Boolean");
            return bool.booleanValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final short[] Mu(@n6.d short[] sArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(collection, "indices");
        short[] sArr2 = new short[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            sArr2[i7] = sArr[it.next().intValue()];
            i7++;
        }
        return sArr2;
    }

    @n6.d
    public static final <T, R extends Comparable<? super R>> List<T> Mv(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        return mw(tArr, new g.a(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final int Mw(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Integer> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (boolean z6 : zArr) {
            i7 += lVar.O(Boolean.valueOf(z6)).intValue();
        }
        return i7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long Mx(byte[] bArr, t4.l<? super Byte, b2> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (byte b7 : bArr) {
            l7 = b2.l(l7 + lVar.O(Byte.valueOf(b7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final <C extends Collection<? super Float>> C My(@n6.d float[] fArr, @n6.d C c7) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(c7, "destination");
        for (float f7 : fArr) {
            c7.add(Float.valueOf(f7));
        }
        return c7;
    }

    @n6.d
    public static final <T> Set<T> Mz(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) Py(tArr, new LinkedHashSet(z0.j(tArr.length))) : k1.f(tArr[0]) : l1.k();
    }

    public static final boolean N5(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final <K> Map<K, Boolean> N6(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends K> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(zArr.length), 16));
        for (boolean z6 : zArr) {
            linkedHashMap.put(lVar.O(Boolean.valueOf(z6)), Boolean.valueOf(z6));
        }
        return linkedHashMap;
    }

    public static final double N7(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (short s6 : sArr) {
            d7 += s6;
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    public static final boolean N8(@n6.d byte[] bArr, byte b7) {
        u4.l0.p(bArr, "<this>");
        return dg(bArr, b7) >= 0;
    }

    @n6.d
    public static final List<Short> N9(@n6.d short[] sArr, int i7) {
        u4.l0.p(sArr, "<this>");
        if (i7 >= 0) {
            return my(sArr, d5.u.u(sArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R, V> List<V> NA(@n6.d long[] jArr, @n6.d Iterable<? extends R> iterable, @n6.d t4.p<? super Long, ? super R, ? extends V> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(iterable, "other");
        u4.l0.p(pVar, "transform");
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(Long.valueOf(jArr[i7]), obj));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Long> Na(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                arrayList.add(Long.valueOf(j7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <C extends Collection<? super Boolean>> C Nb(@n6.d boolean[] zArr, @n6.d C c7, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (boolean z6 : zArr) {
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                c7.add(Boolean.valueOf(z6));
            }
        }
        return c7;
    }

    @n6.e
    public static final Long Nc(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                return Long.valueOf(j7);
            }
        }
        return null;
    }

    public static final <R> R Nd(@n6.d short[] sArr, R r6, @n6.d t4.p<? super R, ? super Short, ? extends R> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (short s6 : sArr) {
            r6 = pVar.J(r6, Short.valueOf(s6));
        }
        return r6;
    }

    @n6.d
    public static final d5.l Ne(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return new d5.l(0, We(jArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Nf(@n6.d char[] cArr, @n6.d M m7, @n6.d t4.l<? super Character, ? extends K> lVar, @n6.d t4.l<? super Character, ? extends V> lVar2) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (char c7 : cArr) {
            K O = lVar.O(Character.valueOf(c7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(Character.valueOf(c7)));
        }
        return m7;
    }

    @k4.f
    public static final boolean Ng(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr.length == 0;
    }

    public static /* synthetic */ String Nh(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return Eh(sArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.d
    public static final <R> List<R> Ni(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(lVar.O(Long.valueOf(j7)));
        }
        return arrayList;
    }

    @s4.h(name = "maxByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean Nj(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z6 = zArr[0];
        int Ze = Ze(zArr);
        if (Ze == 0) {
            return z6;
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
        return z6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> Float Nk(T[] tArr, t4.l<? super T, Float> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(tArr[0]).floatValue();
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(tArr[it.b()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final double Nl(@n6.d double[] dArr, @n6.d Comparator<? super Double> comparator) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            double d8 = dArr[it.b()];
            if (comparator.compare(Double.valueOf(d7), Double.valueOf(d8)) < 0) {
                d7 = d8;
            }
        }
        return d7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Nm(byte[] bArr, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R O = lVar.O(Byte.valueOf(bArr[0]));
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Byte.valueOf(bArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Integer Nn(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            if (i7 > i8) {
                i7 = i8;
            }
        }
        return Integer.valueOf(i7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final float[] No(float[] fArr, t4.l<? super Float, m2> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (float f7 : fArr) {
            lVar.O(Float.valueOf(f7));
        }
        return fArr;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Integer Np(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return Op(iArr, b5.f.f7260k);
    }

    public static final boolean Nq(@n6.d boolean[] zArr, @n6.d t4.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Ze = Ze(zArr);
        if (Ze >= 0) {
            boolean z6 = zArr[Ze];
            for (int i7 = Ze - 1; i7 >= 0; i7--) {
                z6 = pVar.J(Boolean.valueOf(zArr[i7]), Boolean.valueOf(z6)).booleanValue();
            }
            return z6;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final List<Long> Nr(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return x3.w.E();
        }
        List<Long> tz = tz(jArr);
        d0.m1(tz);
        return tz;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Ns(float[] fArr, R r6, t4.p<? super R, ? super Float, ? extends R> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (fArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r6);
        for (float f7 : fArr) {
            r6 = pVar.J(r6, Float.valueOf(f7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Boolean Nt(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        if (zArr.length == 1) {
            return Boolean.valueOf(zArr[0]);
        }
        return null;
    }

    @n6.d
    public static final boolean[] Nu(@n6.d boolean[] zArr, @n6.d d5.l lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? new boolean[0] : x3.o.O1(zArr, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Short> Nv(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        return nw(sArr, new g.a(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final double Nw(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Double> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (byte b7 : bArr) {
            d7 += lVar.O(Byte.valueOf(b7)).doubleValue();
        }
        return d7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long Nx(char[] cArr, t4.l<? super Character, b2> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (char c7 : cArr) {
            l7 = b2.l(l7 + lVar.O(Character.valueOf(c7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final <C extends Collection<? super Integer>> C Ny(@n6.d int[] iArr, @n6.d C c7) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(c7, "destination");
        for (int i7 : iArr) {
            c7.add(Integer.valueOf(i7));
        }
        return c7;
    }

    @n6.d
    public static final Set<Short> Nz(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? (Set) Qy(sArr, new LinkedHashSet(z0.j(sArr.length))) : k1.f(Short.valueOf(sArr[0])) : l1.k();
    }

    public static final boolean O5(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    @n6.d
    public static final <K, V> Map<K, V> O6(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends K> lVar, @n6.d t4.l<? super Boolean, ? extends V> lVar2) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(zArr.length), 16));
        for (boolean z6 : zArr) {
            linkedHashMap.put(lVar.O(Boolean.valueOf(z6)), lVar2.O(Boolean.valueOf(z6)));
        }
        return linkedHashMap;
    }

    @s4.h(name = "averageOfByte")
    public static final double O7(@n6.d Byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (Byte b7 : bArr) {
            d7 += b7.byteValue();
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    public static final boolean O8(@n6.d char[] cArr, char c7) {
        u4.l0.p(cArr, "<this>");
        return eg(cArr, c7) >= 0;
    }

    @n6.d
    public static final List<Boolean> O9(@n6.d boolean[] zArr, int i7) {
        u4.l0.p(zArr, "<this>");
        if (i7 >= 0) {
            return ny(zArr, d5.u.u(zArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final List<v3.u0<Long, Long>> OA(@n6.d long[] jArr, @n6.d long[] jArr2) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(jArr2, "other");
        int min = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(v3.q1.a(Long.valueOf(jArr[i7]), Long.valueOf(jArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final <T> List<T> Oa(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t6 : tArr) {
            if (lVar.O(t6).booleanValue()) {
                arrayList.add(t6);
            }
        }
        return arrayList;
    }

    @k4.f
    public static final Boolean Ob(boolean[] zArr, t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (boolean z6 : zArr) {
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                return Boolean.valueOf(z6);
            }
        }
        return null;
    }

    @n6.e
    public static final <T> T Oc(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static final <R> R Od(@n6.d boolean[] zArr, R r6, @n6.d t4.p<? super R, ? super Boolean, ? extends R> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (boolean z6 : zArr) {
            r6 = pVar.J(r6, Boolean.valueOf(z6));
        }
        return r6;
    }

    @n6.d
    public static final <T> d5.l Oe(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return new d5.l(0, Xe(tArr));
    }

    @n6.d
    public static final <K, M extends Map<? super K, List<Double>>> M Of(@n6.d double[] dArr, @n6.d M m7, @n6.d t4.l<? super Double, ? extends K> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (double d7 : dArr) {
            K O = lVar.O(Double.valueOf(d7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(Double.valueOf(d7));
        }
        return m7;
    }

    @k4.f
    public static final boolean Og(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr.length == 0;
    }

    public static /* synthetic */ String Oh(boolean[] zArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, t4.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i8 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i8 & 4) == 0 ? charSequence3 : "";
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        int i9 = i7;
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i8 & 32) != 0) {
            lVar = null;
        }
        return Fh(zArr, charSequence, charSequence5, charSequence6, i9, charSequence7, lVar);
    }

    @n6.d
    public static final <T, R> List<R> Oi(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t6 : tArr) {
            arrayList.add(lVar.O(t6));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Oj(byte[] bArr, t4.l<? super Byte, Double> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Byte.valueOf(bArr[0])).doubleValue();
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Byte.valueOf(bArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float Ok(short[] sArr, t4.l<? super Short, Float> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Short.valueOf(sArr[0])).floatValue();
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Short.valueOf(sArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final float Ol(@n6.d float[] fArr, @n6.d Comparator<? super Float> comparator) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            float f8 = fArr[it.b()];
            if (comparator.compare(Float.valueOf(f7), Float.valueOf(f8)) < 0) {
                f7 = f8;
            }
        }
        return f7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Om(char[] cArr, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R O = lVar.O(Character.valueOf(cArr[0]));
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Character.valueOf(cArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Long On(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            if (j7 > j8) {
                j7 = j8;
            }
        }
        return Long.valueOf(j7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final int[] Oo(int[] iArr, t4.l<? super Integer, m2> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (int i7 : iArr) {
            lVar.O(Integer.valueOf(i7));
        }
        return iArr;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Integer Op(@n6.d int[] iArr, @n6.d b5.f fVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(fVar, "random");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[fVar.m(iArr.length)]);
    }

    public static final byte Oq(@n6.d byte[] bArr, @n6.d t4.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Re = Re(bArr);
        if (Re >= 0) {
            byte b7 = bArr[Re];
            for (int i7 = Re - 1; i7 >= 0; i7--) {
                b7 = qVar.I(Integer.valueOf(i7), Byte.valueOf(bArr[i7]), Byte.valueOf(b7)).byteValue();
            }
            return b7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final <T> List<T> Or(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return x3.w.E();
        }
        List<T> uz = uz(tArr);
        d0.m1(uz);
        return uz;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Os(int[] iArr, R r6, t4.p<? super R, ? super Integer, ? extends R> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (iArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r6);
        for (int i7 : iArr) {
            r6 = pVar.J(r6, Integer.valueOf(i7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Boolean Ot(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Boolean bool = null;
        boolean z6 = false;
        for (boolean z7 : zArr) {
            if (lVar.O(Boolean.valueOf(z7)).booleanValue()) {
                if (z6) {
                    return null;
                }
                bool = Boolean.valueOf(z7);
                z6 = true;
            }
        }
        if (z6) {
            return bool;
        }
        return null;
    }

    @n6.d
    public static final boolean[] Ou(@n6.d boolean[] zArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(collection, "indices");
        boolean[] zArr2 = new boolean[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            zArr2[i7] = zArr[it.next().intValue()];
            i7++;
        }
        return zArr2;
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Boolean> Ov(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        return ow(zArr, new g.a(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final double Ow(@n6.d char[] cArr, @n6.d t4.l<? super Character, Double> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (char c7 : cArr) {
            d7 += lVar.O(Character.valueOf(c7)).doubleValue();
        }
        return d7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long Ox(double[] dArr, t4.l<? super Double, b2> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (double d7 : dArr) {
            l7 = b2.l(l7 + lVar.O(Double.valueOf(d7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final <C extends Collection<? super Long>> C Oy(@n6.d long[] jArr, @n6.d C c7) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(c7, "destination");
        for (long j7 : jArr) {
            c7.add(Long.valueOf(j7));
        }
        return c7;
    }

    @n6.d
    public static final Set<Boolean> Oz(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? (Set) Ry(zArr, new LinkedHashSet(z0.j(zArr.length))) : k1.f(Boolean.valueOf(zArr[0])) : l1.k();
    }

    public static final boolean P5(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final <K, M extends Map<? super K, ? super Byte>> M P6(@n6.d byte[] bArr, @n6.d M m7, @n6.d t4.l<? super Byte, ? extends K> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (byte b7 : bArr) {
            m7.put(lVar.O(Byte.valueOf(b7)), Byte.valueOf(b7));
        }
        return m7;
    }

    @s4.h(name = "averageOfDouble")
    public static final double P7(@n6.d Double[] dArr) {
        u4.l0.p(dArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (Double d8 : dArr) {
            d7 += d8.doubleValue();
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @v3.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @v3.b1(expression = "any { it == element }", imports = {}))
    @v3.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean P8(double[] dArr, double d7) {
        u4.l0.p(dArr, "<this>");
        for (double d8 : dArr) {
            if (d8 == d7) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final List<Byte> P9(@n6.d byte[] bArr, int i7) {
        u4.l0.p(bArr, "<this>");
        if (i7 >= 0) {
            return Vx(bArr, d5.u.u(bArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <V> List<V> PA(@n6.d long[] jArr, @n6.d long[] jArr2, @n6.d t4.p<? super Long, ? super Long, ? extends V> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(jArr2, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(jArr.length, jArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Long.valueOf(jArr[i7]), Long.valueOf(jArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Short> Pa(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                arrayList.add(Short.valueOf(s6));
            }
        }
        return arrayList;
    }

    @k4.f
    public static final Byte Pb(byte[] bArr, t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (byte b7 : bArr) {
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                return Byte.valueOf(b7);
            }
        }
        return null;
    }

    @n6.e
    public static final <T> T Pc(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (T t6 : tArr) {
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
        }
        return null;
    }

    public static final <R> R Pd(@n6.d byte[] bArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Byte, ? extends R> qVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(qVar, "operation");
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            r6 = qVar.I(Integer.valueOf(i8), r6, Byte.valueOf(bArr[i7]));
            i7++;
            i8++;
        }
        return r6;
    }

    @n6.d
    public static final d5.l Pe(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return new d5.l(0, Ye(sArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Pf(@n6.d double[] dArr, @n6.d M m7, @n6.d t4.l<? super Double, ? extends K> lVar, @n6.d t4.l<? super Double, ? extends V> lVar2) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (double d7 : dArr) {
            K O = lVar.O(Double.valueOf(d7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(Double.valueOf(d7)));
        }
        return m7;
    }

    @k4.f
    public static final boolean Pg(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr.length == 0;
    }

    public static final byte Ph(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[Re(bArr)];
    }

    @n6.d
    public static final <R> List<R> Pi(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s6 : sArr) {
            arrayList.add(lVar.O(Short.valueOf(s6)));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Pj(char[] cArr, t4.l<? super Character, Double> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Character.valueOf(cArr[0])).doubleValue();
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Character.valueOf(cArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float Pk(boolean[] zArr, t4.l<? super Boolean, Float> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Boolean.valueOf(zArr[0])).floatValue();
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Boolean.valueOf(zArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final int Pl(@n6.d int[] iArr, @n6.d Comparator<? super Integer> comparator) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            if (comparator.compare(Integer.valueOf(i7), Integer.valueOf(i8)) < 0) {
                i7 = i8;
            }
        }
        return i7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Pm(double[] dArr, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R O = lVar.O(Double.valueOf(dArr[0]));
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Double.valueOf(dArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Short Pn(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            if (s6 > s7) {
                s6 = s7;
            }
        }
        return Short.valueOf(s6);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final long[] Po(long[] jArr, t4.l<? super Long, m2> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (long j7 : jArr) {
            lVar.O(Long.valueOf(j7));
        }
        return jArr;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Long Pp(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return Qp(jArr, b5.f.f7260k);
    }

    public static final char Pq(@n6.d char[] cArr, @n6.d t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Se = Se(cArr);
        if (Se >= 0) {
            char c7 = cArr[Se];
            for (int i7 = Se - 1; i7 >= 0; i7--) {
                c7 = qVar.I(Integer.valueOf(i7), Character.valueOf(cArr[i7]), Character.valueOf(c7)).charValue();
            }
            return c7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final List<Short> Pr(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return x3.w.E();
        }
        List<Short> vz = vz(sArr);
        d0.m1(vz);
        return vz;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Ps(long[] jArr, R r6, t4.p<? super R, ? super Long, ? extends R> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (jArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r6);
        for (long j7 : jArr) {
            r6 = pVar.J(r6, Long.valueOf(j7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Byte Pt(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 1) {
            return Byte.valueOf(bArr[0]);
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void Pu(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length > 1) {
            x3.o.I4(tArr, new g.a(lVar));
        }
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Byte> Pv(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        return gw(bArr, new g.c(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final double Pw(@n6.d double[] dArr, @n6.d t4.l<? super Double, Double> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (double d8 : dArr) {
            d7 += lVar.O(Double.valueOf(d8)).doubleValue();
        }
        return d7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long Px(float[] fArr, t4.l<? super Float, b2> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (float f7 : fArr) {
            l7 = b2.l(l7 + lVar.O(Float.valueOf(f7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C Py(@n6.d T[] tArr, @n6.d C c7) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        for (T t6 : tArr) {
            c7.add(t6);
        }
        return c7;
    }

    @n6.d
    public static final short[] Pz(@n6.d Short[] shArr) {
        u4.l0.p(shArr, "<this>");
        int length = shArr.length;
        short[] sArr = new short[length];
        for (int i7 = 0; i7 < length; i7++) {
            sArr[i7] = shArr[i7].shortValue();
        }
        return sArr;
    }

    public static final <T> boolean Q5(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M Q6(@n6.d byte[] bArr, @n6.d M m7, @n6.d t4.l<? super Byte, ? extends K> lVar, @n6.d t4.l<? super Byte, ? extends V> lVar2) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (byte b7 : bArr) {
            m7.put(lVar.O(Byte.valueOf(b7)), lVar2.O(Byte.valueOf(b7)));
        }
        return m7;
    }

    @s4.h(name = "averageOfFloat")
    public static final double Q7(@n6.d Float[] fArr) {
        u4.l0.p(fArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (Float f7 : fArr) {
            d7 += f7.floatValue();
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    @v3.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'any { it == element }' instead to continue using this behavior, or '.asList().contains(element: T)' to get the same search behavior as in a list.", replaceWith = @v3.b1(expression = "any { it == element }", imports = {}))
    @v3.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ boolean Q8(float[] fArr, float f7) {
        u4.l0.p(fArr, "<this>");
        for (float f8 : fArr) {
            if (f8 == f7) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final List<Character> Q9(@n6.d char[] cArr, int i7) {
        u4.l0.p(cArr, "<this>");
        if (i7 >= 0) {
            return Wx(cArr, d5.u.u(cArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R> List<v3.u0<Long, R>> QA(@n6.d long[] jArr, @n6.d R[] rArr) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(rArr, "other");
        int min = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            long j7 = jArr[i7];
            arrayList.add(v3.q1.a(Long.valueOf(j7), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Boolean> Qa(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z6 : zArr) {
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z6));
            }
        }
        return arrayList;
    }

    @k4.f
    public static final Character Qb(char[] cArr, t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                return Character.valueOf(c7);
            }
        }
        return null;
    }

    @n6.e
    public static final Short Qc(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[0]);
    }

    public static final <R> R Qd(@n6.d char[] cArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Character, ? extends R> qVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(qVar, "operation");
        int length = cArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            r6 = qVar.I(Integer.valueOf(i8), r6, Character.valueOf(cArr[i7]));
            i7++;
            i8++;
        }
        return r6;
    }

    @n6.d
    public static final d5.l Qe(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return new d5.l(0, Ze(zArr));
    }

    @n6.d
    public static final <K, M extends Map<? super K, List<Float>>> M Qf(@n6.d float[] fArr, @n6.d M m7, @n6.d t4.l<? super Float, ? extends K> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (float f7 : fArr) {
            K O = lVar.O(Float.valueOf(f7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(Float.valueOf(f7));
        }
        return m7;
    }

    @k4.f
    public static final boolean Qg(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr.length == 0;
    }

    public static final byte Qh(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                byte b7 = bArr[length];
                if (!lVar.O(Byte.valueOf(b7)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return b7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <R> List<R> Qi(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z6 : zArr) {
            arrayList.add(lVar.O(Boolean.valueOf(z6)));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Qj(double[] dArr, t4.l<? super Double, Double> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Double.valueOf(dArr[0])).doubleValue();
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Double.valueOf(dArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Qk(byte[] bArr, Comparator<? super R> comparator, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Byte.valueOf(bArr[0]));
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Byte.valueOf(bArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final long Ql(@n6.d long[] jArr, @n6.d Comparator<? super Long> comparator) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            if (comparator.compare(Long.valueOf(j7), Long.valueOf(j8)) < 0) {
                j7 = j8;
            }
        }
        return j7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Qm(float[] fArr, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R O = lVar.O(Float.valueOf(fArr[0]));
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Float.valueOf(fArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final byte Qn(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            if (b7 > b8) {
                b7 = b8;
            }
        }
        return b7;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <T> T[] Qo(T[] tArr, t4.l<? super T, m2> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (T t6 : tArr) {
            lVar.O(t6);
        }
        return tArr;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Long Qp(@n6.d long[] jArr, @n6.d b5.f fVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(fVar, "random");
        if (jArr.length == 0) {
            return null;
        }
        return Long.valueOf(jArr[fVar.m(jArr.length)]);
    }

    public static final double Qq(@n6.d double[] dArr, @n6.d t4.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Te = Te(dArr);
        if (Te >= 0) {
            double d7 = dArr[Te];
            for (int i7 = Te - 1; i7 >= 0; i7--) {
                d7 = qVar.I(Integer.valueOf(i7), Double.valueOf(dArr[i7]), Double.valueOf(d7)).doubleValue();
            }
            return d7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final List<Boolean> Qr(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return x3.w.E();
        }
        List<Boolean> wz = wz(zArr);
        d0.m1(wz);
        return wz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <T, R> List<R> Qs(@n6.d T[] tArr, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (tArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r6);
        for (b.a aVar : tArr) {
            r6 = pVar.J(r6, aVar);
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Byte Qt(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Byte b7 = null;
        boolean z6 = false;
        for (byte b8 : bArr) {
            if (lVar.O(Byte.valueOf(b8)).booleanValue()) {
                if (z6) {
                    return null;
                }
                b7 = Byte.valueOf(b8);
                z6 = true;
            }
        }
        if (z6) {
            return b7;
        }
        return null;
    }

    public static final <T, R extends Comparable<? super R>> void Qu(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length > 1) {
            x3.o.I4(tArr, new g.c(lVar));
        }
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Character> Qv(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        return hw(cArr, new g.c(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final double Qw(@n6.d float[] fArr, @n6.d t4.l<? super Float, Double> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (float f7 : fArr) {
            d7 += lVar.O(Float.valueOf(f7)).doubleValue();
        }
        return d7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long Qx(int[] iArr, t4.l<? super Integer, b2> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (int i7 : iArr) {
            l7 = b2.l(l7 + lVar.O(Integer.valueOf(i7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final <C extends Collection<? super Short>> C Qy(@n6.d short[] sArr, @n6.d C c7) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(c7, "destination");
        for (short s6 : sArr) {
            c7.add(Short.valueOf(s6));
        }
        return c7;
    }

    @n6.d
    public static final Set<Byte> Qz(@n6.d byte[] bArr, @n6.d Iterable<Byte> iterable) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Byte> xz = xz(bArr);
        x3.b0.o0(xz, iterable);
        return xz;
    }

    public static final <T> boolean R5(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (T t6 : tArr) {
            if (lVar.O(t6).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final <K, M extends Map<? super K, ? super Character>> M R6(@n6.d char[] cArr, @n6.d M m7, @n6.d t4.l<? super Character, ? extends K> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (char c7 : cArr) {
            m7.put(lVar.O(Character.valueOf(c7)), Character.valueOf(c7));
        }
        return m7;
    }

    @s4.h(name = "averageOfInt")
    public static final double R7(@n6.d Integer[] numArr) {
        u4.l0.p(numArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (Integer num : numArr) {
            d7 += num.intValue();
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    public static final boolean R8(@n6.d int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        return hg(iArr, i7) >= 0;
    }

    @n6.d
    public static final List<Double> R9(@n6.d double[] dArr, int i7) {
        u4.l0.p(dArr, "<this>");
        if (i7 >= 0) {
            return Xx(dArr, d5.u.u(dArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R, V> List<V> RA(@n6.d long[] jArr, @n6.d R[] rArr, @n6.d t4.p<? super Long, ? super R, ? extends V> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(jArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Long.valueOf(jArr[i7]), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Byte> Ra(@n6.d byte[] bArr, @n6.d t4.p<? super Integer, ? super Byte, Boolean> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            byte b7 = bArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Byte.valueOf(b7)).booleanValue()) {
                arrayList.add(Byte.valueOf(b7));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @k4.f
    public static final Double Rb(double[] dArr, t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (double d7 : dArr) {
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                return Double.valueOf(d7);
            }
        }
        return null;
    }

    @n6.e
    public static final Short Rc(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                return Short.valueOf(s6);
            }
        }
        return null;
    }

    public static final <R> R Rd(@n6.d double[] dArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Double, ? extends R> qVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(qVar, "operation");
        int length = dArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            r6 = qVar.I(Integer.valueOf(i8), r6, Double.valueOf(dArr[i7]));
            i7++;
            i8++;
        }
        return r6;
    }

    public static final int Re(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Rf(@n6.d float[] fArr, @n6.d M m7, @n6.d t4.l<? super Float, ? extends K> lVar, @n6.d t4.l<? super Float, ? extends V> lVar2) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (float f7 : fArr) {
            K O = lVar.O(Float.valueOf(f7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(Float.valueOf(f7)));
        }
        return m7;
    }

    @k4.f
    public static final boolean Rg(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr.length == 0;
    }

    public static final char Rh(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[Se(cArr)];
    }

    @n6.d
    public static final <R> List<R> Ri(@n6.d byte[] bArr, @n6.d t4.p<? super Integer, ? super Byte, ? extends R> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            arrayList.add(pVar.J(Integer.valueOf(i8), Byte.valueOf(bArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Rj(float[] fArr, t4.l<? super Float, Double> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Float.valueOf(fArr[0])).doubleValue();
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Float.valueOf(fArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Rk(char[] cArr, Comparator<? super R> comparator, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Character.valueOf(cArr[0]));
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Character.valueOf(cArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final <T> T Rl(@n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t6 = tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t7 = tArr[it.b()];
            if (comparator.compare(t6, t7) < 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Rm(int[] iArr, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R O = lVar.O(Integer.valueOf(iArr[0]));
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Integer.valueOf(iArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final char Rn(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            if (u4.l0.t(c7, c8) > 0) {
                c7 = c8;
            }
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final short[] Ro(short[] sArr, t4.l<? super Short, m2> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (short s6 : sArr) {
            lVar.O(Short.valueOf(s6));
        }
        return sArr;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <T> T Rp(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return (T) Sp(tArr, b5.f.f7260k);
    }

    public static final float Rq(@n6.d float[] fArr, @n6.d t4.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Ue = Ue(fArr);
        if (Ue >= 0) {
            float f7 = fArr[Ue];
            for (int i7 = Ue - 1; i7 >= 0; i7--) {
                f7 = qVar.I(Integer.valueOf(i7), Float.valueOf(fArr[i7]), Float.valueOf(f7)).floatValue();
            }
            return f7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final byte[] Rr(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int Re = Re(bArr);
        s0 it = new d5.l(0, Re).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            bArr2[Re - b7] = bArr[b7];
        }
        return bArr2;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Rs(short[] sArr, R r6, t4.p<? super R, ? super Short, ? extends R> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (sArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r6);
        for (short s6 : sArr) {
            r6 = pVar.J(r6, Short.valueOf(s6));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Character Rt(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 1) {
            return Character.valueOf(cArr[0]);
        }
        return null;
    }

    public static final void Ru(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length > 1) {
            x3.o.h4(bArr);
            qr(bArr);
        }
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Double> Rv(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        return iw(dArr, new g.c(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final double Rw(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Double> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (int i7 : iArr) {
            d7 += lVar.O(Integer.valueOf(i7)).doubleValue();
        }
        return d7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long Rx(long[] jArr, t4.l<? super Long, b2> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (long j7 : jArr) {
            l7 = b2.l(l7 + lVar.O(Long.valueOf(j7)).l0());
        }
        return l7;
    }

    @n6.d
    public static final <C extends Collection<? super Boolean>> C Ry(@n6.d boolean[] zArr, @n6.d C c7) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(c7, "destination");
        for (boolean z6 : zArr) {
            c7.add(Boolean.valueOf(z6));
        }
        return c7;
    }

    @n6.d
    public static final Set<Character> Rz(@n6.d char[] cArr, @n6.d Iterable<Character> iterable) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Character> yz = yz(cArr);
        x3.b0.o0(yz, iterable);
        return yz;
    }

    public static final boolean S5(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M S6(@n6.d char[] cArr, @n6.d M m7, @n6.d t4.l<? super Character, ? extends K> lVar, @n6.d t4.l<? super Character, ? extends V> lVar2) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (char c7 : cArr) {
            m7.put(lVar.O(Character.valueOf(c7)), lVar2.O(Character.valueOf(c7)));
        }
        return m7;
    }

    @s4.h(name = "averageOfLong")
    public static final double S7(@n6.d Long[] lArr) {
        u4.l0.p(lArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (Long l7 : lArr) {
            d7 += l7.longValue();
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    public static final boolean S8(@n6.d long[] jArr, long j7) {
        u4.l0.p(jArr, "<this>");
        return ig(jArr, j7) >= 0;
    }

    @n6.d
    public static final List<Float> S9(@n6.d float[] fArr, int i7) {
        u4.l0.p(fArr, "<this>");
        if (i7 >= 0) {
            return Yx(fArr, d5.u.u(fArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <T, R> List<v3.u0<T, R>> SA(@n6.d T[] tArr, @n6.d Iterable<? extends R> iterable) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(iterable, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(tArr[i7], r6));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Character> Sa(@n6.d char[] cArr, @n6.d t4.p<? super Integer, ? super Character, Boolean> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            char c7 = cArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Character.valueOf(c7)).booleanValue()) {
                arrayList.add(Character.valueOf(c7));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @k4.f
    public static final Float Sb(float[] fArr, t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (float f7 : fArr) {
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                return Float.valueOf(f7);
            }
        }
        return null;
    }

    @n6.d
    public static final <R> List<R> Sc(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (byte b7 : bArr) {
            x3.b0.o0(arrayList, lVar.O(Byte.valueOf(b7)));
        }
        return arrayList;
    }

    public static final <R> R Sd(@n6.d float[] fArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Float, ? extends R> qVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(qVar, "operation");
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            r6 = qVar.I(Integer.valueOf(i8), r6, Float.valueOf(fArr[i7]));
            i7++;
            i8++;
        }
        return r6;
    }

    public static final int Se(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr.length - 1;
    }

    @n6.d
    public static final <K, M extends Map<? super K, List<Integer>>> M Sf(@n6.d int[] iArr, @n6.d M m7, @n6.d t4.l<? super Integer, ? extends K> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (int i7 : iArr) {
            K O = lVar.O(Integer.valueOf(i7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(Integer.valueOf(i7));
        }
        return m7;
    }

    @k4.f
    public static final boolean Sg(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr.length == 0;
    }

    public static final char Sh(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                char c7 = cArr[length];
                if (!lVar.O(Character.valueOf(c7)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return c7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <R> List<R> Si(@n6.d char[] cArr, @n6.d t4.p<? super Integer, ? super Character, ? extends R> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(cArr.length);
        int length = cArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            arrayList.add(pVar.J(Integer.valueOf(i8), Character.valueOf(cArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Sj(int[] iArr, t4.l<? super Integer, Double> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Integer.valueOf(iArr[0])).doubleValue();
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Integer.valueOf(iArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Sk(double[] dArr, Comparator<? super R> comparator, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Double.valueOf(dArr[0]));
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Double.valueOf(dArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final short Sl(@n6.d short[] sArr, @n6.d Comparator<? super Short> comparator) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            if (comparator.compare(Short.valueOf(s6), Short.valueOf(s7)) < 0) {
                s6 = s7;
            }
        }
        return s6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Sm(long[] jArr, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R O = lVar.O(Long.valueOf(jArr[0]));
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Long.valueOf(jArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final double Sn(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            d7 = Math.min(d7, dArr[it.b()]);
        }
        return d7;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean[] So(boolean[] zArr, t4.l<? super Boolean, m2> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (boolean z6 : zArr) {
            lVar.O(Boolean.valueOf(z6));
        }
        return zArr;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <T> T Sp(@n6.d T[] tArr, @n6.d b5.f fVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(fVar, "random");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[fVar.m(tArr.length)];
    }

    public static final int Sq(@n6.d int[] iArr, @n6.d t4.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Ve = Ve(iArr);
        if (Ve >= 0) {
            int i7 = iArr[Ve];
            for (int i8 = Ve - 1; i8 >= 0; i8--) {
                i7 = qVar.I(Integer.valueOf(i8), Integer.valueOf(iArr[i8]), Integer.valueOf(i7)).intValue();
            }
            return i7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final char[] Sr(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] cArr2 = new char[cArr.length];
        int Se = Se(cArr);
        s0 it = new d5.l(0, Se).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            cArr2[Se - b7] = cArr[b7];
        }
        return cArr2;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Ss(boolean[] zArr, R r6, t4.p<? super R, ? super Boolean, ? extends R> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (zArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r6);
        for (boolean z6 : zArr) {
            r6 = pVar.J(r6, Boolean.valueOf(z6));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Character St(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Character ch = null;
        boolean z6 = false;
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                if (z6) {
                    return null;
                }
                ch = Character.valueOf(c7);
                z6 = true;
            }
        }
        if (z6) {
            return ch;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    public static final void Su(@n6.d byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "<this>");
        x3.o.i4(bArr, i7, i8);
        rr(bArr, i7, i8);
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Float> Sv(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        return jw(fArr, new g.c(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final double Sw(@n6.d long[] jArr, @n6.d t4.l<? super Long, Double> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (long j7 : jArr) {
            d7 += lVar.O(Long.valueOf(j7)).doubleValue();
        }
        return d7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final <T> long Sx(T[] tArr, t4.l<? super T, b2> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (T t6 : tArr) {
            l7 = b2.l(l7 + lVar.O(t6).l0());
        }
        return l7;
    }

    @n6.d
    public static final double[] Sy(@n6.d Double[] dArr) {
        u4.l0.p(dArr, "<this>");
        int length = dArr.length;
        double[] dArr2 = new double[length];
        for (int i7 = 0; i7 < length; i7++) {
            dArr2[i7] = dArr[i7].doubleValue();
        }
        return dArr2;
    }

    @n6.d
    public static final Set<Double> Sz(@n6.d double[] dArr, @n6.d Iterable<Double> iterable) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Double> zz = zz(dArr);
        x3.b0.o0(zz, iterable);
        return zz;
    }

    public static final boolean T5(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final <K, M extends Map<? super K, ? super Double>> M T6(@n6.d double[] dArr, @n6.d M m7, @n6.d t4.l<? super Double, ? extends K> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (double d7 : dArr) {
            m7.put(lVar.O(Double.valueOf(d7)), Double.valueOf(d7));
        }
        return m7;
    }

    @s4.h(name = "averageOfShort")
    public static final double T7(@n6.d Short[] shArr) {
        u4.l0.p(shArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        int i7 = 0;
        for (Short sh : shArr) {
            d7 += sh.shortValue();
            i7++;
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return d7 / i7;
    }

    public static final <T> boolean T8(@n6.d T[] tArr, T t6) {
        u4.l0.p(tArr, "<this>");
        return jg(tArr, t6) >= 0;
    }

    @n6.d
    public static final List<Integer> T9(@n6.d int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        if (i7 >= 0) {
            return Zx(iArr, d5.u.u(iArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T, R, V> List<V> TA(@n6.d T[] tArr, @n6.d Iterable<? extends R> iterable, @n6.d t4.p<? super T, ? super R, ? extends V> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(iterable, "other");
        u4.l0.p(pVar, "transform");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(tArr[i7], obj));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Double> Ta(@n6.d double[] dArr, @n6.d t4.p<? super Integer, ? super Double, Boolean> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            double d7 = dArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Double.valueOf(d7)).booleanValue()) {
                arrayList.add(Double.valueOf(d7));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @k4.f
    public static final Integer Tb(int[] iArr, t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                return Integer.valueOf(i7);
            }
        }
        return null;
    }

    @n6.d
    public static final <R> List<R> Tc(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (char c7 : cArr) {
            x3.b0.o0(arrayList, lVar.O(Character.valueOf(c7)));
        }
        return arrayList;
    }

    public static final <R> R Td(@n6.d int[] iArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Integer, ? extends R> qVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(qVar, "operation");
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            r6 = qVar.I(Integer.valueOf(i8), r6, Integer.valueOf(iArr[i7]));
            i7++;
            i8++;
        }
        return r6;
    }

    public static final int Te(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Tf(@n6.d int[] iArr, @n6.d M m7, @n6.d t4.l<? super Integer, ? extends K> lVar, @n6.d t4.l<? super Integer, ? extends V> lVar2) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (int i7 : iArr) {
            K O = lVar.O(Integer.valueOf(i7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(Integer.valueOf(i7)));
        }
        return m7;
    }

    @k4.f
    public static final <T> boolean Tg(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr.length == 0;
    }

    public static final double Th(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[Te(dArr)];
    }

    @n6.d
    public static final <R> List<R> Ti(@n6.d double[] dArr, @n6.d t4.p<? super Integer, ? super Double, ? extends R> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(dArr.length);
        int length = dArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            arrayList.add(pVar.J(Integer.valueOf(i8), Double.valueOf(dArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Tj(long[] jArr, t4.l<? super Long, Double> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Long.valueOf(jArr[0])).doubleValue();
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Long.valueOf(jArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Tk(float[] fArr, Comparator<? super R> comparator, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Float.valueOf(fArr[0]));
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Float.valueOf(fArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "maxWithOrThrow")
    @v3.g1(version = "1.7")
    public static final boolean Tl(@n6.d boolean[] zArr, @n6.d Comparator<? super Boolean> comparator) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z6 = zArr[0];
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            boolean z7 = zArr[it.b()];
            if (comparator.compare(Boolean.valueOf(z6), Boolean.valueOf(z7)) < 0) {
                z6 = z7;
            }
        }
        return z6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R Tm(T[] tArr, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R O = lVar.O(tArr[0]);
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(tArr[it.b()]);
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final double Tn(@n6.d Double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        s0 it = new d5.l(1, Xe(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, dArr[it.b()].doubleValue());
        }
        return doubleValue;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final byte[] To(byte[] bArr, t4.p<? super Integer, ? super Byte, m2> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Byte.valueOf(bArr[i7]));
            i7++;
            i8++;
        }
        return bArr;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final Short Tp(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return Up(sArr, b5.f.f7260k);
    }

    public static final long Tq(@n6.d long[] jArr, @n6.d t4.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(qVar, "operation");
        int We = We(jArr);
        if (We >= 0) {
            long j7 = jArr[We];
            for (int i7 = We - 1; i7 >= 0; i7--) {
                j7 = qVar.I(Integer.valueOf(i7), Long.valueOf(jArr[i7]), Long.valueOf(j7)).longValue();
            }
            return j7;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final double[] Tr(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] dArr2 = new double[dArr.length];
        int Te = Te(dArr);
        s0 it = new d5.l(0, Te).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            dArr2[Te - b7] = dArr[b7];
        }
        return dArr2;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Ts(byte[] bArr, R r6, t4.q<? super Integer, ? super R, ? super Byte, ? extends R> qVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (bArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r6);
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Byte.valueOf(bArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Double Tt(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 1) {
            return Double.valueOf(dArr[0]);
        }
        return null;
    }

    public static final void Tu(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length > 1) {
            x3.o.j4(cArr);
            sr(cArr);
        }
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Integer> Tv(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        return kw(iArr, new g.c(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final <T> double Tw(@n6.d T[] tArr, @n6.d t4.l<? super T, Double> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (T t6 : tArr) {
            d7 += lVar.O(t6).doubleValue();
        }
        return d7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long Tx(short[] sArr, t4.l<? super Short, b2> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (short s6 : sArr) {
            l7 = b2.l(l7 + lVar.O(Short.valueOf(s6)).l0());
        }
        return l7;
    }

    @n6.d
    public static final float[] Ty(@n6.d Float[] fArr) {
        u4.l0.p(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i7 = 0; i7 < length; i7++) {
            fArr2[i7] = fArr[i7].floatValue();
        }
        return fArr2;
    }

    @n6.d
    public static final Set<Float> Tz(@n6.d float[] fArr, @n6.d Iterable<Float> iterable) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Float> Az = Az(fArr);
        x3.b0.o0(Az, iterable);
        return Az;
    }

    public static final boolean U5(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M U6(@n6.d double[] dArr, @n6.d M m7, @n6.d t4.l<? super Double, ? extends K> lVar, @n6.d t4.l<? super Double, ? extends V> lVar2) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (double d7 : dArr) {
            m7.put(lVar.O(Double.valueOf(d7)), lVar2.O(Double.valueOf(d7)));
        }
        return m7;
    }

    @k4.f
    public static final byte U7(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr[0];
    }

    public static final boolean U8(@n6.d short[] sArr, short s6) {
        u4.l0.p(sArr, "<this>");
        return kg(sArr, s6) >= 0;
    }

    @n6.d
    public static final List<Long> U9(@n6.d long[] jArr, int i7) {
        u4.l0.p(jArr, "<this>");
        if (i7 >= 0) {
            return ay(jArr, d5.u.u(jArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <T, R> List<v3.u0<T, R>> UA(@n6.d T[] tArr, @n6.d R[] rArr) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(rArr, "other");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(v3.q1.a(tArr[i7], rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Float> Ua(@n6.d float[] fArr, @n6.d t4.p<? super Integer, ? super Float, Boolean> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            float f7 = fArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Float.valueOf(f7)).booleanValue()) {
                arrayList.add(Float.valueOf(f7));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @k4.f
    public static final Long Ub(long[] jArr, t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                return Long.valueOf(j7);
            }
        }
        return null;
    }

    @n6.d
    public static final <R> List<R> Uc(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (double d7 : dArr) {
            x3.b0.o0(arrayList, lVar.O(Double.valueOf(d7)));
        }
        return arrayList;
    }

    public static final <R> R Ud(@n6.d long[] jArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Long, ? extends R> qVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(qVar, "operation");
        int length = jArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            r6 = qVar.I(Integer.valueOf(i8), r6, Long.valueOf(jArr[i7]));
            i7++;
            i8++;
        }
        return r6;
    }

    public static final int Ue(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr.length - 1;
    }

    @n6.d
    public static final <K, M extends Map<? super K, List<Long>>> M Uf(@n6.d long[] jArr, @n6.d M m7, @n6.d t4.l<? super Long, ? extends K> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (long j7 : jArr) {
            K O = lVar.O(Long.valueOf(j7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(Long.valueOf(j7));
        }
        return m7;
    }

    @k4.f
    public static final boolean Ug(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr.length == 0;
    }

    public static final double Uh(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                double d7 = dArr[length];
                if (!lVar.O(Double.valueOf(d7)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return d7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <R> List<R> Ui(@n6.d float[] fArr, @n6.d t4.p<? super Integer, ? super Float, ? extends R> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(fArr.length);
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            arrayList.add(pVar.J(Integer.valueOf(i8), Float.valueOf(fArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> double Uj(T[] tArr, t4.l<? super T, Double> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(tArr[0]).doubleValue();
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(tArr[it.b()]).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Uk(int[] iArr, Comparator<? super R> comparator, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Integer.valueOf(iArr[0]));
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Integer.valueOf(iArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Boolean Ul(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z6 = zArr[0];
        int Ze = Ze(zArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Um(short[] sArr, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R O = lVar.O(Short.valueOf(sArr[0]));
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Short.valueOf(sArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final float Un(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            f7 = Math.min(f7, fArr[it.b()]);
        }
        return f7;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final char[] Uo(char[] cArr, t4.p<? super Integer, ? super Character, m2> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = cArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Character.valueOf(cArr[i7]));
            i7++;
            i8++;
        }
        return cArr;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Short Up(@n6.d short[] sArr, @n6.d b5.f fVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(fVar, "random");
        if (sArr.length == 0) {
            return null;
        }
        return Short.valueOf(sArr[fVar.m(sArr.length)]);
    }

    public static final <S, T extends S> S Uq(@n6.d T[] tArr, @n6.d t4.q<? super Integer, ? super T, ? super S, ? extends S> qVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Xe = Xe(tArr);
        if (Xe >= 0) {
            Object obj = (S) tArr[Xe];
            for (int i7 = Xe - 1; i7 >= 0; i7--) {
                obj = (S) qVar.I(Integer.valueOf(i7), (Object) tArr[i7], obj);
            }
            return (S) obj;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final float[] Ur(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        int Ue = Ue(fArr);
        s0 it = new d5.l(0, Ue).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            fArr2[Ue - b7] = fArr[b7];
        }
        return fArr2;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Us(char[] cArr, R r6, t4.q<? super Integer, ? super R, ? super Character, ? extends R> qVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (cArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r6);
        int length = cArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Character.valueOf(cArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Double Ut(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Double d7 = null;
        boolean z6 = false;
        for (double d8 : dArr) {
            if (lVar.O(Double.valueOf(d8)).booleanValue()) {
                if (z6) {
                    return null;
                }
                d7 = Double.valueOf(d8);
                z6 = true;
            }
        }
        if (z6) {
            return d7;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    public static final void Uu(@n6.d char[] cArr, int i7, int i8) {
        u4.l0.p(cArr, "<this>");
        x3.o.k4(cArr, i7, i8);
        tr(cArr, i7, i8);
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Long> Uv(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        return lw(jArr, new g.c(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final double Uw(@n6.d short[] sArr, @n6.d t4.l<? super Short, Double> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (short s6 : sArr) {
            d7 += lVar.O(Short.valueOf(s6)).doubleValue();
        }
        return d7;
    }

    @s4.h(name = "sumOfULong")
    @v3.g1(version = "1.5")
    @v3.t0
    @k4.f
    @q2(markerClass = {v3.t.class})
    public static final long Ux(boolean[] zArr, t4.l<? super Boolean, b2> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        long l7 = b2.l(0L);
        for (boolean z6 : zArr) {
            l7 = b2.l(l7 + lVar.O(Boolean.valueOf(z6)).l0());
        }
        return l7;
    }

    @n6.d
    public static final HashSet<Byte> Uy(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return (HashSet) Jy(bArr, new HashSet(z0.j(bArr.length)));
    }

    @n6.d
    public static final Set<Integer> Uz(@n6.d int[] iArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Integer> Bz = Bz(iArr);
        x3.b0.o0(Bz, iterable);
        return Bz;
    }

    public static final boolean V5(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (boolean z6 : zArr) {
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @n6.d
    public static final <K, M extends Map<? super K, ? super Float>> M V6(@n6.d float[] fArr, @n6.d M m7, @n6.d t4.l<? super Float, ? extends K> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (float f7 : fArr) {
            m7.put(lVar.O(Float.valueOf(f7)), Float.valueOf(f7));
        }
        return m7;
    }

    @k4.f
    public static final char V7(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr[0];
    }

    public static final boolean V8(@n6.d boolean[] zArr, boolean z6) {
        u4.l0.p(zArr, "<this>");
        return lg(zArr, z6) >= 0;
    }

    @n6.d
    public static final <T> List<T> V9(@n6.d T[] tArr, int i7) {
        u4.l0.p(tArr, "<this>");
        if (i7 >= 0) {
            return cy(tArr, d5.u.u(tArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <T, R, V> List<V> VA(@n6.d T[] tArr, @n6.d R[] rArr, @n6.d t4.p<? super T, ? super R, ? extends V> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(tArr[i7], rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Integer> Va(@n6.d int[] iArr, @n6.d t4.p<? super Integer, ? super Integer, Boolean> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = iArr[i7];
            int i10 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Integer.valueOf(i9)).booleanValue()) {
                arrayList.add(Integer.valueOf(i9));
            }
            i7++;
            i8 = i10;
        }
        return arrayList;
    }

    @k4.f
    public static final <T> T Vb(T[] tArr, t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (T t6 : tArr) {
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
        }
        return null;
    }

    @n6.d
    public static final <R> List<R> Vc(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (float f7 : fArr) {
            x3.b0.o0(arrayList, lVar.O(Float.valueOf(f7)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R Vd(@n6.d T[] tArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(qVar, "operation");
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            r6 = qVar.I(Integer.valueOf(i8), r6, tArr[i7]);
            i7++;
            i8++;
        }
        return r6;
    }

    public static final int Ve(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Vf(@n6.d long[] jArr, @n6.d M m7, @n6.d t4.l<? super Long, ? extends K> lVar, @n6.d t4.l<? super Long, ? extends V> lVar2) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (long j7 : jArr) {
            K O = lVar.O(Long.valueOf(j7));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(Long.valueOf(j7)));
        }
        return m7;
    }

    @k4.f
    public static final boolean Vg(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr.length == 0;
    }

    public static final float Vh(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[Ue(fArr)];
    }

    @n6.d
    public static final <R> List<R> Vi(@n6.d int[] iArr, @n6.d t4.p<? super Integer, ? super Integer, ? extends R> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            arrayList.add(pVar.J(Integer.valueOf(i8), Integer.valueOf(iArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Vj(short[] sArr, t4.l<? super Short, Double> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Short.valueOf(sArr[0])).doubleValue();
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Short.valueOf(sArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Vk(long[] jArr, Comparator<? super R> comparator, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Long.valueOf(jArr[0]));
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Long.valueOf(jArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Byte Vl(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        int Re = Re(bArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R Vm(boolean[] zArr, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R O = lVar.O(Boolean.valueOf(zArr[0]));
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Boolean.valueOf(zArr[it.b()]));
            if (O.compareTo(O2) > 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final float Vn(@n6.d Float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = fArr[0].floatValue();
        s0 it = new d5.l(1, Xe(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, fArr[it.b()].floatValue());
        }
        return floatValue;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final double[] Vo(double[] dArr, t4.p<? super Integer, ? super Double, m2> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = dArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Double.valueOf(dArr[i7]));
            i7++;
            i8++;
        }
        return dArr;
    }

    public static final byte Vp(@n6.d byte[] bArr, @n6.d t4.p<? super Byte, ? super Byte, Byte> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            b7 = pVar.J(Byte.valueOf(b7), Byte.valueOf(bArr[it.b()])).byteValue();
        }
        return b7;
    }

    public static final short Vq(@n6.d short[] sArr, @n6.d t4.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Ye = Ye(sArr);
        if (Ye >= 0) {
            short s6 = sArr[Ye];
            for (int i7 = Ye - 1; i7 >= 0; i7--) {
                s6 = qVar.I(Integer.valueOf(i7), Short.valueOf(sArr[i7]), Short.valueOf(s6)).shortValue();
            }
            return s6;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final int[] Vr(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] iArr2 = new int[iArr.length];
        int Ve = Ve(iArr);
        s0 it = new d5.l(0, Ve).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            iArr2[Ve - b7] = iArr[b7];
        }
        return iArr2;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Vs(double[] dArr, R r6, t4.q<? super Integer, ? super R, ? super Double, ? extends R> qVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (dArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r6);
        int length = dArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Double.valueOf(dArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Float Vt(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 1) {
            return Float.valueOf(fArr[0]);
        }
        return null;
    }

    public static final void Vu(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length > 1) {
            x3.o.l4(dArr);
            ur(dArr);
        }
    }

    @n6.d
    public static final <T, R extends Comparable<? super R>> List<T> Vv(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        return mw(tArr, new g.c(lVar));
    }

    @v3.k(message = "Use sumOf instead.", replaceWith = @v3.b1(expression = "this.sumOf(selector)", imports = {}))
    @v3.l(warningSince = "1.5")
    public static final double Vw(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Double> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (boolean z6 : zArr) {
            d7 += lVar.O(Boolean.valueOf(z6)).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final List<Byte> Vx(@n6.d byte[] bArr, int i7) {
        u4.l0.p(bArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            if (i7 >= bArr.length) {
                return ez(bArr);
            }
            if (i7 == 1) {
                return x3.v.k(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (byte b7 : bArr) {
                arrayList.add(Byte.valueOf(b7));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @n6.d
    public static final HashSet<Character> Vy(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return (HashSet) Ky(cArr, new HashSet(z0.j(d5.u.B(cArr.length, 128))));
    }

    @n6.d
    public static final Set<Long> Vz(@n6.d long[] jArr, @n6.d Iterable<Long> iterable) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Long> Cz = Cz(jArr);
        x3.b0.o0(Cz, iterable);
        return Cz;
    }

    @n6.d
    public static final Iterable<Byte> W5(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr.length == 0 ? x3.w.E() : new b(bArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M W6(@n6.d float[] fArr, @n6.d M m7, @n6.d t4.l<? super Float, ? extends K> lVar, @n6.d t4.l<? super Float, ? extends V> lVar2) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (float f7 : fArr) {
            m7.put(lVar.O(Float.valueOf(f7)), lVar2.O(Float.valueOf(f7)));
        }
        return m7;
    }

    @k4.f
    public static final double W7(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr[0];
    }

    @k4.f
    public static final int W8(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr.length;
    }

    @n6.d
    public static final List<Short> W9(@n6.d short[] sArr, int i7) {
        u4.l0.p(sArr, "<this>");
        if (i7 >= 0) {
            return dy(sArr, d5.u.u(sArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R> List<v3.u0<Short, R>> WA(@n6.d short[] sArr, @n6.d Iterable<? extends R> iterable) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(iterable, "other");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(Short.valueOf(sArr[i7]), r6));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Long> Wa(@n6.d long[] jArr, @n6.d t4.p<? super Integer, ? super Long, Boolean> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            long j7 = jArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Long.valueOf(j7)).booleanValue()) {
                arrayList.add(Long.valueOf(j7));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @k4.f
    public static final Short Wb(short[] sArr, t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                return Short.valueOf(s6);
            }
        }
        return null;
    }

    @n6.d
    public static final <R> List<R> Wc(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            x3.b0.o0(arrayList, lVar.O(Integer.valueOf(i7)));
        }
        return arrayList;
    }

    public static final <R> R Wd(@n6.d short[] sArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Short, ? extends R> qVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(qVar, "operation");
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            r6 = qVar.I(Integer.valueOf(i8), r6, Short.valueOf(sArr[i7]));
            i7++;
            i8++;
        }
        return r6;
    }

    public static final int We(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr.length - 1;
    }

    @n6.d
    public static final <T, K, M extends Map<? super K, List<T>>> M Wf(@n6.d T[] tArr, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (T t6 : tArr) {
            K O = lVar.O(t6);
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(t6);
        }
        return m7;
    }

    @k4.f
    public static final boolean Wg(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return !(bArr.length == 0);
    }

    public static final float Wh(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                float f7 = fArr[length];
                if (!lVar.O(Float.valueOf(f7)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return f7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <R> List<R> Wi(@n6.d long[] jArr, @n6.d t4.p<? super Integer, ? super Long, ? extends R> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(jArr.length);
        int length = jArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            arrayList.add(pVar.J(Integer.valueOf(i8), Long.valueOf(jArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Wj(boolean[] zArr, t4.l<? super Boolean, Double> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Boolean.valueOf(zArr[0])).doubleValue();
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Boolean.valueOf(zArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> R Wk(T[] tArr, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(tArr[0]);
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(tArr[it.b()]);
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Character Wl(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        int Se = Se(cArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Wm(byte[] bArr, t4.l<? super Byte, Double> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Byte.valueOf(bArr[0])).doubleValue();
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Byte.valueOf(bArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final int Wn(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            if (i7 > i8) {
                i7 = i8;
            }
        }
        return i7;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final float[] Wo(float[] fArr, t4.p<? super Integer, ? super Float, m2> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Float.valueOf(fArr[i7]));
            i7++;
            i8++;
        }
        return fArr;
    }

    public static final char Wp(@n6.d char[] cArr, @n6.d t4.p<? super Character, ? super Character, Character> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            c7 = pVar.J(Character.valueOf(c7), Character.valueOf(cArr[it.b()])).charValue();
        }
        return c7;
    }

    public static final boolean Wq(@n6.d boolean[] zArr, @n6.d t4.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Ze = Ze(zArr);
        if (Ze >= 0) {
            boolean z6 = zArr[Ze];
            for (int i7 = Ze - 1; i7 >= 0; i7--) {
                z6 = qVar.I(Integer.valueOf(i7), Boolean.valueOf(zArr[i7]), Boolean.valueOf(z6)).booleanValue();
            }
            return z6;
        }
        throw new UnsupportedOperationException("Empty array can't be reduced.");
    }

    @n6.d
    public static final long[] Wr(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] jArr2 = new long[jArr.length];
        int We = We(jArr);
        s0 it = new d5.l(0, We).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            jArr2[We - b7] = jArr[b7];
        }
        return jArr2;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Ws(float[] fArr, R r6, t4.q<? super Integer, ? super R, ? super Float, ? extends R> qVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (fArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r6);
        int length = fArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Float.valueOf(fArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Float Wt(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Float f7 = null;
        boolean z6 = false;
        for (float f8 : fArr) {
            if (lVar.O(Float.valueOf(f8)).booleanValue()) {
                if (z6) {
                    return null;
                }
                f7 = Float.valueOf(f8);
                z6 = true;
            }
        }
        if (z6) {
            return f7;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    public static final void Wu(@n6.d double[] dArr, int i7, int i8) {
        u4.l0.p(dArr, "<this>");
        x3.o.m4(dArr, i7, i8);
        vr(dArr, i7, i8);
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Short> Wv(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        return nw(sArr, new g.c(lVar));
    }

    @s4.h(name = "sumOfByte")
    public static final int Ww(@n6.d Byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        int i7 = 0;
        for (Byte b7 : bArr) {
            i7 += b7.byteValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Character> Wx(@n6.d char[] cArr, int i7) {
        u4.l0.p(cArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            if (i7 >= cArr.length) {
                return fz(cArr);
            }
            if (i7 == 1) {
                return x3.v.k(Character.valueOf(cArr[0]));
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (char c7 : cArr) {
                arrayList.add(Character.valueOf(c7));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @n6.d
    public static final HashSet<Double> Wy(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return (HashSet) Ly(dArr, new HashSet(z0.j(dArr.length)));
    }

    @n6.d
    public static final <T> Set<T> Wz(@n6.d T[] tArr, @n6.d Iterable<? extends T> iterable) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<T> Dz = Dz(tArr);
        x3.b0.o0(Dz, iterable);
        return Dz;
    }

    @n6.d
    public static final Iterable<Character> X5(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr.length == 0 ? x3.w.E() : new i(cArr);
    }

    @n6.d
    public static final <K, M extends Map<? super K, ? super Integer>> M X6(@n6.d int[] iArr, @n6.d M m7, @n6.d t4.l<? super Integer, ? extends K> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (int i7 : iArr) {
            m7.put(lVar.O(Integer.valueOf(i7)), Integer.valueOf(i7));
        }
        return m7;
    }

    @k4.f
    public static final float X7(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr[0];
    }

    public static final int X8(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        for (byte b7 : bArr) {
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final List<Boolean> X9(@n6.d boolean[] zArr, int i7) {
        u4.l0.p(zArr, "<this>");
        if (i7 >= 0) {
            return ey(zArr, d5.u.u(zArr.length - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    @n6.d
    public static final <R, V> List<V> XA(@n6.d short[] sArr, @n6.d Iterable<? extends R> iterable, @n6.d t4.p<? super Short, ? super R, ? extends V> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(iterable, "other");
        u4.l0.p(pVar, "transform");
        int length = sArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(Short.valueOf(sArr[i7]), obj));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final <T> List<T> Xa(@n6.d T[] tArr, @n6.d t4.p<? super Integer, ? super T, Boolean> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            T t6 = tArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), t6).booleanValue()) {
                arrayList.add(t6);
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @k4.f
    public static final Boolean Xb(boolean[] zArr, t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                boolean z6 = zArr[length];
                if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                    return Boolean.valueOf(z6);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @n6.d
    public static final <R> List<R> Xc(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (long j7 : jArr) {
            x3.b0.o0(arrayList, lVar.O(Long.valueOf(j7)));
        }
        return arrayList;
    }

    public static final <R> R Xd(@n6.d boolean[] zArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super Boolean, ? extends R> qVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(qVar, "operation");
        int length = zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            r6 = qVar.I(Integer.valueOf(i8), r6, Boolean.valueOf(zArr[i7]));
            i7++;
            i8++;
        }
        return r6;
    }

    public static final <T> int Xe(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T, K, V, M extends Map<? super K, List<V>>> M Xf(@n6.d T[] tArr, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (T t6 : tArr) {
            K O = lVar.O(t6);
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(t6));
        }
        return m7;
    }

    @k4.f
    public static final boolean Xg(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return !(cArr.length == 0);
    }

    public static final int Xh(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[Ve(iArr)];
    }

    @n6.d
    public static final <T, R> List<R> Xi(@n6.d T[] tArr, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            arrayList.add(pVar.J(Integer.valueOf(i8), tArr[i7]));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float Xj(byte[] bArr, t4.l<? super Byte, Float> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Byte.valueOf(bArr[0])).floatValue();
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Byte.valueOf(bArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Xk(short[] sArr, Comparator<? super R> comparator, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Short.valueOf(sArr[0]));
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Short.valueOf(sArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Double Xl(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        int Te = Te(dArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Xm(char[] cArr, t4.l<? super Character, Double> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Character.valueOf(cArr[0])).doubleValue();
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Character.valueOf(cArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final long Xn(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            if (j7 > j8) {
                j7 = j8;
            }
        }
        return j7;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final int[] Xo(int[] iArr, t4.p<? super Integer, ? super Integer, m2> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Integer.valueOf(iArr[i7]));
            i7++;
            i8++;
        }
        return iArr;
    }

    public static final double Xp(@n6.d double[] dArr, @n6.d t4.p<? super Double, ? super Double, Double> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            d7 = pVar.J(Double.valueOf(d7), Double.valueOf(dArr[it.b()])).doubleValue();
        }
        return d7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Boolean Xq(@n6.d boolean[] zArr, @n6.d t4.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Ze = Ze(zArr);
        if (Ze < 0) {
            return null;
        }
        boolean z6 = zArr[Ze];
        for (int i7 = Ze - 1; i7 >= 0; i7--) {
            z6 = qVar.I(Integer.valueOf(i7), Boolean.valueOf(zArr[i7]), Boolean.valueOf(z6)).booleanValue();
        }
        return Boolean.valueOf(z6);
    }

    @n6.d
    public static final <T> T[] Xr(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) x3.m.a(tArr, tArr.length);
        int Xe = Xe(tArr);
        s0 it = new d5.l(0, Xe).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            tArr2[Xe - b7] = tArr[b7];
        }
        return tArr2;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Xs(int[] iArr, R r6, t4.q<? super Integer, ? super R, ? super Integer, ? extends R> qVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (iArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r6);
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Integer.valueOf(iArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Integer Xt(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 1) {
            return Integer.valueOf(iArr[0]);
        }
        return null;
    }

    public static final void Xu(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length > 1) {
            x3.o.n4(fArr);
            wr(fArr);
        }
    }

    @n6.d
    public static final <R extends Comparable<? super R>> List<Boolean> Xv(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        return ow(zArr, new g.c(lVar));
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Xw(byte[] bArr, t4.l<? super Byte, Double> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (byte b7 : bArr) {
            d7 += lVar.O(Byte.valueOf(b7)).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final List<Double> Xx(@n6.d double[] dArr, int i7) {
        u4.l0.p(dArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            if (i7 >= dArr.length) {
                return gz(dArr);
            }
            if (i7 == 1) {
                return x3.v.k(Double.valueOf(dArr[0]));
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (double d7 : dArr) {
                arrayList.add(Double.valueOf(d7));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @n6.d
    public static final HashSet<Float> Xy(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return (HashSet) My(fArr, new HashSet(z0.j(fArr.length)));
    }

    @n6.d
    public static final Set<Short> Xz(@n6.d short[] sArr, @n6.d Iterable<Short> iterable) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Short> Ez = Ez(sArr);
        x3.b0.o0(Ez, iterable);
        return Ez;
    }

    @n6.d
    public static final Iterable<Double> Y5(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr.length == 0 ? x3.w.E() : new g(dArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M Y6(@n6.d int[] iArr, @n6.d M m7, @n6.d t4.l<? super Integer, ? extends K> lVar, @n6.d t4.l<? super Integer, ? extends V> lVar2) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (int i7 : iArr) {
            m7.put(lVar.O(Integer.valueOf(i7)), lVar2.O(Integer.valueOf(i7)));
        }
        return m7;
    }

    @k4.f
    public static final int Y7(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr[0];
    }

    @k4.f
    public static final int Y8(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr.length;
    }

    @n6.d
    public static final List<Byte> Y9(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Re = Re(bArr); -1 < Re; Re--) {
            if (!lVar.O(Byte.valueOf(bArr[Re])).booleanValue()) {
                return Vx(bArr, Re + 1);
            }
        }
        return x3.w.E();
    }

    @n6.d
    public static final <R> List<v3.u0<Short, R>> YA(@n6.d short[] sArr, @n6.d R[] rArr) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(rArr, "other");
        int min = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            short s6 = sArr[i7];
            arrayList.add(v3.q1.a(Short.valueOf(s6), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Short> Ya(@n6.d short[] sArr, @n6.d t4.p<? super Integer, ? super Short, Boolean> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            short s6 = sArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Short.valueOf(s6)).booleanValue()) {
                arrayList.add(Short.valueOf(s6));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @k4.f
    public static final Byte Yb(byte[] bArr, t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                byte b7 = bArr[length];
                if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                    return Byte.valueOf(b7);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @n6.d
    public static final <T, R> List<R> Yc(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t6 : tArr) {
            x3.b0.o0(arrayList, lVar.O(t6));
        }
        return arrayList;
    }

    public static final <R> R Yd(@n6.d byte[] bArr, R r6, @n6.d t4.p<? super Byte, ? super R, ? extends R> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int Re = Re(bArr); Re >= 0; Re--) {
            r6 = pVar.J(Byte.valueOf(bArr[Re]), r6);
        }
        return r6;
    }

    public static final int Ye(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr.length - 1;
    }

    @n6.d
    public static final <K, M extends Map<? super K, List<Short>>> M Yf(@n6.d short[] sArr, @n6.d M m7, @n6.d t4.l<? super Short, ? extends K> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (short s6 : sArr) {
            K O = lVar.O(Short.valueOf(s6));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(Short.valueOf(s6));
        }
        return m7;
    }

    @k4.f
    public static final boolean Yg(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return !(dArr.length == 0);
    }

    public static final int Yh(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                int i8 = iArr[length];
                if (!lVar.O(Integer.valueOf(i8)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return i8;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <R> List<R> Yi(@n6.d short[] sArr, @n6.d t4.p<? super Integer, ? super Short, ? extends R> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(sArr.length);
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            arrayList.add(pVar.J(Integer.valueOf(i8), Short.valueOf(sArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float Yj(char[] cArr, t4.l<? super Character, Float> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Character.valueOf(cArr[0])).floatValue();
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Character.valueOf(cArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Yk(boolean[] zArr, Comparator<? super R> comparator, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Boolean.valueOf(zArr[0]));
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Boolean.valueOf(zArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Float Yl(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        int Ue = Ue(fArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Ym(double[] dArr, t4.l<? super Double, Double> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Double.valueOf(dArr[0])).doubleValue();
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Double.valueOf(dArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    @n6.d
    public static final <T extends Comparable<? super T>> T Yn(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t6 = tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t7 = tArr[it.b()];
            if (t6.compareTo(t7) > 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final long[] Yo(long[] jArr, t4.p<? super Integer, ? super Long, m2> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = jArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Long.valueOf(jArr[i7]));
            i7++;
            i8++;
        }
        return jArr;
    }

    public static final float Yp(@n6.d float[] fArr, @n6.d t4.p<? super Float, ? super Float, Float> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            f7 = pVar.J(Float.valueOf(f7), Float.valueOf(fArr[it.b()])).floatValue();
        }
        return f7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Byte Yq(@n6.d byte[] bArr, @n6.d t4.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Re = Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte b7 = bArr[Re];
        for (int i7 = Re - 1; i7 >= 0; i7--) {
            b7 = qVar.I(Integer.valueOf(i7), Byte.valueOf(bArr[i7]), Byte.valueOf(b7)).byteValue();
        }
        return Byte.valueOf(b7);
    }

    @n6.d
    public static final short[] Yr(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] sArr2 = new short[sArr.length];
        int Ye = Ye(sArr);
        s0 it = new d5.l(0, Ye).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            sArr2[Ye - b7] = sArr[b7];
        }
        return sArr2;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> Ys(long[] jArr, R r6, t4.q<? super Integer, ? super R, ? super Long, ? extends R> qVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (jArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r6);
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Long.valueOf(jArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Integer Yt(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Integer num = null;
        boolean z6 = false;
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                if (z6) {
                    return null;
                }
                num = Integer.valueOf(i7);
                z6 = true;
            }
        }
        if (z6) {
            return num;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    public static final void Yu(@n6.d float[] fArr, int i7, int i8) {
        u4.l0.p(fArr, "<this>");
        x3.o.o4(fArr, i7, i8);
        xr(fArr, i7, i8);
    }

    @n6.d
    public static final List<Byte> Yv(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.h4(copyOf);
        return Ir(copyOf);
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Yw(char[] cArr, t4.l<? super Character, Double> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (char c7 : cArr) {
            d7 += lVar.O(Character.valueOf(c7)).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final List<Float> Yx(@n6.d float[] fArr, int i7) {
        u4.l0.p(fArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            if (i7 >= fArr.length) {
                return hz(fArr);
            }
            if (i7 == 1) {
                return x3.v.k(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (float f7 : fArr) {
                arrayList.add(Float.valueOf(f7));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @n6.d
    public static final HashSet<Integer> Yy(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return (HashSet) Ny(iArr, new HashSet(z0.j(iArr.length)));
    }

    @n6.d
    public static final Set<Boolean> Yz(@n6.d boolean[] zArr, @n6.d Iterable<Boolean> iterable) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Boolean> Fz = Fz(zArr);
        x3.b0.o0(Fz, iterable);
        return Fz;
    }

    @n6.d
    public static final Iterable<Float> Z5(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr.length == 0 ? x3.w.E() : new f(fArr);
    }

    @n6.d
    public static final <K, M extends Map<? super K, ? super Long>> M Z6(@n6.d long[] jArr, @n6.d M m7, @n6.d t4.l<? super Long, ? extends K> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (long j7 : jArr) {
            m7.put(lVar.O(Long.valueOf(j7)), Long.valueOf(j7));
        }
        return m7;
    }

    @k4.f
    public static final long Z7(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr[0];
    }

    public static final int Z8(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final List<Character> Z9(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Se = Se(cArr); -1 < Se; Se--) {
            if (!lVar.O(Character.valueOf(cArr[Se])).booleanValue()) {
                return Wx(cArr, Se + 1);
            }
        }
        return x3.w.E();
    }

    @n6.d
    public static final <R, V> List<V> ZA(@n6.d short[] sArr, @n6.d R[] rArr, @n6.d t4.p<? super Short, ? super R, ? extends V> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(sArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Short.valueOf(sArr[i7]), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Boolean> Za(@n6.d boolean[] zArr, @n6.d t4.p<? super Integer, ? super Boolean, Boolean> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            boolean z6 = zArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Boolean.valueOf(z6)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z6));
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @k4.f
    public static final Character Zb(char[] cArr, t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                char c7 = cArr[length];
                if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                    return Character.valueOf(c7);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @n6.d
    public static final <R> List<R> Zc(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (short s6 : sArr) {
            x3.b0.o0(arrayList, lVar.O(Short.valueOf(s6)));
        }
        return arrayList;
    }

    public static final <R> R Zd(@n6.d char[] cArr, R r6, @n6.d t4.p<? super Character, ? super R, ? extends R> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int Se = Se(cArr); Se >= 0; Se--) {
            r6 = pVar.J(Character.valueOf(cArr[Se]), r6);
        }
        return r6;
    }

    public static final int Ze(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr.length - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, M extends Map<? super K, List<V>>> M Zf(@n6.d short[] sArr, @n6.d M m7, @n6.d t4.l<? super Short, ? extends K> lVar, @n6.d t4.l<? super Short, ? extends V> lVar2) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (short s6 : sArr) {
            K O = lVar.O(Short.valueOf(s6));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(Short.valueOf(s6)));
        }
        return m7;
    }

    @k4.f
    public static final boolean Zg(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return !(fArr.length == 0);
    }

    public static final long Zh(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[We(jArr)];
    }

    @n6.d
    public static final <R> List<R> Zi(@n6.d boolean[] zArr, @n6.d t4.p<? super Integer, ? super Boolean, ? extends R> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList(zArr.length);
        int length = zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            arrayList.add(pVar.J(Integer.valueOf(i8), Boolean.valueOf(zArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float Zj(double[] dArr, t4.l<? super Double, Float> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Double.valueOf(dArr[0])).floatValue();
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Double.valueOf(dArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R Zk(byte[] bArr, Comparator<? super R> comparator, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Byte.valueOf(bArr[0]));
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Byte.valueOf(bArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Integer Zl(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        int Ve = Ve(iArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double Zm(float[] fArr, t4.l<? super Float, Double> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Float.valueOf(fArr[0])).doubleValue();
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Float.valueOf(fArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @s4.h(name = "minOrThrow")
    @v3.g1(version = "1.7")
    public static final short Zn(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            if (s6 > s7) {
                s6 = s7;
            }
        }
        return s6;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <T> T[] Zo(T[] tArr, t4.p<? super Integer, ? super T, m2> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), tArr[i7]);
            i7++;
            i8++;
        }
        return tArr;
    }

    public static final int Zp(@n6.d int[] iArr, @n6.d t4.p<? super Integer, ? super Integer, Integer> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            i7 = pVar.J(Integer.valueOf(i7), Integer.valueOf(iArr[it.b()])).intValue();
        }
        return i7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Character Zq(@n6.d char[] cArr, @n6.d t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Se = Se(cArr);
        if (Se < 0) {
            return null;
        }
        char c7 = cArr[Se];
        for (int i7 = Se - 1; i7 >= 0; i7--) {
            c7 = qVar.I(Integer.valueOf(i7), Character.valueOf(cArr[i7]), Character.valueOf(c7)).charValue();
        }
        return Character.valueOf(c7);
    }

    @n6.d
    public static final boolean[] Zr(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[zArr.length];
        int Ze = Ze(zArr);
        s0 it = new d5.l(0, Ze).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            zArr2[Ze - b7] = zArr[b7];
        }
        return zArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <T, R> List<R> Zs(@n6.d T[] tArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (tArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r6);
        int length = tArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, tArr[i7]);
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Long Zt(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 1) {
            return Long.valueOf(jArr[0]);
        }
        return null;
    }

    public static final void Zu(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length > 1) {
            x3.o.p4(iArr);
            yr(iArr);
        }
    }

    @n6.d
    public static final List<Character> Zv(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.j4(copyOf);
        return Jr(copyOf);
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double Zw(double[] dArr, t4.l<? super Double, Double> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (double d8 : dArr) {
            d7 += lVar.O(Double.valueOf(d8)).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final List<Integer> Zx(@n6.d int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            if (i7 >= iArr.length) {
                return iz(iArr);
            }
            if (i7 == 1) {
                return x3.v.k(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (int i9 : iArr) {
                arrayList.add(Integer.valueOf(i9));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @n6.d
    public static final HashSet<Long> Zy(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return (HashSet) Oy(jArr, new HashSet(z0.j(jArr.length)));
    }

    @n6.d
    public static final Iterable<p0<Byte>> Zz(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return new q0(new u(bArr));
    }

    @n6.d
    public static final Iterable<Integer> a6(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr.length == 0 ? x3.w.E() : new d(iArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M a7(@n6.d long[] jArr, @n6.d M m7, @n6.d t4.l<? super Long, ? extends K> lVar, @n6.d t4.l<? super Long, ? extends V> lVar2) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (long j7 : jArr) {
            m7.put(lVar.O(Long.valueOf(j7)), lVar2.O(Long.valueOf(j7)));
        }
        return m7;
    }

    @k4.f
    public static final <T> T a8(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr[0];
    }

    @k4.f
    public static final int a9(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr.length;
    }

    @n6.d
    public static final Iterable<p0<Character>> aA(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return new q0(new b0(cArr));
    }

    @n6.d
    public static final List<v3.u0<Short, Short>> aB(@n6.d short[] sArr, @n6.d short[] sArr2) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(sArr2, "other");
        int min = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(v3.q1.a(Short.valueOf(sArr[i7]), Short.valueOf(sArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Double> aa(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Te = Te(dArr); -1 < Te; Te--) {
            if (!lVar.O(Double.valueOf(dArr[Te])).booleanValue()) {
                return Xx(dArr, Te + 1);
            }
        }
        return x3.w.E();
    }

    @n6.d
    public static final <C extends Collection<? super Byte>> C ab(@n6.d byte[] bArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Byte, Boolean> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            byte b7 = bArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Byte.valueOf(b7)).booleanValue()) {
                c7.add(Byte.valueOf(b7));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @k4.f
    public static final Double ac(double[] dArr, t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                double d7 = dArr[length];
                if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                    return Double.valueOf(d7);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @n6.d
    public static final <R> List<R> ad(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (boolean z6 : zArr) {
            x3.b0.o0(arrayList, lVar.O(Boolean.valueOf(z6)));
        }
        return arrayList;
    }

    public static final <R> R ae(@n6.d double[] dArr, R r6, @n6.d t4.p<? super Double, ? super R, ? extends R> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int Te = Te(dArr); Te >= 0; Te--) {
            r6 = pVar.J(Double.valueOf(dArr[Te]), r6);
        }
        return r6;
    }

    @k4.f
    public static final byte af(byte[] bArr, int i7, t4.l<? super Integer, Byte> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Re(bArr)) ? lVar.O(Integer.valueOf(i7)).byteValue() : bArr[i7];
    }

    @n6.d
    public static final <K, M extends Map<? super K, List<Boolean>>> M ag(@n6.d boolean[] zArr, @n6.d M m7, @n6.d t4.l<? super Boolean, ? extends K> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (boolean z6 : zArr) {
            K O = lVar.O(Boolean.valueOf(z6));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(Boolean.valueOf(z6));
        }
        return m7;
    }

    @k4.f
    public static final boolean ah(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return !(iArr.length == 0);
    }

    public static final long ai(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                long j7 = jArr[length];
                if (!lVar.O(Long.valueOf(j7)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return j7;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <T, R> List<R> aj(@n6.d T[] tArr, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = i8 + 1;
            R J = pVar.J(Integer.valueOf(i8), tArr[i7]);
            if (J != null) {
                arrayList.add(J);
            }
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float ak(float[] fArr, t4.l<? super Float, Float> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Float.valueOf(fArr[0])).floatValue();
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Float.valueOf(fArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R al(char[] cArr, Comparator<? super R> comparator, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Character.valueOf(cArr[0]));
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Character.valueOf(cArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Long am(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        int We = We(jArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double an(int[] iArr, t4.l<? super Integer, Double> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Integer.valueOf(iArr[0])).doubleValue();
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Integer.valueOf(iArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Boolean ao(@n6.d boolean[] zArr, @n6.d Comparator<? super Boolean> comparator) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (zArr.length == 0) {
            return null;
        }
        boolean z6 = zArr[0];
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            boolean z7 = zArr[it.b()];
            if (comparator.compare(Boolean.valueOf(z6), Boolean.valueOf(z7)) > 0) {
                z6 = z7;
            }
        }
        return Boolean.valueOf(z6);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final short[] ap(short[] sArr, t4.p<? super Integer, ? super Short, m2> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Short.valueOf(sArr[i7]));
            i7++;
            i8++;
        }
        return sArr;
    }

    public static final long aq(@n6.d long[] jArr, @n6.d t4.p<? super Long, ? super Long, Long> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            j7 = pVar.J(Long.valueOf(j7), Long.valueOf(jArr[it.b()])).longValue();
        }
        return j7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Double ar(@n6.d double[] dArr, @n6.d t4.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Te = Te(dArr);
        if (Te < 0) {
            return null;
        }
        double d7 = dArr[Te];
        for (int i7 = Te - 1; i7 >= 0; i7--) {
            d7 = qVar.I(Integer.valueOf(i7), Double.valueOf(dArr[i7]), Double.valueOf(d7)).doubleValue();
        }
        return Double.valueOf(d7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> as(byte[] bArr, R r6, t4.p<? super R, ? super Byte, ? extends R> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (bArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r6);
        for (byte b7 : bArr) {
            r6 = pVar.J(r6, Byte.valueOf(b7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> at(short[] sArr, R r6, t4.q<? super Integer, ? super R, ? super Short, ? extends R> qVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (sArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r6);
        int length = sArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Short.valueOf(sArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final Long au(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Long l7 = null;
        boolean z6 = false;
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                if (z6) {
                    return null;
                }
                l7 = Long.valueOf(j7);
                z6 = true;
            }
        }
        if (z6) {
            return l7;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    public static final void av(@n6.d int[] iArr, int i7, int i8) {
        u4.l0.p(iArr, "<this>");
        x3.o.q4(iArr, i7, i8);
        zr(iArr, i7, i8);
    }

    @n6.d
    public static final List<Double> aw(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.l4(copyOf);
        return Kr(copyOf);
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double ax(float[] fArr, t4.l<? super Float, Double> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (float f7 : fArr) {
            d7 += lVar.O(Float.valueOf(f7)).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final List<Long> ay(@n6.d long[] jArr, int i7) {
        u4.l0.p(jArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            if (i7 >= jArr.length) {
                return jz(jArr);
            }
            if (i7 == 1) {
                return x3.v.k(Long.valueOf(jArr[0]));
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (long j7 : jArr) {
                arrayList.add(Long.valueOf(j7));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @n6.d
    public static final <T> HashSet<T> az(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return (HashSet) Py(tArr, new HashSet(z0.j(tArr.length)));
    }

    @n6.d
    public static final Iterable<Long> b6(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr.length == 0 ? x3.w.E() : new e(jArr);
    }

    @n6.d
    public static final <T, K, M extends Map<? super K, ? super T>> M b7(@n6.d T[] tArr, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (T t6 : tArr) {
            m7.put(lVar.O(t6), t6);
        }
        return m7;
    }

    @k4.f
    public static final short b8(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr[0];
    }

    public static final int b9(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        for (double d7 : dArr) {
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final Iterable<p0<Double>> bA(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return new q0(new z(dArr));
    }

    @n6.d
    public static final <V> List<V> bB(@n6.d short[] sArr, @n6.d short[] sArr2, @n6.d t4.p<? super Short, ? super Short, ? extends V> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(sArr2, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Short.valueOf(sArr[i7]), Short.valueOf(sArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Float> ba(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Ue = Ue(fArr); -1 < Ue; Ue--) {
            if (!lVar.O(Float.valueOf(fArr[Ue])).booleanValue()) {
                return Yx(fArr, Ue + 1);
            }
        }
        return x3.w.E();
    }

    @n6.d
    public static final <C extends Collection<? super Character>> C bb(@n6.d char[] cArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Character, Boolean> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        int length = cArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            char c8 = cArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Character.valueOf(c8)).booleanValue()) {
                c7.add(Character.valueOf(c8));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @k4.f
    public static final Float bc(float[] fArr, t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                float f7 = fArr[length];
                if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                    return Float.valueOf(f7);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> List<R> bd(byte[] bArr, t4.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), Byte.valueOf(bArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    public static final <R> R be(@n6.d float[] fArr, R r6, @n6.d t4.p<? super Float, ? super R, ? extends R> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int Ue = Ue(fArr); Ue >= 0; Ue--) {
            r6 = pVar.J(Float.valueOf(fArr[Ue]), r6);
        }
        return r6;
    }

    @k4.f
    public static final char bf(char[] cArr, int i7, t4.l<? super Integer, Character> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Se(cArr)) ? lVar.O(Integer.valueOf(i7)).charValue() : cArr[i7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <K, V, M extends Map<? super K, List<V>>> M bg(@n6.d boolean[] zArr, @n6.d M m7, @n6.d t4.l<? super Boolean, ? extends K> lVar, @n6.d t4.l<? super Boolean, ? extends V> lVar2) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (boolean z6 : zArr) {
            K O = lVar.O(Boolean.valueOf(z6));
            Object obj = m7.get(O);
            if (obj == null) {
                obj = new ArrayList();
                m7.put(O, obj);
            }
            ((List) obj).add(lVar2.O(Boolean.valueOf(z6)));
        }
        return m7;
    }

    @k4.f
    public static final boolean bh(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return !(jArr.length == 0);
    }

    public static final <T> T bi(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[Xe(tArr)];
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C bj(@n6.d T[] tArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = i8 + 1;
            R J = pVar.J(Integer.valueOf(i8), tArr[i7]);
            if (J != null) {
                c7.add(J);
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float bk(int[] iArr, t4.l<? super Integer, Float> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Integer.valueOf(iArr[0])).floatValue();
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Integer.valueOf(iArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R bl(double[] dArr, Comparator<? super R> comparator, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Double.valueOf(dArr[0]));
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Double.valueOf(dArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <T, R extends Comparable<? super R>> T bm(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t6 = tArr[0];
        int Xe = Xe(tArr);
        if (Xe == 0) {
            return t6;
        }
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
        return t6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double bn(long[] jArr, t4.l<? super Long, Double> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Long.valueOf(jArr[0])).doubleValue();
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Long.valueOf(jArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Byte bo(@n6.d byte[] bArr, @n6.d Comparator<? super Byte> comparator) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            if (comparator.compare(Byte.valueOf(b7), Byte.valueOf(b8)) > 0) {
                b7 = b8;
            }
        }
        return Byte.valueOf(b7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final boolean[] bp(boolean[] zArr, t4.p<? super Integer, ? super Boolean, m2> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Boolean.valueOf(zArr[i7]));
            i7++;
            i8++;
        }
        return zArr;
    }

    public static final <S, T extends S> S bq(@n6.d T[] tArr, @n6.d t4.p<? super S, ? super T, ? extends S> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        Object obj = (S) tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            obj = (S) pVar.J(obj, (Object) tArr[it.b()]);
        }
        return (S) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float br(@n6.d float[] fArr, @n6.d t4.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Ue = Ue(fArr);
        if (Ue < 0) {
            return null;
        }
        float f7 = fArr[Ue];
        for (int i7 = Ue - 1; i7 >= 0; i7--) {
            f7 = qVar.I(Integer.valueOf(i7), Float.valueOf(fArr[i7]), Float.valueOf(f7)).floatValue();
        }
        return Float.valueOf(f7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> bs(char[] cArr, R r6, t4.p<? super R, ? super Character, ? extends R> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (cArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r6);
        for (char c7 : cArr) {
            r6 = pVar.J(r6, Character.valueOf(c7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final <R> List<R> bt(boolean[] zArr, R r6, t4.q<? super Integer, ? super R, ? super Boolean, ? extends R> qVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (zArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r6);
        int length = zArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Boolean.valueOf(zArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.e
    public static final <T> T bu(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final void bv(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length > 1) {
            x3.o.r4(jArr);
            Ar(jArr);
        }
    }

    @n6.d
    public static final List<Float> bw(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.n4(copyOf);
        return Lr(copyOf);
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double bx(int[] iArr, t4.l<? super Integer, Double> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (int i7 : iArr) {
            d7 += lVar.O(Integer.valueOf(i7)).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final HashSet<Short> bz(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return (HashSet) Qy(sArr, new HashSet(z0.j(sArr.length)));
    }

    @n6.d
    public static final <T> Iterable<T> c6(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr.length == 0 ? x3.w.E() : new a(tArr);
    }

    @n6.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M c7(@n6.d T[] tArr, @n6.d M m7, @n6.d t4.l<? super T, ? extends K> lVar, @n6.d t4.l<? super T, ? extends V> lVar2) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (T t6 : tArr) {
            m7.put(lVar.O(t6), lVar2.O(t6));
        }
        return m7;
    }

    @k4.f
    public static final boolean c8(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr[0];
    }

    @k4.f
    public static final int c9(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr.length;
    }

    @n6.d
    public static final Iterable<p0<Float>> cA(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return new q0(new y(fArr));
    }

    @n6.d
    public static final <R> List<v3.u0<Boolean, R>> cB(@n6.d boolean[] zArr, @n6.d Iterable<? extends R> iterable) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(iterable, "other");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(Boolean.valueOf(zArr[i7]), r6));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Integer> ca(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Ve = Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.O(Integer.valueOf(iArr[Ve])).booleanValue()) {
                return Zx(iArr, Ve + 1);
            }
        }
        return x3.w.E();
    }

    @n6.d
    public static final <C extends Collection<? super Double>> C cb(@n6.d double[] dArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Double, Boolean> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        int length = dArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            double d7 = dArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Double.valueOf(d7)).booleanValue()) {
                c7.add(Double.valueOf(d7));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @k4.f
    public static final Integer cc(int[] iArr, t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                int i8 = iArr[length];
                if (lVar.O(Integer.valueOf(i8)).booleanValue()) {
                    return Integer.valueOf(i8);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> List<R> cd(char[] cArr, t4.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = cArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), Character.valueOf(cArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    public static final <R> R ce(@n6.d int[] iArr, R r6, @n6.d t4.p<? super Integer, ? super R, ? extends R> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int Ve = Ve(iArr); Ve >= 0; Ve--) {
            r6 = pVar.J(Integer.valueOf(iArr[Ve]), r6);
        }
        return r6;
    }

    @k4.f
    public static final double cf(double[] dArr, int i7, t4.l<? super Integer, Double> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Te(dArr)) ? lVar.O(Integer.valueOf(i7)).doubleValue() : dArr[i7];
    }

    @v3.g1(version = "1.1")
    @n6.d
    public static final <T, K> l0<T, K> cg(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends K> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        return new s(tArr, lVar);
    }

    @k4.f
    public static final <T> boolean ch(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return !(tArr.length == 0);
    }

    public static final <T> T ci(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                T t6 = tArr[length];
                if (!lVar.O(t6).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return t6;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C cj(@n6.d byte[] bArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Byte, ? extends R> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            c7.add(pVar.J(Integer.valueOf(i8), Byte.valueOf(bArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float ck(long[] jArr, t4.l<? super Long, Float> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Long.valueOf(jArr[0])).floatValue();
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Long.valueOf(jArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R cl(float[] fArr, Comparator<? super R> comparator, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Float.valueOf(fArr[0]));
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Float.valueOf(fArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Short cm(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        int Ye = Ye(sArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> Double cn(T[] tArr, t4.l<? super T, Double> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(tArr[0]).doubleValue();
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(tArr[it.b()]).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Character co(@n6.d char[] cArr, @n6.d Comparator<? super Character> comparator) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            if (comparator.compare(Character.valueOf(c7), Character.valueOf(c8)) > 0) {
                c7 = c8;
            }
        }
        return Character.valueOf(c7);
    }

    @n6.d
    public static final v3.u0<List<Byte>, List<Byte>> cp(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (byte b7 : bArr) {
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                arrayList.add(Byte.valueOf(b7));
            } else {
                arrayList2.add(Byte.valueOf(b7));
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    public static final short cq(@n6.d short[] sArr, @n6.d t4.p<? super Short, ? super Short, Short> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            s6 = pVar.J(Short.valueOf(s6), Short.valueOf(sArr[it.b()])).shortValue();
        }
        return s6;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Integer cr(@n6.d int[] iArr, @n6.d t4.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Ve = Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int i7 = iArr[Ve];
        for (int i8 = Ve - 1; i8 >= 0; i8--) {
            i7 = qVar.I(Integer.valueOf(i8), Integer.valueOf(iArr[i8]), Integer.valueOf(i7)).intValue();
        }
        return Integer.valueOf(i7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> cs(double[] dArr, R r6, t4.p<? super R, ? super Double, ? extends R> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (dArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r6);
        for (double d7 : dArr) {
            r6 = pVar.J(r6, Double.valueOf(d7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void ct(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        dt(bArr, b5.f.f7260k);
    }

    @n6.e
    public static final <T> T cu(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        T t6 = null;
        boolean z6 = false;
        for (T t7 : tArr) {
            if (lVar.O(t7).booleanValue()) {
                if (z6) {
                    return null;
                }
                z6 = true;
                t6 = t7;
            }
        }
        if (z6) {
            return t6;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    public static final void cv(@n6.d long[] jArr, int i7, int i8) {
        u4.l0.p(jArr, "<this>");
        x3.o.s4(jArr, i7, i8);
        Br(jArr, i7, i8);
    }

    @n6.d
    public static final List<Integer> cw(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.p4(copyOf);
        return Mr(copyOf);
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double cx(long[] jArr, t4.l<? super Long, Double> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (long j7 : jArr) {
            d7 += lVar.O(Long.valueOf(j7)).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final <T> List<T> cy(@n6.d T[] tArr, int i7) {
        u4.l0.p(tArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            if (i7 >= tArr.length) {
                return kz(tArr);
            }
            if (i7 == 1) {
                return x3.v.k(tArr[0]);
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (T t6 : tArr) {
                arrayList.add(t6);
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @n6.d
    public static final HashSet<Boolean> cz(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return (HashSet) Ry(zArr, new HashSet(z0.j(zArr.length)));
    }

    @n6.d
    public static final Iterable<Short> d6(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr.length == 0 ? x3.w.E() : new c(sArr);
    }

    @n6.d
    public static final <K, M extends Map<? super K, ? super Short>> M d7(@n6.d short[] sArr, @n6.d M m7, @n6.d t4.l<? super Short, ? extends K> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (short s6 : sArr) {
            m7.put(lVar.O(Short.valueOf(s6)), Short.valueOf(s6));
        }
        return m7;
    }

    @k4.f
    public static final byte d8(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr[1];
    }

    public static final int d9(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        for (float f7 : fArr) {
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final Iterable<p0<Integer>> dA(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return new q0(new w(iArr));
    }

    @n6.d
    public static final <R, V> List<V> dB(@n6.d boolean[] zArr, @n6.d Iterable<? extends R> iterable, @n6.d t4.p<? super Boolean, ? super R, ? extends V> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(iterable, "other");
        u4.l0.p(pVar, "transform");
        int length = zArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(Boolean.valueOf(zArr[i7]), obj));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Long> da(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int We = We(jArr); -1 < We; We--) {
            if (!lVar.O(Long.valueOf(jArr[We])).booleanValue()) {
                return ay(jArr, We + 1);
            }
        }
        return x3.w.E();
    }

    @n6.d
    public static final <C extends Collection<? super Float>> C db(@n6.d float[] fArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Float, Boolean> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            float f7 = fArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Float.valueOf(f7)).booleanValue()) {
                c7.add(Float.valueOf(f7));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @k4.f
    public static final Long dc(long[] jArr, t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                long j7 = jArr[length];
                if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                    return Long.valueOf(j7);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> List<R> dd(double[] dArr, t4.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = dArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), Double.valueOf(dArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    public static final <R> R de(@n6.d long[] jArr, R r6, @n6.d t4.p<? super Long, ? super R, ? extends R> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int We = We(jArr); We >= 0; We--) {
            r6 = pVar.J(Long.valueOf(jArr[We]), r6);
        }
        return r6;
    }

    @k4.f
    public static final float df(float[] fArr, int i7, t4.l<? super Integer, Float> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Ue(fArr)) ? lVar.O(Integer.valueOf(i7)).floatValue() : fArr[i7];
    }

    public static final int dg(@n6.d byte[] bArr, byte b7) {
        u4.l0.p(bArr, "<this>");
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (b7 == bArr[i7]) {
                return i7;
            }
        }
        return -1;
    }

    @k4.f
    public static final boolean dh(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return !(sArr.length == 0);
    }

    public static final short di(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[Ye(sArr)];
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C dj(@n6.d char[] cArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Character, ? extends R> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = cArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            c7.add(pVar.J(Integer.valueOf(i8), Character.valueOf(cArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> float dk(T[] tArr, t4.l<? super T, Float> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(tArr[0]).floatValue();
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(tArr[it.b()]).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R dl(int[] iArr, Comparator<? super R> comparator, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Integer.valueOf(iArr[0]));
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Integer.valueOf(iArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> byte dm(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b7 = bArr[0];
        int Re = Re(bArr);
        if (Re == 0) {
            return b7;
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
        return b7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double dn(short[] sArr, t4.l<? super Short, Double> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Short.valueOf(sArr[0])).doubleValue();
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Short.valueOf(sArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    /* renamed from: do  reason: not valid java name */
    public static final Double m1do(@n6.d double[] dArr, @n6.d Comparator<? super Double> comparator) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            double d8 = dArr[it.b()];
            if (comparator.compare(Double.valueOf(d7), Double.valueOf(d8)) > 0) {
                d7 = d8;
            }
        }
        return Double.valueOf(d7);
    }

    @n6.d
    public static final v3.u0<List<Character>, List<Character>> dp(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                arrayList.add(Character.valueOf(c7));
            } else {
                arrayList2.add(Character.valueOf(c7));
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    public static final boolean dq(@n6.d boolean[] zArr, @n6.d t4.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z6 = zArr[0];
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            z6 = pVar.J(Boolean.valueOf(z6), Boolean.valueOf(zArr[it.b()])).booleanValue();
        }
        return z6;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Long dr(@n6.d long[] jArr, @n6.d t4.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(qVar, "operation");
        int We = We(jArr);
        if (We < 0) {
            return null;
        }
        long j7 = jArr[We];
        for (int i7 = We - 1; i7 >= 0; i7--) {
            j7 = qVar.I(Integer.valueOf(i7), Long.valueOf(jArr[i7]), Long.valueOf(j7)).longValue();
        }
        return Long.valueOf(j7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> ds(float[] fArr, R r6, t4.p<? super R, ? super Float, ? extends R> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (fArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r6);
        for (float f7 : fArr) {
            r6 = pVar.J(r6, Float.valueOf(f7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void dt(@n6.d byte[] bArr, @n6.d b5.f fVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(fVar, "random");
        for (int Re = Re(bArr); Re > 0; Re--) {
            int m7 = fVar.m(Re + 1);
            byte b7 = bArr[Re];
            bArr[Re] = bArr[m7];
            bArr[m7] = b7;
        }
    }

    @n6.e
    public static final Short du(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 1) {
            return Short.valueOf(sArr[0]);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> void dv(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        x3.o.I4(tArr, b4.g.x());
    }

    @n6.d
    public static final List<Long> dw(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.r4(copyOf);
        return Nr(copyOf);
    }

    @s4.h(name = "sumOfDouble")
    public static final double dx(@n6.d Double[] dArr) {
        u4.l0.p(dArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (Double d8 : dArr) {
            d7 += d8.doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final List<Short> dy(@n6.d short[] sArr, int i7) {
        u4.l0.p(sArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            if (i7 >= sArr.length) {
                return lz(sArr);
            }
            if (i7 == 1) {
                return x3.v.k(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (short s6 : sArr) {
                arrayList.add(Short.valueOf(s6));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @n6.d
    public static final int[] dz(@n6.d Integer[] numArr) {
        u4.l0.p(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = numArr[i7].intValue();
        }
        return iArr;
    }

    @n6.d
    public static final Iterable<Boolean> e6(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr.length == 0 ? x3.w.E() : new h(zArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M e7(@n6.d short[] sArr, @n6.d M m7, @n6.d t4.l<? super Short, ? extends K> lVar, @n6.d t4.l<? super Short, ? extends V> lVar2) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (short s6 : sArr) {
            m7.put(lVar.O(Short.valueOf(s6)), lVar2.O(Short.valueOf(s6)));
        }
        return m7;
    }

    @k4.f
    public static final char e8(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr[1];
    }

    @k4.f
    public static final int e9(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr.length;
    }

    @n6.d
    public static final Iterable<p0<Long>> eA(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return new q0(new x(jArr));
    }

    @n6.d
    public static final <R> List<v3.u0<Boolean, R>> eB(@n6.d boolean[] zArr, @n6.d R[] rArr) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(rArr, "other");
        int min = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            boolean z6 = zArr[i7];
            arrayList.add(v3.q1.a(Boolean.valueOf(z6), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final <T> List<T> ea(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Xe = Xe(tArr); -1 < Xe; Xe--) {
            if (!lVar.O(tArr[Xe]).booleanValue()) {
                return cy(tArr, Xe + 1);
            }
        }
        return x3.w.E();
    }

    @n6.d
    public static final <C extends Collection<? super Integer>> C eb(@n6.d int[] iArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Integer, Boolean> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = iArr[i7];
            int i10 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Integer.valueOf(i9)).booleanValue()) {
                c7.add(Integer.valueOf(i9));
            }
            i7++;
            i8 = i10;
        }
        return c7;
    }

    @k4.f
    public static final <T> T ec(T[] tArr, t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = tArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                T t6 = tArr[length];
                if (lVar.O(t6).booleanValue()) {
                    return t6;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> List<R> ed(float[] fArr, t4.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), Float.valueOf(fArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R ee(@n6.d T[] tArr, R r6, @n6.d t4.p<? super T, ? super R, ? extends R> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int Xe = Xe(tArr); Xe >= 0; Xe--) {
            r6 = pVar.J(tArr[Xe], r6);
        }
        return r6;
    }

    @k4.f
    public static final int ef(int[] iArr, int i7, t4.l<? super Integer, Integer> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Ve(iArr)) ? lVar.O(Integer.valueOf(i7)).intValue() : iArr[i7];
    }

    public static final int eg(@n6.d char[] cArr, char c7) {
        u4.l0.p(cArr, "<this>");
        int length = cArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (c7 == cArr[i7]) {
                return i7;
            }
        }
        return -1;
    }

    @k4.f
    public static final boolean eh(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return !(zArr.length == 0);
    }

    public static final short ei(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                short s6 = sArr[length];
                if (!lVar.O(Short.valueOf(s6)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return s6;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C ej(@n6.d double[] dArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Double, ? extends R> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = dArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            c7.add(pVar.J(Integer.valueOf(i8), Double.valueOf(dArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float ek(short[] sArr, t4.l<? super Short, Float> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Short.valueOf(sArr[0])).floatValue();
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Short.valueOf(sArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R el(long[] jArr, Comparator<? super R> comparator, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Long.valueOf(jArr[0]));
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Long.valueOf(jArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> char em(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c7 = cArr[0];
        int Se = Se(cArr);
        if (Se == 0) {
            return c7;
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
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double en(boolean[] zArr, t4.l<? super Boolean, Double> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Boolean.valueOf(zArr[0])).doubleValue();
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Boolean.valueOf(zArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float eo(@n6.d float[] fArr, @n6.d Comparator<? super Float> comparator) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            float f8 = fArr[it.b()];
            if (comparator.compare(Float.valueOf(f7), Float.valueOf(f8)) > 0) {
                f7 = f8;
            }
        }
        return Float.valueOf(f7);
    }

    @n6.d
    public static final v3.u0<List<Double>, List<Double>> ep(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (double d7 : dArr) {
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                arrayList.add(Double.valueOf(d7));
            } else {
                arrayList2.add(Double.valueOf(d7));
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    public static final byte eq(@n6.d byte[] bArr, @n6.d t4.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (bArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            int b8 = it.b();
            b7 = qVar.I(Integer.valueOf(b8), Byte.valueOf(b7), Byte.valueOf(bArr[b8])).byteValue();
        }
        return b7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <S, T extends S> S er(@n6.d T[] tArr, @n6.d t4.q<? super Integer, ? super T, ? super S, ? extends S> qVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Xe = Xe(tArr);
        if (Xe < 0) {
            return null;
        }
        Object obj = (S) tArr[Xe];
        for (int i7 = Xe - 1; i7 >= 0; i7--) {
            obj = (S) qVar.I(Integer.valueOf(i7), (Object) tArr[i7], obj);
        }
        return (S) obj;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> es(int[] iArr, R r6, t4.p<? super R, ? super Integer, ? extends R> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (iArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r6);
        for (int i7 : iArr) {
            r6 = pVar.J(r6, Integer.valueOf(i7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void et(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        ft(cArr, b5.f.f7260k);
    }

    @n6.e
    public static final Short eu(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Short sh = null;
        boolean z6 = false;
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                if (z6) {
                    return null;
                }
                sh = Short.valueOf(s6);
                z6 = true;
            }
        }
        if (z6) {
            return sh;
        }
        return null;
    }

    @v3.g1(version = "1.4")
    public static final <T extends Comparable<? super T>> void ev(@n6.d T[] tArr, int i7, int i8) {
        u4.l0.p(tArr, "<this>");
        x3.o.J4(tArr, b4.g.x(), i7, i8);
    }

    @n6.d
    public static final <T extends Comparable<? super T>> List<T> ew(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return mw(tArr, b4.g.x());
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> double ex(T[] tArr, t4.l<? super T, Double> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (T t6 : tArr) {
            d7 += lVar.O(t6).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final List<Boolean> ey(@n6.d boolean[] zArr, int i7) {
        u4.l0.p(zArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            if (i7 >= zArr.length) {
                return mz(zArr);
            }
            if (i7 == 1) {
                return x3.v.k(Boolean.valueOf(zArr[0]));
            }
            ArrayList arrayList = new ArrayList(i7);
            int i8 = 0;
            for (boolean z6 : zArr) {
                arrayList.add(Boolean.valueOf(z6));
                i8++;
                if (i8 == i7) {
                    break;
                }
            }
            return arrayList;
        }
    }

    @n6.d
    public static final List<Byte> ez(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? oz(bArr) : x3.v.k(Byte.valueOf(bArr[0])) : x3.w.E();
    }

    @n6.d
    public static final f5.m<Byte> f6(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr.length == 0 ? f5.s.g() : new k(bArr);
    }

    @n6.d
    public static final <K, M extends Map<? super K, ? super Boolean>> M f7(@n6.d boolean[] zArr, @n6.d M m7, @n6.d t4.l<? super Boolean, ? extends K> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        for (boolean z6 : zArr) {
            m7.put(lVar.O(Boolean.valueOf(z6)), Boolean.valueOf(z6));
        }
        return m7;
    }

    @k4.f
    public static final double f8(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr[1];
    }

    public static final int f9(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        for (int i8 : iArr) {
            if (lVar.O(Integer.valueOf(i8)).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final <T> Iterable<p0<T>> fA(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return new q0(new t(tArr));
    }

    @n6.d
    public static final <R, V> List<V> fB(@n6.d boolean[] zArr, @n6.d R[] rArr, @n6.d t4.p<? super Boolean, ? super R, ? extends V> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(zArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Boolean.valueOf(zArr[i7]), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Short> fa(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Ye = Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.O(Short.valueOf(sArr[Ye])).booleanValue()) {
                return dy(sArr, Ye + 1);
            }
        }
        return x3.w.E();
    }

    @n6.d
    public static final <C extends Collection<? super Long>> C fb(@n6.d long[] jArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Long, Boolean> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        int length = jArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            long j7 = jArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Long.valueOf(j7)).booleanValue()) {
                c7.add(Long.valueOf(j7));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    @k4.f
    public static final Short fc(short[] sArr, t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                short s6 = sArr[length];
                if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                    return Short.valueOf(s6);
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return null;
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> List<R> fd(int[] iArr, t4.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), Integer.valueOf(iArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    public static final <R> R fe(@n6.d short[] sArr, R r6, @n6.d t4.p<? super Short, ? super R, ? extends R> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int Ye = Ye(sArr); Ye >= 0; Ye--) {
            r6 = pVar.J(Short.valueOf(sArr[Ye]), r6);
        }
        return r6;
    }

    @k4.f
    public static final long ff(long[] jArr, int i7, t4.l<? super Integer, Long> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > We(jArr)) ? lVar.O(Integer.valueOf(i7)).longValue() : jArr[i7];
    }

    @v3.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @v3.b1(expression = "indexOfFirst { it == element }", imports = {}))
    @v3.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int fg(double[] dArr, double d7) {
        u4.l0.p(dArr, "<this>");
        int length = dArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (d7 == dArr[i7]) {
                return i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <A extends Appendable> A fh(@n6.d byte[] bArr, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Byte, ? extends CharSequence> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (byte b7 : bArr) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (lVar != null) {
                a7.append(lVar.O(Byte.valueOf(b7)));
            } else {
                a7.append(String.valueOf((int) b7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    public static final boolean fi(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[Ze(zArr)];
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C fj(@n6.d float[] fArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Float, ? extends R> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            c7.add(pVar.J(Integer.valueOf(i8), Float.valueOf(fArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float fk(boolean[] zArr, t4.l<? super Boolean, Float> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Boolean.valueOf(zArr[0])).floatValue();
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.O(Boolean.valueOf(zArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> R fl(T[] tArr, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(tArr[0]);
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(tArr[it.b()]);
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> double fm(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d7 = dArr[0];
        int Te = Te(dArr);
        if (Te == 0) {
            return d7;
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
        return d7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float fn(byte[] bArr, t4.l<? super Byte, Float> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Byte.valueOf(bArr[0])).floatValue();
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Byte.valueOf(bArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Integer fo(@n6.d int[] iArr, @n6.d Comparator<? super Integer> comparator) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            if (comparator.compare(Integer.valueOf(i7), Integer.valueOf(i8)) > 0) {
                i7 = i8;
            }
        }
        return Integer.valueOf(i7);
    }

    @n6.d
    public static final v3.u0<List<Float>, List<Float>> fp(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (float f7 : fArr) {
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                arrayList.add(Float.valueOf(f7));
            } else {
                arrayList2.add(Float.valueOf(f7));
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    public static final char fq(@n6.d char[] cArr, @n6.d t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (cArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            c7 = qVar.I(Integer.valueOf(b7), Character.valueOf(c7), Character.valueOf(cArr[b7])).charValue();
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Short fr(@n6.d short[] sArr, @n6.d t4.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(qVar, "operation");
        int Ye = Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short s6 = sArr[Ye];
        for (int i7 = Ye - 1; i7 >= 0; i7--) {
            s6 = qVar.I(Integer.valueOf(i7), Short.valueOf(sArr[i7]), Short.valueOf(s6)).shortValue();
        }
        return Short.valueOf(s6);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> fs(long[] jArr, R r6, t4.p<? super R, ? super Long, ? extends R> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (jArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r6);
        for (long j7 : jArr) {
            r6 = pVar.J(r6, Long.valueOf(j7));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void ft(@n6.d char[] cArr, @n6.d b5.f fVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(fVar, "random");
        for (int Se = Se(cArr); Se > 0; Se--) {
            int m7 = fVar.m(Se + 1);
            char c7 = cArr[Se];
            cArr[Se] = cArr[m7];
            cArr[m7] = c7;
        }
    }

    @n6.d
    public static final List<Byte> fu(@n6.d byte[] bArr, @n6.d d5.l lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? x3.w.E() : x3.o.n(x3.o.G1(bArr, lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    public static final void fv(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length > 1) {
            x3.o.x4(sArr);
            Er(sArr);
        }
    }

    @n6.d
    public static final List<Short> fw(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.x4(copyOf);
        return Pr(copyOf);
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double fx(short[] sArr, t4.l<? super Short, Double> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (short s6 : sArr) {
            d7 += lVar.O(Short.valueOf(s6)).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final List<Byte> fy(@n6.d byte[] bArr, int i7) {
        u4.l0.p(bArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            int length = bArr.length;
            if (i7 >= length) {
                return ez(bArr);
            }
            if (i7 == 1) {
                return x3.v.k(Byte.valueOf(bArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = length - i7; i8 < length; i8++) {
                arrayList.add(Byte.valueOf(bArr[i8]));
            }
            return arrayList;
        }
    }

    @n6.d
    public static final List<Character> fz(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? pz(cArr) : x3.v.k(Character.valueOf(cArr[0])) : x3.w.E();
    }

    @n6.d
    public static final f5.m<Character> g6(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr.length == 0 ? f5.s.g() : new r(cArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M g7(@n6.d boolean[] zArr, @n6.d M m7, @n6.d t4.l<? super Boolean, ? extends K> lVar, @n6.d t4.l<? super Boolean, ? extends V> lVar2) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        for (boolean z6 : zArr) {
            m7.put(lVar.O(Boolean.valueOf(z6)), lVar2.O(Boolean.valueOf(z6)));
        }
        return m7;
    }

    @k4.f
    public static final float g8(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr[1];
    }

    @k4.f
    public static final int g9(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr.length;
    }

    @n6.d
    public static final Iterable<p0<Short>> gA(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return new q0(new v(sArr));
    }

    @n6.d
    public static final List<v3.u0<Boolean, Boolean>> gB(@n6.d boolean[] zArr, @n6.d boolean[] zArr2) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(zArr2, "other");
        int min = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(v3.q1.a(Boolean.valueOf(zArr[i7]), Boolean.valueOf(zArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Boolean> ga(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Ze = Ze(zArr); -1 < Ze; Ze--) {
            if (!lVar.O(Boolean.valueOf(zArr[Ze])).booleanValue()) {
                return ey(zArr, Ze + 1);
            }
        }
        return x3.w.E();
    }

    @n6.d
    public static final <T, C extends Collection<? super T>> C gb(@n6.d T[] tArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super T, Boolean> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            T t6 = tArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), t6).booleanValue()) {
                c7.add(t6);
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    public static final byte gc(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[0];
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> List<R> gd(long[] jArr, t4.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), Long.valueOf(jArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    public static final <R> R ge(@n6.d boolean[] zArr, R r6, @n6.d t4.p<? super Boolean, ? super R, ? extends R> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "operation");
        for (int Ze = Ze(zArr); Ze >= 0; Ze--) {
            r6 = pVar.J(Boolean.valueOf(zArr[Ze]), r6);
        }
        return r6;
    }

    @k4.f
    public static final <T> T gf(T[] tArr, int i7, t4.l<? super Integer, ? extends T> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Xe(tArr)) ? lVar.O(Integer.valueOf(i7)) : tArr[i7];
    }

    @v3.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfFirst { it == element }' instead to continue using this behavior, or '.asList().indexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @v3.b1(expression = "indexOfFirst { it == element }", imports = {}))
    @v3.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int gg(float[] fArr, float f7) {
        u4.l0.p(fArr, "<this>");
        int length = fArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (f7 == fArr[i7]) {
                return i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <A extends Appendable> A gh(@n6.d char[] cArr, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Character, ? extends CharSequence> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (char c7 : cArr) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (lVar != null) {
                a7.append(lVar.O(Character.valueOf(c7)));
            } else {
                a7.append(c7);
            }
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    public static final boolean gi(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                boolean z6 = zArr[length];
                if (!lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                } else {
                    return z6;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C gj(@n6.d int[] iArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Integer, ? extends R> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            c7.add(pVar.J(Integer.valueOf(i8), Integer.valueOf(iArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R gk(byte[] bArr, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Byte.valueOf(bArr[0]));
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Byte.valueOf(bArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R gl(short[] sArr, Comparator<? super R> comparator, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Short.valueOf(sArr[0]));
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Short.valueOf(sArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> float gm(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f7 = fArr[0];
        int Ue = Ue(fArr);
        if (Ue == 0) {
            return f7;
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
        return f7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float gn(char[] cArr, t4.l<? super Character, Float> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Character.valueOf(cArr[0])).floatValue();
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Character.valueOf(cArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Long go(@n6.d long[] jArr, @n6.d Comparator<? super Long> comparator) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            if (comparator.compare(Long.valueOf(j7), Long.valueOf(j8)) > 0) {
                j7 = j8;
            }
        }
        return Long.valueOf(j7);
    }

    @n6.d
    public static final v3.u0<List<Integer>, List<Integer>> gp(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                arrayList.add(Integer.valueOf(i7));
            } else {
                arrayList2.add(Integer.valueOf(i7));
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    public static final double gq(@n6.d double[] dArr, @n6.d t4.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (dArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            d7 = qVar.I(Integer.valueOf(b7), Double.valueOf(d7), Double.valueOf(dArr[b7])).doubleValue();
        }
        return d7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Boolean gr(@n6.d boolean[] zArr, @n6.d t4.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Ze = Ze(zArr);
        if (Ze < 0) {
            return null;
        }
        boolean z6 = zArr[Ze];
        for (int i7 = Ze - 1; i7 >= 0; i7--) {
            z6 = pVar.J(Boolean.valueOf(zArr[i7]), Boolean.valueOf(z6)).booleanValue();
        }
        return Boolean.valueOf(z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @n6.d
    public static final <T, R> List<R> gs(@n6.d T[] tArr, R r6, @n6.d t4.p<? super R, ? super T, ? extends R> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (tArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r6);
        for (b.a aVar : tArr) {
            r6 = pVar.J(r6, aVar);
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void gt(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        ht(dArr, b5.f.f7260k);
    }

    @n6.d
    public static final List<Byte> gu(@n6.d byte[] bArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf(bArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void gv(@n6.d short[] sArr, int i7, int i8) {
        u4.l0.p(sArr, "<this>");
        x3.o.y4(sArr, i7, i8);
        Fr(sArr, i7, i8);
    }

    @n6.d
    public static final List<Byte> gw(@n6.d byte[] bArr, @n6.d Comparator<? super Byte> comparator) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        Byte[] o52 = x3.o.o5(bArr);
        x3.o.I4(o52, comparator);
        return x3.o.t(o52);
    }

    @s4.h(name = "sumOfDouble")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double gx(boolean[] zArr, t4.l<? super Boolean, Double> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (boolean z6 : zArr) {
            d7 += lVar.O(Boolean.valueOf(z6)).doubleValue();
        }
        return d7;
    }

    @n6.d
    public static final List<Character> gy(@n6.d char[] cArr, int i7) {
        u4.l0.p(cArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            int length = cArr.length;
            if (i7 >= length) {
                return fz(cArr);
            }
            if (i7 == 1) {
                return x3.v.k(Character.valueOf(cArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = length - i7; i8 < length; i8++) {
                arrayList.add(Character.valueOf(cArr[i8]));
            }
            return arrayList;
        }
    }

    @n6.d
    public static final List<Double> gz(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? qz(dArr) : x3.v.k(Double.valueOf(dArr[0])) : x3.w.E();
    }

    @n6.d
    public static final f5.m<Double> h6(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr.length == 0 ? f5.s.g() : new C0265p(dArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M h7(@n6.d byte[] bArr, @n6.d M m7, @n6.d t4.l<? super Byte, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (byte b7 : bArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Byte.valueOf(b7));
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @k4.f
    public static final int h8(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr[1];
    }

    public static final int h9(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final Iterable<p0<Boolean>> hA(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return new q0(new a0(zArr));
    }

    @n6.d
    public static final <V> List<V> hB(@n6.d boolean[] zArr, @n6.d boolean[] zArr2, @n6.d t4.p<? super Boolean, ? super Boolean, ? extends V> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(zArr2, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(zArr.length, zArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Boolean.valueOf(zArr[i7]), Boolean.valueOf(zArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Byte> ha(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (byte b7 : bArr) {
            if (z6) {
                arrayList.add(Byte.valueOf(b7));
            } else if (!lVar.O(Byte.valueOf(b7)).booleanValue()) {
                arrayList.add(Byte.valueOf(b7));
                z6 = true;
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <C extends Collection<? super Short>> C hb(@n6.d short[] sArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Short, Boolean> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            short s6 = sArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Short.valueOf(s6)).booleanValue()) {
                c7.add(Short.valueOf(s6));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    public static final byte hc(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (byte b7 : bArr) {
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                return b7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> List<R> hd(T[] tArr, t4.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), tArr[i7]));
            i7++;
            i8++;
        }
        return arrayList;
    }

    public static final <R> R he(@n6.d byte[] bArr, R r6, @n6.d t4.q<? super Integer, ? super Byte, ? super R, ? extends R> qVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(qVar, "operation");
        for (int Re = Re(bArr); Re >= 0; Re--) {
            r6 = qVar.I(Integer.valueOf(Re), Byte.valueOf(bArr[Re]), r6);
        }
        return r6;
    }

    @k4.f
    public static final short hf(short[] sArr, int i7, t4.l<? super Integer, Short> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Ye(sArr)) ? lVar.O(Integer.valueOf(i7)).shortValue() : sArr[i7];
    }

    public static final int hg(@n6.d int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (i7 == iArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    @n6.d
    public static final <A extends Appendable> A hh(@n6.d double[] dArr, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Double, ? extends CharSequence> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (double d7 : dArr) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (lVar != null) {
                a7.append(lVar.O(Double.valueOf(d7)));
            } else {
                a7.append(String.valueOf(d7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    public static final int hi(@n6.d byte[] bArr, byte b7) {
        u4.l0.p(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (b7 == bArr[length]) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C hj(@n6.d long[] jArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Long, ? extends R> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = jArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            c7.add(pVar.J(Integer.valueOf(i8), Long.valueOf(jArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R hk(char[] cArr, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Character.valueOf(cArr[0]));
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Character.valueOf(cArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R hl(boolean[] zArr, Comparator<? super R> comparator, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Boolean.valueOf(zArr[0]));
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Boolean.valueOf(zArr[it.b()]));
            if (comparator.compare(obj, O) < 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> int hm(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i7 = iArr[0];
        int Ve = Ve(iArr);
        if (Ve == 0) {
            return i7;
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
        return i7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float hn(double[] dArr, t4.l<? super Double, Float> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Double.valueOf(dArr[0])).floatValue();
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Double.valueOf(dArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <T> T ho(@n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (tArr.length == 0) {
            return null;
        }
        T t6 = tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t7 = tArr[it.b()];
            if (comparator.compare(t6, t7) > 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    @n6.d
    public static final v3.u0<List<Long>, List<Long>> hp(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                arrayList.add(Long.valueOf(j7));
            } else {
                arrayList2.add(Long.valueOf(j7));
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    public static final float hq(@n6.d float[] fArr, @n6.d t4.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (fArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            f7 = qVar.I(Integer.valueOf(b7), Float.valueOf(f7), Float.valueOf(fArr[b7])).floatValue();
        }
        return f7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Byte hr(@n6.d byte[] bArr, @n6.d t4.p<? super Byte, ? super Byte, Byte> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Re = Re(bArr);
        if (Re < 0) {
            return null;
        }
        byte b7 = bArr[Re];
        for (int i7 = Re - 1; i7 >= 0; i7--) {
            b7 = pVar.J(Byte.valueOf(bArr[i7]), Byte.valueOf(b7)).byteValue();
        }
        return Byte.valueOf(b7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> hs(short[] sArr, R r6, t4.p<? super R, ? super Short, ? extends R> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (sArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r6);
        for (short s6 : sArr) {
            r6 = pVar.J(r6, Short.valueOf(s6));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void ht(@n6.d double[] dArr, @n6.d b5.f fVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(fVar, "random");
        for (int Te = Te(dArr); Te > 0; Te--) {
            int m7 = fVar.m(Te + 1);
            double d7 = dArr[Te];
            dArr[Te] = dArr[m7];
            dArr[m7] = d7;
        }
    }

    @n6.d
    public static final List<Character> hu(@n6.d char[] cArr, @n6.d d5.l lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? x3.w.E() : x3.o.o(x3.o.H1(cArr, lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    @n6.d
    public static final List<Byte> hv(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        Byte[] o52 = x3.o.o5(bArr);
        x3.o.v4(o52);
        return x3.o.t(o52);
    }

    @n6.d
    public static final List<Character> hw(@n6.d char[] cArr, @n6.d Comparator<? super Character> comparator) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        Character[] p52 = x3.o.p5(cArr);
        x3.o.I4(p52, comparator);
        return x3.o.t(p52);
    }

    @s4.h(name = "sumOfFloat")
    public static final float hx(@n6.d Float[] fArr) {
        u4.l0.p(fArr, "<this>");
        float f7 = 0.0f;
        for (Float f8 : fArr) {
            f7 += f8.floatValue();
        }
        return f7;
    }

    @n6.d
    public static final List<Double> hy(@n6.d double[] dArr, int i7) {
        u4.l0.p(dArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            int length = dArr.length;
            if (i7 >= length) {
                return gz(dArr);
            }
            if (i7 == 1) {
                return x3.v.k(Double.valueOf(dArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = length - i7; i8 < length; i8++) {
                arrayList.add(Double.valueOf(dArr[i8]));
            }
            return arrayList;
        }
    }

    @n6.d
    public static final List<Float> hz(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? rz(fArr) : x3.v.k(Float.valueOf(fArr[0])) : x3.w.E();
    }

    @n6.d
    public static final f5.m<Float> i6(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr.length == 0 ? f5.s.g() : new o(fArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M i7(@n6.d char[] cArr, @n6.d M m7, @n6.d t4.l<? super Character, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (char c7 : cArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Character.valueOf(c7));
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @k4.f
    public static final long i8(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr[1];
    }

    @k4.f
    public static final <T> int i9(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr.length;
    }

    @n6.d
    public static final <R> List<v3.u0<Byte, R>> iA(@n6.d byte[] bArr, @n6.d Iterable<? extends R> iterable) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(iterable, "other");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(Byte.valueOf(bArr[i7]), r6));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Character> ia(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (char c7 : cArr) {
            if (z6) {
                arrayList.add(Character.valueOf(c7));
            } else if (!lVar.O(Character.valueOf(c7)).booleanValue()) {
                arrayList.add(Character.valueOf(c7));
                z6 = true;
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <C extends Collection<? super Boolean>> C ib(@n6.d boolean[] zArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Boolean, Boolean> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "predicate");
        int length = zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            boolean z6 = zArr[i7];
            int i9 = i8 + 1;
            if (pVar.J(Integer.valueOf(i8), Boolean.valueOf(z6)).booleanValue()) {
                c7.add(Boolean.valueOf(z6));
            }
            i7++;
            i8 = i9;
        }
        return c7;
    }

    public static final char ic(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[0];
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> List<R> id(short[] sArr, t4.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), Short.valueOf(sArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    public static final <R> R ie(@n6.d char[] cArr, R r6, @n6.d t4.q<? super Integer, ? super Character, ? super R, ? extends R> qVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(qVar, "operation");
        for (int Se = Se(cArr); Se >= 0; Se--) {
            r6 = qVar.I(Integer.valueOf(Se), Character.valueOf(cArr[Se]), r6);
        }
        return r6;
    }

    @k4.f
    /* renamed from: if  reason: not valid java name */
    public static final boolean m2if(boolean[] zArr, int i7, t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Ze(zArr)) ? lVar.O(Integer.valueOf(i7)).booleanValue() : zArr[i7];
    }

    public static final int ig(@n6.d long[] jArr, long j7) {
        u4.l0.p(jArr, "<this>");
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (j7 == jArr[i7]) {
                return i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <A extends Appendable> A ih(@n6.d float[] fArr, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Float, ? extends CharSequence> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (float f7 : fArr) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (lVar != null) {
                a7.append(lVar.O(Float.valueOf(f7)));
            } else {
                a7.append(String.valueOf(f7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    public static final int ii(@n6.d char[] cArr, char c7) {
        u4.l0.p(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (c7 == cArr[length]) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C ij(@n6.d T[] tArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super T, ? extends R> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            c7.add(pVar.J(Integer.valueOf(i8), tArr[i7]));
            i7++;
            i8++;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R ik(double[] dArr, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Double.valueOf(dArr[0]));
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Double.valueOf(dArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Byte il(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            if (b7 < b8) {
                b7 = b8;
            }
        }
        return Byte.valueOf(b7);
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> long im(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j7 = jArr[0];
        int We = We(jArr);
        if (We == 0) {
            return j7;
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
        return j7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float in(float[] fArr, t4.l<? super Float, Float> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Float.valueOf(fArr[0])).floatValue();
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Float.valueOf(fArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Short io(@n6.d short[] sArr, @n6.d Comparator<? super Short> comparator) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            if (comparator.compare(Short.valueOf(s6), Short.valueOf(s7)) > 0) {
                s6 = s7;
            }
        }
        return Short.valueOf(s6);
    }

    @n6.d
    public static final <T> v3.u0<List<T>, List<T>> ip(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t6 : tArr) {
            if (lVar.O(t6).booleanValue()) {
                arrayList.add(t6);
            } else {
                arrayList2.add(t6);
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    public static final int iq(@n6.d int[] iArr, @n6.d t4.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            i7 = qVar.I(Integer.valueOf(b7), Integer.valueOf(i7), Integer.valueOf(iArr[b7])).intValue();
        }
        return i7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Character ir(@n6.d char[] cArr, @n6.d t4.p<? super Character, ? super Character, Character> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Se = Se(cArr);
        if (Se < 0) {
            return null;
        }
        char c7 = cArr[Se];
        for (int i7 = Se - 1; i7 >= 0; i7--) {
            c7 = pVar.J(Character.valueOf(cArr[i7]), Character.valueOf(c7)).charValue();
        }
        return Character.valueOf(c7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> is(boolean[] zArr, R r6, t4.p<? super R, ? super Boolean, ? extends R> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (zArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r6);
        for (boolean z6 : zArr) {
            r6 = pVar.J(r6, Boolean.valueOf(z6));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @n6.d
    public static final List<Character> iu(@n6.d char[] cArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(cArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Character> iv(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        Character[] p52 = x3.o.p5(cArr);
        x3.o.v4(p52);
        return x3.o.t(p52);
    }

    @n6.d
    public static final List<Double> iw(@n6.d double[] dArr, @n6.d Comparator<? super Double> comparator) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        Double[] q52 = x3.o.q5(dArr);
        x3.o.I4(q52, comparator);
        return x3.o.t(q52);
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final int ix(byte[] bArr, t4.l<? super Byte, Integer> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (byte b7 : bArr) {
            i7 += lVar.O(Byte.valueOf(b7)).intValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Float> iy(@n6.d float[] fArr, int i7) {
        u4.l0.p(fArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            int length = fArr.length;
            if (i7 >= length) {
                return hz(fArr);
            }
            if (i7 == 1) {
                return x3.v.k(Float.valueOf(fArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = length - i7; i8 < length; i8++) {
                arrayList.add(Float.valueOf(fArr[i8]));
            }
            return arrayList;
        }
    }

    @n6.d
    public static final List<Integer> iz(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? sz(iArr) : x3.v.k(Integer.valueOf(iArr[0])) : x3.w.E();
    }

    @n6.d
    public static final f5.m<Integer> j6(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr.length == 0 ? f5.s.g() : new m(iArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M j7(@n6.d double[] dArr, @n6.d M m7, @n6.d t4.l<? super Double, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (double d7 : dArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Double.valueOf(d7));
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @k4.f
    public static final <T> T j8(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr[1];
    }

    public static final <T> int j9(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        for (T t6 : tArr) {
            if (lVar.O(t6).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final <R, V> List<V> jA(@n6.d byte[] bArr, @n6.d Iterable<? extends R> iterable, @n6.d t4.p<? super Byte, ? super R, ? extends V> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(iterable, "other");
        u4.l0.p(pVar, "transform");
        int length = bArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(Byte.valueOf(bArr[i7]), obj));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Double> ja(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (double d7 : dArr) {
            if (z6) {
                arrayList.add(Double.valueOf(d7));
            } else if (!lVar.O(Double.valueOf(d7)).booleanValue()) {
                arrayList.add(Double.valueOf(d7));
                z6 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R> List<R> jb(Object[] objArr) {
        u4.l0.p(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            u4.l0.y(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final char jc(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                return c7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @s4.h(name = "flatMapIndexedIterable")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> List<R> jd(boolean[] zArr, t4.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(arrayList, pVar.J(Integer.valueOf(i8), Boolean.valueOf(zArr[i7])));
            i7++;
            i8++;
        }
        return arrayList;
    }

    public static final <R> R je(@n6.d double[] dArr, R r6, @n6.d t4.q<? super Integer, ? super Double, ? super R, ? extends R> qVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(qVar, "operation");
        for (int Te = Te(dArr); Te >= 0; Te--) {
            r6 = qVar.I(Integer.valueOf(Te), Double.valueOf(dArr[Te]), r6);
        }
        return r6;
    }

    @n6.e
    public static final Boolean jf(@n6.d boolean[] zArr, int i7) {
        u4.l0.p(zArr, "<this>");
        if (i7 < 0 || i7 > Ze(zArr)) {
            return null;
        }
        return Boolean.valueOf(zArr[i7]);
    }

    public static final <T> int jg(@n6.d T[] tArr, T t6) {
        u4.l0.p(tArr, "<this>");
        int i7 = 0;
        if (t6 == null) {
            int length = tArr.length;
            while (i7 < length) {
                if (tArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i7 < length2) {
            if (u4.l0.g(t6, tArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @n6.d
    public static final <A extends Appendable> A jh(@n6.d int[] iArr, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Integer, ? extends CharSequence> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (int i9 : iArr) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (lVar != null) {
                a7.append(lVar.O(Integer.valueOf(i9)));
            } else {
                a7.append(String.valueOf(i9));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    @v3.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @v3.b1(expression = "indexOfLast { it == element }", imports = {}))
    @v3.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int ji(double[] dArr, double d7) {
        u4.l0.p(dArr, "<this>");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (d7 == dArr[length]) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C jj(@n6.d short[] sArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Short, ? extends R> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            c7.add(pVar.J(Integer.valueOf(i8), Short.valueOf(sArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R jk(float[] fArr, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Float.valueOf(fArr[0]));
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Float.valueOf(fArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Character jl(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            if (u4.l0.t(c7, c8) < 0) {
                c7 = c8;
            }
        }
        return Character.valueOf(c7);
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <T, R extends Comparable<? super R>> T jm(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t6 = tArr[0];
        int Xe = Xe(tArr);
        if (Xe == 0) {
            return t6;
        }
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
        return t6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float jn(int[] iArr, t4.l<? super Integer, Float> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Integer.valueOf(iArr[0])).floatValue();
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Integer.valueOf(iArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final byte jo(@n6.d byte[] bArr, @n6.d Comparator<? super Byte> comparator) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            if (comparator.compare(Byte.valueOf(b7), Byte.valueOf(b8)) > 0) {
                b7 = b8;
            }
        }
        return b7;
    }

    @n6.d
    public static final v3.u0<List<Short>, List<Short>> jp(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                arrayList.add(Short.valueOf(s6));
            } else {
                arrayList2.add(Short.valueOf(s6));
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    public static final long jq(@n6.d long[] jArr, @n6.d t4.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (jArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            j7 = qVar.I(Integer.valueOf(b7), Long.valueOf(j7), Long.valueOf(jArr[b7])).longValue();
        }
        return j7;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Double jr(@n6.d double[] dArr, @n6.d t4.p<? super Double, ? super Double, Double> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Te = Te(dArr);
        if (Te < 0) {
            return null;
        }
        double d7 = dArr[Te];
        for (int i7 = Te - 1; i7 >= 0; i7--) {
            d7 = pVar.J(Double.valueOf(dArr[i7]), Double.valueOf(d7)).doubleValue();
        }
        return Double.valueOf(d7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> js(byte[] bArr, R r6, t4.q<? super Integer, ? super R, ? super Byte, ? extends R> qVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (bArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(bArr.length + 1);
        arrayList.add(r6);
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Byte.valueOf(bArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void jt(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        kt(fArr, b5.f.f7260k);
    }

    @n6.d
    public static final List<Double> ju(@n6.d double[] dArr, @n6.d d5.l lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? x3.w.E() : x3.o.p(x3.o.I1(dArr, lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    @n6.d
    public static final List<Double> jv(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        Double[] q52 = x3.o.q5(dArr);
        x3.o.v4(q52);
        return x3.o.t(q52);
    }

    @n6.d
    public static final List<Float> jw(@n6.d float[] fArr, @n6.d Comparator<? super Float> comparator) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        Float[] r52 = x3.o.r5(fArr);
        x3.o.I4(r52, comparator);
        return x3.o.t(r52);
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final int jx(char[] cArr, t4.l<? super Character, Integer> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (char c7 : cArr) {
            i7 += lVar.O(Character.valueOf(c7)).intValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Integer> jy(@n6.d int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            int length = iArr.length;
            if (i7 >= length) {
                return iz(iArr);
            }
            if (i7 == 1) {
                return x3.v.k(Integer.valueOf(iArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = length - i7; i8 < length; i8++) {
                arrayList.add(Integer.valueOf(iArr[i8]));
            }
            return arrayList;
        }
    }

    @n6.d
    public static final List<Long> jz(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? tz(jArr) : x3.v.k(Long.valueOf(jArr[0])) : x3.w.E();
    }

    @n6.d
    public static final f5.m<Long> k6(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr.length == 0 ? f5.s.g() : new n(jArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M k7(@n6.d float[] fArr, @n6.d M m7, @n6.d t4.l<? super Float, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (float f7 : fArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Float.valueOf(f7));
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @k4.f
    public static final short k8(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr[1];
    }

    @k4.f
    public static final int k9(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr.length;
    }

    @n6.d
    public static final List<v3.u0<Byte, Byte>> kA(@n6.d byte[] bArr, @n6.d byte[] bArr2) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(bArr2, "other");
        int min = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(v3.q1.a(Byte.valueOf(bArr[i7]), Byte.valueOf(bArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Float> ka(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (float f7 : fArr) {
            if (z6) {
                arrayList.add(Float.valueOf(f7));
            } else if (!lVar.O(Float.valueOf(f7)).booleanValue()) {
                arrayList.add(Float.valueOf(f7));
                z6 = true;
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C kb(Object[] objArr, C c7) {
        u4.l0.p(objArr, "<this>");
        u4.l0.p(c7, "destination");
        for (Object obj : objArr) {
            u4.l0.y(3, "R");
            if (obj instanceof Object) {
                c7.add(obj);
            }
        }
        return c7;
    }

    public static final double kc(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[0];
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R, C extends Collection<? super R>> C kd(byte[] bArr, C c7, t4.p<? super Integer, ? super Byte, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), Byte.valueOf(bArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    public static final <R> R ke(@n6.d float[] fArr, R r6, @n6.d t4.q<? super Integer, ? super Float, ? super R, ? extends R> qVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(qVar, "operation");
        for (int Ue = Ue(fArr); Ue >= 0; Ue--) {
            r6 = qVar.I(Integer.valueOf(Ue), Float.valueOf(fArr[Ue]), r6);
        }
        return r6;
    }

    @n6.e
    public static final Byte kf(@n6.d byte[] bArr, int i7) {
        u4.l0.p(bArr, "<this>");
        if (i7 < 0 || i7 > Re(bArr)) {
            return null;
        }
        return Byte.valueOf(bArr[i7]);
    }

    public static final int kg(@n6.d short[] sArr, short s6) {
        u4.l0.p(sArr, "<this>");
        int length = sArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (s6 == sArr[i7]) {
                return i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <A extends Appendable> A kh(@n6.d long[] jArr, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Long, ? extends CharSequence> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (long j7 : jArr) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (lVar != null) {
                a7.append(lVar.O(Long.valueOf(j7)));
            } else {
                a7.append(String.valueOf(j7));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    @v3.k(message = "The function has unclear behavior when searching for NaN or zero values and will be removed soon. Use 'indexOfLast { it == element }' instead to continue using this behavior, or '.asList().lastIndexOf(element: T)' to get the same search behavior as in a list.", replaceWith = @v3.b1(expression = "indexOfLast { it == element }", imports = {}))
    @v3.l(errorSince = "1.6", hiddenSince = "1.7", warningSince = "1.4")
    public static final /* synthetic */ int ki(float[] fArr, float f7) {
        u4.l0.p(fArr, "<this>");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (f7 == fArr[length]) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C kj(@n6.d boolean[] zArr, @n6.d C c7, @n6.d t4.p<? super Integer, ? super Boolean, ? extends R> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            c7.add(pVar.J(Integer.valueOf(i8), Boolean.valueOf(zArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R kk(int[] iArr, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Integer.valueOf(iArr[0]));
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Integer.valueOf(iArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <T extends Comparable<? super T>> T kl(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t6 = tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t7 = tArr[it.b()];
            if (t6.compareTo(t7) < 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> short km(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s6 = sArr[0];
        int Ye = Ye(sArr);
        if (Ye == 0) {
            return s6;
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
        return s6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float kn(long[] jArr, t4.l<? super Long, Float> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Long.valueOf(jArr[0])).floatValue();
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Long.valueOf(jArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final char ko(@n6.d char[] cArr, @n6.d Comparator<? super Character> comparator) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            if (comparator.compare(Character.valueOf(c7), Character.valueOf(c8)) > 0) {
                c7 = c8;
            }
        }
        return c7;
    }

    @n6.d
    public static final v3.u0<List<Boolean>, List<Boolean>> kp(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (boolean z6 : zArr) {
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z6));
            } else {
                arrayList2.add(Boolean.valueOf(z6));
            }
        }
        return new v3.u0<>(arrayList, arrayList2);
    }

    public static final <S, T extends S> S kq(@n6.d T[] tArr, @n6.d t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (tArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        Object obj = (S) tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            obj = (S) qVar.I(Integer.valueOf(b7), obj, (Object) tArr[b7]);
        }
        return (S) obj;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Float kr(@n6.d float[] fArr, @n6.d t4.p<? super Float, ? super Float, Float> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Ue = Ue(fArr);
        if (Ue < 0) {
            return null;
        }
        float f7 = fArr[Ue];
        for (int i7 = Ue - 1; i7 >= 0; i7--) {
            f7 = pVar.J(Float.valueOf(fArr[i7]), Float.valueOf(f7)).floatValue();
        }
        return Float.valueOf(f7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> ks(char[] cArr, R r6, t4.q<? super Integer, ? super R, ? super Character, ? extends R> qVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (cArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(cArr.length + 1);
        arrayList.add(r6);
        int length = cArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Character.valueOf(cArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void kt(@n6.d float[] fArr, @n6.d b5.f fVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(fVar, "random");
        for (int Ue = Ue(fArr); Ue > 0; Ue--) {
            int m7 = fVar.m(Ue + 1);
            float f7 = fArr[Ue];
            fArr[Ue] = fArr[m7];
            fArr[m7] = f7;
        }
    }

    @n6.d
    public static final List<Double> ku(@n6.d double[] dArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(dArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Float> kv(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        Float[] r52 = x3.o.r5(fArr);
        x3.o.v4(r52);
        return x3.o.t(r52);
    }

    @n6.d
    public static final List<Integer> kw(@n6.d int[] iArr, @n6.d Comparator<? super Integer> comparator) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        Integer[] s52 = x3.o.s5(iArr);
        x3.o.I4(s52, comparator);
        return x3.o.t(s52);
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final int kx(double[] dArr, t4.l<? super Double, Integer> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (double d7 : dArr) {
            i7 += lVar.O(Double.valueOf(d7)).intValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Long> ky(@n6.d long[] jArr, int i7) {
        u4.l0.p(jArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            int length = jArr.length;
            if (i7 >= length) {
                return jz(jArr);
            }
            if (i7 == 1) {
                return x3.v.k(Long.valueOf(jArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = length - i7; i8 < length; i8++) {
                arrayList.add(Long.valueOf(jArr[i8]));
            }
            return arrayList;
        }
    }

    @n6.d
    public static final <T> List<T> kz(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? uz(tArr) : x3.v.k(tArr[0]) : x3.w.E();
    }

    @n6.d
    public static final <T> f5.m<T> l6(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr.length == 0 ? f5.s.g() : new j(tArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M l7(@n6.d int[] iArr, @n6.d M m7, @n6.d t4.l<? super Integer, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (int i7 : iArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Integer.valueOf(i7));
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @k4.f
    public static final boolean l8(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr[1];
    }

    public static final int l9(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final <V> List<V> lA(@n6.d byte[] bArr, @n6.d byte[] bArr2, @n6.d t4.p<? super Byte, ? super Byte, ? extends V> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(bArr2, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(bArr.length, bArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Byte.valueOf(bArr[i7]), Byte.valueOf(bArr2[i7])));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Integer> la(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (int i7 : iArr) {
            if (z6) {
                arrayList.add(Integer.valueOf(i7));
            } else if (!lVar.O(Integer.valueOf(i7)).booleanValue()) {
                arrayList.add(Integer.valueOf(i7));
                z6 = true;
            }
        }
        return arrayList;
    }

    @n6.d
    public static final List<Byte> lb(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b7 : bArr) {
            if (!lVar.O(Byte.valueOf(b7)).booleanValue()) {
                arrayList.add(Byte.valueOf(b7));
            }
        }
        return arrayList;
    }

    public static final double lc(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (double d7 : dArr) {
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                return d7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R, C extends Collection<? super R>> C ld(char[] cArr, C c7, t4.p<? super Integer, ? super Character, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = cArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), Character.valueOf(cArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    public static final <R> R le(@n6.d int[] iArr, R r6, @n6.d t4.q<? super Integer, ? super Integer, ? super R, ? extends R> qVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(qVar, "operation");
        for (int Ve = Ve(iArr); Ve >= 0; Ve--) {
            r6 = qVar.I(Integer.valueOf(Ve), Integer.valueOf(iArr[Ve]), r6);
        }
        return r6;
    }

    @n6.e
    public static final Character lf(@n6.d char[] cArr, int i7) {
        u4.l0.p(cArr, "<this>");
        if (i7 < 0 || i7 > Se(cArr)) {
            return null;
        }
        return Character.valueOf(cArr[i7]);
    }

    public static final int lg(@n6.d boolean[] zArr, boolean z6) {
        u4.l0.p(zArr, "<this>");
        int length = zArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (z6 == zArr[i7]) {
                return i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <T, A extends Appendable> A lh(@n6.d T[] tArr, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super T, ? extends CharSequence> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (T t6 : tArr) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            i5.t.b(a7, t6, lVar);
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    public static final int li(@n6.d int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (i7 == iArr[length]) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    @n6.d
    public static final <T, R> List<R> lj(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t6 : tArr) {
            R O = lVar.O(t6);
            if (O != null) {
                arrayList.add(O);
            }
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R lk(long[] jArr, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Long.valueOf(jArr[0]));
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Long.valueOf(jArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Double ll(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            d7 = Math.max(d7, dArr[it.b()]);
        }
        return Double.valueOf(d7);
    }

    @s4.h(name = "minByOrThrow")
    @v3.g1(version = "1.7")
    public static final <R extends Comparable<? super R>> boolean lm(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z6 = zArr[0];
        int Ze = Ze(zArr);
        if (Ze == 0) {
            return z6;
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
        return z6;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> Float ln(T[] tArr, t4.l<? super T, Float> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(tArr[0]).floatValue();
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(tArr[it.b()]).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final double lo(@n6.d double[] dArr, @n6.d Comparator<? super Double> comparator) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            double d8 = dArr[it.b()];
            if (comparator.compare(Double.valueOf(d7), Double.valueOf(d8)) > 0) {
                d7 = d8;
            }
        }
        return d7;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final byte lp(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return mp(bArr, b5.f.f7260k);
    }

    public static final short lq(@n6.d short[] sArr, @n6.d t4.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (sArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            s6 = qVar.I(Integer.valueOf(b7), Short.valueOf(s6), Short.valueOf(sArr[b7])).shortValue();
        }
        return s6;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Integer lr(@n6.d int[] iArr, @n6.d t4.p<? super Integer, ? super Integer, Integer> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Ve = Ve(iArr);
        if (Ve < 0) {
            return null;
        }
        int i7 = iArr[Ve];
        for (int i8 = Ve - 1; i8 >= 0; i8--) {
            i7 = pVar.J(Integer.valueOf(iArr[i8]), Integer.valueOf(i7)).intValue();
        }
        return Integer.valueOf(i7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> ls(double[] dArr, R r6, t4.q<? super Integer, ? super R, ? super Double, ? extends R> qVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (dArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(dArr.length + 1);
        arrayList.add(r6);
        int length = dArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Double.valueOf(dArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void lt(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        mt(iArr, b5.f.f7260k);
    }

    @n6.d
    public static final List<Float> lu(@n6.d float[] fArr, @n6.d d5.l lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? x3.w.E() : x3.o.q(x3.o.J1(fArr, lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    @n6.d
    public static final List<Integer> lv(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        Integer[] s52 = x3.o.s5(iArr);
        x3.o.v4(s52);
        return x3.o.t(s52);
    }

    @n6.d
    public static final List<Long> lw(@n6.d long[] jArr, @n6.d Comparator<? super Long> comparator) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        Long[] t52 = x3.o.t5(jArr);
        x3.o.I4(t52, comparator);
        return x3.o.t(t52);
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final int lx(float[] fArr, t4.l<? super Float, Integer> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (float f7 : fArr) {
            i7 += lVar.O(Float.valueOf(f7)).intValue();
        }
        return i7;
    }

    @n6.d
    public static final <T> List<T> ly(@n6.d T[] tArr, int i7) {
        u4.l0.p(tArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            int length = tArr.length;
            if (i7 >= length) {
                return kz(tArr);
            }
            if (i7 == 1) {
                return x3.v.k(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = length - i7; i8 < length; i8++) {
                arrayList.add(tArr[i8]);
            }
            return arrayList;
        }
    }

    @n6.d
    public static final List<Short> lz(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? vz(sArr) : x3.v.k(Short.valueOf(sArr[0])) : x3.w.E();
    }

    @n6.d
    public static final f5.m<Short> m6(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr.length == 0 ? f5.s.g() : new l(sArr);
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M m7(@n6.d long[] jArr, @n6.d M m7, @n6.d t4.l<? super Long, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (long j7 : jArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Long.valueOf(j7));
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @k4.f
    public static final byte m8(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr[2];
    }

    @k4.f
    public static final int m9(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr.length;
    }

    @n6.d
    public static final <R> List<v3.u0<Byte, R>> mA(@n6.d byte[] bArr, @n6.d R[] rArr) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(rArr, "other");
        int min = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            byte b7 = bArr[i7];
            arrayList.add(v3.q1.a(Byte.valueOf(b7), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Long> ma(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (long j7 : jArr) {
            if (z6) {
                arrayList.add(Long.valueOf(j7));
            } else if (!lVar.O(Long.valueOf(j7)).booleanValue()) {
                arrayList.add(Long.valueOf(j7));
                z6 = true;
            }
        }
        return arrayList;
    }

    @n6.d
    public static final List<Character> mb(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c7 : cArr) {
            if (!lVar.O(Character.valueOf(c7)).booleanValue()) {
                arrayList.add(Character.valueOf(c7));
            }
        }
        return arrayList;
    }

    public static final float mc(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R, C extends Collection<? super R>> C md(double[] dArr, C c7, t4.p<? super Integer, ? super Double, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = dArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), Double.valueOf(dArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    public static final <R> R me(@n6.d long[] jArr, R r6, @n6.d t4.q<? super Integer, ? super Long, ? super R, ? extends R> qVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(qVar, "operation");
        for (int We = We(jArr); We >= 0; We--) {
            r6 = qVar.I(Integer.valueOf(We), Long.valueOf(jArr[We]), r6);
        }
        return r6;
    }

    @n6.e
    public static final Double mf(@n6.d double[] dArr, int i7) {
        u4.l0.p(dArr, "<this>");
        if (i7 < 0 || i7 > Te(dArr)) {
            return null;
        }
        return Double.valueOf(dArr[i7]);
    }

    public static final int mg(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = bArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(Byte.valueOf(bArr[i7])).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <A extends Appendable> A mh(@n6.d short[] sArr, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Short, ? extends CharSequence> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (short s6 : sArr) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (lVar != null) {
                a7.append(lVar.O(Short.valueOf(s6)));
            } else {
                a7.append(String.valueOf((int) s6));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    public static final int mi(@n6.d long[] jArr, long j7) {
        u4.l0.p(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (j7 == jArr[length]) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C mj(@n6.d T[] tArr, @n6.d C c7, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (T t6 : tArr) {
            R O = lVar.O(t6);
            if (O != null) {
                c7.add(O);
            }
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R mk(T[] tArr, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(tArr[0]);
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(tArr[it.b()]);
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Double ml(@n6.d Double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        double doubleValue = dArr[0].doubleValue();
        s0 it = new d5.l(1, Xe(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it.b()].doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double mm(byte[] bArr, t4.l<? super Byte, Double> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Byte.valueOf(bArr[0])).doubleValue();
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Byte.valueOf(bArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float mn(short[] sArr, t4.l<? super Short, Float> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Short.valueOf(sArr[0])).floatValue();
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Short.valueOf(sArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final float mo(@n6.d float[] fArr, @n6.d Comparator<? super Float> comparator) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            float f8 = fArr[it.b()];
            if (comparator.compare(Float.valueOf(f7), Float.valueOf(f8)) > 0) {
                f7 = f8;
            }
        }
        return f7;
    }

    @v3.g1(version = "1.3")
    public static final byte mp(@n6.d byte[] bArr, @n6.d b5.f fVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(fVar, "random");
        if (bArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return bArr[fVar.m(bArr.length)];
    }

    public static final boolean mq(@n6.d boolean[] zArr, @n6.d t4.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (zArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        boolean z6 = zArr[0];
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            z6 = qVar.I(Integer.valueOf(b7), Boolean.valueOf(z6), Boolean.valueOf(zArr[b7])).booleanValue();
        }
        return z6;
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Long mr(@n6.d long[] jArr, @n6.d t4.p<? super Long, ? super Long, Long> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "operation");
        int We = We(jArr);
        if (We < 0) {
            return null;
        }
        long j7 = jArr[We];
        for (int i7 = We - 1; i7 >= 0; i7--) {
            j7 = pVar.J(Long.valueOf(jArr[i7]), Long.valueOf(j7)).longValue();
        }
        return Long.valueOf(j7);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> ms(float[] fArr, R r6, t4.q<? super Integer, ? super R, ? super Float, ? extends R> qVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (fArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(fArr.length + 1);
        arrayList.add(r6);
        int length = fArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Float.valueOf(fArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void mt(@n6.d int[] iArr, @n6.d b5.f fVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(fVar, "random");
        for (int Ve = Ve(iArr); Ve > 0; Ve--) {
            int m7 = fVar.m(Ve + 1);
            int i7 = iArr[Ve];
            iArr[Ve] = iArr[m7];
            iArr[m7] = i7;
        }
    }

    @n6.d
    public static final List<Float> mu(@n6.d float[] fArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(fArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Long> mv(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        Long[] t52 = x3.o.t5(jArr);
        x3.o.v4(t52);
        return x3.o.t(t52);
    }

    @n6.d
    public static final <T> List<T> mw(@n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        return x3.o.t(Fv(tArr, comparator));
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final int mx(int[] iArr, t4.l<? super Integer, Integer> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (int i8 : iArr) {
            i7 += lVar.O(Integer.valueOf(i8)).intValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Short> my(@n6.d short[] sArr, int i7) {
        u4.l0.p(sArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            int length = sArr.length;
            if (i7 >= length) {
                return lz(sArr);
            }
            if (i7 == 1) {
                return x3.v.k(Short.valueOf(sArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = length - i7; i8 < length; i8++) {
                arrayList.add(Short.valueOf(sArr[i8]));
            }
            return arrayList;
        }
    }

    @n6.d
    public static final List<Boolean> mz(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? wz(zArr) : x3.v.k(Boolean.valueOf(zArr[0])) : x3.w.E();
    }

    @n6.d
    public static final f5.m<Boolean> n6(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr.length == 0 ? f5.s.g() : new q(zArr);
    }

    @n6.d
    public static final <T, K, V, M extends Map<? super K, ? super V>> M n7(@n6.d T[] tArr, @n6.d M m7, @n6.d t4.l<? super T, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (T t6 : tArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(t6);
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @k4.f
    public static final char n8(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr[2];
    }

    public static final int n9(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int i7 = 0;
        for (boolean z6 : zArr) {
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                i7++;
            }
        }
        return i7;
    }

    @n6.d
    public static final <R, V> List<V> nA(@n6.d byte[] bArr, @n6.d R[] rArr, @n6.d t4.p<? super Byte, ? super R, ? extends V> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(bArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Byte.valueOf(bArr[i7]), rArr[i7]));
        }
        return arrayList;
    }

    @n6.d
    public static final <T> List<T> na(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (T t6 : tArr) {
            if (z6) {
                arrayList.add(t6);
            } else if (!lVar.O(t6).booleanValue()) {
                arrayList.add(t6);
                z6 = true;
            }
        }
        return arrayList;
    }

    @n6.d
    public static final List<Double> nb(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d7 : dArr) {
            if (!lVar.O(Double.valueOf(d7)).booleanValue()) {
                arrayList.add(Double.valueOf(d7));
            }
        }
        return arrayList;
    }

    public static final float nc(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (float f7 : fArr) {
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                return f7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R, C extends Collection<? super R>> C nd(float[] fArr, C c7, t4.p<? super Integer, ? super Float, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = fArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), Float.valueOf(fArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> R ne(@n6.d T[] tArr, R r6, @n6.d t4.q<? super Integer, ? super T, ? super R, ? extends R> qVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(qVar, "operation");
        for (int Xe = Xe(tArr); Xe >= 0; Xe--) {
            r6 = qVar.I(Integer.valueOf(Xe), tArr[Xe], r6);
        }
        return r6;
    }

    @n6.e
    public static final Float nf(@n6.d float[] fArr, int i7) {
        u4.l0.p(fArr, "<this>");
        if (i7 < 0 || i7 > Ue(fArr)) {
            return null;
        }
        return Float.valueOf(fArr[i7]);
    }

    public static final int ng(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = cArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(Character.valueOf(cArr[i7])).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <A extends Appendable> A nh(@n6.d boolean[] zArr, @n6.d A a7, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Boolean, ? extends CharSequence> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(a7, "buffer");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        a7.append(charSequence2);
        int i8 = 0;
        for (boolean z6 : zArr) {
            i8++;
            if (i8 > 1) {
                a7.append(charSequence);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            if (lVar != null) {
                a7.append(lVar.O(Boolean.valueOf(z6)));
            } else {
                a7.append(String.valueOf(z6));
            }
        }
        if (i7 >= 0 && i8 > i7) {
            a7.append(charSequence4);
        }
        a7.append(charSequence3);
        return a7;
    }

    public static final <T> int ni(@n6.d T[] tArr, T t6) {
        u4.l0.p(tArr, "<this>");
        if (t6 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i7 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i8 = length2 - 1;
                    if (u4.l0.g(t6, tArr[length2])) {
                        return length2;
                    }
                    if (i8 < 0) {
                        break;
                    }
                    length2 = i8;
                }
            }
        }
        return -1;
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C nj(@n6.d byte[] bArr, @n6.d C c7, @n6.d t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (byte b7 : bArr) {
            c7.add(lVar.O(Byte.valueOf(b7)));
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R nk(short[] sArr, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Short.valueOf(sArr[0]));
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Short.valueOf(sArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float nl(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            f7 = Math.max(f7, fArr[it.b()]);
        }
        return Float.valueOf(f7);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double nm(char[] cArr, t4.l<? super Character, Double> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Character.valueOf(cArr[0])).doubleValue();
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Character.valueOf(cArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Float nn(boolean[] zArr, t4.l<? super Boolean, Float> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        float floatValue = lVar.O(Boolean.valueOf(zArr[0])).floatValue();
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Boolean.valueOf(zArr[it.b()])).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final int no(@n6.d int[] iArr, @n6.d Comparator<? super Integer> comparator) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            if (comparator.compare(Integer.valueOf(i7), Integer.valueOf(i8)) > 0) {
                i7 = i8;
            }
        }
        return i7;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final char np(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return op(cArr, b5.f.f7260k);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Boolean nq(@n6.d boolean[] zArr, @n6.d t4.q<? super Integer, ? super Boolean, ? super Boolean, Boolean> qVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z6 = zArr[0];
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            z6 = qVar.I(Integer.valueOf(b7), Boolean.valueOf(z6), Boolean.valueOf(zArr[b7])).booleanValue();
        }
        return Boolean.valueOf(z6);
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final <S, T extends S> S nr(@n6.d T[] tArr, @n6.d t4.p<? super T, ? super S, ? extends S> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Xe = Xe(tArr);
        if (Xe < 0) {
            return null;
        }
        Object obj = (S) tArr[Xe];
        for (int i7 = Xe - 1; i7 >= 0; i7--) {
            obj = (S) pVar.J((Object) tArr[i7], obj);
        }
        return (S) obj;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> ns(int[] iArr, R r6, t4.q<? super Integer, ? super R, ? super Integer, ? extends R> qVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (iArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(iArr.length + 1);
        arrayList.add(r6);
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Integer.valueOf(iArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void nt(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        ot(jArr, b5.f.f7260k);
    }

    @n6.d
    public static final List<Integer> nu(@n6.d int[] iArr, @n6.d d5.l lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? x3.w.E() : x3.o.r(x3.o.K1(iArr, lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    @n6.d
    public static final <T extends Comparable<? super T>> List<T> nv(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return x3.o.t(vv(tArr));
    }

    @n6.d
    public static final List<Short> nw(@n6.d short[] sArr, @n6.d Comparator<? super Short> comparator) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        Short[] u52 = x3.o.u5(sArr);
        x3.o.I4(u52, comparator);
        return x3.o.t(u52);
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final int nx(long[] jArr, t4.l<? super Long, Integer> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (long j7 : jArr) {
            i7 += lVar.O(Long.valueOf(j7)).intValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Boolean> ny(@n6.d boolean[] zArr, int i7) {
        u4.l0.p(zArr, "<this>");
        if (!(i7 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        } else if (i7 == 0) {
            return x3.w.E();
        } else {
            int length = zArr.length;
            if (i7 >= length) {
                return mz(zArr);
            }
            if (i7 == 1) {
                return x3.v.k(Boolean.valueOf(zArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i7);
            for (int i8 = length - i7; i8 < length; i8++) {
                arrayList.add(Boolean.valueOf(zArr[i8]));
            }
            return arrayList;
        }
    }

    @n6.d
    public static final long[] nz(@n6.d Long[] lArr) {
        u4.l0.p(lArr, "<this>");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            jArr[i7] = lArr[i7].longValue();
        }
        return jArr;
    }

    @n6.d
    public static final <K, V> Map<K, V> o6(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(bArr.length), 16));
        for (byte b7 : bArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Byte.valueOf(b7));
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M o7(@n6.d short[] sArr, @n6.d M m7, @n6.d t4.l<? super Short, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (short s6 : sArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Short.valueOf(s6));
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @k4.f
    public static final double o8(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr[2];
    }

    @n6.d
    public static final List<Byte> o9(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return e0.Q5(xz(bArr));
    }

    @n6.d
    public static final <R> List<v3.u0<Character, R>> oA(@n6.d char[] cArr, @n6.d Iterable<? extends R> iterable) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(iterable, "other");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(Character.valueOf(cArr[i7]), r6));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Short> oa(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (short s6 : sArr) {
            if (z6) {
                arrayList.add(Short.valueOf(s6));
            } else if (!lVar.O(Short.valueOf(s6)).booleanValue()) {
                arrayList.add(Short.valueOf(s6));
                z6 = true;
            }
        }
        return arrayList;
    }

    @n6.d
    public static final List<Float> ob(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (float f7 : fArr) {
            if (!lVar.O(Float.valueOf(f7)).booleanValue()) {
                arrayList.add(Float.valueOf(f7));
            }
        }
        return arrayList;
    }

    public static final int oc(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R, C extends Collection<? super R>> C od(int[] iArr, C c7, t4.p<? super Integer, ? super Integer, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), Integer.valueOf(iArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    public static final <R> R oe(@n6.d short[] sArr, R r6, @n6.d t4.q<? super Integer, ? super Short, ? super R, ? extends R> qVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(qVar, "operation");
        for (int Ye = Ye(sArr); Ye >= 0; Ye--) {
            r6 = qVar.I(Integer.valueOf(Ye), Short.valueOf(sArr[Ye]), r6);
        }
        return r6;
    }

    @n6.e
    public static final Integer of(@n6.d int[] iArr, int i7) {
        u4.l0.p(iArr, "<this>");
        if (i7 < 0 || i7 > Ve(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i7]);
    }

    public static final int og(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = dArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(Double.valueOf(dArr[i7])).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    public static final int oi(@n6.d short[] sArr, short s6) {
        u4.l0.p(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (s6 == sArr[length]) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C oj(@n6.d char[] cArr, @n6.d C c7, @n6.d t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (char c8 : cArr) {
            c7.add(lVar.O(Character.valueOf(c8)));
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R ok(boolean[] zArr, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        R O = lVar.O(Boolean.valueOf(zArr[0]));
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Boolean.valueOf(zArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float ol(@n6.d Float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float floatValue = fArr[0].floatValue();
        s0 it = new d5.l(1, Xe(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it.b()].floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double om(double[] dArr, t4.l<? super Double, Double> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Double.valueOf(dArr[0])).doubleValue();
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Double.valueOf(dArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R on(byte[] bArr, Comparator<? super R> comparator, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Byte.valueOf(bArr[0]));
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Byte.valueOf(bArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final long oo(@n6.d long[] jArr, @n6.d Comparator<? super Long> comparator) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            if (comparator.compare(Long.valueOf(j7), Long.valueOf(j8)) > 0) {
                j7 = j8;
            }
        }
        return j7;
    }

    @v3.g1(version = "1.3")
    public static final char op(@n6.d char[] cArr, @n6.d b5.f fVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(fVar, "random");
        if (cArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return cArr[fVar.m(cArr.length)];
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Byte oq(@n6.d byte[] bArr, @n6.d t4.q<? super Integer, ? super Byte, ? super Byte, Byte> qVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            int b8 = it.b();
            b7 = qVar.I(Integer.valueOf(b8), Byte.valueOf(b7), Byte.valueOf(bArr[b8])).byteValue();
        }
        return Byte.valueOf(b7);
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Short or(@n6.d short[] sArr, @n6.d t4.p<? super Short, ? super Short, Short> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "operation");
        int Ye = Ye(sArr);
        if (Ye < 0) {
            return null;
        }
        short s6 = sArr[Ye];
        for (int i7 = Ye - 1; i7 >= 0; i7--) {
            s6 = pVar.J(Short.valueOf(sArr[i7]), Short.valueOf(s6)).shortValue();
        }
        return Short.valueOf(s6);
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> os(long[] jArr, R r6, t4.q<? super Integer, ? super R, ? super Long, ? extends R> qVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (jArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(jArr.length + 1);
        arrayList.add(r6);
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Long.valueOf(jArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void ot(@n6.d long[] jArr, @n6.d b5.f fVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(fVar, "random");
        for (int We = We(jArr); We > 0; We--) {
            int m7 = fVar.m(We + 1);
            long j7 = jArr[We];
            jArr[We] = jArr[m7];
            jArr[m7] = j7;
        }
    }

    @n6.d
    public static final List<Integer> ou(@n6.d int[] iArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(iArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @n6.d
    public static final List<Short> ov(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        Short[] u52 = x3.o.u5(sArr);
        x3.o.v4(u52);
        return x3.o.t(u52);
    }

    @n6.d
    public static final List<Boolean> ow(@n6.d boolean[] zArr, @n6.d Comparator<? super Boolean> comparator) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        Boolean[] n52 = x3.o.n5(zArr);
        x3.o.I4(n52, comparator);
        return x3.o.t(n52);
    }

    @s4.h(name = "sumOfInt")
    public static final int ox(@n6.d Integer[] numArr) {
        u4.l0.p(numArr, "<this>");
        int i7 = 0;
        for (Integer num : numArr) {
            i7 += num.intValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Byte> oy(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Re = Re(bArr); -1 < Re; Re--) {
            if (!lVar.O(Byte.valueOf(bArr[Re])).booleanValue()) {
                return G9(bArr, Re + 1);
            }
        }
        return ez(bArr);
    }

    @n6.d
    public static final List<Byte> oz(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b7 : bArr) {
            arrayList.add(Byte.valueOf(b7));
        }
        return arrayList;
    }

    @n6.d
    public static final <K, V> Map<K, V> p6(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(cArr.length), 16));
        for (char c7 : cArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Character.valueOf(c7));
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @n6.d
    public static final <K, V, M extends Map<? super K, ? super V>> M p7(@n6.d boolean[] zArr, @n6.d M m7, @n6.d t4.l<? super Boolean, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "transform");
        for (boolean z6 : zArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Boolean.valueOf(z6));
            m7.put(O.e(), O.f());
        }
        return m7;
    }

    @k4.f
    public static final float p8(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr[2];
    }

    @n6.d
    public static final List<Character> p9(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return e0.Q5(yz(cArr));
    }

    @n6.d
    public static final <R, V> List<V> pA(@n6.d char[] cArr, @n6.d Iterable<? extends R> iterable, @n6.d t4.p<? super Character, ? super R, ? extends V> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(iterable, "other");
        u4.l0.p(pVar, "transform");
        int length = cArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(Character.valueOf(cArr[i7]), obj));
            i7++;
        }
        return arrayList;
    }

    @n6.d
    public static final List<Boolean> pa(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (boolean z7 : zArr) {
            if (z6) {
                arrayList.add(Boolean.valueOf(z7));
            } else if (!lVar.O(Boolean.valueOf(z7)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z7));
                z6 = true;
            }
        }
        return arrayList;
    }

    @n6.d
    public static final List<Integer> pb(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (!lVar.O(Integer.valueOf(i7)).booleanValue()) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        return arrayList;
    }

    public static final int pc(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int i7 : iArr) {
            if (lVar.O(Integer.valueOf(i7)).booleanValue()) {
                return i7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R, C extends Collection<? super R>> C pd(long[] jArr, C c7, t4.p<? super Integer, ? super Long, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = jArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), Long.valueOf(jArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    public static final <R> R pe(@n6.d boolean[] zArr, R r6, @n6.d t4.q<? super Integer, ? super Boolean, ? super R, ? extends R> qVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(qVar, "operation");
        for (int Ze = Ze(zArr); Ze >= 0; Ze--) {
            r6 = qVar.I(Integer.valueOf(Ze), Boolean.valueOf(zArr[Ze]), r6);
        }
        return r6;
    }

    @n6.e
    public static final Long pf(@n6.d long[] jArr, int i7) {
        u4.l0.p(jArr, "<this>");
        if (i7 < 0 || i7 > We(jArr)) {
            return null;
        }
        return Long.valueOf(jArr[i7]);
    }

    public static final int pg(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = fArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(Float.valueOf(fArr[i7])).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    public static final int pi(@n6.d boolean[] zArr, boolean z6) {
        u4.l0.p(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (z6 == zArr[length]) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C pj(@n6.d double[] dArr, @n6.d C c7, @n6.d t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (double d7 : dArr) {
            c7.add(lVar.O(Double.valueOf(d7)));
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R pk(byte[] bArr, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        R O = lVar.O(Byte.valueOf(bArr[0]));
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Byte.valueOf(bArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Integer pl(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            if (i7 < i8) {
                i7 = i8;
            }
        }
        return Integer.valueOf(i7);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double pm(float[] fArr, t4.l<? super Float, Double> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Float.valueOf(fArr[0])).doubleValue();
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Float.valueOf(fArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R pn(char[] cArr, Comparator<? super R> comparator, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Character.valueOf(cArr[0]));
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Character.valueOf(cArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final <T> T po(@n6.d T[] tArr, @n6.d Comparator<? super T> comparator) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        T t6 = tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            T t7 = tArr[it.b()];
            if (comparator.compare(t6, t7) > 0) {
                t6 = t7;
            }
        }
        return t6;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final double pp(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return qp(dArr, b5.f.f7260k);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Character pq(@n6.d char[] cArr, @n6.d t4.q<? super Integer, ? super Character, ? super Character, Character> qVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            c7 = qVar.I(Integer.valueOf(b7), Character.valueOf(c7), Character.valueOf(cArr[b7])).charValue();
        }
        return Character.valueOf(c7);
    }

    @n6.d
    public static final <T> T[] pr(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        for (T t6 : tArr) {
            if (t6 == null) {
                throw new IllegalArgumentException("null element found in " + tArr + '.');
            }
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @n6.d
    public static final <T, R> List<R> ps(@n6.d T[] tArr, R r6, @n6.d t4.q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (tArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(tArr.length + 1);
        arrayList.add(r6);
        int length = tArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, tArr[i7]);
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final <T> void pt(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        qt(tArr, b5.f.f7260k);
    }

    @n6.d
    public static final List<Long> pu(@n6.d long[] jArr, @n6.d d5.l lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? x3.w.E() : x3.o.s(x3.o.L1(jArr, lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    @n6.d
    public static final byte[] pv(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.h4(copyOf);
        return copyOf;
    }

    @n6.d
    public static final Set<Byte> pw(@n6.d byte[] bArr, @n6.d Iterable<Byte> iterable) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Byte> xz = xz(bArr);
        x3.b0.F0(xz, iterable);
        return xz;
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> int px(T[] tArr, t4.l<? super T, Integer> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (T t6 : tArr) {
            i7 += lVar.O(t6).intValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Character> py(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Se = Se(cArr); -1 < Se; Se--) {
            if (!lVar.O(Character.valueOf(cArr[Se])).booleanValue()) {
                return H9(cArr, Se + 1);
            }
        }
        return fz(cArr);
    }

    @n6.d
    public static final List<Character> pz(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c7 : cArr) {
            arrayList.add(Character.valueOf(c7));
        }
        return arrayList;
    }

    @n6.d
    public static final <K, V> Map<K, V> q6(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(dArr.length), 16));
        for (double d7 : dArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Double.valueOf(d7));
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V> Map<Byte, V> q7(byte[] bArr, t4.l<? super Byte, ? extends V> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(bArr.length), 16));
        for (byte b7 : bArr) {
            linkedHashMap.put(Byte.valueOf(b7), lVar.O(Byte.valueOf(b7)));
        }
        return linkedHashMap;
    }

    @k4.f
    public static final int q8(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr[2];
    }

    @n6.d
    public static final List<Double> q9(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return e0.Q5(zz(dArr));
    }

    @n6.d
    public static final List<v3.u0<Character, Character>> qA(@n6.d char[] cArr, @n6.d char[] cArr2) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(cArr2, "other");
        int min = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(v3.q1.a(Character.valueOf(cArr[i7]), Character.valueOf(cArr2[i7])));
        }
        return arrayList;
    }

    @k4.f
    public static final byte qa(byte[] bArr, int i7, t4.l<? super Integer, Byte> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Re(bArr)) ? lVar.O(Integer.valueOf(i7)).byteValue() : bArr[i7];
    }

    @n6.d
    public static final List<Long> qb(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (long j7 : jArr) {
            if (!lVar.O(Long.valueOf(j7)).booleanValue()) {
                arrayList.add(Long.valueOf(j7));
            }
        }
        return arrayList;
    }

    public static final long qc(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[0];
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R, C extends Collection<? super R>> C qd(T[] tArr, C c7, t4.p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), tArr[i7]));
            i7++;
            i8++;
        }
        return c7;
    }

    public static final void qe(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, m2> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (byte b7 : bArr) {
            lVar.O(Byte.valueOf(b7));
        }
    }

    @n6.e
    public static final <T> T qf(@n6.d T[] tArr, int i7) {
        u4.l0.p(tArr, "<this>");
        if (i7 < 0 || i7 > Xe(tArr)) {
            return null;
        }
        return tArr[i7];
    }

    public static final int qg(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(Integer.valueOf(iArr[i7])).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @n6.e
    public static final Boolean qi(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C qj(@n6.d float[] fArr, @n6.d C c7, @n6.d t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (float f7 : fArr) {
            c7.add(lVar.O(Float.valueOf(f7)));
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R qk(char[] cArr, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        R O = lVar.O(Character.valueOf(cArr[0]));
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Character.valueOf(cArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Long ql(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            if (j7 < j8) {
                j7 = j8;
            }
        }
        return Long.valueOf(j7);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double qm(int[] iArr, t4.l<? super Integer, Double> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Integer.valueOf(iArr[0])).doubleValue();
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Integer.valueOf(iArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R qn(double[] dArr, Comparator<? super R> comparator, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Double.valueOf(dArr[0]));
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Double.valueOf(dArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final short qo(@n6.d short[] sArr, @n6.d Comparator<? super Short> comparator) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            if (comparator.compare(Short.valueOf(s6), Short.valueOf(s7)) > 0) {
                s6 = s7;
            }
        }
        return s6;
    }

    @v3.g1(version = "1.3")
    public static final double qp(@n6.d double[] dArr, @n6.d b5.f fVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(fVar, "random");
        if (dArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return dArr[fVar.m(dArr.length)];
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Double qq(@n6.d double[] dArr, @n6.d t4.q<? super Integer, ? super Double, ? super Double, Double> qVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            d7 = qVar.I(Integer.valueOf(b7), Double.valueOf(d7), Double.valueOf(dArr[b7])).doubleValue();
        }
        return Double.valueOf(d7);
    }

    public static final void qr(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        int length = (bArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Re = Re(bArr);
        s0 it = new d5.l(0, length).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            byte b8 = bArr[b7];
            bArr[b7] = bArr[Re];
            bArr[Re] = b8;
            Re--;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> qs(short[] sArr, R r6, t4.q<? super Integer, ? super R, ? super Short, ? extends R> qVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (sArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(sArr.length + 1);
        arrayList.add(r6);
        int length = sArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Short.valueOf(sArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final <T> void qt(@n6.d T[] tArr, @n6.d b5.f fVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(fVar, "random");
        for (int Xe = Xe(tArr); Xe > 0; Xe--) {
            int m7 = fVar.m(Xe + 1);
            T t6 = tArr[Xe];
            tArr[Xe] = tArr[m7];
            tArr[m7] = t6;
        }
    }

    @n6.d
    public static final List<Long> qu(@n6.d long[] jArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(jArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @n6.d
    public static final char[] qv(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.j4(copyOf);
        return copyOf;
    }

    @n6.d
    public static final Set<Character> qw(@n6.d char[] cArr, @n6.d Iterable<Character> iterable) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Character> yz = yz(cArr);
        x3.b0.F0(yz, iterable);
        return yz;
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final int qx(short[] sArr, t4.l<? super Short, Integer> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (short s6 : sArr) {
            i7 += lVar.O(Short.valueOf(s6)).intValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Double> qy(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Te = Te(dArr); -1 < Te; Te--) {
            if (!lVar.O(Double.valueOf(dArr[Te])).booleanValue()) {
                return I9(dArr, Te + 1);
            }
        }
        return gz(dArr);
    }

    @n6.d
    public static final List<Double> qz(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d7 : dArr) {
            arrayList.add(Double.valueOf(d7));
        }
        return arrayList;
    }

    @n6.d
    public static final <K, V> Map<K, V> r6(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(fArr.length), 16));
        for (float f7 : fArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Float.valueOf(f7));
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V> Map<Character, V> r7(char[] cArr, t4.l<? super Character, ? extends V> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(d5.u.B(cArr.length, 128)), 16));
        for (char c7 : cArr) {
            linkedHashMap.put(Character.valueOf(c7), lVar.O(Character.valueOf(c7)));
        }
        return linkedHashMap;
    }

    @k4.f
    public static final long r8(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return jArr[2];
    }

    @n6.d
    public static final List<Float> r9(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return e0.Q5(Az(fArr));
    }

    @n6.d
    public static final <V> List<V> rA(@n6.d char[] cArr, @n6.d char[] cArr2, @n6.d t4.p<? super Character, ? super Character, ? extends V> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(cArr2, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(cArr.length, cArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Character.valueOf(cArr[i7]), Character.valueOf(cArr2[i7])));
        }
        return arrayList;
    }

    @k4.f
    public static final char ra(char[] cArr, int i7, t4.l<? super Integer, Character> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Se(cArr)) ? lVar.O(Integer.valueOf(i7)).charValue() : cArr[i7];
    }

    @n6.d
    public static final <T> List<T> rb(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t6 : tArr) {
            if (!lVar.O(t6).booleanValue()) {
                arrayList.add(t6);
            }
        }
        return arrayList;
    }

    public static final long rc(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (long j7 : jArr) {
            if (lVar.O(Long.valueOf(j7)).booleanValue()) {
                return j7;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R, C extends Collection<? super R>> C rd(short[] sArr, C c7, t4.p<? super Integer, ? super Short, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = sArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), Short.valueOf(sArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    public static final void re(@n6.d char[] cArr, @n6.d t4.l<? super Character, m2> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (char c7 : cArr) {
            lVar.O(Character.valueOf(c7));
        }
    }

    @n6.e
    public static final Short rf(@n6.d short[] sArr, int i7) {
        u4.l0.p(sArr, "<this>");
        if (i7 < 0 || i7 > Ye(sArr)) {
            return null;
        }
        return Short.valueOf(sArr[i7]);
    }

    public static final int rg(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(Long.valueOf(jArr[i7])).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @n6.e
    public static final Boolean ri(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = zArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            boolean z6 = zArr[length];
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                return Boolean.valueOf(z6);
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C rj(@n6.d int[] iArr, @n6.d C c7, @n6.d t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (int i7 : iArr) {
            c7.add(lVar.O(Integer.valueOf(i7)));
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R rk(double[] dArr, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        R O = lVar.O(Double.valueOf(dArr[0]));
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Double.valueOf(dArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Short rl(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            short s7 = sArr[it.b()];
            if (s6 < s7) {
                s6 = s7;
            }
        }
        return Short.valueOf(s6);
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double rm(long[] jArr, t4.l<? super Long, Double> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Long.valueOf(jArr[0])).doubleValue();
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Long.valueOf(jArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R rn(float[] fArr, Comparator<? super R> comparator, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Float.valueOf(fArr[0]));
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Float.valueOf(fArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    @s4.h(name = "minWithOrThrow")
    @v3.g1(version = "1.7")
    public static final boolean ro(@n6.d boolean[] zArr, @n6.d Comparator<? super Boolean> comparator) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        boolean z6 = zArr[0];
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            boolean z7 = zArr[it.b()];
            if (comparator.compare(Boolean.valueOf(z6), Boolean.valueOf(z7)) > 0) {
                z6 = z7;
            }
        }
        return z6;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final float rp(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return sp(fArr, b5.f.f7260k);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Float rq(@n6.d float[] fArr, @n6.d t4.q<? super Integer, ? super Float, ? super Float, Float> qVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (fArr.length == 0) {
            return null;
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            f7 = qVar.I(Integer.valueOf(b7), Float.valueOf(f7), Float.valueOf(fArr[b7])).floatValue();
        }
        return Float.valueOf(f7);
    }

    @v3.g1(version = "1.4")
    public static final void rr(@n6.d byte[] bArr, int i7, int i8) {
        u4.l0.p(bArr, "<this>");
        x3.c.f18278k.d(i7, i8, bArr.length);
        int i9 = (i7 + i8) / 2;
        if (i7 == i9) {
            return;
        }
        int i10 = i8 - 1;
        while (i7 < i9) {
            byte b7 = bArr[i7];
            bArr[i7] = bArr[i10];
            bArr[i10] = b7;
            i10--;
            i7++;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <R> List<R> rs(boolean[] zArr, R r6, t4.q<? super Integer, ? super R, ? super Boolean, ? extends R> qVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (zArr.length == 0) {
            return x3.v.k(r6);
        }
        ArrayList arrayList = new ArrayList(zArr.length + 1);
        arrayList.add(r6);
        int length = zArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            r6 = qVar.I(Integer.valueOf(i7), r6, Boolean.valueOf(zArr[i7]));
            arrayList.add(r6);
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void rt(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        st(sArr, b5.f.f7260k);
    }

    @n6.d
    public static final <T> List<T> ru(@n6.d T[] tArr, @n6.d d5.l lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? x3.w.E() : x3.o.t(x3.o.M1(tArr, lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    @n6.d
    public static final double[] rv(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.l4(copyOf);
        return copyOf;
    }

    @n6.d
    public static final Set<Double> rw(@n6.d double[] dArr, @n6.d Iterable<Double> iterable) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Double> zz = zz(dArr);
        x3.b0.F0(zz, iterable);
        return zz;
    }

    @s4.h(name = "sumOfInt")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final int rx(boolean[] zArr, t4.l<? super Boolean, Integer> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        int i7 = 0;
        for (boolean z6 : zArr) {
            i7 += lVar.O(Boolean.valueOf(z6)).intValue();
        }
        return i7;
    }

    @n6.d
    public static final List<Float> ry(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Ue = Ue(fArr); -1 < Ue; Ue--) {
            if (!lVar.O(Float.valueOf(fArr[Ue])).booleanValue()) {
                return J9(fArr, Ue + 1);
            }
        }
        return hz(fArr);
    }

    @n6.d
    public static final List<Float> rz(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f7 : fArr) {
            arrayList.add(Float.valueOf(f7));
        }
        return arrayList;
    }

    @n6.d
    public static final <K, V> Map<K, V> s6(@n6.d int[] iArr, @n6.d t4.l<? super Integer, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(iArr.length), 16));
        for (int i7 : iArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Integer.valueOf(i7));
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V> Map<Double, V> s7(double[] dArr, t4.l<? super Double, ? extends V> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(dArr.length), 16));
        for (double d7 : dArr) {
            linkedHashMap.put(Double.valueOf(d7), lVar.O(Double.valueOf(d7)));
        }
        return linkedHashMap;
    }

    @k4.f
    public static final <T> T s8(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return tArr[2];
    }

    @n6.d
    public static final List<Integer> s9(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return e0.Q5(Bz(iArr));
    }

    @n6.d
    public static final <R> List<v3.u0<Character, R>> sA(@n6.d char[] cArr, @n6.d R[] rArr) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(rArr, "other");
        int min = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            char c7 = cArr[i7];
            arrayList.add(v3.q1.a(Character.valueOf(c7), rArr[i7]));
        }
        return arrayList;
    }

    @k4.f
    public static final double sa(double[] dArr, int i7, t4.l<? super Integer, Double> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Te(dArr)) ? lVar.O(Integer.valueOf(i7)).doubleValue() : dArr[i7];
    }

    @n6.d
    public static final List<Short> sb(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (short s6 : sArr) {
            if (!lVar.O(Short.valueOf(s6)).booleanValue()) {
                arrayList.add(Short.valueOf(s6));
            }
        }
        return arrayList;
    }

    public static final <T> T sc(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    @s4.h(name = "flatMapIndexedIterableTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R, C extends Collection<? super R>> C sd(boolean[] zArr, C c7, t4.p<? super Integer, ? super Boolean, ? extends Iterable<? extends R>> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = zArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.o0(c7, pVar.J(Integer.valueOf(i8), Boolean.valueOf(zArr[i7])));
            i7++;
            i8++;
        }
        return c7;
    }

    public static final void se(@n6.d double[] dArr, @n6.d t4.l<? super Double, m2> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (double d7 : dArr) {
            lVar.O(Double.valueOf(d7));
        }
    }

    @n6.d
    public static final <K> Map<K, List<Byte>> sf(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends K> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b7 : bArr) {
            K O = lVar.O(Byte.valueOf(b7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(Byte.valueOf(b7));
        }
        return linkedHashMap;
    }

    public static final <T> int sg(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = tArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(tArr[i7]).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @n6.e
    public static final Byte si(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return null;
        }
        return Byte.valueOf(bArr[bArr.length - 1]);
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C sj(@n6.d long[] jArr, @n6.d C c7, @n6.d t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (long j7 : jArr) {
            c7.add(lVar.O(Long.valueOf(j7)));
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R sk(float[] fArr, t4.l<? super Float, ? extends R> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            return null;
        }
        R O = lVar.O(Float.valueOf(fArr[0]));
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Float.valueOf(fArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final byte sl(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            byte b8 = bArr[it.b()];
            if (b7 < b8) {
                b7 = b8;
            }
        }
        return b7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> double sm(T[] tArr, t4.l<? super T, Double> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(tArr[0]).doubleValue();
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(tArr[it.b()]).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R sn(int[] iArr, Comparator<? super R> comparator, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Integer.valueOf(iArr[0]));
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Integer.valueOf(iArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean so(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr.length == 0;
    }

    @v3.g1(version = "1.3")
    public static final float sp(@n6.d float[] fArr, @n6.d b5.f fVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(fVar, "random");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[fVar.m(fArr.length)];
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Integer sq(@n6.d int[] iArr, @n6.d t4.q<? super Integer, ? super Integer, ? super Integer, Integer> qVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (iArr.length == 0) {
            return null;
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            i7 = qVar.I(Integer.valueOf(b7), Integer.valueOf(i7), Integer.valueOf(iArr[b7])).intValue();
        }
        return Integer.valueOf(i7);
    }

    public static final void sr(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        int length = (cArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Se = Se(cArr);
        s0 it = new d5.l(0, length).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            char c7 = cArr[b7];
            cArr[b7] = cArr[Se];
            cArr[Se] = c7;
            Se--;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Byte> ss(byte[] bArr, t4.p<? super Byte, ? super Byte, Byte> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (bArr.length == 0) {
            return x3.w.E();
        }
        byte b7 = bArr[0];
        ArrayList arrayList = new ArrayList(bArr.length);
        arrayList.add(Byte.valueOf(b7));
        int length = bArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            b7 = pVar.J(Byte.valueOf(b7), Byte.valueOf(bArr[i7])).byteValue();
            arrayList.add(Byte.valueOf(b7));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void st(@n6.d short[] sArr, @n6.d b5.f fVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(fVar, "random");
        for (int Ye = Ye(sArr); Ye > 0; Ye--) {
            int m7 = fVar.m(Ye + 1);
            short s6 = sArr[Ye];
            sArr[Ye] = sArr[m7];
            sArr[m7] = s6;
        }
    }

    @n6.d
    public static final <T> List<T> su(@n6.d T[] tArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(tArr[it.next().intValue()]);
        }
        return arrayList;
    }

    @n6.d
    public static final float[] sv(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return fArr;
        }
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.n4(copyOf);
        return copyOf;
    }

    @n6.d
    public static final Set<Float> sw(@n6.d float[] fArr, @n6.d Iterable<Float> iterable) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Float> Az = Az(fArr);
        x3.b0.F0(Az, iterable);
        return Az;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final long sx(byte[] bArr, t4.l<? super Byte, Long> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        long j7 = 0;
        for (byte b7 : bArr) {
            j7 += lVar.O(Byte.valueOf(b7)).longValue();
        }
        return j7;
    }

    @n6.d
    public static final List<Integer> sy(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Ve = Ve(iArr); -1 < Ve; Ve--) {
            if (!lVar.O(Integer.valueOf(iArr[Ve])).booleanValue()) {
                return K9(iArr, Ve + 1);
            }
        }
        return iz(iArr);
    }

    @n6.d
    public static final List<Integer> sz(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i7 : iArr) {
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList;
    }

    @n6.d
    public static final <K, V> Map<K, V> t6(@n6.d long[] jArr, @n6.d t4.l<? super Long, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(jArr.length), 16));
        for (long j7 : jArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Long.valueOf(j7));
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V> Map<Float, V> t7(float[] fArr, t4.l<? super Float, ? extends V> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(fArr.length), 16));
        for (float f7 : fArr) {
            linkedHashMap.put(Float.valueOf(f7), lVar.O(Float.valueOf(f7)));
        }
        return linkedHashMap;
    }

    @k4.f
    public static final short t8(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return sArr[2];
    }

    @n6.d
    public static final List<Long> t9(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return e0.Q5(Cz(jArr));
    }

    @n6.d
    public static final <R, V> List<V> tA(@n6.d char[] cArr, @n6.d R[] rArr, @n6.d t4.p<? super Character, ? super R, ? extends V> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(cArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Character.valueOf(cArr[i7]), rArr[i7]));
        }
        return arrayList;
    }

    @k4.f
    public static final float ta(float[] fArr, int i7, t4.l<? super Integer, Float> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Ue(fArr)) ? lVar.O(Integer.valueOf(i7)).floatValue() : fArr[i7];
    }

    @n6.d
    public static final List<Boolean> tb(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (boolean z6 : zArr) {
            if (!lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                arrayList.add(Boolean.valueOf(z6));
            }
        }
        return arrayList;
    }

    public static final <T> T tc(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (T t6 : tArr) {
            if (lVar.O(t6).booleanValue()) {
                return t6;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @s4.h(name = "flatMapIndexedSequence")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> List<R> td(T[] tArr, t4.p<? super Integer, ? super T, ? extends f5.m<? extends R>> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.n0(arrayList, pVar.J(Integer.valueOf(i8), tArr[i7]));
            i7++;
            i8++;
        }
        return arrayList;
    }

    public static final void te(@n6.d float[] fArr, @n6.d t4.l<? super Float, m2> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (float f7 : fArr) {
            lVar.O(Float.valueOf(f7));
        }
    }

    @n6.d
    public static final <K, V> Map<K, List<V>> tf(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends K> lVar, @n6.d t4.l<? super Byte, ? extends V> lVar2) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (byte b7 : bArr) {
            K O = lVar.O(Byte.valueOf(b7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(Byte.valueOf(b7)));
        }
        return linkedHashMap;
    }

    public static final int tg(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = sArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(Short.valueOf(sArr[i7])).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @n6.e
    public static final Byte ti(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            byte b7 = bArr[length];
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                return Byte.valueOf(b7);
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    @n6.d
    public static final <T, R, C extends Collection<? super R>> C tj(@n6.d T[] tArr, @n6.d C c7, @n6.d t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (T t6 : tArr) {
            c7.add(lVar.O(t6));
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R tk(int[] iArr, t4.l<? super Integer, ? extends R> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            return null;
        }
        R O = lVar.O(Integer.valueOf(iArr[0]));
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Integer.valueOf(iArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final char tl(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            char c8 = cArr[it.b()];
            if (u4.l0.t(c7, c8) < 0) {
                c7 = c8;
            }
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double tm(short[] sArr, t4.l<? super Short, Double> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Short.valueOf(sArr[0])).doubleValue();
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Short.valueOf(sArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R tn(long[] jArr, Comparator<? super R> comparator, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Long.valueOf(jArr[0]));
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Long.valueOf(jArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean to(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (byte b7 : bArr) {
            if (lVar.O(Byte.valueOf(b7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final int tp(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return up(iArr, b5.f.f7260k);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Long tq(@n6.d long[] jArr, @n6.d t4.q<? super Integer, ? super Long, ? super Long, Long> qVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (jArr.length == 0) {
            return null;
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            j7 = qVar.I(Integer.valueOf(b7), Long.valueOf(j7), Long.valueOf(jArr[b7])).longValue();
        }
        return Long.valueOf(j7);
    }

    @v3.g1(version = "1.4")
    public static final void tr(@n6.d char[] cArr, int i7, int i8) {
        u4.l0.p(cArr, "<this>");
        x3.c.f18278k.d(i7, i8, cArr.length);
        int i9 = (i7 + i8) / 2;
        if (i7 == i9) {
            return;
        }
        int i10 = i8 - 1;
        while (i7 < i9) {
            char c7 = cArr[i7];
            cArr[i7] = cArr[i10];
            cArr[i10] = c7;
            i10--;
            i7++;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Character> ts(char[] cArr, t4.p<? super Character, ? super Character, Character> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (cArr.length == 0) {
            return x3.w.E();
        }
        char c7 = cArr[0];
        ArrayList arrayList = new ArrayList(cArr.length);
        arrayList.add(Character.valueOf(c7));
        int length = cArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            c7 = pVar.J(Character.valueOf(c7), Character.valueOf(cArr[i7])).charValue();
            arrayList.add(Character.valueOf(c7));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void tt(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        ut(zArr, b5.f.f7260k);
    }

    @n6.d
    public static final List<Short> tu(@n6.d short[] sArr, @n6.d d5.l lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? x3.w.E() : x3.o.u(x3.o.N1(sArr, lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    @n6.d
    public static final int[] tv(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.p4(copyOf);
        return copyOf;
    }

    @n6.d
    public static final Set<Integer> tw(@n6.d int[] iArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Integer> Bz = Bz(iArr);
        x3.b0.F0(Bz, iterable);
        return Bz;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final long tx(char[] cArr, t4.l<? super Character, Long> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        long j7 = 0;
        for (char c7 : cArr) {
            j7 += lVar.O(Character.valueOf(c7)).longValue();
        }
        return j7;
    }

    @n6.d
    public static final List<Long> ty(@n6.d long[] jArr, @n6.d t4.l<? super Long, Boolean> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int We = We(jArr); -1 < We; We--) {
            if (!lVar.O(Long.valueOf(jArr[We])).booleanValue()) {
                return L9(jArr, We + 1);
            }
        }
        return jz(jArr);
    }

    @n6.d
    public static final List<Long> tz(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n6.d
    public static final <T, K, V> Map<K, V> u6(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(tArr.length), 16));
        for (b.a aVar : tArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(aVar);
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V> Map<Integer, V> u7(int[] iArr, t4.l<? super Integer, ? extends V> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(iArr.length), 16));
        for (int i7 : iArr) {
            linkedHashMap.put(Integer.valueOf(i7), lVar.O(Integer.valueOf(i7)));
        }
        return linkedHashMap;
    }

    @k4.f
    public static final boolean u8(boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return zArr[2];
    }

    @n6.d
    public static final <T> List<T> u9(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return e0.Q5(Dz(tArr));
    }

    @n6.d
    public static final <R> List<v3.u0<Double, R>> uA(@n6.d double[] dArr, @n6.d Iterable<? extends R> iterable) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(iterable, "other");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        int i7 = 0;
        for (R r6 : iterable) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(v3.q1.a(Double.valueOf(dArr[i7]), r6));
            i7++;
        }
        return arrayList;
    }

    @k4.f
    public static final int ua(int[] iArr, int i7, t4.l<? super Integer, Integer> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Ve(iArr)) ? lVar.O(Integer.valueOf(i7)).intValue() : iArr[i7];
    }

    @n6.d
    public static final <T> List<T> ub(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return (List) vb(tArr, new ArrayList());
    }

    public static final short uc(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return sArr[0];
    }

    @s4.h(name = "flatMapIndexedSequenceTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R, C extends Collection<? super R>> C ud(T[] tArr, C c7, t4.p<? super Integer, ? super T, ? extends f5.m<? extends R>> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(pVar, "transform");
        int length = tArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            x3.b0.n0(c7, pVar.J(Integer.valueOf(i8), tArr[i7]));
            i7++;
            i8++;
        }
        return c7;
    }

    public static final void ue(@n6.d int[] iArr, @n6.d t4.l<? super Integer, m2> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (int i7 : iArr) {
            lVar.O(Integer.valueOf(i7));
        }
    }

    @n6.d
    public static final <K> Map<K, List<Character>> uf(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends K> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c7 : cArr) {
            K O = lVar.O(Character.valueOf(c7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(Character.valueOf(c7));
        }
        return linkedHashMap;
    }

    public static final int ug(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = zArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (lVar.O(Boolean.valueOf(zArr[i7])).booleanValue()) {
                return i7;
            }
        }
        return -1;
    }

    @n6.e
    public static final Character ui(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C uj(@n6.d short[] sArr, @n6.d C c7, @n6.d t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (short s6 : sArr) {
            c7.add(lVar.O(Short.valueOf(s6)));
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R uk(long[] jArr, t4.l<? super Long, ? extends R> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (jArr.length == 0) {
            return null;
        }
        R O = lVar.O(Long.valueOf(jArr[0]));
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Long.valueOf(jArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final double ul(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            d7 = Math.max(d7, dArr[it.b()]);
        }
        return d7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final double um(boolean[] zArr, t4.l<? super Boolean, Double> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = lVar.O(Boolean.valueOf(zArr[0])).doubleValue();
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.O(Boolean.valueOf(zArr[it.b()])).doubleValue());
        }
        return doubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R> R un(T[] tArr, Comparator<? super R> comparator, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(tArr[0]);
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(tArr[it.b()]);
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean uo(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr.length == 0;
    }

    @v3.g1(version = "1.3")
    public static final int up(@n6.d int[] iArr, @n6.d b5.f fVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(fVar, "random");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[fVar.m(iArr.length)];
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <S, T extends S> S uq(@n6.d T[] tArr, @n6.d t4.q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (tArr.length == 0) {
            return null;
        }
        Object obj = (S) tArr[0];
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            obj = (S) qVar.I(Integer.valueOf(b7), obj, (Object) tArr[b7]);
        }
        return (S) obj;
    }

    public static final void ur(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        int length = (dArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Te = Te(dArr);
        s0 it = new d5.l(0, length).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            double d7 = dArr[b7];
            dArr[b7] = dArr[Te];
            dArr[Te] = d7;
            Te--;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Double> us(double[] dArr, t4.p<? super Double, ? super Double, Double> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (dArr.length == 0) {
            return x3.w.E();
        }
        double d7 = dArr[0];
        ArrayList arrayList = new ArrayList(dArr.length);
        arrayList.add(Double.valueOf(d7));
        int length = dArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            d7 = pVar.J(Double.valueOf(d7), Double.valueOf(dArr[i7])).doubleValue();
            arrayList.add(Double.valueOf(d7));
        }
        return arrayList;
    }

    @v3.g1(version = "1.4")
    public static final void ut(@n6.d boolean[] zArr, @n6.d b5.f fVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(fVar, "random");
        for (int Ze = Ze(zArr); Ze > 0; Ze--) {
            int m7 = fVar.m(Ze + 1);
            boolean z6 = zArr[Ze];
            zArr[Ze] = zArr[m7];
            zArr[m7] = z6;
        }
    }

    @n6.d
    public static final List<Short> uu(@n6.d short[] sArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Short.valueOf(sArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @n6.d
    public static final long[] uv(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            return jArr;
        }
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.r4(copyOf);
        return copyOf;
    }

    @n6.d
    public static final Set<Long> uw(@n6.d long[] jArr, @n6.d Iterable<Long> iterable) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Long> Cz = Cz(jArr);
        x3.b0.F0(Cz, iterable);
        return Cz;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final long ux(double[] dArr, t4.l<? super Double, Long> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        long j7 = 0;
        for (double d7 : dArr) {
            j7 += lVar.O(Double.valueOf(d7)).longValue();
        }
        return j7;
    }

    @n6.d
    public static final <T> List<T> uy(@n6.d T[] tArr, @n6.d t4.l<? super T, Boolean> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Xe = Xe(tArr); -1 < Xe; Xe--) {
            if (!lVar.O(tArr[Xe]).booleanValue()) {
                return M9(tArr, Xe + 1);
            }
        }
        return kz(tArr);
    }

    @n6.d
    public static final <T> List<T> uz(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return new ArrayList(x3.w.s(tArr));
    }

    public static final boolean v5(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (byte b7 : bArr) {
            if (!lVar.O(Byte.valueOf(b7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <K, V> Map<K, V> v6(@n6.d short[] sArr, @n6.d t4.l<? super Short, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(sArr.length), 16));
        for (short s6 : sArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Short.valueOf(s6));
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V> Map<Long, V> v7(long[] jArr, t4.l<? super Long, ? extends V> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(jArr.length), 16));
        for (long j7 : jArr) {
            linkedHashMap.put(Long.valueOf(j7), lVar.O(Long.valueOf(j7)));
        }
        return linkedHashMap;
    }

    @k4.f
    public static final byte v8(byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return bArr[3];
    }

    @n6.d
    public static final List<Short> v9(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return e0.Q5(Ez(sArr));
    }

    @n6.d
    public static final <R, V> List<V> vA(@n6.d double[] dArr, @n6.d Iterable<? extends R> iterable, @n6.d t4.p<? super Double, ? super R, ? extends V> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(iterable, "other");
        u4.l0.p(pVar, "transform");
        int length = dArr.length;
        ArrayList arrayList = new ArrayList(Math.min(x3.x.Y(iterable, 10), length));
        Iterator<? extends R> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object obj = (R) it.next();
            if (i7 >= length) {
                break;
            }
            arrayList.add(pVar.J(Double.valueOf(dArr[i7]), obj));
            i7++;
        }
        return arrayList;
    }

    @k4.f
    public static final long va(long[] jArr, int i7, t4.l<? super Integer, Long> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > We(jArr)) ? lVar.O(Integer.valueOf(i7)).longValue() : jArr[i7];
    }

    @n6.d
    public static final <C extends Collection<? super T>, T> C vb(@n6.d T[] tArr, @n6.d C c7) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        for (T t6 : tArr) {
            if (t6 != null) {
                c7.add(t6);
            }
        }
        return c7;
    }

    public static final short vc(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (short s6 : sArr) {
            if (lVar.O(Short.valueOf(s6)).booleanValue()) {
                return s6;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @s4.h(name = "flatMapSequence")
    @v3.g1(version = "1.4")
    @v3.t0
    @n6.d
    public static final <T, R> List<R> vd(@n6.d T[] tArr, @n6.d t4.l<? super T, ? extends f5.m<? extends R>> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (T t6 : tArr) {
            x3.b0.n0(arrayList, lVar.O(t6));
        }
        return arrayList;
    }

    public static final void ve(@n6.d long[] jArr, @n6.d t4.l<? super Long, m2> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (long j7 : jArr) {
            lVar.O(Long.valueOf(j7));
        }
    }

    @n6.d
    public static final <K, V> Map<K, List<V>> vf(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends K> lVar, @n6.d t4.l<? super Character, ? extends V> lVar2) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (char c7 : cArr) {
            K O = lVar.O(Character.valueOf(c7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(Character.valueOf(c7)));
        }
        return linkedHashMap;
    }

    public static final int vg(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(Byte.valueOf(bArr[length])).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.e
    public static final Character vi(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = cArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            char c7 = cArr[length];
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                return Character.valueOf(c7);
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C vj(@n6.d boolean[] zArr, @n6.d C c7, @n6.d t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (boolean z6 : zArr) {
            c7.add(lVar.O(Boolean.valueOf(z6)));
        }
        return c7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T, R extends Comparable<? super R>> R vk(T[] tArr, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (tArr.length == 0) {
            return null;
        }
        R O = lVar.O(tArr[0]);
        s0 it = new d5.l(1, Xe(tArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(tArr[it.b()]);
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final double vl(@n6.d Double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = dArr[0].doubleValue();
        s0 it = new d5.l(1, Xe(dArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, dArr[it.b()].doubleValue());
        }
        return doubleValue;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float vm(byte[] bArr, t4.l<? super Byte, Float> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Byte.valueOf(bArr[0])).floatValue();
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Byte.valueOf(bArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R vn(short[] sArr, Comparator<? super R> comparator, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Short.valueOf(sArr[0]));
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Short.valueOf(sArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean vo(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final long vp(long[] jArr) {
        u4.l0.p(jArr, "<this>");
        return wp(jArr, b5.f.f7260k);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final Short vq(@n6.d short[] sArr, @n6.d t4.q<? super Integer, ? super Short, ? super Short, Short> qVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(qVar, "operation");
        if (sArr.length == 0) {
            return null;
        }
        short s6 = sArr[0];
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            s6 = qVar.I(Integer.valueOf(b7), Short.valueOf(s6), Short.valueOf(sArr[b7])).shortValue();
        }
        return Short.valueOf(s6);
    }

    @v3.g1(version = "1.4")
    public static final void vr(@n6.d double[] dArr, int i7, int i8) {
        u4.l0.p(dArr, "<this>");
        x3.c.f18278k.d(i7, i8, dArr.length);
        int i9 = (i7 + i8) / 2;
        if (i7 == i9) {
            return;
        }
        int i10 = i8 - 1;
        while (i7 < i9) {
            double d7 = dArr[i7];
            dArr[i7] = dArr[i10];
            dArr[i10] = d7;
            i10--;
            i7++;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Float> vs(float[] fArr, t4.p<? super Float, ? super Float, Float> pVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (fArr.length == 0) {
            return x3.w.E();
        }
        float f7 = fArr[0];
        ArrayList arrayList = new ArrayList(fArr.length);
        arrayList.add(Float.valueOf(f7));
        int length = fArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            f7 = pVar.J(Float.valueOf(f7), Float.valueOf(fArr[i7])).floatValue();
            arrayList.add(Float.valueOf(f7));
        }
        return arrayList;
    }

    public static final byte vt(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length == 1) {
                return bArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @n6.d
    public static final List<Boolean> vu(@n6.d boolean[] zArr, @n6.d d5.l lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? x3.w.E() : x3.o.v(x3.o.O1(zArr, lVar.b().intValue(), lVar.g().intValue() + 1));
    }

    @n6.d
    public static final <T extends Comparable<? super T>> T[] vv(@n6.d T[] tArr) {
        u4.l0.p(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        T[] tArr2 = (T[]) ((Comparable[]) copyOf);
        x3.o.v4(tArr2);
        return tArr2;
    }

    @n6.d
    public static final <T> Set<T> vw(@n6.d T[] tArr, @n6.d Iterable<? extends T> iterable) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<T> Dz = Dz(tArr);
        x3.b0.F0(Dz, iterable);
        return Dz;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final long vx(float[] fArr, t4.l<? super Float, Long> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        long j7 = 0;
        for (float f7 : fArr) {
            j7 += lVar.O(Float.valueOf(f7)).longValue();
        }
        return j7;
    }

    @n6.d
    public static final List<Short> vy(@n6.d short[] sArr, @n6.d t4.l<? super Short, Boolean> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Ye = Ye(sArr); -1 < Ye; Ye--) {
            if (!lVar.O(Short.valueOf(sArr[Ye])).booleanValue()) {
                return N9(sArr, Ye + 1);
            }
        }
        return lz(sArr);
    }

    @n6.d
    public static final List<Short> vz(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s6 : sArr) {
            arrayList.add(Short.valueOf(s6));
        }
        return arrayList;
    }

    public static final boolean w5(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (char c7 : cArr) {
            if (!lVar.O(Character.valueOf(c7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <K, V> Map<K, V> w6(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends v3.u0<? extends K, ? extends V>> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(zArr.length), 16));
        for (boolean z6 : zArr) {
            v3.u0<? extends K, ? extends V> O = lVar.O(Boolean.valueOf(z6));
            linkedHashMap.put(O.e(), O.f());
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @n6.d
    public static final <K, V> Map<K, V> w7(@n6.d K[] kArr, @n6.d t4.l<? super K, ? extends V> lVar) {
        u4.l0.p(kArr, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(kArr.length), 16));
        for (K k7 : kArr) {
            linkedHashMap.put(k7, lVar.O(k7));
        }
        return linkedHashMap;
    }

    @k4.f
    public static final char w8(char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return cArr[3];
    }

    @n6.d
    public static final List<Boolean> w9(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        return e0.Q5(Fz(zArr));
    }

    @n6.d
    public static final List<v3.u0<Double, Double>> wA(@n6.d double[] dArr, @n6.d double[] dArr2) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(dArr2, "other");
        int min = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(v3.q1.a(Double.valueOf(dArr[i7]), Double.valueOf(dArr2[i7])));
        }
        return arrayList;
    }

    @k4.f
    public static final <T> T wa(T[] tArr, int i7, t4.l<? super Integer, ? extends T> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Xe(tArr)) ? lVar.O(Integer.valueOf(i7)) : tArr[i7];
    }

    @n6.d
    public static final <C extends Collection<? super Byte>> C wb(@n6.d byte[] bArr, @n6.d C c7, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (byte b7 : bArr) {
            if (!lVar.O(Byte.valueOf(b7)).booleanValue()) {
                c7.add(Byte.valueOf(b7));
            }
        }
        return c7;
    }

    public static final boolean wc(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        if (zArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return zArr[0];
    }

    @s4.h(name = "flatMapSequenceTo")
    @v3.g1(version = "1.4")
    @v3.t0
    @n6.d
    public static final <T, R, C extends Collection<? super R>> C wd(@n6.d T[] tArr, @n6.d C c7, @n6.d t4.l<? super T, ? extends f5.m<? extends R>> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (T t6 : tArr) {
            x3.b0.n0(c7, lVar.O(t6));
        }
        return c7;
    }

    public static final <T> void we(@n6.d T[] tArr, @n6.d t4.l<? super T, m2> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (T t6 : tArr) {
            lVar.O(t6);
        }
    }

    @n6.d
    public static final <K> Map<K, List<Double>> wf(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends K> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d7 : dArr) {
            K O = lVar.O(Double.valueOf(d7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(Double.valueOf(d7));
        }
        return linkedHashMap;
    }

    public static final int wg(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(Character.valueOf(cArr[length])).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.e
    public static final Double wi(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return null;
        }
        return Double.valueOf(dArr[dArr.length - 1]);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Boolean wj(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z6 = zArr[0];
        int Ze = Ze(zArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R wk(short[] sArr, t4.l<? super Short, ? extends R> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (sArr.length == 0) {
            return null;
        }
        R O = lVar.O(Short.valueOf(sArr[0]));
        s0 it = new d5.l(1, Ye(sArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Short.valueOf(sArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final float wl(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float f7 = fArr[0];
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            f7 = Math.max(f7, fArr[it.b()]);
        }
        return f7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float wm(char[] cArr, t4.l<? super Character, Float> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Character.valueOf(cArr[0])).floatValue();
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Character.valueOf(cArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R wn(boolean[] zArr, Comparator<? super R> comparator, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            throw new NoSuchElementException();
        }
        Object obj = (R) lVar.O(Boolean.valueOf(zArr[0]));
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Boolean.valueOf(zArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean wo(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr.length == 0;
    }

    @v3.g1(version = "1.3")
    public static final long wp(@n6.d long[] jArr, @n6.d b5.f fVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(fVar, "random");
        if (jArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return jArr[fVar.m(jArr.length)];
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Boolean wq(@n6.d boolean[] zArr, @n6.d t4.p<? super Boolean, ? super Boolean, Boolean> pVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (zArr.length == 0) {
            return null;
        }
        boolean z6 = zArr[0];
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            z6 = pVar.J(Boolean.valueOf(z6), Boolean.valueOf(zArr[it.b()])).booleanValue();
        }
        return Boolean.valueOf(z6);
    }

    public static final void wr(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        int length = (fArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Ue = Ue(fArr);
        s0 it = new d5.l(0, length).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            float f7 = fArr[b7];
            fArr[b7] = fArr[Ue];
            fArr[Ue] = f7;
            Ue--;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Integer> ws(int[] iArr, t4.p<? super Integer, ? super Integer, Integer> pVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (iArr.length == 0) {
            return x3.w.E();
        }
        int i7 = iArr[0];
        ArrayList arrayList = new ArrayList(iArr.length);
        arrayList.add(Integer.valueOf(i7));
        int length = iArr.length;
        for (int i8 = 1; i8 < length; i8++) {
            i7 = pVar.J(Integer.valueOf(i7), Integer.valueOf(iArr[i8])).intValue();
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList;
    }

    public static final byte wt(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Byte b7 = null;
        boolean z6 = false;
        for (byte b8 : bArr) {
            if (lVar.O(Byte.valueOf(b8)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                b7 = Byte.valueOf(b8);
                z6 = true;
            }
        }
        if (z6) {
            u4.l0.n(b7, "null cannot be cast to non-null type kotlin.Byte");
            return b7.byteValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final List<Boolean> wu(@n6.d boolean[] zArr, @n6.d Iterable<Integer> iterable) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(iterable, "indices");
        int Y = x3.x.Y(iterable, 10);
        if (Y == 0) {
            return x3.w.E();
        }
        ArrayList arrayList = new ArrayList(Y);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(zArr[it.next().intValue()]));
        }
        return arrayList;
    }

    @n6.d
    public static final short[] wv(@n6.d short[] sArr) {
        u4.l0.p(sArr, "<this>");
        if (sArr.length == 0) {
            return sArr;
        }
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        x3.o.x4(copyOf);
        return copyOf;
    }

    @n6.d
    public static final Set<Short> ww(@n6.d short[] sArr, @n6.d Iterable<Short> iterable) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Short> Ez = Ez(sArr);
        x3.b0.F0(Ez, iterable);
        return Ez;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final long wx(int[] iArr, t4.l<? super Integer, Long> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        long j7 = 0;
        for (int i7 : iArr) {
            j7 += lVar.O(Integer.valueOf(i7)).longValue();
        }
        return j7;
    }

    @n6.d
    public static final List<Boolean> wy(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int Ze = Ze(zArr); -1 < Ze; Ze--) {
            if (!lVar.O(Boolean.valueOf(zArr[Ze])).booleanValue()) {
                return O9(zArr, Ze + 1);
            }
        }
        return mz(zArr);
    }

    @n6.d
    public static final List<Boolean> wz(@n6.d boolean[] zArr) {
        u4.l0.p(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z6 : zArr) {
            arrayList.add(Boolean.valueOf(z6));
        }
        return arrayList;
    }

    public static final boolean x5(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (double d7 : dArr) {
            if (!lVar.O(Double.valueOf(d7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <K> Map<K, Byte> x6(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends K> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(bArr.length), 16));
        for (byte b7 : bArr) {
            linkedHashMap.put(lVar.O(Byte.valueOf(b7)), Byte.valueOf(b7));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V> Map<Short, V> x7(short[] sArr, t4.l<? super Short, ? extends V> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(sArr.length), 16));
        for (short s6 : sArr) {
            linkedHashMap.put(Short.valueOf(s6), lVar.O(Short.valueOf(s6)));
        }
        return linkedHashMap;
    }

    @k4.f
    public static final double x8(double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return dArr[3];
    }

    @n6.d
    public static final <K> List<Byte> x9(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends K> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (byte b7 : bArr) {
            if (hashSet.add(lVar.O(Byte.valueOf(b7)))) {
                arrayList.add(Byte.valueOf(b7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <V> List<V> xA(@n6.d double[] dArr, @n6.d double[] dArr2, @n6.d t4.p<? super Double, ? super Double, ? extends V> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(dArr2, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(dArr.length, dArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Double.valueOf(dArr[i7]), Double.valueOf(dArr2[i7])));
        }
        return arrayList;
    }

    @k4.f
    public static final short xa(short[] sArr, int i7, t4.l<? super Integer, Short> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Ye(sArr)) ? lVar.O(Integer.valueOf(i7)).shortValue() : sArr[i7];
    }

    @n6.d
    public static final <C extends Collection<? super Character>> C xb(@n6.d char[] cArr, @n6.d C c7, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (char c8 : cArr) {
            if (!lVar.O(Character.valueOf(c8)).booleanValue()) {
                c7.add(Character.valueOf(c8));
            }
        }
        return c7;
    }

    public static final boolean xc(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (boolean z6 : zArr) {
            if (lVar.O(Boolean.valueOf(z6)).booleanValue()) {
                return z6;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C xd(@n6.d byte[] bArr, @n6.d C c7, @n6.d t4.l<? super Byte, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (byte b7 : bArr) {
            x3.b0.o0(c7, lVar.O(Byte.valueOf(b7)));
        }
        return c7;
    }

    public static final void xe(@n6.d short[] sArr, @n6.d t4.l<? super Short, m2> lVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (short s6 : sArr) {
            lVar.O(Short.valueOf(s6));
        }
    }

    @n6.d
    public static final <K, V> Map<K, List<V>> xf(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends K> lVar, @n6.d t4.l<? super Double, ? extends V> lVar2) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (double d7 : dArr) {
            K O = lVar.O(Double.valueOf(d7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(Double.valueOf(d7)));
        }
        return linkedHashMap;
    }

    public static final int xg(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(Double.valueOf(dArr[length])).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final String xh(@n6.d byte[] bArr, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Byte, ? extends CharSequence> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) fh(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.e
    public static final Double xi(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = dArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            double d7 = dArr[length];
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                return Double.valueOf(d7);
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Byte xj(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        int Re = Re(bArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R extends Comparable<? super R>> R xk(boolean[] zArr, t4.l<? super Boolean, ? extends R> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (zArr.length == 0) {
            return null;
        }
        R O = lVar.O(Boolean.valueOf(zArr[0]));
        s0 it = new d5.l(1, Ze(zArr)).iterator();
        while (it.hasNext()) {
            R O2 = lVar.O(Boolean.valueOf(zArr[it.b()]));
            if (O.compareTo(O2) < 0) {
                O = O2;
            }
        }
        return O;
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final float xl(@n6.d Float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = fArr[0].floatValue();
        s0 it = new d5.l(1, Xe(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, fArr[it.b()].floatValue());
        }
        return floatValue;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float xm(double[] dArr, t4.l<? super Double, Float> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Double.valueOf(dArr[0])).floatValue();
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Double.valueOf(dArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R xn(byte[] bArr, Comparator<? super R> comparator, t4.l<? super Byte, ? extends R> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Byte.valueOf(bArr[0]));
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Byte.valueOf(bArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean xo(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (double d7 : dArr) {
            if (lVar.O(Double.valueOf(d7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final <T> T xp(T[] tArr) {
        u4.l0.p(tArr, "<this>");
        return (T) yp(tArr, b5.f.f7260k);
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Byte xq(@n6.d byte[] bArr, @n6.d t4.p<? super Byte, ? super Byte, Byte> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (bArr.length == 0) {
            return null;
        }
        byte b7 = bArr[0];
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            b7 = pVar.J(Byte.valueOf(b7), Byte.valueOf(bArr[it.b()])).byteValue();
        }
        return Byte.valueOf(b7);
    }

    @v3.g1(version = "1.4")
    public static final void xr(@n6.d float[] fArr, int i7, int i8) {
        u4.l0.p(fArr, "<this>");
        x3.c.f18278k.d(i7, i8, fArr.length);
        int i9 = (i7 + i8) / 2;
        if (i7 == i9) {
            return;
        }
        int i10 = i8 - 1;
        while (i7 < i9) {
            float f7 = fArr[i7];
            fArr[i7] = fArr[i10];
            fArr[i10] = f7;
            i10--;
            i7++;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Long> xs(long[] jArr, t4.p<? super Long, ? super Long, Long> pVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (jArr.length == 0) {
            return x3.w.E();
        }
        long j7 = jArr[0];
        ArrayList arrayList = new ArrayList(jArr.length);
        arrayList.add(Long.valueOf(j7));
        int length = jArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            j7 = pVar.J(Long.valueOf(j7), Long.valueOf(jArr[i7])).longValue();
            arrayList.add(Long.valueOf(j7));
        }
        return arrayList;
    }

    public static final char xt(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @n6.d
    public static final byte[] xu(@n6.d byte[] bArr, @n6.d d5.l lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? new byte[0] : x3.o.G1(bArr, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final byte[] xv(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        Ru(copyOf);
        return copyOf;
    }

    @n6.d
    public static final Set<Boolean> xw(@n6.d boolean[] zArr, @n6.d Iterable<Boolean> iterable) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(iterable, "other");
        Set<Boolean> Fz = Fz(zArr);
        x3.b0.F0(Fz, iterable);
        return Fz;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final long xx(long[] jArr, t4.l<? super Long, Long> lVar) {
        u4.l0.p(jArr, "<this>");
        u4.l0.p(lVar, "selector");
        long j7 = 0;
        for (long j8 : jArr) {
            j7 += lVar.O(Long.valueOf(j8)).longValue();
        }
        return j7;
    }

    @n6.d
    public static final List<Byte> xy(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, Boolean> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (byte b7 : bArr) {
            if (!lVar.O(Byte.valueOf(b7)).booleanValue()) {
                break;
            }
            arrayList.add(Byte.valueOf(b7));
        }
        return arrayList;
    }

    @n6.d
    public static final Set<Byte> xz(@n6.d byte[] bArr) {
        u4.l0.p(bArr, "<this>");
        return (Set) Jy(bArr, new LinkedHashSet(z0.j(bArr.length)));
    }

    public static final boolean y5(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (float f7 : fArr) {
            if (!lVar.O(Float.valueOf(f7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <K, V> Map<K, V> y6(@n6.d byte[] bArr, @n6.d t4.l<? super Byte, ? extends K> lVar, @n6.d t4.l<? super Byte, ? extends V> lVar2) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(bArr.length), 16));
        for (byte b7 : bArr) {
            linkedHashMap.put(lVar.O(Byte.valueOf(b7)), lVar2.O(Byte.valueOf(b7)));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V> Map<Boolean, V> y7(boolean[] zArr, t4.l<? super Boolean, ? extends V> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(zArr.length), 16));
        for (boolean z6 : zArr) {
            linkedHashMap.put(Boolean.valueOf(z6), lVar.O(Boolean.valueOf(z6)));
        }
        return linkedHashMap;
    }

    @k4.f
    public static final float y8(float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr[3];
    }

    @n6.d
    public static final <K> List<Character> y9(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends K> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (char c7 : cArr) {
            if (hashSet.add(lVar.O(Character.valueOf(c7)))) {
                arrayList.add(Character.valueOf(c7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <R> List<v3.u0<Double, R>> yA(@n6.d double[] dArr, @n6.d R[] rArr) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(rArr, "other");
        int min = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            double d7 = dArr[i7];
            arrayList.add(v3.q1.a(Double.valueOf(d7), rArr[i7]));
        }
        return arrayList;
    }

    @k4.f
    public static final boolean ya(boolean[] zArr, int i7, t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, "defaultValue");
        return (i7 < 0 || i7 > Ze(zArr)) ? lVar.O(Integer.valueOf(i7)).booleanValue() : zArr[i7];
    }

    @n6.d
    public static final <C extends Collection<? super Double>> C yb(@n6.d double[] dArr, @n6.d C c7, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (double d7 : dArr) {
            if (!lVar.O(Double.valueOf(d7)).booleanValue()) {
                c7.add(Double.valueOf(d7));
            }
        }
        return c7;
    }

    @v3.g1(version = "1.5")
    @k4.f
    public static final <T, R> R yc(T[] tArr, t4.l<? super T, ? extends R> lVar) {
        R r6;
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "transform");
        int length = tArr.length;
        int i7 = 0;
        while (true) {
            if (i7 < length) {
                r6 = lVar.O(tArr[i7]);
                if (r6 != null) {
                    break;
                }
                i7++;
            } else {
                r6 = null;
                break;
            }
        }
        if (r6 != null) {
            return r6;
        }
        throw new NoSuchElementException("No element of the array was transformed to a non-null value.");
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C yd(@n6.d char[] cArr, @n6.d C c7, @n6.d t4.l<? super Character, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (char c8 : cArr) {
            x3.b0.o0(c7, lVar.O(Character.valueOf(c8)));
        }
        return c7;
    }

    public static final void ye(@n6.d boolean[] zArr, @n6.d t4.l<? super Boolean, m2> lVar) {
        u4.l0.p(zArr, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        for (boolean z6 : zArr) {
            lVar.O(Boolean.valueOf(z6));
        }
    }

    @n6.d
    public static final <K> Map<K, List<Float>> yf(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends K> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f7 : fArr) {
            K O = lVar.O(Float.valueOf(f7));
            Object obj = linkedHashMap.get(O);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(O, obj);
            }
            ((List) obj).add(Float.valueOf(f7));
        }
        return linkedHashMap;
    }

    public static final int yg(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(Float.valueOf(fArr[length])).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final String yh(@n6.d char[] cArr, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Character, ? extends CharSequence> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) gh(cArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.e
    public static final Float yi(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Character yj(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        int Se = Se(cArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double yk(byte[] bArr, t4.l<? super Byte, Double> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (bArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Byte.valueOf(bArr[0])).doubleValue();
        s0 it = new d5.l(1, Re(bArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Byte.valueOf(bArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final int yl(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i7 = iArr[0];
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            int i8 = iArr[it.b()];
            if (i7 < i8) {
                i7 = i8;
            }
        }
        return i7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float ym(float[] fArr, t4.l<? super Float, Float> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (fArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Float.valueOf(fArr[0])).floatValue();
        s0 it = new d5.l(1, Ue(fArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Float.valueOf(fArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R yn(char[] cArr, Comparator<? super R> comparator, t4.l<? super Character, ? extends R> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Character.valueOf(cArr[0]));
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Character.valueOf(cArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean yo(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        return fArr.length == 0;
    }

    @v3.g1(version = "1.3")
    public static final <T> T yp(@n6.d T[] tArr, @n6.d b5.f fVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(fVar, "random");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[fVar.m(tArr.length)];
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Character yq(@n6.d char[] cArr, @n6.d t4.p<? super Character, ? super Character, Character> pVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (cArr.length == 0) {
            return null;
        }
        char c7 = cArr[0];
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            c7 = pVar.J(Character.valueOf(c7), Character.valueOf(cArr[it.b()])).charValue();
        }
        return Character.valueOf(c7);
    }

    public static final void yr(@n6.d int[] iArr) {
        u4.l0.p(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int Ve = Ve(iArr);
        s0 it = new d5.l(0, length).iterator();
        while (it.hasNext()) {
            int b7 = it.b();
            int i7 = iArr[b7];
            iArr[b7] = iArr[Ve];
            iArr[Ve] = i7;
            Ve--;
        }
    }

    @v3.g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <S, T extends S> List<S> ys(@n6.d T[] tArr, @n6.d t4.p<? super S, ? super T, ? extends S> pVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (tArr.length == 0) {
            return x3.w.E();
        }
        S s6 = (Object) tArr[0];
        ArrayList arrayList = new ArrayList(tArr.length);
        arrayList.add(s6);
        int length = tArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            s6 = pVar.J(s6, (Object) tArr[i7]);
            arrayList.add(s6);
        }
        return arrayList;
    }

    public static final char yt(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        Character ch = null;
        boolean z6 = false;
        for (char c7 : cArr) {
            if (lVar.O(Character.valueOf(c7)).booleanValue()) {
                if (z6) {
                    throw new IllegalArgumentException("Array contains more than one matching element.");
                }
                ch = Character.valueOf(c7);
                z6 = true;
            }
        }
        if (z6) {
            u4.l0.n(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @n6.d
    public static final byte[] yu(@n6.d byte[] bArr, @n6.d Collection<Integer> collection) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(collection, "indices");
        byte[] bArr2 = new byte[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            bArr2[i7] = bArr[it.next().intValue()];
            i7++;
        }
        return bArr2;
    }

    @n6.d
    public static final char[] yv(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        if (cArr.length == 0) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        Tu(copyOf);
        return copyOf;
    }

    public static final double yw(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        double d7 = androidx.cardview.widget.g.f1896q;
        for (double d8 : dArr) {
            d7 += d8;
        }
        return d7;
    }

    @s4.h(name = "sumOfLong")
    public static final long yx(@n6.d Long[] lArr) {
        u4.l0.p(lArr, "<this>");
        long j7 = 0;
        for (Long l7 : lArr) {
            j7 += l7.longValue();
        }
        return j7;
    }

    @n6.d
    public static final List<Character> yy(@n6.d char[] cArr, @n6.d t4.l<? super Character, Boolean> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (char c7 : cArr) {
            if (!lVar.O(Character.valueOf(c7)).booleanValue()) {
                break;
            }
            arrayList.add(Character.valueOf(c7));
        }
        return arrayList;
    }

    @n6.d
    public static final Set<Character> yz(@n6.d char[] cArr) {
        u4.l0.p(cArr, "<this>");
        return (Set) Ky(cArr, new LinkedHashSet(z0.j(d5.u.B(cArr.length, 128))));
    }

    public static final boolean z5(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (int i7 : iArr) {
            if (!lVar.O(Integer.valueOf(i7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @n6.d
    public static final <K> Map<K, Character> z6(@n6.d char[] cArr, @n6.d t4.l<? super Character, ? extends K> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(cArr.length), 16));
        for (char c7 : cArr) {
            linkedHashMap.put(lVar.O(Character.valueOf(c7)), Character.valueOf(c7));
        }
        return linkedHashMap;
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final <V, M extends Map<? super Byte, ? super V>> M z7(byte[] bArr, M m7, t4.l<? super Byte, ? extends V> lVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(m7, "destination");
        u4.l0.p(lVar, "valueSelector");
        for (byte b7 : bArr) {
            m7.put(Byte.valueOf(b7), lVar.O(Byte.valueOf(b7)));
        }
        return m7;
    }

    @k4.f
    public static final int z8(int[] iArr) {
        u4.l0.p(iArr, "<this>");
        return iArr[3];
    }

    @n6.d
    public static final <K> List<Double> z9(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends K> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (double d7 : dArr) {
            if (hashSet.add(lVar.O(Double.valueOf(d7)))) {
                arrayList.add(Double.valueOf(d7));
            }
        }
        return arrayList;
    }

    @n6.d
    public static final <R, V> List<V> zA(@n6.d double[] dArr, @n6.d R[] rArr, @n6.d t4.p<? super Double, ? super R, ? extends V> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(rArr, "other");
        u4.l0.p(pVar, "transform");
        int min = Math.min(dArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i7 = 0; i7 < min; i7++) {
            arrayList.add(pVar.J(Double.valueOf(dArr[i7]), rArr[i7]));
        }
        return arrayList;
    }

    @k4.f
    public static final Boolean za(boolean[] zArr, int i7) {
        u4.l0.p(zArr, "<this>");
        return jf(zArr, i7);
    }

    @n6.d
    public static final <C extends Collection<? super Float>> C zb(@n6.d float[] fArr, @n6.d C c7, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "predicate");
        for (float f7 : fArr) {
            if (!lVar.O(Float.valueOf(f7)).booleanValue()) {
                c7.add(Float.valueOf(f7));
            }
        }
        return c7;
    }

    @v3.g1(version = "1.5")
    @k4.f
    public static final <T, R> R zc(T[] tArr, t4.l<? super T, ? extends R> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "transform");
        for (T t6 : tArr) {
            R O = lVar.O(t6);
            if (O != null) {
                return O;
            }
        }
        return null;
    }

    @n6.d
    public static final <R, C extends Collection<? super R>> C zd(@n6.d double[] dArr, @n6.d C c7, @n6.d t4.l<? super Double, ? extends Iterable<? extends R>> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(c7, "destination");
        u4.l0.p(lVar, "transform");
        for (double d7 : dArr) {
            x3.b0.o0(c7, lVar.O(Double.valueOf(d7)));
        }
        return c7;
    }

    public static final void ze(@n6.d byte[] bArr, @n6.d t4.p<? super Integer, ? super Byte, m2> pVar) {
        u4.l0.p(bArr, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            pVar.J(Integer.valueOf(i8), Byte.valueOf(bArr[i7]));
            i7++;
            i8++;
        }
    }

    @n6.d
    public static final <K, V> Map<K, List<V>> zf(@n6.d float[] fArr, @n6.d t4.l<? super Float, ? extends K> lVar, @n6.d t4.l<? super Float, ? extends V> lVar2) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "keySelector");
        u4.l0.p(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (float f7 : fArr) {
            K O = lVar.O(Float.valueOf(f7));
            List<V> list = linkedHashMap.get(O);
            if (list == null) {
                list = new ArrayList<>();
                linkedHashMap.put(O, list);
            }
            list.add(lVar2.O(Float.valueOf(f7)));
        }
        return linkedHashMap;
    }

    public static final int zg(@n6.d int[] iArr, @n6.d t4.l<? super Integer, Boolean> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (lVar.O(Integer.valueOf(iArr[length])).booleanValue()) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }

    @n6.d
    public static final String zh(@n6.d double[] dArr, @n6.d CharSequence charSequence, @n6.d CharSequence charSequence2, @n6.d CharSequence charSequence3, int i7, @n6.d CharSequence charSequence4, @n6.e t4.l<? super Double, ? extends CharSequence> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(charSequence, "separator");
        u4.l0.p(charSequence2, "prefix");
        u4.l0.p(charSequence3, "postfix");
        u4.l0.p(charSequence4, "truncated");
        String sb = ((StringBuilder) hh(dArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i7, charSequence4, lVar)).toString();
        u4.l0.o(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @n6.e
    public static final Float zi(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        int length = fArr.length - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i7 = length - 1;
            float f7 = fArr[length];
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                return Float.valueOf(f7);
            }
            if (i7 < 0) {
                return null;
            }
            length = i7;
        }
    }

    @v3.g1(version = "1.4")
    @n6.e
    public static final <R extends Comparable<? super R>> Double zj(@n6.d double[] dArr, @n6.d t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        int Te = Te(dArr);
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

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final Double zk(char[] cArr, t4.l<? super Character, Double> lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (cArr.length == 0) {
            return null;
        }
        double doubleValue = lVar.O(Character.valueOf(cArr[0])).doubleValue();
        s0 it = new d5.l(1, Se(cArr)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.O(Character.valueOf(cArr[it.b()])).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @s4.h(name = "maxOrThrow")
    @v3.g1(version = "1.7")
    public static final long zl(@n6.d long[] jArr) {
        u4.l0.p(jArr, "<this>");
        if (jArr.length == 0) {
            throw new NoSuchElementException();
        }
        long j7 = jArr[0];
        s0 it = new d5.l(1, We(jArr)).iterator();
        while (it.hasNext()) {
            long j8 = jArr[it.b()];
            if (j7 < j8) {
                j7 = j8;
            }
        }
        return j7;
    }

    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final float zm(int[] iArr, t4.l<? super Integer, Float> lVar) {
        u4.l0.p(iArr, "<this>");
        u4.l0.p(lVar, "selector");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        float floatValue = lVar.O(Integer.valueOf(iArr[0])).floatValue();
        s0 it = new d5.l(1, Ve(iArr)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.O(Integer.valueOf(iArr[it.b()])).floatValue());
        }
        return floatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <R> R zn(double[] dArr, Comparator<? super R> comparator, t4.l<? super Double, ? extends R> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(comparator, "comparator");
        u4.l0.p(lVar, "selector");
        if (dArr.length == 0) {
            return null;
        }
        Object obj = (R) lVar.O(Double.valueOf(dArr[0]));
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            R O = lVar.O(Double.valueOf(dArr[it.b()]));
            if (comparator.compare(obj, O) > 0) {
                obj = O;
            }
        }
        return (R) obj;
    }

    public static final boolean zo(@n6.d float[] fArr, @n6.d t4.l<? super Float, Boolean> lVar) {
        u4.l0.p(fArr, "<this>");
        u4.l0.p(lVar, "predicate");
        for (float f7 : fArr) {
            if (lVar.O(Float.valueOf(f7)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @v3.g1(version = "1.3")
    @k4.f
    public static final short zp(short[] sArr) {
        u4.l0.p(sArr, "<this>");
        return Ap(sArr, b5.f.f7260k);
    }

    @v3.g1(version = "1.4")
    @n6.e
    @q2(markerClass = {v3.r.class})
    public static final Double zq(@n6.d double[] dArr, @n6.d t4.p<? super Double, ? super Double, Double> pVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (dArr.length == 0) {
            return null;
        }
        double d7 = dArr[0];
        s0 it = new d5.l(1, Te(dArr)).iterator();
        while (it.hasNext()) {
            d7 = pVar.J(Double.valueOf(d7), Double.valueOf(dArr[it.b()])).doubleValue();
        }
        return Double.valueOf(d7);
    }

    @v3.g1(version = "1.4")
    public static final void zr(@n6.d int[] iArr, int i7, int i8) {
        u4.l0.p(iArr, "<this>");
        x3.c.f18278k.d(i7, i8, iArr.length);
        int i9 = (i7 + i8) / 2;
        if (i7 == i9) {
            return;
        }
        int i10 = i8 - 1;
        while (i7 < i9) {
            int i11 = iArr[i7];
            iArr[i7] = iArr[i10];
            iArr[i10] = i11;
            i10--;
            i7++;
        }
    }

    @v3.g1(version = "1.4")
    @k4.f
    public static final List<Short> zs(short[] sArr, t4.p<? super Short, ? super Short, Short> pVar) {
        u4.l0.p(sArr, "<this>");
        u4.l0.p(pVar, "operation");
        if (sArr.length == 0) {
            return x3.w.E();
        }
        short s6 = sArr[0];
        ArrayList arrayList = new ArrayList(sArr.length);
        arrayList.add(Short.valueOf(s6));
        int length = sArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            s6 = pVar.J(Short.valueOf(s6), Short.valueOf(sArr[i7])).shortValue();
            arrayList.add(Short.valueOf(s6));
        }
        return arrayList;
    }

    public static final double zt(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            if (length == 1) {
                return dArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    @n6.d
    public static final char[] zu(@n6.d char[] cArr, @n6.d d5.l lVar) {
        u4.l0.p(cArr, "<this>");
        u4.l0.p(lVar, "indices");
        return lVar.isEmpty() ? new char[0] : x3.o.H1(cArr, lVar.b().intValue(), lVar.g().intValue() + 1);
    }

    @n6.d
    public static final double[] zv(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        if (dArr.length == 0) {
            return dArr;
        }
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        u4.l0.o(copyOf, "copyOf(this, size)");
        Vu(copyOf);
        return copyOf;
    }

    public static final float zw(@n6.d float[] fArr) {
        u4.l0.p(fArr, "<this>");
        float f7 = 0.0f;
        for (float f8 : fArr) {
            f7 += f8;
        }
        return f7;
    }

    @s4.h(name = "sumOfLong")
    @v3.g1(version = "1.4")
    @v3.t0
    @k4.f
    public static final <T> long zx(T[] tArr, t4.l<? super T, Long> lVar) {
        u4.l0.p(tArr, "<this>");
        u4.l0.p(lVar, "selector");
        long j7 = 0;
        for (T t6 : tArr) {
            j7 += lVar.O(t6).longValue();
        }
        return j7;
    }

    @n6.d
    public static final List<Double> zy(@n6.d double[] dArr, @n6.d t4.l<? super Double, Boolean> lVar) {
        u4.l0.p(dArr, "<this>");
        u4.l0.p(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (double d7 : dArr) {
            if (!lVar.O(Double.valueOf(d7)).booleanValue()) {
                break;
            }
            arrayList.add(Double.valueOf(d7));
        }
        return arrayList;
    }

    @n6.d
    public static final Set<Double> zz(@n6.d double[] dArr) {
        u4.l0.p(dArr, "<this>");
        return (Set) Ly(dArr, new LinkedHashSet(z0.j(dArr.length)));
    }
}
