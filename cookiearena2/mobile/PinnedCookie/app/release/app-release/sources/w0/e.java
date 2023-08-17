package w0;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import d.b1;
import java.util.Iterator;
@b1({b1.a.LIBRARY})
/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: n  reason: collision with root package name */
    public static final int f18051n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f18052o = 32;

    /* renamed from: p  reason: collision with root package name */
    public static final int f18053p = 33;

    /* renamed from: q  reason: collision with root package name */
    public static final int f18054q = 64;

    /* renamed from: r  reason: collision with root package name */
    public static final int f18055r = -87;

    /* renamed from: s  reason: collision with root package name */
    public static final int f18056s = 64;

    /* renamed from: t  reason: collision with root package name */
    public static final int f18057t = 24;

    /* renamed from: u  reason: collision with root package name */
    public static final int f18058u = 193;

    /* renamed from: v  reason: collision with root package name */
    public static final int f18059v = 200;

    /* renamed from: w  reason: collision with root package name */
    public static final int f18060w = 200;

    /* renamed from: x  reason: collision with root package name */
    public static final int f18061x = 35;

    /* renamed from: i  reason: collision with root package name */
    public final GpsStatus f18062i;
    @d.b0("mWrapped")

    /* renamed from: j  reason: collision with root package name */
    public int f18063j;
    @d.b0("mWrapped")

    /* renamed from: k  reason: collision with root package name */
    public Iterator<GpsSatellite> f18064k;
    @d.b0("mWrapped")

    /* renamed from: l  reason: collision with root package name */
    public int f18065l;
    @d.b0("mWrapped")

    /* renamed from: m  reason: collision with root package name */
    public GpsSatellite f18066m;

    public e(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) g1.s.l(gpsStatus);
        this.f18062i = gpsStatus2;
        this.f18063j = -1;
        this.f18064k = gpsStatus2.getSatellites().iterator();
        this.f18065l = -1;
        this.f18066m = null;
    }

    public static int p(int i7) {
        if (i7 <= 0 || i7 > 32) {
            if (i7 < 33 || i7 > 64) {
                if (i7 <= 64 || i7 > 88) {
                    if (i7 <= 200 || i7 > 235) {
                        return (i7 < 193 || i7 > 200) ? 0 : 4;
                    }
                    return 5;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static int r(int i7) {
        int p6 = p(i7);
        return p6 != 2 ? p6 != 3 ? p6 != 5 ? i7 : i7 - 200 : i7 - 64 : i7 + 87;
    }

    @Override // w0.a
    public float a(int i7) {
        return q(i7).getAzimuth();
    }

    @Override // w0.a
    public float b(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // w0.a
    public float c(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // w0.a
    public float d(int i7) {
        return q(i7).getSnr();
    }

    @Override // w0.a
    public int e(int i7) {
        return p(q(i7).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f18062i.equals(((e) obj).f18062i);
        }
        return false;
    }

    @Override // w0.a
    public float f(int i7) {
        return q(i7).getElevation();
    }

    @Override // w0.a
    public int g() {
        int i7;
        synchronized (this.f18062i) {
            if (this.f18063j == -1) {
                for (GpsSatellite gpsSatellite : this.f18062i.getSatellites()) {
                    this.f18063j++;
                }
                this.f18063j++;
            }
            i7 = this.f18063j;
        }
        return i7;
    }

    @Override // w0.a
    public int h(int i7) {
        return r(q(i7).getPrn());
    }

    public int hashCode() {
        return this.f18062i.hashCode();
    }

    @Override // w0.a
    public boolean i(int i7) {
        return q(i7).hasAlmanac();
    }

    @Override // w0.a
    public boolean j(int i7) {
        return false;
    }

    @Override // w0.a
    public boolean k(int i7) {
        return false;
    }

    @Override // w0.a
    public boolean l(int i7) {
        return q(i7).hasEphemeris();
    }

    @Override // w0.a
    public boolean m(int i7) {
        return q(i7).usedInFix();
    }

    public final GpsSatellite q(int i7) {
        GpsSatellite gpsSatellite;
        synchronized (this.f18062i) {
            if (i7 < this.f18065l) {
                this.f18064k = this.f18062i.getSatellites().iterator();
                this.f18065l = -1;
            }
            while (true) {
                int i8 = this.f18065l;
                if (i8 >= i7) {
                    break;
                }
                this.f18065l = i8 + 1;
                if (!this.f18064k.hasNext()) {
                    this.f18066m = null;
                    break;
                }
                this.f18066m = this.f18064k.next();
            }
            gpsSatellite = this.f18066m;
        }
        return (GpsSatellite) g1.s.l(gpsSatellite);
    }
}
