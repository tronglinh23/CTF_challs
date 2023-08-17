package androidx.recyclerview.widget;

import d.o0;
/* loaded from: classes.dex */
public class f implements t {

    /* renamed from: f  reason: collision with root package name */
    public static final int f5313f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f5314g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f5315h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f5316i = 3;

    /* renamed from: a  reason: collision with root package name */
    public final t f5317a;

    /* renamed from: b  reason: collision with root package name */
    public int f5318b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f5319c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f5320d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Object f5321e = null;

    public f(@o0 t tVar) {
        this.f5317a = tVar;
    }

    @Override // androidx.recyclerview.widget.t
    public void a(int i7, int i8) {
        int i9;
        if (this.f5318b == 2 && (i9 = this.f5319c) >= i7 && i9 <= i7 + i8) {
            this.f5320d += i8;
            this.f5319c = i7;
            return;
        }
        e();
        this.f5319c = i7;
        this.f5320d = i8;
        this.f5318b = 2;
    }

    @Override // androidx.recyclerview.widget.t
    public void b(int i7, int i8) {
        e();
        this.f5317a.b(i7, i8);
    }

    @Override // androidx.recyclerview.widget.t
    public void c(int i7, int i8) {
        int i9;
        if (this.f5318b == 1 && i7 >= (i9 = this.f5319c)) {
            int i10 = this.f5320d;
            if (i7 <= i9 + i10) {
                this.f5320d = i10 + i8;
                this.f5319c = Math.min(i7, i9);
                return;
            }
        }
        e();
        this.f5319c = i7;
        this.f5320d = i8;
        this.f5318b = 1;
    }

    @Override // androidx.recyclerview.widget.t
    public void d(int i7, int i8, Object obj) {
        int i9;
        if (this.f5318b == 3) {
            int i10 = this.f5319c;
            int i11 = this.f5320d;
            if (i7 <= i10 + i11 && (i9 = i7 + i8) >= i10 && this.f5321e == obj) {
                this.f5319c = Math.min(i7, i10);
                this.f5320d = Math.max(i11 + i10, i9) - this.f5319c;
                return;
            }
        }
        e();
        this.f5319c = i7;
        this.f5320d = i8;
        this.f5321e = obj;
        this.f5318b = 3;
    }

    public void e() {
        int i7 = this.f5318b;
        if (i7 == 0) {
            return;
        }
        if (i7 == 1) {
            this.f5317a.c(this.f5319c, this.f5320d);
        } else if (i7 == 2) {
            this.f5317a.a(this.f5319c, this.f5320d);
        } else if (i7 == 3) {
            this.f5317a.d(this.f5319c, this.f5320d, this.f5321e);
        }
        this.f5321e = null;
        this.f5318b = 0;
    }
}
