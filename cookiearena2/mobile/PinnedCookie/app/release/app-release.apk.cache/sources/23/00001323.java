package k1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import d.k1;
import d.o0;
import d.q0;

/* loaded from: classes.dex */
public class i extends ProgressBar {

    /* renamed from: h */
    public static final int f11580h = 500;

    /* renamed from: i */
    public static final int f11581i = 500;

    /* renamed from: b */
    public long f11582b;

    /* renamed from: c */
    public boolean f11583c;

    /* renamed from: d */
    public boolean f11584d;

    /* renamed from: e */
    public boolean f11585e;

    /* renamed from: f */
    public final Runnable f11586f;

    /* renamed from: g */
    public final Runnable f11587g;

    public i(@o0 Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(i iVar) {
        iVar.g();
    }

    public static /* synthetic */ void b(i iVar) {
        iVar.f();
    }

    public static /* synthetic */ void c(i iVar) {
        iVar.h();
    }

    public static /* synthetic */ void d(i iVar) {
        iVar.k();
    }

    public /* synthetic */ void g() {
        this.f11583c = false;
        this.f11582b = -1L;
        setVisibility(8);
    }

    public /* synthetic */ void h() {
        this.f11584d = false;
        if (this.f11585e) {
            return;
        }
        this.f11582b = System.currentTimeMillis();
        setVisibility(0);
    }

    public void e() {
        post(new Runnable() { // from class: k1.f
            @Override // java.lang.Runnable
            public final void run() {
                i.b(i.this);
            }
        });
    }

    @k1
    public final void f() {
        this.f11585e = true;
        removeCallbacks(this.f11587g);
        this.f11584d = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j7 = this.f11582b;
        long j8 = currentTimeMillis - j7;
        if (j8 >= 500 || j7 == -1) {
            setVisibility(8);
        } else if (this.f11583c) {
        } else {
            postDelayed(this.f11586f, 500 - j8);
            this.f11583c = true;
        }
    }

    public final void i() {
        removeCallbacks(this.f11586f);
        removeCallbacks(this.f11587g);
    }

    public void j() {
        post(new Runnable() { // from class: k1.e
            @Override // java.lang.Runnable
            public final void run() {
                i.d(i.this);
            }
        });
    }

    @k1
    public final void k() {
        this.f11582b = -1L;
        this.f11585e = false;
        removeCallbacks(this.f11586f);
        this.f11583c = false;
        if (this.f11584d) {
            return;
        }
        postDelayed(this.f11587g, 500L);
        this.f11584d = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    public i(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11582b = -1L;
        this.f11583c = false;
        this.f11584d = false;
        this.f11585e = false;
        this.f11586f = new Runnable() { // from class: k1.g
            @Override // java.lang.Runnable
            public final void run() {
                i.a(i.this);
            }
        };
        this.f11587g = new Runnable() { // from class: k1.h
            @Override // java.lang.Runnable
            public final void run() {
                i.c(i.this);
            }
        };
    }
}