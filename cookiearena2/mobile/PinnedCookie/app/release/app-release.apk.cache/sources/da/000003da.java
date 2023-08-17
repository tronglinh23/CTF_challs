package androidx.core.view;

import android.view.VelocityTracker;

@Deprecated
/* loaded from: classes.dex */
public final class s1 {
    @Deprecated
    public static float a(VelocityTracker velocityTracker, int i7) {
        return velocityTracker.getXVelocity(i7);
    }

    @Deprecated
    public static float b(VelocityTracker velocityTracker, int i7) {
        return velocityTracker.getYVelocity(i7);
    }
}