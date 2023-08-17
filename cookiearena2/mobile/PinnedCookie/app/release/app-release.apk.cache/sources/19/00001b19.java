package u;

/* loaded from: classes.dex */
public interface v {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17103a = "CUSTOM";

    /* renamed from: b  reason: collision with root package name */
    public static final int f17104b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f17105c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f17106d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f17107e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final int f17108f = 100;

    /* renamed from: g  reason: collision with root package name */
    public static final int f17109g = 101;

    /* loaded from: classes.dex */
    public interface a {
        public static final String A = "rotationX";
        public static final String B = "rotationY";
        public static final String C = "rotationZ";
        public static final String D = "scaleX";
        public static final String E = "scaleY";
        public static final String F = "pivotX";
        public static final String G = "pivotY";
        public static final String H = "progress";
        public static final String I = "pathRotate";
        public static final String J = "easing";
        public static final String K = "CUSTOM";
        public static final String M = "target";

        /* renamed from: a  reason: collision with root package name */
        public static final String f17110a = "KeyAttributes";

        /* renamed from: b  reason: collision with root package name */
        public static final int f17111b = 301;

        /* renamed from: c  reason: collision with root package name */
        public static final int f17112c = 302;

        /* renamed from: d  reason: collision with root package name */
        public static final int f17113d = 303;

        /* renamed from: e  reason: collision with root package name */
        public static final int f17114e = 304;

        /* renamed from: f  reason: collision with root package name */
        public static final int f17115f = 305;

        /* renamed from: g  reason: collision with root package name */
        public static final int f17116g = 306;

        /* renamed from: h  reason: collision with root package name */
        public static final int f17117h = 307;

        /* renamed from: i  reason: collision with root package name */
        public static final int f17118i = 308;

        /* renamed from: j  reason: collision with root package name */
        public static final int f17119j = 309;

        /* renamed from: k  reason: collision with root package name */
        public static final int f17120k = 310;

        /* renamed from: l  reason: collision with root package name */
        public static final int f17121l = 311;

        /* renamed from: m  reason: collision with root package name */
        public static final int f17122m = 312;

        /* renamed from: n  reason: collision with root package name */
        public static final int f17123n = 313;

        /* renamed from: o  reason: collision with root package name */
        public static final int f17124o = 314;

        /* renamed from: p  reason: collision with root package name */
        public static final int f17125p = 315;

        /* renamed from: q  reason: collision with root package name */
        public static final int f17126q = 316;

        /* renamed from: r  reason: collision with root package name */
        public static final int f17127r = 317;

        /* renamed from: s  reason: collision with root package name */
        public static final int f17128s = 318;

        /* renamed from: t  reason: collision with root package name */
        public static final String f17129t = "curveFit";

        /* renamed from: u  reason: collision with root package name */
        public static final String f17130u = "visibility";

        /* renamed from: v  reason: collision with root package name */
        public static final String f17131v = "alpha";

        /* renamed from: w  reason: collision with root package name */
        public static final String f17132w = "translationX";

        /* renamed from: x  reason: collision with root package name */
        public static final String f17133x = "translationY";

        /* renamed from: y  reason: collision with root package name */
        public static final String f17134y = "translationZ";

