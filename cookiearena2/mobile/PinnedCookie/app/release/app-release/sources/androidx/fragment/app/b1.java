package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
/* loaded from: classes.dex */
public class b1 extends Fragment {

    /* renamed from: m  reason: collision with root package name */
    public static final int f4316m = 16711681;

    /* renamed from: n  reason: collision with root package name */
    public static final int f4317n = 16711682;

    /* renamed from: o  reason: collision with root package name */
    public static final int f4318o = 16711683;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4319b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f4320c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final AdapterView.OnItemClickListener f4321d = new b();

    /* renamed from: e  reason: collision with root package name */
    public ListAdapter f4322e;

    /* renamed from: f  reason: collision with root package name */
    public ListView f4323f;

    /* renamed from: g  reason: collision with root package name */
    public View f4324g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f4325h;

    /* renamed from: i  reason: collision with root package name */
    public View f4326i;

    /* renamed from: j  reason: collision with root package name */
    public View f4327j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f4328k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4329l;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = b1.this.f4323f;
            listView.focusableViewAvailable(listView);
        }
    }

    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            b1.this.p((ListView) adapterView, view, i7, j7);
        }
    }

    public final void k() {
        if (this.f4323f != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f4323f = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(f4316m);
            this.f4325h = textView;
            if (textView == null) {
                this.f4324g = view.findViewById(16908292);
            } else {
                textView.setVisibility(8);
            }
            this.f4326i = view.findViewById(f4317n);
            this.f4327j = view.findViewById(f4318o);
            View findViewById = view.findViewById(16908298);
            if (!(findViewById instanceof ListView)) {
                if (findViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) findViewById;
            this.f4323f = listView;
            View view2 = this.f4324g;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f4328k;
                if (charSequence != null) {
                    this.f4325h.setText(charSequence);
                    this.f4323f.setEmptyView(this.f4325h);
                }
            }
        }
        this.f4329l = true;
        this.f4323f.setOnItemClickListener(this.f4321d);
        ListAdapter listAdapter = this.f4322e;
        if (listAdapter != null) {
            this.f4322e = null;
            s(listAdapter);
        } else if (this.f4326i != null) {
            u(false, false);
        }
        this.f4319b.post(this.f4320c);
    }

    @d.q0
    public ListAdapter l() {
        return this.f4322e;
    }

    @d.o0
    public ListView m() {
        k();
        return this.f4323f;
    }

    public long n() {
        k();
        return this.f4323f.getSelectedItemId();
    }

    public int o() {
        k();
        return this.f4323f.getSelectedItemPosition();
    }

    @Override // androidx.fragment.app.Fragment
    @d.q0
    public View onCreateView(@d.o0 LayoutInflater layoutInflater, @d.q0 ViewGroup viewGroup, @d.q0 Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(f4317n);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(f4318o);
        TextView textView = new TextView(requireContext);
        textView.setId(f4316m);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f4319b.removeCallbacks(this.f4320c);
        this.f4323f = null;
        this.f4329l = false;
        this.f4327j = null;
        this.f4326i = null;
        this.f4324g = null;
        this.f4325h = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@d.o0 View view, @d.q0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        k();
    }

    public void p(@d.o0 ListView listView, @d.o0 View view, int i7, long j7) {
    }

    @d.o0
    public final ListAdapter q() {
        ListAdapter l7 = l();
        if (l7 != null) {
            return l7;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void r(@d.q0 CharSequence charSequence) {
        k();
        TextView textView = this.f4325h;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f4328k == null) {
            this.f4323f.setEmptyView(this.f4325h);
        }
        this.f4328k = charSequence;
    }

    public void s(@d.q0 ListAdapter listAdapter) {
        boolean z6 = this.f4322e != null;
        this.f4322e = listAdapter;
        ListView listView = this.f4323f;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f4329l || z6) {
                return;
            }
            u(true, requireView().getWindowToken() != null);
        }
    }

    public void t(boolean z6) {
        u(z6, true);
    }

    public final void u(boolean z6, boolean z7) {
        k();
        View view = this.f4326i;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f4329l == z6) {
            return;
        }
        this.f4329l = z6;
        if (z6) {
            if (z7) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                this.f4327j.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            } else {
                view.clearAnimation();
                this.f4327j.clearAnimation();
            }
            this.f4326i.setVisibility(8);
            this.f4327j.setVisibility(0);
            return;
        }
        if (z7) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            this.f4327j.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
        } else {
            view.clearAnimation();
            this.f4327j.clearAnimation();
        }
        this.f4326i.setVisibility(0);
        this.f4327j.setVisibility(8);
    }

    public void v(boolean z6) {
        u(z6, false);
    }

    public void w(int i7) {
        k();
        this.f4323f.setSelection(i7);
    }
}
