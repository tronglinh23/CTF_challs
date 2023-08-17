package m1;

import android.database.Cursor;
import android.widget.Filter;
/* loaded from: classes.dex */
public class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f13494a;

    /* loaded from: classes.dex */
    public interface a {
        CharSequence a(Cursor cursor);

        void b(Cursor cursor);

        Cursor c();

        Cursor d(CharSequence charSequence);
    }

    public b(a aVar) {
        this.f13494a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f13494a.a((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d7 = this.f13494a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d7 != null) {
            filterResults.count = d7.getCount();
            filterResults.values = d7;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c7 = this.f13494a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == c7) {
            return;
        }
        this.f13494a.b((Cursor) obj);
    }
}
