package com.mrgames.larvaheroesfree.spritetext;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.opengl.GLUtils;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
import javax.microedition.khronos.opengles.GL11Ext;

/* JADX INFO: loaded from: classes2.dex */
public class LabelMaker {
    private static final int STATE_ADDING = 2;
    private static final int STATE_DRAWING = 3;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_NEW = 0;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private Paint mClearPaint;
    private boolean mFullColor;
    private ArrayList<Label> mLabels = new ArrayList<>();
    private int mLineHeight;
    private int mState;
    private int mStrikeHeight;
    private int mStrikeWidth;
    private float mTexelHeight;
    private float mTexelWidth;
    private int mTextureID;
    private int mU;
    private int mV;

    public LabelMaker(boolean z, int i, int i2) {
        this.mFullColor = z;
        this.mStrikeWidth = i;
        this.mStrikeHeight = i2;
        double d = i;
        Double.isNaN(d);
        this.mTexelWidth = (float) (1.0d / d);
        double d2 = i2;
        Double.isNaN(d2);
        this.mTexelHeight = (float) (1.0d / d2);
        Paint paint = new Paint();
        this.mClearPaint = paint;
        paint.setARGB(0, 0, 0, 0);
        this.mClearPaint.setStyle(Paint.Style.FILL);
        this.mState = 0;
    }

    public void initialize(GL10 gl10) {
        this.mState = 1;
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.mTextureID = i;
        gl10.glBindTexture(3553, i);
        gl10.glTexParameterf(3553, 10241, 9728.0f);
        gl10.glTexParameterf(3553, 10240, 9728.0f);
        gl10.glTexParameterf(3553, 10242, 33071.0f);
        gl10.glTexParameterf(3553, 10243, 33071.0f);
    }

    public void shutdown(GL10 gl10) {
        if (gl10 == null || this.mState <= 0) {
            return;
        }
        gl10.glDeleteTextures(1, new int[]{this.mTextureID}, 0);
        this.mState = 0;
    }

    public void beginAdding(GL10 gl10) {
        checkState(1, 2);
        this.mLabels.clear();
        this.mU = 0;
        this.mV = 0;
        this.mLineHeight = 0;
        this.mBitmap = Bitmap.createBitmap(this.mStrikeWidth, this.mStrikeHeight, this.mFullColor ? Bitmap.Config.ARGB_4444 : Bitmap.Config.ALPHA_8);
        this.mCanvas = new Canvas(this.mBitmap);
        this.mBitmap.eraseColor(0);
    }

    public int add(GL10 gl10, String str, Paint paint) {
        return add(gl10, (Drawable) null, str, paint);
    }

    public void beginDrawing(GL10 gl10, float f, float f2) {
        checkState(1, 3);
        gl10.glBindTexture(3553, this.mTextureID);
        gl10.glShadeModel(7424);
        gl10.glEnable(3042);
        gl10.glBlendFunc(770, 771);
        gl10.glColor4x(65536, 65536, 65536, 65536);
        gl10.glMatrixMode(5889);
        gl10.glPushMatrix();
        gl10.glLoadIdentity();
        gl10.glOrthof(0.0f, f, 0.0f, f2, 0.0f, 1.0f);
        gl10.glMatrixMode(5888);
        gl10.glPushMatrix();
        gl10.glLoadIdentity();
        gl10.glTranslatef(0.375f, 0.375f, 0.0f);
    }

    public int add(GL10 gl10, Drawable drawable, String str, Paint paint) {
        return add(gl10, drawable, str, paint, 0, 0);
    }

    public int add(GL10 gl10, Drawable drawable, int i, int i2) {
        return add(gl10, drawable, null, null, i, i2);
    }

