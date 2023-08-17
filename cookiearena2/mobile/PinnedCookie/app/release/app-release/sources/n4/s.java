package n4;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.l0;
/* loaded from: classes.dex */
public final class s implements f5.m<String> {
    @n6.d

    /* renamed from: a  reason: collision with root package name */
    public final BufferedReader f13870a;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<String>, v4.a {
        @n6.e

        /* renamed from: k  reason: collision with root package name */
        public String f13871k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f13872l;

        public a() {
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public String next() {
            if (hasNext()) {
                String str = this.f13871k;
                this.f13871k = null;
                l0.m(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13871k == null && !this.f13872l) {
                String readLine = s.this.f13870a.readLine();
                this.f13871k = readLine;
                if (readLine == null) {
                    this.f13872l = true;
                }
            }
            return this.f13871k != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(@n6.d BufferedReader bufferedReader) {
        l0.p(bufferedReader, "reader");
        this.f13870a = bufferedReader;
    }

    @Override // f5.m
    @n6.d
    public Iterator<String> iterator() {
        return new a();
    }
}
