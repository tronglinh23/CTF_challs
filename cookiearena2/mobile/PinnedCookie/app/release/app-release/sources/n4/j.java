package n4;

import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class j extends IOException {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final File f13831k;
    @n6.e

    /* renamed from: l  reason: collision with root package name */
    public final File f13832l;
    @n6.e

    /* renamed from: m  reason: collision with root package name */
    public final String f13833m;

    public /* synthetic */ j(File file, File file2, String str, int i7, u4.w wVar) {
        this(file, (i7 & 2) != 0 ? null : file2, (i7 & 4) != 0 ? null : str);
    }

    @n6.d
    public final File a() {
        return this.f13831k;
    }

    @n6.e
    public final File b() {
        return this.f13832l;
    }

    @n6.e
    public final String c() {
        return this.f13833m;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(@n6.d java.io.File r2, @n6.e java.io.File r3, @n6.e java.lang.String r4) {
        /*
            r1 = this;
            java.lang.String r0 = "file"
            u4.l0.p(r2, r0)
            java.lang.String r0 = n4.f.a(r2, r3, r4)
            r1.<init>(r0)
            r1.f13831k = r2
            r1.f13832l = r3
            r1.f13833m = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.j.<init>(java.io.File, java.io.File, java.lang.String):void");
    }
}
