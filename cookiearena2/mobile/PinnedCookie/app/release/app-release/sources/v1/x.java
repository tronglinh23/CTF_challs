package v1;

import i6.r0;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static x f17743a;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws IllegalArgumentException {
            if (f(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || f(b9) || f(b10)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int k7 = ((b7 & 7) << 18) | (k(b8) << 12) | (k(b9) << 6) | k(b10);
            cArr[i7] = e(k7);
            cArr[i7 + 1] = j(k7);
        }

        public static void b(byte b7, char[] cArr, int i7) {
            cArr[i7] = (char) b7;
        }

        public static void c(byte b7, byte b8, byte b9, char[] cArr, int i7) throws IllegalArgumentException {
            if (f(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || f(b9)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i7] = (char) (((b7 & 15) << 12) | (k(b8) << 6) | k(b9));
        }

        public static void d(byte b7, byte b8, char[] cArr, int i7) throws IllegalArgumentException {
            if (b7 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (f(b8)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i7] = (char) (((b7 & 31) << 6) | k(b8));
        }

        public static char e(int i7) {
            return (char) ((i7 >>> 10) + r0.f11276d);
        }

        public static boolean f(byte b7) {
            return b7 > -65;
        }

        public static boolean g(byte b7) {
            return b7 >= 0;
        }

        public static boolean h(byte b7) {
            return b7 < -16;
        }

        public static boolean i(byte b7) {
            return b7 < -32;
        }

        public static char j(int i7) {
            return (char) ((i7 & 1023) + r0.f11277e);
        }

        public static int k(byte b7) {
            return b7 & r0.f11273a;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends IllegalArgumentException {
        public b(int i7, int i8) {
            super("Unpaired surrogate at index " + i7 + " of " + i8);
        }
    }

    public static x d() {
        if (f17743a == null) {
            f17743a = new a0();
        }
        return f17743a;
    }

    public static void e(x xVar) {
        f17743a = xVar;
    }

    public abstract String a(ByteBuffer byteBuffer, int i7, int i8);

    public abstract void b(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int c(CharSequence charSequence);
}
