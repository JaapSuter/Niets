.class public Lcom/whatsapp/q;
.super Landroid/graphics/drawable/Drawable;
.source "q.java"


# instance fields
.field private a:I

.field private b:I

.field private c:F

.field private d:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 42
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 43
    const/16 v0, 0x12

    iput v0, p0, Lcom/whatsapp/q;->a:I

    .line 4
    const v0, 0x10100a9

    iput v0, p0, Lcom/whatsapp/q;->b:I

    .line 16
    const/high16 v0, 0x4040

    iput v0, p0, Lcom/whatsapp/q;->c:F

    .line 18
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    .line 60
    const/high16 v0, 0x4000

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/q;->c:F

    .line 49
    return-void
.end method

.method private a(FF)Landroid/graphics/Path;
    .locals 8
    .parameter
    .parameter

    .prologue
    const/high16 v4, 0x4000

    const/high16 v7, -0x3d4c

    const/4 v6, 0x0

    .line 66
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 32
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->d:F

    mul-float/2addr v1, v4

    float-to-int v1, v1

    .line 22
    div-float v2, p1, v4

    iget v3, p0, Lcom/whatsapp/q;->a:I

    mul-int/lit8 v3, v3, 0x2

    div-int/lit8 v3, v3, 0x3

    int-to-float v3, v3

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/whatsapp/q;->a:I

    int-to-float v3, v3

    sub-float v3, p2, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 53
    div-float v2, p1, v4

    invoke-virtual {v0, v2, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 58
    div-float v2, p1, v4

    iget v3, p0, Lcom/whatsapp/q;->a:I

    mul-int/lit8 v3, v3, 0x2

    div-int/lit8 v3, v3, 0x3

    int-to-float v3, v3

    add-float/2addr v2, v3

    iget v3, p0, Lcom/whatsapp/q;->a:I

    int-to-float v3, v3

    sub-float v3, p2, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 6
    int-to-float v2, v1

    sub-float v2, p1, v2

    iget v3, p0, Lcom/whatsapp/q;->a:I

    int-to-float v3, v3

    sub-float v3, p2, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 73
    new-instance v2, Landroid/graphics/RectF;

    mul-int/lit8 v3, v1, 0x2

    int-to-float v3, v3

    sub-float v3, p1, v3

    iget v4, p0, Lcom/whatsapp/q;->a:I

    int-to-float v4, v4

    sub-float v4, p2, v4

    mul-int/lit8 v5, v1, 0x2

    int-to-float v5, v5

    sub-float/2addr v4, v5

    iget v5, p0, Lcom/whatsapp/q;->a:I

    int-to-float v5, v5

    sub-float v5, p2, v5

    invoke-direct {v2, v3, v4, p1, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v3, 0x42b4

    invoke-virtual {v0, v2, v3, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 71
    int-to-float v2, v1

    invoke-virtual {v0, p1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 64
    new-instance v2, Landroid/graphics/RectF;

    mul-int/lit8 v3, v1, 0x2

    int-to-float v3, v3

    sub-float v3, p1, v3

    mul-int/lit8 v4, v1, 0x2

    int-to-float v4, v4

    invoke-direct {v2, v3, v6, p1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v0, v2, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 68
    int-to-float v2, v1

    invoke-virtual {v0, v2, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 57
    new-instance v2, Landroid/graphics/RectF;

    mul-int/lit8 v3, v1, 0x2

    int-to-float v3, v3

    mul-int/lit8 v4, v1, 0x2

    int-to-float v4, v4

    invoke-direct {v2, v6, v6, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v0, v2, v7, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 55
    iget v2, p0, Lcom/whatsapp/q;->a:I

    int-to-float v2, v2

    sub-float v2, p2, v2

    int-to-float v3, v1

    sub-float/2addr v2, v3

    invoke-virtual {v0, v6, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 56
    new-instance v2, Landroid/graphics/RectF;

    iget v3, p0, Lcom/whatsapp/q;->a:I

    int-to-float v3, v3

    sub-float v3, p2, v3

    mul-int/lit8 v4, v1, 0x2

    int-to-float v4, v4

    sub-float/2addr v3, v4

    mul-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v4, p0, Lcom/whatsapp/q;->a:I

    int-to-float v4, v4

    sub-float v4, p2, v4

    invoke-direct {v2, v6, v3, v1, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/high16 v1, -0x3ccc

    invoke-virtual {v0, v2, v1, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 40
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 45
    sget-object v1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 35
    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 0
    .parameter

    .prologue
    .line 65
    iput p1, p0, Lcom/whatsapp/q;->a:I

    .line 30
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 10
    .parameter

    .prologue
    const/4 v9, 0x0

    const/16 v5, -0x2ca5

    const/high16 v6, 0x3fc0

    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 74
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    const/16 v2, 0xff

    invoke-virtual {v0, v2, v3, v3, v3}, Landroid/graphics/Paint;->setARGB(IIII)V

    .line 14
    invoke-virtual {p0}, Lcom/whatsapp/q;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 70
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    .line 63
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    .line 2
    int-to-float v0, v2

    iget v2, p0, Lcom/whatsapp/q;->c:F

    const/high16 v4, 0x4000

    mul-float/2addr v2, v4

    sub-float/2addr v0, v2

    int-to-float v2, v3

    iget v4, p0, Lcom/whatsapp/q;->c:F

    sub-float/2addr v2, v4

    invoke-direct {p0, v0, v2}, Lcom/whatsapp/q;->a(FF)Landroid/graphics/Path;

    move-result-object v8

    .line 29
    new-instance v0, Landroid/graphics/BlurMaskFilter;

    iget v2, p0, Lcom/whatsapp/q;->c:F

    sget-object v4, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v0, v2, v4}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 48
    iget-object v2, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    const v4, -0x66cccccd

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 61
    iget-object v2, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    iget-object v2, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 47
    iget v0, p0, Lcom/whatsapp/q;->c:F

    iget v2, p0, Lcom/whatsapp/q;->c:F

    mul-float/2addr v2, v6

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 9
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 67
    iget v0, p0, Lcom/whatsapp/q;->c:F

    neg-float v0, v0

    iget v2, p0, Lcom/whatsapp/q;->c:F

    neg-float v2, v2

    mul-float/2addr v2, v6

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 28
    iget v0, p0, Lcom/whatsapp/q;->c:F

    iget v2, p0, Lcom/whatsapp/q;->c:F

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 52
    iget v0, p0, Lcom/whatsapp/q;->b:I

    const v2, 0x10100a7

    if-ne v0, v2, :cond_0

    .line 44
    new-instance v0, Landroid/graphics/LinearGradient;

    int-to-float v4, v3

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    move v2, v1

    move v3, v1

    move v6, v5

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 20
    iget-object v1, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 38
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    const/high16 v1, -0x100

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    const/high16 v1, -0x6700

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 59
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 50
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 12
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x3f80

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 13
    iget-object v0, p0, Lcom/whatsapp/q;->d:Landroid/graphics/Paint;

    const/high16 v1, 0x6600

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 5
    iget v0, p0, Lcom/whatsapp/q;->c:F

    neg-float v0, v0

    iget v1, p0, Lcom/whatsapp/q;->c:F

    neg-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 41
    return-void
.end method

.method public getOpacity()I
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    return v0
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .locals 1
    .parameter

    .prologue
    .line 62
    iget v0, p0, Lcom/whatsapp/q;->c:F

    float-to-int v0, v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 72
    iget v0, p0, Lcom/whatsapp/q;->a:I

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 21
    iget v0, p0, Lcom/whatsapp/q;->c:F

    float-to-int v0, v0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 37
    iget v0, p0, Lcom/whatsapp/q;->c:F

    float-to-int v0, v0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 36
    const/4 v0, 0x1

    return v0
.end method

.method public isStateful()Z
    .locals 1

    .prologue
    .line 23
    const/4 v0, 0x1

    return v0
.end method

.method public setAlpha(I)V
    .locals 0
    .parameter

    .prologue
    .line 3
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0
    .parameter

    .prologue
    .line 46
    return-void
.end method

.method public setState([I)Z
    .locals 8
    .parameter

    .prologue
    const v7, 0x10100a7

    const v6, 0x101009c

    const/4 v0, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 8
    iget v3, p0, Lcom/whatsapp/q;->b:I

    .line 15
    const v1, 0x10100a9

    iput v1, p0, Lcom/whatsapp/q;->b:I

    .line 1
    array-length v4, p1

    move v1, v0

    :cond_0
    if-ge v1, v4, :cond_3

    aget v5, p1, v1

    .line 54
    if-ne v5, v7, :cond_1

    .line 33
    iput v7, p0, Lcom/whatsapp/q;->b:I

    .line 17
    if-eqz v2, :cond_3

    .line 24
    :cond_1
    if-ne v5, v6, :cond_2

    .line 31
    iput v6, p0, Lcom/whatsapp/q;->b:I

    .line 39
    :cond_2
    add-int/lit8 v1, v1, 0x1

    if-eqz v2, :cond_0

    .line 27
    :cond_3
    iget v1, p0, Lcom/whatsapp/q;->b:I

    if-eq v3, v1, :cond_4

    .line 34
    invoke-virtual {p0}, Lcom/whatsapp/q;->invalidateSelf()V

    .line 7
    const/4 v0, 0x1

    .line 19
    :cond_4
    return v0
.end method
