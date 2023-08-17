package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import d.w0;

/* loaded from: classes.dex */
public abstract class d<T> {
    final String mPropertyName;

    /* loaded from: classes.dex */
    public static class a extends d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FloatProperty f4004a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.f4004a = floatProperty;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float getValue(T t6) {
            return ((Float) this.f4004a.get(t6)).floatValue();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void setValue(T t6, float f7) {
            this.f4004a.setValue(t6, f7);
        }
    }

    public d(String str) {
        this.mPropertyName = str;
    }

    @w0(24)
    public static <T> d<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t6);

    public abstract void setValue(T t6, float f7);
}