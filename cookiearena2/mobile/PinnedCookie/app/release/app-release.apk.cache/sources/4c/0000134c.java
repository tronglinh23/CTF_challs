package k2;

import i0.x2;
import java.util.LinkedHashMap;
import java.util.Map;
import u4.l0;

/* loaded from: classes.dex */
public abstract class a {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final Map<b<?>, Object> f11625a = new LinkedHashMap();

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0139a extends a {
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final C0139a f11626b = new C0139a();

        @Override // k2.a
        @n6.e
        public <T> T a(@n6.d b<T> bVar) {
            l0.p(bVar, x2.f10960j);
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
    }

    @n6.e
    public abstract <T> T a(@n6.d b<T> bVar);

    @n6.d
    public final Map<b<?>, Object> b() {
        return this.f11625a;
    }
}