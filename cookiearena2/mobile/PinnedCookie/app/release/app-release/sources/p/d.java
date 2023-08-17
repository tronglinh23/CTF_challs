package p;

import d.b1;
import java.util.concurrent.Executor;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public enum d implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
