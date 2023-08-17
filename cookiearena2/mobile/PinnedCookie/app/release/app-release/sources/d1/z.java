package d1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import d.b1;
import d.k1;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import z0.w0;
/* loaded from: classes.dex */
public class z implements Spannable {

    /* renamed from: o  reason: collision with root package name */
    public static final char f8330o = '\n';

    /* renamed from: p  reason: collision with root package name */
    public static final Object f8331p = new Object();
    @d.b0("sLock")
    @o0

    /* renamed from: q  reason: collision with root package name */
    public static Executor f8332q;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public final Spannable f8333k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public final a f8334l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public final int[] f8335m;
    @q0

    /* renamed from: n  reason: collision with root package name */
    public final PrecomputedText f8336n;

    /* loaded from: classes.dex */
    public static class b extends FutureTask<z> {

        /* loaded from: classes.dex */
        public static class a implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            public a f8346a;

            /* renamed from: b  reason: collision with root package name */
            public CharSequence f8347b;

            public a(@o0 a aVar, @o0 CharSequence charSequence) {
                this.f8346a = aVar;
                this.f8347b = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public z call() throws Exception {
                return z.a(this.f8347b, this.f8346a);
            }
        }

        public b(@o0 a aVar, @o0 CharSequence charSequence) {
            super(new a(aVar, charSequence));
        }
    }

    public z(@o0 CharSequence charSequence, @o0 a aVar, @o0 int[] iArr) {
        this.f8333k = new SpannableString(charSequence);
        this.f8334l = aVar;
        this.f8335m = iArr;
        this.f8336n = null;
    }

