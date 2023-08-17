package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import d.b1;
import d.f1;
import d.g1;
import d.o0;
import d.q0;
import f.a;

/* loaded from: classes.dex */
public class d extends o implements DialogInterface {

    /* renamed from: c  reason: collision with root package name */
    public static final int f782c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f783d = 1;

    /* renamed from: b  reason: collision with root package name */
    public final AlertController f784b;

    /* loaded from: classes.dex */
    public static class a {
        private final AlertController.f P;
        private final int mTheme;

        public a(@o0 Context context) {
            this(context, d.h(context, 0));
        }

        @o0
        public d create() {
            d dVar = new d(this.P.f665a, this.mTheme);
            this.P.a(dVar.f784b);
            dVar.setCancelable(this.P.f682r);
            if (this.P.f682r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.P.f683s);
            dVar.setOnDismissListener(this.P.f684t);
            DialogInterface.OnKeyListener onKeyListener = this.P.f685u;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        @o0
        public Context getContext() {
            return this.P.f665a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f687w = listAdapter;
            fVar.f688x = onClickListener;
            return this;
        }

        public a setCancelable(boolean z6) {
            this.P.f682r = z6;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.P;
            fVar.K = cursor;
            fVar.L = str;
            fVar.f688x = onClickListener;
            return this;
        }

        public a setCustomTitle(@q0 View view) {
            this.P.f671g = view;
            return this;
        }

        public a setIcon(@d.v int i7) {
            this.P.f667c = i7;
            return this;
        }

        public a setIconAttribute(@d.f int i7) {
            TypedValue typedValue = new TypedValue();
            this.P.f665a.getTheme().resolveAttribute(i7, typedValue, true);
            this.P.f667c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z6) {
            this.P.N = z6;
            return this;
        }

        public a setItems(@d.e int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f686v = fVar.f665a.getResources().getTextArray(i7);
            this.P.f688x = onClickListener;
            return this;
        }

        public a setMessage(@f1 int i7) {
            AlertController.f fVar = this.P;
            fVar.f672h = fVar.f665a.getText(i7);
            return this;
        }

        public a setMultiChoiceItems(@d.e int i7, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.P;
            fVar.f686v = fVar.f665a.getResources().getTextArray(i7);
            AlertController.f fVar2 = this.P;
            fVar2.J = onMultiChoiceClickListener;
            fVar2.F = zArr;
            fVar2.G = true;
            return this;
        }

        public a setNegativeButton(@f1 int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f676l = fVar.f665a.getText(i7);
            this.P.f678n = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.P.f677m = drawable;
            return this;
        }

        public a setNeutralButton(@f1 int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f679o = fVar.f665a.getText(i7);
            this.P.f681q = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.P.f680p = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.f683s = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.f684t = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.O = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.f685u = onKeyListener;
            return this;
        }

        public a setPositiveButton(@f1 int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f673i = fVar.f665a.getText(i7);
            this.P.f675k = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.P.f674j = drawable;
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public a setRecycleOnMeasureEnabled(boolean z6) {
            this.P.Q = z6;
            return this;
        }

        public a setSingleChoiceItems(@d.e int i7, int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f686v = fVar.f665a.getResources().getTextArray(i7);
            AlertController.f fVar2 = this.P;
            fVar2.f688x = onClickListener;
            fVar2.I = i8;
            fVar2.H = true;
            return this;
        }

        public a setTitle(@f1 int i7) {
            AlertController.f fVar = this.P;
            fVar.f670f = fVar.f665a.getText(i7);
            return this;
        }

        public a setView(int i7) {
            AlertController.f fVar = this.P;
            fVar.f690z = null;
            fVar.f689y = i7;
            fVar.E = false;
            return this;
        }

        public d show() {
            d create = create();
            create.show();
            return create;
        }

        public a(@o0 Context context, @g1 int i7) {
            this.P = new AlertController.f(new ContextThemeWrapper(context, d.h(context, i7)));
            this.mTheme = i7;
        }

        public a setIcon(@q0 Drawable drawable) {
            this.P.f668d = drawable;
            return this;
        }

        public a setMessage(@q0 CharSequence charSequence) {
            this.P.f672h = charSequence;
            return this;
        }

        public a setTitle(@q0 CharSequence charSequence) {
            this.P.f670f = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f686v = charSequenceArr;
            fVar.f688x = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f676l = charSequence;
            fVar.f678n = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f679o = charSequence;
            fVar.f681q = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f673i = charSequence;
            fVar.f675k = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.P;
            fVar.f690z = view;
            fVar.f689y = 0;
            fVar.E = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.P;
            fVar.f686v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i7, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.K = cursor;
            fVar.f688x = onClickListener;
            fVar.I = i7;
            fVar.L = str;
            fVar.H = true;
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a setView(View view, int i7, int i8, int i9, int i10) {
            AlertController.f fVar = this.P;
            fVar.f690z = view;
            fVar.f689y = 0;
            fVar.E = true;
            fVar.A = i7;
            fVar.B = i8;
            fVar.C = i9;
            fVar.D = i10;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.P;
            fVar.K = cursor;
            fVar.J = onMultiChoiceClickListener;
            fVar.M = str;
            fVar.L = str2;
            fVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f686v = charSequenceArr;
            fVar.f688x = onClickListener;
            fVar.I = i7;
            fVar.H = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f687w = listAdapter;
            fVar.f688x = onClickListener;
            fVar.I = i7;
            fVar.H = true;
            return this;
        }
    }

    public d(@o0 Context context) {
        this(context, 0);
    }

    public static int h(@o0 Context context, @g1 int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.b.N, typedValue, true);
        return typedValue.resourceId;
    }

    public Button f(int i7) {
        return this.f784b.c(i7);
    }

    public ListView g() {
        return this.f784b.e();
    }

    public void i(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f784b.l(i7, charSequence, onClickListener, null, null);
    }

    public void j(int i7, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f784b.l(i7, charSequence, onClickListener, null, drawable);
    }

    public void k(int i7, CharSequence charSequence, Message message) {
        this.f784b.l(i7, charSequence, null, message, null);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void l(int i7) {
        this.f784b.m(i7);
    }

    public void m(View view) {
        this.f784b.n(view);
    }

    public void n(int i7) {
        this.f784b.o(i7);
    }

    public void o(Drawable drawable) {
        this.f784b.p(drawable);
    }

    @Override // androidx.appcompat.app.o, androidx.activity.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f784b.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f784b.h(i7, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (this.f784b.i(i7, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    public void p(int i7) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i7, typedValue, true);
        this.f784b.o(typedValue.resourceId);
    }

    public void q(CharSequence charSequence) {
        this.f784b.q(charSequence);
    }

    public void r(View view) {
        this.f784b.u(view);
    }

    public void s(View view, int i7, int i8, int i9, int i10) {
        this.f784b.v(view, i7, i8, i9, i10);
    }

    @Override // androidx.appcompat.app.o, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f784b.s(charSequence);
    }

    public d(@o0 Context context, @g1 int i7) {
        super(context, h(context, i7));
        this.f784b = new AlertController(getContext(), this, getWindow());
    }

    public d(@o0 Context context, boolean z6, @q0 DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z6);
        setOnCancelListener(onCancelListener);
    }
}