package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.u1;
import androidx.versionedparcelable.CustomVersionedParcelable;
import d.b1;
import d.d0;
import d.l;
import d.l1;
import d.o0;
import d.q0;
import d.u;
import d.v;
import d.w0;
import g1.n;
import g1.s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import m0.i;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    @l1
    public static final String A = "obj";
    @l1
    public static final String B = "int1";
    @l1
    public static final String C = "int2";
    @l1
    public static final String D = "tint_list";
    @l1
    public static final String E = "tint_mode";
    @l1
    public static final String F = "string1";
    public static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;

    /* renamed from: k  reason: collision with root package name */
    public static final String f3494k = "IconCompat";

    /* renamed from: l  reason: collision with root package name */
    public static final int f3495l = -1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f3496m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f3497n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f3498o = 3;

    /* renamed from: p  reason: collision with root package name */
    public static final int f3499p = 4;

    /* renamed from: q  reason: collision with root package name */
    public static final int f3500q = 5;

    /* renamed from: r  reason: collision with root package name */
    public static final int f3501r = 6;

    /* renamed from: s  reason: collision with root package name */
    public static final float f3502s = 0.25f;

    /* renamed from: t  reason: collision with root package name */
    public static final float f3503t = 0.6666667f;

    /* renamed from: u  reason: collision with root package name */
    public static final float f3504u = 0.9166667f;

    /* renamed from: v  reason: collision with root package name */
    public static final float f3505v = 0.010416667f;

    /* renamed from: w  reason: collision with root package name */
    public static final float f3506w = 0.020833334f;

    /* renamed from: x  reason: collision with root package name */
    public static final int f3507x = 61;

    /* renamed from: y  reason: collision with root package name */
    public static final int f3508y = 30;
    @l1

    /* renamed from: z  reason: collision with root package name */
    public static final String f3509z = "type";
    @b1({b1.a.LIBRARY_GROUP_PREFIX})

    /* renamed from: a  reason: collision with root package name */
    public int f3510a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3511b;
    @b1({b1.a.LIBRARY})
    @q0

    /* renamed from: c  reason: collision with root package name */
    public byte[] f3512c;
    @b1({b1.a.LIBRARY})
    @q0

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f3513d;
    @b1({b1.a.LIBRARY})

    /* renamed from: e  reason: collision with root package name */
    public int f3514e;
    @b1({b1.a.LIBRARY})

    /* renamed from: f  reason: collision with root package name */
    public int f3515f;
    @b1({b1.a.LIBRARY})
    @q0

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f3516g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f3517h;
    @b1({b1.a.LIBRARY})
    @q0

    /* renamed from: i  reason: collision with root package name */
    public String f3518i;
    @b1({b1.a.LIBRARY})
    @q0

    /* renamed from: j  reason: collision with root package name */
    public String f3519j;

    @w0(23)
    /* loaded from: classes.dex */
    public static class a {
        @q0
        public static IconCompat a(@o0 Context context, @o0 Icon icon) {
            int e7 = e(icon);
            if (e7 == 2) {
                String d7 = d(icon);
                try {
                    return IconCompat.r(IconCompat.v(context, d7), d7, c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else if (e7 != 4) {
                if (e7 != 6) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.f3511b = icon;
                    return iconCompat;
                }
                return IconCompat.k(f(icon));
            } else {
                return IconCompat.n(f(icon));
            }
        }

        public static IconCompat b(@o0 Object obj) {
            s.l(obj);
            int e7 = e(obj);
            if (e7 != 2) {
                if (e7 != 4) {
                    if (e7 != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f3511b = obj;
                        return iconCompat;
                    }
                    return IconCompat.k(f(obj));
                }
                return IconCompat.n(f(obj));
            }
            return IconCompat.r(null, d(obj), c(obj));
        }

        @d0
        @v
        public static int c(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e7) {
                Log.e(IconCompat.f3494k, "Unable to get icon resource", e7);
                return 0;
            } catch (NoSuchMethodException e8) {
                Log.e(IconCompat.f3494k, "Unable to get icon resource", e8);
                return 0;
            } catch (InvocationTargetException e9) {
                Log.e(IconCompat.f3494k, "Unable to get icon resource", e9);
                return 0;
            }
        }

        @q0
        public static String d(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e7) {
                Log.e(IconCompat.f3494k, "Unable to get icon package", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e(IconCompat.f3494k, "Unable to get icon package", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e(IconCompat.f3494k, "Unable to get icon package", e9);
                return null;
            }
        }

        public static int e(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e7) {
                Log.e(IconCompat.f3494k, "Unable to get icon type " + obj, e7);
                return -1;
            } catch (NoSuchMethodException e8) {
                Log.e(IconCompat.f3494k, "Unable to get icon type " + obj, e8);
                return -1;
            } catch (InvocationTargetException e9) {
                Log.e(IconCompat.f3494k, "Unable to get icon type " + obj, e9);
                return -1;
            }
        }

        @u
        @q0
        public static Uri f(@o0 Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e7) {
                Log.e(IconCompat.f3494k, "Unable to get icon uri", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e(IconCompat.f3494k, "Unable to get icon uri", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e(IconCompat.f3494k, "Unable to get icon uri", e9);
                return null;
            }
        }

        @u
        public static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        @u
        public static Icon h(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f3510a) {
                case -1:
                    return (Icon) iconCompat.f3511b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3511b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.u(), iconCompat.f3514e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f3511b, iconCompat.f3514e, iconCompat.f3515f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f3511b);
                    break;
                case 5:
                    createWithBitmap = b.b((Bitmap) iconCompat.f3511b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        createWithBitmap = d.a(iconCompat.x());
                        break;
                    } else if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.x());
                    } else {
                        InputStream y6 = iconCompat.y(context);
                        if (y6 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.x());
                        }
                        createWithBitmap = b.b(BitmapFactory.decodeStream(y6));
                        break;
                    }
            }
            ColorStateList colorStateList = iconCompat.f3516g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3517h;
            if (mode != IconCompat.G) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    @w0(26)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @u
        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @w0(28)
    /* loaded from: classes.dex */
    public static class c {
        @u
        public static int a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        @u
        public static String b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        @u
        public static int c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        @u
        public static Uri d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    @w0(30)
    /* loaded from: classes.dex */
    public static class d {
        @u
        public static Icon a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    @b1({b1.a.LIBRARY})
    public IconCompat() {
        this.f3510a = -1;
        this.f3512c = null;
        this.f3513d = null;
        this.f3514e = 0;
        this.f3515f = 0;
        this.f3516g = null;
        this.f3517h = G;
        this.f3518i = null;
    }

    public static String H(int i7) {
        switch (i7) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @q0
    public static IconCompat e(@o0 Bundle bundle) {
        int i7 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i7);
        iconCompat.f3514e = bundle.getInt(B);
        iconCompat.f3515f = bundle.getInt(C);
        iconCompat.f3519j = bundle.getString(F);
        if (bundle.containsKey(D)) {
            iconCompat.f3516g = (ColorStateList) bundle.getParcelable(D);
        }
        if (bundle.containsKey(E)) {
            iconCompat.f3517h = PorterDuff.Mode.valueOf(bundle.getString(E));
        }
        switch (i7) {
            case -1:
            case 1:
            case 5:
                iconCompat.f3511b = bundle.getParcelable(A);
                break;
            case 0:
            default:
                Log.w(f3494k, "Unknown type " + i7);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f3511b = bundle.getString(A);
                break;
            case 3:
                iconCompat.f3511b = bundle.getByteArray(A);
                break;
        }
        return iconCompat;
    }

    @q0
    @w0(23)
    public static IconCompat f(@o0 Context context, @o0 Icon icon) {
        s.l(icon);
        return a.a(context, icon);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    @w0(23)
    public static IconCompat g(@o0 Icon icon) {
        return a.b(icon);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    @w0(23)
    public static IconCompat h(@o0 Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    @l1
    public static Bitmap i(Bitmap bitmap, boolean z6) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f7 = min;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z6) {
            float f10 = 0.010416667f * f7;
            paint.setColor(0);
            paint.setShadowLayer(f10, 0.0f, f7 * 0.020833334f, 1023410176);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.setShadowLayer(f10, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(u1.f3816t);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @o0
    public static IconCompat j(@o0 Bitmap bitmap) {
        n.d(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f3511b = bitmap;
        return iconCompat;
    }

    @o0
    public static IconCompat k(@o0 Uri uri) {
        n.d(uri);
        return l(uri.toString());
    }

    @o0
    public static IconCompat l(@o0 String str) {
        n.d(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f3511b = str;
        return iconCompat;
    }

    @o0
    public static IconCompat m(@o0 Bitmap bitmap) {
        n.d(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f3511b = bitmap;
        return iconCompat;
    }

    @o0
    public static IconCompat n(@o0 Uri uri) {
        n.d(uri);
        return o(uri.toString());
    }

    @o0
    public static IconCompat o(@o0 String str) {
        n.d(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f3511b = str;
        return iconCompat;
    }

    @o0
    public static IconCompat p(@o0 byte[] bArr, int i7, int i8) {
        n.d(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f3511b = bArr;
        iconCompat.f3514e = i7;
        iconCompat.f3515f = i8;
        return iconCompat;
    }

    @o0
    public static IconCompat q(@o0 Context context, @v int i7) {
        n.d(context);
        return r(context.getResources(), context.getPackageName(), i7);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static IconCompat r(@q0 Resources resources, @o0 String str, @v int i7) {
        n.d(str);
        if (i7 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3514e = i7;
            if (resources != null) {
                try {
                    iconCompat.f3511b = resources.getResourceName(i7);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3511b = str;
            }
            iconCompat.f3519j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static Resources v(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e(f3494k, String.format("Unable to find pkg=%s for icon", str), e7);
            return null;
        }
    }

    public final Drawable A(Context context) {
        switch (this.f3510a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f3511b);
            case 2:
                String u6 = u();
                if (TextUtils.isEmpty(u6)) {
                    u6 = context.getPackageName();
                }
                try {
                    return i.g(v(context, u6), this.f3514e, context.getTheme());
                } catch (RuntimeException e7) {
                    Log.e(f3494k, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f3514e), this.f3511b), e7);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f3511b, this.f3514e, this.f3515f));
            case 4:
                InputStream y6 = y(context);
                if (y6 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(y6));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), i((Bitmap) this.f3511b, false));
            case 6:
                InputStream y7 = y(context);
                if (y7 != null) {
                    return b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(y7)));
                }
                break;
        }
        return null;
    }

    @o0
    public IconCompat B(@l int i7) {
        return C(ColorStateList.valueOf(i7));
    }

    @o0
    public IconCompat C(@q0 ColorStateList colorStateList) {
        this.f3516g = colorStateList;
        return this;
    }

    @o0
    public IconCompat D(@q0 PorterDuff.Mode mode) {
        this.f3517h = mode;
        return this;
    }

    @o0
    public Bundle E() {
        Bundle bundle = new Bundle();
        switch (this.f3510a) {
            case -1:
                bundle.putParcelable(A, (Parcelable) this.f3511b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(A, (Bitmap) this.f3511b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(A, (String) this.f3511b);
                break;
            case 3:
                bundle.putByteArray(A, (byte[]) this.f3511b);
                break;
        }
        bundle.putInt("type", this.f3510a);
        bundle.putInt(B, this.f3514e);
        bundle.putInt(C, this.f3515f);
        bundle.putString(F, this.f3519j);
        ColorStateList colorStateList = this.f3516g;
        if (colorStateList != null) {
            bundle.putParcelable(D, colorStateList);
        }
        PorterDuff.Mode mode = this.f3517h;
        if (mode != G) {
            bundle.putString(E, mode.name());
        }
        return bundle;
    }

    @o0
    @w0(23)
    @Deprecated
    public Icon F() {
        return G(null);
    }

    @o0
    @w0(23)
    public Icon G(@q0 Context context) {
        return a.h(this, context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void a() {
        this.f3517h = PorterDuff.Mode.valueOf(this.f3518i);
        switch (this.f3510a) {
            case -1:
                Parcelable parcelable = this.f3513d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f3511b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3513d;
                if (parcelable2 != null) {
                    this.f3511b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3512c;
                this.f3511b = bArr;
                this.f3510a = 3;
                this.f3514e = 0;
                this.f3515f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3512c, Charset.forName("UTF-16"));
                this.f3511b = str;
                if (this.f3510a == 2 && this.f3519j == null) {
                    this.f3519j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3511b = this.f3512c;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void b(boolean z6) {
        this.f3518i = this.f3517h.name();
        switch (this.f3510a) {
            case -1:
                if (z6) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f3513d = (Parcelable) this.f3511b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z6) {
                    this.f3513d = (Parcelable) this.f3511b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f3511b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f3512c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f3512c = ((String) this.f3511b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3512c = (byte[]) this.f3511b;
                return;
            case 4:
            case 6:
                this.f3512c = this.f3511b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void c(@o0 Intent intent, @q0 Drawable drawable, @o0 Context context) {
        Bitmap bitmap;
        d(context);
        int i7 = this.f3510a;
        if (i7 == 1) {
            bitmap = (Bitmap) this.f3511b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i7 == 2) {
            try {
                Context createPackageContext = context.createPackageContext(u(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.f3514e));
                    return;
                }
                Drawable i8 = k0.d.i(createPackageContext, this.f3514e);
                if (i8.getIntrinsicWidth() > 0 && i8.getIntrinsicHeight() > 0) {
                    bitmap = Bitmap.createBitmap(i8.getIntrinsicWidth(), i8.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    i8.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    i8.draw(new Canvas(bitmap));
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService(androidx.appcompat.widget.d.f1516r)).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                i8.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                i8.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e7) {
                throw new IllegalArgumentException("Can't find package " + this.f3511b, e7);
            }
        } else if (i7 != 5) {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        } else {
            bitmap = i((Bitmap) this.f3511b, true);
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void d(@o0 Context context) {
        Object obj;
        if (this.f3510a != 2 || (obj = this.f3511b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(f3494k, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String u6 = u();
            int identifier = v(context, u6).getIdentifier(str4, str3, str5);
            if (this.f3514e != identifier) {
                Log.i(f3494k, "Id has changed for " + u6 + " " + str);
                this.f3514e = identifier;
            }
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @q0
    public Bitmap s() {
        int i7 = this.f3510a;
        if (i7 == -1) {
            Object obj = this.f3511b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i7 == 1) {
            return (Bitmap) this.f3511b;
        } else {
            if (i7 == 5) {
                return i((Bitmap) this.f3511b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    @v
    public int t() {
        int i7 = this.f3510a;
        if (i7 == -1) {
            return a.c(this.f3511b);
        }
        if (i7 == 2) {
            return this.f3514e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @o0
    public String toString() {
        if (this.f3510a == -1) {
            return String.valueOf(this.f3511b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(H(this.f3510a));
        switch (this.f3510a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3511b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3511b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3519j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(t())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3514e);
                if (this.f3515f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3515f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3511b);
                break;
        }
        if (this.f3516g != null) {
            sb.append(" tint=");
            sb.append(this.f3516g);
        }
        if (this.f3517h != G) {
            sb.append(" mode=");
            sb.append(this.f3517h);
        }
        sb.append(")");
        return sb.toString();
    }

    @o0
    public String u() {
        int i7 = this.f3510a;
        if (i7 == -1) {
            return a.d(this.f3511b);
        }
        if (i7 == 2) {
            String str = this.f3519j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3511b).split(":", -1)[0] : this.f3519j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int w() {
        int i7 = this.f3510a;
        return i7 == -1 ? a.e(this.f3511b) : i7;
    }

    @o0
    public Uri x() {
        int i7 = this.f3510a;
        if (i7 == -1) {
            return a.f(this.f3511b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f3511b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @q0
    public InputStream y(@o0 Context context) {
        Uri x6 = x();
        String scheme = x6.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(x6);
            } catch (Exception e7) {
                Log.w(f3494k, "Unable to load image from URI: " + x6, e7);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f3511b));
        } catch (FileNotFoundException e8) {
            Log.w(f3494k, "Unable to load image from path: " + x6, e8);
            return null;
        }
    }

    @q0
    public Drawable z(@o0 Context context) {
        d(context);
        return a.g(G(context), context);
    }

    public IconCompat(int i7) {
        this.f3512c = null;
        this.f3513d = null;
        this.f3514e = 0;
        this.f3515f = 0;
        this.f3516g = null;
        this.f3517h = G;
        this.f3518i = null;
        this.f3510a = i7;
    }
}
