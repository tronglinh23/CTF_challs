package r3;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import d.q0;
import java.util.Locale;
import r3.h;
/* loaded from: classes.dex */
public final class f extends h.j {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayoutManager f15620a;

    /* renamed from: b  reason: collision with root package name */
    public h.m f15621b;

    public f(LinearLayoutManager linearLayoutManager) {
        this.f15620a = linearLayoutManager;
    }

    public h.m a() {
        return this.f15621b;
    }

    public void b(@q0 h.m mVar) {
        this.f15621b = mVar;
    }

    @Override // r3.h.j
    public void onPageScrollStateChanged(int i7) {
    }

    @Override // r3.h.j
    public void onPageScrolled(int i7, float f7, int i8) {
        if (this.f15621b == null) {
            return;
        }
        float f8 = -f7;
        for (int i9 = 0; i9 < this.f15620a.getChildCount(); i9++) {
            View childAt = this.f15620a.getChildAt(i9);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i9), Integer.valueOf(this.f15620a.getChildCount())));
            }
            this.f15621b.a(childAt, (this.f15620a.getPosition(childAt) - i7) + f8);
        }
    }

    @Override // r3.h.j
    public void onPageSelected(int i7) {
    }
}
