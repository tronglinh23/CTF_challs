package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import d.b1;
import f.a;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f11305a;

    public a(Context context) {
        this.f11305a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f11305a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f11305a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f11305a.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600) {
            return 5;
        }
        if (i7 <= 960 || i8 <= 720) {
            if (i7 <= 720 || i8 <= 960) {
                if (i7 < 500) {
                    if (i7 <= 640 || i8 <= 480) {
                        if (i7 <= 480 || i8 <= 640) {
                            return i7 >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    public int e() {
        return this.f11305a.getResources().getDimensionPixelSize(a.e.f9047k);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f11305a.obtainStyledAttributes(null, a.m.f9428a, a.b.f8860f, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(a.m.f9540o, 0);
        Resources resources = this.f11305a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.e.f9045j));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f11305a.getResources().getBoolean(a.c.f8973a);
    }

    public boolean h() {
        return true;
    }
}
