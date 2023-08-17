package i0;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.core.app.CoreComponentFactory;
import java.lang.reflect.InvocationTargetException;

@d.w0(28)
/* loaded from: classes.dex */
public class l extends AppComponentFactory {
    @d.o0
    public Activity a(@d.o0 ClassLoader classLoader, @d.o0 String str, @d.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException("Couldn't call constructor", e7);
        }
    }

    @d.o0
    public Application b(@d.o0 ClassLoader classLoader, @d.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException("Couldn't call constructor", e7);
        }
    }

    @d.o0
    public ContentProvider c(@d.o0 ClassLoader classLoader, @d.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException("Couldn't call constructor", e7);
        }
    }

    @d.o0
    public BroadcastReceiver d(@d.o0 ClassLoader classLoader, @d.o0 String str, @d.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException("Couldn't call constructor", e7);
        }
    }

    @d.o0
    public Service e(@d.o0 ClassLoader classLoader, @d.o0 String str, @d.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException("Couldn't call constructor", e7);
        }
    }

    @Override // android.app.AppComponentFactory
    @d.o0
    public final Activity instantiateActivity(@d.o0 ClassLoader classLoader, @d.o0 String str, @d.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.a(a(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @d.o0
    public final Application instantiateApplication(@d.o0 ClassLoader classLoader, @d.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.a(b(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @d.o0
    public final ContentProvider instantiateProvider(@d.o0 ClassLoader classLoader, @d.o0 String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.a(c(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    @d.o0
    public final BroadcastReceiver instantiateReceiver(@d.o0 ClassLoader classLoader, @d.o0 String str, @d.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.a(d(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    @d.o0
    public final Service instantiateService(@d.o0 ClassLoader classLoader, @d.o0 String str, @d.q0 Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.a(e(classLoader, str, intent));
    }
}