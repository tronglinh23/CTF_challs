package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.p;
import d.b1;
import f.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.u0 {
    private static final String TAG = "Toolbar";
    private n.a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private i1 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private f mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    g.a mMenuBuilderCallback;
    final androidx.core.view.x0 mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    h mOnMenuItemClickListener;
    private androidx.appcompat.widget.c mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private x1 mWrapper;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.mMenuHostHelper.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.mOnMenuItemClickListener;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    /* loaded from: classes.dex */
    public class c implements g.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean onMenuItemSelected(@d.o0 androidx.appcompat.view.menu.g gVar, @d.o0 MenuItem menuItem) {
            g.a aVar = Toolbar.this.mMenuBuilderCallback;
            return aVar != null && aVar.onMenuItemSelected(gVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void onMenuModeChange(@d.o0 androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.mMenuView.o()) {
                Toolbar.this.mMenuHostHelper.k(gVar);
            }
            g.a aVar = Toolbar.this.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.onMenuModeChange(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    @d.w0(33)
    /* loaded from: classes.dex */
    public static class e {
        @d.u
        @d.q0
        public static OnBackInvokedDispatcher a(@d.o0 View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            return findOnBackInvokedDispatcher;
        }

        @d.u
        @d.o0
        public static OnBackInvokedCallback b(@d.o0 Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.r(runnable);
        }

        @d.u
        public static void c(@d.o0 Object obj, @d.o0 Object obj2) {
            androidx.activity.n.a(obj).registerOnBackInvokedCallback(1000000, androidx.activity.o.a(obj2));
        }

        @d.u
        public static void d(@d.o0 Object obj, @d.o0 Object obj2) {
            androidx.activity.n.a(obj).unregisterOnBackInvokedCallback(androidx.activity.o.a(obj2));
        }
    }

    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.n {

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f1397b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.appcompat.view.menu.j f1398c;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean collapseItemActionView(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof j.c) {
                ((j.c) view).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f1398c = null;
            Toolbar.this.requestLayout();
            jVar.t(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean expandItemActionView(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = jVar.getActionView();
            this.f1398c = jVar;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f715a = (toolbar4.mButtonGravity & g0.f1602o) | androidx.core.view.m0.f3714b;
                generateDefaultLayoutParams.f1403b = 2;
                toolbar4.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            jVar.t(true);
            View view = Toolbar.this.mExpandedActionView;
            if (view instanceof j.c) {
                ((j.c) view).b();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.n
        public androidx.appcompat.view.menu.o getMenuView(ViewGroup viewGroup) {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n
        public void initForMenu(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.j jVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1397b;
            if (gVar2 != null && (jVar = this.f1398c) != null) {
                gVar2.collapseItemActionView(jVar);
            }
            this.f1397b = gVar;
        }

        @Override // androidx.appcompat.view.menu.n
        public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.n
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.n
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.s sVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.n
        public void setCallback(n.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.n
        public void updateMenuView(boolean z6) {
            if (this.f1398c != null) {
                androidx.appcompat.view.menu.g gVar = this.f1397b;
                boolean z7 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            break;
                        } else if (this.f1397b.getItem(i7) == this.f1398c) {
                            z7 = true;
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
                if (z7) {
                    return;
                }
                collapseItemActionView(this.f1397b, this.f1398c);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class i extends o1.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f1404k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1405l;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i7) {
                return new i[i7];
            }
        }

        public i(Parcel parcel) {
            this(parcel, null);
        }

        @Override // o1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f1404k);
            parcel.writeInt(this.f1405l ? 1 : 0);
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1404k = parcel.readInt();
            this.f1405l = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(@d.o0 Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.g(getContext());
    }

    private void t() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    public final void a(List<View> list, int i7) {
        boolean z6 = androidx.core.view.u1.Z(this) == 1;
        int childCount = getChildCount();
        int d7 = androidx.core.view.m0.d(i7, androidx.core.view.u1.Z(this));
        list.clear();
        if (!z6) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1403b == 0 && v(childAt) && h(gVar.f715a) == d7) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1403b == 0 && v(childAt2) && h(gVar2.f715a) == d7) {
                list.add(childAt2);
            }
        }
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // androidx.core.view.u0
    @d.l0
    public void addMenuProvider(@d.o0 androidx.core.view.a1 a1Var) {
        this.mMenuHostHelper.c(a1Var);
    }

    public final void b(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f1403b = 1;
        if (!z6 || this.mExpandedActionView == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.mHiddenViews.add(view);
    }

    public final void c() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new i1();
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.p();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public void collapseActionView() {
        f fVar = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.j jVar = fVar == null ? null : fVar.f1398c;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    public final void d() {
        if (this.mLogoView == null) {
            this.mLogoView = new s(getContext());
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.g();
        }
    }

    public final void e() {
        f();
        if (this.mMenuView.s() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new f();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            gVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            q qVar = new q(getContext(), null, a.b.T3);
            this.mCollapseButtonView = qVar;
            qVar.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f715a = (this.mButtonGravity & g0.f1602o) | androidx.core.view.m0.f3714b;
            generateDefaultLayoutParams.f1403b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new d());
        }
    }

    public final void f() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.t(this.mActionMenuPresenterCallback, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f715a = (this.mButtonGravity & g0.f1602o) | 8388613;
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            b(this.mMenuView, false);
        }
    }

    public final void g() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new q(getContext(), null, a.b.T3);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f715a = (this.mButtonGravity & g0.f1602o) | androidx.core.view.m0.f3714b;
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @d.q0
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @d.q0
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        i1 i1Var = this.mContentInsets;
        if (i1Var != null) {
            return i1Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.mContentInsetEndWithActions;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        i1 i1Var = this.mContentInsets;
        if (i1Var != null) {
            return i1Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        i1 i1Var = this.mContentInsets;
        if (i1Var != null) {
            return i1Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        i1 i1Var = this.mContentInsets;
        if (i1Var != null) {
            return i1Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.mContentInsetStartWithNavigation;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g s6;
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && (s6 = actionMenuView.s()) != null && s6.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.u1.Z(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.u1.Z(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.mMenuView.getMenu();
    }

    @d.b1({b1.a.TESTS})
    @d.q0
    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    @d.q0
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @d.q0
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    @d.q0
    public Drawable getOverflowIcon() {
        e();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    @d.g1
    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    @d.b1({b1.a.TESTS})
    @d.q0
    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    @d.b1({b1.a.TESTS})
    @d.q0
    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public l0 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new x1(this, true);
        }
        return this.mWrapper;
    }

    public final int h(int i7) {
        int Z = androidx.core.view.u1.Z(this);
        int d7 = androidx.core.view.m0.d(i7, Z) & 7;
        return (d7 == 1 || d7 == 3 || d7 == 5) ? d7 : Z == 1 ? 5 : 3;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.mExpandedMenuPresenter;
        return (fVar == null || fVar.f1398c == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.m();
    }

    public final int i(View view, int i7) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int j7 = j(gVar.f715a);
        if (j7 != 48) {
            if (j7 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i9 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i10 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i9 < i10) {
                    i9 = i10;
                } else {
                    int i11 = (((height - paddingBottom) - measuredHeight) - i9) - paddingTop;
                    int i12 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i11 < i12) {
                        i9 = Math.max(0, i9 - (i12 - i11));
                    }
                }
                return paddingTop + i9;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i8;
        }
        return getPaddingTop() - i8;
    }

    public void inflateMenu(@d.m0 int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    @Override // androidx.core.view.u0
    @d.l0
    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        s();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.n();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.o();
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i7 = 0; i7 < lineCount; i7++) {
            if (layout.getEllipsisCount(i7) > 0) {
                return true;
            }
        }
        return false;
    }

    public final int j(int i7) {
        int i8 = i7 & g0.f1602o;
        return (i8 == 16 || i8 == 48 || i8 == 80) ? i8 : this.mGravity & g0.f1602o;
    }

    public final int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.r0.c(marginLayoutParams) + androidx.core.view.r0.b(marginLayoutParams);
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int m(List<View> list, int[] iArr) {
        int i7 = iArr[0];
        int i8 = iArr[1];
        int size = list.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            View view = list.get(i9);
            g gVar = (g) view.getLayoutParams();
            int i11 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i7;
            int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i8;
            int max = Math.max(0, i11);
            int max2 = Math.max(0, i12);
            int max3 = Math.max(0, -i11);
            int max4 = Math.max(0, -i12);
            i10 += max + view.getMeasuredWidth() + max2;
            i9++;
            i8 = max4;
            i7 = max3;
        }
        return i10;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public final int o(View view, int i7, int[] iArr, int i8) {
        g gVar = (g) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i7 + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        int i10 = i(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i10, max + measuredWidth, view.getMeasuredHeight() + i10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr = this.mTempMargins;
        boolean b7 = e2.b(this);
        int i16 = !b7 ? 1 : 0;
        if (v(this.mNavButtonView)) {
            r(this.mNavButtonView, i7, 0, i8, 0, this.mMaxButtonHeight);
            i9 = this.mNavButtonView.getMeasuredWidth() + k(this.mNavButtonView);
            i10 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + l(this.mNavButtonView));
            i11 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (v(this.mCollapseButtonView)) {
            r(this.mCollapseButtonView, i7, 0, i8, 0, this.mMaxButtonHeight);
            i9 = this.mCollapseButtonView.getMeasuredWidth() + k(this.mCollapseButtonView);
            i10 = Math.max(i10, this.mCollapseButtonView.getMeasuredHeight() + l(this.mCollapseButtonView));
            i11 = View.combineMeasuredStates(i11, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i9);
        iArr[b7 ? 1 : 0] = Math.max(0, currentContentInsetStart - i9);
        if (v(this.mMenuView)) {
            r(this.mMenuView, i7, max, i8, 0, this.mMaxButtonHeight);
            i12 = this.mMenuView.getMeasuredWidth() + k(this.mMenuView);
            i10 = Math.max(i10, this.mMenuView.getMeasuredHeight() + l(this.mMenuView));
            i11 = View.combineMeasuredStates(i11, this.mMenuView.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i12);
        iArr[i16] = Math.max(0, currentContentInsetEnd - i12);
        if (v(this.mExpandedActionView)) {
            max2 += q(this.mExpandedActionView, i7, max2, i8, 0, iArr);
            i10 = Math.max(i10, this.mExpandedActionView.getMeasuredHeight() + l(this.mExpandedActionView));
            i11 = View.combineMeasuredStates(i11, this.mExpandedActionView.getMeasuredState());
        }
        if (v(this.mLogoView)) {
            max2 += q(this.mLogoView, i7, max2, i8, 0, iArr);
            i10 = Math.max(i10, this.mLogoView.getMeasuredHeight() + l(this.mLogoView));
            i11 = View.combineMeasuredStates(i11, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (((g) childAt.getLayoutParams()).f1403b == 0 && v(childAt)) {
                max2 += q(childAt, i7, max2, i8, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + l(childAt));
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
            }
        }
        int i18 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i19 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (v(this.mTitleTextView)) {
            q(this.mTitleTextView, i7, max2 + i19, i8, i18, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + k(this.mTitleTextView);
            i13 = this.mTitleTextView.getMeasuredHeight() + l(this.mTitleTextView);
            i14 = View.combineMeasuredStates(i11, this.mTitleTextView.getMeasuredState());
            i15 = measuredWidth;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (v(this.mSubtitleTextView)) {
            i15 = Math.max(i15, q(this.mSubtitleTextView, i7, max2 + i19, i8, i13 + i18, iArr));
            i13 += this.mSubtitleTextView.getMeasuredHeight() + l(this.mSubtitleTextView);
            i14 = View.combineMeasuredStates(i14, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i15 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, (-16777216) & i14), u() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i10, i13) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, i14 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.g s6 = actionMenuView != null ? actionMenuView.s() : null;
        int i7 = iVar.f1404k;
        if (i7 != 0 && this.mExpandedMenuPresenter != null && s6 != null && (findItem = s6.findItem(i7)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f1405l) {
            t();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        c();
        this.mContentInsets.f(i7 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.j jVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.mExpandedMenuPresenter;
        if (fVar != null && (jVar = fVar.f1398c) != null) {
            iVar.f1404k = jVar.getItemId();
        }
        iVar.f1405l = isOverflowMenuShowing();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public final int p(View view, int i7, int[] iArr, int i8) {
        g gVar = (g) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int i10 = i(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i10, max, view.getMeasuredHeight() + i10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int q(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i11) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i7, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f1403b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // androidx.core.view.u0
    @d.l0
    public void removeMenuProvider(@d.o0 androidx.core.view.a1 a1Var) {
        this.mMenuHostHelper.l(a1Var);
    }

    public final void s() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.mBackInvokedCallbackEnabled != z6) {
            this.mBackInvokedCallbackEnabled = z6;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(@d.f1 int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(@d.v int i7) {
        setCollapseIcon(g.a.b(getContext(), i7));
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z6) {
        this.mCollapsible = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i7, int i8) {
        c();
        this.mContentInsets.e(i7, i8);
    }

    public void setContentInsetsRelative(int i7, int i8) {
        c();
        this.mContentInsets.g(i7, i8);
    }

    public void setLogo(@d.v int i7) {
        setLogo(g.a.b(getContext(), i7));
    }

    public void setLogoDescription(@d.f1 int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    @d.b1({b1.a.LIBRARY})
    public void setMenu(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.mMenuView == null) {
            return;
        }
        f();
        androidx.appcompat.view.menu.g s6 = this.mMenuView.s();
        if (s6 == gVar) {
            return;
        }
        if (s6 != null) {
            s6.removeMenuPresenter(this.mOuterActionMenuPresenter);
            s6.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new f();
        }
        cVar.z(true);
        if (gVar != null) {
            gVar.addMenuPresenter(cVar, this.mPopupContext);
            gVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            cVar.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            cVar.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(cVar);
        this.mOuterActionMenuPresenter = cVar;
        updateBackInvokedCallbackState();
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(n.a aVar, g.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.t(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(@d.f1 int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(@d.v int i7) {
        setNavigationIcon(g.a.b(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.mOnMenuItemClickListener = hVar;
    }

    public void setOverflowIcon(@d.q0 Drawable drawable) {
        e();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@d.g1 int i7) {
        if (this.mPopupTheme != i7) {
            this.mPopupTheme = i7;
            if (i7 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(@d.f1 int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextAppearance(Context context, @d.g1 int i7) {
        this.mSubtitleTextAppearance = i7;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public void setSubtitleTextColor(@d.l int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(@d.f1 int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMargin(int i7, int i8, int i9, int i10) {
        this.mTitleMarginStart = i7;
        this.mTitleMarginTop = i8;
        this.mTitleMarginEnd = i9;
        this.mTitleMarginBottom = i10;
        requestLayout();
    }

    public void setTitleMarginBottom(int i7) {
        this.mTitleMarginBottom = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.mTitleMarginEnd = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.mTitleMarginStart = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.mTitleMarginTop = i7;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, @d.g1 int i7) {
        this.mTitleTextAppearance = i7;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public void setTitleTextColor(@d.l int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.u();
    }

    public final boolean u() {
        if (this.mCollapsible) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (v(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a7 = e.a(this);
            boolean z6 = hasExpandedActionView() && a7 != null && androidx.core.view.u1.O0(this) && this.mBackInvokedCallbackEnabled;
            if (z6 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = e.b(new Runnable() { // from class: androidx.appcompat.widget.v1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.collapseActionView();
                        }
                    });
                }
                e.c(a7, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = a7;
            } else if (z6 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
            } else {
                e.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = null;
            }
        }
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* loaded from: classes.dex */
    public static class g extends a.b {

        /* renamed from: c  reason: collision with root package name */
        public static final int f1400c = 0;

        /* renamed from: d  reason: collision with root package name */
        public static final int f1401d = 1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f1402e = 2;

        /* renamed from: b  reason: collision with root package name */
        public int f1403b;

        public g(@d.o0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1403b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i7, int i8) {
            super(i7, i8);
            this.f1403b = 0;
            this.f715a = 8388627;
        }

        public g(int i7, int i8, int i9) {
            super(i7, i8);
            this.f1403b = 0;
            this.f715a = i9;
        }

        public g(int i7) {
            this(-2, -1, i7);
        }

        public g(g gVar) {
            super((a.b) gVar);
            this.f1403b = 0;
            this.f1403b = gVar.f1403b;
        }

        public g(a.b bVar) {
            super(bVar);
            this.f1403b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1403b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1403b = 0;
        }
    }

    public Toolbar(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.U3);
    }

    @Override // androidx.core.view.u0
    @d.l0
    public void addMenuProvider(@d.o0 androidx.core.view.a1 a1Var, @d.o0 androidx.lifecycle.z zVar) {
        this.mMenuHostHelper.d(a1Var, zVar);
    }

    @Override // android.view.ViewGroup
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    public void setCollapseContentDescription(@d.q0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@d.q0 Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.mCollapseIcon);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            d();
            if (!n(this.mLogoView)) {
                b(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && n(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@d.q0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            y1.a(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(@d.q0 Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.mNavButtonView)) {
                b(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && n(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                f0 f0Var = new f0(context);
                this.mSubtitleTextView = f0Var;
                f0Var.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.mSubtitleTextAppearance;
                if (i7 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!n(this.mSubtitleTextView)) {
                b(this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && n(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(@d.o0 ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                f0 f0Var = new f0(context);
                this.mTitleTextView = f0Var;
                f0Var.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.mTitleTextAppearance;
                if (i7 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!n(this.mTitleTextView)) {
                b(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && n(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(@d.o0 ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new androidx.core.view.x0(new Runnable() { // from class: androidx.appcompat.widget.u1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new a();
        this.mShowOverflowMenuRunnable = new b();
        t1 G = t1.G(getContext(), attributeSet, a.m.p6, i7, 0);
        androidx.core.view.u1.z1(this, context, a.m.p6, attributeSet, G.B(), i7, 0);
        this.mTitleTextAppearance = G.u(a.m.S6, 0);
        this.mSubtitleTextAppearance = G.u(a.m.J6, 0);
        this.mGravity = G.p(a.m.q6, this.mGravity);
        this.mButtonGravity = G.p(a.m.s6, 48);
        int f7 = G.f(a.m.M6, 0);
        f7 = G.C(a.m.R6) ? G.f(a.m.R6, f7) : f7;
        this.mTitleMarginBottom = f7;
        this.mTitleMarginTop = f7;
        this.mTitleMarginEnd = f7;
        this.mTitleMarginStart = f7;
        int f8 = G.f(a.m.P6, -1);
        if (f8 >= 0) {
            this.mTitleMarginStart = f8;
        }
        int f9 = G.f(a.m.O6, -1);
        if (f9 >= 0) {
            this.mTitleMarginEnd = f9;
        }
        int f10 = G.f(a.m.Q6, -1);
        if (f10 >= 0) {
            this.mTitleMarginTop = f10;
        }
        int f11 = G.f(a.m.N6, -1);
        if (f11 >= 0) {
            this.mTitleMarginBottom = f11;
        }
        this.mMaxButtonHeight = G.g(a.m.D6, -1);
        int f12 = G.f(a.m.z6, Integer.MIN_VALUE);
        int f13 = G.f(a.m.v6, Integer.MIN_VALUE);
        int g7 = G.g(a.m.x6, 0);
        int g8 = G.g(a.m.y6, 0);
        c();
        this.mContentInsets.e(g7, g8);
        if (f12 != Integer.MIN_VALUE || f13 != Integer.MIN_VALUE) {
            this.mContentInsets.g(f12, f13);
        }
        this.mContentInsetStartWithNavigation = G.f(a.m.A6, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = G.f(a.m.w6, Integer.MIN_VALUE);
        this.mCollapseIcon = G.h(a.m.u6);
        this.mCollapseDescription = G.x(a.m.t6);
        CharSequence x6 = G.x(a.m.L6);
        if (!TextUtils.isEmpty(x6)) {
            setTitle(x6);
        }
        CharSequence x7 = G.x(a.m.I6);
        if (!TextUtils.isEmpty(x7)) {
            setSubtitle(x7);
        }
        this.mPopupContext = getContext();
        setPopupTheme(G.u(a.m.H6, 0));
        Drawable h7 = G.h(a.m.G6);
        if (h7 != null) {
            setNavigationIcon(h7);
        }
        CharSequence x8 = G.x(a.m.F6);
        if (!TextUtils.isEmpty(x8)) {
            setNavigationContentDescription(x8);
        }
        Drawable h8 = G.h(a.m.B6);
        if (h8 != null) {
            setLogo(h8);
        }
        CharSequence x9 = G.x(a.m.C6);
        if (!TextUtils.isEmpty(x9)) {
            setLogoDescription(x9);
        }
        if (G.C(a.m.T6)) {
            setTitleTextColor(G.d(a.m.T6));
        }
        if (G.C(a.m.K6)) {
            setSubtitleTextColor(G.d(a.m.K6));
        }
        if (G.C(a.m.E6)) {
            inflateMenu(G.u(a.m.E6, 0));
        }
        G.I();
    }

    @Override // androidx.core.view.u0
    @d.l0
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@d.o0 androidx.core.view.a1 a1Var, @d.o0 androidx.lifecycle.z zVar, @d.o0 p.b bVar) {
        this.mMenuHostHelper.e(a1Var, zVar, bVar);
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof a.b) {
            return new g((a.b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }
}
