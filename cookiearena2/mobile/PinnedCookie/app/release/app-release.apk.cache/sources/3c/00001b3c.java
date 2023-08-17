package u3;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import u4.l0;

/* loaded from: classes.dex */
public final class o implements ActivityEmbeddingComponent {
    public void a(@n6.d Set<EmbeddingRule> set) {
        l0.p(set, "splitRules");
    }

    public void b(@n6.d Consumer<List<SplitInfo>> consumer) {
        l0.p(consumer, "consumer");
    }
}