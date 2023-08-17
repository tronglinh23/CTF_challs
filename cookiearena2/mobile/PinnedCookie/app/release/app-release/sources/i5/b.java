package i5;

import java.util.LinkedHashMap;
import java.util.Map;
import u4.n0;
import u4.r1;
import x3.z0;
/* loaded from: classes.dex */
public enum b {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final C0130b f11034l = new C0130b(null);
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final v3.d0<Map<Integer, b>> f11035m = v3.f0.b(a.f11050l);

    /* renamed from: k  reason: collision with root package name */
    public final int f11049k;

    @r1({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,123:1\n8811#2,2:124\n9071#2,4:126\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n*L\n118#1:124,2\n118#1:126,4\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.a<Map<Integer, ? extends b>> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f11050l = new a();

        public a() {
            super(0);
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Map<Integer, b> n() {
            b[] values = b.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(d5.u.u(z0.j(values.length), 16));
            for (b bVar : values) {
                linkedHashMap.put(Integer.valueOf(bVar.e()), bVar);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: i5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0130b {
        public /* synthetic */ C0130b(u4.w wVar) {
            this();
        }

        public final Map<Integer, b> a() {
            return (Map) b.f11035m.getValue();
        }

        @n6.d
        public final b b(int i7) {
            b bVar = a().get(Integer.valueOf(i7));
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalArgumentException("Directionality #" + i7 + " is not defined.");
        }

        public C0130b() {
        }
    }

    b(int i7) {
        this.f11049k = i7;
    }

    public final int e() {
        return this.f11049k;
    }
}
