package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.y0;
import androidx.core.view.u1;
import androidx.core.widget.NestedScrollView;
import d.q0;
import f.a;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler R;

    /* renamed from: a  reason: collision with root package name */
    public final Context f624a;

    /* renamed from: b  reason: collision with root package name */
    public final o f625b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f626c;

    /* renamed from: d  reason: collision with root package name */
    public final int f627d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f628e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f629f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f630g;

    /* renamed from: h  reason: collision with root package name */
    public View f631h;

    /* renamed from: i  reason: collision with root package name */
    public int f632i;

    /* renamed from: j  reason: collision with root package name */
    public int f633j;

    /* renamed from: k  reason: collision with root package name */
    public int f634k;

    /* renamed from: l  reason: collision with root package name */
    public int f635l;

    /* renamed from: m  reason: collision with root package name */
    public int f636m;

    /* renamed from: o  reason: collision with root package name */
    public Button f638o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f639p;

    /* renamed from: q  reason: collision with root package name */
    public Message f640q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f641r;

    /* renamed from: s  reason: collision with root package name */
    public Button f642s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f643t;

    /* renamed from: u  reason: collision with root package name */
    public Message f644u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f645v;

    /* renamed from: w  reason: collision with root package name */
    public Button f646w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f647x;

    /* renamed from: y  reason: collision with root package name */
    public Message f648y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f649z;

    /* renamed from: n  reason: collision with root package name */
    public boolean f637n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final View.OnClickListener S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: b  reason: collision with root package name */
        public final int f650b;

        /* renamed from: c  reason: collision with root package name */
        public final int f651c;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void a(boolean z6, boolean z7) {
            if (z7 && z6) {
                return;
            }
            setPadding(getPaddingLeft(), z6 ? getPaddingTop() : this.f650b, getPaddingRight(), z7 ? getPaddingBottom() : this.f651c);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.Y4);
            this.f651c = obtainStyledAttributes.getDimensionPixelOffset(a.m.Z4, -1);
            this.f650b = obtainStyledAttributes.getDimensionPixelOffset(a.m.f9434a5, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f638o || (message3 = alertController.f640q) == null) ? (view != alertController.f642s || (message2 = alertController.f644u) == null) ? (view != alertController.f646w || (message = alertController.f648y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f625b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public class b implements NestedScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f653a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f654b;

        public b(View view, View view2) {
            this.f653a = view;
            this.f654b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10) {
            AlertController.g(nestedScrollView, this.f653a, this.f654b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ View f656k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ View f657l;

        public c(View view, View view2) {
            this.f656k = view;
            this.f657l = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f656k, this.f657l);
        }
    }

    /* loaded from: classes.dex */
    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f659a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f660b;

        public d(View view, View view2) {
            this.f659a = view;
            this.f660b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i7, int i8, int i9) {
            AlertController.g(absListView, this.f659a, this.f660b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i7) {
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ View f662k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ View f663l;

        public e(View view, View view2) {
            this.f662k = view;
            this.f663l = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f630g, this.f662k, this.f663l);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public boolean N;
        public AdapterView.OnItemSelectedListener O;
        public e P;

        /* renamed from: a  reason: collision with root package name */
        public final Context f665a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f666b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f668d;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f670f;

        /* renamed from: g  reason: collision with root package name */
        public View f671g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f672h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f673i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f674j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f675k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f676l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f677m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f678n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f679o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f680p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f681q;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f683s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f684t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f685u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f686v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f687w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f688x;

        /* renamed from: y  reason: collision with root package name */
        public int f689y;

        /* renamed from: z  reason: collision with root package name */
        public View f690z;

        /* renamed from: c  reason: collision with root package name */
        public int f667c = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f669e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean Q = true;

        /* renamed from: r  reason: collision with root package name */
        public boolean f682r = true;

        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f691b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i7, int i8, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i7, i8, charSequenceArr);
                this.f691b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i7, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i7, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i7]) {
                    this.f691b.setItemChecked(i7, true);
                }
                return view2;
            }
        }

        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: b  reason: collision with root package name */
            public final int f693b;

            /* renamed from: c  reason: collision with root package name */
            public final int f694c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f695d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ AlertController f696e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z6, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z6);
                this.f695d = recycleListView;
                this.f696e = alertController;
                Cursor cursor2 = getCursor();
                this.f693b = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f694c = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f693b));
                this.f695d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f694c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f666b.inflate(this.f696e.M, viewGroup, false);
            }
        }

        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AlertController f698b;

            public c(AlertController alertController) {
                this.f698b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
                f.this.f688x.onClick(this.f698b.f625b, i7);
                if (f.this.H) {
                    return;
                }
                this.f698b.f625b.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ RecycleListView f700b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ AlertController f701c;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f700b = recycleListView;
                this.f701c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i7] = this.f700b.isItemChecked(i7);
                }
                f.this.J.onClick(this.f701c.f625b, i7, this.f700b.isItemChecked(i7));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f665a = context;
            this.f666b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            View view = this.f671g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f670f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f668d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i7 = this.f667c;
                if (i7 != 0) {
                    alertController.o(i7);
                }
                int i8 = this.f669e;
                if (i8 != 0) {
                    alertController.o(alertController.d(i8));
                }
            }
            CharSequence charSequence2 = this.f672h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f673i;
            if (charSequence3 != null || this.f674j != null) {
                alertController.l(-1, charSequence3, this.f675k, null, this.f674j);
            }
            CharSequence charSequence4 = this.f676l;
            if (charSequence4 != null || this.f677m != null) {
                alertController.l(-2, charSequence4, this.f678n, null, this.f677m);
            }
            CharSequence charSequence5 = this.f679o;
            if (charSequence5 != null || this.f680p != null) {
                alertController.l(-3, charSequence5, this.f681q, null, this.f680p);
            }
            if (this.f686v != null || this.K != null || this.f687w != null) {
                b(alertController);
            }
            View view2 = this.f690z;
            if (view2 != null) {
                if (this.E) {
                    alertController.v(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.u(view2);
                    return;
                }
            }
            int i9 = this.f689y;
            if (i9 != 0) {
                alertController.t(i9);
            }
        }

        public final void b(AlertController alertController) {
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f666b.inflate(alertController.L, (ViewGroup) null);
            if (this.G) {
                listAdapter = this.K == null ? new a(this.f665a, alertController.M, 16908308, this.f686v, recycleListView) : new b(this.f665a, this.K, false, recycleListView, alertController);
            } else {
                int i7 = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f665a, i7, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    listAdapter = this.f687w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f665a, i7, 16908308, this.f686v);
                    }
                }
            }
            e eVar = this.P;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.H = listAdapter;
            alertController.I = this.I;
            if (this.f688x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f630g = recycleListView;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends Handler {

        /* renamed from: b  reason: collision with root package name */
        public static final int f703b = 1;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f704a;

        public g(DialogInterface dialogInterface) {
            this.f704a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == -3 || i7 == -2 || i7 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f704a.get(), message.what);
            } else if (i7 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i7, int i8, CharSequence[] charSequenceArr) {
            super(context, i7, i8, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, o oVar, Window window) {
        this.f624a = context;
        this.f625b = oVar;
        this.f626c = window;
        this.R = new g(oVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a.m.T, a.b.M, 0);
        this.J = obtainStyledAttributes.getResourceId(a.m.U, 0);
        this.K = obtainStyledAttributes.getResourceId(a.m.W, 0);
        this.L = obtainStyledAttributes.getResourceId(a.m.Y, 0);
        this.M = obtainStyledAttributes.getResourceId(a.m.Z, 0);
        this.N = obtainStyledAttributes.getResourceId(a.m.f9437b0, 0);
        this.O = obtainStyledAttributes.getResourceId(a.m.X, 0);
        this.P = obtainStyledAttributes.getBoolean(a.m.f9429a0, true);
        this.f627d = obtainStyledAttributes.getDimensionPixelSize(a.m.V, 0);
        obtainStyledAttributes.recycle();
        oVar.supportRequestWindowFeature(1);
    }

    public static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.L, typedValue, true);
        return typedValue.data != 0;
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f626c.findViewById(a.g.O);
        View findViewById4 = findViewById3.findViewById(a.g.f9174v0);
        View findViewById5 = findViewById3.findViewById(a.g.f9171u);
        View findViewById6 = findViewById3.findViewById(a.g.f9163q);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(a.g.f9175w);
        y(viewGroup);
        View findViewById7 = viewGroup.findViewById(a.g.f9174v0);
        View findViewById8 = viewGroup.findViewById(a.g.f9171u);
        View findViewById9 = viewGroup.findViewById(a.g.f9163q);
        ViewGroup j7 = j(findViewById7, findViewById4);
        ViewGroup j8 = j(findViewById8, findViewById5);
        ViewGroup j9 = j(findViewById9, findViewById6);
        x(j8);
        w(j9);
        z(j7);
        boolean z6 = viewGroup.getVisibility() != 8;
        boolean z7 = (j7 == null || j7.getVisibility() == 8) ? false : 1;
        boolean z8 = (j9 == null || j9.getVisibility() == 8) ? false : true;
        if (!z8 && j8 != null && (findViewById2 = j8.findViewById(a.g.f9164q0)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z7) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f629f == null && this.f630g == null) ? null : j7.findViewById(a.g.f9170t0);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (j8 != null && (findViewById = j8.findViewById(a.g.f9166r0)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f630g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z7, z8);
        }
        if (!z6) {
            View view = this.f630g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                r(j8, view, z7 | (z8 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f630g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i7 = this.I;
        if (i7 > -1) {
            listView2.setItemChecked(i7, true);
            listView2.setSelection(i7);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button c(int i7) {
        if (i7 != -3) {
            if (i7 != -2) {
                if (i7 != -1) {
                    return null;
                }
                return this.f638o;
            }
            return this.f642s;
        }
        return this.f646w;
    }

    public int d(int i7) {
        TypedValue typedValue = new TypedValue();
        this.f624a.getTheme().resolveAttribute(i7, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f630g;
    }

    public void f() {
        this.f625b.setContentView(k());
        A();
    }

    public boolean h(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.k(keyEvent);
    }

    public boolean i(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.k(keyEvent);
    }

    @q0
    public final ViewGroup j(@q0 View view, @q0 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int k() {
        int i7 = this.K;
        return (i7 != 0 && this.Q == 1) ? i7 : this.J;
    }

    public void l(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i7, onClickListener);
        }
        if (i7 == -3) {
            this.f647x = charSequence;
            this.f648y = message;
            this.f649z = drawable;
        } else if (i7 == -2) {
            this.f643t = charSequence;
            this.f644u = message;
            this.f645v = drawable;
        } else if (i7 != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f639p = charSequence;
            this.f640q = message;
            this.f641r = drawable;
        }
    }

    public void m(int i7) {
        this.Q = i7;
    }

    public void n(View view) {
        this.G = view;
    }

    public void o(int i7) {
        this.C = null;
        this.B = i7;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i7 == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
        }
    }

    public void p(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
        }
    }

    public void q(CharSequence charSequence) {
        this.f629f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void r(ViewGroup viewGroup, View view, int i7, int i8) {
        View findViewById = this.f626c.findViewById(a.g.U);
        View findViewById2 = this.f626c.findViewById(a.g.T);
        u1.p2(view, i7, i8);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    public void s(CharSequence charSequence) {
        this.f628e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i7) {
        this.f631h = null;
        this.f632i = i7;
        this.f637n = false;
    }

    public void u(View view) {
        this.f631h = view;
        this.f632i = 0;
        this.f637n = false;
    }

    public void v(View view, int i7, int i8, int i9, int i10) {
        this.f631h = view;
        this.f632i = 0;
        this.f637n = true;
        this.f633j = i7;
        this.f634k = i8;
        this.f635l = i9;
        this.f636m = i10;
    }

    public final void w(ViewGroup viewGroup) {
        boolean z6;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f638o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f639p) && this.f641r == null) {
            this.f638o.setVisibility(8);
            z6 = false;
        } else {
            this.f638o.setText(this.f639p);
            Drawable drawable = this.f641r;
            if (drawable != null) {
                int i7 = this.f627d;
                drawable.setBounds(0, 0, i7, i7);
                this.f638o.setCompoundDrawables(this.f641r, null, null, null);
            }
            this.f638o.setVisibility(0);
            z6 = true;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f642s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f643t) && this.f645v == null) {
            this.f642s.setVisibility(8);
        } else {
            this.f642s.setText(this.f643t);
            Drawable drawable2 = this.f645v;
            if (drawable2 != null) {
                int i8 = this.f627d;
                drawable2.setBounds(0, 0, i8, i8);
                this.f642s.setCompoundDrawables(this.f645v, null, null, null);
            }
            this.f642s.setVisibility(0);
            z6 |= true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f646w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f647x) && this.f649z == null) {
            this.f646w.setVisibility(8);
        } else {
            this.f646w.setText(this.f647x);
            Drawable drawable3 = this.f649z;
            if (drawable3 != null) {
                int i9 = this.f627d;
                drawable3.setBounds(0, 0, i9, i9);
                this.f646w.setCompoundDrawables(this.f649z, null, null, null);
            }
            this.f646w.setVisibility(0);
            z6 |= true;
        }
        if (B(this.f624a)) {
            if (z6) {
                b(this.f638o);
            } else if (z6) {
                b(this.f642s);
            } else if (z6) {
                b(this.f646w);
            }
        }
        if (z6) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f626c.findViewById(a.g.V);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f629f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f630g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f630g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void y(ViewGroup viewGroup) {
        View view = this.f631h;
        if (view == null) {
            view = this.f632i != 0 ? LayoutInflater.from(this.f624a).inflate(this.f632i, viewGroup, false) : null;
        }
        boolean z6 = view != null;
        if (!z6 || !a(view)) {
            this.f626c.setFlags(131072, 131072);
        }
        if (!z6) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f626c.findViewById(a.g.f9173v);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f637n) {
            frameLayout.setPadding(this.f633j, this.f634k, this.f635l, this.f636m);
        }
        if (this.f630g != null) {
            ((LinearLayout.LayoutParams) ((y0.b) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void z(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f626c.findViewById(a.g.f9172u0).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f626c.findViewById(16908294);
        if ((!TextUtils.isEmpty(this.f628e)) != true || !this.P) {
            this.f626c.findViewById(a.g.f9172u0).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f626c.findViewById(a.g.f9161p);
        this.E = textView;
        textView.setText(this.f628e);
        int i7 = this.B;
        if (i7 != 0) {
            this.D.setImageResource(i7);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }
}
