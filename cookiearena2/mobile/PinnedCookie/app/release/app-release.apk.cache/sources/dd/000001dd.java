package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f1431a;

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public b(ActionBarContainer actionBarContainer) {
        this.f1431a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1431a;
        if (actionBarContainer.f1220i) {
            Drawable drawable = actionBarContainer.f1219h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1217f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1431a;
        Drawable drawable3 = actionBarContainer2.f1218g;
        if (drawable3 == null || !actionBarContainer2.f1221j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @d.w0(21)
    public void getOutline(@d.o0 Outline outline) {
        ActionBarContainer actionBarContainer = this.f1431a;
        if (actionBarContainer.f1220i) {
            if (actionBarContainer.f1219h != null) {
                a.a(actionBarContainer.f1217f, outline);
                return;
            }
            return;
        }
        Drawable drawable = actionBarContainer.f1217f;
        if (drawable != null) {
            a.a(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}