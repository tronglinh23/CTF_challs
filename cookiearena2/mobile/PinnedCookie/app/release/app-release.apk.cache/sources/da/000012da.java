package k0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import java.util.ArrayList;
import z0.a;

/* loaded from: classes.dex */
public final class i {
    @SuppressLint({"ActionValue"})

    /* renamed from: a  reason: collision with root package name */
    public static final String f11471a = "android.intent.action.CREATE_REMINDER";

    /* renamed from: b  reason: collision with root package name */
    public static final String f11472b = "android.intent.extra.HTML_TEXT";

    /* renamed from: c  reason: collision with root package name */
    public static final String f11473c = "android.intent.extra.START_PLAYBACK";
    @SuppressLint({"ActionValue"})

    /* renamed from: d  reason: collision with root package name */
    public static final String f11474d = "android.intent.extra.TIME";

    /* renamed from: e  reason: collision with root package name */
    public static final String f11475e = "android.intent.category.LEANBACK_LAUNCHER";

    @d.w0(15)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static Intent a(String str, String str2) {
            return Intent.makeMainSelectorActivity(str, str2);
        }
    }

    @d.w0(33)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static <T> T[] a(@d.o0 Intent intent, @d.q0 String str, @d.o0 Class<T> cls) {
            Object[] parcelableArrayExtra;
            parcelableArrayExtra = intent.getParcelableArrayExtra(str, cls);
            return (T[]) parcelableArrayExtra;
        }

        @d.u
        public static <T> ArrayList<T> b(@d.o0 Intent intent, @d.q0 String str, @d.o0 Class<? extends T> cls) {
            ArrayList<T> parcelableArrayListExtra;
            parcelableArrayListExtra = intent.getParcelableArrayListExtra(str, cls);
            return parcelableArrayListExtra;
        }

        @d.u
        public static <T> T c(@d.o0 Intent intent, @d.q0 String str, @d.o0 Class<T> cls) {
            Object parcelableExtra;
            parcelableExtra = intent.getParcelableExtra(str, cls);
            return (T) parcelableExtra;
        }
    }

    @d.o0
    public static Intent a(@d.o0 Context context, @d.o0 String str) {
        if (u0.a(context.getPackageManager())) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
            }
            Intent data = new Intent(u0.f11516b).setData(Uri.fromParts("package", str, null));
            return i7 >= 30 ? data : data.setPackage((String) g1.s.l(u0.b(context.getPackageManager())));
        }
        throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
    }

    @d.q0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @d.s0(markerClass = {a.b.class})
    public static Parcelable[] b(@d.o0 Intent intent, @d.q0 String str, @d.o0 Class<? extends Parcelable> cls) {
        return z0.a.l() ? (Parcelable[]) b.a(intent, str, cls) : intent.getParcelableArrayExtra(str);
    }

    @d.q0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    @d.s0(markerClass = {a.b.class})
    public static <T> ArrayList<T> c(@d.o0 Intent intent, @d.q0 String str, @d.o0 Class<? extends T> cls) {
        return z0.a.l() ? b.b(intent, str, cls) : intent.getParcelableArrayListExtra(str);
    }

    @d.q0
    @d.s0(markerClass = {a.b.class})
    public static <T> T d(@d.o0 Intent intent, @d.q0 String str, @d.o0 Class<T> cls) {
        if (z0.a.l()) {
            return (T) b.c(intent, str, cls);
        }
        T t6 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t6)) {
            return t6;
        }
        return null;
    }

    @d.o0
    public static Intent e(@d.o0 String str, @d.o0 String str2) {
        return a.a(str, str2);
    }
}