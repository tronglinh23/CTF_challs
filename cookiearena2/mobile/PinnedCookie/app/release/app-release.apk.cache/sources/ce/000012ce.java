package k0;

import android.content.UriMatcher;
import android.net.Uri;

/* loaded from: classes.dex */
public class d1 {
    public static /* synthetic */ boolean a(UriMatcher uriMatcher, Uri uri) {
        return c(uriMatcher, uri);
    }

    @d.o0
    public static g1.y<Uri> b(@d.o0 final UriMatcher uriMatcher) {
        return new g1.y() { // from class: k0.c1
            @Override // g1.y
            public final boolean test(Object obj) {
                return d1.a(uriMatcher, (Uri) obj);
            }
        };
    }

    public static /* synthetic */ boolean c(UriMatcher uriMatcher, Uri uri) {
        return uriMatcher.match(uri) != -1;
    }
}