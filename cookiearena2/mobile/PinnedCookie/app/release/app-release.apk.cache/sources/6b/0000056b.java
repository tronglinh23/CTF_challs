package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/z;", "source", "Landroidx/lifecycle/p$a;", i0.k0.I0, "Lv3/m2;", androidx.appcompat.widget.d.f1513o, "Landroidx/lifecycle/h;", "k", "Landroidx/lifecycle/h;", "defaultLifecycleObserver", "l", "Landroidx/lifecycle/v;", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/h;Landroidx/lifecycle/v;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements v {
    @n6.d

    /* renamed from: k  reason: collision with root package name and from kotlin metadata */
    public final h defaultLifecycleObserver;
    @n6.e

    /* renamed from: l  reason: collision with root package name and from kotlin metadata */
    public final v lifecycleEventObserver;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4600a;

        static {
            int[] iArr = new int[p.a.values().length];
            try {
                iArr[p.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f4600a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(@n6.d h hVar, @n6.e v vVar) {
        u4.l0.p(hVar, "defaultLifecycleObserver");
        this.defaultLifecycleObserver = hVar;
        this.lifecycleEventObserver = vVar;
    }

    @Override // androidx.lifecycle.v
    public void d(@n6.d z zVar, @n6.d p.a aVar) {
        u4.l0.p(zVar, "source");
        u4.l0.p(aVar, i0.k0.I0);
        switch (a.f4600a[aVar.ordinal()]) {
            case 1:
                this.defaultLifecycleObserver.c(zVar);
                break;
            case 2:
                this.defaultLifecycleObserver.f(zVar);
                break;
            case 3:
                this.defaultLifecycleObserver.a(zVar);
                break;
            case 4:
                this.defaultLifecycleObserver.e(zVar);
                break;
            case 5:
                this.defaultLifecycleObserver.g(zVar);
                break;
            case 6:
                this.defaultLifecycleObserver.b(zVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        v vVar = this.lifecycleEventObserver;
        if (vVar != null) {
            vVar.d(zVar, aVar);
        }
    }
}