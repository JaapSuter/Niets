.class Lcom/whatsapp/n;
.super Landroid/graphics/drawable/BitmapDrawable;
.source "n.java"


# instance fields
.field private a:I

.field private b:Landroid/graphics/Paint;

.field final c:Lcom/whatsapp/cb;


# direct methods
.method constructor <init>(Lcom/whatsapp/cb;Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/n;->c:Lcom/whatsapp/cb;

    invoke-direct {p0, p2, p3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 3
    .parameter

    .prologue
    .line 10
    iget-object v0, p0, Lcom/whatsapp/n;->b:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    .line 20
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/n;->b:Landroid/graphics/Paint;

    .line 6
    iget-object v0, p0, Lcom/whatsapp/n;->b:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 22
    iget-object v0, p0, Lcom/whatsapp/n;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 5
    iget-object v0, p0, Lcom/whatsapp/n;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/n;->b:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 29
    iget-object v0, p0, Lcom/whatsapp/n;->b:Landroid/graphics/Paint;

    const v1, 0x3f8ccccd

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    iget-object v0, p0, Lcom/whatsapp/n;->b:Landroid/graphics/Paint;

    const v1, -0x660f8000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/BitmapDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 16
    iget v0, p0, Lcom/whatsapp/n;->a:I

    const v1, 0x10100a7

    if-ne v0, v1, :cond_1

    .line 26
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    iget v0, v0, Lcom/whatsapp/j4;->L:F

    .line 27
    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {p0}, Lcom/whatsapp/n;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 17
    iget-object v2, p0, Lcom/whatsapp/n;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v0, v0, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 24
    :cond_1
    return-void
.end method

.method public isStateful()Z
    .locals 1

    .prologue
    .line 4
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

    .line 3
    iget v3, p0, Lcom/whatsapp/n;->a:I

    .line 11
    const v1, 0x10100a9

    iput v1, p0, Lcom/whatsapp/n;->a:I

    .line 9
    array-length v4, p1

    move v1, v0

    :cond_0
    if-ge v1, v4, :cond_3

    aget v5, p1, v1

    .line 13
    if-ne v5, v7, :cond_1

    .line 14
    iput v7, p0, Lcom/whatsapp/n;->a:I

    .line 2
    if-eqz v2, :cond_3

    .line 18
    :cond_1
    if-ne v5, v6, :cond_2

    .line 25
    iput v6, p0, Lcom/whatsapp/n;->a:I

    .line 28
    :cond_2
    add-int/lit8 v1, v1, 0x1

    if-eqz v2, :cond_0

    .line 19
    :cond_3
    iget v1, p0, Lcom/whatsapp/n;->a:I

    if-eq v3, v1, :cond_4

    .line 23
    invoke-virtual {p0}, Lcom/whatsapp/n;->invalidateSelf()V

    .line 12
    const/4 v0, 0x1

    .line 21
    :cond_4
    return v0
.end method
