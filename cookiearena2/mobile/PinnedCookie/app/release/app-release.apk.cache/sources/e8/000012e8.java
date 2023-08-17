package k0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.textclassifier.TextLinks;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k0.o;

/* loaded from: classes.dex */
public class o {

    /* renamed from: p */
    public static final String f11476p = "IntentSanitizer";

    /* renamed from: a */
    public int f11477a;

    /* renamed from: b */
    public g1.y<String> f11478b;

    /* renamed from: c */
    public g1.y<Uri> f11479c;

    /* renamed from: d */
    public g1.y<String> f11480d;

    /* renamed from: e */
    public g1.y<String> f11481e;

    /* renamed from: f */
    public g1.y<String> f11482f;

    /* renamed from: g */
    public g1.y<ComponentName> f11483g;

    /* renamed from: h */
    public boolean f11484h;

    /* renamed from: i */
    public Map<String, g1.y<Object>> f11485i;

    /* renamed from: j */
    public boolean f11486j;

    /* renamed from: k */
    public g1.y<Uri> f11487k;

    /* renamed from: l */
    public g1.y<ClipData> f11488l;

    /* renamed from: m */
    public boolean f11489m;

    /* renamed from: n */
    public boolean f11490n;

    /* renamed from: o */
    public boolean f11491o;

    @d.w0(15)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static Intent a(Intent intent) {
            return intent.getSelector();
        }

