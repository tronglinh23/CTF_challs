package s2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import d.b1;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import s2.d1;
import s2.g0;
import s2.j1;
import u4.r1;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u0010B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J0\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Ls2/d;", "Ls2/d1;", "Ls2/d$b;", p0.x0.f14590b, "", "k", "destination", "Landroid/os/Bundle;", "args", "Ls2/u0;", "navOptions", "Ls2/d1$a;", "navigatorExtras", "Ls2/g0;", "o", "Landroid/content/Context;", "c", "Landroid/content/Context;", "n", "()Landroid/content/Context;", "context", "Landroid/app/Activity;", androidx.appcompat.widget.d.f1513o, "Landroid/app/Activity;", "hostActivity", "<init>", "(Landroid/content/Context;)V", "e", "a", "b", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,530:1\n179#2,2:531\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n48#1:531,2\n*E\n"})
@d1.b(androidx.appcompat.widget.d.f1516r)
/* loaded from: classes.dex */
public class d extends d1<b> {
    @n6.d

    /* renamed from: e  reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    @n6.d

    /* renamed from: f  reason: collision with root package name */
    public static final String f16273f = "android-support-navigation:ActivityNavigator:source";
    @n6.d

    /* renamed from: g  reason: collision with root package name */
    public static final String f16274g = "android-support-navigation:ActivityNavigator:current";
    @n6.d

    /* renamed from: h  reason: collision with root package name */
    public static final String f16275h = "android-support-navigation:ActivityNavigator:popEnterAnim";
    @n6.d

    /* renamed from: i  reason: collision with root package name */
    public static final String f16276i = "android-support-navigation:ActivityNavigator:popExitAnim";
    @n6.d

    /* renamed from: j  reason: collision with root package name */
    public static final String f16277j = "ActivityNavigator";
    @n6.d

    /* renamed from: c  reason: collision with root package name and from kotlin metadata */
    public final Context context;
    @n6.e

    /* renamed from: d  reason: collision with root package name and from kotlin metadata */
    public final Activity hostActivity;

    /* renamed from: s2.d$a  reason: from kotlin metadata */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(u4.w wVar) {
            this();
        }

        @s4.m
        public final void a(@n6.d Activity activity) {
            u4.l0.p(activity, androidx.appcompat.widget.d.f1516r);
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(d.f16275h, -1);
            int intExtra2 = intent.getIntExtra(d.f16276i, -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }

        public Companion() {
        }
    }

