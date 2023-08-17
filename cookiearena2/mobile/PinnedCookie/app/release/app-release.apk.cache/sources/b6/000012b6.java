package k0;

import android.content.ContentProvider;
import android.content.Context;

/* loaded from: classes.dex */
public final class a {
    @d.o0
    public static Context a(@d.o0 ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}