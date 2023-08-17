package v1;

import androidx.appcompat.graphics.drawable.a;
import java.nio.ByteBuffer;
import v1.x;

/* loaded from: classes.dex */
public final class a0 extends x {

    /* loaded from: classes.dex */
    public static class a extends IllegalArgumentException {
        public a(int i7, int i8) {
            super("Unpaired surrogate at index " + i7 + " of " + i8);
        }
    }

    public static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) < 128) {
            i7++;
        }
        int i8 = length;
        while (true) {
            if (i7 < length) {
                char charAt = charSequence.charAt(i7);
                if (charAt >= 2048) {
                    i8 += k(charSequence, i7);
                    break;
                }
                i8 += (127 - charAt) >>> 31;
                i7++;
            } else {
                break;
            }
        }
        if (i8 >= length) {
            return i8;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i8 + a.c.M));
    }

    public static String g(byte[] bArr, int i7, int i8) {
        if ((i7 | i8 | ((bArr.length - i7) - i8)) >= 0) {
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = bArr[i7];
                if (!x.a.g(b7)) {
                    break;
                }
                i7++;
                x.a.b(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = bArr[i7];
                if (x.a.g(b8)) {
                    int i13 = i11 + 1;
                    x.a.b(b8, cArr, i11);
                    while (i12 < i9) {
                        byte b9 = bArr[i12];
                        if (!x.a.g(b9)) {
                            break;
                        }
                        i12++;
                        x.a.b(b9, cArr, i13);
                        i13++;
                    }
                    i7 = i12;
                    i11 = i13;
                } else if (x.a.i(b8)) {
                    if (i12 >= i9) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    x.a.d(b8, bArr[i12], cArr, i11);
                    i7 = i12 + 1;
                    i11++;
                } else if (x.a.h(b8)) {
                    if (i12 >= i9 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i14 = i12 + 1;
                    x.a.c(b8, bArr[i12], bArr[i14], cArr, i11);
                    i7 = i14 + 1;
                    i11++;
                } else if (i12 >= i9 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                } else {
                    int i15 = i12 + 1;
                    byte b10 = bArr[i12];
                    int i16 = i15 + 1;
                    x.a.a(b8, b10, bArr[i15], bArr[i16], cArr, i11);
                    i7 = i16 + 1;
                    i11 = i11 + 1 + 1;
                }
            }
            return new String(cArr, 0, i11);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    public static String h(ByteBuffer byteBuffer, int i7, int i8) {
        if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) >= 0) {
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = byteBuffer.get(i7);
                if (!x.a.g(b7)) {
                    break;
                }
                i7++;
                x.a.b(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = byteBuffer.get(i7);
                if (x.a.g(b8)) {
                    int i13 = i11 + 1;
                    x.a.b(b8, cArr, i11);
                    while (i12 < i9) {
                        byte b9 = byteBuffer.get(i12);
                        if (!x.a.g(b9)) {
                            break;
                        }
                        i12++;
                        x.a.b(b9, cArr, i13);
                        i13++;
                    }
                    i7 = i12;
                    i11 = i13;
                } else if (x.a.i(b8)) {
                    if (i12 >= i9) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    x.a.d(b8, byteBuffer.get(i12), cArr, i11);
                    i7 = i12 + 1;
                    i11++;
                } else if (x.a.h(b8)) {
                    if (i12 >= i9 - 1) {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                    int i14 = i12 + 1;
                    x.a.c(b8, byteBuffer.get(i12), byteBuffer.get(i14), cArr, i11);
                    i7 = i14 + 1;
                    i11++;
                } else if (i12 >= i9 - 2) {
                    throw new IllegalArgumentException("Invalid UTF-8");
                } else {
                    int i15 = i12 + 1;
                    byte b10 = byteBuffer.get(i12);
                    int i16 = i15 + 1;
                    x.a.a(b8, b10, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i11);
                    i7 = i16 + 1;
                    i11 = i11 + 1 + 1;
                }
            }
            return new String(cArr, 0, i11);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int i(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.a0.i(java.lang.CharSequence, byte[], int, int):int");
    }

    public static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i7 = 0;
        while (i7 < length) {
            try {
                char charAt = charSequence.charAt(i7);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i7, (byte) charAt);
                i7++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i7 == length) {
            byteBuffer.position(position + i7);
            return;
        }
        position += i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i8 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | 192));
                    byteBuffer.put(i8, (byte) ((charAt2 & '?') | 128));
                    position = i8;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i8;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (position - byteBuffer.position()) + 1)));
                }
            } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                int i9 = i7 + 1;
                if (i9 != length) {
                    try {
                        char charAt3 = charSequence.charAt(i9);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i10 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                int i11 = i10 + 1;
                                byteBuffer.put(i10, (byte) (((codePoint >>> 12) & 63) | 128));
                                int i12 = i11 + 1;
                                byteBuffer.put(i11, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i12, (byte) ((codePoint & 63) | 128));
                                position = i12;
                                i7 = i9;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i10;
                                i7 = i9;
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i7) + " at index " + (byteBuffer.position() + Math.max(i7, (position - byteBuffer.position()) + 1)));
                            }
                        } else {
                            i7 = i9;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                    }
                }
                throw new a(i7, length);
            } else {
                int i13 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position = i13 + 1;
                byteBuffer.put(i13, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i7++;
            position++;
        }
        byteBuffer.position(position);
    }

    public static int k(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i8 = 0;
        while (i7 < length) {
            char charAt = charSequence.charAt(i7);
            if (charAt < 2048) {
                i8 += (127 - charAt) >>> 31;
            } else {
                i8 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i7) < 65536) {
                        throw new a(i7, length);
                    }
                    i7++;
                }
            }
            i7++;
        }
        return i8;
    }

    @Override // v1.x
    public String a(ByteBuffer byteBuffer, int i7, int i8) throws IllegalArgumentException {
        return byteBuffer.hasArray() ? g(byteBuffer.array(), byteBuffer.arrayOffset() + i7, i8) : h(byteBuffer, i7, i8);
    }

    @Override // v1.x
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            j(charSequence, byteBuffer);
            return;
        }
        int arrayOffset = byteBuffer.arrayOffset();
        byteBuffer.position(i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
    }

    @Override // v1.x
    public int c(CharSequence charSequence) {
        return f(charSequence);
    }
}