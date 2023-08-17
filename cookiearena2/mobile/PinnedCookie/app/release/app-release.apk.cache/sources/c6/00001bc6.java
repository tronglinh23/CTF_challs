package v;

import z0.m;

/* loaded from: classes.dex */
public class h extends Exception {

    /* renamed from: k  reason: collision with root package name */
    public final String f17618k;

    /* renamed from: l  reason: collision with root package name */
    public final int f17619l;

    /* renamed from: m  reason: collision with root package name */
    public final String f17620m;

    public h(String str, c cVar) {
        this.f17618k = str;
        if (cVar != null) {
            this.f17620m = cVar.k();
            this.f17619l = cVar.i();
            return;
        }
        this.f17620m = m.f19022b;
        this.f17619l = 0;
    }

    public String a() {
        return this.f17618k + " (" + this.f17620m + " at line " + this.f17619l + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}