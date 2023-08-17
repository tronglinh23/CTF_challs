package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.u1;
import androidx.recyclerview.widget.RecyclerView;
import d.o0;
/* loaded from: classes.dex */
public final class a extends RecyclerView.f0 {
    public a(@o0 FrameLayout frameLayout) {
        super(frameLayout);
    }

    @o0
    public static a b(@o0 ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(u1.D());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    @o0
    public FrameLayout c() {
        return (FrameLayout) this.itemView;
    }
}
