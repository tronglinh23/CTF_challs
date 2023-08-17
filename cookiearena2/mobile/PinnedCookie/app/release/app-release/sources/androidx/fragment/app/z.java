package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import x1.a;
/* loaded from: classes.dex */
public class z implements LayoutInflater.Factory2 {

    /* renamed from: c  reason: collision with root package name */
    public static final String f4587c = "FragmentManager";

    /* renamed from: b  reason: collision with root package name */
    public final FragmentManager f4588b;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q0 f4589b;

        public a(q0 q0Var) {
            this.f4589b = q0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k7 = this.f4589b.k();
            this.f4589b.m();
            f1.r((ViewGroup) k7.mView.getParent(), z.this.f4588b).n();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public z(FragmentManager fragmentManager) {
        this.f4588b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @d.q0
    public View onCreateView(@d.o0 String str, @d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @d.q0
    public View onCreateView(@d.q0 View view, @d.o0 String str, @d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        q0 D;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4588b);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d.f18267a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(a.d.f18268b);
            }
            int resourceId = obtainStyledAttributes.getResourceId(a.d.f18269c, -1);
            String string = obtainStyledAttributes.getString(a.d.f18270d);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !v.b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment r02 = resourceId != -1 ? this.f4588b.r0(resourceId) : null;
            if (r02 == null && string != null) {
                r02 = this.f4588b.s0(string);
            }
            if (r02 == null && id != -1) {
                r02 = this.f4588b.r0(id);
            }
            if (r02 == null) {
                r02 = this.f4588b.H0().a(context.getClassLoader(), attributeValue);
                r02.mFromLayout = true;
                r02.mFragmentId = resourceId != 0 ? resourceId : id;
                r02.mContainerId = id;
                r02.mTag = string;
                r02.mInLayout = true;
                FragmentManager fragmentManager = this.f4588b;
                r02.mFragmentManager = fragmentManager;
                r02.mHost = fragmentManager.K0();
                r02.onInflate(this.f4588b.K0().k(), attributeSet, r02.mSavedFragmentState);
                D = this.f4588b.n(r02);
                if (FragmentManager.X0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Fragment ");
                    sb.append(r02);
                    sb.append(" has been inflated via the <fragment> tag: id=0x");
                    sb.append(Integer.toHexString(resourceId));
                }
            } else if (!r02.mInLayout) {
                r02.mInLayout = true;
                FragmentManager fragmentManager2 = this.f4588b;
                r02.mFragmentManager = fragmentManager2;
                r02.mHost = fragmentManager2.K0();
                r02.onInflate(this.f4588b.K0().k(), attributeSet, r02.mSavedFragmentState);
                D = this.f4588b.D(r02);
                if (FragmentManager.X0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Retained Fragment ");
                    sb2.append(r02);
                    sb2.append(" has been re-attached via the <fragment> tag: id=0x");
                    sb2.append(Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            y1.d.j(r02, viewGroup);
            r02.mContainer = viewGroup;
            D.m();
            D.j();
            View view2 = r02.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (r02.mView.getTag() == null) {
                    r02.mView.setTag(string);
                }
                r02.mView.addOnAttachStateChangeListener(new a(D));
                return r02.mView;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }
}
