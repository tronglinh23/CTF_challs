package k0;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import d.l1;
import d.n1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class h extends ContentProvider {

    /* renamed from: e  reason: collision with root package name */
    public static final String f11454e = "android.support.FILE_PROVIDER_PATHS";

    /* renamed from: f  reason: collision with root package name */
    public static final String f11455f = "root-path";

    /* renamed from: g  reason: collision with root package name */
    public static final String f11456g = "files-path";

    /* renamed from: h  reason: collision with root package name */
    public static final String f11457h = "cache-path";

    /* renamed from: i  reason: collision with root package name */
    public static final String f11458i = "external-path";

    /* renamed from: j  reason: collision with root package name */
    public static final String f11459j = "external-files-path";

    /* renamed from: k  reason: collision with root package name */
    public static final String f11460k = "external-cache-path";

    /* renamed from: l  reason: collision with root package name */
    public static final String f11461l = "external-media-path";

    /* renamed from: m  reason: collision with root package name */
    public static final String f11462m = "name";

    /* renamed from: n  reason: collision with root package name */
    public static final String f11463n = "path";

    /* renamed from: o  reason: collision with root package name */
    public static final String f11464o = "displayName";

    /* renamed from: b  reason: collision with root package name */
    public b f11467b;

    /* renamed from: c  reason: collision with root package name */
    public int f11468c;

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f11453d = {"_display_name", "_size"};

    /* renamed from: p  reason: collision with root package name */
    public static final File f11465p = new File("/");
    @d.b0("sCache")

    /* renamed from: q  reason: collision with root package name */
    public static final HashMap<String, b> f11466q = new HashMap<>();

    @d.w0(21)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f11469a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, File> f11470b = new HashMap<>();

        public c(String str) {
            this.f11469a = str;
        }

        @Override // k0.h.b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f11470b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // k0.h.b
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f11470b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f11469a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f11470b.put(str, file.getCanonicalFile());
            } catch (IOException e7) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e7);
            }
        }
    }

    public h() {
        this.f11468c = 0;
    }

    public static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] b(Object[] objArr, int i7) {
        Object[] objArr2 = new Object[i7];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        return objArr2;
    }

    public static String[] c(String[] strArr, int i7) {
        String[] strArr2 = new String[i7];
        System.arraycopy(strArr, 0, strArr2, 0, i7);
        return strArr2;
    }

    @l1
    public static XmlResourceParser d(Context context, String str, @d.q0 ProviderInfo providerInfo, int i7) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i7 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(f11454e, i7);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), f11454e);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    public static b e(Context context, String str, int i7) {
        b bVar;
        HashMap<String, b> hashMap = f11466q;
        synchronized (hashMap) {
            bVar = hashMap.get(str);
            if (bVar == null) {
                try {
                    try {
                        bVar = i(context, str, i7);
                        hashMap.put(str, bVar);
                    } catch (XmlPullParserException e7) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                    }
                } catch (IOException e8) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                }
            }
        }
        return bVar;
    }

    public static Uri f(@d.o0 Context context, @d.o0 String str, @d.o0 File file) {
        return e(context, str, 0).b(file);
    }

    @SuppressLint({"StreamFiles"})
    @d.o0
    public static Uri g(@d.o0 Context context, @d.o0 String str, @d.o0 File file, @d.o0 String str2) {
        return f(context, str, file).buildUpon().appendQueryParameter(f11464o, str2).build();
    }

    public static int h(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static b i(Context context, String str, int i7) throws IOException, XmlPullParserException {
        c cVar = new c(str);
        XmlResourceParser d7 = d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i7);
        while (true) {
            int next = d7.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d7.getName();
                File file = null;
                String attributeValue = d7.getAttributeValue(null, "name");
                String attributeValue2 = d7.getAttributeValue(null, "path");
                if (f11455f.equals(name)) {
                    file = f11465p;
                } else if (f11456g.equals(name)) {
                    file = context.getFilesDir();
                } else if (f11457h.equals(name)) {
                    file = context.getCacheDir();
                } else if (f11458i.equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if (f11459j.equals(name)) {
                    File[] k7 = d.k(context, null);
                    if (k7.length > 0) {
                        file = k7[0];
                    }
                } else if (f11460k.equals(name)) {
                    File[] j7 = d.j(context);
                    if (j7.length > 0) {
                        file = j7[0];
                    }
                } else if (f11461l.equals(name)) {
                    File[] a7 = a.a(context);
                    if (a7.length > 0) {
                        file = a7[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, a(file, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@d.o0 Context context, @d.o0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, b> hashMap = f11466q;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.f11467b = e(context, str, this.f11468c);
    }

    @Override // android.content.ContentProvider
    public int delete(@d.o0 Uri uri, @d.q0 String str, @d.q0 String[] strArr) {
        return this.f11467b.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @d.q0
    public String getType(@d.o0 Uri uri) {
        File a7 = this.f11467b.a(uri);
        int lastIndexOf = a7.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a7.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@d.o0 Uri uri, @d.o0 ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@d.o0 Uri uri, @d.o0 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f11467b.a(uri), h(str));
    }

    @Override // android.content.ContentProvider
    @d.o0
    public Cursor query(@d.o0 Uri uri, @d.q0 String[] strArr, @d.q0 String str, @d.q0 String[] strArr2, @d.q0 String str2) {
        int i7;
        File a7 = this.f11467b.a(uri);
        String queryParameter = uri.getQueryParameter(f11464o);
        if (strArr == null) {
            strArr = f11453d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i8 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i8] = "_display_name";
                i7 = i8 + 1;
                objArr[i8] = queryParameter == null ? a7.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i8] = "_size";
                i7 = i8 + 1;
                objArr[i8] = Long.valueOf(a7.length());
            }
            i8 = i7;
        }
        String[] c7 = c(strArr3, i8);
        Object[] b7 = b(objArr, i8);
        MatrixCursor matrixCursor = new MatrixCursor(c7, 1);
        matrixCursor.addRow(b7);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@d.o0 Uri uri, @d.o0 ContentValues contentValues, @d.q0 String str, @d.q0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public h(@n1 int i7) {
        this.f11468c = i7;
    }
}
