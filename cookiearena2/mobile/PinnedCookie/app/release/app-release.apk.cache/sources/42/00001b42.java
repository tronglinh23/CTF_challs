package u3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import i5.b0;
import i5.c0;
import u4.l0;

@t3.d
/* loaded from: classes.dex */
public final class r {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final r f17356a = new r();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f17357b = false;
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final String f17358c = "SplitRuleResolution";

    public final boolean a(@n6.d Activity activity, @n6.d ComponentName componentName) {
        ComponentName component;
        l0.p(activity, androidx.appcompat.widget.d.f1516r);
        l0.p(componentName, "ruleComponent");
        if (b(activity.getComponentName(), componentName)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f17356a.b(component, componentName);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(@n6.e android.content.ComponentName r7, @n6.d android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            u4.l0.p(r8, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L22
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = u4.l0.g(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = u4.l0.g(r7, r0)
            if (r7 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            return r1
        L22:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            u4.l0.o(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = i5.c0.W2(r3, r0, r2, r4, r5)
            r0 = r0 ^ r1
            if (r0 == 0) goto L8f
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = u4.l0.g(r0, r3)
            if (r0 != 0) goto L5d
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            u4.l0.o(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            u4.l0.o(r3, r4)
            boolean r0 = r6.c(r0, r3)
            if (r0 == 0) goto L5b
            goto L5d
        L5b:
            r0 = r2
            goto L5e
        L5d:
            r0 = r1
        L5e:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = u4.l0.g(r3, r4)
            if (r3 != 0) goto L87
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            u4.l0.o(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            u4.l0.o(r8, r3)
            boolean r7 = r6.c(r7, r8)
            if (r7 == 0) goto L85
            goto L87
        L85:
            r7 = r2
            goto L88
        L87:
            r7 = r1
        L88:
            if (r0 == 0) goto L8d
            if (r7 == 0) goto L8d
            goto L8e
        L8d:
            r1 = r2
        L8e:
            return r1
        L8f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.r.b(android.content.ComponentName, android.content.ComponentName):boolean");
    }

    public final boolean c(String str, String str2) {
        if (c0.W2(str2, "*", false, 2, null)) {
            if (l0.g(str2, "*")) {
                return true;
            }
            if (c0.s3(str2, "*", 0, false, 6, null) == c0.G3(str2, "*", 0, false, 6, null) && b0.K1(str2, "*", false, 2, null)) {
                String substring = str2.substring(0, str2.length() - 1);
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return b0.v2(str, substring, false, 2, null);
            }
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        return false;
    }
}