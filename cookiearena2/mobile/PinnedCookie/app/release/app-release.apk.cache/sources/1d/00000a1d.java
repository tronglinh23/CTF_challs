package com.google.android.material.color.utilities;

import d.b1;
import java.util.LinkedHashMap;
import java.util.Map;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class QuantizerMap implements Quantizer {
    Map<Integer, Integer> colorToCount;

    public Map<Integer, Integer> getColorToCount() {
        return this.colorToCount;
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i7) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i8));
            int i9 = 1;
            if (num != null) {
                i9 = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i8), Integer.valueOf(i9));
        }
        this.colorToCount = linkedHashMap;
        return new QuantizerResult(linkedHashMap);
    }
}