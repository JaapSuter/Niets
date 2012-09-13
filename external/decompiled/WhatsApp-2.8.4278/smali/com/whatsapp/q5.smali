.class public Lcom/whatsapp/q5;
.super Ljava/lang/Object;
.source "q5.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/whatsapp/w9;

.field private final c:Ljava/io/File;

.field private final d:I

.field private final e:I

.field private final f:I

.field g:Lcom/whatsapp/s5;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "nu\u0016"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/q5;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x30

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x4b

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x47

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x26

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x40

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>(IIILjava/io/File;)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v0, Lcom/whatsapp/bab;

    const/16 v1, 0x3c

    invoke-direct {v0, v1}, Lcom/whatsapp/bab;-><init>(I)V

    iput-object v0, p0, Lcom/whatsapp/q5;->a:Ljava/util/HashMap;

    .line 81
    new-instance v0, Lcom/whatsapp/w9;

    invoke-direct {v0, p0}, Lcom/whatsapp/w9;-><init>(Lcom/whatsapp/q5;)V

    iput-object v0, p0, Lcom/whatsapp/q5;->b:Lcom/whatsapp/w9;

    .line 70
    new-instance v0, Lcom/whatsapp/s5;

    invoke-direct {v0, p0}, Lcom/whatsapp/s5;-><init>(Lcom/whatsapp/q5;)V

    iput-object v0, p0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    .line 44
    iput p1, p0, Lcom/whatsapp/q5;->e:I

    .line 57
    iput p2, p0, Lcom/whatsapp/q5;->d:I

    .line 86
    iput p3, p0, Lcom/whatsapp/q5;->f:I

    .line 41
    iput-object p4, p0, Lcom/whatsapp/q5;->c:Ljava/io/File;

    .line 42
    iget-object v0, p0, Lcom/whatsapp/q5;->b:Lcom/whatsapp/w9;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/whatsapp/w9;->setPriority(I)V

    .line 7
    return-void
.end method

