package b4;

import java.util.Comparator;
import u4.l0;

/* loaded from: classes.dex */
public final class j implements Comparator<Comparable<? super Object>> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final j f7249a = new j();

    @Override // java.util.Comparator
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public int compare(@n6.d Comparable<Object> comparable, @n6.d Comparable<Object> comparable2) {
        l0.p(comparable, "a");
        l0.p(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    @n6.d
    public final Comparator<Comparable<? super Object>> reversed() {
        return k.f7250a;
    }
}