package i0;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10948a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f10949b;

    public w(boolean z6) {
        this.f10948a = z6;
        this.f10949b = null;
    }

    @d.o0
    @d.w0(26)
    public Configuration a() {
        Configuration configuration = this.f10949b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean b() {
        return this.f10948a;
    }

    @d.w0(26)
    public w(boolean z6, @d.o0 Configuration configuration) {
        this.f10948a = z6;
        this.f10949b = configuration;
    }
}