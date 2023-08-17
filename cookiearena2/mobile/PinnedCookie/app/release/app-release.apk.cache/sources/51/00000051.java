package a6;

import u4.w;

/* loaded from: classes.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public static final a A = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public final int f237k;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        @n6.e
        public final b a(int i7) {
            for (b bVar : b.values()) {
                if (bVar.c() == i7) {
                    return bVar;
                }
            }
            return null;
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    b(int i7) {
        this.f237k = i7;
    }

    public final int c() {
        return this.f237k;
    }
}