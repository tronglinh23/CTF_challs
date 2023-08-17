package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import d.o0;
import d.q0;
import i3.a;
import i3.d;

/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@o0 Uri uri, @q0 String str, @q0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @q0
    public final String getType(@o0 Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @q0
    public final Uri insert(@o0 Uri uri, @q0 ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                a.e(context).a();
                return true;
            }
            return true;
        }
        throw new d("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    @q0
    public final Cursor query(@o0 Uri uri, @q0 String[] strArr, @q0 String str, @q0 String[] strArr2, @q0 String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(@o0 Uri uri, @q0 ContentValues contentValues, @q0 String str, @q0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}