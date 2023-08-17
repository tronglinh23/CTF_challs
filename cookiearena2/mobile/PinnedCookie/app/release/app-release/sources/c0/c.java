package c0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.e;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public class c {
    public static void a(ViewGroup.LayoutParams param, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + str2 + "  " + param.getClass().getName());
        for (Field field : param.getClass().getFields()) {
            try {
                Object obj = field.get(param);
                String name = field.getName();
                if (name.contains("To") && !obj.toString().equals("-1")) {
                    System.out.println(str2 + e.f.f2422o + name + " " + obj);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }

    public static void b(ViewGroup layout, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + str + "  ";
        int childCount = layout.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = layout.getChildAt(i7);
            System.out.println(str2 + "     " + k(childAt));
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Field[] fields = layoutParams.getClass().getFields();
            for (int i8 = 0; i8 < fields.length; i8++) {
                Field field = fields[i8];
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To") && !obj.toString().equals("-1")) {
                        System.out.println(str2 + e.f.f2422o + field.getName() + " " + obj);
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static void c(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        System.out.println(str + "------------- " + cls.getName() + " --------------------");
        for (Field field : cls.getFields()) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint") && ((!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) && ((!(obj2 instanceof Integer) || !obj2.toString().equals("0")) && ((!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) && (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")))))) {
                    System.out.println(str + "    " + field.getName() + " " + obj2);
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(str + "------------- " + cls.getSimpleName() + " --------------------");
    }

    public static String d(MotionEvent event) {
        int action = event.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String e(int n7) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[n7 + 2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String f() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String g() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String h() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String i(Context context, int id) {
        if (id != -1) {
            try {
                return context.getResources().getResourceEntryName(id);
            } catch (Exception unused) {
                return "?" + id;
            }
        }
        return "UNKNOWN";
    }

    public static String j(Context context, int[] id) {
        String str;
        try {
            String str2 = id.length + "[";
            int i7 = 0;
            while (i7 < id.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(i7 == 0 ? "" : " ");
                String sb2 = sb.toString();
                try {
                    str = context.getResources().getResourceEntryName(id[i7]);
                } catch (Resources.NotFoundException unused) {
                    str = "? " + id[i7] + " ";
                }
                str2 = sb2 + str;
                i7++;
            }
            return str2 + "]";
        } catch (Exception e7) {
            e7.toString();
            return "UNKNOWN";
        }
    }

    public static String k(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static String l(s layout, int stateId) {
        return m(layout, stateId, -1);
    }

    public static String m(s layout, int stateId, int len) {
        int length;
        if (stateId == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = layout.getContext().getResources().getResourceEntryName(stateId);
        if (len != -1) {
            if (resourceEntryName.length() > len) {
                resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
            }
            if (resourceEntryName.length() <= len || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
                return resourceEntryName;
            }
            return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - len) / length).toString().replace((char) 0, '.') + "_", "_");
        }
        return resourceEntryName;
    }

    public static void n(String tag, String msg, int n7) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(n7, stackTrace.length - 1);
        String str = " ";
        for (int i7 = 1; i7 <= min; i7++) {
            StackTraceElement stackTraceElement = stackTrace[i7];
            String str2 = ".(" + stackTrace[i7].getFileName() + ":" + stackTrace[i7].getLineNumber() + ") " + stackTrace[i7].getMethodName();
            str = str + " ";
            StringBuilder sb = new StringBuilder();
            sb.append(msg);
            sb.append(str);
            sb.append(str2);
            sb.append(str);
        }
    }

    public static void o(String msg, int n7) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(n7, stackTrace.length - 1);
        String str = " ";
        for (int i7 = 1; i7 <= min; i7++) {
            StackTraceElement stackTraceElement = stackTrace[i7];
            String str2 = ".(" + stackTrace[i7].getFileName() + ":" + stackTrace[i7].getLineNumber() + ") ";
            str = str + " ";
            System.out.println(msg + str + str2 + str);
        }
    }
}
