package p0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class t0 {

    @u4.r1({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeBitmap$1\n*L\n1#1,56:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, v3.m2> f14582a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(t4.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, v3.m2> qVar) {
            this.f14582a = qVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@n6.d ImageDecoder imageDecoder, @n6.d ImageDecoder.ImageInfo imageInfo, @n6.d ImageDecoder.Source source) {
            u4.l0.p(imageDecoder, "decoder");
            u4.l0.p(imageInfo, "info");
            u4.l0.p(source, "source");
            this.f14582a.I(imageDecoder, imageInfo, source);
        }
    }

    @u4.r1({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeDrawable$1\n*L\n1#1,56:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t4.q<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, v3.m2> f14583a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(t4.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, v3.m2> qVar) {
            this.f14583a = qVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        public final void onHeaderDecoded(@n6.d ImageDecoder imageDecoder, @n6.d ImageDecoder.ImageInfo imageInfo, @n6.d ImageDecoder.Source source) {
            u4.l0.p(imageDecoder, "decoder");
            u4.l0.p(imageInfo, "info");
            u4.l0.p(source, "source");
            this.f14583a.I(imageDecoder, imageInfo, source);
        }
    }

    @n6.d
    @d.w0(28)
    public static final Bitmap a(@n6.d ImageDecoder.Source source, @n6.d t4.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, v3.m2> qVar) {
        Bitmap decodeBitmap;
        u4.l0.p(source, "<this>");
        u4.l0.p(qVar, s2.t0.f16450f);
        decodeBitmap = ImageDecoder.decodeBitmap(source, q0.a(new a(qVar)));
        u4.l0.o(decodeBitmap, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeBitmap;
    }

    @n6.d
    @d.w0(28)
    public static final Drawable b(@n6.d ImageDecoder.Source source, @n6.d t4.q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, v3.m2> qVar) {
        Drawable decodeDrawable;
        u4.l0.p(source, "<this>");
        u4.l0.p(qVar, s2.t0.f16450f);
        decodeDrawable = ImageDecoder.decodeDrawable(source, q0.a(new b(qVar)));
        u4.l0.o(decodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
        return decodeDrawable;
    }
}
