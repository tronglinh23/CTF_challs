package a3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import d.o0;
import d.q0;
import d.w0;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final String f165g = "PrintHelper";

    /* renamed from: h  reason: collision with root package name */
    public static final int f166h = 3500;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f167i = true;

    /* renamed from: j  reason: collision with root package name */
    public static final boolean f168j = true;

    /* renamed from: k  reason: collision with root package name */
    public static final int f169k = 1;

    /* renamed from: l  reason: collision with root package name */
    public static final int f170l = 2;
    @SuppressLint({"InlinedApi"})

    /* renamed from: m  reason: collision with root package name */
    public static final int f171m = 1;
    @SuppressLint({"InlinedApi"})

    /* renamed from: n  reason: collision with root package name */
    public static final int f172n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f173o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f174p = 2;

    /* renamed from: a  reason: collision with root package name */
    public final Context f175a;

    /* renamed from: b  reason: collision with root package name */
    public BitmapFactory.Options f176b = null;

    /* renamed from: c  reason: collision with root package name */
    public final Object f177c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f178d = 2;

    /* renamed from: e  reason: collision with root package name */
    public int f179e = 2;

    /* renamed from: f  reason: collision with root package name */
    public int f180f = 1;

    /* renamed from: a3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class AsyncTaskC0005a extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CancellationSignal f181a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f182b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Bitmap f183c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PrintAttributes f184d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f185e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f186f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f187g;

        public AsyncTaskC0005a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, Bitmap bitmap, PrintAttributes printAttributes2, int i7, ParcelFileDescriptor parcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            this.f181a = cancellationSignal;
            this.f182b = printAttributes;
            this.f183c = bitmap;
            this.f184d = printAttributes2;
            this.f185e = i7;
            this.f186f = parcelFileDescriptor;
            this.f187g = writeResultCallback;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Throwable doInBackground(Void... voidArr) {
            RectF rectF;
            try {
                if (this.f181a.isCanceled()) {
                    return null;
                }
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(a.this.f175a, this.f182b);
                Bitmap a7 = a.a(this.f183c, this.f182b.getColorMode());
                if (this.f181a.isCanceled()) {
                    return null;
                }
                PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                boolean z6 = a.f168j;
                if (z6) {
                    rectF = new RectF(startPage.getInfo().getContentRect());
                } else {
                    PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(a.this.f175a, this.f184d);
                    PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                    RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                    printedPdfDocument2.finishPage(startPage2);
                    printedPdfDocument2.close();
                    rectF = rectF2;
                }
                Matrix d7 = a.d(a7.getWidth(), a7.getHeight(), rectF, this.f185e);
                if (!z6) {
                    d7.postTranslate(rectF.left, rectF.top);
                    startPage.getCanvas().clipRect(rectF);
                }
                startPage.getCanvas().drawBitmap(a7, d7, null);
                printedPdfDocument.finishPage(startPage);
                if (this.f181a.isCanceled()) {
                    printedPdfDocument.close();
                    ParcelFileDescriptor parcelFileDescriptor = this.f186f;
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (a7 != this.f183c) {
                        a7.recycle();
                    }
                    return null;
                }
                printedPdfDocument.writeTo(new FileOutputStream(this.f186f.getFileDescriptor()));
                printedPdfDocument.close();
                ParcelFileDescriptor parcelFileDescriptor2 = this.f186f;
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                    } catch (IOException unused2) {
                    }
                }
                if (a7 != this.f183c) {
                    a7.recycle();
                }
                return null;
            } catch (Throwable th) {
                return th;
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Throwable th) {
            if (this.f181a.isCanceled()) {
                this.f187g.onWriteCancelled();
            } else if (th == null) {
                this.f187g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e(a.f165g, "Error writing printed content", th);
                this.f187g.onWriteFailed(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    @w0(19)
    /* loaded from: classes.dex */
    public class c extends PrintDocumentAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final String f189a;

        /* renamed from: b  reason: collision with root package name */
        public final int f190b;

        /* renamed from: c  reason: collision with root package name */
        public final Bitmap f191c;

        /* renamed from: d  reason: collision with root package name */
        public final b f192d;

        /* renamed from: e  reason: collision with root package name */
        public PrintAttributes f193e;

        public c(String str, int i7, Bitmap bitmap, b bVar) {
            this.f189a = str;
            this.f190b = i7;
            this.f191c = bitmap;
            this.f192d = bVar;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            b bVar = this.f192d;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.f193e = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f189a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f193e, this.f190b, this.f191c, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    @w0(19)
    /* loaded from: classes.dex */
    public class d extends PrintDocumentAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final String f195a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f196b;

        /* renamed from: c  reason: collision with root package name */
        public final b f197c;

        /* renamed from: d  reason: collision with root package name */
        public final int f198d;

        /* renamed from: e  reason: collision with root package name */
        public PrintAttributes f199e;

        /* renamed from: f  reason: collision with root package name */
        public AsyncTask<Uri, Boolean, Bitmap> f200f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap f201g = null;

        /* renamed from: a3.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class AsyncTaskC0006a extends AsyncTask<Uri, Boolean, Bitmap> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CancellationSignal f203a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f204b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ PrintAttributes f205c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ PrintDocumentAdapter.LayoutResultCallback f206d;

            /* renamed from: a3.a$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0007a implements CancellationSignal.OnCancelListener {
                public C0007a() {
                }

                @Override // android.os.CancellationSignal.OnCancelListener
                public void onCancel() {
                    d.this.a();
                    AsyncTaskC0006a.this.cancel(false);
                }
            }

            public AsyncTaskC0006a(CancellationSignal cancellationSignal, PrintAttributes printAttributes, PrintAttributes printAttributes2, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback) {
                this.f203a = cancellationSignal;
                this.f204b = printAttributes;
                this.f205c = printAttributes2;
                this.f206d = layoutResultCallback;
            }

            @Override // android.os.AsyncTask
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public Bitmap doInBackground(Uri... uriArr) {
                try {
                    d dVar = d.this;
                    return a.this.i(dVar.f196b);
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public void onCancelled(Bitmap bitmap) {
                this.f206d.onLayoutCancelled();
                d.this.f200f = null;
            }

            @Override // android.os.AsyncTask
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Bitmap bitmap) {
                PrintAttributes.MediaSize mediaSize;
                super.onPostExecute(bitmap);
                if (bitmap != null && (!a.f167i || a.this.f180f == 0)) {
                    synchronized (this) {
                        mediaSize = d.this.f199e.getMediaSize();
                    }
                    if (mediaSize != null && mediaSize.isPortrait() != a.g(bitmap)) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90.0f);
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    }
                }
                d.this.f201g = bitmap;
                if (bitmap != null) {
                    this.f206d.onLayoutFinished(new PrintDocumentInfo.Builder(d.this.f195a).setContentType(1).setPageCount(1).build(), true ^ this.f204b.equals(this.f205c));
                } else {
                    this.f206d.onLayoutFailed(null);
                }
                d.this.f200f = null;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
                this.f203a.setOnCancelListener(new C0007a());
            }
        }

        public d(String str, Uri uri, b bVar, int i7) {
            this.f195a = str;
            this.f196b = uri;
            this.f197c = bVar;
            this.f198d = i7;
        }

        public void a() {
            synchronized (a.this.f177c) {
                a aVar = a.this;
                if (aVar.f176b != null) {
                    aVar.f176b = null;
                }
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            a();
            AsyncTask<Uri, Boolean, Bitmap> asyncTask = this.f200f;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            b bVar = this.f197c;
            if (bVar != null) {
                bVar.a();
            }
            Bitmap bitmap = this.f201g;
            if (bitmap != null) {
                bitmap.recycle();
                this.f201g = null;
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f199e = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f201g != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.f195a).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                this.f200f = new AsyncTaskC0006a(cancellationSignal, printAttributes2, printAttributes, layoutResultCallback).execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            a.this.r(this.f199e, this.f198d, this.f201g, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    public a(@o0 Context context) {
        this.f175a = context;
    }

    public static Bitmap a(Bitmap bitmap, int i7) {
        if (i7 != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @w0(19)
    public static PrintAttributes.Builder b(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    public static Matrix d(int i7, int i8, RectF rectF, int i9) {
        Matrix matrix = new Matrix();
        float f7 = i7;
        float width = rectF.width() / f7;
        float max = i9 == 2 ? Math.max(width, rectF.height() / i8) : Math.min(width, rectF.height() / i8);
        matrix.postScale(max, max);
        matrix.postTranslate((rectF.width() - (f7 * max)) / 2.0f, (rectF.height() - (i8 * max)) / 2.0f);
        return matrix;
    }

    public static boolean g(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    public static boolean q() {
        return true;
    }

    public int c() {
        return this.f179e;
    }

    public int e() {
        int i7 = this.f180f;
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }

    public int f() {
        return this.f178d;
    }

    public final Bitmap h(Uri uri, BitmapFactory.Options options) throws FileNotFoundException {
        Context context;
        InputStream openInputStream;
        if (uri == null || (context = this.f175a) == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        InputStream inputStream = null;
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException e7) {
                    Log.w(f165g, "close fail ", e7);
                }
            }
            return decodeStream;
        } catch (Throwable th2) {
            th = th2;
            inputStream = openInputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    Log.w(f165g, "close fail ", e8);
                }
            }
            throw th;
        }
    }

    public Bitmap i(Uri uri) throws FileNotFoundException {
        BitmapFactory.Options options;
        if (uri == null || this.f175a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        h(uri, options2);
        int i7 = options2.outWidth;
        int i8 = options2.outHeight;
        if (i7 > 0 && i8 > 0) {
            int max = Math.max(i7, i8);
            int i9 = 1;
            while (max > 3500) {
                max >>>= 1;
                i9 <<= 1;
            }
            if (i9 > 0 && Math.min(i7, i8) / i9 > 0) {
                synchronized (this.f177c) {
                    options = new BitmapFactory.Options();
                    this.f176b = options;
                    options.inMutable = true;
                    options.inSampleSize = i9;
                }
                try {
                    Bitmap h7 = h(uri, options);
                    synchronized (this.f177c) {
                        this.f176b = null;
                    }
                    return h7;
                } catch (Throwable th) {
                    synchronized (this.f177c) {
                        this.f176b = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public void j(@o0 String str, @o0 Bitmap bitmap) {
        k(str, bitmap, null);
    }

    public void k(@o0 String str, @o0 Bitmap bitmap, @q0 b bVar) {
        if (bitmap == null) {
            return;
        }
        ((PrintManager) this.f175a.getSystemService("print")).print(str, new c(str, this.f178d, bitmap, bVar), new PrintAttributes.Builder().setMediaSize(g(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f179e).build());
    }

    public void l(@o0 String str, @o0 Uri uri) throws FileNotFoundException {
        m(str, uri, null);
    }

    public void m(@o0 String str, @o0 Uri uri, @q0 b bVar) throws FileNotFoundException {
        d dVar = new d(str, uri, bVar, this.f178d);
        PrintManager printManager = (PrintManager) this.f175a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f179e);
        int i7 = this.f180f;
        if (i7 == 1 || i7 == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (i7 == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, dVar, builder.build());
    }

    public void n(int i7) {
        this.f179e = i7;
    }

    public void o(int i7) {
        this.f180f = i7;
    }

    public void p(int i7) {
        this.f178d = i7;
    }

    @w0(19)
    public void r(PrintAttributes printAttributes, int i7, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        new AsyncTaskC0005a(cancellationSignal, f168j ? printAttributes : b(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build(), bitmap, printAttributes, i7, parcelFileDescriptor, writeResultCallback).execute(new Void[0]);
    }
}