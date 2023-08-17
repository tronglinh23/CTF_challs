package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.d;
import d.b0;
import d.b1;
import d.g0;
import d.o0;
import d.q0;
import d.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@d.d
/* loaded from: classes.dex */
public class f {
    public static final int A = 2;
    @b1({b1.a.LIBRARY})
    public static final int B = Integer.MAX_VALUE;
    public static final Object C = new Object();
    public static final Object D = new Object();
    @q0
    @b0("INSTANCE_LOCK")
    public static volatile f E = null;
    @b0("CONFIG_LOCK")
    public static volatile boolean F = false;
    public static final String G = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* renamed from: n  reason: collision with root package name */
    public static final String f4044n = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* renamed from: o  reason: collision with root package name */
    public static final String f4045o = "android.support.text.emoji.emojiCompat_replaceAll";

    /* renamed from: p  reason: collision with root package name */
    public static final int f4046p = 3;

    /* renamed from: q  reason: collision with root package name */
    public static final int f4047q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f4048r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f4049s = 2;

    /* renamed from: t  reason: collision with root package name */
    public static final int f4050t = 0;

    /* renamed from: u  reason: collision with root package name */
    public static final int f4051u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f4052v = 2;

    /* renamed from: w  reason: collision with root package name */
    public static final int f4053w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final int f4054x = 1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f4055y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f4056z = 1;
    @b0("mInitLock")
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Set<AbstractC0045f> f4058b;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final c f4061e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public final i f4062f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4063g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4064h;
    @q0

    /* renamed from: i  reason: collision with root package name */
    public final int[] f4065i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4066j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4067k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4068l;

    /* renamed from: m  reason: collision with root package name */
    public final e f4069m;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteLock f4057a = new ReentrantReadWriteLock();
    @b0("mInitLock")

    /* renamed from: c  reason: collision with root package name */
    public volatile int f4059c = 3;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4060d = new Handler(Looper.getMainLooper());

    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @w0(19)
    /* loaded from: classes.dex */
    public static final class b extends c {

        /* renamed from: b  reason: collision with root package name */
        public volatile androidx.emoji2.text.j f4070b;

        /* renamed from: c  reason: collision with root package name */
        public volatile p f4071c;

        /* loaded from: classes.dex */
        public class a extends j {
            public a() {
            }

            @Override // androidx.emoji2.text.f.j
            public void a(@q0 Throwable th) {
                b.this.f4073a.s(th);
            }

            @Override // androidx.emoji2.text.f.j
            public void b(@o0 p pVar) {
                b.this.h(pVar);
            }
        }

