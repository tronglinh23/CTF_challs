package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.d;
import d.b1;
import f.a;
/* loaded from: classes.dex */
public class b0 extends Spinner implements androidx.core.view.r1 {
    @SuppressLint({"ResourceType"})
    @d.h1

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f1432j = {16843505};

    /* renamed from: k  reason: collision with root package name */
    public static final int f1433k = 15;

    /* renamed from: l  reason: collision with root package name */
    public static final String f1434l = "AppCompatSpinner";

    /* renamed from: m  reason: collision with root package name */
    public static final int f1435m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f1436n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1437o = -1;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.widget.f f1438b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1439c;

    /* renamed from: d  reason: collision with root package name */
    public x0 f1440d;

    /* renamed from: e  reason: collision with root package name */
    public SpinnerAdapter f1441e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1442f;

    /* renamed from: g  reason: collision with root package name */
    public j f1443g;

    /* renamed from: h  reason: collision with root package name */
    public int f1444h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f1445i;

    /* loaded from: classes.dex */
    public class a extends x0 {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ h f1446k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, h hVar) {
            super(view);
            this.f1446k = hVar;
        }

        @Override // androidx.appcompat.widget.x0
        public androidx.appcompat.view.menu.q b() {
            return this.f1446k;
        }

        @Override // androidx.appcompat.widget.x0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (b0.this.getInternalPopup().a()) {
                return true;
            }
            b0.this.b();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b0.this.getInternalPopup().a()) {
                b0.this.b();
            }
            ViewTreeObserver viewTreeObserver = b0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    @d.w0(16)
    /* loaded from: classes.dex */
    public static final class c {
        @d.u
        public static void a(@d.o0 ViewTreeObserver viewTreeObserver, @d.q0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @d.w0(17)
    /* loaded from: classes.dex */
    public static final class d {
        @d.u
        public static int a(@d.o0 View view) {
            return view.getTextAlignment();
        }

        @d.u
        public static int b(@d.o0 View view) {
            return view.getTextDirection();
        }

        @d.u
        public static void c(@d.o0 View view, int i7) {
            view.setTextAlignment(i7);
        }

        @d.u
        public static void d(@d.o0 View view, int i7) {
            view.setTextDirection(i7);
        }
    }

    @d.w0(23)
    /* loaded from: classes.dex */
    public static final class e {
        @d.u
        public static void a(@d.o0 ThemedSpinnerAdapter themedSpinnerAdapter, @d.q0 Resources.Theme theme) {
            if (g1.n.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    @d.l1
    /* loaded from: classes.dex */
    public class f implements j, DialogInterface.OnClickListener {
        @d.l1

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.app.d f1449b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f1450c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f1451d;

        public f() {
        }

        @Override // androidx.appcompat.widget.b0.j
        public boolean a() {
            androidx.appcompat.app.d dVar = this.f1449b;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.b0.j
        public int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.b0.j
        public void dismiss() {
            androidx.appcompat.app.d dVar = this.f1449b;
            if (dVar != null) {
                dVar.dismiss();
                this.f1449b = null;
            }
        }

        @Override // androidx.appcompat.widget.b0.j
        public Drawable e() {
            return null;
        }

        @Override // androidx.appcompat.widget.b0.j
        public void g(CharSequence charSequence) {
            this.f1451d = charSequence;
        }

        @Override // androidx.appcompat.widget.b0.j
        public void h(int i7) {
            Log.e(b0.f1434l, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.b0.j
        public void i(int i7) {
            Log.e(b0.f1434l, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.b0.j
        public void j(int i7) {
            Log.e(b0.f1434l, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.b0.j
        public void k(int i7, int i8) {
            if (this.f1450c == null) {
                return;
            }
            d.a aVar = new d.a(b0.this.getPopupContext());
            CharSequence charSequence = this.f1451d;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.d create = aVar.setSingleChoiceItems(this.f1450c, b0.this.getSelectedItemPosition(), this).create();
            this.f1449b = create;
            ListView g7 = create.g();
            d.d(g7, i7);
            d.c(g7, i8);
            this.f1449b.show();
        }

        @Override // androidx.appcompat.widget.b0.j
        public int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.b0.j
        public int m() {
            return 0;
        }

        @Override // androidx.appcompat.widget.b0.j
        public CharSequence n() {
            return this.f1451d;
        }

        @Override // androidx.appcompat.widget.b0.j
        public void o(ListAdapter listAdapter) {
            this.f1450c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            b0.this.setSelection(i7);
            if (b0.this.getOnItemClickListener() != null) {
                b0.this.performItemClick(null, i7, this.f1450c.getItemId(i7));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.b0.j
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e(b0.f1434l, "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* loaded from: classes.dex */
    public static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        public SpinnerAdapter f1453b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f1454c;

        public g(@d.q0 SpinnerAdapter spinnerAdapter, @d.q0 Resources.Theme theme) {
            this.f1453b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1454c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof p1) {
                    p1 p1Var = (p1) spinnerAdapter;
                    if (p1Var.getDropDownViewTheme() == null) {
                        p1Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1454c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1453b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1453b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i7) {
            SpinnerAdapter spinnerAdapter = this.f1453b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i7);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            SpinnerAdapter spinnerAdapter = this.f1453b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i7);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i7) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            return getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1453b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i7) {
            ListAdapter listAdapter = this.f1454c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i7);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1453b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1453b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @d.l1
    /* loaded from: classes.dex */
    public class h extends z0 implements j {
        public CharSequence U;
        public ListAdapter V;
        public final Rect W;
        public int X;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ b0 f1455b;

            public a(b0 b0Var) {
                this.f1455b = b0Var;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
                b0.this.setSelection(i7);
                if (b0.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    b0.this.performItemClick(view, i7, hVar.V.getItemId(i7));
                }
                h.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.p0(b0.this)) {
                    h.this.dismiss();
                    return;
                }
                h.this.o0();
                h.super.show();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1458b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1458b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = b0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1458b);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.W = new Rect();
            Q(b0.this);
            b0(true);
            h0(0);
            d0(new a(b0.this));
        }

        @Override // androidx.appcompat.widget.b0.j
        public void g(CharSequence charSequence) {
            this.U = charSequence;
        }

        @Override // androidx.appcompat.widget.b0.j
        public void i(int i7) {
            this.X = i7;
        }

        @Override // androidx.appcompat.widget.b0.j
        public void k(int i7, int i8) {
            ViewTreeObserver viewTreeObserver;
            boolean a7 = a();
            o0();
            Y(2);
            super.show();
            ListView f7 = f();
            f7.setChoiceMode(1);
            d.d(f7, i7);
            d.c(f7, i8);
            j0(b0.this.getSelectedItemPosition());
            if (a7 || (viewTreeObserver = b0.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            c0(new c(bVar));
        }

        @Override // androidx.appcompat.widget.b0.j
        public int m() {
            return this.X;
        }

        @Override // androidx.appcompat.widget.b0.j
        public CharSequence n() {
            return this.U;
        }

        @Override // androidx.appcompat.widget.z0, androidx.appcompat.widget.b0.j
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.V = listAdapter;
        }

        public void o0() {
            int i7;
            Drawable e7 = e();
            if (e7 != null) {
                e7.getPadding(b0.this.f1445i);
                i7 = e2.b(b0.this) ? b0.this.f1445i.right : -b0.this.f1445i.left;
            } else {
                Rect rect = b0.this.f1445i;
                rect.right = 0;
                rect.left = 0;
                i7 = 0;
            }
            int paddingLeft = b0.this.getPaddingLeft();
            int paddingRight = b0.this.getPaddingRight();
            int width = b0.this.getWidth();
            b0 b0Var = b0.this;
            int i8 = b0Var.f1444h;
            if (i8 == -2) {
                int a7 = b0Var.a((SpinnerAdapter) this.V, e());
                int i9 = b0.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = b0.this.f1445i;
                int i10 = (i9 - rect2.left) - rect2.right;
                if (a7 > i10) {
                    a7 = i10;
                }
                S(Math.max(a7, (width - paddingLeft) - paddingRight));
            } else if (i8 == -1) {
                S((width - paddingLeft) - paddingRight);
            } else {
                S(i8);
            }
            j(e2.b(b0.this) ? i7 + (((width - paddingRight) - F()) - m()) : i7 + paddingLeft + m());
        }

        public boolean p0(View view) {
            return androidx.core.view.u1.O0(view) && view.getGlobalVisibleRect(this.W);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public boolean f1460k;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i7) {
                return new i[i7];
            }
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f1460k ? (byte) 1 : (byte) 0);
        }

        public i(Parcel parcel) {
            super(parcel);
            this.f1460k = parcel.readByte() != 0;
        }
    }

    @d.l1
    /* loaded from: classes.dex */
    public interface j {
        boolean a();

        int b();

        void dismiss();

        Drawable e();

        void g(CharSequence charSequence);

        void h(int i7);

        void i(int i7);

        void j(int i7);

        void k(int i7, int i8);

        int l();

        int m();

        CharSequence n();

        void o(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    public b0(@d.o0 Context context) {
        this(context, (AttributeSet) null);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i8 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i8 = Math.max(i8, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1445i);
            Rect rect = this.f1445i;
            return i8 + rect.left + rect.right;
        }
        return i8;
    }

    public void b() {
        this.f1443g.k(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.f fVar = this.f1438b;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f1443g;
        return jVar != null ? jVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f1443g;
        return jVar != null ? jVar.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1443g != null ? this.f1444h : super.getDropDownWidth();
    }

    @d.l1
    public final j getInternalPopup() {
        return this.f1443g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f1443g;
        return jVar != null ? jVar.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1439c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f1443g;
        return jVar != null ? jVar.n() : super.getPrompt();
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.f fVar = this.f1438b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.f fVar = this.f1438b;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1443g;
        if (jVar == null || !jVar.a()) {
            return;
        }
        this.f1443g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f1443g == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f1460k || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f1443g;
        iVar.f1460k = jVar != null && jVar.a();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        x0 x0Var = this.f1440d;
        if (x0Var == null || !x0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f1443g;
        if (jVar != null) {
            if (jVar.a()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@d.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.f fVar = this.f1438b;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@d.v int i7) {
        super.setBackgroundResource(i7);
        androidx.appcompat.widget.f fVar = this.f1438b;
        if (fVar != null) {
            fVar.g(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        j jVar = this.f1443g;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i7);
            return;
        }
        jVar.i(i7);
        this.f1443g.j(i7);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        j jVar = this.f1443g;
        if (jVar != null) {
            jVar.h(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f1443g != null) {
            this.f1444h = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f1443g;
        if (jVar != null) {
            jVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@d.v int i7) {
        setPopupBackgroundDrawable(g.a.b(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f1443g;
        if (jVar != null) {
            jVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@d.q0 ColorStateList colorStateList) {
        androidx.appcompat.widget.f fVar = this.f1438b;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@d.q0 PorterDuff.Mode mode) {
        androidx.appcompat.widget.f fVar = this.f1438b;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    public b0(@d.o0 Context context, int i7) {
        this(context, null, a.b.Y2, i7);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1442f) {
            this.f1441e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1443g != null) {
            Context context = this.f1439c;
            if (context == null) {
                context = getContext();
            }
            this.f1443g.o(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public b0(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.Y2);
    }

    public b0(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, -1);
    }

    public b0(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7, int i8) {
        this(context, attributeSet, i7, i8, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 == null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.appcompat.widget.b0, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(@d.o0 android.content.Context r7, @d.q0 android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
