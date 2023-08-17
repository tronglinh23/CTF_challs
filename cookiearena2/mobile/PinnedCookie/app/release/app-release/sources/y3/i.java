package y3;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import u4.l0;
import u4.w;
import x3.a1;
import x3.z0;
/* loaded from: classes.dex */
public final class i implements Externalizable {
    @n6.d

    /* renamed from: l  reason: collision with root package name */
    public static final a f18849l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final long f18850m = 0;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public Map<?, ?> f18851k;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public a() {
        }
    }

    public i(@n6.d Map<?, ?> map) {
        l0.p(map, "map");
        this.f18851k = map;
    }

    public final Object a() {
        return this.f18851k;
    }

    @Override // java.io.Externalizable
    public void readExternal(@n6.d ObjectInput objectInput) {
        l0.p(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        Map h7 = z0.h(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            h7.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f18851k = z0.d(h7);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@n6.d ObjectOutput objectOutput) {
        l0.p(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f18851k.size());
        for (Map.Entry<?, ?> entry : this.f18851k.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public i() {
        this(a1.z());
    }
}
