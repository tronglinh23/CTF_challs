package l0;

import d.b1;
import d.m1;
import java.util.ArrayList;
import java.util.List;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class u<T> {

    @b1({b1.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class a extends u<Void> {
        @Override // l0.u
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public Void a(List<r> list) {
            return null;
        }

        @Override // l0.u
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // l0.u
        /* renamed from: g  reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    @d.d
    public abstract T a(List<r> list);

    @m1
    public List<r> b() throws Exception {
        return new ArrayList();
    }

    @d.d
    public abstract T c();

    @d.d
    public abstract T d(List<String> list);
}