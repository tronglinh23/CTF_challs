package a1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import d.b1;
import d.g0;
import d.l1;
import d.o0;
import d.q0;
import d.w0;
import g1.s;
import i6.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;
import m0.i;
import p0.j1;
import p0.n2;
/* loaded from: classes.dex */
public class h {
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final String f100a = "font_results";
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f101b = -1;
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f102c = -2;

    /* loaded from: classes.dex */
    public static final class a implements BaseColumns {

        /* renamed from: a  reason: collision with root package name */
        public static final String f103a = "file_id";

        /* renamed from: b  reason: collision with root package name */
        public static final String f104b = "font_ttc_index";

        /* renamed from: c  reason: collision with root package name */
        public static final String f105c = "font_variation_settings";

        /* renamed from: d  reason: collision with root package name */
        public static final String f106d = "font_weight";

        /* renamed from: e  reason: collision with root package name */
        public static final String f107e = "font_italic";

        /* renamed from: f  reason: collision with root package name */
        public static final String f108f = "result_code";

        /* renamed from: g  reason: collision with root package name */
        public static final int f109g = 0;

        /* renamed from: h  reason: collision with root package name */
        public static final int f110h = 1;

        /* renamed from: i  reason: collision with root package name */
        public static final int f111i = 2;

        /* renamed from: j  reason: collision with root package name */
        public static final int f112j = 3;
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f113c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f114d = 1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f115e = 2;

        /* renamed from: a  reason: collision with root package name */
        public final int f116a;

        /* renamed from: b  reason: collision with root package name */
        public final c[] f117b;

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public b(int i7, @q0 c[] cVarArr) {
            this.f116a = i7;
            this.f117b = cVarArr;
        }

        public static b a(int i7, @q0 c[] cVarArr) {
            return new b(i7, cVarArr);
        }

        public c[] b() {
            return this.f117b;
        }

        public int c() {
            return this.f116a;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f118a;

        /* renamed from: b  reason: collision with root package name */
        public final int f119b;

        /* renamed from: c  reason: collision with root package name */
        public final int f120c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f121d;

        /* renamed from: e  reason: collision with root package name */
        public final int f122e;

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public c(@o0 Uri uri, @g0(from = 0) int i7, @g0(from = 1, to = 1000) int i8, boolean z6, int i9) {
            this.f118a = (Uri) s.l(uri);
            this.f119b = i7;
            this.f120c = i8;
            this.f121d = z6;
            this.f122e = i9;
        }

        public static c a(@o0 Uri uri, @g0(from = 0) int i7, @g0(from = 1, to = 1000) int i8, boolean z6, int i9) {
            return new c(uri, i7, i8, z6, i9);
        }

        public int b() {
            return this.f122e;
        }

        @g0(from = 0)
        public int c() {
            return this.f119b;
        }

        @o0
        public Uri d() {
            return this.f118a;
        }

        @g0(from = p.f11250n, to = 1000)
        public int e() {
            return this.f120c;
        }

        public boolean f() {
            return this.f121d;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public static final int f123a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f124b = 0;

        /* renamed from: c  reason: collision with root package name */
        public static final int f125c = -1;

        /* renamed from: d  reason: collision with root package name */
        public static final int f126d = -2;

        /* renamed from: e  reason: collision with root package name */
        public static final int f127e = -3;

        /* renamed from: f  reason: collision with root package name */
        public static final int f128f = -4;

        /* renamed from: g  reason: collision with root package name */
        public static final int f129g = 1;

        /* renamed from: h  reason: collision with root package name */
        public static final int f130h = 2;

        /* renamed from: i  reason: collision with root package name */
        public static final int f131i = 3;

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        public void a(int i7) {
        }

        public void b(Typeface typeface) {
        }
    }

    @q0
    public static Typeface a(@o0 Context context, @q0 CancellationSignal cancellationSignal, @o0 c[] cVarArr) {
        return j1.d(context, cancellationSignal, cVarArr, 0);
    }

    @o0
    public static b b(@o0 Context context, @q0 CancellationSignal cancellationSignal, @o0 f fVar) throws PackageManager.NameNotFoundException {
        return e.e(context, fVar, cancellationSignal);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static Typeface c(Context context, f fVar, @q0 i.g gVar, @q0 Handler handler, boolean z6, int i7, int i8) {
        return f(context, fVar, i8, z6, i7, i.g.getHandler(handler), new j1.a(gVar));
    }

    @Deprecated
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    @l1
    public static ProviderInfo d(@o0 PackageManager packageManager, @o0 f fVar, @q0 Resources resources) throws PackageManager.NameNotFoundException {
        return e.f(packageManager, fVar, resources);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @w0(19)
    @Deprecated
    public static Map<Uri, ByteBuffer> e(Context context, c[] cVarArr, CancellationSignal cancellationSignal) {
        return n2.h(context, cVarArr, cancellationSignal);
    }

    @b1({b1.a.LIBRARY})
    @q0
    public static Typeface f(@o0 Context context, @o0 f fVar, int i7, boolean z6, @g0(from = 0) int i8, @o0 Handler handler, @o0 d dVar) {
        a1.a aVar = new a1.a(dVar, handler);
        return z6 ? g.e(context, fVar, aVar, i7, i8) : g.d(context, fVar, i7, null, aVar);
    }

    public static void g(@o0 Context context, @o0 f fVar, @o0 d dVar, @o0 Handler handler) {
        a1.a aVar = new a1.a(dVar);
        g.d(context.getApplicationContext(), fVar, 0, i.b(handler), aVar);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static void h() {
        g.f();
    }

    @b1({b1.a.TESTS})
    @l1
    public static void i() {
        g.f();
    }
}
