package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import d.l1;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<g> f5430a = new a();

    /* loaded from: classes.dex */
    public static class a implements Comparator<g> {
        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            int i7 = gVar.f5453a - gVar2.f5453a;
            return i7 == 0 ? gVar.f5454b - gVar2.f5454b : i7;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i7, int i8);

        public abstract boolean b(int i7, int i8);

        @q0
        public Object c(int i7, int i8) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: h  reason: collision with root package name */
        public static final int f5431h = -1;

        /* renamed from: i  reason: collision with root package name */
        public static final int f5432i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f5433j = 2;

        /* renamed from: k  reason: collision with root package name */
        public static final int f5434k = 4;

        /* renamed from: l  reason: collision with root package name */
        public static final int f5435l = 8;

        /* renamed from: m  reason: collision with root package name */
        public static final int f5436m = 16;

        /* renamed from: n  reason: collision with root package name */
        public static final int f5437n = 5;

        /* renamed from: o  reason: collision with root package name */
        public static final int f5438o = 31;

        /* renamed from: a  reason: collision with root package name */
        public final List<g> f5439a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f5440b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f5441c;

        /* renamed from: d  reason: collision with root package name */
        public final b f5442d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5443e;

        /* renamed from: f  reason: collision with root package name */
        public final int f5444f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f5445g;

        public c(b bVar, List<g> list, int[] iArr, int[] iArr2, boolean z6) {
            this.f5439a = list;
            this.f5440b = iArr;
            this.f5441c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f5442d = bVar;
            this.f5443e = bVar.e();
            this.f5444f = bVar.d();
            this.f5445g = z6;
            a();
            j();
        }

        public static e m(List<e> list, int i7, boolean z6) {
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = list.get(size);
                if (eVar.f5446a == i7 && eVar.f5448c == z6) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).f5447b += z6 ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        public final void a() {
            g gVar = this.f5439a.isEmpty() ? null : this.f5439a.get(0);
            if (gVar != null && gVar.f5453a == 0 && gVar.f5454b == 0) {
                return;
            }
            g gVar2 = new g();
            gVar2.f5453a = 0;
            gVar2.f5454b = 0;
            gVar2.f5456d = false;
            gVar2.f5455c = 0;
            gVar2.f5457e = false;
            this.f5439a.add(0, gVar2);
        }

        public int b(@d.g0(from = 0) int i7) {
            if (i7 >= 0 && i7 < this.f5444f) {
                int i8 = this.f5441c[i7];
                if ((i8 & 31) == 0) {
                    return -1;
                }
                return i8 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i7 + ", new list size = " + this.f5444f);
        }

        public int c(@d.g0(from = 0) int i7) {
            if (i7 >= 0 && i7 < this.f5443e) {
                int i8 = this.f5440b[i7];
                if ((i8 & 31) == 0) {
                    return -1;
                }
                return i8 >> 5;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i7 + ", old list size = " + this.f5443e);
        }

        public final void d(List<e> list, t tVar, int i7, int i8, int i9) {
            if (!this.f5445g) {
                tVar.c(i7, i8);
                return;
            }
            for (int i10 = i8 - 1; i10 >= 0; i10--) {
                int i11 = i9 + i10;
                int i12 = this.f5441c[i11];
                int i13 = i12 & 31;
                if (i13 == 0) {
                    tVar.c(i7, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f5447b++;
                    }
                } else if (i13 == 4 || i13 == 8) {
                    int i14 = i12 >> 5;
                    tVar.b(m(list, i14, true).f5447b, i7);
                    if (i13 == 4) {
                        tVar.d(i7, 1, this.f5442d.c(i14, i11));
                    }
                } else if (i13 != 16) {
                    throw new IllegalStateException("unknown flag for pos " + i11 + " " + Long.toBinaryString(i13));
                } else {
                    list.add(new e(i11, i7, false));
                }
            }
        }

        public final void e(List<e> list, t tVar, int i7, int i8, int i9) {
            if (!this.f5445g) {
                tVar.a(i7, i8);
                return;
            }
            for (int i10 = i8 - 1; i10 >= 0; i10--) {
                int i11 = i9 + i10;
                int i12 = this.f5440b[i11];
                int i13 = i12 & 31;
                if (i13 == 0) {
                    tVar.a(i7 + i10, 1);
                    Iterator<e> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().f5447b--;
                    }
                } else if (i13 == 4 || i13 == 8) {
                    int i14 = i12 >> 5;
                    e m7 = m(list, i14, false);
                    tVar.b(i7 + i10, m7.f5447b - 1);
                    if (i13 == 4) {
                        tVar.d(m7.f5447b - 1, 1, this.f5442d.c(i11, i14));
                    }
                } else if (i13 != 16) {
                    throw new IllegalStateException("unknown flag for pos " + i11 + " " + Long.toBinaryString(i13));
                } else {
                    list.add(new e(i11, i7 + i10, true));
                }
            }
        }

        public void f(@o0 t tVar) {
            androidx.recyclerview.widget.f fVar = tVar instanceof androidx.recyclerview.widget.f ? (androidx.recyclerview.widget.f) tVar : new androidx.recyclerview.widget.f(tVar);
            ArrayList arrayList = new ArrayList();
            int i7 = this.f5443e;
            int i8 = this.f5444f;
            for (int size = this.f5439a.size() - 1; size >= 0; size--) {
                g gVar = this.f5439a.get(size);
                int i9 = gVar.f5455c;
                int i10 = gVar.f5453a + i9;
                int i11 = gVar.f5454b + i9;
                if (i10 < i7) {
                    e(arrayList, fVar, i10, i7 - i10, i10);
                }
                if (i11 < i8) {
                    d(arrayList, fVar, i10, i8 - i11, i11);
                }
                for (int i12 = i9 - 1; i12 >= 0; i12--) {
                    int[] iArr = this.f5440b;
                    int i13 = gVar.f5453a;
                    if ((iArr[i13 + i12] & 31) == 2) {
                        fVar.d(i13 + i12, 1, this.f5442d.c(i13 + i12, gVar.f5454b + i12));
                    }
                }
                i7 = gVar.f5453a;
                i8 = gVar.f5454b;
            }
            fVar.e();
        }

        public void g(@o0 RecyclerView.g gVar) {
            f(new androidx.recyclerview.widget.b(gVar));
        }

        public final void h(int i7, int i8, int i9) {
            if (this.f5440b[i7 - 1] != 0) {
                return;
            }
            i(i7, i8, i9, false);
        }

        public final boolean i(int i7, int i8, int i9, boolean z6) {
            int i10;
            int i11;
            int i12;
            if (z6) {
                i8--;
                i11 = i7;
                i10 = i8;
            } else {
                i10 = i7 - 1;
                i11 = i10;
            }
            while (i9 >= 0) {
                g gVar = this.f5439a.get(i9);
                int i13 = gVar.f5453a;
                int i14 = gVar.f5455c;
                int i15 = i13 + i14;
                int i16 = gVar.f5454b + i14;
                if (z6) {
                    for (int i17 = i11 - 1; i17 >= i15; i17--) {
                        if (this.f5442d.b(i17, i10)) {
                            i12 = this.f5442d.a(i17, i10) ? 8 : 4;
                            this.f5441c[i10] = (i17 << 5) | 16;
                            this.f5440b[i17] = (i10 << 5) | i12;
                            return true;
                        }
                    }
                } else {
                    for (int i18 = i8 - 1; i18 >= i16; i18--) {
                        if (this.f5442d.b(i10, i18)) {
                            i12 = this.f5442d.a(i10, i18) ? 8 : 4;
                            int i19 = i7 - 1;
                            this.f5440b[i19] = (i18 << 5) | 16;
                            this.f5441c[i18] = (i19 << 5) | i12;
                            return true;
                        }
                    }
                }
                i11 = gVar.f5453a;
                i8 = gVar.f5454b;
                i9--;
            }
            return false;
        }

        public final void j() {
            int i7 = this.f5443e;
            int i8 = this.f5444f;
            for (int size = this.f5439a.size() - 1; size >= 0; size--) {
                g gVar = this.f5439a.get(size);
                int i9 = gVar.f5453a;
                int i10 = gVar.f5455c;
                int i11 = i9 + i10;
                int i12 = gVar.f5454b + i10;
                if (this.f5445g) {
                    while (i7 > i11) {
                        h(i7, i8, size);
                        i7--;
                    }
                    while (i8 > i12) {
                        k(i7, i8, size);
                        i8--;
                    }
                }
                for (int i13 = 0; i13 < gVar.f5455c; i13++) {
                    int i14 = gVar.f5453a + i13;
                    int i15 = gVar.f5454b + i13;
                    int i16 = this.f5442d.a(i14, i15) ? 1 : 2;
                    this.f5440b[i14] = (i15 << 5) | i16;
                    this.f5441c[i15] = (i14 << 5) | i16;
                }
                i7 = gVar.f5453a;
                i8 = gVar.f5454b;
            }
        }

        public final void k(int i7, int i8, int i9) {
            if (this.f5441c[i8 - 1] != 0) {
                return;
            }
            i(i7, i8, i9, true);
        }

        @l1
        public List<g> l() {
            return this.f5439a;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d<T> {
        public abstract boolean a(@o0 T t6, @o0 T t7);

        public abstract boolean b(@o0 T t6, @o0 T t7);

        @q0
        public Object c(@o0 T t6, @o0 T t7) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f5446a;

        /* renamed from: b  reason: collision with root package name */
        public int f5447b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5448c;

        public e(int i7, int i8, boolean z6) {
            this.f5446a = i7;
            this.f5447b = i8;
            this.f5448c = z6;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f5449a;

        /* renamed from: b  reason: collision with root package name */
        public int f5450b;

        /* renamed from: c  reason: collision with root package name */
        public int f5451c;

        /* renamed from: d  reason: collision with root package name */
        public int f5452d;

        public f() {
        }

        public f(int i7, int i8, int i9, int i10) {
            this.f5449a = i7;
            this.f5450b = i8;
            this.f5451c = i9;
            this.f5452d = i10;
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f5453a;

        /* renamed from: b  reason: collision with root package name */
        public int f5454b;

        /* renamed from: c  reason: collision with root package name */
        public int f5455c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5456d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5457e;
    }

    @o0
    public static c a(@o0 b bVar) {
        return b(bVar, true);
    }

    @o0
    public static c b(@o0 b bVar, boolean z6) {
        int e7 = bVar.e();
        int d7 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(0, e7, 0, d7));
        int abs = e7 + d7 + Math.abs(e7 - d7);
        int i7 = abs * 2;
        int[] iArr = new int[i7];
        int[] iArr2 = new int[i7];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            f fVar = (f) arrayList2.remove(arrayList2.size() - 1);
            g c7 = c(bVar, fVar.f5449a, fVar.f5450b, fVar.f5451c, fVar.f5452d, iArr, iArr2, abs);
            if (c7 != null) {
                if (c7.f5455c > 0) {
                    arrayList.add(c7);
                }
                c7.f5453a += fVar.f5449a;
                c7.f5454b += fVar.f5451c;
                f fVar2 = arrayList3.isEmpty() ? new f() : (f) arrayList3.remove(arrayList3.size() - 1);
                fVar2.f5449a = fVar.f5449a;
                fVar2.f5451c = fVar.f5451c;
                if (c7.f5457e) {
                    fVar2.f5450b = c7.f5453a;
                    fVar2.f5452d = c7.f5454b;
                } else if (c7.f5456d) {
                    fVar2.f5450b = c7.f5453a - 1;
                    fVar2.f5452d = c7.f5454b;
                } else {
                    fVar2.f5450b = c7.f5453a;
                    fVar2.f5452d = c7.f5454b - 1;
                }
                arrayList2.add(fVar2);
                if (!c7.f5457e) {
                    int i8 = c7.f5453a;
                    int i9 = c7.f5455c;
                    fVar.f5449a = i8 + i9;
                    fVar.f5451c = c7.f5454b + i9;
                } else if (c7.f5456d) {
                    int i10 = c7.f5453a;
                    int i11 = c7.f5455c;
                    fVar.f5449a = i10 + i11 + 1;
                    fVar.f5451c = c7.f5454b + i11;
                } else {
                    int i12 = c7.f5453a;
                    int i13 = c7.f5455c;
                    fVar.f5449a = i12 + i13;
                    fVar.f5451c = c7.f5454b + i13 + 1;
                }
                arrayList2.add(fVar);
            } else {
                arrayList3.add(fVar);
            }
        }
        Collections.sort(arrayList, f5430a);
        return new c(bVar, arrayList, iArr, iArr2, z6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r24[r13 - 1] < r24[r13 + r5]) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
        if (r25[r12 - 1] < r25[r12 + 1]) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[LOOP:4: B:52:0x00ca->B:56:0x00de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e9 A[EDGE_INSN: B:89:0x00e9->B:58:0x00e9 BREAK  A[LOOP:4: B:52:0x00ca->B:56:0x00de], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.recyclerview.widget.i.g c(androidx.recyclerview.widget.i.b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.c(androidx.recyclerview.widget.i$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.i$g");
    }
}