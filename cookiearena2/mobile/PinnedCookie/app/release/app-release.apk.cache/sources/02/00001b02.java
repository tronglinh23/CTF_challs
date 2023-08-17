package u;

import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final int f16969d = 999;

        /* renamed from: a  reason: collision with root package name */
        public int[] f16970a = new int[v.f17109g];

        /* renamed from: b  reason: collision with root package name */
        public r.a[] f16971b = new r.a[v.f17109g];

        /* renamed from: c  reason: collision with root package name */
        public int f16972c;

        public a() {
            b();
        }

        public void a(int i7, r.a aVar) {
            if (this.f16971b[i7] != null) {
                e(i7);
            }
            this.f16971b[i7] = aVar;
            int[] iArr = this.f16970a;
            int i8 = this.f16972c;
            this.f16972c = i8 + 1;
            iArr[i8] = i7;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f16970a, 999);
            Arrays.fill(this.f16971b, (Object) null);
            this.f16972c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f16970a, this.f16972c)));
            System.out.print("K: [");
            int i7 = 0;
            while (i7 < this.f16972c) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i7 == 0 ? "" : ", ");
                sb.append(g(i7));
                printStream.print(sb.toString());
                i7++;
            }
            System.out.println("]");
        }

        public int d(int i7) {
            return this.f16970a[i7];
        }

        public void e(int i7) {
            this.f16971b[i7] = null;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.f16972c;
                if (i8 >= i10) {
                    this.f16972c = i10 - 1;
                    return;
                }
                int[] iArr = this.f16970a;
                if (i7 == iArr[i8]) {
                    iArr[i8] = 999;
                    i9++;
                }
                if (i8 != i9) {
                    iArr[i8] = iArr[i9];
                }
                i9++;
                i8++;
            }
        }

        public int f() {
            return this.f16972c;
        }

        public r.a g(int i7) {
            return this.f16971b[this.f16970a[i7]];
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: d  reason: collision with root package name */
        public static final int f16973d = 999;

        /* renamed from: a  reason: collision with root package name */
        public int[] f16974a = new int[v.f17109g];

        /* renamed from: b  reason: collision with root package name */
        public r.b[] f16975b = new r.b[v.f17109g];

        /* renamed from: c  reason: collision with root package name */
        public int f16976c;

        public b() {
            b();
        }

        public void a(int i7, r.b bVar) {
            if (this.f16975b[i7] != null) {
                e(i7);
            }
            this.f16975b[i7] = bVar;
            int[] iArr = this.f16974a;
            int i8 = this.f16976c;
            this.f16976c = i8 + 1;
            iArr[i8] = i7;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f16974a, 999);
            Arrays.fill(this.f16975b, (Object) null);
            this.f16976c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f16974a, this.f16976c)));
            System.out.print("K: [");
            int i7 = 0;
            while (i7 < this.f16976c) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i7 == 0 ? "" : ", ");
                sb.append(g(i7));
                printStream.print(sb.toString());
                i7++;
            }
            System.out.println("]");
        }

        public int d(int i7) {
            return this.f16974a[i7];
        }

        public void e(int i7) {
            this.f16975b[i7] = null;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.f16976c;
                if (i8 >= i10) {
                    this.f16976c = i10 - 1;
                    return;
                }
                int[] iArr = this.f16974a;
                if (i7 == iArr[i8]) {
                    iArr[i8] = 999;
                    i9++;
                }
                if (i8 != i9) {
                    iArr[i8] = iArr[i9];
                }
                i9++;
                i8++;
            }
        }

        public int f() {
            return this.f16976c;
        }

        public r.b g(int i7) {
            return this.f16975b[this.f16974a[i7]];
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: d  reason: collision with root package name */
        public static final int f16977d = 999;

        /* renamed from: a  reason: collision with root package name */
        public int[] f16978a = new int[v.f17109g];

        /* renamed from: b  reason: collision with root package name */
        public float[][] f16979b = new float[v.f17109g];

        /* renamed from: c  reason: collision with root package name */
        public int f16980c;

        public c() {
            b();
        }

        public void a(int i7, float[] fArr) {
            if (this.f16979b[i7] != null) {
                e(i7);
            }
            this.f16979b[i7] = fArr;
            int[] iArr = this.f16978a;
            int i8 = this.f16980c;
            this.f16980c = i8 + 1;
            iArr[i8] = i7;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f16978a, 999);
            Arrays.fill(this.f16979b, (Object) null);
            this.f16980c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f16978a, this.f16980c)));
            System.out.print("K: [");
            int i7 = 0;
            while (i7 < this.f16980c) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i7 == 0 ? "" : ", ");
                sb.append(Arrays.toString(g(i7)));
                printStream.print(sb.toString());
                i7++;
            }
            System.out.println("]");
        }

        public int d(int i7) {
            return this.f16978a[i7];
        }

        public void e(int i7) {
            this.f16979b[i7] = null;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = this.f16980c;
                if (i8 >= i10) {
                    this.f16980c = i10 - 1;
                    return;
                }
                int[] iArr = this.f16978a;
                if (i7 == iArr[i8]) {
                    iArr[i8] = 999;
                    i9++;
                }
                if (i8 != i9) {
                    iArr[i8] = iArr[i9];
                }
                i9++;
                i8++;
            }
        }

        public int f() {
            return this.f16980c;
        }

        public float[] g(int i7) {
            return this.f16979b[this.f16978a[i7]];
        }
    }
}