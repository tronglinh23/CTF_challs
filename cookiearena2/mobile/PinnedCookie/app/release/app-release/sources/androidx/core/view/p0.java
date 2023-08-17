package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3784a = "LayoutInflaterCompatHC";

    /* renamed from: b  reason: collision with root package name */
    public static Field f3785b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f3786c;

    /* loaded from: classes.dex */
    public static class a implements LayoutInflater.Factory2 {

        /* renamed from: b  reason: collision with root package name */
        public final q0 f3787b;

        public a(q0 q0Var) {
            this.f3787b = q0Var;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f3787b.onCreateView(null, str, context, attributeSet);
        }

        @d.o0
        public String toString() {
            return getClass().getName() + "{" + this.f3787b + "}";
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f3787b.onCreateView(view, str, context, attributeSet);
        }
    }

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f3786c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f3785b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                Log.e(f3784a, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e7);
            }
            f3786c = true;
        }
        Field field = f3785b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e8) {
                Log.e(f3784a, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e8);
            }
        }
    }

    @Deprecated
    public static q0 b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).f3787b;
        }
        return null;
    }

    @Deprecated
    public static void c(@d.o0 LayoutInflater layoutInflater, @d.o0 q0 q0Var) {
        layoutInflater.setFactory2(new a(q0Var));
    }

    public static void d(@d.o0 LayoutInflater layoutInflater, @d.o0 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
