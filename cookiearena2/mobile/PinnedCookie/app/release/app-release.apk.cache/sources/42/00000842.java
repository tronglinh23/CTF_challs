package b3;

import d.o0;
import d.q0;
import d.w0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

@w0(19)
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final int f7204a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f7205b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7206c = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final int f7207d = 6;

    /* renamed from: e  reason: collision with root package name */
    public static final int f7208e = 7;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f7209f = {112, 114, 111, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f7210g = {112, 114, 109, 0};

    public static void A(@o0 InputStream inputStream) throws IOException {
        c.h(inputStream);
        int j7 = c.j(inputStream);
        if (j7 == 6 || j7 == 7) {
            return;
        }
        while (j7 > 0) {
            c.j(inputStream);
            for (int j8 = c.j(inputStream); j8 > 0; j8--) {
                c.h(inputStream);
            }
            j7--;
        }
    }

    public static boolean B(@o0 OutputStream outputStream, @o0 byte[] bArr, @o0 b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, o.f7211a)) {
            N(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, o.f7212b)) {
            M(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, o.f7214d)) {
            K(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, o.f7213c)) {
            L(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, o.f7215e)) {
            J(outputStream, bVarArr);
            return true;
        } else {
            return false;
        }
    }

    public static void C(@o0 OutputStream outputStream, @o0 b bVar) throws IOException {
        int i7 = 0;
        for (int i8 : bVar.f7180h) {
            Integer valueOf = Integer.valueOf(i8);
            c.p(outputStream, valueOf.intValue() - i7);
            i7 = valueOf.intValue();
        }
    }

    public static q D(@o0 b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c.p(byteArrayOutputStream, bVarArr.length);
            int i7 = 2;
            for (b bVar : bVarArr) {
                c.q(byteArrayOutputStream, bVar.f7175c);
                c.q(byteArrayOutputStream, bVar.f7176d);
                c.q(byteArrayOutputStream, bVar.f7179g);
                String j7 = j(bVar.f7173a, bVar.f7174b, o.f7211a);
                int k7 = c.k(j7);
                c.p(byteArrayOutputStream, k7);
                i7 = i7 + 4 + 4 + 4 + 2 + (k7 * 1);
                c.n(byteArrayOutputStream, j7);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i7 == byteArray.length) {
                q qVar = new q(d.DEX_FILES, i7, byteArray, false);
                byteArrayOutputStream.close();
                return qVar;
            }
            throw c.c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(@o0 OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f7209f);
        outputStream.write(bArr);
    }

    public static void F(@o0 OutputStream outputStream, @o0 b bVar) throws IOException {
        I(outputStream, bVar);
        C(outputStream, bVar);
        H(outputStream, bVar);
    }

    public static void G(@o0 OutputStream outputStream, @o0 b bVar, @o0 String str) throws IOException {
        c.p(outputStream, c.k(str));
        c.p(outputStream, bVar.f7177e);
        c.q(outputStream, bVar.f7178f);
        c.q(outputStream, bVar.f7175c);
        c.q(outputStream, bVar.f7179g);
        c.n(outputStream, str);
    }

    public static void H(@o0 OutputStream outputStream, @o0 b bVar) throws IOException {
        byte[] bArr = new byte[k(bVar.f7179g)];
        for (Map.Entry<Integer, Integer> entry : bVar.f7181i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, bVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, bVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(@o0 OutputStream outputStream, @o0 b bVar) throws IOException {
        int i7 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f7181i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                c.p(outputStream, intValue - i7);
                c.p(outputStream, 0);
                i7 = intValue;
            }
        }
    }

    public static void J(@o0 OutputStream outputStream, @o0 b[] bVarArr) throws IOException {
        c.p(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String j7 = j(bVar.f7173a, bVar.f7174b, o.f7215e);
            c.p(outputStream, c.k(j7));
            c.p(outputStream, bVar.f7181i.size());
            c.p(outputStream, bVar.f7180h.length);
            c.q(outputStream, bVar.f7175c);
            c.n(outputStream, j7);
            Iterator<Integer> it = bVar.f7181i.keySet().iterator();
            while (it.hasNext()) {
                c.p(outputStream, it.next().intValue());
            }
            for (int i7 : bVar.f7180h) {
                c.p(outputStream, i7);
            }
        }
    }

    public static void K(@o0 OutputStream outputStream, @o0 b[] bVarArr) throws IOException {
        c.r(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            int size = bVar.f7181i.size() * 4;
            String j7 = j(bVar.f7173a, bVar.f7174b, o.f7214d);
            c.p(outputStream, c.k(j7));
            c.p(outputStream, bVar.f7180h.length);
            c.q(outputStream, size);
            c.q(outputStream, bVar.f7175c);
            c.n(outputStream, j7);
            Iterator<Integer> it = bVar.f7181i.keySet().iterator();
            while (it.hasNext()) {
                c.p(outputStream, it.next().intValue());
                c.p(outputStream, 0);
            }
            for (int i7 : bVar.f7180h) {
                c.p(outputStream, i7);
            }
        }
    }

    public static void L(@o0 OutputStream outputStream, @o0 b[] bVarArr) throws IOException {
        byte[] b7 = b(bVarArr, o.f7213c);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, b7);
    }

    public static void M(@o0 OutputStream outputStream, @o0 b[] bVarArr) throws IOException {
        byte[] b7 = b(bVarArr, o.f7212b);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, b7);
    }

    public static void N(@o0 OutputStream outputStream, @o0 b[] bVarArr) throws IOException {
        O(outputStream, bVarArr);
    }

    public static void O(@o0 OutputStream outputStream, @o0 b[] bVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(bVarArr));
        arrayList.add(c(bVarArr));
        arrayList.add(d(bVarArr));
        long length2 = o.f7211a.length + f7209f.length + 4 + (arrayList.size() * 16);
        c.q(outputStream, arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            q qVar = (q) arrayList.get(i7);
            c.q(outputStream, qVar.f7220a.e());
            c.q(outputStream, length2);
            if (qVar.f7223d) {
                byte[] bArr = qVar.f7222c;
                long length3 = bArr.length;
                byte[] b7 = c.b(bArr);
                arrayList2.add(b7);
                c.q(outputStream, b7.length);
                c.q(outputStream, length3);
                length = b7.length;
            } else {
                arrayList2.add(qVar.f7222c);
                c.q(outputStream, qVar.f7222c.length);
                c.q(outputStream, 0L);
                length = qVar.f7222c.length;
            }
            length2 += length;
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            outputStream.write((byte[]) arrayList2.get(i8));
        }
    }

    public static int a(@o0 b bVar) {
        Iterator<Map.Entry<Integer, Integer>> it = bVar.f7181i.entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 |= it.next().getValue().intValue();
        }
        return i7;
    }

    @o0
    public static byte[] b(@o0 b[] bVarArr, @o0 byte[] bArr) throws IOException {
        int i7 = 0;
        int i8 = 0;
        for (b bVar : bVarArr) {
            i8 += c.k(j(bVar.f7173a, bVar.f7174b, bArr)) + 16 + (bVar.f7177e * 2) + bVar.f7178f + k(bVar.f7179g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i8);
        if (Arrays.equals(bArr, o.f7213c)) {
            int length = bVarArr.length;
            while (i7 < length) {
                b bVar2 = bVarArr[i7];
                G(byteArrayOutputStream, bVar2, j(bVar2.f7173a, bVar2.f7174b, bArr));
                F(byteArrayOutputStream, bVar2);
                i7++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                G(byteArrayOutputStream, bVar3, j(bVar3.f7173a, bVar3.f7174b, bArr));
            }
            int length2 = bVarArr.length;
            while (i7 < length2) {
                F(byteArrayOutputStream, bVarArr[i7]);
                i7++;
            }
        }
        if (byteArrayOutputStream.size() == i8) {
            return byteArrayOutputStream.toByteArray();
        }
        throw c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i8);
    }

    public static q c(@o0 b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        for (int i8 = 0; i8 < bVarArr.length; i8++) {
            try {
                b bVar = bVarArr[i8];
                c.p(byteArrayOutputStream, i8);
                c.p(byteArrayOutputStream, bVar.f7177e);
                i7 = i7 + 2 + 2 + (bVar.f7177e * 2);
                C(byteArrayOutputStream, bVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i7 == byteArray.length) {
            q qVar = new q(d.CLASSES, i7, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw c.c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
    }

    public static q d(@o0 b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 0;
        for (int i8 = 0; i8 < bVarArr.length; i8++) {
            try {
                b bVar = bVarArr[i8];
                int a7 = a(bVar);
                byte[] e7 = e(bVar);
                byte[] f7 = f(bVar);
                c.p(byteArrayOutputStream, i8);
                int length = e7.length + 2 + f7.length;
                c.q(byteArrayOutputStream, length);
                c.p(byteArrayOutputStream, a7);
                byteArrayOutputStream.write(e7);
                byteArrayOutputStream.write(f7);
                i7 = i7 + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i7 == byteArray.length) {
            q qVar = new q(d.METHODS, i7, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw c.c("Expected size " + i7 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(@o0 b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(@o0 b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @o0
    public static String g(@o0 String str, @o0 String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @o0
    public static String h(@o0 String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    @q0
    public static b i(@o0 b[] bVarArr, @o0 String str) {
        if (bVarArr.length <= 0) {
            return null;
        }
        String h7 = h(str);
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            if (bVarArr[i7].f7174b.equals(h7)) {
                return bVarArr[i7];
            }
        }
        return null;
    }

    @o0
    public static String j(@o0 String str, @o0 String str2, @o0 byte[] bArr) {
        String a7 = o.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a7);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a7);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + o.a(bArr) + str2;
    }

    public static int k(int i7) {
        return y(i7 * 2) / 8;
    }

    public static int l(int i7, int i8, int i9) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 4) {
                    return i8 + i9;
                }
                throw c.c("Unexpected flag: " + i7);
            }
            return i8;
        }
        throw c.c("HOT methods are not stored in the bitmap");
    }

    public static int[] m(@o0 InputStream inputStream, int i7) throws IOException {
        int[] iArr = new int[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += c.h(inputStream);
            iArr[i9] = i8;
        }
        return iArr;
    }

    public static int n(@o0 BitSet bitSet, int i7, int i8) {
        int i9 = bitSet.get(l(2, i7, i8)) ? 2 : 0;
        return bitSet.get(l(4, i7, i8)) ? i9 | 4 : i9;
    }

    public static byte[] o(@o0 InputStream inputStream, @o0 byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, c.d(inputStream, bArr.length))) {
            return c.d(inputStream, o.f7212b.length);
        }
        throw c.c("Invalid magic");
    }

    public static void p(@o0 InputStream inputStream, @o0 b bVar) throws IOException {
        int available = inputStream.available() - bVar.f7178f;
        int i7 = 0;
        while (inputStream.available() > available) {
            i7 += c.h(inputStream);
            bVar.f7181i.put(Integer.valueOf(i7), 1);
            for (int h7 = c.h(inputStream); h7 > 0; h7--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw c.c("Read too much data during profile line parse");
        }
    }

    @o0
    public static b[] q(@o0 InputStream inputStream, @o0 byte[] bArr, @o0 byte[] bArr2, b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, o.f7216f)) {
            if (Arrays.equals(o.f7211a, bArr2)) {
                throw c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, bVarArr);
        } else if (Arrays.equals(bArr, o.f7217g)) {
            return t(inputStream, bArr2, bVarArr);
        } else {
            throw c.c("Unsupported meta version");
        }
    }

    @o0
    public static b[] r(@o0 InputStream inputStream, @o0 byte[] bArr, b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, o.f7216f)) {
            int j7 = c.j(inputStream);
            byte[] e7 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e7);
                try {
                    b[] s6 = s(byteArrayInputStream, j7, bVarArr);
                    byteArrayInputStream.close();
                    return s6;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw c.c("Content found after the end of file");
        }
        throw c.c("Unsupported meta version");
    }

    @o0
    public static b[] s(@o0 InputStream inputStream, int i7, b[] bVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i7 == bVarArr.length) {
            String[] strArr = new String[i7];
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                int h7 = c.h(inputStream);
                iArr[i8] = c.h(inputStream);
                strArr[i8] = c.f(inputStream, h7);
            }
            for (int i9 = 0; i9 < i7; i9++) {
                b bVar = bVarArr[i9];
                if (!bVar.f7174b.equals(strArr[i9])) {
                    throw c.c("Order of dexfiles in metadata did not match baseline");
                }
                int i10 = iArr[i9];
                bVar.f7177e = i10;
                bVar.f7180h = m(inputStream, i10);
            }
            return bVarArr;
        }
        throw c.c("Mismatched number of dex files found in metadata");
    }

    @o0
    public static b[] t(@o0 InputStream inputStream, @o0 byte[] bArr, b[] bVarArr) throws IOException {
        int h7 = c.h(inputStream);
        byte[] e7 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e7);
            try {
                b[] u6 = u(byteArrayInputStream, bArr, h7, bVarArr);
                byteArrayInputStream.close();
                return u6;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw c.c("Content found after the end of file");
    }

    @o0
    public static b[] u(@o0 InputStream inputStream, @o0 byte[] bArr, int i7, b[] bVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i7 == bVarArr.length) {
            for (int i8 = 0; i8 < i7; i8++) {
                c.h(inputStream);
                String f7 = c.f(inputStream, c.h(inputStream));
                long i9 = c.i(inputStream);
                int h7 = c.h(inputStream);
                b i10 = i(bVarArr, f7);
                if (i10 == null) {
                    throw c.c("Missing profile key: " + f7);
                }
                i10.f7176d = i9;
                int[] m7 = m(inputStream, h7);
                if (Arrays.equals(bArr, o.f7215e)) {
                    i10.f7177e = h7;
                    i10.f7180h = m7;
                }
            }
            return bVarArr;
        }
        throw c.c("Mismatched number of dex files found in metadata");
    }

    public static void v(@o0 InputStream inputStream, @o0 b bVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(c.d(inputStream, c.a(bVar.f7179g * 2)));
        int i7 = 0;
        while (true) {
            int i8 = bVar.f7179g;
            if (i7 >= i8) {
                return;
            }
            int n7 = n(valueOf, i7, i8);
            if (n7 != 0) {
                Integer num = bVar.f7181i.get(Integer.valueOf(i7));
                if (num == null) {
                    num = 0;
                }
                bVar.f7181i.put(Integer.valueOf(i7), Integer.valueOf(n7 | num.intValue()));
            }
            i7++;
        }
    }

    @o0
    public static b[] w(@o0 InputStream inputStream, @o0 byte[] bArr, @o0 String str) throws IOException {
        if (Arrays.equals(bArr, o.f7212b)) {
            int j7 = c.j(inputStream);
            byte[] e7 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e7);
                try {
                    b[] x6 = x(byteArrayInputStream, str, j7);
                    byteArrayInputStream.close();
                    return x6;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw c.c("Content found after the end of file");
        }
        throw c.c("Unsupported version");
    }

    @o0
    public static b[] x(@o0 InputStream inputStream, @o0 String str, int i7) throws IOException {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            int h7 = c.h(inputStream);
            int h8 = c.h(inputStream);
            bVarArr[i8] = new b(str, c.f(inputStream, h7), c.i(inputStream), 0L, h8, (int) c.i(inputStream), (int) c.i(inputStream), new int[h8], new TreeMap());
        }
        for (int i9 = 0; i9 < i7; i9++) {
            b bVar = bVarArr[i9];
            p(inputStream, bVar);
            bVar.f7180h = m(inputStream, bVar.f7177e);
            v(inputStream, bVar);
        }
        return bVarArr;
    }

    public static int y(int i7) {
        return ((i7 + 8) - 1) & (-8);
    }

    public static void z(@o0 byte[] bArr, int i7, int i8, @o0 b bVar) {
        int l7 = l(i7, i8, bVar.f7179g);
        int i9 = l7 / 8;
        bArr[i9] = (byte) ((1 << (l7 % 8)) | bArr[i9]);
    }
}