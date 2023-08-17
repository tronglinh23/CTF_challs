package a1;

import a1.h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.m;
import d.b0;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p0.j1;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final androidx.collection.j<String, Typeface> f84a = new androidx.collection.j<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f85b = i.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f86c = new Object();
    @b0("LOCK")

    /* renamed from: d  reason: collision with root package name */
    public static final m<String, ArrayList<g1.e<e>>> f87d = new m<>();

    /* loaded from: classes.dex */
    public class a implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f88a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f89b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f90c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f91d;

        public a(String str, Context context, f fVar, int i7) {
            this.f88a = str;
            this.f89b = context;
            this.f90c = fVar;
            this.f91d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public e call() {
            return g.c(this.f88a, this.f89b, this.f90c, this.f91d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements g1.e<e> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ a1.a f92k;

        public b(a1.a aVar) {
            this.f92k = aVar;
        }

        @Override // g1.e
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f92k.b(eVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f93a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f94b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f95c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f96d;

        public c(String str, Context context, f fVar, int i7) {
            this.f93a = str;
            this.f94b = context;
            this.f95c = fVar;
            this.f96d = i7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return g.c(this.f93a, this.f94b, this.f95c, this.f96d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements g1.e<e> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f97k;

        public d(String str) {
            this.f97k = str;
        }

        @Override // g1.e
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (g.f86c) {
                m<String, ArrayList<g1.e<e>>> mVar = g.f87d;
                ArrayList<g1.e<e>> arrayList = mVar.get(this.f97k);
                if (arrayList == null) {
                    return;
                }
                mVar.remove(this.f97k);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    arrayList.get(i7).accept(eVar);
                }
            }
        }
    }

    public static String a(@o0 f fVar, int i7) {
        return fVar.d() + "-" + i7;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@o0 h.b bVar) {
        int i7 = 1;
        if (bVar.c() != 0) {
            return bVar.c() != 1 ? -3 : -2;
        }
        h.c[] b7 = bVar.b();
        if (b7 != null && b7.length != 0) {
            i7 = 0;
            for (h.c cVar : b7) {
                int b8 = cVar.b();
                if (b8 != 0) {
                    if (b8 < 0) {
                        return -3;
                    }
                    return b8;
                }
            }
        }
        return i7;
    }

    @o0
    public static e c(@o0 String str, @o0 Context context, @o0 f fVar, int i7) {
        androidx.collection.j<String, Typeface> jVar = f84a;
        Typeface f7 = jVar.f(str);
        if (f7 != null) {
            return new e(f7);
        }
        try {
            h.b e7 = a1.e.e(context, fVar, null);
            int b7 = b(e7);
            if (b7 != 0) {
                return new e(b7);
            }
            Typeface d7 = j1.d(context, null, e7.b(), i7);
            if (d7 != null) {
                jVar.j(str, d7);
                return new e(d7);
            }
            return new e(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(@o0 Context context, @o0 f fVar, int i7, @q0 Executor executor, @o0 a1.a aVar) {
        String a7 = a(fVar, i7);
        Typeface f7 = f84a.f(a7);
        if (f7 != null) {
            aVar.b(new e(f7));
            return f7;
        }
        b bVar = new b(aVar);
        synchronized (f86c) {
            m<String, ArrayList<g1.e<e>>> mVar = f87d;
            ArrayList<g1.e<e>> arrayList = mVar.get(a7);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<g1.e<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            mVar.put(a7, arrayList2);
            c cVar = new c(a7, context, fVar, i7);
            if (executor == null) {
                executor = f85b;
            }
            i.c(executor, cVar, new d(a7));
            return null;
        }
    }

    public static Typeface e(@o0 Context context, @o0 f fVar, @o0 a1.a aVar, int i7, int i8) {
        String a7 = a(fVar, i7);
        Typeface f7 = f84a.f(a7);
        if (f7 != null) {
            aVar.b(new e(f7));
            return f7;
        } else if (i8 == -1) {
            e c7 = c(a7, context, fVar, i7);
            aVar.b(c7);
            return c7.f98a;
        } else {
            try {
                e eVar = (e) i.d(f85b, new a(a7, context, fVar, i7), i8);
                aVar.b(eVar);
                return eVar.f98a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }

    public static void f() {
        f84a.d();
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f98a;

        /* renamed from: b  reason: collision with root package name */
        public final int f99b;

        public e(int i7) {
            this.f98a = null;
            this.f99b = i7;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f99b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public e(@o0 Typeface typeface) {
            this.f98a = typeface;
            this.f99b = 0;
        }
    }
}
