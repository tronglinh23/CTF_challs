package w0;

import android.location.LocationManager;
import java.util.concurrent.Callable;
import w0.l;
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocationManager f18084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.i f18085b;

    public /* synthetic */ i(LocationManager locationManager, l.i iVar) {
        this.f18084a = locationManager;
        this.f18085b = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean i7;
        i7 = l.i(this.f18084a, this.f18085b);
        return i7;
    }
}
