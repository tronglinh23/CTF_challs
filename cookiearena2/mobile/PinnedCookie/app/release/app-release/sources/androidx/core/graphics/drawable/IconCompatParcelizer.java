package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import d.b1;
import m3.e;
@b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(e eVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3510a = eVar.M(iconCompat.f3510a, 1);
        iconCompat.f3512c = eVar.t(iconCompat.f3512c, 2);
        iconCompat.f3513d = eVar.W(iconCompat.f3513d, 3);
        iconCompat.f3514e = eVar.M(iconCompat.f3514e, 4);
        iconCompat.f3515f = eVar.M(iconCompat.f3515f, 5);
        iconCompat.f3516g = (ColorStateList) eVar.W(iconCompat.f3516g, 6);
        iconCompat.f3518i = eVar.d0(iconCompat.f3518i, 7);
        iconCompat.f3519j = eVar.d0(iconCompat.f3519j, 8);
        iconCompat.a();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, e eVar) {
        eVar.j0(true, true);
        iconCompat.b(eVar.i());
        int i7 = iconCompat.f3510a;
        if (-1 != i7) {
            eVar.M0(i7, 1);
        }
        byte[] bArr = iconCompat.f3512c;
        if (bArr != null) {
            eVar.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3513d;
        if (parcelable != null) {
            eVar.X0(parcelable, 3);
        }
        int i8 = iconCompat.f3514e;
        if (i8 != 0) {
            eVar.M0(i8, 4);
        }
        int i9 = iconCompat.f3515f;
        if (i9 != 0) {
            eVar.M0(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f3516g;
        if (colorStateList != null) {
            eVar.X0(colorStateList, 6);
        }
        String str = iconCompat.f3518i;
        if (str != null) {
            eVar.f1(str, 7);
        }
        String str2 = iconCompat.f3519j;
        if (str2 != null) {
            eVar.f1(str2, 8);
        }
    }
}
