package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.d;
import d.b1;
import f.a;
@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements d.a {

    /* renamed from: b  reason: collision with root package name */
    public final f f1287b;

    /* renamed from: c  reason: collision with root package name */
    public final g f1288c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1289d;

    /* renamed from: e  reason: collision with root package name */
    public final Drawable f1290e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f1291f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f1292g;

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f1293h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f1294i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1295j;

    /* renamed from: k  reason: collision with root package name */
    public androidx.core.view.b f1296k;

    /* renamed from: l  reason: collision with root package name */
    public final DataSetObserver f1297l;

    /* renamed from: m  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1298m;

    /* renamed from: n  reason: collision with root package name */
    public z0 f1299n;

    /* renamed from: o  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1300o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1301p;

    /* renamed from: q  reason: collision with root package name */
    public int f1302q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1303r;

    /* renamed from: s  reason: collision with root package name */
    public int f1304s;

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        public static final int[] f1305b = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            t1 F = t1.F(context, attributeSet, f1305b);
            setBackgroundDrawable(F.h(0));
            F.I();
        }
    }

    /* loaded from: classes.dex */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1287b.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1287b.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().show();
                androidx.core.view.b bVar = ActivityChooserView.this.f1296k;
                if (bVar != null) {
                    bVar.m(true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends View.AccessibilityDelegate {
        public c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            h1.f0.g2(accessibilityNodeInfo).Y0(true);
        }
    }

    /* loaded from: classes.dex */
    public class d extends x0 {
        public d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.x0
        public androidx.appcompat.view.menu.q b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.x0
        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // androidx.appcompat.widget.x0
        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    /* loaded from: classes.dex */
    public class f extends BaseAdapter {

        /* renamed from: h  reason: collision with root package name */
        public static final int f1311h = Integer.MAX_VALUE;

        /* renamed from: i  reason: collision with root package name */
        public static final int f1312i = 4;

        /* renamed from: j  reason: collision with root package name */
        public static final int f1313j = 0;

        /* renamed from: k  reason: collision with root package name */
        public static final int f1314k = 1;

        /* renamed from: l  reason: collision with root package name */
        public static final int f1315l = 3;

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.widget.d f1316b;

        /* renamed from: c  reason: collision with root package name */
        public int f1317c = 4;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1318d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1319e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1320f;

        public f() {
        }

        public int a() {
            return this.f1316b.f();
        }

        public androidx.appcompat.widget.d b() {
            return this.f1316b;
        }

        public ResolveInfo c() {
            return this.f1316b.h();
        }

        public int d() {
            return this.f1316b.j();
        }

        public boolean e() {
            return this.f1318d;
        }

        public int f() {
            int i7 = this.f1317c;
            this.f1317c = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i8 = 0;
            View view = null;
            for (int i9 = 0; i9 < count; i9++) {
                view = getView(i9, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i8 = Math.max(i8, view.getMeasuredWidth());
            }
            this.f1317c = i7;
            return i8;
        }

        public void g(androidx.appcompat.widget.d dVar) {
            androidx.appcompat.widget.d b7 = ActivityChooserView.this.f1287b.b();
            if (b7 != null && ActivityChooserView.this.isShown()) {
                b7.unregisterObserver(ActivityChooserView.this.f1297l);
            }
            this.f1316b = dVar;
            if (dVar != null && ActivityChooserView.this.isShown()) {
                dVar.registerObserver(ActivityChooserView.this.f1297l);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int f7 = this.f1316b.f();
            if (!this.f1318d && this.f1316b.h() != null) {
                f7--;
            }
            int min = Math.min(f7, this.f1317c);
            return this.f1320f ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i7) {
            int itemViewType = getItemViewType(i7);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f1318d && this.f1316b.h() != null) {
                i7++;
            }
            return this.f1316b.e(i7);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            return i7;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i7) {
            return (this.f1320f && i7 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i7);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view == null || view.getId() != 1) {
                        View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.j.f9201h, viewGroup, false);
                        inflate.setId(1);
                        ((TextView) inflate.findViewById(a.g.f9168s0)).setText(ActivityChooserView.this.getContext().getString(a.k.f9224e));
                        return inflate;
                    }
                    return view;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != a.g.H) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.j.f9201h, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(a.g.E);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i7);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(a.g.f9168s0)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f1318d && i7 == 0 && this.f1319e) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i7) {
            if (this.f1317c != i7) {
                this.f1317c = i7;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z6, boolean z7) {
            if (this.f1318d == z6 && this.f1319e == z7) {
                return;
            }
            this.f1318d = z6;
            this.f1319e = z7;
            notifyDataSetChanged();
        }

        public void j(boolean z6) {
            if (this.f1320f != z6) {
                this.f1320f = z6;
                notifyDataSetChanged();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        public final void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1300o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f1293h) {
                if (view != activityChooserView.f1291f) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f1301p = false;
                activityChooserView.d(activityChooserView.f1302q);
                return;
            }
            activityChooserView.a();
            Intent b7 = ActivityChooserView.this.f1287b.b().b(ActivityChooserView.this.f1287b.b().g(ActivityChooserView.this.f1287b.c()));
            if (b7 != null) {
                b7.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(b7);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            androidx.core.view.b bVar = ActivityChooserView.this.f1296k;
            if (bVar != null) {
                bVar.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i7);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.d(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f1301p) {
                if (i7 > 0) {
                    activityChooserView.f1287b.b().r(i7);
                    return;
                }
                return;
            }
            if (!activityChooserView.f1287b.e()) {
                i7++;
            }
            Intent b7 = ActivityChooserView.this.f1287b.b().b(i7);
            if (b7 != null) {
                b7.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(b7);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f1293h) {
                if (activityChooserView.f1287b.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f1301p = true;
                    activityChooserView2.d(activityChooserView2.f1302q);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(@d.o0 Context context) {
        this(context, null);
    }

    public boolean a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f1298m);
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean b() {
        return getListPopupWindow().a();
    }

    public boolean c() {
        if (b() || !this.f1303r) {
            return false;
        }
        this.f1301p = false;
        d(this.f1302q);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int, boolean] */
    public void d(int i7) {
        if (this.f1287b.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1298m);
        ?? r02 = this.f1293h.getVisibility() == 0 ? 1 : 0;
        int a7 = this.f1287b.a();
        if (i7 == Integer.MAX_VALUE || a7 <= i7 + r02) {
            this.f1287b.j(false);
            this.f1287b.h(i7);
        } else {
            this.f1287b.j(true);
            this.f1287b.h(i7 - 1);
        }
        z0 listPopupWindow = getListPopupWindow();
        if (listPopupWindow.a()) {
            return;
        }
        if (this.f1301p || r02 == 0) {
            this.f1287b.i(true, r02);
        } else {
            this.f1287b.i(false, false);
        }
        listPopupWindow.S(Math.min(this.f1287b.f(), this.f1295j));
        listPopupWindow.show();
        androidx.core.view.b bVar = this.f1296k;
        if (bVar != null) {
            bVar.m(true);
        }
        listPopupWindow.f().setContentDescription(getContext().getString(a.k.f9225f));
        listPopupWindow.f().setSelector(new ColorDrawable(0));
    }

    public void e() {
        if (this.f1287b.getCount() > 0) {
            this.f1291f.setEnabled(true);
        } else {
            this.f1291f.setEnabled(false);
        }
        int a7 = this.f1287b.a();
        int d7 = this.f1287b.d();
        if (a7 == 1 || (a7 > 1 && d7 > 0)) {
            this.f1293h.setVisibility(0);
            ResolveInfo c7 = this.f1287b.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1294i.setImageDrawable(c7.loadIcon(packageManager));
            if (this.f1304s != 0) {
                this.f1293h.setContentDescription(getContext().getString(this.f1304s, c7.loadLabel(packageManager)));
            }
        } else {
            this.f1293h.setVisibility(8);
        }
        if (this.f1293h.getVisibility() == 0) {
            this.f1289d.setBackgroundDrawable(this.f1290e);
        } else {
            this.f1289d.setBackgroundDrawable(null);
        }
    }

    @d.b1({b1.a.LIBRARY})
    public androidx.appcompat.widget.d getDataModel() {
        return this.f1287b.b();
    }

    public z0 getListPopupWindow() {
        if (this.f1299n == null) {
            z0 z0Var = new z0(getContext());
            this.f1299n = z0Var;
            z0Var.o(this.f1287b);
            this.f1299n.Q(this);
            this.f1299n.b0(true);
            this.f1299n.d0(this.f1288c);
            this.f1299n.c0(this.f1288c);
        }
        return this.f1299n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.d b7 = this.f1287b.b();
        if (b7 != null) {
            b7.registerObserver(this.f1297l);
        }
        this.f1303r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.d b7 = this.f1287b.b();
        if (b7 != null) {
            b7.unregisterObserver(this.f1297l);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1298m);
        }
        if (b()) {
            a();
        }
        this.f1303r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        this.f1289d.layout(0, 0, i9 - i7, i10 - i8);
        if (b()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        View view = this.f1289d;
        if (this.f1293h.getVisibility() != 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8), 1073741824);
        }
        measureChild(view, i7, i8);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.d.a
    @d.b1({b1.a.LIBRARY})
    public void setActivityChooserModel(androidx.appcompat.widget.d dVar) {
        this.f1287b.g(dVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i7) {
        this.f1304s = i7;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i7) {
        this.f1292g.setContentDescription(getContext().getString(i7));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1292g.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i7) {
        this.f1302q = i7;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1300o = onDismissListener;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setProvider(androidx.core.view.b bVar) {
        this.f1296k = bVar;
    }

    public ActivityChooserView(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f1297l = new a();
        this.f1298m = new b();
        this.f1302q = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.Q, i7, 0);
        androidx.core.view.u1.z1(this, context, a.m.Q, attributeSet, obtainStyledAttributes, i7, 0);
        this.f1302q = obtainStyledAttributes.getInt(a.m.S, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(a.m.R);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(a.j.f9200g, (ViewGroup) this, true);
        g gVar = new g();
        this.f1288c = gVar;
        View findViewById = findViewById(a.g.f9157n);
        this.f1289d = findViewById;
        this.f1290e = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(a.g.f9179y);
        this.f1293h = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        this.f1294i = (ImageView) frameLayout.findViewById(a.g.F);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(a.g.A);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f1291f = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(a.g.F);
        this.f1292g = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f1287b = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f1295j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.e.f9073x));
    }
}
