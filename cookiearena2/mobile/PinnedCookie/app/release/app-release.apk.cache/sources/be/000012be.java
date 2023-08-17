package k0;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class c {
    @n6.d
    public static final ContentValues a(@n6.d v3.u0<String, ? extends Object>... u0VarArr) {
        u4.l0.p(u0VarArr, "pairs");
        ContentValues contentValues = new ContentValues(u0VarArr.length);
        for (v3.u0<String, ? extends Object> u0Var : u0VarArr) {
            String a7 = u0Var.a();
            Object b7 = u0Var.b();
            if (b7 == null) {
                contentValues.putNull(a7);
            } else if (b7 instanceof String) {
                contentValues.put(a7, (String) b7);
            } else if (b7 instanceof Integer) {
                contentValues.put(a7, (Integer) b7);
            } else if (b7 instanceof Long) {
                contentValues.put(a7, (Long) b7);
            } else if (b7 instanceof Boolean) {
                contentValues.put(a7, (Boolean) b7);
            } else if (b7 instanceof Float) {
                contentValues.put(a7, (Float) b7);
            } else if (b7 instanceof Double) {
                contentValues.put(a7, (Double) b7);
            } else if (b7 instanceof byte[]) {
                contentValues.put(a7, (byte[]) b7);
            } else if (b7 instanceof Byte) {
                contentValues.put(a7, (Byte) b7);
            } else if (!(b7 instanceof Short)) {
                throw new IllegalArgumentException("Illegal value type " + b7.getClass().getCanonicalName() + " for key \"" + a7 + i5.h0.f11093b);
            } else {
                contentValues.put(a7, (Short) b7);
            }
        }
        return contentValues;
    }
}