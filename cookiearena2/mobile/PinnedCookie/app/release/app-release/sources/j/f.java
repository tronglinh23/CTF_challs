package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import androidx.collection.m;
import d.b1;
import j.b;
import java.util.ArrayList;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11321a;

    /* renamed from: b  reason: collision with root package name */
    public final b f11322b;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f11323a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f11324b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<f> f11325c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final m<Menu, Menu> f11326d = new m<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f11324b = context;
            this.f11323a = callback;
        }

        @Override // j.b.a
        public boolean a(b bVar, MenuItem menuItem) {
            return this.f11323a.onActionItemClicked(e(bVar), new k(this.f11324b, (u0.b) menuItem));
        }

        @Override // j.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f11323a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // j.b.a
        public void c(b bVar) {
            this.f11323a.onDestroyActionMode(e(bVar));
        }

        @Override // j.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f11323a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f11325c.size();
            for (int i7 = 0; i7 < size; i7++) {
                f fVar = this.f11325c.get(i7);
                if (fVar != null && fVar.f11322b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f11324b, bVar);
            this.f11325c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = this.f11326d.get(menu);
            if (menu2 == null) {
                p pVar = new p(this.f11324b, (u0.a) menu);
                this.f11326d.put(menu, pVar);
                return pVar;
            }
            return menu2;
        }
    }

    public f(Context context, b bVar) {
        this.f11321a = context;
        this.f11322b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f11322b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f11322b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new p(this.f11321a, (u0.a) this.f11322b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f11322b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f11322b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f11322b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f11322b.g();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f11322b.h();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f11322b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f11322b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f11322b.l(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f11322b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f11322b.o(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f11322b.q(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z6) {
        this.f11322b.r(z6);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i7) {
        this.f11322b.m(i7);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i7) {
        this.f11322b.p(i7);
    }
}
