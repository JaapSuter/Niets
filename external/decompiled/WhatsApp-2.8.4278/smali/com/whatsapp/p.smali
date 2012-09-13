.class public Lcom/whatsapp/p;
.super Landroid/graphics/drawable/BitmapDrawable;
.source "p.java"


# instance fields
.field private a:F

.field private b:I

.field private c:Landroid/graphics/Paint;

.field private d:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;FLjava/lang/CharSequence;)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x1

    .line 64
    invoke-direct {p0, p1, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 39
    iput p3, p0, Lcom/whatsapp/p;->a:F

    .line 16
    iput-object p4, p0, Lcom/whatsapp/p;->d:Ljava/lang/CharSequence;

    .line 28
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/p;->c:Landroid/graphics/Paint;

    .line 71
    iget-object v0, p0, Lcom/whatsapp/p;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 15
    iget-object v0, p0, Lcom/whatsapp/p;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/p;->c:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/p;->c:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 12
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 46
    invoke-super {p0, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 32
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 33
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 52
    new-instance v2, Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/whatsapp/p;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 30
    iget-object v3, p0, Lcom/whatsapp/p;->d:Ljava/lang/CharSequence;

    if-eqz v3, :cond_2

    .line 2
    const v3, 0x41555555

    sget-object v4, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v4}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v4

    iget v4, v4, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v3, v4

    float-to-int v3, v3

    .line 50
    int-to-float v4, v3

    const/high16 v5, 0x4000

    mul-float/2addr v4, v5

    float-to-int v4, v4

    .line 22
    new-instance v5, Landroid/graphics/Path;

    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 26
    iget v6, v2, Landroid/graphics/RectF;->left:F

    iget v7, v2, Landroid/graphics/RectF;->bottom:F

    int-to-float v8, v4

    sub-float/2addr v7, v8

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 8
    iget v6, v2, Landroid/graphics/RectF;->right:F

    iget v7, v2, Landroid/graphics/RectF;->bottom:F

    int-to-float v8, v4

    sub-float/2addr v7, v8

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 36
    iget v6, v2, Landroid/graphics/RectF;->right:F

    iget v7, v2, Landroid/graphics/RectF;->bottom:F

    iget v8, p0, Lcom/whatsapp/p;->a:F

    sub-float/2addr v7, v8

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 4
    new-instance v6, Landroid/graphics/RectF;

    iget v7, v2, Landroid/graphics/RectF;->right:F

    const/high16 v8, 0x4000

    iget v9, p0, Lcom/whatsapp/p;->a:F

    mul-float/2addr v8, v9

    sub-float/2addr v7, v8

    iget v8, v2, Landroid/graphics/RectF;->bottom:F

    const/high16 v9, 0x4000

    iget v10, p0, Lcom/whatsapp/p;->a:F

    mul-float/2addr v9, v10

    sub-float/2addr v8, v9

    iget v9, v2, Landroid/graphics/RectF;->right:F

    iget v10, v2, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v6, v7, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v7, 0x0

    const/high16 v8, 0x42b4

    invoke-virtual {v5, v6, v7, v8}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 34
    iget v6, v2, Landroid/graphics/RectF;->left:F

    iget v7, p0, Lcom/whatsapp/p;->a:F

    add-float/2addr v6, v7

    iget v7, v2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 29
    new-instance v6, Landroid/graphics/RectF;

    iget v7, v2, Landroid/graphics/RectF;->left:F

    iget v8, v2, Landroid/graphics/RectF;->bottom:F

    const/high16 v9, 0x4000

    iget v10, p0, Lcom/whatsapp/p;->a:F

    mul-float/2addr v9, v10

    sub-float/2addr v8, v9

    iget v9, v2, Landroid/graphics/RectF;->left:F

    const/high16 v10, 0x4000

    iget v11, p0, Lcom/whatsapp/p;->a:F

    mul-float/2addr v10, v11

    add-float/2addr v9, v10

    iget v10, v2, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v6, v7, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v7, 0x42b4

    const/high16 v8, 0x42b4

    invoke-virtual {v5, v6, v7, v8}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 37
    iget v6, v2, Landroid/graphics/RectF;->left:F

    iget v7, v2, Landroid/graphics/RectF;->bottom:F

    int-to-float v8, v4

    sub-float/2addr v7, v8

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 35
    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    iget v6, p0, Lcom/whatsapp/p;->b:I

    const v7, 0x10100a7

    if-ne v6, v7, :cond_0

    .line 18
    const v6, -0x660f8000

    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz v0, :cond_1

    .line 3
    :cond_0
    const/high16 v6, 0x4000

    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    :cond_1
    invoke-virtual {p1, v5, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 12
    new-instance v5, Landroid/text/TextPaint;

    invoke-direct {v5}, Landroid/text/TextPaint;-><init>()V

    .line 24
    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 69
    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Landroid/text/TextPaint;->setColor(I)V

    .line 72
    int-to-float v6, v3

    invoke-virtual {v5, v6}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 41
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v5, v6}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 9
    sget-object v6, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v5, v6}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 59
    iget-object v6, p0, Lcom/whatsapp/p;->d:Ljava/lang/CharSequence;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v7

    iget v8, p0, Lcom/whatsapp/p;->a:F

    sub-float/2addr v7, v8

    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-static {v6, v5, v7, v8}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 17
    iget v7, v2, Landroid/graphics/RectF;->left:F

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v8

    const/high16 v9, 0x4000

    div-float/2addr v8, v9

    add-float/2addr v7, v8

    iget v8, v2, Landroid/graphics/RectF;->bottom:F

    sub-int v3, v4, v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float v3, v8, v3

    invoke-virtual {p1, v6, v7, v3, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 65
    :cond_2
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 43
    sget-object v3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 19
    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 31
    iget v3, v2, Landroid/graphics/RectF;->top:F

    const/high16 v4, 0x3f80

    add-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/RectF;->top:F

    .line 45
    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    const/high16 v4, 0x3f80

    add-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/RectF;->bottom:F

    .line 40
    const/high16 v3, 0x3fc0

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 38
    const v3, -0x66000001

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 62
    iget v3, p0, Lcom/whatsapp/p;->a:F

    iget v4, p0, Lcom/whatsapp/p;->a:F

    invoke-virtual {p1, v2, v3, v4, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 1
    iget v3, v2, Landroid/graphics/RectF;->top:F

    const/high16 v4, 0x3f80

    sub-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/RectF;->top:F

    .line 66
    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    const/high16 v4, 0x3f80

    sub-float/2addr v3, v4

    iput v3, v2, Landroid/graphics/RectF;->bottom:F

    .line 49
    iget v3, p0, Lcom/whatsapp/p;->b:I

    const v4, 0x10100a7

    if-ne v3, v4, :cond_3

    .line 57
    const v3, -0xf8000

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz v0, :cond_4

    .line 10
    :cond_3
    const/high16 v3, 0x6600

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    :cond_4
    iget v3, p0, Lcom/whatsapp/p;->a:F

    iget v4, p0, Lcom/whatsapp/p;->a:F

    invoke-virtual {p1, v2, v3, v4, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 56
    const/high16 v3, 0x3f80

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 7
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 54
    iget v3, p0, Lcom/whatsapp/p;->b:I

    const v4, 0x10100a7

    if-ne v3, v4, :cond_5

    .line 44
    const v3, 0x33f08000

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz v0, :cond_6

    .line 55
    :cond_5
    const/high16 v0, 0x3300

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    :cond_6
    iget v0, p0, Lcom/whatsapp/p;->a:F

    iget v3, p0, Lcom/whatsapp/p;->a:F

    invoke-virtual {p1, v2, v0, v3, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 60
    return-void
.end method

.method public isStateful()Z
    .locals 1

    .prologue
    .line 21
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

    .line 14
    iget v3, p0, Lcom/whatsapp/p;->b:I

    .line 42
    const v1, 0x10100a9

    iput v1, p0, Lcom/whatsapp/p;->b:I

    .line 67
    array-length v4, p1

    move v1, v0

    :cond_0
    if-ge v1, v4, :cond_3

    aget v5, p1, v1

    .line 70
    if-ne v5, v7, :cond_1

    .line 27
    iput v7, p0, Lcom/whatsapp/p;->b:I

    .line 20
    if-eqz v2, :cond_3

    .line 23
    :cond_1
    if-ne v5, v6, :cond_2

    .line 61
    iput v6, p0, Lcom/whatsapp/p;->b:I

    .line 13
    :cond_2
    add-int/lit8 v1, v1, 0x1

    if-eqz v2, :cond_0

    .line 47
    :cond_3
    iget v1, p0, Lcom/whatsapp/p;->b:I

    if-eq v3, v1, :cond_4

    .line 51
    invoke-virtual {p0}, Lcom/whatsapp/p;->invalidateSelf()V

    .line 48
    const/4 v0, 0x1

    .line 63
    :cond_4
    return v0
.end method
