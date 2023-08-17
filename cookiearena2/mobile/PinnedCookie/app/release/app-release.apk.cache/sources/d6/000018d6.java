package p5;

import kotlinx.coroutines.i2;

@i2
/* loaded from: classes.dex */
public interface r<T> extends kotlinx.coroutines.flow.i<T> {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ kotlinx.coroutines.flow.i a(r rVar, e4.g gVar, int i7, n5.m mVar, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    gVar = e4.i.f8770k;
                }
                if ((i8 & 2) != 0) {
                    i7 = -3;
                }
                if ((i8 & 4) != 0) {
                    mVar = n5.m.SUSPEND;
                }
                return rVar.c(gVar, i7, mVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @n6.d
    kotlinx.coroutines.flow.i<T> c(@n6.d e4.g gVar, int i7, @n6.d n5.m mVar);
}