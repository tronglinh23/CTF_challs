package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.lifecycle.p;
/* loaded from: classes.dex */
public interface u0 {
    void addMenuProvider(@d.o0 a1 a1Var);

    void addMenuProvider(@d.o0 a1 a1Var, @d.o0 androidx.lifecycle.z zVar);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@d.o0 a1 a1Var, @d.o0 androidx.lifecycle.z zVar, @d.o0 p.b bVar);

    void invalidateMenu();

    void removeMenuProvider(@d.o0 a1 a1Var);
}
