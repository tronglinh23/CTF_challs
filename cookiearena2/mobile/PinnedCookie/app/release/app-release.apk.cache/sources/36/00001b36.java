package u3;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import u3.l;
import u4.l0;

@t3.d
/* loaded from: classes.dex */
public final class k implements l {
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final a f17333c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f17334d = true;
    @n6.d

    /* renamed from: e  reason: collision with root package name */
    public static final String f17335e = "EmbeddingCompat";
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final ActivityEmbeddingComponent f17336a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final i f17337b;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(u4.w wVar) {
            this();
        }

        @n6.d
        public final ActivityEmbeddingComponent a() {
            ActivityEmbeddingComponent activityEmbeddingComponent;
            return (!c() || (activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent()) == null) ? new o() : activityEmbeddingComponent;
        }

        @n6.e
        public final Integer b() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public final boolean c() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return false;
            }
        }

        public a() {
        }
    }

    public k(@n6.d ActivityEmbeddingComponent activityEmbeddingComponent, @n6.d i iVar) {
        l0.p(activityEmbeddingComponent, "embeddingExtension");
        l0.p(iVar, "adapter");
        this.f17336a = activityEmbeddingComponent;
        this.f17337b = iVar;
    }

    @Override // u3.l
    public void a(@n6.d Set<? extends m> set) {
        l0.p(set, "rules");
        this.f17336a.setEmbeddingRules(this.f17337b.i(set));
    }

    @Override // u3.l
    public void b(@n6.d l.a aVar) {
        l0.p(aVar, "embeddingCallback");
        this.f17336a.setSplitInfoCallback(new n(aVar, this.f17337b));
    }

    public k() {
        this(f17333c.a(), new i());
    }
}