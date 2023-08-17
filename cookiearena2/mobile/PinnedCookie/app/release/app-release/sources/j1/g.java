package j1;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.k;
import androidx.core.view.u1;
import d.o0;
import d.q0;
import d.u;
import d.w0;
import g1.n;
import g1.s;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11394a = "InputConnectionCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final String f11395b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: c  reason: collision with root package name */
    public static final String f11396c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: d  reason: collision with root package name */
    public static final String f11397d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: e  reason: collision with root package name */
    public static final String f11398e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: f  reason: collision with root package name */
    public static final String f11399f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: g  reason: collision with root package name */
    public static final String f11400g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: h  reason: collision with root package name */
    public static final String f11401h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: i  reason: collision with root package name */
    public static final String f11402i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: j  reason: collision with root package name */
    public static final String f11403j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: k  reason: collision with root package name */
    public static final String f11404k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: l  reason: collision with root package name */
    public static final String f11405l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: m  reason: collision with root package name */
    public static final String f11406m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: n  reason: collision with root package name */
    public static final String f11407n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o  reason: collision with root package name */
    public static final String f11408o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: p  reason: collision with root package name */
    public static final int f11409p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final String f11410q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* loaded from: classes.dex */
    public class a extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f11411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, boolean z6, d dVar) {
            super(inputConnection, z6);
            this.f11411a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
            if (this.f11411a.a(h.g(inputContentInfo), i7, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i7, bundle);
        }
    }

    /* loaded from: classes.dex */
    public class b extends InputConnectionWrapper {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f11412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputConnection inputConnection, boolean z6, d dVar) {
            super(inputConnection, z6);
            this.f11412a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (g.f(str, bundle, this.f11412a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    @w0(25)
    /* loaded from: classes.dex */
    public static class c {
        @u
        public static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i7, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i7, bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(@o0 h hVar, int i7, @q0 Bundle bundle);
    }

    @Deprecated
    public g() {
    }

    public static boolean b(@o0 InputConnection inputConnection, @o0 EditorInfo editorInfo, @o0 h hVar, int i7, @q0 Bundle bundle) {
        return c.a(inputConnection, (InputContentInfo) hVar.f(), i7, bundle);
    }

    @o0
    public static d c(@o0 final View view) {
        s.l(view);
        return new d() { // from class: j1.f
            @Override // j1.g.d
            public final boolean a(h hVar, int i7, Bundle bundle) {
                boolean g7;
                g7 = g.g(view, hVar, i7, bundle);
                return g7;
            }
        };
    }

    @o0
    public static InputConnection d(@o0 View view, @o0 InputConnection inputConnection, @o0 EditorInfo editorInfo) {
        return e(inputConnection, editorInfo, c(view));
    }

    @o0
    @Deprecated
    public static InputConnection e(@o0 InputConnection inputConnection, @o0 EditorInfo editorInfo, @o0 d dVar) {
        n.e(inputConnection, "inputConnection must be non-null");
        n.e(editorInfo, "editorInfo must be non-null");
        n.e(dVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static boolean f(@q0 String str, @q0 Bundle bundle, @o0 d dVar) {
        boolean z6;
        ResultReceiver resultReceiver;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals(f11395b, str)) {
            z6 = false;
        } else if (!TextUtils.equals(f11396c, str)) {
            return false;
        } else {
            z6 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z6 ? f11408o : f11407n);
            try {
                Uri uri = (Uri) bundle.getParcelable(z6 ? f11398e : f11397d);
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z6 ? f11400g : f11399f);
                Uri uri2 = (Uri) bundle.getParcelable(z6 ? f11402i : f11401h);
                int i7 = bundle.getInt(z6 ? f11406m : f11405l);
                Bundle bundle2 = (Bundle) bundle.getParcelable(z6 ? f11404k : f11403j);
                if (uri != null && clipDescription != null) {
                    r02 = dVar.a(new h(uri, clipDescription, uri2), i7, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(r02, null);
                }
                return r02;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }

    public static /* synthetic */ boolean g(View view, h hVar, int i7, Bundle bundle) {
        if ((i7 & 1) != 0) {
            try {
                hVar.e();
                InputContentInfo inputContentInfo = (InputContentInfo) hVar.f();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(f11410q, inputContentInfo);
            } catch (Exception e7) {
                Log.w(f11394a, "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        return u1.m1(view, new k.b(new ClipData(hVar.b(), new ClipData.Item(hVar.a())), 2).e(hVar.c()).c(bundle).a()) == null;
    }
}
