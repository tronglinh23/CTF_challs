package t3;

import t4.l;
import u4.l0;
import u4.w;

/* loaded from: classes.dex */
public abstract class g<T> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final a f16838a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public static /* synthetic */ g b(a aVar, Object obj, String str, b bVar, f fVar, int i7, Object obj2) {
            if ((i7 & 2) != 0) {
                bVar = c.f16829a.a();
            }
            if ((i7 & 4) != 0) {
                fVar = t3.a.f16824a;
            }
            return aVar.a(obj, str, bVar, fVar);
        }

        @n6.d
        public final <T> g<T> a(@n6.d T t6, @n6.d String str, @n6.d b bVar, @n6.d f fVar) {
            l0.p(t6, "<this>");
            l0.p(str, "tag");
            l0.p(bVar, "verificationMode");
            l0.p(fVar, "logger");
            return new h(t6, str, bVar, fVar);
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        STRICT,
        LOG,
        QUIET
    }

    @n6.e
    public abstract T a();

    @n6.d
    public final String b(@n6.d Object obj, @n6.d String str) {
        l0.p(obj, "value");
        l0.p(str, "message");
        return str + " value: " + obj;
    }

    @n6.d
    public abstract g<T> c(@n6.d String str, @n6.d l<? super T, Boolean> lVar);
}