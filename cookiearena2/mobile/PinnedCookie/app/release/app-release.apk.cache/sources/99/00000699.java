package androidx.recyclerview.widget;

import android.view.View;
import d1.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f5338c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f5339d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f5340e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f5341f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f5342g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f5343h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f5344i = 4;

    /* renamed from: j  reason: collision with root package name */
    public static final int f5345j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f5346k = 16;

    /* renamed from: l  reason: collision with root package name */
    public static final int f5347l = 32;

    /* renamed from: m  reason: collision with root package name */
    public static final int f5348m = 64;

    /* renamed from: n  reason: collision with root package name */
    public static final int f5349n = 8;

    /* renamed from: o  reason: collision with root package name */
    public static final int f5350o = 256;

    /* renamed from: p  reason: collision with root package name */
    public static final int f5351p = 512;

    /* renamed from: q  reason: collision with root package name */
    public static final int f5352q = 1024;

    /* renamed from: r  reason: collision with root package name */
    public static final int f5353r = 12;

    /* renamed from: s  reason: collision with root package name */
    public static final int f5354s = 4096;

    /* renamed from: t  reason: collision with root package name */
    public static final int f5355t = 8192;

    /* renamed from: u  reason: collision with root package name */
    public static final int f5356u = 16384;

    /* renamed from: v  reason: collision with root package name */
    public static final int f5357v = 7;

    /* renamed from: a  reason: collision with root package name */
    public final b f5358a;

    /* renamed from: b  reason: collision with root package name */
    public a f5359b = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5360a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f5361b;

        /* renamed from: c  reason: collision with root package name */
        public int f5362c;

        /* renamed from: d  reason: collision with root package name */
        public int f5363d;

        /* renamed from: e  reason: collision with root package name */
        public int f5364e;

        public void a(int i7) {
            this.f5360a = i7 | this.f5360a;
        }

        public boolean b() {
            int i7 = this.f5360a;
            if ((i7 & 7) == 0 || (i7 & (c(this.f5363d, this.f5361b) << 0)) != 0) {
                int i8 = this.f5360a;
                if ((i8 & androidx.appcompat.widget.g0.f1602o) == 0 || (i8 & (c(this.f5363d, this.f5362c) << 4)) != 0) {
                    int i9 = this.f5360a;
                    if ((i9 & a.b.f8291f) == 0 || (i9 & (c(this.f5364e, this.f5361b) << 8)) != 0) {
                        int i10 = this.f5360a;
                        return (i10 & 28672) == 0 || (i10 & (c(this.f5364e, this.f5362c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int c(int i7, int i8) {
            if (i7 > i8) {
                return 1;
            }
            return i7 == i8 ? 2 : 4;
        }

        public void d() {
            this.f5360a = 0;
        }

        public void e(int i7, int i8, int i9, int i10) {
            this.f5361b = i7;
            this.f5362c = i8;
            this.f5363d = i9;
            this.f5364e = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        View a(int i7);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    public g0(b bVar) {
        this.f5358a = bVar;
    }

    public View a(int i7, int i8, int i9, int i10) {
        int d7 = this.f5358a.d();
        int b7 = this.f5358a.b();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i8) {
            View a7 = this.f5358a.a(i7);
            this.f5359b.e(d7, b7, this.f5358a.c(a7), this.f5358a.e(a7));
            if (i9 != 0) {
                this.f5359b.d();
                this.f5359b.a(i9);
                if (this.f5359b.b()) {
                    return a7;
                }
            }
            if (i10 != 0) {
                this.f5359b.d();
                this.f5359b.a(i10);
                if (this.f5359b.b()) {
                    view = a7;
                }
            }
            i7 += i11;
        }
        return view;
    }

    public boolean b(View view, int i7) {
        this.f5359b.e(this.f5358a.d(), this.f5358a.b(), this.f5358a.c(view), this.f5358a.e(view));
        if (i7 != 0) {
            this.f5359b.d();
            this.f5359b.a(i7);
            return this.f5359b.b();
        }
        return false;
    }
}