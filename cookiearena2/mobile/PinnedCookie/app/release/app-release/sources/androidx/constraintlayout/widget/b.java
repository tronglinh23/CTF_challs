package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.k;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: b  reason: collision with root package name */
    public int[] f2141b;

    /* renamed from: c  reason: collision with root package name */
    public int f2142c;

    /* renamed from: d  reason: collision with root package name */
    public Context f2143d;

    /* renamed from: e  reason: collision with root package name */
    public y.i f2144e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2145f;

    /* renamed from: g  reason: collision with root package name */
    public String f2146g;

    /* renamed from: h  reason: collision with root package name */
    public String f2147h;

    /* renamed from: i  reason: collision with root package name */
    public View[] f2148i;

    /* renamed from: j  reason: collision with root package name */
    public HashMap<Integer, String> f2149j;

    public b(Context context) {
        super(context);
        this.f2141b = new int[32];
        this.f2145f = false;
        this.f2148i = null;
        this.f2149j = new HashMap<>();
        this.f2143d = context;
        y(null);
    }

    public int A(View view) {
        int i7;
        int id = view.getId();
        int i8 = -1;
        if (id == -1) {
            return -1;
        }
        this.f2146g = null;
        int i9 = 0;
        while (true) {
            if (i9 >= this.f2142c) {
                break;
            } else if (this.f2141b[i9] == id) {
                int i10 = i9;
                while (true) {
                    i7 = this.f2142c;
                    if (i10 >= i7 - 1) {
                        break;
                    }
                    int[] iArr = this.f2141b;
                    int i11 = i10 + 1;
                    iArr[i10] = iArr[i11];
                    i10 = i11;
                }
                this.f2141b[i7 - 1] = 0;
                this.f2142c = i7 - 1;
                i8 = i9;
            } else {
                i9++;
            }
        }
        requestLayout();
        return i8;
    }

    public void B(y.e widget, boolean isRtl) {
    }

    public void C(ConstraintLayout container) {
    }

    public void D(ConstraintLayout container) {
    }

    public void E(ConstraintLayout container) {
    }

    public void F(ConstraintLayout container) {
    }

    public void G(ConstraintLayout container) {
        String str;
        int u6;
        if (isInEditMode()) {
            setIds(this.f2146g);
        }
        y.i iVar = this.f2144e;
        if (iVar == null) {
            return;
        }
        iVar.c();
        for (int i7 = 0; i7 < this.f2142c; i7++) {
            int i8 = this.f2141b[i7];
            View viewById = container.getViewById(i8);
            if (viewById == null && (u6 = u(container, (str = this.f2149j.get(Integer.valueOf(i8))))) != 0) {
                this.f2141b[i7] = u6;
                this.f2149j.put(Integer.valueOf(u6), str);
                viewById = container.getViewById(u6);
            }
            if (viewById != null) {
                this.f2144e.b(container.getViewWidget(viewById));
            }
        }
        this.f2144e.a(container.mLayoutWidget);
    }

    public void H(y.f container, y.i helper, SparseArray<y.e> map) {
        helper.c();
        for (int i7 = 0; i7 < this.f2142c; i7++) {
            helper.b(map.get(this.f2141b[i7]));
        }
    }

    public void I() {
        if (this.f2144e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f2073v0 = (y.e) this.f2144e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2141b, this.f2142c);
    }

    public final void l(String idString) {
        if (idString == null || idString.length() == 0 || this.f2143d == null) {
            return;
        }
        String trim = idString.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int v6 = v(trim);
        if (v6 != 0) {
            this.f2149j.put(Integer.valueOf(v6), trim);
            m(v6);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void m(int id) {
        if (id == getId()) {
            return;
        }
        int i7 = this.f2142c + 1;
        int[] iArr = this.f2141b;
        if (i7 > iArr.length) {
            this.f2141b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2141b;
        int i8 = this.f2142c;
        iArr2[i8] = id;
        this.f2142c = i8 + 1;
    }

    public final void n(String tagString) {
        if (tagString == null || tagString.length() == 0 || this.f2143d == null) {
            return;
        }
        String trim = tagString.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f2035c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m(childAt.getId());
                }
            }
        }
    }

    public void o(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else if (view.getParent() == null) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
        } else {
            this.f2146g = null;
            m(view.getId());
            requestLayout();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2146g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2147h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f2145f) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        q((ConstraintLayout) parent);
    }

    public void q(ConstraintLayout container) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i7 = 0; i7 < this.f2142c; i7++) {
            View viewById = container.getViewById(this.f2141b[i7]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void r(ConstraintLayout container) {
    }

    public boolean s(final int id) {
        for (int i7 : this.f2141b) {
            if (i7 == id) {
                return true;
            }
        }
        return false;
    }

    public void setIds(String idList) {
        this.f2146g = idList;
        if (idList == null) {
            return;
        }
        int i7 = 0;
        this.f2142c = 0;
        while (true) {
            int indexOf = idList.indexOf(44, i7);
            if (indexOf == -1) {
                l(idList.substring(i7));
                return;
            } else {
                l(idList.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String tagList) {
        this.f2147h = tagList;
        if (tagList == null) {
            return;
        }
        int i7 = 0;
        this.f2142c = 0;
        while (true) {
            int indexOf = tagList.indexOf(44, i7);
            if (indexOf == -1) {
                n(tagList.substring(i7));
                return;
            } else {
                n(tagList.substring(i7, indexOf));
                i7 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] ids) {
        this.f2146g = null;
        this.f2142c = 0;
        for (int i7 : ids) {
            m(i7);
        }
    }

    @Override // android.view.View
    public void setTag(int key, Object tag) {
        super.setTag(key, tag);
        if (tag == null && this.f2146g == null) {
            m(key);
        }
    }

    public final int[] t(View view, String referenceIdString) {
        String[] split = referenceIdString.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i7 = 0;
        for (String str : split) {
            int v6 = v(str.trim());
            if (v6 != 0) {
                iArr[i7] = v6;
                i7++;
            }
        }
        return i7 != split.length ? Arrays.copyOf(iArr, i7) : iArr;
    }

    public final int u(ConstraintLayout container, String idString) {
        Resources resources;
        String str;
        if (idString == null || container == null || (resources = this.f2143d.getResources()) == null) {
            return 0;
        }
        int childCount = container.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = container.getChildAt(i7);
            if (childAt.getId() != -1) {
                try {
                    str = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str = null;
                }
                if (idString.equals(str)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int v(String referenceId) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i7 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, referenceId);
            if (designInformation instanceof Integer) {
                i7 = ((Integer) designInformation).intValue();
            }
        }
        if (i7 == 0 && constraintLayout != null) {
            i7 = u(constraintLayout, referenceId);
        }
        if (i7 == 0) {
            try {
                i7 = k.g.class.getField(referenceId).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i7 == 0 ? this.f2143d.getResources().getIdentifier(referenceId, "id", this.f2143d.getPackageName()) : i7;
    }

    public View[] w(ConstraintLayout layout) {
        View[] viewArr = this.f2148i;
        if (viewArr == null || viewArr.length != this.f2142c) {
            this.f2148i = new View[this.f2142c];
        }
        for (int i7 = 0; i7 < this.f2142c; i7++) {
            this.f2148i[i7] = layout.getViewById(this.f2141b[i7]);
        }
        return this.f2148i;
    }

    public int x(final int id) {
        int i7 = -1;
        for (int i8 : this.f2141b) {
            i7++;
            if (i8 == id) {
                return i7;
            }
        }
        return i7;
    }

    public void y(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, k.m.x6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == k.m.h7) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2146g = string;
                    setIds(string);
                } else if (index == k.m.i7) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2147h = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void z(e.a constraint, y.j child, ConstraintLayout.b layoutParams, SparseArray<y.e> mapIdToWidget) {
        e.b bVar = constraint.f2267e;
        int[] iArr = bVar.f2343k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f2345l0;
            if (str != null) {
                if (str.length() > 0) {
                    e.b bVar2 = constraint.f2267e;
                    bVar2.f2343k0 = t(this, bVar2.f2345l0);
                } else {
                    constraint.f2267e.f2343k0 = null;
                }
            }
        }
        if (child == null) {
            return;
        }
        child.c();
        if (constraint.f2267e.f2343k0 == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            int[] iArr2 = constraint.f2267e.f2343k0;
            if (i7 >= iArr2.length) {
                return;
            }
            y.e eVar = mapIdToWidget.get(iArr2[i7]);
            if (eVar != null) {
                child.b(eVar);
            }
            i7++;
        }
    }

    public b(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2141b = new int[32];
        this.f2145f = false;
        this.f2148i = null;
        this.f2149j = new HashMap<>();
        this.f2143d = context;
        y(attrs);
    }

    public b(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2141b = new int[32];
        this.f2145f = false;
        this.f2148i = null;
        this.f2149j = new HashMap<>();
        this.f2143d = context;
        y(attrs);
    }
}
