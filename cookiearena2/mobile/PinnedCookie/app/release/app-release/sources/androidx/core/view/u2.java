package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class u2 {

    /* loaded from: classes.dex */
    public static final class a implements f5.m<View> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3836a;

        public a(ViewGroup viewGroup) {
            this.f3836a = viewGroup;
        }

        @Override // f5.m
        @n6.d
        public Iterator<View> iterator() {
            return u2.k(this.f3836a);
        }
    }

    @u4.r1({"SMAP\nViewGroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewGroup.kt\nandroidx/core/view/ViewGroupKt$descendants$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,175:1\n55#2,4:176\n*S KotlinDebug\n*F\n+ 1 ViewGroup.kt\nandroidx/core/view/ViewGroupKt$descendants$1\n*L\n118#1:176,4\n*E\n"})
    @h4.f(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {119, 121}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    /* loaded from: classes.dex */
    public static final class b extends h4.k implements t4.p<f5.o<? super View>, e4.d<? super v3.m2>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public Object f3837m;

        /* renamed from: n  reason: collision with root package name */
        public Object f3838n;

        /* renamed from: o  reason: collision with root package name */
        public int f3839o;

        /* renamed from: p  reason: collision with root package name */
        public int f3840p;

        /* renamed from: q  reason: collision with root package name */
        public int f3841q;

        /* renamed from: r  reason: collision with root package name */
        public /* synthetic */ Object f3842r;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3843s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f3843s = viewGroup;
        }

        @Override // h4.a
        @n6.d
        public final e4.d<v3.m2> H(@n6.e Object obj, @n6.d e4.d<?> dVar) {
            b bVar = new b(this.f3843s, dVar);
            bVar.f3842r = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008f -> B:22:0x0091). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0098 -> B:24:0x009c). Please submit an issue!!! */
        @Override // h4.a
        @n6.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object Q(@n6.d java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = g4.d.h()
                int r1 = r11.f3841q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3d
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r11.f3840p
                int r4 = r11.f3839o
                java.lang.Object r5 = r11.f3837m
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                java.lang.Object r6 = r11.f3842r
                f5.o r6 = (f5.o) r6
                v3.e1.n(r12)
                r12 = r11
                goto L91
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                int r1 = r11.f3840p
                int r4 = r11.f3839o
                java.lang.Object r5 = r11.f3838n
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r6 = r11.f3837m
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                java.lang.Object r7 = r11.f3842r
                f5.o r7 = (f5.o) r7
                v3.e1.n(r12)
                r12 = r11
                goto L71
            L3d:
                v3.e1.n(r12)
                java.lang.Object r12 = r11.f3842r
                f5.o r12 = (f5.o) r12
                android.view.ViewGroup r1 = r11.f3843s
                int r4 = r1.getChildCount()
                r5 = 0
                r6 = r11
            L4c:
                if (r5 >= r4) goto La1
                android.view.View r7 = r1.getChildAt(r5)
                java.lang.String r8 = "getChildAt(index)"
                u4.l0.o(r7, r8)
                r6.f3842r = r12
                r6.f3837m = r1
                r6.f3838n = r7
                r6.f3839o = r5
                r6.f3840p = r4
                r6.f3841q = r3
                java.lang.Object r8 = r12.a(r7, r6)
                if (r8 != r0) goto L6a
                return r0
            L6a:
                r9 = r7
                r7 = r12
                r12 = r6
                r6 = r1
                r1 = r4
                r4 = r5
                r5 = r9
            L71:
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L98
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                f5.m r5 = androidx.core.view.u2.f(r5)
                r12.f3842r = r7
                r12.f3837m = r6
                r8 = 0
                r12.f3838n = r8
                r12.f3839o = r4
                r12.f3840p = r1
                r12.f3841q = r2
                java.lang.Object r5 = r7.f(r5, r12)
                if (r5 != r0) goto L8f
                return r0
            L8f:
                r5 = r6
                r6 = r7
            L91:
                r9 = r6
                r6 = r12
                r12 = r9
                r10 = r5
                r5 = r1
                r1 = r10
                goto L9c
            L98:
                r5 = r1
                r1 = r6
                r6 = r12
                r12 = r7
            L9c:
                int r4 = r4 + r3
                r9 = r5
                r5 = r4
                r4 = r9
                goto L4c
            La1:
                v3.m2 r12 = v3.m2.f17815a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.u2.b.Q(java.lang.Object):java.lang.Object");
        }

        @Override // t4.p
        @n6.e
        /* renamed from: S  reason: merged with bridge method [inline-methods] */
        public final Object J(@n6.d f5.o<? super View> oVar, @n6.e e4.d<? super v3.m2> dVar) {
            return ((b) H(oVar, dVar)).Q(v3.m2.f17815a);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Iterator<View>, v4.d {

        /* renamed from: k  reason: collision with root package name */
        public int f3844k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3845l;

        public c(ViewGroup viewGroup) {
            this.f3845l = viewGroup;
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f3845l;
            int i7 = this.f3844k;
            this.f3844k = i7 + 1;
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3844k < this.f3845l.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f3845l;
            int i7 = this.f3844k - 1;
            this.f3844k = i7;
            viewGroup.removeViewAt(i7);
        }
    }

    public static final boolean a(@n6.d ViewGroup viewGroup, @n6.d View view) {
        u4.l0.p(viewGroup, "<this>");
        u4.l0.p(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void b(@n6.d ViewGroup viewGroup, @n6.d t4.l<? super View, v3.m2> lVar) {
        u4.l0.p(viewGroup, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            u4.l0.o(childAt, "getChildAt(index)");
            lVar.O(childAt);
        }
    }

    public static final void c(@n6.d ViewGroup viewGroup, @n6.d t4.p<? super Integer, ? super View, v3.m2> pVar) {
        u4.l0.p(viewGroup, "<this>");
        u4.l0.p(pVar, s2.t0.f16450f);
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            Integer valueOf = Integer.valueOf(i7);
            View childAt = viewGroup.getChildAt(i7);
            u4.l0.o(childAt, "getChildAt(index)");
            pVar.J(valueOf, childAt);
        }
    }

    @n6.d
    public static final View d(@n6.d ViewGroup viewGroup, int i7) {
        u4.l0.p(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i7);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i7 + ", Size: " + viewGroup.getChildCount());
    }

    @n6.d
    public static final f5.m<View> e(@n6.d ViewGroup viewGroup) {
        u4.l0.p(viewGroup, "<this>");
        return new a(viewGroup);
    }

    @n6.d
    public static final f5.m<View> f(@n6.d ViewGroup viewGroup) {
        u4.l0.p(viewGroup, "<this>");
        return f5.q.b(new b(viewGroup, null));
    }

    @n6.d
    public static final d5.l g(@n6.d ViewGroup viewGroup) {
        u4.l0.p(viewGroup, "<this>");
        return d5.u.W1(0, viewGroup.getChildCount());
    }

    public static final int h(@n6.d ViewGroup viewGroup) {
        u4.l0.p(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean i(@n6.d ViewGroup viewGroup) {
        u4.l0.p(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean j(@n6.d ViewGroup viewGroup) {
        u4.l0.p(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    @n6.d
    public static final Iterator<View> k(@n6.d ViewGroup viewGroup) {
        u4.l0.p(viewGroup, "<this>");
        return new c(viewGroup);
    }

    public static final void l(@n6.d ViewGroup viewGroup, @n6.d View view) {
        u4.l0.p(viewGroup, "<this>");
        u4.l0.p(view, "view");
        viewGroup.removeView(view);
    }

    public static final void m(@n6.d ViewGroup viewGroup, @n6.d View view) {
        u4.l0.p(viewGroup, "<this>");
        u4.l0.p(view, "view");
        viewGroup.addView(view);
    }

    public static final void n(@n6.d ViewGroup.MarginLayoutParams marginLayoutParams, @d.u0 int i7) {
        u4.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i7, i7, i7, i7);
    }

    public static final void o(@n6.d ViewGroup.MarginLayoutParams marginLayoutParams, @d.u0 int i7, @d.u0 int i8, @d.u0 int i9, @d.u0 int i10) {
        u4.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i7, i8, i9, i10);
    }

    public static /* synthetic */ void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = marginLayoutParams.leftMargin;
        }
        if ((i11 & 2) != 0) {
            i8 = marginLayoutParams.topMargin;
        }
        if ((i11 & 4) != 0) {
            i9 = marginLayoutParams.rightMargin;
        }
        if ((i11 & 8) != 0) {
            i10 = marginLayoutParams.bottomMargin;
        }
        u4.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i7, i8, i9, i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @d.w0(17)
    public static final void q(@n6.d ViewGroup.MarginLayoutParams marginLayoutParams, @d.u0 int i7, @d.u0 int i8, @d.u0 int i9, @d.u0 int i10) {
        u4.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i7);
        marginLayoutParams.topMargin = i8;
        marginLayoutParams.setMarginEnd(i9);
        marginLayoutParams.bottomMargin = i10;
    }

    public static /* synthetic */ void r(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = marginLayoutParams.getMarginStart();
        }
        if ((i11 & 2) != 0) {
            i8 = marginLayoutParams.topMargin;
        }
        if ((i11 & 4) != 0) {
            i9 = marginLayoutParams.getMarginEnd();
        }
        if ((i11 & 8) != 0) {
            i10 = marginLayoutParams.bottomMargin;
        }
        u4.l0.p(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i7);
        marginLayoutParams.topMargin = i8;
        marginLayoutParams.setMarginEnd(i9);
        marginLayoutParams.bottomMargin = i10;
    }
}
