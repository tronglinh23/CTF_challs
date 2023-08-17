package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.u1;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import d.o0;
import d.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SearchBarAnimationHelper {
    private static final long COLLAPSE_DURATION_MS = 250;
    private static final long COLLAPSE_FADE_IN_CHILDREN_DURATION_MS = 100;
    private static final long EXPAND_DURATION_MS = 300;
    private static final long EXPAND_FADE_OUT_CHILDREN_DURATION_MS = 75;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS = 500;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS = 750;
    private static final long ON_LOAD_ANIM_SECONDARY_DURATION_MS = 250;
    private static final long ON_LOAD_ANIM_SECONDARY_START_DELAY_MS = 250;
    private boolean collapsing;
    @q0
    private Animator defaultCenterViewAnimator;
    private boolean expanding;
    @q0
    private Animator secondaryViewAnimator;
    private final Set<SearchBar.OnLoadAnimationCallback> onLoadAnimationCallbacks = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> expandAnimationListeners = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> collapseAnimationListeners = new LinkedHashSet();
    private boolean onLoadAnimationFadeInEnabled = true;
    private Animator runningExpandOrCollapseAnimator = null;

    /* loaded from: classes.dex */
    public interface OnLoadAnimationInvocation {
        void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnLoadAnimation(OnLoadAnimationInvocation onLoadAnimationInvocation) {
        Iterator<SearchBar.OnLoadAnimationCallback> it = this.onLoadAnimationCallbacks.iterator();
        while (it.hasNext()) {
            onLoadAnimationInvocation.invoke(it.next());
        }
    }

    private Animator getCollapseAnimator(final SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(250L).addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                searchBar.setVisibility(0);
                SearchBarAnimationHelper.this.collapsing = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                searchBar.stopOnLoadAnimation();
            }
        }).getCollapseAnimator();
    }

    private Animator getDefaultCenterViewAnimator(@q0 View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.onLoadAnimationFadeInEnabled ? 250L : 0L);
        ofFloat.setStartDelay(this.onLoadAnimationFadeInEnabled ? 500L : 0L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(250L);
        ofFloat2.setStartDelay(ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    private List<View> getEndAnchoredViews(View view) {
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if ((!isLayoutRtl && (childAt instanceof ActionMenuView)) || (isLayoutRtl && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    private Animator getExpandAnimator(final SearchBar searchBar, View view, @q0 AppBarLayout appBarLayout) {
        return getExpandCollapseAnimationHelper(searchBar, view, appBarLayout).setDuration(EXPAND_DURATION_MS).addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.this.expanding = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                searchBar.setVisibility(4);
            }
        }).getExpandAnimator();
    }

    private ExpandCollapseAnimationHelper getExpandCollapseAnimationHelper(SearchBar searchBar, View view, @q0 AppBarLayout appBarLayout) {
        return new ExpandCollapseAnimationHelper(searchBar, view).setAdditionalUpdateListener(getExpandedViewBackgroundUpdateListener(searchBar, view)).setCollapsedViewOffsetY(appBarLayout != null ? appBarLayout.getTop() : 0).addEndAnchoredViews(getEndAnchoredViews(view));
    }

    private ValueAnimator.AnimatorUpdateListener getExpandedViewBackgroundUpdateListener(SearchBar searchBar, final View view) {
        final MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        createWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        createWithElevationOverlay.setElevation(u1.R(searchBar));
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1(MaterialShapeDrawable.this, view, valueAnimator);
            }
        };
    }

    private List<View> getFadeChildren(SearchBar searchBar) {
        List<View> children = ViewUtils.getChildren(searchBar);
        if (searchBar.getCenterView() != null) {
            children.remove(searchBar.getCenterView());
        }
        return children;
    }

    private Animator getFadeInChildrenAnimator(SearchBar searchBar) {
        List<View> fadeChildren = getFadeChildren(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(fadeChildren));
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    private Animator getFadeOutChildrenAnimator(SearchBar searchBar, final View view) {
        List<View> fadeChildren = getFadeChildren(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(fadeChildren));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        ofFloat.setDuration(75L);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    private Animator getSecondaryActionMenuItemAnimator(@q0 View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    private Animator getSecondaryViewAnimator(TextView textView, @q0 View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(getTextViewAnimator(textView));
        if (view != null) {
            animatorSet.play(getSecondaryActionMenuItemAnimator(view));
        }
        return animatorSet;
    }

    private Animator getTextViewAnimator(TextView textView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(textView));
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getExpandedViewBackgroundUpdateListener$1(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        materialShapeDrawable.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
        u1.I1(view, materialShapeDrawable);
        view.setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startExpandAnimation$0(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z6) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(getFadeOutChildrenAnimator(searchBar, view), getExpandAnimator(searchBar, view, appBarLayout));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.this.runningExpandOrCollapseAnimator = null;
            }
        });
        Iterator<AnimatorListenerAdapter> it = this.expandAnimationListeners.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z6) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    public void addCollapseAnimationListener(@o0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.collapseAnimationListeners.add(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@o0 AnimatorListenerAdapter animatorListenerAdapter) {
        this.expandAnimationListeners.add(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        this.onLoadAnimationCallbacks.add(onLoadAnimationCallback);
    }

    public boolean isCollapsing() {
        return this.collapsing;
    }

    public boolean isExpanding() {
        return this.expanding;
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.onLoadAnimationFadeInEnabled;
    }

    public boolean removeCollapseAnimationListener(@o0 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.collapseAnimationListeners.remove(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@o0 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.expandAnimationListeners.remove(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.onLoadAnimationCallbacks.remove(onLoadAnimationCallback);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z6) {
        this.onLoadAnimationFadeInEnabled = z6;
    }

    public void startCollapseAnimation(SearchBar searchBar, View view, @q0 AppBarLayout appBarLayout, boolean z6) {
        Animator animator;
        if (isExpanding() && (animator = this.runningExpandOrCollapseAnimator) != null) {
            animator.cancel();
        }
        this.collapsing = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(getCollapseAnimator(searchBar, view, appBarLayout), getFadeInChildrenAnimator(searchBar));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                SearchBarAnimationHelper.this.runningExpandOrCollapseAnimator = null;
            }
        });
        Iterator<AnimatorListenerAdapter> it = this.collapseAnimationListeners.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z6) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    public void startExpandAnimation(final SearchBar searchBar, final View view, @q0 final AppBarLayout appBarLayout, final boolean z6) {
        Animator animator;
        if (isCollapsing() && (animator = this.runningExpandOrCollapseAnimator) != null) {
            animator.cancel();
        }
        this.expanding = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.c
            @Override // java.lang.Runnable
            public final void run() {
                SearchBarAnimationHelper.this.lambda$startExpandAnimation$0(searchBar, view, appBarLayout, z6);
            }
        });
    }

    public void startOnLoadAnimation(SearchBar searchBar) {
        dispatchOnLoadAnimation(new OnLoadAnimationInvocation() { // from class: com.google.android.material.search.f
            @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
            public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                onLoadAnimationCallback.onAnimationStart();
            }
        });
        TextView textView = searchBar.getTextView();
        final View centerView = searchBar.getCenterView();
        View secondaryActionMenuItemView = ToolbarUtils.getSecondaryActionMenuItemView(searchBar);
        final Animator secondaryViewAnimator = getSecondaryViewAnimator(textView, secondaryActionMenuItemView);
        secondaryViewAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SearchBarAnimationHelper.this.dispatchOnLoadAnimation(new OnLoadAnimationInvocation() { // from class: com.google.android.material.search.h
                    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
                    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                        onLoadAnimationCallback.onAnimationEnd();
                    }
                });
            }
        });
        this.secondaryViewAnimator = secondaryViewAnimator;
        textView.setAlpha(0.0f);
        if (secondaryActionMenuItemView != null) {
            secondaryActionMenuItemView.setAlpha(0.0f);
        }
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).startAnimation(new AnimatableView.Listener() { // from class: com.google.android.material.search.g
                @Override // com.google.android.material.animation.AnimatableView.Listener
                public final void onAnimationEnd() {
                    secondaryViewAnimator.start();
                }
            });
        } else if (centerView == null) {
            secondaryViewAnimator.start();
        } else {
            centerView.setAlpha(0.0f);
            centerView.setVisibility(0);
            Animator defaultCenterViewAnimator = getDefaultCenterViewAnimator(centerView);
            this.defaultCenterViewAnimator = defaultCenterViewAnimator;
            defaultCenterViewAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.search.SearchBarAnimationHelper.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    centerView.setVisibility(8);
                    secondaryViewAnimator.start();
                }
            });
            defaultCenterViewAnimator.start();
        }
    }

    public void stopOnLoadAnimation(SearchBar searchBar) {
        Animator animator = this.secondaryViewAnimator;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.defaultCenterViewAnimator;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).stopAnimation();
        }
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }
}
