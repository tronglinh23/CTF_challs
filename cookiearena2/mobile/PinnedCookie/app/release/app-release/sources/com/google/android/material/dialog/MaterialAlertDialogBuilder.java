package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.d;
import androidx.core.view.u1;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.e;
import d.f;
import d.f1;
import d.g1;
import d.o0;
import d.q0;
import d.r;
import d.u0;
import d.v;
/* loaded from: classes.dex */
public class MaterialAlertDialogBuilder extends d.a {
    @f
    private static final int DEF_STYLE_ATTR = R.attr.alertDialogStyle;
    @g1
    private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents;
    @f
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = R.attr.materialAlertDialogTheme;
    @q0
    private Drawable background;
    @r
    @o0
    private final Rect backgroundInsets;

    public MaterialAlertDialogBuilder(@o0 Context context) {
        this(context, 0);
    }

    private static Context createMaterialAlertDialogThemedContext(@o0 Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context wrap = MaterialThemeOverlay.wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? wrap : new j.d(wrap, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(@o0 Context context) {
        TypedValue resolve = MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (resolve == null) {
            return 0;
        }
        return resolve.data;
    }

    private static int getOverridingThemeResId(@o0 Context context, int i7) {
        return i7 == 0 ? getMaterialAlertDialogThemeOverlay(context) : i7;
    }

    @Override // androidx.appcompat.app.d.a
    @o0
    public d create() {
        d create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(u1.R(decorView));
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.background, this.backgroundInsets));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(create, this.backgroundInsets));
        return create;
    }

    @q0
    public Drawable getBackground() {
        return this.background;
    }

    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setBackground(@q0 Drawable drawable) {
        this.background = drawable;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setBackgroundInsetBottom(@u0 int i7) {
        this.backgroundInsets.bottom = i7;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setBackgroundInsetEnd(@u0 int i7) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.left = i7;
        } else {
            this.backgroundInsets.right = i7;
        }
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setBackgroundInsetStart(@u0 int i7) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.right = i7;
        } else {
            this.backgroundInsets.left = i7;
        }
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setBackgroundInsetTop(@u0 int i7) {
        this.backgroundInsets.top = i7;
        return this;
    }

    public MaterialAlertDialogBuilder(@o0 Context context, int i7) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i7));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i8 = DEF_STYLE_ATTR;
        int i9 = DEF_STYLE_RES;
        this.backgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, i8, i9);
        int color = MaterialColors.getColor(context2, R.attr.colorSurface, getClass().getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i8, i9);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                materialShapeDrawable.setCornerSize(dimension);
            }
        }
        this.background = materialShapeDrawable;
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setAdapter(@q0 ListAdapter listAdapter, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setCancelable(boolean z6) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z6);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setCursor(@q0 Cursor cursor, @q0 DialogInterface.OnClickListener onClickListener, @o0 String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setCustomTitle(@q0 View view) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setIconAttribute(@f int i7) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i7);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setNegativeButtonIcon(@q0 Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setNeutralButtonIcon(@q0 Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setOnCancelListener(@q0 DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setOnDismissListener(@q0 DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setOnItemSelectedListener(@q0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setOnKeyListener(@q0 DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setPositiveButtonIcon(@q0 Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setIcon(@v int i7) {
        return (MaterialAlertDialogBuilder) super.setIcon(i7);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setItems(@e int i7, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i7, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setMessage(@f1 int i7) {
        return (MaterialAlertDialogBuilder) super.setMessage(i7);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setNegativeButton(@f1 int i7, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i7, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setNeutralButton(@f1 int i7, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i7, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setPositiveButton(@f1 int i7, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i7, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setTitle(@f1 int i7) {
        return (MaterialAlertDialogBuilder) super.setTitle(i7);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setView(int i7) {
        return (MaterialAlertDialogBuilder) super.setView(i7);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setIcon(@q0 Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setItems(@q0 CharSequence[] charSequenceArr, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setMessage(@q0 CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setMultiChoiceItems(@e int i7, @q0 boolean[] zArr, @q0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i7, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setNegativeButton(@q0 CharSequence charSequence, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setNeutralButton(@q0 CharSequence charSequence, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setPositiveButton(@q0 CharSequence charSequence, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setTitle(@q0 CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setView(@q0 View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setMultiChoiceItems(@q0 CharSequence[] charSequenceArr, @q0 boolean[] zArr, @q0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setSingleChoiceItems(@e int i7, int i8, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i7, i8, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setMultiChoiceItems(@q0 Cursor cursor, @o0 String str, @o0 String str2, @q0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setSingleChoiceItems(@q0 Cursor cursor, int i7, @o0 String str, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i7, str, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setSingleChoiceItems(@q0 CharSequence[] charSequenceArr, int i7, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i7, onClickListener);
    }

    @Override // androidx.appcompat.app.d.a
    @CanIgnoreReturnValue
    @o0
    public MaterialAlertDialogBuilder setSingleChoiceItems(@q0 ListAdapter listAdapter, int i7, @q0 DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i7, onClickListener);
    }
}
