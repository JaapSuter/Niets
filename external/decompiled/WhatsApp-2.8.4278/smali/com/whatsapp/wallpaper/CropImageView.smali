.class public Lcom/whatsapp/wallpaper/CropImageView;
.super Lcom/whatsapp/wallpaper/ImageViewTouchBase;
.source "CropImageView.java"


# instance fields
.field cropByOutputSize:Z

.field isRecycle:Z

.field mHighlightViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/wallpaper/f;",
            ">;"
        }
    .end annotation
.end field

.field mLastX:F

.field mLastY:F

.field mMotionEdge:I

.field mMotionHighlightView:Lcom/whatsapp/wallpaper/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->isRecycle:Z

    .line 46
    return-void
.end method

.method private a(Landroid/view/MotionEvent;)V
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x1

    sget-boolean v2, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 2
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->clearFocus()V

    .line 62
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 42
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/f;

    .line 93
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/whatsapp/wallpaper/f;->a(FF)I

    move-result v3

    .line 5
    if-eq v3, v5, :cond_0

    .line 101
    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/f;->b()Z

    move-result v3

    if-nez v3, :cond_1

    .line 100
    invoke-virtual {v0, v5}, Lcom/whatsapp/wallpaper/f;->a(Z)V

    .line 113
    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/f;->e()V

    if-eqz v2, :cond_1

    .line 39
    :cond_0
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_2

    .line 80
    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->invalidate()V

    .line 32
    return-void

    :cond_2
    move v1, v0

    goto :goto_0
.end method

.method private a(Lcom/whatsapp/wallpaper/f;)V
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x0

    .line 114
    iget-object v1, p1, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    .line 84
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getLeft()I

    move-result v0

    iget v2, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v2

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 53
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getRight()I

    move-result v0

    iget v3, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v3

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 96
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getTop()I

    move-result v0

    iget v4, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v4

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 50
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getBottom()I

    move-result v4

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int v1, v4, v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 115
    if-eqz v2, :cond_2

    .line 120
    :goto_0
    if-eqz v0, :cond_3

    .line 30
    :goto_1
    if-nez v2, :cond_0

    if-eqz v0, :cond_1

    .line 76
    :cond_0
    int-to-float v1, v2

    int-to-float v0, v0

    invoke-virtual {p0, v1, v0}, Lcom/whatsapp/wallpaper/CropImageView;->b(FF)V

    .line 69
    :cond_1
    return-void

    :cond_2
    move v2, v3

    .line 115
    goto :goto_0

    :cond_3
    move v0, v1

    .line 120
    goto :goto_1
.end method

