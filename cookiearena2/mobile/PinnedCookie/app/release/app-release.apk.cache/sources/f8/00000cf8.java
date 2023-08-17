package com.google.android.material.textfield;

import d.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CustomEndIconDelegate extends EndIconDelegate {
    public CustomEndIconDelegate(@o0 EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        this.endLayout.setEndIconOnLongClickListener(null);
    }
}