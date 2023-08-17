package m3;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import d.b1;
import d.o0;
import d.q0;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13504a = "a";

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static <T extends h> T a(InputStream inputStream) {
        return (T) new g(inputStream, null).g0();
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static <T extends h> T b(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @q0
    public static <T extends h> T c(@o0 Bundle bundle, @o0 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(c.class.getClassLoader());
            return (T) b(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @q0
    public static <T extends h> List<T> d(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(c.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(b((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void e(@o0 Bundle bundle, @o0 String str, @q0 h hVar) {
        if (hVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", h(hVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void f(@o0 Bundle bundle, @o0 String str, @o0 List<? extends h> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<? extends h> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h(it.next()));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static void g(h hVar, OutputStream outputStream) {
        g gVar = new g(null, outputStream);
        gVar.l1(hVar);
        gVar.a();
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static Parcelable h(h hVar) {
        return new ParcelImpl(hVar);
    }
}
