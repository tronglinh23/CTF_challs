package v3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class x<T> implements d0<T>, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public final T f17837k;

    public x(T t6) {
        this.f17837k = t6;
    }

    @Override // v3.d0
    public boolean a() {
        return true;
    }

    @Override // v3.d0
    public T getValue() {
        return this.f17837k;
    }

    @n6.d
    public String toString() {
        return String.valueOf(getValue());
    }
}