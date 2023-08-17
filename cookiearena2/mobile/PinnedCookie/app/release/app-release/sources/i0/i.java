package i0;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f10470a = "android.activity.usage_time";

    /* renamed from: b  reason: collision with root package name */
    public static final String f10471b = "android.usage_time_packages";

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a extends i {

        /* renamed from: c  reason: collision with root package name */
        public final ActivityOptions f10472c;

        public a(ActivityOptions activityOptions) {
            this.f10472c = activityOptions;
        }

        @Override // i0.i
        public Rect a() {
            return e.a(this.f10472c);
        }

        @Override // i0.i
        public void j(@d.o0 PendingIntent pendingIntent) {
            d.c(this.f10472c, pendingIntent);
        }

        @Override // i0.i
        @d.o0
        public i k(@d.q0 Rect rect) {
            return new a(e.b(this.f10472c, rect));
        }

        @Override // i0.i
        public Bundle l() {
            return this.f10472c.toBundle();
        }

        @Override // i0.i
        public void m(@d.o0 i iVar) {
            if (iVar instanceof a) {
                this.f10472c.update(((a) iVar).f10472c);
            }
        }
    }

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static ActivityOptions a(Context context, int i7, int i8) {
            return ActivityOptions.makeCustomAnimation(context, i7, i8);
        }

        @d.u
        public static ActivityOptions b(View view, int i7, int i8, int i9, int i10) {
            return ActivityOptions.makeScaleUpAnimation(view, i7, i8, i9, i10);
        }

        @d.u
        public static ActivityOptions c(View view, Bitmap bitmap, int i7, int i8) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i7, i8);
        }
    }

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static ActivityOptions a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @d.u
        @SafeVarargs
        public static ActivityOptions b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @d.u
        public static ActivityOptions c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }

        @d.u
        public static ActivityOptions b(View view, int i7, int i8, int i9, int i10) {
            return ActivityOptions.makeClipRevealAnimation(view, i7, i8, i9, i10);
        }

        @d.u
        public static void c(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static Rect a(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @d.u
        public static ActivityOptions b(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    @d.o0
    public static i b() {
        return new a(d.a());
    }

    @d.o0
    public static i c(@d.o0 View view, int i7, int i8, int i9, int i10) {
        return new a(d.b(view, i7, i8, i9, i10));
    }

    @d.o0
    public static i d(@d.o0 Context context, int i7, int i8) {
        return new a(b.a(context, i7, i8));
    }

    @d.o0
    public static i e(@d.o0 View view, int i7, int i8, int i9, int i10) {
        return new a(b.b(view, i7, i8, i9, i10));
    }

    @d.o0
    public static i f(@d.o0 Activity activity, @d.o0 View view, @d.o0 String str) {
        return new a(c.a(activity, view, str));
    }

    @d.o0
    public static i g(@d.o0 Activity activity, @d.q0 g1.o<View, String>... oVarArr) {
        Pair[] pairArr;
        if (oVarArr != null) {
            pairArr = new Pair[oVarArr.length];
            for (int i7 = 0; i7 < oVarArr.length; i7++) {
                g1.o<View, String> oVar = oVarArr[i7];
                pairArr[i7] = Pair.create(oVar.f10023a, oVar.f10024b);
            }
        } else {
            pairArr = null;
        }
        return new a(c.b(activity, pairArr));
    }

    @d.o0
    public static i h() {
        return new a(c.c());
    }

    @d.o0
    public static i i(@d.o0 View view, @d.o0 Bitmap bitmap, int i7, int i8) {
        return new a(b.c(view, bitmap, i7, i8));
    }

    @d.q0
    public Rect a() {
        return null;
    }

    public void j(@d.o0 PendingIntent pendingIntent) {
    }

    @d.o0
    public i k(@d.q0 Rect rect) {
        return this;
    }

    @d.q0
    public Bundle l() {
        return null;
    }

    public void m(@d.o0 i iVar) {
    }
}
