package i5;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import u4.l0;
import u4.n0;
import u4.r1;
@r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,398:1\n1789#2,3:399\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt\n*L\n19#1:399,3\n*E\n"})
/* loaded from: classes.dex */
public final class p {

    @r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,398:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a<T> extends n0 implements t4.l<T, Boolean> {

        /* renamed from: l */
        public final /* synthetic */ int f11147l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i7) {
            super(1);
            this.f11147l = i7;
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b */
        public final Boolean O(Enum r32) {
            i iVar = (i) r32;
            return Boolean.valueOf((this.f11147l & iVar.c()) == iVar.getValue());
        }
    }

    public static final /* synthetic */ m a(Matcher matcher, int i7, CharSequence charSequence) {
        return f(matcher, i7, charSequence);
    }

    public static final /* synthetic */ d5.l c(MatchResult matchResult) {
        return i(matchResult);
    }

    public static final /* synthetic */ d5.l d(MatchResult matchResult, int i7) {
        return j(matchResult, i7);
    }

    public static final m f(Matcher matcher, int i7, CharSequence charSequence) {
        if (matcher.find(i7)) {
            return new n(matcher, charSequence);
        }
        return null;
    }

    public static final /* synthetic */ <T extends Enum<T> & i> Set<T> g(int i7) {
        l0.y(4, "T");
        EnumSet allOf = EnumSet.allOf(Enum.class);
        l0.o(allOf, "fromInt$lambda$1");
        l0.w();
        x3.b0.N0(allOf, new a(i7));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        l0.o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return unmodifiableSet;
    }

    public static final m h(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new n(matcher, charSequence);
        }
        return null;
    }

    public static final d5.l i(MatchResult matchResult) {
        return d5.u.W1(matchResult.start(), matchResult.end());
    }

    public static final d5.l j(MatchResult matchResult, int i7) {
        return d5.u.W1(matchResult.start(i7), matchResult.end(i7));
    }

    public static final int k(Iterable<? extends i> iterable) {
        Iterator<? extends i> it = iterable.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 |= it.next().getValue();
        }
        return i7;
    }
}
