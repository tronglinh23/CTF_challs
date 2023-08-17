package a6;

import i6.o;
import java.io.IOException;
import java.util.List;
import u4.l0;
import u4.w;
/* loaded from: classes.dex */
public interface l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f472b = new a(null);
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public static final l f471a = new a.C0012a();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f473a = null;

        /* renamed from: a6.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0012a implements l {
            @Override // a6.l
            public boolean a(int i7, @n6.d List<c> list) {
                l0.p(list, "requestHeaders");
                return true;
            }

            @Override // a6.l
            public boolean b(int i7, @n6.d List<c> list, boolean z6) {
                l0.p(list, "responseHeaders");
                return true;
            }

            @Override // a6.l
            public void c(int i7, @n6.d b bVar) {
                l0.p(bVar, "errorCode");
            }

            @Override // a6.l
            public boolean d(int i7, @n6.d o oVar, int i8, boolean z6) throws IOException {
                l0.p(oVar, "source");
                oVar.skip(i8);
                return true;
            }
        }

        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    boolean a(int i7, @n6.d List<c> list);

    boolean b(int i7, @n6.d List<c> list, boolean z6);

    void c(int i7, @n6.d b bVar);

    boolean d(int i7, @n6.d o oVar, int i8, boolean z6) throws IOException;
}
