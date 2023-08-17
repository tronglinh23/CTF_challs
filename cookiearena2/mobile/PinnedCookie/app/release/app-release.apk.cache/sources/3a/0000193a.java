package r2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import s2.t0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final String f15589f = "LocalBroadcastManager";

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f15590g = false;

    /* renamed from: h  reason: collision with root package name */
    public static final int f15591h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f15592i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static a f15593j;

    /* renamed from: a  reason: collision with root package name */
    public final Context f15594a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f15595b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f15596c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f15597d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final Handler f15598e;

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0225a extends Handler {
        public HandlerC0225a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f15600a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<c> f15601b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f15600a = intent;
            this.f15601b = arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f15602a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f15603b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15604c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15605d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f15602a = intentFilter;
            this.f15603b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f15603b);
            sb.append(" filter=");
            sb.append(this.f15602a);
            if (this.f15605d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public a(Context context) {
        this.f15594a = context;
        this.f15598e = new HandlerC0225a(context.getMainLooper());
    }

    @o0
    public static a b(@o0 Context context) {
        a aVar;
        synchronized (f15592i) {
            if (f15593j == null) {
                f15593j = new a(context.getApplicationContext());
            }
            aVar = f15593j;
        }
        return aVar;
    }

    public void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f15595b) {
                size = this.f15597d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f15597d.toArray(bVarArr);
                this.f15597d.clear();
            }
            for (int i7 = 0; i7 < size; i7++) {
                b bVar = bVarArr[i7];
                int size2 = bVar.f15601b.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    c cVar = bVar.f15601b.get(i8);
                    if (!cVar.f15605d) {
                        cVar.f15603b.onReceive(this.f15594a, bVar.f15600a);
                    }
                }
            }
        }
    }

    public void c(@o0 BroadcastReceiver broadcastReceiver, @o0 IntentFilter intentFilter) {
        synchronized (this.f15595b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f15595b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f15595b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i7 = 0; i7 < intentFilter.countActions(); i7++) {
                String action = intentFilter.getAction(i7);
                ArrayList<c> arrayList2 = this.f15596c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f15596c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(@o0 Intent intent) {
        int i7;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        boolean z6;
        synchronized (this.f15595b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f15594a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z7 = true;
            boolean z8 = (intent.getFlags() & 8) != 0;
            if (z8) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resolving type ");
                sb.append(resolveTypeIfNeeded);
                sb.append(" scheme ");
                sb.append(scheme);
                sb.append(" of intent ");
                sb.append(intent);
            }
            ArrayList<c> arrayList3 = this.f15596c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z8) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Action list: ");
                    sb2.append(arrayList3);
                }
                ArrayList arrayList4 = null;
                int i8 = 0;
                while (i8 < arrayList3.size()) {
                    c cVar = arrayList3.get(i8);
                    if (z8) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Matching against filter ");
                        sb3.append(cVar.f15602a);
                    }
                    if (cVar.f15604c) {
                        i7 = i8;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                        z6 = z7;
                    } else {
                        IntentFilter intentFilter = cVar.f15602a;
                        String str3 = action;
                        String str4 = resolveTypeIfNeeded;
                        i7 = i8;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        z6 = z7;
                        int match = intentFilter.match(str3, str4, scheme, data, categories, f15589f);
                        if (match >= 0) {
                            if (z8) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("  Filter matched!  match=0x");
                                sb4.append(Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f15604c = z6;
                            i8 = i7 + 1;
                            z7 = z6;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z8) {
                            String str5 = match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : t0.f16450f : "category";
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("  Filter did not match: ");
                            sb5.append(str5);
                        }
                    }
                    arrayList4 = arrayList;
                    i8 = i7 + 1;
                    z7 = z6;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                boolean z9 = z7;
                if (arrayList5 != null) {
                    for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                        ((c) arrayList5.get(i9)).f15604c = false;
                    }
                    this.f15597d.add(new b(intent, arrayList5));
                    if (!this.f15598e.hasMessages(z9 ? 1 : 0)) {
                        this.f15598e.sendEmptyMessage(z9 ? 1 : 0);
                    }
                    return z9;
                }
            }
            return false;
        }
    }

    public void e(@o0 Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@o0 BroadcastReceiver broadcastReceiver) {
        synchronized (this.f15595b) {
            ArrayList<c> remove = this.f15595b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f15605d = true;
                for (int i7 = 0; i7 < cVar.f15602a.countActions(); i7++) {
                    String action = cVar.f15602a.getAction(i7);
                    ArrayList<c> arrayList = this.f15596c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f15603b == broadcastReceiver) {
                                cVar2.f15605d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f15596c.remove(action);
                        }
                    }
                }
            }
        }
    }
}