package com.google.android.material.color.utilities;

import d.b1;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class QuantizerCelebi {
    private QuantizerCelebi() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int i7) {
        Set<Integer> keySet = new QuantizerWu().quantize(iArr, i7).colorToCount.keySet();
        int[] iArr2 = new int[keySet.size()];
        Iterator<Integer> it = keySet.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr2[i8] = it.next().intValue();
            i8++;
        }
        return QuantizerWsmeans.quantize(iArr, iArr2, i7);
    }
}