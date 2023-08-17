package i0;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;
@Deprecated
/* loaded from: classes.dex */
public abstract class t extends Service {

    /* renamed from: i  reason: collision with root package name */
    public static final String f10895i = "JobIntentService";

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f10896j = false;

    /* renamed from: k  reason: collision with root package name */
    public static final Object f10897k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<ComponentName, h> f10898l = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public b f10899b;

    /* renamed from: c  reason: collision with root package name */
    public h f10900c;

    /* renamed from: d  reason: collision with root package name */
    public a f10901d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10902e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10903f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10904g = false;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<d> f10905h = null;

    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a7 = t.this.a();
                if (a7 == null) {
                    return null;
                }
                t.this.h(a7.getIntent());
                a7.h();
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            t.this.j();
        }

        @Override // android.os.AsyncTask
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            t.this.j();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        e a();

        IBinder b();
    }

    /* loaded from: classes.dex */
    public static final class c extends h {

        /* renamed from: d  reason: collision with root package name */
        public final Context f10907d;

        /* renamed from: e  reason: collision with root package name */
        public final PowerManager.WakeLock f10908e;

        /* renamed from: f  reason: collision with root package name */
        public final PowerManager.WakeLock f10909f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10910g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10911h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.f10907d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f10908e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f10909f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // i0.t.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f10924a);
            if (this.f10907d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f10910g) {
                        this.f10910g = true;
                        if (!this.f10911h) {
                            this.f10908e.acquire(h6.e.B);
                        }
                    }
                }
            }
        }

        @Override // i0.t.h
        public void c() {
            synchronized (this) {
                if (this.f10911h) {
                    if (this.f10910g) {
                        this.f10908e.acquire(h6.e.B);
                    }
                    this.f10911h = false;
                    this.f10909f.release();
                }
            }
        }

        @Override // i0.t.h
        public void d() {
            synchronized (this) {
                if (!this.f10911h) {
                    this.f10911h = true;
                    this.f10909f.acquire(600000L);
                    this.f10908e.release();
                }
            }
        }

        @Override // i0.t.h
        public void e() {
            synchronized (this) {
                this.f10910g = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f10912a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10913b;

        public d(Intent intent, int i7) {
            this.f10912a = intent;
            this.f10913b = i7;
        }

        @Override // i0.t.e
        public Intent getIntent() {
            return this.f10912a;
        }

        @Override // i0.t.e
        public void h() {
            t.this.stopSelf(this.f10913b);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Intent getIntent();

        void h();
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static final class f extends JobServiceEngine implements b {

        /* renamed from: d  reason: collision with root package name */
        public static final String f10915d = "JobServiceEngineImpl";

        /* renamed from: e  reason: collision with root package name */
        public static final boolean f10916e = false;

        /* renamed from: a  reason: collision with root package name */
        public final t f10917a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f10918b;

        /* renamed from: c  reason: collision with root package name */
        public JobParameters f10919c;

        /* loaded from: classes.dex */
        public final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            public final JobWorkItem f10920a;

            public a(JobWorkItem jobWorkItem) {
                this.f10920a = jobWorkItem;
            }

            @Override // i0.t.e
            public Intent getIntent() {
                return this.f10920a.getIntent();
            }

            @Override // i0.t.e
            public void h() {
                synchronized (f.this.f10918b) {
                    JobParameters jobParameters = f.this.f10919c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f10920a);
                    }
                }
            }
        }

        public f(t tVar) {
            super(tVar);
            this.f10918b = new Object();
            this.f10917a = tVar;
        }

        @Override // i0.t.b
        public e a() {
            synchronized (this.f10918b) {
                JobParameters jobParameters = this.f10919c;
                if (jobParameters == null) {
                    return null;
                }
                JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork != null) {
                    dequeueWork.getIntent().setExtrasClassLoader(this.f10917a.getClassLoader());
                    return new a(dequeueWork);
                }
                return null;
            }
        }

        @Override // i0.t.b
        public IBinder b() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f10919c = jobParameters;
            this.f10917a.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean b7 = this.f10917a.b();
            synchronized (this.f10918b) {
                this.f10919c = null;
            }
            return b7;
        }
    }

    @d.w0(26)
    /* loaded from: classes.dex */
    public static final class g extends h {

        /* renamed from: d  reason: collision with root package name */
        public final JobInfo f10922d;

        /* renamed from: e  reason: collision with root package name */
        public final JobScheduler f10923e;

        public g(Context context, ComponentName componentName, int i7) {
            super(componentName);
            b(i7);
            this.f10922d = new JobInfo.Builder(i7, this.f10924a).setOverrideDeadline(0L).build();
            this.f10923e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // i0.t.h
        public void a(Intent intent) {
            this.f10923e.enqueue(this.f10922d, new JobWorkItem(intent));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f10924a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10925b;

        /* renamed from: c  reason: collision with root package name */
        public int f10926c;

        public h(ComponentName componentName) {
            this.f10924a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i7) {
            if (!this.f10925b) {
                this.f10925b = true;
                this.f10926c = i7;
            } else if (this.f10926c == i7) {
            } else {
                throw new IllegalArgumentException("Given job ID " + i7 + " is different than previous " + this.f10926c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void c(@d.o0 Context context, @d.o0 ComponentName componentName, int i7, @d.o0 Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f10897k) {
            h f7 = f(context, componentName, true, i7);
            f7.b(i7);
            f7.a(intent);
        }
    }

    public static void d(@d.o0 Context context, @d.o0 Class<?> cls, int i7, @d.o0 Intent intent) {
        c(context, new ComponentName(context, cls), i7, intent);
    }

    public static h f(Context context, ComponentName componentName, boolean z6, int i7) {
        HashMap<ComponentName, h> hashMap = f10898l;
        h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (z6) {
                g gVar = new g(context, componentName, i7);
                hashMap.put(componentName, gVar);
                return gVar;
            }
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        return hVar;
    }

    public e a() {
        b bVar = this.f10899b;
        if (bVar != null) {
            return bVar.a();
        }
        synchronized (this.f10905h) {
            if (this.f10905h.size() > 0) {
                return this.f10905h.remove(0);
            }
            return null;
        }
    }

    public boolean b() {
        a aVar = this.f10901d;
        if (aVar != null) {
            aVar.cancel(this.f10902e);
        }
        this.f10903f = true;
        return i();
    }

    public void e(boolean z6) {
        if (this.f10901d == null) {
            this.f10901d = new a();
            h hVar = this.f10900c;
            if (hVar != null && z6) {
                hVar.d();
            }
            this.f10901d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.f10903f;
    }

    public abstract void h(@d.o0 Intent intent);

    public boolean i() {
        return true;
    }

    public void j() {
        ArrayList<d> arrayList = this.f10905h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f10901d = null;
                ArrayList<d> arrayList2 = this.f10905h;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f10904g) {
                    this.f10900c.c();
                }
            }
        }
    }

    public void k(boolean z6) {
        this.f10902e = z6;
    }

    @Override // android.app.Service
    public IBinder onBind(@d.o0 Intent intent) {
        b bVar = this.f10899b;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f10899b = new f(this);
        this.f10900c = null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f10905h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f10904g = true;
                this.f10900c.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@d.q0 Intent intent, int i7, int i8) {
        if (this.f10905h != null) {
            this.f10900c.e();
            synchronized (this.f10905h) {
                ArrayList<d> arrayList = this.f10905h;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new d(intent, i8));
                e(true);
            }
            return 3;
        }
        return 2;
    }
}
