package u5;

import com.google.android.material.card.MaterialCardViewHelper;
import i5.b0;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import r5.d0;
import r5.f0;
import r5.u;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f17529c = new a(null);
    @n6.e

    /* renamed from: a  reason: collision with root package name */
    public final d0 f17530a;
    @n6.e

    /* renamed from: b  reason: collision with root package name */
    public final f0 f17531b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public final boolean a(@n6.d f0 f0Var, @n6.d d0 d0Var) {
            l0.p(f0Var, "response");
            l0.p(d0Var, "request");
            int L = f0Var.L();
            if (L != 200 && L != 410 && L != 414 && L != 501 && L != 203 && L != 204) {
                if (L != 307) {
                    if (L != 308 && L != 404 && L != 405) {
                        switch (L) {
                            case MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION /* 300 */:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (f0.X(f0Var, "Expires", null, 2, null) == null && f0Var.C().n() == -1 && !f0Var.C().m() && !f0Var.C().l()) {
                    return false;
                }
            }
            return (f0Var.C().s() || d0Var.g().s()) ? false : true;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Date f17532a;

        /* renamed from: b  reason: collision with root package name */
        public String f17533b;

        /* renamed from: c  reason: collision with root package name */
        public Date f17534c;

        /* renamed from: d  reason: collision with root package name */
        public String f17535d;

        /* renamed from: e  reason: collision with root package name */
        public Date f17536e;

        /* renamed from: f  reason: collision with root package name */
        public long f17537f;

        /* renamed from: g  reason: collision with root package name */
        public long f17538g;

        /* renamed from: h  reason: collision with root package name */
        public String f17539h;

        /* renamed from: i  reason: collision with root package name */
        public int f17540i;

        /* renamed from: j  reason: collision with root package name */
        public final long f17541j;
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final d0 f17542k;

        /* renamed from: l  reason: collision with root package name */
        public final f0 f17543l;

        public b(long j7, @n6.d d0 d0Var, @n6.e f0 f0Var) {
            l0.p(d0Var, "request");
            this.f17541j = j7;
            this.f17542k = d0Var;
            this.f17543l = f0Var;
            this.f17540i = -1;
            if (f0Var != null) {
                this.f17537f = f0Var.T0();
                this.f17538g = f0Var.M0();
                u d02 = f0Var.d0();
                int size = d02.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String i8 = d02.i(i7);
                    String o6 = d02.o(i7);
                    if (b0.L1(i8, "Date", true)) {
                        this.f17532a = y5.c.a(o6);
                        this.f17533b = o6;
                    } else if (b0.L1(i8, "Expires", true)) {
                        this.f17536e = y5.c.a(o6);
                    } else if (b0.L1(i8, "Last-Modified", true)) {
                        this.f17534c = y5.c.a(o6);
                        this.f17535d = o6;
                    } else if (b0.L1(i8, "ETag", true)) {
                        this.f17539h = o6;
                    } else if (b0.L1(i8, "Age", true)) {
                        this.f17540i = s5.d.f0(o6, -1);
                    }
                }
            }
        }

        public final long a() {
            Date date = this.f17532a;
            long max = date != null ? Math.max(0L, this.f17538g - date.getTime()) : 0L;
            int i7 = this.f17540i;
            if (i7 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i7));
            }
            long j7 = this.f17538g;
            return max + (j7 - this.f17537f) + (this.f17541j - j7);
        }

        @n6.d
        public final c b() {
            c c7 = c();
            return (c7.b() == null || !this.f17542k.g().u()) ? c7 : new c(null, null);
        }

        public final c c() {
            String str;
            if (this.f17543l == null) {
                return new c(this.f17542k, null);
            }
            if ((!this.f17542k.l() || this.f17543l.Q() != null) && c.f17529c.a(this.f17543l, this.f17542k)) {
                r5.d g7 = this.f17542k.g();
                if (g7.r() || f(this.f17542k)) {
                    return new c(this.f17542k, null);
                }
                r5.d C = this.f17543l.C();
                long a7 = a();
                long d7 = d();
                if (g7.n() != -1) {
                    d7 = Math.min(d7, TimeUnit.SECONDS.toMillis(g7.n()));
                }
                long j7 = 0;
                long millis = g7.p() != -1 ? TimeUnit.SECONDS.toMillis(g7.p()) : 0L;
                if (!C.q() && g7.o() != -1) {
                    j7 = TimeUnit.SECONDS.toMillis(g7.o());
                }
                if (!C.r()) {
                    long j8 = millis + a7;
                    if (j8 < j7 + d7) {
                        f0.a z02 = this.f17543l.z0();
                        if (j8 >= d7) {
                            z02.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a7 > 86400000 && g()) {
                            z02.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, z02.c());
                    }
                }
                String str2 = this.f17539h;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f17534c != null) {
                        str2 = this.f17535d;
                    } else if (this.f17532a == null) {
                        return new c(this.f17542k, null);
                    } else {
                        str2 = this.f17533b;
                    }
                    str = "If-Modified-Since";
                }
                u.a k7 = this.f17542k.k().k();
                l0.m(str2);
                k7.g(str, str2);
                return new c(this.f17542k.n().o(k7.i()).b(), this.f17543l);
            }
            return new c(this.f17542k, null);
        }

        public final long d() {
            f0 f0Var = this.f17543l;
            l0.m(f0Var);
            if (f0Var.C().n() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.n());
            }
            Date date = this.f17536e;
            if (date != null) {
                Date date2 = this.f17532a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f17538g);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f17534c == null || this.f17543l.O0().q().O() != null) {
                return 0L;
            } else {
                Date date3 = this.f17532a;
                long time2 = date3 != null ? date3.getTime() : this.f17537f;
                Date date4 = this.f17534c;
                l0.m(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / 10;
                }
                return 0L;
            }
        }

        @n6.d
        public final d0 e() {
            return this.f17542k;
        }

        public final boolean f(d0 d0Var) {
            return (d0Var.i("If-Modified-Since") == null && d0Var.i("If-None-Match") == null) ? false : true;
        }

        public final boolean g() {
            f0 f0Var = this.f17543l;
            l0.m(f0Var);
            return f0Var.C().n() == -1 && this.f17536e == null;
        }
    }

    public c(@n6.e d0 d0Var, @n6.e f0 f0Var) {
        this.f17530a = d0Var;
        this.f17531b = f0Var;
    }

    @n6.e
    public final f0 a() {
        return this.f17531b;
    }

    @n6.e
    public final d0 b() {
        return this.f17530a;
    }
}
