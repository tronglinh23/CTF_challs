package r3;

import d.o0;
import d.u0;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import r3.h;

/* loaded from: classes.dex */
public final class b extends h.j {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final List<h.j> f15609a;

    public b(int i7) {
        this.f15609a = new ArrayList(i7);
    }

    public void a(h.j jVar) {
        this.f15609a.add(jVar);
    }

    public void b(h.j jVar) {
        this.f15609a.remove(jVar);
    }

    public final void c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // r3.h.j
    public void onPageScrollStateChanged(int i7) {
        try {
            Iterator<h.j> it = this.f15609a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i7);
            }
        } catch (ConcurrentModificationException e7) {
            c(e7);
        }
    }

    @Override // r3.h.j
    public void onPageScrolled(int i7, float f7, @u0 int i8) {
        try {
            Iterator<h.j> it = this.f15609a.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i7, f7, i8);
            }
        } catch (ConcurrentModificationException e7) {
            c(e7);
        }
    }

    @Override // r3.h.j
    public void onPageSelected(int i7) {
        try {
            Iterator<h.j> it = this.f15609a.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i7);
            }
        } catch (ConcurrentModificationException e7) {
            c(e7);
        }
    }
}