package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import d.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import z0.w0;
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: o  reason: collision with root package name */
    public static final ThreadLocal<l> f5496o = new ThreadLocal<>();

    /* renamed from: p  reason: collision with root package name */
    public static Comparator<c> f5497p = new a();

    /* renamed from: l  reason: collision with root package name */
    public long f5499l;

    /* renamed from: m  reason: collision with root package name */
    public long f5500m;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<RecyclerView> f5498k = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<c> f5501n = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f5509d;
            if ((recyclerView == null) != (cVar2.f5509d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z6 = cVar.f5506a;
            if (z6 != cVar2.f5506a) {
                return z6 ? -1 : 1;
            }
            int i7 = cVar2.f5507b - cVar.f5507b;
            if (i7 != 0) {
                return i7;
            }
            int i8 = cVar.f5508c - cVar2.f5508c;
            if (i8 != 0) {
                return i8;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {

        /* renamed from: a  reason: collision with root package name */
        public int f5502a;

        /* renamed from: b  reason: collision with root package name */
        public int f5503b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f5504c;

        /* renamed from: d  reason: collision with root package name */
        public int f5505d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i7, int i8) {
            if (i7 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i8 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i9 = this.f5505d * 2;
            int[] iArr = this.f5504c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f5504c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i9 >= iArr.length) {
                int[] iArr3 = new int[i9 * 2];
                this.f5504c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f5504c;
            iArr4[i9] = i7;
            iArr4[i9 + 1] = i8;
            this.f5505d++;
        }

        public void b() {
            int[] iArr = this.f5504c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5505d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z6) {
            this.f5505d = 0;
            int[] iArr = this.f5504c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || oVar == null || !oVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z6) {
                if (!recyclerView.mAdapterHelper.q()) {
                    oVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                oVar.collectAdjacentPrefetchPositions(this.f5502a, this.f5503b, recyclerView.mState, this);
            }
            int i7 = this.f5505d;
            if (i7 > oVar.mPrefetchMaxCountObserved) {
                oVar.mPrefetchMaxCountObserved = i7;
                oVar.mPrefetchMaxObservedInInitialPrefetch = z6;
                recyclerView.mRecycler.L();
            }
        }

        public boolean d(int i7) {
            if (this.f5504c != null) {
                int i8 = this.f5505d * 2;
                for (int i9 = 0; i9 < i8; i9 += 2) {
                    if (this.f5504c[i9] == i7) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i7, int i8) {
            this.f5502a = i7;
            this.f5503b = i8;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5506a;

        /* renamed from: b  reason: collision with root package name */
        public int f5507b;

        /* renamed from: c  reason: collision with root package name */
        public int f5508c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f5509d;

        /* renamed from: e  reason: collision with root package name */
        public int f5510e;

        public void a() {
            this.f5506a = false;
            this.f5507b = 0;
            this.f5508c = 0;
            this.f5509d = null;
            this.f5510e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i7) {
        int j7 = recyclerView.mChildHelper.j();
        for (int i8 = 0; i8 < j7; i8++) {
            RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i8));
            if (childViewHolderInt.mPosition == i7 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.f5498k.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f5498k.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView = this.f5498k.get(i8);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i7 += recyclerView.mPrefetchRegistry.f5505d;
            }
        }
        this.f5501n.ensureCapacity(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView2 = this.f5498k.get(i10);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f5502a) + Math.abs(bVar.f5503b);
                for (int i11 = 0; i11 < bVar.f5505d * 2; i11 += 2) {
                    if (i9 >= this.f5501n.size()) {
                        cVar = new c();
                        this.f5501n.add(cVar);
                    } else {
                        cVar = this.f5501n.get(i9);
                    }
                    int[] iArr = bVar.f5504c;
                    int i12 = iArr[i11 + 1];
                    cVar.f5506a = i12 <= abs;
                    cVar.f5507b = abs;
                    cVar.f5508c = i12;
                    cVar.f5509d = recyclerView2;
                    cVar.f5510e = iArr[i11];
                    i9++;
                }
            }
        }
        Collections.sort(this.f5501n, f5497p);
    }

    public final void c(c cVar, long j7) {
        RecyclerView.f0 i7 = i(cVar.f5509d, cVar.f5510e, cVar.f5506a ? Long.MAX_VALUE : j7);
        if (i7 == null || i7.mNestedRecyclerView == null || !i7.isBound() || i7.isInvalid()) {
            return;
        }
        h(i7.mNestedRecyclerView.get(), j7);
    }

    public final void d(long j7) {
        for (int i7 = 0; i7 < this.f5501n.size(); i7++) {
            c cVar = this.f5501n.get(i7);
            if (cVar.f5509d == null) {
                return;
            }
            c(cVar, j7);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.isAttachedToWindow() && this.f5499l == 0) {
            this.f5499l = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.e(i7, i8);
    }

    public void g(long j7) {
        b();
        d(j7);
    }

    public final void h(@q0 RecyclerView recyclerView, long j7) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f5505d != 0) {
            try {
                w0.b("RV Nested Prefetch");
                recyclerView.mState.k(recyclerView.mAdapter);
                for (int i7 = 0; i7 < bVar.f5505d * 2; i7 += 2) {
                    i(recyclerView, bVar.f5504c[i7], j7);
                }
            } finally {
                w0.d();
            }
        }
    }

    public final RecyclerView.f0 i(RecyclerView recyclerView, int i7, long j7) {
        if (e(recyclerView, i7)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.f0 J = wVar.J(i7, false, j7);
            if (J != null) {
                if (!J.isBound() || J.isInvalid()) {
                    wVar.a(J, false);
                } else {
                    wVar.C(J.itemView);
                }
            }
            return J;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void j(RecyclerView recyclerView) {
        this.f5498k.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            w0.b("RV Prefetch");
            if (!this.f5498k.isEmpty()) {
                int size = this.f5498k.size();
                long j7 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    RecyclerView recyclerView = this.f5498k.get(i7);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j7 = Math.max(recyclerView.getDrawingTime(), j7);
                    }
                }
                if (j7 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j7) + this.f5500m);
                }
            }
        } finally {
            this.f5499l = 0L;
            w0.d();
        }
    }
}
