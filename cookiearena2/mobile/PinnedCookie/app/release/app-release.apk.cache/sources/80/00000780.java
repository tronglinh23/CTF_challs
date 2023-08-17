package androidx.transition;

import android.os.IBinder;

/* loaded from: classes.dex */
public class u1 implements w1 {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f6813a;

    public u1(IBinder iBinder) {
        this.f6813a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u1) && ((u1) obj).f6813a.equals(this.f6813a);
    }

    public int hashCode() {
        return this.f6813a.hashCode();
    }
}