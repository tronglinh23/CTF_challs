package androidx.activity.result;

import d.o0;
/* loaded from: classes.dex */
public interface c {
    @o0
    <I, O> i<I> registerForActivityResult(@o0 c.a<I, O> aVar, @o0 ActivityResultRegistry activityResultRegistry, @o0 b<O> bVar);

    @o0
    <I, O> i<I> registerForActivityResult(@o0 c.a<I, O> aVar, @o0 b<O> bVar);
}
