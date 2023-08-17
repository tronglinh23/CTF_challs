package v;
/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: r  reason: collision with root package name */
    public float f17601r;

    public e(char[] cArr) {
        super(cArr);
        this.f17601r = Float.NaN;
    }

    public static c u(char[] cArr) {
        return new e(cArr);
    }

    @Override // v.c
    public float g() {
        if (Float.isNaN(this.f17601r)) {
            this.f17601r = Float.parseFloat(b());
        }
        return this.f17601r;
    }

    @Override // v.c
    public int h() {
        if (Float.isNaN(this.f17601r)) {
            this.f17601r = Integer.parseInt(b());
        }
        return (int) this.f17601r;
    }

    @Override // v.c
    public String s(int i7, int i8) {
        StringBuilder sb = new StringBuilder();
        a(sb, i7);
        float g7 = g();
        int i9 = (int) g7;
        if (i9 == g7) {
            sb.append(i9);
        } else {
            sb.append(g7);
        }
        return sb.toString();
    }

    @Override // v.c
    public String t() {
        float g7 = g();
        int i7 = (int) g7;
        if (i7 == g7) {
            return "" + i7;
        }
        return "" + g7;
    }

    public boolean v() {
        float g7 = g();
        return ((float) ((int) g7)) == g7;
    }

    public void w(float f7) {
        this.f17601r = f7;
    }

    public e(float f7) {
        super(null);
        this.f17601r = f7;
    }
}
