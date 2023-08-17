package q0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import androidx.core.view.m0;
import d.o0;
import d.q0;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f15137a = "RoundedBitmapDrawableFa";

    /* loaded from: classes.dex */
    public static class a extends l {
        public a(Resources resources, Bitmap bitmap) {
            super(resources, bitmap);
        }

        @Override // q0.l
        public void f(int i7, int i8, int i9, Rect rect, Rect rect2) {
            m0.b(i7, i8, i9, rect, rect2, 0);
        }

        @Override // q0.l
        public boolean h() {
            Bitmap bitmap = this.f15124a;
            return bitmap != null && p0.a.c(bitmap);
        }

        @Override // q0.l
        public void o(boolean z6) {
            Bitmap bitmap = this.f15124a;
            if (bitmap != null) {
                p0.a.d(bitmap, z6);
                invalidateSelf();
            }
        }
    }

    @o0
    public static l a(@o0 Resources resources, @q0 Bitmap bitmap) {
        return new k(resources, bitmap);
    }

    @o0
    public static l b(@o0 Resources resources, @o0 InputStream inputStream) {
        l a7 = a(resources, BitmapFactory.decodeStream(inputStream));
        if (a7.b() == null) {
            Log.w(f15137a, "RoundedBitmapDrawable cannot decode " + inputStream);
        }
        return a7;
    }

    @o0
    public static l c(@o0 Resources resources, @o0 String str) {
        l a7 = a(resources, BitmapFactory.decodeFile(str));
        if (a7.b() == null) {
            Log.w(f15137a, "RoundedBitmapDrawable cannot decode " + str);
        }
        return a7;
    }
}