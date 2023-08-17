package t3;

import t3.g;
import t4.l;
import u4.l0;
import v3.j0;
import x3.p;
/* loaded from: classes.dex */
public final class e<T> extends g<T> {
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final T f16831b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final String f16832c;
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final String f16833d;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public final f f16834e;
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public final g.b f16835f;
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public final j f16836g;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16837a;

        static {
            int[] iArr = new int[g.b.values().length];
            iArr[g.b.STRICT.ordinal()] = 1;
            iArr[g.b.LOG.ordinal()] = 2;
            iArr[g.b.QUIET.ordinal()] = 3;
            f16837a = iArr;
        }
    }

    public e(@n6.d T t6, @n6.d String str, @n6.d String str2, @n6.d f fVar, @n6.d g.b bVar) {
        l0.p(t6, "value");
        l0.p(str, "tag");
        l0.p(str2, "message");
        l0.p(fVar, "logger");
        l0.p(bVar, "verificationMode");
        this.f16831b = t6;
        this.f16832c = str;
        this.f16833d = str2;
        this.f16834e = fVar;
        this.f16835f = bVar;
        j jVar = new j(b(t6, str2));
        StackTraceElement[] stackTrace = jVar.getStackTrace();
        l0.o(stackTrace, "stackTrace");
        Object[] array = p.M9(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        jVar.setStackTrace((StackTraceElement[]) array);
        this.f16836g = jVar;
    }

    @Override // t3.g
    @n6.e
    public T a() {
        int i7 = a.f16837a[this.f16835f.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                this.f16834e.a(this.f16832c, b(this.f16831b, this.f16833d));
                return null;
            } else if (i7 == 3) {
                return null;
            } else {
                throw new j0();
            }
        }
        throw this.f16836g;
    }

    @Override // t3.g
    @n6.d
    public g<T> c(@n6.d String str, @n6.d l<? super T, Boolean> lVar) {
        l0.p(str, "message");
        l0.p(lVar, "condition");
        return this;
    }

    @n6.d
    public final j d() {
        return this.f16836g;
    }

    @n6.d
    public final f e() {
        return this.f16834e;
    }

    @n6.d
    public final String f() {
        return this.f16833d;
    }

    @n6.d
    public final String g() {
        return this.f16832c;
    }

    @n6.d
    public final T h() {
        return this.f16831b;
    }

    @n6.d
    public final g.b i() {
        return this.f16835f;
    }
}
