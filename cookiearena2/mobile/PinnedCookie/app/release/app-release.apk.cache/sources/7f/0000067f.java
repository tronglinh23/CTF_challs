package androidx.recyclerview.widget;

import androidx.recyclerview.widget.i;
import d.b1;
import d.o0;
import d.q0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c<T> {
    @q0

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5239a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5240b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final i.d<T> f5241c;

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: d  reason: collision with root package name */
        public static final Object f5242d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public static Executor f5243e;
        @q0

        /* renamed from: a  reason: collision with root package name */
        public Executor f5244a;

        /* renamed from: b  reason: collision with root package name */
        public Executor f5245b;

        /* renamed from: c  reason: collision with root package name */
        public final i.d<T> f5246c;

        public a(@o0 i.d<T> dVar) {
            this.f5246c = dVar;
        }

        @o0
        public c<T> a() {
            if (this.f5245b == null) {
                synchronized (f5242d) {
                    if (f5243e == null) {
                        f5243e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f5245b = f5243e;
            }
            return new c<>(this.f5244a, this.f5245b, this.f5246c);
        }

        @o0
        public a<T> b(Executor executor) {
            this.f5245b = executor;
            return this;
        }

        @b1({b1.a.LIBRARY})
        @o0
        public a<T> c(Executor executor) {
            this.f5244a = executor;
            return this;
        }
    }

    public c(@q0 Executor executor, @o0 Executor executor2, @o0 i.d<T> dVar) {
        this.f5239a = executor;
        this.f5240b = executor2;
        this.f5241c = dVar;
    }

    @o0
    public Executor a() {
        return this.f5240b;
    }

    @o0
    public i.d<T> b() {
        return this.f5241c;
    }

    @b1({b1.a.LIBRARY})
    @q0
    public Executor c() {
        return this.f5239a;
    }
}