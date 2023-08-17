package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import d.b1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import u.v;
/* loaded from: classes.dex */
public abstract class j0 implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<r0> mEndValuesList;
    private f mEpicenterCallback;
    private androidx.collection.a<String, String> mNameOverrides;
    n0 mPropagation;
    private ArrayList<r0> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final z STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private s0 mStartValues = new s0();
    private s0 mEndValues = new s0();
    o0 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<h> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private z mPathMotion = STRAIGHT_PATH_MOTION;

    /* loaded from: classes.dex */
    public class a extends z {
        @Override // androidx.transition.z
        public Path getPath(float f7, float f8, float f9, float f10) {
            Path path = new Path();
            path.moveTo(f7, f8);
            path.lineTo(f9, f10);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.collection.a f6639a;

        public b(androidx.collection.a aVar) {
            this.f6639a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6639a.remove(animator);
            j0.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            j0.this.mCurrentAnimators.add(animator);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j0.this.end();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public View f6642a;

        /* renamed from: b  reason: collision with root package name */
        public String f6643b;

        /* renamed from: c  reason: collision with root package name */
        public r0 f6644c;

        /* renamed from: d  reason: collision with root package name */
        public w1 f6645d;

        /* renamed from: e  reason: collision with root package name */
        public j0 f6646e;

        public d(View view, String str, j0 j0Var, w1 w1Var, r0 r0Var) {
            this.f6642a = view;
            this.f6643b = str;
            this.f6644c = r0Var;
            this.f6645d = w1Var;
            this.f6646e = j0Var;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static <T> ArrayList<T> a(ArrayList<T> arrayList, T t6) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t6)) {
                arrayList.add(t6);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> b(ArrayList<T> arrayList, T t6) {
            if (arrayList != null) {
                arrayList.remove(t6);
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract Rect a(@d.o0 j0 j0Var);
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* loaded from: classes.dex */
    public interface h {
        void onTransitionCancel(@d.o0 j0 j0Var);

        void onTransitionEnd(@d.o0 j0 j0Var);

        void onTransitionPause(@d.o0 j0 j0Var);

        void onTransitionResume(@d.o0 j0 j0Var);

        void onTransitionStart(@d.o0 j0 j0Var);
    }

    public j0() {
    }

    public static void g(s0 s0Var, View view, r0 r0Var) {
        s0Var.f6774a.put(view, r0Var);
        int id = view.getId();
        if (id >= 0) {
            if (s0Var.f6775b.indexOfKey(id) >= 0) {
                s0Var.f6775b.put(id, null);
            } else {
                s0Var.f6775b.put(id, view);
            }
        }
        String x02 = androidx.core.view.u1.x0(view);
        if (x02 != null) {
            if (s0Var.f6777d.containsKey(x02)) {
                s0Var.f6777d.put(x02, null);
            } else {
                s0Var.f6777d.put(x02, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (s0Var.f6776c.q(itemIdAtPosition) < 0) {
                    androidx.core.view.u1.Q1(view, true);
                    s0Var.f6776c.u(itemIdAtPosition, view);
                    return;
                }
                View o6 = s0Var.f6776c.o(itemIdAtPosition);
                if (o6 != null) {
                    androidx.core.view.u1.Q1(o6, false);
                    s0Var.f6776c.u(itemIdAtPosition, null);
                }
            }
        }
    }

    public static boolean j(int[] iArr, int i7) {
        int i8 = iArr[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            if (iArr[i9] == i8) {
                return true;
            }
        }
        return false;
    }

    public static <T> ArrayList<T> m(ArrayList<T> arrayList, T t6, boolean z6) {
        return t6 != null ? z6 ? e.a(arrayList, t6) : e.b(arrayList, t6) : arrayList;
    }

    public static androidx.collection.a<Animator, d> p() {
        androidx.collection.a<Animator, d> aVar = sRunningAnimators.get();
        if (aVar == null) {
            androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
            sRunningAnimators.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static boolean q(int i7) {
        return i7 >= 1 && i7 <= 4;
    }

    public static boolean r(r0 r0Var, r0 r0Var2, String str) {
        Object obj = r0Var.f6756a.get(str);
        Object obj2 = r0Var2.f6756a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static int[] x(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i7 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (MATCH_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i7] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i7] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i7] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i7] = 4;
            } else if (!trim.isEmpty()) {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            } else {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i7);
                i7--;
                iArr = iArr2;
            }
            i7++;
        }
        return iArr;
    }

    @d.o0
    public j0 addListener(@d.o0 h hVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(hVar);
        return this;
    }

    @d.o0
    public j0 addTarget(@d.o0 View view) {
        this.mTargets.add(view);
        return this;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<h> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((h) arrayList2.get(i7)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(@d.o0 r0 r0Var);

    public void capturePropagationValues(r0 r0Var) {
        String[] b7;
        if (this.mPropagation == null || r0Var.f6756a.isEmpty() || (b7 = this.mPropagation.b()) == null) {
            return;
        }
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= b7.length) {
                z6 = true;
                break;
            } else if (!r0Var.f6756a.containsKey(b7[i7])) {
                break;
            } else {
                i7++;
            }
        }
        if (z6) {
            return;
        }
        this.mPropagation.a(r0Var);
    }

    public abstract void captureStartValues(@d.o0 r0 r0Var);

    public void captureValues(ViewGroup viewGroup, boolean z6) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        clearValues(z6);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i7 = 0; i7 < this.mTargetIds.size(); i7++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i7).intValue());
                if (findViewById != null) {
                    r0 r0Var = new r0(findViewById);
                    if (z6) {
                        captureStartValues(r0Var);
                    } else {
                        captureEndValues(r0Var);
                    }
                    r0Var.f6758c.add(this);
                    capturePropagationValues(r0Var);
                    if (z6) {
                        g(this.mStartValues, findViewById, r0Var);
                    } else {
                        g(this.mEndValues, findViewById, r0Var);
                    }
                }
            }
            for (int i8 = 0; i8 < this.mTargets.size(); i8++) {
                View view = this.mTargets.get(i8);
                r0 r0Var2 = new r0(view);
                if (z6) {
                    captureStartValues(r0Var2);
                } else {
                    captureEndValues(r0Var2);
                }
                r0Var2.f6758c.add(this);
                capturePropagationValues(r0Var2);
                if (z6) {
                    g(this.mStartValues, view, r0Var2);
                } else {
                    g(this.mEndValues, view, r0Var2);
                }
            }
        } else {
            k(viewGroup, z6);
        }
        if (z6 || (aVar = this.mNameOverrides) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList3.add(this.mStartValues.f6777d.remove(this.mNameOverrides.k(i9)));
        }
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList3.get(i10);
            if (view2 != null) {
                this.mStartValues.f6777d.put(this.mNameOverrides.o(i10), view2);
            }
        }
    }

    public void clearValues(boolean z6) {
        if (z6) {
            this.mStartValues.f6774a.clear();
            this.mStartValues.f6775b.clear();
            this.mStartValues.f6776c.g();
            return;
        }
        this.mEndValues.f6774a.clear();
        this.mEndValues.f6775b.clear();
        this.mEndValues.f6776c.g();
    }

    @d.q0
    public Animator createAnimator(@d.o0 ViewGroup viewGroup, @d.q0 r0 r0Var, @d.q0 r0 r0Var2) {
        return null;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, s0 s0Var, s0 s0Var2, ArrayList<r0> arrayList, ArrayList<r0> arrayList2) {
        Animator createAnimator;
        int i7;
        View view;
        Animator animator;
        r0 r0Var;
        Animator animator2;
        r0 r0Var2;
        androidx.collection.a<Animator, d> p6 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j7 = Long.MAX_VALUE;
        int i8 = 0;
        while (i8 < size) {
            r0 r0Var3 = arrayList.get(i8);
            r0 r0Var4 = arrayList2.get(i8);
            if (r0Var3 != null && !r0Var3.f6758c.contains(this)) {
                r0Var3 = null;
            }
            if (r0Var4 != null && !r0Var4.f6758c.contains(this)) {
                r0Var4 = null;
            }
            if (r0Var3 != null || r0Var4 != null) {
                if ((r0Var3 == null || r0Var4 == null || isTransitionRequired(r0Var3, r0Var4)) && (createAnimator = createAnimator(viewGroup, r0Var3, r0Var4)) != null) {
                    if (r0Var4 != null) {
                        view = r0Var4.f6757b;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            r0Var2 = new r0(view);
                            i7 = size;
                            r0 r0Var5 = s0Var2.f6774a.get(view);
                            if (r0Var5 != null) {
                                int i9 = 0;
                                while (i9 < transitionProperties.length) {
                                    Map<String, Object> map = r0Var2.f6756a;
                                    String str = transitionProperties[i9];
                                    map.put(str, r0Var5.f6756a.get(str));
                                    i9++;
                                    transitionProperties = transitionProperties;
                                }
                            }
                            int size2 = p6.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size2) {
                                    animator2 = createAnimator;
                                    break;
                                }
                                d dVar = p6.get(p6.k(i10));
                                if (dVar.f6644c != null && dVar.f6642a == view && dVar.f6643b.equals(getName()) && dVar.f6644c.equals(r0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            i7 = size;
                            animator2 = createAnimator;
                            r0Var2 = null;
                        }
                        animator = animator2;
                        r0Var = r0Var2;
                    } else {
                        i7 = size;
                        view = r0Var3.f6757b;
                        animator = createAnimator;
                        r0Var = null;
                    }
                    if (animator != null) {
                        n0 n0Var = this.mPropagation;
                        if (n0Var != null) {
                            long c7 = n0Var.c(viewGroup, this, r0Var3, r0Var4);
                            sparseIntArray.put(this.mAnimators.size(), (int) c7);
                            j7 = Math.min(c7, j7);
                        }
                        p6.put(animator, new d(view, getName(), this, e1.d(viewGroup), r0Var));
                        this.mAnimators.add(animator);
                        j7 = j7;
                    }
                    i8++;
                    size = i7;
                }
            }
            i7 = size;
            i8++;
            size = i7;
        }
        if (sparseIntArray.size() != 0) {
            for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                Animator animator3 = this.mAnimators.get(sparseIntArray.keyAt(i11));
                animator3.setStartDelay((sparseIntArray.valueAt(i11) - j7) + animator3.getStartDelay());
            }
        }
    }

    public final void e(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2) {
        for (int i7 = 0; i7 < aVar.size(); i7++) {
            r0 o6 = aVar.o(i7);
            if (isValidTarget(o6.f6757b)) {
                this.mStartValuesList.add(o6);
                this.mEndValuesList.add(null);
            }
        }
        for (int i8 = 0; i8 < aVar2.size(); i8++) {
            r0 o7 = aVar2.o(i8);
            if (isValidTarget(o7.f6757b)) {
                this.mEndValuesList.add(o7);
                this.mStartValuesList.add(null);
            }
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i7 = this.mNumInstances - 1;
        this.mNumInstances = i7;
        if (i7 == 0) {
            ArrayList<h> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((h) arrayList2.get(i8)).onTransitionEnd(this);
                }
            }
            for (int i9 = 0; i9 < this.mStartValues.f6776c.D(); i9++) {
                View E = this.mStartValues.f6776c.E(i9);
                if (E != null) {
                    androidx.core.view.u1.Q1(E, false);
                }
            }
            for (int i10 = 0; i10 < this.mEndValues.f6776c.D(); i10++) {
                View E2 = this.mEndValues.f6776c.E(i10);
                if (E2 != null) {
                    androidx.core.view.u1.Q1(E2, false);
                }
            }
            this.mEnded = true;
        }
    }

    @d.o0
    public j0 excludeChildren(@d.o0 View view, boolean z6) {
        this.mTargetChildExcludes = o(this.mTargetChildExcludes, view, z6);
        return this;
    }

    @d.o0
    public j0 excludeTarget(@d.o0 View view, boolean z6) {
        this.mTargetExcludes = o(this.mTargetExcludes, view, z6);
        return this;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        androidx.collection.a<Animator, d> p6 = p();
        int size = p6.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        w1 d7 = e1.d(viewGroup);
        androidx.collection.a aVar = new androidx.collection.a(p6);
        p6.clear();
        for (int i7 = size - 1; i7 >= 0; i7--) {
            d dVar = (d) aVar.o(i7);
            if (dVar.f6642a != null && d7 != null && d7.equals(dVar.f6645d)) {
                ((Animator) aVar.k(i7)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    @d.q0
    public Rect getEpicenter() {
        f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @d.q0
    public f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @d.q0
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public r0 getMatchedTransitionValues(View view, boolean z6) {
        o0 o0Var = this.mParent;
        if (o0Var != null) {
            return o0Var.getMatchedTransitionValues(view, z6);
        }
        ArrayList<r0> arrayList = z6 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            r0 r0Var = arrayList.get(i7);
            if (r0Var == null) {
                return null;
            }
            if (r0Var.f6757b == view) {
                break;
            }
            i7++;
        }
        if (i7 >= 0) {
            return (z6 ? this.mEndValuesList : this.mStartValuesList).get(i7);
        }
        return null;
    }

    @d.o0
    public String getName() {
        return this.mName;
    }

    @d.o0
    public z getPathMotion() {
        return this.mPathMotion;
    }

    @d.q0
    public n0 getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @d.o0
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @d.q0
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @d.q0
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @d.o0
    public List<View> getTargets() {
        return this.mTargets;
    }

    @d.q0
    public String[] getTransitionProperties() {
        return null;
    }

    @d.q0
    public r0 getTransitionValues(@d.o0 View view, boolean z6) {
        o0 o0Var = this.mParent;
        if (o0Var != null) {
            return o0Var.getTransitionValues(view, z6);
        }
        return (z6 ? this.mStartValues : this.mEndValues).f6774a.get(view);
    }

    public boolean isTransitionRequired(@d.q0 r0 r0Var, @d.q0 r0 r0Var2) {
        if (r0Var == null || r0Var2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties == null) {
            Iterator<String> it = r0Var.f6756a.keySet().iterator();
            while (it.hasNext()) {
                if (r(r0Var, r0Var2, it.next())) {
                }
            }
            return false;
        }
        for (String str : transitionProperties) {
            if (!r(r0Var, r0Var2, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList4 = this.mTargetExcludes;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.mTargetTypeExcludes.get(i7).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.mTargetNameExcludes == null || androidx.core.view.u1.x0(view) == null || !this.mTargetNameExcludes.contains(androidx.core.view.u1.x0(view))) {
                    if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.mTargetNames;
                    if (arrayList6 == null || !arrayList6.contains(androidx.core.view.u1.x0(view))) {
                        if (this.mTargetTypes != null) {
                            for (int i8 = 0; i8 < this.mTargetTypes.size(); i8++) {
                                if (this.mTargetTypes.get(i8).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void k(View view, boolean z6) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.mTargetTypeExcludes.get(i7).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    r0 r0Var = new r0(view);
                    if (z6) {
                        captureStartValues(r0Var);
                    } else {
                        captureEndValues(r0Var);
                    }
                    r0Var.f6758c.add(this);
                    capturePropagationValues(r0Var);
                    if (z6) {
                        g(this.mStartValues, view, r0Var);
                    } else {
                        g(this.mEndValues, view, r0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    if (this.mTargetTypeChildExcludes.get(i8).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                                k(viewGroup.getChildAt(i9), z6);
                            }
                        }
                    }
                }
            }
        }
    }

    public final ArrayList<Integer> l(ArrayList<Integer> arrayList, int i7, boolean z6) {
        return i7 > 0 ? z6 ? e.a(arrayList, Integer.valueOf(i7)) : e.b(arrayList, Integer.valueOf(i7)) : arrayList;
    }

    public final ArrayList<Class<?>> n(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z6) {
        return cls != null ? z6 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    public final ArrayList<View> o(ArrayList<View> arrayList, View view, boolean z6) {
        return view != null ? z6 ? e.a(arrayList, view) : e.b(arrayList, view) : arrayList;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            androidx.transition.a.b(this.mCurrentAnimators.get(size));
        }
        ArrayList<h> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ((h) arrayList2.get(i7)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        d dVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        w(this.mStartValues, this.mEndValues);
        androidx.collection.a<Animator, d> p6 = p();
        int size = p6.size();
        w1 d7 = e1.d(viewGroup);
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator k7 = p6.k(i7);
            if (k7 != null && (dVar = p6.get(k7)) != null && dVar.f6642a != null && d7.equals(dVar.f6645d)) {
                r0 r0Var = dVar.f6644c;
                View view = dVar.f6642a;
                r0 transitionValues = getTransitionValues(view, true);
                r0 matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f6774a.get(view);
                }
                if (!(transitionValues == null && matchedTransitionValues == null) && dVar.f6646e.isTransitionRequired(r0Var, matchedTransitionValues)) {
                    if (k7.isRunning() || k7.isStarted()) {
                        k7.cancel();
                    } else {
                        p6.remove(k7);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    @d.o0
    public j0 removeListener(@d.o0 h hVar) {
        ArrayList<h> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    @d.o0
    public j0 removeTarget(@d.o0 View view) {
        this.mTargets.remove(view);
        return this;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    androidx.transition.a.c(this.mCurrentAnimators.get(size));
                }
                ArrayList<h> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ((h) arrayList2.get(i7)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        androidx.collection.a<Animator, d> p6 = p();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (p6.containsKey(next)) {
                start();
                y(next, p6);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public final void s(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            View valueAt = sparseArray.valueAt(i7);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i7))) != null && isValidTarget(view)) {
                r0 r0Var = aVar.get(valueAt);
                r0 r0Var2 = aVar2.get(view);
                if (r0Var != null && r0Var2 != null) {
                    this.mStartValuesList.add(r0Var);
                    this.mEndValuesList.add(r0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    public void setCanRemoveViews(boolean z6) {
        this.mCanRemoveViews = z6;
    }

    @d.o0
    public j0 setDuration(long j7) {
        this.mDuration = j7;
        return this;
    }

    public void setEpicenterCallback(@d.q0 f fVar) {
        this.mEpicenterCallback = fVar;
    }

    @d.o0
    public j0 setInterpolator(@d.q0 TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i7 = 0; i7 < iArr.length; i7++) {
            if (!q(iArr[i7])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (j(iArr, i7)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@d.q0 z zVar) {
        if (zVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = zVar;
        }
    }

    public void setPropagation(@d.q0 n0 n0Var) {
        this.mPropagation = n0Var;
    }

    @d.o0
    public j0 setStartDelay(long j7) {
        this.mStartDelay = j7;
        return this;
    }

    @d.b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<h> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((h) arrayList2.get(i7)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public final void t(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2) {
        r0 remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View k7 = aVar.k(size);
            if (k7 != null && isValidTarget(k7) && (remove = aVar2.remove(k7)) != null && isValidTarget(remove.f6757b)) {
                this.mStartValuesList.add(aVar.m(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    public String toString() {
        return toString("");
    }

    public final void u(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2, androidx.collection.h<View> hVar, androidx.collection.h<View> hVar2) {
        View o6;
        int D = hVar.D();
        for (int i7 = 0; i7 < D; i7++) {
            View E = hVar.E(i7);
            if (E != null && isValidTarget(E) && (o6 = hVar2.o(hVar.t(i7))) != null && isValidTarget(o6)) {
                r0 r0Var = aVar.get(E);
                r0 r0Var2 = aVar2.get(o6);
                if (r0Var != null && r0Var2 != null) {
                    this.mStartValuesList.add(r0Var);
                    this.mEndValuesList.add(r0Var2);
                    aVar.remove(E);
                    aVar2.remove(o6);
                }
            }
        }
    }

    public final void v(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i7 = 0; i7 < size; i7++) {
            View o6 = aVar3.o(i7);
            if (o6 != null && isValidTarget(o6) && (view = aVar4.get(aVar3.k(i7))) != null && isValidTarget(view)) {
                r0 r0Var = aVar.get(o6);
                r0 r0Var2 = aVar2.get(view);
                if (r0Var != null && r0Var2 != null) {
                    this.mStartValuesList.add(r0Var);
                    this.mEndValuesList.add(r0Var2);
                    aVar.remove(o6);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void w(s0 s0Var, s0 s0Var2) {
        androidx.collection.a<View, r0> aVar = new androidx.collection.a<>(s0Var.f6774a);
        androidx.collection.a<View, r0> aVar2 = new androidx.collection.a<>(s0Var2.f6774a);
        int i7 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i7 >= iArr.length) {
                e(aVar, aVar2);
                return;
            }
            int i8 = iArr[i7];
            if (i8 == 1) {
                t(aVar, aVar2);
            } else if (i8 == 2) {
                v(aVar, aVar2, s0Var.f6777d, s0Var2.f6777d);
            } else if (i8 == 3) {
                s(aVar, aVar2, s0Var.f6775b, s0Var2.f6775b);
            } else if (i8 == 4) {
                u(aVar, aVar2, s0Var.f6776c, s0Var2.f6776c);
            }
            i7++;
        }
    }

    public final void y(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            animate(animator);
        }
    }

    @d.o0
    public j0 addTarget(@d.d0 int i7) {
        if (i7 != 0) {
            this.mTargetIds.add(Integer.valueOf(i7));
        }
        return this;
    }

    @Override // 
    /* renamed from: clone  reason: merged with bridge method [inline-methods] */
    public j0 mo0clone() {
        try {
            j0 j0Var = (j0) super.clone();
            j0Var.mAnimators = new ArrayList<>();
            j0Var.mStartValues = new s0();
            j0Var.mEndValues = new s0();
            j0Var.mStartValuesList = null;
            j0Var.mEndValuesList = null;
            return j0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @d.o0
    public j0 excludeChildren(@d.d0 int i7, boolean z6) {
        this.mTargetIdChildExcludes = l(this.mTargetIdChildExcludes, i7, z6);
        return this;
    }

    @d.o0
    public j0 excludeTarget(@d.d0 int i7, boolean z6) {
        this.mTargetIdExcludes = l(this.mTargetIdExcludes, i7, z6);
        return this;
    }

    @d.o0
    public j0 removeTarget(@d.d0 int i7) {
        if (i7 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i7));
        }
        return this;
    }

    public String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.mTargetIds.size() > 0) {
                for (int i7 = 0; i7 < this.mTargetIds.size(); i7++) {
                    if (i7 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.mTargetIds.get(i7);
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i8 = 0; i8 < this.mTargets.size(); i8++) {
                    if (i8 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.mTargets.get(i8);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    @d.o0
    public j0 addTarget(@d.o0 String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @d.o0
    public j0 excludeChildren(@d.o0 Class<?> cls, boolean z6) {
        this.mTargetTypeChildExcludes = n(this.mTargetTypeChildExcludes, cls, z6);
        return this;
    }

    @d.o0
    public j0 excludeTarget(@d.o0 String str, boolean z6) {
        this.mTargetNameExcludes = m(this.mTargetNameExcludes, str, z6);
        return this;
    }

    @d.o0
    public j0 removeTarget(@d.o0 String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @d.o0
    public j0 excludeTarget(@d.o0 Class<?> cls, boolean z6) {
        this.mTargetTypeExcludes = n(this.mTargetTypeExcludes, cls, z6);
        return this;
    }

    @d.o0
    public j0 removeTarget(@d.o0 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @d.o0
    public j0 addTarget(@d.o0 Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public j0(@d.o0 Context context, @d.o0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f6603c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k7 = m0.p.k(obtainStyledAttributes, xmlResourceParser, v.h.f17253b, 1, -1);
        if (k7 >= 0) {
            setDuration(k7);
        }
        long k8 = m0.p.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k8 > 0) {
            setStartDelay(k8);
        }
        int l7 = m0.p.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l7 > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, l7));
        }
        String m7 = m0.p.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m7 != null) {
            setMatchOrder(x(m7));
        }
        obtainStyledAttributes.recycle();
    }
}
