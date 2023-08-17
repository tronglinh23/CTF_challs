package o5;

import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlinx.coroutines.debug.internal.h;
import n6.d;
import n6.e;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import s4.m;
import sun.misc.Signal;
import sun.misc.SignalHandler;
import u4.l0;
import v3.d1;
import v3.e1;
@SuppressLint({"all"})
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class b {
    @d

    /* renamed from: a  reason: collision with root package name */
    public static final b f14429a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f14430b;

    /* loaded from: classes.dex */
    public static final class a implements ClassFileTransformer {
        @d

        /* renamed from: a  reason: collision with root package name */
        public static final a f14431a = new a();

        @e
        public byte[] a(@d ClassLoader classLoader, @d String str, @e Class<?> cls, @d ProtectionDomain protectionDomain, @e byte[] bArr) {
            if (l0.g(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                kotlinx.coroutines.debug.internal.a.f11869a.b(true);
                return n4.b.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    static {
        Object b7;
        try {
            d1.a aVar = d1.f17778l;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            b7 = d1.b(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th) {
            d1.a aVar2 = d1.f17778l;
            b7 = d1.b(e1.a(th));
        }
        Boolean bool = d1.i(b7) ? null : b7;
        f14430b = bool != null ? bool.booleanValue() : h.f11923a.u();
    }

    public static final void c(Signal signal) {
        h hVar = h.f11923a;
        if (hVar.z()) {
            hVar.f(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @m
    public static final void d(@e String str, @d Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.a.f11869a.b(true);
        instrumentation.addTransformer(a.f14431a);
        h hVar = h.f11923a;
        hVar.K(f14430b);
        hVar.x();
        f14429a.b();
    }

    public final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: o5.a
                public final void a(Signal signal) {
                    b.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
