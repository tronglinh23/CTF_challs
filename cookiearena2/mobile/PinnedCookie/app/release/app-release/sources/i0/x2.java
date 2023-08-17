package i0;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import d.b1;
/* loaded from: classes.dex */
public class x2 {

    /* renamed from: g  reason: collision with root package name */
    public static final String f10957g = "name";

    /* renamed from: h  reason: collision with root package name */
    public static final String f10958h = "icon";

    /* renamed from: i  reason: collision with root package name */
    public static final String f10959i = "uri";

    /* renamed from: j  reason: collision with root package name */
    public static final String f10960j = "key";

    /* renamed from: k  reason: collision with root package name */
    public static final String f10961k = "isBot";

    /* renamed from: l  reason: collision with root package name */
    public static final String f10962l = "isImportant";
    @d.q0

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f10963a;
    @d.q0

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f10964b;
    @d.q0

    /* renamed from: c  reason: collision with root package name */
    public String f10965c;
    @d.q0

    /* renamed from: d  reason: collision with root package name */
    public String f10966d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10967e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10968f;

    @d.w0(22)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        public static x2 a(PersistableBundle persistableBundle) {
            return new c().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString(x2.f10960j)).b(persistableBundle.getBoolean(x2.f10961k)).d(persistableBundle.getBoolean(x2.f10962l)).a();
        }

        @d.u
        public static PersistableBundle b(x2 x2Var) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = x2Var.f10963a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", x2Var.f10965c);
            persistableBundle.putString(x2.f10960j, x2Var.f10966d);
            persistableBundle.putBoolean(x2.f10961k, x2Var.f10967e);
            persistableBundle.putBoolean(x2.f10962l, x2Var.f10968f);
            return persistableBundle;
        }
    }

    @d.w0(28)
    /* loaded from: classes.dex */
    public static class b {
        @d.u
        public static x2 a(Person person) {
            CharSequence name;
            Icon icon;
            IconCompat iconCompat;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            c cVar = new c();
            name = person.getName();
            c f7 = cVar.f(name);
            icon = person.getIcon();
            if (icon != null) {
                icon2 = person.getIcon();
                iconCompat = IconCompat.g(icon2);
            } else {
                iconCompat = null;
            }
            c c7 = f7.c(iconCompat);
            uri = person.getUri();
            c g7 = c7.g(uri);
            key = person.getKey();
            c e7 = g7.e(key);
            isBot = person.isBot();
            c b7 = e7.b(isBot);
            isImportant = person.isImportant();
            return b7.d(isImportant).a();
        }

        @d.u
        public static Person b(x2 x2Var) {
            Person.Builder name;
            Person.Builder icon;
            Person.Builder uri;
            Person.Builder key;
            Person.Builder bot;
            Person.Builder important;
            Person build;
            d3.a();
            name = c3.a().setName(x2Var.f());
            icon = name.setIcon(x2Var.d() != null ? x2Var.d().F() : null);
            uri = icon.setUri(x2Var.g());
            key = uri.setKey(x2Var.e());
            bot = key.setBot(x2Var.h());
            important = bot.setImportant(x2Var.i());
            build = important.build();
            return build;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        @d.q0

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f10969a;
        @d.q0

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f10970b;
        @d.q0

        /* renamed from: c  reason: collision with root package name */
        public String f10971c;
        @d.q0

        /* renamed from: d  reason: collision with root package name */
        public String f10972d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10973e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10974f;

        public c() {
        }

        @d.o0
        public x2 a() {
            return new x2(this);
        }

        @d.o0
        public c b(boolean z6) {
            this.f10973e = z6;
            return this;
        }

        @d.o0
        public c c(@d.q0 IconCompat iconCompat) {
            this.f10970b = iconCompat;
            return this;
        }

        @d.o0
        public c d(boolean z6) {
            this.f10974f = z6;
            return this;
        }

        @d.o0
        public c e(@d.q0 String str) {
            this.f10972d = str;
            return this;
        }

        @d.o0
        public c f(@d.q0 CharSequence charSequence) {
            this.f10969a = charSequence;
            return this;
        }

        @d.o0
        public c g(@d.q0 String str) {
            this.f10971c = str;
            return this;
        }

        public c(x2 x2Var) {
            this.f10969a = x2Var.f10963a;
            this.f10970b = x2Var.f10964b;
            this.f10971c = x2Var.f10965c;
            this.f10972d = x2Var.f10966d;
            this.f10973e = x2Var.f10967e;
            this.f10974f = x2Var.f10968f;
        }
    }

    public x2(c cVar) {
        this.f10963a = cVar.f10969a;
        this.f10964b = cVar.f10970b;
        this.f10965c = cVar.f10971c;
        this.f10966d = cVar.f10972d;
        this.f10967e = cVar.f10973e;
        this.f10968f = cVar.f10974f;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.o0
    @d.w0(28)
    public static x2 a(@d.o0 Person person) {
        return b.a(person);
    }

    @d.o0
    public static x2 b(@d.o0 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new c().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.e(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString(f10960j)).b(bundle.getBoolean(f10961k)).d(bundle.getBoolean(f10962l)).a();
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.o0
    @d.w0(22)
    public static x2 c(@d.o0 PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    @d.q0
    public IconCompat d() {
        return this.f10964b;
    }

    @d.q0
    public String e() {
        return this.f10966d;
    }

    @d.q0
    public CharSequence f() {
        return this.f10963a;
    }

    @d.q0
    public String g() {
        return this.f10965c;
    }

    public boolean h() {
        return this.f10967e;
    }

    public boolean i() {
        return this.f10968f;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.o0
    public String j() {
        String str = this.f10965c;
        if (str != null) {
            return str;
        }
        if (this.f10963a != null) {
            return "name:" + ((Object) this.f10963a);
        }
        return "";
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.o0
    @d.w0(28)
    public Person k() {
        return b.b(this);
    }

    @d.o0
    public c l() {
        return new c(this);
    }

    @d.o0
    public Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f10963a);
        IconCompat iconCompat = this.f10964b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.E() : null);
        bundle.putString("uri", this.f10965c);
        bundle.putString(f10960j, this.f10966d);
        bundle.putBoolean(f10961k, this.f10967e);
        bundle.putBoolean(f10962l, this.f10968f);
        return bundle;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @d.o0
    @d.w0(22)
    public PersistableBundle n() {
        return a.b(this);
    }
}
