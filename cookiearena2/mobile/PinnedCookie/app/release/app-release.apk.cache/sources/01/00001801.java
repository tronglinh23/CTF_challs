package p0;

import android.graphics.Point;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class e1 {
    public static final float a(@n6.d PointF pointF) {
        u4.l0.p(pointF, "<this>");
        return pointF.x;
    }

    public static final int b(@n6.d Point point) {
        u4.l0.p(point, "<this>");
        return point.x;
    }

    public static final float c(@n6.d PointF pointF) {
        u4.l0.p(pointF, "<this>");
        return pointF.y;
    }

    public static final int d(@n6.d Point point) {
        u4.l0.p(point, "<this>");
        return point.y;
    }

    @n6.d
    public static final Point e(@n6.d Point point, float f7) {
        u4.l0.p(point, "<this>");
        return new Point(Math.round(point.x / f7), Math.round(point.y / f7));
    }

    @n6.d
    public static final PointF f(@n6.d PointF pointF, float f7) {
        u4.l0.p(pointF, "<this>");
        return new PointF(pointF.x / f7, pointF.y / f7);
    }

    @n6.d
    public static final Point g(@n6.d Point point, int i7) {
        u4.l0.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        int i8 = -i7;
        point2.offset(i8, i8);
        return point2;
    }

    @n6.d
    public static final Point h(@n6.d Point point, @n6.d Point point2) {
        u4.l0.p(point, "<this>");
        u4.l0.p(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(-point2.x, -point2.y);
        return point3;
    }

    @n6.d
    public static final PointF i(@n6.d PointF pointF, float f7) {
        u4.l0.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        float f8 = -f7;
        pointF2.offset(f8, f8);
        return pointF2;
    }

    @n6.d
    public static final PointF j(@n6.d PointF pointF, @n6.d PointF pointF2) {
        u4.l0.p(pointF, "<this>");
        u4.l0.p(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(-pointF2.x, -pointF2.y);
        return pointF3;
    }

    @n6.d
    public static final Point k(@n6.d Point point, int i7) {
        u4.l0.p(point, "<this>");
        Point point2 = new Point(point.x, point.y);
        point2.offset(i7, i7);
        return point2;
    }

    @n6.d
    public static final Point l(@n6.d Point point, @n6.d Point point2) {
        u4.l0.p(point, "<this>");
        u4.l0.p(point2, "p");
        Point point3 = new Point(point.x, point.y);
        point3.offset(point2.x, point2.y);
        return point3;
    }

    @n6.d
    public static final PointF m(@n6.d PointF pointF, float f7) {
        u4.l0.p(pointF, "<this>");
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        pointF2.offset(f7, f7);
        return pointF2;
    }

    @n6.d
    public static final PointF n(@n6.d PointF pointF, @n6.d PointF pointF2) {
        u4.l0.p(pointF, "<this>");
        u4.l0.p(pointF2, "p");
        PointF pointF3 = new PointF(pointF.x, pointF.y);
        pointF3.offset(pointF2.x, pointF2.y);
        return pointF3;
    }

    @n6.d
    public static final Point o(@n6.d Point point, float f7) {
        u4.l0.p(point, "<this>");
        return new Point(Math.round(point.x * f7), Math.round(point.y * f7));
    }

    @n6.d
    public static final PointF p(@n6.d PointF pointF, float f7) {
        u4.l0.p(pointF, "<this>");
        return new PointF(pointF.x * f7, pointF.y * f7);
    }

    @n6.d
    public static final Point q(@n6.d PointF pointF) {
        u4.l0.p(pointF, "<this>");
        return new Point((int) pointF.x, (int) pointF.y);
    }

    @n6.d
    public static final PointF r(@n6.d Point point) {
        u4.l0.p(point, "<this>");
        return new PointF(point);
    }

    @n6.d
    public static final Point s(@n6.d Point point) {
        u4.l0.p(point, "<this>");
        return new Point(-point.x, -point.y);
    }

    @n6.d
    public static final PointF t(@n6.d PointF pointF) {
        u4.l0.p(pointF, "<this>");
        return new PointF(-pointF.x, -pointF.y);
    }
}