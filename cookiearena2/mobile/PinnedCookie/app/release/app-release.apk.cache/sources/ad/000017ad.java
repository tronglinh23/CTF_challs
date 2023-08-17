package o0;

import android.database.sqlite.SQLiteDatabase;
import n6.d;
import t4.l;
import u4.i0;
import u4.l0;

/* loaded from: classes.dex */
public final class c {
    public static final <T> T a(@d SQLiteDatabase sQLiteDatabase, boolean z6, @d l<? super SQLiteDatabase, ? extends T> lVar) {
        l0.p(sQLiteDatabase, "<this>");
        l0.p(lVar, y0.c.f18717e);
        if (z6) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T O = lVar.O(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return O;
        } finally {
            i0.d(1);
            sQLiteDatabase.endTransaction();
            i0.c(1);
        }
    }

    public static /* synthetic */ Object b(SQLiteDatabase sQLiteDatabase, boolean z6, l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = true;
        }
        l0.p(sQLiteDatabase, "<this>");
        l0.p(lVar, y0.c.f18717e);
        if (z6) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object O = lVar.O(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return O;
        } finally {
            i0.d(1);
            sQLiteDatabase.endTransaction();
            i0.c(1);
        }
    }
}