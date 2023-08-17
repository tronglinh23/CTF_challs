package q1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import d.q0;
import d.w0;

@w0(19)
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f15153a = "DocumentFile";

    /* renamed from: b  reason: collision with root package name */
    public static final int f15154b = 512;

    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(g(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String g7 = g(context, uri);
        int n7 = n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(g7)) {
            return false;
        }
        if ((n7 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(g7) || (n7 & 8) == 0) {
            return (TextUtils.isEmpty(g7) || (n7 & 2) == 0) ? false : true;
        }
        return true;
    }

    public static void c(@q0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (Exception e7) {
            Log.w("DocumentFile", "Failed query: " + e7);
            return false;
        } finally {
            c(cursor);
        }
    }

    public static long e(Context context, Uri uri) {
        return o(context, uri, "flags", 0L);
    }

    @q0
    public static String f(Context context, Uri uri) {
        return p(context, uri, "_display_name", null);
    }

    @q0
    public static String g(Context context, Uri uri) {
        return p(context, uri, "mime_type", null);
    }

    @q0
    public static String h(Context context, Uri uri) {
        String g7 = g(context, uri);
        if ("vnd.android.document/directory".equals(g7)) {
            return null;
        }
        return g7;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String g7 = g(context, uri);
        return ("vnd.android.document/directory".equals(g7) || TextUtils.isEmpty(g7)) ? false : true;
    }

    public static boolean k(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (e(context, uri) & 512) != 0;
    }

    public static long l(Context context, Uri uri) {
        return o(context, uri, "last_modified", 0L);
    }

    public static long m(Context context, Uri uri) {
        return o(context, uri, "_size", 0L);
    }

    public static int n(Context context, Uri uri, String str, int i7) {
        return (int) o(context, uri, str, i7);
    }

    public static long o(Context context, Uri uri, String str, long j7) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? j7 : cursor.getLong(0);
        } catch (Exception e7) {
            Log.w("DocumentFile", "Failed query: " + e7);
            return j7;
        } finally {
            c(cursor);
        }
    }

    @q0
    public static String p(Context context, Uri uri, String str, @q0 String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? str2 : cursor.getString(0);
        } catch (Exception e7) {
            Log.w("DocumentFile", "Failed query: " + e7);
            return str2;
        } finally {
            c(cursor);
        }
    }
}