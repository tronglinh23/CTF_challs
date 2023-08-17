package c4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k4.f;
import s2.t0;
import s4.h;
import u4.i0;
import u4.l0;
import u4.r1;

@h(name = "LocksKt")
@r1({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes.dex */
public final class a {
    @f
    public static final <T> T a(ReentrantReadWriteLock reentrantReadWriteLock, t4.a<? extends T> aVar) {
        l0.p(reentrantReadWriteLock, "<this>");
        l0.p(aVar, t0.f16450f);
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            readLock.unlock();
            i0.c(1);
        }
    }

    @f
    public static final <T> T b(Lock lock, t4.a<? extends T> aVar) {
        l0.p(lock, "<this>");
        l0.p(aVar, t0.f16450f);
        lock.lock();
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            lock.unlock();
            i0.c(1);
        }
    }

    @f
    public static final <T> T c(ReentrantReadWriteLock reentrantReadWriteLock, t4.a<? extends T> aVar) {
        l0.p(reentrantReadWriteLock, "<this>");
        l0.p(aVar, t0.f16450f);
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i7 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i8 = 0; i8 < readHoldCount; i8++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            while (i7 < readHoldCount) {
                readLock.lock();
                i7++;
            }
            writeLock.unlock();
            i0.c(1);
        }
    }
}