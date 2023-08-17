package h4;

import v3.g1;

@g1(version = "1.3")
/* loaded from: classes.dex */
public abstract class j extends a {
    public j(@n6.e e4.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.g() == e4.i.f8770k)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // e4.d
    @n6.d
    public e4.g g() {
        return e4.i.f8770k;
    }
}