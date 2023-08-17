package p0;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;

@u4.r1({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
/* loaded from: classes.dex */
public final class h1 {

    /* loaded from: classes.dex */
    public static final class a implements Iterator<Rect>, v4.a {
        @n6.d

        /* renamed from: k  reason: collision with root package name */
        public final RegionIterator f14489k;
        @n6.d

        /* renamed from: l  reason: collision with root package name */
        public final Rect f14490l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f14491m;

        public a(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f14489k = regionIterator;
            Rect rect = new Rect();
            this.f14490l = rect;
            this.f14491m = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        @n6.d
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Rect next() {
            if (this.f14491m) {
                Rect rect = new Rect(this.f14490l);
                this.f14491m = this.f14489k.next(this.f14490l);
                return rect;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14491m;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @n6.d
    public static final Region a(@n6.d Region region, @n6.d Rect rect) {
        u4.l0.p(region, "<this>");
        u4.l0.p(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    @n6.d
    public static final Region b(@n6.d Region region, @n6.d Region region2) {
        u4.l0.p(region, "<this>");
        u4.l0.p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final boolean c(@n6.d Region region, @n6.d Point point) {
        u4.l0.p(region, "<this>");
        u4.l0.p(point, "p");
        return region.contains(point.x, point.y);
    }

    public static final void d(@n6.d Region region, @n6.d t4.l<? super Rect, v3.m2> lVar) {
        u4.l0.p(region, "<this>");
        u4.l0.p(lVar, s2.t0.f16450f);
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            }
            lVar.O(rect);
        }
    }

    @n6.d
    public static final Iterator<Rect> e(@n6.d Region region) {
        u4.l0.p(region, "<this>");
        return new a(region);
    }

    @n6.d
    public static final Region f(@n6.d Region region, @n6.d Rect rect) {
        u4.l0.p(region, "<this>");
        u4.l0.p(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @n6.d
    public static final Region g(@n6.d Region region, @n6.d Region region2) {
        u4.l0.p(region, "<this>");
        u4.l0.p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @n6.d
    public static final Region h(@n6.d Region region) {
        u4.l0.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @n6.d
    public static final Region i(@n6.d Region region, @n6.d Rect rect) {
        u4.l0.p(region, "<this>");
        u4.l0.p(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @n6.d
    public static final Region j(@n6.d Region region, @n6.d Region region2) {
        u4.l0.p(region, "<this>");
        u4.l0.p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @n6.d
    public static final Region k(@n6.d Region region, @n6.d Rect rect) {
        u4.l0.p(region, "<this>");
        u4.l0.p(rect, "r");
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @n6.d
    public static final Region l(@n6.d Region region, @n6.d Region region2) {
        u4.l0.p(region, "<this>");
        u4.l0.p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @n6.d
    public static final Region m(@n6.d Region region) {
        u4.l0.p(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @n6.d
    public static final Region n(@n6.d Region region, @n6.d Rect rect) {
        u4.l0.p(region, "<this>");
        u4.l0.p(rect, "r");
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @n6.d
    public static final Region o(@n6.d Region region, @n6.d Region region2) {
        u4.l0.p(region, "<this>");
        u4.l0.p(region2, "r");
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}