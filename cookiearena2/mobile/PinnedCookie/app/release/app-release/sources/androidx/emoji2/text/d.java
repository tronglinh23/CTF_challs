package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.f;
import d.b1;
import d.l1;
import d.o0;
import d.q0;
import d.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class d {

    @b1({b1.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class a {
        @o0

        /* renamed from: b  reason: collision with root package name */
        public static final String f4037b = "emoji2.text.DefaultEmojiConfig";
        @o0

        /* renamed from: c  reason: collision with root package name */
        public static final String f4038c = "androidx.content.action.LOAD_EMOJI_FONT";
        @o0

        /* renamed from: d  reason: collision with root package name */
        public static final String f4039d = "emojicompat-emoji-font";

        /* renamed from: a  reason: collision with root package name */
        public final b f4040a;

        @b1({b1.a.LIBRARY})
        public a(@q0 b bVar) {
            this.f4040a = bVar == null ? e() : bVar;
        }

        @o0
        public static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new C0044d() : new c();
        }

        @q0
        public final f.d a(@o0 Context context, @q0 a1.f fVar) {
            if (fVar == null) {
                return null;
            }
            return new l(context, fVar);
        }

        @o0
        public final List<List<byte[]>> b(@o0 Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        @b1({b1.a.LIBRARY})
        @q0
        public f.d c(@o0 Context context) {
            return a(context, h(context));
        }

        @o0
        public final a1.f d(@o0 ProviderInfo providerInfo, @o0 PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new a1.f(str, str2, f4039d, b(this.f4040a.b(packageManager, str2)));
        }

        public final boolean f(@q0 ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        @q0
        public final ProviderInfo g(@o0 PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f4040a.c(packageManager, new Intent(f4038c), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo a7 = this.f4040a.a(it.next());
                if (f(a7)) {
                    return a7;
                }
            }
            return null;
        }

        @b1({b1.a.LIBRARY})
        @q0
        @l1
        public a1.f h(@o0 Context context) {
            PackageManager packageManager = context.getPackageManager();
            g1.s.m(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g7 = g(packageManager);
            if (g7 == null) {
                return null;
            }
            try {
                return d(g7, packageManager);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf(f4037b, e7);
                return null;
            }
        }
    }

    @b1({b1.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class b {
        @q0
        public ProviderInfo a(@o0 ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        @o0
        public Signature[] b(@o0 PackageManager packageManager, @o0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        @o0
        public List<ResolveInfo> c(@o0 PackageManager packageManager, @o0 Intent intent, int i7) {
            return Collections.emptyList();
        }
    }

    @b1({b1.a.LIBRARY})
    @w0(19)
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // androidx.emoji2.text.d.b
        @q0
        public ProviderInfo a(@o0 ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.d.b
        @o0
        public List<ResolveInfo> c(@o0 PackageManager packageManager, @o0 Intent intent, int i7) {
            return packageManager.queryIntentContentProviders(intent, i7);
        }
    }

    @b1({b1.a.LIBRARY})
    @w0(28)
    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0044d extends c {
        @Override // androidx.emoji2.text.d.b
        @o0
        public Signature[] b(@o0 PackageManager packageManager, @o0 String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    @q0
    public static l a(@o0 Context context) {
        return (l) new a(null).c(context);
    }
}
