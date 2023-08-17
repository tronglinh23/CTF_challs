package c;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import c.a;
import d.w0;
import d5.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import u4.l0;
import u4.w;
import v3.b1;
import v3.j0;
import v3.q1;
import v3.u0;
import x3.a1;
import x3.e0;
import x3.z0;
/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static class a extends c.a<Uri, Boolean> {
        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d Uri uri) {
            l0.p(context, "context");
            l0.p(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            l0.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<Boolean> b(@n6.d Context context, @n6.d Uri uri) {
            l0.p(context, "context");
            l0.p(uri, "input");
            return null;
        }

        @Override // c.a
        @n6.d
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i7, @n6.e Intent intent) {
            return Boolean.valueOf(i7 == -1);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends c.a<String, Uri> {
        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d String str) {
            l0.p(context, "context");
            l0.p(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            l0.o(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<Uri> b(@n6.d Context context, @n6.d String str) {
            l0.p(context, "context");
            l0.p(str, "input");
            return null;
        }

        @Override // c.a
        @n6.e
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final Uri c(int i7, @n6.e Intent intent) {
            if (!(i7 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @w0(18)
    /* loaded from: classes.dex */
    public static class d extends c.a<String, List<Uri>> {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f7277a = new a(null);

        @w0(18)
        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(w wVar) {
                this();
            }

            @n6.d
            public final List<Uri> a(@n6.d Intent intent) {
                l0.p(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return x3.w.E();
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i7 = 0; i7 < itemCount; i7++) {
                        Uri uri = clipData.getItemAt(i7).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public a() {
            }
        }

        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d String str) {
            l0.p(context, "context");
            l0.p(str, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            l0.o(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<List<Uri>> b(@n6.d Context context, @n6.d String str) {
            l0.p(context, "context");
            l0.p(str, "input");
            return null;
        }

        @Override // c.a
        @n6.d
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i7, @n6.e Intent intent) {
            List<Uri> a7;
            if (!(i7 == -1)) {
                intent = null;
            }
            return (intent == null || (a7 = f7277a.a(intent)) == null) ? x3.w.E() : a7;
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class e extends c.a<String[], Uri> {
        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d String[] strArr) {
            l0.p(context, "context");
            l0.p(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            l0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<Uri> b(@n6.d Context context, @n6.d String[] strArr) {
            l0.p(context, "context");
            l0.p(strArr, "input");
            return null;
        }

        @Override // c.a
        @n6.e
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final Uri c(int i7, @n6.e Intent intent) {
            if (!(i7 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @w0(21)
    /* loaded from: classes.dex */
    public static class f extends c.a<Uri, Uri> {
        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.e Uri uri) {
            l0.p(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<Uri> b(@n6.d Context context, @n6.e Uri uri) {
            l0.p(context, "context");
            return null;
        }

        @Override // c.a
        @n6.e
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final Uri c(int i7, @n6.e Intent intent) {
            if (!(i7 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class g extends c.a<String[], List<Uri>> {
        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d String[] strArr) {
            l0.p(context, "context");
            l0.p(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            l0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<List<Uri>> b(@n6.d Context context, @n6.d String[] strArr) {
            l0.p(context, "context");
            l0.p(strArr, "input");
            return null;
        }

        @Override // c.a
        @n6.d
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i7, @n6.e Intent intent) {
            List<Uri> a7;
            if (!(i7 == -1)) {
                intent = null;
            }
            return (intent == null || (a7 = d.f7277a.a(intent)) == null) ? x3.w.E() : a7;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends c.a<Void, Uri> {
        @Override // c.a
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.e Void r22) {
            l0.p(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            l0.o(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public Uri c(int i7, @n6.e Intent intent) {
            if (!(i7 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static class i extends c.a<androidx.activity.result.m, List<Uri>> {
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final a f7278b = new a(null);

        /* renamed from: a  reason: collision with root package name */
        public final int f7279a;

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(w wVar) {
                this();
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int a() {
                int pickImagesMaxLimit;
                if (j.f7280a.b()) {
                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                    return pickImagesMaxLimit;
                }
                return Integer.MAX_VALUE;
            }

            public a() {
            }
        }

        public i() {
            this(0, 1, null);
        }

        @Override // c.a
        @d.i
        @n6.d
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d androidx.activity.result.m mVar) {
            Intent intent;
            int pickImagesMaxLimit;
            l0.p(context, "context");
            l0.p(mVar, "input");
            j.a aVar = j.f7280a;
            if (aVar.b()) {
                intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.a(mVar.a()));
                int i7 = this.f7279a;
                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                if (!(i7 <= pickImagesMaxLimit)) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f7279a);
            } else {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType(aVar.a(mVar.a()));
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent.getType() == null) {
                    intent.setType("*/*");
                    intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
            }
            return intent;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<List<Uri>> b(@n6.d Context context, @n6.d androidx.activity.result.m mVar) {
            l0.p(context, "context");
            l0.p(mVar, "input");
            return null;
        }

        @Override // c.a
        @n6.d
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int i7, @n6.e Intent intent) {
            List<Uri> a7;
            if (!(i7 == -1)) {
                intent = null;
            }
            return (intent == null || (a7 = d.f7277a.a(intent)) == null) ? x3.w.E() : a7;
        }

        public /* synthetic */ i(int i7, int i8, w wVar) {
            this((i8 & 1) != 0 ? f7278b.a() : i7);
        }

        public i(int i7) {
            this.f7279a = i7;
            if (!(i7 > 1)) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class j extends c.a<androidx.activity.result.m, Uri> {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f7280a = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(w wVar) {
                this();
            }

            @n6.e
            public final String a(@n6.d f fVar) {
                l0.p(fVar, "input");
                if (fVar instanceof c) {
                    return "image/*";
                }
                if (fVar instanceof e) {
                    return "video/*";
                }
                if (fVar instanceof d) {
                    return ((d) fVar).a();
                }
                if (fVar instanceof C0086b) {
                    return null;
                }
                throw new j0();
            }

            @s4.m
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean b() {
                int extensionVersion;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 33) {
                    return true;
                }
                if (i7 >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion >= 2) {
                        return true;
                    }
                }
                return false;
            }

            public a() {
            }
        }

        /* renamed from: c.b$j$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0086b implements f {
            @n6.d

            /* renamed from: a  reason: collision with root package name */
            public static final C0086b f7281a = new C0086b();
        }

        /* loaded from: classes.dex */
        public static final class c implements f {
            @n6.d

            /* renamed from: a  reason: collision with root package name */
            public static final c f7282a = new c();
        }

        /* loaded from: classes.dex */
        public static final class d implements f {
            @n6.d

            /* renamed from: a  reason: collision with root package name */
            public final String f7283a;

            public d(@n6.d String str) {
                l0.p(str, "mimeType");
                this.f7283a = str;
            }

            @n6.d
            public final String a() {
                return this.f7283a;
            }
        }

        /* loaded from: classes.dex */
        public static final class e implements f {
            @n6.d

            /* renamed from: a  reason: collision with root package name */
            public static final e f7284a = new e();
        }

        /* loaded from: classes.dex */
        public interface f {
        }

        @s4.m
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean f() {
            return f7280a.b();
        }

        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d androidx.activity.result.m mVar) {
            l0.p(context, "context");
            l0.p(mVar, "input");
            a aVar = f7280a;
            if (aVar.b()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(aVar.a(mVar.a()));
                return intent;
            }
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(aVar.a(mVar.a()));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent2;
            }
            return intent2;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<Uri> b(@n6.d Context context, @n6.d androidx.activity.result.m mVar) {
            l0.p(context, "context");
            l0.p(mVar, "input");
            return null;
        }

        @Override // c.a
        @n6.e
        /* renamed from: g  reason: merged with bridge method [inline-methods] */
        public final Uri c(int i7, @n6.e Intent intent) {
            if (!(i7 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends c.a<String[], Map<String, Boolean>> {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f7285a = new a(null);
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final String f7286b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public static final String f7287c = "androidx.activity.result.contract.extra.PERMISSIONS";
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public static final String f7288d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(w wVar) {
                this();
            }

            @n6.d
            public final Intent a(@n6.d String[] strArr) {
                l0.p(strArr, "input");
                Intent putExtra = new Intent(k.f7286b).putExtra(k.f7287c, strArr);
                l0.o(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }

            public a() {
            }
        }

        @Override // c.a
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d String[] strArr) {
            l0.p(context, "context");
            l0.p(strArr, "input");
            return f7285a.a(strArr);
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public a.C0084a<Map<String, Boolean>> b(@n6.d Context context, @n6.d String[] strArr) {
            l0.p(context, "context");
            l0.p(strArr, "input");
            boolean z6 = true;
            if (strArr.length == 0) {
                return new a.C0084a<>(a1.z());
            }
            int length = strArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (!(k0.d.a(context, strArr[i7]) == 0)) {
                    z6 = false;
                    break;
                }
                i7++;
            }
            if (z6) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(z0.j(strArr.length), 16));
                for (String str : strArr) {
                    u0 a7 = q1.a(str, Boolean.TRUE);
                    linkedHashMap.put(a7.e(), a7.f());
                }
                return new a.C0084a<>(linkedHashMap);
            }
            return null;
        }

        @Override // c.a
        @n6.d
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> c(int i7, @n6.e Intent intent) {
            if (i7 == -1 && intent != null) {
                String[] stringArrayExtra = intent.getStringArrayExtra(f7287c);
                int[] intArrayExtra = intent.getIntArrayExtra(f7288d);
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return a1.z();
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i8 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i8 == 0));
                }
                return a1.D0(e0.d6(x3.p.ub(stringArrayExtra), arrayList));
            }
            return a1.z();
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends c.a<String, Boolean> {
        @Override // c.a
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d String str) {
            l0.p(context, "context");
            l0.p(str, "input");
            return k.f7285a.a(new String[]{str});
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public a.C0084a<Boolean> b(@n6.d Context context, @n6.d String str) {
            l0.p(context, "context");
            l0.p(str, "input");
            if (k0.d.a(context, str) == 0) {
                return new a.C0084a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // c.a
        @n6.d
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public Boolean c(int i7, @n6.e Intent intent) {
            boolean z6;
            if (intent == null || i7 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(k.f7288d);
            boolean z7 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        z6 = false;
                        break;
                    }
                    if (intArrayExtra[i8] == 0) {
                        z6 = true;
                        break;
                    }
                    i8++;
                }
                if (z6) {
                    z7 = true;
                }
            }
            return Boolean.valueOf(z7);
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends c.a<Intent, androidx.activity.result.a> {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f7289a = new a(null);
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final String f7290b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(w wVar) {
                this();
            }

            public a() {
            }
        }

        @Override // c.a
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d Intent intent) {
            l0.p(context, "context");
            l0.p(intent, "input");
            return intent;
        }

        @Override // c.a
        @n6.d
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i7, @n6.e Intent intent) {
            return new androidx.activity.result.a(i7, intent);
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends c.a<androidx.activity.result.l, androidx.activity.result.a> {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f7291a = new a(null);
        @n6.d

        /* renamed from: b  reason: collision with root package name */
        public static final String f7292b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        @n6.d

        /* renamed from: c  reason: collision with root package name */
        public static final String f7293c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        @n6.d

        /* renamed from: d  reason: collision with root package name */
        public static final String f7294d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* loaded from: classes.dex */
        public static final class a {
            public /* synthetic */ a(w wVar) {
                this();
            }

            public a() {
            }
        }

        @Override // c.a
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d androidx.activity.result.l lVar) {
            l0.p(context, "context");
            l0.p(lVar, "input");
            Intent putExtra = new Intent(f7292b).putExtra(f7293c, lVar);
            l0.o(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        @Override // c.a
        @n6.d
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i7, @n6.e Intent intent) {
            return new androidx.activity.result.a(i7, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class o extends c.a<Uri, Boolean> {
        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d Uri uri) {
            l0.p(context, "context");
            l0.p(uri, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
            l0.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<Boolean> b(@n6.d Context context, @n6.d Uri uri) {
            l0.p(context, "context");
            l0.p(uri, "input");
            return null;
        }

        @Override // c.a
        @n6.d
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final Boolean c(int i7, @n6.e Intent intent) {
            return Boolean.valueOf(i7 == -1);
        }
    }

    /* loaded from: classes.dex */
    public static class p extends c.a<Void, Bitmap> {
        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.e Void r22) {
            l0.p(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<Bitmap> b(@n6.d Context context, @n6.e Void r22) {
            l0.p(context, "context");
            return null;
        }

        @Override // c.a
        @n6.e
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i7, @n6.e Intent intent) {
            if (!(i7 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    @v3.k(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    /* loaded from: classes.dex */
    public static class q extends c.a<Uri, Bitmap> {
        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d Uri uri) {
            l0.p(context, "context");
            l0.p(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
            l0.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<Bitmap> b(@n6.d Context context, @n6.d Uri uri) {
            l0.p(context, "context");
            l0.p(uri, "input");
            return null;
        }

        @Override // c.a
        @n6.e
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int i7, @n6.e Intent intent) {
            if (!(i7 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    @w0(19)
    /* renamed from: c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0085b extends c.a<String, Uri> {
        @n6.d

        /* renamed from: a  reason: collision with root package name */
        public final String f7276a;

        public C0085b(@n6.d String str) {
            l0.p(str, "mimeType");
            this.f7276a = str;
        }

        @Override // c.a
        @d.i
        @n6.d
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Intent a(@n6.d Context context, @n6.d String str) {
            l0.p(context, "context");
            l0.p(str, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f7276a).putExtra("android.intent.extra.TITLE", str);
            l0.o(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        @Override // c.a
        @n6.e
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public final a.C0084a<Uri> b(@n6.d Context context, @n6.d String str) {
            l0.p(context, "context");
            l0.p(str, "input");
            return null;
        }

        @Override // c.a
        @n6.e
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public final Uri c(int i7, @n6.e Intent intent) {
            if (!(i7 == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @v3.k(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @b1(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C0085b() {
            this("*/*");
        }
    }
}
