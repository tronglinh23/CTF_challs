package org.cookiearena.pinnedcookie;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.q0;
import i0.k0;
import i0.x2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import kotlin.Metadata;
import n6.d;
import org.cookiearena.pinnedcookie.MainActivity;
import r5.b0;
import r5.d0;
import r5.e;
import r5.f;
import r5.f0;
import r5.g;
import r5.s;
import u4.l0;
import x3.e0;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J(\u0010\u000b\u001a\u00020\u00072\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\n\u001a\u00020\u0007H\u0002R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lorg/cookiearena/pinnedcookie/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", q0.f4467h, "Lv3/m2;", "onCreate", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "arrayList", x2.f10960j, "y0", "Ll6/a;", "E", "Ll6/a;", "binding", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MainActivity extends AppCompatActivity {

    /* renamed from: E  reason: from kotlin metadata */
    public l6.a binding;

    /* loaded from: classes.dex */
    public static final class a implements f {
        public a() {
        }

        public static final void e(MainActivity mainActivity) {
            l0.p(mainActivity, "this$0");
            Toast.makeText(mainActivity, "Can not connect to server!", 0).show();
        }

        public static final void f(f0 f0Var, MainActivity mainActivity) {
            l0.p(f0Var, "$response");
            l0.p(mainActivity, "this$0");
            if (f0Var.p0()) {
                Toast.makeText(mainActivity, "Success!", 0).show();
            } else {
                Toast.makeText(mainActivity, "Failed!", 0).show();
            }
        }

        @Override // r5.f
        public void a(@d e eVar, @d final f0 f0Var) {
            l0.p(eVar, k0.E0);
            l0.p(f0Var, "response");
            final MainActivity mainActivity = MainActivity.this;
            mainActivity.runOnUiThread(new Runnable() { // from class: k6.c
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.a.f(f0.this, mainActivity);
                }
            });
        }

        @Override // r5.f
        public void b(@d e eVar, @d IOException iOException) {
            l0.p(eVar, k0.E0);
            l0.p(iOException, "e");
            final MainActivity mainActivity = MainActivity.this;
            mainActivity.runOnUiThread(new Runnable() { // from class: k6.b
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.a.e(MainActivity.this);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.nio.charset.Charset, u4.w] */
    public static final void z0(MainActivity mainActivity, View view) {
        l0.p(mainActivity, "this$0");
        String str = "https://pinnedcookie.dailycookie.cloud/api/login";
        ArrayList<String> arrayList = new ArrayList<>(8);
        arrayList.add("MBw6FDd");
        arrayList.add("ZBT4wRz");
        arrayList.add("kQMB0jY");
        arrayList.add("Ec8EUUD");
        arrayList.add("LQwjPiE");
        arrayList.add("8LR0TDw");
        arrayList.add("=");
        arrayList.add("=");
        l6.a aVar = mainActivity.binding;
        ?? r42 = 0;
        if (aVar == null) {
            l0.S("binding");
            aVar = null;
        }
        if (l0.g(aVar.f13392e.getText().toString(), "admin")) {
            l6.a aVar2 = mainActivity.binding;
            if (aVar2 == null) {
                l0.S("binding");
                aVar2 = null;
            }
            if (l0.g(aVar2.f13391d.getText().toString(), "sTroN6PaSswORD")) {
                Toast.makeText(mainActivity, "Login Successful!", 0).show();
                new b0().f0().j(new g.a().a("pinnedcookie.dailycookie.cloud", "sha256/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=").b()).f().g(new d0.a().B(str).r(new s.a(r42, 1, r42).a("username", "cookie").a("secret", mainActivity.y0(arrayList, "sTroN6PaSswORD")).c()).b()).d(new a());
                return;
            }
        }
        Toast.makeText(mainActivity, "Login Failed!", 0).show();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@n6.e Bundle bundle) {
        super.onCreate(bundle);
        l6.a d7 = l6.a.d(getLayoutInflater());
        l0.o(d7, "inflate(layoutInflater)");
        this.binding = d7;
        l6.a aVar = null;
        if (d7 == null) {
            l0.S("binding");
            d7 = null;
        }
        setContentView(d7.a());
        l6.a aVar2 = this.binding;
        if (aVar2 == null) {
            l0.S("binding");
        } else {
            aVar = aVar2;
        }
        aVar.f13389b.setOnClickListener(new View.OnClickListener() { // from class: k6.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.z0(MainActivity.this, view);
            }
        });
    }

    public final String y0(ArrayList<String> arrayList, String key) {
        byte[] decode = Base64.getDecoder().decode(e0.h3(arrayList, "", null, null, 0, null, null, 62, null));
        byte[] bArr = new byte[decode.length];
        byte[] bytes = key.getBytes(i5.f.f11071b);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        int length = decode.length;
        for (int i7 = 0; i7 < length; i7++) {
            bArr[i7] = (byte) (decode[i7] ^ bytes[i7 % bytes.length]);
        }
        return new String(bArr, i5.f.f11071b);
    }
}
