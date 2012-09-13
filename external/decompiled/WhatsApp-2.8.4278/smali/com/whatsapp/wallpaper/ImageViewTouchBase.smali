.class public abstract Lcom/whatsapp/wallpaper/ImageViewTouchBase;
.super Landroid/widget/ImageView;
.source "ImageViewTouchBase.java"


# static fields
.field static final SCALE_RATE:F = 1.25f

.field public static a:Z


# instance fields
.field protected mBaseMatrix:Landroid/graphics/Matrix;

.field protected final mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

.field public mDisplayMatrix:Landroid/graphics/Matrix;

.field protected mHandler:Landroid/os/Handler;

.field protected mLastXTouchPos:I

.field protected mLastYTouchPos:I

.field private final mMatrixValues:[F

.field protected mMaxZoom:F

.field private mOnLayoutRunnable:Ljava/lang/Runnable;

.field private mRecycler:Lcom/whatsapp/wallpaper/i;

.field protected mSuppMatrix:Landroid/graphics/Matrix;

.field mThisHeight:I

.field mThisWidth:I

.field private maxProperScale:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 101
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 59
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBaseMatrix:Landroid/graphics/Matrix;

    .line 11
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mSuppMatrix:Landroid/graphics/Matrix;

    .line 151
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mDisplayMatrix:Landroid/graphics/Matrix;

    .line 139
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mMatrixValues:[F

    .line 79
    new-instance v0, Lcom/whatsapp/wallpaper/k;

    invoke-direct {v0, v2}, Lcom/whatsapp/wallpaper/k;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    .line 68
    iput v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mThisWidth:I

    iput v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mThisHeight:I

    .line 86
    const/high16 v0, 0x4040

    iput v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->maxProperScale:F

    .line 105
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mHandler:Landroid/os/Handler;

    .line 136
    iput-object v2, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mOnLayoutRunnable:Ljava/lang/Runnable;

    .line 8
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->b()V

    .line 150
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x0

    const/4 v1, -0x1

    .line 27
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBaseMatrix:Landroid/graphics/Matrix;

    .line 78
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mSuppMatrix:Landroid/graphics/Matrix;

    .line 31
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mDisplayMatrix:Landroid/graphics/Matrix;

    .line 152
    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mMatrixValues:[F

    .line 43
    new-instance v0, Lcom/whatsapp/wallpaper/k;

    invoke-direct {v0, v2}, Lcom/whatsapp/wallpaper/k;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    .line 126
    iput v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mThisWidth:I

    iput v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mThisHeight:I

    .line 102
    const/high16 v0, 0x4040

    iput v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->maxProperScale:F

    .line 45
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mHandler:Landroid/os/Handler;

    .line 85
    iput-object v2, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mOnLayoutRunnable:Ljava/lang/Runnable;

    .line 94
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->b()V

    .line 147
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;I)V
    .locals 2
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x1

    .line 74
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 15
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 140
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v1, p1}, Lcom/whatsapp/wallpaper/k;->a(Landroid/graphics/Bitmap;)V

    .line 143
    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v1, p2}, Lcom/whatsapp/wallpaper/k;->a(I)V

    .line 38
    if-eqz v0, :cond_1

    if-eq v0, p1, :cond_1

    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mRecycler:Lcom/whatsapp/wallpaper/i;

    if-eqz v1, :cond_1

    .line 118
    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mRecycler:Lcom/whatsapp/wallpaper/i;

    invoke-interface {v1, v0}, Lcom/whatsapp/wallpaper/i;->a(Landroid/graphics/Bitmap;)V

    .line 23
    :cond_1
    return-void
.end method

