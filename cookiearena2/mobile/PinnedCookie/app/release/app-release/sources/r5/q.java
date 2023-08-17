package r5;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import u4.l0;
/* loaded from: classes.dex */
public interface q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f16026b = new a(null);
    @n6.d
    @s4.e

    /* renamed from: a  reason: collision with root package name */
    public static final q f16025a = new a.C0234a();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f16027a = null;

        /* renamed from: r5.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0234a implements q {
            @Override // r5.q
            @n6.d
            public List<InetAddress> a(@n6.d String str) {
                l0.p(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    l0.o(allByName, "InetAddress.getAllByName(hostname)");
                    return x3.p.kz(allByName);
                } catch (NullPointerException e7) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e7);
                    throw unknownHostException;
                }
            }
        }

        public a() {
        }

        public /* synthetic */ a(u4.w wVar) {
            this();
        }
    }

    @n6.d
    List<InetAddress> a(@n6.d String str) throws UnknownHostException;
}
