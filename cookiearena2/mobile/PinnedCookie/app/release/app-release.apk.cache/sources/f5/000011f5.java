package i5;

/* loaded from: classes.dex */
public enum a {
    UNASSIGNED(0, "Cn"),
    UPPERCASE_LETTER(1, "Lu"),
    LOWERCASE_LETTER(2, "Ll"),
    TITLECASE_LETTER(3, "Lt"),
    MODIFIER_LETTER(4, "Lm"),
    OTHER_LETTER(5, "Lo"),
    NON_SPACING_MARK(6, "Mn"),
    ENCLOSING_MARK(7, "Me"),
    COMBINING_SPACING_MARK(8, "Mc"),
    DECIMAL_DIGIT_NUMBER(9, "Nd"),
    LETTER_NUMBER(10, "Nl"),
    OTHER_NUMBER(11, "No"),
    SPACE_SEPARATOR(12, "Zs"),
    LINE_SEPARATOR(13, "Zl"),
    PARAGRAPH_SEPARATOR(14, "Zp"),
    CONTROL(15, "Cc"),
    FORMAT(16, "Cf"),
    PRIVATE_USE(18, "Co"),
    SURROGATE(19, "Cs"),
    DASH_PUNCTUATION(20, "Pd"),
    START_PUNCTUATION(21, "Ps"),
    END_PUNCTUATION(22, "Pe"),
    CONNECTOR_PUNCTUATION(23, "Pc"),
    OTHER_PUNCTUATION(24, "Po"),
    MATH_SYMBOL(25, "Sm"),
    CURRENCY_SYMBOL(26, "Sc"),
    MODIFIER_SYMBOL(27, "Sk"),
    OTHER_SYMBOL(28, "So"),
    INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
    FINAL_QUOTE_PUNCTUATION(30, "Pf");
    
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final C0129a f11018m = new C0129a(null);

    /* renamed from: k  reason: collision with root package name */
    public final int f11032k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final String f11033l;

    /* renamed from: i5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0129a {
        public /* synthetic */ C0129a(u4.w wVar) {
            this();
        }

        @n6.d
        public final a a(int i7) {
            if (new d5.l(0, 16).n(i7)) {
                return a.values()[i7];
            }
            if (new d5.l(18, 30).n(i7)) {
                return a.values()[i7 - 1];
            }
            throw new IllegalArgumentException("Category #" + i7 + " is not defined.");
        }

        public C0129a() {
        }
    }

    a(int i7, String str) {
        this.f11032k = i7;
        this.f11033l = str;
    }

    public final boolean d(char c7) {
        return Character.getType(c7) == this.f11032k;
    }

    @n6.d
    public final String e() {
        return this.f11033l;
    }

    public final int h() {
        return this.f11032k;
    }
}