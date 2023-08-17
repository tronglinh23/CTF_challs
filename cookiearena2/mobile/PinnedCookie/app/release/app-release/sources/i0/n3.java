package i0;

import android.content.res.Configuration;
/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10762a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f10763b;

    public n3(boolean z6) {
        this.f10762a = z6;
        this.f10763b = null;
    }

    @d.o0
    @d.w0(26)
    public Configuration a() {
        Configuration configuration = this.f10763b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean b() {
        return this.f10762a;
    }

    @d.w0(26)
    public n3(boolean z6, @d.o0 Configuration configuration) {
        this.f10762a = z6;
        this.f10763b = configuration;
    }
}
