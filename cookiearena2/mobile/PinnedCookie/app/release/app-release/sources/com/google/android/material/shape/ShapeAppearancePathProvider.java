package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d.b1;
import d.k1;
import d.o0;
import d.q0;
import d.w0;
/* loaded from: classes.dex */
public class ShapeAppearancePathProvider {
    private final ShapePath[] cornerPaths = new ShapePath[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];
    private final PointF pointF = new PointF();
    private final Path overlappedEdgePath = new Path();
    private final Path boundsPath = new Path();
    private final ShapePath shapePath = new ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];
    private final Path edgePath = new Path();
    private final Path cornerPath = new Path();
    private boolean edgeIntersectionCheckEnabled = true;

    /* loaded from: classes.dex */
    public static class Lazy {
        static final ShapeAppearancePathProvider INSTANCE = new ShapeAppearancePathProvider();

        private Lazy() {
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i7);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i7);
    }

    /* loaded from: classes.dex */
    public static final class ShapeAppearancePathSpec {
        @o0
        public final RectF bounds;
        public final float interpolation;
        @o0
        public final Path path;
        @q0
        public final PathListener pathListener;
        @o0
        public final ShapeAppearanceModel shapeAppearanceModel;

        public ShapeAppearancePathSpec(@o0 ShapeAppearanceModel shapeAppearanceModel, float f7, RectF rectF, @q0 PathListener pathListener, Path path) {
            this.pathListener = pathListener;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.interpolation = f7;
            this.bounds = rectF;
            this.path = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i7 = 0; i7 < 4; i7++) {
            this.cornerPaths[i7] = new ShapePath();
            this.cornerTransforms[i7] = new Matrix();
            this.edgeTransforms[i7] = new Matrix();
        }
    }

    private float angleOfEdge(int i7) {
        return ((i7 + 1) % 4) * 90;
    }

    private void appendCornerPath(@o0 ShapeAppearancePathSpec shapeAppearancePathSpec, int i7) {
        this.scratch[0] = this.cornerPaths[i7].getStartX();
        this.scratch[1] = this.cornerPaths[i7].getStartY();
        this.cornerTransforms[i7].mapPoints(this.scratch);
        if (i7 == 0) {
            Path path = shapeAppearancePathSpec.path;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = shapeAppearancePathSpec.path;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i7].applyToPath(this.cornerTransforms[i7], shapeAppearancePathSpec.path);
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i7], this.cornerTransforms[i7], i7);
        }
    }

    private void appendEdgePath(@o0 ShapeAppearancePathSpec shapeAppearancePathSpec, int i7) {
        int i8 = (i7 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i7].getEndX();
        this.scratch[1] = this.cornerPaths[i7].getEndY();
        this.cornerTransforms[i7].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i8].getStartX();
        this.scratch2[1] = this.cornerPaths[i8].getStartY();
        this.cornerTransforms[i8].mapPoints(this.scratch2);
        float f7 = this.scratch[0];
        float[] fArr = this.scratch2;
        float max = Math.max(((float) Math.hypot(f7 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(shapeAppearancePathSpec.bounds, i7);
        this.shapePath.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i7, shapeAppearancePathSpec.shapeAppearanceModel);
        edgeTreatmentForIndex.getEdgePath(max, edgeCenterForIndex, shapeAppearancePathSpec.interpolation, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i7], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i7) || pathOverlapsCorner(this.edgePath, i8))) {
            Path path = this.edgePath;
            path.op(path, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i7].mapPoints(this.scratch);
            Path path2 = this.overlappedEdgePath;
            float[] fArr2 = this.scratch;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.shapePath.applyToPath(this.edgeTransforms[i7], this.overlappedEdgePath);
        } else {
            this.shapePath.applyToPath(this.edgeTransforms[i7], shapeAppearancePathSpec.path);
        }
        PathListener pathListener = shapeAppearancePathSpec.pathListener;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i7], i7);
        }
    }

    private void getCoordinatesOfCorner(int i7, @o0 RectF rectF, @o0 PointF pointF) {
        if (i7 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i7 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i7 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private CornerSize getCornerSizeForIndex(int i7, @o0 ShapeAppearanceModel shapeAppearanceModel) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize() : shapeAppearanceModel.getBottomLeftCornerSize() : shapeAppearanceModel.getBottomRightCornerSize();
    }

    private CornerTreatment getCornerTreatmentForIndex(int i7, @o0 ShapeAppearanceModel shapeAppearanceModel) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner() : shapeAppearanceModel.getBottomLeftCorner() : shapeAppearanceModel.getBottomRightCorner();
    }

    private float getEdgeCenterForIndex(@o0 RectF rectF, int i7) {
        float[] fArr = this.scratch;
        ShapePath shapePath = this.cornerPaths[i7];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.cornerTransforms[i7].mapPoints(fArr);
        return (i7 == 1 || i7 == 3) ? Math.abs(rectF.centerX() - this.scratch[0]) : Math.abs(rectF.centerY() - this.scratch[1]);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i7, @o0 ShapeAppearanceModel shapeAppearanceModel) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge() : shapeAppearanceModel.getLeftEdge() : shapeAppearanceModel.getBottomEdge();
    }

    @b1({b1.a.LIBRARY_GROUP})
    @k1
    @o0
    public static ShapeAppearancePathProvider getInstance() {
        return Lazy.INSTANCE;
    }

    @w0(19)
    private boolean pathOverlapsCorner(Path path, int i7) {
        this.cornerPath.reset();
        this.cornerPaths[i7].applyToPath(this.cornerTransforms[i7], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void setCornerPathAndTransform(@o0 ShapeAppearancePathSpec shapeAppearancePathSpec, int i7) {
        getCornerTreatmentForIndex(i7, shapeAppearancePathSpec.shapeAppearanceModel).getCornerPath(this.cornerPaths[i7], 90.0f, shapeAppearancePathSpec.interpolation, shapeAppearancePathSpec.bounds, getCornerSizeForIndex(i7, shapeAppearancePathSpec.shapeAppearanceModel));
        float angleOfEdge = angleOfEdge(i7);
        this.cornerTransforms[i7].reset();
        getCoordinatesOfCorner(i7, shapeAppearancePathSpec.bounds, this.pointF);
        Matrix matrix = this.cornerTransforms[i7];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i7].preRotate(angleOfEdge);
    }

    private void setEdgePathAndTransform(int i7) {
        this.scratch[0] = this.cornerPaths[i7].getEndX();
        this.scratch[1] = this.cornerPaths[i7].getEndY();
        this.cornerTransforms[i7].mapPoints(this.scratch);
        float angleOfEdge = angleOfEdge(i7);
        this.edgeTransforms[i7].reset();
        Matrix matrix = this.edgeTransforms[i7];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i7].preRotate(angleOfEdge);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f7, RectF rectF, @o0 Path path) {
        calculatePath(shapeAppearanceModel, f7, rectF, null, path);
    }

    public void setEdgeIntersectionCheckEnable(boolean z6) {
        this.edgeIntersectionCheckEnabled = z6;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f7, RectF rectF, PathListener pathListener, @o0 Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f7, rectF, pathListener, path);
        for (int i7 = 0; i7 < 4; i7++) {
            setCornerPathAndTransform(shapeAppearancePathSpec, i7);
            setEdgePathAndTransform(i7);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            appendCornerPath(shapeAppearancePathSpec, i8);
            appendEdgePath(shapeAppearancePathSpec, i8);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }
}
