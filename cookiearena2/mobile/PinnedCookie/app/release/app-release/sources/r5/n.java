package r5;

import java.util.List;
import u4.l0;
/* loaded from: classes.dex */
public interface n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16015b = new a(null);
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public static final n f16014a = new a.C0233a();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f16016a = null;

        /* renamed from: r5.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0233a implements n {
            @Override // r5.n
            public void a(@n6.d v vVar, @n6.d List<m> list) {
                l0.p(vVar, "url");
                l0.p(list, "cookies");
            }

            @Override // r5.n
            @n6.d
            public List<m> b(@n6.d v vVar) {
                l0.p(vVar, "url");
                return x3.w.E();
            }
        }

        public a() {
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    void a(@n6.d v vVar, @n6.d List<m> list);

    @n6.d
    List<m> b(@n6.d v vVar);
}
