package p0;

import android.graphics.Canvas;
import android.graphics.Picture;
/* loaded from: classes.dex */
public final class d1 {
    @n6.d
    public static final Picture a(@n6.d Picture picture, int i7, int i8, @n6.d t4.l<? super Canvas, v3.m2> lVar) {
        u4.l0.p(picture, "<this>");
        u4.l0.p(lVar, "block");
        Canvas beginRecording = picture.beginRecording(i7, i8);
        u4.l0.o(beginRecording, "beginRecording(width, height)");
        try {
            lVar.O(beginRecording);
            return picture;
        } finally {
            u4.i0.d(1);
            picture.endRecording();
            u4.i0.c(1);
        }
    }
}
