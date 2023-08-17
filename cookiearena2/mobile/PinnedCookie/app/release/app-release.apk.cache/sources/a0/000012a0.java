package j1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import d.o0;
import d.q0;
import d.w0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final c f11413a;

    /* loaded from: classes.dex */
    public static final class b implements c {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final Uri f11415a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f11416b;
        @q0

        /* renamed from: c  reason: collision with root package name */
        public final Uri f11417c;

        public b(@o0 Uri uri, @o0 ClipDescription clipDescription, @q0 Uri uri2) {
            this.f11415a = uri;
            this.f11416b = clipDescription;
            this.f11417c = uri2;
        }

        @Override // j1.h.c
        @q0
        public Uri a() {
            return this.f11417c;
        }

        @Override // j1.h.c
        @o0
        public ClipDescription b() {
            return this.f11416b;
        }

        @Override // j1.h.c
        @q0
        public Object c() {
            return null;
        }

        @Override // j1.h.c
        @o0
        public Uri d() {
            return this.f11415a;
        }

        @Override // j1.h.c
        public void e() {
        }

        @Override // j1.h.c
        public void f() {
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        @q0
        Uri a();

        @o0
        ClipDescription b();

        @q0
        Object c();

        @o0
        Uri d();

        void e();

        void f();
    }

    public h(@o0 Uri uri, @o0 ClipDescription clipDescription, @q0 Uri uri2) {
        this.f11413a = new a(uri, clipDescription, uri2);
    }

    @q0
    public static h g(@q0 Object obj) {
        if (obj == null) {
            return null;
        }
        return new h(new a(obj));
    }

    @o0
    public Uri a() {
        return this.f11413a.d();
    }

    @o0
    public ClipDescription b() {
        return this.f11413a.b();
    }

    @q0
    public Uri c() {
        return this.f11413a.a();
    }

    public void d() {
        this.f11413a.f();
    }

    public void e() {
        this.f11413a.e();
    }

    @q0
    public Object f() {
        return this.f11413a.c();
    }

    @w0(25)
    /* loaded from: classes.dex */
    public static final class a implements c {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f11414a;

        public a(@o0 Object obj) {
            this.f11414a = (InputContentInfo) obj;
        }

        @Override // j1.h.c
        @q0
        public Uri a() {
            return this.f11414a.getLinkUri();
        }

        @Override // j1.h.c
        @o0
        public ClipDescription b() {
            return this.f11414a.getDescription();
        }

        @Override // j1.h.c
        @o0
        public Object c() {
            return this.f11414a;
        }

        @Override // j1.h.c
        @o0
        public Uri d() {
            return this.f11414a.getContentUri();
        }

        @Override // j1.h.c
        public void e() {
            this.f11414a.requestPermission();
        }

        @Override // j1.h.c
        public void f() {
            this.f11414a.releasePermission();
        }

        public a(@o0 Uri uri, @o0 ClipDescription clipDescription, @q0 Uri uri2) {
            this.f11414a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public h(@o0 c cVar) {
        this.f11413a = cVar;
    }
}