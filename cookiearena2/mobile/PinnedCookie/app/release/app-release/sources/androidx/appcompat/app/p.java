package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import d.b1;
import d.j0;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public class p extends androidx.fragment.app.m {
    public p() {
    }

    @Override // androidx.fragment.app.m
    @o0
    public Dialog onCreateDialog(@q0 Bundle bundle) {
        return new o(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.m
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@o0 Dialog dialog, int i7) {
        if (!(dialog instanceof o)) {
            super.setupDialog(dialog, i7);
            return;
        }
        o oVar = (o) dialog;
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            dialog.getWindow().addFlags(24);
        }
        oVar.supportRequestWindowFeature(1);
    }

    public p(@j0 int i7) {
        super(i7);
    }
}
