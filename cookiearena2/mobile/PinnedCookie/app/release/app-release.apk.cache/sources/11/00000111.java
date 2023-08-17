package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f777a = "ActionBarDrawerToggleHC";

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f778b = {16843531};

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Method f779a;

        /* renamed from: b  reason: collision with root package name */
        public Method f780b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f781c;

        public a(Activity activity) {
            try {
                this.f779a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f780b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f781c = (ImageView) childAt;
                }
            }
        }
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f778b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int i7) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f779a != null) {
            try {
                aVar.f780b.invoke(activity.getActionBar(), Integer.valueOf(i7));
            } catch (Exception e7) {
                Log.w(f777a, "Couldn't set content description via JB-MR2 API", e7);
            }
        }
        return aVar;
    }

    public static a c(Activity activity, Drawable drawable, int i7) {
        a aVar = new a(activity);
        if (aVar.f779a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f779a.invoke(actionBar, drawable);
                aVar.f780b.invoke(actionBar, Integer.valueOf(i7));
            } catch (Exception e7) {
                Log.w(f777a, "Couldn't set home-as-up indicator via JB-MR2 API", e7);
            }
        } else {
            ImageView imageView = aVar.f781c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w(f777a, "Couldn't set home-as-up indicator");
            }
        }
        return aVar;
    }
}