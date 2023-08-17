package w1;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.q;
import d.b0;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f18168a = new Object();
    @b0("INSTANCE_LOCK")

    /* renamed from: b  reason: collision with root package name */
    public static volatile Editable.Factory f18169b;
    @q0

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f18170c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f18170c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f18169b == null) {
            synchronized (f18168a) {
                if (f18169b == null) {
                    f18169b = new b();
                }
            }
        }
        return f18169b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@o0 CharSequence charSequence) {
        Class<?> cls = f18170c;
        return cls != null ? q.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
