package y;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public int f18707a;

    /* renamed from: b  reason: collision with root package name */
    public int f18708b;

    /* renamed from: c  reason: collision with root package name */
    public int f18709c;

    /* renamed from: d  reason: collision with root package name */
    public int f18710d;

    public boolean a(int i7, int i8) {
        int i9;
        int i10 = this.f18707a;
        return i7 >= i10 && i7 < i10 + this.f18709c && i8 >= (i9 = this.f18708b) && i8 < i9 + this.f18710d;
    }

    public int b() {
        return (this.f18707a + this.f18709c) / 2;
    }

    public int c() {
        return (this.f18708b + this.f18710d) / 2;
    }

    public void d(int i7, int i8) {
        this.f18707a -= i7;
        this.f18708b -= i8;
        this.f18709c += i7 * 2;
        this.f18710d += i8 * 2;
    }

    public boolean e(m mVar) {
        int i7;
        int i8;
        int i9 = this.f18707a;
        int i10 = mVar.f18707a;
        return i9 >= i10 && i9 < i10 + mVar.f18709c && (i7 = this.f18708b) >= (i8 = mVar.f18708b) && i7 < i8 + mVar.f18710d;
    }

    public void f(int i7, int i8, int i9, int i10) {
        this.f18707a = i7;
        this.f18708b = i8;
        this.f18709c = i9;
        this.f18710d = i10;
    }
}