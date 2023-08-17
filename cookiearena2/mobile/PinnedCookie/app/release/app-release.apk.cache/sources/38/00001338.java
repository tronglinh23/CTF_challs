package k1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import d.b1;
import d.g0;
import d.g1;
import d.o0;
import d.q0;
import d.u0;
import d.w0;
import d1.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11597a = "TextViewCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final int f11598b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f11599c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static Field f11600d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f11601e = false;

    /* renamed from: f  reason: collision with root package name */
    public static Field f11602f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f11603g = false;

    /* renamed from: h  reason: collision with root package name */
    public static Field f11604h = null;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f11605i = false;

    /* renamed from: j  reason: collision with root package name */
    public static Field f11606j = null;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f11607k = false;

    /* renamed from: l  reason: collision with root package name */
    public static final int f11608l = 1;

    @w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @d.u
        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        @d.u
        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    @w0(17)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @d.u
        public static int b(View view) {
            return view.getLayoutDirection();
        }

        @d.u
        public static int c(View view) {
            return view.getTextDirection();
        }

        @d.u
        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        @d.u
        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @d.u
        public static void f(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i7, i8, i9, i10);
        }

        @d.u
        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @d.u
        public static void h(View view, int i7) {
            view.setTextDirection(i7);
        }
    }

    @w0(23)
    /* loaded from: classes.dex */
    public static class c {
        @d.u
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @d.u
        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @d.u
        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @d.u
        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @d.u
        public static void e(TextView textView, int i7) {
            textView.setBreakStrategy(i7);
        }

        @d.u
        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @d.u
        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @d.u
        public static void h(TextView textView, int i7) {
            textView.setHyphenationFrequency(i7);
        }
    }

    @w0(24)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @w0(26)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        public static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @d.u
        public static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @d.u
        public static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @d.u
        public static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @d.u
        public static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @d.u
        public static void f(TextView textView, int i7, int i8, int i9, int i10) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }

        @d.u
        public static void g(TextView textView, int[] iArr, int i7) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        @d.u
        public static void h(TextView textView, int i7) {
            textView.setAutoSizeTextTypeWithDefaults(i7);
        }
    }

    @w0(28)
    /* loaded from: classes.dex */
    public static class f {
        @d.u
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        @d.u
        public static PrecomputedText.Params b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        @d.u
        public static void c(TextView textView, int i7) {
            textView.setFirstBaselineToTopHeight(i7);
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    @w0(26)
    /* loaded from: classes.dex */
    public static class h implements ActionMode.Callback {

        /* renamed from: g  reason: collision with root package name */
        public static final int f11609g = 100;

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f11610a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f11611b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f11612c;

        /* renamed from: d  reason: collision with root package name */
        public Method f11613d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f11614e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f11615f = false;

        public h(ActionMode.Callback callback, TextView textView) {
            this.f11610a = callback;
            this.f11611b = textView;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }

        @o0
        public ActionMode.Callback d() {
            return this.f11610a;
        }

        public final boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo.exported) {
                String str = activityInfo.permission;
                return str == null || context.checkSelfPermission(str) == 0;
            }
            return false;
        }

        public final void g(Menu menu) {
            Context context = this.f11611b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f11615f) {
                this.f11615f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f11612c = cls;
                    this.f11613d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f11614e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f11612c = null;
                    this.f11613d = null;
                    this.f11614e = false;
                }
            }
            try {
                Method declaredMethod = (this.f11614e && this.f11612c.isInstance(menu)) ? this.f11613d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c7 = c(context, packageManager);
                for (int i7 = 0; i7 < c7.size(); i7++) {
                    ResolveInfo resolveInfo = c7.get(i7);
                    menu.add(0, 0, i7 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f11611b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f11610a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f11610a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f11610a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f11610a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static void A(@o0 TextView textView, @u0 @g0(from = 0) int i7) {
        g1.s.i(i7);
        if (Build.VERSION.SDK_INT >= 28) {
            f.c(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(@o0 TextView textView, @u0 @g0(from = 0) int i7) {
        g1.s.i(i7);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    public static void C(@o0 TextView textView, @u0 @g0(from = 0) int i7) {
        g1.s.i(i7);
        if (i7 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i7 - r0, 1.0f);
        }
    }

    public static void D(@o0 TextView textView, @o0 d1.z zVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(zVar.f());
        } else if (!o(textView).a(zVar.e())) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        } else {
            textView.setText(zVar);
        }
    }

    public static void E(@o0 TextView textView, @g1 int i7) {
        textView.setTextAppearance(i7);
    }

    public static void F(@o0 TextView textView, @o0 z.a aVar) {
        b.h(textView, m(aVar.d()));
        textView.getPaint().set(aVar.e());
        c.e(textView, aVar.b());
        c.h(textView, aVar.c());
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    public static ActionMode.Callback G(@q0 ActionMode.Callback callback) {
        return callback instanceof h ? ((h) callback).d() : callback;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    public static ActionMode.Callback H(@o0 TextView textView, @q0 ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof h) || callback == null) ? callback : new h(callback, textView);
    }

    public static int a(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.a(textView);
        }
        if (textView instanceof k1.b) {
            return ((k1.b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    public static int b(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.b(textView);
        }
        if (textView instanceof k1.b) {
            return ((k1.b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static int c(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.c(textView);
        }
        if (textView instanceof k1.b) {
            return ((k1.b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    @o0
    public static int[] d(@o0 TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? e.d(textView) : textView instanceof k1.b ? ((k1.b) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    public static int e(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return e.e(textView);
        }
        if (textView instanceof k1.b) {
            return ((k1.b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @q0
    public static ColorStateList f(@o0 TextView textView) {
        g1.s.l(textView);
        return c.b(textView);
    }

    @q0
    public static PorterDuff.Mode g(@o0 TextView textView) {
        g1.s.l(textView);
        return c.c(textView);
    }

    @o0
    public static Drawable[] h(@o0 TextView textView) {
        return b.a(textView);
    }

    public static int i(@o0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@o0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int k(@o0 TextView textView) {
        return a.b(textView);
    }

    public static int l(@o0 TextView textView) {
        return a.c(textView);
    }

    @w0(18)
    public static int m(@o0 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    @w0(18)
    public static TextDirectionHeuristic n(@o0 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(f.a(d.a(b.d(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z6 = b.b(textView) == 1;
        switch (b.c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z6 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    @o0
    public static z.a o(@o0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new z.a(f.b(textView));
        }
        z.a.C0093a c0093a = new z.a.C0093a(new TextPaint(textView.getPaint()));
        c0093a.b(c.a(textView));
        c0093a.c(c.d(textView));
        c0093a.d(n(textView));
        return c0093a.a();
    }

    public static Field p(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            Log.e(f11597a, "Could not retrieve " + str + " field.");
            return field;
        }
    }

    public static int q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve value of ");
            sb.append(field.getName());
            sb.append(" field.");
            return -1;
        }
    }

    public static void r(@o0 TextView textView, int i7, int i8, int i9, int i10) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.f(textView, i7, i8, i9, i10);
        } else if (textView instanceof k1.b) {
            ((k1.b) textView).setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }
    }

    public static void s(@o0 TextView textView, @o0 int[] iArr, int i7) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            e.g(textView, iArr, i7);
        } else if (textView instanceof k1.b) {
            ((k1.b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }
    }

    public static void t(@o0 TextView textView, int i7) {
        if (Build.VERSION.SDK_INT >= 27) {
            e.h(textView, i7);
        } else if (textView instanceof k1.b) {
            ((k1.b) textView).setAutoSizeTextTypeWithDefaults(i7);
        }
    }

    public static void u(@o0 TextView textView, @q0 ColorStateList colorStateList) {
        g1.s.l(textView);
        c.f(textView, colorStateList);
    }

    public static void v(@o0 TextView textView, @q0 PorterDuff.Mode mode) {
        g1.s.l(textView);
        c.g(textView, mode);
    }

    public static void w(@o0 TextView textView, @q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        b.e(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void x(@o0 TextView textView, @d.v int i7, @d.v int i8, @d.v int i9, @d.v int i10) {
        b.f(textView, i7, i8, i9, i10);
    }

    public static void y(@o0 TextView textView, @q0 Drawable drawable, @q0 Drawable drawable2, @q0 Drawable drawable3, @q0 Drawable drawable4) {
        b.g(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void z(@o0 TextView textView, @o0 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(H(textView, callback));
    }
}