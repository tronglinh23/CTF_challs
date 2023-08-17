package v;

import java.util.Iterator;
/* loaded from: classes.dex */
public class f extends b implements Iterable<d> {

    /* loaded from: classes.dex */
    public class a implements Iterator {

        /* renamed from: k  reason: collision with root package name */
        public f f17602k;

        /* renamed from: l  reason: collision with root package name */
        public int f17603l = 0;

        public a(f fVar) {
            this.f17602k = fVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17603l < this.f17602k.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            d dVar = (d) this.f17602k.f17592r.get(this.f17603l);
            this.f17603l++;
            return dVar;
        }
    }

    public f(char[] cArr) {
        super(cArr);
    }

    public static f W(char[] cArr) {
        return new f(cArr);
    }

    public String X() {
        return s(0, 0);
    }

    @Override // java.lang.Iterable
    public Iterator<d> iterator() {
        return new a(this);
    }

    @Override // v.c
    public String s(int i7, int i8) {
        StringBuilder sb = new StringBuilder(e());
        sb.append("{\n");
        Iterator<c> it = this.f17592r.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            c next = it.next();
            if (z6) {
                z6 = false;
            } else {
                sb.append(",\n");
            }
            sb.append(next.s(c.f17594q + i7, i8 - 1));
        }
        sb.append("\n");
        a(sb, i7);
        sb.append("}");
        return sb.toString();
    }

    @Override // v.c
    public String t() {
        StringBuilder sb = new StringBuilder(e() + "{ ");
        Iterator<c> it = this.f17592r.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            c next = it.next();
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(next.t());
        }
        sb.append(" }");
        return sb.toString();
    }
}
