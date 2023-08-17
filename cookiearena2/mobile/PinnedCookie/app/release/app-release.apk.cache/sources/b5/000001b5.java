package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import d.b1;
import f.a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends y0 implements j.c {

    /* renamed from: c0  reason: collision with root package name */
    public static final boolean f1337c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public static final String f1338d0 = "SearchView";

    /* renamed from: e0  reason: collision with root package name */
    public static final String f1339e0 = "nm";

    /* renamed from: f0  reason: collision with root package name */
    public static final o f1340f0;
    public View.OnClickListener A;
    public boolean B;
    public boolean C;
    public m1.a D;
    public boolean E;
    public CharSequence F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public CharSequence K;
    public CharSequence L;
    public boolean M;
    public int N;
    public SearchableInfo O;
    public Bundle P;
    public final Runnable Q;
    public Runnable R;
    public final WeakHashMap<String, Drawable.ConstantState> S;
    public final View.OnClickListener T;
    public View.OnKeyListener U;
    public final TextView.OnEditorActionListener V;
    public final AdapterView.OnItemClickListener W;

    /* renamed from: a0  reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f1341a0;

    /* renamed from: b  reason: collision with root package name */
    public final SearchAutoComplete f1342b;

    /* renamed from: b0  reason: collision with root package name */
    public TextWatcher f1343b0;

    /* renamed from: c  reason: collision with root package name */
    public final View f1344c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1345d;

    /* renamed from: e  reason: collision with root package name */
    public final View f1346e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f1347f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f1348g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f1349h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f1350i;

    /* renamed from: j  reason: collision with root package name */
    public final View f1351j;

    /* renamed from: k  reason: collision with root package name */
    public q f1352k;

    /* renamed from: l  reason: collision with root package name */
    public Rect f1353l;

    /* renamed from: m  reason: collision with root package name */
    public Rect f1354m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f1355n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f1356o;

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f1357p;

    /* renamed from: q  reason: collision with root package name */
    public final Drawable f1358q;

    /* renamed from: r  reason: collision with root package name */
    public final int f1359r;

    /* renamed from: s  reason: collision with root package name */
    public final int f1360s;

    /* renamed from: t  reason: collision with root package name */
    public final Intent f1361t;

    /* renamed from: u  reason: collision with root package name */
    public final Intent f1362u;

    /* renamed from: v  reason: collision with root package name */
    public final CharSequence f1363v;

    /* renamed from: w  reason: collision with root package name */
    public m f1364w;

    /* renamed from: x  reason: collision with root package name */
    public l f1365x;

    /* renamed from: y  reason: collision with root package name */
    public View.OnFocusChangeListener f1366y;

    /* renamed from: z  reason: collision with root package name */
    public n f1367z;

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.e {

        /* renamed from: b  reason: collision with root package name */
        public int f1368b;

        /* renamed from: c  reason: collision with root package name */
        public SearchView f1369c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1370d;

        /* renamed from: e  reason: collision with root package name */
        public final Runnable f1371e;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 < 960 || i8 < 720 || configuration.orientation != 2) {
                if (i7 < 600) {
                    return (i7 < 640 || i8 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        public void a() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f1340f0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void c() {
            if (this.f1370d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1370d = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1368b <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.e, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1370d) {
                removeCallbacks(this.f1371e);
                post(this.f1371e);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z6, int i7, Rect rect) {
            super.onFocusChanged(z6, i7, rect);
            this.f1369c.H();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1369c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z6) {
            super.onWindowFocusChanged(z6);
            if (z6 && this.f1369c.hasFocus() && getVisibility() == 0) {
                this.f1370d = true;
                if (SearchView.s(getContext())) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z6) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z6) {
                this.f1370d = false;
                removeCallbacks(this.f1371e);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f1370d = true;
            } else {
                this.f1370d = false;
                removeCallbacks(this.f1371e);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1369c = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f1368b = i7;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.b.S);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f1371e = new a();
            this.f1368b = getThreshold();
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            SearchView.this.G(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.N();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m1.a aVar = SearchView.this.D;
            if (aVar instanceof m1) {
                aVar.b(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z6) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1366y;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z6);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            SearchView.this.g();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1347f) {
                searchView.D();
            } else if (view == searchView.f1349h) {
                searchView.z();
            } else if (view == searchView.f1348g) {
                searchView.E();
            } else if (view == searchView.f1350i) {
                searchView.I();
            } else if (view == searchView.f1342b) {
                searchView.m();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i7, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.O == null) {
                return false;
            }
            if (!searchView.f1342b.isPopupShowing() || SearchView.this.f1342b.getListSelection() == -1) {
                if (!SearchView.this.f1342b.b() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i7 == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.x(0, null, searchView2.f1342b.getText().toString());
                    return true;
                }
                return false;
            }
            return SearchView.this.F(view, i7, keyEvent);
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            SearchView.this.E();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            SearchView.this.A(i7, 0, null);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j7) {
            SearchView.this.B(i7);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class k {
        @d.u
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @d.u
        public static void b(SearchAutoComplete searchAutoComplete, int i7) {
            searchAutoComplete.setInputMethodMode(i7);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface n {
        boolean a(int i7);

        boolean b(int i7);
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public Method f1383a;

        /* renamed from: b  reason: collision with root package name */
        public Method f1384b;

        /* renamed from: c  reason: collision with root package name */
        public Method f1385c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f1383a = null;
            this.f1384b = null;
            this.f1385c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1383a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1384b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1385c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1384b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1383a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1385c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class p extends o1.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public boolean f1386k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i7) {
                return new p[i7];
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1386k + "}";
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Boolean.valueOf(this.f1386k));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1386k = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f1387a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1388b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f1389c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1390d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1391e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1392f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1391e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1388b = new Rect();
            this.f1390d = new Rect();
            this.f1389c = new Rect();
            a(rect, rect2);
            this.f1387a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1388b.set(rect);
            this.f1390d.set(rect);
            Rect rect3 = this.f1390d;
            int i7 = this.f1391e;
            rect3.inset(-i7, -i7);
            this.f1389c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z6;
            boolean z7;
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z8 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z7 = this.f1392f;
                    if (z7 && !this.f1390d.contains(x6, y6)) {
                        z8 = z7;
                        z6 = false;
                    }
                } else {
                    if (action == 3) {
                        z7 = this.f1392f;
                        this.f1392f = false;
                    }
                    z6 = true;
                    z8 = false;
                }
                z8 = z7;
                z6 = true;
            } else {
                if (this.f1388b.contains(x6, y6)) {
                    this.f1392f = true;
                    z6 = true;
                }
                z6 = true;
                z8 = false;
            }
            if (z8) {
                if (!z6 || this.f1389c.contains(x6, y6)) {
                    Rect rect = this.f1389c;
                    motionEvent.setLocation(x6 - rect.left, y6 - rect.top);
                } else {
                    motionEvent.setLocation(this.f1387a.getWidth() / 2, this.f1387a.getHeight() / 2);
                }
                return this.f1387a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f1340f0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(@d.o0 Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.e.f9032c0);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.e.f9034d0);
    }

    public static boolean s(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private void setQuery(CharSequence charSequence) {
        this.f1342b.setText(charSequence);
        this.f1342b.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public boolean A(int i7, int i8, String str) {
        n nVar = this.f1367z;
        if (nVar == null || !nVar.b(i7)) {
            y(i7, 0, null);
            this.f1342b.setImeVisibility(false);
            l();
            return true;
        }
        return false;
    }

    public boolean B(int i7) {
        n nVar = this.f1367z;
        if (nVar == null || !nVar.a(i7)) {
            K(i7);
            return true;
        }
        return false;
    }

    public void C(@d.q0 CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void D() {
        S(false);
        this.f1342b.requestFocus();
        this.f1342b.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void E() {
        Editable text = this.f1342b.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f1364w;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.O != null) {
                x(0, null, text.toString());
            }
            this.f1342b.setImeVisibility(false);
            l();
        }
    }

    public boolean F(View view, int i7, KeyEvent keyEvent) {
        if (this.O != null && this.D != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i7 == 66 || i7 == 84 || i7 == 61) {
                return A(this.f1342b.getListSelection(), 0, null);
            }
            if (i7 == 21 || i7 == 22) {
                this.f1342b.setSelection(i7 == 21 ? 0 : this.f1342b.length());
                this.f1342b.setListSelection(0);
                this.f1342b.clearListSelection();
                this.f1342b.a();
                return true;
            } else if (i7 == 19) {
                this.f1342b.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void G(CharSequence charSequence) {
        Editable text = this.f1342b.getText();
        this.L = text;
        boolean z6 = !TextUtils.isEmpty(text);
        R(z6);
        T(!z6);
        M();
        Q();
        if (this.f1364w != null && !TextUtils.equals(charSequence, this.K)) {
            this.f1364w.a(charSequence.toString());
        }
        this.K = charSequence.toString();
    }

    public void H() {
        S(r());
        J();
        if (this.f1342b.hasFocus()) {
            m();
        }
    }

    public void I() {
        SearchableInfo searchableInfo = this.O;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(k(this.f1361t, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(j(this.f1362u, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w(f1338d0, "Could not find voice search activity");
        }
    }

    public final void J() {
        post(this.Q);
    }

    public final void K(int i7) {
        Editable text = this.f1342b.getText();
        Cursor c7 = this.D.c();
        if (c7 == null) {
            return;
        }
        if (!c7.moveToPosition(i7)) {
            setQuery(text);
            return;
        }
        CharSequence a7 = this.D.a(c7);
        if (a7 != null) {
            setQuery(a7);
        } else {
            setQuery(text);
        }
    }

    public void L(CharSequence charSequence, boolean z6) {
        this.f1342b.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1342b;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.L = charSequence;
        }
        if (!z6 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        E();
    }

    public final void M() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f1342b.getText());
        if (!z7 && (!this.B || this.M)) {
            z6 = false;
        }
        this.f1349h.setVisibility(z6 ? 0 : 8);
        Drawable drawable = this.f1349h.getDrawable();
        if (drawable != null) {
            drawable.setState(z7 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void N() {
        int[] iArr = this.f1342b.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1345d.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1346e.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void O() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1342b;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(o(queryHint));
    }

    public final void P() {
        this.f1342b.setThreshold(this.O.getSuggestThreshold());
        this.f1342b.setImeOptions(this.O.getImeOptions());
        int inputType = this.O.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.O.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1342b.setInputType(inputType);
        m1.a aVar = this.D;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.O.getSuggestAuthority() != null) {
            m1 m1Var = new m1(getContext(), this, this.O, this.S);
            this.D = m1Var;
            this.f1342b.setAdapter(m1Var);
            ((m1) this.D).E(this.G ? 2 : 1);
        }
    }

    public final void Q() {
        this.f1346e.setVisibility((u() && (this.f1348g.getVisibility() == 0 || this.f1350i.getVisibility() == 0)) ? 0 : 8);
    }

    public final void R(boolean z6) {
        this.f1348g.setVisibility((this.E && u() && hasFocus() && (z6 || !this.J)) ? 0 : 8);
    }

    public final void S(boolean z6) {
        this.C = z6;
        int i7 = z6 ? 0 : 8;
        boolean z7 = !TextUtils.isEmpty(this.f1342b.getText());
        this.f1347f.setVisibility(i7);
        R(z7);
        this.f1344c.setVisibility(z6 ? 8 : 0);
        this.f1357p.setVisibility((this.f1357p.getDrawable() == null || this.B) ? 8 : 0);
        M();
        T(!z7);
        Q();
    }

    public final void T(boolean z6) {
        int i7 = 8;
        if (this.J && !r() && z6) {
            this.f1348g.setVisibility(8);
            i7 = 0;
        }
        this.f1350i.setVisibility(i7);
    }

    @Override // j.c
    public void b() {
        if (this.M) {
            return;
        }
        this.M = true;
        int imeOptions = this.f1342b.getImeOptions();
        this.N = imeOptions;
        this.f1342b.setImeOptions(imeOptions | 33554432);
        this.f1342b.setText("");
        setIconified(false);
    }

    @Override // j.c
    public void c() {
        L("", false);
        clearFocus();
        S(true);
        this.f1342b.setImeOptions(this.N);
        this.M = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.H = true;
        super.clearFocus();
        this.f1342b.clearFocus();
        this.f1342b.setImeVisibility(false);
        this.H = false;
    }

    public void g() {
        if (this.f1351j.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1345d.getPaddingLeft();
            Rect rect = new Rect();
            boolean b7 = e2.b(this);
            int dimensionPixelSize = this.B ? resources.getDimensionPixelSize(a.e.P) + resources.getDimensionPixelSize(a.e.Q) : 0;
            this.f1342b.getDropDownBackground().getPadding(rect);
            this.f1342b.setDropDownHorizontalOffset(b7 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1342b.setDropDownWidth((((this.f1351j.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public int getImeOptions() {
        return this.f1342b.getImeOptions();
    }

    public int getInputType() {
        return this.f1342b.getInputType();
    }

    public int getMaxWidth() {
        return this.I;
    }

    public CharSequence getQuery() {
        return this.f1342b.getText();
    }

    @d.q0
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.F;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.O;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1363v : getContext().getText(this.O.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1360s;
    }

    public int getSuggestionRowLayout() {
        return this.f1359r;
    }

    public m1.a getSuggestionsAdapter() {
        return this.D;
    }

    public final Intent h(String str, Uri uri, String str2, String str3, int i7, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.L);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.P;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i7 != 0) {
            intent.putExtra("action_key", i7);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.O.getSearchActivity());
        return intent;
    }

    public final Intent i(Cursor cursor, int i7, String str) {
        int i8;
        String u6;
        try {
            String u7 = m1.u(cursor, "suggest_intent_action");
            if (u7 == null) {
                u7 = this.O.getSuggestIntentAction();
            }
            if (u7 == null) {
                u7 = "android.intent.action.SEARCH";
            }
            String str2 = u7;
            String u8 = m1.u(cursor, "suggest_intent_data");
            if (u8 == null) {
                u8 = this.O.getSuggestIntentData();
            }
            if (u8 != null && (u6 = m1.u(cursor, "suggest_intent_data_id")) != null) {
                u8 = u8 + "/" + Uri.encode(u6);
            }
            return h(str2, u8 == null ? null : Uri.parse(u8), m1.u(cursor, "suggest_intent_extra_data"), m1.u(cursor, "suggest_intent_query"), i7, str);
        } catch (RuntimeException e7) {
            try {
                i8 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i8 = -1;
            }
            Log.w(f1338d0, "Search suggestions cursor at row " + i8 + " returned exception.", e7);
            return null;
        }
    }

    public final Intent j(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.P;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void l() {
        this.f1342b.dismissDropDown();
    }

    public void m() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f1342b);
            return;
        }
        o oVar = f1340f0;
        oVar.b(this.f1342b);
        oVar.a(this.f1342b);
    }

    public final void n(View view, Rect rect) {
        view.getLocationInWindow(this.f1355n);
        getLocationInWindow(this.f1356o);
        int[] iArr = this.f1355n;
        int i7 = iArr[1];
        int[] iArr2 = this.f1356o;
        int i8 = i7 - iArr2[1];
        int i9 = iArr[0] - iArr2[0];
        rect.set(i9, i8, view.getWidth() + i9, view.getHeight() + i8);
    }

    public final CharSequence o(CharSequence charSequence) {
        if (!this.B || this.f1358q == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1342b.getTextSize() * 1.25d);
        this.f1358q.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1358q), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.Q);
        post(this.R);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.y0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (z6) {
            n(this.f1342b, this.f1353l);
            Rect rect = this.f1354m;
            Rect rect2 = this.f1353l;
            rect.set(rect2.left, 0, rect2.right, i10 - i8);
            q qVar = this.f1352k;
            if (qVar != null) {
                qVar.a(this.f1354m, this.f1353l);
                return;
            }
            q qVar2 = new q(this.f1354m, this.f1353l, this.f1342b);
            this.f1352k = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.y0, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        if (r()) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            int i10 = this.I;
            size = i10 > 0 ? Math.min(i10, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.I;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i9 = this.I) > 0) {
            size = Math.min(i9, size);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        S(pVar.f1386k);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1386k = r();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        J();
    }

    public final boolean p() {
        SearchableInfo searchableInfo = this.O;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.O.getVoiceSearchLaunchWebSearch() ? this.f1361t : this.O.getVoiceSearchLaunchRecognizer() ? this.f1362u : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean q() {
        return this.B;
    }

    public boolean r() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i7, Rect rect) {
        if (!this.H && isFocusable()) {
            if (r()) {
                return super.requestFocus(i7, rect);
            }
            boolean requestFocus = this.f1342b.requestFocus(i7, rect);
            if (requestFocus) {
                S(false);
            }
            return requestFocus;
        }
        return false;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.P = bundle;
    }

    public void setIconified(boolean z6) {
        if (z6) {
            z();
        } else {
            D();
        }
    }

    public void setIconifiedByDefault(boolean z6) {
        if (this.B == z6) {
            return;
        }
        this.B = z6;
        S(z6);
        O();
    }

    public void setImeOptions(int i7) {
        this.f1342b.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f1342b.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.I = i7;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f1365x = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1366y = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f1364w = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.f1367z = nVar;
    }

    public void setQueryHint(@d.q0 CharSequence charSequence) {
        this.F = charSequence;
        O();
    }

    public void setQueryRefinementEnabled(boolean z6) {
        this.G = z6;
        m1.a aVar = this.D;
        if (aVar instanceof m1) {
            ((m1) aVar).E(z6 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.O = searchableInfo;
        if (searchableInfo != null) {
            P();
            O();
        }
        boolean p6 = p();
        this.J = p6;
        if (p6) {
            this.f1342b.setPrivateImeOptions(f1339e0);
        }
        S(r());
    }

    public void setSubmitButtonEnabled(boolean z6) {
        this.E = z6;
        S(r());
    }

    public void setSuggestionsAdapter(m1.a aVar) {
        this.D = aVar;
        this.f1342b.setAdapter(aVar);
    }

    public boolean t() {
        return this.G;
    }

    public final boolean u() {
        return (this.E || this.J) && !r();
    }

    public boolean v() {
        return this.E;
    }

    public final void w(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e7) {
            Log.e(f1338d0, "Failed launch activity: " + intent, e7);
        }
    }

    public void x(int i7, String str, String str2) {
        getContext().startActivity(h("android.intent.action.SEARCH", null, null, str2, i7, str));
    }

    public final boolean y(int i7, int i8, String str) {
        Cursor c7 = this.D.c();
        if (c7 == null || !c7.moveToPosition(i7)) {
            return false;
        }
        w(i(c7, i8, str));
        return true;
    }

    public void z() {
        if (!TextUtils.isEmpty(this.f1342b.getText())) {
            this.f1342b.setText("");
            this.f1342b.requestFocus();
            this.f1342b.setImeVisibility(true);
        } else if (this.B) {
            l lVar = this.f1365x;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                S(true);
            }
        }
    }

    public SearchView(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.N2);
    }

    public SearchView(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f1353l = new Rect();
        this.f1354m = new Rect();
        this.f1355n = new int[2];
        this.f1356o = new int[2];
        this.Q = new b();
        this.R = new c();
        this.S = new WeakHashMap<>();
        f fVar = new f();
        this.T = fVar;
        this.U = new g();
        h hVar = new h();
        this.V = hVar;
        i iVar = new i();
        this.W = iVar;
        j jVar = new j();
        this.f1341a0 = jVar;
        this.f1343b0 = new a();
        t1 G = t1.G(context, attributeSet, a.m.f9442b5, i7, 0);
        androidx.core.view.u1.z1(this, context, a.m.f9442b5, attributeSet, G.B(), i7, 0);
        LayoutInflater.from(context).inflate(G.u(a.m.f9581t5, a.j.f9219z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.g.f9140e0);
        this.f1342b = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1344c = findViewById(a.g.f9132a0);
        View findViewById = findViewById(a.g.f9138d0);
        this.f1345d = findViewById;
        View findViewById2 = findViewById(a.g.f9160o0);
        this.f1346e = findViewById2;
        ImageView imageView = (ImageView) findViewById(a.g.Y);
        this.f1347f = imageView;
        ImageView imageView2 = (ImageView) findViewById(a.g.f9134b0);
        this.f1348g = imageView2;
        ImageView imageView3 = (ImageView) findViewById(a.g.Z);
        this.f1349h = imageView3;
        ImageView imageView4 = (ImageView) findViewById(a.g.f9142f0);
        this.f1350i = imageView4;
        ImageView imageView5 = (ImageView) findViewById(a.g.f9136c0);
        this.f1357p = imageView5;
        androidx.core.view.u1.I1(findViewById, G.h(a.m.f9588u5));
        androidx.core.view.u1.I1(findViewById2, G.h(a.m.f9623z5));
        imageView.setImageDrawable(G.h(a.m.f9609x5));
        imageView2.setImageDrawable(G.h(a.m.f9553p5));
        imageView3.setImageDrawable(G.h(a.m.f9530m5));
        imageView4.setImageDrawable(G.h(a.m.C5));
        imageView5.setImageDrawable(G.h(a.m.f9609x5));
        this.f1358q = G.h(a.m.f9602w5);
        y1.a(imageView, getResources().getString(a.k.f9241v));
        this.f1359r = G.u(a.m.A5, a.j.f9218y);
        this.f1360s = G.u(a.m.f9538n5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1343b0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.U);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(G.a(a.m.f9574s5, true));
        int g7 = G.g(a.m.f9466e5, -1);
        if (g7 != -1) {
            setMaxWidth(g7);
        }
        this.f1363v = G.x(a.m.f9546o5);
        this.F = G.x(a.m.f9595v5);
        int o6 = G.o(a.m.f9498i5, -1);
        if (o6 != -1) {
            setImeOptions(o6);
        }
        int o7 = G.o(a.m.f9490h5, -1);
        if (o7 != -1) {
            setInputType(o7);
        }
        setFocusable(G.a(a.m.f9458d5, true));
        G.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1361t = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1362u = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1351j = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        S(this.B);
        O();
    }
}