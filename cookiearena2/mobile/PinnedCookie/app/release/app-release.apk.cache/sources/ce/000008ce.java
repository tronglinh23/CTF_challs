package c2;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import h6.e;

@Deprecated
/* loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7816a = "androidx.contentpager.content.wakelockid";

    /* renamed from: b  reason: collision with root package name */
    public static final SparseArray<PowerManager.WakeLock> f7817b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public static int f7818c = 1;

    public static boolean a(Intent intent) {
        int intExtra = intent.getIntExtra(f7816a, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f7817b;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }

    public static ComponentName b(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f7817b;
        synchronized (sparseArray) {
            int i7 = f7818c;
            int i8 = i7 + 1;
            f7818c = i8;
            if (i8 <= 0) {
                f7818c = 1;
            }
            intent.putExtra(f7816a, i7);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(e.B);
            sparseArray.put(i7, newWakeLock);
            return startService;
        }
    }
}