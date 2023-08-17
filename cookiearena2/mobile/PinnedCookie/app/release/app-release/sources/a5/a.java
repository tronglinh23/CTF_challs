package a5;

import e5.o;
import t4.q;
import u4.l0;
import u4.r1;
import v3.m2;
/* loaded from: classes.dex */
public final class a {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final a f217a = new a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    @r1({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,70:1\n*E\n"})
    /* renamed from: a5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0010a<T> extends c<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q<o<?>, T, T, m2> f218b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0010a(T t6, q<? super o<?>, ? super T, ? super T, m2> qVar) {
            super(t6);
            this.f218b = qVar;
        }

        @Override // a5.c
        public void c(@n6.d o<?> oVar, T t6, T t7) {
            l0.p(oVar, "property");
            this.f218b.I(oVar, t6, t7);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @r1({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,70:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b<T> extends c<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q<o<?>, T, T, Boolean> f219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t6, q<? super o<?>, ? super T, ? super T, Boolean> qVar) {
            super(t6);
            this.f219b = qVar;
        }

        @Override // a5.c
        public boolean d(@n6.d o<?> oVar, T t6, T t7) {
            l0.p(oVar, "property");
            return this.f219b.I(oVar, t6, t7).booleanValue();
        }
    }

    @n6.d
    public final <T> f<Object, T> a() {
        return new a5.b();
    }

    @n6.d
    public final <T> f<Object, T> b(T t6, @n6.d q<? super o<?>, ? super T, ? super T, m2> qVar) {
        l0.p(qVar, "onChange");
        return new C0010a(t6, qVar);
    }

    @n6.d
    public final <T> f<Object, T> c(T t6, @n6.d q<? super o<?>, ? super T, ? super T, Boolean> qVar) {
        l0.p(qVar, "onChange");
        return new b(t6, qVar);
    }
}
