package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import d.o0;
import d.w0;

/* loaded from: classes.dex */
public interface b extends Animatable {

    /* loaded from: classes.dex */
    public static abstract class a {
        Animatable2.AnimationCallback mPlatformCallback;

        /* renamed from: androidx.vectordrawable.graphics.drawable.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0070a extends Animatable2.AnimationCallback {
            public C0070a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                a.this.onAnimationEnd(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                a.this.onAnimationStart(drawable);
            }
        }

        @w0(23)
        public Animatable2.AnimationCallback getPlatformCallback() {
            if (this.mPlatformCallback == null) {
                this.mPlatformCallback = new C0070a();
            }
            return this.mPlatformCallback;
        }

        public void onAnimationEnd(Drawable drawable) {
        }

        public void onAnimationStart(Drawable drawable) {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@o0 a aVar);

    boolean unregisterAnimationCallback(@o0 a aVar);
}