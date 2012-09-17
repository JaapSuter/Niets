.class public Lcom/whatsapp/ViewProfilePhoto;
.super Lcom/whatsapp/DialogToastActivity;
.source "ViewProfilePhoto.java"

# interfaces
.implements Lcom/whatsapp/uk;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private f:Lcom/whatsapp/zq;

.field private g:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x73

    const/16 v1, 0x64

    const/16 v2, 0x28

    const/16 v4, 0x1a

    const/4 v6, 0x0

    const/16 v0, 0x8

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u001b\u000b]\u001dn\u0013\u0000w\u0001u"

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

    const-string v0, "\u0000\rM\u0004j\u0004\u000bN\u001av\u0013\u0014@\u001cn\u0019KK\u0001\u007f\u0017\u0010MS"

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

    const/4 v10, 0x2

    const-string v0, "\u001b\u000b]\u001dn\u0013\u0000"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "V\u0014@\u001cn\u0019;N\u0006v\u001a;A\u0017 "

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3
    if-gt v7, v8, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "\u001c\rL"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_4
    if-gt v7, v8, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "\u0000\rM\u0004j\u0004\u000bN\u001av\u0013\u0014@\u001cn\u0019KL\u0016i\u0002\u0016G\n"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_5
    if-gt v7, v8, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "\u001f\u0017w\u0001\u007f\u0005\u0001\\"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_6
    if-gt v7, v8, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x7

    const-string v0, "\u0000\rM\u0004j\u0004\u000bN\u001av\u0013\u0014@\u001cn\u0019KG\u001dj\u0004\u000bN\u001av\u0013\u0014@\u001cn\u0019\u0007@\u0012t\u0011\u0001LSj\u001e\u000b\\\u001cE\u0010\u0011D\u001fE\u001f\u0000\u0012"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_7
    if-gt v6, v7, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_8
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x76

    goto :goto_8

    :pswitch_1
    move v0, v1

    goto :goto_8

    :pswitch_2
    move v0, v2

    goto :goto_8

    :pswitch_3
    move v0, v3

    goto :goto_8

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x76

    goto :goto_9

    :pswitch_5
    move v0, v1

    goto :goto_9

    :pswitch_6
    move v0, v2

    goto :goto_9

    :pswitch_7
    move v0, v3

    goto :goto_9

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x76

    goto :goto_a

    :pswitch_9
    move v0, v1

    goto :goto_a

    :pswitch_a
    move v0, v2

    goto :goto_a

    :pswitch_b
    move v0, v3

    goto :goto_a

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x76

    goto :goto_b

    :pswitch_d
    move v0, v1

    goto :goto_b

    :pswitch_e
    move v0, v2

    goto :goto_b

    :pswitch_f
    move v0, v3

    goto :goto_b

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x76

    goto :goto_c

    :pswitch_11
    move v0, v1

    goto :goto_c

    :pswitch_12
    move v0, v2

    goto :goto_c

    :pswitch_13
    move v0, v3

    goto :goto_c

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x76

    goto :goto_d

    :pswitch_15
    move v0, v1

    goto :goto_d

    :pswitch_16
    move v0, v2

    goto :goto_d

    :pswitch_17
    move v0, v3

    goto :goto_d

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    const/16 v0, 0x76

    goto :goto_e

    :pswitch_19
    move v0, v1

    goto :goto_e

    :pswitch_1a
    move v0, v2

    goto :goto_e

    :pswitch_1b
    move v0, v3

    goto :goto_e

    :cond_7
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_f
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    const/16 v0, 0x76

    goto :goto_f

    :pswitch_1d
    move v0, v1

    goto :goto_f

    :pswitch_1e
    move v0, v2

    goto :goto_f

    :pswitch_1f
    move v0, v3

    goto :goto_f

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

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    .line 13
    new-instance v0, Lcom/whatsapp/vd;

    invoke-direct {v0, p0}, Lcom/whatsapp/vd;-><init>(Lcom/whatsapp/ViewProfilePhoto;)V

    iput-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->g:Landroid/os/Handler;

    return-void
.end method

