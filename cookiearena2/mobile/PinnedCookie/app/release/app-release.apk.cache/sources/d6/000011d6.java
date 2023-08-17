package i0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x3 implements Iterable<Intent> {

    /* renamed from: m  reason: collision with root package name */
    public static final String f10975m = "TaskStackBuilder";

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<Intent> f10976k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public final Context f10977l;

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static PendingIntent a(Context context, int i7, Intent[] intentArr, int i8, Bundle bundle) {
            return PendingIntent.getActivities(context, i7, intentArr, i8, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        @d.q0
        Intent q();
    }

    public x3(Context context) {
        this.f10977l = context;
    }

    @d.o0
    public static x3 g(@d.o0 Context context) {
        return new x3(context);
    }

    @Deprecated
    public static x3 i(Context context) {
        return g(context);
    }

    @d.o0
    public x3 a(@d.o0 Intent intent) {
        this.f10976k.add(intent);
        return this;
    }

    @d.o0
    public x3 b(@d.o0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f10977l.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        a(intent);
        return this;
    }

    @d.o0
    public x3 d(@d.o0 Activity activity) {
        Intent q6 = activity instanceof b ? ((b) activity).q() : null;
        if (q6 == null) {
            q6 = x.a(activity);
        }
        if (q6 != null) {
            ComponentName component = q6.getComponent();
            if (component == null) {
                component = q6.resolveActivity(this.f10977l.getPackageManager());
            }
            e(component);
            a(q6);
        }
        return this;
    }

    @d.o0
    public x3 e(@d.o0 ComponentName componentName) {
        int size = this.f10976k.size();
        try {
            Intent b7 = x.b(this.f10977l, componentName);
            while (b7 != null) {
                this.f10976k.add(size, b7);
                b7 = x.b(this.f10977l, b7.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e(f10975m, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e7);
        }
    }

    @d.o0
    public x3 f(@d.o0 Class<?> cls) {
        return e(new ComponentName(this.f10977l, cls));
    }

    @d.q0
    public Intent h(int i7) {
        return this.f10976k.get(i7);
    }

    @Override // java.lang.Iterable
    @d.o0
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f10976k.iterator();
    }

    @Deprecated
    public Intent j(int i7) {
        return h(i7);
    }

    public int k() {
        return this.f10976k.size();
    }

    @d.o0
    public Intent[] l() {
        int size = this.f10976k.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f10976k.get(0)).addFlags(268484608);
        for (int i7 = 1; i7 < size; i7++) {
            intentArr[i7] = new Intent(this.f10976k.get(i7));
        }
        return intentArr;
    }

    @d.q0
    public PendingIntent m(int i7, int i8) {
        return n(i7, i8, null);
    }

    @d.q0
    public PendingIntent n(int i7, int i8, @d.q0 Bundle bundle) {
        if (this.f10976k.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f10976k.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return a.a(this.f10977l, i7, intentArr, i8, bundle);
    }

    public void o() {
        p(null);
    }

    public void p(@d.q0 Bundle bundle) {
        if (this.f10976k.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f10976k.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (k0.d.v(this.f10977l, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f10977l.startActivity(intent);
    }
}