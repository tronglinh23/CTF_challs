package p0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;

@u4.r1({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
/* loaded from: classes.dex */
public final class g1 {
    @n6.d
    public static final Rect A(@n6.d Rect rect, int i7) {
        u4.l0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i7;
        rect2.left *= i7;
        rect2.right *= i7;
        rect2.bottom *= i7;
        return rect2;
    }

    @n6.d
    public static final RectF B(@n6.d RectF rectF, float f7) {
        u4.l0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f7;
        rectF2.left *= f7;
        rectF2.right *= f7;
        rectF2.bottom *= f7;
        return rectF2;
    }

    @n6.d
    public static final RectF C(@n6.d RectF rectF, int i7) {
        u4.l0.p(rectF, "<this>");
        float f7 = i7;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f7;
        rectF2.left *= f7;
        rectF2.right *= f7;
        rectF2.bottom *= f7;
        return rectF2;
    }

    @n6.d
    public static final Rect D(@n6.d RectF rectF) {
        u4.l0.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @n6.d
    public static final RectF E(@n6.d Rect rect) {
        u4.l0.p(rect, "<this>");
        return new RectF(rect);
    }

    @n6.d
    public static final Region F(@n6.d Rect rect) {
        u4.l0.p(rect, "<this>");
        return new Region(rect);
    }

    @n6.d
    public static final Region G(@n6.d RectF rectF) {
        u4.l0.p(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @n6.d
    public static final RectF H(@n6.d RectF rectF, @n6.d Matrix matrix) {
        u4.l0.p(rectF, "<this>");
        u4.l0.p(matrix, x0.f14590b);
        matrix.mapRect(rectF);
        return rectF;
    }

    @n6.d
    public static final Region I(@n6.d Rect rect, @n6.d Rect rect2) {
        u4.l0.p(rect, "<this>");
        u4.l0.p(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @n6.d
    public static final Region J(@n6.d RectF rectF, @n6.d RectF rectF2) {
        u4.l0.p(rectF, "<this>");
        u4.l0.p(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @n6.d
    @SuppressLint({"CheckResult"})
    public static final Rect a(@n6.d Rect rect, @n6.d Rect rect2) {
        u4.l0.p(rect, "<this>");
        u4.l0.p(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @n6.d
    @SuppressLint({"CheckResult"})
    public static final RectF b(@n6.d RectF rectF, @n6.d RectF rectF2) {
        u4.l0.p(rectF, "<this>");
        u4.l0.p(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final float c(@n6.d RectF rectF) {
        u4.l0.p(rectF, "<this>");
        return rectF.left;
    }

    public static final int d(@n6.d Rect rect) {
        u4.l0.p(rect, "<this>");
        return rect.left;
    }

    public static final float e(@n6.d RectF rectF) {
        u4.l0.p(rectF, "<this>");
        return rectF.top;
    }

    public static final int f(@n6.d Rect rect) {
        u4.l0.p(rect, "<this>");
        return rect.top;
    }

    public static final float g(@n6.d RectF rectF) {
        u4.l0.p(rectF, "<this>");
        return rectF.right;
    }

    public static final int h(@n6.d Rect rect) {
        u4.l0.p(rect, "<this>");
        return rect.right;
    }

    public static final float i(@n6.d RectF rectF) {
        u4.l0.p(rectF, "<this>");
        return rectF.bottom;
    }

    public static final int j(@n6.d Rect rect) {
        u4.l0.p(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean k(@n6.d Rect rect, @n6.d Point point) {
        u4.l0.p(rect, "<this>");
        u4.l0.p(point, "p");
        return rect.contains(point.x, point.y);
    }

    public static final boolean l(@n6.d RectF rectF, @n6.d PointF pointF) {
        u4.l0.p(rectF, "<this>");
        u4.l0.p(pointF, "p");
        return rectF.contains(pointF.x, pointF.y);
    }

    @n6.d
    public static final Rect m(@n6.d Rect rect, int i7) {
        u4.l0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i8 = -i7;
        rect2.offset(i8, i8);
        return rect2;
    }

    @n6.d
    public static final Rect n(@n6.d Rect rect, @n6.d Point point) {
        u4.l0.p(rect, "<this>");
        u4.l0.p(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @n6.d
    public static final RectF o(@n6.d RectF rectF, float f7) {
        u4.l0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f8 = -f7;
        rectF2.offset(f8, f8);
        return rectF2;
    }

    @n6.d
    public static final RectF p(@n6.d RectF rectF, @n6.d PointF pointF) {
        u4.l0.p(rectF, "<this>");
        u4.l0.p(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @n6.d
    public static final Region q(@n6.d Rect rect, @n6.d Rect rect2) {
        u4.l0.p(rect, "<this>");
        u4.l0.p(rect2, "r");
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @n6.d
    public static final Region r(@n6.d RectF rectF, @n6.d RectF rectF2) {
        u4.l0.p(rectF, "<this>");
        u4.l0.p(rectF2, "r");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @n6.d
    public static final Rect s(@n6.d Rect rect, @n6.d Rect rect2) {
        u4.l0.p(rect, "<this>");
        u4.l0.p(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @n6.d
    public static final RectF t(@n6.d RectF rectF, @n6.d RectF rectF2) {
        u4.l0.p(rectF, "<this>");
        u4.l0.p(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @n6.d
    public static final Rect u(@n6.d Rect rect, int i7) {
        u4.l0.p(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i7, i7);
        return rect2;
    }

    @n6.d
    public static final Rect v(@n6.d Rect rect, @n6.d Point point) {
        u4.l0.p(rect, "<this>");
        u4.l0.p(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @n6.d
    public static final Rect w(@n6.d Rect rect, @n6.d Rect rect2) {
        u4.l0.p(rect, "<this>");
        u4.l0.p(rect2, "r");
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @n6.d
    public static final RectF x(@n6.d RectF rectF, float f7) {
        u4.l0.p(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f7, f7);
        return rectF2;
    }

    @n6.d
    public static final RectF y(@n6.d RectF rectF, @n6.d PointF pointF) {
        u4.l0.p(rectF, "<this>");
        u4.l0.p(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @n6.d
    public static final RectF z(@n6.d RectF rectF, @n6.d RectF rectF2) {
        u4.l0.p(rectF, "<this>");
        u4.l0.p(rectF2, "r");
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}