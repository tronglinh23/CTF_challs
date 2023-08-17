package b3;

/* loaded from: classes.dex */
public enum d {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    

    /* renamed from: k  reason: collision with root package name */
    public final long f7192k;

    d(long j7) {
        this.f7192k = j7;
    }

    public static d d(long j7) {
        d[] values = values();
        for (int i7 = 0; i7 < values.length; i7++) {
            if (values[i7].e() == j7) {
                return values[i7];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j7);
    }

    public long e() {
        return this.f7192k;
    }
}