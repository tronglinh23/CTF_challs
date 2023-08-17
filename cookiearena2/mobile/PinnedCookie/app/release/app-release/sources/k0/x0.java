package k0;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import v3.m2;
/* loaded from: classes.dex */
public final class x0 {
    @SuppressLint({"ApplySharedPref"})
    public static final void a(@n6.d SharedPreferences sharedPreferences, boolean z6, @n6.d t4.l<? super SharedPreferences.Editor, m2> lVar) {
        u4.l0.p(sharedPreferences, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        u4.l0.o(edit, "editor");
        lVar.O(edit);
        if (z6) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, boolean z6, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        u4.l0.p(sharedPreferences, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        u4.l0.o(edit, "editor");
        lVar.O(edit);
        if (z6) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
