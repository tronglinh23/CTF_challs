package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.vectordrawable.graphics.drawable.b;
import d.o0;
import d.q0;
import d.v;
import d.w0;
import java.io.IOException;
import java.util.ArrayList;
import m0.p;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class c extends h implements androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: j  reason: collision with root package name */
    public static final String f6876j = "AnimatedVDCompat";

    /* renamed from: k  reason: collision with root package name */
    public static final String f6877k = "animated-vector";

    /* renamed from: l  reason: collision with root package name */
    public static final String f6878l = "target";

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f6879m = false;

    /* renamed from: c  reason: collision with root package name */
    public C0071c f6880c;

    /* renamed from: d  reason: collision with root package name */
    public Context f6881d;

    /* renamed from: e  reason: collision with root package name */
    public ArgbEvaluator f6882e;

    /* renamed from: f  reason: collision with root package name */
    public d f6883f;

    /* renamed from: g  reason: collision with root package name */
    public Animator.AnimatorListener f6884g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<b.a> f6885h;

    /* renamed from: i  reason: collision with root package name */
    public final Drawable.Callback f6886i;

    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            c.this.scheduleSelf(runnable, j7);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f6885h);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((b.a) arrayList.get(i7)).onAnimationEnd(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f6885h);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((b.a) arrayList.get(i7)).onAnimationStart(c.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0071c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f6889a;

        /* renamed from: b  reason: collision with root package name */
        public i f6890b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f6891c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f6892d;

        /* renamed from: e  reason: collision with root package name */
        public androidx.collection.a<Animator, String> f6893e;

        public C0071c(Context context, C0071c c0071c, Drawable.Callback callback, Resources resources) {
            if (c0071c != null) {
                this.f6889a = c0071c.f6889a;
                i iVar = c0071c.f6890b;
                if (iVar != null) {
                    Drawable.ConstantState constantState = iVar.getConstantState();
                    if (resources != null) {
                        this.f6890b = (i) constantState.newDrawable(resources);
                    } else {
                        this.f6890b = (i) constantState.newDrawable();
                    }
                    i iVar2 = (i) this.f6890b.mutate();
                    this.f6890b = iVar2;
                    iVar2.setCallback(callback);
                    this.f6890b.setBounds(c0071c.f6890b.getBounds());
                    this.f6890b.j(false);
                }
                ArrayList<Animator> arrayList = c0071c.f6892d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f6892d = new ArrayList<>(size);
                    this.f6893e = new androidx.collection.a<>(size);
                    for (int i7 = 0; i7 < size; i7++) {
                        Animator animator = c0071c.f6892d.get(i7);
                        Animator clone = animator.clone();
                        String str = c0071c.f6893e.get(animator);
                        clone.setTarget(this.f6890b.e(str));
                        this.f6892d.add(clone);
                        this.f6893e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f6891c == null) {
                this.f6891c = new AnimatorSet();
            }
            this.f6891c.playTogether(this.f6892d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6889a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public c() {
        this(null, null, null);
    }

    public static void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }

    @q0
    public static c b(@o0 Context context, @v int i7) {
        c cVar = new c(context);
        Drawable g7 = m0.i.g(context.getResources(), i7, context.getTheme());
        cVar.f6911b = g7;
        g7.setCallback(cVar.f6886i);
        cVar.f6883f = new d(cVar.f6911b.getConstantState());
        return cVar;
    }

    public static c c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    public static void d(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return;
        }
        e((AnimatedVectorDrawable) drawable, aVar);
    }

    @w0(23)
    public static void e(@o0 AnimatedVectorDrawable animatedVectorDrawable, @o0 b.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.getPlatformCallback());
    }

    public static boolean i(Drawable drawable, b.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return j((AnimatedVectorDrawable) drawable, aVar);
    }

    @w0(23)
    public static boolean j(AnimatedVectorDrawable animatedVectorDrawable, b.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.getPlatformCallback());
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            return q0.c.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        f();
        ArrayList<b.a> arrayList = this.f6885h;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f6880c.f6890b.draw(canvas);
        if (this.f6880c.f6891c.isStarted()) {
            invalidateSelf();
        }
    }

    public final void f() {
        Animator.AnimatorListener animatorListener = this.f6884g;
        if (animatorListener != null) {
            this.f6880c.f6891c.removeListener(animatorListener);
            this.f6884g = null;
        }
    }

    public final void g(String str, Animator animator) {
        animator.setTarget(this.f6880c.f6890b.e(str));
        C0071c c0071c = this.f6880c;
        if (c0071c.f6892d == null) {
            c0071c.f6892d = new ArrayList<>();
            this.f6880c.f6893e = new androidx.collection.a<>();
        }
        this.f6880c.f6892d.add(animator);
        this.f6880c.f6893e.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6911b;
        return drawable != null ? q0.c.d(drawable) : this.f6880c.f6890b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6880c.f6889a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6911b;
        return drawable != null ? q0.c.e(drawable) : this.f6880c.f6890b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6911b != null) {
            return new d(this.f6911b.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f6880c.f6890b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f6880c.f6890b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.getOpacity() : this.f6880c.f6890b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void h(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i7 = 0; i7 < childAnimations.size(); i7++) {
                h(childAnimations.get(i7));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f6882e == null) {
                    this.f6882e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f6882e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f6877k.equals(name)) {
                    TypedArray s6 = p.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.M);
                    int resourceId = s6.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i b7 = i.b(resources, resourceId, theme);
                        b7.j(false);
                        b7.setCallback(this.f6886i);
                        i iVar = this.f6880c.f6890b;
                        if (iVar != null) {
                            iVar.setCallback(null);
                        }
                        this.f6880c.f6890b = b7;
                    }
                    s6.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f6881d;
                        if (context != null) {
                            g(string, e.j(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f6880c.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6911b;
        return drawable != null ? q0.c.h(drawable) : this.f6880c.f6890b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f6911b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f6880c.f6891c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.isStateful() : this.f6880c.f6890b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f6880c.f6890b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.setLevel(i7) : this.f6880c.f6890b.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6911b;
        return drawable != null ? drawable.setState(iArr) : this.f6880c.f6890b.setState(iArr);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void registerAnimationCallback(@o0 b.a aVar) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            e((AnimatedVectorDrawable) drawable, aVar);
        } else if (aVar == null) {
        } else {
            if (this.f6885h == null) {
                this.f6885h = new ArrayList<>();
            }
            if (this.f6885h.contains(aVar)) {
                return;
            }
            this.f6885h.add(aVar);
            if (this.f6884g == null) {
                this.f6884g = new b();
            }
            this.f6880c.f6891c.addListener(this.f6884g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f6880c.f6890b.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.j(drawable, z6);
        } else {
            this.f6880c.f6890b.setAutoMirrored(z6);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z6) {
        super.setFilterBitmap(z6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTint(int i7) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.n(drawable, i7);
        } else {
            this.f6880c.f6890b.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.o(drawable, colorStateList);
        } else {
            this.f6880c.f6890b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, q0.n
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            q0.c.p(drawable, mode);
        } else {
            this.f6880c.f6890b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            return drawable.setVisible(z6, z7);
        }
        this.f6880c.f6890b.setVisible(z6, z7);
        return super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f6880c.f6891c.isStarted()) {
        } else {
            this.f6880c.f6891c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f6880c.f6891c.end();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean unregisterAnimationCallback(@o0 b.a aVar) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            j((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<b.a> arrayList = this.f6885h;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.f6885h.size() == 0) {
            f();
        }
        return remove;
    }

    public c(@q0 Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6911b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f6880c.f6890b.setColorFilter(colorFilter);
        }
    }

    @w0(24)
    /* loaded from: classes.dex */
    public static class d extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f6894a;

        public d(Drawable.ConstantState constantState) {
            this.f6894a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6894a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6894a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable newDrawable = this.f6894a.newDrawable();
            cVar.f6911b = newDrawable;
            newDrawable.setCallback(cVar.f6886i);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable newDrawable = this.f6894a.newDrawable(resources);
            cVar.f6911b = newDrawable;
            newDrawable.setCallback(cVar.f6886i);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable newDrawable = this.f6894a.newDrawable(resources, theme);
            cVar.f6911b = newDrawable;
            newDrawable.setCallback(cVar.f6886i);
            return cVar;
        }
    }

    public c(@q0 Context context, @q0 C0071c c0071c, @q0 Resources resources) {
        this.f6882e = null;
        this.f6884g = null;
        this.f6885h = null;
        a aVar = new a();
        this.f6886i = aVar;
        this.f6881d = context;
        if (c0071c != null) {
            this.f6880c = c0071c;
        } else {
            this.f6880c = new C0071c(context, c0071c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
