package v;

/* loaded from: classes.dex */
public class i extends c {
    public i(char[] cArr) {
        super(cArr);
    }

    public static c u(char[] cArr) {
        return new i(cArr);
    }

    @Override // v.c
    public String s(int i7, int i8) {
        StringBuilder sb = new StringBuilder();
        a(sb, i7);
        sb.append("'");
        sb.append(b());
        sb.append("'");
        return sb.toString();
    }

    @Override // v.c
    public String t() {
        return "'" + b() + "'";
    }
}