package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.q1;
import androidx.core.view.u1;
import d.o0;
import d.q0;
import f.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class q {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final int[] sAccessibilityHeading = {16844160};
    private static final int[] sAccessibilityPaneTitle = {16844156};
    private static final int[] sScreenReaderFocusable = {16844148};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final androidx.collection.m<String, Constructor<? extends View>> sConstructorMap = new androidx.collection.m<>();

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final View f891b;

        /* renamed from: c  reason: collision with root package name */
        public final String f892c;

        /* renamed from: d  reason: collision with root package name */
        public Method f893d;

        /* renamed from: e  reason: collision with root package name */
        public Context f894e;

        public a(@o0 View view, @o0 String str) {
            this.f891b = view;
            this.f892c = str;
        }

        public final void a(@q0 Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f892c, View.class)) != null) {
                        this.f893d = method;
                        this.f894e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f891b.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f891b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f892c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f891b.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@o0 View view) {
            if (this.f893d == null) {
                a(this.f891b.getContext());
            }
            try {
                this.f893d.invoke(this.f894e, view);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException("Could not execute method for android:onClick", e8);
            }
        }
    }

    public static Context e(Context context, AttributeSet attributeSet, boolean z6, boolean z7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.U6, 0, 0);
        int resourceId = z6 ? obtainStyledAttributes.getResourceId(a.m.V6, 0) : 0;
        if (z7 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(a.m.Z6, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof j.d) && ((j.d) context).c() == resourceId) ? context : new j.d(context, resourceId) : context;
    }

    public final void a(@o0 Context context, @o0 View view, @o0 AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (obtainStyledAttributes.hasValue(0)) {
            u1.C1(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (obtainStyledAttributes2.hasValue(0)) {
            u1.E1(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (obtainStyledAttributes3.hasValue(0)) {
            u1.n2(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && u1.K0(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final View c(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        androidx.collection.m<String, Constructor<? extends View>> mVar = sConstructorMap;
        Constructor<? extends View> constructor = mVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            mVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    @o0
    public androidx.appcompat.widget.e createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.e(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.g createButton(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.h createCheckBox(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.i createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.i(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.m createEditText(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.m(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.q createImageButton(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.q(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.s createImageView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.t createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.w createRadioButton(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.w(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.x createRatingBar(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.x(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.z createSeekBar(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.z(context, attributeSet);
    }

    @o0
    public androidx.appcompat.widget.b0 createSpinner(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.b0(context, attributeSet);
    }

    @o0
    public f0 createTextView(Context context, AttributeSet attributeSet) {
        return new f0(context, attributeSet);
    }

    @o0
    public j0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new j0(context, attributeSet);
    }

    @q0
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View d(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return c(context, str, null);
            }
            int i7 = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i7 >= strArr.length) {
                    return null;
                }
                View c7 = c(context, str, strArr[i7]);
                if (c7 != null) {
                    return c7;
                }
                i7++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void f(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @q0
    public final View createView(@q0 View view, @o0 String str, @o0 Context context, @o0 AttributeSet attributeSet, boolean z6, boolean z7, boolean z8, boolean z9) {
        View createRatingBar;
        Context context2 = (!z6 || view == null) ? context : view.getContext();
        if (z7 || z8) {
            context2 = e(context2, attributeSet, z7, z8);
        }
        if (z9) {
            context2 = q1.b(context2);
        }
        str.hashCode();
        char c7 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c7 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c7 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c7 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c7 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c7 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c7 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c7 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c7 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c7 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c7 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c7 = '\r';
                    break;
                }
                break;
        }
        switch (c7) {
            case 0:
                createRatingBar = createRatingBar(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case 1:
                createRatingBar = createCheckedTextView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case 2:
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case 3:
                createRatingBar = createTextView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case 4:
                createRatingBar = createImageButton(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case 5:
                createRatingBar = createSeekBar(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case 6:
                createRatingBar = createSpinner(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case 7:
                createRatingBar = createRadioButton(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case '\b':
                createRatingBar = createToggleButton(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case '\t':
                createRatingBar = createImageView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case '\n':
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case 11:
                createRatingBar = createCheckBox(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case '\f':
                createRatingBar = createEditText(context2, attributeSet);
                f(createRatingBar, str);
                break;
            case '\r':
                createRatingBar = createButton(context2, attributeSet);
                f(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = d(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            b(createRatingBar, attributeSet);
            a(context2, createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}