.method private a(Lcom/whatsapp/wallpaper/k;Landroid/graphics/Matrix;)V
    .locals 8
    .parameter
    .parameter

    .prologue
    const/high16 v7, 0x4000

    .line 110
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->getWidth()I

    move-result v0

    int-to-float v0, v0

    .line 20
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->getHeight()I

    move-result v1

    int-to-float v1, v1

    .line 72
    invoke-virtual {p1}, Lcom/whatsapp/wallpaper/k;->f()I

    move-result v2

    int-to-float v2, v2

    .line 106
    invoke-virtual {p1}, Lcom/whatsapp/wallpaper/k;->e()I

    move-result v3

    int-to-float v3, v3

    .line 87
    invoke-virtual {p2}, Landroid/graphics/Matrix;->reset()V

    .line 138
    div-float v4, v0, v2

    iget v5, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->maxProperScale:F

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 2
    div-float v5, v1, v3

    iget v6, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->maxProperScale:F

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 98
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 97
    invoke-virtual {p1}, Lcom/whatsapp/wallpaper/k;->c()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-virtual {p2, v5}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 53
    invoke-virtual {p2, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 146
    mul-float/2addr v2, v4

    sub-float/2addr v0, v2

    div-float/2addr v0, v7

    mul-float v2, v3, v4

    sub-float/2addr v1, v2

    div-float/2addr v1, v7

    invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 16
    return-void
.end method

.method private b()V
    .locals 1

    .prologue
    .line 55
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 145
    return-void
.end method


# virtual methods
.method protected a(Landroid/graphics/Matrix;)F
    .locals 1
    .parameter

    .prologue
    .line 134
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(Landroid/graphics/Matrix;I)F

    move-result v0

    return v0
.end method

.method protected a(Landroid/graphics/Matrix;I)F
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 75
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mMatrixValues:[F

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->getValues([F)V

    .line 17
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mMatrixValues:[F

    aget v0, v0, p2

    return v0
.end method

.method public a()V
    .locals 2

    .prologue
    .line 71
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(Landroid/graphics/Bitmap;Z)V

    .line 41
    return-void
.end method

.method public a(F)V
    .locals 0
    .parameter

    .prologue
    .line 49
    iput p1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->maxProperScale:F

    .line 104
    return-void
.end method

.method protected a(FF)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 26
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mSuppMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 70
    return-void
.end method

.method protected a(FFF)V
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x1

    .line 153
    iget v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mMaxZoom:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 127
    iget p1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mMaxZoom:F

    .line 113
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->c()F

    move-result v0

    .line 36
    div-float v0, p1, v0

    .line 137
    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mSuppMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0, v0, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 123
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 77
    invoke-virtual {p0, v2, v2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(ZZ)V

    .line 82
    return-void
.end method

.method protected a(FFFF)V
    .locals 10
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 144
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->c()F

    move-result v0

    sub-float v0, p1, v0

    div-float v6, v0, p4

    .line 76
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->c()F

    move-result v5

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 66
    iget-object v9, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/whatsapp/wallpaper/h;

    move-object v1, p0

    move v2, p4

    move v7, p2

    move v8, p3

    invoke-direct/range {v0 .. v8}, Lcom/whatsapp/wallpaper/h;-><init>(Lcom/whatsapp/wallpaper/ImageViewTouchBase;FJFFFF)V

    invoke-virtual {v9, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;Z)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 115
    new-instance v0, Lcom/whatsapp/wallpaper/k;

    invoke-direct {v0, p1}, Lcom/whatsapp/wallpaper/k;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0, p2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(Lcom/whatsapp/wallpaper/k;Z)V

    .line 120
    return-void
.end method

.method public a(Lcom/whatsapp/wallpaper/i;)V
    .locals 0
    .parameter

    .prologue
    .line 58
    iput-object p1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mRecycler:Lcom/whatsapp/wallpaper/i;

    .line 103
    return-void
.end method

.method public a(Lcom/whatsapp/wallpaper/k;Z)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->getWidth()I

    move-result v0

    .line 133
    if-gtz v0, :cond_0

    .line 35
    new-instance v0, Lcom/whatsapp/wallpaper/g;

    invoke-direct {v0, p0, p1, p2}, Lcom/whatsapp/wallpaper/g;-><init>(Lcom/whatsapp/wallpaper/ImageViewTouchBase;Lcom/whatsapp/wallpaper/k;Z)V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mOnLayoutRunnable:Ljava/lang/Runnable;

    .line 51
    :goto_0
    return-void

    .line 14
    :cond_0
    invoke-virtual {p1}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 111
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBaseMatrix:Landroid/graphics/Matrix;

    invoke-direct {p0, p1, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(Lcom/whatsapp/wallpaper/k;Landroid/graphics/Matrix;)V

    .line 128
    invoke-virtual {p1}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whatsapp/wallpaper/k;->a()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(Landroid/graphics/Bitmap;I)V

    sget-boolean v0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    if-eqz v0, :cond_2

    .line 142
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBaseMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 121
    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 9
    :cond_2
    if-eqz p2, :cond_3

    .line 122
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mSuppMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 37
    :cond_3
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 114
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->e()F

    move-result v0

    iput v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mMaxZoom:F

    goto :goto_0
.end method

.method protected a(ZZ)V
    .locals 8
    .parameter
    .parameter

    .prologue
    const/high16 v7, 0x4000

    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 3
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    .line 56
    :goto_0
    return-void

    .line 124
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->d()Landroid/graphics/Matrix;

    move-result-object v0

    .line 109
    new-instance v4, Landroid/graphics/RectF;

    iget-object v2, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v2}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget-object v5, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v5}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-direct {v4, v1, v1, v2, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 7
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 96
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v0

    .line 46
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    move-result v5

    .line 57
    if-eqz p2, :cond_8

    .line 22
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->getHeight()I

    move-result v2

    .line 62
    int-to-float v6, v2

    cmpg-float v6, v0, v6

    if-gez v6, :cond_7

    .line 135
    int-to-float v6, v2

    sub-float v0, v6, v0

    div-float/2addr v0, v7

    iget v6, v4, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v6

    if-eqz v3, :cond_6

    .line 33
    :goto_1
    iget v6, v4, Landroid/graphics/RectF;->top:F

    cmpl-float v6, v6, v1

    if-lez v6, :cond_1

    .line 12
    iget v0, v4, Landroid/graphics/RectF;->top:F

    neg-float v0, v0

    if-eqz v3, :cond_6

    .line 130
    :cond_1
    iget v6, v4, Landroid/graphics/RectF;->bottom:F

    int-to-float v2, v2

    cmpg-float v2, v6, v2

    if-gez v2, :cond_6

    .line 1
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v2, v4, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v0, v2

    move v2, v0

    .line 61
    :goto_2
    if-eqz p1, :cond_5

    .line 48
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->getWidth()I

    move-result v6

    .line 42
    int-to-float v0, v6

    cmpg-float v0, v5, v0

    if-gez v0, :cond_4

    .line 80
    int-to-float v0, v6

    sub-float/2addr v0, v5

    div-float/2addr v0, v7

    iget v5, v4, Landroid/graphics/RectF;->left:F

    sub-float/2addr v0, v5

    if-eqz v3, :cond_3

    .line 19
    :goto_3
    iget v5, v4, Landroid/graphics/RectF;->left:F

    cmpl-float v1, v5, v1

    if-lez v1, :cond_2

    .line 52
    iget v0, v4, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    if-eqz v3, :cond_3

    .line 131
    :cond_2
    iget v1, v4, Landroid/graphics/RectF;->right:F

    int-to-float v3, v6

    cmpg-float v1, v1, v3

    if-gez v1, :cond_3

    .line 141
    int-to-float v0, v6

    iget v1, v4, Landroid/graphics/RectF;->right:F

    sub-float/2addr v0, v1

    .line 119
    :cond_3
    :goto_4
    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(FF)V

    .line 90
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    goto/16 :goto_0

    :cond_4
    move v0, v1

    goto :goto_3

    :cond_5
    move v0, v1

    goto :goto_4

    :cond_6
    move v2, v0

    goto :goto_2

    :cond_7
    move v0, v1

    goto :goto_1

    :cond_8
    move v2, v1

    goto :goto_2
.end method

.method protected b(F)V
    .locals 3
    .parameter

    .prologue
    const/high16 v2, 0x4000

    .line 116
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v2

    .line 4
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v2

    .line 89
    invoke-virtual {p0, p1, v0, v1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(FFF)V

    .line 81
    return-void
.end method

.method public b(FF)V
    .locals 2
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 6
    cmpl-float v0, p1, v1

    if-nez v0, :cond_0

    cmpl-float v0, p2, v1

    if-eqz v0, :cond_1

    .line 149
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(FF)V

    .line 107
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 34
    :cond_1
    return-void
.end method

.method public c()F
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mSuppMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(Landroid/graphics/Matrix;)F

    move-result v0

    return v0
.end method

.method public d()Landroid/graphics/Matrix;
    .locals 2

    .prologue
    .line 44
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mDisplayMatrix:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBaseMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 88
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mDisplayMatrix:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mSuppMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 47
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mDisplayMatrix:Landroid/graphics/Matrix;

    return-object v0
.end method

.method protected e()F
    .locals 4

    .prologue
    const/high16 v0, 0x3f80

    .line 95
    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v1}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    if-nez v1, :cond_0

    .line 148
    :goto_0
    return v0

    .line 64
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v1}, Lcom/whatsapp/wallpaper/k;->f()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mThisWidth:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 28
    iget-object v2, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v2}, Lcom/whatsapp/wallpaper/k;->e()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mThisHeight:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 92
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    const/high16 v2, 0x4080

    mul-float/2addr v1, v2

    .line 84
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2
    .parameter
    .parameter

    .prologue
    const/high16 v1, 0x3f80

    .line 129
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->c()F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 39
    invoke-virtual {p0, v1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->b(F)V

    .line 25
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 13
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 132
    invoke-super/range {p0 .. p5}, Landroid/widget/ImageView;->onLayout(ZIIII)V

    .line 117
    sub-int v0, p4, p2

    iput v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mThisWidth:I

    .line 99
    sub-int v0, p5, p3

    iput v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mThisHeight:I

    .line 24
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mOnLayoutRunnable:Ljava/lang/Runnable;

    .line 91
    if-eqz v0, :cond_0

    .line 100
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mOnLayoutRunnable:Ljava/lang/Runnable;

    .line 73
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->mBaseMatrix:Landroid/graphics/Matrix;

    invoke-direct {p0, v0, v1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(Lcom/whatsapp/wallpaper/k;Landroid/graphics/Matrix;)V

    .line 69
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->d()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 112
    :cond_1
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1
    .parameter

    .prologue
    .line 108
    if-nez p1, :cond_0

    .line 67
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    sget-boolean v0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    if-eqz v0, :cond_1

    .line 50
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(Landroid/graphics/Bitmap;Z)V

    .line 93
    :cond_1
    return-void
.end method
