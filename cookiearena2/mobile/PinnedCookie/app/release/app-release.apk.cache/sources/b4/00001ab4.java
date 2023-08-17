package t;

import u.u;
import u.v;
import v.d;
import v.f;
import v.g;
import v.h;

/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public interface a {
        int get(int i7);
    }

    /* loaded from: classes.dex */
    public interface b {
        int c(String str);
    }

    public static void a(String[] strArr) {
        c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    public static u b(String str, b bVar, a aVar) {
        u uVar = new u();
        try {
            f d7 = g.d(str);
            int size = d7.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) d7.w(i7);
                String b7 = dVar.b();
                v.c Y = dVar.Y();
                int c7 = bVar.c(b7);
                if (c7 == -1) {
                    System.err.println("unknown type " + b7);
                } else {
                    int i8 = aVar.get(c7);
                    if (i8 == 1) {
                        uVar.d(c7, d7.B(i7));
                    } else if (i8 == 2) {
                        uVar.b(c7, Y.h());
                        System.out.println("parse " + b7 + " INT_MASK > " + Y.h());
                    } else if (i8 == 4) {
                        uVar.a(c7, Y.g());
                        System.out.println("parse " + b7 + " FLOAT_MASK > " + Y.g());
                    } else if (i8 == 8) {
                        uVar.c(c7, Y.b());
                        System.out.println("parse " + b7 + " STRING_MASK > " + Y.b());
                    }
                }
            }
        } catch (h e7) {
            e7.printStackTrace();
        }
        return uVar;
    }

    public static u c(String str) {
        return b(str, new b() { // from class: t.a
            @Override // t.c.b
            public final int c(String str2) {
                return v.a.a(str2);
            }
        }, new a() { // from class: t.b
            @Override // t.c.a
            public final int get(int i7) {
                return v.a.b(i7);
            }
        });
    }
}