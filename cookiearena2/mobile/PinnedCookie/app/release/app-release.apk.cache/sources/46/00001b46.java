package u3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import u4.l0;

@t3.d
/* loaded from: classes.dex */
public final class u {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f17368a;
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f17369b;
    @n6.e

    /* renamed from: c  reason: collision with root package name */
    public final String f17370c;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(@n6.d android.content.ComponentName r18, @n6.d android.content.ComponentName r19, @n6.e java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.u.<init>(android.content.ComponentName, android.content.ComponentName, java.lang.String):void");
    }

    @n6.d
    public final ComponentName a() {
        return this.f17368a;
    }

    @n6.e
    public final String b() {
        return this.f17370c;
    }

    @n6.d
    public final ComponentName c() {
        return this.f17369b;
    }

    public final boolean d(@n6.d Activity activity, @n6.d Intent intent) {
        l0.p(activity, "primaryActivity");
        l0.p(intent, "secondaryActivityIntent");
        ComponentName componentName = activity.getComponentName();
        r rVar = r.f17356a;
        if (rVar.b(componentName, this.f17368a) && rVar.b(intent.getComponent(), this.f17369b)) {
            String str = this.f17370c;
            return str == null || l0.g(str, intent.getAction());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (d(r6, r7) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(@n6.d android.app.Activity r6, @n6.d android.app.Activity r7) {
        /*
            r5 = this;
            java.lang.String r0 = "primaryActivity"
            u4.l0.p(r6, r0)
            java.lang.String r0 = "secondaryActivity"
            u4.l0.p(r7, r0)
            u3.r r0 = u3.r.f17356a
            android.content.ComponentName r1 = r6.getComponentName()
            android.content.ComponentName r2 = r5.f17368a
            boolean r1 = r0.b(r1, r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L28
            android.content.ComponentName r1 = r7.getComponentName()
            android.content.ComponentName r4 = r5.f17369b
            boolean r0 = r0.b(r1, r4)
            if (r0 == 0) goto L28
            r0 = r2
            goto L29
        L28:
            r0 = r3
        L29:
            android.content.Intent r1 = r7.getIntent()
            if (r1 == 0) goto L43
            if (r0 == 0) goto L41
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r0 = "secondaryActivity.intent"
            u4.l0.o(r7, r0)
            boolean r6 = r5.d(r6, r7)
            if (r6 == 0) goto L41
            goto L42
        L41:
            r2 = r3
        L42:
            r0 = r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.u.e(android.app.Activity, android.app.Activity):boolean");
    }

    public boolean equals(@n6.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return l0.g(this.f17368a, uVar.f17368a) && l0.g(this.f17369b, uVar.f17369b) && l0.g(this.f17370c, uVar.f17370c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f17368a.hashCode() * 31) + this.f17369b.hashCode()) * 31;
        String str = this.f17370c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @n6.d
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.f17368a + ", secondaryActivityName=" + this.f17369b + ", secondaryActivityAction=" + ((Object) this.f17370c) + '}';
    }
}