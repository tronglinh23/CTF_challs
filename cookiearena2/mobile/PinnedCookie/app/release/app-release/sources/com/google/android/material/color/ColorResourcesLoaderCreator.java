package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import d.o0;
import d.q0;
import d.w0;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;
@w0(30)
/* loaded from: classes.dex */
final class ColorResourcesLoaderCreator {
    private static final String TAG = "ColorResourcesLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    @q0
    public static ResourcesLoader create(@o0 Context context, @o0 Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        ResourcesProvider loadFromTable;
        try {
            byte[] create = ColorResourcesTableCreator.create(context, map);
            Log.i(TAG, "Table created, length: " + create.length);
            if (create.length == 0) {
                return null;
            }
            try {
                fileDescriptor = Os.memfd_create("temp.arsc", 0);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                    fileOutputStream.write(create);
                    ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                    try {
                        e.a();
                        ResourcesLoader a7 = d.a();
                        loadFromTable = ResourcesProvider.loadFromTable(dup, null);
                        a7.addProvider(loadFromTable);
                        if (dup != null) {
                            dup.close();
                        }
                        fileOutputStream.close();
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        return a7;
                    } catch (Throwable th) {
                        if (dup != null) {
                            try {
                                dup.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
        } catch (Exception e7) {
            Log.e(TAG, "Failed to create the ColorResourcesTableCreator.", e7);
            return null;
        }
    }
}
