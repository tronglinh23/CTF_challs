package s2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import u4.l1;
import u4.r1;
/* loaded from: classes.dex */
public final class c {

    @r1({"SMAP\nActivityNavArgsLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavArgsLazy.kt\nandroidx/navigation/ActivityNavArgsLazyKt$navArgs$1\n*L\n1#1,47:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a extends u4.n0 implements t4.a<Bundle> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Activity f16264l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(0);
            this.f16264l = activity;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Bundle n() {
            Bundle bundle;
            Intent intent = this.f16264l.getIntent();
            if (intent != null) {
                Activity activity = this.f16264l;
                bundle = intent.getExtras();
                if (bundle == null) {
                    throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
                }
            } else {
                bundle = null;
            }
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException("Activity " + this.f16264l + " has a null Intent");
        }
    }

    @d.l0
    public static final /* synthetic */ <Args extends n> o<Args> a(Activity activity) {
        u4.l0.p(activity, "<this>");
        u4.l0.y(4, "Args");
        return new o<>(l1.d(n.class), new a(activity));
    }
}
