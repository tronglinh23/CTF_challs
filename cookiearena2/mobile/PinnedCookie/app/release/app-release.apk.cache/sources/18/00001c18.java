package v3;

/* loaded from: classes.dex */
public final class d {
    @g1(version = "1.5")
    @k4.f
    @q2(markerClass = {r.class})
    public static final char a(int i7) {
        if (i7 < 0 || i7 > 65535) {
            throw new IllegalArgumentException("Invalid Char code: " + i7);
        }
        return (char) i7;
    }

    public static final int b(char c7) {
        return c7;
    }

    @g1(version = "1.5")
    @k4.g
    @k4.f
    @q2(markerClass = {r.class})
    public static /* synthetic */ void c(char c7) {
    }
}