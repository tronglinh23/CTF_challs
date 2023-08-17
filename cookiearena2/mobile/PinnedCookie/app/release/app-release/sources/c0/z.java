package c0;

import c0.u;
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7815a = "TransitionBuilder";

    public static u.b a(u scene, int transitionId, int startConstraintSetId, androidx.constraintlayout.widget.e startConstraintSet, int endConstraintSetId, androidx.constraintlayout.widget.e endConstraintSet) {
        u.b bVar = new u.b(transitionId, scene, startConstraintSetId, endConstraintSetId);
        b(scene, bVar, startConstraintSet, endConstraintSet);
        return bVar;
    }

    public static void b(u scene, u.b transition, androidx.constraintlayout.widget.e startConstraintSet, androidx.constraintlayout.widget.e endConstraintSet) {
        int I = transition.I();
        int B = transition.B();
        scene.j0(I, startConstraintSet);
        scene.j0(B, endConstraintSet);
    }

    public static void c(s layout) {
        u uVar = layout.f7578b;
        if (uVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!uVar.s0(layout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (uVar.f7705c == null || uVar.s().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
