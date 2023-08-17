package m5;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.z2;
/* loaded from: classes.dex */
public final class a implements d0 {
    @Override // kotlinx.coroutines.internal.d0
    @n6.d
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String, u4.w] */
    @Override // kotlinx.coroutines.internal.d0
    @n6.d
    public z2 b(@n6.d List<? extends d0> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            ?? r22 = 0;
            return new d(g.d(mainLooper, true), r22, 2, r22);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.d0
    public int c() {
        return b0.f12767j;
    }
}
