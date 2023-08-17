package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final View f3677a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3678b;

    /* renamed from: c  reason: collision with root package name */
    public int f3679c;

    /* renamed from: d  reason: collision with root package name */
    public int f3680d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3681e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnLongClickListener f3682f = new View.OnLongClickListener() { // from class: androidx.core.view.i0
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return k0.this.d(view);
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public final View.OnTouchListener f3683g = new View.OnTouchListener() { // from class: androidx.core.view.j0
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return k0.this.e(view, motionEvent);
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        boolean a(@d.o0 View view, @d.o0 k0 k0Var);
    }

    public k0(@d.o0 View view, @d.o0 a aVar) {
        this.f3677a = view;
        this.f3678b = aVar;
    }

    public void a() {
        this.f3677a.setOnLongClickListener(this.f3682f);
        this.f3677a.setOnTouchListener(this.f3683g);
    }

    public void b() {
        this.f3677a.setOnLongClickListener(null);
        this.f3677a.setOnTouchListener(null);
    }

    public void c(@d.o0 Point point) {
        point.set(this.f3679c, this.f3680d);
    }

    public boolean d(@d.o0 View view) {
        return this.f3678b.a(view, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r2 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(@d.o0 android.view.View r7, @d.o0 android.view.MotionEvent r8) {
        /*
            r6 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 0
            if (r2 == 0) goto L49
            r4 = 1
            if (r2 == r4) goto L46
            r5 = 2
            if (r2 == r5) goto L1b
            r7 = 3
            if (r2 == r7) goto L46
            goto L4d
        L1b:
            r2 = 8194(0x2002, float:1.1482E-41)
            boolean r2 = androidx.core.view.b1.l(r8, r2)
            if (r2 == 0) goto L4d
            int r8 = r8.getButtonState()
            r8 = r8 & r4
            if (r8 != 0) goto L2b
            goto L4d
        L2b:
            boolean r8 = r6.f3681e
            if (r8 == 0) goto L30
            goto L4d
        L30:
            int r8 = r6.f3679c
            if (r8 != r0) goto L39
            int r8 = r6.f3680d
            if (r8 != r1) goto L39
            goto L4d
        L39:
            r6.f3679c = r0
            r6.f3680d = r1
            androidx.core.view.k0$a r8 = r6.f3678b
            boolean r7 = r8.a(r7, r6)
            r6.f3681e = r7
            return r7
        L46:
            r6.f3681e = r3
            goto L4d
        L49:
            r6.f3679c = r0
            r6.f3680d = r1
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.k0.e(android.view.View, android.view.MotionEvent):boolean");
    }
}