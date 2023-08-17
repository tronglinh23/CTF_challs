package h1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import d.b1;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {
    @b1({b1.a.LIBRARY_GROUP_PREFIX})

    /* renamed from: d  reason: collision with root package name */
    public static final String f10134d = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: a  reason: collision with root package name */
    public final int f10135a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f10136b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10137c;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public a(int i7, @d.o0 f0 f0Var, int i8) {
        this.f10135a = i7;
        this.f10136b = f0Var;
        this.f10137c = i8;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@d.o0 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f10134d, this.f10135a);
        this.f10136b.M0(this.f10137c, bundle);
    }
}
