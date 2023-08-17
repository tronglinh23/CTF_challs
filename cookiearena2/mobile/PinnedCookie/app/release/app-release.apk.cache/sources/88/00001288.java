package j;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import d.b1;
import d.u;
import d.w0;
import java.util.List;

@b1({b1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class i implements Window.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f11376b;

    @w0(23)
    /* loaded from: classes.dex */
    public static class a {
        @u
        public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @u
        public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i7) {
            return callback.onWindowStartingActionMode(callback2, i7);
        }
    }

    @w0(24)
    /* loaded from: classes.dex */
    public static class b {
        @u
        public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i7) {
            callback.onProvideKeyboardShortcuts(list, menu, i7);
        }
    }

    @w0(26)
    /* loaded from: classes.dex */
    public static class c {
        @u
        public static void a(Window.Callback callback, boolean z6) {
            callback.onPointerCaptureChanged(z6);
        }
    }

    public i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f11376b = callback;
    }

    public final Window.Callback a() {
        return this.f11376b;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f11376b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f11376b.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f11376b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f11376b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f11376b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f11376b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f11376b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f11376b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f11376b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f11376b.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        return this.f11376b.onCreatePanelMenu(i7, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i7) {
        return this.f11376b.onCreatePanelView(i7);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f11376b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        return this.f11376b.onMenuItemSelected(i7, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return this.f11376b.onMenuOpened(i7, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        this.f11376b.onPanelClosed(i7, menu);
    }

    @Override // android.view.Window.Callback
    @w0(26)
    public void onPointerCaptureChanged(boolean z6) {
        c.a(this.f11376b, z6);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        return this.f11376b.onPreparePanel(i7, view, menu);
    }

    @Override // android.view.Window.Callback
    @w0(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i7) {
        b.a(this.f11376b, list, menu, i7);
    }

    @Override // android.view.Window.Callback
    @w0(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f11376b, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f11376b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        this.f11376b.onWindowFocusChanged(z6);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f11376b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f11376b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @w0(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
        return a.b(this.f11376b, callback, i7);
    }
}