    @g0.a(Activity.class)
    @r1({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,530:1\n232#2,3:531\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n270#1:531,3\n*E\n"})
    /* loaded from: classes.dex */
    public static class b extends g0 {
        @n6.e
        public Uri A;
        @n6.e

        /* renamed from: v  reason: collision with root package name */
        public Intent f16280v;
        @n6.e

        /* renamed from: w  reason: collision with root package name */
        public String f16281w;
        @n6.e

        /* renamed from: x  reason: collision with root package name */
        public String f16282x;
        @n6.e

        /* renamed from: y  reason: collision with root package name */
        public ComponentName f16283y;
        @n6.e

        /* renamed from: z  reason: collision with root package name */
        public String f16284z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@n6.d d1<? extends b> d1Var) {
            super(d1Var);
            u4.l0.p(d1Var, "activityNavigator");
        }

        @Override // s2.g0
        @d.i
        public void C(@n6.d Context context, @n6.d AttributeSet attributeSet) {
            u4.l0.p(context, "context");
            u4.l0.p(attributeSet, "attrs");
            super.C(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, j1.c.f16360a);
            u4.l0.o(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            a0(U(context, obtainAttributes.getString(j1.c.f16365f)));
            String string = obtainAttributes.getString(j1.c.f16361b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                W(new ComponentName(context, string));
            }
            V(obtainAttributes.getString(j1.c.f16362c));
            String U = U(context, obtainAttributes.getString(j1.c.f16363d));
            if (U != null) {
                X(Uri.parse(U));
            }
            Y(U(context, obtainAttributes.getString(j1.c.f16364e)));
            obtainAttributes.recycle();
        }

        @Override // s2.g0
        @d.b1({b1.a.LIBRARY_GROUP})
        public boolean N() {
            return false;
        }

        @n6.e
        public final String O() {
            Intent intent = this.f16280v;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @n6.e
        public final ComponentName P() {
            Intent intent = this.f16280v;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @n6.e
        public final Uri Q() {
            Intent intent = this.f16280v;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @n6.e
        public final String R() {
            return this.f16281w;
        }

        @n6.e
        public final Intent S() {
            return this.f16280v;
        }

        @n6.e
        public final String T() {
            Intent intent = this.f16280v;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        public final String U(Context context, String str) {
            if (str != null) {
                String packageName = context.getPackageName();
                u4.l0.o(packageName, "context.packageName");
                return i5.b0.l2(str, t0.f16452h, packageName, false, 4, null);
            }
            return null;
        }

        @n6.d
        public final b V(@n6.e String str) {
            if (this.f16280v == null) {
                this.f16280v = new Intent();
            }
            Intent intent = this.f16280v;
            u4.l0.m(intent);
            intent.setAction(str);
            return this;
        }

        @n6.d
        public final b W(@n6.e ComponentName componentName) {
            if (this.f16280v == null) {
                this.f16280v = new Intent();
            }
            Intent intent = this.f16280v;
            u4.l0.m(intent);
            intent.setComponent(componentName);
            return this;
        }

        @n6.d
        public final b X(@n6.e Uri uri) {
            if (this.f16280v == null) {
                this.f16280v = new Intent();
            }
            Intent intent = this.f16280v;
            u4.l0.m(intent);
            intent.setData(uri);
            return this;
        }

        @n6.d
        public final b Y(@n6.e String str) {
            this.f16281w = str;
            return this;
        }

        @n6.d
        public final b Z(@n6.e Intent intent) {
            this.f16280v = intent;
            return this;
        }

        @n6.d
        public final b a0(@n6.e String str) {
            if (this.f16280v == null) {
                this.f16280v = new Intent();
            }
            Intent intent = this.f16280v;
            u4.l0.m(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // s2.g0
        public boolean equals(@n6.e Object obj) {
            if (obj != null && (obj instanceof b) && super.equals(obj)) {
                Intent intent = this.f16280v;
                return (intent != null ? intent.filterEquals(((b) obj).f16280v) : ((b) obj).f16280v == null) && u4.l0.g(this.f16281w, ((b) obj).f16281w);
            }
            return false;
        }

        @Override // s2.g0
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.f16280v;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f16281w;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // s2.g0
        @n6.d
        public String toString() {
            ComponentName P = P();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (P != null) {
                sb.append(" class=");
                sb.append(P.getClassName());
            } else {
                String O = O();
                if (O != null) {
                    sb.append(" action=");
                    sb.append(O);
                }
            }
            String sb2 = sb.toString();
            u4.l0.o(sb2, "sb.toString()");
            return sb2;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@n6.d e1 e1Var) {
            this(e1Var.e(d.class));
            u4.l0.p(e1Var, "navigatorProvider");
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements d1.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f16285a;
        @n6.e

        /* renamed from: b  reason: collision with root package name */
        public final i0.i f16286b;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public int f16287a;
            @n6.e

            /* renamed from: b  reason: collision with root package name */
            public i0.i f16288b;

            @n6.d
            public final a a(int i7) {
                this.f16287a = i7 | this.f16287a;
                return this;
            }

            @n6.d
            public final c b() {
                return new c(this.f16287a, this.f16288b);
            }

            @n6.d
            public final a c(@n6.d i0.i iVar) {
                u4.l0.p(iVar, "activityOptions");
                this.f16288b = iVar;
                return this;
            }
        }

        public c(int i7, @n6.e i0.i iVar) {
            this.f16285a = i7;
            this.f16286b = iVar;
        }

        @n6.e
        public final i0.i a() {
            return this.f16286b;
        }

        public final int b() {
            return this.f16285a;
        }
    }

    /* renamed from: s2.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0241d extends u4.n0 implements t4.l<Context, Context> {

        /* renamed from: l  reason: collision with root package name */
        public static final C0241d f16289l = new C0241d();

        public C0241d() {
            super(1);
        }

        @Override // t4.l
        @n6.e
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Context O(@n6.d Context context) {
            u4.l0.p(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    public d(@n6.d Context context) {
        Object obj;
        u4.l0.p(context, "context");
        this.context = context;
        Iterator it = f5.s.l(context, C0241d.f16289l).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.hostActivity = (Activity) obj;
    }

    @s4.m
    public static final void l(@n6.d Activity activity) {
        INSTANCE.a(activity);
    }

    @Override // s2.d1
    public boolean k() {
        Activity activity = this.hostActivity;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }

    @Override // s2.d1
    @n6.d
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @d.b1({b1.a.LIBRARY_GROUP})
    @n6.d
    /* renamed from: n  reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Override // s2.d1
    @n6.e
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public g0 d(@n6.d b destination, @n6.e Bundle args, @n6.e u0 navOptions, @n6.e d1.a navigatorExtras) {
        Intent intent;
        int intExtra;
        u4.l0.p(destination, "destination");
        if (destination.S() == null) {
            throw new IllegalStateException(("Destination " + destination.r() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.S());
        if (args != null) {
            intent2.putExtras(args);
            String R = destination.R();
            if (!(R == null || R.length() == 0)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(R);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!args.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + args + " to fill data pattern " + R);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(args.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z6 = navigatorExtras instanceof c;
        if (z6) {
            intent2.addFlags(((c) navigatorExtras).b());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.i()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(f16274g, 0)) != 0) {
            intent2.putExtra(f16273f, intExtra);
        }
        intent2.putExtra(f16274g, destination.r());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int c7 = navOptions.c();
            int d7 = navOptions.d();
            if ((c7 <= 0 || !u4.l0.g(resources.getResourceTypeName(c7), "animator")) && (d7 <= 0 || !u4.l0.g(resources.getResourceTypeName(d7), "animator"))) {
                intent2.putExtra(f16275h, c7);
                intent2.putExtra(f16276i, d7);
            } else {
                Log.w(f16277j, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(c7) + " and popExit resource " + resources.getResourceName(d7) + " when launching " + destination);
            }
        }
        if (z6) {
            i0.i a7 = ((c) navigatorExtras).a();
            if (a7 != null) {
                k0.d.w(this.context, intent2, a7.l());
            } else {
                this.context.startActivity(intent2);
            }
        } else {
            this.context.startActivity(intent2);
        }
        if (navOptions == null || this.hostActivity == null) {
            return null;
        }
        int a8 = navOptions.a();
        int b7 = navOptions.b();
        if ((a8 <= 0 || !u4.l0.g(resources.getResourceTypeName(a8), "animator")) && (b7 <= 0 || !u4.l0.g(resources.getResourceTypeName(b7), "animator"))) {
            if (a8 >= 0 || b7 >= 0) {
                this.hostActivity.overridePendingTransition(d5.u.u(a8, 0), d5.u.u(b7, 0));
                return null;
            }
            return null;
        }
        Log.w(f16277j, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(a8) + " and exit resource " + resources.getResourceName(b7) + "when launching " + destination);
        return null;
    }
}