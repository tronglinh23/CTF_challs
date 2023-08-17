package k0;

import android.content.UriMatcher;
import android.net.Uri;
/* loaded from: classes.dex */
public class d1 {
    @d.o0
    public static g1.y<Uri> b(@d.o0 final UriMatcher uriMatcher) {
        return new g1.y() { // from class: k0.c1
            @Override // g1.y
            public final boolean test(Object obj) {
                boolean c7;
                c7 = d1.c(uriMatcher, (Uri) obj);
                return c7;
            }
        };
    }

    public static /* synthetic */ boolean c(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}
