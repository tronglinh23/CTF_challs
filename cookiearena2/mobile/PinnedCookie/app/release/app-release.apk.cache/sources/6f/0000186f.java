package p3;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f14645c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f14646d = -2;

    /* renamed from: a  reason: collision with root package name */
    public final DataSetObservable f14647a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    public DataSetObserver f14648b;

    @Deprecated
    public void a(@o0 View view, int i7, @o0 Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(@o0 ViewGroup viewGroup, int i7, @o0 Object obj) {
        a(viewGroup, i7, obj);
    }

    @Deprecated
    public void c(@o0 View view) {
    }

    public void d(@o0 ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(@o0 Object obj) {
        return -1;
    }

    @q0
    public CharSequence g(int i7) {
        return null;
    }

    public float h(int i7) {
        return 1.0f;
    }

    @o0
    @Deprecated
    public Object i(@o0 View view, int i7) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @o0
    public Object j(@o0 ViewGroup viewGroup, int i7) {
        return i(viewGroup, i7);
    }

    public abstract boolean k(@o0 View view, @o0 Object obj);

    public void l() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f14648b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f14647a.notifyChanged();
    }

    public void m(@o0 DataSetObserver dataSetObserver) {
        this.f14647a.registerObserver(dataSetObserver);
    }

    public void n(@q0 Parcelable parcelable, @q0 ClassLoader classLoader) {
    }

    @q0
    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(@o0 View view, int i7, @o0 Object obj) {
    }

    public void q(@o0 ViewGroup viewGroup, int i7, @o0 Object obj) {
        p(viewGroup, i7, obj);
    }

    public void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f14648b = dataSetObserver;
        }
    }

    @Deprecated
    public void s(@o0 View view) {
    }

    public void t(@o0 ViewGroup viewGroup) {
        s(viewGroup);
    }

    public void u(@o0 DataSetObserver dataSetObserver) {
        this.f14647a.unregisterObserver(dataSetObserver);
    }
}