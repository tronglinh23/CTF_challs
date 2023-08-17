package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import d.b1;
/* loaded from: classes.dex */
public class s extends ImageView implements androidx.core.view.r1, k1.e0 {
    private final f mBackgroundTintHelper;
    private boolean mHasLevel;
    private final r mImageHelper;

    public s(@d.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.b();
        }
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.c();
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            return fVar.d();
        }
        return null;
    }

    @Override // k1.e0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public ColorStateList getSupportImageTintList() {
        r rVar = this.mImageHelper;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // k1.e0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.q0
    public PorterDuff.Mode getSupportImageTintMode() {
        r rVar = this.mImageHelper;
        if (rVar != null) {
            return rVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@d.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@d.v int i7) {
        super.setBackgroundResource(i7);
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.g(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@d.q0 Drawable drawable) {
        r rVar = this.mImageHelper;
        if (rVar != null && drawable != null && !this.mHasLevel) {
            rVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        r rVar2 = this.mImageHelper;
        if (rVar2 != null) {
            rVar2.c();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@d.v int i7) {
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.i(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@d.q0 Uri uri) {
        super.setImageURI(uri);
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.c();
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@d.q0 ColorStateList colorStateList) {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.r1
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@d.q0 PorterDuff.Mode mode) {
        f fVar = this.mBackgroundTintHelper;
        if (fVar != null) {
            fVar.j(mode);
        }
    }

    @Override // k1.e0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@d.q0 ColorStateList colorStateList) {
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.k(colorStateList);
        }
    }

    @Override // k1.e0
    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@d.q0 PorterDuff.Mode mode) {
        r rVar = this.mImageHelper;
        if (rVar != null) {
            rVar.l(mode);
        }
    }

    public s(@d.o0 Context context, @d.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public s(@d.o0 Context context, @d.q0 AttributeSet attributeSet, int i7) {
        super(q1.b(context), attributeSet, i7);
        this.mHasLevel = false;
        o1.a(this, getContext());
        f fVar = new f(this);
        this.mBackgroundTintHelper = fVar;
        fVar.e(attributeSet, i7);
        r rVar = new r(this);
        this.mImageHelper = rVar;
        rVar.g(attributeSet, i7);
    }
}
