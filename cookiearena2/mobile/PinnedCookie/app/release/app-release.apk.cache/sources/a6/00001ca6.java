package w0;

import android.location.GnssStatus;
import android.os.Build;
import d.b1;
import d.w0;

@b1({b1.a.LIBRARY})
@w0(24)
/* loaded from: classes.dex */
public class b extends w0.a {

    /* renamed from: i  reason: collision with root package name */
    public final GnssStatus f18044i;

    @w0(26)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static float a(GnssStatus gnssStatus, int i7) {
            return gnssStatus.getCarrierFrequencyHz(i7);
        }

        @d.u
        public static boolean b(GnssStatus gnssStatus, int i7) {
            return gnssStatus.hasCarrierFrequencyHz(i7);
        }
    }

    @w0(30)
    /* renamed from: w0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0256b {
        @d.u
        public static float a(GnssStatus gnssStatus, int i7) {
            float basebandCn0DbHz;
            basebandCn0DbHz = gnssStatus.getBasebandCn0DbHz(i7);
            return basebandCn0DbHz;
        }

        @d.u
        public static boolean b(GnssStatus gnssStatus, int i7) {
            boolean hasBasebandCn0DbHz;
            hasBasebandCn0DbHz = gnssStatus.hasBasebandCn0DbHz(i7);
            return hasBasebandCn0DbHz;
        }
    }

    public b(Object obj) {
        this.f18044i = (GnssStatus) g1.s.l((GnssStatus) obj);
    }

    @Override // w0.a
    public float a(int i7) {
        return this.f18044i.getAzimuthDegrees(i7);
    }

    @Override // w0.a
    public float b(int i7) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0256b.a(this.f18044i, i7);
        }
        throw new UnsupportedOperationException();
    }

    @Override // w0.a
    public float c(int i7) {
        return a.a(this.f18044i, i7);
    }

    @Override // w0.a
    public float d(int i7) {
        return this.f18044i.getCn0DbHz(i7);
    }

    @Override // w0.a
    public int e(int i7) {
        return this.f18044i.getConstellationType(i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f18044i.equals(((b) obj).f18044i);
        }
        return false;
    }

    @Override // w0.a
    public float f(int i7) {
        return this.f18044i.getElevationDegrees(i7);
    }

    @Override // w0.a
    public int g() {
        return this.f18044i.getSatelliteCount();
    }

    @Override // w0.a
    public int h(int i7) {
        return this.f18044i.getSvid(i7);
    }

    public int hashCode() {
        return this.f18044i.hashCode();
    }

    @Override // w0.a
    public boolean i(int i7) {
        return this.f18044i.hasAlmanacData(i7);
    }

    @Override // w0.a
    public boolean j(int i7) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0256b.b(this.f18044i, i7);
        }
        return false;
    }

    @Override // w0.a
    public boolean k(int i7) {
        return a.b(this.f18044i, i7);
    }

    @Override // w0.a
    public boolean l(int i7) {
        return this.f18044i.hasEphemerisData(i7);
    }

    @Override // w0.a
    public boolean m(int i7) {
        return this.f18044i.usedInFix(i7);
    }
}