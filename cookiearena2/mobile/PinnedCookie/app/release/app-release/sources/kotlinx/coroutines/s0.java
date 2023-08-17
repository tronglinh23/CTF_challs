package kotlinx.coroutines;

import e4.g;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class s0 extends e4.a implements s3<String> {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final a f12944m = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public final long f12945l;

    /* loaded from: classes.dex */
    public static final class a implements g.c<s0> {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        public a() {
        }
    }

    public s0(long j7) {
        super(f12944m);
        this.f12945l = j7;
    }

    public static /* synthetic */ s0 X0(s0 s0Var, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = s0Var.f12945l;
        }
        return s0Var.W0(j7);
    }

    public final long V0() {
        return this.f12945l;
    }

    @n6.d
    public final s0 W0(long j7) {
        return new s0(j7);
    }

    public final long Y0() {
        return this.f12945l;
    }

    @Override // kotlinx.coroutines.s3
    /* renamed from: Z0  reason: merged with bridge method [inline-methods] */
    public void E(@n6.d e4.g gVar, @n6.d String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.s3
    @n6.d
    /* renamed from: a1  reason: merged with bridge method [inline-methods] */
    public String C(@n6.d e4.g gVar) {
        String str;
        t0 t0Var = (t0) gVar.e(t0.f13111m);
        if (t0Var == null || (str = t0Var.Y0()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int G3 = i5.c0.G3(name, n0.f12914a, 0, false, 6, null);
        if (G3 < 0) {
            G3 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + G3 + 10);
        String substring = name.substring(0, G3);
        u4.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(n0.f12914a);
        sb.append(str);
        sb.append('#');
        sb.append(this.f12945l);
        String sb2 = sb.toString();
        u4.l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && this.f12945l == ((s0) obj).f12945l;
    }

    public int hashCode() {
        return Long.hashCode(this.f12945l);
    }

    @n6.d
    public String toString() {
        return "CoroutineId(" + this.f12945l + ')';
    }
}
