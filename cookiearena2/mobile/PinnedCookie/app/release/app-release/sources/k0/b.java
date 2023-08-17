package k0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
/* loaded from: classes.dex */
public final class b {

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    @d.q0
    public static Cursor a(@d.o0 ContentResolver contentResolver, @d.o0 Uri uri, @d.q0 String[] strArr, @d.q0 String str, @d.q0 String[] strArr2, @d.q0 String str2, @d.q0 z0.j jVar) {
        Object b7;
        if (jVar != null) {
            try {
                b7 = jVar.b();
            } catch (Exception e7) {
                if (e7 instanceof OperationCanceledException) {
                    throw new z0.z();
                }
                throw e7;
            }
        } else {
            b7 = null;
        }
        return a.a(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) b7);
    }
}
