package n4;

import java.io.File;
import u4.l0;
/* loaded from: classes.dex */
public final class a extends j {
    public /* synthetic */ a(File file, File file2, String str, int i7, u4.w wVar) {
        this(file, (i7 & 2) != 0 ? null : file2, (i7 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@n6.d File file, @n6.e File file2, @n6.e String str) {
        super(file, file2, str);
        l0.p(file, "file");
    }
}
