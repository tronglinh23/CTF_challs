package com.google.android.material.color;

import d.l;
/* loaded from: classes.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    public ColorRoles(@l int i7, @l int i8, @l int i9, @l int i10) {
        this.accent = i7;
        this.onAccent = i8;
        this.accentContainer = i9;
        this.onAccentContainer = i10;
    }

    @l
    public int getAccent() {
        return this.accent;
    }

    @l
    public int getAccentContainer() {
        return this.accentContainer;
    }

    @l
    public int getOnAccent() {
        return this.onAccent;
    }

    @l
    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
