package v3;
/* loaded from: classes.dex */
public class f0 {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17781a;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17781a = iArr;
        }
    }

    @n6.d
    public static final <T> d0<T> a(@n6.e Object obj, @n6.d t4.a<? extends T> aVar) {
        u4.l0.p(aVar, "initializer");
        return new n1(aVar, obj);
    }

    @n6.d
    public static final <T> d0<T> b(@n6.d t4.a<? extends T> aVar) {
        u4.l0.p(aVar, "initializer");
        u4.w wVar = null;
        return new n1(aVar, wVar, 2, wVar);
    }

    @n6.d
    public static final <T> d0<T> c(@n6.d h0 h0Var, @n6.d t4.a<? extends T> aVar) {
        u4.l0.p(h0Var, "mode");
        u4.l0.p(aVar, "initializer");
        int i7 = a.f17781a[h0Var.ordinal()];
        int i8 = 2;
        if (i7 == 1) {
            u4.w wVar = null;
            return new n1(aVar, wVar, i8, wVar);
        } else if (i7 != 2) {
            if (i7 == 3) {
                return new n2(aVar);
            }
            throw new j0();
        } else {
            return new f1(aVar);
        }
    }
}
