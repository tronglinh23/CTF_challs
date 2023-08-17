package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R;
import d.d0;
import d.g1;
import d.j0;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public class SideSheetDialog extends SheetDialog<SideSheetCallback> {
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = R.attr.sideSheetDialogTheme;
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = R.style.Theme_Material3_Light_SideSheetDialog;

    public SideSheetDialog(@o0 Context context) {
        this(context, 0);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public void addSheetCancelOnHideCallback(Sheet<SideSheetCallback> sheet) {
        sheet.addCallback(new SideSheetCallback() { // from class: com.google.android.material.sidesheet.SideSheetDialog.1
            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onSlide(@o0 View view, float f7) {
            }

            @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.SheetCallback
            public void onStateChanged(@o0 View view, int i7) {
                if (i7 == 5) {
                    SideSheetDialog.this.cancel();
                }
            }
        });
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @o0
    public Sheet<SideSheetCallback> getBehaviorFromSheet(@o0 FrameLayout frameLayout) {
        return SideSheetBehavior.from(frameLayout);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @d0
    public int getDialogId() {
        return R.id.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @j0
    public int getLayoutResId() {
        return R.layout.m3_side_sheet_dialog;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public int getStateOnStart() {
        return 3;
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        return super.isDismissWithSheetAnimationEnabled();
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z6) {
        super.setCancelable(z6);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z6) {
        super.setCanceledOnTouchOutside(z6);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.o, androidx.activity.j, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@j0 int i7) {
        super.setContentView(i7);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z6) {
        super.setDismissWithSheetAnimationEnabled(z6);
    }

    public SideSheetDialog(@o0 Context context, @g1 int i7) {
        super(context, i7, SIDE_SHEET_DIALOG_THEME_ATTR, SIDE_SHEET_DIALOG_DEFAULT_THEME_RES);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog
    @o0
    public Sheet<SideSheetCallback> getBehavior() {
        Sheet behavior = super.getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.o, androidx.activity.j, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@q0 View view) {
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.SheetDialog, androidx.appcompat.app.o, androidx.activity.j, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@q0 View view, @q0 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}