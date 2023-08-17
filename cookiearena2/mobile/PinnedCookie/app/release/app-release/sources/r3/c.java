package r3;

import android.view.View;
import d.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r3.h;
/* loaded from: classes.dex */
public final class c implements h.m {

    /* renamed from: a  reason: collision with root package name */
    public final List<h.m> f15610a = new ArrayList();

    @Override // r3.h.m
    public void a(@o0 View view, float f7) {
        Iterator<h.m> it = this.f15610a.iterator();
        while (it.hasNext()) {
            it.next().a(view, f7);
        }
    }

    public void b(@o0 h.m mVar) {
        this.f15610a.add(mVar);
    }

    public void c(@o0 h.m mVar) {
        this.f15610a.remove(mVar);
    }
}
