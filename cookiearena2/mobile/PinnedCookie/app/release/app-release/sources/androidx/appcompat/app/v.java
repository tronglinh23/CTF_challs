package androidx.appcompat.app;

import android.os.LocaleList;
import d.w0;
import java.util.LinkedHashSet;
import java.util.Locale;
@w0(24)
/* loaded from: classes.dex */
public final class v {
    public static z0.u a(z0.u uVar, z0.u uVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i7 = 0;
        while (i7 < uVar.l() + uVar2.l()) {
            Locale d7 = i7 < uVar.l() ? uVar.d(i7) : uVar2.d(i7 - uVar.l());
            if (d7 != null) {
                linkedHashSet.add(d7);
            }
            i7++;
        }
        return z0.u.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static z0.u b(LocaleList localeList, LocaleList localeList2) {
        return (localeList == null || localeList.isEmpty()) ? z0.u.g() : a(z0.u.o(localeList), z0.u.o(localeList2));
    }

    public static z0.u c(z0.u uVar, z0.u uVar2) {
        return (uVar == null || uVar.j()) ? z0.u.g() : a(uVar, uVar2);
    }
}
