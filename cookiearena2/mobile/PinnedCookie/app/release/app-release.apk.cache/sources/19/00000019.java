package a1;

import a1.h;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import d.l1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a */
    public static final Comparator<byte[]> f77a = new Comparator() { // from class: a1.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return e.a((byte[]) obj, (byte[]) obj2);
        }
    };

    @w0(16)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        return g(bArr, bArr2);
    }

    public static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals(list.get(i7), list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> d(f fVar, Resources resources) {
        return fVar.b() != null ? fVar.b() : m0.f.c(resources, fVar.c());
    }

    @o0
    public static h.b e(@o0 Context context, @o0 f fVar, @q0 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo f7 = f(context.getPackageManager(), fVar, context.getResources());
        return f7 == null ? h.b.a(1, null) : h.b.a(0, h(context, fVar, f7.authority, cancellationSignal));
    }

    @q0
    @l1
    public static ProviderInfo f(@o0 PackageManager packageManager, @o0 f fVar, @q0 Resources resources) throws PackageManager.NameNotFoundException {
        String f7 = fVar.f();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f7, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + f7);
        } else if (!resolveContentProvider.packageName.equals(fVar.g())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + f7 + ", but package was not " + fVar.g());
        } else {
            List<byte[]> b7 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b7, f77a);
            List<List<byte[]>> d7 = d(fVar, resources);
            for (int i7 = 0; i7 < d7.size(); i7++) {
                ArrayList arrayList = new ArrayList(d7.get(i7));
                Collections.sort(arrayList, f77a);
                if (c(b7, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            byte b8 = bArr2[i7];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return 0;
    }

    @l1
    @o0
    public static h.c[] h(Context context, f fVar, String str, CancellationSignal cancellationSignal) {
        int i7;
        Uri withAppendedId;
        int i8;
        boolean z6;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i9 = 0;
            cursor = a.a(context.getContentResolver(), build, new String[]{"_id", h.a.f103a, h.a.f104b, h.a.f105c, h.a.f106d, h.a.f107e, h.a.f108f}, "query = ?", new String[]{fVar.h()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(h.a.f108f);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex(h.a.f103a);
                int columnIndex4 = cursor.getColumnIndex(h.a.f104b);
                int columnIndex5 = cursor.getColumnIndex(h.a.f106d);
                int columnIndex6 = cursor.getColumnIndex(h.a.f107e);
                while (cursor.moveToNext()) {
                    int i10 = columnIndex != -1 ? cursor.getInt(columnIndex) : i9;
                    int i11 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i9;
                    if (columnIndex3 == -1) {
                        i7 = i10;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i7 = i10;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i12 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i8 = i7;
                        z6 = false;
                    } else {
                        i8 = i7;
                        z6 = true;
                    }
                    arrayList2.add(h.c.a(withAppendedId, i11, i12, z6, i8));
                    i9 = 0;
                }
                arrayList = arrayList2;
            }
            return (h.c[]) arrayList.toArray(new h.c[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}