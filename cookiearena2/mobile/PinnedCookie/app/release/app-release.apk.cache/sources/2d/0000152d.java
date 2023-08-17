package kotlinx.coroutines.internal;

import kotlinx.coroutines.s3;

/* loaded from: classes.dex */
public final class c1 {
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public final e4.g f12788a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f12789b;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public final s3<Object>[] f12790c;

    /* renamed from: d  reason: collision with root package name */
    public int f12791d;

    public c1(@n6.d e4.g gVar, int i7) {
        this.f12788a = gVar;
        this.f12789b = new Object[i7];
        this.f12790c = new s3[i7];
    }

    public final void a(@n6.d s3<?> s3Var, @n6.e Object obj) {
        Object[] objArr = this.f12789b;
        int i7 = this.f12791d;
        objArr[i7] = obj;
        s3<Object>[] s3VarArr = this.f12790c;
        this.f12791d = i7 + 1;
        s3VarArr[i7] = s3Var;
    }

    public final void b(@n6.d e4.g gVar) {
        int length = this.f12790c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i7 = length - 1;
            s3<Object> s3Var = this.f12790c[length];
            u4.l0.m(s3Var);
            s3Var.E(gVar, this.f12789b[length]);
            if (i7 < 0) {
                return;
            }
            length = i7;
        }
    }
}