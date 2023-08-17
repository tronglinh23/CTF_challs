  
import java.util.ArrayList;
import java.util.Base64;


public class Main {
    public static void main(String[] args) {
        attack("MBw6FDdZBT4wRzkQMB0jYEc8EUUDLQwjPiE8LR0TDw==","sTroN6PaSswORD");
    }

    public static void attack(String base64key, String key) {
        byte[] decode = Base64.getDecoder().decode(base64key);
        byte[] bArr = new byte[decode.length];
        byte[] bytes = key.getBytes();

        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[i] ^ bytes[i % bytes.length]);
        }
        System.out.println(new String(bArr));
    }

};

/*
y0 will be printed when we login as admin:sTroN6PaSswORD
Now we need to write back function y0 and print to get fla

public final String y0(ArrayList<String> arrayList, String r11) {
        byte[] decode = Base64.getDecoder().decode(e0.h3(arrayList, "", null, null, 0, null, null, 62, null));
        byte[] bArr = new byte[decode.length];
        byte[] bytes = r11.getBytes(i5.f.f11071b);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        int length = decode.length;
        for (int i7 = 0; i7 < length; i7++) {
            bArr[i7] = (byte) (decode[i7] ^ bytes[i7 % bytes.length]);
        }
        return new String(bArr, i5.f.f11071b);
    }
 */  