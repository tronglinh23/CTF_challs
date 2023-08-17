package m1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: m  reason: collision with root package name */
    public int f13495m;

    /* renamed from: n  reason: collision with root package name */
    public int f13496n;

    /* renamed from: o  reason: collision with root package name */
    public LayoutInflater f13497o;

    @Deprecated
    public c(Context context, int i7, Cursor cursor) {
        super(context, cursor);
        this.f13496n = i7;
        this.f13495m = i7;
        this.f13497o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // m1.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f13497o.inflate(this.f13496n, viewGroup, false);
    }

    @Override // m1.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f13497o.inflate(this.f13495m, viewGroup, false);
    }

    public void n(int i7) {
        this.f13496n = i7;
    }

    public void o(int i7) {
        this.f13495m = i7;
    }

    @Deprecated
    public c(Context context, int i7, Cursor cursor, boolean z6) {
        super(context, cursor, z6);
        this.f13496n = i7;
        this.f13495m = i7;
        this.f13497o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i7, Cursor cursor, int i8) {
        super(context, cursor, i8);
        this.f13496n = i7;
        this.f13495m = i7;
        this.f13497o = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
