package f6;

import n6.e;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import u4.v0;
/* loaded from: classes.dex */
public final /* synthetic */ class a extends v0 {
    public a(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
    }

    @Override // u4.v0, e5.p
    @e
    public Object get() {
        return PublicSuffixDatabase.b((PublicSuffixDatabase) this.f17460l);
    }

    @Override // u4.v0, e5.k
    public void set(@e Object obj) {
        ((PublicSuffixDatabase) this.f17460l).publicSuffixListBytes = (byte[]) obj;
    }
}
