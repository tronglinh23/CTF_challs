package y3;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import u4.l0;
import u4.r1;
import u4.w;
import x3.k1;
import x3.v;

@r1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
/* loaded from: classes.dex */
public final class h implements Externalizable {
    @n6.d

    /* renamed from: m  reason: collision with root package name */
    public static final a f18843m = new a(null);

    /* renamed from: n  reason: collision with root package name */
    public static final long f18844n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f18845o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f18846p = 1;
    @n6.d

    /* renamed from: k  reason: collision with root package name */
    public Collection<?> f18847k;

    /* renamed from: l  reason: collision with root package name */
    public final int f18848l;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(w wVar) {
            this();
        }

        public a() {
        }
    }

    public h(@n6.d Collection<?> collection, int i7) {
        l0.p(collection, "collection");
        this.f18847k = collection;
        this.f18848l = i7;
    }

    public final Object a() {
        return this.f18847k;
    }

    @Override // java.io.Externalizable
    public void readExternal(@n6.d ObjectInput objectInput) {
        Collection<?> a7;
        l0.p(objectInput, "input");
        byte readByte = objectInput.readByte();
        int i7 = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i8 = 0;
        if (i7 == 0) {
            List j7 = v.j(readInt);
            while (i8 < readInt) {
                j7.add(objectInput.readObject());
                i8++;
            }
            a7 = v.a(j7);
        } else if (i7 != 1) {
            throw new InvalidObjectException("Unsupported collection type tag: " + i7 + '.');
        } else {
            Set e7 = k1.e(readInt);
            while (i8 < readInt) {
                e7.add(objectInput.readObject());
                i8++;
            }
            a7 = k1.a(e7);
        }
        this.f18847k = a7;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@n6.d ObjectOutput objectOutput) {
        l0.p(objectOutput, "output");
        objectOutput.writeByte(this.f18848l);
        objectOutput.writeInt(this.f18847k.size());
        Iterator<?> it = this.f18847k.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public h() {
        this(x3.w.E(), 0);
    }
}