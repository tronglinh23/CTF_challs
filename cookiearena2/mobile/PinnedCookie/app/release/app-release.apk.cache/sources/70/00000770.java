package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: b  reason: collision with root package name */
    public View f6757b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f6756a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<j0> f6758c = new ArrayList<>();

    @Deprecated
    public r0() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            return this.f6757b == r0Var.f6757b && this.f6756a.equals(r0Var.f6756a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f6757b.hashCode() * 31) + this.f6756a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f6757b + "\n") + "    values:";
        for (String str2 : this.f6756a.keySet()) {
            str = str + "    " + str2 + ": " + this.f6756a.get(str2) + "\n";
        }
        return str;
    }

    public r0(@d.o0 View view) {
        this.f6757b = view;
    }
}