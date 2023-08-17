package com.google.android.material.color.utilities;

import d.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class TemperatureCache {
    private final Hct input;
    private Hct precomputedComplement;
    private List<Hct> precomputedHctsByHue;
    private List<Hct> precomputedHctsByTemp;
    private Map<Hct, Double> precomputedTempsByHct;

    private TemperatureCache() {
        throw new UnsupportedOperationException();
    }

    private Hct getColdest() {
        return getHctsByTemp().get(0);
    }

    private List<Hct> getHctsByHue() {
        List<Hct> list = this.precomputedHctsByHue;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d7 = androidx.cardview.widget.g.f1896q; d7 <= 360.0d; d7 += 1.0d) {
            arrayList.add(Hct.from(d7, this.input.getChroma(), this.input.getTone()));
        }
        List<Hct> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.precomputedHctsByHue = unmodifiableList;
        return unmodifiableList;
    }

    private List<Hct> getHctsByTemp() {
        List<Hct> list = this.precomputedHctsByTemp;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: com.google.android.material.color.utilities.q5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$getHctsByTemp$0;
                lambda$getHctsByTemp$0 = TemperatureCache.this.lambda$getHctsByTemp$0((Hct) obj);
                return lambda$getHctsByTemp$0;
            }
        }, new Comparator() { // from class: com.google.android.material.color.utilities.r5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.precomputedHctsByTemp = arrayList;
        return arrayList;
    }

    private Map<Hct, Double> getTempsByHct() {
        Map<Hct, Double> map = this.precomputedTempsByHct;
        if (map != null) {
            return map;
        }
        ArrayList<Hct> arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        HashMap hashMap = new HashMap();
        for (Hct hct : arrayList) {
            hashMap.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.precomputedTempsByHct = hashMap;
        return hashMap;
    }

    private Hct getWarmest() {
        return getHctsByTemp().get(getHctsByTemp().size() - 1);
    }

    private static boolean isBetween(double d7, double d8, double d9) {
        return d8 < d9 ? d8 <= d7 && d7 <= d9 : d8 <= d7 || d7 <= d9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$getHctsByTemp$0(Hct hct) {
        return getTempsByHct().get(hct);
    }

    public static double rawTemperature(Hct hct) {
        double[] labFromArgb = ColorUtils.labFromArgb(hct.toInt());
        return ((Math.pow(Math.hypot(labFromArgb[1], labFromArgb[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(labFromArgb[2], labFromArgb[1]))) - 50.0d)))) - 0.5d;
    }

    public List<Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public Hct getComplement() {
        Hct hct = this.precomputedComplement;
        if (hct != null) {
            return hct;
        }
        double hue = getColdest().getHue();
        double doubleValue = getTempsByHct().get(getColdest()).doubleValue();
        double hue2 = getWarmest().getHue();
        double doubleValue2 = getTempsByHct().get(getWarmest()).doubleValue() - doubleValue;
        boolean isBetween = isBetween(this.input.getHue(), hue, hue2);
        double d7 = isBetween ? hue2 : hue;
        if (!isBetween) {
            hue = hue2;
        }
        Hct hct2 = getHctsByHue().get((int) Math.round(this.input.getHue()));
        double relativeTemperature = 1.0d - getRelativeTemperature(this.input);
        double d8 = 1000.0d;
        for (double d9 = 0.0d; d9 <= 360.0d; d9 += 1.0d) {
            double sanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble(d7 + (1.0d * d9));
            if (isBetween(sanitizeDegreesDouble, d7, hue)) {
                Hct hct3 = getHctsByHue().get((int) Math.round(sanitizeDegreesDouble));
                double abs = Math.abs(relativeTemperature - ((getTempsByHct().get(hct3).doubleValue() - doubleValue) / doubleValue2));
                if (abs < d8) {
                    hct2 = hct3;
                    d8 = abs;
                }
            }
        }
        this.precomputedComplement = hct2;
        return hct2;
    }

    public double getRelativeTemperature(Hct hct) {
        double doubleValue = getTempsByHct().get(getWarmest()).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        double doubleValue2 = getTempsByHct().get(hct).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        if (doubleValue == androidx.cardview.widget.g.f1896q) {
            return 0.5d;
        }
        return doubleValue2 / doubleValue;
    }

    public List<Hct> getAnalogousColors(int i7, int i8) {
        int round = (int) Math.round(this.input.getHue());
        Hct hct = getHctsByHue().get(round);
        double relativeTemperature = getRelativeTemperature(hct);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct);
        double d7 = androidx.cardview.widget.g.f1896q;
        double d8 = 0.0d;
        int i9 = 0;
        while (i9 < 360) {
            double relativeTemperature2 = getRelativeTemperature(getHctsByHue().get(MathUtils.sanitizeDegreesInt(round + i9)));
            d8 += Math.abs(relativeTemperature2 - relativeTemperature);
            i9++;
            relativeTemperature = relativeTemperature2;
        }
        double d9 = d8 / i8;
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i10 = 1;
        while (true) {
            if (arrayList.size() >= i8) {
                break;
            }
            Hct hct2 = getHctsByHue().get(MathUtils.sanitizeDegreesInt(round + i10));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            d7 += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z6 = d7 >= ((double) arrayList.size()) * d9;
            int i11 = 1;
            while (z6 && arrayList.size() < i8) {
                arrayList.add(hct2);
                z6 = d7 >= ((double) (arrayList.size() + i11)) * d9;
                i11++;
            }
            i10++;
            if (i10 > 360) {
                while (arrayList.size() < i8) {
                    arrayList.add(hct2);
                }
            } else {
                relativeTemperature3 = relativeTemperature4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.input);
        int floor = (int) Math.floor((i7 - 1.0d) / 2.0d);
        for (int i12 = 1; i12 < floor + 1; i12++) {
            int i13 = 0 - i12;
            while (i13 < 0) {
                i13 += arrayList.size();
            }
            if (i13 >= arrayList.size()) {
                i13 %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(i13));
        }
        int i14 = (i7 - floor) - 1;
        for (int i15 = 1; i15 < i14 + 1; i15++) {
            int i16 = i15;
            while (i16 < 0) {
                i16 += arrayList.size();
            }
            if (i16 >= arrayList.size()) {
                i16 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(i16));
        }
        return arrayList2;
    }

    public TemperatureCache(Hct hct) {
        this.input = hct;
    }
}
