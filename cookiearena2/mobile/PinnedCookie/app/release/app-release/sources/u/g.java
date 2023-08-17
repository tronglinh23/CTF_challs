package u;

import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Object, HashMap<String, float[]>> f16932a = new HashMap<>();

    public float a(Object obj, String str, int i7) {
        HashMap<String, float[]> hashMap;
        float[] fArr;
        if (this.f16932a.containsKey(obj) && (hashMap = this.f16932a.get(obj)) != null && hashMap.containsKey(str) && (fArr = hashMap.get(str)) != null && fArr.length > i7) {
            return fArr[i7];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i7, float f7) {
        if (!this.f16932a.containsKey(obj)) {
            HashMap<String, float[]> hashMap = new HashMap<>();
            float[] fArr = new float[i7 + 1];
            fArr[i7] = f7;
            hashMap.put(str, fArr);
            this.f16932a.put(obj, hashMap);
            return;
        }
        HashMap<String, float[]> hashMap2 = this.f16932a.get(obj);
        if (hashMap2 == null) {
            hashMap2 = new HashMap<>();
        }
        if (!hashMap2.containsKey(str)) {
            float[] fArr2 = new float[i7 + 1];
            fArr2[i7] = f7;
            hashMap2.put(str, fArr2);
            this.f16932a.put(obj, hashMap2);
            return;
        }
        float[] fArr3 = hashMap2.get(str);
        if (fArr3 == null) {
            fArr3 = new float[0];
        }
        if (fArr3.length <= i7) {
            fArr3 = Arrays.copyOf(fArr3, i7 + 1);
        }
        fArr3[i7] = f7;
        hashMap2.put(str, fArr3);
    }
}
