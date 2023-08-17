package kotlinx.coroutines.flow;

/* loaded from: classes.dex */
public interface e0<T> extends t0<T>, d0<T> {
    @Override // kotlinx.coroutines.flow.t0
    T getValue();

    boolean h(T t6, T t7);

    void setValue(T t6);
}