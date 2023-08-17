package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import d.o0;
import d.q0;
import java.util.List;
/* loaded from: classes.dex */
public abstract class s<T, VH extends RecyclerView.f0> extends RecyclerView.g<VH> {

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f5591a;

    /* renamed from: b  reason: collision with root package name */
    public final d.b<T> f5592b;

    /* loaded from: classes.dex */
    public class a implements d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(@o0 List<T> list, @o0 List<T> list2) {
            s.this.e(list, list2);
        }
    }

    public s(@o0 i.d<T> dVar) {
        a aVar = new a();
        this.f5592b = aVar;
        d<T> dVar2 = new d<>(new b(this), new c.a(dVar).a());
        this.f5591a = dVar2;
        dVar2.a(aVar);
    }

    @o0
    public List<T> c() {
        return this.f5591a.b();
    }

    public T d(int i7) {
        return this.f5591a.b().get(i7);
    }

    public void e(@o0 List<T> list, @o0 List<T> list2) {
    }

    public void f(@q0 List<T> list) {
        this.f5591a.f(list);
    }

    public void g(@q0 List<T> list, @q0 Runnable runnable) {
        this.f5591a.g(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.f5591a.b().size();
    }

    public s(@o0 c<T> cVar) {
        a aVar = new a();
        this.f5592b = aVar;
        d<T> dVar = new d<>(new b(this), cVar);
        this.f5591a = dVar;
        dVar.a(aVar);
    }
}
