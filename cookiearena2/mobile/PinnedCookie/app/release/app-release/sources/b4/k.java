package b4;

import java.util.Comparator;
import u4.l0;
/* loaded from: classes.dex */
public final class k implements Comparator<Comparable<? super Object>> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final k f7250a = new k();

    @Override // java.util.Comparator
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public int compare(@n6.d Comparable<Object> comparable, @n6.d Comparable<Object> comparable2) {
        l0.p(comparable, "a");
        l0.p(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    @n6.d
    public final Comparator<Comparable<? super Object>> reversed() {
        return j.f7249a;
    }
}
