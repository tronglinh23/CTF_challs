package u4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Object> f17485a;

    public s1(int i7) {
        this.f17485a = new ArrayList<>(i7);
    }

    public void a(Object obj) {
        this.f17485a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f17485a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f17485a, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f17485a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f17485a.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f17485a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f17485a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f17485a.toArray(objArr);
    }
}
