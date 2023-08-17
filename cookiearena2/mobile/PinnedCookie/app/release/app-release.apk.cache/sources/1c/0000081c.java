package b0;

import android.view.View;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public float f7150a;

    /* renamed from: b  reason: collision with root package name */
    public int f7151b;

    /* renamed from: c  reason: collision with root package name */
    public int f7152c;

    /* renamed from: d  reason: collision with root package name */
    public int f7153d;

    /* renamed from: e  reason: collision with root package name */
    public int f7154e;

    public void a(View v6) {
        this.f7151b = v6.getLeft();
        this.f7152c = v6.getTop();
        this.f7153d = v6.getRight();
        this.f7154e = v6.getBottom();
        this.f7150a = v6.getRotation();
    }

    public int b() {
        return this.f7154e - this.f7152c;
    }

    public int c() {
        return this.f7153d - this.f7151b;
    }
}