package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
/* loaded from: classes.dex */
public interface p1 extends SpinnerAdapter {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1744a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f1745b;

        /* renamed from: c  reason: collision with root package name */
        public LayoutInflater f1746c;

        public a(@d.o0 Context context) {
            this.f1744a = context;
            this.f1745b = LayoutInflater.from(context);
        }

        @d.o0
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.f1746c;
            return layoutInflater != null ? layoutInflater : this.f1745b;
        }

        @d.q0
        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.f1746c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(@d.q0 Resources.Theme theme) {
            if (theme == null) {
                this.f1746c = null;
            } else if (theme.equals(this.f1744a.getTheme())) {
                this.f1746c = this.f1745b;
            } else {
                this.f1746c = LayoutInflater.from(new j.d(this.f1744a, theme));
            }
        }
    }

    @d.q0
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@d.q0 Resources.Theme theme);
}