    public int add(GL10 gl10, Drawable drawable, String str, Paint paint, int i, int i2) {
        int iMax;
        int iMax2;
        int iCeil;
        int iCeil2;
        int iCeil3;
        checkState(2, 2);
        boolean z = drawable != null;
        boolean z2 = (str == null || paint == null) ? false : true;
        System.out.println("add()");
        Rect rect = new Rect();
        if (z) {
            drawable.getPadding(rect);
            iMax = Math.max(i, drawable.getMinimumWidth());
            iMax2 = Math.max(i2, drawable.getMinimumHeight());
        } else {
            iMax = i;
            iMax2 = i2;
        }
        if (z2) {
            iCeil = (int) Math.ceil(-paint.ascent());
            iCeil2 = (int) Math.ceil(paint.descent());
            iCeil3 = (int) Math.ceil(paint.measureText(str));
        } else {
            iCeil = 0;
            iCeil2 = 0;
            iCeil3 = 0;
        }
        int i3 = iCeil2 + iCeil;
        int iMin = Math.min(this.mStrikeWidth, iCeil3);
        int i4 = rect.top + rect.bottom;
        int i5 = rect.left + rect.right;
        int iMax3 = Math.max(iMax2, i3 + i4);
        int iMax4 = Math.max(iMax, iMin + i5);
        int i6 = ((iMax3 - i4) - i3) / 2;
        int i7 = ((iMax4 - i5) - iMin) / 2;
        int i8 = this.mU;
        int i9 = this.mV;
        int i10 = this.mLineHeight;
        int i11 = this.mStrikeWidth;
        if (iMax4 > i11) {
            iMax4 = i11;
        }
        if (i8 + iMax4 > i11) {
            i9 += i10;
            i8 = 0;
            i10 = 0;
        }
        int iMax5 = Math.max(i10, iMax3);
        if (i9 + iMax5 > this.mStrikeHeight) {
            throw new IllegalArgumentException("Out of texture space.");
        }
        int i12 = i8 + iMax4;
        int i13 = i9 + iCeil;
        int i14 = iCeil;
        int i15 = i9 + iMax3;
        if (z) {
            drawable.setBounds(i8, i9, i12, i15);
            drawable.draw(this.mCanvas);
        }
        if (z2) {
            this.mCanvas.drawText(str, rect.left + i8 + i7, i13 + rect.top + i6, paint);
        }
        this.mU = i12;
        this.mV = i9;
        this.mLineHeight = iMax5;
        this.mLabels.add(new Label(iMax4, iMax3, i14, i8, i15, iMax4, -iMax3));
        return this.mLabels.size() - 1;
    }

    public void endAdding(GL10 gl10) {
        checkState(2, 1);
        gl10.glBindTexture(3553, this.mTextureID);
        GLUtils.texImage2D(3553, 0, this.mBitmap, 0);
        this.mBitmap.recycle();
        this.mBitmap = null;
        this.mCanvas = null;
    }

    public float getWidth(int i) {
        return this.mLabels.get(i).width;
    }

    public float getHeight(int i) {
        return this.mLabels.get(i).height;
    }

    public float getBaseline(int i) {
        return this.mLabels.get(i).baseline;
    }

    public void draw(GL10 gl10, float f, float f2, int i) {
        checkState(3, 3);
        Label label = this.mLabels.get(i);
        gl10.glEnable(3553);
        ((GL11) gl10).glTexParameteriv(3553, 35741, label.mCrop, 0);
        ((GL11Ext) gl10).glDrawTexiOES((int) f, (int) f2, 0, (int) label.width, (int) label.height);
    }

    public void endDrawing(GL10 gl10) {
        checkState(3, 1);
        gl10.glMatrixMode(5889);
        gl10.glPopMatrix();
        gl10.glMatrixMode(5888);
        gl10.glPopMatrix();
    }

    private void checkState(int i, int i2) {
        if (this.mState != i) {
            throw new IllegalArgumentException("Can't call this method now.");
        }
        this.mState = i2;
    }

    private static class Label {
        public float baseline;
        public float height;
        public int[] mCrop;
        public float width;

        public Label(float f, float f2, float f3, int i, int i2, int i3, int i4) {
            this.width = f;
            this.height = f2;
            this.baseline = f3;
            this.mCrop = new int[]{i, i2, i3, i4};
        }
    }
}
