package u3;

import android.annotation.SuppressLint;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import u3.l;
import u4.l0;
@t3.d
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class n implements Consumer<List<? extends SplitInfo>> {
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public final l.a f17338k;
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public final i f17339l;

    public n(@n6.d l.a aVar, @n6.d i iVar) {
        l0.p(aVar, "callback");
        l0.p(iVar, "adapter");
        this.f17338k = aVar;
        this.f17339l = iVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public void accept(@n6.d List<? extends SplitInfo> list) {
        l0.p(list, "splitInfoList");
        this.f17338k.a(this.f17339l.h(list));
    }
}
