package u3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import i5.c0;
import u4.l0;
@t3.d
/* loaded from: classes.dex */
public final class a {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f17320a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final String f17321b;

    public a(@n6.d ComponentName componentName, @n6.e String str) {
        l0.p(componentName, "componentName");
        this.f17320a = componentName;
        this.f17321b = str;
        String packageName = componentName.getPackageName();
        l0.o(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        l0.o(className, "componentName.className");
        boolean z6 = true;
        if (!(packageName.length() > 0)) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (!(className.length() > 0)) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!c0.W2(packageName, "*", false, 2, null) || c0.s3(packageName, "*", 0, false, 6, null) == packageName.length() - 1)) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (c0.W2(className, "*", false, 2, null) && c0.s3(className, "*", 0, false, 6, null) != className.length() - 1) {
            z6 = false;
        }
        if (!z6) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    @n6.d
    public final ComponentName a() {
        return this.f17320a;
    }

    @n6.e
    public final String b() {
        return this.f17321b;
    }

    public final boolean c(@n6.d Activity activity) {
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        if (r.f17356a.a(activity, this.f17320a)) {
            String str = this.f17321b;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (l0.g(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(@n6.d Intent intent) {
        l0.p(intent, "intent");
        if (r.f17356a.b(intent.getComponent(), this.f17320a)) {
            String str = this.f17321b;
            return str == null || l0.g(str, intent.getAction());
        }
        return false;
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l0.g(this.f17320a, aVar.f17320a) && l0.g(this.f17321b, aVar.f17321b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f17320a.hashCode() * 31;
        String str = this.f17321b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @n6.d
    public String toString() {
        return "ActivityFilter(componentName=" + this.f17320a + ", intentAction=" + ((Object) this.f17321b) + ')';
    }
}
