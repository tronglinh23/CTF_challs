package q1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import d.q0;
import d.w0;

@w0(19)
/* loaded from: classes.dex */
public class d extends a {

    /* renamed from: c  reason: collision with root package name */
    public Context f15156c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f15157d;

    public d(@q0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f15156c = context;
        this.f15157d = uri;
    }

    @Override // q1.a
    public boolean a() {
        return b.a(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    public boolean b() {
        return b.b(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // q1.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // q1.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f15156c.getContentResolver(), this.f15157d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // q1.a
    public boolean f() {
        return b.d(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    @q0
    public String k() {
        return b.f(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    @q0
    public String m() {
        return b.h(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    public Uri n() {
        return this.f15157d;
    }

    @Override // q1.a
    public boolean o() {
        return b.i(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    public boolean q() {
        return b.j(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    public boolean r() {
        return b.k(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    public long s() {
        return b.l(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    public long t() {
        return b.m(this.f15156c, this.f15157d);
    }

    @Override // q1.a
    public a[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // q1.a
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}