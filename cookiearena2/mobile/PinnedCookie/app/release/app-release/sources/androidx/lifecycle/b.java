package androidx.lifecycle;

import android.app.Application;
/* loaded from: classes.dex */
public class b extends z0 {
    @n6.d

    /* renamed from: d  reason: collision with root package name */
    public final Application f4686d;

    public b(@n6.d Application application) {
        u4.l0.p(application, "application");
        this.f4686d = application;
    }

    @n6.d
    public <T extends Application> T h() {
        T t6 = (T) this.f4686d;
        u4.l0.n(t6, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t6;
    }
}
