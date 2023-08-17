package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public final class e1 extends k {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public static final e1 f12798a = new e1();
    @n6.d

    /* renamed from: b  reason: collision with root package name */
    public static final ReentrantReadWriteLock f12799b = new ReentrantReadWriteLock();
    @n6.d

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap<Class<? extends Throwable>, t4.l<Throwable, Throwable>> f12800c = new WeakHashMap<>();

    @Override // kotlinx.coroutines.internal.k
    @n6.d
    public t4.l<Throwable, Throwable> a(@n6.d Class<? extends Throwable> cls) {
        t4.l<Throwable, Throwable> b7;
        ReentrantReadWriteLock reentrantReadWriteLock = f12799b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            t4.l<Throwable, Throwable> lVar = f12800c.get(cls);
            if (lVar != null) {
                return lVar;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i7 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i8 = 0; i8 < readHoldCount; i8++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, t4.l<Throwable, Throwable>> weakHashMap = f12800c;
                t4.l<Throwable, Throwable> lVar2 = weakHashMap.get(cls);
                if (lVar2 != null) {
                    return lVar2;
                }
                b7 = n.b(cls);
                weakHashMap.put(cls, b7);
                while (i7 < readHoldCount) {
                    readLock2.lock();
                    i7++;
                }
                writeLock.unlock();
                return b7;
            } finally {
                while (i7 < readHoldCount) {
                    readLock2.lock();
                    i7++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
