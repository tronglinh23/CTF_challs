package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import d.b1;
import d.l1;
import d.o0;
import d.w0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@d.d
@w0(19)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: e  reason: collision with root package name */
    public static final int f4151e = 1024;

    /* renamed from: f  reason: collision with root package name */
    public static final String f4152f = "EmojiCompat.MetadataRepo.create";
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final v1.p f4153a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final char[] f4154b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final a f4155c = new a(1024);
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f4156d;

    @b1({b1.a.LIBRARY})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f4157a;

        /* renamed from: b  reason: collision with root package name */
        public i f4158b;

        public a() {
            this(1);
        }

        public a a(int i7) {
            SparseArray<a> sparseArray = this.f4157a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i7);
        }

        public final i b() {
            return this.f4158b;
        }

        public void c(@o0 i iVar, int i7, int i8) {
            a a7 = a(iVar.b(i7));
            if (a7 == null) {
                a7 = new a();
                this.f4157a.put(iVar.b(i7), a7);
            }
            if (i8 > i7) {
                a7.c(iVar, i7 + 1, i8);
            } else {
                a7.f4158b = iVar;
            }
        }

        public a(int i7) {
            this.f4157a = new SparseArray<>(i7);
        }
    }

    public p(@o0 Typeface typeface, @o0 v1.p pVar) {
        this.f4156d = typeface;
        this.f4153a = pVar;
        this.f4154b = new char[pVar.K() * 2];
        a(pVar);
    }

    @o0
    public static p b(@o0 AssetManager assetManager, @o0 String str) throws IOException {
        try {
            z0.w0.b(f4152f);
            return new p(Typeface.createFromAsset(assetManager, str), o.b(assetManager, str));
        } finally {
            z0.w0.d();
        }
    }

    @b1({b1.a.TESTS})
    @o0
    public static p c(@o0 Typeface typeface) {
        try {
            z0.w0.b(f4152f);
            return new p(typeface, new v1.p());
        } finally {
            z0.w0.d();
        }
    }

    @o0
    public static p d(@o0 Typeface typeface, @o0 InputStream inputStream) throws IOException {
        try {
            z0.w0.b(f4152f);
            return new p(typeface, o.c(inputStream));
        } finally {
            z0.w0.d();
        }
    }

    @o0
    public static p e(@o0 Typeface typeface, @o0 ByteBuffer byteBuffer) throws IOException {
        try {
            z0.w0.b(f4152f);
            return new p(typeface, o.d(byteBuffer));
        } finally {
            z0.w0.d();
        }
    }

    public final void a(v1.p pVar) {
        int K = pVar.K();
        for (int i7 = 0; i7 < K; i7++) {
            i iVar = new i(this, i7);
            Character.toChars(iVar.g(), this.f4154b, i7 * 2);
            k(iVar);
        }
    }

    @b1({b1.a.LIBRARY})
    @o0
    public char[] f() {
        return this.f4154b;
    }

    @b1({b1.a.LIBRARY})
    @o0
    public v1.p g() {
        return this.f4153a;
    }

    @b1({b1.a.LIBRARY})
    public int h() {
        return this.f4153a.S();
    }

    @b1({b1.a.LIBRARY})
    @o0
    public a i() {
        return this.f4155c;
    }

    @b1({b1.a.LIBRARY})
    @o0
    public Typeface j() {
        return this.f4156d;
    }

    @b1({b1.a.LIBRARY})
    @l1
    public void k(@o0 i iVar) {
        g1.s.m(iVar, "emoji metadata cannot be null");
        g1.s.b(iVar.c() > 0, "invalid metadata codepoint length");
        this.f4155c.c(iVar, 0, iVar.c() - 1);
    }
}