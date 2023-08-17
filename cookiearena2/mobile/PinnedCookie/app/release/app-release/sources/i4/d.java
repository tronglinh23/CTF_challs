package i4;

import java.io.Serializable;
import java.lang.Enum;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class d<E extends Enum<E>> implements Serializable {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final a f11015l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final long f11016m = 0;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final Class<E> f11017k;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public a() {
        }
    }

    public d(@n6.d E[] eArr) {
        l0.p(eArr, "entries");
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        l0.m(cls);
        this.f11017k = cls;
    }

    public final Object a() {
        E[] enumConstants = this.f11017k.getEnumConstants();
        l0.o(enumConstants, "c.enumConstants");
        return b.b(enumConstants);
    }
}
