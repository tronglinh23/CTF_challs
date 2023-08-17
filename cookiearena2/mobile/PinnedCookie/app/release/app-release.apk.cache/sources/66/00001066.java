package h1;

import android.os.Bundle;
import android.view.View;
import d.b1;

/* loaded from: classes.dex */
public interface q0 {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public Bundle f10247a;

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void a(@d.q0 Bundle bundle) {
            this.f10247a = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public boolean b() {
            return this.f10247a.getBoolean(f0.T);
        }

        public int c() {
            return this.f10247a.getInt(f0.R);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {
        @d.q0
        public String b() {
            return this.f10247a.getString(f0.S);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a {
        public int b() {
            return this.f10247a.getInt(f0.f10166a0);
        }

        public int c() {
            return this.f10247a.getInt(f0.f10167b0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends a {
        public int b() {
            return this.f10247a.getInt(f0.Y);
        }

        public int c() {
            return this.f10247a.getInt(f0.X);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends a {
        public float b() {
            return this.f10247a.getFloat(f0.Z);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends a {
        public int b() {
            return this.f10247a.getInt(f0.V);
        }

        public int c() {
            return this.f10247a.getInt(f0.U);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends a {
        @d.q0
        public CharSequence b() {
            return this.f10247a.getCharSequence(f0.W);
        }
    }

    boolean perform(@d.o0 View view, @d.q0 a aVar);
}