package k1;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.l1;
import d.b1;
import d.o0;
import d.q0;
import d.w0;
@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class a0 implements l1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11568a = "ReceiveContent";

    @w0(16)
    /* loaded from: classes.dex */
    public static final class a {
        public static CharSequence a(@o0 Context context, @o0 ClipData.Item item, int i7) {
            if ((i7 & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static CharSequence a(@o0 Context context, @o0 ClipData.Item item, int i7) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i7 & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    public static CharSequence b(@o0 Context context, @o0 ClipData.Item item, int i7) {
        return a.a(context, item, i7);
    }

    public static void c(@o0 Editable editable, @o0 CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.l1
    @q0
    public androidx.core.view.k a(@o0 View view, @o0 androidx.core.view.k kVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(kVar);
        }
        if (kVar.g() == 2) {
            return kVar;
        }
        ClipData c7 = kVar.c();
        int e7 = kVar.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z6 = false;
        for (int i7 = 0; i7 < c7.getItemCount(); i7++) {
            CharSequence b7 = b(context, c7.getItemAt(i7), e7);
            if (b7 != null) {
                if (z6) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b7);
                } else {
                    c(editable, b7);
                    z6 = true;
                }
            }
        }
        return null;
    }
}
