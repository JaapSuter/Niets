.class public Lcom/whatsapp/VideoBitmapDrawable;
.super Lcom/whatsapp/o;
.source "VideoBitmapDrawable.java"


# static fields
.field private static cameraOverlay:Landroid/graphics/Bitmap;


# instance fields
.field private textPaint:Landroid/text/TextPaint;

.field private videoSize:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;F)V
    .locals 4
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 2
    invoke-static {p1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->N:F

    invoke-direct {p0, p1, p2, p4, v0}, Lcom/whatsapp/o;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;FF)V

    .line 18
    iput-object p3, p0, Lcom/whatsapp/VideoBitmapDrawable;->videoSize:Ljava/lang/String;

    .line 16
    sget-object v0, Lcom/whatsapp/VideoBitmapDrawable;->cameraOverlay:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 28
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 42
    iput-boolean v3, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 39
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020039

    invoke-static {v1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/VideoBitmapDrawable;->cameraOverlay:Landroid/graphics/Bitmap;

    .line 29
    sget-object v0, Lcom/whatsapp/VideoBitmapDrawable;->cameraOverlay:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v3}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 21
    :cond_0
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/VideoBitmapDrawable;->textPaint:Landroid/text/TextPaint;

    .line 35
    iget-object v0, p0, Lcom/whatsapp/VideoBitmapDrawable;->textPaint:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 10
    iget-object v0, p0, Lcom/whatsapp/VideoBitmapDrawable;->textPaint:Landroid/text/TextPaint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 25
    iget-object v0, p0, Lcom/whatsapp/VideoBitmapDrawable;->textPaint:Landroid/text/TextPaint;

    invoke-static {p1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->C:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/VideoBitmapDrawable;->textPaint:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 41
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 13
    .parameter

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/high16 v12, 0x42b4

    const/high16 v11, 0x4000

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 30
    invoke-super {p0, p1}, Lcom/whatsapp/o;->draw(Landroid/graphics/Canvas;)V

    .line 11
    invoke-virtual {p0}, Lcom/whatsapp/VideoBitmapDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    .line 32
    invoke-virtual {p0}, Lcom/whatsapp/VideoBitmapDrawable;->a()F

    move-result v4

    .line 36
    new-instance v5, Landroid/graphics/Path;

    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 4
    iget v6, v3, Landroid/graphics/Rect;->left:I

    int-to-float v6, v6

    iget v7, v3, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v7, v7, -0x11

    int-to-float v7, v7

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 37
    iget v6, v3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    iget v7, v3, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v7, v7, -0x11

    int-to-float v7, v7

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 22
    iget v6, v3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    iget v7, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v7, v7

    sub-float/2addr v7, v4

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 13
    new-instance v6, Landroid/graphics/RectF;

    iget v7, v3, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    mul-float v8, v11, v4

    sub-float/2addr v7, v8

    iget v8, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v8, v8

    mul-float v9, v11, v4

    sub-float/2addr v8, v9

    iget v9, v3, Landroid/graphics/Rect;->right:I

    int-to-float v9, v9

    iget v10, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v10, v10

    invoke-direct {v6, v7, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v5, v6, v1, v12}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 17
    iget v6, v3, Landroid/graphics/Rect;->left:I

    int-to-float v6, v6

    add-float/2addr v6, v4

    iget v7, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v7, v7

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 34
    new-instance v6, Landroid/graphics/RectF;

    iget v7, v3, Landroid/graphics/Rect;->left:I

    int-to-float v7, v7

    iget v8, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v8, v8

    mul-float v9, v11, v4

    sub-float/2addr v8, v9

    iget v9, v3, Landroid/graphics/Rect;->left:I

    int-to-float v9, v9

    mul-float/2addr v4, v11

    add-float/2addr v4, v9

    iget v9, v3, Landroid/graphics/Rect;->bottom:I

    int-to-float v9, v9

    invoke-direct {v6, v7, v8, v4, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v5, v6, v12, v12}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 15
    iget v4, v3, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v3, v3, -0x11

    int-to-float v3, v3

    invoke-virtual {v5, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 38
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 9
    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 6
    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 27
    const/high16 v4, -0x6700

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    invoke-virtual {p1, v5, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 12
    const/high16 v4, -0x100

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    sget-object v4, Lcom/whatsapp/VideoBitmapDrawable;->cameraOverlay:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/whatsapp/VideoBitmapDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    invoke-virtual {p0}, Lcom/whatsapp/VideoBitmapDrawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v6

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    sget-object v7, Lcom/whatsapp/VideoBitmapDrawable;->cameraOverlay:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    sub-int/2addr v6, v7

    add-int/lit8 v6, v6, 0x1

    int-to-float v6, v6

    invoke-virtual {p1, v4, v5, v6, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 3
    iget-object v3, p0, Lcom/whatsapp/VideoBitmapDrawable;->videoSize:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 24
    iget-object v3, p0, Lcom/whatsapp/VideoBitmapDrawable;->videoSize:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    new-array v3, v3, [F

    .line 1
    iget-object v4, p0, Lcom/whatsapp/VideoBitmapDrawable;->textPaint:Landroid/text/TextPaint;

    iget-object v5, p0, Lcom/whatsapp/VideoBitmapDrawable;->videoSize:Ljava/lang/String;

    iget-object v6, p0, Lcom/whatsapp/VideoBitmapDrawable;->videoSize:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v4, v5, v0, v6, v3}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/String;II[F)I

    .line 31
    :cond_0
    array-length v4, v3

    if-ge v0, v4, :cond_1

    .line 26
    aget v4, v3, v0

    add-float/2addr v1, v4

    .line 14
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/VideoBitmapDrawable;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->descent()F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    .line 20
    iget-object v2, p0, Lcom/whatsapp/VideoBitmapDrawable;->videoSize:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/whatsapp/VideoBitmapDrawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    sub-float v1, v3, v1

    sub-float/2addr v1, v11

    invoke-virtual {p0}, Lcom/whatsapp/VideoBitmapDrawable;->getIntrinsicHeight()I

    move-result v3

    sub-int v0, v3, v0

    int-to-float v0, v0

    iget-object v3, p0, Lcom/whatsapp/VideoBitmapDrawable;->textPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, v2, v1, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 5
    :cond_2
    return-void
.end method
