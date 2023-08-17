package k1;

import android.os.Build;
import d.b1;
import d.o0;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface b {
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f11569a;

    static {
        f11569a = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@o0 int[] iArr, int i7) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i7);
}