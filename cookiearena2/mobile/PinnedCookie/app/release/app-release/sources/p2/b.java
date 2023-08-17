package p2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import d.o0;
import d.q0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import p2.c;
import z0.j;
import z0.z;
/* loaded from: classes.dex */
public class b extends a<Cursor> {

    /* renamed from: r  reason: collision with root package name */
    public final c<Cursor>.a f14600r;

    /* renamed from: s  reason: collision with root package name */
    public Uri f14601s;

    /* renamed from: t  reason: collision with root package name */
    public String[] f14602t;

    /* renamed from: u  reason: collision with root package name */
    public String f14603u;

    /* renamed from: v  reason: collision with root package name */
    public String[] f14604v;

    /* renamed from: w  reason: collision with root package name */
    public String f14605w;

    /* renamed from: x  reason: collision with root package name */
    public Cursor f14606x;

    /* renamed from: y  reason: collision with root package name */
    public j f14607y;

    public b(@o0 Context context) {
        super(context);
        this.f14600r = new c.a();
    }

    @Override // p2.a
    public void D() {
        super.D();
        synchronized (this) {
            j jVar = this.f14607y;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // p2.c
    /* renamed from: N  reason: merged with bridge method [inline-methods] */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f14606x;
        this.f14606x = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @q0
    public String[] O() {
        return this.f14602t;
    }

    @q0
    public String P() {
        return this.f14603u;
    }

    @q0
    public String[] Q() {
        return this.f14604v;
    }

    @q0
    public String R() {
        return this.f14605w;
    }

    @o0
    public Uri S() {
        return this.f14601s;
    }

    @Override // p2.a
    /* renamed from: T  reason: merged with bridge method [inline-methods] */
    public Cursor I() {
        synchronized (this) {
            if (H()) {
                throw new z();
            }
            this.f14607y = new j();
        }
        try {
            Cursor a7 = k0.b.a(i().getContentResolver(), this.f14601s, this.f14602t, this.f14603u, this.f14604v, this.f14605w, this.f14607y);
            if (a7 != null) {
                try {
                    a7.getCount();
                    a7.registerContentObserver(this.f14600r);
                } catch (RuntimeException e7) {
                    a7.close();
                    throw e7;
                }
            }
            synchronized (this) {
                this.f14607y = null;
            }
            return a7;
        } catch (Throwable th) {
            synchronized (this) {
                this.f14607y = null;
                throw th;
            }
        }
    }

    @Override // p2.a
    /* renamed from: U  reason: merged with bridge method [inline-methods] */
    public void J(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public void V(@q0 String[] strArr) {
        this.f14602t = strArr;
    }

    public void W(@q0 String str) {
        this.f14603u = str;
    }

    public void X(@q0 String[] strArr) {
        this.f14604v = strArr;
    }

    public void Y(@q0 String str) {
        this.f14605w = str;
    }

    public void Z(@o0 Uri uri) {
        this.f14601s = uri;
    }

    @Override // p2.a, p2.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f14601s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f14602t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f14603u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f14604v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f14605w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f14606x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f14615h);
    }

    @Override // p2.c
    public void r() {
        super.r();
        t();
        Cursor cursor = this.f14606x;
        if (cursor != null && !cursor.isClosed()) {
            this.f14606x.close();
        }
        this.f14606x = null;
    }

    @Override // p2.c
    public void s() {
        Cursor cursor = this.f14606x;
        if (cursor != null) {
            f(cursor);
        }
        if (A() || this.f14606x == null) {
            h();
        }
    }

    @Override // p2.c
    public void t() {
        b();
    }

    public b(@o0 Context context, @o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2) {
        super(context);
        this.f14600r = new c.a();
        this.f14601s = uri;
        this.f14602t = strArr;
        this.f14603u = str;
        this.f14604v = strArr2;
        this.f14605w = str2;
    }
}
