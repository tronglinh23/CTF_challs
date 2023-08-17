package q1;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import d.q0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: c  reason: collision with root package name */
    public File f15155c;

    public c(@q0 a aVar, File file) {
        super(aVar);
        this.f15155c = file;
    }

    public static boolean w(File file) {
        File[] listFiles = file.listFiles();
        boolean z6 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z6 &= w(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    z6 = false;
                }
            }
        }
        return z6;
    }

    public static String x(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase());
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // q1.a
    public boolean a() {
        return this.f15155c.canRead();
    }

    @Override // q1.a
    public boolean b() {
        return this.f15155c.canWrite();
    }

    @Override // q1.a
    @q0
    public a c(String str) {
        File file = new File(this.f15155c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new c(this, file);
        }
        return null;
    }

    @Override // q1.a
    @q0
    public a d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f15155c, str2);
        try {
            file.createNewFile();
            return new c(this, file);
        } catch (IOException e7) {
            Log.w("DocumentFile", "Failed to createFile: " + e7);
            return null;
        }
    }

    @Override // q1.a
    public boolean e() {
        w(this.f15155c);
        return this.f15155c.delete();
    }

    @Override // q1.a
    public boolean f() {
        return this.f15155c.exists();
    }

    @Override // q1.a
    public String k() {
        return this.f15155c.getName();
    }

    @Override // q1.a
    @q0
    public String m() {
        if (this.f15155c.isDirectory()) {
            return null;
        }
        return x(this.f15155c.getName());
    }

    @Override // q1.a
    public Uri n() {
        return Uri.fromFile(this.f15155c);
    }

    @Override // q1.a
    public boolean o() {
        return this.f15155c.isDirectory();
    }

    @Override // q1.a
    public boolean q() {
        return this.f15155c.isFile();
    }

    @Override // q1.a
    public boolean r() {
        return false;
    }

    @Override // q1.a
    public long s() {
        return this.f15155c.lastModified();
    }

    @Override // q1.a
    public long t() {
        return this.f15155c.length();
    }

    @Override // q1.a
    public a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f15155c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new c(this, file));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // q1.a
    public boolean v(String str) {
        File file = new File(this.f15155c.getParentFile(), str);
        if (this.f15155c.renameTo(file)) {
            this.f15155c = file;
            return true;
        }
        return false;
    }
}
