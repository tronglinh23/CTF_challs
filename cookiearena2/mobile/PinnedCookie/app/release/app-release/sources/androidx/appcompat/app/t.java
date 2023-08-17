package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.h;
import androidx.appcompat.app.t;
import d.o0;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    public static final String f897a = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";

    /* renamed from: b  reason: collision with root package name */
    public static final String f898b = "application_locales";

    /* renamed from: c  reason: collision with root package name */
    public static final String f899c = "locales";

    /* renamed from: d  reason: collision with root package name */
    public static final String f900d = "androidx.appcompat.app.AppLocalesMetadataHolderService";

    /* renamed from: e  reason: collision with root package name */
    public static final String f901e = "AppLocalesStorageHelper";

    /* loaded from: classes.dex */
    public static class a implements Executor {

        /* renamed from: k  reason: collision with root package name */
        public final Object f902k = new Object();

        /* renamed from: l  reason: collision with root package name */
        public final Queue<Runnable> f903l = new ArrayDeque();

        /* renamed from: m  reason: collision with root package name */
        public final Executor f904m;

        /* renamed from: n  reason: collision with root package name */
        public Runnable f905n;

        public a(Executor executor) {
            this.f904m = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        public void c() {
            synchronized (this.f902k) {
                Runnable poll = this.f903l.poll();
                this.f905n = poll;
                if (poll != null) {
                    this.f904m.execute(poll);
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f902k) {
                this.f903l.add(new Runnable() { // from class: androidx.appcompat.app.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.a.this.b(runnable);
                    }
                });
                if (this.f905n == null) {
                    c();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void a(@o0 Context context, @o0 String str) {
        if (str.equals("")) {
            context.deleteFile(f897a);
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput(f897a, 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, f899c);
                    newSerializer.attribute(null, f898b, str);
                    newSerializer.endTag(null, f899c);
                    newSerializer.endDocument();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Storing App Locales : app-locales: ");
                    sb.append(str);
                    sb.append(" persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Exception e7) {
                    Log.w(f901e, "Storing App Locales : Failed to persist app-locales: " + str, e7);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w(f901e, String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", f897a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        r2 = r4.getAttributeValue(null, androidx.appcompat.app.t.f898b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r3 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        if (r2.isEmpty() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        r9 = new java.lang.StringBuilder();
        r9.append("Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ");
        r9.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        r9.deleteFile(androidx.appcompat.app.t.f897a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
        return r2;
     */
    @d.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(@d.o0 android.content.Context r9) {
        /*
            java.lang.String r0 = "AppLocalesStorageHelper"
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r1)     // Catch: java.io.FileNotFoundException -> L6f
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L41
            r7 = 3
            if (r6 != r7) goto L27
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            if (r8 <= r5) goto L41
        L27:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L2d
            goto L17
        L2d:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r0 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            r2 = r0
        L41:
            if (r3 == 0) goto L51
        L43:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L47:
            r9 = move-exception
            goto L69
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L51
            goto L43
        L51:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L65
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            r9.append(r0)
            r9.append(r2)
            goto L68
        L65:
            r9.deleteFile(r1)
        L68:
            return r2
        L69:
            if (r3 == 0) goto L6e
            r3.close()     // Catch: java.io.IOException -> L6e
        L6e:
            throw r9
        L6f:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r0, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.t.b(android.content.Context):java.lang.String");
    }

    public static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, f900d);
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (h.r().j()) {
                    String b7 = b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        h.b.b(systemService, h.a.a(b7));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
