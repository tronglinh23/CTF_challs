package l;

import d.b1;
import d.o0;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class f {
    public abstract void a(@o0 Runnable runnable);

    public void b(@o0 Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(@o0 Runnable runnable);
}