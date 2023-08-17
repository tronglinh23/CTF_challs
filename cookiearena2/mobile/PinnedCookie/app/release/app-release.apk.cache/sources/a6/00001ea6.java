package z0;

/* loaded from: classes.dex */
public class z extends RuntimeException {
    public z() {
        this(null);
    }

    public z(@d.q0 String str) {
        super(g1.n.f(str, "The operation has been canceled."));
    }
}