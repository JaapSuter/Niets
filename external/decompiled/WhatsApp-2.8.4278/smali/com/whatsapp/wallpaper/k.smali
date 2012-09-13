.class public Lcom/whatsapp/wallpaper/k;
.super Ljava/lang/Object;
.source "k.java"


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private b:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 1
    .parameter

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/wallpaper/k;->b:I

    .line 11
    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;I)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    .line 19
    rem-int/lit16 v0, p2, 0x168

    iput v0, p0, Lcom/whatsapp/wallpaper/k;->b:I

    .line 12
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 17
    iget v0, p0, Lcom/whatsapp/wallpaper/k;->b:I

    return v0
.end method

.method public a(I)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput p1, p0, Lcom/whatsapp/wallpaper/k;->b:I

    .line 22
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    .line 25
    return-void
.end method

.method public b()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public c()Landroid/graphics/Matrix;
    .locals 3

    .prologue
    .line 15
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 28
    iget v1, p0, Lcom/whatsapp/wallpaper/k;->b:I

    if-eqz v1, :cond_0

    .line 16
    iget-object v1, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    .line 20
    iget-object v2, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    .line 2
    neg-int v1, v1

    int-to-float v1, v1

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 21
    iget v1, p0, Lcom/whatsapp/wallpaper/k;->b:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 24
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/k;->f()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/k;->e()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 23
    :cond_0
    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/whatsapp/wallpaper/k;->b:I

    div-int/lit8 v0, v0, 0x5a

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()I
    .locals 1

    .prologue
    .line 7
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/k;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 27
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 3
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/k;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    iget-object v0, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    :goto_0
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/wallpaper/k;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    goto :goto_0
.end method
