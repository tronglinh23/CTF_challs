package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import f.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class m1 extends m1.c implements View.OnClickListener {
    public static final boolean D = false;
    public static final String E = "SuggestionsAdapter";
    public static final int F = 50;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = -1;
    public int A;
    public int B;
    public int C;

    /* renamed from: p  reason: collision with root package name */
    public final SearchView f1712p;

    /* renamed from: q  reason: collision with root package name */
    public final SearchableInfo f1713q;

    /* renamed from: r  reason: collision with root package name */
    public final Context f1714r;

    /* renamed from: s  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1715s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1716t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1717u;

    /* renamed from: v  reason: collision with root package name */
    public int f1718v;

    /* renamed from: w  reason: collision with root package name */
    public ColorStateList f1719w;

    /* renamed from: x  reason: collision with root package name */
    public int f1720x;

    /* renamed from: y  reason: collision with root package name */
    public int f1721y;

    /* renamed from: z  reason: collision with root package name */
    public int f1722z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1723a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1724b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1725c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1726d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1727e;

        public a(View view) {
            this.f1723a = (TextView) view.findViewById(16908308);
            this.f1724b = (TextView) view.findViewById(16908309);
            this.f1725c = (ImageView) view.findViewById(16908295);
            this.f1726d = (ImageView) view.findViewById(16908296);
            this.f1727e = (ImageView) view.findViewById(a.g.f9181z);
        }
    }

    public m1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1717u = false;
        this.f1718v = 1;
        this.f1720x = -1;
        this.f1721y = -1;
        this.f1722z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.f1712p = searchView;
        this.f1713q = searchableInfo;
        this.f1716t = searchView.getSuggestionCommitIconResId();
        this.f1714r = context;
        this.f1715s = weakHashMap;
    }

    public static String D(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e7) {
            Log.e(E, "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    public static String u(Cursor cursor, String str) {
        return D(cursor, cursor.getColumnIndex(str));
    }

    public final Drawable A(Cursor cursor) {
        int i7 = this.B;
        if (i7 == -1) {
            return null;
        }
        return y(cursor.getString(i7));
    }

    public int B() {
        return this.f1718v;
    }

    public Cursor C(SearchableInfo searchableInfo, String str, int i7) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i7 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i7));
        }
        return this.f1714r.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void E(int i7) {
        this.f1718v = i7;
    }

    public final void F(ImageView imageView, Drawable drawable, int i7) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i7);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void H(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1715s.put(str, drawable.getConstantState());
        }
    }

    public final void I(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // m1.a, m1.b.a
    public CharSequence a(Cursor cursor) {
        String u6;
        String u7;
        if (cursor == null) {
            return null;
        }
        String u8 = u(cursor, "suggest_intent_query");
        if (u8 != null) {
            return u8;
        }
        if (!this.f1713q.shouldRewriteQueryFromData() || (u7 = u(cursor, "suggest_intent_data")) == null) {
            if (!this.f1713q.shouldRewriteQueryFromText() || (u6 = u(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return u6;
        }
        return u7;
    }

    @Override // m1.a, m1.b.a
    public void b(Cursor cursor) {
        if (this.f1717u) {
            Log.w(E, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f1720x = cursor.getColumnIndex("suggest_text_1");
                this.f1721y = cursor.getColumnIndex("suggest_text_2");
                this.f1722z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e(E, "error changing cursor and caching columns", e7);
        }
    }

    @Override // m1.a, m1.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1712p.getVisibility() == 0 && this.f1712p.getWindowVisibility() == 0) {
            try {
                Cursor C = C(this.f1713q, charSequence2, 50);
                if (C != null) {
                    C.getCount();
                    return C;
                }
            } catch (RuntimeException e7) {
                Log.w(E, "Search suggestions query threw an exception.", e7);
            }
        }
        return null;
    }

    @Override // m1.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i7 = this.C;
        int i8 = i7 != -1 ? cursor.getInt(i7) : 0;
        if (aVar.f1723a != null) {
            G(aVar.f1723a, D(cursor, this.f1720x));
        }
        if (aVar.f1724b != null) {
            String D2 = D(cursor, this.f1722z);
            CharSequence r6 = D2 != null ? r(D2) : D(cursor, this.f1721y);
            if (TextUtils.isEmpty(r6)) {
                TextView textView = aVar.f1723a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1723a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1723a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1723a.setMaxLines(1);
                }
            }
            G(aVar.f1724b, r6);
        }
        ImageView imageView = aVar.f1725c;
        if (imageView != null) {
            F(imageView, z(cursor), 4);
        }
        ImageView imageView2 = aVar.f1726d;
        if (imageView2 != null) {
            F(imageView2, A(cursor), 8);
        }
        int i9 = this.f1718v;
        if (i9 != 2 && (i9 != 1 || (i8 & 1) == 0)) {
            aVar.f1727e.setVisibility(8);
            return;
        }
        aVar.f1727e.setVisibility(0);
        aVar.f1727e.setTag(aVar.f1723a.getText());
        aVar.f1727e.setOnClickListener(this);
    }

    @Override // m1.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w(E, "Search suggestions cursor threw exception.", e7);
            View i8 = i(this.f1714r, c(), viewGroup);
            if (i8 != null) {
                ((a) i8.getTag()).f1723a.setText(e7.toString());
            }
            return i8;
        }
    }

    @Override // m1.a, android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w(E, "Search suggestions cursor threw exception.", e7);
            View j7 = j(this.f1714r, c(), viewGroup);
            if (j7 != null) {
                ((a) j7.getTag()).f1723a.setText(e7.toString());
            }
            return j7;
        }
    }

    @Override // m1.a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // m1.c, m1.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        View j7 = super.j(context, cursor, viewGroup);
        j7.setTag(new a(j7));
        ((ImageView) j7.findViewById(a.g.f9181z)).setImageResource(this.f1716t);
        return j7;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        I(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        I(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1712p.C((CharSequence) tag);
        }
    }

    public final Drawable p(String str) {
        Drawable.ConstantState constantState = this.f1715s.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public void q() {
        b(null);
        this.f1717u = true;
    }

    public final CharSequence r(CharSequence charSequence) {
        if (this.f1719w == null) {
            TypedValue typedValue = new TypedValue();
            this.f1714r.getTheme().resolveAttribute(a.b.f8962x3, typedValue, true);
            this.f1719w = this.f1714r.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1719w, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable s(ComponentName componentName) {
        PackageManager packageManager = this.f1714r.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w(E, "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w(E, e7.toString());
            return null;
        }
    }

    public final Drawable t(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1715s.containsKey(flattenToShortString)) {
            Drawable s6 = s(componentName);
            this.f1715s.put(flattenToShortString, s6 != null ? s6.getConstantState() : null);
            return s6;
        }
        Drawable.ConstantState constantState = this.f1715s.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1714r.getResources());
    }

    public final Drawable v() {
        Drawable t6 = t(this.f1713q.getSearchActivity());
        return t6 != null ? t6 : this.f1714r.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable w(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return x(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1714r.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
            } catch (IOException e7) {
                Log.e(E, "Error closing icon stream for " + uri, e7);
            }
            return createFromStream;
        } catch (FileNotFoundException e8) {
            Log.w(E, "Icon not found: " + uri + ", " + e8.getMessage());
            return null;
        }
        Log.w(E, "Icon not found: " + uri + ", " + e8.getMessage());
        return null;
    }

    public Drawable x(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1714r.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable y(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1714r.getPackageName() + "/" + parseInt;
            Drawable p6 = p(str2);
            if (p6 != null) {
                return p6;
            }
            Drawable i7 = k0.d.i(this.f1714r, parseInt);
            H(str2, i7);
            return i7;
        } catch (Resources.NotFoundException unused) {
            Log.w(E, "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable p7 = p(str);
            if (p7 != null) {
                return p7;
            }
            Drawable w6 = w(Uri.parse(str));
            H(str, w6);
            return w6;
        }
    }

    public final Drawable z(Cursor cursor) {
        int i7 = this.A;
        if (i7 == -1) {
            return null;
        }
        Drawable y6 = y(cursor.getString(i7));
        return y6 != null ? y6 : v();
    }
}
