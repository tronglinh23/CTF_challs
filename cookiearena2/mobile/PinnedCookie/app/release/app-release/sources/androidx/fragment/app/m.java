package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import d.b1;
/* loaded from: classes.dex */
public class m extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    @d.q0
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private androidx.lifecycle.i0<androidx.lifecycle.z> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            m.this.mOnDismissListener.onDismiss(m.this.mDialog);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@d.q0 DialogInterface dialogInterface) {
            if (m.this.mDialog != null) {
                m mVar = m.this;
                mVar.onCancel(mVar.mDialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@d.q0 DialogInterface dialogInterface) {
            if (m.this.mDialog != null) {
                m mVar = m.this;
                mVar.onDismiss(mVar.mDialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.i0<androidx.lifecycle.z> {
        public d() {
        }

        @Override // androidx.lifecycle.i0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public void b(androidx.lifecycle.z zVar) {
            if (zVar == null || !m.this.mShowsDialog) {
                return;
            }
            View requireView = m.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (m.this.mDialog != null) {
                if (FragmentManager.X0(3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DialogFragment ");
                    sb.append(this);
                    sb.append(" setting the content view on ");
                    sb.append(m.this.mDialog);
                }
                m.this.mDialog.setContentView(requireView);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends t {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t f4436b;

        public e(t tVar) {
            this.f4436b = tVar;
        }

        @Override // androidx.fragment.app.t
        @d.q0
        public View e(int i7) {
            return this.f4436b.g() ? this.f4436b.e(i7) : m.this.onFindViewById(i7);
        }

        @Override // androidx.fragment.app.t
        public boolean g() {
            return this.f4436b.g() || m.this.onHasView();
        }
    }

    public m() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }

    @Override // androidx.fragment.app.Fragment
    @d.o0
    public t createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        k(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        k(true, false, false);
    }

    @d.l0
    public void dismissNow() {
        k(false, false, true);
    }

    @d.q0
    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    @d.g1
    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    public final void k(boolean z6, boolean z7, boolean z8) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z7) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z8) {
                getParentFragmentManager().x1(this.mBackStackId, 1);
            } else {
                getParentFragmentManager().u1(this.mBackStackId, 1, z6);
            }
            this.mBackStackId = -1;
            return;
        }
        u0 u6 = getParentFragmentManager().u();
        u6.Q(true);
        u6.B(this);
        if (z8) {
            u6.s();
        } else if (z6) {
            u6.r();
        } else {
            u6.q();
        }
    }

    public final void l(@d.q0 Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @d.l0
    @Deprecated
    public void onActivityCreated(@d.q0 Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @d.l0
    public void onAttach(@d.o0 Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().l(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@d.o0 DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @d.l0
    public void onCreate(@d.q0 Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    @d.l0
    @d.o0
    public Dialog onCreateDialog(@d.q0 Bundle bundle) {
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new androidx.activity.j(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    @d.l0
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @d.l0
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().p(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    @d.i
    public void onDismiss(@d.o0 DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (FragmentManager.X0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDismiss called for DialogFragment ");
            sb.append(this);
        }
        k(true, true, false);
    }

    @d.q0
    public View onFindViewById(int i7) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @d.o0
    public LayoutInflater onGetLayoutInflater(@d.q0 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            l(bundle);
            if (FragmentManager.X0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("get layout inflater for DialogFragment ");
                sb.append(this);
                sb.append(" from dialog context");
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
        }
        if (FragmentManager.X0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.mShowsDialog) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mCreatingDialog = true: ");
                sb2.append(str);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("mShowsDialog = false: ");
                sb3.append(str);
            }
        }
        return onGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    @d.l0
    public void onSaveInstanceState(@d.o0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i7 = this.mStyle;
        if (i7 != 0) {
            bundle.putInt(SAVED_STYLE, i7);
        }
        int i8 = this.mTheme;
        if (i8 != 0) {
            bundle.putInt(SAVED_THEME, i8);
        }
        boolean z6 = this.mCancelable;
        if (!z6) {
            bundle.putBoolean(SAVED_CANCELABLE, z6);
        }
        boolean z7 = this.mShowsDialog;
        if (!z7) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z7);
        }
        int i9 = this.mBackStackId;
        if (i9 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i9);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @d.l0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            androidx.lifecycle.g1.b(decorView, this);
            androidx.lifecycle.i1.b(decorView, this);
            e3.f.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @d.l0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @d.l0
    public void onViewStateRestored(@d.q0 Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(@d.o0 LayoutInflater layoutInflater, @d.q0 ViewGroup viewGroup, @d.q0 Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @d.o0
    public final androidx.activity.j requireComponentDialog() {
        Dialog requireDialog = requireDialog();
        if (requireDialog instanceof androidx.activity.j) {
            return (androidx.activity.j) requireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + requireDialog);
    }

    @d.o0
    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z6) {
        this.mCancelable = z6;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z6);
        }
    }

    public void setShowsDialog(boolean z6) {
        this.mShowsDialog = z6;
    }

    public void setStyle(int i7, @d.g1 int i8) {
        if (FragmentManager.X0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i7);
            sb.append(", ");
            sb.append(i8);
        }
        this.mStyle = i7;
        if (i7 == 2 || i7 == 3) {
            this.mTheme = 16973913;
        }
        if (i8 != 0) {
            this.mTheme = i8;
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@d.o0 Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(@d.o0 FragmentManager fragmentManager, @d.q0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        u0 u6 = fragmentManager.u();
        u6.Q(true);
        u6.k(this, str);
        u6.q();
    }

    public void showNow(@d.o0 FragmentManager fragmentManager, @d.q0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        u0 u6 = fragmentManager.u();
        u6.Q(true);
        u6.k(this, str);
        u6.s();
    }

    public int show(@d.o0 u0 u0Var, @d.q0 String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        u0Var.k(this, str);
        this.mViewDestroyed = false;
        int q6 = u0Var.q();
        this.mBackStackId = q6;
        return q6;
    }

    public m(@d.j0 int i7) {
        super(i7);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d();
        this.mDialogCreated = false;
    }
}
