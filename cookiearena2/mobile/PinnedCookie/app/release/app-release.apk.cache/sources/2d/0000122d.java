package i5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum m uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: m  reason: collision with root package name */
    public static final q f11148m;

    /* renamed from: n  reason: collision with root package name */
    public static final q f11149n;

    /* renamed from: o  reason: collision with root package name */
    public static final q f11150o;

    /* renamed from: p  reason: collision with root package name */
    public static final q f11151p;

    /* renamed from: q  reason: collision with root package name */
    public static final q f11152q;

    /* renamed from: r  reason: collision with root package name */
    public static final q f11153r;

    /* renamed from: s  reason: collision with root package name */
    public static final q f11154s;

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ q[] f11155t = d();

    /* renamed from: k  reason: collision with root package name */
    public final int f11156k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11157l;

    static {
        int i7 = 2;
        f11148m = new q("IGNORE_CASE", 0, i7, 0, 2, null);
        int i8 = 0;
        int i9 = 2;
        u4.w wVar = null;
        f11149n = new q("MULTILINE", 1, 8, i8, i9, wVar);
        int i10 = 0;
        int i11 = 2;
        u4.w wVar2 = null;
        f11150o = new q("LITERAL", i7, 16, i10, i11, wVar2);
        f11151p = new q("UNIX_LINES", 3, 1, i8, i9, wVar);
        f11152q = new q("COMMENTS", 4, 4, i10, i11, wVar2);
        f11153r = new q("DOT_MATCHES_ALL", 5, 32, i8, i9, wVar);
        f11154s = new q("CANON_EQ", 6, 128, i10, i11, wVar2);
    }

    public q(String str, int i7, int i8, int i9) {
        this.f11156k = i8;
        this.f11157l = i9;
    }

    public static final /* synthetic */ q[] d() {
        return new q[]{f11148m, f11149n, f11150o, f11151p, f11152q, f11153r, f11154s};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f11155t.clone();
    }

    @Override // i5.i
    public int c() {
        return this.f11157l;
    }

    @Override // i5.i
    public int getValue() {
        return this.f11156k;
    }

    public /* synthetic */ q(String str, int i7, int i8, int i9, int i10, u4.w wVar) {
        this(str, i7, i8, (i10 & 2) != 0 ? i8 : i9);
    }
}