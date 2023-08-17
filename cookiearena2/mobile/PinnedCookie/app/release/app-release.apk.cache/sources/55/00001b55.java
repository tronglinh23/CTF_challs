package u4;

import java.io.Serializable;

@v3.g1(version = "1.7")
/* loaded from: classes.dex */
public class c0 extends g0 implements Serializable {

    /* renamed from: t  reason: collision with root package name */
    public final Class f17404t;

    public c0(Class cls) {
        super(1);
        this.f17404t = cls;
    }

    @Override // u4.g0, u4.q
    /* renamed from: B0 */
    public e5.i z0() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override // u4.g0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f17404t.equals(((c0) obj).f17404t);
        }
        return false;
    }

    @Override // u4.g0
    public int hashCode() {
        return this.f17404t.hashCode();
    }

    @Override // u4.g0
    public String toString() {
        return "fun interface " + this.f17404t.getName();
    }
}