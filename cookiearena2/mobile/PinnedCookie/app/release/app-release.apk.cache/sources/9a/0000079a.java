package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import d.b1;

@b1({b1.a.f8135m})
/* loaded from: classes.dex */
public class f implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public static final f f6905a = new f();

    public static f a() {
        return f6905a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f7, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f8 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f9 = f8 + (((((intValue2 >> 24) & 255) / 255.0f) - f8) * f7);
        float pow5 = pow2 + ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f7);
        float pow6 = pow3 + (f7 * (((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3));
        return Integer.valueOf((Math.round(((float) Math.pow(pow + ((pow4 - pow) * f7), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f9 * 255.0f) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f));
    }
}