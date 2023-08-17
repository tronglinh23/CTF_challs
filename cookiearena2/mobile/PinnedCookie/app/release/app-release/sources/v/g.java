package v;
/* loaded from: classes.dex */
public class g {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f17605d = false;

    /* renamed from: a  reason: collision with root package name */
    public String f17606a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17607b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f17608c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17609a;

        static {
            int[] iArr = new int[b.values().length];
            f17609a = iArr;
            try {
                iArr[b.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17609a[b.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17609a[b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17609a[b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17609a[b.KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17609a[b.TOKEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public g(String str) {
        this.f17606a = str;
    }

    public static f d(String str) throws h {
        return new g(str).c();
    }

    public final c a(c cVar, int i7, b bVar, boolean z6, char[] cArr) {
        c W;
        if (f17605d) {
            System.out.println("CREATE " + bVar + " at " + cArr[i7]);
        }
        switch (a.f17609a[bVar.ordinal()]) {
            case 1:
                W = f.W(cArr);
                i7++;
                break;
            case 2:
                W = v.a.v(cArr);
                i7++;
                break;
            case 3:
                W = i.u(cArr);
                break;
            case 4:
                W = e.u(cArr);
                break;
            case 5:
                W = d.v(cArr);
                break;
            case 6:
                W = j.u(cArr);
                break;
            default:
                W = null;
                break;
        }
        if (W == null) {
            return null;
        }
        W.q(this.f17608c);
        if (z6) {
            W.r(i7);
        }
        if (cVar instanceof v.b) {
            W.o((v.b) cVar);
        }
        return W;
    }

    public final c b(int i7, char c7, c cVar, char[] cArr) throws h {
        if (c7 == '\t' || c7 == '\n' || c7 == '\r' || c7 == ' ') {
            return cVar;
        }
        if (c7 == '\"' || c7 == '\'') {
            return cVar instanceof f ? a(cVar, i7, b.KEY, true, cArr) : a(cVar, i7, b.STRING, true, cArr);
        } else if (c7 != '[') {
            if (c7 != ']') {
                if (c7 == '{') {
                    return a(cVar, i7, b.OBJECT, true, cArr);
                }
                if (c7 != '}') {
                    switch (c7) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case androidx.constraintlayout.widget.e.f2190c1 /* 57 */:
                            return a(cVar, i7, b.NUMBER, true, cArr);
                        case ',':
                        case androidx.constraintlayout.widget.e.f2192d1 /* 58 */:
                            return cVar;
                        case '/':
                            int i8 = i7 + 1;
                            if (i8 >= cArr.length || cArr[i8] != '/') {
                                return cVar;
                            }
                            this.f17607b = true;
                            return cVar;
                        default:
                            if (!(cVar instanceof v.b) || (cVar instanceof f)) {
                                return a(cVar, i7, b.KEY, true, cArr);
                            }
                            c a7 = a(cVar, i7, b.TOKEN, true, cArr);
                            j jVar = (j) a7;
                            if (jVar.y(c7, i7)) {
                                return a7;
                            }
                            throw new h("incorrect token <" + c7 + "> at line " + this.f17608c, jVar);
                    }
                }
            }
            cVar.p((long) (i7 - 1));
            c d7 = cVar.d();
            d7.p(i7);
            return d7;
        } else {
            return a(cVar, i7, b.ARRAY, true, cArr);
        }
    }

    public f c() throws h {
        char[] charArray = this.f17606a.toCharArray();
        int length = charArray.length;
        int i7 = 1;
        this.f17608c = 1;
        boolean z6 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                i8 = -1;
                break;
            }
            char c7 = charArray[i8];
            if (c7 == '{') {
                break;
            }
            if (c7 == '\n') {
                this.f17608c++;
            }
            i8++;
        }
        if (i8 != -1) {
            f W = f.W(charArray);
            W.q(this.f17608c);
            W.r(i8);
            int i9 = i8 + 1;
            f fVar = W;
            while (i9 < length) {
                char c8 = charArray[i9];
                if (c8 == '\n') {
                    this.f17608c += i7;
                }
                if (this.f17607b) {
                    if (c8 == '\n') {
                        this.f17607b = z6;
                    } else {
                        continue;
                        i9++;
                        i7 = 1;
                        z6 = false;
                    }
                }
                if (fVar == null) {
                    break;
                }
                if (fVar.l()) {
                    fVar = b(i9, c8, fVar, charArray);
                } else if (fVar instanceof f) {
                    if (c8 == '}') {
                        fVar.p((long) (i9 - 1));
                    } else {
                        fVar = b(i9, c8, fVar, charArray);
                    }
                } else if (!(fVar instanceof v.a)) {
                    boolean z7 = fVar instanceof i;
                    if (z7) {
                        long j7 = fVar.f17596l;
                        if (charArray[(int) j7] == c8) {
                            fVar.r(j7 + 1);
                            fVar.p((long) (i9 - 1));
                        }
                    } else {
                        if (fVar instanceof j) {
                            j jVar = (j) fVar;
                            if (!jVar.y(c8, i9)) {
                                throw new h("parsing incorrect token " + jVar.b() + " at line " + this.f17608c, jVar);
                            }
                        }
                        if ((fVar instanceof d) || z7) {
                            long j8 = fVar.f17596l;
                            char c9 = charArray[(int) j8];
                            if ((c9 == '\'' || c9 == '\"') && c9 == c8) {
                                fVar.r(j8 + 1);
                                fVar.p((long) (i9 - 1));
                            }
                        }
                        if (!fVar.l() && (c8 == '}' || c8 == ']' || c8 == ',' || c8 == ' ' || c8 == '\t' || c8 == '\r' || c8 == '\n' || c8 == ':')) {
                            long j9 = (long) (i9 - 1);
                            fVar.p(j9);
                            if (c8 == '}' || c8 == ']') {
                                fVar = fVar.d();
                                fVar.p(j9);
                                if (fVar instanceof d) {
                                    fVar = fVar.d();
                                    fVar.p(j9);
                                }
                            }
                        }
                    }
                } else if (c8 == ']') {
                    fVar.p((long) (i9 - 1));
                } else {
                    fVar = b(i9, c8, fVar, charArray);
                }
                if (fVar.l() && (!(fVar instanceof d) || ((d) fVar).f17592r.size() > 0)) {
                    fVar = fVar.d();
                }
                i9++;
                i7 = 1;
                z6 = false;
            }
            while (fVar != null && !fVar.l()) {
                if (fVar instanceof i) {
                    fVar.r(((int) fVar.f17596l) + 1);
                }
                fVar.p((long) (length - 1));
                fVar = fVar.d();
            }
            if (f17605d) {
                System.out.println("Root: " + W.t());
            }
            return W;
        }
        throw new h("invalid json content", null);
    }
}
