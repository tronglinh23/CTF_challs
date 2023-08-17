package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.f;
import androidx.constraintlayout.widget.k;
import c0.s;
import c0.u;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {
    public static final int A = 1;
    public static final int A0 = 29;
    public static final int A1 = 81;
    public static final int B = 0;
    public static final int B0 = 30;
    public static final int B1 = 82;
    public static final int C = 1;
    public static final int C0 = 31;
    public static final int C1 = 83;
    public static final int D = 0;
    public static final int D0 = 32;
    public static final int D1 = 84;
    public static final int E = 4;
    public static final int E0 = 33;
    public static final int E1 = 85;
    public static final int F = 8;
    public static final int F0 = 34;
    public static final int F1 = 86;
    public static final int G = 1;
    public static final int G0 = 35;
    public static final int G1 = 87;
    public static final int H = 2;
    public static final int H0 = 36;
    public static final int H1 = 88;
    public static final int I = 3;
    public static final int I0 = 37;
    public static final int I1 = 89;
    public static final int J = 4;
    public static final int J0 = 38;
    public static final int J1 = 90;
    public static final int K = 5;
    public static final int K0 = 39;
    public static final int K1 = 91;
    public static final int L = 6;
    public static final int L0 = 40;
    public static final int L1 = 92;
    public static final int M = 7;
    public static final int M0 = 41;
    public static final int M1 = 93;
    public static final int N = 8;
    public static final int N0 = 42;
    public static final int N1 = 94;
    public static final int O = 0;
    public static final int O0 = 43;
    public static final int O1 = 95;
    public static final int P = 1;
    public static final int P0 = 44;
    public static final int P1 = 96;
    public static final int Q = 0;
    public static final int Q0 = 45;
    public static final int Q1 = 97;
    public static final int R = 1;
    public static final int R0 = 46;
    public static final int R1 = 98;
    public static final int S = 2;
    public static final int S0 = 47;
    public static final int S1 = 99;
    public static final boolean T = false;
    public static final int T0 = 48;
    public static final String T1 = "weight";
    public static final int U0 = 49;
    public static final String U1 = "ratio";
    public static final int V = 1;
    public static final int V0 = 50;
    public static final String V1 = "parent";
    public static final int W0 = 51;
    public static final int X0 = 52;
    public static final int Y = 1;
    public static final int Y0 = 53;
    public static final int Z = 2;
    public static final int Z0 = 54;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f2185a0 = 3;

    /* renamed from: a1  reason: collision with root package name */
    public static final int f2186a1 = 55;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f2187b0 = 4;

    /* renamed from: b1  reason: collision with root package name */
    public static final int f2188b1 = 56;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f2189c0 = 5;

    /* renamed from: c1  reason: collision with root package name */
    public static final int f2190c1 = 57;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f2191d0 = 6;

    /* renamed from: d1  reason: collision with root package name */
    public static final int f2192d1 = 58;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f2193e0 = 7;

    /* renamed from: e1  reason: collision with root package name */
    public static final int f2194e1 = 59;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f2195f0 = 8;

    /* renamed from: f1  reason: collision with root package name */
    public static final int f2196f1 = 60;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f2197g0 = 9;

    /* renamed from: g1  reason: collision with root package name */
    public static final int f2198g1 = 61;

    /* renamed from: h  reason: collision with root package name */
    public static final String f2199h = "ConstraintSet";

    /* renamed from: h0  reason: collision with root package name */
    public static final int f2200h0 = 10;

    /* renamed from: h1  reason: collision with root package name */
    public static final int f2201h1 = 62;

    /* renamed from: i  reason: collision with root package name */
    public static final String f2202i = "XML parser error must be within a Constraint ";

    /* renamed from: i0  reason: collision with root package name */
    public static final int f2203i0 = 11;

    /* renamed from: i1  reason: collision with root package name */
    public static final int f2204i1 = 63;

    /* renamed from: j  reason: collision with root package name */
    public static final int f2205j = -1;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f2206j0 = 12;

    /* renamed from: j1  reason: collision with root package name */
    public static final int f2207j1 = 64;

    /* renamed from: k  reason: collision with root package name */
    public static final int f2208k = -2;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f2209k0 = 13;

    /* renamed from: k1  reason: collision with root package name */
    public static final int f2210k1 = 65;

    /* renamed from: l  reason: collision with root package name */
    public static final int f2211l = -3;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f2212l0 = 14;

    /* renamed from: l1  reason: collision with root package name */
    public static final int f2213l1 = 66;

    /* renamed from: m  reason: collision with root package name */
    public static final int f2214m = -4;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f2215m0 = 15;

    /* renamed from: m1  reason: collision with root package name */
    public static final int f2216m1 = 67;

    /* renamed from: n  reason: collision with root package name */
    public static final int f2217n = 0;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f2218n0 = 16;

    /* renamed from: n1  reason: collision with root package name */
    public static final int f2219n1 = 68;

    /* renamed from: o  reason: collision with root package name */
    public static final int f2220o = 1;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f2221o0 = 17;

    /* renamed from: o1  reason: collision with root package name */
    public static final int f2222o1 = 69;

    /* renamed from: p  reason: collision with root package name */
    public static final int f2223p = 2;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f2224p0 = 18;

    /* renamed from: p1  reason: collision with root package name */
    public static final int f2225p1 = 70;

    /* renamed from: q  reason: collision with root package name */
    public static final int f2226q = 3;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f2227q0 = 19;

    /* renamed from: q1  reason: collision with root package name */
    public static final int f2228q1 = 71;

    /* renamed from: r  reason: collision with root package name */
    public static final int f2229r = 4;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f2230r0 = 20;

    /* renamed from: r1  reason: collision with root package name */
    public static final int f2231r1 = 72;

    /* renamed from: s  reason: collision with root package name */
    public static final int f2232s = -1;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f2233s0 = 21;

    /* renamed from: s1  reason: collision with root package name */
    public static final int f2234s1 = 73;

    /* renamed from: t  reason: collision with root package name */
    public static final int f2235t = 0;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f2236t0 = 22;

    /* renamed from: t1  reason: collision with root package name */
    public static final int f2237t1 = 74;

    /* renamed from: u  reason: collision with root package name */
    public static final int f2238u = -2;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f2239u0 = 23;

    /* renamed from: u1  reason: collision with root package name */
    public static final int f2240u1 = 75;

    /* renamed from: v  reason: collision with root package name */
    public static final int f2241v = 1;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f2242v0 = 24;

    /* renamed from: v1  reason: collision with root package name */
    public static final int f2243v1 = 76;

    /* renamed from: w  reason: collision with root package name */
    public static final int f2244w = 0;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f2245w0 = 25;

    /* renamed from: w1  reason: collision with root package name */
    public static final int f2246w1 = 77;

    /* renamed from: x  reason: collision with root package name */
    public static final int f2247x = 2;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f2248x0 = 26;

    /* renamed from: x1  reason: collision with root package name */
    public static final int f2249x1 = 78;

    /* renamed from: y  reason: collision with root package name */
    public static final int f2250y = 0;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f2251y0 = 27;

    /* renamed from: y1  reason: collision with root package name */
    public static final int f2252y1 = 79;

    /* renamed from: z  reason: collision with root package name */
    public static final int f2253z = 0;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f2254z0 = 28;

    /* renamed from: z1  reason: collision with root package name */
    public static final int f2255z1 = 80;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2256a;

    /* renamed from: b  reason: collision with root package name */
    public String f2257b;

    /* renamed from: c  reason: collision with root package name */
    public String f2258c = "";

    /* renamed from: d  reason: collision with root package name */
    public int f2259d = 0;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f2260e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f2261f = true;

    /* renamed from: g  reason: collision with root package name */
    public HashMap<Integer, a> f2262g = new HashMap<>();
    public static final int[] U = {0, 4, 8};
    public static SparseIntArray W = new SparseIntArray();
    public static SparseIntArray X = new SparseIntArray();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2263a;

        /* renamed from: b  reason: collision with root package name */
        public String f2264b;

        /* renamed from: c  reason: collision with root package name */
        public final d f2265c = new d();

        /* renamed from: d  reason: collision with root package name */
        public final c f2266d = new c();

        /* renamed from: e  reason: collision with root package name */
        public final b f2267e = new b();

        /* renamed from: f  reason: collision with root package name */
        public final C0032e f2268f = new C0032e();

        /* renamed from: g  reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f2269g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public C0031a f2270h;

        /* renamed from: androidx.constraintlayout.widget.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0031a {

            /* renamed from: m  reason: collision with root package name */
            public static final int f2271m = 4;

            /* renamed from: n  reason: collision with root package name */
            public static final int f2272n = 10;

            /* renamed from: o  reason: collision with root package name */
            public static final int f2273o = 10;

            /* renamed from: p  reason: collision with root package name */
            public static final int f2274p = 5;

            /* renamed from: a  reason: collision with root package name */
            public int[] f2275a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f2276b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f2277c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f2278d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f2279e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f2280f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f2281g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f2282h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f2283i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f2284j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f2285k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f2286l = 0;

            public void a(int type, float value) {
                int i7 = this.f2280f;
                int[] iArr = this.f2278d;
                if (i7 >= iArr.length) {
                    this.f2278d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f2279e;
                    this.f2279e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f2278d;
                int i8 = this.f2280f;
                iArr2[i8] = type;
                float[] fArr2 = this.f2279e;
                this.f2280f = i8 + 1;
                fArr2[i8] = value;
            }

            public void b(int type, int value) {
                int i7 = this.f2277c;
                int[] iArr = this.f2275a;
                if (i7 >= iArr.length) {
                    this.f2275a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f2276b;
                    this.f2276b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f2275a;
                int i8 = this.f2277c;
                iArr3[i8] = type;
                int[] iArr4 = this.f2276b;
                this.f2277c = i8 + 1;
                iArr4[i8] = value;
            }

            public void c(int type, String value) {
                int i7 = this.f2283i;
                int[] iArr = this.f2281g;
                if (i7 >= iArr.length) {
                    this.f2281g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f2282h;
                    this.f2282h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f2281g;
                int i8 = this.f2283i;
                iArr2[i8] = type;
                String[] strArr2 = this.f2282h;
                this.f2283i = i8 + 1;
                strArr2[i8] = value;
            }

            public void d(int type, boolean value) {
                int i7 = this.f2286l;
                int[] iArr = this.f2284j;
                if (i7 >= iArr.length) {
                    this.f2284j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f2285k;
                    this.f2285k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f2284j;
                int i8 = this.f2286l;
                iArr2[i8] = type;
                boolean[] zArr2 = this.f2285k;
                this.f2286l = i8 + 1;
                zArr2[i8] = value;
            }

            public void e(a c7) {
                for (int i7 = 0; i7 < this.f2277c; i7++) {
                    e.S0(c7, this.f2275a[i7], this.f2276b[i7]);
                }
                for (int i8 = 0; i8 < this.f2280f; i8++) {
                    e.R0(c7, this.f2278d[i8], this.f2279e[i8]);
                }
                for (int i9 = 0; i9 < this.f2283i; i9++) {
                    e.T0(c7, this.f2281g[i9], this.f2282h[i9]);
                }
                for (int i10 = 0; i10 < this.f2286l; i10++) {
                    e.U0(c7, this.f2284j[i10], this.f2285k[i10]);
                }
            }

            @SuppressLint({"LogConditional"})
            public void f(String tag) {
                for (int i7 = 0; i7 < this.f2277c; i7++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f2275a[i7]);
                    sb.append(" = ");
                    sb.append(this.f2276b[i7]);
                }
                for (int i8 = 0; i8 < this.f2280f; i8++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f2278d[i8]);
                    sb2.append(" = ");
                    sb2.append(this.f2279e[i8]);
                }
                for (int i9 = 0; i9 < this.f2283i; i9++) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f2281g[i9]);
                    sb3.append(" = ");
                    sb3.append(this.f2282h[i9]);
                }
                for (int i10 = 0; i10 < this.f2286l; i10++) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f2284j[i10]);
                    sb4.append(" = ");
                    sb4.append(this.f2285k[i10]);
                }
            }
        }

        public void h(a c7) {
            C0031a c0031a = this.f2270h;
            if (c0031a != null) {
                c0031a.e(c7);
            }
        }

        public void i(ConstraintLayout.b param) {
            b bVar = this.f2267e;
            param.f2038e = bVar.f2340j;
            param.f2040f = bVar.f2342k;
            param.f2042g = bVar.f2344l;
            param.f2044h = bVar.f2346m;
            param.f2046i = bVar.f2348n;
            param.f2048j = bVar.f2350o;
            param.f2050k = bVar.f2352p;
            param.f2052l = bVar.f2354q;
            param.f2054m = bVar.f2356r;
            param.f2056n = bVar.f2357s;
            param.f2058o = bVar.f2358t;
            param.f2066s = bVar.f2359u;
            param.f2068t = bVar.f2360v;
            param.f2070u = bVar.f2361w;
            param.f2072v = bVar.f2362x;
            ((ViewGroup.MarginLayoutParams) param).leftMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) param).rightMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) param).topMargin = bVar.J;
            ((ViewGroup.MarginLayoutParams) param).bottomMargin = bVar.K;
            param.A = bVar.T;
            param.B = bVar.S;
            param.f2076x = bVar.P;
            param.f2078z = bVar.R;
            param.G = bVar.f2363y;
            param.H = bVar.f2364z;
            param.f2060p = bVar.B;
            param.f2062q = bVar.C;
            param.f2064r = bVar.D;
            param.I = bVar.A;
            param.X = bVar.E;
            param.Y = bVar.F;
            param.M = bVar.V;
            param.L = bVar.W;
            param.O = bVar.Y;
            param.N = bVar.X;
            param.f2031a0 = bVar.f2349n0;
            param.f2033b0 = bVar.f2351o0;
            param.P = bVar.Z;
            param.Q = bVar.f2323a0;
            param.T = bVar.f2325b0;
            param.U = bVar.f2327c0;
            param.R = bVar.f2329d0;
            param.S = bVar.f2331e0;
            param.V = bVar.f2333f0;
            param.W = bVar.f2335g0;
            param.Z = bVar.G;
            param.f2034c = bVar.f2336h;
            param.f2030a = bVar.f2332f;
            param.f2032b = bVar.f2334g;
            ((ViewGroup.MarginLayoutParams) param).width = bVar.f2328d;
            ((ViewGroup.MarginLayoutParams) param).height = bVar.f2330e;
            String str = bVar.f2347m0;
            if (str != null) {
                param.f2035c0 = str;
            }
            param.f2037d0 = bVar.f2355q0;
            param.setMarginStart(bVar.M);
            param.setMarginEnd(this.f2267e.L);
            param.e();
        }

        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f2267e.a(this.f2267e);
            aVar.f2266d.a(this.f2266d);
            aVar.f2265c.a(this.f2265c);
            aVar.f2268f.a(this.f2268f);
            aVar.f2263a = this.f2263a;
            aVar.f2270h = this.f2270h;
            return aVar;
        }

        public final void k(int viewId, ConstraintLayout.b param) {
            this.f2263a = viewId;
            b bVar = this.f2267e;
            bVar.f2340j = param.f2038e;
            bVar.f2342k = param.f2040f;
            bVar.f2344l = param.f2042g;
            bVar.f2346m = param.f2044h;
            bVar.f2348n = param.f2046i;
            bVar.f2350o = param.f2048j;
            bVar.f2352p = param.f2050k;
            bVar.f2354q = param.f2052l;
            bVar.f2356r = param.f2054m;
            bVar.f2357s = param.f2056n;
            bVar.f2358t = param.f2058o;
            bVar.f2359u = param.f2066s;
            bVar.f2360v = param.f2068t;
            bVar.f2361w = param.f2070u;
            bVar.f2362x = param.f2072v;
            bVar.f2363y = param.G;
            bVar.f2364z = param.H;
            bVar.A = param.I;
            bVar.B = param.f2060p;
            bVar.C = param.f2062q;
            bVar.D = param.f2064r;
            bVar.E = param.X;
            bVar.F = param.Y;
            bVar.G = param.Z;
            bVar.f2336h = param.f2034c;
            bVar.f2332f = param.f2030a;
            bVar.f2334g = param.f2032b;
            bVar.f2328d = ((ViewGroup.MarginLayoutParams) param).width;
            bVar.f2330e = ((ViewGroup.MarginLayoutParams) param).height;
            bVar.H = ((ViewGroup.MarginLayoutParams) param).leftMargin;
            bVar.I = ((ViewGroup.MarginLayoutParams) param).rightMargin;
            bVar.J = ((ViewGroup.MarginLayoutParams) param).topMargin;
            bVar.K = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
            bVar.N = param.D;
            bVar.V = param.M;
            bVar.W = param.L;
            bVar.Y = param.O;
            bVar.X = param.N;
            bVar.f2349n0 = param.f2031a0;
            bVar.f2351o0 = param.f2033b0;
            bVar.Z = param.P;
            bVar.f2323a0 = param.Q;
            bVar.f2325b0 = param.T;
            bVar.f2327c0 = param.U;
            bVar.f2329d0 = param.R;
            bVar.f2331e0 = param.S;
            bVar.f2333f0 = param.V;
            bVar.f2335g0 = param.W;
            bVar.f2347m0 = param.f2035c0;
            bVar.P = param.f2076x;
            bVar.R = param.f2078z;
            bVar.O = param.f2074w;
            bVar.Q = param.f2077y;
            bVar.T = param.A;
            bVar.S = param.B;
            bVar.U = param.C;
            bVar.f2355q0 = param.f2037d0;
            bVar.L = param.getMarginEnd();
            this.f2267e.M = param.getMarginStart();
        }

        public final void l(int viewId, f.a param) {
            k(viewId, param);
            this.f2265c.f2394d = param.V0;
            C0032e c0032e = this.f2268f;
            c0032e.f2409b = param.Y0;
            c0032e.f2410c = param.Z0;
            c0032e.f2411d = param.f2454a1;
            c0032e.f2412e = param.f2455b1;
            c0032e.f2413f = param.f2456c1;
            c0032e.f2414g = param.f2457d1;
            c0032e.f2415h = param.f2458e1;
            c0032e.f2417j = param.f2459f1;
            c0032e.f2418k = param.f2460g1;
            c0032e.f2419l = param.f2461h1;
            c0032e.f2421n = param.X0;
            c0032e.f2420m = param.W0;
        }

        public final void m(androidx.constraintlayout.widget.b helper, int viewId, f.a param) {
            l(viewId, param);
            if (helper instanceof Barrier) {
                b bVar = this.f2267e;
                bVar.f2341j0 = 1;
                Barrier barrier = (Barrier) helper;
                bVar.f2337h0 = barrier.getType();
                this.f2267e.f2343k0 = barrier.getReferencedIds();
                this.f2267e.f2339i0 = barrier.getMargin();
            }
        }

        public final androidx.constraintlayout.widget.a n(String attributeName, a.b attributeType) {
            if (!this.f2269g.containsKey(attributeName)) {
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a(attributeName, attributeType);
                this.f2269g.put(attributeName, aVar);
                return aVar;
            }
            androidx.constraintlayout.widget.a aVar2 = this.f2269g.get(attributeName);
            if (aVar2.j() == attributeType) {
                return aVar2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar2.j().name());
        }

        public void o(String tag) {
            C0031a c0031a = this.f2270h;
            if (c0031a != null) {
                c0031a.f(tag);
            }
        }

        public final void p(String attributeName, int value) {
            n(attributeName, a.b.COLOR_TYPE).s(value);
        }

        public final void q(String attributeName, float value) {
            n(attributeName, a.b.FLOAT_TYPE).t(value);
        }

        public final void r(String attributeName, int value) {
            n(attributeName, a.b.INT_TYPE).u(value);
        }

        public final void s(String attributeName, String value) {
            n(attributeName, a.b.STRING_TYPE).v(value);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final int A0 = 7;
        public static final int A1 = 82;
        public static final int B0 = 8;
        public static final int B1 = 83;
        public static final int C0 = 9;
        public static final int C1 = 84;
        public static final int D0 = 10;
        public static final int D1 = 85;
        public static final int E0 = 11;
        public static final int E1 = 86;
        public static final int F0 = 12;
        public static final int F1 = 87;
        public static final int G0 = 13;
        public static final int G1 = 88;
        public static final int H0 = 14;
        public static final int H1 = 89;
        public static final int I0 = 15;
        public static final int I1 = 90;
        public static final int J0 = 16;
        public static final int J1 = 91;
        public static final int K0 = 17;
        public static final int L0 = 18;
        public static final int M0 = 19;
        public static final int N0 = 20;
        public static final int O0 = 21;
        public static final int P0 = 22;
        public static final int Q0 = 23;
        public static final int R0 = 24;
        public static final int S0 = 25;
        public static final int T0 = 26;
        public static final int U0 = 27;
        public static final int V0 = 28;
        public static final int W0 = 29;
        public static final int X0 = 30;
        public static final int Y0 = 31;
        public static final int Z0 = 32;

        /* renamed from: a1  reason: collision with root package name */
        public static final int f2287a1 = 33;

        /* renamed from: b1  reason: collision with root package name */
        public static final int f2288b1 = 34;

        /* renamed from: c1  reason: collision with root package name */
        public static final int f2289c1 = 35;

        /* renamed from: d1  reason: collision with root package name */
        public static final int f2290d1 = 36;

        /* renamed from: e1  reason: collision with root package name */
        public static final int f2291e1 = 37;

        /* renamed from: f1  reason: collision with root package name */
        public static final int f2292f1 = 38;

        /* renamed from: g1  reason: collision with root package name */
        public static final int f2293g1 = 39;

        /* renamed from: h1  reason: collision with root package name */
        public static final int f2294h1 = 40;

        /* renamed from: i1  reason: collision with root package name */
        public static final int f2295i1 = 41;

        /* renamed from: j1  reason: collision with root package name */
        public static final int f2296j1 = 42;

        /* renamed from: k1  reason: collision with root package name */
        public static final int f2297k1 = 61;

        /* renamed from: l1  reason: collision with root package name */
        public static final int f2298l1 = 62;

        /* renamed from: m1  reason: collision with root package name */
        public static final int f2299m1 = 63;

        /* renamed from: n1  reason: collision with root package name */
        public static final int f2300n1 = 69;

        /* renamed from: o1  reason: collision with root package name */
        public static final int f2301o1 = 70;

        /* renamed from: p1  reason: collision with root package name */
        public static final int f2302p1 = 71;

        /* renamed from: q1  reason: collision with root package name */
        public static final int f2303q1 = 72;

        /* renamed from: r0  reason: collision with root package name */
        public static final int f2304r0 = -1;

        /* renamed from: r1  reason: collision with root package name */
        public static final int f2305r1 = 73;

        /* renamed from: s0  reason: collision with root package name */
        public static final int f2306s0 = Integer.MIN_VALUE;

        /* renamed from: s1  reason: collision with root package name */
        public static final int f2307s1 = 74;

        /* renamed from: t0  reason: collision with root package name */
        public static SparseIntArray f2308t0 = null;

        /* renamed from: t1  reason: collision with root package name */
        public static final int f2309t1 = 75;

        /* renamed from: u0  reason: collision with root package name */
        public static final int f2310u0 = 1;

        /* renamed from: u1  reason: collision with root package name */
        public static final int f2311u1 = 76;

        /* renamed from: v0  reason: collision with root package name */
        public static final int f2312v0 = 2;

        /* renamed from: v1  reason: collision with root package name */
        public static final int f2313v1 = 77;

        /* renamed from: w0  reason: collision with root package name */
        public static final int f2314w0 = 3;

        /* renamed from: w1  reason: collision with root package name */
        public static final int f2315w1 = 78;

        /* renamed from: x0  reason: collision with root package name */
        public static final int f2316x0 = 4;

        /* renamed from: x1  reason: collision with root package name */
        public static final int f2317x1 = 79;

        /* renamed from: y0  reason: collision with root package name */
        public static final int f2318y0 = 5;

        /* renamed from: y1  reason: collision with root package name */
        public static final int f2319y1 = 80;

        /* renamed from: z0  reason: collision with root package name */
        public static final int f2320z0 = 6;

        /* renamed from: z1  reason: collision with root package name */
        public static final int f2321z1 = 81;

        /* renamed from: d  reason: collision with root package name */
        public int f2328d;

        /* renamed from: e  reason: collision with root package name */
        public int f2330e;

        /* renamed from: k0  reason: collision with root package name */
        public int[] f2343k0;

        /* renamed from: l0  reason: collision with root package name */
        public String f2345l0;

        /* renamed from: m0  reason: collision with root package name */
        public String f2347m0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2322a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2324b = false;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2326c = false;

        /* renamed from: f  reason: collision with root package name */
        public int f2332f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2334g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f2336h = -1.0f;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2338i = true;

        /* renamed from: j  reason: collision with root package name */
        public int f2340j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f2342k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f2344l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f2346m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f2348n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f2350o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f2352p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f2354q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f2356r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f2357s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f2358t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f2359u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f2360v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f2361w = -1;

        /* renamed from: x  reason: collision with root package name */
        public int f2362x = -1;

        /* renamed from: y  reason: collision with root package name */
        public float f2363y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public float f2364z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public int f2323a0 = 0;

        /* renamed from: b0  reason: collision with root package name */
        public int f2325b0 = 0;

        /* renamed from: c0  reason: collision with root package name */
        public int f2327c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f2329d0 = 0;

        /* renamed from: e0  reason: collision with root package name */
        public int f2331e0 = 0;

        /* renamed from: f0  reason: collision with root package name */
        public float f2333f0 = 1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public float f2335g0 = 1.0f;

        /* renamed from: h0  reason: collision with root package name */
        public int f2337h0 = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f2339i0 = 0;

        /* renamed from: j0  reason: collision with root package name */
        public int f2341j0 = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f2349n0 = false;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f2351o0 = false;

        /* renamed from: p0  reason: collision with root package name */
        public boolean f2353p0 = true;

        /* renamed from: q0  reason: collision with root package name */
        public int f2355q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2308t0 = sparseIntArray;
            sparseIntArray.append(k.m.qh, 24);
            f2308t0.append(k.m.rh, 25);
            f2308t0.append(k.m.th, 28);
            f2308t0.append(k.m.uh, 29);
            f2308t0.append(k.m.zh, 35);
            f2308t0.append(k.m.yh, 34);
            f2308t0.append(k.m.Xg, 4);
            f2308t0.append(k.m.Wg, 3);
            f2308t0.append(k.m.Sg, 1);
            f2308t0.append(k.m.Ih, 6);
            f2308t0.append(k.m.Jh, 7);
            f2308t0.append(k.m.eh, 17);
            f2308t0.append(k.m.fh, 18);
            f2308t0.append(k.m.gh, 19);
            f2308t0.append(k.m.Og, 90);
            f2308t0.append(k.m.zg, 26);
            f2308t0.append(k.m.vh, 31);
            f2308t0.append(k.m.wh, 32);
            f2308t0.append(k.m.dh, 10);
            f2308t0.append(k.m.ch, 9);
            f2308t0.append(k.m.Nh, 13);
            f2308t0.append(k.m.Qh, 16);
            f2308t0.append(k.m.Oh, 14);
            f2308t0.append(k.m.Lh, 11);
            f2308t0.append(k.m.Ph, 15);
            f2308t0.append(k.m.Mh, 12);
            f2308t0.append(k.m.Ch, 38);
            f2308t0.append(k.m.oh, 37);
            f2308t0.append(k.m.nh, 39);
            f2308t0.append(k.m.Bh, 40);
            f2308t0.append(k.m.mh, 20);
            f2308t0.append(k.m.Ah, 36);
            f2308t0.append(k.m.bh, 5);
            f2308t0.append(k.m.ph, 91);
            f2308t0.append(k.m.xh, 91);
            f2308t0.append(k.m.sh, 91);
            f2308t0.append(k.m.Vg, 91);
            f2308t0.append(k.m.Rg, 91);
            f2308t0.append(k.m.Cg, 23);
            f2308t0.append(k.m.Eg, 27);
            f2308t0.append(k.m.Gg, 30);
            f2308t0.append(k.m.Hg, 8);
            f2308t0.append(k.m.Dg, 33);
            f2308t0.append(k.m.Fg, 2);
            f2308t0.append(k.m.Ag, 22);
            f2308t0.append(k.m.Bg, 21);
            f2308t0.append(k.m.Dh, 41);
            f2308t0.append(k.m.hh, 42);
            f2308t0.append(k.m.Qg, 41);
            f2308t0.append(k.m.Pg, 42);
            f2308t0.append(k.m.Sh, 76);
            f2308t0.append(k.m.Yg, 61);
            f2308t0.append(k.m.ah, 62);
            f2308t0.append(k.m.Zg, 63);
            f2308t0.append(k.m.Hh, 69);
            f2308t0.append(k.m.lh, 70);
            f2308t0.append(k.m.Lg, 71);
            f2308t0.append(k.m.Jg, 72);
            f2308t0.append(k.m.Kg, 73);
            f2308t0.append(k.m.Mg, 74);
            f2308t0.append(k.m.Ig, 75);
        }

        public void a(b src) {
            this.f2322a = src.f2322a;
            this.f2328d = src.f2328d;
            this.f2324b = src.f2324b;
            this.f2330e = src.f2330e;
            this.f2332f = src.f2332f;
            this.f2334g = src.f2334g;
            this.f2336h = src.f2336h;
            this.f2338i = src.f2338i;
            this.f2340j = src.f2340j;
            this.f2342k = src.f2342k;
            this.f2344l = src.f2344l;
            this.f2346m = src.f2346m;
            this.f2348n = src.f2348n;
            this.f2350o = src.f2350o;
            this.f2352p = src.f2352p;
            this.f2354q = src.f2354q;
            this.f2356r = src.f2356r;
            this.f2357s = src.f2357s;
            this.f2358t = src.f2358t;
            this.f2359u = src.f2359u;
            this.f2360v = src.f2360v;
            this.f2361w = src.f2361w;
            this.f2362x = src.f2362x;
            this.f2363y = src.f2363y;
            this.f2364z = src.f2364z;
            this.A = src.A;
            this.B = src.B;
            this.C = src.C;
            this.D = src.D;
            this.E = src.E;
            this.F = src.F;
            this.G = src.G;
            this.H = src.H;
            this.I = src.I;
            this.J = src.J;
            this.K = src.K;
            this.L = src.L;
            this.M = src.M;
            this.N = src.N;
            this.O = src.O;
            this.P = src.P;
            this.Q = src.Q;
            this.R = src.R;
            this.S = src.S;
            this.T = src.T;
            this.U = src.U;
            this.V = src.V;
            this.W = src.W;
            this.X = src.X;
            this.Y = src.Y;
            this.Z = src.Z;
            this.f2323a0 = src.f2323a0;
            this.f2325b0 = src.f2325b0;
            this.f2327c0 = src.f2327c0;
            this.f2329d0 = src.f2329d0;
            this.f2331e0 = src.f2331e0;
            this.f2333f0 = src.f2333f0;
            this.f2335g0 = src.f2335g0;
            this.f2337h0 = src.f2337h0;
            this.f2339i0 = src.f2339i0;
            this.f2341j0 = src.f2341j0;
            this.f2347m0 = src.f2347m0;
            int[] iArr = src.f2343k0;
            if (iArr == null || src.f2345l0 != null) {
                this.f2343k0 = null;
            } else {
                this.f2343k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f2345l0 = src.f2345l0;
            this.f2349n0 = src.f2349n0;
            this.f2351o0 = src.f2351o0;
            this.f2353p0 = src.f2353p0;
            this.f2355q0 = src.f2355q0;
        }

        public void b(u scene, StringBuilder stringBuilder) {
            Field[] declaredFields = getClass().getDeclaredFields();
            stringBuilder.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object X = scene.X(num.intValue());
                                stringBuilder.append("    ");
                                stringBuilder.append(name);
                                stringBuilder.append(" = \"");
                                stringBuilder.append(X == null ? num : X);
                                stringBuilder.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f7 = (Float) obj;
                            if (f7.floatValue() != -1.0f) {
                                stringBuilder.append("    ");
                                stringBuilder.append(name);
                                stringBuilder.append(" = \"");
                                stringBuilder.append(f7);
                                stringBuilder.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    }
                }
            }
        }

        public void c(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.yg);
            this.f2324b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                int i8 = f2308t0.get(index);
                switch (i8) {
                    case 1:
                        this.f2356r = e.y0(obtainStyledAttributes, index, this.f2356r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f2354q = e.y0(obtainStyledAttributes, index, this.f2354q);
                        break;
                    case 4:
                        this.f2352p = e.y0(obtainStyledAttributes, index, this.f2352p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f2362x = e.y0(obtainStyledAttributes, index, this.f2362x);
                        break;
                    case 10:
                        this.f2361w = e.y0(obtainStyledAttributes, index, this.f2361w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f2332f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2332f);
                        break;
                    case 18:
                        this.f2334g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2334g);
                        break;
                    case 19:
                        this.f2336h = obtainStyledAttributes.getFloat(index, this.f2336h);
                        break;
                    case 20:
                        this.f2363y = obtainStyledAttributes.getFloat(index, this.f2363y);
                        break;
                    case 21:
                        this.f2330e = obtainStyledAttributes.getLayoutDimension(index, this.f2330e);
                        break;
                    case 22:
                        this.f2328d = obtainStyledAttributes.getLayoutDimension(index, this.f2328d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f2340j = e.y0(obtainStyledAttributes, index, this.f2340j);
                        break;
                    case 25:
                        this.f2342k = e.y0(obtainStyledAttributes, index, this.f2342k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f2344l = e.y0(obtainStyledAttributes, index, this.f2344l);
                        break;
                    case 29:
                        this.f2346m = e.y0(obtainStyledAttributes, index, this.f2346m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f2359u = e.y0(obtainStyledAttributes, index, this.f2359u);
                        break;
                    case 32:
                        this.f2360v = e.y0(obtainStyledAttributes, index, this.f2360v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f2350o = e.y0(obtainStyledAttributes, index, this.f2350o);
                        break;
                    case 35:
                        this.f2348n = e.y0(obtainStyledAttributes, index, this.f2348n);
                        break;
                    case 36:
                        this.f2364z = obtainStyledAttributes.getFloat(index, this.f2364z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        e.A0(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.A0(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i8) {
                            case 61:
                                this.B = e.y0(obtainStyledAttributes, index, this.B);
                                continue;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                continue;
                            default:
                                switch (i8) {
                                    case 69:
                                        this.f2333f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f2335g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f2337h0 = obtainStyledAttributes.getInt(index, this.f2337h0);
                                        continue;
                                    case 73:
                                        this.f2339i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2339i0);
                                        continue;
                                    case 74:
                                        this.f2345l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f2353p0 = obtainStyledAttributes.getBoolean(index, this.f2353p0);
                                        continue;
                                    case 76:
                                        this.f2355q0 = obtainStyledAttributes.getInt(index, this.f2355q0);
                                        continue;
                                    case 77:
                                        this.f2357s = e.y0(obtainStyledAttributes, index, this.f2357s);
                                        continue;
                                    case 78:
                                        this.f2358t = e.y0(obtainStyledAttributes, index, this.f2358t);
                                        continue;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        continue;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        continue;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 82:
                                        this.f2323a0 = obtainStyledAttributes.getInt(index, this.f2323a0);
                                        continue;
                                    case 83:
                                        this.f2327c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2327c0);
                                        continue;
                                    case 84:
                                        this.f2325b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2325b0);
                                        continue;
                                    case 85:
                                        this.f2331e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2331e0);
                                        continue;
                                    case 86:
                                        this.f2329d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2329d0);
                                        continue;
                                    case 87:
                                        this.f2349n0 = obtainStyledAttributes.getBoolean(index, this.f2349n0);
                                        continue;
                                    case 88:
                                        this.f2351o0 = obtainStyledAttributes.getBoolean(index, this.f2351o0);
                                        continue;
                                    case 89:
                                        this.f2347m0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f2338i = obtainStyledAttributes.getBoolean(index, this.f2338i);
                                        continue;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f2308t0.get(index));
                                        continue;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f2308t0.get(index));
                                        continue;
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static final int A = 9;
        public static final int B = 10;

        /* renamed from: o  reason: collision with root package name */
        public static final int f2365o = -2;

        /* renamed from: p  reason: collision with root package name */
        public static final int f2366p = -1;

        /* renamed from: q  reason: collision with root package name */
        public static final int f2367q = -3;

        /* renamed from: r  reason: collision with root package name */
        public static SparseIntArray f2368r = null;

        /* renamed from: s  reason: collision with root package name */
        public static final int f2369s = 1;

        /* renamed from: t  reason: collision with root package name */
        public static final int f2370t = 2;

        /* renamed from: u  reason: collision with root package name */
        public static final int f2371u = 3;

        /* renamed from: v  reason: collision with root package name */
        public static final int f2372v = 4;

        /* renamed from: w  reason: collision with root package name */
        public static final int f2373w = 5;

        /* renamed from: x  reason: collision with root package name */
        public static final int f2374x = 6;

        /* renamed from: y  reason: collision with root package name */
        public static final int f2375y = 7;

        /* renamed from: z  reason: collision with root package name */
        public static final int f2376z = 8;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2377a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2378b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f2379c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f2380d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f2381e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2382f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f2383g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f2384h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f2385i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f2386j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f2387k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f2388l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f2389m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f2390n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2368r = sparseIntArray;
            sparseIntArray.append(k.m.pj, 1);
            f2368r.append(k.m.rj, 2);
            f2368r.append(k.m.vj, 3);
            f2368r.append(k.m.oj, 4);
            f2368r.append(k.m.nj, 5);
            f2368r.append(k.m.mj, 6);
            f2368r.append(k.m.qj, 7);
            f2368r.append(k.m.uj, 8);
            f2368r.append(k.m.tj, 9);
            f2368r.append(k.m.sj, 10);
        }

        public void a(c src) {
            this.f2377a = src.f2377a;
            this.f2378b = src.f2378b;
            this.f2380d = src.f2380d;
            this.f2381e = src.f2381e;
            this.f2382f = src.f2382f;
            this.f2385i = src.f2385i;
            this.f2383g = src.f2383g;
            this.f2384h = src.f2384h;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.lj);
            this.f2377a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                switch (f2368r.get(index)) {
                    case 1:
                        this.f2385i = obtainStyledAttributes.getFloat(index, this.f2385i);
                        break;
                    case 2:
                        this.f2381e = obtainStyledAttributes.getInt(index, this.f2381e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f2380d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f2380d = u.d.f16910o[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f2382f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2378b = e.y0(obtainStyledAttributes, index, this.f2378b);
                        break;
                    case 6:
                        this.f2379c = obtainStyledAttributes.getInteger(index, this.f2379c);
                        break;
                    case 7:
                        this.f2383g = obtainStyledAttributes.getFloat(index, this.f2383g);
                        break;
                    case 8:
                        this.f2387k = obtainStyledAttributes.getInteger(index, this.f2387k);
                        break;
                    case 9:
                        this.f2386j = obtainStyledAttributes.getFloat(index, this.f2386j);
                        break;
                    case 10:
                        int i8 = obtainStyledAttributes.peekValue(index).type;
                        if (i8 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f2390n = resourceId;
                            if (resourceId != -1) {
                                this.f2389m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i8 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f2388l = string;
                            if (string.indexOf("/") > 0) {
                                this.f2390n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f2389m = -2;
                                break;
                            } else {
                                this.f2389m = -1;
                                break;
                            }
                        } else {
                            this.f2389m = obtainStyledAttributes.getInteger(index, this.f2390n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2391a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2392b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2393c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f2394d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2395e = Float.NaN;

        public void a(d src) {
            this.f2391a = src.f2391a;
            this.f2392b = src.f2392b;
            this.f2394d = src.f2394d;
            this.f2395e = src.f2395e;
            this.f2393c = src.f2393c;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.Zk);
            this.f2391a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.bl) {
                    this.f2394d = obtainStyledAttributes.getFloat(index, this.f2394d);
                } else if (index == k.m.al) {
                    this.f2392b = obtainStyledAttributes.getInt(index, this.f2392b);
                    this.f2392b = e.U[this.f2392b];
                } else if (index == k.m.el) {
                    this.f2393c = obtainStyledAttributes.getInt(index, this.f2393c);
                } else if (index == k.m.dl) {
                    this.f2395e = obtainStyledAttributes.getFloat(index, this.f2395e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0032e {
        public static final int A = 12;

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f2396o = null;

        /* renamed from: p  reason: collision with root package name */
        public static final int f2397p = 1;

        /* renamed from: q  reason: collision with root package name */
        public static final int f2398q = 2;

        /* renamed from: r  reason: collision with root package name */
        public static final int f2399r = 3;

        /* renamed from: s  reason: collision with root package name */
        public static final int f2400s = 4;

        /* renamed from: t  reason: collision with root package name */
        public static final int f2401t = 5;

        /* renamed from: u  reason: collision with root package name */
        public static final int f2402u = 6;

        /* renamed from: v  reason: collision with root package name */
        public static final int f2403v = 7;

        /* renamed from: w  reason: collision with root package name */
        public static final int f2404w = 8;

        /* renamed from: x  reason: collision with root package name */
        public static final int f2405x = 9;

        /* renamed from: y  reason: collision with root package name */
        public static final int f2406y = 10;

        /* renamed from: z  reason: collision with root package name */
        public static final int f2407z = 11;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2408a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f2409b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f2410c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f2411d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2412e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2413f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f2414g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f2415h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f2416i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f2417j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f2418k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f2419l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2420m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f2421n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2396o = sparseIntArray;
            sparseIntArray.append(k.m.Ln, 1);
            f2396o.append(k.m.Mn, 2);
            f2396o.append(k.m.Nn, 3);
            f2396o.append(k.m.Jn, 4);
            f2396o.append(k.m.Kn, 5);
            f2396o.append(k.m.Fn, 6);
            f2396o.append(k.m.Gn, 7);
            f2396o.append(k.m.Hn, 8);
            f2396o.append(k.m.In, 9);
            f2396o.append(k.m.On, 10);
            f2396o.append(k.m.Pn, 11);
            f2396o.append(k.m.Qn, 12);
        }

        public void a(C0032e src) {
            this.f2408a = src.f2408a;
            this.f2409b = src.f2409b;
            this.f2410c = src.f2410c;
            this.f2411d = src.f2411d;
            this.f2412e = src.f2412e;
            this.f2413f = src.f2413f;
            this.f2414g = src.f2414g;
            this.f2415h = src.f2415h;
            this.f2416i = src.f2416i;
            this.f2417j = src.f2417j;
            this.f2418k = src.f2418k;
            this.f2419l = src.f2419l;
            this.f2420m = src.f2420m;
            this.f2421n = src.f2421n;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, k.m.En);
            this.f2408a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                switch (f2396o.get(index)) {
                    case 1:
                        this.f2409b = obtainStyledAttributes.getFloat(index, this.f2409b);
                        break;
                    case 2:
                        this.f2410c = obtainStyledAttributes.getFloat(index, this.f2410c);
                        break;
                    case 3:
                        this.f2411d = obtainStyledAttributes.getFloat(index, this.f2411d);
                        break;
                    case 4:
                        this.f2412e = obtainStyledAttributes.getFloat(index, this.f2412e);
                        break;
                    case 5:
                        this.f2413f = obtainStyledAttributes.getFloat(index, this.f2413f);
                        break;
                    case 6:
                        this.f2414g = obtainStyledAttributes.getDimension(index, this.f2414g);
                        break;
                    case 7:
                        this.f2415h = obtainStyledAttributes.getDimension(index, this.f2415h);
                        break;
                    case 8:
                        this.f2417j = obtainStyledAttributes.getDimension(index, this.f2417j);
                        break;
                    case 9:
                        this.f2418k = obtainStyledAttributes.getDimension(index, this.f2418k);
                        break;
                    case 10:
                        this.f2419l = obtainStyledAttributes.getDimension(index, this.f2419l);
                        break;
                    case 11:
                        this.f2420m = true;
                        this.f2421n = obtainStyledAttributes.getDimension(index, this.f2421n);
                        break;
                    case 12:
                        this.f2416i = e.y0(obtainStyledAttributes, index, this.f2416i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: o  reason: collision with root package name */
        public static final String f2422o = "       ";

        /* renamed from: a  reason: collision with root package name */
        public Writer f2423a;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintLayout f2424b;

        /* renamed from: c  reason: collision with root package name */
        public Context f2425c;

        /* renamed from: d  reason: collision with root package name */
        public int f2426d;

        /* renamed from: e  reason: collision with root package name */
        public int f2427e = 0;

        /* renamed from: f  reason: collision with root package name */
        public final String f2428f = "'left'";

        /* renamed from: g  reason: collision with root package name */
        public final String f2429g = "'right'";

        /* renamed from: h  reason: collision with root package name */
        public final String f2430h = "'baseline'";

        /* renamed from: i  reason: collision with root package name */
        public final String f2431i = "'bottom'";

        /* renamed from: j  reason: collision with root package name */
        public final String f2432j = "'top'";

        /* renamed from: k  reason: collision with root package name */
        public final String f2433k = "'start'";

        /* renamed from: l  reason: collision with root package name */
        public final String f2434l = "'end'";

        /* renamed from: m  reason: collision with root package name */
        public HashMap<Integer, String> f2435m = new HashMap<>();

        public f(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.f2423a = writer;
            this.f2424b = layout;
            this.f2425c = layout.getContext();
            this.f2426d = flags;
        }

        public String a(int id) {
            if (this.f2435m.containsKey(Integer.valueOf(id))) {
                return "'" + this.f2435m.get(Integer.valueOf(id)) + "'";
            } else if (id == 0) {
                return "'parent'";
            } else {
                String b7 = b(id);
                this.f2435m.put(Integer.valueOf(id), b7);
                return "'" + b7 + "'";
            }
        }

        public String b(int id) {
            try {
                if (id != -1) {
                    return this.f2425c.getResources().getResourceEntryName(id);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(z0.m.f19022b);
                int i7 = this.f2427e + 1;
                this.f2427e = i7;
                sb.append(i7);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z0.m.f19022b);
                int i8 = this.f2427e + 1;
                this.f2427e = i8;
                sb2.append(i8);
                return sb2.toString();
            }
        }

        public void c(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.f2423a.write("       circle");
            this.f2423a.write(":[");
            this.f2423a.write(a(circleConstraint));
            this.f2423a.write(", " + circleAngle);
            this.f2423a.write(circleRadius + "]");
        }

        public void d(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f2423a.write(f2422o + my);
            this.f2423a.write(":[");
            this.f2423a.write(a(leftToLeft));
            this.f2423a.write(" , ");
            this.f2423a.write(other);
            if (margin != 0) {
                this.f2423a.write(" , " + margin);
            }
            this.f2423a.write("],\n");
        }

        public final void e(String dimString, int dim, int dimDefault, float dimPercent, int dimMin, int dimMax, boolean constrainedDim) throws IOException {
            if (dim != 0) {
                if (dim == -2) {
                    this.f2423a.write(f2422o + dimString + ": 'wrap'\n");
                } else if (dim == -1) {
                    this.f2423a.write(f2422o + dimString + ": 'parent'\n");
                } else {
                    this.f2423a.write(f2422o + dimString + ": " + dim + ",\n");
                }
            } else if (dimMax == -1 && dimMin == -1) {
                if (dimDefault == 1) {
                    this.f2423a.write(f2422o + dimString + ": '???????????',\n");
                } else if (dimDefault != 2) {
                } else {
                    this.f2423a.write(f2422o + dimString + ": '" + dimPercent + "%',\n");
                }
            } else if (dimDefault == 0) {
                this.f2423a.write(f2422o + dimString + ": {'spread' ," + dimMin + ", " + dimMax + "}\n");
            } else if (dimDefault == 1) {
                this.f2423a.write(f2422o + dimString + ": {'wrap' ," + dimMin + ", " + dimMax + "}\n");
            } else if (dimDefault != 2) {
            } else {
                this.f2423a.write(f2422o + dimString + ": {'" + dimPercent + "'% ," + dimMin + ", " + dimMax + "}\n");
            }
        }

        public final void f(int orientation, int guideBegin, int guideEnd, float guidePercent) {
        }

        public void g() throws IOException {
            this.f2423a.write("\n'ConstraintSet':{\n");
            for (Integer num : e.this.f2262g.keySet()) {
                a aVar = (a) e.this.f2262g.get(num);
                String a7 = a(num.intValue());
                this.f2423a.write(a7 + ":{\n");
                b bVar = aVar.f2267e;
                e("height", bVar.f2330e, bVar.f2323a0, bVar.f2335g0, bVar.f2331e0, bVar.f2327c0, bVar.f2351o0);
                e("width", bVar.f2328d, bVar.Z, bVar.f2333f0, bVar.f2329d0, bVar.f2325b0, bVar.f2349n0);
                d("'left'", bVar.f2340j, "'left'", bVar.H, bVar.O);
                d("'left'", bVar.f2342k, "'right'", bVar.H, bVar.O);
                d("'right'", bVar.f2344l, "'left'", bVar.I, bVar.Q);
                d("'right'", bVar.f2346m, "'right'", bVar.I, bVar.Q);
                d("'baseline'", bVar.f2356r, "'baseline'", -1, bVar.U);
                d("'baseline'", bVar.f2357s, "'top'", -1, bVar.U);
                d("'baseline'", bVar.f2358t, "'bottom'", -1, bVar.U);
                d("'top'", bVar.f2350o, "'bottom'", bVar.J, bVar.P);
                d("'top'", bVar.f2348n, "'top'", bVar.J, bVar.P);
                d("'bottom'", bVar.f2354q, "'bottom'", bVar.K, bVar.R);
                d("'bottom'", bVar.f2352p, "'top'", bVar.K, bVar.R);
                d("'start'", bVar.f2360v, "'start'", bVar.M, bVar.T);
                d("'start'", bVar.f2359u, "'end'", bVar.M, bVar.T);
                d("'end'", bVar.f2361w, "'start'", bVar.L, bVar.S);
                d("'end'", bVar.f2362x, "'end'", bVar.L, bVar.S);
                i("'horizontalBias'", bVar.f2363y, 0.5f);
                i("'verticalBias'", bVar.f2364z, 0.5f);
                c(bVar.B, bVar.D, bVar.C);
                f(bVar.G, bVar.f2332f, bVar.f2334g, bVar.f2336h);
                k("'dimensionRatio'", bVar.A);
                j("'barrierMargin'", bVar.f2339i0);
                j("'type'", bVar.f2341j0);
                k("'ReferenceId'", bVar.f2345l0);
                m("'mBarrierAllowsGoneWidgets'", bVar.f2353p0, true);
                j("'WrapBehavior'", bVar.f2355q0);
                h("'verticalWeight'", bVar.V);
                h("'horizontalWeight'", bVar.W);
                j("'horizontalChainStyle'", bVar.X);
                j("'verticalChainStyle'", bVar.Y);
                j("'barrierDirection'", bVar.f2337h0);
                int[] iArr = bVar.f2343k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f2423a.write("}\n");
            }
            this.f2423a.write("}\n");
        }

        public void h(String name, float value) throws IOException {
            if (value == -1.0f) {
                return;
            }
            this.f2423a.write(f2422o + name);
            this.f2423a.write(": " + value);
            this.f2423a.write(",\n");
        }

        public void i(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            this.f2423a.write(f2422o + name);
            this.f2423a.write(": " + value);
            this.f2423a.write(",\n");
        }

        public void j(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.f2423a.write(f2422o + name);
            this.f2423a.write(":");
            this.f2423a.write(", " + value);
            this.f2423a.write("\n");
        }

        public void k(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            this.f2423a.write(f2422o + name);
            this.f2423a.write(":");
            this.f2423a.write(", " + value);
            this.f2423a.write("\n");
        }

        public void l(String name, boolean value) throws IOException {
            if (value) {
                this.f2423a.write(f2422o + name);
                this.f2423a.write(": " + value);
                this.f2423a.write(",\n");
            }
        }

        public void m(String name, boolean value, boolean def) throws IOException {
            if (value == def) {
                return;
            }
            this.f2423a.write(f2422o + name);
            this.f2423a.write(": " + value);
            this.f2423a.write(",\n");
        }

        public void n(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            this.f2423a.write(f2422o + name);
            this.f2423a.write(": ");
            int i7 = 0;
            while (i7 < value.length) {
                Writer writer = this.f2423a;
                StringBuilder sb = new StringBuilder();
                sb.append(i7 == 0 ? "[" : ", ");
                sb.append(a(value[i7]));
                writer.write(sb.toString());
                i7++;
            }
            this.f2423a.write("],\n");
        }
    }

    /* loaded from: classes.dex */
    public class g {

        /* renamed from: o  reason: collision with root package name */
        public static final String f2437o = "\n       ";

        /* renamed from: a  reason: collision with root package name */
        public Writer f2438a;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintLayout f2439b;

        /* renamed from: c  reason: collision with root package name */
        public Context f2440c;

        /* renamed from: d  reason: collision with root package name */
        public int f2441d;

        /* renamed from: e  reason: collision with root package name */
        public int f2442e = 0;

        /* renamed from: f  reason: collision with root package name */
        public final String f2443f = "'left'";

        /* renamed from: g  reason: collision with root package name */
        public final String f2444g = "'right'";

        /* renamed from: h  reason: collision with root package name */
        public final String f2445h = "'baseline'";

        /* renamed from: i  reason: collision with root package name */
        public final String f2446i = "'bottom'";

        /* renamed from: j  reason: collision with root package name */
        public final String f2447j = "'top'";

        /* renamed from: k  reason: collision with root package name */
        public final String f2448k = "'start'";

        /* renamed from: l  reason: collision with root package name */
        public final String f2449l = "'end'";

        /* renamed from: m  reason: collision with root package name */
        public HashMap<Integer, String> f2450m = new HashMap<>();

        public g(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.f2438a = writer;
            this.f2439b = layout;
            this.f2440c = layout.getContext();
            this.f2441d = flags;
        }

        public String a(int id) {
            if (this.f2450m.containsKey(Integer.valueOf(id))) {
                return "@+id/" + this.f2450m.get(Integer.valueOf(id)) + "";
            } else if (id == 0) {
                return e.V1;
            } else {
                String b7 = b(id);
                this.f2450m.put(Integer.valueOf(id), b7);
                return "@+id/" + b7 + "";
            }
        }

        public String b(int id) {
            try {
                if (id != -1) {
                    return this.f2440c.getResources().getResourceEntryName(id);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(z0.m.f19022b);
                int i7 = this.f2442e + 1;
                this.f2442e = i7;
                sb.append(i7);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z0.m.f19022b);
                int i8 = this.f2442e + 1;
                this.f2442e = i8;
                sb2.append(i8);
                return sb2.toString();
            }
        }

        public final void c(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                if (dim == -2) {
                    this.f2438a.write(f2437o + dimString + "=\"wrap_content\"");
                } else if (dim == -1) {
                    this.f2438a.write(f2437o + dimString + "=\"match_parent\"");
                } else {
                    this.f2438a.write(f2437o + dimString + "=\"" + dim + "dp\"");
                }
            }
        }

        public final void d(String dimString, boolean val, boolean def) throws IOException {
            if (val != def) {
                this.f2438a.write(f2437o + dimString + "=\"" + val + "dp\"");
            }
        }

        public void e(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.f2438a.write("circle");
            this.f2438a.write(":[");
            this.f2438a.write(a(circleConstraint));
            this.f2438a.write(", " + circleAngle);
            this.f2438a.write(circleRadius + "]");
        }

        public void f(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f2438a.write(f2437o + my);
            this.f2438a.write(":[");
            this.f2438a.write(a(leftToLeft));
            this.f2438a.write(" , ");
            this.f2438a.write(other);
            if (margin != 0) {
                this.f2438a.write(" , " + margin);
            }
            this.f2438a.write("],\n");
        }

        public final void g(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                this.f2438a.write(f2437o + dimString + "=\"" + dim + "dp\"");
            }
        }

        public final void h(String dimString, int val, String[] types, int def) throws IOException {
            if (val != def) {
                this.f2438a.write(f2437o + dimString + "=\"" + types[val] + "\"");
            }
        }

        public void i() throws IOException {
            this.f2438a.write("\n<ConstraintSet>\n");
            for (Integer num : e.this.f2262g.keySet()) {
                a aVar = (a) e.this.f2262g.get(num);
                String a7 = a(num.intValue());
                this.f2438a.write("  <Constraint");
                this.f2438a.write("\n       android:id=\"" + a7 + "\"");
                b bVar = aVar.f2267e;
                c("android:layout_width", bVar.f2328d, -5);
                c("android:layout_height", bVar.f2330e, -5);
                j("app:layout_constraintGuide_begin", (float) bVar.f2332f, -1.0f);
                j("app:layout_constraintGuide_end", bVar.f2334g, -1.0f);
                j("app:layout_constraintGuide_percent", bVar.f2336h, -1.0f);
                j("app:layout_constraintHorizontal_bias", bVar.f2363y, 0.5f);
                j("app:layout_constraintVertical_bias", bVar.f2364z, 0.5f);
                m("app:layout_constraintDimensionRatio", bVar.A, null);
                o("app:layout_constraintCircle", bVar.B);
                j("app:layout_constraintCircleRadius", bVar.C, 0.0f);
                j("app:layout_constraintCircleAngle", bVar.D, 0.0f);
                j("android:orientation", bVar.G, -1.0f);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                j("app:layout_constraintHorizontal_chainStyle", bVar.X, 0.0f);
                j("app:layout_constraintVertical_chainStyle", bVar.Y, 0.0f);
                j("app:barrierDirection", bVar.f2337h0, -1.0f);
                j("app:barrierMargin", bVar.f2339i0, 0.0f);
                g("app:layout_marginLeft", bVar.H, 0);
                g("app:layout_goneMarginLeft", bVar.O, Integer.MIN_VALUE);
                g("app:layout_marginRight", bVar.I, 0);
                g("app:layout_goneMarginRight", bVar.Q, Integer.MIN_VALUE);
                g("app:layout_marginStart", bVar.M, 0);
                g("app:layout_goneMarginStart", bVar.T, Integer.MIN_VALUE);
                g("app:layout_marginEnd", bVar.L, 0);
                g("app:layout_goneMarginEnd", bVar.S, Integer.MIN_VALUE);
                g("app:layout_marginTop", bVar.J, 0);
                g("app:layout_goneMarginTop", bVar.P, Integer.MIN_VALUE);
                g("app:layout_marginBottom", bVar.K, 0);
                g("app:layout_goneMarginBottom", bVar.R, Integer.MIN_VALUE);
                g("app:goneBaselineMargin", bVar.U, Integer.MIN_VALUE);
                g("app:baselineMargin", bVar.N, 0);
                d("app:layout_constrainedWidth", bVar.f2349n0, false);
                d("app:layout_constrainedHeight", bVar.f2351o0, false);
                d("app:barrierAllowsGoneWidgets", bVar.f2353p0, true);
                j("app:layout_wrapBehaviorInParent", bVar.f2355q0, 0.0f);
                o("app:baselineToBaseline", bVar.f2356r);
                o("app:baselineToBottom", bVar.f2358t);
                o("app:baselineToTop", bVar.f2357s);
                o("app:layout_constraintBottom_toBottomOf", bVar.f2354q);
                o("app:layout_constraintBottom_toTopOf", bVar.f2352p);
                o("app:layout_constraintEnd_toEndOf", bVar.f2362x);
                o("app:layout_constraintEnd_toStartOf", bVar.f2361w);
                o("app:layout_constraintLeft_toLeftOf", bVar.f2340j);
                o("app:layout_constraintLeft_toRightOf", bVar.f2342k);
                o("app:layout_constraintRight_toLeftOf", bVar.f2344l);
                o("app:layout_constraintRight_toRightOf", bVar.f2346m);
                o("app:layout_constraintStart_toEndOf", bVar.f2359u);
                o("app:layout_constraintStart_toStartOf", bVar.f2360v);
                o("app:layout_constraintTop_toBottomOf", bVar.f2350o);
                o("app:layout_constraintTop_toTopOf", bVar.f2348n);
                String[] strArr = {"spread", "wrap", "percent"};
                h("app:layout_constraintHeight_default", bVar.f2323a0, strArr, 0);
                j("app:layout_constraintHeight_percent", bVar.f2335g0, 1.0f);
                g("app:layout_constraintHeight_min", bVar.f2331e0, 0);
                g("app:layout_constraintHeight_max", bVar.f2327c0, 0);
                d("android:layout_constrainedHeight", bVar.f2351o0, false);
                h("app:layout_constraintWidth_default", bVar.Z, strArr, 0);
                j("app:layout_constraintWidth_percent", bVar.f2333f0, 1.0f);
                g("app:layout_constraintWidth_min", bVar.f2329d0, 0);
                g("app:layout_constraintWidth_max", bVar.f2325b0, 0);
                d("android:layout_constrainedWidth", bVar.f2349n0, false);
                j("app:layout_constraintVertical_weight", bVar.V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.W, -1.0f);
                k("app:layout_constraintHorizontal_chainStyle", bVar.X);
                k("app:layout_constraintVertical_chainStyle", bVar.Y);
                h("app:barrierDirection", bVar.f2337h0, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                m("app:layout_constraintTag", bVar.f2347m0, null);
                int[] iArr = bVar.f2343k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f2438a.write(" />\n");
            }
            this.f2438a.write("</ConstraintSet>\n");
        }

        public void j(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            this.f2438a.write(f2437o + name);
            this.f2438a.write("=\"" + value + "\"");
        }

        public void k(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.f2438a.write(f2437o + name + "=\"" + value + "\"\n");
        }

        public void l(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            this.f2438a.write(name);
            this.f2438a.write(":");
            this.f2438a.write(", " + value);
            this.f2438a.write("\n");
        }

        public void m(String name, String value, String def) throws IOException {
            if (value == null || value.equals(def)) {
                return;
            }
            this.f2438a.write(f2437o + name);
            this.f2438a.write("=\"" + value + "\"");
        }

        public void n(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            this.f2438a.write(f2437o + name);
            this.f2438a.write(":");
            int i7 = 0;
            while (i7 < value.length) {
                Writer writer = this.f2438a;
                StringBuilder sb = new StringBuilder();
                sb.append(i7 == 0 ? "[" : ", ");
                sb.append(a(value[i7]));
                writer.write(sb.toString());
                i7++;
            }
            this.f2438a.write("],\n");
        }

        public void o(String str, int leftToLeft) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f2438a.write(f2437o + str);
            this.f2438a.write("=\"" + a(leftToLeft) + "\"");
        }
    }

    static {
        W.append(k.m.H5, 25);
        W.append(k.m.I5, 26);
        W.append(k.m.K5, 29);
        W.append(k.m.L5, 30);
        W.append(k.m.R5, 36);
        W.append(k.m.Q5, 35);
        W.append(k.m.f3351o5, 4);
        W.append(k.m.f3343n5, 3);
        W.append(k.m.f3311j5, 1);
        W.append(k.m.f3327l5, 91);
        W.append(k.m.f3319k5, 92);
        W.append(k.m.f3240a6, 6);
        W.append(k.m.f3248b6, 7);
        W.append(k.m.f3400v5, 17);
        W.append(k.m.f3407w5, 18);
        W.append(k.m.f3414x5, 19);
        W.append(k.m.f3279f5, 99);
        W.append(k.m.f3262d4, 27);
        W.append(k.m.M5, 32);
        W.append(k.m.N5, 33);
        W.append(k.m.f3393u5, 10);
        W.append(k.m.f3386t5, 9);
        W.append(k.m.f3280f6, 13);
        W.append(k.m.f3304i6, 16);
        W.append(k.m.f3288g6, 14);
        W.append(k.m.f3264d6, 11);
        W.append(k.m.f3296h6, 15);
        W.append(k.m.f3272e6, 12);
        W.append(k.m.U5, 40);
        W.append(k.m.F5, 39);
        W.append(k.m.E5, 41);
        W.append(k.m.T5, 42);
        W.append(k.m.D5, 20);
        W.append(k.m.S5, 37);
        W.append(k.m.f3379s5, 5);
        W.append(k.m.G5, 87);
        W.append(k.m.P5, 87);
        W.append(k.m.J5, 87);
        W.append(k.m.f3335m5, 87);
        W.append(k.m.f3303i5, 87);
        W.append(k.m.f3302i4, 24);
        W.append(k.m.f3318k4, 28);
        W.append(k.m.A4, 31);
        W.append(k.m.B4, 8);
        W.append(k.m.f3310j4, 34);
        W.append(k.m.f3326l4, 2);
        W.append(k.m.f3286g4, 23);
        W.append(k.m.f3294h4, 21);
        W.append(k.m.V5, 95);
        W.append(k.m.f3421y5, 96);
        W.append(k.m.f3278f4, 22);
        W.append(k.m.f3364q4, 43);
        W.append(k.m.D4, 44);
        W.append(k.m.f3420y4, 45);
        W.append(k.m.f3427z4, 46);
        W.append(k.m.f3413x4, 60);
        W.append(k.m.f3399v4, 47);
        W.append(k.m.f3406w4, 48);
        W.append(k.m.f3371r4, 49);
        W.append(k.m.f3378s4, 50);
        W.append(k.m.f3385t4, 51);
        W.append(k.m.f3392u4, 52);
        W.append(k.m.C4, 53);
        W.append(k.m.W5, 54);
        W.append(k.m.f3428z5, 55);
        W.append(k.m.X5, 56);
        W.append(k.m.A5, 57);
        W.append(k.m.Y5, 58);
        W.append(k.m.B5, 59);
        W.append(k.m.f3358p5, 61);
        W.append(k.m.f3372r5, 62);
        W.append(k.m.f3365q5, 63);
        W.append(k.m.F4, 64);
        W.append(k.m.u6, 65);
        W.append(k.m.M4, 66);
        W.append(k.m.v6, 67);
        W.append(k.m.f3336m6, 79);
        W.append(k.m.f3270e4, 38);
        W.append(k.m.f3328l6, 68);
        W.append(k.m.Z5, 69);
        W.append(k.m.C5, 70);
        W.append(k.m.f3320k6, 97);
        W.append(k.m.J4, 71);
        W.append(k.m.H4, 72);
        W.append(k.m.I4, 73);
        W.append(k.m.K4, 74);
        W.append(k.m.G4, 75);
        W.append(k.m.f3344n6, 76);
        W.append(k.m.O5, 77);
        W.append(k.m.w6, 78);
        W.append(k.m.f3295h5, 80);
        W.append(k.m.f3287g5, 81);
        W.append(k.m.p6, 82);
        W.append(k.m.t6, 83);
        W.append(k.m.s6, 84);
        W.append(k.m.r6, 85);
        W.append(k.m.q6, 86);
        X.append(k.m.za, 6);
        X.append(k.m.za, 7);
        X.append(k.m.S8, 27);
        X.append(k.m.Da, 13);
        X.append(k.m.Ga, 16);
        X.append(k.m.Ea, 14);
        X.append(k.m.Ba, 11);
        X.append(k.m.Fa, 15);
        X.append(k.m.Ca, 12);
        X.append(k.m.sa, 40);
        X.append(k.m.la, 39);
        X.append(k.m.ka, 41);
        X.append(k.m.ra, 42);
        X.append(k.m.ja, 20);
        X.append(k.m.qa, 37);
        X.append(k.m.aa, 5);
        X.append(k.m.ma, 87);
        X.append(k.m.pa, 87);
        X.append(k.m.na, 87);
        X.append(k.m.X9, 87);
        X.append(k.m.W9, 87);
        X.append(k.m.X8, 24);
        X.append(k.m.Z8, 28);
        X.append(k.m.p9, 31);
        X.append(k.m.q9, 8);
        X.append(k.m.Y8, 34);
        X.append(k.m.a9, 2);
        X.append(k.m.V8, 23);
        X.append(k.m.W8, 21);
        X.append(k.m.ta, 95);
        X.append(k.m.ea, 96);
        X.append(k.m.U8, 22);
        X.append(k.m.f9, 43);
        X.append(k.m.s9, 44);
        X.append(k.m.n9, 45);
        X.append(k.m.o9, 46);
        X.append(k.m.m9, 60);
        X.append(k.m.k9, 47);
        X.append(k.m.l9, 48);
        X.append(k.m.g9, 49);
        X.append(k.m.h9, 50);
        X.append(k.m.i9, 51);
        X.append(k.m.j9, 52);
        X.append(k.m.r9, 53);
        X.append(k.m.ua, 54);
        X.append(k.m.fa, 55);
        X.append(k.m.va, 56);
        X.append(k.m.ga, 57);
        X.append(k.m.wa, 58);
        X.append(k.m.ha, 59);
        X.append(k.m.Z9, 62);
        X.append(k.m.Y9, 63);
        X.append(k.m.u9, 64);
        X.append(k.m.Ta, 65);
        X.append(k.m.A9, 66);
        X.append(k.m.Ua, 67);
        X.append(k.m.Ka, 79);
        X.append(k.m.T8, 38);
        X.append(k.m.La, 98);
        X.append(k.m.Ja, 68);
        X.append(k.m.xa, 69);
        X.append(k.m.ia, 70);
        X.append(k.m.y9, 71);
        X.append(k.m.w9, 72);
        X.append(k.m.x9, 73);
        X.append(k.m.z9, 74);
        X.append(k.m.v9, 75);
        X.append(k.m.Ma, 76);
        X.append(k.m.oa, 77);
        X.append(k.m.Va, 78);
        X.append(k.m.V9, 80);
        X.append(k.m.U9, 81);
        X.append(k.m.Oa, 82);
        X.append(k.m.Sa, 83);
        X.append(k.m.Ra, 84);
        X.append(k.m.Qa, 85);
        X.append(k.m.Pa, 86);
        X.append(k.m.Ia, 97);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L6f
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L26
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L22
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r0) goto L2a
            r6 = -1
            if (r5 == r6) goto L2a
        L20:
            r5 = r2
            goto L2d
        L22:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2d
        L26:
            int r5 = r5.getDimensionPixelSize(r6, r2)
        L2a:
            r3 = r2
            r2 = r5
            r5 = r3
        L2d:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L3f
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3a
            r4.width = r2
            r4.f2031a0 = r5
            goto L6e
        L3a:
            r4.height = r2
            r4.f2033b0 = r5
            goto L6e
        L3f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.b
            if (r6 == 0) goto L51
            androidx.constraintlayout.widget.e$b r4 = (androidx.constraintlayout.widget.e.b) r4
            if (r7 != 0) goto L4c
            r4.f2328d = r2
            r4.f2349n0 = r5
            goto L6e
        L4c:
            r4.f2330e = r2
            r4.f2351o0 = r5
            goto L6e
        L51:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.a.C0031a
            if (r6 == 0) goto L6e
            androidx.constraintlayout.widget.e$a$a r4 = (androidx.constraintlayout.widget.e.a.C0031a) r4
            if (r7 != 0) goto L64
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L6e
        L64:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L6e:
            return
        L6f:
            java.lang.String r5 = r5.getString(r6)
            B0(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.A0(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void B0(Object data, String value, int orientation) {
        if (value == null) {
            return;
        }
        int indexOf = value.indexOf(61);
        int length = value.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = value.substring(0, indexOf);
        String substring2 = value.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if (U1.equalsIgnoreCase(trim)) {
                if (data instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) data;
                    if (orientation == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    C0(bVar, trim2);
                    return;
                } else if (data instanceof b) {
                    ((b) data).A = trim2;
                    return;
                } else if (data instanceof a.C0031a) {
                    ((a.C0031a) data).c(5, trim2);
                    return;
                } else {
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (data instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = parseFloat;
                        }
                    } else if (data instanceof b) {
                        b bVar3 = (b) data;
                        if (orientation == 0) {
                            bVar3.f2328d = 0;
                            bVar3.W = parseFloat;
                        } else {
                            bVar3.f2330e = 0;
                            bVar3.V = parseFloat;
                        }
                    } else if (data instanceof a.C0031a) {
                        a.C0031a c0031a = (a.C0031a) data;
                        if (orientation == 0) {
                            c0031a.b(23, 0);
                            c0031a.a(39, parseFloat);
                        } else {
                            c0031a.b(21, 0);
                            c0031a.a(40, parseFloat);
                        }
                    }
                } else if (!V1.equalsIgnoreCase(trim)) {
                } else {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (data instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = max;
                            bVar4.P = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                        }
                    } else if (data instanceof b) {
                        b bVar5 = (b) data;
                        if (orientation == 0) {
                            bVar5.f2328d = 0;
                            bVar5.f2333f0 = max;
                            bVar5.Z = 2;
                        } else {
                            bVar5.f2330e = 0;
                            bVar5.f2335g0 = max;
                            bVar5.f2323a0 = 2;
                        }
                    } else if (data instanceof a.C0031a) {
                        a.C0031a c0031a2 = (a.C0031a) data;
                        if (orientation == 0) {
                            c0031a2.b(23, 0);
                            c0031a2.b(54, 2);
                        } else {
                            c0031a2.b(21, 0);
                            c0031a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void C0(ConstraintLayout.b params, String value) {
        float f7 = Float.NaN;
        int i7 = -1;
        if (value != null) {
            int length = value.length();
            int indexOf = value.indexOf(44);
            int i8 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = value.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i7 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i7 = 1;
                }
                i8 = indexOf + 1;
            }
            int indexOf2 = value.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = value.substring(i8);
                    if (substring2.length() > 0) {
                        f7 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = value.substring(i8, indexOf2);
                    String substring4 = value.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f7 = i7 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        params.I = value;
        params.J = f7;
        params.K = i7;
    }

    public static String[] G1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        boolean z6 = false;
        for (int i8 = 0; i8 < charArray.length; i8++) {
            char c7 = charArray[i8];
            if (c7 == ',' && !z6) {
                arrayList.add(new String(charArray, i7, i8 - i7));
                i7 = i8 + 1;
            } else if (c7 == '\"') {
                z6 = !z6;
            }
        }
        arrayList.add(new String(charArray, i7, charArray.length - i7));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void H0(Context ctx, a c7, TypedArray a7) {
        int indexCount = a7.getIndexCount();
        a.C0031a c0031a = new a.C0031a();
        c7.f2270h = c0031a;
        c7.f2266d.f2377a = false;
        c7.f2267e.f2324b = false;
        c7.f2265c.f2391a = false;
        c7.f2268f.f2408a = false;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = a7.getIndex(i7);
            switch (X.get(index)) {
                case 2:
                    c0031a.b(2, a7.getDimensionPixelSize(index, c7.f2267e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case L1 /* 92 */:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + W.get(index));
                    break;
                case 5:
                    c0031a.c(5, a7.getString(index));
                    break;
                case 6:
                    c0031a.b(6, a7.getDimensionPixelOffset(index, c7.f2267e.E));
                    break;
                case 7:
                    c0031a.b(7, a7.getDimensionPixelOffset(index, c7.f2267e.F));
                    break;
                case 8:
                    c0031a.b(8, a7.getDimensionPixelSize(index, c7.f2267e.L));
                    break;
                case 11:
                    c0031a.b(11, a7.getDimensionPixelSize(index, c7.f2267e.R));
                    break;
                case 12:
                    c0031a.b(12, a7.getDimensionPixelSize(index, c7.f2267e.S));
                    break;
                case 13:
                    c0031a.b(13, a7.getDimensionPixelSize(index, c7.f2267e.O));
                    break;
                case 14:
                    c0031a.b(14, a7.getDimensionPixelSize(index, c7.f2267e.Q));
                    break;
                case 15:
                    c0031a.b(15, a7.getDimensionPixelSize(index, c7.f2267e.T));
                    break;
                case 16:
                    c0031a.b(16, a7.getDimensionPixelSize(index, c7.f2267e.P));
                    break;
                case 17:
                    c0031a.b(17, a7.getDimensionPixelOffset(index, c7.f2267e.f2332f));
                    break;
                case 18:
                    c0031a.b(18, a7.getDimensionPixelOffset(index, c7.f2267e.f2334g));
                    break;
                case 19:
                    c0031a.a(19, a7.getFloat(index, c7.f2267e.f2336h));
                    break;
                case 20:
                    c0031a.a(20, a7.getFloat(index, c7.f2267e.f2363y));
                    break;
                case 21:
                    c0031a.b(21, a7.getLayoutDimension(index, c7.f2267e.f2330e));
                    break;
                case 22:
                    c0031a.b(22, U[a7.getInt(index, c7.f2265c.f2392b)]);
                    break;
                case 23:
                    c0031a.b(23, a7.getLayoutDimension(index, c7.f2267e.f2328d));
                    break;
                case 24:
                    c0031a.b(24, a7.getDimensionPixelSize(index, c7.f2267e.H));
                    break;
                case 27:
                    c0031a.b(27, a7.getInt(index, c7.f2267e.G));
                    break;
                case 28:
                    c0031a.b(28, a7.getDimensionPixelSize(index, c7.f2267e.I));
                    break;
                case 31:
                    c0031a.b(31, a7.getDimensionPixelSize(index, c7.f2267e.M));
                    break;
                case 34:
                    c0031a.b(34, a7.getDimensionPixelSize(index, c7.f2267e.J));
                    break;
                case 37:
                    c0031a.a(37, a7.getFloat(index, c7.f2267e.f2364z));
                    break;
                case 38:
                    int resourceId = a7.getResourceId(index, c7.f2263a);
                    c7.f2263a = resourceId;
                    c0031a.b(38, resourceId);
                    break;
                case 39:
                    c0031a.a(39, a7.getFloat(index, c7.f2267e.W));
                    break;
                case 40:
                    c0031a.a(40, a7.getFloat(index, c7.f2267e.V));
                    break;
                case 41:
                    c0031a.b(41, a7.getInt(index, c7.f2267e.X));
                    break;
                case 42:
                    c0031a.b(42, a7.getInt(index, c7.f2267e.Y));
                    break;
                case 43:
                    c0031a.a(43, a7.getFloat(index, c7.f2265c.f2394d));
                    break;
                case 44:
                    c0031a.d(44, true);
                    c0031a.a(44, a7.getDimension(index, c7.f2268f.f2421n));
                    break;
                case 45:
                    c0031a.a(45, a7.getFloat(index, c7.f2268f.f2410c));
                    break;
                case 46:
                    c0031a.a(46, a7.getFloat(index, c7.f2268f.f2411d));
                    break;
                case 47:
                    c0031a.a(47, a7.getFloat(index, c7.f2268f.f2412e));
                    break;
                case 48:
                    c0031a.a(48, a7.getFloat(index, c7.f2268f.f2413f));
                    break;
                case 49:
                    c0031a.a(49, a7.getDimension(index, c7.f2268f.f2414g));
                    break;
                case 50:
                    c0031a.a(50, a7.getDimension(index, c7.f2268f.f2415h));
                    break;
                case 51:
                    c0031a.a(51, a7.getDimension(index, c7.f2268f.f2417j));
                    break;
                case 52:
                    c0031a.a(52, a7.getDimension(index, c7.f2268f.f2418k));
                    break;
                case 53:
                    c0031a.a(53, a7.getDimension(index, c7.f2268f.f2419l));
                    break;
                case 54:
                    c0031a.b(54, a7.getInt(index, c7.f2267e.Z));
                    break;
                case 55:
                    c0031a.b(55, a7.getInt(index, c7.f2267e.f2323a0));
                    break;
                case 56:
                    c0031a.b(56, a7.getDimensionPixelSize(index, c7.f2267e.f2325b0));
                    break;
                case f2190c1 /* 57 */:
                    c0031a.b(57, a7.getDimensionPixelSize(index, c7.f2267e.f2327c0));
                    break;
                case f2192d1 /* 58 */:
                    c0031a.b(58, a7.getDimensionPixelSize(index, c7.f2267e.f2329d0));
                    break;
                case f2194e1 /* 59 */:
                    c0031a.b(59, a7.getDimensionPixelSize(index, c7.f2267e.f2331e0));
                    break;
                case 60:
                    c0031a.a(60, a7.getFloat(index, c7.f2268f.f2409b));
                    break;
                case 62:
                    c0031a.b(62, a7.getDimensionPixelSize(index, c7.f2267e.C));
                    break;
                case 63:
                    c0031a.a(63, a7.getFloat(index, c7.f2267e.D));
                    break;
                case 64:
                    c0031a.b(64, y0(a7, index, c7.f2266d.f2378b));
                    break;
                case 65:
                    if (a7.peekValue(index).type == 3) {
                        c0031a.c(65, a7.getString(index));
                        break;
                    } else {
                        c0031a.c(65, u.d.f16910o[a7.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0031a.b(66, a7.getInt(index, 0));
                    break;
                case 67:
                    c0031a.a(67, a7.getFloat(index, c7.f2266d.f2385i));
                    break;
                case f2219n1 /* 68 */:
                    c0031a.a(68, a7.getFloat(index, c7.f2265c.f2395e));
                    break;
                case 69:
                    c0031a.a(69, a7.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0031a.a(70, a7.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0031a.b(72, a7.getInt(index, c7.f2267e.f2337h0));
                    break;
                case 73:
                    c0031a.b(73, a7.getDimensionPixelSize(index, c7.f2267e.f2339i0));
                    break;
                case 74:
                    c0031a.c(74, a7.getString(index));
                    break;
                case 75:
                    c0031a.d(75, a7.getBoolean(index, c7.f2267e.f2353p0));
                    break;
                case 76:
                    c0031a.b(76, a7.getInt(index, c7.f2266d.f2381e));
                    break;
                case 77:
                    c0031a.c(77, a7.getString(index));
                    break;
                case 78:
                    c0031a.b(78, a7.getInt(index, c7.f2265c.f2393c));
                    break;
                case 79:
                    c0031a.a(79, a7.getFloat(index, c7.f2266d.f2383g));
                    break;
                case 80:
                    c0031a.d(80, a7.getBoolean(index, c7.f2267e.f2349n0));
                    break;
                case 81:
                    c0031a.d(81, a7.getBoolean(index, c7.f2267e.f2351o0));
                    break;
                case 82:
                    c0031a.b(82, a7.getInteger(index, c7.f2266d.f2379c));
                    break;
                case 83:
                    c0031a.b(83, y0(a7, index, c7.f2268f.f2416i));
                    break;
                case 84:
                    c0031a.b(84, a7.getInteger(index, c7.f2266d.f2387k));
                    break;
                case 85:
                    c0031a.a(85, a7.getFloat(index, c7.f2266d.f2386j));
                    break;
                case 86:
                    int i8 = a7.peekValue(index).type;
                    if (i8 == 1) {
                        c7.f2266d.f2390n = a7.getResourceId(index, -1);
                        c0031a.b(89, c7.f2266d.f2390n);
                        c cVar = c7.f2266d;
                        if (cVar.f2390n != -1) {
                            cVar.f2389m = -2;
                            c0031a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i8 == 3) {
                        c7.f2266d.f2388l = a7.getString(index);
                        c0031a.c(90, c7.f2266d.f2388l);
                        if (c7.f2266d.f2388l.indexOf("/") > 0) {
                            c7.f2266d.f2390n = a7.getResourceId(index, -1);
                            c0031a.b(89, c7.f2266d.f2390n);
                            c7.f2266d.f2389m = -2;
                            c0031a.b(88, -2);
                            break;
                        } else {
                            c7.f2266d.f2389m = -1;
                            c0031a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = c7.f2266d;
                        cVar2.f2389m = a7.getInteger(index, cVar2.f2390n);
                        c0031a.b(88, c7.f2266d.f2389m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + W.get(index));
                    break;
                case M1 /* 93 */:
                    c0031a.b(93, a7.getDimensionPixelSize(index, c7.f2267e.N));
                    break;
                case N1 /* 94 */:
                    c0031a.b(94, a7.getDimensionPixelSize(index, c7.f2267e.U));
                    break;
                case O1 /* 95 */:
                    A0(c0031a, a7, index, 0);
                    break;
                case 96:
                    A0(c0031a, a7, index, 1);
                    break;
                case Q1 /* 97 */:
                    c0031a.b(97, a7.getInt(index, c7.f2267e.f2355q0));
                    break;
                case R1 /* 98 */:
                    if (s.P0) {
                        int resourceId2 = a7.getResourceId(index, c7.f2263a);
                        c7.f2263a = resourceId2;
                        if (resourceId2 == -1) {
                            c7.f2264b = a7.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (a7.peekValue(index).type == 3) {
                        c7.f2264b = a7.getString(index);
                        break;
                    } else {
                        c7.f2263a = a7.getResourceId(index, c7.f2263a);
                        break;
                    }
                case S1 /* 99 */:
                    c0031a.d(99, a7.getBoolean(index, c7.f2267e.f2338i));
                    break;
            }
        }
    }

    public static void R0(a c7, int type, float value) {
        if (type == 19) {
            c7.f2267e.f2336h = value;
        } else if (type == 20) {
            c7.f2267e.f2363y = value;
        } else if (type == 37) {
            c7.f2267e.f2364z = value;
        } else if (type == 60) {
            c7.f2268f.f2409b = value;
        } else if (type == 63) {
            c7.f2267e.D = value;
        } else if (type == 79) {
            c7.f2266d.f2383g = value;
        } else if (type == 85) {
            c7.f2266d.f2386j = value;
        } else if (type != 87) {
            if (type == 39) {
                c7.f2267e.W = value;
            } else if (type == 40) {
                c7.f2267e.V = value;
            } else {
                switch (type) {
                    case 43:
                        c7.f2265c.f2394d = value;
                        return;
                    case 44:
                        C0032e c0032e = c7.f2268f;
                        c0032e.f2421n = value;
                        c0032e.f2420m = true;
                        return;
                    case 45:
                        c7.f2268f.f2410c = value;
                        return;
                    case 46:
                        c7.f2268f.f2411d = value;
                        return;
                    case 47:
                        c7.f2268f.f2412e = value;
                        return;
                    case 48:
                        c7.f2268f.f2413f = value;
                        return;
                    case 49:
                        c7.f2268f.f2414g = value;
                        return;
                    case 50:
                        c7.f2268f.f2415h = value;
                        return;
                    case 51:
                        c7.f2268f.f2417j = value;
                        return;
                    case 52:
                        c7.f2268f.f2418k = value;
                        return;
                    case 53:
                        c7.f2268f.f2419l = value;
                        return;
                    default:
                        switch (type) {
                            case 67:
                                c7.f2266d.f2385i = value;
                                return;
                            case f2219n1 /* 68 */:
                                c7.f2265c.f2395e = value;
                                return;
                            case 69:
                                c7.f2267e.f2333f0 = value;
                                return;
                            case 70:
                                c7.f2267e.f2335g0 = value;
                                return;
                            default:
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                        }
                }
            }
        }
    }

    public static void S0(a c7, int type, int value) {
        if (type == 6) {
            c7.f2267e.E = value;
        } else if (type == 7) {
            c7.f2267e.F = value;
        } else if (type == 8) {
            c7.f2267e.L = value;
        } else if (type == 27) {
            c7.f2267e.G = value;
        } else if (type == 28) {
            c7.f2267e.I = value;
        } else if (type == 41) {
            c7.f2267e.X = value;
        } else if (type == 42) {
            c7.f2267e.Y = value;
        } else if (type == 61) {
            c7.f2267e.B = value;
        } else if (type == 62) {
            c7.f2267e.C = value;
        } else if (type == 72) {
            c7.f2267e.f2337h0 = value;
        } else if (type == 73) {
            c7.f2267e.f2339i0 = value;
        } else {
            switch (type) {
                case 2:
                    c7.f2267e.K = value;
                    return;
                case 11:
                    c7.f2267e.R = value;
                    return;
                case 12:
                    c7.f2267e.S = value;
                    return;
                case 13:
                    c7.f2267e.O = value;
                    return;
                case 14:
                    c7.f2267e.Q = value;
                    return;
                case 15:
                    c7.f2267e.T = value;
                    return;
                case 16:
                    c7.f2267e.P = value;
                    return;
                case 17:
                    c7.f2267e.f2332f = value;
                    return;
                case 18:
                    c7.f2267e.f2334g = value;
                    return;
                case 31:
                    c7.f2267e.M = value;
                    return;
                case 34:
                    c7.f2267e.J = value;
                    return;
                case 38:
                    c7.f2263a = value;
                    return;
                case 64:
                    c7.f2266d.f2378b = value;
                    return;
                case 66:
                    c7.f2266d.f2382f = value;
                    return;
                case 76:
                    c7.f2266d.f2381e = value;
                    return;
                case 78:
                    c7.f2265c.f2393c = value;
                    return;
                case M1 /* 93 */:
                    c7.f2267e.N = value;
                    return;
                case N1 /* 94 */:
                    c7.f2267e.U = value;
                    return;
                case Q1 /* 97 */:
                    c7.f2267e.f2355q0 = value;
                    return;
                default:
                    switch (type) {
                        case 21:
                            c7.f2267e.f2330e = value;
                            return;
                        case 22:
                            c7.f2265c.f2392b = value;
                            return;
                        case 23:
                            c7.f2267e.f2328d = value;
                            return;
                        case 24:
                            c7.f2267e.H = value;
                            return;
                        default:
                            switch (type) {
                                case 54:
                                    c7.f2267e.Z = value;
                                    return;
                                case 55:
                                    c7.f2267e.f2323a0 = value;
                                    return;
                                case 56:
                                    c7.f2267e.f2325b0 = value;
                                    return;
                                case f2190c1 /* 57 */:
                                    c7.f2267e.f2327c0 = value;
                                    return;
                                case f2192d1 /* 58 */:
                                    c7.f2267e.f2329d0 = value;
                                    return;
                                case f2194e1 /* 59 */:
                                    c7.f2267e.f2331e0 = value;
                                    return;
                                default:
                                    switch (type) {
                                        case 82:
                                            c7.f2266d.f2379c = value;
                                            return;
                                        case 83:
                                            c7.f2268f.f2416i = value;
                                            return;
                                        case 84:
                                            c7.f2266d.f2387k = value;
                                            return;
                                        default:
                                            switch (type) {
                                                case 87:
                                                    return;
                                                case 88:
                                                    c7.f2266d.f2389m = value;
                                                    return;
                                                case 89:
                                                    c7.f2266d.f2390n = value;
                                                    return;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        }
    }

    public static void T0(a c7, int type, String value) {
        if (type == 5) {
            c7.f2267e.A = value;
        } else if (type == 65) {
            c7.f2266d.f2380d = value;
        } else if (type == 74) {
            b bVar = c7.f2267e;
            bVar.f2345l0 = value;
            bVar.f2343k0 = null;
        } else if (type == 77) {
            c7.f2267e.f2347m0 = value;
        } else if (type != 87) {
            if (type != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                c7.f2266d.f2388l = value;
            }
        }
    }

    public static void U0(a c7, int type, boolean value) {
        if (type == 44) {
            c7.f2268f.f2420m = value;
        } else if (type == 75) {
            c7.f2267e.f2353p0 = value;
        } else if (type != 87) {
            if (type == 80) {
                c7.f2267e.f2349n0 = value;
            } else if (type != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                c7.f2267e.f2351o0 = value;
            }
        }
    }

    public static String m0(int v6) {
        for (Field field : e.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == v6) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e7) {
                    e7.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    public static String p0(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + c0.c.i(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    public static a w(Context context, XmlPullParser parser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(parser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, k.m.R8);
        H0(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int y0(TypedArray a7, int index, int def) {
        int resourceId = a7.getResourceId(index, def);
        return resourceId == -1 ? a7.getInt(index, -1) : resourceId;
    }

    public void A(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            x(viewId, toView, 7, 0, toView, 6, 0, 0.5f);
        }
    }

    public void A1(int viewId, float bias) {
        i0(viewId).f2267e.f2364z = bias;
    }

    public void B(int centerID, int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        L(centerID, 6, startId, startSide, startMargin);
        L(centerID, 7, endId, endSide, endMargin);
        a aVar = this.f2262g.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.f2267e.f2363y = bias;
        }
    }

    public void B1(int viewId, int chainStyle) {
        i0(viewId).f2267e.Y = chainStyle;
    }

    public void C(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            x(viewId, toView, 4, 0, toView, 3, 0, 0.5f);
        }
    }

    public void C1(int viewId, float weight) {
        i0(viewId).f2267e.V = weight;
    }

    public void D(int centerID, int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        L(centerID, 3, topId, topSide, topMargin);
        L(centerID, 4, bottomId, bottomSide, bottomMargin);
        a aVar = this.f2262g.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.f2267e.f2364z = bias;
        }
    }

    public void D0(a set, String attributes) {
        String[] split = attributes.split(",");
        for (int i7 = 0; i7 < split.length; i7++) {
            String[] split2 = split[i7].split("=");
            if (split2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + split[i7]);
            } else {
                set.q(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    public void D1(int viewId, int visibility) {
        i0(viewId).f2265c.f2392b = visibility;
    }

    public void E(int viewId) {
        this.f2262g.remove(Integer.valueOf(viewId));
    }

    public void E0(a set, String attributes) {
        String[] split = attributes.split(",");
        for (int i7 = 0; i7 < split.length; i7++) {
            String[] split2 = split[i7].split("=");
            if (split2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + split[i7]);
            } else {
                set.q(split2[0], Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void E1(int viewId, int visibilityMode) {
        i0(viewId).f2265c.f2393c = visibilityMode;
    }

    public void F(int viewId, int anchor) {
        a aVar;
        if (!this.f2262g.containsKey(Integer.valueOf(viewId)) || (aVar = this.f2262g.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        switch (anchor) {
            case 1:
                b bVar = aVar.f2267e;
                bVar.f2342k = -1;
                bVar.f2340j = -1;
                bVar.H = -1;
                bVar.O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f2267e;
                bVar2.f2346m = -1;
                bVar2.f2344l = -1;
                bVar2.I = -1;
                bVar2.Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f2267e;
                bVar3.f2350o = -1;
                bVar3.f2348n = -1;
                bVar3.J = 0;
                bVar3.P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f2267e;
                bVar4.f2352p = -1;
                bVar4.f2354q = -1;
                bVar4.K = 0;
                bVar4.R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f2267e;
                bVar5.f2356r = -1;
                bVar5.f2357s = -1;
                bVar5.f2358t = -1;
                bVar5.N = 0;
                bVar5.U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f2267e;
                bVar6.f2359u = -1;
                bVar6.f2360v = -1;
                bVar6.M = 0;
                bVar6.T = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f2267e;
                bVar7.f2361w = -1;
                bVar7.f2362x = -1;
                bVar7.L = 0;
                bVar7.S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f2267e;
                bVar8.D = -1.0f;
                bVar8.C = -1;
                bVar8.B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F0(a set, String attributes) {
        String[] G12 = G1(attributes);
        for (int i7 = 0; i7 < G12.length; i7++) {
            String[] split = G12[i7].split("=");
            Log.w("ConstraintSet", " Unable to parse " + G12[i7]);
            set.s(split[0], split[1]);
        }
    }

    public final String F1(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void G(Context context, int constraintLayoutId) {
        H((ConstraintLayout) LayoutInflater.from(context).inflate(constraintLayoutId, (ViewGroup) null));
    }

    public final void G0(Context ctx, a c7, TypedArray a7, boolean override) {
        if (override) {
            H0(ctx, c7, a7);
            return;
        }
        int indexCount = a7.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = a7.getIndex(i7);
            if (index != k.m.f3270e4 && k.m.A4 != index && k.m.B4 != index) {
                c7.f2266d.f2377a = true;
                c7.f2267e.f2324b = true;
                c7.f2265c.f2391a = true;
                c7.f2268f.f2408a = true;
            }
            switch (W.get(index)) {
                case 1:
                    b bVar = c7.f2267e;
                    bVar.f2356r = y0(a7, index, bVar.f2356r);
                    break;
                case 2:
                    b bVar2 = c7.f2267e;
                    bVar2.K = a7.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = c7.f2267e;
                    bVar3.f2354q = y0(a7, index, bVar3.f2354q);
                    break;
                case 4:
                    b bVar4 = c7.f2267e;
                    bVar4.f2352p = y0(a7, index, bVar4.f2352p);
                    break;
                case 5:
                    c7.f2267e.A = a7.getString(index);
                    break;
                case 6:
                    b bVar5 = c7.f2267e;
                    bVar5.E = a7.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = c7.f2267e;
                    bVar6.F = a7.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = c7.f2267e;
                    bVar7.L = a7.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = c7.f2267e;
                    bVar8.f2362x = y0(a7, index, bVar8.f2362x);
                    break;
                case 10:
                    b bVar9 = c7.f2267e;
                    bVar9.f2361w = y0(a7, index, bVar9.f2361w);
                    break;
                case 11:
                    b bVar10 = c7.f2267e;
                    bVar10.R = a7.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = c7.f2267e;
                    bVar11.S = a7.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = c7.f2267e;
                    bVar12.O = a7.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = c7.f2267e;
                    bVar13.Q = a7.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = c7.f2267e;
                    bVar14.T = a7.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = c7.f2267e;
                    bVar15.P = a7.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = c7.f2267e;
                    bVar16.f2332f = a7.getDimensionPixelOffset(index, bVar16.f2332f);
                    break;
                case 18:
                    b bVar17 = c7.f2267e;
                    bVar17.f2334g = a7.getDimensionPixelOffset(index, bVar17.f2334g);
                    break;
                case 19:
                    b bVar18 = c7.f2267e;
                    bVar18.f2336h = a7.getFloat(index, bVar18.f2336h);
                    break;
                case 20:
                    b bVar19 = c7.f2267e;
                    bVar19.f2363y = a7.getFloat(index, bVar19.f2363y);
                    break;
                case 21:
                    b bVar20 = c7.f2267e;
                    bVar20.f2330e = a7.getLayoutDimension(index, bVar20.f2330e);
                    break;
                case 22:
                    d dVar = c7.f2265c;
                    dVar.f2392b = a7.getInt(index, dVar.f2392b);
                    d dVar2 = c7.f2265c;
                    dVar2.f2392b = U[dVar2.f2392b];
                    break;
                case 23:
                    b bVar21 = c7.f2267e;
                    bVar21.f2328d = a7.getLayoutDimension(index, bVar21.f2328d);
                    break;
                case 24:
                    b bVar22 = c7.f2267e;
                    bVar22.H = a7.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = c7.f2267e;
                    bVar23.f2340j = y0(a7, index, bVar23.f2340j);
                    break;
                case 26:
                    b bVar24 = c7.f2267e;
                    bVar24.f2342k = y0(a7, index, bVar24.f2342k);
                    break;
                case 27:
                    b bVar25 = c7.f2267e;
                    bVar25.G = a7.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = c7.f2267e;
                    bVar26.I = a7.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = c7.f2267e;
                    bVar27.f2344l = y0(a7, index, bVar27.f2344l);
                    break;
                case 30:
                    b bVar28 = c7.f2267e;
                    bVar28.f2346m = y0(a7, index, bVar28.f2346m);
                    break;
                case 31:
                    b bVar29 = c7.f2267e;
                    bVar29.M = a7.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = c7.f2267e;
                    bVar30.f2359u = y0(a7, index, bVar30.f2359u);
                    break;
                case 33:
                    b bVar31 = c7.f2267e;
                    bVar31.f2360v = y0(a7, index, bVar31.f2360v);
                    break;
                case 34:
                    b bVar32 = c7.f2267e;
                    bVar32.J = a7.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = c7.f2267e;
                    bVar33.f2350o = y0(a7, index, bVar33.f2350o);
                    break;
                case 36:
                    b bVar34 = c7.f2267e;
                    bVar34.f2348n = y0(a7, index, bVar34.f2348n);
                    break;
                case 37:
                    b bVar35 = c7.f2267e;
                    bVar35.f2364z = a7.getFloat(index, bVar35.f2364z);
                    break;
                case 38:
                    c7.f2263a = a7.getResourceId(index, c7.f2263a);
                    break;
                case 39:
                    b bVar36 = c7.f2267e;
                    bVar36.W = a7.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = c7.f2267e;
                    bVar37.V = a7.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = c7.f2267e;
                    bVar38.X = a7.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = c7.f2267e;
                    bVar39.Y = a7.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = c7.f2265c;
                    dVar3.f2394d = a7.getFloat(index, dVar3.f2394d);
                    break;
                case 44:
                    C0032e c0032e = c7.f2268f;
                    c0032e.f2420m = true;
                    c0032e.f2421n = a7.getDimension(index, c0032e.f2421n);
                    break;
                case 45:
                    C0032e c0032e2 = c7.f2268f;
                    c0032e2.f2410c = a7.getFloat(index, c0032e2.f2410c);
                    break;
                case 46:
                    C0032e c0032e3 = c7.f2268f;
                    c0032e3.f2411d = a7.getFloat(index, c0032e3.f2411d);
                    break;
                case 47:
                    C0032e c0032e4 = c7.f2268f;
                    c0032e4.f2412e = a7.getFloat(index, c0032e4.f2412e);
                    break;
                case 48:
                    C0032e c0032e5 = c7.f2268f;
                    c0032e5.f2413f = a7.getFloat(index, c0032e5.f2413f);
                    break;
                case 49:
                    C0032e c0032e6 = c7.f2268f;
                    c0032e6.f2414g = a7.getDimension(index, c0032e6.f2414g);
                    break;
                case 50:
                    C0032e c0032e7 = c7.f2268f;
                    c0032e7.f2415h = a7.getDimension(index, c0032e7.f2415h);
                    break;
                case 51:
                    C0032e c0032e8 = c7.f2268f;
                    c0032e8.f2417j = a7.getDimension(index, c0032e8.f2417j);
                    break;
                case 52:
                    C0032e c0032e9 = c7.f2268f;
                    c0032e9.f2418k = a7.getDimension(index, c0032e9.f2418k);
                    break;
                case 53:
                    C0032e c0032e10 = c7.f2268f;
                    c0032e10.f2419l = a7.getDimension(index, c0032e10.f2419l);
                    break;
                case 54:
                    b bVar40 = c7.f2267e;
                    bVar40.Z = a7.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = c7.f2267e;
                    bVar41.f2323a0 = a7.getInt(index, bVar41.f2323a0);
                    break;
                case 56:
                    b bVar42 = c7.f2267e;
                    bVar42.f2325b0 = a7.getDimensionPixelSize(index, bVar42.f2325b0);
                    break;
                case f2190c1 /* 57 */:
                    b bVar43 = c7.f2267e;
                    bVar43.f2327c0 = a7.getDimensionPixelSize(index, bVar43.f2327c0);
                    break;
                case f2192d1 /* 58 */:
                    b bVar44 = c7.f2267e;
                    bVar44.f2329d0 = a7.getDimensionPixelSize(index, bVar44.f2329d0);
                    break;
                case f2194e1 /* 59 */:
                    b bVar45 = c7.f2267e;
                    bVar45.f2331e0 = a7.getDimensionPixelSize(index, bVar45.f2331e0);
                    break;
                case 60:
                    C0032e c0032e11 = c7.f2268f;
                    c0032e11.f2409b = a7.getFloat(index, c0032e11.f2409b);
                    break;
                case 61:
                    b bVar46 = c7.f2267e;
                    bVar46.B = y0(a7, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = c7.f2267e;
                    bVar47.C = a7.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = c7.f2267e;
                    bVar48.D = a7.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = c7.f2266d;
                    cVar.f2378b = y0(a7, index, cVar.f2378b);
                    break;
                case 65:
                    if (a7.peekValue(index).type == 3) {
                        c7.f2266d.f2380d = a7.getString(index);
                        break;
                    } else {
                        c7.f2266d.f2380d = u.d.f16910o[a7.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c7.f2266d.f2382f = a7.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = c7.f2266d;
                    cVar2.f2385i = a7.getFloat(index, cVar2.f2385i);
                    break;
                case f2219n1 /* 68 */:
                    d dVar4 = c7.f2265c;
                    dVar4.f2395e = a7.getFloat(index, dVar4.f2395e);
                    break;
                case 69:
                    c7.f2267e.f2333f0 = a7.getFloat(index, 1.0f);
                    break;
                case 70:
                    c7.f2267e.f2335g0 = a7.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = c7.f2267e;
                    bVar49.f2337h0 = a7.getInt(index, bVar49.f2337h0);
                    break;
                case 73:
                    b bVar50 = c7.f2267e;
                    bVar50.f2339i0 = a7.getDimensionPixelSize(index, bVar50.f2339i0);
                    break;
                case 74:
                    c7.f2267e.f2345l0 = a7.getString(index);
                    break;
                case 75:
                    b bVar51 = c7.f2267e;
                    bVar51.f2353p0 = a7.getBoolean(index, bVar51.f2353p0);
                    break;
                case 76:
                    c cVar3 = c7.f2266d;
                    cVar3.f2381e = a7.getInt(index, cVar3.f2381e);
                    break;
                case 77:
                    c7.f2267e.f2347m0 = a7.getString(index);
                    break;
                case 78:
                    d dVar5 = c7.f2265c;
                    dVar5.f2393c = a7.getInt(index, dVar5.f2393c);
                    break;
                case 79:
                    c cVar4 = c7.f2266d;
                    cVar4.f2383g = a7.getFloat(index, cVar4.f2383g);
                    break;
                case 80:
                    b bVar52 = c7.f2267e;
                    bVar52.f2349n0 = a7.getBoolean(index, bVar52.f2349n0);
                    break;
                case 81:
                    b bVar53 = c7.f2267e;
                    bVar53.f2351o0 = a7.getBoolean(index, bVar53.f2351o0);
                    break;
                case 82:
                    c cVar5 = c7.f2266d;
                    cVar5.f2379c = a7.getInteger(index, cVar5.f2379c);
                    break;
                case 83:
                    C0032e c0032e12 = c7.f2268f;
                    c0032e12.f2416i = y0(a7, index, c0032e12.f2416i);
                    break;
                case 84:
                    c cVar6 = c7.f2266d;
                    cVar6.f2387k = a7.getInteger(index, cVar6.f2387k);
                    break;
                case 85:
                    c cVar7 = c7.f2266d;
                    cVar7.f2386j = a7.getFloat(index, cVar7.f2386j);
                    break;
                case 86:
                    int i8 = a7.peekValue(index).type;
                    if (i8 == 1) {
                        c7.f2266d.f2390n = a7.getResourceId(index, -1);
                        c cVar8 = c7.f2266d;
                        if (cVar8.f2390n != -1) {
                            cVar8.f2389m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i8 == 3) {
                        c7.f2266d.f2388l = a7.getString(index);
                        if (c7.f2266d.f2388l.indexOf("/") > 0) {
                            c7.f2266d.f2390n = a7.getResourceId(index, -1);
                            c7.f2266d.f2389m = -2;
                            break;
                        } else {
                            c7.f2266d.f2389m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = c7.f2266d;
                        cVar9.f2389m = a7.getInteger(index, cVar9.f2390n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + W.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + W.get(index));
                    break;
                case 91:
                    b bVar54 = c7.f2267e;
                    bVar54.f2357s = y0(a7, index, bVar54.f2357s);
                    break;
                case L1 /* 92 */:
                    b bVar55 = c7.f2267e;
                    bVar55.f2358t = y0(a7, index, bVar55.f2358t);
                    break;
                case M1 /* 93 */:
                    b bVar56 = c7.f2267e;
                    bVar56.N = a7.getDimensionPixelSize(index, bVar56.N);
                    break;
                case N1 /* 94 */:
                    b bVar57 = c7.f2267e;
                    bVar57.U = a7.getDimensionPixelSize(index, bVar57.U);
                    break;
                case O1 /* 95 */:
                    A0(c7.f2267e, a7, index, 0);
                    break;
                case 96:
                    A0(c7.f2267e, a7, index, 1);
                    break;
                case Q1 /* 97 */:
                    b bVar58 = c7.f2267e;
                    bVar58.f2355q0 = a7.getInt(index, bVar58.f2355q0);
                    break;
            }
        }
        b bVar59 = c7.f2267e;
        if (bVar59.f2345l0 != null) {
            bVar59.f2343k0 = null;
        }
    }

    public void H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2262g.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2261f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2262g.containsKey(Integer.valueOf(id))) {
                this.f2262g.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2262g.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f2269g = androidx.constraintlayout.widget.a.d(this.f2260e, childAt);
                aVar.k(id, bVar);
                aVar.f2265c.f2392b = childAt.getVisibility();
                aVar.f2265c.f2394d = childAt.getAlpha();
                aVar.f2268f.f2409b = childAt.getRotation();
                aVar.f2268f.f2410c = childAt.getRotationX();
                aVar.f2268f.f2411d = childAt.getRotationY();
                aVar.f2268f.f2412e = childAt.getScaleX();
                aVar.f2268f.f2413f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != androidx.cardview.widget.g.f1896q || pivotY != androidx.cardview.widget.g.f1896q) {
                    C0032e c0032e = aVar.f2268f;
                    c0032e.f2414g = pivotX;
                    c0032e.f2415h = pivotY;
                }
                aVar.f2268f.f2417j = childAt.getTranslationX();
                aVar.f2268f.f2418k = childAt.getTranslationY();
                aVar.f2268f.f2419l = childAt.getTranslationZ();
                C0032e c0032e2 = aVar.f2268f;
                if (c0032e2.f2420m) {
                    c0032e2.f2421n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f2267e.f2353p0 = barrier.getAllowsGoneWidget();
                    aVar.f2267e.f2343k0 = barrier.getReferencedIds();
                    aVar.f2267e.f2337h0 = barrier.getType();
                    aVar.f2267e.f2339i0 = barrier.getMargin();
                }
            }
        }
    }

    public void H1(Writer writer, ConstraintLayout layout, int flags) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((flags & 1) == 1) {
            new g(writer, layout, flags).i();
        } else {
            new f(writer, layout, flags).g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void I(e set) {
        this.f2262g.clear();
        for (Integer num : set.f2262g.keySet()) {
            a aVar = set.f2262g.get(num);
            if (aVar != null) {
                this.f2262g.put(num, aVar.clone());
            }
        }
    }

    public void I0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2261f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2262g.containsKey(Integer.valueOf(id))) {
                this.f2262g.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f2262g.get(Integer.valueOf(id));
            if (aVar != null) {
                if (!aVar.f2267e.f2324b) {
                    aVar.k(id, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.b) {
                        aVar.f2267e.f2343k0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f2267e.f2353p0 = barrier.getAllowsGoneWidget();
                            aVar.f2267e.f2337h0 = barrier.getType();
                            aVar.f2267e.f2339i0 = barrier.getMargin();
                        }
                    }
                    aVar.f2267e.f2324b = true;
                }
                d dVar = aVar.f2265c;
                if (!dVar.f2391a) {
                    dVar.f2392b = childAt.getVisibility();
                    aVar.f2265c.f2394d = childAt.getAlpha();
                    aVar.f2265c.f2391a = true;
                }
                C0032e c0032e = aVar.f2268f;
                if (!c0032e.f2408a) {
                    c0032e.f2408a = true;
                    c0032e.f2409b = childAt.getRotation();
                    aVar.f2268f.f2410c = childAt.getRotationX();
                    aVar.f2268f.f2411d = childAt.getRotationY();
                    aVar.f2268f.f2412e = childAt.getScaleX();
                    aVar.f2268f.f2413f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != androidx.cardview.widget.g.f1896q || pivotY != androidx.cardview.widget.g.f1896q) {
                        C0032e c0032e2 = aVar.f2268f;
                        c0032e2.f2414g = pivotX;
                        c0032e2.f2415h = pivotY;
                    }
                    aVar.f2268f.f2417j = childAt.getTranslationX();
                    aVar.f2268f.f2418k = childAt.getTranslationY();
                    aVar.f2268f.f2419l = childAt.getTranslationZ();
                    C0032e c0032e3 = aVar.f2268f;
                    if (c0032e3.f2420m) {
                        c0032e3.f2421n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void J(androidx.constraintlayout.widget.f constraints) {
        int childCount = constraints.getChildCount();
        this.f2262g.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraints.getChildAt(i7);
            f.a aVar = (f.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f2261f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f2262g.containsKey(Integer.valueOf(id))) {
                this.f2262g.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f2262g.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.m((androidx.constraintlayout.widget.b) childAt, id, aVar);
                }
                aVar2.l(id, aVar);
            }
        }
    }

    public void J0(e set) {
        for (Integer num : set.f2262g.keySet()) {
            int intValue = num.intValue();
            a aVar = set.f2262g.get(num);
            if (!this.f2262g.containsKey(Integer.valueOf(intValue))) {
                this.f2262g.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.f2262g.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                b bVar = aVar2.f2267e;
                if (!bVar.f2324b) {
                    bVar.a(aVar.f2267e);
                }
                d dVar = aVar2.f2265c;
                if (!dVar.f2391a) {
                    dVar.a(aVar.f2265c);
                }
                C0032e c0032e = aVar2.f2268f;
                if (!c0032e.f2408a) {
                    c0032e.a(aVar.f2268f);
                }
                c cVar = aVar2.f2266d;
                if (!cVar.f2377a) {
                    cVar.a(aVar.f2266d);
                }
                for (String str : aVar.f2269g.keySet()) {
                    if (!aVar2.f2269g.containsKey(str)) {
                        aVar2.f2269g.put(str, aVar.f2269g.get(str));
                    }
                }
            }
        }
    }

    public void K(int startID, int startSide, int endID, int endSide) {
        if (!this.f2262g.containsKey(Integer.valueOf(startID))) {
            this.f2262g.put(Integer.valueOf(startID), new a());
        }
        a aVar = this.f2262g.get(Integer.valueOf(startID));
        if (aVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    b bVar = aVar.f2267e;
                    bVar.f2340j = endID;
                    bVar.f2342k = -1;
                    return;
                } else if (endSide == 2) {
                    b bVar2 = aVar.f2267e;
                    bVar2.f2342k = endID;
                    bVar2.f2340j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + F1(endSide) + " undefined");
                }
            case 2:
                if (endSide == 1) {
                    b bVar3 = aVar.f2267e;
                    bVar3.f2344l = endID;
                    bVar3.f2346m = -1;
                    return;
                } else if (endSide == 2) {
                    b bVar4 = aVar.f2267e;
                    bVar4.f2346m = endID;
                    bVar4.f2344l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
            case 3:
                if (endSide == 3) {
                    b bVar5 = aVar.f2267e;
                    bVar5.f2348n = endID;
                    bVar5.f2350o = -1;
                    bVar5.f2356r = -1;
                    bVar5.f2357s = -1;
                    bVar5.f2358t = -1;
                    return;
                } else if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                } else {
                    b bVar6 = aVar.f2267e;
                    bVar6.f2350o = endID;
                    bVar6.f2348n = -1;
                    bVar6.f2356r = -1;
                    bVar6.f2357s = -1;
                    bVar6.f2358t = -1;
                    return;
                }
            case 4:
                if (endSide == 4) {
                    b bVar7 = aVar.f2267e;
                    bVar7.f2354q = endID;
                    bVar7.f2352p = -1;
                    bVar7.f2356r = -1;
                    bVar7.f2357s = -1;
                    bVar7.f2358t = -1;
                    return;
                } else if (endSide != 3) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                } else {
                    b bVar8 = aVar.f2267e;
                    bVar8.f2352p = endID;
                    bVar8.f2354q = -1;
                    bVar8.f2356r = -1;
                    bVar8.f2357s = -1;
                    bVar8.f2358t = -1;
                    return;
                }
            case 5:
                if (endSide == 5) {
                    b bVar9 = aVar.f2267e;
                    bVar9.f2356r = endID;
                    bVar9.f2354q = -1;
                    bVar9.f2352p = -1;
                    bVar9.f2348n = -1;
                    bVar9.f2350o = -1;
                    return;
                } else if (endSide == 3) {
                    b bVar10 = aVar.f2267e;
                    bVar10.f2357s = endID;
                    bVar10.f2354q = -1;
                    bVar10.f2352p = -1;
                    bVar10.f2348n = -1;
                    bVar10.f2350o = -1;
                    return;
                } else if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                } else {
                    b bVar11 = aVar.f2267e;
                    bVar11.f2358t = endID;
                    bVar11.f2354q = -1;
                    bVar11.f2352p = -1;
                    bVar11.f2348n = -1;
                    bVar11.f2350o = -1;
                    return;
                }
            case 6:
                if (endSide == 6) {
                    b bVar12 = aVar.f2267e;
                    bVar12.f2360v = endID;
                    bVar12.f2359u = -1;
                    return;
                } else if (endSide == 7) {
                    b bVar13 = aVar.f2267e;
                    bVar13.f2359u = endID;
                    bVar13.f2360v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
            case 7:
                if (endSide == 7) {
                    b bVar14 = aVar.f2267e;
                    bVar14.f2362x = endID;
                    bVar14.f2361w = -1;
                    return;
                } else if (endSide == 6) {
                    b bVar15 = aVar.f2267e;
                    bVar15.f2361w = endID;
                    bVar15.f2362x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
            default:
                throw new IllegalArgumentException(F1(startSide) + " to " + F1(endSide) + " unknown");
        }
    }

    public void K0(String attributeName) {
        this.f2260e.remove(attributeName);
    }

    public void L(int startID, int startSide, int endID, int endSide, int margin) {
        if (!this.f2262g.containsKey(Integer.valueOf(startID))) {
            this.f2262g.put(Integer.valueOf(startID), new a());
        }
        a aVar = this.f2262g.get(Integer.valueOf(startID));
        if (aVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    b bVar = aVar.f2267e;
                    bVar.f2340j = endID;
                    bVar.f2342k = -1;
                } else if (endSide != 2) {
                    throw new IllegalArgumentException("Left to " + F1(endSide) + " undefined");
                } else {
                    b bVar2 = aVar.f2267e;
                    bVar2.f2342k = endID;
                    bVar2.f2340j = -1;
                }
                aVar.f2267e.H = margin;
                return;
            case 2:
                if (endSide == 1) {
                    b bVar3 = aVar.f2267e;
                    bVar3.f2344l = endID;
                    bVar3.f2346m = -1;
                } else if (endSide != 2) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                } else {
                    b bVar4 = aVar.f2267e;
                    bVar4.f2346m = endID;
                    bVar4.f2344l = -1;
                }
                aVar.f2267e.I = margin;
                return;
            case 3:
                if (endSide == 3) {
                    b bVar5 = aVar.f2267e;
                    bVar5.f2348n = endID;
                    bVar5.f2350o = -1;
                    bVar5.f2356r = -1;
                    bVar5.f2357s = -1;
                    bVar5.f2358t = -1;
                } else if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                } else {
                    b bVar6 = aVar.f2267e;
                    bVar6.f2350o = endID;
                    bVar6.f2348n = -1;
                    bVar6.f2356r = -1;
                    bVar6.f2357s = -1;
                    bVar6.f2358t = -1;
                }
                aVar.f2267e.J = margin;
                return;
            case 4:
                if (endSide == 4) {
                    b bVar7 = aVar.f2267e;
                    bVar7.f2354q = endID;
                    bVar7.f2352p = -1;
                    bVar7.f2356r = -1;
                    bVar7.f2357s = -1;
                    bVar7.f2358t = -1;
                } else if (endSide != 3) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                } else {
                    b bVar8 = aVar.f2267e;
                    bVar8.f2352p = endID;
                    bVar8.f2354q = -1;
                    bVar8.f2356r = -1;
                    bVar8.f2357s = -1;
                    bVar8.f2358t = -1;
                }
                aVar.f2267e.K = margin;
                return;
            case 5:
                if (endSide == 5) {
                    b bVar9 = aVar.f2267e;
                    bVar9.f2356r = endID;
                    bVar9.f2354q = -1;
                    bVar9.f2352p = -1;
                    bVar9.f2348n = -1;
                    bVar9.f2350o = -1;
                    return;
                } else if (endSide == 3) {
                    b bVar10 = aVar.f2267e;
                    bVar10.f2357s = endID;
                    bVar10.f2354q = -1;
                    bVar10.f2352p = -1;
                    bVar10.f2348n = -1;
                    bVar10.f2350o = -1;
                    return;
                } else if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                } else {
                    b bVar11 = aVar.f2267e;
                    bVar11.f2358t = endID;
                    bVar11.f2354q = -1;
                    bVar11.f2352p = -1;
                    bVar11.f2348n = -1;
                    bVar11.f2350o = -1;
                    return;
                }
            case 6:
                if (endSide == 6) {
                    b bVar12 = aVar.f2267e;
                    bVar12.f2360v = endID;
                    bVar12.f2359u = -1;
                } else if (endSide != 7) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                } else {
                    b bVar13 = aVar.f2267e;
                    bVar13.f2359u = endID;
                    bVar13.f2360v = -1;
                }
                aVar.f2267e.M = margin;
                return;
            case 7:
                if (endSide == 7) {
                    b bVar14 = aVar.f2267e;
                    bVar14.f2362x = endID;
                    bVar14.f2361w = -1;
                } else if (endSide != 6) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                } else {
                    b bVar15 = aVar.f2267e;
                    bVar15.f2361w = endID;
                    bVar15.f2362x = -1;
                }
                aVar.f2267e.L = margin;
                return;
            default:
                throw new IllegalArgumentException(F1(startSide) + " to " + F1(endSide) + " unknown");
        }
    }

    public void L0(int viewId) {
        a aVar;
        if (!this.f2262g.containsKey(Integer.valueOf(viewId)) || (aVar = this.f2262g.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        b bVar = aVar.f2267e;
        int i7 = bVar.f2342k;
        int i8 = bVar.f2344l;
        if (i7 != -1 || i8 != -1) {
            if (i7 == -1 || i8 == -1) {
                int i9 = bVar.f2346m;
                if (i9 != -1) {
                    L(i7, 2, i9, 2, 0);
                } else {
                    int i10 = bVar.f2340j;
                    if (i10 != -1) {
                        L(i8, 1, i10, 1, 0);
                    }
                }
            } else {
                L(i7, 2, i8, 1, 0);
                L(i8, 1, i7, 2, 0);
            }
            F(viewId, 1);
            F(viewId, 2);
            return;
        }
        int i11 = bVar.f2359u;
        int i12 = bVar.f2361w;
        if (i11 != -1 || i12 != -1) {
            if (i11 != -1 && i12 != -1) {
                L(i11, 7, i12, 6, 0);
                L(i12, 6, i7, 7, 0);
            } else if (i12 != -1) {
                int i13 = bVar.f2346m;
                if (i13 != -1) {
                    L(i7, 7, i13, 7, 0);
                } else {
                    int i14 = bVar.f2340j;
                    if (i14 != -1) {
                        L(i12, 6, i14, 6, 0);
                    }
                }
            }
        }
        F(viewId, 6);
        F(viewId, 7);
    }

    public void M(int viewId, int id, int radius, float angle) {
        b bVar = i0(viewId).f2267e;
        bVar.B = id;
        bVar.C = radius;
        bVar.D = angle;
    }

    public void M0(int viewId) {
        if (this.f2262g.containsKey(Integer.valueOf(viewId))) {
            a aVar = this.f2262g.get(Integer.valueOf(viewId));
            if (aVar == null) {
                return;
            }
            b bVar = aVar.f2267e;
            int i7 = bVar.f2350o;
            int i8 = bVar.f2352p;
            if (i7 != -1 || i8 != -1) {
                if (i7 == -1 || i8 == -1) {
                    int i9 = bVar.f2354q;
                    if (i9 != -1) {
                        L(i7, 4, i9, 4, 0);
                    } else {
                        int i10 = bVar.f2348n;
                        if (i10 != -1) {
                            L(i8, 3, i10, 3, 0);
                        }
                    }
                } else {
                    L(i7, 4, i8, 3, 0);
                    L(i8, 3, i7, 4, 0);
                }
            }
        }
        F(viewId, 3);
        F(viewId, 4);
    }

    public void N(int viewId, int height) {
        i0(viewId).f2267e.f2323a0 = height;
    }

    public void N0(int viewId, float alpha) {
        i0(viewId).f2265c.f2394d = alpha;
    }

    public void O(int viewId, int width) {
        i0(viewId).f2267e.Z = width;
    }

    public void O0(int viewId, boolean apply) {
        i0(viewId).f2268f.f2420m = apply;
    }

    public void P(int viewId, int height) {
        i0(viewId).f2267e.f2330e = height;
    }

    public void P0(int id, int type) {
        i0(id).f2267e.f2341j0 = type;
    }

    public void Q(int viewId, int height) {
        i0(viewId).f2267e.f2327c0 = height;
    }

    public void Q0(int viewId, String attributeName, int value) {
        i0(viewId).p(attributeName, value);
    }

    public void R(int viewId, int width) {
        i0(viewId).f2267e.f2325b0 = width;
    }

    public void S(int viewId, int height) {
        i0(viewId).f2267e.f2331e0 = height;
    }

    public void T(int viewId, int width) {
        i0(viewId).f2267e.f2329d0 = width;
    }

    public void U(int viewId, float percent) {
        i0(viewId).f2267e.f2335g0 = percent;
    }

    public void V(int viewId, float percent) {
        i0(viewId).f2267e.f2333f0 = percent;
    }

    public void V0(int viewId, String ratio) {
        i0(viewId).f2267e.A = ratio;
    }

    public void W(int viewId, int width) {
        i0(viewId).f2267e.f2328d = width;
    }

    public void W0(int viewId, int position) {
        i0(viewId).f2267e.E = position;
    }

    public void X(int viewId, boolean constrained) {
        i0(viewId).f2267e.f2351o0 = constrained;
    }

    public void X0(int viewId, int position) {
        i0(viewId).f2267e.F = position;
    }

    public void Y(int viewId, boolean constrained) {
        i0(viewId).f2267e.f2349n0 = constrained;
    }

    public void Y0(int viewId, float elevation) {
        i0(viewId).f2268f.f2421n = elevation;
        i0(viewId).f2268f.f2420m = true;
    }

    public final int[] Z(View view, String referenceIdString) {
        int i7;
        Object designInformation;
        String[] split = referenceIdString.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < split.length) {
            String trim = split[i8].trim();
            try {
                i7 = k.g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i7 = 0;
            }
            if (i7 == 0) {
                i7 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i7 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i7 = ((Integer) designInformation).intValue();
            }
            iArr[i9] = i7;
            i8++;
            i9++;
        }
        return i9 != split.length ? Arrays.copyOf(iArr, i9) : iArr;
    }

    public void Z0(int viewId, String attributeName, float value) {
        i0(viewId).q(attributeName, value);
    }

    public void a0(int guidelineID, int orientation) {
        b bVar = i0(guidelineID).f2267e;
        bVar.f2322a = true;
        bVar.G = orientation;
    }

    public void a1(boolean forceId) {
        this.f2261f = forceId;
    }

    public void b0(int id, int direction, int margin, int... referenced) {
        b bVar = i0(id).f2267e;
        bVar.f2341j0 = 1;
        bVar.f2337h0 = direction;
        bVar.f2339i0 = margin;
        bVar.f2322a = false;
        bVar.f2343k0 = referenced;
    }

    public void b1(int viewId, int anchor, int value) {
        a i02 = i0(viewId);
        switch (anchor) {
            case 1:
                i02.f2267e.O = value;
                return;
            case 2:
                i02.f2267e.Q = value;
                return;
            case 3:
                i02.f2267e.P = value;
                return;
            case 4:
                i02.f2267e.R = value;
                return;
            case 5:
                i02.f2267e.U = value;
                return;
            case 6:
                i02.f2267e.T = value;
                return;
            case 7:
                i02.f2267e.S = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void c0(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style) {
        d0(leftId, leftSide, rightId, rightSide, chainIds, weights, style, 1, 2);
    }

    public void c1(int guidelineID, int margin) {
        i0(guidelineID).f2267e.f2332f = margin;
        i0(guidelineID).f2267e.f2334g = -1;
        i0(guidelineID).f2267e.f2336h = -1.0f;
    }

    public final void d0(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style, int left, int right) {
        if (chainIds.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            i0(chainIds[0]).f2267e.W = weights[0];
        }
        i0(chainIds[0]).f2267e.X = style;
        L(chainIds[0], left, leftId, leftSide, -1);
        for (int i7 = 1; i7 < chainIds.length; i7++) {
            int i8 = i7 - 1;
            L(chainIds[i7], left, chainIds[i8], right, -1);
            L(chainIds[i8], right, chainIds[i7], left, -1);
            if (weights != null) {
                i0(chainIds[i7]).f2267e.W = weights[i7];
            }
        }
        L(chainIds[chainIds.length - 1], right, rightId, rightSide, -1);
    }

    public void d1(int guidelineID, int margin) {
        i0(guidelineID).f2267e.f2334g = margin;
        i0(guidelineID).f2267e.f2332f = -1;
        i0(guidelineID).f2267e.f2336h = -1.0f;
    }

    public void e0(int startId, int startSide, int endId, int endSide, int[] chainIds, float[] weights, int style) {
        d0(startId, startSide, endId, endSide, chainIds, weights, style, 6, 7);
    }

    public void e1(int guidelineID, float ratio) {
        i0(guidelineID).f2267e.f2336h = ratio;
        i0(guidelineID).f2267e.f2334g = -1;
        i0(guidelineID).f2267e.f2332f = -1;
    }

    public void f0(int topId, int topSide, int bottomId, int bottomSide, int[] chainIds, float[] weights, int style) {
        if (chainIds.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            i0(chainIds[0]).f2267e.V = weights[0];
        }
        i0(chainIds[0]).f2267e.Y = style;
        L(chainIds[0], 3, topId, topSide, 0);
        for (int i7 = 1; i7 < chainIds.length; i7++) {
            int i8 = i7 - 1;
            L(chainIds[i7], 3, chainIds[i8], 4, 0);
            L(chainIds[i8], 4, chainIds[i7], 3, 0);
            if (weights != null) {
                i0(chainIds[i7]).f2267e.V = weights[i7];
            }
        }
        L(chainIds[chainIds.length - 1], 4, bottomId, bottomSide, 0);
    }

    public void f1(int viewId, float bias) {
        i0(viewId).f2267e.f2363y = bias;
    }

    public void g0(u scene, int... ids) {
        HashSet hashSet;
        Set<Integer> keySet = this.f2262g.keySet();
        if (ids.length != 0) {
            hashSet = new HashSet();
            for (int i7 : ids) {
                hashSet.add(Integer.valueOf(i7));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.f2262g.get(num);
            if (aVar != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                aVar.f2267e.b(scene, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    public void g1(int viewId, int chainStyle) {
        i0(viewId).f2267e.X = chainStyle;
    }

    public final void h(a.b attributeType, String... attributeName) {
        for (int i7 = 0; i7 < attributeName.length; i7++) {
            if (this.f2260e.containsKey(attributeName[i7])) {
                androidx.constraintlayout.widget.a aVar = this.f2260e.get(attributeName[i7]);
                if (aVar != null && aVar.j() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.j().name());
                }
            } else {
                this.f2260e.put(attributeName[i7], new androidx.constraintlayout.widget.a(attributeName[i7], attributeType));
            }
        }
    }

    public final a h0(Context context, AttributeSet attrs, boolean override) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, override ? k.m.R8 : k.m.f3254c4);
        G0(context, aVar, obtainStyledAttributes, override);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void h1(int viewId, float weight) {
        i0(viewId).f2267e.W = weight;
    }

    public void i(String... attributeName) {
        h(a.b.COLOR_TYPE, attributeName);
    }

    public final a i0(int id) {
        if (!this.f2262g.containsKey(Integer.valueOf(id))) {
            this.f2262g.put(Integer.valueOf(id), new a());
        }
        return this.f2262g.get(Integer.valueOf(id));
    }

    public void i1(int viewId, String attributeName, int value) {
        i0(viewId).r(attributeName, value);
    }

    public void j(String... attributeName) {
        h(a.b.FLOAT_TYPE, attributeName);
    }

    public boolean j0(int viewId) {
        return i0(viewId).f2268f.f2420m;
    }

    public void j1(int viewId, int behavior) {
        if (behavior < 0 || behavior > 3) {
            return;
        }
        i0(viewId).f2267e.f2355q0 = behavior;
    }

    public void k(String... attributeName) {
        h(a.b.INT_TYPE, attributeName);
    }

    public a k0(int id) {
        if (this.f2262g.containsKey(Integer.valueOf(id))) {
            return this.f2262g.get(Integer.valueOf(id));
        }
        return null;
    }

    public void k1(int viewId, int anchor, int value) {
        a i02 = i0(viewId);
        switch (anchor) {
            case 1:
                i02.f2267e.H = value;
                return;
            case 2:
                i02.f2267e.I = value;
                return;
            case 3:
                i02.f2267e.J = value;
                return;
            case 4:
                i02.f2267e.K = value;
                return;
            case 5:
                i02.f2267e.N = value;
                return;
            case 6:
                i02.f2267e.M = value;
                return;
            case 7:
                i02.f2267e.L = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void l(String... attributeName) {
        h(a.b.STRING_TYPE, attributeName);
    }

    public HashMap<String, androidx.constraintlayout.widget.a> l0() {
        return this.f2260e;
    }

    public void l1(int id, int... referenced) {
        i0(id).f2267e.f2343k0 = referenced;
    }

    public void m(int viewId, int leftId, int rightId) {
        L(viewId, 1, leftId, leftId == 0 ? 1 : 2, 0);
        L(viewId, 2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            L(leftId, 2, viewId, 1, 0);
        }
        if (rightId != 0) {
            L(rightId, 1, viewId, 2, 0);
        }
    }

    public void m1(int viewId, float rotation) {
        i0(viewId).f2268f.f2409b = rotation;
    }

    public void n(int viewId, int leftId, int rightId) {
        L(viewId, 6, leftId, leftId == 0 ? 6 : 7, 0);
        L(viewId, 7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            L(leftId, 7, viewId, 6, 0);
        }
        if (rightId != 0) {
            L(rightId, 6, viewId, 7, 0);
        }
    }

    public int n0(int viewId) {
        return i0(viewId).f2267e.f2330e;
    }

    public void n1(int viewId, float rotationX) {
        i0(viewId).f2268f.f2410c = rotationX;
    }

    public void o(int viewId, int topId, int bottomId) {
        L(viewId, 3, topId, topId == 0 ? 3 : 4, 0);
        L(viewId, 4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            L(topId, 4, viewId, 3, 0);
        }
        if (bottomId != 0) {
            L(bottomId, 3, viewId, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] numArr = (Integer[]) this.f2262g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = numArr[i7].intValue();
        }
        return iArr;
    }

    public void o1(int viewId, float rotationY) {
        i0(viewId).f2268f.f2411d = rotationY;
    }

    public void p(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            int id = childAt.getId();
            if (!this.f2262g.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + c0.c.k(childAt));
            } else if (this.f2261f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.f2262g.containsKey(Integer.valueOf(id)) && (aVar = this.f2262g.get(Integer.valueOf(id))) != null) {
                    androidx.constraintlayout.widget.a.r(childAt, aVar.f2269g);
                }
            }
        }
    }

    public void p1(int viewId, float scaleX) {
        i0(viewId).f2268f.f2412e = scaleX;
    }

    public void q(e cs) {
        for (a aVar : cs.f2262g.values()) {
            if (aVar.f2270h != null) {
                if (aVar.f2264b != null) {
                    Iterator<Integer> it = this.f2262g.keySet().iterator();
                    while (it.hasNext()) {
                        a k02 = k0(it.next().intValue());
                        String str = k02.f2267e.f2347m0;
                        if (str != null && aVar.f2264b.matches(str)) {
                            aVar.f2270h.e(k02);
                            k02.f2269g.putAll((HashMap) aVar.f2269g.clone());
                        }
                    }
                } else {
                    aVar.f2270h.e(k0(aVar.f2263a));
                }
            }
        }
    }

    public a q0(int mId) {
        return i0(mId);
    }

    public void q1(int viewId, float scaleY) {
        i0(viewId).f2268f.f2413f = scaleY;
    }

    public void r(ConstraintLayout constraintLayout) {
        t(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int[] r0(int id) {
        int[] iArr = i0(id).f2267e.f2343k0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void r1(int viewId, String attributeName, String value) {
        i0(viewId).s(attributeName, value);
    }

    public void s(androidx.constraintlayout.widget.b helper, y.e child, ConstraintLayout.b layoutParams, SparseArray<y.e> mapIdToWidget) {
        a aVar;
        int id = helper.getId();
        if (this.f2262g.containsKey(Integer.valueOf(id)) && (aVar = this.f2262g.get(Integer.valueOf(id))) != null && (child instanceof y.j)) {
            helper.z(aVar, (y.j) child, layoutParams, mapIdToWidget);
        }
    }

    public int s0(int viewId) {
        return i0(viewId).f2265c.f2392b;
    }

    public void s1(int viewId, float transformPivotX, float transformPivotY) {
        C0032e c0032e = i0(viewId).f2268f;
        c0032e.f2415h = transformPivotY;
        c0032e.f2414g = transformPivotX;
    }

    public void t(ConstraintLayout constraintLayout, boolean applyPostLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2262g.keySet());
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            int id = childAt.getId();
            if (!this.f2262g.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + c0.c.k(childAt));
            } else if (this.f2261f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.f2262g.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f2262g.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f2267e.f2341j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.f2267e.f2337h0);
                                barrier.setMargin(aVar.f2267e.f2339i0);
                                barrier.setAllowsGoneWidget(aVar.f2267e.f2353p0);
                                b bVar = aVar.f2267e;
                                int[] iArr = bVar.f2343k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f2345l0;
                                    if (str != null) {
                                        bVar.f2343k0 = Z(barrier, str);
                                        barrier.setReferencedIds(aVar.f2267e.f2343k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.e();
                            aVar.i(bVar2);
                            if (applyPostLayout) {
                                androidx.constraintlayout.widget.a.r(childAt, aVar.f2269g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f2265c;
                            if (dVar.f2393c == 0) {
                                childAt.setVisibility(dVar.f2392b);
                            }
                            childAt.setAlpha(aVar.f2265c.f2394d);
                            childAt.setRotation(aVar.f2268f.f2409b);
                            childAt.setRotationX(aVar.f2268f.f2410c);
                            childAt.setRotationY(aVar.f2268f.f2411d);
                            childAt.setScaleX(aVar.f2268f.f2412e);
                            childAt.setScaleY(aVar.f2268f.f2413f);
                            C0032e c0032e = aVar.f2268f;
                            if (c0032e.f2416i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f2268f.f2416i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0032e.f2414g)) {
                                    childAt.setPivotX(aVar.f2268f.f2414g);
                                }
                                if (!Float.isNaN(aVar.f2268f.f2415h)) {
                                    childAt.setPivotY(aVar.f2268f.f2415h);
                                }
                            }
                            childAt.setTranslationX(aVar.f2268f.f2417j);
                            childAt.setTranslationY(aVar.f2268f.f2418k);
                            childAt.setTranslationZ(aVar.f2268f.f2419l);
                            C0032e c0032e2 = aVar.f2268f;
                            if (c0032e2.f2420m) {
                                childAt.setElevation(c0032e2.f2421n);
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("WARNING NO CONSTRAINTS for view ");
                        sb.append(id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f2262g.get(num);
            if (aVar2 != null) {
                if (aVar2.f2267e.f2341j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f2267e;
                    int[] iArr2 = bVar3.f2343k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f2345l0;
                        if (str2 != null) {
                            bVar3.f2343k0 = Z(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f2267e.f2343k0);
                        }
                    }
                    barrier2.setType(aVar2.f2267e.f2337h0);
                    barrier2.setMargin(aVar2.f2267e.f2339i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.I();
                    aVar2.i(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f2267e.f2322a) {
                    View iVar = new i(constraintLayout.getContext());
                    iVar.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.i(generateDefaultLayoutParams2);
                    constraintLayout.addView(iVar, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = constraintLayout.getChildAt(i8);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).r(constraintLayout);
            }
        }
    }

    public int t0(int viewId) {
        return i0(viewId).f2265c.f2393c;
    }

    public void t1(int viewId, float transformPivotX) {
        i0(viewId).f2268f.f2414g = transformPivotX;
    }

    public void u(int id, ConstraintLayout.b layoutParams) {
        a aVar;
        if (!this.f2262g.containsKey(Integer.valueOf(id)) || (aVar = this.f2262g.get(Integer.valueOf(id))) == null) {
            return;
        }
        aVar.i(layoutParams);
    }

    public int u0(int viewId) {
        return i0(viewId).f2267e.f2328d;
    }

    public void u1(int viewId, float transformPivotY) {
        i0(viewId).f2268f.f2415h = transformPivotY;
    }

    public void v(ConstraintLayout constraintLayout) {
        t(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public boolean v0() {
        return this.f2261f;
    }

    public void v1(int viewId, float translationX, float translationY) {
        C0032e c0032e = i0(viewId).f2268f;
        c0032e.f2417j = translationX;
        c0032e.f2418k = translationY;
    }

    public void w0(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a h02 = h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        h02.f2267e.f2322a = true;
                    }
                    this.f2262g.put(Integer.valueOf(h02.f2263a), h02);
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    public void w1(int viewId, float translationX) {
        i0(viewId).f2268f.f2417j = translationX;
    }

    public void x(int centerID, int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (secondMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (bias <= 0.0f || bias > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (firstSide == 1 || firstSide == 2) {
            L(centerID, 1, firstID, firstSide, firstMargin);
            L(centerID, 2, secondId, secondSide, secondMargin);
            a aVar = this.f2262g.get(Integer.valueOf(centerID));
            if (aVar != null) {
                aVar.f2267e.f2363y = bias;
            }
        } else if (firstSide == 6 || firstSide == 7) {
            L(centerID, 6, firstID, firstSide, firstMargin);
            L(centerID, 7, secondId, secondSide, secondMargin);
            a aVar2 = this.f2262g.get(Integer.valueOf(centerID));
            if (aVar2 != null) {
                aVar2.f2267e.f2363y = bias;
            }
        } else {
            L(centerID, 3, firstID, firstSide, firstMargin);
            L(centerID, 4, secondId, secondSide, secondMargin);
            a aVar3 = this.f2262g.get(Integer.valueOf(centerID));
            if (aVar3 != null) {
                aVar3.f2267e.f2364z = bias;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x0(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.x0(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void x1(int viewId, float translationY) {
        i0(viewId).f2268f.f2418k = translationY;
    }

    public void y(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            x(viewId, toView, 2, 0, toView, 1, 0, 0.5f);
        }
    }

    public void y1(int viewId, float translationZ) {
        i0(viewId).f2268f.f2419l = translationZ;
    }

    public void z(int centerID, int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        L(centerID, 1, leftId, leftSide, leftMargin);
        L(centerID, 2, rightId, rightSide, rightMargin);
        a aVar = this.f2262g.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.f2267e.f2363y = bias;
        }
    }

    public void z0(a set, String attributes) {
        String[] split = attributes.split(",");
        for (int i7 = 0; i7 < split.length; i7++) {
            String[] split2 = split[i7].split("=");
            if (split2.length != 2) {
                Log.w("ConstraintSet", " Unable to parse " + split[i7]);
            } else {
                set.p(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    public void z1(boolean validate) {
        this.f2256a = validate;
    }
}