package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.b1;
import d.g0;
import d.o0;
import d.q0;
import java.lang.reflect.Constructor;
@b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
final class StaticLayoutBuilderCompat {
    static final int DEFAULT_HYPHENATION_FREQUENCY = 1;
    static final float DEFAULT_LINE_SPACING_ADD = 0.0f;
    static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.0f;
    private static final String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final String TEXT_DIR_CLASS_LTR = "LTR";
    private static final String TEXT_DIR_CLASS_RTL = "RTL";
    @q0
    private static Constructor<StaticLayout> constructor;
    private static boolean initialized;
    @q0
    private static Object textDirection;
    private int end;
    private boolean isRtl;
    private final TextPaint paint;
    private CharSequence source;
    @q0
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;
    private int start = 0;
    private Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
    private int maxLines = Integer.MAX_VALUE;
    private float lineSpacingAdd = 0.0f;
    private float lineSpacingMultiplier = 1.0f;
    private int hyphenationFrequency = DEFAULT_HYPHENATION_FREQUENCY;
    private boolean includePad = true;
    @q0
    private TextUtils.TruncateAt ellipsize = null;

    /* loaded from: classes.dex */
    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.source = charSequence;
        this.paint = textPaint;
        this.width = i7;
        this.end = charSequence.length();
    }

    private void createConstructorWithReflection() throws StaticLayoutBuilderCompatException {
        if (initialized) {
            return;
        }
        try {
            textDirection = this.isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            constructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            initialized = true;
        } catch (Exception e7) {
            throw new StaticLayoutBuilderCompatException(e7);
        }
    }

    @o0
    public static StaticLayoutBuilderCompat obtain(@o0 CharSequence charSequence, @o0 TextPaint textPaint, @g0(from = 0) int i7) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i7);
    }

    public StaticLayout build() throws StaticLayoutBuilderCompatException {
        if (this.source == null) {
            this.source = "";
        }
        int max = Math.max(0, this.width);
        CharSequence charSequence = this.source;
        if (this.maxLines == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.paint, max, this.ellipsize);
        }
        int min = Math.min(charSequence.length(), this.end);
        this.end = min;
        if (this.isRtl && this.maxLines == 1) {
            this.alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.start, min, this.paint, max);
        obtain.setAlignment(this.alignment);
        obtain.setIncludePad(this.includePad);
        obtain.setTextDirection(this.isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.ellipsize;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.maxLines);
        float f7 = this.lineSpacingAdd;
        if (f7 != 0.0f || this.lineSpacingMultiplier != 1.0f) {
            obtain.setLineSpacing(f7, this.lineSpacingMultiplier);
        }
        if (this.maxLines > 1) {
            obtain.setHyphenationFrequency(this.hyphenationFrequency);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.staticLayoutBuilderConfigurer;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.configure(obtain);
        }
        return obtain.build();
    }

    @CanIgnoreReturnValue
    @o0
    public StaticLayoutBuilderCompat setAlignment(@o0 Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public StaticLayoutBuilderCompat setEllipsize(@q0 TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public StaticLayoutBuilderCompat setEnd(@g0(from = 0) int i7) {
        this.end = i7;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public StaticLayoutBuilderCompat setHyphenationFrequency(int i7) {
        this.hyphenationFrequency = i7;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public StaticLayoutBuilderCompat setIncludePad(boolean z6) {
        this.includePad = z6;
        return this;
    }

    public StaticLayoutBuilderCompat setIsRtl(boolean z6) {
        this.isRtl = z6;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public StaticLayoutBuilderCompat setLineSpacing(float f7, float f8) {
        this.lineSpacingAdd = f7;
        this.lineSpacingMultiplier = f8;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public StaticLayoutBuilderCompat setMaxLines(@g0(from = 0) int i7) {
        this.maxLines = i7;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public StaticLayoutBuilderCompat setStart(@g0(from = 0) int i7) {
        this.start = i7;
        return this;
    }

    @CanIgnoreReturnValue
    @o0
    public StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(@q0 StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
        return this;
    }
}
