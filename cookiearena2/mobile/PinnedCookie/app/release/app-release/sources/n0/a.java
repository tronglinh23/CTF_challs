package n0;

import android.database.Cursor;
import u4.l0;
/* loaded from: classes.dex */
public final class a {
    @n6.e
    public static final byte[] a(@n6.d Cursor cursor, int i7) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i7)) {
            return null;
        }
        return cursor.getBlob(i7);
    }

    @n6.e
    public static final Double b(@n6.d Cursor cursor, int i7) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i7)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i7));
    }

    @n6.e
    public static final Float c(@n6.d Cursor cursor, int i7) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i7)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i7));
    }

    @n6.e
    public static final Integer d(@n6.d Cursor cursor, int i7) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i7)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i7));
    }

    @n6.e
    public static final Long e(@n6.d Cursor cursor, int i7) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i7)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i7));
    }

    @n6.e
    public static final Short f(@n6.d Cursor cursor, int i7) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i7)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i7));
    }

    @n6.e
    public static final String g(@n6.d Cursor cursor, int i7) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i7)) {
            return null;
        }
        return cursor.getString(i7);
    }
}
