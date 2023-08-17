package c;

import android.content.Context;
import android.content.Intent;
import n6.e;
import u4.l0;

/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0084a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f7275a;

        public C0084a(T t6) {
            this.f7275a = t6;
        }

        public final T a() {
            return this.f7275a;
        }
    }

    @n6.d
    public abstract Intent a(@n6.d Context context, I i7);

    @e
    public C0084a<O> b(@n6.d Context context, I i7) {
        l0.p(context, "context");
        return null;
    }

    public abstract O c(int i7, @e Intent intent);
}