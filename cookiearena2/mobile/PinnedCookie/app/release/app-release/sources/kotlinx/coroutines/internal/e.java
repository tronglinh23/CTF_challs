package kotlinx.coroutines.internal;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class e extends k {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final e f12793a = new e();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final a f12794b = new a();

    /* loaded from: classes.dex */
    public static final class a extends ClassValue<t4.l<? super Throwable, ? extends Throwable>> {
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public t4.l<Throwable, Throwable> a(@n6.e Class<?> cls) {
            t4.l<Throwable, Throwable> b7;
            if (cls != null) {
                b7 = n.b(cls);
                return b7;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
        }
    }

    @Override // kotlinx.coroutines.internal.k
    @n6.d
    public t4.l<Throwable, Throwable> a(@n6.d Class<? extends Throwable> cls) {
        return (t4.l) f12794b.get(cls);
    }
}
