package g1;

import android.util.Log;
import d.o0;
import d.q0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    public static final String f9983d = "AtomicFile";

    /* renamed from: a  reason: collision with root package name */
    public final File f9984a;

    /* renamed from: b  reason: collision with root package name */
    public final File f9985b;

    /* renamed from: c  reason: collision with root package name */
    public final File f9986c;

    public c(@o0 File file) {
        this.f9984a = file;
        this.f9985b = new File(file.getPath() + ".new");
        this.f9986c = new File(file.getPath() + ".bak");
    }

    public static void g(@o0 File file, @o0 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(f9983d, "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e(f9983d, "Failed to rename " + file + " to " + file2);
    }

    public static boolean i(@o0 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f9984a.delete();
        this.f9985b.delete();
        this.f9986c.delete();
    }

    public void b(@q0 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f9983d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e7) {
            Log.e(f9983d, "Failed to close file output stream", e7);
        }
        if (this.f9985b.delete()) {
            return;
        }
        Log.e(f9983d, "Failed to delete new file " + this.f9985b);
    }

    public void c(@q0 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f9983d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e7) {
            Log.e(f9983d, "Failed to close file output stream", e7);
        }
        g(this.f9985b, this.f9984a);
    }

    @o0
    public File d() {
        return this.f9984a;
    }

    @o0
    public FileInputStream e() throws FileNotFoundException {
        if (this.f9986c.exists()) {
            g(this.f9986c, this.f9984a);
        }
        if (this.f9985b.exists() && this.f9984a.exists() && !this.f9985b.delete()) {
            Log.e(f9983d, "Failed to delete outdated new file " + this.f9985b);
        }
        return new FileInputStream(this.f9984a);
    }

    @o0
    public byte[] f() throws IOException {
        FileInputStream e7 = e();
        try {
            byte[] bArr = new byte[e7.available()];
            int i7 = 0;
            while (true) {
                int read = e7.read(bArr, i7, bArr.length - i7);
                if (read <= 0) {
                    return bArr;
                }
                i7 += read;
                int available = e7.available();
                if (available > bArr.length - i7) {
                    byte[] bArr2 = new byte[available + i7];
                    System.arraycopy(bArr, 0, bArr2, 0, i7);
                    bArr = bArr2;
                }
            }
        } finally {
            e7.close();
        }
    }

    @o0
    public FileOutputStream h() throws IOException {
        if (this.f9986c.exists()) {
            g(this.f9986c, this.f9984a);
        }
        try {
            return new FileOutputStream(this.f9985b);
        } catch (FileNotFoundException unused) {
            if (!this.f9985b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f9985b);
            }
            try {
                return new FileOutputStream(this.f9985b);
            } catch (FileNotFoundException e7) {
                throw new IOException("Failed to create new file " + this.f9985b, e7);
            }
        }
    }
}
