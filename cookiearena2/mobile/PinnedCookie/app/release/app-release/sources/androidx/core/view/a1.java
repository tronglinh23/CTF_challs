package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
/* loaded from: classes.dex */
public interface a1 {
    boolean a(@d.o0 MenuItem menuItem);

    default void b(@d.o0 Menu menu) {
    }

    void c(@d.o0 Menu menu, @d.o0 MenuInflater menuInflater);

    default void d(@d.o0 Menu menu) {
    }
}
