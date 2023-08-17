package w0;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;
/* loaded from: classes.dex */
public interface h extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i7) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@d.o0 List<Location> list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            onLocationChanged(list.get(i7));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@d.o0 String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@d.o0 String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@d.o0 String str, int i7, @d.q0 Bundle bundle) {
    }
}
