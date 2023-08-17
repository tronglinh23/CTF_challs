package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import d.b1;
import d.o0;
import d.q0;
import d.w0;
@b1({b1.a.f8135m})
@w0(api = 28)
/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    @b1({b1.a.f8135m})
    /* loaded from: classes.dex */
    public interface a {
        Object a();
    }

    public static <T> T a(T t6) {
        T t7;
        return (!(t6 instanceof a) || (t7 = (T) ((a) t6).a()) == null) ? t6 : t7;
    }

    @Override // android.app.AppComponentFactory
    @o0
    public Activity instantiateActivity(@o0 ClassLoader classLoader, @o0 String str, @q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @o0
    public Application instantiateApplication(@o0 ClassLoader classLoader, @o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @o0
    public ContentProvider instantiateProvider(@o0 ClassLoader classLoader, @o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @o0
    public BroadcastReceiver instantiateReceiver(@o0 ClassLoader classLoader, @o0 String str, @q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @o0
    public Service instantiateService(@o0 ClassLoader classLoader, @o0 String str, @q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
