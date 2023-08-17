package c0;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
/* loaded from: classes.dex */
public abstract class k extends f {
    public static final float E = 20.0f;
    public int D = f.f7360f;

    @Override // c0.f
    public void d(HashSet<String> attributes) {
    }

    public abstract void o(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y);

    public abstract float p();

    public abstract float q();

    public abstract boolean r(int layoutWidth, int layoutHeight, RectF start, RectF end, float x6, float y6);

    public abstract void s(View view, RectF start, RectF end, float x6, float y6, String[] attribute, float[] value);
}
