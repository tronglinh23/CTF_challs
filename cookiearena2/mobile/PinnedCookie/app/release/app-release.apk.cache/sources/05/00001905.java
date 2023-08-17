package q0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import d.o0;
import d.w0;

@w0(21)
/* loaded from: classes.dex */
public class k extends l {
    public k(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // q0.l
    public void f(int i7, int i8, int i9, Rect rect, Rect rect2) {
        Gravity.apply(i7, i8, i9, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@o0 Outline outline) {
        t();
        outline.setRoundRect(this.f15131h, c());
    }

    @Override // q0.l
    public boolean h() {
        Bitmap bitmap = this.f15124a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // q0.l
    public void o(boolean z6) {
        Bitmap bitmap = this.f15124a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z6);
            invalidateSelf();
        }
    }
}