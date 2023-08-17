package q0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import d.w0;
import u4.l0;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class j {
    @n6.d
    @w0(26)
    public static final Icon a(@n6.d Bitmap bitmap) {
        l0.p(bitmap, "<this>");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        l0.o(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    @n6.d
    @w0(26)
    public static final Icon b(@n6.d Bitmap bitmap) {
        l0.p(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        l0.o(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @n6.d
    @w0(26)
    public static final Icon c(@n6.d Uri uri) {
        l0.p(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        l0.o(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @n6.d
    @w0(26)
    public static final Icon d(@n6.d byte[] bArr) {
        l0.p(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        l0.o(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}