package r0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Context, a> f15450b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final String f15451c = "android.hardware.display.category.PRESENTATION";

    /* renamed from: a  reason: collision with root package name */
    public final Context f15452a;

    @w0(17)
    /* renamed from: r0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0223a {
        @u
        public static Display a(DisplayManager displayManager, int i7) {
            return displayManager.getDisplay(i7);
        }

        @u
        public static Display[] b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    public a(Context context) {
        this.f15452a = context;
    }

    @o0
    public static a d(@o0 Context context) {
        a aVar;
        WeakHashMap<Context, a> weakHashMap = f15450b;
        synchronized (weakHashMap) {
            aVar = weakHashMap.get(context);
            if (aVar == null) {
                aVar = new a(context);
                weakHashMap.put(context, aVar);
            }
        }
        return aVar;
    }

    @q0
    public Display a(int i7) {
        return C0223a.a((DisplayManager) this.f15452a.getSystemService("display"), i7);
    }

    @o0
    public Display[] b() {
        return C0223a.b((DisplayManager) this.f15452a.getSystemService("display"));
    }

    @o0
    public Display[] c(@q0 String str) {
        return C0223a.b((DisplayManager) this.f15452a.getSystemService("display"));
    }
}