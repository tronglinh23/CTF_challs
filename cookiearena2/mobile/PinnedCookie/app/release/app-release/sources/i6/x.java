package i6;

import i0.x2;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import v3.b1;
import v3.m2;
/* loaded from: classes.dex */
public final class x extends s {

    /* renamed from: n  reason: collision with root package name */
    public static final a f11296n = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public final MessageDigest f11297l;

    /* renamed from: m  reason: collision with root package name */
    public final Mac f11298m;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        @s4.m
        public final x a(@n6.d o0 o0Var, @n6.d p pVar) {
            u4.l0.p(o0Var, "source");
            u4.l0.p(pVar, x2.f10960j);
            return new x(o0Var, pVar, "HmacSHA1");
        }

        @n6.d
        @s4.m
        public final x b(@n6.d o0 o0Var, @n6.d p pVar) {
            u4.l0.p(o0Var, "source");
            u4.l0.p(pVar, x2.f10960j);
            return new x(o0Var, pVar, "HmacSHA256");
        }

        @n6.d
        @s4.m
        public final x c(@n6.d o0 o0Var, @n6.d p pVar) {
            u4.l0.p(o0Var, "source");
            u4.l0.p(pVar, x2.f10960j);
            return new x(o0Var, pVar, "HmacSHA512");
        }

        @n6.d
        @s4.m
        public final x d(@n6.d o0 o0Var) {
            u4.l0.p(o0Var, "source");
            return new x(o0Var, "MD5");
        }

        @n6.d
        @s4.m
        public final x e(@n6.d o0 o0Var) {
            u4.l0.p(o0Var, "source");
            return new x(o0Var, "SHA-1");
        }

        @n6.d
        @s4.m
        public final x f(@n6.d o0 o0Var) {
            u4.l0.p(o0Var, "source");
            return new x(o0Var, "SHA-256");
        }

        @n6.d
        @s4.m
        public final x g(@n6.d o0 o0Var) {
            u4.l0.p(o0Var, "source");
            return new x(o0Var, "SHA-512");
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@n6.d o0 o0Var, @n6.d String str) {
        super(o0Var);
        u4.l0.p(o0Var, "source");
        u4.l0.p(str, "algorithm");
        this.f11297l = MessageDigest.getInstance(str);
        this.f11298m = null;
    }

    @n6.d
    @s4.m
    public static final x f(@n6.d o0 o0Var, @n6.d p pVar) {
        return f11296n.a(o0Var, pVar);
    }

    @n6.d
    @s4.m
    public static final x h(@n6.d o0 o0Var, @n6.d p pVar) {
        return f11296n.b(o0Var, pVar);
    }

    @n6.d
    @s4.m
    public static final x i(@n6.d o0 o0Var, @n6.d p pVar) {
        return f11296n.c(o0Var, pVar);
    }

    @n6.d
    @s4.m
    public static final x k(@n6.d o0 o0Var) {
        return f11296n.d(o0Var);
    }

    @n6.d
    @s4.m
    public static final x l(@n6.d o0 o0Var) {
        return f11296n.e(o0Var);
    }

    @n6.d
    @s4.m
    public static final x m(@n6.d o0 o0Var) {
        return f11296n.f(o0Var);
    }

    @n6.d
    @s4.m
    public static final x p(@n6.d o0 o0Var) {
        return f11296n.g(o0Var);
    }

    @s4.h(name = "-deprecated_hash")
    @n6.d
    @v3.k(level = v3.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "hash", imports = {}))
    public final p d() {
        return e();
    }

    @s4.h(name = "hash")
    @n6.d
    public final p e() {
        byte[] doFinal;
        MessageDigest messageDigest = this.f11297l;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.f11298m;
            u4.l0.m(mac);
            doFinal = mac.doFinal();
        }
        u4.l0.o(doFinal, "result");
        return new p(doFinal);
    }

    @Override // i6.s, i6.o0
    public long l0(@n6.d m mVar, long j7) throws IOException {
        u4.l0.p(mVar, "sink");
        long l02 = super.l0(mVar, j7);
        if (l02 != -1) {
            long a12 = mVar.a1() - l02;
            long a13 = mVar.a1();
            j0 j0Var = mVar.f11238k;
            u4.l0.m(j0Var);
            while (a13 > a12) {
                j0Var = j0Var.f11218g;
                u4.l0.m(j0Var);
                a13 -= j0Var.f11214c - j0Var.f11213b;
            }
            while (a13 < mVar.a1()) {
                int i7 = (int) ((j0Var.f11213b + a12) - a13);
                MessageDigest messageDigest = this.f11297l;
                if (messageDigest != null) {
                    messageDigest.update(j0Var.f11212a, i7, j0Var.f11214c - i7);
                } else {
                    Mac mac = this.f11298m;
                    u4.l0.m(mac);
                    mac.update(j0Var.f11212a, i7, j0Var.f11214c - i7);
                }
                a13 += j0Var.f11214c - j0Var.f11213b;
                j0Var = j0Var.f11217f;
                u4.l0.m(j0Var);
                a12 = a13;
            }
        }
        return l02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@n6.d o0 o0Var, @n6.d p pVar, @n6.d String str) {
        super(o0Var);
        u4.l0.p(o0Var, "source");
        u4.l0.p(pVar, x2.f10960j);
        u4.l0.p(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(pVar.m0(), str));
            m2 m2Var = m2.f17815a;
            this.f11298m = mac;
            this.f11297l = null;
        } catch (InvalidKeyException e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
