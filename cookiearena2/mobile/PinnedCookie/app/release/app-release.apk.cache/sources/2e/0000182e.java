package p0;

import android.content.Context;
import android.graphics.Typeface;
import d.b1;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@d.b1({b1.a.LIBRARY_GROUP_PREFIX})
@d.w0(28)
/* loaded from: classes.dex */
public class n1 extends m1 {
    public static final String B = "createFromFamiliesWithDefault";
    public static final int C = -1;
    public static final String D = "sans-serif";

    @Override // p0.m1
    public Method B(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p0.m1, p0.k1, p0.m2
    @d.o0
    public Typeface g(@d.o0 Context context, @d.o0 Typeface typeface, int i7, boolean z6) {
        Typeface create;
        create = Typeface.create(typeface, i7, z6);
        return create;
    }

    @Override // p0.m1
    public Typeface p(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f14536m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f14542s.invoke(null, newInstance, D, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }
}