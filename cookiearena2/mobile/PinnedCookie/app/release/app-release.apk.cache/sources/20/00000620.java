package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.c;
import b3.e;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public static final String f4931a = "androidx.profileinstaller.action.INSTALL_PROFILE";
    @o0

    /* renamed from: b  reason: collision with root package name */
    public static final String f4932b = "androidx.profileinstaller.action.SAVE_PROFILE";
    @o0

    /* renamed from: c  reason: collision with root package name */
    public static final String f4933c = "androidx.profileinstaller.action.SKIP_FILE";
    @o0

    /* renamed from: d  reason: collision with root package name */
    public static final String f4934d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";
    @o0

    /* renamed from: e  reason: collision with root package name */
    public static final String f4935e = "EXTRA_SKIP_FILE_OPERATION";
    @o0

    /* renamed from: f  reason: collision with root package name */
    public static final String f4936f = "WRITE_SKIP_FILE";
    @o0

    /* renamed from: g  reason: collision with root package name */
    public static final String f4937g = "DELETE_SKIP_FILE";
    @o0

    /* renamed from: h  reason: collision with root package name */
    public static final String f4938h = "EXTRA_BENCHMARK_OPERATION";
    @o0

    /* renamed from: i  reason: collision with root package name */
    public static final String f4939i = "DROP_SHADER_CACHE";

    /* loaded from: classes.dex */
    public class a implements c.d {
        public a() {
        }

        @Override // androidx.profileinstaller.c.d
        public void a(int i7, @q0 Object obj) {
            c.f4960h.a(i7, obj);
        }

        @Override // androidx.profileinstaller.c.d
        public void b(int i7, @q0 Object obj) {
            c.f4960h.b(i7, obj);
            ProfileInstallReceiver.this.setResultCode(i7);
        }
    }

    public static void a(@o0 c.d dVar) {
        Process.sendSignal(Process.myPid(), 10);
        dVar.b(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@o0 Context context, @q0 Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (f4931a.equals(action)) {
            c.n(context, new e(), new a(), true);
        } else if (f4933c.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(f4935e);
                if (f4936f.equals(string)) {
                    c.o(context, new e(), new a());
                } else if (f4937g.equals(string)) {
                    c.d(context, new e(), new a());
                }
            }
        } else if (f4932b.equals(action)) {
            a(new a());
        } else if (!f4934d.equals(action) || (extras = intent.getExtras()) == null) {
        } else {
            String string2 = extras.getString(f4938h);
            a aVar = new a();
            if (f4939i.equals(string2)) {
                androidx.profileinstaller.a.b(context, aVar);
            } else {
                aVar.b(16, null);
            }
        }
    }
}