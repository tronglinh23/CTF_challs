package z0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class i {
    @n6.d
    public static final Bundle a() {
        return new Bundle(0);
    }

    @n6.d
    public static final Bundle b(@n6.d v3.u0<String, ? extends Object>... u0VarArr) {
        u4.l0.p(u0VarArr, "pairs");
        Bundle bundle = new Bundle(u0VarArr.length);
        for (v3.u0<String, ? extends Object> u0Var : u0VarArr) {
            String a7 = u0Var.a();
            Object b7 = u0Var.b();
            if (b7 == null) {
                bundle.putString(a7, null);
            } else if (b7 instanceof Boolean) {
                bundle.putBoolean(a7, ((Boolean) b7).booleanValue());
            } else if (b7 instanceof Byte) {
                bundle.putByte(a7, ((Number) b7).byteValue());
            } else if (b7 instanceof Character) {
                bundle.putChar(a7, ((Character) b7).charValue());
            } else if (b7 instanceof Double) {
                bundle.putDouble(a7, ((Number) b7).doubleValue());
            } else if (b7 instanceof Float) {
                bundle.putFloat(a7, ((Number) b7).floatValue());
            } else if (b7 instanceof Integer) {
                bundle.putInt(a7, ((Number) b7).intValue());
            } else if (b7 instanceof Long) {
                bundle.putLong(a7, ((Number) b7).longValue());
            } else if (b7 instanceof Short) {
                bundle.putShort(a7, ((Number) b7).shortValue());
            } else if (b7 instanceof Bundle) {
                bundle.putBundle(a7, (Bundle) b7);
            } else if (b7 instanceof CharSequence) {
                bundle.putCharSequence(a7, (CharSequence) b7);
            } else if (b7 instanceof Parcelable) {
                bundle.putParcelable(a7, (Parcelable) b7);
            } else if (b7 instanceof boolean[]) {
                bundle.putBooleanArray(a7, (boolean[]) b7);
            } else if (b7 instanceof byte[]) {
                bundle.putByteArray(a7, (byte[]) b7);
            } else if (b7 instanceof char[]) {
                bundle.putCharArray(a7, (char[]) b7);
            } else if (b7 instanceof double[]) {
                bundle.putDoubleArray(a7, (double[]) b7);
            } else if (b7 instanceof float[]) {
                bundle.putFloatArray(a7, (float[]) b7);
            } else if (b7 instanceof int[]) {
                bundle.putIntArray(a7, (int[]) b7);
            } else if (b7 instanceof long[]) {
                bundle.putLongArray(a7, (long[]) b7);
            } else if (b7 instanceof short[]) {
                bundle.putShortArray(a7, (short[]) b7);
            } else if (b7 instanceof Object[]) {
                Class<?> componentType = b7.getClass().getComponentType();
                u4.l0.m(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    u4.l0.n(b7, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(a7, (Parcelable[]) b7);
                } else if (String.class.isAssignableFrom(componentType)) {
                    u4.l0.n(b7, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(a7, (String[]) b7);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    u4.l0.n(b7, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(a7, (CharSequence[]) b7);
                } else if (!Serializable.class.isAssignableFrom(componentType)) {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a7 + i5.h0.f11093b);
                } else {
                    bundle.putSerializable(a7, (Serializable) b7);
                }
            } else if (b7 instanceof Serializable) {
                bundle.putSerializable(a7, (Serializable) b7);
            } else if (b7 instanceof IBinder) {
                b.a(bundle, a7, (IBinder) b7);
            } else if (b7 instanceof Size) {
                c.a(bundle, a7, (Size) b7);
            } else if (!(b7 instanceof SizeF)) {
                throw new IllegalArgumentException("Illegal value type " + b7.getClass().getCanonicalName() + " for key \"" + a7 + i5.h0.f11093b);
            } else {
                c.b(bundle, a7, (SizeF) b7);
            }
        }
        return bundle;
    }
}
