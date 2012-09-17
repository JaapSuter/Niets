.class Lcom/whatsapp/tw;
.super Ljava/lang/Object;
.source "tw.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field a:Landroid/net/Uri;

.field b:I

.field c:Lcom/whatsapp/sz;

.field d:I

.field final e:Lcom/whatsapp/MediaGalleryImageView;


# direct methods
.method public constructor <init>(Lcom/whatsapp/MediaGalleryImageView;Lcom/whatsapp/sz;ILandroid/net/Uri;I)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 25
    iput-object p1, p0, Lcom/whatsapp/tw;->e:Lcom/whatsapp/MediaGalleryImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p4, p0, Lcom/whatsapp/tw;->a:Landroid/net/Uri;

    .line 24
    iput p5, p0, Lcom/whatsapp/tw;->b:I

    .line 19
    iput-object p2, p0, Lcom/whatsapp/tw;->c:Lcom/whatsapp/sz;

    .line 4
    iput p3, p0, Lcom/whatsapp/tw;->d:I

    .line 27
    return-void
.end method


# virtual methods
.method public hashCode()I
    .locals 2

    .prologue
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public run()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 5
    sget-object v0, Lcom/whatsapp/MediaGalleryImageView;->tempBitmaps:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/tw;->c:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 16
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_2

    .line 26
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 12
    :goto_0
    if-nez v0, :cond_0

    .line 15
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 23
    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 14
    iget-object v1, p0, Lcom/whatsapp/tw;->a:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 10
    iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v2, p0, Lcom/whatsapp/tw;->b:I

    div-int/2addr v1, v2

    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v3, p0, Lcom/whatsapp/tw;->b:I

    div-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 13
    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 3
    iput-boolean v4, v0, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 18
    iget-object v1, p0, Lcom/whatsapp/tw;->a:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 8
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->tempBitmaps:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/whatsapp/tw;->c:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    new-instance v3, Ljava/lang/ref/SoftReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    :cond_0
    if-eqz v0, :cond_1

    .line 9
    sget-object v1, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    .line 6
    if-eqz v1, :cond_1

    .line 22
    new-instance v2, Lcom/whatsapp/uw;

    invoke-direct {v2, p0, v0}, Lcom/whatsapp/uw;-><init>(Lcom/whatsapp/tw;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 7
    :cond_1
    return-void

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method
