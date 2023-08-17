package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.profileinstaller.c;
import d.b1;
import d.m1;
import d.o0;
import d.q0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c {
    public static final int A = 14;
    public static final int B = 15;
    public static final int C = 16;

    /* renamed from: a */
    public static final String f4953a = "ProfileInstaller";

    /* renamed from: b */
    public static final String f4954b = "/data/misc/profiles/cur/0";

    /* renamed from: c */
    public static final String f4955c = "primary.prof";

    /* renamed from: d */
    public static final String f4956d = "dexopt/baseline.prof";

    /* renamed from: e */
    public static final String f4957e = "dexopt/baseline.profm";

    /* renamed from: f */
    public static final String f4958f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* renamed from: g */
    public static final d f4959g = new a();
    @o0

    /* renamed from: h */
    public static final d f4960h = new b();

    /* renamed from: i */
    public static final int f4961i = 1;

    /* renamed from: j */
    public static final int f4962j = 2;

    /* renamed from: k */
    public static final int f4963k = 3;

    /* renamed from: l */
    public static final int f4964l = 4;

    /* renamed from: m */
    public static final int f4965m = 5;

    /* renamed from: n */
    public static final int f4966n = 1;

    /* renamed from: o */
    public static final int f4967o = 2;

    /* renamed from: p */
    public static final int f4968p = 3;

    /* renamed from: q */
    public static final int f4969q = 4;

    /* renamed from: r */
    public static final int f4970r = 5;

    /* renamed from: s */
    public static final int f4971s = 6;

    /* renamed from: t */
    public static final int f4972t = 7;

    /* renamed from: u */
    public static final int f4973u = 8;

    /* renamed from: v */
    public static final int f4974v = 9;

    /* renamed from: w */
    public static final int f4975w = 10;

    /* renamed from: x */
    public static final int f4976x = 11;

    /* renamed from: y */
    public static final int f4977y = 12;

    /* renamed from: z */
    public static final int f4978z = 13;

    /* loaded from: classes.dex */
    public class a implements d {
        @Override // androidx.profileinstaller.c.d
        public void a(int i7, @q0 Object obj) {
        }

        @Override // androidx.profileinstaller.c.d
        public void b(int i7, @q0 Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements d {

        /* renamed from: a */
        public static final String f4979a = "ProfileInstaller";

        @Override // androidx.profileinstaller.c.d
        public void a(int i7, @q0 Object obj) {
        }

        @Override // androidx.profileinstaller.c.d
        public void b(int i7, @q0 Object obj) {
            String str;
            switch (i7) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i7 == 6 || i7 == 7 || i7 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            }
        }
    }

    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.profileinstaller.c$c */
    /* loaded from: classes.dex */
    public @interface InterfaceC0060c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(int i7, @q0 Object obj);

        void b(int i7, @q0 Object obj);
    }

    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    public static /* synthetic */ void a(d dVar, int i7, Object obj) {
        dVar.a(i7, obj);
    }

    public static /* synthetic */ void b(d dVar, int i7, Object obj) {
        dVar.b(i7, obj);
    }

    @b1({b1.a.LIBRARY})
    public static boolean c(@o0 File file) {
        return new File(file, f4958f).delete();
    }

    @m1
    public static void d(@o0 Context context, @o0 Executor executor, @o0 d dVar) {
        c(context.getFilesDir());
        j(executor, dVar, 11, null);
    }

    public static void e(@o0 Executor executor, @o0 final d dVar, final int i7, @q0 final Object obj) {
        executor.execute(new Runnable() { // from class: b3.g
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.a(c.d.this, i7, obj);
            }
        });
    }

    @m1
    @b1({b1.a.LIBRARY})
    public static boolean f(PackageInfo packageInfo, File file, d dVar) {
        File file2 = new File(file, f4958f);
        if (file2.exists()) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z6 = readLong == packageInfo.lastUpdateTime;
                if (z6) {
                    dVar.b(2, null);
                }
                return z6;
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    @b1({b1.a.LIBRARY})
    public static void i(@o0 PackageInfo packageInfo, @o0 File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f4958f)));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static void j(@o0 Executor executor, @o0 final d dVar, final int i7, @q0 final Object obj) {
        executor.execute(new Runnable() { // from class: b3.f
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.b(c.d.this, i7, obj);
            }
        });
    }

    public static boolean k(@o0 AssetManager assetManager, @o0 String str, @o0 PackageInfo packageInfo, @o0 File file, @o0 String str2, @o0 Executor executor, @o0 d dVar) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, dVar, str2, f4956d, f4957e, new File(new File(f4954b, str), "primary.prof"));
        if (bVar.e()) {
            boolean n7 = bVar.i().m().n();
            if (n7) {
                i(packageInfo, file);
            }
            return n7;
        }
        return false;
    }

    @m1
    public static void l(@o0 Context context) {
        m(context, new b3.e(), f4959g);
    }

    @m1
    public static void m(@o0 Context context, @o0 Executor executor, @o0 d dVar) {
        n(context, executor, dVar, false);
    }

    @m1
    public static void n(@o0 Context context, @o0 Executor executor, @o0 d dVar, boolean z6) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z7 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z6 && f(packageInfo, filesDir, dVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Skipping profile installation for ");
                sb.append(context.getPackageName());
                androidx.profileinstaller.d.e(context, false);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Installing profile for ");
            sb2.append(context.getPackageName());
            if (k(assets, packageName, packageInfo, filesDir, name, executor, dVar) && z6) {
                z7 = true;
            }
            androidx.profileinstaller.d.e(context, z7);
        } catch (PackageManager.NameNotFoundException e7) {
            dVar.b(7, e7);
            androidx.profileinstaller.d.e(context, false);
        }
    }

    @m1
    public static void o(@o0 Context context, @o0 Executor executor, @o0 d dVar) {
        try {
            i(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            j(executor, dVar, 10, null);
        } catch (PackageManager.NameNotFoundException e7) {
            j(executor, dVar, 7, e7);
        }
    }
}