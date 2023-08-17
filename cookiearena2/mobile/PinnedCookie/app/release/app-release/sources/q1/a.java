package q1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import d.o0;
import d.q0;
import java.io.File;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f15151b = "DocumentFile";
    @q0

    /* renamed from: a  reason: collision with root package name */
    public final a f15152a;

    public a(@q0 a aVar) {
        this.f15152a = aVar;
    }

    @o0
    public static a h(@o0 File file) {
        return new c(null, file);
    }

    @q0
    public static a i(@o0 Context context, @o0 Uri uri) {
        return new d(null, context, uri);
    }

    @q0
    public static a j(@o0 Context context, @o0 Uri uri) {
        return new e(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean p(@o0 Context context, @q0 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    @q0
    public abstract a c(@o0 String str);

    @q0
    public abstract a d(@o0 String str, @o0 String str2);

    public abstract boolean e();

    public abstract boolean f();

    @q0
    public a g(@o0 String str) {
        for (a aVar : u()) {
            if (str.equals(aVar.k())) {
                return aVar;
            }
        }
        return null;
    }

    @q0
    public abstract String k();

    @q0
    public a l() {
        return this.f15152a;
    }

    @q0
    public abstract String m();

    @o0
    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @o0
    public abstract a[] u();

    public abstract boolean v(@o0 String str);
}
