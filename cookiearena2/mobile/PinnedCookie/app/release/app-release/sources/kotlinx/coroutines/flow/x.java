package kotlinx.coroutines.flow;

import kotlinx.coroutines.f1;
import v3.b1;
import v3.e1;
import v3.m2;
/* loaded from: classes.dex */
public final /* synthetic */ class x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a<T> extends h4.o implements t4.p<T, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12632o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ long f12633p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f12633p = j7;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new a(this.f12633p, dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12632o;
            if (i7 == 0) {
                e1.n(obj);
                long j7 = this.f12633p;
                this.f12632o = 1;
                if (f1.b(j7, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(T t6, @n6.e e4.d<? super m2> dVar) {
            return ((a) H(t6, dVar)).Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class b<T> extends h4.o implements t4.p<j<? super T>, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12634o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ long f12635p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j7, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f12635p = j7;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            return new b(this.f12635p, dVar);
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12634o;
            if (i7 == 0) {
                e1.n(obj);
                long j7 = this.f12635p;
                this.f12634o = 1;
                if (f1.b(j7, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.p
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d j<? super T> jVar, @n6.e e4.d<? super m2> dVar) {
            return ((b) H(jVar, dVar)).Q(m2.f17815a);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends u4.n0 implements t4.l<Throwable, Boolean> {

        /* renamed from: l  reason: collision with root package name */
        public static final c f12636l = new c();

        public c() {
            super(1);
        }

        @Override // t4.l
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Boolean O(@n6.d Throwable th) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class d<T> extends h4.o implements t4.q<j<? super T>, Throwable, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12637o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12638p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f12639q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ t4.l<Throwable, Boolean> f12640r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ T f12641s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(t4.l<? super Throwable, Boolean> lVar, T t6, e4.d<? super d> dVar) {
            super(3, dVar);
            this.f12640r = lVar;
            this.f12641s = t6;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            Object h7 = g4.d.h();
            int i7 = this.f12637o;
            if (i7 == 0) {
                e1.n(obj);
                j jVar = (j) this.f12638p;
                Throwable th = (Throwable) this.f12639q;
                if (!this.f12640r.O(th).booleanValue()) {
                    throw th;
                }
                T t6 = this.f12641s;
                this.f12638p = null;
                this.f12637o = 1;
                if (jVar.f(t6, this) == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e1.n(obj);
            }
            return m2.f17815a;
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object I(@n6.d j<? super T> jVar, @n6.d Throwable th, @n6.e e4.d<? super m2> dVar) {
            d dVar2 = new d(this.f12640r, this.f12641s, dVar);
            dVar2.f12638p = jVar;
            dVar2.f12639q = th;
            return dVar2.Q(m2.f17815a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @h4.f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class e<R, T> extends h4.o implements t4.q<j<? super R>, T, e4.d<? super m2>, Object> {

        /* renamed from: o  reason: collision with root package name */
        public int f12642o;

        /* renamed from: p  reason: collision with root package name */
        public /* synthetic */ Object f12643p;

        /* renamed from: q  reason: collision with root package name */
        public /* synthetic */ Object f12644q;

        /* renamed from: r  reason: collision with root package name */
        public final /* synthetic */ t4.p f12645r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t4.p pVar, e4.d dVar) {
            super(3, dVar);
            this.f12645r = pVar;
        }

        @Override // h4.a
        @n6.e
        public final Object Q(@n6.d Object obj) {
            j jVar;
            Object h7 = g4.d.h();
            int i7 = this.f12642o;
            if (i7 == 0) {
                e1.n(obj);
                jVar = (j) this.f12643p;
                Object obj2 = this.f12644q;
                t4.p pVar = this.f12645r;
                this.f12643p = jVar;
                this.f12642o = 1;
                obj = pVar.J(obj2, this);
                if (obj == h7) {
                    return h7;
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    e1.n(obj);
                    return m2.f17815a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                jVar = (j) this.f12643p;
                e1.n(obj);
            }
            this.f12643p = null;
            this.f12642o = 2;
            if (k.l0(jVar, (i) obj, this) == h7) {
                return h7;
            }
            return m2.f17815a;
        }

        @Override // t4.q
        @n6.e
        /* renamed from: a0  reason: merged with bridge method [inline-methods] */
        public final Object I(@n6.d j<? super R> jVar, T t6, @n6.e e4.d<? super m2> dVar) {
            e eVar = new e(this.f12645r, dVar);
            eVar.f12643p = jVar;
            eVar.f12644q = t6;
            return eVar.Q(m2.f17815a);
        }
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> i<T> A(@n6.d i<? extends T> iVar, int i7) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @b1(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> i<R> B(@n6.d i<? extends T> iVar, R r6, @v3.b @n6.d t4.q<? super R, ? super T, ? super e4.d<? super R>, ? extends Object> qVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @b1(expression = "runningReduce(operation)", imports = {}))
    public static final <T> i<T> C(@n6.d i<? extends T> iVar, @n6.d t4.q<? super T, ? super T, ? super e4.d<? super T>, ? extends Object> qVar) {
        return k.z1(iVar, qVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @b1(expression = "drop(count)", imports = {}))
    public static final <T> i<T> D(@n6.d i<? extends T> iVar, int i7) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @b1(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> i<T> E(@n6.d i<? extends T> iVar, T t6) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @b1(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> i<T> F(@n6.d i<? extends T> iVar, @n6.d i<? extends T> iVar2) {
        k.b1();
        throw new v3.y();
    }

    @v3.k(level = v3.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void G(@n6.d i<? extends T> iVar) {
        k.b1();
        throw new v3.y();
    }

    @v3.k(level = v3.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void H(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar) {
        k.b1();
        throw new v3.y();
    }

    @v3.k(level = v3.m.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar, @n6.d t4.p<? super Throwable, ? super e4.d<? super m2>, ? extends Object> pVar2) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Use 'flowOn' instead")
    public static final <T> i<T> J(@n6.d i<? extends T> iVar, @n6.d e4.g gVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @b1(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> i<R> K(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.b2(iVar, new e(pVar, null));
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> i<T> a(@n6.d i<? extends T> iVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> i<R> b(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d i<? extends T4> iVar4, @n6.d i<? extends T5> iVar5, @n6.d t4.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super e4.d<? super R>, ? extends Object> tVar) {
        return k.D(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> i<R> c(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d i<? extends T4> iVar4, @n6.d t4.s<? super T1, ? super T2, ? super T3, ? super T4, ? super e4.d<? super R>, ? extends Object> sVar) {
        return k.E(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> i<R> d(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d i<? extends T3> iVar3, @n6.d t4.r<? super T1, ? super T2, ? super T3, ? super e4.d<? super R>, ? extends Object> rVar) {
        return k.F(iVar, iVar2, iVar3, rVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> i<R> e(@n6.d i<? extends T1> iVar, @n6.d i<? extends T2> iVar2, @n6.d t4.q<? super T1, ? super T2, ? super e4.d<? super R>, ? extends Object> qVar) {
        return k.G(iVar, iVar2, qVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @b1(expression = "let(transformer)", imports = {}))
    public static final <T, R> i<R> f(@n6.d i<? extends T> iVar, @n6.d t4.l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> g(@n6.d i<? extends T> iVar, @n6.d t4.l<? super T, ? extends i<? extends R>> lVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @b1(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> i<T> h(@n6.d i<? extends T> iVar, T t6) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @b1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> i<T> i(@n6.d i<? extends T> iVar, @n6.d i<? extends T> iVar2) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @b1(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> j(@n6.d i<? extends T> iVar, long j7) {
        return k.e1(iVar, new a(j7, null));
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @b1(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> k(@n6.d i<? extends T> iVar, long j7) {
        return k.l1(iVar, new b(j7, null));
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> l(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super i<? extends R>>, ? extends Object> pVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> m(@n6.d i<? extends i<? extends T>> iVar) {
        k.b1();
        throw new v3.y();
    }

    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @b1(expression = "collect(action)", imports = {}))
    public static final <T> void n(@n6.d i<? extends T> iVar, @n6.d t4.p<? super T, ? super e4.d<? super m2>, ? extends Object> pVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> o(@n6.d i<? extends i<? extends T>> iVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    public static final Void p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> q(@n6.d i<? extends T> iVar, @n6.d e4.g gVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> r(@n6.d i<? extends T> iVar, @n6.d i<? extends T> iVar2) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> s(@n6.d i<? extends T> iVar, @n6.d i<? extends T> iVar2) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @b1(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> i<T> t(@n6.d i<? extends T> iVar, T t6) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @b1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> i<T> u(@n6.d i<? extends T> iVar, T t6, @n6.d t4.l<? super Throwable, Boolean> lVar) {
        return k.u(iVar, new d(lVar, t6, null));
    }

    public static /* synthetic */ i v(i iVar, Object obj, t4.l lVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            lVar = c.f12636l;
        }
        return k.j1(iVar, obj, lVar);
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> w(@n6.d i<? extends T> iVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> x(@n6.d i<? extends T> iVar, int i7) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Collect flow in the desired context instead")
    public static final <T> i<T> y(@n6.d i<? extends T> iVar, @n6.d e4.g gVar) {
        k.b1();
        throw new v3.y();
    }

    @n6.d
    @v3.k(level = v3.m.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> i<T> z(@n6.d i<? extends T> iVar) {
        k.b1();
        throw new v3.y();
    }
}
