package z0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import d.b1;
import java.util.Locale;

/* loaded from: classes.dex */
public class a {
    @d.k(extension = 30)
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: a  reason: collision with root package name */
    public static final int f19004a;
    @d.k(extension = 31)
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: b  reason: collision with root package name */
    public static final int f19005b;
    @d.k(extension = 33)
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: c  reason: collision with root package name */
    public static final int f19006c;
    @d.k(extension = 1000000)
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: d  reason: collision with root package name */
    public static final int f19007d;

    @d.w0(30)
    /* renamed from: z0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0269a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f19008a;

        /* renamed from: b  reason: collision with root package name */
        public static final int f19009b;

        /* renamed from: c  reason: collision with root package name */
        public static final int f19010c;

        /* renamed from: d  reason: collision with root package name */
        public static final int f19011d;

        static {
            int extensionVersion;
            int extensionVersion2;
            int extensionVersion3;
            int extensionVersion4;
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            f19008a = extensionVersion;
            extensionVersion2 = SdkExtensions.getExtensionVersion(31);
            f19009b = extensionVersion2;
            extensionVersion3 = SdkExtensions.getExtensionVersion(33);
            f19010c = extensionVersion3;
            extensionVersion4 = SdkExtensions.getExtensionVersion(1000000);
            f19011d = extensionVersion4;
        }
    }

    @d.z0
    /* loaded from: classes.dex */
    public @interface b {
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f19004a = i7 >= 30 ? C0269a.f19008a : 0;
        f19005b = i7 >= 30 ? C0269a.f19009b : 0;
        f19006c = i7 >= 30 ? C0269a.f19010c : 0;
        f19007d = i7 >= 30 ? C0269a.f19011d : 0;
    }

    @d.k(api = 24)
    @Deprecated
    public static boolean a() {
        return true;
    }

    @d.k(api = 25)
    @Deprecated
    public static boolean b() {
        return true;
    }

    @d.k(api = 26)
    @Deprecated
    public static boolean c() {
        return true;
    }

    @d.k(api = 27)
    @Deprecated
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @d.k(api = 28)
    @Deprecated
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @d.b1({b1.a.TESTS})
    public static boolean f(@d.o0 String str, @d.o0 String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @d.k(api = 29)
    @Deprecated
    public static boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @d.k(api = 30)
    @Deprecated
    public static boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @d.k(api = 31, codename = "S")
    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean i() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 31 || (i7 >= 30 && f("S", Build.VERSION.CODENAME));
    }

    @b
    @d.k(api = 32, codename = "Sv2")
    @Deprecated
    public static boolean j() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 32 || (i7 >= 31 && f("Sv2", Build.VERSION.CODENAME));
    }

    @b
    @d.k(api = 33, codename = "Tiramisu")
    public static boolean k() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 33 || (i7 >= 32 && f("Tiramisu", Build.VERSION.CODENAME));
    }

    @b
    @d.k(codename = "UpsideDownCake")
    public static boolean l() {
        return Build.VERSION.SDK_INT >= 33 && f("UpsideDownCake", Build.VERSION.CODENAME);
    }
}