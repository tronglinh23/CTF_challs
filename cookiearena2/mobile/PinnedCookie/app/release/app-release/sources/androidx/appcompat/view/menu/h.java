package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.n;
import androidx.core.view.o1;
import d.o0;
import f.a;
/* loaded from: classes.dex */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {

    /* renamed from: b  reason: collision with root package name */
    public g f1141b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.appcompat.app.d f1142c;

    /* renamed from: d  reason: collision with root package name */
    public e f1143d;

    /* renamed from: e  reason: collision with root package name */
    public n.a f1144e;

    public h(g gVar) {
        this.f1141b = gVar;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean a(@o0 g gVar) {
        n.a aVar = this.f1144e;
        if (aVar != null) {
            return aVar.a(gVar);
        }
        return false;
    }

    public void b() {
        androidx.appcompat.app.d dVar = this.f1142c;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public void c(n.a aVar) {
        this.f1144e = aVar;
    }

    public void d(IBinder iBinder) {
        g gVar = this.f1141b;
        d.a aVar = new d.a(gVar.getContext());
        e eVar = new e(aVar.getContext(), a.j.f9210q);
        this.f1143d = eVar;
        eVar.setCallback(this);
        this.f1141b.addMenuPresenter(this.f1143d);
        aVar.setAdapter(this.f1143d.a(), this);
        View headerView = gVar.getHeaderView();
        if (headerView != null) {
            aVar.setCustomTitle(headerView);
        } else {
            aVar.setIcon(gVar.getHeaderIcon()).setTitle(gVar.getHeaderTitle());
        }
        aVar.setOnKeyListener(this);
        androidx.appcompat.app.d create = aVar.create();
        this.f1142c = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1142c.getWindow().getAttributes();
        attributes.type = o1.f3750f;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1142c.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i7) {
        this.f1141b.performItemAction((j) this.f1143d.a().getItem(i7), 0);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void onCloseMenu(@o0 g gVar, boolean z6) {
        if (z6 || gVar == this.f1141b) {
            b();
        }
        n.a aVar = this.f1144e;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z6);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1143d.onCloseMenu(this.f1141b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1142c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1142c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1141b.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1141b.performShortcut(i7, keyEvent, 0);
    }
}
