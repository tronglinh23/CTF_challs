package i5;

import u4.l0;
import v3.b1;
import v3.g1;
import v3.k0;
import v3.m2;
/* loaded from: classes.dex */
public class y extends x {
    @v3.k(level = v3.m.WARNING, message = "Use append(value: Any?) instead", replaceWith = @b1(expression = "append(value = obj)", imports = {}))
    @k4.f
    public static final StringBuilder h0(StringBuilder sb, Object obj) {
        l0.p(sb, "<this>");
        sb.append(obj);
        l0.o(sb, "this.append(obj)");
        return sb;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String, u4.w] */
    @v3.k(level = v3.m.ERROR, message = "Use appendRange instead.", replaceWith = @b1(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @k4.f
    public static final StringBuilder i0(StringBuilder sb, char[] cArr, int i7, int i8) {
        l0.p(sb, "<this>");
        l0.p(cArr, "str");
        ?? r12 = 0;
        throw new k0(r12, 1, r12);
    }

    @n6.d
    public static final StringBuilder j0(@n6.d StringBuilder sb, @n6.d Object... objArr) {
        l0.p(sb, "<this>");
        l0.p(objArr, "value");
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }

    @n6.d
    public static final StringBuilder k0(@n6.d StringBuilder sb, @n6.d String... strArr) {
        l0.p(sb, "<this>");
        l0.p(strArr, "value");
        for (String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder l0(StringBuilder sb) {
        l0.p(sb, "<this>");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder m0(StringBuilder sb, char c7) {
        l0.p(sb, "<this>");
        sb.append(c7);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder n0(StringBuilder sb, CharSequence charSequence) {
        l0.p(sb, "<this>");
        sb.append(charSequence);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder o0(StringBuilder sb, Object obj) {
        l0.p(sb, "<this>");
        sb.append(obj);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder p0(StringBuilder sb, String str) {
        l0.p(sb, "<this>");
        sb.append(str);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder q0(StringBuilder sb, boolean z6) {
        l0.p(sb, "<this>");
        sb.append(z6);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder r0(StringBuilder sb, char[] cArr) {
        l0.p(sb, "<this>");
        l0.p(cArr, "value");
        sb.append(cArr);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.1")
    @k4.f
    public static final String s0(int i7, t4.l<? super StringBuilder, m2> lVar) {
        l0.p(lVar, "builderAction");
        StringBuilder sb = new StringBuilder(i7);
        lVar.O(sb);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @k4.f
    public static final String t0(t4.l<? super StringBuilder, m2> lVar) {
        l0.p(lVar, "builderAction");
        StringBuilder sb = new StringBuilder();
        lVar.O(sb);
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
