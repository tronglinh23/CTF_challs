package v3;

@g1(version = "1.7")
@e4.j
@q2(markerClass = {r.class})
/* loaded from: classes.dex */
public abstract class i<T, R> {
    public /* synthetic */ i(u4.w wVar) {
        this();
    }

    @n6.e
    public abstract Object a(T t6, @n6.d e4.d<? super R> dVar);

    @n6.e
    public abstract <U, S> Object c(@n6.d g<U, S> gVar, U u6, @n6.d e4.d<? super S> dVar);

    @n6.d
    @k(level = m.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @b1(expression = "this.callRecursive(value)", imports = {}))
    public final Void e(@n6.d g<?, ?> gVar, @n6.e Object obj) {
        u4.l0.p(gVar, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    public i() {
    }
}