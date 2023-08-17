package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

@u4.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes.dex */
public final class z0 {

    /* loaded from: classes.dex */
    public static final class a implements f5.m<MenuItem> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Menu f3881a;

        public a(Menu menu) {
            this.f3881a = menu;
        }

        @Override // f5.m
        @n6.d
        public Iterator<MenuItem> iterator() {
            return z0.i(this.f3881a);
        }
    }

    @u4.r1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b implements Iterator<MenuItem>, v4.d {

        /* renamed from: k  reason: collision with root package name */
        public int f3882k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Menu f3883l;

        public b(Menu menu) {
            this.f3883l = menu;
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f3883l;
            int i7 = this.f3882k;
            this.f3882k = i7 + 1;
            MenuItem item = menu.getItem(i7);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3882k < this.f3883l.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            v3.m2 m2Var;
            Menu menu = this.f3883l;
            int i7 = this.f3882k - 1;
            this.f3882k = i7;
            MenuItem item = menu.getItem(i7);
            if (item != null) {
                u4.l0.o(item, "getItem(index)");
                menu.removeItem(item.getItemId());
                m2Var = v3.m2.f17815a;
            } else {
                m2Var = null;
            }
            if (m2Var == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final boolean a(@n6.d Menu menu, @n6.d MenuItem menuItem) {
        u4.l0.p(menu, "<this>");
        u4.l0.p(menuItem, "item");
        int size = menu.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (u4.l0.g(menu.getItem(i7), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@n6.d Menu menu, @n6.d t4.l<? super MenuItem, v3.m2> lVar) {
        u4.l0.p(menu, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        int size = menu.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = menu.getItem(i7);
            u4.l0.o(item, "getItem(index)");
            lVar.O(item);
        }
    }

    public static final void c(@n6.d Menu menu, @n6.d t4.p<? super Integer, ? super MenuItem, v3.m2> pVar) {
        u4.l0.p(menu, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int size = menu.size();
        for (int i7 = 0; i7 < size; i7++) {
            Integer valueOf = Integer.valueOf(i7);
            MenuItem item = menu.getItem(i7);
            u4.l0.o(item, "getItem(index)");
            pVar.J(valueOf, item);
        }
    }

    @n6.d
    public static final MenuItem d(@n6.d Menu menu, int i7) {
        u4.l0.p(menu, "<this>");
        MenuItem item = menu.getItem(i7);
        u4.l0.o(item, "getItem(index)");
        return item;
    }

    @n6.d
    public static final f5.m<MenuItem> e(@n6.d Menu menu) {
        u4.l0.p(menu, "<this>");
        return new a(menu);
    }

    public static final int f(@n6.d Menu menu) {
        u4.l0.p(menu, "<this>");
        return menu.size();
    }

    public static final boolean g(@n6.d Menu menu) {
        u4.l0.p(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean h(@n6.d Menu menu) {
        u4.l0.p(menu, "<this>");
        return menu.size() != 0;
    }

    @n6.d
    public static final Iterator<MenuItem> i(@n6.d Menu menu) {
        u4.l0.p(menu, "<this>");
        return new b(menu);
    }

    public static final void j(@n6.d Menu menu, @n6.d MenuItem menuItem) {
        u4.l0.p(menu, "<this>");
        u4.l0.p(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }

    public static final void k(@n6.d Menu menu, int i7) {
        v3.m2 m2Var;
        u4.l0.p(menu, "<this>");
        MenuItem item = menu.getItem(i7);
        if (item != null) {
            menu.removeItem(item.getItemId());
            m2Var = v3.m2.f17815a;
        } else {
            m2Var = null;
        }
        if (m2Var == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}