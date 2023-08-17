package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.o0;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u00070\u0006H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Li3/b;", "Landroidx/lifecycle/z;", "Landroid/content/Context;", "context", "c", "", "Ljava/lang/Class;", "a", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements i3.b<z> {
    @Override // i3.b
    @n6.d
    public List<Class<? extends i3.b<?>>> a() {
        return x3.w.E();
    }

    @Override // i3.b
    @n6.d
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public z b(@n6.d Context context) {
        u4.l0.p(context, "context");
        i3.a e7 = i3.a.e(context);
        u4.l0.o(e7, "getInstance(context)");
        if (e7.g(ProcessLifecycleInitializer.class)) {
            u.a(context);
            o0.b bVar = o0.f4778j;
            bVar.c(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
