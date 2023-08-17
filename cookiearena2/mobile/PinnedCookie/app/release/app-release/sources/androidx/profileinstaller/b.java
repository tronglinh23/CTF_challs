package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import b3.l;
import b3.o;
import d.b1;
import d.o0;
import d.q0;
import d.w0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
@b1({b1.a.LIBRARY})
@w0(19)
/* loaded from: classes.dex */
public class b {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f4942a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4943b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final c.d f4944c;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final File f4946e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public final String f4947f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public final String f4948g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public final String f4949h;
    @q0

    /* renamed from: j  reason: collision with root package name */
    public b3.b[] f4951j;
    @q0

    /* renamed from: k  reason: collision with root package name */
    public byte[] f4952k;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4950i = false;
    @q0

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f4945d = d();

    @b1({b1.a.LIBRARY})
    public b(@o0 AssetManager assetManager, @o0 Executor executor, @o0 c.d dVar, @o0 String str, @o0 String str2, @o0 String str3, @o0 File file) {
        this.f4942a = assetManager;
        this.f4943b = executor;
        this.f4944c = dVar;
        this.f4947f = str;
        this.f4948g = str2;
        this.f4949h = str3;
        this.f4946e = file;
    }

    @q0
    public static byte[] d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 33) {
            return null;
        }
        switch (i7) {
            case 26:
                return o.f7214d;
            case 27:
                return o.f7213c;
            case 28:
            case 29:
            case 30:
                return o.f7212b;
            case 31:
            case 32:
            case 33:
                return o.f7211a;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i7, Object obj) {
        this.f4944c.b(i7, obj);
    }

    public static boolean k() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 33) {
            return false;
        }
        switch (i7) {
            case 31:
            case 32:
            case 33:
                return true;
            default:
                return false;
        }
    }

    @q0
    public final b b(b3.b[] bVarArr, byte[] bArr) {
        InputStream h7;
        try {
            h7 = h(this.f4942a, this.f4949h);
        } catch (FileNotFoundException e7) {
            this.f4944c.b(9, e7);
        } catch (IOException e8) {
            this.f4944c.b(7, e8);
        } catch (IllegalStateException e9) {
            this.f4951j = null;
            this.f4944c.b(8, e9);
        }
        if (h7 == null) {
            if (h7 != null) {
                h7.close();
            }
            return null;
        }
        try {
            this.f4951j = l.q(h7, l.o(h7, l.f7210g), bArr, bVarArr);
            h7.close();
            return this;
        } catch (Throwable th) {
            try {
                h7.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.f4950i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @b1({b1.a.LIBRARY})
    public boolean e() {
        if (this.f4945d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (this.f4946e.canWrite()) {
            this.f4950i = true;
            return true;
        } else {
            l(4, null);
            return false;
        }
    }

    @q0
    public final InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f4948g);
        } catch (FileNotFoundException e7) {
            this.f4944c.b(6, e7);
            return null;
        } catch (IOException e8) {
            this.f4944c.b(7, e8);
            return null;
        }
    }

    @q0
    public final InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f4944c.a(5, null);
            }
            return null;
        }
    }

    @b1({b1.a.LIBRARY})
    @o0
    public b i() {
        b b7;
        c();
        if (this.f4945d == null) {
            return this;
        }
        InputStream f7 = f(this.f4942a);
        if (f7 != null) {
            this.f4951j = j(f7);
        }
        b3.b[] bVarArr = this.f4951j;
        return (bVarArr == null || !k() || (b7 = b(bVarArr, this.f4945d)) == null) ? this : b7;
    }

    @q0
    public final b3.b[] j(InputStream inputStream) {
        try {
        } catch (IOException e7) {
            this.f4944c.b(7, e7);
        }
        try {
            try {
                b3.b[] w6 = l.w(inputStream, l.o(inputStream, l.f7209f), this.f4947f);
                try {
                    inputStream.close();
                    return w6;
                } catch (IOException e8) {
                    this.f4944c.b(7, e8);
                    return w6;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    this.f4944c.b(7, e9);
                }
                throw th;
            }
        } catch (IOException e10) {
            this.f4944c.b(7, e10);
            inputStream.close();
            return null;
        } catch (IllegalStateException e11) {
            this.f4944c.b(8, e11);
            inputStream.close();
            return null;
        }
    }

    public final void l(final int i7, @q0 final Object obj) {
        this.f4943b.execute(new Runnable() { // from class: b3.a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.b.this.g(i7, obj);
            }
        });
    }

    @b1({b1.a.LIBRARY})
    @o0
    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        b3.b[] bVarArr = this.f4951j;
        byte[] bArr = this.f4945d;
        if (bVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    l.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e7) {
                this.f4944c.b(7, e7);
            } catch (IllegalStateException e8) {
                this.f4944c.b(8, e8);
            }
            if (!l.B(byteArrayOutputStream, bArr, bVarArr)) {
                this.f4944c.b(5, null);
                this.f4951j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f4952k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f4951j = null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [byte[], b3.b[]] */
    @b1({b1.a.LIBRARY})
    public boolean n() {
        byte[] bArr = this.f4952k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f4946e);
                    b3.c.l(byteArrayInputStream, fileOutputStream);
                    l(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e7) {
                l(6, e7);
                return false;
            } catch (IOException e8) {
                l(7, e8);
                return false;
            }
        } finally {
            this.f4952k = null;
            this.f4951j = null;
        }
    }
}
