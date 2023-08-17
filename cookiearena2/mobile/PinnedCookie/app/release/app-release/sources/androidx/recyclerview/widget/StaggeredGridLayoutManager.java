package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.b1;
import d.o0;
import d.q0;
import h1.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.b0.b {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 0;
    @Deprecated
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = Integer.MIN_VALUE;
    public static final float G = 0.33333334f;

    /* renamed from: y  reason: collision with root package name */
    public static final String f5146y = "StaggeredGridLManager";

    /* renamed from: z  reason: collision with root package name */
    public static final boolean f5147z = false;

    /* renamed from: b  reason: collision with root package name */
    public f[] f5149b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public w f5150c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public w f5151d;

    /* renamed from: e  reason: collision with root package name */
    public int f5152e;

    /* renamed from: f  reason: collision with root package name */
    public int f5153f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public final p f5154g;

    /* renamed from: j  reason: collision with root package name */
    public BitSet f5157j;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5162o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5163p;

    /* renamed from: q  reason: collision with root package name */
    public e f5164q;

    /* renamed from: r  reason: collision with root package name */
    public int f5165r;

    /* renamed from: w  reason: collision with root package name */
    public int[] f5170w;

    /* renamed from: a  reason: collision with root package name */
    public int f5148a = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5155h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5156i = false;

    /* renamed from: k  reason: collision with root package name */
    public int f5158k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f5159l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public d f5160m = new d();

    /* renamed from: n  reason: collision with root package name */
    public int f5161n = 2;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f5166s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public final b f5167t = new b();

    /* renamed from: u  reason: collision with root package name */
    public boolean f5168u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5169v = true;

    /* renamed from: x  reason: collision with root package name */
    public final Runnable f5171x = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5173a;

        /* renamed from: b  reason: collision with root package name */
        public int f5174b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5175c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5176d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5177e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f5178f;

        public b() {
            c();
        }

        public void a() {
            this.f5174b = this.f5175c ? StaggeredGridLayoutManager.this.f5150c.i() : StaggeredGridLayoutManager.this.f5150c.n();
        }

        public void b(int i7) {
            if (this.f5175c) {
                this.f5174b = StaggeredGridLayoutManager.this.f5150c.i() - i7;
            } else {
                this.f5174b = StaggeredGridLayoutManager.this.f5150c.n() + i7;
            }
        }

        public void c() {
            this.f5173a = -1;
            this.f5174b = Integer.MIN_VALUE;
            this.f5175c = false;
            this.f5176d = false;
            this.f5177e = false;
            int[] iArr = this.f5178f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f5178f;
            if (iArr == null || iArr.length < length) {
                this.f5178f = new int[StaggeredGridLayoutManager.this.f5149b.length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                this.f5178f[i7] = fVarArr[i7].u(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {

        /* renamed from: g  reason: collision with root package name */
        public static final int f5180g = -1;

        /* renamed from: e  reason: collision with root package name */
        public f f5181e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5182f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int h() {
            f fVar = this.f5181e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f5205e;
        }

        public boolean i() {
            return this.f5182f;
        }

        public void j(boolean z6) {
            this.f5182f = z6;
        }

        public c(int i7, int i8) {
            super(i7, i8);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(RecyclerView.p pVar) {
            super(pVar);
        }
    }

    @b1({b1.a.LIBRARY})
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: k  reason: collision with root package name */
        public int f5190k;

        /* renamed from: l  reason: collision with root package name */
        public int f5191l;

        /* renamed from: m  reason: collision with root package name */
        public int f5192m;

        /* renamed from: n  reason: collision with root package name */
        public int[] f5193n;

        /* renamed from: o  reason: collision with root package name */
        public int f5194o;

        /* renamed from: p  reason: collision with root package name */
        public int[] f5195p;

        /* renamed from: q  reason: collision with root package name */
        public List<d.a> f5196q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f5197r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f5198s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f5199t;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i7) {
                return new e[i7];
            }
        }

        public e() {
        }

        public void a() {
            this.f5193n = null;
            this.f5192m = 0;
            this.f5190k = -1;
            this.f5191l = -1;
        }

        public void b() {
            this.f5193n = null;
            this.f5192m = 0;
            this.f5194o = 0;
            this.f5195p = null;
            this.f5196q = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f5190k);
            parcel.writeInt(this.f5191l);
            parcel.writeInt(this.f5192m);
            if (this.f5192m > 0) {
                parcel.writeIntArray(this.f5193n);
            }
            parcel.writeInt(this.f5194o);
            if (this.f5194o > 0) {
                parcel.writeIntArray(this.f5195p);
            }
            parcel.writeInt(this.f5197r ? 1 : 0);
            parcel.writeInt(this.f5198s ? 1 : 0);
            parcel.writeInt(this.f5199t ? 1 : 0);
            parcel.writeList(this.f5196q);
        }

        public e(Parcel parcel) {
            this.f5190k = parcel.readInt();
            this.f5191l = parcel.readInt();
            int readInt = parcel.readInt();
            this.f5192m = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f5193n = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f5194o = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f5195p = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f5197r = parcel.readInt() == 1;
            this.f5198s = parcel.readInt() == 1;
            this.f5199t = parcel.readInt() == 1;
            this.f5196q = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f5192m = eVar.f5192m;
            this.f5190k = eVar.f5190k;
            this.f5191l = eVar.f5191l;
            this.f5193n = eVar.f5193n;
            this.f5194o = eVar.f5194o;
            this.f5195p = eVar.f5195p;
            this.f5197r = eVar.f5197r;
            this.f5198s = eVar.f5198s;
            this.f5199t = eVar.f5199t;
            this.f5196q = eVar.f5196q;
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: g  reason: collision with root package name */
        public static final int f5200g = Integer.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f5201a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f5202b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f5203c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f5204d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f5205e;

        public f(int i7) {
            this.f5205e = i7;
        }

        public void A(int i7) {
            this.f5202b = i7;
            this.f5203c = i7;
        }

        public void a(View view) {
            c s6 = s(view);
            s6.f5181e = this;
            this.f5201a.add(view);
            this.f5203c = Integer.MIN_VALUE;
            if (this.f5201a.size() == 1) {
                this.f5202b = Integer.MIN_VALUE;
            }
            if (s6.e() || s6.d()) {
                this.f5204d += StaggeredGridLayoutManager.this.f5150c.e(view);
            }
        }

        public void b(boolean z6, int i7) {
            int q6 = z6 ? q(Integer.MIN_VALUE) : u(Integer.MIN_VALUE);
            e();
            if (q6 == Integer.MIN_VALUE) {
                return;
            }
            if (!z6 || q6 >= StaggeredGridLayoutManager.this.f5150c.i()) {
                if (z6 || q6 <= StaggeredGridLayoutManager.this.f5150c.n()) {
                    if (i7 != Integer.MIN_VALUE) {
                        q6 += i7;
                    }
                    this.f5203c = q6;
                    this.f5202b = q6;
                }
            }
        }

        public void c() {
            d.a f7;
            ArrayList<View> arrayList = this.f5201a;
            View view = arrayList.get(arrayList.size() - 1);
            c s6 = s(view);
            this.f5203c = StaggeredGridLayoutManager.this.f5150c.d(view);
            if (s6.f5182f && (f7 = StaggeredGridLayoutManager.this.f5160m.f(s6.b())) != null && f7.f5187l == 1) {
                this.f5203c += f7.a(this.f5205e);
            }
        }

        public void d() {
            d.a f7;
            View view = this.f5201a.get(0);
            c s6 = s(view);
            this.f5202b = StaggeredGridLayoutManager.this.f5150c.g(view);
            if (s6.f5182f && (f7 = StaggeredGridLayoutManager.this.f5160m.f(s6.b())) != null && f7.f5187l == -1) {
                this.f5202b -= f7.a(this.f5205e);
            }
        }

        public void e() {
            this.f5201a.clear();
            v();
            this.f5204d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f5155h ? n(this.f5201a.size() - 1, -1, true) : n(0, this.f5201a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f5155h ? m(this.f5201a.size() - 1, -1, true) : m(0, this.f5201a.size(), true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.f5155h ? n(this.f5201a.size() - 1, -1, false) : n(0, this.f5201a.size(), false);
        }

        public int i() {
            return StaggeredGridLayoutManager.this.f5155h ? n(0, this.f5201a.size(), true) : n(this.f5201a.size() - 1, -1, true);
        }

        public int j() {
            return StaggeredGridLayoutManager.this.f5155h ? m(0, this.f5201a.size(), true) : m(this.f5201a.size() - 1, -1, true);
        }

        public int k() {
            return StaggeredGridLayoutManager.this.f5155h ? n(0, this.f5201a.size(), false) : n(this.f5201a.size() - 1, -1, false);
        }

        public int l(int i7, int i8, boolean z6, boolean z7, boolean z8) {
            int n7 = StaggeredGridLayoutManager.this.f5150c.n();
            int i9 = StaggeredGridLayoutManager.this.f5150c.i();
            int i10 = i8 > i7 ? 1 : -1;
            while (i7 != i8) {
                View view = this.f5201a.get(i7);
                int g7 = StaggeredGridLayoutManager.this.f5150c.g(view);
                int d7 = StaggeredGridLayoutManager.this.f5150c.d(view);
                boolean z9 = false;
                boolean z10 = !z8 ? g7 >= i9 : g7 > i9;
                if (!z8 ? d7 > n7 : d7 >= n7) {
                    z9 = true;
                }
                if (z10 && z9) {
                    if (z6 && z7) {
                        if (g7 >= n7 && d7 <= i9) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else if (z7) {
                        return StaggeredGridLayoutManager.this.getPosition(view);
                    } else {
                        if (g7 < n7 || d7 > i9) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i7 += i10;
            }
            return -1;
        }

        public int m(int i7, int i8, boolean z6) {
            return l(i7, i8, false, false, z6);
        }

        public int n(int i7, int i8, boolean z6) {
            return l(i7, i8, z6, true, false);
        }

        public int o() {
            return this.f5204d;
        }

        public int p() {
            int i7 = this.f5203c;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            c();
            return this.f5203c;
        }

        public int q(int i7) {
            int i8 = this.f5203c;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f5201a.size() == 0) {
                return i7;
            }
            c();
            return this.f5203c;
        }

        public View r(int i7, int i8) {
            View view = null;
            if (i8 != -1) {
                int size = this.f5201a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f5201a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f5155h && staggeredGridLayoutManager.getPosition(view2) >= i7) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f5155h && staggeredGridLayoutManager2.getPosition(view2) <= i7) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f5201a.size();
                int i9 = 0;
                while (i9 < size2) {
                    View view3 = this.f5201a.get(i9);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f5155h && staggeredGridLayoutManager3.getPosition(view3) <= i7) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f5155h && staggeredGridLayoutManager4.getPosition(view3) >= i7) || !view3.hasFocusable()) {
                        break;
                    }
                    i9++;
                    view = view3;
                }
            }
            return view;
        }

        public c s(View view) {
            return (c) view.getLayoutParams();
        }

        public int t() {
            int i7 = this.f5202b;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            d();
            return this.f5202b;
        }

        public int u(int i7) {
            int i8 = this.f5202b;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f5201a.size() == 0) {
                return i7;
            }
            d();
            return this.f5202b;
        }

        public void v() {
            this.f5202b = Integer.MIN_VALUE;
            this.f5203c = Integer.MIN_VALUE;
        }

        public void w(int i7) {
            int i8 = this.f5202b;
            if (i8 != Integer.MIN_VALUE) {
                this.f5202b = i8 + i7;
            }
            int i9 = this.f5203c;
            if (i9 != Integer.MIN_VALUE) {
                this.f5203c = i9 + i7;
            }
        }

        public void x() {
            int size = this.f5201a.size();
            View remove = this.f5201a.remove(size - 1);
            c s6 = s(remove);
            s6.f5181e = null;
            if (s6.e() || s6.d()) {
                this.f5204d -= StaggeredGridLayoutManager.this.f5150c.e(remove);
            }
            if (size == 1) {
                this.f5202b = Integer.MIN_VALUE;
            }
            this.f5203c = Integer.MIN_VALUE;
        }

        public void y() {
            View remove = this.f5201a.remove(0);
            c s6 = s(remove);
            s6.f5181e = null;
            if (this.f5201a.size() == 0) {
                this.f5203c = Integer.MIN_VALUE;
            }
            if (s6.e() || s6.d()) {
                this.f5204d -= StaggeredGridLayoutManager.this.f5150c.e(remove);
            }
            this.f5202b = Integer.MIN_VALUE;
        }

        public void z(View view) {
            c s6 = s(view);
            s6.f5181e = this;
            this.f5201a.add(0, view);
            this.f5202b = Integer.MIN_VALUE;
            if (this.f5201a.size() == 1) {
                this.f5203c = Integer.MIN_VALUE;
            }
            if (s6.e() || s6.d()) {
                this.f5204d += StaggeredGridLayoutManager.this.f5150c.e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        RecyclerView.o.d properties = RecyclerView.o.getProperties(context, attributeSet, i7, i8);
        setOrientation(properties.f5119a);
        f0(properties.f5120b);
        setReverseLayout(properties.f5121c);
        this.f5154g = new p();
        t();
    }

    public int[] A(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5148a];
        } else if (iArr.length < this.f5148a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5148a + ", array size:" + iArr.length);
        }
        for (int i7 = 0; i7 < this.f5148a; i7++) {
            iArr[i7] = this.f5149b[i7].h();
        }
        return iArr;
    }

    public int[] B(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5148a];
        } else if (iArr.length < this.f5148a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5148a + ", array size:" + iArr.length);
        }
        for (int i7 = 0; i7 < this.f5148a; i7++) {
            iArr[i7] = this.f5149b[i7].i();
        }
        return iArr;
    }

    public final int C(int i7) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i7) {
                return position;
            }
        }
        return 0;
    }

    public int[] D(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5148a];
        } else if (iArr.length < this.f5148a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5148a + ", array size:" + iArr.length);
        }
        for (int i7 = 0; i7 < this.f5148a; i7++) {
            iArr[i7] = this.f5149b[i7].k();
        }
        return iArr;
    }

    public final void E(RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z6) {
        int i7;
        int J = J(Integer.MIN_VALUE);
        if (J != Integer.MIN_VALUE && (i7 = this.f5150c.i() - J) > 0) {
            int i8 = i7 - (-scrollBy(-i7, wVar, c0Var));
            if (!z6 || i8 <= 0) {
                return;
            }
            this.f5150c.t(i8);
        }
    }

    public final void F(RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z6) {
        int n7;
        int M = M(Integer.MAX_VALUE);
        if (M != Integer.MAX_VALUE && (n7 = M - this.f5150c.n()) > 0) {
            int scrollBy = n7 - scrollBy(n7, wVar, c0Var);
            if (!z6 || scrollBy <= 0) {
                return;
            }
            this.f5150c.t(-scrollBy);
        }
    }

    public int G() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int H() {
        return this.f5161n;
    }

    public int I() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int J(int i7) {
        int q6 = this.f5149b[0].q(i7);
        for (int i8 = 1; i8 < this.f5148a; i8++) {
            int q7 = this.f5149b[i8].q(i7);
            if (q7 > q6) {
                q6 = q7;
            }
        }
        return q6;
    }

    public final int K(int i7) {
        int u6 = this.f5149b[0].u(i7);
        for (int i8 = 1; i8 < this.f5148a; i8++) {
            int u7 = this.f5149b[i8].u(i7);
            if (u7 > u6) {
                u6 = u7;
            }
        }
        return u6;
    }

    public final int L(int i7) {
        int q6 = this.f5149b[0].q(i7);
        for (int i8 = 1; i8 < this.f5148a; i8++) {
            int q7 = this.f5149b[i8].q(i7);
            if (q7 < q6) {
                q6 = q7;
            }
        }
        return q6;
    }

    public final int M(int i7) {
        int u6 = this.f5149b[0].u(i7);
        for (int i8 = 1; i8 < this.f5148a; i8++) {
            int u7 = this.f5149b[i8].u(i7);
            if (u7 < u6) {
                u6 = u7;
            }
        }
        return u6;
    }

    public final f N(p pVar) {
        int i7;
        int i8;
        int i9;
        if (V(pVar.f5583e)) {
            i8 = this.f5148a - 1;
            i7 = -1;
            i9 = -1;
        } else {
            i7 = this.f5148a;
            i8 = 0;
            i9 = 1;
        }
        f fVar = null;
        if (pVar.f5583e == 1) {
            int n7 = this.f5150c.n();
            int i10 = Integer.MAX_VALUE;
            while (i8 != i7) {
                f fVar2 = this.f5149b[i8];
                int q6 = fVar2.q(n7);
                if (q6 < i10) {
                    fVar = fVar2;
                    i10 = q6;
                }
                i8 += i9;
            }
            return fVar;
        }
        int i11 = this.f5150c.i();
        int i12 = Integer.MIN_VALUE;
        while (i8 != i7) {
            f fVar3 = this.f5149b[i8];
            int u6 = fVar3.u(i11);
            if (u6 > i12) {
                fVar = fVar3;
                i12 = u6;
            }
            i8 += i9;
        }
        return fVar;
    }

    public int O() {
        return this.f5148a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5156i
            if (r0 == 0) goto L9
            int r0 = r6.I()
            goto Ld
        L9:
            int r0 = r6.G()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f5160m
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5160m
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f5160m
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5160m
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5160m
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f5156i
            if (r7 == 0) goto L4d
            int r7 = r6.G()
            goto L51
        L4d:
            int r7 = r6.I()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View Q() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f5148a
            r2.<init>(r3)
            int r3 = r12.f5148a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f5152e
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.f5156i
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5181e
            int r9 = r9.f5205e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5181e
            boolean r9 = r12.n(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f5181e
            int r9 = r9.f5205e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f5182f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f5156i
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.w r10 = r12.f5150c
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.w r11 = r12.f5150c
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.w r10 = r12.f5150c
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.w r11 = r12.f5150c
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f5181e
            int r8 = r8.f5205e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f5181e
            int r9 = r9.f5205e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q():android.view.View");
    }

    public void R() {
        this.f5160m.b();
        requestLayout();
    }

    public final void S(View view, int i7, int i8, boolean z6) {
        calculateItemDecorationsForChild(view, this.f5166s);
        c cVar = (c) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f5166s;
        int n02 = n0(i7, i9 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i10 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f5166s;
        int n03 = n0(i8, i10 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z6 ? shouldReMeasureChild(view, n02, n03, cVar) : shouldMeasureChild(view, n02, n03, cVar)) {
            view.measure(n02, n03);
        }
    }

    public final void T(View view, c cVar, boolean z6) {
        if (cVar.f5182f) {
            if (this.f5152e == 1) {
                S(view, this.f5165r, RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z6);
            } else {
                S(view, RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f5165r, z6);
            }
        } else if (this.f5152e == 1) {
            S(view, RecyclerView.o.getChildMeasureSpec(this.f5153f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z6);
        } else {
            S(view, RecyclerView.o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.getChildMeasureSpec(this.f5153f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (m() != false) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.c0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$c0, boolean):void");
    }

    public final boolean V(int i7) {
        if (this.f5152e == 0) {
            return (i7 == -1) != this.f5156i;
        }
        return ((i7 == -1) == this.f5156i) == isLayoutRTL();
    }

    public void W(int i7, RecyclerView.c0 c0Var) {
        int G2;
        int i8;
        if (i7 > 0) {
            G2 = I();
            i8 = 1;
        } else {
            G2 = G();
            i8 = -1;
        }
        this.f5154g.f5579a = true;
        k0(G2, c0Var);
        e0(i8);
        p pVar = this.f5154g;
        pVar.f5581c = G2 + pVar.f5582d;
        pVar.f5580b = Math.abs(i7);
    }

    public final void X(View view) {
        for (int i7 = this.f5148a - 1; i7 >= 0; i7--) {
            this.f5149b[i7].z(view);
        }
    }

    public final void Y(RecyclerView.w wVar, p pVar) {
        if (!pVar.f5579a || pVar.f5587i) {
            return;
        }
        if (pVar.f5580b == 0) {
            if (pVar.f5583e == -1) {
                Z(wVar, pVar.f5585g);
            } else {
                a0(wVar, pVar.f5584f);
            }
        } else if (pVar.f5583e != -1) {
            int L = L(pVar.f5585g) - pVar.f5585g;
            a0(wVar, L < 0 ? pVar.f5584f : Math.min(L, pVar.f5580b) + pVar.f5584f);
        } else {
            int i7 = pVar.f5584f;
            int K = i7 - K(i7);
            Z(wVar, K < 0 ? pVar.f5585g : pVar.f5585g - Math.min(K, pVar.f5580b));
        }
    }

    public final void Z(RecyclerView.w wVar, int i7) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f5150c.g(childAt) < i7 || this.f5150c.r(childAt) < i7) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f5182f) {
                for (int i8 = 0; i8 < this.f5148a; i8++) {
                    if (this.f5149b[i8].f5201a.size() == 1) {
                        return;
                    }
                }
                for (int i9 = 0; i9 < this.f5148a; i9++) {
                    this.f5149b[i9].x();
                }
            } else if (cVar.f5181e.f5201a.size() == 1) {
                return;
            } else {
                cVar.f5181e.x();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    public final void a0(RecyclerView.w wVar, int i7) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f5150c.d(childAt) > i7 || this.f5150c.q(childAt) > i7) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f5182f) {
                for (int i8 = 0; i8 < this.f5148a; i8++) {
                    if (this.f5149b[i8].f5201a.size() == 1) {
                        return;
                    }
                }
                for (int i9 = 0; i9 < this.f5148a; i9++) {
                    this.f5149b[i9].y();
                }
            } else if (cVar.f5181e.f5201a.size() == 1) {
                return;
            } else {
                cVar.f5181e.y();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f5164q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public final void b0() {
        if (this.f5151d.l() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f7 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            float e7 = this.f5151d.e(childAt);
            if (e7 >= f7) {
                if (((c) childAt.getLayoutParams()).i()) {
                    e7 = (e7 * 1.0f) / this.f5148a;
                }
                f7 = Math.max(f7, e7);
            }
        }
        int i8 = this.f5153f;
        int round = Math.round(f7 * this.f5148a);
        if (this.f5151d.l() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f5151d.o());
        }
        l0(round);
        if (this.f5153f == i8) {
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            c cVar = (c) childAt2.getLayoutParams();
            if (!cVar.f5182f) {
                if (isLayoutRTL() && this.f5152e == 1) {
                    int i10 = this.f5148a;
                    int i11 = cVar.f5181e.f5205e;
                    childAt2.offsetLeftAndRight(((-((i10 - 1) - i11)) * this.f5153f) - ((-((i10 - 1) - i11)) * i8));
                } else {
                    int i12 = cVar.f5181e.f5205e;
                    int i13 = this.f5153f * i12;
                    int i14 = i12 * i8;
                    if (this.f5152e == 1) {
                        childAt2.offsetLeftAndRight(i13 - i14);
                    } else {
                        childAt2.offsetTopAndBottom(i13 - i14);
                    }
                }
            }
        }
    }

    public final void c0() {
        if (this.f5152e == 1 || !isLayoutRTL()) {
            this.f5156i = this.f5155h;
        } else {
            this.f5156i = !this.f5155h;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollHorizontally() {
        return this.f5152e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean canScrollVertically() {
        return this.f5152e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @b1({b1.a.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i7, int i8, RecyclerView.c0 c0Var, RecyclerView.o.c cVar) {
        int q6;
        int i9;
        if (this.f5152e != 0) {
            i7 = i8;
        }
        if (getChildCount() == 0 || i7 == 0) {
            return;
        }
        W(i7, c0Var);
        int[] iArr = this.f5170w;
        if (iArr == null || iArr.length < this.f5148a) {
            this.f5170w = new int[this.f5148a];
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5148a; i11++) {
            p pVar = this.f5154g;
            if (pVar.f5582d == -1) {
                q6 = pVar.f5584f;
                i9 = this.f5149b[i11].u(q6);
            } else {
                q6 = this.f5149b[i11].q(pVar.f5585g);
                i9 = this.f5154g.f5585g;
            }
            int i12 = q6 - i9;
            if (i12 >= 0) {
                this.f5170w[i10] = i12;
                i10++;
            }
        }
        Arrays.sort(this.f5170w, 0, i10);
        for (int i13 = 0; i13 < i10 && this.f5154g.a(c0Var); i13++) {
            cVar.a(this.f5154g.f5581c, this.f5170w[i13]);
            p pVar2 = this.f5154g;
            pVar2.f5581c += pVar2.f5582d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollExtent(RecyclerView.c0 c0Var) {
        return o(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollOffset(RecyclerView.c0 c0Var) {
        return p(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeHorizontalScrollRange(RecyclerView.c0 c0Var) {
        return q(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF computeScrollVectorForPosition(int i7) {
        int l7 = l(i7);
        PointF pointF = new PointF();
        if (l7 == 0) {
            return null;
        }
        if (this.f5152e == 0) {
            pointF.x = l7;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = l7;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollExtent(RecyclerView.c0 c0Var) {
        return o(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollOffset(RecyclerView.c0 c0Var) {
        return p(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int computeVerticalScrollRange(RecyclerView.c0 c0Var) {
        return q(c0Var);
    }

    public final int convertFocusDirectionToLayoutDirection(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.f5152e == 1) ? 1 : Integer.MIN_VALUE : this.f5152e == 0 ? 1 : Integer.MIN_VALUE : this.f5152e == 1 ? -1 : Integer.MIN_VALUE : this.f5152e == 0 ? -1 : Integer.MIN_VALUE : (this.f5152e != 1 && isLayoutRTL()) ? -1 : 1 : (this.f5152e != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public void d0(int i7) {
        assertNotInLayoutOrScroll(null);
        if (i7 == this.f5161n) {
            return;
        }
        if (i7 != 0 && i7 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.f5161n = i7;
        requestLayout();
    }

    public final void e0(int i7) {
        p pVar = this.f5154g;
        pVar.f5583e = i7;
        pVar.f5582d = this.f5156i != (i7 == -1) ? -1 : 1;
    }

    public void f0(int i7) {
        assertNotInLayoutOrScroll(null);
        if (i7 != this.f5148a) {
            R();
            this.f5148a = i7;
            this.f5157j = new BitSet(this.f5148a);
            this.f5149b = new f[this.f5148a];
            for (int i8 = 0; i8 < this.f5148a; i8++) {
                this.f5149b[i8] = new f(i8);
            }
            requestLayout();
        }
    }

    public final void g(View view) {
        for (int i7 = this.f5148a - 1; i7 >= 0; i7--) {
            this.f5149b[i7].a(view);
        }
    }

    public final void g0(int i7, int i8) {
        for (int i9 = 0; i9 < this.f5148a; i9++) {
            if (!this.f5149b[i9].f5201a.isEmpty()) {
                m0(this.f5149b[i9], i7, i8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateDefaultLayoutParams() {
        return this.f5152e == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getColumnCountForAccessibility(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.f5152e == 1 ? this.f5148a : super.getColumnCountForAccessibility(wVar, c0Var);
    }

    public int getOrientation() {
        return this.f5152e;
    }

    public boolean getReverseLayout() {
        return this.f5155h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getRowCountForAccessibility(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.f5152e == 0 ? this.f5148a : super.getRowCountForAccessibility(wVar, c0Var);
    }

    public final void h(b bVar) {
        e eVar = this.f5164q;
        int i7 = eVar.f5192m;
        if (i7 > 0) {
            if (i7 == this.f5148a) {
                for (int i8 = 0; i8 < this.f5148a; i8++) {
                    this.f5149b[i8].e();
                    e eVar2 = this.f5164q;
                    int i9 = eVar2.f5193n[i8];
                    if (i9 != Integer.MIN_VALUE) {
                        i9 += eVar2.f5198s ? this.f5150c.i() : this.f5150c.n();
                    }
                    this.f5149b[i8].A(i9);
                }
            } else {
                eVar.b();
                e eVar3 = this.f5164q;
                eVar3.f5190k = eVar3.f5191l;
            }
        }
        e eVar4 = this.f5164q;
        this.f5163p = eVar4.f5199t;
        setReverseLayout(eVar4.f5197r);
        c0();
        e eVar5 = this.f5164q;
        int i10 = eVar5.f5190k;
        if (i10 != -1) {
            this.f5158k = i10;
            bVar.f5175c = eVar5.f5198s;
        } else {
            bVar.f5175c = this.f5156i;
        }
        if (eVar5.f5194o > 1) {
            d dVar = this.f5160m;
            dVar.f5184a = eVar5.f5195p;
            dVar.f5185b = eVar5.f5196q;
        }
    }

    public final boolean h0(RecyclerView.c0 c0Var, b bVar) {
        bVar.f5173a = this.f5162o ? C(c0Var.d()) : w(c0Var.d());
        bVar.f5174b = Integer.MIN_VALUE;
        return true;
    }

    public boolean i() {
        int q6 = this.f5149b[0].q(Integer.MIN_VALUE);
        for (int i7 = 1; i7 < this.f5148a; i7++) {
            if (this.f5149b[i7].q(Integer.MIN_VALUE) != q6) {
                return false;
            }
        }
        return true;
    }

    public boolean i0(RecyclerView.c0 c0Var, b bVar) {
        int i7;
        if (!c0Var.j() && (i7 = this.f5158k) != -1) {
            if (i7 >= 0 && i7 < c0Var.d()) {
                e eVar = this.f5164q;
                if (eVar == null || eVar.f5190k == -1 || eVar.f5192m < 1) {
                    View findViewByPosition = findViewByPosition(this.f5158k);
                    if (findViewByPosition != null) {
                        bVar.f5173a = this.f5156i ? I() : G();
                        if (this.f5159l != Integer.MIN_VALUE) {
                            if (bVar.f5175c) {
                                bVar.f5174b = (this.f5150c.i() - this.f5159l) - this.f5150c.d(findViewByPosition);
                            } else {
                                bVar.f5174b = (this.f5150c.n() + this.f5159l) - this.f5150c.g(findViewByPosition);
                            }
                            return true;
                        } else if (this.f5150c.e(findViewByPosition) > this.f5150c.o()) {
                            bVar.f5174b = bVar.f5175c ? this.f5150c.i() : this.f5150c.n();
                            return true;
                        } else {
                            int g7 = this.f5150c.g(findViewByPosition) - this.f5150c.n();
                            if (g7 < 0) {
                                bVar.f5174b = -g7;
                                return true;
                            }
                            int i8 = this.f5150c.i() - this.f5150c.d(findViewByPosition);
                            if (i8 < 0) {
                                bVar.f5174b = i8;
                                return true;
                            }
                            bVar.f5174b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i9 = this.f5158k;
                        bVar.f5173a = i9;
                        int i10 = this.f5159l;
                        if (i10 == Integer.MIN_VALUE) {
                            bVar.f5175c = l(i9) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i10);
                        }
                        bVar.f5176d = true;
                    }
                } else {
                    bVar.f5174b = Integer.MIN_VALUE;
                    bVar.f5173a = this.f5158k;
                }
                return true;
            }
            this.f5158k = -1;
            this.f5159l = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean isAutoMeasureEnabled() {
        return this.f5161n != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean j() {
        int u6 = this.f5149b[0].u(Integer.MIN_VALUE);
        for (int i7 = 1; i7 < this.f5148a; i7++) {
            if (this.f5149b[i7].u(Integer.MIN_VALUE) != u6) {
                return false;
            }
        }
        return true;
    }

    public void j0(RecyclerView.c0 c0Var, b bVar) {
        if (i0(c0Var, bVar) || h0(c0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f5173a = 0;
    }

    public final void k(View view, c cVar, p pVar) {
        if (pVar.f5583e == 1) {
            if (cVar.f5182f) {
                g(view);
            } else {
                cVar.f5181e.a(view);
            }
        } else if (cVar.f5182f) {
            X(view);
        } else {
            cVar.f5181e.z(view);
        }
    }

    public final void k0(int i7, RecyclerView.c0 c0Var) {
        int i8;
        int i9;
        int g7;
        p pVar = this.f5154g;
        boolean z6 = false;
        pVar.f5580b = 0;
        pVar.f5581c = i7;
        if (!isSmoothScrolling() || (g7 = c0Var.g()) == -1) {
            i8 = 0;
            i9 = 0;
        } else {
            if (this.f5156i == (g7 < i7)) {
                i8 = this.f5150c.o();
                i9 = 0;
            } else {
                i9 = this.f5150c.o();
                i8 = 0;
            }
        }
        if (getClipToPadding()) {
            this.f5154g.f5584f = this.f5150c.n() - i9;
            this.f5154g.f5585g = this.f5150c.i() + i8;
        } else {
            this.f5154g.f5585g = this.f5150c.h() + i8;
            this.f5154g.f5584f = -i9;
        }
        p pVar2 = this.f5154g;
        pVar2.f5586h = false;
        pVar2.f5579a = true;
        if (this.f5150c.l() == 0 && this.f5150c.h() == 0) {
            z6 = true;
        }
        pVar2.f5587i = z6;
    }

    public final int l(int i7) {
        if (getChildCount() == 0) {
            return this.f5156i ? 1 : -1;
        }
        return (i7 < G()) != this.f5156i ? -1 : 1;
    }

    public void l0(int i7) {
        this.f5153f = i7 / this.f5148a;
        this.f5165r = View.MeasureSpec.makeMeasureSpec(i7, this.f5151d.l());
    }

    public boolean m() {
        int G2;
        int I;
        if (getChildCount() == 0 || this.f5161n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f5156i) {
            G2 = I();
            I = G();
        } else {
            G2 = G();
            I = I();
        }
        if (G2 == 0 && Q() != null) {
            this.f5160m.b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else if (this.f5168u) {
            int i7 = this.f5156i ? -1 : 1;
            int i8 = I + 1;
            d.a e7 = this.f5160m.e(G2, i8, i7, true);
            if (e7 == null) {
                this.f5168u = false;
                this.f5160m.d(i8);
                return false;
            }
            d.a e8 = this.f5160m.e(G2, e7.f5186k, i7 * (-1), true);
            if (e8 == null) {
                this.f5160m.d(e7.f5186k);
            } else {
                this.f5160m.d(e8.f5186k + 1);
            }
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        } else {
            return false;
        }
    }

    public final void m0(f fVar, int i7, int i8) {
        int o6 = fVar.o();
        if (i7 == -1) {
            if (fVar.t() + o6 <= i8) {
                this.f5157j.set(fVar.f5205e, false);
            }
        } else if (fVar.p() - o6 >= i8) {
            this.f5157j.set(fVar.f5205e, false);
        }
    }

    public final boolean n(f fVar) {
        if (this.f5156i) {
            if (fVar.p() < this.f5150c.i()) {
                ArrayList<View> arrayList = fVar.f5201a;
                return !fVar.s(arrayList.get(arrayList.size() - 1)).f5182f;
            }
        } else if (fVar.t() > this.f5150c.n()) {
            return !fVar.s(fVar.f5201a.get(0)).f5182f;
        }
        return false;
    }

    public final int n0(int i7, int i8, int i9) {
        if (i8 == 0 && i9 == 0) {
            return i7;
        }
        int mode = View.MeasureSpec.getMode(i7);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - i8) - i9), mode) : i7;
    }

    public final int o(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return z.a(c0Var, this.f5150c, y(!this.f5169v), x(!this.f5169v), this, this.f5169v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenHorizontal(int i7) {
        super.offsetChildrenHorizontal(i7);
        for (int i8 = 0; i8 < this.f5148a; i8++) {
            this.f5149b[i8].w(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void offsetChildrenVertical(int i7) {
        super.offsetChildrenVertical(i7);
        for (int i8 = 0; i8 < this.f5148a; i8++) {
            this.f5149b[i8].w(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        removeCallbacks(this.f5171x);
        for (int i7 = 0; i7 < this.f5148a; i7++) {
            this.f5149b[i7].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @q0
    public View onFocusSearchFailed(View view, int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        View findContainingItemView;
        View r6;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        c0();
        int convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i7);
        if (convertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) findContainingItemView.getLayoutParams();
        boolean z6 = cVar.f5182f;
        f fVar = cVar.f5181e;
        int I = convertFocusDirectionToLayoutDirection == 1 ? I() : G();
        k0(I, c0Var);
        e0(convertFocusDirectionToLayoutDirection);
        p pVar = this.f5154g;
        pVar.f5581c = pVar.f5582d + I;
        pVar.f5580b = (int) (this.f5150c.o() * 0.33333334f);
        p pVar2 = this.f5154g;
        pVar2.f5586h = true;
        pVar2.f5579a = false;
        u(wVar, pVar2, c0Var);
        this.f5162o = this.f5156i;
        if (z6 || (r6 = fVar.r(I, convertFocusDirectionToLayoutDirection)) == null || r6 == findContainingItemView) {
            if (V(convertFocusDirectionToLayoutDirection)) {
                for (int i8 = this.f5148a - 1; i8 >= 0; i8--) {
                    View r7 = this.f5149b[i8].r(I, convertFocusDirectionToLayoutDirection);
                    if (r7 != null && r7 != findContainingItemView) {
                        return r7;
                    }
                }
            } else {
                for (int i9 = 0; i9 < this.f5148a; i9++) {
                    View r8 = this.f5149b[i9].r(I, convertFocusDirectionToLayoutDirection);
                    if (r8 != null && r8 != findContainingItemView) {
                        return r8;
                    }
                }
            }
            boolean z7 = (this.f5155h ^ true) == (convertFocusDirectionToLayoutDirection == -1);
            if (!z6) {
                View findViewByPosition = findViewByPosition(z7 ? fVar.g() : fVar.j());
                if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                    return findViewByPosition;
                }
            }
            if (V(convertFocusDirectionToLayoutDirection)) {
                for (int i10 = this.f5148a - 1; i10 >= 0; i10--) {
                    if (i10 != fVar.f5205e) {
                        View findViewByPosition2 = findViewByPosition(z7 ? this.f5149b[i10].g() : this.f5149b[i10].j());
                        if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                            return findViewByPosition2;
                        }
                    }
                }
            } else {
                for (int i11 = 0; i11 < this.f5148a; i11++) {
                    View findViewByPosition3 = findViewByPosition(z7 ? this.f5149b[i11].g() : this.f5149b[i11].j());
                    if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                        return findViewByPosition3;
                    }
                }
            }
            return null;
        }
        return r6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View y6 = y(false);
            View x6 = x(false);
            if (y6 == null || x6 == null) {
                return;
            }
            int position = getPosition(y6);
            int position2 = getPosition(x6);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
                return;
            }
            accessibilityEvent.setFromIndex(position2);
            accessibilityEvent.setToIndex(position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.c0 c0Var, View view, h1.f0 f0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, f0Var);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f5152e == 0) {
            f0Var.e1(f0.e.h(cVar.h(), cVar.f5182f ? this.f5148a : 1, -1, -1, false, false));
        } else {
            f0Var.e1(f0.e.h(-1, -1, cVar.h(), cVar.f5182f ? this.f5148a : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsAdded(RecyclerView recyclerView, int i7, int i8) {
        P(i7, i8, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f5160m.b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsMoved(RecyclerView recyclerView, int i7, int i8, int i9) {
        P(i7, i8, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsRemoved(RecyclerView recyclerView, int i7, int i8) {
        P(i7, i8, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onItemsUpdated(RecyclerView recyclerView, int i7, int i8, Object obj) {
        P(i7, i8, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        U(wVar, c0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.c0 c0Var) {
        super.onLayoutCompleted(c0Var);
        this.f5158k = -1;
        this.f5159l = Integer.MIN_VALUE;
        this.f5164q = null;
        this.f5167t.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f5164q = (e) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable onSaveInstanceState() {
        int u6;
        int n7;
        int[] iArr;
        if (this.f5164q != null) {
            return new e(this.f5164q);
        }
        e eVar = new e();
        eVar.f5197r = this.f5155h;
        eVar.f5198s = this.f5162o;
        eVar.f5199t = this.f5163p;
        d dVar = this.f5160m;
        if (dVar == null || (iArr = dVar.f5184a) == null) {
            eVar.f5194o = 0;
        } else {
            eVar.f5195p = iArr;
            eVar.f5194o = iArr.length;
            eVar.f5196q = dVar.f5185b;
        }
        if (getChildCount() > 0) {
            eVar.f5190k = this.f5162o ? I() : G();
            eVar.f5191l = z();
            int i7 = this.f5148a;
            eVar.f5192m = i7;
            eVar.f5193n = new int[i7];
            for (int i8 = 0; i8 < this.f5148a; i8++) {
                if (this.f5162o) {
                    u6 = this.f5149b[i8].q(Integer.MIN_VALUE);
                    if (u6 != Integer.MIN_VALUE) {
                        n7 = this.f5150c.i();
                        u6 -= n7;
                        eVar.f5193n[i8] = u6;
                    } else {
                        eVar.f5193n[i8] = u6;
                    }
                } else {
                    u6 = this.f5149b[i8].u(Integer.MIN_VALUE);
                    if (u6 != Integer.MIN_VALUE) {
                        n7 = this.f5150c.n();
                        u6 -= n7;
                        eVar.f5193n[i8] = u6;
                    } else {
                        eVar.f5193n[i8] = u6;
                    }
                }
            }
        } else {
            eVar.f5190k = -1;
            eVar.f5191l = -1;
            eVar.f5192m = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onScrollStateChanged(int i7) {
        if (i7 == 0) {
            m();
        }
    }

    public final int p(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return z.b(c0Var, this.f5150c, y(!this.f5169v), x(!this.f5169v), this, this.f5169v, this.f5156i);
    }

    public final int q(RecyclerView.c0 c0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return z.c(c0Var, this.f5150c, y(!this.f5169v), x(!this.f5169v), this, this.f5169v);
    }

    public final d.a r(int i7) {
        d.a aVar = new d.a();
        aVar.f5188m = new int[this.f5148a];
        for (int i8 = 0; i8 < this.f5148a; i8++) {
            aVar.f5188m[i8] = i7 - this.f5149b[i8].q(i7);
        }
        return aVar;
    }

    public final d.a s(int i7) {
        d.a aVar = new d.a();
        aVar.f5188m = new int[this.f5148a];
        for (int i8 = 0; i8 < this.f5148a; i8++) {
            aVar.f5188m[i8] = this.f5149b[i8].u(i7) - i7;
        }
        return aVar;
    }

    public int scrollBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        W(i7, c0Var);
        int u6 = u(wVar, this.f5154g, c0Var);
        if (this.f5154g.f5580b >= u6) {
            i7 = i7 < 0 ? -u6 : u6;
        }
        this.f5150c.t(-i7);
        this.f5162o = this.f5156i;
        p pVar = this.f5154g;
        pVar.f5580b = 0;
        Y(wVar, pVar);
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollHorizontallyBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return scrollBy(i7, wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void scrollToPosition(int i7) {
        e eVar = this.f5164q;
        if (eVar != null && eVar.f5190k != i7) {
            eVar.a();
        }
        this.f5158k = i7;
        this.f5159l = Integer.MIN_VALUE;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i7, int i8) {
        e eVar = this.f5164q;
        if (eVar != null) {
            eVar.a();
        }
        this.f5158k = i7;
        this.f5159l = i8;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int scrollVerticallyBy(int i7, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return scrollBy(i7, wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void setMeasuredDimension(Rect rect, int i7, int i8) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f5152e == 1) {
            chooseSize2 = RecyclerView.o.chooseSize(i8, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.o.chooseSize(i7, (this.f5153f * this.f5148a) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.o.chooseSize(i7, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.o.chooseSize(i8, (this.f5153f * this.f5148a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i7 == this.f5152e) {
            return;
        }
        this.f5152e = i7;
        w wVar = this.f5150c;
        this.f5150c = this.f5151d;
        this.f5151d = wVar;
        requestLayout();
    }

    public void setReverseLayout(boolean z6) {
        assertNotInLayoutOrScroll(null);
        e eVar = this.f5164q;
        if (eVar != null && eVar.f5197r != z6) {
            eVar.f5197r = z6;
        }
        this.f5155h = z6;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i7) {
        q qVar = new q(recyclerView.getContext());
        qVar.setTargetPosition(i7);
        startSmoothScroll(qVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean supportsPredictiveItemAnimations() {
        return this.f5164q == null;
    }

    public final void t() {
        this.f5150c = w.b(this, this.f5152e);
        this.f5151d = w.b(this, 1 - this.f5152e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int u(RecyclerView.w wVar, p pVar, RecyclerView.c0 c0Var) {
        f fVar;
        int e7;
        int i7;
        int i8;
        int e8;
        boolean z6;
        ?? r9 = 0;
        this.f5157j.set(0, this.f5148a, true);
        int i9 = this.f5154g.f5587i ? pVar.f5583e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : pVar.f5583e == 1 ? pVar.f5585g + pVar.f5580b : pVar.f5584f - pVar.f5580b;
        g0(pVar.f5583e, i9);
        int i10 = this.f5156i ? this.f5150c.i() : this.f5150c.n();
        boolean z7 = false;
        while (pVar.a(c0Var) && (this.f5154g.f5587i || !this.f5157j.isEmpty())) {
            View b7 = pVar.b(wVar);
            c cVar = (c) b7.getLayoutParams();
            int b8 = cVar.b();
            int g7 = this.f5160m.g(b8);
            boolean z8 = g7 == -1 ? true : r9;
            if (z8) {
                fVar = cVar.f5182f ? this.f5149b[r9] : N(pVar);
                this.f5160m.n(b8, fVar);
            } else {
                fVar = this.f5149b[g7];
            }
            f fVar2 = fVar;
            cVar.f5181e = fVar2;
            if (pVar.f5583e == 1) {
                addView(b7);
            } else {
                addView(b7, r9);
            }
            T(b7, cVar, r9);
            if (pVar.f5583e == 1) {
                int J = cVar.f5182f ? J(i10) : fVar2.q(i10);
                int e9 = this.f5150c.e(b7) + J;
                if (z8 && cVar.f5182f) {
                    d.a r6 = r(J);
                    r6.f5187l = -1;
                    r6.f5186k = b8;
                    this.f5160m.a(r6);
                }
                i7 = e9;
                e7 = J;
            } else {
                int M = cVar.f5182f ? M(i10) : fVar2.u(i10);
                e7 = M - this.f5150c.e(b7);
                if (z8 && cVar.f5182f) {
                    d.a s6 = s(M);
                    s6.f5187l = 1;
                    s6.f5186k = b8;
                    this.f5160m.a(s6);
                }
                i7 = M;
            }
            if (cVar.f5182f && pVar.f5582d == -1) {
                if (z8) {
                    this.f5168u = true;
                } else {
                    if ((!(pVar.f5583e == 1 ? i() : j())) != false) {
                        d.a f7 = this.f5160m.f(b8);
                        if (f7 != null) {
                            f7.f5189n = true;
                        }
                        this.f5168u = true;
                    }
                }
            }
            k(b7, cVar, pVar);
            if (isLayoutRTL() && this.f5152e == 1) {
                int i11 = cVar.f5182f ? this.f5151d.i() : this.f5151d.i() - (((this.f5148a - 1) - fVar2.f5205e) * this.f5153f);
                e8 = i11;
                i8 = i11 - this.f5151d.e(b7);
            } else {
                int n7 = cVar.f5182f ? this.f5151d.n() : (fVar2.f5205e * this.f5153f) + this.f5151d.n();
                i8 = n7;
                e8 = this.f5151d.e(b7) + n7;
            }
            if (this.f5152e == 1) {
                layoutDecoratedWithMargins(b7, i8, e7, e8, i7);
            } else {
                layoutDecoratedWithMargins(b7, e7, i8, i7, e8);
            }
            if (cVar.f5182f) {
                g0(this.f5154g.f5583e, i9);
            } else {
                m0(fVar2, this.f5154g.f5583e, i9);
            }
            Y(wVar, this.f5154g);
            if (this.f5154g.f5586h && b7.hasFocusable()) {
                if (cVar.f5182f) {
                    this.f5157j.clear();
                } else {
                    z6 = false;
                    this.f5157j.set(fVar2.f5205e, false);
                    r9 = z6;
                    z7 = true;
                }
            }
            z6 = false;
            r9 = z6;
            z7 = true;
        }
        int i12 = r9;
        if (!z7) {
            Y(wVar, this.f5154g);
        }
        int n8 = this.f5154g.f5583e == -1 ? this.f5150c.n() - M(this.f5150c.n()) : J(this.f5150c.i()) - this.f5150c.i();
        return n8 > 0 ? Math.min(pVar.f5580b, n8) : i12;
    }

    public int[] v(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f5148a];
        } else if (iArr.length < this.f5148a) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f5148a + ", array size:" + iArr.length);
        }
        for (int i7 = 0; i7 < this.f5148a; i7++) {
            iArr[i7] = this.f5149b[i7].f();
        }
        return iArr;
    }

    public final int w(int i7) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            int position = getPosition(getChildAt(i8));
            if (position >= 0 && position < i7) {
                return position;
            }
        }
        return 0;
    }

    public View x(boolean z6) {
        int n7 = this.f5150c.n();
        int i7 = this.f5150c.i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int g7 = this.f5150c.g(childAt);
            int d7 = this.f5150c.d(childAt);
            if (d7 > n7 && g7 < i7) {
                if (d7 <= i7 || !z6) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View y(boolean z6) {
        int n7 = this.f5150c.n();
        int i7 = this.f5150c.i();
        int childCount = getChildCount();
        View view = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int g7 = this.f5150c.g(childAt);
            if (this.f5150c.d(childAt) > n7 && g7 < i7) {
                if (g7 >= n7 || !z6) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public int z() {
        View x6 = this.f5156i ? x(true) : y(true);
        if (x6 == null) {
            return -1;
        }
        return getPosition(x6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: c  reason: collision with root package name */
        public static final int f5183c = 10;

        /* renamed from: a  reason: collision with root package name */
        public int[] f5184a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f5185b;

        public void a(a aVar) {
            if (this.f5185b == null) {
                this.f5185b = new ArrayList();
            }
            int size = this.f5185b.size();
            for (int i7 = 0; i7 < size; i7++) {
                a aVar2 = this.f5185b.get(i7);
                if (aVar2.f5186k == aVar.f5186k) {
                    this.f5185b.remove(i7);
                }
                if (aVar2.f5186k >= aVar.f5186k) {
                    this.f5185b.add(i7, aVar);
                    return;
                }
            }
            this.f5185b.add(aVar);
        }

        public void b() {
            int[] iArr = this.f5184a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5185b = null;
        }

        public void c(int i7) {
            int[] iArr = this.f5184a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i7, 10) + 1];
                this.f5184a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[o(i7)];
                this.f5184a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5184a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i7) {
            List<a> list = this.f5185b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f5185b.get(size).f5186k >= i7) {
                        this.f5185b.remove(size);
                    }
                }
            }
            return h(i7);
        }

        public a e(int i7, int i8, int i9, boolean z6) {
            List<a> list = this.f5185b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = this.f5185b.get(i10);
                int i11 = aVar.f5186k;
                if (i11 >= i8) {
                    return null;
                }
                if (i11 >= i7 && (i9 == 0 || aVar.f5187l == i9 || (z6 && aVar.f5189n))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i7) {
            List<a> list = this.f5185b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f5185b.get(size);
                if (aVar.f5186k == i7) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i7) {
            int[] iArr = this.f5184a;
            if (iArr == null || i7 >= iArr.length) {
                return -1;
            }
            return iArr[i7];
        }

        public int h(int i7) {
            int[] iArr = this.f5184a;
            if (iArr != null && i7 < iArr.length) {
                int i8 = i(i7);
                if (i8 == -1) {
                    int[] iArr2 = this.f5184a;
                    Arrays.fill(iArr2, i7, iArr2.length, -1);
                    return this.f5184a.length;
                }
                int i9 = i8 + 1;
                Arrays.fill(this.f5184a, i7, i9, -1);
                return i9;
            }
            return -1;
        }

        public final int i(int i7) {
            if (this.f5185b == null) {
                return -1;
            }
            a f7 = f(i7);
            if (f7 != null) {
                this.f5185b.remove(f7);
            }
            int size = this.f5185b.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                } else if (this.f5185b.get(i8).f5186k >= i7) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 != -1) {
                a aVar = this.f5185b.get(i8);
                this.f5185b.remove(i8);
                return aVar.f5186k;
            }
            return -1;
        }

        public void j(int i7, int i8) {
            int[] iArr = this.f5184a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            c(i9);
            int[] iArr2 = this.f5184a;
            System.arraycopy(iArr2, i7, iArr2, i9, (iArr2.length - i7) - i8);
            Arrays.fill(this.f5184a, i7, i9, -1);
            l(i7, i8);
        }

        public void k(int i7, int i8) {
            int[] iArr = this.f5184a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            c(i9);
            int[] iArr2 = this.f5184a;
            System.arraycopy(iArr2, i9, iArr2, i7, (iArr2.length - i7) - i8);
            int[] iArr3 = this.f5184a;
            Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
            m(i7, i8);
        }

        public final void l(int i7, int i8) {
            List<a> list = this.f5185b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f5185b.get(size);
                int i9 = aVar.f5186k;
                if (i9 >= i7) {
                    aVar.f5186k = i9 + i8;
                }
            }
        }

        public final void m(int i7, int i8) {
            List<a> list = this.f5185b;
            if (list == null) {
                return;
            }
            int i9 = i7 + i8;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f5185b.get(size);
                int i10 = aVar.f5186k;
                if (i10 >= i7) {
                    if (i10 < i9) {
                        this.f5185b.remove(size);
                    } else {
                        aVar.f5186k = i10 - i8;
                    }
                }
            }
        }

        public void n(int i7, f fVar) {
            c(i7);
            this.f5184a[i7] = fVar.f5205e;
        }

        public int o(int i7) {
            int length = this.f5184a.length;
            while (length <= i7) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0061a();

            /* renamed from: k  reason: collision with root package name */
            public int f5186k;

            /* renamed from: l  reason: collision with root package name */
            public int f5187l;

            /* renamed from: m  reason: collision with root package name */
            public int[] f5188m;

            /* renamed from: n  reason: collision with root package name */
            public boolean f5189n;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0061a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b  reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i7) {
                    return new a[i7];
                }
            }

            public a(Parcel parcel) {
                this.f5186k = parcel.readInt();
                this.f5187l = parcel.readInt();
                this.f5189n = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f5188m = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i7) {
                int[] iArr = this.f5188m;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i7];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5186k + ", mGapDir=" + this.f5187l + ", mHasUnwantedGapAfter=" + this.f5189n + ", mGapPerSpan=" + Arrays.toString(this.f5188m) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i7) {
                parcel.writeInt(this.f5186k);
                parcel.writeInt(this.f5187l);
                parcel.writeInt(this.f5189n ? 1 : 0);
                int[] iArr = this.f5188m;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f5188m);
            }

            public a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i7, int i8) {
        this.f5152e = i8;
        f0(i7);
        this.f5154g = new p();
        t();
    }
}
