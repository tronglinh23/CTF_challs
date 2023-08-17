package l6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.o0;
import d.q0;
import k6.d;
import n3.b;
import n3.c;
/* loaded from: classes.dex */
public final class a implements b {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f13388a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Button f13389b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final TextView f13390c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final EditText f13391d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final EditText f13392e;

    public a(@o0 LinearLayout linearLayout, @o0 Button button, @o0 TextView textView, @o0 EditText editText, @o0 EditText editText2) {
        this.f13388a = linearLayout;
        this.f13389b = button;
        this.f13390c = textView;
        this.f13391d = editText;
        this.f13392e = editText2;
    }

    @o0
    public static a b(@o0 View view) {
        int i7 = d.C0142d.f11823a;
        Button button = (Button) c.a(view, i7);
        if (button != null) {
            i7 = d.C0142d.f11824b;
            TextView textView = (TextView) c.a(view, i7);
            if (textView != null) {
                i7 = d.C0142d.f11826d;
                EditText editText = (EditText) c.a(view, i7);
                if (editText != null) {
                    i7 = d.C0142d.f11827e;
                    EditText editText2 = (EditText) c.a(view, i7);
                    if (editText2 != null) {
                        return new a((LinearLayout) view, button, textView, editText, editText2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @o0
    public static a d(@o0 LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @o0
    public static a e(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, boolean z6) {
        View inflate = layoutInflater.inflate(d.e.f11828a, viewGroup, false);
        if (z6) {
            viewGroup.addView(inflate);
        }
        return b(inflate);
    }

    @Override // n3.b
    @o0
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public LinearLayout a() {
        return this.f13388a;
    }
}
