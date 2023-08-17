package q0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import d.o0;
import d.q0;
/* loaded from: classes.dex */
public final class r extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f15147a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f15148b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f15149c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f15150d;

    public r(@q0 r rVar) {
        this.f15149c = null;
        this.f15150d = p.f15138h;
        if (rVar != null) {
            this.f15147a = rVar.f15147a;
            this.f15148b = rVar.f15148b;
            this.f15149c = rVar.f15149c;
            this.f15150d = rVar.f15150d;
        }
    }

    public boolean a() {
        return this.f15148b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i7 = this.f15147a;
        Drawable.ConstantState constantState = this.f15148b;
        return i7 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @o0
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @o0
    public Drawable newDrawable(@q0 Resources resources) {
        return new q(this, resources);
    }
}
