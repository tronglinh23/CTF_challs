package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.d;
import f.a;
/* loaded from: classes.dex */
public class l1 extends androidx.core.view.b {

    /* renamed from: k  reason: collision with root package name */
    public static final int f1701k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final String f1702l = "share_history.xml";

    /* renamed from: e  reason: collision with root package name */
    public int f1703e;

    /* renamed from: f  reason: collision with root package name */
    public final c f1704f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f1705g;

    /* renamed from: h  reason: collision with root package name */
    public String f1706h;

    /* renamed from: i  reason: collision with root package name */
    public a f1707i;

    /* renamed from: j  reason: collision with root package name */
    public d.f f1708j;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(l1 l1Var, Intent intent);
    }

    /* loaded from: classes.dex */
    public class b implements d.f {
        public b() {
        }

        @Override // androidx.appcompat.widget.d.f
        public boolean a(d dVar, Intent intent) {
            l1 l1Var = l1.this;
            a aVar = l1Var.f1707i;
            if (aVar != null) {
                aVar.a(l1Var, intent);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements MenuItem.OnMenuItemClickListener {
        public c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            l1 l1Var = l1.this;
            Intent b7 = d.d(l1Var.f1705g, l1Var.f1706h).b(menuItem.getItemId());
            if (b7 != null) {
                String action = b7.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    l1.this.r(b7);
                }
                l1.this.f1705g.startActivity(b7);
                return true;
            }
            return true;
        }
    }

    public l1(Context context) {
        super(context);
        this.f1703e = 4;
        this.f1704f = new c();
        this.f1706h = f1702l;
        this.f1705g = context;
    }

    @Override // androidx.core.view.b
    public boolean b() {
        return true;
    }

    @Override // androidx.core.view.b
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1705g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(d.d(this.f1705g, this.f1706h));
        }
        TypedValue typedValue = new TypedValue();
        this.f1705g.getTheme().resolveAttribute(a.b.A, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(g.a.b(this.f1705g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(a.k.f9245z);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(a.k.f9244y);
        return activityChooserView;
    }

    @Override // androidx.core.view.b
    public void g(SubMenu subMenu) {
        subMenu.clear();
        d d7 = d.d(this.f1705g, this.f1706h);
        PackageManager packageManager = this.f1705g.getPackageManager();
        int f7 = d7.f();
        int min = Math.min(f7, this.f1703e);
        for (int i7 = 0; i7 < min; i7++) {
            ResolveInfo e7 = d7.e(i7);
            subMenu.add(0, i7, i7, e7.loadLabel(packageManager)).setIcon(e7.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1704f);
        }
        if (min < f7) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1705g.getString(a.k.f9224e));
            for (int i8 = 0; i8 < f7; i8++) {
                ResolveInfo e8 = d7.e(i8);
                addSubMenu.add(0, i8, i8, e8.loadLabel(packageManager)).setIcon(e8.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1704f);
            }
        }
    }

    public final void n() {
        if (this.f1707i == null) {
            return;
        }
        if (this.f1708j == null) {
            this.f1708j = new b();
        }
        d.d(this.f1705g, this.f1706h).u(this.f1708j);
    }

    public void o(a aVar) {
        this.f1707i = aVar;
        n();
    }

    public void p(String str) {
        this.f1706h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        d.d(this.f1705g, this.f1706h).t(intent);
    }

    public void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
