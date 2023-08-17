package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import d.b1;
import d.m1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import p.e;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4980a = "/data/misc/profiles/ref/";

    /* renamed from: b  reason: collision with root package name */
    public static final String f4981b = "/data/misc/profiles/cur/0/";

    /* renamed from: c  reason: collision with root package name */
    public static final String f4982c = "primary.prof";

    /* renamed from: d  reason: collision with root package name */
    public static final String f4983d = "profileInstalled";

    /* renamed from: g  reason: collision with root package name */
    public static final String f4986g = "ProfileVerifier";

    /* renamed from: e  reason: collision with root package name */
    public static final e<c> f4984e = e.u();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f4985f = new Object();
    @q0

    /* renamed from: h  reason: collision with root package name */
    public static c f4987h = null;

    @w0(33)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            PackageManager.PackageInfoFlags of;
            PackageInfo packageInfo;
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            return packageInfo;
        }
    }

    @b1({b1.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: e  reason: collision with root package name */
        public static final int f4988e = 1;

        /* renamed from: a  reason: collision with root package name */
        public final int f4989a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4990b;

        /* renamed from: c  reason: collision with root package name */
        public final long f4991c;

        /* renamed from: d  reason: collision with root package name */
        public final long f4992d;

        public b(int i7, int i8, long j7, long j8) {
            this.f4989a = i7;
            this.f4990b = i8;
            this.f4991c = j7;
            this.f4992d = j8;
        }

        public static b a(@o0 File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public void b(@o0 File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f4989a);
                dataOutputStream.writeInt(this.f4990b);
                dataOutputStream.writeLong(this.f4991c);
                dataOutputStream.writeLong(this.f4992d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4990b == bVar.f4990b && this.f4991c == bVar.f4991c && this.f4989a == bVar.f4989a && this.f4992d == bVar.f4992d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f4990b), Long.valueOf(this.f4991c), Integer.valueOf(this.f4989a), Long.valueOf(this.f4992d));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: d  reason: collision with root package name */
        public static final int f4993d = 16;

        /* renamed from: e  reason: collision with root package name */
        public static final int f4994e = 0;

        /* renamed from: f  reason: collision with root package name */
        public static final int f4995f = 1;

        /* renamed from: g  reason: collision with root package name */
        public static final int f4996g = 2;

        /* renamed from: h  reason: collision with root package name */
        public static final int f4997h = 3;

        /* renamed from: i  reason: collision with root package name */
        public static final int f4998i = 65536;

        /* renamed from: j  reason: collision with root package name */
        public static final int f4999j = 131072;

        /* renamed from: k  reason: collision with root package name */
        public static final int f5000k = 196608;

        /* renamed from: l  reason: collision with root package name */
        public static final int f5001l = 262144;

        /* renamed from: a  reason: collision with root package name */
        public final int f5002a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5003b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5004c;

        @b1({b1.a.LIBRARY})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface a {
        }

        public c(int i7, boolean z6, boolean z7) {
            this.f5002a = i7;
            this.f5004c = z7;
            this.f5003b = z6;
        }

        public int a() {
            return this.f5002a;
        }

        public boolean b() {
            return this.f5004c;
        }

        public boolean c() {
            return this.f5003b;
        }
    }

    @o0
    public static ListenableFuture<c> a() {
        return f4984e;
    }

    public static long b(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c c(int i7, boolean z6, boolean z7) {
        c cVar = new c(i7, z6, z7);
        f4987h = cVar;
        f4984e.p(cVar);
        return f4987h;
    }

    @m1
    @o0
    public static c d(@o0 Context context) {
        return e(context, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:78)(1:18)|19|(1:77)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cc, code lost:
        r3 = androidx.profileinstaller.d.c.f5000k;
     */
    @d.m1
    @d.b1({d.b1.a.LIBRARY})
    @d.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.d.c e(@d.o0 android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.d.e(android.content.Context, boolean):androidx.profileinstaller.d$c");
    }
}
