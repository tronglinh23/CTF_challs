package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.g3;
import androidx.core.view.h4;
import com.google.android.material.animation.AnimationUtils;
import d.o0;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
class InsetsAnimationCallback extends g3.b {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation;
    private final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    @Override // androidx.core.view.g3.b
    public void onEnd(@o0 g3 g3Var) {
        this.view.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.g3.b
    public void onPrepare(@o0 g3 g3Var) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // androidx.core.view.g3.b
    @o0
    public h4 onProgress(@o0 h4 h4Var, @o0 List<g3> list) {
        Iterator<g3> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().f() & h4.m.d()) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, r0.d()));
                break;
            }
        }
        return h4Var;
    }

    @Override // androidx.core.view.g3.b
    @o0
    public g3.a onStart(@o0 g3 g3Var, @o0 g3.a aVar) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i7 = this.startY - this.tmpLocation[1];
        this.startTranslationY = i7;
        this.view.setTranslationY(i7);
        return aVar;
    }
}
