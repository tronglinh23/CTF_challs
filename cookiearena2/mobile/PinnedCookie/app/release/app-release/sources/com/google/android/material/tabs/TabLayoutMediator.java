package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import d.o0;
import d.q0;
import java.lang.ref.WeakReference;
import r3.h;
/* loaded from: classes.dex */
public final class TabLayoutMediator {
    @q0
    private RecyclerView.g<?> adapter;
    private boolean attached;
    private final boolean autoRefresh;
    @q0
    private TabLayoutOnPageChangeCallback onPageChangeCallback;
    @q0
    private TabLayout.OnTabSelectedListener onTabSelectedListener;
    @q0
    private RecyclerView.i pagerAdapterObserver;
    private final boolean smoothScroll;
    private final TabConfigurationStrategy tabConfigurationStrategy;
    @o0
    private final TabLayout tabLayout;
    @o0
    private final h viewPager;

    /* loaded from: classes.dex */
    public class PagerAdapterObserver extends RecyclerView.i {
        public PagerAdapterObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i7, int i8) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int i7, int i8) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int i7, int i8, int i9) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int i7, int i8) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i7, int i8, @q0 Object obj) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }

    /* loaded from: classes.dex */
    public interface TabConfigurationStrategy {
        void onConfigureTab(@o0 TabLayout.Tab tab, int i7);
    }

    /* loaded from: classes.dex */
    public static class TabLayoutOnPageChangeCallback extends h.j {
        private int previousScrollState;
        private int scrollState;
        @o0
        private final WeakReference<TabLayout> tabLayoutRef;

        public TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
            this.tabLayoutRef = new WeakReference<>(tabLayout);
            reset();
        }

        @Override // r3.h.j
        public void onPageScrollStateChanged(int i7) {
            this.previousScrollState = this.scrollState;
            this.scrollState = i7;
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                tabLayout.updateViewPagerScrollState(this.scrollState);
            }
        }

        @Override // r3.h.j
        public void onPageScrolled(int i7, float f7, int i8) {
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout != null) {
                int i9 = this.scrollState;
                tabLayout.setScrollPosition(i7, f7, i9 != 2 || this.previousScrollState == 1, (i9 == 2 && this.previousScrollState == 0) ? false : true, false);
            }
        }

        @Override // r3.h.j
        public void onPageSelected(int i7) {
            TabLayout tabLayout = this.tabLayoutRef.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i7 || i7 >= tabLayout.getTabCount()) {
                return;
            }
            int i8 = this.scrollState;
            tabLayout.selectTab(tabLayout.getTabAt(i7), i8 == 0 || (i8 == 2 && this.previousScrollState == 0));
        }

        public void reset() {
            this.scrollState = 0;
            this.previousScrollState = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class ViewPagerOnTabSelectedListener implements TabLayout.OnTabSelectedListener {
        private final boolean smoothScroll;
        private final h viewPager;

        public ViewPagerOnTabSelectedListener(h hVar, boolean z6) {
            this.viewPager = hVar;
            this.smoothScroll = z6;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@o0 TabLayout.Tab tab) {
            this.viewPager.s(tab.getPosition(), this.smoothScroll);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public TabLayoutMediator(@o0 TabLayout tabLayout, @o0 h hVar, @o0 TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, hVar, true, tabConfigurationStrategy);
    }

    public void attach() {
        if (this.attached) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.g<?> adapter = this.viewPager.getAdapter();
        this.adapter = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.attached = true;
        TabLayoutOnPageChangeCallback tabLayoutOnPageChangeCallback = new TabLayoutOnPageChangeCallback(this.tabLayout);
        this.onPageChangeCallback = tabLayoutOnPageChangeCallback;
        this.viewPager.n(tabLayoutOnPageChangeCallback);
        ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(this.viewPager, this.smoothScroll);
        this.onTabSelectedListener = viewPagerOnTabSelectedListener;
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) viewPagerOnTabSelectedListener);
        if (this.autoRefresh) {
            PagerAdapterObserver pagerAdapterObserver = new PagerAdapterObserver();
            this.pagerAdapterObserver = pagerAdapterObserver;
            this.adapter.registerAdapterDataObserver(pagerAdapterObserver);
        }
        populateTabsFromPagerAdapter();
        this.tabLayout.setScrollPosition(this.viewPager.getCurrentItem(), 0.0f, true);
    }

    public void detach() {
        RecyclerView.g<?> gVar;
        if (this.autoRefresh && (gVar = this.adapter) != null) {
            gVar.unregisterAdapterDataObserver(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        this.viewPager.x(this.onPageChangeCallback);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    public void populateTabsFromPagerAdapter() {
        this.tabLayout.removeAllTabs();
        RecyclerView.g<?> gVar = this.adapter;
        if (gVar != null) {
            int itemCount = gVar.getItemCount();
            for (int i7 = 0; i7 < itemCount; i7++) {
                TabLayout.Tab newTab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(newTab, i7);
                this.tabLayout.addTab(newTab, false);
            }
            if (itemCount > 0) {
                int min = Math.min(this.viewPager.getCurrentItem(), this.tabLayout.getTabCount() - 1);
                if (min != this.tabLayout.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.tabLayout;
                    tabLayout.selectTab(tabLayout.getTabAt(min));
                }
            }
        }
    }

    public TabLayoutMediator(@o0 TabLayout tabLayout, @o0 h hVar, boolean z6, @o0 TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, hVar, z6, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(@o0 TabLayout tabLayout, @o0 h hVar, boolean z6, boolean z7, @o0 TabConfigurationStrategy tabConfigurationStrategy) {
        this.tabLayout = tabLayout;
        this.viewPager = hVar;
        this.autoRefresh = z6;
        this.smoothScroll = z7;
        this.tabConfigurationStrategy = tabConfigurationStrategy;
    }
}
