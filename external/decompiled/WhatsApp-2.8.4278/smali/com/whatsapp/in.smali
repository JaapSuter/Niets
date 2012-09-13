.class Lcom/whatsapp/in;
.super Ljava/lang/Object;
.source "in.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field a:Ljava/util/Random;

.field b:I

.field c:J

.field final d:Lcom/whatsapp/sz;

.field final e:Landroid/os/Handler;

.field final f:Lcom/whatsapp/Conversation;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x4e

    const/16 v2, 0x28

    const/16 v4, 0x16

    const/16 v1, 0x13

    const/4 v6, 0x0

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "=B>q"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v10, 0x1

    const-string v0, "3\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x2

    const-string v0, "gM=bTpD!x\u001c>"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/in;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x79

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_3

    :pswitch_1
    move v0, v2

    goto :goto_3

    :pswitch_2
    move v0, v3

    goto :goto_3

    :pswitch_3
    move v0, v4

    goto :goto_3

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x79

    :goto_4
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_4

    :pswitch_5
    move v0, v2

    goto :goto_4

    :pswitch_6
    move v0, v3

    goto :goto_4

    :pswitch_7
    move v0, v4

    goto :goto_4

    :cond_2
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x79

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_5

    :pswitch_9
    move v0, v2

    goto :goto_5

    :pswitch_a
    move v0, v3

    goto :goto_5

    :pswitch_b
    move v0, v4

    goto :goto_5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;Landroid/os/Handler;)V
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    .line 29
    iput-object p1, p0, Lcom/whatsapp/in;->f:Lcom/whatsapp/Conversation;

    iput-object p2, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iput-object p3, p0, Lcom/whatsapp/in;->e:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/in;->a:Ljava/util/Random;

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/in;->b:I

    .line 38
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-wide v0, v0, Lcom/whatsapp/sz;->i:J

    iput-wide v0, p0, Lcom/whatsapp/in;->c:J

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x1

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 51
    new-instance v2, Lcom/whatsapp/sz;

    new-instance v0, Lcom/whatsapp/uz;

    iget-object v3, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-object v3, v3, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v3, v3, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    iget-object v4, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-object v4, v4, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v4, v4, Lcom/whatsapp/uz;->b:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/in;->z:[Ljava/lang/String;

    const/4 v7, 0x2

    aget-object v6, v6, v7

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v4, v5}, Lcom/whatsapp/uz;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    invoke-direct {v2, v0}, Lcom/whatsapp/sz;-><init>(Lcom/whatsapp/uz;)V

    .line 13
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    iput-object v0, v2, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    .line 57
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-boolean v0, v0, Lcom/whatsapp/sz;->e:Z

    iput-boolean v0, v2, Lcom/whatsapp/sz;->e:Z

    .line 31
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->h:I

    if-nez v0, :cond_0

    .line 25
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    invoke-virtual {v0}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/whatsapp/sz;->b(Ljava/lang/String;)V

    if-eqz v1, :cond_1

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    invoke-virtual {v0}, Lcom/whatsapp/sz;->c()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/whatsapp/sz;->a([B)V

    .line 21
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-wide v3, v0, Lcom/whatsapp/sz;->i:J

    iput-wide v3, v2, Lcom/whatsapp/sz;->i:J

    .line 7
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->a:I

    iput v0, v2, Lcom/whatsapp/sz;->a:I

    .line 20
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-wide v3, v0, Lcom/whatsapp/sz;->q:D

    iput-wide v3, v2, Lcom/whatsapp/sz;->q:D

    .line 64
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-wide v3, v0, Lcom/whatsapp/sz;->r:D

    iput-wide v3, v2, Lcom/whatsapp/sz;->r:D

    .line 60
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    iput-object v0, v2, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    .line 5
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    iput-byte v0, v2, Lcom/whatsapp/sz;->l:B

    .line 58
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->k:Ljava/lang/String;

    iput-object v0, v2, Lcom/whatsapp/sz;->k:Ljava/lang/String;

    .line 52
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-wide v3, v0, Lcom/whatsapp/sz;->m:J

    iput-wide v3, v2, Lcom/whatsapp/sz;->m:J

    .line 18
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget v0, v0, Lcom/whatsapp/sz;->o:I

    iput v0, v2, Lcom/whatsapp/sz;->o:I

    .line 33
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    iput-object v0, v2, Lcom/whatsapp/sz;->p:Ljava/lang/String;

    .line 34
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    iput-object v0, v2, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    .line 53
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    if-nez v0, :cond_2

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v3, Lcom/whatsapp/in;->z:[Ljava/lang/String;

    aget-object v3, v3, v8

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v3, p0, Lcom/whatsapp/in;->b:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/whatsapp/sz;->b(Ljava/lang/String;)V

    .line 55
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-byte v0, v0, Lcom/whatsapp/sz;->l:B

    if-ne v0, v8, :cond_5

    .line 16
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    invoke-static {v0}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v5

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 10
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 27
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 59
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 44
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 4
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setDither(Z)V

    .line 23
    invoke-virtual {v4, v0, v9, v9, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 14
    new-instance v5, Landroid/text/TextPaint;

    invoke-direct {v5}, Landroid/text/TextPaint;-><init>()V

    .line 36
    invoke-virtual {v5, v8}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 35
    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Landroid/text/TextPaint;->setColor(I)V

    .line 11
    const/high16 v6, 0x4210

    invoke-virtual {v5, v6}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 63
    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v5, v6}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 2
    sget-object v6, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v5, v6}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 62
    iget v6, p0, Lcom/whatsapp/in;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    int-to-float v7, v7

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {v4, v6, v7, v0, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 15
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 45
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v5, 0x50

    invoke-virtual {v3, v4, v5, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 37
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 50
    iput v8, v2, Lcom/whatsapp/sz;->h:I

    .line 6
    invoke-virtual {v2, v0}, Lcom/whatsapp/sz;->a([B)V

    .line 43
    iget-object v0, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-eqz v0, :cond_3

    .line 17
    new-instance v3, Lcom/whatsapp/MediaData;

    invoke-direct {v3}, Lcom/whatsapp/MediaData;-><init>()V

    .line 48
    invoke-static {v8}, Lcom/whatsapp/j5;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/in;->z:[Ljava/lang/String;

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Lcom/whatsapp/App;->a(Ljava/lang/String;B)Ljava/io/File;

    move-result-object v0

    iput-object v0, v3, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 46
    :try_start_0
    iget-object v0, v2, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    iget-object v4, v3, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0, v4}, Lcom/whatsapp/j5;->a(Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 61
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/in;->d:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-virtual {v2}, Lcom/whatsapp/sz;->c()[B

    move-result-object v4

    iget-byte v5, v2, Lcom/whatsapp/sz;->l:B

    invoke-static {v0, v4, v3, v5}, Lcom/whatsapp/App;->a(Ljava/lang/String;[BLcom/whatsapp/MediaData;B)V

    .line 12
    if-eqz v1, :cond_4

    .line 30
    :cond_3
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0, v2}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;)V

    .line 3
    :cond_4
    if-eqz v1, :cond_6

    .line 24
    :cond_5
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0, v2}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;)V

    .line 32
    :cond_6
    iget v0, p0, Lcom/whatsapp/in;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/whatsapp/in;->b:I

    const/4 v1, 0x5

    if-ge v0, v1, :cond_7

    .line 28
    iget-object v0, p0, Lcom/whatsapp/in;->e:Landroid/os/Handler;

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    :cond_7
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 42
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V

    goto :goto_0

    .line 49
    :catch_1
    move-exception v0

    .line 39
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method
