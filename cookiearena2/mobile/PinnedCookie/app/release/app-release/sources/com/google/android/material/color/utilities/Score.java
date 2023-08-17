package com.google.android.material.color.utilities;

import d.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class Score {
    private static final double CUTOFF_CHROMA = 15.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final double CUTOFF_TONE = 10.0d;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    /* loaded from: classes.dex */
    public static class ScoredComparator implements Comparator<Map.Entry<Integer, Double>> {
        @Override // java.util.Comparator
        public int compare(Map.Entry<Integer, Double> entry, Map.Entry<Integer, Double> entry2) {
            return -entry.getValue().compareTo(entry2.getValue());
        }
    }

    private Score() {
    }

    private static List<Integer> filter(Map<Integer, Double> map, Map<Integer, Cam16> map2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Cam16> entry : map2.entrySet()) {
            int intValue = entry.getKey().intValue();
            Cam16 value = entry.getValue();
            double doubleValue = map.get(Integer.valueOf(intValue)).doubleValue();
            if (value.getChroma() >= CUTOFF_CHROMA && ColorUtils.lstarFromArgb(intValue) >= CUTOFF_TONE && doubleValue >= CUTOFF_EXCITED_PROPORTION) {
                arrayList.add(Integer.valueOf(intValue));
            }
        }
        return arrayList;
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        boolean z6;
        double d7 = 0.0d;
        while (map.entrySet().iterator().hasNext()) {
            d7 += r0.next().getValue().intValue();
        }
        HashMap hashMap = new HashMap();
        double[] dArr = new double[361];
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().getKey().intValue();
            double intValue2 = r6.getValue().intValue() / d7;
            Cam16 fromInt = Cam16.fromInt(intValue);
            hashMap.put(Integer.valueOf(intValue), fromInt);
            int round = (int) Math.round(fromInt.getHue());
            dArr[round] = dArr[round] + intValue2;
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue3 = ((Integer) entry.getKey()).intValue();
            int round2 = (int) Math.round(((Cam16) entry.getValue()).getHue());
            double d8 = 0.0d;
            for (int i7 = round2 - 15; i7 < round2 + 15; i7++) {
                d8 += dArr[MathUtils.sanitizeDegreesInt(i7)];
            }
            hashMap2.put(Integer.valueOf(intValue3), Double.valueOf(d8));
        }
        HashMap hashMap3 = new HashMap();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            int intValue4 = ((Integer) entry2.getKey()).intValue();
            Cam16 cam16 = (Cam16) entry2.getValue();
            hashMap3.put(Integer.valueOf(intValue4), Double.valueOf((((Double) hashMap2.get(Integer.valueOf(intValue4))).doubleValue() * 100.0d * WEIGHT_PROPORTION) + ((cam16.getChroma() - TARGET_CHROMA) * (cam16.getChroma() < TARGET_CHROMA ? WEIGHT_CHROMA_BELOW : WEIGHT_CHROMA_ABOVE))));
        }
        List<Integer> filter = filter(hashMap2, hashMap);
        HashMap hashMap4 = new HashMap();
        Iterator<Integer> it2 = filter.iterator();
        while (it2.hasNext()) {
            int intValue5 = it2.next().intValue();
            hashMap4.put(Integer.valueOf(intValue5), (Double) hashMap3.get(Integer.valueOf(intValue5)));
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(hashMap4.entrySet());
        Collections.sort(arrayList, new ScoredComparator());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry3 : arrayList) {
            Cam16 cam162 = (Cam16) hashMap.get(Integer.valueOf(((Integer) entry3.getKey()).intValue()));
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z6 = false;
                    break;
                }
                if (MathUtils.differenceDegrees(cam162.getHue(), ((Cam16) hashMap.get((Integer) it3.next())).getHue()) < CUTOFF_CHROMA) {
                    z6 = true;
                    break;
                }
            }
            if (!z6) {
                arrayList2.add((Integer) entry3.getKey());
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(-12417548);
        }
        return arrayList2;
    }
}
