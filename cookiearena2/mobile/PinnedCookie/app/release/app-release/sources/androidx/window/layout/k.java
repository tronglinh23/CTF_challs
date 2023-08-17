package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.l;
import androidx.window.layout.m;
import java.util.ArrayList;
import java.util.List;
import u4.l0;
/* loaded from: classes.dex */
public final class k {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final k f7064a = new k();

    @n6.e
    public final l a(@n6.d Activity activity, @n6.d FoldingFeature foldingFeature) {
        m.b a7;
        l.c cVar;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        l0.p(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            a7 = m.b.f7081b.a();
        } else if (type != 2) {
            return null;
        } else {
            a7 = m.b.f7081b.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            cVar = l.c.f7074c;
        } else if (state != 2) {
            return null;
        } else {
            cVar = l.c.f7075d;
        }
        Rect bounds = foldingFeature.getBounds();
        l0.o(bounds, "oemFeature.bounds");
        if (c(activity, new t3.b(bounds))) {
            Rect bounds2 = foldingFeature.getBounds();
            l0.o(bounds2, "oemFeature.bounds");
            return new m(new t3.b(bounds2), a7, cVar);
        }
        return null;
    }

    @n6.d
    public final w b(@n6.d Activity activity, @n6.d WindowLayoutInfo windowLayoutInfo) {
        l lVar;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        l0.p(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        l0.o(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                k kVar = f7064a;
                l0.o(foldingFeature, "feature");
                lVar = kVar.a(activity, foldingFeature);
            } else {
                lVar = null;
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return new w(arrayList);
    }

    public final boolean c(Activity activity, t3.b bVar) {
        Rect a7 = b0.f7050b.e(activity).a();
        if (bVar.h()) {
            return false;
        }
        if (bVar.f() == a7.width() || bVar.b() == a7.height()) {
            if (bVar.f() >= a7.width() || bVar.b() >= a7.height()) {
                return (bVar.f() == a7.width() && bVar.b() == a7.height()) ? false : true;
            }
            return false;
        }
        return false;
    }
}
