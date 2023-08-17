package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import h.a;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class h1 extends Resources {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f1633a;

    public h1(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1633a = resources;
    }

    public final Drawable a(int i7) throws Resources.NotFoundException {
        return super.getDrawable(i7);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i7) throws Resources.NotFoundException {
        return this.f1633a.getAnimation(i7);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i7) throws Resources.NotFoundException {
        return this.f1633a.getBoolean(i7);
    }

    @Override // android.content.res.Resources
    public int getColor(int i7) throws Resources.NotFoundException {
        return this.f1633a.getColor(i7);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i7) throws Resources.NotFoundException {
        return this.f1633a.getColorStateList(i7);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f1633a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i7) throws Resources.NotFoundException {
        return this.f1633a.getDimension(i7);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i7) throws Resources.NotFoundException {
        return this.f1633a.getDimensionPixelOffset(i7);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i7) throws Resources.NotFoundException {
        return this.f1633a.getDimensionPixelSize(i7);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f1633a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7) throws Resources.NotFoundException {
        return this.f1633a.getDrawable(i7);
    }

    @Override // android.content.res.Resources
    @d.w0(15)
    public Drawable getDrawableForDensity(int i7, int i8) throws Resources.NotFoundException {
        return m0.i.h(this.f1633a, i7, i8, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i7, int i8, int i9) {
        return this.f1633a.getFraction(i7, i8, i9);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f1633a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i7) throws Resources.NotFoundException {
        return this.f1633a.getIntArray(i7);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i7) throws Resources.NotFoundException {
        return this.f1633a.getInteger(i7);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i7) throws Resources.NotFoundException {
        return this.f1633a.getLayout(i7);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i7) throws Resources.NotFoundException {
        return this.f1633a.getMovie(i7);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i7, int i8, Object... objArr) throws Resources.NotFoundException {
        return this.f1633a.getQuantityString(i7, i8, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i7, int i8) throws Resources.NotFoundException {
        return this.f1633a.getQuantityText(i7, i8);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i7) throws Resources.NotFoundException {
        return this.f1633a.getResourceEntryName(i7);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i7) throws Resources.NotFoundException {
        return this.f1633a.getResourceName(i7);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i7) throws Resources.NotFoundException {
        return this.f1633a.getResourcePackageName(i7);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i7) throws Resources.NotFoundException {
        return this.f1633a.getResourceTypeName(i7);
    }

    @Override // android.content.res.Resources
    public String getString(int i7) throws Resources.NotFoundException {
        return this.f1633a.getString(i7);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i7) throws Resources.NotFoundException {
        return this.f1633a.getStringArray(i7);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i7) throws Resources.NotFoundException {
        return this.f1633a.getText(i7);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i7) throws Resources.NotFoundException {
        return this.f1633a.getTextArray(i7);
    }

    @Override // android.content.res.Resources
    public void getValue(int i7, TypedValue typedValue, boolean z6) throws Resources.NotFoundException {
        this.f1633a.getValue(i7, typedValue, z6);
    }

    @Override // android.content.res.Resources
    @d.w0(15)
    public void getValueForDensity(int i7, int i8, TypedValue typedValue, boolean z6) throws Resources.NotFoundException {
        a.C0112a.a(this.f1633a, i7, i8, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i7) throws Resources.NotFoundException {
        return this.f1633a.getXml(i7);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1633a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i7) throws Resources.NotFoundException {
        return this.f1633a.obtainTypedArray(i7);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i7) throws Resources.NotFoundException {
        return this.f1633a.openRawResource(i7);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i7) throws Resources.NotFoundException {
        return this.f1633a.openRawResourceFd(i7);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f1633a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f1633a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1633a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    @d.w0(21)
    public Drawable getDrawable(int i7, Resources.Theme theme) throws Resources.NotFoundException {
        return m0.i.g(this.f1633a, i7, theme);
    }

    @Override // android.content.res.Resources
    @d.w0(21)
    public Drawable getDrawableForDensity(int i7, int i8, Resources.Theme theme) {
        return m0.i.h(this.f1633a, i7, i8, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i7, int i8) throws Resources.NotFoundException {
        return this.f1633a.getQuantityString(i7, i8);
    }

    @Override // android.content.res.Resources
    public String getString(int i7, Object... objArr) throws Resources.NotFoundException {
        return this.f1633a.getString(i7, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i7, CharSequence charSequence) {
        return this.f1633a.getText(i7, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z6) throws Resources.NotFoundException {
        this.f1633a.getValue(str, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i7, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f1633a.openRawResource(i7, typedValue);
    }
}