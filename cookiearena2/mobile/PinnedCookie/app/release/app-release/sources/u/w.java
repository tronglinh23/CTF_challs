package u;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    public static a f17296a;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    public static int a(int i7) {
        int i8 = (i7 & (~(i7 >> 31))) - 255;
        return (i8 & (i8 >> 31)) + 255;
    }

    public static void c(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String substring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")" + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + substring;
        System.out.println(str2 + " " + str);
        a aVar = f17296a;
        if (aVar != null) {
            aVar.a(str2 + " " + str);
        }
    }

    public static void d(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void e(String str, int i7) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i7, stackTrace.length - 1);
        String str2 = " ";
        for (int i8 = 1; i8 <= min; i8++) {
            StackTraceElement stackTraceElement = stackTrace[i8];
            String str3 = ".(" + stackTrace[i8].getFileName() + ":" + stackTrace[i8].getLineNumber() + ") " + stackTrace[i8].getMethodName();
            str2 = str2 + " ";
            System.out.println(str + str2 + str3 + str2);
        }
    }

    public static void f(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int g(float f7, float f8, float f9, float f10) {
        int a7 = a((int) (f7 * 255.0f));
        int a8 = a((int) (f8 * 255.0f));
        return (a7 << 16) | (a((int) (f10 * 255.0f)) << 24) | (a8 << 8) | a((int) (f9 * 255.0f));
    }

    public static void h(a aVar) {
        f17296a = aVar;
    }

    public static void i(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    public int b(float[] fArr) {
        return (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }
}
