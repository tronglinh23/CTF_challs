package kotlinx.coroutines.debug.internal;

import kotlinx.coroutines.internal.r0;
import u4.l0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11891a = -1640531527;

    /* renamed from: b  reason: collision with root package name */
    public static final int f11892b = 16;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final r0 f11893c = new r0("REHASH");
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public static final m f11894d = new m(null);
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final m f11895e = new m(Boolean.TRUE);

    public static final m d(Object obj) {
        return obj == null ? f11894d : l0.g(obj, Boolean.TRUE) ? f11895e : new m(obj);
    }

    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}