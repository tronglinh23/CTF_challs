package s0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import d.a1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import z0.j;

@Deprecated
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16189a;

    /* renamed from: s0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0237a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f16190a;

        public C0237a(c cVar) {
            this.f16190a = cVar;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i7, CharSequence charSequence) {
            this.f16190a.a(i7, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f16190a.b();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i7, CharSequence charSequence) {
            this.f16190a.c(i7, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f16190a.d(new d(a.f(b.b(authenticationResult))));
        }
    }

    @w0(23)
    /* loaded from: classes.dex */
    public static class b {
        @a1("android.permission.USE_FINGERPRINT")
        @u
        public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i7, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i7, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @u
        public static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @u
        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @a1("android.permission.USE_FINGERPRINT")
        @u
        public static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @a1("android.permission.USE_FINGERPRINT")
        @u
        public static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @u
        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        @u
        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public void a(int i7, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i7, CharSequence charSequence) {
        }

        public void d(d dVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final e f16191a;

        public d(e eVar) {
            this.f16191a = eVar;
        }

        public e a() {
            return this.f16191a;
        }
    }

    public a(Context context) {
        this.f16189a = context;
    }

    @o0
    public static a b(@o0 Context context) {
        return new a(context);
    }

    @q0
    @w0(23)
    public static FingerprintManager c(@o0 Context context) {
        return b.c(context);
    }

    @w0(23)
    public static e f(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    @w0(23)
    public static FingerprintManager.AuthenticationCallback g(c cVar) {
        return new C0237a(cVar);
    }

    @w0(23)
    public static FingerprintManager.CryptoObject h(e eVar) {
        return b.g(eVar);
    }

    @a1("android.permission.USE_FINGERPRINT")
    public void a(@q0 e eVar, int i7, @q0 j jVar, @o0 c cVar, @q0 Handler handler) {
        FingerprintManager c7 = c(this.f16189a);
        if (c7 != null) {
            b.a(c7, h(eVar), jVar != null ? (CancellationSignal) jVar.b() : null, i7, g(cVar), handler);
        }
    }

    @a1("android.permission.USE_FINGERPRINT")
    public boolean d() {
        FingerprintManager c7 = c(this.f16189a);
        return c7 != null && b.d(c7);
    }

    @a1("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager c7 = c(this.f16189a);
        return c7 != null && b.e(c7);
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final Signature f16192a;

        /* renamed from: b  reason: collision with root package name */
        public final Cipher f16193b;

        /* renamed from: c  reason: collision with root package name */
        public final Mac f16194c;

        public e(@o0 Signature signature) {
            this.f16192a = signature;
            this.f16193b = null;
            this.f16194c = null;
        }

        @q0
        public Cipher a() {
            return this.f16193b;
        }

        @q0
        public Mac b() {
            return this.f16194c;
        }

        @q0
        public Signature c() {
            return this.f16192a;
        }

        public e(@o0 Cipher cipher) {
            this.f16193b = cipher;
            this.f16192a = null;
            this.f16194c = null;
        }

        public e(@o0 Mac mac) {
            this.f16194c = mac;
            this.f16193b = null;
            this.f16192a = null;
        }
    }
}