    @SuppressLint({"WrongConstant"})
    public static z a(@o0 CharSequence charSequence, @o0 a aVar) {
        PrecomputedText.Params params;
        PrecomputedText create;
        g1.s.l(charSequence);
        g1.s.l(aVar);
        try {
            w0.b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.f8341e) != null) {
                create = PrecomputedText.create(charSequence, params);
                return new z(create, aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i7 = 0;
            while (i7 < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i7, length);
                i7 = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i7));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                iArr[i8] = ((Integer) arrayList.get(i8)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.e(), Integer.MAX_VALUE).setBreakStrategy(aVar.b()).setHyphenationFrequency(aVar.c()).setTextDirection(aVar.d()).build();
            return new z(charSequence, aVar, iArr);
        } finally {
            w0.d();
        }
    }

    @k1
    public static Future<z> g(@o0 CharSequence charSequence, @o0 a aVar, @q0 Executor executor) {
        b bVar = new b(aVar, charSequence);
        if (executor == null) {
            synchronized (f8331p) {
                if (f8332q == null) {
                    f8332q = Executors.newFixedThreadPool(1);
                }
                executor = f8332q;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @d.g0(from = 0)
    public int b() {
        int paragraphCount;
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphCount = this.f8336n.getParagraphCount();
            return paragraphCount;
        }
        return this.f8335m.length;
    }

    @d.g0(from = 0)
    public int c(@d.g0(from = 0) int i7) {
        int paragraphEnd;
        g1.s.g(i7, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphEnd = this.f8336n.getParagraphEnd(i7);
            return paragraphEnd;
        }
        return this.f8335m[i7];
    }

    @Override // java.lang.CharSequence
    public char charAt(int i7) {
        return this.f8333k.charAt(i7);
    }

    @d.g0(from = 0)
    public int d(@d.g0(from = 0) int i7) {
        int paragraphStart;
        g1.s.g(i7, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            paragraphStart = this.f8336n.getParagraphStart(i7);
            return paragraphStart;
        } else if (i7 == 0) {
            return 0;
        } else {
            return this.f8335m[i7 - 1];
        }
    }

    @o0
    public a e() {
        return this.f8334l;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    @d.w0(28)
    public PrecomputedText f() {
        if (g.a(this.f8333k)) {
            return h.a(this.f8333k);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f8333k.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f8333k.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f8333k.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i7, int i8, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.f8336n.getSpans(i7, i8, cls);
            return (T[]) spans;
        }
        return (T[]) this.f8333k.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f8333k.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f8333k.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8336n.removeSpan(obj);
        } else {
            this.f8333k.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8336n.setSpan(obj, i7, i8, i9);
        } else {
            this.f8333k.setSpan(obj, i7, i8, i9);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i7, int i8) {
        return this.f8333k.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    @o0
    public String toString() {
        return this.f8333k.toString();
    }

    @d.w0(28)
    public z(@o0 PrecomputedText precomputedText, @o0 a aVar) {
        this.f8333k = precomputedText;
        this.f8334l = aVar;
        this.f8335m = null;
        this.f8336n = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* loaded from: classes.dex */
    public static final class a {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f8337a;
        @q0

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f8338b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8339c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8340d;

        /* renamed from: e  reason: collision with root package name */
        public final PrecomputedText.Params f8341e;

        /* renamed from: d1.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0093a {
            @o0

            /* renamed from: a  reason: collision with root package name */
            public final TextPaint f8342a;

            /* renamed from: c  reason: collision with root package name */
            public int f8344c = 1;

            /* renamed from: d  reason: collision with root package name */
            public int f8345d = 1;

            /* renamed from: b  reason: collision with root package name */
            public TextDirectionHeuristic f8343b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0093a(@o0 TextPaint textPaint) {
                this.f8342a = textPaint;
            }

            @o0
            public a a() {
                return new a(this.f8342a, this.f8343b, this.f8344c, this.f8345d);
            }

            @d.w0(23)
            public C0093a b(int i7) {
                this.f8344c = i7;
                return this;
            }

            @d.w0(23)
            public C0093a c(int i7) {
                this.f8345d = i7;
                return this;
            }

            @d.w0(18)
            public C0093a d(@o0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f8343b = textDirectionHeuristic;
                return this;
            }
        }

        public a(@o0 TextPaint textPaint, @o0 TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                y.a();
                breakStrategy = x.a(textPaint).setBreakStrategy(i7);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i8);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f8341e = build;
            } else {
                this.f8341e = null;
            }
            this.f8337a = textPaint;
            this.f8338b = textDirectionHeuristic;
            this.f8339c = i7;
            this.f8340d = i8;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean a(@o0 a aVar) {
            if (this.f8339c == aVar.b() && this.f8340d == aVar.c() && this.f8337a.getTextSize() == aVar.e().getTextSize() && this.f8337a.getTextScaleX() == aVar.e().getTextScaleX() && this.f8337a.getTextSkewX() == aVar.e().getTextSkewX() && this.f8337a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f8337a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f8337a.getFlags() == aVar.e().getFlags() && this.f8337a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f8337a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f8337a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        @d.w0(23)
        public int b() {
            return this.f8339c;
        }

        @d.w0(23)
        public int c() {
            return this.f8340d;
        }

        @q0
        @d.w0(18)
        public TextDirectionHeuristic d() {
            return this.f8338b;
        }

        @o0
        public TextPaint e() {
            return this.f8337a;
        }

        public boolean equals(@q0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return a(aVar) && this.f8338b == aVar.d();
            }
            return false;
        }

        public int hashCode() {
            return g1.n.b(Float.valueOf(this.f8337a.getTextSize()), Float.valueOf(this.f8337a.getTextScaleX()), Float.valueOf(this.f8337a.getTextSkewX()), Float.valueOf(this.f8337a.getLetterSpacing()), Integer.valueOf(this.f8337a.getFlags()), this.f8337a.getTextLocales(), this.f8337a.getTypeface(), Boolean.valueOf(this.f8337a.isElegantTextHeight()), this.f8338b, Integer.valueOf(this.f8339c), Integer.valueOf(this.f8340d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f8337a.getTextSize());
            sb.append(", textScaleX=" + this.f8337a.getTextScaleX());
            sb.append(", textSkewX=" + this.f8337a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f8337a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f8337a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f8337a.getTextLocales());
            sb.append(", typeface=" + this.f8337a.getTypeface());
            sb.append(", variationSettings=" + this.f8337a.getFontVariationSettings());
            sb.append(", textDir=" + this.f8338b);
            sb.append(", breakStrategy=" + this.f8339c);
            sb.append(", hyphenationFrequency=" + this.f8340d);
            sb.append("}");
            return sb.toString();
        }

        @d.w0(28)
        public a(@o0 PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f8337a = textPaint;
            textDirection = params.getTextDirection();
            this.f8338b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f8339c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f8340d = hyphenationFrequency;
            this.f8341e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
