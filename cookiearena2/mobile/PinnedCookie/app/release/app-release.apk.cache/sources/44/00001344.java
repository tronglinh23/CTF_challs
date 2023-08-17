package k1;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import s2.t0;
import u4.l0;
import u4.n0;
import u4.r1;
import v3.m2;

@r1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,97:1\n65#1:98\n77#1,4:99\n93#1,3:103\n65#1,16:106\n93#1,3:122\n65#1,16:125\n93#1,3:141\n*S KotlinDebug\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n35#1:98\n35#1:99,4\n35#1:103,3\n49#1:106,16\n49#1:122,3\n58#1:125,16\n58#1:141,3\n*E\n"})
/* loaded from: classes.dex */
public final class z {

    @r1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n*L\n1#1,97:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.r<CharSequence, Integer, Integer, Integer, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final a f11616l = new a();

        public a() {
            super(4);
        }

        public final void b(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // t4.r
        public /* bridge */ /* synthetic */ m2 l0(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            b(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return m2.f17815a;
        }
    }

    @r1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class b extends n0 implements t4.r<CharSequence, Integer, Integer, Integer, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final b f11617l = new b();

        public b() {
            super(4);
        }

        public final void b(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // t4.r
        public /* bridge */ /* synthetic */ m2 l0(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            b(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return m2.f17815a;
        }
    }

    @r1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n*L\n1#1,97:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class c extends n0 implements t4.l<Editable, m2> {

        /* renamed from: l  reason: collision with root package name */
        public static final c f11618l = new c();

        public c() {
            super(1);
        }

        @Override // t4.l
        public /* bridge */ /* synthetic */ m2 O(Editable editable) {
            b(editable);
            return m2.f17815a;
        }

        public final void b(@n6.e Editable editable) {
        }
    }

    @r1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n*L\n1#1,97:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class d implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l<Editable, m2> f11619b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t4.r<CharSequence, Integer, Integer, Integer, m2> f11620c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ t4.r<CharSequence, Integer, Integer, Integer, m2> f11621d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(t4.l<? super Editable, m2> lVar, t4.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> rVar, t4.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> rVar2) {
            this.f11619b = lVar;
            this.f11620c = rVar;
            this.f11621d = rVar2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@n6.e Editable editable) {
            this.f11619b.O(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
            this.f11620c.l0(charSequence, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
            this.f11621d.l0(charSequence, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
        }
    }

    @r1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n71#2:98\n77#3:99\n*E\n"})
    /* loaded from: classes.dex */
    public static final class e implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.l f11622b;

        public e(t4.l lVar) {
            this.f11622b = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@n6.e Editable editable) {
            this.f11622b.O(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    @r1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n78#2:98\n77#3:99\n*E\n"})
    /* loaded from: classes.dex */
    public static final class f implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.r f11623b;

        public f(t4.r rVar) {
            this.f11623b = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@n6.e Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
            this.f11623b.l0(charSequence, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    @r1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$3\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n*L\n1#1,97:1\n78#2:98\n71#3:99\n*E\n"})
    /* loaded from: classes.dex */
    public static final class g implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t4.r f11624b;

        public g(t4.r rVar) {
            this.f11624b = rVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@n6.e Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@n6.e CharSequence charSequence, int i7, int i8, int i9) {
            this.f11624b.l0(charSequence, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
        }
    }

    @n6.d
    public static final TextWatcher a(@n6.d TextView textView, @n6.d t4.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> rVar, @n6.d t4.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> rVar2, @n6.d t4.l<? super Editable, m2> lVar) {
        l0.p(textView, "<this>");
        l0.p(rVar, "beforeTextChanged");
        l0.p(rVar2, "onTextChanged");
        l0.p(lVar, "afterTextChanged");
        d dVar = new d(lVar, rVar, rVar2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    public static /* synthetic */ TextWatcher b(TextView textView, t4.r rVar, t4.r rVar2, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            rVar = a.f11616l;
        }
        if ((i7 & 2) != 0) {
            rVar2 = b.f11617l;
        }
        if ((i7 & 4) != 0) {
            lVar = c.f11618l;
        }
        l0.p(textView, "<this>");
        l0.p(rVar, "beforeTextChanged");
        l0.p(rVar2, "onTextChanged");
        l0.p(lVar, "afterTextChanged");
        d dVar = new d(lVar, rVar, rVar2);
        textView.addTextChangedListener(dVar);
        return dVar;
    }

    @n6.d
    public static final TextWatcher c(@n6.d TextView textView, @n6.d t4.l<? super Editable, m2> lVar) {
        l0.p(textView, "<this>");
        l0.p(lVar, t0.f16450f);
        e eVar = new e(lVar);
        textView.addTextChangedListener(eVar);
        return eVar;
    }

    @n6.d
    public static final TextWatcher d(@n6.d TextView textView, @n6.d t4.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> rVar) {
        l0.p(textView, "<this>");
        l0.p(rVar, t0.f16450f);
        f fVar = new f(rVar);
        textView.addTextChangedListener(fVar);
        return fVar;
    }

    @n6.d
    public static final TextWatcher e(@n6.d TextView textView, @n6.d t4.r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, m2> rVar) {
        l0.p(textView, "<this>");
        l0.p(rVar, t0.f16450f);
        g gVar = new g(rVar);
        textView.addTextChangedListener(gVar);
        return gVar;
    }
}