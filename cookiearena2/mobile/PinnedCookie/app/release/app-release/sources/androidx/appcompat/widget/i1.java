package androidx.appcompat.widget;
/* loaded from: classes.dex */
public class i1 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f1638i = Integer.MIN_VALUE;

    /* renamed from: a  reason: collision with root package name */
    public int f1639a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1640b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1641c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1642d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1643e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1644f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1645g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1646h = false;

    public int a() {
        return this.f1645g ? this.f1639a : this.f1640b;
    }

    public int b() {
        return this.f1639a;
    }

    public int c() {
        return this.f1640b;
    }

    public int d() {
        return this.f1645g ? this.f1640b : this.f1639a;
    }

    public void e(int i7, int i8) {
        this.f1646h = false;
        if (i7 != Integer.MIN_VALUE) {
            this.f1643e = i7;
            this.f1639a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f1644f = i8;
            this.f1640b = i8;
        }
    }

    public void f(boolean z6) {
        if (z6 == this.f1645g) {
            return;
        }
        this.f1645g = z6;
        if (!this.f1646h) {
            this.f1639a = this.f1643e;
            this.f1640b = this.f1644f;
        } else if (z6) {
            int i7 = this.f1642d;
            if (i7 == Integer.MIN_VALUE) {
                i7 = this.f1643e;
            }
            this.f1639a = i7;
            int i8 = this.f1641c;
            if (i8 == Integer.MIN_VALUE) {
                i8 = this.f1644f;
            }
            this.f1640b = i8;
        } else {
            int i9 = this.f1641c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = this.f1643e;
            }
            this.f1639a = i9;
            int i10 = this.f1642d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f1644f;
            }
            this.f1640b = i10;
        }
    }

    public void g(int i7, int i8) {
        this.f1641c = i7;
        this.f1642d = i8;
        this.f1646h = true;
        if (this.f1645g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f1639a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f1640b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f1639a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f1640b = i8;
        }
    }
}
