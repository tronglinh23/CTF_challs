package c0;

/* loaded from: classes.dex */
public class v {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 5;
    public static final int F = 6;
    public static final int G = 7;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 4;
    public static final int O = 5;
    public static final int P = 6;
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    public static final int T = 3;
    public static final int U = 4;
    public static final int V = 5;
    public static final int W = 6;
    public static final int X = 7;

    /* renamed from: t  reason: collision with root package name */
    public static final int f7759t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f7760u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f7761v = 0;

    /* renamed from: w  reason: collision with root package name */
    public static final int f7762w = 1;

    /* renamed from: x  reason: collision with root package name */
    public static final int f7763x = 2;

    /* renamed from: y  reason: collision with root package name */
    public static final int f7764y = 3;

    /* renamed from: z  reason: collision with root package name */
    public static final int f7765z = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f7766a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f7767b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f7768c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f7769d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f7770e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f7771f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f7772g = -1;

    /* renamed from: h  reason: collision with root package name */
    public float f7773h = 4.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f7774i = 1.2f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7775j = true;

    /* renamed from: k  reason: collision with root package name */
    public float f7776k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    public int f7777l = 0;

    /* renamed from: m  reason: collision with root package name */
    public float f7778m = 10.0f;

    /* renamed from: n  reason: collision with root package name */
    public float f7779n = Float.NaN;

    /* renamed from: o  reason: collision with root package name */
    public float f7780o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public float f7781p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f7782q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public int f7783r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f7784s = 0;

    public v A(boolean moveWhenScrollAtTop) {
        this.f7775j = moveWhenScrollAtTop;
        return this;
    }

    public v B(int flags) {
        this.f7777l = flags;
        return this;
    }

    public v C(int mode) {
        this.f7771f = mode;
        return this;
    }

    public v D(int rotationCenterId) {
        this.f7772g = rotationCenterId;
        return this;
    }

    public v E(int springBoundary) {
        this.f7783r = springBoundary;
        return this;
    }

    public v F(float springDamping) {
        this.f7779n = springDamping;
        return this;
    }

    public v G(float springMass) {
        this.f7780o = springMass;
        return this;
    }

    public v H(float springStiffness) {
        this.f7781p = springStiffness;
        return this;
    }

    public v I(float springStopThreshold) {
        this.f7782q = springStopThreshold;
        return this;
    }

    public v J(int side) {
        this.f7768c = side;
        return this;
    }

    public v K(int side) {
        this.f7767b = side;
        return this;
    }

    public v L(int side) {
        this.f7769d = side;
        return this;
    }

    public int a() {
        return this.f7784s;
    }

    public int b() {
        return this.f7766a;
    }

    public float c() {
        return this.f7776k;
    }

    public float d() {
        return this.f7778m;
    }

    public int e() {
        return this.f7770e;
    }

    public float f() {
        return this.f7774i;
    }

    public float g() {
        return this.f7773h;
    }

    public boolean h() {
        return this.f7775j;
    }

    public int i() {
        return this.f7777l;
    }

    public int j() {
        return this.f7771f;
    }

    public int k() {
        return this.f7772g;
    }

    public int l() {
        return this.f7783r;
    }

    public float m() {
        return this.f7779n;
    }

    public float n() {
        return this.f7780o;
    }

    public float o() {
        return this.f7781p;
    }

    public float p() {
        return this.f7782q;
    }

    public int q() {
        return this.f7768c;
    }

    public int r() {
        return this.f7767b;
    }

    public int s() {
        return this.f7769d;
    }

    public void t(int autoCompleteMode) {
        this.f7784s = autoCompleteMode;
    }

    public v u(int dragDirection) {
        this.f7766a = dragDirection;
        return this;
    }

    public v v(int dragScale) {
        this.f7776k = dragScale;
        return this;
    }

    public v w(int dragThreshold) {
        this.f7778m = dragThreshold;
        return this;
    }

    public v x(int id) {
        this.f7770e = id;
        return this;
    }

    public v y(int maxAcceleration) {
        this.f7774i = maxAcceleration;
        return this;
    }

    public v z(int maxVelocity) {
        this.f7773h = maxVelocity;
        return this;
    }
}