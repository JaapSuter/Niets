.class public Lcom/whatsapp/o;
.super Landroid/graphics/drawable/BitmapDrawable;
.source "o.java"


# instance fields
.field private a:F

.field private b:F

.field private c:Landroid/graphics/drawable/Drawable;

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:I

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 60
    invoke-static {p1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->M:F

    invoke-static {p1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->N:F

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;FF)V

    .line 64
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap;FF)V
    .locals 5
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 65
    iput p3, p0, Lcom/whatsapp/o;->a:F

    .line 63
    iput p4, p0, Lcom/whatsapp/o;->b:F

    .line 15
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-direct {v0, v4, v4, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/whatsapp/o;->h:Landroid/graphics/Rect;

    .line 49
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/o;->g:Landroid/graphics/Paint;

    .line 32
    iget-object v0, p0, Lcom/whatsapp/o;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 40
    iget-object v0, p0, Lcom/whatsapp/o;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setDither(Z)V

    .line 55
    iget-object v0, p0, Lcom/whatsapp/o;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 50
    iget-object v0, p0, Lcom/whatsapp/o;->g:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 29
    const v1, 0x7f0203db

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/o;->c:Landroid/graphics/drawable/Drawable;

    .line 30
    const v1, 0x7f0203dc

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/o;->e:Landroid/graphics/drawable/Drawable;

    .line 21
    const v1, 0x7f0203dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/o;->d:Landroid/graphics/drawable/Drawable;

    .line 41
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .prologue
    .line 9
    iget v0, p0, Lcom/whatsapp/o;->a:F

    return v0
.end method

.method public a(F)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput p1, p0, Lcom/whatsapp/o;->b:F

    .line 36
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 7
    .parameter

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 54
    invoke-virtual {p0}, Lcom/whatsapp/o;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    :goto_0
    return-void

    .line 3
    :cond_0
    iget v0, p0, Lcom/whatsapp/o;->a:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 35
    invoke-super {p0, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 27
    :cond_1
    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/whatsapp/o;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 4
    const/16 v1, 0x1f

    invoke-virtual {p1, v0, v6, v1}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    move-result v1

    .line 25
    invoke-virtual {p1, v5, v5, v5, v5}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 61
    iget v2, p0, Lcom/whatsapp/o;->a:F

    iget v3, p0, Lcom/whatsapp/o;->a:F

    iget-object v4, p0, Lcom/whatsapp/o;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 10
    iget-object v2, p0, Lcom/whatsapp/o;->g:Landroid/graphics/Paint;

    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 39
    invoke-virtual {p0}, Lcom/whatsapp/o;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    iget-object v3, p0, Lcom/whatsapp/o;->h:Landroid/graphics/Rect;

    iget-object v4, p0, Lcom/whatsapp/o;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3, v0, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 28
    iget-object v0, p0, Lcom/whatsapp/o;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 13
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 59
    new-instance v1, Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/whatsapp/o;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 38
    iget-object v2, p0, Lcom/whatsapp/o;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 6
    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->top:I

    .line 43
    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    .line 12
    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->left:I

    .line 53
    iget v2, v1, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v0, v2

    iput v0, v1, Landroid/graphics/Rect;->right:I

    .line 37
    iget v0, p0, Lcom/whatsapp/o;->f:I

    const v2, 0x10100a7

    if-ne v0, v2, :cond_2

    .line 16
    iget-object v0, p0, Lcom/whatsapp/o;->e:Landroid/graphics/drawable/Drawable;

    .line 44
    :goto_1
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 2
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 48
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto/16 :goto_0

    .line 17
    :cond_2
    iget v0, p0, Lcom/whatsapp/o;->f:I

    const v2, 0x101009c

    if-ne v0, v2, :cond_3

    .line 18
    iget-object v0, p0, Lcom/whatsapp/o;->d:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    .line 42
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/o;->c:Landroid/graphics/drawable/Drawable;

    goto :goto_1
.end method

.method public getIntrinsicHeight()I
    .locals 2

    .prologue
    .line 57
    invoke-super {p0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/whatsapp/o;->b:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 2

    .prologue
    .line 46
    invoke-super {p0}, Landroid/graphics/drawable/BitmapDrawable;->getIntrinsicWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/whatsapp/o;->b:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public isStateful()Z
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x1

    return v0
.end method

.method public setState([I)Z
    .locals 8
    .parameter

    .prologue
    const v7, 0x10100a7

    const v6, 0x101009c

    const/4 v0, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 11
    iget v3, p0, Lcom/whatsapp/o;->f:I

    .line 34
    const v1, 0x10100a9

    iput v1, p0, Lcom/whatsapp/o;->f:I

    .line 7
    array-length v4, p1

    move v1, v0

    :cond_0
    if-ge v1, v4, :cond_3

    aget v5, p1, v1

    .line 47
    if-ne v5, v7, :cond_1

    .line 8
    iput v7, p0, Lcom/whatsapp/o;->f:I

    .line 26
    if-eqz v2, :cond_3

    .line 22
    :cond_1
    if-ne v5, v6, :cond_2

    .line 23
    iput v6, p0, Lcom/whatsapp/o;->f:I

    .line 14
    :cond_2
    add-int/lit8 v1, v1, 0x1

    if-eqz v2, :cond_0

    .line 62
    :cond_3
    iget v1, p0, Lcom/whatsapp/o;->f:I

    if-eq v3, v1, :cond_4

    .line 56
    invoke-virtual {p0}, Lcom/whatsapp/o;->invalidateSelf()V

    .line 58
    const/4 v0, 0x1

    :cond_4
    return v0
.end method
