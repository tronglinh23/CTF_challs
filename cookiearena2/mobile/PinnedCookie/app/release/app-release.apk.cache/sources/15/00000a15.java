package com.google.android.material.color.utilities;

import d.b1;

@d.b1({b1.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    private Hct(int i7) {
        setInternalState(i7);
    }

    public static Hct from(double d7, double d8, double d9) {
        return new Hct(HctSolver.solveToInt(d7, d8, d9));
    }

    public static Hct fromInt(int i7) {
        return new Hct(i7);
    }

    private void setInternalState(int i7) {
        this.argb = i7;
        Cam16 fromInt = Cam16.fromInt(i7);
        this.hue = fromInt.getHue();
        this.chroma = fromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i7);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getTone() {
        return this.tone;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] xyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 fromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(xyzInViewingConditions[0], xyzInViewingConditions[1], xyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(fromXyzInViewingConditions.getHue(), fromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(xyzInViewingConditions[1]));
    }

    public void setChroma(double d7) {
        setInternalState(HctSolver.solveToInt(this.hue, d7, this.tone));
    }

    public void setHue(double d7) {
        setInternalState(HctSolver.solveToInt(d7, this.chroma, this.tone));
    }

    public void setTone(double d7) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d7));
    }

    public int toInt() {
        return this.argb;
    }
}