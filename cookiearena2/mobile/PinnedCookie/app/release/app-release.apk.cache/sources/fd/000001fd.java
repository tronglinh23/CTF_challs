package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import d.b1;
import f.a;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class c2 {

    /* renamed from: h  reason: collision with root package name */
    public static final String f1504h = "TooltipPopup";

    /* renamed from: a  reason: collision with root package name */
    public final Context f1505a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1506b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1507c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1508d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1509e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1510f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1511g;

    public c2(@d.o0 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1508d = layoutParams;
        this.f1509e = new Rect();
        this.f1510f = new int[2];
        this.f1511g = new int[2];
        this.f1505a = context;
        View inflate = LayoutInflater.from(context).inflate(a.j.B, (ViewGroup) null);
        this.f1506b = inflate;
        this.f1507c = (TextView) inflate.findViewById(a.g.I);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = androidx.core.view.o1.f3749e;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.l.f9274e;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    public final void a(View view, int i7, int i8, boolean z6, WindowManager.LayoutParams layoutParams) {
        int height;
        int i9;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1505a.getResources().getDimensionPixelOffset(a.e.Q0);
        if (view.getWidth() < dimensionPixelOffset) {
            i7 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1505a.getResources().getDimensionPixelOffset(a.e.P0);
            height = i8 + dimensionPixelOffset2;
            i9 = i8 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i9 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1505a.getResources().getDimensionPixelOffset(z6 ? a.e.T0 : a.e.S0);
        View b7 = b(view);
        if (b7 == null) {
            Log.e(f1504h, "Cannot find app view");
            return;
        }
        b7.getWindowVisibleDisplayFrame(this.f1509e);
        Rect rect = this.f1509e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1505a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1509e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b7.getLocationOnScreen(this.f1511g);
        view.getLocationOnScreen(this.f1510f);
        int[] iArr = this.f1510f;
        int i10 = iArr[0];
        int[] iArr2 = this.f1511g;
        int i11 = i10 - iArr2[0];
        iArr[0] = i11;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i11 + i7) - (b7.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1506b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1506b.getMeasuredHeight();
        int i12 = this.f1510f[1];
        int i13 = ((i9 + i12) - dimensionPixelOffset3) - measuredHeight;
        int i14 = i12 + height + dimensionPixelOffset3;
        if (z6) {
            if (i13 >= 0) {
                layoutParams.y = i13;
            } else {
                layoutParams.y = i14;
            }
        } else if (measuredHeight + i14 <= this.f1509e.height()) {
            layoutParams.y = i14;
        } else {
            layoutParams.y = i13;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f1505a.getSystemService("window")).removeView(this.f1506b);
        }
    }

    public boolean d() {
        return this.f1506b.getParent() != null;
    }

    public void e(View view, int i7, int i8, boolean z6, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1507c.setText(charSequence);
        a(view, i7, i8, z6, this.f1508d);
        ((WindowManager) this.f1505a.getSystemService("window")).addView(this.f1506b, this.f1508d);
    }
}