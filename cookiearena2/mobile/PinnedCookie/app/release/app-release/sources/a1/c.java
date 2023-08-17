package a1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import java.io.FileNotFoundException;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f75a = "tree";

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f76a = 512;
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @u
        public static boolean b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @u
        public static String c(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @u
        public static boolean d(Context context, @q0 Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    @w0(21)
    /* renamed from: a1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0003c {
        @u
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @u
        public static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @u
        public static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @u
        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @u
        public static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @u
        public static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @u
        public static Uri g(@o0 ContentResolver contentResolver, @o0 Uri uri, @o0 String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    @w0(24)
    /* loaded from: classes.dex */
    public static class d {
        @u
        public static boolean a(@o0 Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @u
        public static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    @q0
    public static Uri a(@o0 String str, @q0 String str2) {
        return C0003c.a(str, str2);
    }

    @q0
    public static Uri b(@o0 Uri uri, @o0 String str) {
        return C0003c.b(uri, str);
    }

    @q0
    public static Uri c(@o0 String str, @o0 String str2) {
        return b.a(str, str2);
    }

    @q0
    public static Uri d(@o0 Uri uri, @o0 String str) {
        return C0003c.c(uri, str);
    }

    @q0
    public static Uri e(@o0 String str, @o0 String str2) {
        return C0003c.d(str, str2);
    }

    @q0
    public static Uri f(@o0 ContentResolver contentResolver, @o0 Uri uri, @o0 String str, @o0 String str2) throws FileNotFoundException {
        return C0003c.e(contentResolver, uri, str, str2);
    }

    @q0
    public static String g(@o0 Uri uri) {
        return b.c(uri);
    }

    @q0
    public static String h(@o0 Uri uri) {
        return C0003c.f(uri);
    }

    public static boolean i(@o0 Context context, @q0 Uri uri) {
        return b.d(context, uri);
    }

    public static boolean j(@o0 Uri uri) {
        return d.a(uri);
    }

    public static boolean k(@o0 ContentResolver contentResolver, @o0 Uri uri, @o0 Uri uri2) throws FileNotFoundException {
        return d.b(contentResolver, uri, uri2);
    }

    @q0
    public static Uri l(@o0 ContentResolver contentResolver, @o0 Uri uri, @o0 String str) throws FileNotFoundException {
        return C0003c.g(contentResolver, uri, str);
    }
}
