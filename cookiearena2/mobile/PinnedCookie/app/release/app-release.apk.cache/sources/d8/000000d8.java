package androidx.activity;

import androidx.lifecycle.z;
import u4.l0;
import v3.m2;

/* loaded from: classes.dex */
public final class s {

    /* loaded from: classes.dex */
    public static final class a extends k {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ t4.l<k, m2> f605d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z6, t4.l<? super k, m2> lVar) {
            super(z6);
            this.f605d = lVar;
        }

        @Override // androidx.activity.k
        public void e() {
            this.f605d.O(this);
        }
    }

    @n6.d
    public static final k a(@n6.d OnBackPressedDispatcher onBackPressedDispatcher, @n6.e z zVar, boolean z6, @n6.d t4.l<? super k, m2> lVar) {
        l0.p(onBackPressedDispatcher, "<this>");
        l0.p(lVar, "onBackPressed");
        a aVar = new a(z6, lVar);
        if (zVar != null) {
            onBackPressedDispatcher.c(zVar, aVar);
        } else {
            onBackPressedDispatcher.b(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ k b(OnBackPressedDispatcher onBackPressedDispatcher, z zVar, boolean z6, t4.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            zVar = null;
        }
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        return a(onBackPressedDispatcher, zVar, z6, lVar);
    }
}