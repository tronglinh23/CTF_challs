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
public final class w extends r {

    /* renamed from: n  reason: collision with root package name */
    public static final a f11293n = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public final MessageDigest f11294l;

    /* renamed from: m  reason: collision with root package name */
    public final Mac f11295m;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.d
        @s4.m
        public final w a(@n6.d m0 m0Var, @n6.d p pVar) {
            u4.l0.p(m0Var, "sink");
            u4.l0.p(pVar, x2.f10960j);
            return new w(m0Var, pVar, "HmacSHA1");
        }

        @n6.d
        @s4.m
        public final w b(@n6.d m0 m0Var, @n6.d p pVar) {
            u4.l0.p(m0Var, "sink");
            u4.l0.p(pVar, x2.f10960j);
            return new w(m0Var, pVar, "HmacSHA256");
        }

        @n6.d
        @s4.m
        public final w c(@n6.d m0 m0Var, @n6.d p pVar) {
            u4.l0.p(m0Var, "sink");
            u4.l0.p(pVar, x2.f10960j);
            return new w(m0Var, pVar, "HmacSHA512");
        }

        @n6.d
        @s4.m
        public final w d(@n6.d m0 m0Var) {
            u4.l0.p(m0Var, "sink");
            return new w(m0Var, "MD5");
        }

        @n6.d
        @s4.m
        public final w e(@n6.d m0 m0Var) {
            u4.l0.p(m0Var, "sink");
            return new w(m0Var, "SHA-1");
        }

        @n6.d
        @s4.m
        public final w f(@n6.d m0 m0Var) {
            u4.l0.p(m0Var, "sink");
            return new w(m0Var, "SHA-256");
        }

        @n6.d
        @s4.m
        public final w g(@n6.d m0 m0Var) {
            u4.l0.p(m0Var, "sink");
            return new w(m0Var, "SHA-512");
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@n6.d m0 m0Var, @n6.d String str) {
        super(m0Var);
        u4.l0.p(m0Var, "sink");
        u4.l0.p(str, "algorithm");
        this.f11294l = MessageDigest.getInstance(str);
        this.f11295m = null;
    }

    @n6.d
    @s4.m
    public static final w f(@n6.d m0 m0Var, @n6.d p pVar) {
        return f11293n.a(m0Var, pVar);
    }

    @n6.d
    @s4.m
    public static final w h(@n6.d m0 m0Var, @n6.d p pVar) {
        return f11293n.b(m0Var, pVar);
    }

    @n6.d
    @s4.m
    public static final w i(@n6.d m0 m0Var, @n6.d p pVar) {
        return f11293n.c(m0Var, pVar);
    }

    @n6.d
    @s4.m
    public static final w k(@n6.d m0 m0Var) {
        return f11293n.d(m0Var);
    }

    @n6.d
    @s4.m
    public static final w l(@n6.d m0 m0Var) {
        return f11293n.e(m0Var);
    }

    @n6.d
    @s4.m
    public static final w m(@n6.d m0 m0Var) {
        return f11293n.f(m0Var);
    }

    @n6.d
    @s4.m
    public static final w p(@n6.d m0 m0Var) {
        return f11293n.g(m0Var);
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
        MessageDigest messageDigest = this.f11294l;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.f11295m;
            u4.l0.m(mac);
            doFinal = mac.doFinal();
        }
        u4.l0.o(doFinal, "result");
        return new p(doFinal);
    }

    @Override // i6.r, i6.m0
    public void w(@n6.d m mVar, long j7) throws IOException {
        u4.l0.p(mVar, "source");
        j.e(mVar.a1(), 0L, j7);
        j0 j0Var = mVar.f11238k;
        u4.l0.m(j0Var);
        long j8 = 0;
        while (j8 < j7) {
            int min = (int) Math.min(j7 - j8, j0Var.f11214c - j0Var.f11213b);
            MessageDigest messageDigest = this.f11294l;
            if (messageDigest != null) {
                messageDigest.update(j0Var.f11212a, j0Var.f11213b, min);
            } else {
                Mac mac = this.f11295m;
                u4.l0.m(mac);
                mac.update(j0Var.f11212a, j0Var.f11213b, min);
            }
            j8 += min;
            j0Var = j0Var.f11217f;
            u4.l0.m(j0Var);
        }
        super.w(mVar, j7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@n6.d m0 m0Var, @n6.d p pVar, @n6.d String str) {
        super(m0Var);
        u4.l0.p(m0Var, "sink");
        u4.l0.p(pVar, x2.f10960j);
        u4.l0.p(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(pVar.m0(), str));
            m2 m2Var = m2.f17815a;
            this.f11295m = mac;
            this.f11294l = null;
        } catch (InvalidKeyException e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
