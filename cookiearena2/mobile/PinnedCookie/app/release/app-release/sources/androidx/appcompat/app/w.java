package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.a;
/* loaded from: classes.dex */
public class w implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    public final a.e f907b;

    public w(a.e eVar) {
        this.f907b = eVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i7, long j7) {
        a.e eVar = this.f907b;
        if (eVar != null) {
            eVar.a(i7, j7);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
