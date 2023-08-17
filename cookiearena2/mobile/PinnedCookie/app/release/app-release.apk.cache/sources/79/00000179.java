package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.b1;
import d.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g implements u0.a {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private j mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<j> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<n>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<j> mItems = new ArrayList<>();
    private ArrayList<j> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<j> mActionItems = new ArrayList<>();
    private ArrayList<j> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface a {
        boolean onMenuItemSelected(@o0 g gVar, @o0 MenuItem menuItem);

        void onMenuModeChange(@o0 g gVar);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface b {
        boolean a(j jVar);
    }

    public g(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        j(true);
    }

    public static int f(ArrayList<j> arrayList, int i7) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i7) {
                return size + 1;
            }
        }
        return 0;
    }

    public static int g(int i7) {
        int i8 = ((-65536) & i7) >> 16;
        if (i8 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i8 < iArr.length) {
                return (i7 & 65535) | (iArr[i8] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final j a(int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        return new j(this, i7, i8, i9, i10, charSequence, i11);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i7, i8, i9, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i7, int i8, int i9, CharSequence charSequence) {
        int g7 = g(i9);
        j a7 = a(i7, i8, i9, g7, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            a7.y(contextMenuInfo);
        }
        ArrayList<j> arrayList = this.mItems;
        arrayList.add(f(arrayList, g7), a7);
        onItemsChanged(true);
        return a7;
    }

    public void addMenuPresenter(n nVar) {
        addMenuPresenter(nVar, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(boolean z6) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<n>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.mPresenters.remove(next);
            } else {
                nVar.updateMenuView(z6);
            }
        }
        startDispatchingItemsChanged();
    }

    public final void c(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        Iterator<WeakReference<n>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.mPresenters.remove(next);
            } else {
                int id = nVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    nVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public void changeMenuMode() {
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        j jVar = this.mExpandedItem;
        if (jVar != null) {
            collapseItemActionView(jVar);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z6) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<n>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.mPresenters.remove(next);
            } else {
                nVar.onCloseMenu(this, z6);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(j jVar) {
        boolean z6 = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == jVar) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<n>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    z6 = nVar.collapseItemActionView(this, jVar);
                    if (z6) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z6) {
                this.mExpandedItem = null;
            }
        }
        return z6;
    }

    public final void d(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<n>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.mPresenters.remove(next);
            } else {
                int id = nVar.getId();
                if (id > 0 && (onSaveInstanceState = nVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id, onSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    public boolean dispatchMenuItemSelected(@o0 g gVar, @o0 MenuItem menuItem) {
        a aVar = this.mCallback;
        return aVar != null && aVar.onMenuItemSelected(gVar, menuItem);
    }

    public final boolean e(s sVar, n nVar) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean onSubMenuSelected = nVar != null ? nVar.onSubMenuSelected(sVar) : false;
        Iterator<WeakReference<n>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null) {
                this.mPresenters.remove(next);
            } else if (!onSubMenuSelected) {
                onSubMenuSelected = nVar2.onSubMenuSelected(sVar);
            }
        }
        return onSubMenuSelected;
    }

    public boolean expandItemActionView(j jVar) {
        boolean z6 = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<n>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar = next.get();
            if (nVar == null) {
                this.mPresenters.remove(next);
            } else {
                z6 = nVar.expandItemActionView(this, jVar);
                if (z6) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z6) {
            this.mExpandedItem = jVar;
        }
        return z6;
    }

    public int findGroupIndex(int i7) {
        return findGroupIndex(i7, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i7) {
        MenuItem findItem;
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = this.mItems.get(i8);
            if (jVar.getItemId() == i7) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.getSubMenu().findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.mItems.get(i8).getItemId() == i7) {
                return i8;
            }
        }
        return -1;
    }

    public j findItemWithShortcutForKey(int i7, KeyEvent keyEvent) {
        ArrayList<j> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = arrayList.get(i8);
            char alphabeticShortcut = isQwertyMode ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (isQwertyMode && alphabeticShortcut == '\b' && i7 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<j> list, int i7, KeyEvent keyEvent) {
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            int size = this.mItems.size();
            for (int i8 = 0; i8 < size; i8++) {
                j jVar = this.mItems.get(i8);
                if (jVar.hasSubMenu()) {
                    ((g) jVar.getSubMenu()).findItemsWithShortcutForKey(list, i7, keyEvent);
                }
                char alphabeticShortcut = isQwertyMode ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & u0.a.f17313e) == ((isQwertyMode ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & u0.a.f17313e)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (isQwertyMode && alphabeticShortcut == '\b' && i7 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<j> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            Iterator<WeakReference<n>> it = this.mPresenters.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                WeakReference<n> next = it.next();
                n nVar = next.get();
                if (nVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    z6 |= nVar.flagActionItems();
                }
            }
            if (z6) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i7 = 0; i7 < size; i7++) {
                    j jVar = visibleItems.get(i7);
                    if (jVar.o()) {
                        this.mActionItems.add(jVar);
                    } else {
                        this.mNonActionItems.add(jVar);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<j> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public j getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i7) {
        return this.mItems.get(i7);
    }

    public ArrayList<j> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public g getRootMenu() {
        return this;
    }

    @o0
    public ArrayList<j> getVisibleItems() {
        if (this.mIsVisibleItemsStale) {
            this.mVisibleItems.clear();
            int size = this.mItems.size();
            for (int i7 = 0; i7 < size; i7++) {
                j jVar = this.mItems.get(i7);
                if (jVar.isVisible()) {
                    this.mVisibleItems.add(jVar);
                }
            }
            this.mIsVisibleItemsStale = false;
            this.mIsActionItemsStale = true;
            return this.mVisibleItems;
        }
        return this.mVisibleItems;
    }

    public final void h(int i7, boolean z6) {
        if (i7 < 0 || i7 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i7);
        if (z6) {
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.mItems.get(i7).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i7 > 0) {
                this.mHeaderTitle = resources.getText(i7);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i8 > 0) {
                this.mHeaderIcon = k0.d.i(getContext(), i8);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i7, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (androidx.core.view.q2.g(android.view.ViewConfiguration.get(r2.mContext), r2.mContext) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.mResources
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.mContext
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.mContext
            boolean r3 = androidx.core.view.q2.g(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.mShortcutsVisible = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.j(boolean):void");
    }

    public void onItemActionRequestChanged(j jVar) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(j jVar) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z6) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z6) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z6) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        b(z6);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i7, int i8) {
        return performItemAction(findItem(i7), i8);
    }

    public boolean performItemAction(MenuItem menuItem, int i7) {
        return performItemAction(menuItem, null, i7);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        j findItemWithShortcutForKey = findItemWithShortcutForKey(i7, keyEvent);
        boolean performItemAction = findItemWithShortcutForKey != null ? performItemAction(findItemWithShortcutForKey, i8) : false;
        if ((i8 & 2) != 0) {
            close(true);
        }
        return performItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i7) {
        int findGroupIndex = findGroupIndex(i7);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= size || this.mItems.get(findGroupIndex).getGroupId() != i7) {
                    break;
                }
                h(findGroupIndex, false);
                i8 = i9;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i7) {
        h(findItemIndex(i7), true);
    }

    public void removeItemAt(int i7) {
        h(i7, true);
    }

    public void removeMenuPresenter(n nVar) {
        Iterator<WeakReference<n>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<n> next = it.next();
            n nVar2 = next.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.mPresenters.remove(next);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i8 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i8 <= 0 || (findItem = findItem(i8)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        c(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((s) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        d(bundle);
    }

    public void setCallback(a aVar) {
        this.mCallback = aVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public g setDefaultShowAsAction(int i7) {
        this.mDefaultShowAsAction = i7;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i7 = 0; i7 < size; i7++) {
            j jVar = this.mItems.get(i7);
            if (jVar.getGroupId() == groupId && jVar.p() && jVar.isCheckable()) {
                jVar.v(jVar == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i7, boolean z6, boolean z7) {
        int size = this.mItems.size();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = this.mItems.get(i8);
            if (jVar.getGroupId() == i7) {
                jVar.w(z7);
                jVar.setCheckable(z6);
            }
        }
    }

    @Override // u0.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.mGroupDividerEnabled = z6;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i7, boolean z6) {
        int size = this.mItems.size();
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = this.mItems.get(i8);
            if (jVar.getGroupId() == i7) {
                jVar.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i7, boolean z6) {
        int size = this.mItems.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            j jVar = this.mItems.get(i8);
            if (jVar.getGroupId() == i7 && jVar.B(z6)) {
                z7 = true;
            }
        }
        if (z7) {
            onItemsChanged(true);
        }
    }

    public g setHeaderIconInt(Drawable drawable) {
        i(0, null, 0, drawable, null);
        return this;
    }

    public g setHeaderTitleInt(CharSequence charSequence) {
        i(0, charSequence, 0, null, null);
        return this;
    }

    public g setHeaderViewInt(View view) {
        i(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z6) {
        this.mOptionalIconsVisible = z6;
    }

    public void setOverrideVisibleItems(boolean z6) {
        this.mOverrideVisibleItems = z6;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.mQwertyMode = z6;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z6) {
        if (this.mShortcutsVisible == z6) {
            return;
        }
        j(z6);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7) {
        return addInternal(0, 0, 0, this.mResources.getString(i7));
    }

    public void addMenuPresenter(n nVar, Context context) {
        this.mPresenters.add(new WeakReference<>(nVar));
        nVar.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i7));
    }

    public int findGroupIndex(int i7, int i8) {
        int size = size();
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < size) {
            if (this.mItems.get(i8).getGroupId() == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public boolean performItemAction(MenuItem menuItem, n nVar, int i7) {
        j jVar = (j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean n7 = jVar.n();
        androidx.core.view.b b7 = jVar.b();
        boolean z6 = b7 != null && b7.b();
        if (jVar.m()) {
            n7 |= jVar.expandActionView();
            if (n7) {
                close(true);
            }
        } else if (jVar.hasSubMenu() || z6) {
            if ((i7 & 4) == 0) {
                close(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.A(new s(getContext(), this, jVar));
            }
            s sVar = (s) jVar.getSubMenu();
            if (z6) {
                b7.g(sVar);
            }
            n7 |= e(sVar, nVar);
            if (!n7) {
                close(true);
            }
        } else if ((i7 & 1) == 0) {
            close(true);
        }
        return n7;
    }

    public g setHeaderIconInt(int i7) {
        i(0, null, i7, null, null);
        return this;
    }

    public g setHeaderTitleInt(int i7) {
        i(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return addInternal(i7, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        j jVar = (j) addInternal(i7, i8, i9, charSequence);
        s sVar = new s(this.mContext, this, jVar);
        jVar.A(sVar);
        return sVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return addInternal(i7, i8, i9, this.mResources.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.mResources.getString(i10));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}