.method private b(Lcom/whatsapp/wallpaper/f;)V
    .locals 7
    .parameter

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    const v4, 0x3f19999a

    .line 91
    iget-object v0, p1, Lcom/whatsapp/wallpaper/f;->d:Landroid/graphics/Rect;

    .line 16
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    .line 10
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    .line 58
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    .line 107
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    .line 12
    div-float v1, v2, v1

    mul-float/2addr v1, v4

    .line 7
    div-float v0, v3, v0

    mul-float/2addr v0, v4

    .line 99
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 112
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->c()F

    move-result v1

    mul-float/2addr v0, v1

    .line 111
    const/high16 v1, 0x3f80

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 110
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->c()F

    move-result v1

    sub-float v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    div-float/2addr v1, v0

    float-to-double v1, v1

    const-wide v3, 0x3fb999999999999aL

    cmpl-double v1, v1, v3

    if-lez v1, :cond_0

    .line 49
    const/4 v1, 0x2

    new-array v1, v1, [F

    iget-object v2, p1, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v2

    aput v2, v1, v5

    iget-object v2, p1, Lcom/whatsapp/wallpaper/f;->f:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    aput v2, v1, v6

    .line 118
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 57
    aget v2, v1, v5

    aget v1, v1, v6

    const/high16 v3, 0x4396

    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/whatsapp/wallpaper/CropImageView;->a(FFFF)V

    .line 68
    :cond_0
    invoke-direct {p0, p1}, Lcom/whatsapp/wallpaper/CropImageView;->a(Lcom/whatsapp/wallpaper/f;)V

    .line 18
    return-void
.end method


# virtual methods
.method protected a(FF)V
    .locals 4
    .parameter
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 56
    invoke-super {p0, p1, p2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(FF)V

    .line 71
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/f;

    .line 87
    iget-object v3, v0, Lcom/whatsapp/wallpaper/f;->g:Landroid/graphics/Matrix;

    invoke-virtual {v3, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 4
    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/f;->e()V

    .line 119
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_1

    .line 33
    :cond_0
    return-void

    :cond_1
    move v1, v0

    goto :goto_0
.end method

.method protected a(FFF)V
    .locals 5
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 15
    invoke-super {p0, p1, p2, p3}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(FFF)V

    .line 21
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/f;

    .line 102
    iget-object v3, v0, Lcom/whatsapp/wallpaper/f;->g:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 55
    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/f;->e()V

    if-eqz v1, :cond_0

    .line 79
    :cond_1
    return-void
.end method

.method public c(Lcom/whatsapp/wallpaper/f;)V
    .locals 1
    .parameter

    .prologue
    .line 104
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->invalidate()V

    .line 6
    return-void
.end method

.method public clearFocus()V
    .locals 4

    .prologue
    const/4 v2, 0x0

    sget-boolean v3, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    move v1, v2

    .line 109
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/f;

    .line 19
    invoke-virtual {v0, v2}, Lcom/whatsapp/wallpaper/f;->a(Z)V

    .line 60
    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/f;->e()V

    .line 78
    add-int/lit8 v0, v1, 0x1

    if-eqz v3, :cond_1

    .line 31
    :cond_0
    return-void

    :cond_1
    move v1, v0

    goto :goto_0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 97
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->isRecycle:Z

    if-nez v0, :cond_0

    .line 108
    invoke-super {p0, p1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->onDraw(Landroid/graphics/Canvas;)V

    .line 17
    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 24
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/f;

    invoke-virtual {v0, p1}, Lcom/whatsapp/wallpaper/f;->a(Landroid/graphics/Canvas;)V

    .line 94
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_2

    .line 28
    :cond_1
    return-void

    :cond_2
    move v1, v0

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 5
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 72
    invoke-super/range {p0 .. p5}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->onLayout(ZIIII)V

    .line 37
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mBitmapDisplayed:Lcom/whatsapp/wallpaper/k;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/k;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 34
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/f;

    .line 83
    iget-object v3, v0, Lcom/whatsapp/wallpaper/f;->g:Landroid/graphics/Matrix;

    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 1
    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/f;->e()V

    .line 26
    iget-boolean v3, v0, Lcom/whatsapp/wallpaper/f;->b:Z

    if-eqz v3, :cond_1

    .line 73
    invoke-direct {p0, v0}, Lcom/whatsapp/wallpaper/CropImageView;->b(Lcom/whatsapp/wallpaper/f;)V

    :cond_1
    if-eqz v1, :cond_0

    .line 8
    :cond_2
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8
    .parameter

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x1

    sget-boolean v5, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 40
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/CropImage;

    .line 38
    iget-boolean v1, v0, Lcom/whatsapp/wallpaper/CropImage;->n:Z

    if-eqz v1, :cond_0

    .line 89
    :goto_0
    return v3

    .line 86
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 61
    :cond_1
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    :cond_2
    :goto_2
    move v3, v4

    .line 74
    goto :goto_0

    :pswitch_0
    move v2, v3

    .line 14
    :goto_3
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_4

    .line 103
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/wallpaper/f;

    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    invoke-virtual {v1, v6, v7}, Lcom/whatsapp/wallpaper/f;->a(FF)I

    move-result v6

    .line 52
    if-eq v6, v4, :cond_3

    .line 85
    iput v6, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionEdge:I

    .line 29
    iput-object v1, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, p0, Lcom/whatsapp/wallpaper/CropImageView;->mLastX:F

    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, p0, Lcom/whatsapp/wallpaper/CropImageView;->mLastY:F

    .line 35
    iget-object v7, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    const/16 v1, 0x20

    if-ne v6, v1, :cond_5

    sget-object v1, Lcom/whatsapp/wallpaper/c;->b:Lcom/whatsapp/wallpaper/c;

    :goto_4
    invoke-virtual {v7, v1}, Lcom/whatsapp/wallpaper/f;->a(Lcom/whatsapp/wallpaper/c;)V

    .line 88
    invoke-direct {p0, p1}, Lcom/whatsapp/wallpaper/CropImageView;->a(Landroid/view/MotionEvent;)V

    .line 43
    if-eqz v5, :cond_4

    .line 117
    :cond_3
    add-int/lit8 v1, v2, 0x1

    if-eqz v5, :cond_a

    .line 105
    :cond_4
    if-eqz v5, :cond_1

    :pswitch_1
    move v2, v3

    .line 98
    :goto_5
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_7

    .line 63
    iget-object v1, p0, Lcom/whatsapp/wallpaper/CropImageView;->mHighlightViews:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/wallpaper/f;

    .line 70
    iput-object v1, v0, Lcom/whatsapp/wallpaper/CropImage;->r:Lcom/whatsapp/wallpaper/f;

    .line 45
    invoke-virtual {v1}, Lcom/whatsapp/wallpaper/f;->b()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 48
    invoke-virtual {v1, v3}, Lcom/whatsapp/wallpaper/f;->a(Z)V

    .line 95
    invoke-virtual {v1}, Lcom/whatsapp/wallpaper/f;->e()V

    .line 22
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->invalidate()V

    .line 77
    invoke-direct {p0, v1}, Lcom/whatsapp/wallpaper/CropImageView;->b(Lcom/whatsapp/wallpaper/f;)V

    move v3, v4

    .line 64
    goto :goto_0

    .line 35
    :cond_5
    sget-object v1, Lcom/whatsapp/wallpaper/c;->c:Lcom/whatsapp/wallpaper/c;

    goto :goto_4

    .line 106
    :cond_6
    add-int/lit8 v1, v2, 0x1

    if-eqz v5, :cond_9

    .line 66
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    if-eqz v0, :cond_8

    .line 9
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    invoke-direct {p0, v0}, Lcom/whatsapp/wallpaper/CropImageView;->b(Lcom/whatsapp/wallpaper/f;)V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    sget-object v1, Lcom/whatsapp/wallpaper/c;->a:Lcom/whatsapp/wallpaper/c;

    invoke-virtual {v0, v1}, Lcom/whatsapp/wallpaper/f;->a(Lcom/whatsapp/wallpaper/c;)V

    .line 20
    :cond_8
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    .line 92
    if-eqz v5, :cond_1

    .line 82
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    if-eqz v0, :cond_1

    .line 23
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    iget v1, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionEdge:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget v3, p0, Lcom/whatsapp/wallpaper/CropImageView;->mLastX:F

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iget v6, p0, Lcom/whatsapp/wallpaper/CropImageView;->mLastY:F

    sub-float/2addr v3, v6

    invoke-virtual {v0, v1, v2, v3}, Lcom/whatsapp/wallpaper/f;->a(IFF)V

    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mLastX:F

    .line 59
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mLastY:F

    .line 75
    iget-object v0, p0, Lcom/whatsapp/wallpaper/CropImageView;->mMotionHighlightView:Lcom/whatsapp/wallpaper/f;

    invoke-direct {p0, v0}, Lcom/whatsapp/wallpaper/CropImageView;->a(Lcom/whatsapp/wallpaper/f;)V

    goto/16 :goto_1

    .line 51
    :pswitch_3
    invoke-virtual {p0, v4, v4}, Lcom/whatsapp/wallpaper/CropImageView;->a(ZZ)V

    .line 3
    if-eqz v5, :cond_2

    .line 47
    :pswitch_4
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/CropImageView;->c()F

    move-result v0

    const/high16 v1, 0x3f80

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 90
    invoke-virtual {p0, v4, v4}, Lcom/whatsapp/wallpaper/CropImageView;->a(ZZ)V

    goto/16 :goto_2

    :cond_9
    move v2, v1

    goto/16 :goto_5

    :cond_a
    move v2, v1

    goto/16 :goto_3

    .line 86
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 61
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
