package s;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import u.v;
/* loaded from: classes.dex */
public class c extends b {
    public static final String P = "KeyAttribute";
    public static final String Q = "KeyAttributes";
    public static final boolean R = false;
    public static final int S = 1;

    /* renamed from: y  reason: collision with root package name */
    public String f16157y;

    /* renamed from: z  reason: collision with root package name */
    public int f16158z = -1;
    public int A = 0;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = Float.NaN;

    public c() {
        this.f16155k = 1;
        this.f16156l = new HashMap<>();
    }

    @Override // u.v
    public int a(String str) {
        return v.a.a(str);
    }

    @Override // s.b, u.v
    public boolean b(int i7, int i8) {
        if (i7 == 100) {
            this.f16152h = i8;
            return true;
        } else if (i7 == 301) {
            this.f16158z = i8;
            return true;
        } else if (i7 == 302) {
            this.A = i8;
            return true;
        } else if (b(i7, i8)) {
            return true;
        } else {
            return super.b(i7, i8);
        }
    }

    @Override // s.b, u.v
    public boolean c(int i7, float f7) {
        if (i7 == 100) {
            this.I = f7;
            return true;
        }
        switch (i7) {
            case 303:
                this.B = f7;
                return true;
            case 304:
                this.L = f7;
                return true;
            case 305:
                this.M = f7;
                return true;
            case 306:
                this.N = f7;
                return true;
            case 307:
                this.C = f7;
                return true;
            case 308:
                this.E = f7;
                return true;
            case 309:
                this.F = f7;
                return true;
            case 310:
                this.D = f7;
                return true;
            case 311:
                this.J = f7;
                return true;
            case 312:
                this.K = f7;
                return true;
            case 313:
                this.G = f7;
                return true;
            case 314:
                this.H = f7;
                return true;
            case 315:
                this.O = f7;
                return true;
            case v.a.f17126q /* 316 */:
                this.I = f7;
                return true;
            default:
                return super.c(i7, f7);
        }
    }

    @Override // s.b, u.v
    public boolean d(int i7, String str) {
        if (i7 == 101) {
            this.f16154j = str;
            return true;
        } else if (i7 != 317) {
            return super.d(i7, str);
        } else {
            this.f16157y = str;
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r1.equals("pivotX") == false) goto L15;
     */
    @Override // s.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.HashMap<java.lang.String, u.o> r7) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c.f(java.util.HashMap):void");
    }

    @Override // s.b
    /* renamed from: g */
    public b clone() {
        return null;
    }

    @Override // s.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("progress");
        }
        if (this.f16156l.size() > 0) {
            Iterator<String> it = this.f16156l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // s.b
    public void q(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.B)) {
            hashMap.put("alpha", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.C)) {
            hashMap.put("elevation", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.D)) {
            hashMap.put("rotationZ", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.E)) {
            hashMap.put("rotationX", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.F)) {
            hashMap.put("rotationY", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("pivotX", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.H)) {
            hashMap.put("pivotY", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("translationX", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.M)) {
            hashMap.put("translationY", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.N)) {
            hashMap.put("translationZ", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.I)) {
            hashMap.put("pathRotate", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.J)) {
            hashMap.put("scaleX", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.K)) {
            hashMap.put("scaleY", Integer.valueOf(this.f16158z));
        }
        if (!Float.isNaN(this.O)) {
            hashMap.put("progress", Integer.valueOf(this.f16158z));
        }
        if (this.f16156l.size() > 0) {
            Iterator<String> it = this.f16156l.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.f16158z));
            }
        }
    }

    public int v() {
        return this.f16158z;
    }

    public final float w(int i7) {
        if (i7 != 100) {
            switch (i7) {
                case 303:
                    return this.B;
                case 304:
                    return this.L;
                case 305:
                    return this.M;
                case 306:
                    return this.N;
                case 307:
                    return this.C;
                case 308:
                    return this.E;
                case 309:
                    return this.F;
                case 310:
                    return this.D;
                case 311:
                    return this.J;
                case 312:
                    return this.K;
                case 313:
                    return this.G;
                case 314:
                    return this.H;
                case 315:
                    return this.O;
                case v.a.f17126q /* 316 */:
                    return this.I;
                default:
                    return Float.NaN;
            }
        }
        return this.f16152h;
    }

    public void x() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        System.out.println(" ------------- " + this.f16152h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            int a7 = v.a.a(strArr[i7]);
            System.out.println(strArr[i7] + ":" + w(a7));
        }
    }
}
