package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class a3 extends kotlinx.coroutines.internal.w implements g2 {
    @n6.d
    public final String b1(@n6.d String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z6 = true;
        for (kotlinx.coroutines.internal.y yVar = (kotlinx.coroutines.internal.y) I0(); !u4.l0.g(yVar, this); yVar = yVar.J0()) {
            if (yVar instanceof u2) {
                u2 u2Var = (u2) yVar;
                if (z6) {
                    z6 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(u2Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        u4.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlinx.coroutines.g2
    public boolean d() {
        return true;
    }

    @Override // kotlinx.coroutines.g2
    @n6.d
    public a3 j0() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.y
    @n6.d
    public String toString() {
        return super.toString();
    }
}
