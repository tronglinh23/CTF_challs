package l0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import d.d1;
import d.o0;
import d.q0;
import d.w0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {

    @w0(28)
    /* loaded from: classes.dex */
    public static class a {
        @d.u
        @q0
        public static Signature[] a(@o0 SigningInfo signingInfo) {
            Signature[] apkContentsSigners;
            apkContentsSigners = signingInfo.getApkContentsSigners();
            return apkContentsSigners;
        }

        @d.u
        public static long b(PackageInfo packageInfo) {
            long longVersionCode;
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }

        @d.u
        @q0
        public static Signature[] c(@o0 SigningInfo signingInfo) {
            Signature[] signingCertificateHistory;
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return signingCertificateHistory;
        }

        @d.u
        public static boolean d(@o0 SigningInfo signingInfo) {
            boolean hasMultipleSigners;
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            return hasMultipleSigners;
        }

        @d.u
        public static boolean e(@o0 PackageManager packageManager, @o0 String str, @o0 byte[] bArr, int i7) {
            boolean hasSigningCertificate;
            hasSigningCertificate = packageManager.hasSigningCertificate(str, bArr, i7);
            return hasSigningCertificate;
        }
    }

    public static boolean a(@o0 byte[][] bArr, @o0 byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] b(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e7);
        }
    }

    public static long c(@o0 PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.b(packageInfo) : packageInfo.versionCode;
    }

    @o0
    public static List<Signature> d(@o0 PackageManager packageManager, @o0 String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            signatureArr = a.d(signingInfo) ? a.a(signingInfo) : a.c(signingInfo);
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArr == null ? Collections.emptyList() : Arrays.asList(signatureArr);
    }

    public static boolean e(@o0 PackageManager packageManager, @o0 String str, @d1(min = 1) @o0 Map<byte[], Integer> map, boolean z6) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] bArr2 : keySet) {
            if (bArr2 == null) {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> d7 = d(packageManager, str);
        if (!z6 && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : keySet) {
                if (!a.e(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (d7.size() != 0 && map.size() <= d7.size() && (!z6 || map.size() == d7.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[d7.size()];
                for (int i7 = 0; i7 < d7.size(); i7++) {
                    bArr[i7] = b(d7.get(i7).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it = keySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    } else if (!a(bArr, next)) {
                        return false;
                    }
                } else if (!d7.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}