.method static a(Lcom/whatsapp/q5;Lcom/whatsapp/t5;)Landroid/graphics/Bitmap;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 97
    invoke-direct {p0, p1}, Lcom/whatsapp/q5;->a(Lcom/whatsapp/t5;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/whatsapp/t5;)Landroid/graphics/Bitmap;
    .locals 8
    .parameter

    .prologue
    const/4 v1, 0x0

    sget v2, Lcom/whatsapp/g5;->n:I

    .line 60
    new-instance v3, Ljava/io/File;

    iget-object v0, p1, Lcom/whatsapp/t5;->b:Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 69
    iget-object v0, p1, Lcom/whatsapp/t5;->c:Landroid/widget/ImageView;

    invoke-virtual {p0, v3, v0}, Lcom/whatsapp/q5;->a(Ljava/io/File;Landroid/widget/ImageView;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 46
    if-eqz v0, :cond_0

    .line 87
    :goto_0
    return-object v0

    .line 50
    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 40
    goto :goto_0

    .line 22
    :cond_1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v4, p1, Lcom/whatsapp/t5;->a:Ljava/lang/String;

    const-string v5, " "

    sget-object v6, Lcom/whatsapp/q5;->z:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object v0

    .line 17
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 13
    const/16 v5, 0x400

    new-array v5, v5, [B

    .line 30
    :cond_2
    const/4 v6, 0x0

    const/16 v7, 0x400

    invoke-virtual {v0, v5, v6, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    .line 19
    const/4 v7, -0x1

    if-ne v6, v7, :cond_3

    .line 85
    if-eqz v2, :cond_4

    .line 71
    :cond_3
    const/4 v7, 0x0

    invoke-virtual {v4, v5, v7, v6}, Ljava/io/OutputStream;->write([BII)V

    .line 5
    if-eqz v2, :cond_2

    .line 21
    :cond_4
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 83
    iget-object v0, p1, Lcom/whatsapp/t5;->c:Landroid/widget/ImageView;

    invoke-virtual {p0, v3, v0}, Lcom/whatsapp/q5;->a(Ljava/io/File;Landroid/widget/ImageView;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 76
    :catch_0
    move-exception v0

    .line 29
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 87
    goto :goto_0
.end method

.method static a(Lcom/whatsapp/q5;)Ljava/util/HashMap;
    .locals 1
    .parameter

    .prologue
    .line 53
    iget-object v0, p0, Lcom/whatsapp/q5;->a:Ljava/util/HashMap;

    return-object v0
.end method

.method static b(Lcom/whatsapp/q5;)I
    .locals 1
    .parameter

    .prologue
    .line 78
    iget v0, p0, Lcom/whatsapp/q5;->e:I

    return v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;Lcom/whatsapp/u5;)V
    .locals 6
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v0}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-virtual {v0, p4}, Lcom/whatsapp/s5;->a(Landroid/widget/ImageView;)V

    .line 96
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    new-instance v0, Lcom/whatsapp/t5;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/whatsapp/t5;-><init>(Lcom/whatsapp/q5;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;Lcom/whatsapp/u5;)V

    .line 49
    iget-object v1, p0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v1}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v1

    monitor-enter v1

    .line 61
    :try_start_1
    iget-object v2, p0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v2}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Ljava/util/Stack;->add(ILjava/lang/Object;)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/q5;->g:Lcom/whatsapp/s5;

    invoke-static {v0}, Lcom/whatsapp/s5;->a(Lcom/whatsapp/s5;)Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 37
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    iget-object v0, p0, Lcom/whatsapp/q5;->b:Lcom/whatsapp/w9;

    invoke-virtual {v0}, Lcom/whatsapp/w9;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    sget-object v1, Ljava/lang/Thread$State;->NEW:Ljava/lang/Thread$State;

    if-ne v0, v1, :cond_0

    .line 92
    iget-object v0, p0, Lcom/whatsapp/q5;->b:Lcom/whatsapp/w9;

    invoke-virtual {v0}, Lcom/whatsapp/w9;->start()V

    .line 98
    :cond_0
    return-void

    .line 96
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 37
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method


# virtual methods
.method public a(Ljava/io/File;Landroid/widget/ImageView;)Landroid/graphics/Bitmap;
    .locals 7
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    sget v3, Lcom/whatsapp/g5;->n:I

    .line 38
    :try_start_0
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 26
    const/4 v1, 0x1

    iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 62
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 v2, 0x0

    invoke-static {v1, v2, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 64
    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-ltz v1, :cond_0

    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-gez v1, :cond_1

    .line 93
    :cond_0
    :goto_0
    return-object v0

    .line 3
    :cond_1
    iget v2, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v1, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 89
    const/4 v5, 0x1

    iput v5, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 31
    :cond_2
    div-int/lit8 v5, v2, 0x2

    iget v6, p0, Lcom/whatsapp/q5;->f:I

    if-ge v5, v6, :cond_3

    div-int/lit8 v5, v1, 0x2

    iget v6, p0, Lcom/whatsapp/q5;->f:I

    if-ge v5, v6, :cond_3

    .line 20
    if-eqz v3, :cond_4

    .line 47
    :cond_3
    div-int/lit8 v2, v2, 0x2

    .line 4
    div-int/lit8 v1, v1, 0x2

    .line 74
    iget v5, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    if-eqz v3, :cond_2

    .line 33
    :cond_4
    const/4 v1, 0x0

    iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 58
    const/4 v1, 0x1

    iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 16
    const/4 v1, 0x1

    iput-boolean v1, v4, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 77
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 v2, 0x0

    invoke-static {v1, v2, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 95
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/whatsapp/q5;->b:Lcom/whatsapp/w9;

    invoke-virtual {v0}, Lcom/whatsapp/w9;->interrupt()V

    .line 39
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;)V
    .locals 6
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 11
    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/whatsapp/q5;->a(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;Lcom/whatsapp/u5;)V

    .line 68
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;Lcom/whatsapp/u5;)V
    .locals 6
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/g5;->n:I

    .line 67
    invoke-virtual {p4, p1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 72
    if-nez p2, :cond_1

    .line 54
    iget v0, p0, Lcom/whatsapp/q5;->e:I

    invoke-virtual {p4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 8
    :cond_1
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/whatsapp/q5;->c:Ljava/io/File;

    invoke-direct {v0, v2, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    .line 59
    if-nez p1, :cond_2

    .line 25
    invoke-static {v2}, Landroid/graphics/drawable/Drawable;->createFromPath(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 36
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/q5;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 28
    iget-object v0, p0, Lcom/whatsapp/q5;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 27
    if-eqz v0, :cond_3

    .line 35
    invoke-virtual {p4, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    if-eqz v1, :cond_5

    .line 80
    :cond_3
    iget v3, p0, Lcom/whatsapp/q5;->e:I

    if-eqz v3, :cond_4

    .line 65
    iget v3, p0, Lcom/whatsapp/q5;->e:I

    invoke-virtual {p4, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz v1, :cond_5

    .line 43
    :cond_4
    const/16 v3, 0x8

    invoke-virtual {p4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 63
    :cond_5
    if-eqz p5, :cond_6

    .line 15
    invoke-interface {p5, v0}, Lcom/whatsapp/u5;->a(Landroid/graphics/Bitmap;)V

    .line 82
    :cond_6
    if-eqz v1, :cond_0

    :cond_7
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 52
    invoke-direct/range {v0 .. v5}, Lcom/whatsapp/q5;->b(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Landroid/widget/ImageView;Lcom/whatsapp/u5;)V

    .line 55
    iget v0, p0, Lcom/whatsapp/q5;->d:I

    invoke-virtual {p4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0
.end method

.method public b()V
    .locals 6

    .prologue
    sget v1, Lcom/whatsapp/g5;->n:I

    .line 51
    iget-object v2, p0, Lcom/whatsapp/q5;->a:Ljava/util/HashMap;

    monitor-enter v2

    .line 91
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/q5;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 94
    iget-object v0, p0, Lcom/whatsapp/q5;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 12
    if-eqz v3, :cond_1

    .line 6
    array-length v4, v3

    const/4 v0, 0x0

    :cond_0
    if-ge v0, v4, :cond_1

    aget-object v5, v3, v0

    .line 9
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 66
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 75
    :cond_1
    monitor-exit v2

    .line 56
    return-void

    .line 75
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
