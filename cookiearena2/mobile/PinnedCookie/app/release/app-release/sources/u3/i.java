package u3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import u4.l0;
import x3.e0;
@t3.d
/* loaded from: classes.dex */
public final class i {
    public static final boolean l(i iVar, Set set, Pair pair) {
        l0.p(iVar, "this$0");
        l0.p(set, "$splitPairFilters");
        l0.o(pair, "(first, second)");
        Activity activity = (Activity) iVar.f(pair);
        Intent intent = (Intent) iVar.g(pair);
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).d(activity, intent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean n(i iVar, Set set, Pair pair) {
        l0.p(iVar, "this$0");
        l0.p(set, "$splitPairFilters");
        l0.o(pair, "(first, second)");
        Activity activity = (Activity) iVar.f(pair);
        Activity activity2 = (Activity) iVar.g(pair);
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).e(activity, activity2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean p(Set set, Activity activity) {
        l0.p(set, "$activityFilters");
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            l0.o(activity, androidx.appcompat.widget.d.f1516r);
            if (aVar.c(activity)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(Set set, Intent intent) {
        l0.p(set, "$activityFilters");
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            l0.o(intent, "intent");
            if (aVar.d(intent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean t(y yVar, WindowMetrics windowMetrics) {
        l0.p(yVar, "$splitRule");
        l0.o(windowMetrics, "windowMetrics");
        return yVar.a(windowMetrics);
    }

    public final <F, S> F f(Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (F) pair.first;
    }

    public final <F, S> S g(Pair<F, S> pair) {
        l0.p(pair, "<this>");
        return (S) pair.second;
    }

    @n6.d
    public final List<t> h(@n6.d List<? extends SplitInfo> list) {
        l0.p(list, "splitInfoList");
        ArrayList arrayList = new ArrayList(x3.x.Y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((SplitInfo) it.next()));
        }
        return arrayList;
    }

    @n6.d
    public final Set<EmbeddingRule> i(@n6.d Set<? extends m> set) {
        SplitPairRule build;
        l0.p(set, "rules");
        ArrayList arrayList = new ArrayList(x3.x.Y(set, 10));
        for (m mVar : set) {
            if (mVar instanceof v) {
                v vVar = (v) mVar;
                build = new SplitPairRule.Builder(m(vVar.g()), k(vVar.g()), s((y) mVar)).setSplitRatio(vVar.e()).setLayoutDirection(vVar.b()).setShouldFinishPrimaryWithSecondary(vVar.h()).setShouldFinishSecondaryWithPrimary(vVar.i()).setShouldClearTop(vVar.f()).build();
                l0.o(build, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (mVar instanceof w) {
                w wVar = (w) mVar;
                build = new SplitPlaceholderRule.Builder(wVar.g(), o(wVar.f()), q(wVar.f()), s((y) mVar)).setSplitRatio(wVar.e()).setLayoutDirection(wVar.b()).build();
                l0.o(build, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (!(mVar instanceof b)) {
                throw new IllegalArgumentException("Unsupported rule type");
            } else {
                b bVar = (b) mVar;
                build = new ActivityRule.Builder(o(bVar.b()), q(bVar.b())).setShouldAlwaysExpand(bVar.a()).build();
                l0.o(build, "ActivityRuleBuilder(\n   …                 .build()");
            }
            arrayList.add((EmbeddingRule) build);
        }
        return e0.V5(arrayList);
    }

    public final t j(SplitInfo splitInfo) {
        boolean z6;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        l0.o(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z7 = false;
        try {
            z6 = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z6 = false;
        }
        List activities = primaryActivityStack.getActivities();
        l0.o(activities, "primaryActivityStack.activities");
        c cVar = new c(activities, z6);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        l0.o(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z7 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        l0.o(activities2, "secondaryActivityStack.activities");
        return new t(cVar, new c(activities2, z7), splitInfo.getSplitRatio());
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Intent>> k(@n6.d final Set<u> set) {
        l0.p(set, "splitPairFilters");
        return new Predicate() { // from class: u3.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean l7;
                l7 = i.l(i.this, set, (Pair) obj);
                return l7;
            }
        };
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Pair<Activity, Activity>> m(@n6.d final Set<u> set) {
        l0.p(set, "splitPairFilters");
        return new Predicate() { // from class: u3.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean n7;
                n7 = i.n(i.this, set, (Pair) obj);
                return n7;
            }
        };
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Activity> o(@n6.d final Set<a> set) {
        l0.p(set, "activityFilters");
        return new Predicate() { // from class: u3.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean p6;
                p6 = i.p(set, (Activity) obj);
                return p6;
            }
        };
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<Intent> q(@n6.d final Set<a> set) {
        l0.p(set, "activityFilters");
        return new Predicate() { // from class: u3.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean r6;
                r6 = i.r(set, (Intent) obj);
                return r6;
            }
        };
    }

    @n6.d
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public final Predicate<WindowMetrics> s(@n6.d final y yVar) {
        l0.p(yVar, "splitRule");
        return new Predicate() { // from class: u3.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean t6;
                t6 = i.t(y.this, (WindowMetrics) obj);
                return t6;
            }
        };
    }
}
