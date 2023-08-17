package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import d.b1;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final DragAndDropPermissions f3604a;

    @d.w0(24)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static void a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @d.u
        public static DragAndDropPermissions b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    public h0(DragAndDropPermissions dragAndDropPermissions) {
        this.f3604a = dragAndDropPermissions;
    }

    @d.b1({b1.a.f8135m})
    @d.q0
    public static h0 b(@d.o0 Activity activity, @d.o0 DragEvent dragEvent) {
        DragAndDropPermissions b7 = a.b(activity, dragEvent);
        if (b7 != null) {
            return new h0(b7);
        }
        return null;
    }

    public void a() {
        a.a(this.f3604a);
    }
}