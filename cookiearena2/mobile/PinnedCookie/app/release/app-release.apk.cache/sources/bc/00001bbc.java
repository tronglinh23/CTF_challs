package v;

import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends b {
    public a(char[] cArr) {
        super(cArr);
    }

    public static c v(char[] cArr) {
        return new a(cArr);
    }

    @Override // v.c
    public String s(int i7, int i8) {
        StringBuilder sb = new StringBuilder();
        String t6 = t();
        if (i8 > 0 || t6.length() + i7 >= c.f17593p) {
            sb.append("[\n");
            Iterator<c> it = this.f17592r.iterator();
            boolean z6 = true;
            while (it.hasNext()) {
                c next = it.next();
                if (z6) {
                    z6 = false;
                } else {
                    sb.append(",\n");
                }
                a(sb, c.f17594q + i7);
                sb.append(next.s(c.f17594q + i7, i8 - 1));
            }
            sb.append("\n");
            a(sb, i7);
            sb.append("]");
        } else {
            sb.append(t6);
        }
        return sb.toString();
    }

    @Override // v.c
    public String t() {
        StringBuilder sb = new StringBuilder(e() + "[");
        boolean z6 = true;
        for (int i7 = 0; i7 < this.f17592r.size(); i7++) {
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.f17592r.get(i7).t());
        }
        return ((Object) sb) + "]";
    }
}