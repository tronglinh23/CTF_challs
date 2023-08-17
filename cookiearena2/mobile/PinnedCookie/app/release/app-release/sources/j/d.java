package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import d.g1;
import d.u;
import d.w0;
import f.a;
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f11308f;

    /* renamed from: a  reason: collision with root package name */
    public int f11309a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f11310b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f11311c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f11312d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f11313e;

    @w0(17)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d() {
        super(null);
    }

    @w0(26)
    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f11308f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f11308f = configuration2;
        }
        return configuration.equals(f11308f);
    }

    public void a(Configuration configuration) {
        if (this.f11313e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f11312d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f11312d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f11313e == null) {
            Configuration configuration = this.f11312d;
            if (configuration == null || e(configuration)) {
                this.f11313e = super.getResources();
            } else {
                this.f11313e = a.a(this, this.f11312d).getResources();
            }
        }
        return this.f11313e;
    }

    public int c() {
        return this.f11309a;
    }

    public final void d() {
        boolean z6 = this.f11310b == null;
        if (z6) {
            this.f11310b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11310b.setTo(theme);
            }
        }
        f(this.f11310b, this.f11309a, z6);
    }

    public void f(Resources.Theme theme, int i7, boolean z6) {
        theme.applyStyle(i7, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f11311c == null) {
                this.f11311c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f11311c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f11310b;
        if (theme != null) {
            return theme;
        }
        if (this.f11309a == 0) {
            this.f11309a = a.l.f9265c4;
        }
        d();
        return this.f11310b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        if (this.f11309a != i7) {
            this.f11309a = i7;
            d();
        }
    }

    public d(Context context, @g1 int i7) {
        super(context);
        this.f11309a = i7;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f11310b = theme;
    }
}