        /* renamed from: z  reason: collision with root package name */
        public static final String f17135z = "elevation";
        public static final String L = "frame";
        public static final String N = "pivotTarget";
        public static final String[] O = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", L, "target", N};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c7;
            str.hashCode();
            switch (str.hashCode()) {
                case -1310311125:
                    if (str.equals("easing")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -880905839:
                    if (str.equals("target")) {
                        c7 = '\f';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c7 = '\r';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c7 = 14;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 97692013:
                    if (str.equals(L)) {
                        c7 = 15;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 579057826:
                    if (str.equals("curveFit")) {
                        c7 = 16;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c7 = 17;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1167159411:
                    if (str.equals(N)) {
                        c7 = 18;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c7 = 19;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    return f17127r;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case '\b':
                    return 313;
                case '\t':
                    return 314;
                case '\n':
                    return 311;
                case 11:
                    return 312;
                case '\f':
                    return v.f17109g;
                case '\r':
                    return 307;
                case 14:
                    return 303;
                case 15:
                    return 100;
                case 16:
                    return 301;
                case 17:
                    return f17126q;
                case 18:
                    return f17128s;
                case 19:
                    return 302;
                default:
                    return -1;
            }
        }

        static int b(int i7) {
            if (i7 != 100) {
                if (i7 != 101) {
                    switch (i7) {
                        case 301:
                        case 302:
                            return 2;
                        case 303:
                        case 304:
                        case 305:
                        case 306:
                        case 307:
                        case 308:
                        case 309:
                        case 310:
                        case 311:
                        case 312:
                        case 313:
                        case 314:
                        case 315:
                        case f17126q /* 316 */:
                            return 4;
                        case f17127r /* 317 */:
                        case f17128s /* 318 */:
                            return 8;
                        default:
                            return -1;
                    }
                }
                return 8;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final String f17136a = "Custom";

        /* renamed from: b  reason: collision with root package name */
        public static final String f17137b = "integer";

        /* renamed from: c  reason: collision with root package name */
        public static final String f17138c = "float";

        /* renamed from: d  reason: collision with root package name */
        public static final String f17139d = "color";

        /* renamed from: e  reason: collision with root package name */
        public static final String f17140e = "string";

        /* renamed from: f  reason: collision with root package name */
        public static final String f17141f = "boolean";

        /* renamed from: g  reason: collision with root package name */
        public static final String f17142g = "dimension";

        /* renamed from: h  reason: collision with root package name */
        public static final String f17143h = "refrence";

        /* renamed from: i  reason: collision with root package name */
        public static final String[] f17144i = {f17138c, f17139d, f17140e, f17141f, f17142g, f17143h};

        /* renamed from: j  reason: collision with root package name */
        public static final int f17145j = 900;

        /* renamed from: k  reason: collision with root package name */
        public static final int f17146k = 901;

        /* renamed from: l  reason: collision with root package name */
        public static final int f17147l = 902;

        /* renamed from: m  reason: collision with root package name */
        public static final int f17148m = 903;

        /* renamed from: n  reason: collision with root package name */
        public static final int f17149n = 904;

        /* renamed from: o  reason: collision with root package name */
        public static final int f17150o = 905;

        /* renamed from: p  reason: collision with root package name */
        public static final int f17151p = 906;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c7;
            str.hashCode();
            switch (str.hashCode()) {
                case -1095013018:
                    if (str.equals(f17142g)) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -891985903:
                    if (str.equals(f17140e)) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -710953590:
                    if (str.equals(f17143h)) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 64711720:
                    if (str.equals(f17141f)) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 94842723:
                    if (str.equals(f17139d)) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 97526364:
                    if (str.equals(f17138c)) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1958052158:
                    if (str.equals(f17137b)) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    return f17150o;
                case 1:
                    return f17148m;
                case 2:
                    return f17151p;
                case 3:
                    return f17149n;
                case 4:
                    return f17147l;
                case 5:
                    return f17146k;
                case 6:
                    return f17145j;
                default:
                    return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        public static final String A = "translationX";
        public static final String B = "translationY";
        public static final String C = "translationZ";
        public static final String D = "elevation";
        public static final String E = "rotationX";
        public static final String F = "rotationY";
        public static final String G = "rotationZ";
        public static final String H = "scaleX";
        public static final String I = "scaleY";
        public static final String J = "pivotX";
        public static final String K = "pivotY";
        public static final String L = "progress";
        public static final String M = "pathRotate";
        public static final String N = "easing";
        public static final String O = "waveShape";
        public static final String P = "customWave";
        public static final String Q = "period";
        public static final String R = "offset";
        public static final String S = "phase";
        public static final String[] T = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", P, Q, R, S};

        /* renamed from: a  reason: collision with root package name */
        public static final String f17152a = "KeyCycle";

        /* renamed from: b  reason: collision with root package name */
        public static final int f17153b = 401;

        /* renamed from: c  reason: collision with root package name */
        public static final int f17154c = 402;

        /* renamed from: d  reason: collision with root package name */
        public static final int f17155d = 403;

        /* renamed from: e  reason: collision with root package name */
        public static final int f17156e = 304;

        /* renamed from: f  reason: collision with root package name */
        public static final int f17157f = 305;

        /* renamed from: g  reason: collision with root package name */
        public static final int f17158g = 306;

        /* renamed from: h  reason: collision with root package name */
        public static final int f17159h = 307;

        /* renamed from: i  reason: collision with root package name */
        public static final int f17160i = 308;

        /* renamed from: j  reason: collision with root package name */
        public static final int f17161j = 309;

        /* renamed from: k  reason: collision with root package name */
        public static final int f17162k = 310;

        /* renamed from: l  reason: collision with root package name */
        public static final int f17163l = 311;

        /* renamed from: m  reason: collision with root package name */
        public static final int f17164m = 312;

        /* renamed from: n  reason: collision with root package name */
        public static final int f17165n = 313;

        /* renamed from: o  reason: collision with root package name */
        public static final int f17166o = 314;

        /* renamed from: p  reason: collision with root package name */
        public static final int f17167p = 315;

        /* renamed from: q  reason: collision with root package name */
        public static final int f17168q = 416;

        /* renamed from: r  reason: collision with root package name */
        public static final int f17169r = 420;

        /* renamed from: s  reason: collision with root package name */
        public static final int f17170s = 421;

        /* renamed from: t  reason: collision with root package name */
        public static final int f17171t = 422;

        /* renamed from: u  reason: collision with root package name */
        public static final int f17172u = 423;

        /* renamed from: v  reason: collision with root package name */
        public static final int f17173v = 424;

        /* renamed from: w  reason: collision with root package name */
        public static final int f17174w = 425;

        /* renamed from: x  reason: collision with root package name */
        public static final String f17175x = "curveFit";

        /* renamed from: y  reason: collision with root package name */
        public static final String f17176y = "visibility";

        /* renamed from: z  reason: collision with root package name */
        public static final String f17177z = "alpha";

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c7;
            str.hashCode();
            switch (str.hashCode()) {
                case -1310311125:
                    if (str.equals("easing")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c7 = '\f';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 579057826:
                    if (str.equals("curveFit")) {
                        c7 = '\r';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        c7 = 14;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c7 = 15;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    return f17169r;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case '\b':
                    return 313;
                case '\t':
                    return 314;
                case '\n':
                    return 311;
                case 11:
                    return 312;
                case '\f':
                    return f17155d;
                case '\r':
                    return f17153b;
                case 14:
                    return f17168q;
                case 15:
                    return f17154c;
                default:
                    return -1;
            }
        }

        static int b(int i7) {
            if (i7 != 100) {
                if (i7 != 101) {
                    if (i7 != 416) {
                        if (i7 == 420 || i7 == 421) {
                            return 8;
                        }
                        switch (i7) {
                            case 304:
                            case 305:
                            case 306:
                            case 307:
                            case 308:
                            case 309:
                            case 310:
                            case 311:
                            case 312:
                            case 313:
                            case 314:
                            case 315:
                                return 4;
                            default:
                                switch (i7) {
                                    case f17153b /* 401 */:
                                    case f17154c /* 402 */:
                                        return 2;
                                    case f17155d /* 403 */:
                                        return 4;
                                    default:
                                        switch (i7) {
                                            case f17172u /* 423 */:
                                            case f17173v /* 424 */:
                                            case f17174w /* 425 */:
                                                return 4;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                    }
                    return 4;
                }
                return 8;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final String f17178a = "MotionScene";

        /* renamed from: d  reason: collision with root package name */
        public static final int f17181d = 600;

        /* renamed from: e  reason: collision with root package name */
        public static final int f17182e = 601;

        /* renamed from: b  reason: collision with root package name */
        public static final String f17179b = "defaultDuration";

        /* renamed from: c  reason: collision with root package name */
        public static final String f17180c = "layoutDuringTransition";

        /* renamed from: f  reason: collision with root package name */
        public static final String[] f17183f = {f17179b, f17180c};

        static int a(String str) {
            str.hashCode();
            if (str.equals(f17179b)) {
                return 600;
            }
            return !str.equals(f17180c) ? -1 : 601;
        }

        static int b(int i7) {
            if (i7 != 600) {
                return i7 != 601 ? -1 : 1;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        public static final int A = 611;
        public static final int B = 612;

        /* renamed from: a  reason: collision with root package name */
        public static final String f17184a = "Motion";

        /* renamed from: b  reason: collision with root package name */
        public static final String f17185b = "Stagger";

        /* renamed from: c  reason: collision with root package name */
        public static final String f17186c = "PathRotate";

        /* renamed from: d  reason: collision with root package name */
        public static final String f17187d = "QuantizeMotionPhase";

        /* renamed from: e  reason: collision with root package name */
        public static final String f17188e = "TransitionEasing";

        /* renamed from: f  reason: collision with root package name */
        public static final String f17189f = "QuantizeInterpolator";

        /* renamed from: g  reason: collision with root package name */
        public static final String f17190g = "AnimateRelativeTo";

        /* renamed from: h  reason: collision with root package name */
        public static final String f17191h = "AnimateCircleAngleTo";

        /* renamed from: i  reason: collision with root package name */
        public static final String f17192i = "PathMotionArc";

        /* renamed from: j  reason: collision with root package name */
        public static final String f17193j = "DrawPath";

        /* renamed from: k  reason: collision with root package name */
        public static final String f17194k = "PolarRelativeTo";

        /* renamed from: l  reason: collision with root package name */
        public static final String f17195l = "QuantizeMotionSteps";

        /* renamed from: m  reason: collision with root package name */
        public static final String f17196m = "QuantizeInterpolatorType";

        /* renamed from: n  reason: collision with root package name */
        public static final String f17197n = "QuantizeInterpolatorID";

        /* renamed from: o  reason: collision with root package name */
        public static final String[] f17198o = {f17185b, f17186c, f17187d, f17188e, f17189f, f17190g, f17191h, f17192i, f17193j, f17194k, f17195l, f17196m, f17197n};

        /* renamed from: p  reason: collision with root package name */
        public static final int f17199p = 600;

        /* renamed from: q  reason: collision with root package name */
        public static final int f17200q = 601;

        /* renamed from: r  reason: collision with root package name */
        public static final int f17201r = 602;

        /* renamed from: s  reason: collision with root package name */
        public static final int f17202s = 603;

        /* renamed from: t  reason: collision with root package name */
        public static final int f17203t = 604;

        /* renamed from: u  reason: collision with root package name */
        public static final int f17204u = 605;

        /* renamed from: v  reason: collision with root package name */
        public static final int f17205v = 606;

        /* renamed from: w  reason: collision with root package name */
        public static final int f17206w = 607;

        /* renamed from: x  reason: collision with root package name */
        public static final int f17207x = 608;

        /* renamed from: y  reason: collision with root package name */
        public static final int f17208y = 609;

        /* renamed from: z  reason: collision with root package name */
        public static final int f17209z = 610;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c7;
            str.hashCode();
            switch (str.hashCode()) {
                case -2033446275:
                    if (str.equals(f17191h)) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1532277420:
                    if (str.equals(f17187d)) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1529145600:
                    if (str.equals(f17195l)) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1498310144:
                    if (str.equals(f17186c)) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1030753096:
                    if (str.equals(f17189f)) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -762370135:
                    if (str.equals(f17193j)) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -232872051:
                    if (str.equals(f17185b)) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1138491429:
                    if (str.equals(f17194k)) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1539234834:
                    if (str.equals(f17196m)) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1583722451:
                    if (str.equals(f17197n)) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1639368448:
                    if (str.equals(f17188e)) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1900899336:
                    if (str.equals(f17190g)) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 2109694967:
                    if (str.equals(f17192i)) {
                        c7 = '\f';
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    return f17205v;
                case 1:
                    return f17201r;
                case 2:
                    return f17209z;
                case 3:
                    return 601;
                case 4:
                    return f17203t;
                case 5:
                    return f17207x;
                case 6:
                    return 600;
                case 7:
                    return f17208y;
                case '\b':
                    return A;
                case '\t':
                    return B;
                case '\n':
                    return f17202s;
                case 11:
                    return f17204u;
                case '\f':
                    return f17206w;
                default:
                    return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {

        /* renamed from: a  reason: collision with root package name */
        public static final String f17210a = "dragscale";

        /* renamed from: b  reason: collision with root package name */
        public static final String f17211b = "dragthreshold";

        /* renamed from: c  reason: collision with root package name */
        public static final String f17212c = "maxvelocity";

        /* renamed from: d  reason: collision with root package name */
        public static final String f17213d = "maxacceleration";

        /* renamed from: e  reason: collision with root package name */
        public static final String f17214e = "springmass";

        /* renamed from: f  reason: collision with root package name */
        public static final String f17215f = "springstiffness";

        /* renamed from: g  reason: collision with root package name */
        public static final String f17216g = "springdamping";

        /* renamed from: h  reason: collision with root package name */
        public static final String f17217h = "springstopthreshold";

        /* renamed from: i  reason: collision with root package name */
        public static final String f17218i = "dragdirection";

        /* renamed from: j  reason: collision with root package name */
        public static final String f17219j = "touchanchorid";

        /* renamed from: k  reason: collision with root package name */
        public static final String f17220k = "touchanchorside";

        /* renamed from: l  reason: collision with root package name */
        public static final String f17221l = "rotationcenterid";

        /* renamed from: m  reason: collision with root package name */
        public static final String f17222m = "touchregionid";

        /* renamed from: n  reason: collision with root package name */
        public static final String f17223n = "limitboundsto";

        /* renamed from: o  reason: collision with root package name */
        public static final String f17224o = "movewhenscrollattop";

        /* renamed from: p  reason: collision with root package name */
        public static final String f17225p = "ontouchup";

        /* renamed from: r  reason: collision with root package name */
        public static final String f17227r = "springboundary";

        /* renamed from: t  reason: collision with root package name */
        public static final String f17229t = "autocompletemode";

        /* renamed from: v  reason: collision with root package name */
        public static final String f17231v = "nestedscrollflags";

        /* renamed from: q  reason: collision with root package name */
        public static final String[] f17226q = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", u.d.f16904i, "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};

        /* renamed from: s  reason: collision with root package name */
        public static final String[] f17228s = {u.d.f16909n, "bounceStart", "bounceEnd", "bounceBoth"};

        /* renamed from: u  reason: collision with root package name */
        public static final String[] f17230u = {"continuousVelocity", "spring"};

        /* renamed from: w  reason: collision with root package name */
        public static final String[] f17232w = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    /* loaded from: classes.dex */
    public interface g {

        /* renamed from: a  reason: collision with root package name */
        public static final String f17233a = "KeyPosition";

        /* renamed from: b  reason: collision with root package name */
        public static final String f17234b = "transitionEasing";

        /* renamed from: c  reason: collision with root package name */
        public static final String f17235c = "drawPath";

        /* renamed from: d  reason: collision with root package name */
        public static final String f17236d = "percentWidth";

        /* renamed from: e  reason: collision with root package name */
        public static final String f17237e = "percentHeight";

        /* renamed from: f  reason: collision with root package name */
        public static final String f17238f = "sizePercent";

        /* renamed from: g  reason: collision with root package name */
        public static final String f17239g = "percentX";

        /* renamed from: h  reason: collision with root package name */
        public static final String f17240h = "percentY";

        /* renamed from: i  reason: collision with root package name */
        public static final int f17241i = 501;

        /* renamed from: j  reason: collision with root package name */
        public static final int f17242j = 502;

        /* renamed from: k  reason: collision with root package name */
        public static final int f17243k = 503;

        /* renamed from: l  reason: collision with root package name */
        public static final int f17244l = 504;

        /* renamed from: m  reason: collision with root package name */
        public static final int f17245m = 505;

        /* renamed from: n  reason: collision with root package name */
        public static final int f17246n = 506;

        /* renamed from: o  reason: collision with root package name */
        public static final int f17247o = 507;

        /* renamed from: p  reason: collision with root package name */
        public static final int f17248p = 508;

        /* renamed from: q  reason: collision with root package name */
        public static final int f17249q = 509;

        /* renamed from: r  reason: collision with root package name */
        public static final int f17250r = 510;

        /* renamed from: s  reason: collision with root package name */
        public static final String[] f17251s = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c7;
            str.hashCode();
            switch (str.hashCode()) {
                case -1812823328:
                    if (str.equals("transitionEasing")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1127236479:
                    if (str.equals("percentWidth")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1017587252:
                    if (str.equals("percentHeight")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -827014263:
                    if (str.equals("drawPath")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -200259324:
                    if (str.equals("sizePercent")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 428090547:
                    if (str.equals("percentX")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 428090548:
                    if (str.equals("percentY")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    return f17241i;
                case 1:
                    return f17243k;
                case 2:
                    return f17244l;
                case 3:
                    return f17242j;
                case 4:
                    return f17245m;
                case 5:
                    return f17246n;
                case 6:
                    return f17247o;
                default:
                    return -1;
            }
        }

        static int b(int i7) {
            if (i7 != 100) {
                if (i7 != 101) {
                    switch (i7) {
                        case f17241i /* 501 */:
                        case f17242j /* 502 */:
                            return 8;
                        case f17243k /* 503 */:
                        case f17244l /* 504 */:
                        case f17245m /* 505 */:
                        case f17246n /* 506 */:
                        case f17247o /* 507 */:
                            return 4;
                        case f17248p /* 508 */:
                            return 2;
                        default:
                            return -1;
                    }
                }
                return 8;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public interface h {

        /* renamed from: a  reason: collision with root package name */
        public static final String f17252a = "Transitions";

        /* renamed from: d  reason: collision with root package name */
        public static final String f17255d = "to";

        /* renamed from: j  reason: collision with root package name */
        public static final int f17261j = 700;

        /* renamed from: k  reason: collision with root package name */
        public static final int f17262k = 701;

        /* renamed from: l  reason: collision with root package name */
        public static final int f17263l = 702;

        /* renamed from: m  reason: collision with root package name */
        public static final int f17264m = 509;

        /* renamed from: n  reason: collision with root package name */
        public static final int f17265n = 704;

        /* renamed from: o  reason: collision with root package name */
        public static final int f17266o = 705;

        /* renamed from: p  reason: collision with root package name */
        public static final int f17267p = 706;

        /* renamed from: q  reason: collision with root package name */
        public static final int f17268q = 707;

        /* renamed from: b  reason: collision with root package name */
        public static final String f17253b = "duration";

        /* renamed from: c  reason: collision with root package name */
        public static final String f17254c = "from";

        /* renamed from: e  reason: collision with root package name */
        public static final String f17256e = "pathMotionArc";

        /* renamed from: f  reason: collision with root package name */
        public static final String f17257f = "autoTransition";

        /* renamed from: g  reason: collision with root package name */
        public static final String f17258g = "motionInterpolator";

        /* renamed from: h  reason: collision with root package name */
        public static final String f17259h = "staggered";

        /* renamed from: i  reason: collision with root package name */
        public static final String f17260i = "transitionFlags";

        /* renamed from: r  reason: collision with root package name */
        public static final String[] f17269r = {f17253b, f17254c, "to", f17256e, f17257f, f17258g, f17259h, f17254c, f17260i};

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c7;
            str.hashCode();
            switch (str.hashCode()) {
                case -1996906958:
                    if (str.equals(f17260i)) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1992012396:
                    if (str.equals(f17253b)) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1357874275:
                    if (str.equals(f17258g)) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1298065308:
                    if (str.equals(f17257f)) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3707:
                    if (str.equals("to")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3151786:
                    if (str.equals(f17254c)) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1310733335:
                    if (str.equals(f17256e)) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1839260940:
                    if (str.equals(f17259h)) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    return f17268q;
                case 1:
                    return f17261j;
                case 2:
                    return f17266o;
                case 3:
                    return f17265n;
                case 4:
                    return f17263l;
                case 5:
                    return f17262k;
                case 6:
                    return 509;
                case 7:
                    return f17267p;
                default:
                    return -1;
            }
        }

        static int b(int i7) {
            if (i7 != 509) {
                switch (i7) {
                    case f17261j /* 700 */:
                        return 2;
                    case f17262k /* 701 */:
                    case f17263l /* 702 */:
                        return 8;
                    default:
                        switch (i7) {
                            case f17266o /* 705 */:
                            case f17268q /* 707 */:
                                return 8;
                            case f17267p /* 706 */:
                                return 4;
                            default:
                                return -1;
                        }
                }
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public interface i {

        /* renamed from: a  reason: collision with root package name */
        public static final String f17270a = "KeyTrigger";

        /* renamed from: b  reason: collision with root package name */
        public static final String f17271b = "viewTransitionOnCross";

        /* renamed from: c  reason: collision with root package name */
        public static final String f17272c = "viewTransitionOnPositiveCross";

        /* renamed from: d  reason: collision with root package name */
        public static final String f17273d = "viewTransitionOnNegativeCross";

        /* renamed from: e  reason: collision with root package name */
        public static final String f17274e = "postLayout";

        /* renamed from: f  reason: collision with root package name */
        public static final String f17275f = "triggerSlack";

        /* renamed from: g  reason: collision with root package name */
        public static final String f17276g = "triggerCollisionView";

        /* renamed from: h  reason: collision with root package name */
        public static final String f17277h = "triggerCollisionId";

        /* renamed from: i  reason: collision with root package name */
        public static final String f17278i = "triggerID";

        /* renamed from: j  reason: collision with root package name */
        public static final String f17279j = "positiveCross";

        /* renamed from: k  reason: collision with root package name */
        public static final String f17280k = "negativeCross";

        /* renamed from: l  reason: collision with root package name */
        public static final String f17281l = "triggerReceiver";

        /* renamed from: m  reason: collision with root package name */
        public static final String f17282m = "CROSS";

        /* renamed from: n  reason: collision with root package name */
        public static final String[] f17283n = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};

        /* renamed from: o  reason: collision with root package name */
        public static final int f17284o = 301;

        /* renamed from: p  reason: collision with root package name */
        public static final int f17285p = 302;

        /* renamed from: q  reason: collision with root package name */
        public static final int f17286q = 303;

        /* renamed from: r  reason: collision with root package name */
        public static final int f17287r = 304;

        /* renamed from: s  reason: collision with root package name */
        public static final int f17288s = 305;

        /* renamed from: t  reason: collision with root package name */
        public static final int f17289t = 306;

        /* renamed from: u  reason: collision with root package name */
        public static final int f17290u = 307;

        /* renamed from: v  reason: collision with root package name */
        public static final int f17291v = 308;

        /* renamed from: w  reason: collision with root package name */
        public static final int f17292w = 309;

        /* renamed from: x  reason: collision with root package name */
        public static final int f17293x = 310;

        /* renamed from: y  reason: collision with root package name */
        public static final int f17294y = 311;

        /* renamed from: z  reason: collision with root package name */
        public static final int f17295z = 312;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static int a(String str) {
            char c7;
            str.hashCode();
            switch (str.hashCode()) {
                case -1594793529:
                    if (str.equals("positiveCross")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -966421266:
                    if (str.equals("viewTransitionOnPositiveCross")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -786670827:
                    if (str.equals("triggerCollisionId")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -648752941:
                    if (str.equals("triggerID")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -638126837:
                    if (str.equals("negativeCross")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -76025313:
                    if (str.equals("triggerCollisionView")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -9754574:
                    if (str.equals("viewTransitionOnNegativeCross")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 64397344:
                    if (str.equals("CROSS")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 364489912:
                    if (str.equals("triggerSlack")) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1301930599:
                    if (str.equals("viewTransitionOnCross")) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1401391082:
                    if (str.equals("postLayout")) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1535404999:
                    if (str.equals("triggerReceiver")) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
                case 0:
                    return 309;
                case 1:
                    return 302;
                case 2:
                    return 307;
                case 3:
                    return 308;
                case 4:
                    return 310;
                case 5:
                    return 306;
                case 6:
                    return 303;
                case 7:
                    return 312;
                case '\b':
                    return 305;
                case '\t':
                    return 301;
                case '\n':
                    return 304;
                case 11:
                    return 311;
                default:
                    return -1;
            }
        }
    }

    int a(String str);

    boolean b(int i7, int i8);

    boolean c(int i7, float f7);

    boolean d(int i7, String str);

    boolean e(int i7, boolean z6);
}