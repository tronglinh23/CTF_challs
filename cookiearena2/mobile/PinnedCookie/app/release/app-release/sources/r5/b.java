package r5;

import java.io.IOException;
import u4.l0;
/* loaded from: classes.dex */
public interface b {
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public static final b f15703a = new a.C0228a();
    @n6.d
    @s4.e

    /* renamed from: b  reason: collision with root package name */
    public static final b f15704b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f15705c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f15706a = null;

        /* renamed from: r5.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0228a implements b {
            @Override // r5.b
            @n6.e
            public d0 a(@n6.e h0 h0Var, @n6.d f0 f0Var) {
                l0.p(f0Var, "response");
                return null;
            }
        }

        public a() {
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r5.q, u4.w] */
    static {
        ?? r12 = 0;
        f15705c = new a(r12);
        f15704b = new t5.b(r12, 1, r12);
    }

    @n6.e
    d0 a(@n6.e h0 h0Var, @n6.d f0 f0Var) throws IOException;
}
