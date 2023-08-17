package m1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import d.b1;

/* loaded from: classes.dex */
public class d extends c {
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: p  reason: collision with root package name */
    public int[] f13498p;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: q  reason: collision with root package name */
    public int[] f13499q;

    /* renamed from: r  reason: collision with root package name */
    public int f13500r;

    /* renamed from: s  reason: collision with root package name */
    public a f13501s;

    /* renamed from: t  reason: collision with root package name */
    public b f13502t;

    /* renamed from: u  reason: collision with root package name */
    public String[] f13503u;

    /* loaded from: classes.dex */
    public interface a {
        CharSequence a(Cursor cursor);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(View view, Cursor cursor, int i7);
    }

    @Deprecated
    public d(Context context, int i7, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i7, cursor);
        this.f13500r = -1;
        this.f13499q = iArr;
        this.f13503u = strArr;
        q(cursor, strArr);
    }

    @Override // m1.a, m1.b.a
    public CharSequence a(Cursor cursor) {
        a aVar = this.f13501s;
        if (aVar != null) {
            return aVar.a(cursor);
        }
        int i7 = this.f13500r;
        return i7 > -1 ? cursor.getString(i7) : super.a(cursor);
    }

    @Override // m1.a
    public void e(View view, Context context, Cursor cursor) {
        b bVar = this.f13502t;
        int[] iArr = this.f13499q;
        int length = iArr.length;
        int[] iArr2 = this.f13498p;
        for (int i7 = 0; i7 < length; i7++) {
            View findViewById = view.findViewById(iArr[i7]);
            if (findViewById != null) {
                if (bVar != null ? bVar.a(findViewById, cursor, iArr2[i7]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i7]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        y((TextView) findViewById, string);
                    } else if (!(findViewById instanceof ImageView)) {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                    } else {
                        x((ImageView) findViewById, string);
                    }
                }
            }
        }
    }

    @Override // m1.a
    public Cursor m(Cursor cursor) {
        q(cursor, this.f13503u);
        return super.m(cursor);
    }

    public void p(Cursor cursor, String[] strArr, int[] iArr) {
        this.f13503u = strArr;
        this.f13499q = iArr;
        q(cursor, strArr);
        super.b(cursor);
    }

    public final void q(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.f13498p = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.f13498p;
        if (iArr == null || iArr.length != length) {
            this.f13498p = new int[length];
        }
        for (int i7 = 0; i7 < length; i7++) {
            this.f13498p[i7] = cursor.getColumnIndexOrThrow(strArr[i7]);
        }
    }

    public a r() {
        return this.f13501s;
    }

    public int s() {
        return this.f13500r;
    }

    public b t() {
        return this.f13502t;
    }

    public void u(a aVar) {
        this.f13501s = aVar;
    }

    public void v(int i7) {
        this.f13500r = i7;
    }

    public void w(b bVar) {
        this.f13502t = bVar;
    }

    public void x(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void y(TextView textView, String str) {
        textView.setText(str);
    }

    public d(Context context, int i7, Cursor cursor, String[] strArr, int[] iArr, int i8) {
        super(context, i7, cursor, i8);
        this.f13500r = -1;
        this.f13499q = iArr;
        this.f13503u = strArr;
        q(cursor, strArr);
    }
}