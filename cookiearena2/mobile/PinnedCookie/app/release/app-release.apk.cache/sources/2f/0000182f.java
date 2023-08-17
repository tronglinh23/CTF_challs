package p0;

import a1.h;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import d.b1;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class n2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14549a = "TypefaceCompatUtil";

    /* renamed from: b  reason: collision with root package name */
    public static final String f14550b = ".font";

    @d.w0(19)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    public static void a(@d.q0 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @d.q0
    @d.w0(19)
    public static ByteBuffer b(@d.o0 Context context, @d.o0 Resources resources, int i7) {
        File e7 = e(context);
        if (e7 == null) {
            return null;
        }
        try {
            if (c(e7, resources, i7)) {
                return g(e7);
            }
            return null;
        } finally {
            e7.delete();
        }
    }

    public static boolean c(@d.o0 File file, @d.o0 Resources resources, int i7) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i7);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean d7 = d(file, inputStream);
            a(inputStream);
            return d7;
        } catch (Throwable th2) {
            th = th2;
            a(inputStream);
            throw th;
        }
    }

    public static boolean d(@d.o0 File file, @d.o0 InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    Log.e(f14549a, "Error copying resource contents to temp file: " + e.getMessage());
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e8) {
            e = e8;
        }
    }

    @d.q0
    public static File e(@d.o0 Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = f14550b + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    @d.q0
    @d.w0(19)
    public static ByteBuffer f(@d.o0 Context context, @d.q0 CancellationSignal cancellationSignal, @d.o0 Uri uri) {
        try {
            ParcelFileDescriptor a7 = a.a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (a7 == null) {
                if (a7 != null) {
                    a7.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(a7.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                a7.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @d.q0
    @d.w0(19)
    public static ByteBuffer g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    @d.b1({b1.a.LIBRARY})
    @d.o0
    @d.w0(19)
    public static Map<Uri, ByteBuffer> h(@d.o0 Context context, @d.o0 h.c[] cVarArr, @d.q0 CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (h.c cVar : cVarArr) {
            if (cVar.b() == 0) {
                Uri d7 = cVar.d();
                if (!hashMap.containsKey(d7)) {
                    hashMap.put(d7, f(context, cancellationSignal, d7));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}