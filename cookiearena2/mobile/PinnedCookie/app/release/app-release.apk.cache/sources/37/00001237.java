package i5;

import u4.l0;
import u4.r1;
import v3.b1;
import v3.g1;
import v3.q2;

@r1({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
/* loaded from: classes.dex */
public class x extends w {
    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder A(StringBuilder sb, long j7) {
        l0.p(sb, "<this>");
        sb.append(j7);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder B(StringBuilder sb, StringBuffer stringBuffer) {
        l0.p(sb, "<this>");
        sb.append(stringBuffer);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder C(StringBuilder sb, StringBuilder sb2) {
        l0.p(sb, "<this>");
        sb.append((CharSequence) sb2);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder D(StringBuilder sb, short s6) {
        l0.p(sb, "<this>");
        sb.append((int) s6);
        l0.o(sb, "append(value.toInt())");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final StringBuilder E(StringBuilder sb, CharSequence charSequence, int i7, int i8) {
        l0.p(sb, "<this>");
        l0.p(charSequence, "value");
        sb.append(charSequence, i7, i8);
        l0.o(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final StringBuilder F(StringBuilder sb, char[] cArr, int i7, int i8) {
        l0.p(sb, "<this>");
        l0.p(cArr, "value");
        sb.append(cArr, i7, i8 - i7);
        l0.o(sb, "this.append(value, start…x, endIndex - startIndex)");
        return sb;
    }

    @n6.d
    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine()", imports = {}))
    public static final Appendable G(@n6.d Appendable appendable) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(f0.f11081b);
        l0.o(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final Appendable H(Appendable appendable, char c7) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(c7);
        l0.o(append, "append(value)");
        return G(append);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final Appendable I(Appendable appendable, CharSequence charSequence) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        l0.o(append, "append(value)");
        return G(append);
    }

    @n6.d
    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine()", imports = {}))
    public static final StringBuilder J(@n6.d StringBuilder sb) {
        l0.p(sb, "<this>");
        sb.append(f0.f11081b);
        l0.o(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder K(StringBuilder sb, byte b7) {
        l0.p(sb, "<this>");
        sb.append((int) b7);
        l0.o(sb, "append(value.toInt())");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder L(StringBuilder sb, char c7) {
        l0.p(sb, "<this>");
        sb.append(c7);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder M(StringBuilder sb, double d7) {
        l0.p(sb, "<this>");
        sb.append(d7);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder N(StringBuilder sb, float f7) {
        l0.p(sb, "<this>");
        sb.append(f7);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder O(StringBuilder sb, int i7) {
        l0.p(sb, "<this>");
        sb.append(i7);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder P(StringBuilder sb, long j7) {
        l0.p(sb, "<this>");
        sb.append(j7);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder Q(StringBuilder sb, CharSequence charSequence) {
        l0.p(sb, "<this>");
        sb.append(charSequence);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder R(StringBuilder sb, Object obj) {
        l0.p(sb, "<this>");
        sb.append(obj);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder S(StringBuilder sb, String str) {
        l0.p(sb, "<this>");
        sb.append(str);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder T(StringBuilder sb, StringBuffer stringBuffer) {
        l0.p(sb, "<this>");
        sb.append(stringBuffer);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder U(StringBuilder sb, StringBuilder sb2) {
        l0.p(sb, "<this>");
        sb.append((CharSequence) sb2);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder V(StringBuilder sb, short s6) {
        l0.p(sb, "<this>");
        sb.append((int) s6);
        l0.o(sb, "append(value.toInt())");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder W(StringBuilder sb, boolean z6) {
        l0.p(sb, "<this>");
        sb.append(z6);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @v3.k(level = v3.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @b1(expression = "appendLine(value)", imports = {}))
    @k4.f
    public static final StringBuilder X(StringBuilder sb, char[] cArr) {
        l0.p(sb, "<this>");
        l0.p(cArr, "value");
        sb.append(cArr);
        l0.o(sb, "append(value)");
        return J(sb);
    }

    @g1(version = "1.3")
    @n6.d
    public static final StringBuilder Y(@n6.d StringBuilder sb) {
        l0.p(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final StringBuilder Z(StringBuilder sb, int i7) {
        l0.p(sb, "<this>");
        StringBuilder deleteCharAt = sb.deleteCharAt(i7);
        l0.o(deleteCharAt, "this.deleteCharAt(index)");
        return deleteCharAt;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final StringBuilder a0(StringBuilder sb, int i7, int i8) {
        l0.p(sb, "<this>");
        StringBuilder delete = sb.delete(i7, i8);
        l0.o(delete, "this.delete(startIndex, endIndex)");
        return delete;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final StringBuilder b0(StringBuilder sb, int i7, CharSequence charSequence, int i8, int i9) {
        l0.p(sb, "<this>");
        l0.p(charSequence, "value");
        StringBuilder insert = sb.insert(i7, charSequence, i8, i9);
        l0.o(insert, "this.insert(index, value, startIndex, endIndex)");
        return insert;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final StringBuilder c0(StringBuilder sb, int i7, char[] cArr, int i8, int i9) {
        l0.p(sb, "<this>");
        l0.p(cArr, "value");
        StringBuilder insert = sb.insert(i7, cArr, i8, i9 - i8);
        l0.o(insert, "this.insert(index, value…x, endIndex - startIndex)");
        return insert;
    }

    @k4.f
    public static final void d0(StringBuilder sb, int i7, char c7) {
        l0.p(sb, "<this>");
        sb.setCharAt(i7, c7);
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final StringBuilder e0(StringBuilder sb, int i7, int i8, String str) {
        l0.p(sb, "<this>");
        l0.p(str, "value");
        StringBuilder replace = sb.replace(i7, i8, str);
        l0.o(replace, "this.replace(startIndex, endIndex, value)");
        return replace;
    }

    @g1(version = "1.4")
    @k4.f
    @q2(markerClass = {v3.r.class})
    public static final void f0(StringBuilder sb, char[] cArr, int i7, int i8, int i9) {
        l0.p(sb, "<this>");
        l0.p(cArr, "destination");
        sb.getChars(i8, i9, cArr, i7);
    }

    public static /* synthetic */ void g0(StringBuilder sb, char[] cArr, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = sb.length();
        }
        l0.p(sb, "<this>");
        l0.p(cArr, "destination");
        sb.getChars(i8, i9, cArr, i7);
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder w(StringBuilder sb, byte b7) {
        l0.p(sb, "<this>");
        sb.append((int) b7);
        l0.o(sb, "append(value.toInt())");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder x(StringBuilder sb, double d7) {
        l0.p(sb, "<this>");
        sb.append(d7);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder y(StringBuilder sb, float f7) {
        l0.p(sb, "<this>");
        sb.append(f7);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }

    @g1(version = "1.4")
    @k4.f
    public static final StringBuilder z(StringBuilder sb, int i7) {
        l0.p(sb, "<this>");
        sb.append(i7);
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        return sb;
    }
}