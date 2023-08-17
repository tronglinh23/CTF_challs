package m1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import d.b1;
import m1.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {
    @Deprecated

    /* renamed from: k  reason: collision with root package name */
    public static final int f13481k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f13482l = 2;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: b  reason: collision with root package name */
    public boolean f13483b;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: c  reason: collision with root package name */
    public boolean f13484c;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: d  reason: collision with root package name */
    public Cursor f13485d;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: e  reason: collision with root package name */
    public Context f13486e;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: f  reason: collision with root package name */
    public int f13487f;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: g  reason: collision with root package name */
    public C0182a f13488g;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: h  reason: collision with root package name */
    public DataSetObserver f13489h;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: i  reason: collision with root package name */
    public m1.b f13490i;
    @b1({b1.a.LIBRARY_GROUP})

    /* renamed from: j  reason: collision with root package name */
    public FilterQueryProvider f13491j;

    /* renamed from: m1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0182a extends ContentObserver {
        public C0182a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z6) {
            a.this.k();
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f13483b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f13483b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        g(context, cursor, 1);
    }

    public CharSequence a(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public void b(Cursor cursor) {
        Cursor m7 = m(cursor);
        if (m7 != null) {
            m7.close();
        }
    }

    @Override // m1.b.a
    public Cursor c() {
        return this.f13485d;
    }

    public Cursor d(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f13491j;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f13485d;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    public FilterQueryProvider f() {
        return this.f13491j;
    }

    public void g(Context context, Cursor cursor, int i7) {
        if ((i7 & 1) == 1) {
            i7 |= 2;
            this.f13484c = true;
        } else {
            this.f13484c = false;
        }
        boolean z6 = cursor != null;
        this.f13485d = cursor;
        this.f13483b = z6;
        this.f13486e = context;
        this.f13487f = z6 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i7 & 2) == 2) {
            this.f13488g = new C0182a();
            this.f13489h = new b();
        } else {
            this.f13488g = null;
            this.f13489h = null;
        }
        if (z6) {
            C0182a c0182a = this.f13488g;
            if (c0182a != null) {
                cursor.registerContentObserver(c0182a);
            }
            DataSetObserver dataSetObserver = this.f13489h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f13483b || (cursor = this.f13485d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (this.f13483b) {
            this.f13485d.moveToPosition(i7);
            if (view == null) {
                view = i(this.f13486e, this.f13485d, viewGroup);
            }
            e(view, this.f13486e, this.f13485d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f13490i == null) {
            this.f13490i = new m1.b(this);
        }
        return this.f13490i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i7) {
        Cursor cursor;
        if (!this.f13483b || (cursor = this.f13485d) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f13485d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        Cursor cursor;
        if (this.f13483b && (cursor = this.f13485d) != null && cursor.moveToPosition(i7)) {
            return this.f13485d.getLong(this.f13487f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (this.f13483b) {
            if (this.f13485d.moveToPosition(i7)) {
                if (view == null) {
                    view = j(this.f13486e, this.f13485d, viewGroup);
                }
                e(view, this.f13486e, this.f13485d);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i7);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    @Deprecated
    public void h(Context context, Cursor cursor, boolean z6) {
        g(context, cursor, z6 ? 1 : 2);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return j(context, cursor, viewGroup);
    }

    public abstract View j(Context context, Cursor cursor, ViewGroup viewGroup);

    public void k() {
        Cursor cursor;
        if (!this.f13484c || (cursor = this.f13485d) == null || cursor.isClosed()) {
            return;
        }
        this.f13483b = this.f13485d.requery();
    }

    public void l(FilterQueryProvider filterQueryProvider) {
        this.f13491j = filterQueryProvider;
    }

    public Cursor m(Cursor cursor) {
        Cursor cursor2 = this.f13485d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0182a c0182a = this.f13488g;
            if (c0182a != null) {
                cursor2.unregisterContentObserver(c0182a);
            }
            DataSetObserver dataSetObserver = this.f13489h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f13485d = cursor;
        if (cursor != null) {
            C0182a c0182a2 = this.f13488g;
            if (c0182a2 != null) {
                cursor.registerContentObserver(c0182a2);
            }
            DataSetObserver dataSetObserver2 = this.f13489h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f13487f = cursor.getColumnIndexOrThrow("_id");
            this.f13483b = true;
            notifyDataSetChanged();
        } else {
            this.f13487f = -1;
            this.f13483b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public a(Context context, Cursor cursor, boolean z6) {
        g(context, cursor, z6 ? 1 : 2);
    }

    public a(Context context, Cursor cursor, int i7) {
        g(context, cursor, i7);
    }
}