package q1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import d.q0;
import d.w0;
import java.util.ArrayList;
@w0(21)
/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: c  reason: collision with root package name */
    public Context f15158c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f15159d;

    public e(@q0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f15158c = context;
        this.f15159d = uri;
    }

    public static void w(@q0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    @q0
    public static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // q1.a
    public boolean a() {
        return b.a(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    public boolean b() {
        return b.b(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    @q0
    public a c(String str) {
        Uri x6 = x(this.f15158c, this.f15159d, "vnd.android.document/directory", str);
        if (x6 != null) {
            return new e(this, this.f15158c, x6);
        }
        return null;
    }

    @Override // q1.a
    @q0
    public a d(String str, String str2) {
        Uri x6 = x(this.f15158c, this.f15159d, str, str2);
        if (x6 != null) {
            return new e(this, this.f15158c, x6);
        }
        return null;
    }

    @Override // q1.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f15158c.getContentResolver(), this.f15159d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // q1.a
    public boolean f() {
        return b.d(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    @q0
    public String k() {
        return b.f(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    @q0
    public String m() {
        return b.h(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    public Uri n() {
        return this.f15159d;
    }

    @Override // q1.a
    public boolean o() {
        return b.i(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    public boolean q() {
        return b.j(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    public boolean r() {
        return b.k(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    public long s() {
        return b.l(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    public long t() {
        return b.m(this.f15158c, this.f15159d);
    }

    @Override // q1.a
    public a[] u() {
        ContentResolver contentResolver = this.f15158c.getContentResolver();
        Uri uri = this.f15159d;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f15159d, cursor.getString(0)));
                }
            } catch (Exception e7) {
                Log.w("DocumentFile", "Failed query: " + e7);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i7 = 0; i7 < uriArr.length; i7++) {
                aVarArr[i7] = new e(this, this.f15158c, uriArr[i7]);
            }
            return aVarArr;
        } finally {
            w(cursor);
        }
    }

    @Override // q1.a
    public boolean v(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f15158c.getContentResolver(), this.f15159d, str);
            if (renameDocument != null) {
                this.f15159d = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
