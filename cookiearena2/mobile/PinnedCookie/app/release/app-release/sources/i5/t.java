package i5;

import u4.l0;
import v3.g1;
import v3.q2;
/* loaded from: classes.dex */
public class t {
    @n6.d
    public static final <T extends Appendable> T a(@n6.d T t6, @n6.d CharSequence... charSequenceArr) {
        l0.p(t6, "<this>");
        l0.p(charSequenceArr, "value");
        for (CharSequence charSequence : charSequenceArr) {
            t6.append(charSequence);
        }
        return t6;
    }

    public static final <T> void b(@n6.d Appendable appendable, T t6, @n6.e t4.l<? super T, ? extends CharSequence> lVar) {
        l0.p(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.O(t6));
            return;
        }
        if (t6 == null ? true : t6 instanceof CharSequence) {
            appendable.append((CharSequence) t6);
        } else if (t6 instanceof Character) {
            appendable.append(((Character) t6).charValue());
        } else {
            appendable.append(String.valueOf(t6));
        }
    }

    @g1(version = "1.4")
    @k4.f
    public static final Appendable c(Appendable appendable) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append('\n');
        l0.o(append, "append('\\n')");
        return append;
    }

    @g1(version = "1.4")
    @k4.f
    public static final Appendable d(Appendable appendable, char c7) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(c7);
        l0.o(append, "append(value)");
        Appendable append2 = append.append('\n');
        l0.o(append2, "append('\\n')");
        return append2;
    }

    @g1(version = "1.4")
    @k4.f
    public static final Appendable e(Appendable appendable, CharSequence charSequence) {
        l0.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        l0.o(append, "append(value)");
        Appendable append2 = append.append('\n');
        l0.o(append2, "append('\\n')");
        return append2;
    }

    @g1(version = "1.4")
    @n6.d
    @q2(markerClass = {v3.r.class})
    public static final <T extends Appendable> T f(@n6.d T t6, @n6.d CharSequence charSequence, int i7, int i8) {
        l0.p(t6, "<this>");
        l0.p(charSequence, "value");
        T t7 = (T) t6.append(charSequence, i7, i8);
        l0.n(t7, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t7;
    }
}
