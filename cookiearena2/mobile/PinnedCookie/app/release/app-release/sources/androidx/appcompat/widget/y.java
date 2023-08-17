package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.k;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1844a = "ReceiveContent";

    @d.w0(24)
    /* loaded from: classes.dex */
    public static final class a {
        @d.u
        public static boolean a(@d.o0 DragEvent dragEvent, @d.o0 TextView textView, @d.o0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                androidx.core.view.u1.m1(textView, new k.b(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @d.u
        public static boolean b(@d.o0 DragEvent dragEvent, @d.o0 View view, @d.o0 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            androidx.core.view.u1.m1(view, new k.b(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    public static boolean a(@d.o0 View view, @d.o0 DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && androidx.core.view.u1.h0(view) != null) {
            Activity c7 = c(view);
            if (c7 == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? a.a(dragEvent, (TextView) view, c7) : a.b(dragEvent, view, c7);
                }
            }
        }
        return false;
    }

    public static boolean b(@d.o0 TextView textView, int i7) {
        if (Build.VERSION.SDK_INT >= 31 || androidx.core.view.u1.h0(textView) == null || !(i7 == 16908322 || i7 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            androidx.core.view.u1.m1(textView, new k.b(primaryClip, 1).d(i7 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    @d.q0
    public static Activity c(@d.o0 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
