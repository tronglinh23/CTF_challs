package v2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import d.l0;
import s2.n;
import s2.o;
import u4.l1;
import u4.n0;
import u4.r1;
/* loaded from: classes.dex */
public final class c {

    @r1({"SMAP\nFragmentNavArgsLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt$navArgs$1\n*L\n1#1,45:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class a extends n0 implements t4.a<Bundle> {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Fragment f17750l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f17750l = fragment;
        }

        @Override // t4.a
        @n6.d
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final Bundle n() {
            Bundle arguments = this.f17750l.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f17750l + " has null arguments");
        }
    }

    @l0
    public static final /* synthetic */ <Args extends n> o<Args> a(Fragment fragment) {
        u4.l0.p(fragment, "<this>");
        u4.l0.y(4, "Args");
        return new o<>(l1.d(n.class), new a(fragment));
    }
}
