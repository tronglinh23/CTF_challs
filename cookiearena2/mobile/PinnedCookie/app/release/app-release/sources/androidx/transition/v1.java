package androidx.transition;

import android.view.View;
import android.view.WindowId;
@d.w0(18)
/* loaded from: classes.dex */
public class v1 implements w1 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f6815a;

    public v1(@d.o0 View view) {
        this.f6815a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof v1) && ((v1) obj).f6815a.equals(this.f6815a);
    }

    public int hashCode() {
        return this.f6815a.hashCode();
    }
}