.method static a(Lcom/whatsapp/ViewProfilePhoto;)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 68
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    return-object v0
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/16 v5, 0x8

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 103
    const v0, 0x7f0d005c

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewProfilePhoto;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 34
    const v0, 0x7f0d0188

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewProfilePhoto;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;

    .line 42
    const v1, 0x7f0d0189

    invoke-virtual {p0, v1}, Lcom/whatsapp/ViewProfilePhoto;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 98
    iget-object v4, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget-object v4, v4, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/whatsapp/hz;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 85
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 46
    invoke-virtual {v0, v5}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setVisibility(I)V

    .line 80
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v2, :cond_9

    .line 38
    :cond_0
    iget-object v4, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lcom/whatsapp/zq;->b(Z)Ljava/io/InputStream;

    move-result-object v4

    .line 64
    :try_start_0
    iget-object v5, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v5, v5, Lcom/whatsapp/zq;->o:I

    const/4 v6, -0x1

    if-ne v5, v6, :cond_2

    if-nez v4, :cond_2

    .line 53
    const/16 v5, 0x8

    invoke-virtual {v0, v5}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setVisibility(I)V

    .line 29
    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 11
    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 50
    iget-object v5, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v5}, Lcom/whatsapp/zq;->o()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 82
    const v5, 0x7f09018f

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    if-eqz v2, :cond_8

    .line 24
    :cond_1
    const v5, 0x7f09018e

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    if-eqz v2, :cond_8

    .line 47
    :cond_2
    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setVisibility(I)V

    .line 74
    const/16 v5, 0x8

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 92
    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v1, v1, Lcom/whatsapp/zq;->o:I

    if-nez v1, :cond_3

    .line 31
    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    if-eqz v2, :cond_4

    .line 63
    :cond_3
    const/16 v1, 0x8

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    :cond_4
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 23
    const/4 v3, 0x0

    invoke-static {v4, v3, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 95
    iget-object v3, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v3, v3, Lcom/whatsapp/zq;->o:I

    if-gtz v3, :cond_5

    iget-object v3, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v3, v3, Lcom/whatsapp/zq;->p:I

    if-lez v3, :cond_6

    .line 12
    :cond_5
    const/high16 v3, 0x4120

    invoke-virtual {v0, v3}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(F)V

    if-eqz v2, :cond_7

    .line 94
    :cond_6
    const/high16 v2, 0x4040

    invoke-virtual {v0, v2}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a(F)V

    .line 91
    :cond_7
    invoke-virtual {v0, v1}, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->setImageBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :cond_8
    if-eqz v4, :cond_9

    .line 51
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 19
    :cond_9
    :goto_0
    return-void

    .line 75
    :catchall_0
    move-exception v0

    .line 105
    if-eqz v4, :cond_a

    .line 87
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 93
    :cond_a
    :goto_1
    throw v0

    .line 106
    :catch_0
    move-exception v0

    goto :goto_0

    .line 93
    :catch_1
    move-exception v1

    goto :goto_1
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 5
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    .line 81
    const v0, 0x7f0d0044

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewProfilePhoto;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 72
    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 70
    const v1, 0x7f090178

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_2

    .line 44
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whatsapp/ViewProfilePhoto;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 30
    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    :cond_2
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5
    .parameter

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 90
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v3, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget-object v3, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    .line 39
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    const/4 v4, 0x7

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v3, v3, Lcom/whatsapp/zq;->o:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 16
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 77
    sget-object v3, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 66
    :goto_0
    iget-object v3, p0, Lcom/whatsapp/ViewProfilePhoto;->g:Landroid/os/Handler;

    invoke-virtual {v3, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 65
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    if-nez v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v3, v3, Lcom/whatsapp/zq;->o:I

    invoke-static {v0, v3, v1}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    .line 18
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->g:Landroid/os/Handler;

    const-wide/16 v3, 0x7d00

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 49
    :cond_0
    invoke-direct {p0}, Lcom/whatsapp/ViewProfilePhoto;->b()V

    .line 84
    :cond_1
    return-void

    :cond_2
    move v0, v2

    .line 77
    goto :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 37
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, -0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 22
    :cond_0
    :goto_0
    return-void

    .line 8
    :pswitch_0
    if-ne p2, v3, :cond_0

    .line 28
    if-eqz p3, :cond_1

    sget-object v1, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {p3, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 100
    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-static {v1, p0}, Lcom/whatsapp/iz;->b(Lcom/whatsapp/zq;Landroid/app/Activity;)V

    .line 56
    invoke-virtual {p0}, Lcom/whatsapp/ViewProfilePhoto;->finish()V

    if-eqz v0, :cond_0

    .line 52
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    const/16 v2, 0xd

    invoke-static {p3, v1, p0, v2, p0}, Lcom/whatsapp/iz;->a(Landroid/content/Intent;Lcom/whatsapp/zq;Landroid/app/Activity;ILcom/whatsapp/lr;)V

    if-eqz v0, :cond_0

    .line 33
    :pswitch_1
    invoke-static {}, Lcom/whatsapp/iz;->a()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 97
    if-ne p2, v3, :cond_2

    .line 15
    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-static {v1, p0}, Lcom/whatsapp/iz;->a(Lcom/whatsapp/zq;Landroid/app/Activity;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 76
    invoke-direct {p0}, Lcom/whatsapp/ViewProfilePhoto;->b()V

    if-eqz v0, :cond_0

    .line 79
    :cond_2
    if-nez p2, :cond_0

    if-eqz p3, :cond_0

    .line 102
    invoke-static {p3, p0}, Lcom/whatsapp/iz;->a(Landroid/content/Intent;Lcom/whatsapp/lr;)V

    goto :goto_0

    .line 4
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10
    .parameter

    .prologue
    const-wide/16 v8, 0x7d00

    const/16 v7, 0x8

    const/4 v2, 0x1

    const/4 v3, 0x0

    sget-boolean v4, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 61
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 36
    const v0, 0x7f030059

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewProfilePhoto;->setContentView(I)V

    .line 88
    invoke-virtual {p0}, Lcom/whatsapp/ViewProfilePhoto;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    const/4 v5, 0x4

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 45
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    const/4 v6, 0x3

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v1, v1, Lcom/whatsapp/zq;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 7
    const v0, 0x7f0d0185

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewProfilePhoto;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 62
    const v0, 0x7f0d0044

    invoke-virtual {p0, v0}, Lcom/whatsapp/ViewProfilePhoto;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 10
    iget-object v6, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v6}, Lcom/whatsapp/zq;->o()Z

    move-result v6

    if-nez v6, :cond_0

    sget-object v6, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v6}, Lcom/whatsapp/qp;->b()Lcom/whatsapp/ar;

    move-result-object v6

    iget-object v6, v6, Lcom/whatsapp/ar;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 101
    :cond_0
    new-instance v6, Lcom/whatsapp/o7;

    invoke-direct {v6, p0}, Lcom/whatsapp/o7;-><init>(Lcom/whatsapp/ViewProfilePhoto;)V

    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    iget-object v6, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v6}, Lcom/whatsapp/zq;->o()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 25
    const v6, 0x7f090178

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(I)V

    if-eqz v4, :cond_4

    .line 78
    :cond_1
    const v6, 0x7f090179

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(I)V

    if-eqz v4, :cond_4

    .line 32
    :cond_2
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 83
    const v1, 0x7f0d0187

    invoke-virtual {p0, v1}, Lcom/whatsapp/ViewProfilePhoto;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 67
    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whatsapp/ViewProfilePhoto;->getBaseContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v1, v6}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 73
    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    :cond_4
    invoke-static {p0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/uk;)V

    .line 89
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->b()Lcom/whatsapp/ar;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/ar;->b:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 17
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    if-lez v0, :cond_7

    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->g()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_7

    .line 40
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iput v3, v0, Lcom/whatsapp/zq;->o:I

    .line 41
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v1, v1, Lcom/whatsapp/zq;->o:I

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->g:Landroid/os/Handler;

    invoke-virtual {v0, v3, v8, v9}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    if-eqz v4, :cond_7

    .line 71
    :cond_5
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 107
    sget-object v1, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    move v0, v2

    .line 54
    :goto_0
    if-eqz v0, :cond_7

    .line 104
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    if-lez v0, :cond_6

    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    invoke-virtual {v0}, Lcom/whatsapp/zq;->g()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_6

    .line 14
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iput v3, v0, Lcom/whatsapp/zq;->o:I

    .line 57
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v1, v1, Lcom/whatsapp/zq;->o:I

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    .line 6
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->f:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    if-nez v0, :cond_7

    .line 69
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->g:Landroid/os/Handler;

    invoke-virtual {v0, v3, v8, v9}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 20
    :cond_7
    invoke-direct {p0}, Lcom/whatsapp/ViewProfilePhoto;->b()V

    .line 35
    return-void

    :cond_8
    move v0, v3

    .line 107
    goto :goto_0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 60
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onDestroy()V

    .line 96
    sget-object v0, Lcom/whatsapp/ViewProfilePhoto;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 26
    iget-object v0, p0, Lcom/whatsapp/ViewProfilePhoto;->g:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1
    invoke-static {p0}, Lcom/whatsapp/App;->b(Lcom/whatsapp/uk;)V

    .line 27
    return-void
.end method
