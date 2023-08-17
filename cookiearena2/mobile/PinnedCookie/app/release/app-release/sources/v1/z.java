package v1;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import v1.z;
/* loaded from: classes.dex */
public class z extends x {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<a> f17744b = ThreadLocal.withInitial(new Supplier() { // from class: v1.y
        @Override // java.util.function.Supplier
        public final Object get() {
            z.a g7;
            g7 = z.g();
            return g7;
        }
    });

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f17747c = null;

        /* renamed from: d  reason: collision with root package name */
        public ByteBuffer f17748d = null;

        /* renamed from: a  reason: collision with root package name */
        public final CharsetEncoder f17745a = StandardCharsets.UTF_8.newEncoder();

        /* renamed from: b  reason: collision with root package name */
        public final CharsetDecoder f17746b = StandardCharsets.UTF_8.newDecoder();
    }

    public static /* synthetic */ a g() {
        return new a();
    }

    @Override // v1.x
    public String a(ByteBuffer byteBuffer, int i7, int i8) {
        CharsetDecoder charsetDecoder = f17744b.get().f17746b;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i7);
        duplicate.limit(i7 + i8);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e7) {
            throw new IllegalArgumentException("Bad encoding", e7);
        }
    }

    @Override // v1.x
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = f17744b.get();
        if (aVar.f17747c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.f17748d);
    }

    @Override // v1.x
    public int c(CharSequence charSequence) {
        a aVar = f17744b.get();
        int length = (int) (charSequence.length() * aVar.f17745a.maxBytesPerChar());
        ByteBuffer byteBuffer = aVar.f17748d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            aVar.f17748d = ByteBuffer.allocate(Math.max(128, length));
        }
        aVar.f17748d.clear();
        aVar.f17747c = charSequence;
        CoderResult encode = aVar.f17745a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.f17748d, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e7) {
                throw new IllegalArgumentException("bad character encoding", e7);
            }
        }
        aVar.f17748d.flip();
        return aVar.f17748d.remaining();
    }
}
