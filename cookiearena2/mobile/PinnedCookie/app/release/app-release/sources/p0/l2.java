package p0;

import a1.h;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import d.b1;
import java.io.IOException;
import java.io.InputStream;
import m0.f;
@d.b1({b1.a.LIBRARY_GROUP})
@d.w0(29)
/* loaded from: classes.dex */
public class l2 extends m2 {
    public static int p(@d.o0 FontStyle fontStyle, @d.o0 FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        return abs + (slant == slant2 ? 0 : 2);
    }

    @Override // p0.m2
    @d.q0
    public Typeface b(Context context, f.d dVar, Resources resources, int i7) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            FontFamily.Builder builder = null;
            for (f.e eVar : dVar.a()) {
                try {
                    x1.a();
                    weight = u1.a(resources, eVar.b()).setWeight(eVar.e());
                    slant = weight.setSlant(eVar.f() ? 1 : 0);
                    ttcIndex = slant.setTtcIndex(eVar.c());
                    fontVariationSettings = ttcIndex.setFontVariationSettings(eVar.d());
                    build3 = fontVariationSettings.build();
                    if (builder == null) {
                        y1.a();
                        builder = v1.a(build3);
                    } else {
                        builder.addFont(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            w1.a();
            Typeface.CustomFallbackBuilder a7 = t1.a(build);
            style = o(build, i7).getStyle();
            style2 = a7.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p0.m2
    @d.q0
    public Typeface d(Context context, @d.q0 CancellationSignal cancellationSignal, @d.o0 h.c[] cVarArr, int i7) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        ParcelFileDescriptor openFileDescriptor;
        Font.Builder weight;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build3;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (h.c cVar : cVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(cVar.d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        x1.a();
                        weight = a2.a(openFileDescriptor).setWeight(cVar.e());
                        slant = weight.setSlant(cVar.f() ? 1 : 0);
                        ttcIndex = slant.setTtcIndex(cVar.c());
                        build3 = ttcIndex.build();
                        if (builder == null) {
                            y1.a();
                            builder = v1.a(build3);
                        } else {
                            builder.addFont(build3);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            w1.a();
            Typeface.CustomFallbackBuilder a7 = t1.a(build);
            style = o(build, i7).getStyle();
            style2 = a7.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p0.m2
    public Typeface e(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p0.m2
    @d.q0
    public Typeface f(Context context, Resources resources, int i7, String str, int i8) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            x1.a();
            build = u1.a(resources, i7).build();
            y1.a();
            build2 = v1.a(build).build();
            w1.a();
            Typeface.CustomFallbackBuilder a7 = t1.a(build2);
            style = build.getStyle();
            style2 = a7.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p0.m2
    @d.o0
    public Typeface g(@d.o0 Context context, @d.o0 Typeface typeface, int i7, boolean z6) {
        Typeface create;
        create = Typeface.create(typeface, i7, z6);
        return create;
    }

    @Override // p0.m2
    public h.c l(h.c[] cVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x0029 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.fonts.Font o(@d.o0 android.graphics.fonts.FontFamily r6, int r7) {
        /*
            r5 = this;
            p0.c2.a()
            r0 = r7 & 1
            if (r0 == 0) goto La
            r0 = 700(0x2bc, float:9.81E-43)
            goto Lc
        La:
            r0 = 400(0x190, float:5.6E-43)
        Lc:
            r7 = r7 & 2
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L14
            r7 = r2
            goto L15
        L14:
            r7 = r1
        L15:
            android.graphics.fonts.FontStyle r7 = p0.b2.a(r0, r7)
            android.graphics.fonts.Font r0 = p0.r1.a(r6, r1)
            android.graphics.fonts.FontStyle r1 = p0.i2.a(r0)
            int r1 = p(r7, r1)
        L25:
            int r3 = p0.s1.a(r6)
            if (r2 >= r3) goto L3e
            android.graphics.fonts.Font r3 = p0.r1.a(r6, r2)
            android.graphics.fonts.FontStyle r4 = p0.i2.a(r3)
            int r4 = p(r7, r4)
            if (r4 >= r1) goto L3b
            r0 = r3
            r1 = r4
        L3b:
            int r2 = r2 + 1
            goto L25
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.l2.o(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }
}
