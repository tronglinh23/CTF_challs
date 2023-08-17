package z0;

import android.os.LocaleList;
import java.util.Locale;

@d.w0(24)
/* loaded from: classes.dex */
public final class x implements w {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f19051a;

    public x(Object obj) {
        this.f19051a = (LocaleList) obj;
    }

    @Override // z0.w
    public String a() {
        return this.f19051a.toLanguageTags();
    }

    @Override // z0.w
    public Object b() {
        return this.f19051a;
    }

    @Override // z0.w
    public int c(Locale locale) {
        return this.f19051a.indexOf(locale);
    }

    @Override // z0.w
    @d.q0
    public Locale d(@d.o0 String[] strArr) {
        return this.f19051a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.f19051a.equals(((w) obj).b());
    }

    @Override // z0.w
    public Locale get(int i7) {
        return this.f19051a.get(i7);
    }

    public int hashCode() {
        return this.f19051a.hashCode();
    }

    @Override // z0.w
    public boolean isEmpty() {
        return this.f19051a.isEmpty();
    }

    @Override // z0.w
    public int size() {
        return this.f19051a.size();
    }

    public String toString() {
        return this.f19051a.toString();
    }
}