package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
/* loaded from: classes.dex */
public class e0 implements TypeEvaluator<Rect> {

    /* renamed from: a  reason: collision with root package name */
    public Rect f6520a;

    public e0() {
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f7, Rect rect, Rect rect2) {
        int i7 = rect.left + ((int) ((rect2.left - r0) * f7));
        int i8 = rect.top + ((int) ((rect2.top - r1) * f7));
        int i9 = rect.right + ((int) ((rect2.right - r2) * f7));
        int i10 = rect.bottom + ((int) ((rect2.bottom - r6) * f7));
        Rect rect3 = this.f6520a;
        if (rect3 == null) {
            return new Rect(i7, i8, i9, i10);
        }
        rect3.set(i7, i8, i9, i10);
        return this.f6520a;
    }

    public e0(Rect rect) {
        this.f6520a = rect;
    }
}