        public b(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.c
        public String a() {
            String N = this.f4071c.g().N();
            return N == null ? "" : N;
        }

        @Override // androidx.emoji2.text.f.c
        public int b(CharSequence charSequence, int i7) {
            return this.f4070b.d(charSequence, i7);
        }

        @Override // androidx.emoji2.text.f.c
        public boolean c(@o0 CharSequence charSequence) {
            return this.f4070b.c(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.f.c
        public boolean d(@o0 CharSequence charSequence, int i7) {
            return this.f4070b.d(charSequence, i7) == 1;
        }

        @Override // androidx.emoji2.text.f.c
        public void e() {
            try {
                this.f4073a.f4062f.a(new a());
            } catch (Throwable th) {
                this.f4073a.s(th);
            }
        }

        @Override // androidx.emoji2.text.f.c
        public CharSequence f(@o0 CharSequence charSequence, int i7, int i8, int i9, boolean z6) {
            return this.f4070b.j(charSequence, i7, i8, i9, z6);
        }

        @Override // androidx.emoji2.text.f.c
        public void g(@o0 EditorInfo editorInfo) {
            editorInfo.extras.putInt(f.f4044n, this.f4071c.h());
            editorInfo.extras.putBoolean(f.f4045o, this.f4073a.f4063g);
        }

        public void h(@o0 p pVar) {
            if (pVar == null) {
                this.f4073a.s(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f4071c = pVar;
            p pVar2 = this.f4071c;
            l lVar = new l();
            e eVar = this.f4073a.f4069m;
            f fVar = this.f4073a;
            this.f4070b = new androidx.emoji2.text.j(pVar2, lVar, eVar, fVar.f4064h, fVar.f4065i);
            this.f4073a.t();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final f f4073a;

        public c(f fVar) {
            this.f4073a = fVar;
        }

        public String a() {
            return "";
        }

        public int b(CharSequence charSequence, int i7) {
            return 0;
        }

        public boolean c(@o0 CharSequence charSequence) {
            return false;
        }

        public boolean d(@o0 CharSequence charSequence, int i7) {
            return false;
        }

        public void e() {
            this.f4073a.t();
        }

        public CharSequence f(@o0 CharSequence charSequence, @g0(from = 0) int i7, @g0(from = 0) int i8, @g0(from = 0) int i9, boolean z6) {
            return charSequence;
        }

        public void g(@o0 EditorInfo editorInfo) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final i f4074a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4075b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4076c;
        @q0

        /* renamed from: d  reason: collision with root package name */
        public int[] f4077d;
        @q0

        /* renamed from: e  reason: collision with root package name */
        public Set<AbstractC0045f> f4078e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4079f;

        /* renamed from: g  reason: collision with root package name */
        public int f4080g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        public int f4081h = 0;
        @o0

        /* renamed from: i  reason: collision with root package name */
        public e f4082i = new androidx.emoji2.text.e();

        public d(@o0 i iVar) {
            g1.s.m(iVar, "metadataLoader cannot be null.");
            this.f4074a = iVar;
        }

        @o0
        public final i a() {
            return this.f4074a;
        }

        @o0
        public d b(@o0 AbstractC0045f abstractC0045f) {
            g1.s.m(abstractC0045f, "initCallback cannot be null");
            if (this.f4078e == null) {
                this.f4078e = new androidx.collection.c();
            }
            this.f4078e.add(abstractC0045f);
            return this;
        }

        @o0
        public d c(@d.l int i7) {
            this.f4080g = i7;
            return this;
        }

        @o0
        public d d(boolean z6) {
            this.f4079f = z6;
            return this;
        }

        @o0
        public d e(@o0 e eVar) {
            g1.s.m(eVar, "GlyphChecker cannot be null");
            this.f4082i = eVar;
            return this;
        }

        @o0
        public d f(int i7) {
            this.f4081h = i7;
            return this;
        }

        @o0
        public d g(boolean z6) {
            this.f4075b = z6;
            return this;
        }

        @o0
        public d h(boolean z6) {
            return i(z6, null);
        }

        @o0
        public d i(boolean z6, @q0 List<Integer> list) {
            this.f4076c = z6;
            if (!z6 || list == null) {
                this.f4077d = null;
            } else {
                this.f4077d = new int[list.size()];
                Iterator<Integer> it = list.iterator();
                int i7 = 0;
                while (it.hasNext()) {
                    this.f4077d[i7] = it.next().intValue();
                    i7++;
                }
                Arrays.sort(this.f4077d);
            }
            return this;
        }

        @o0
        public d j(@o0 AbstractC0045f abstractC0045f) {
            g1.s.m(abstractC0045f, "initCallback cannot be null");
            Set<AbstractC0045f> set = this.f4078e;
            if (set != null) {
                set.remove(abstractC0045f);
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(@o0 CharSequence charSequence, @g0(from = 0) int i7, @g0(from = 0) int i8, @g0(from = 0) int i9);
    }

    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0045f {
        public void a(@q0 Throwable th) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class g implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final List<AbstractC0045f> f4083k;

        /* renamed from: l  reason: collision with root package name */
        public final Throwable f4084l;

        /* renamed from: m  reason: collision with root package name */
        public final int f4085m;

        public g(@o0 AbstractC0045f abstractC0045f, int i7) {
            this(Arrays.asList((AbstractC0045f) g1.s.m(abstractC0045f, "initCallback cannot be null")), i7, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4083k.size();
            int i7 = 0;
            if (this.f4085m != 1) {
                while (i7 < size) {
                    this.f4083k.get(i7).a(this.f4084l);
                    i7++;
                }
                return;
            }
            while (i7 < size) {
                this.f4083k.get(i7).b();
                i7++;
            }
        }

        public g(@o0 Collection<AbstractC0045f> collection, int i7) {
            this(collection, i7, null);
        }

        public g(@o0 Collection<AbstractC0045f> collection, int i7, @q0 Throwable th) {
            g1.s.m(collection, "initCallbacks cannot be null");
            this.f4083k = new ArrayList(collection);
            this.f4085m = i7;
            this.f4084l = th;
        }
    }

    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface h {
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(@o0 j jVar);
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public abstract void a(@q0 Throwable th);

        public abstract void b(@o0 p pVar);
    }

    @b1({b1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface k {
    }

    @b1({b1.a.LIBRARY})
    @w0(19)
    /* loaded from: classes.dex */
    public static class l {
        public androidx.emoji2.text.k a(@o0 androidx.emoji2.text.i iVar) {
            return new r(iVar);
        }
    }

    public f(@o0 d dVar) {
        this.f4063g = dVar.f4075b;
        this.f4064h = dVar.f4076c;
        this.f4065i = dVar.f4077d;
        this.f4066j = dVar.f4079f;
        this.f4067k = dVar.f4080g;
        this.f4062f = dVar.f4074a;
        this.f4068l = dVar.f4081h;
        this.f4069m = dVar.f4082i;
        androidx.collection.c cVar = new androidx.collection.c();
        this.f4058b = cVar;
        Set<AbstractC0045f> set = dVar.f4078e;
        if (set != null && !set.isEmpty()) {
            cVar.addAll(dVar.f4078e);
        }
        this.f4061e = new b(this);
        r();
    }

    @b1({b1.a.TESTS})
    @q0
    public static f A(@q0 f fVar) {
        f fVar2;
        synchronized (C) {
            E = fVar;
            fVar2 = E;
        }
        return fVar2;
    }

    @b1({b1.a.TESTS})
    public static void B(boolean z6) {
        synchronized (D) {
            F = z6;
        }
    }

    @o0
    public static f b() {
        f fVar;
        synchronized (C) {
            fVar = E;
            g1.s.o(fVar != null, G);
        }
        return fVar;
    }

    public static boolean g(@o0 InputConnection inputConnection, @o0 Editable editable, @g0(from = 0) int i7, @g0(from = 0) int i8, boolean z6) {
        return androidx.emoji2.text.j.e(inputConnection, editable, i7, i8, z6);
    }

    public static boolean h(@o0 Editable editable, int i7, @o0 KeyEvent keyEvent) {
        return androidx.emoji2.text.j.f(editable, i7, keyEvent);
    }

    @q0
    public static f k(@o0 Context context) {
        return l(context, null);
    }

    @b1({b1.a.LIBRARY})
    @q0
    public static f l(@o0 Context context, @q0 d.a aVar) {
        f fVar;
        if (F) {
            return E;
        }
        if (aVar == null) {
            aVar = new d.a(null);
        }
        d c7 = aVar.c(context);
        synchronized (D) {
            if (!F) {
                if (c7 != null) {
                    m(c7);
                }
                F = true;
            }
            fVar = E;
        }
        return fVar;
    }

    @o0
    public static f m(@o0 d dVar) {
        f fVar = E;
        if (fVar == null) {
            synchronized (C) {
                fVar = E;
                if (fVar == null) {
                    fVar = new f(dVar);
                    E = fVar;
                }
            }
        }
        return fVar;
    }

    public static boolean n() {
        return E != null;
    }

    @o0
    public static f z(@o0 d dVar) {
        f fVar;
        synchronized (C) {
            fVar = new f(dVar);
            E = fVar;
        }
        return fVar;
    }

    public void C(@o0 AbstractC0045f abstractC0045f) {
        g1.s.m(abstractC0045f, "initCallback cannot be null");
        this.f4057a.writeLock().lock();
        try {
            this.f4058b.remove(abstractC0045f);
        } finally {
            this.f4057a.writeLock().unlock();
        }
    }

    public void D(@o0 EditorInfo editorInfo) {
        if (!p() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f4061e.g(editorInfo);
    }

    @o0
    public String c() {
        g1.s.o(p(), "Not initialized yet");
        return this.f4061e.a();
    }

    public int d(@o0 CharSequence charSequence, @g0(from = 0) int i7) {
        g1.s.o(p(), "Not initialized yet");
        g1.s.m(charSequence, "sequence cannot be null");
        return this.f4061e.b(charSequence, i7);
    }

    @b1({b1.a.LIBRARY_GROUP})
    @d.l
    public int e() {
        return this.f4067k;
    }

    public int f() {
        this.f4057a.readLock().lock();
        try {
            return this.f4059c;
        } finally {
            this.f4057a.readLock().unlock();
        }
    }

    @Deprecated
    public boolean i(@o0 CharSequence charSequence) {
        g1.s.o(p(), "Not initialized yet");
        g1.s.m(charSequence, "sequence cannot be null");
        return this.f4061e.c(charSequence);
    }

    @Deprecated
    public boolean j(@o0 CharSequence charSequence, @g0(from = 0) int i7) {
        g1.s.o(p(), "Not initialized yet");
        g1.s.m(charSequence, "sequence cannot be null");
        return this.f4061e.d(charSequence, i7);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean o() {
        return this.f4066j;
    }

    public final boolean p() {
        return f() == 1;
    }

    public void q() {
        g1.s.o(this.f4068l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (p()) {
            return;
        }
        this.f4057a.writeLock().lock();
        try {
            if (this.f4059c == 0) {
                return;
            }
            this.f4059c = 0;
            this.f4057a.writeLock().unlock();
            this.f4061e.e();
        } finally {
            this.f4057a.writeLock().unlock();
        }
    }

    public final void r() {
        this.f4057a.writeLock().lock();
        try {
            if (this.f4068l == 0) {
                this.f4059c = 0;
            }
            this.f4057a.writeLock().unlock();
            if (f() == 0) {
                this.f4061e.e();
            }
        } catch (Throwable th) {
            this.f4057a.writeLock().unlock();
            throw th;
        }
    }

    public void s(@q0 Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4057a.writeLock().lock();
        try {
            this.f4059c = 2;
            arrayList.addAll(this.f4058b);
            this.f4058b.clear();
            this.f4057a.writeLock().unlock();
            this.f4060d.post(new g(arrayList, this.f4059c, th));
        } catch (Throwable th2) {
            this.f4057a.writeLock().unlock();
            throw th2;
        }
    }

    public void t() {
        ArrayList arrayList = new ArrayList();
        this.f4057a.writeLock().lock();
        try {
            this.f4059c = 1;
            arrayList.addAll(this.f4058b);
            this.f4058b.clear();
            this.f4057a.writeLock().unlock();
            this.f4060d.post(new g(arrayList, this.f4059c));
        } catch (Throwable th) {
            this.f4057a.writeLock().unlock();
            throw th;
        }
    }

    @d.j
    @q0
    public CharSequence u(@q0 CharSequence charSequence) {
        return v(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @d.j
    @q0
    public CharSequence v(@q0 CharSequence charSequence, @g0(from = 0) int i7, @g0(from = 0) int i8) {
        return w(charSequence, i7, i8, Integer.MAX_VALUE);
    }

    @d.j
    @q0
    public CharSequence w(@q0 CharSequence charSequence, @g0(from = 0) int i7, @g0(from = 0) int i8, @g0(from = 0) int i9) {
        return x(charSequence, i7, i8, i9, 0);
    }

    @d.j
    @q0
    public CharSequence x(@q0 CharSequence charSequence, @g0(from = 0) int i7, @g0(from = 0) int i8, @g0(from = 0) int i9, int i10) {
        boolean z6;
        g1.s.o(p(), "Not initialized yet");
        g1.s.j(i7, "start cannot be negative");
        g1.s.j(i8, "end cannot be negative");
        g1.s.j(i9, "maxEmojiCount cannot be negative");
        g1.s.b(i7 <= i8, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        g1.s.b(i7 <= charSequence.length(), "start should be < than charSequence length");
        g1.s.b(i8 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i7 == i8) {
            return charSequence;
        }
        if (i10 != 1) {
            z6 = i10 != 2 ? this.f4063g : false;
        } else {
            z6 = true;
        }
        return this.f4061e.f(charSequence, i7, i8, i9, z6);
    }

    public void y(@o0 AbstractC0045f abstractC0045f) {
        g1.s.m(abstractC0045f, "initCallback cannot be null");
        this.f4057a.writeLock().lock();
        try {
            if (this.f4059c != 1 && this.f4059c != 2) {
                this.f4058b.add(abstractC0045f);
            }
            this.f4060d.post(new g(abstractC0045f, this.f4059c));
        } finally {
            this.f4057a.writeLock().unlock();
        }
    }
}