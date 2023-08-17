package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class c0 {
    @d.o0

    /* renamed from: a  reason: collision with root package name */
    public TextView f1502a;
    @d.q0

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f1503b;

    @d.w0(26)
    /* loaded from: classes.dex */
    public static final class a {
        @d.u
        @d.o0
        public static TextClassifier a(@d.o0 TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public c0(@d.o0 TextView textView) {
        this.f1502a = (TextView) g1.s.l(textView);
    }

    @d.o0
    @d.w0(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier = this.f1503b;
        return textClassifier == null ? a.a(this.f1502a) : textClassifier;
    }

    @d.w0(api = 26)
    public void b(@d.q0 TextClassifier textClassifier) {
        this.f1503b = textClassifier;
    }
}