        @d.u
        public static void b(Intent intent, Intent intent2) {
            intent.setSelector(intent2);
        }
    }

    @d.w0(16)
    /* loaded from: classes.dex */
    public static class c {

        @d.w0(31)
        /* loaded from: classes.dex */
        public static class a {
            @d.u
            public static void a(int i7, ClipData.Item item, g1.e<String> eVar) {
                TextLinks textLinks;
                if (item.getHtmlText() == null && item.getIntent() == null) {
                    textLinks = item.getTextLinks();
                    if (textLinks == null) {
                        return;
                    }
                }
                eVar.accept("ClipData item at position " + i7 + " contains htmlText, textLinks or intent: " + item);
            }
        }

        public static void a(int i7, ClipData.Item item, g1.e<String> eVar) {
            if (item.getHtmlText() == null && item.getIntent() == null) {
                return;
            }
            eVar.accept("ClipData item at position " + i7 + " contains htmlText, textLinks or intent: " + item);
        }

        /* JADX WARN: Removed duplicated region for block: B:88:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00cd  */
        @d.u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(@d.o0 android.content.Intent r7, android.content.Intent r8, g1.y<android.content.ClipData> r9, boolean r10, g1.y<android.net.Uri> r11, g1.e<java.lang.String> r12) {
            /*
                android.content.ClipData r7 = r7.getClipData()
                if (r7 != 0) goto L7
                return
            L7:
                if (r9 == 0) goto L14
                boolean r9 = r9.test(r7)
                if (r9 == 0) goto L14
                r8.setClipData(r7)
                goto Lde
            L14:
                r9 = 0
                r0 = 0
                r1 = r9
            L17:
                int r2 = r7.getItemCount()
                if (r0 >= r2) goto Ld9
                android.content.ClipData$Item r2 = r7.getItemAt(r0)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L2b
                k0.o.c.a.a(r0, r2, r12)
                goto L2e
            L2b:
                a(r0, r2, r12)
            L2e:
                if (r10 == 0) goto L35
                java.lang.CharSequence r3 = r2.getText()
                goto L5c
            L35:
                java.lang.CharSequence r3 = r2.getText()
                if (r3 == 0) goto L5b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Item text cannot contain value. Item position: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = ". Text: "
                r3.append(r4)
                java.lang.CharSequence r4 = r2.getText()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r12.accept(r3)
            L5b:
                r3 = r9
            L5c:
                java.lang.String r4 = ". URI: "
                java.lang.String r5 = "Item URI is not allowed. Item position: "
                if (r11 != 0) goto L85
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto Lb2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
                goto Lb2
            L85:
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto Lb4
                android.net.Uri r6 = r2.getUri()
                boolean r6 = r11.test(r6)
                if (r6 == 0) goto L96
                goto Lb4
            L96:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
            Lb2:
                r2 = r9
                goto Lb8
            Lb4:
                android.net.Uri r2 = r2.getUri()
            Lb8:
                if (r3 != 0) goto Lbc
                if (r2 == 0) goto Ld5
            Lbc:
                if (r1 != 0) goto Lcd
                android.content.ClipData r1 = new android.content.ClipData
                android.content.ClipDescription r4 = r7.getDescription()
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                r5.<init>(r3, r9, r2)
                r1.<init>(r4, r5)
                goto Ld5
            Lcd:
                android.content.ClipData$Item r4 = new android.content.ClipData$Item
                r4.<init>(r3, r9, r2)
                r1.addItem(r4)
            Ld5:
                int r0 = r0 + 1
                goto L17
            Ld9:
                if (r1 == 0) goto Lde
                r8.setClipData(r1)
            Lde:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k0.o.c.b(android.content.Intent, android.content.Intent, g1.y, boolean, g1.y, g1.e):void");
        }
    }

    @d.w0(29)
    /* loaded from: classes.dex */
    public static class d {
        @d.u
        public static String a(Intent intent) {
            String identifier;
            identifier = intent.getIdentifier();
            return identifier;
        }

        @d.u
        public static Intent b(Intent intent, String str) {
            Intent identifier;
            identifier = intent.setIdentifier(str);
            return identifier;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: q */
        public static final int f11492q = 2112614400;

        /* renamed from: r */
        public static final int f11493r = 2015363072;

        /* renamed from: a */
        public int f11494a;

        /* renamed from: h */
        public boolean f11501h;

        /* renamed from: i */
        public boolean f11502i;

        /* renamed from: n */
        public boolean f11507n;

        /* renamed from: o */
        public boolean f11508o;

        /* renamed from: p */
        public boolean f11509p;

        /* renamed from: b */
        public g1.y<String> f11495b = new g1.y() { // from class: k0.d0
            @Override // g1.y
            public final boolean test(Object obj) {
                return o.e.e((String) obj);
            }
        };

        /* renamed from: c */
        public g1.y<Uri> f11496c = new g1.y() { // from class: k0.e0
            @Override // g1.y
            public final boolean test(Object obj) {
                return o.e.i((Uri) obj);
            }
        };

        /* renamed from: d */
        public g1.y<String> f11497d = new g1.y() { // from class: k0.f0
            @Override // g1.y
            public final boolean test(Object obj) {
                return o.e.a((String) obj);
            }
        };

        /* renamed from: e */
        public g1.y<String> f11498e = new g1.y() { // from class: k0.g0
            @Override // g1.y
            public final boolean test(Object obj) {
                return o.e.j((String) obj);
            }
        };

        /* renamed from: f */
        public g1.y<String> f11499f = new g1.y() { // from class: k0.h0
            @Override // g1.y
            public final boolean test(Object obj) {
                return o.e.h((String) obj);
            }
        };

        /* renamed from: g */
        public g1.y<ComponentName> f11500g = new g1.y() { // from class: k0.i0
            @Override // g1.y
            public final boolean test(Object obj) {
                return o.e.o((ComponentName) obj);
            }
        };

        /* renamed from: j */
        public Map<String, g1.y<Object>> f11503j = new HashMap();

        /* renamed from: k */
        public boolean f11504k = false;

        /* renamed from: l */
        public g1.y<Uri> f11505l = new g1.y() { // from class: k0.j0
            @Override // g1.y
            public final boolean test(Object obj) {
                return o.e.b((Uri) obj);
            }
        };

        /* renamed from: m */
        public g1.y<ClipData> f11506m = new g1.y() { // from class: k0.k0
            @Override // g1.y
            public final boolean test(Object obj) {
                return o.e.q((ClipData) obj);
            }
        };

        public static /* synthetic */ boolean X(ComponentName componentName) {
            return true;
        }

        public static /* synthetic */ boolean Y(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean Z(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        public static /* synthetic */ boolean a(String str) {
            return i0(str);
        }

        public static /* synthetic */ boolean a0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean b(Uri uri) {
            return m0(uri);
        }

        public static /* synthetic */ boolean b0(Object obj) {
            return true;
        }

        public static /* synthetic */ boolean c(String str, Uri uri) {
            return e0(str, uri);
        }

        public static /* synthetic */ boolean c0(Class cls, g1.y yVar, Object obj) {
            return cls.isInstance(obj) && yVar.test(cls.cast(obj));
        }

        public static /* synthetic */ boolean d(ComponentName componentName) {
            return X(componentName);
        }

        public static /* synthetic */ boolean d0(Object obj) {
            return false;
        }

        public static /* synthetic */ boolean e(String str) {
            return g0(str);
        }

        public static /* synthetic */ boolean e0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean f(Object obj) {
            return d0(obj);
        }

        public static /* synthetic */ boolean f0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        public static /* synthetic */ boolean g(String str, Uri uri) {
            return Y(str, uri);
        }

        public static /* synthetic */ boolean g0(String str) {
            return false;
        }

        public static /* synthetic */ boolean h(String str) {
            return k0(str);
        }

        public static /* synthetic */ boolean h0(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean i(Uri uri) {
            return h0(uri);
        }

        public static /* synthetic */ boolean i0(String str) {
            return false;
        }

        public static /* synthetic */ boolean j(String str) {
            return j0(str);
        }

        public static /* synthetic */ boolean j0(String str) {
            return false;
        }

        public static /* synthetic */ boolean k(String str, Uri uri) {
            return a0(str, uri);
        }

        public static /* synthetic */ boolean k0(String str) {
            return false;
        }

        public static /* synthetic */ boolean l(Object obj) {
            return b0(obj);
        }

        public static /* synthetic */ boolean l0(ComponentName componentName) {
            return false;
        }

        public static /* synthetic */ boolean m(String str, ComponentName componentName) {
            return Z(str, componentName);
        }

        public static /* synthetic */ boolean m0(Uri uri) {
            return false;
        }

        public static /* synthetic */ boolean n(String str, Uri uri) {
            return f0(str, uri);
        }

        public static /* synthetic */ boolean n0(ClipData clipData) {
            return false;
        }

        public static /* synthetic */ boolean o(ComponentName componentName) {
            return l0(componentName);
        }

        public static /* synthetic */ boolean p(Class cls, g1.y yVar, Object obj) {
            return c0(cls, yVar, obj);
        }

        public static /* synthetic */ boolean q(ClipData clipData) {
            return n0(clipData);
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e A(@d.o0 final ComponentName componentName) {
            g1.s.l(componentName);
            Objects.requireNonNull(componentName);
            return B(new g1.y() { // from class: k0.b0
                @Override // g1.y
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e B(@d.o0 g1.y<ComponentName> yVar) {
            g1.s.l(yVar);
            this.f11502i = true;
            this.f11500g = this.f11500g.g(yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e C(@d.o0 final String str) {
            g1.s.l(str);
            return B(new g1.y() { // from class: k0.y
                @Override // g1.y
                public final boolean test(Object obj) {
                    return o.e.m(str, (ComponentName) obj);
                }
            });
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e D(@d.o0 g1.y<Uri> yVar) {
            g1.s.l(yVar);
            this.f11496c = this.f11496c.g(yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e E(@d.o0 final String str) {
            g1.s.l(str);
            D(new g1.y() { // from class: k0.z
                @Override // g1.y
                public final boolean test(Object obj) {
                    return o.e.k(str, (Uri) obj);
                }
            });
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e F(@d.o0 String str, @d.o0 g1.y<Object> yVar) {
            g1.s.l(str);
            g1.s.l(yVar);
            g1.y<Object> yVar2 = this.f11503j.get(str);
            if (yVar2 == null) {
                yVar2 = new g1.y() { // from class: k0.s
                    @Override // g1.y
                    public final boolean test(Object obj) {
                        return o.e.f(obj);
                    }
                };
            }
            this.f11503j.put(str, yVar2.g(yVar));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e G(@d.o0 String str, @d.o0 Class<?> cls) {
            return H(str, cls, new g1.y() { // from class: k0.c0
                @Override // g1.y
                public final boolean test(Object obj) {
                    return o.e.l(obj);
                }
            });
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public <T> e H(@d.o0 String str, @d.o0 final Class<T> cls, @d.o0 final g1.y<T> yVar) {
            g1.s.l(str);
            g1.s.l(cls);
            g1.s.l(yVar);
            return F(str, new g1.y() { // from class: k0.x
                @Override // g1.y
                public final boolean test(Object obj) {
                    return o.e.p(cls, yVar, obj);
                }
            });
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e I(@d.o0 g1.y<Uri> yVar) {
            H("output", Uri.class, yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e J(@d.o0 final String str) {
            H("output", Uri.class, new g1.y() { // from class: k0.a0
                @Override // g1.y
                public final boolean test(Object obj) {
                    return o.e.c(str, (Uri) obj);
                }
            });
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e K(@d.o0 g1.y<Uri> yVar) {
            H("android.intent.extra.STREAM", Uri.class, yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e L(@d.o0 final String str) {
            g1.s.l(str);
            H("android.intent.extra.STREAM", Uri.class, new g1.y() { // from class: k0.v
                @Override // g1.y
                public final boolean test(Object obj) {
                    return o.e.n(str, (Uri) obj);
                }
            });
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e M(int i7) {
            this.f11494a = i7 | this.f11494a;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e N() {
            this.f11494a |= f11492q;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e O() {
            this.f11507n = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e P(@d.o0 g1.y<String> yVar) {
            g1.s.l(yVar);
            this.f11499f = this.f11499f.g(yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e Q(@d.o0 String str) {
            g1.s.l(str);
            Objects.requireNonNull(str);
            return P(new u(str));
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e R() {
            this.f11494a |= f11493r;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e S() {
            this.f11508o = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e T() {
            this.f11509p = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e U(@d.o0 g1.y<String> yVar) {
            g1.s.l(yVar);
            this.f11497d = this.f11497d.g(yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e V(@d.o0 String str) {
            g1.s.l(str);
            Objects.requireNonNull(str);
            return U(new u(str));
        }

        @SuppressLint({"SyntheticAccessor"})
        @d.o0
        public o W() {
            boolean z6 = this.f11501h;
            if (!(z6 && this.f11502i) && (z6 || this.f11502i)) {
                o oVar = new o();
                oVar.f11477a = this.f11494a;
                oVar.f11478b = this.f11495b;
                oVar.f11479c = this.f11496c;
                oVar.f11480d = this.f11497d;
                oVar.f11481e = this.f11498e;
                oVar.f11482f = this.f11499f;
                oVar.f11484h = this.f11501h;
                oVar.f11483g = this.f11500g;
                oVar.f11485i = this.f11503j;
                oVar.f11486j = this.f11504k;
                oVar.f11487k = this.f11505l;
                oVar.f11488l = this.f11506m;
                oVar.f11489m = this.f11507n;
                oVar.f11490n = this.f11508o;
                oVar.f11491o = this.f11509p;
                return oVar;
            }
            throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e r(@d.o0 g1.y<String> yVar) {
            g1.s.l(yVar);
            this.f11495b = this.f11495b.g(yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e s(@d.o0 String str) {
            g1.s.l(str);
            Objects.requireNonNull(str);
            r(new u(str));
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e t() {
            this.f11501h = true;
            this.f11500g = new g1.y() { // from class: k0.w
                @Override // g1.y
                public final boolean test(Object obj) {
                    return o.e.d((ComponentName) obj);
                }
            };
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e u(@d.o0 g1.y<String> yVar) {
            g1.s.l(yVar);
            this.f11498e = this.f11498e.g(yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e v(@d.o0 String str) {
            g1.s.l(str);
            Objects.requireNonNull(str);
            return u(new u(str));
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e w(@d.o0 g1.y<ClipData> yVar) {
            g1.s.l(yVar);
            this.f11506m = this.f11506m.g(yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e x() {
            this.f11504k = true;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e y(@d.o0 g1.y<Uri> yVar) {
            g1.s.l(yVar);
            this.f11505l = this.f11505l.g(yVar);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @d.o0
        public e z(@d.o0 final String str) {
            g1.s.l(str);
            return y(new g1.y() { // from class: k0.t
                @Override // g1.y
                public final boolean test(Object obj) {
                    return o.e.g(str, (Uri) obj);
                }
            });
        }
    }

    public static /* synthetic */ void a(String str) {
        s(str);
    }

    public static /* synthetic */ void b(String str) {
        r(str);
    }

    public static /* synthetic */ void r(String str) {
    }

    public static /* synthetic */ void s(String str) {
        throw new SecurityException(str);
    }

    public final void t(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
        } else if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            intent.putExtra(str, (Serializable) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @d.o0
    public Intent u(@d.o0 Intent intent, @d.o0 g1.e<String> eVar) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f11484h && component == null) || this.f11483g.test(component)) {
            intent2.setComponent(component);
        } else {
            eVar.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str == null || this.f11482f.test(str)) {
            intent2.setPackage(str);
        } else {
            eVar.accept("Package is not allowed: " + str);
        }
        int flags = this.f11477a | intent.getFlags();
        int i7 = this.f11477a;
        if (flags == i7) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i7);
            eVar.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f11477a)));
        }
        String action = intent.getAction();
        if (action == null || this.f11478b.test(action)) {
            intent2.setAction(action);
        } else {
            eVar.accept("Action is not allowed: " + action);
        }
        Uri data = intent.getData();
        if (data == null || this.f11479c.test(data)) {
            intent2.setData(data);
        } else {
            eVar.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.f11480d.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            eVar.accept("Type is not allowed: " + type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f11481e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    eVar.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f11477a & 1) == 0) {
                    eVar.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals("output") || ((~this.f11477a) & 3) == 0) {
                    Object obj = extras.get(str3);
                    g1.y<Object> yVar = this.f11485i.get(str3);
                    if (yVar == null || !yVar.test(obj)) {
                        eVar.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        t(intent2, str3, obj);
                    }
                } else {
                    eVar.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        c.b(intent, intent2, this.f11488l, this.f11486j, this.f11487k, eVar);
        if (i8 >= 29) {
            if (this.f11489m) {
                d.b(intent2, d.a(intent));
            } else if (d.a(intent) != null) {
                eVar.accept("Identifier is not allowed: " + d.a(intent));
            }
        }
        if (this.f11490n) {
            b.b(intent2, b.a(intent));
        } else if (b.a(intent) != null) {
            eVar.accept("Selector is not allowed: " + b.a(intent));
        }
        if (this.f11491o) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            eVar.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @d.o0
    public Intent v(@d.o0 Intent intent) {
        return u(intent, new g1.e() { // from class: k0.m
            @Override // g1.e
            public final void accept(Object obj) {
                o.b((String) obj);
            }
        });
    }

    @d.o0
    public Intent w(@d.o0 Intent intent) {
        return u(intent, new g1.e() { // from class: k0.n
            @Override // g1.e
            public final void accept(Object obj) {
                o.a((String) obj);
            }
        });
    }

    public o() {
    }
}