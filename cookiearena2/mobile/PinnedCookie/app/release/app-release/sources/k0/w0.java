package k0;

import android.content.SharedPreferences;
@Deprecated
/* loaded from: classes.dex */
public final class w0 {

    @Deprecated
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static a f11521b;

        /* renamed from: a  reason: collision with root package name */
        public final C0136a f11522a = new C0136a();

        /* renamed from: k0.w0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0136a {
            public void a(@d.o0 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static a b() {
            if (f11521b == null) {
                f11521b = new a();
            }
            return f11521b;
        }

        @Deprecated
        public void a(@d.o0 SharedPreferences.Editor editor) {
            this.f11522a.a(editor);
        }
    }
}
