.class public Lcom/whatsapp/MediaGallery;
.super Lcom/whatsapp/DialogToastListActivity;
.source "MediaGallery.java"


# static fields
.field public static g:Lcom/whatsapp/MediaGallery;

.field private static h:Lcom/whatsapp/j4;

.field public static q:I

.field private static final z:[Ljava/lang/String;


# instance fields
.field private i:Ljava/lang/String;

.field private j:Landroid/view/Display;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;"
        }
    .end annotation
.end field

.field private l:I

.field private m:Lcom/whatsapp/se;

.field protected n:Landroid/widget/ListView;

.field private o:Lcom/whatsapp/q9;

.field private p:I

.field private r:Landroid/view/View$OnClickListener;

.field private s:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap",
            "<",
            "Lcom/whatsapp/aab;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/sz;",
            ">;>;"
        }
    .end annotation
.end field

.field private t:Lcom/whatsapp/aab;

.field private u:Lcom/whatsapp/aab;

.field private v:Lcom/whatsapp/aab;

.field private w:Ljava/util/Calendar;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v2, 0x49

    const/16 v4, 0x45

    const/16 v1, 0x44

    const/16 v3, 0x2a

    const/4 v8, 0x0

    const/16 v0, 0xa

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "),N,=#(F)960\u0005&3(\u0007_(>!;Y\u007f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_0
    if-gt v6, v7, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    const/4 v10, 0x1

    const-string v0, "),N,=#(F)960\u0005797,^\u00063*/C\")6(^,3*:\u0010"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, ". N"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "),N,=#(F)960\u0005&.!(^ "

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_3
    if-gt v6, v7, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, ")&_+(!-"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_4
    if-gt v6, v7, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, "%%O7("

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_5
    if-gt v6, v7, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, ")&_+(!-u73"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_6
    if-gt v6, v7, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x7

    const-string v0, "),N,=#(F)960\u000579\'0I)9\u0006 ^(=4:"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_7
    if-gt v6, v7, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x8

    const-string v0, "),N,=#(F)960\u0005!97=X*%"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_8
    if-gt v6, v7, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x9

    const-string v0, "*<F)"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_9
    if-gt v6, v7, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    sput-object v9, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    .line 143
    sput v8, Lcom/whatsapp/MediaGallery;->q:I

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x5c

    :goto_a
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_a

    :pswitch_1
    move v0, v2

    goto :goto_a

    :pswitch_2
    move v0, v3

    goto :goto_a

    :pswitch_3
    move v0, v4

    goto :goto_a

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x5c

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_b

    :pswitch_5
    move v0, v2

    goto :goto_b

    :pswitch_6
    move v0, v3

    goto :goto_b

    :pswitch_7
    move v0, v4

    goto :goto_b

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x5c

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_c

    :pswitch_9
    move v0, v2

    goto :goto_c

    :pswitch_a
    move v0, v3

    goto :goto_c

    :pswitch_b
    move v0, v4

    goto :goto_c

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x5c

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_d

    :pswitch_d
    move v0, v2

    goto :goto_d

    :pswitch_e
    move v0, v3

    goto :goto_d

    :pswitch_f
    move v0, v4

    goto :goto_d

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    const/16 v0, 0x5c

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_e

    :pswitch_11
    move v0, v2

    goto :goto_e

    :pswitch_12
    move v0, v3

    goto :goto_e

    :pswitch_13
    move v0, v4

    goto :goto_e

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    const/16 v0, 0x5c

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_f

    :pswitch_15
    move v0, v2

    goto :goto_f

    :pswitch_16
    move v0, v3

    goto :goto_f

    :pswitch_17
    move v0, v4

    goto :goto_f

    :cond_6
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    const/16 v0, 0x5c

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_10

    :pswitch_19
    move v0, v2

    goto :goto_10

    :pswitch_1a
    move v0, v3

    goto :goto_10

    :pswitch_1b
    move v0, v4

    goto :goto_10

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    const/16 v0, 0x5c

    :goto_11
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_11

    :pswitch_1d
    move v0, v2

    goto :goto_11

    :pswitch_1e
    move v0, v3

    goto :goto_11

    :pswitch_1f
    move v0, v4

    goto :goto_11

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    const/16 v0, 0x5c

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_12

    :pswitch_21
    move v0, v2

    goto :goto_12

    :pswitch_22
    move v0, v3

    goto :goto_12

    :pswitch_23
    move v0, v4

    goto :goto_12

    :cond_9
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    const/16 v0, 0x5c

    :goto_13
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_13

    :pswitch_25
    move v0, v2

    goto :goto_13

    :pswitch_26
    move v0, v3

    goto :goto_13

    :pswitch_27
    move v0, v4

    goto :goto_13

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

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 72
    invoke-direct {p0}, Lcom/whatsapp/DialogToastListActivity;-><init>()V

    .line 84
    const/4 v0, 0x4

    iput v0, p0, Lcom/whatsapp/MediaGallery;->l:I

    .line 101
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->s:Ljava/util/TreeMap;

    .line 22
    return-void
.end method

.method static a(Lcom/whatsapp/MediaGallery;)Ljava/util/ArrayList;
    .locals 1
    .parameter

    .prologue
    .line 56
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method static a(Lcom/whatsapp/MediaGallery;Lcom/whatsapp/sz;ILcom/whatsapp/MediaGalleryImageView;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 107
    invoke-direct {p0, p1, p2, p3}, Lcom/whatsapp/MediaGallery;->a(Lcom/whatsapp/sz;ILcom/whatsapp/MediaGalleryImageView;)V

    return-void
.end method

.method private a(Lcom/whatsapp/sz;ILcom/whatsapp/MediaGalleryImageView;)V
    .locals 6
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 135
    if-nez p1, :cond_0

    .line 136
    sget-object v0, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 73
    :cond_0
    iget-object v0, p1, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 2
    iget-byte v1, p1, Lcom/whatsapp/sz;->l:B

    packed-switch v1, :pswitch_data_0

    .line 17
    :cond_1
    :goto_0
    return-void

    .line 115
    :pswitch_0
    const v1, 0x7f020008

    invoke-virtual {p3, v1}, Lcom/whatsapp/MediaGalleryImageView;->setImageResource(I)V

    .line 100
    if-eqz v2, :cond_1

    .line 126
    :pswitch_1
    sget-object v1, Lcom/whatsapp/MediaGalleryImageView;->tempBitmaps:Ljava/util/HashMap;

    iget-object v3, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/SoftReference;

    .line 93
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    .line 78
    invoke-virtual {p3, v1}, Lcom/whatsapp/MediaGalleryImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 44
    if-eqz v2, :cond_1

    .line 86
    :cond_2
    invoke-static {p1}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 7
    if-eqz v1, :cond_1

    .line 38
    invoke-virtual {p3, v1}, Lcom/whatsapp/MediaGalleryImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 75
    iget-object v3, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    iget v4, p0, Lcom/whatsapp/MediaGallery;->p:I

    if-lt v3, v4, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    iget v3, p0, Lcom/whatsapp/MediaGallery;->p:I

    if-ge v1, v3, :cond_1

    .line 91
    :cond_3
    iget-object v0, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iget v1, p0, Lcom/whatsapp/MediaGallery;->p:I

    invoke-virtual {p3, p1, p2, v0, v1}, Lcom/whatsapp/MediaGalleryImageView;->a(Lcom/whatsapp/sz;ILandroid/net/Uri;I)V

    if-eqz v2, :cond_1

    .line 129
    :pswitch_2
    sget-object v0, Lcom/whatsapp/MediaGalleryImageView;->tempBitmaps:Ljava/util/HashMap;

    iget-object v1, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 6
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_8

    .line 130
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 132
    :goto_1
    if-nez v0, :cond_4

    .line 25
    invoke-static {p1}, Lcom/whatsapp/m5;->b(Lcom/whatsapp/sz;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 48
    :cond_4
    if-eqz v0, :cond_7

    .line 11
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    sget-object v3, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->X:I

    if-ne v1, v3, :cond_5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v3, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->X:I

    if-eq v1, v3, :cond_6

    .line 121
    :cond_5
    sget-object v1, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->X:I

    sget-object v3, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    iget v3, v3, Lcom/whatsapp/j4;->X:I

    const/4 v4, 0x1

    invoke-static {v0, v1, v3, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 106
    :cond_6
    new-instance v1, Lcom/whatsapp/VideoBitmapDrawable;

    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    iget-wide v4, p1, Lcom/whatsapp/sz;->m:J

    invoke-static {v3, v4, v5}, Landroid/text/format/Formatter;->formatShortFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v1, p0, v0, v3, v4}, Lcom/whatsapp/VideoBitmapDrawable;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;F)V

    .line 71
    invoke-virtual {p3, v1}, Lcom/whatsapp/MediaGalleryImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 87
    if-eqz v2, :cond_1

    .line 127
    :cond_7
    const v0, 0x7f02000d

    invoke-virtual {p3, v0}, Lcom/whatsapp/MediaGalleryImageView;->setImageResource(I)V

    goto/16 :goto_0

    :cond_8
    move-object v0, v1

    goto :goto_1

    .line 2
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private b()I
    .locals 4

    .prologue
    .line 83
    sget-object v0, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    iget v0, v0, Lcom/whatsapp/j4;->Y:I

    sget-object v1, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->Z:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    sget-object v1, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->ab:F

    float-to-int v1, v1

    add-int/2addr v0, v1

    .line 90
    iget-object v1, p0, Lcom/whatsapp/MediaGallery;->j:Landroid/view/Display;

    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v1

    div-int v0, v1, v0

    iput v0, p0, Lcom/whatsapp/MediaGallery;->l:I

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/whatsapp/MediaGallery;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->j:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    sget-object v1, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    iget v1, v1, Lcom/whatsapp/j4;->ab:F

    float-to-int v1, v1

    iget v2, p0, Lcom/whatsapp/MediaGallery;->l:I

    add-int/lit8 v2, v2, 0x2

    mul-int/2addr v1, v2

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/whatsapp/MediaGallery;->l:I

    div-int/2addr v0, v1

    iput v0, p0, Lcom/whatsapp/MediaGallery;->p:I

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/MediaGallery;->j:Landroid/view/Display;

    invoke-virtual {v1}, Landroid/view/Display;->getWidth()I

    move-result v1

    iget v2, p0, Lcom/whatsapp/MediaGallery;->p:I

    iget v3, p0, Lcom/whatsapp/MediaGallery;->l:I

    mul-int/2addr v2, v3

    sub-int/2addr v1, v2

    sget-object v2, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    iget v2, v2, Lcom/whatsapp/j4;->ab:F

    float-to-int v2, v2

    iget v3, p0, Lcom/whatsapp/MediaGallery;->l:I

    add-int/lit8 v3, v3, -0x1

    mul-int/2addr v2, v3

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 137
    iget v0, p0, Lcom/whatsapp/MediaGallery;->p:I

    return v0
.end method

.method static b(Lcom/whatsapp/MediaGallery;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 13
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->i:Ljava/lang/String;

    return-object v0
.end method

.method static c(Lcom/whatsapp/MediaGallery;)Ljava/util/TreeMap;
    .locals 1
    .parameter

    .prologue
    .line 140
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->s:Ljava/util/TreeMap;

    return-object v0
.end method

.method static d(Lcom/whatsapp/MediaGallery;)I
    .locals 1
    .parameter

    .prologue
    .line 61
    iget v0, p0, Lcom/whatsapp/MediaGallery;->l:I

    return v0
.end method

.method static d()Lcom/whatsapp/j4;
    .locals 1

    .prologue
    .line 131
    sget-object v0, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    return-object v0
.end method

.method static e(Lcom/whatsapp/MediaGallery;)I
    .locals 1
    .parameter

    .prologue
    .line 21
    iget v0, p0, Lcom/whatsapp/MediaGallery;->p:I

    return v0
.end method

.method static f(Lcom/whatsapp/MediaGallery;)Landroid/view/View$OnClickListener;
    .locals 1
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->r:Landroid/view/View$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public a(J)Lcom/whatsapp/aab;
    .locals 7
    .parameter

    .prologue
    const/4 v6, 0x1

    .line 55
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 89
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 119
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->t:Lcom/whatsapp/aab;

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->t:Lcom/whatsapp/aab;

    .line 128
    :goto_0
    return-object v0

    .line 120
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->u:Lcom/whatsapp/aab;

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->u:Lcom/whatsapp/aab;

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->v:Lcom/whatsapp/aab;

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 128
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->v:Lcom/whatsapp/aab;

    goto :goto_0

    .line 67
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->w:Ljava/util/Calendar;

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 99
    new-instance v0, Lcom/whatsapp/aab;

    const/4 v2, 0x4

    new-instance v3, Ljava/util/GregorianCalendar;

    invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v5, 0x2

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-direct {v3, v4, v1, v6}, Ljava/util/GregorianCalendar;-><init>(III)V

    invoke-direct {v0, p0, v2, v3}, Lcom/whatsapp/aab;-><init>(Lcom/whatsapp/MediaGallery;ILjava/util/Calendar;)V

    goto :goto_0

    .line 96
    :cond_3
    new-instance v0, Lcom/whatsapp/aab;

    const/4 v2, 0x5

    new-instance v3, Ljava/util/GregorianCalendar;

    invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-direct {v3, v1, v6, v6}, Ljava/util/GregorianCalendar;-><init>(III)V

    invoke-direct {v0, p0, v2, v3}, Lcom/whatsapp/aab;-><init>(Lcom/whatsapp/MediaGallery;ILjava/util/Calendar;)V

    goto :goto_0
.end method

.method public a()V
    .locals 6

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 53
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 32
    iget-wide v4, v0, Lcom/whatsapp/sz;->i:J

    invoke-virtual {p0, v4, v5}, Lcom/whatsapp/MediaGallery;->a(J)Lcom/whatsapp/aab;

    move-result-object v4

    .line 139
    iget-object v1, p0, Lcom/whatsapp/MediaGallery;->s:Ljava/util/TreeMap;

    invoke-virtual {v1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 62
    if-nez v1, :cond_1

    .line 9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 85
    iget-object v5, p0, Lcom/whatsapp/MediaGallery;->s:Ljava/util/TreeMap;

    invoke-virtual {v5, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    if-eqz v2, :cond_0

    .line 42
    :cond_2
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 20
    sget-object v0, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->removeAllViewsInLayout()V

    .line 30
    invoke-static {}, Lcom/whatsapp/MediaGalleryImageView;->a()V

    .line 94
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .parameter

    .prologue
    .line 110
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 76
    invoke-direct {p0}, Lcom/whatsapp/MediaGallery;->b()I

    .line 33
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->m:Lcom/whatsapp/se;

    invoke-virtual {v0}, Lcom/whatsapp/se;->a()V

    .line 141
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->m:Lcom/whatsapp/se;

    invoke-virtual {v0}, Lcom/whatsapp/se;->notifyDataSetChanged()V

    .line 109
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 9
    .parameter

    .prologue
    const v8, 0x7f0d0134

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x6

    const/4 v4, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 1
    sget-object v0, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 102
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    invoke-static {}, Lcom/whatsapp/App;->z()V

    .line 37
    const v0, 0x7f030043

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaGallery;->setContentView(I)V

    .line 64
    sget-object v0, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    if-nez v0, :cond_0

    .line 125
    invoke-static {p0}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/MediaGallery;->h:Lcom/whatsapp/j4;

    .line 39
    :cond_0
    sput-object p0, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    .line 45
    new-instance v0, Lcom/whatsapp/aab;

    const/4 v1, 0x1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/whatsapp/aab;-><init>(Lcom/whatsapp/MediaGallery;ILjava/util/Calendar;)V

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->t:Lcom/whatsapp/aab;

    .line 18
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->t:Lcom/whatsapp/aab;

    const/4 v1, -0x2

    invoke-virtual {v0, v5, v1}, Lcom/whatsapp/aab;->add(II)V

    .line 69
    new-instance v0, Lcom/whatsapp/aab;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-direct {v0, p0, v6, v1}, Lcom/whatsapp/aab;-><init>(Lcom/whatsapp/MediaGallery;ILjava/util/Calendar;)V

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->u:Lcom/whatsapp/aab;

    .line 63
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->u:Lcom/whatsapp/aab;

    const/4 v1, -0x7

    invoke-virtual {v0, v5, v1}, Lcom/whatsapp/aab;->add(II)V

    .line 50
    new-instance v0, Lcom/whatsapp/aab;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-direct {v0, p0, v7, v1}, Lcom/whatsapp/aab;-><init>(Lcom/whatsapp/MediaGallery;ILjava/util/Calendar;)V

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->v:Lcom/whatsapp/aab;

    .line 133
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->v:Lcom/whatsapp/aab;

    const/16 v1, -0x1c

    invoke-virtual {v0, v5, v1}, Lcom/whatsapp/aab;->add(II)V

    .line 80
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->w:Ljava/util/Calendar;

    .line 112
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->w:Ljava/util/Calendar;

    const/16 v1, -0x16e

    invoke-virtual {v0, v5, v1}, Ljava/util/Calendar;->add(II)V

    .line 14
    invoke-virtual {p0}, Lcom/whatsapp/MediaGallery;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->i:Ljava/lang/String;

    .line 43
    invoke-virtual {p0}, Lcom/whatsapp/MediaGallery;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->j:Landroid/view/Display;

    .line 65
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/MediaGallery;->i:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 70
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 113
    iget-object v1, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 138
    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v1

    .line 105
    invoke-virtual {p0}, Lcom/whatsapp/MediaGallery;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/whatsapp/v4;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 36
    const v0, 0x7f0d0133

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaGallery;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-nez v2, :cond_6

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    if-eqz v3, :cond_2

    .line 52
    :cond_1
    invoke-virtual {p0, v8}, Lcom/whatsapp/MediaGallery;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f090213

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 79
    :cond_2
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/MediaGallery;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/fq;->n(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->k:Ljava/util/ArrayList;

    .line 51
    invoke-virtual {p0}, Lcom/whatsapp/MediaGallery;->getListView()Landroid/widget/ListView;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    .line 92
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setClickable(Z)V

    .line 57
    invoke-direct {p0}, Lcom/whatsapp/MediaGallery;->b()I

    .line 23
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 19
    invoke-virtual {p0, v8}, Lcom/whatsapp/MediaGallery;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 123
    :cond_3
    invoke-virtual {p0}, Lcom/whatsapp/MediaGallery;->a()V

    .line 81
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 46
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 97
    new-instance v0, Lcom/whatsapp/se;

    invoke-direct {v0, p0}, Lcom/whatsapp/se;-><init>(Lcom/whatsapp/MediaGallery;)V

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->m:Lcom/whatsapp/se;

    .line 74
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/whatsapp/MediaGallery;->m:Lcom/whatsapp/se;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 59
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setClickable(Z)V

    .line 34
    new-instance v0, Lcom/whatsapp/rw;

    invoke-direct {v0, p0}, Lcom/whatsapp/rw;-><init>(Lcom/whatsapp/MediaGallery;)V

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->r:Landroid/view/View$OnClickListener;

    .line 66
    invoke-virtual {p0}, Lcom/whatsapp/MediaGallery;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 58
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 142
    sget-object v1, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    sget-object v1, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 4
    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_7

    const v0, 0x7f0900b6

    :goto_1
    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaGallery;->a(I)V

    if-eqz v3, :cond_5

    .line 35
    :cond_4
    const v0, 0x7f090211

    invoke-virtual {p0, v0}, Lcom/whatsapp/MediaGallery;->a(I)V

    .line 31
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/whatsapp/MediaGallery;->m:Lcom/whatsapp/se;

    invoke-virtual {v1}, Lcom/whatsapp/se;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 122
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->n:Landroid/widget/ListView;

    new-instance v1, Lcom/whatsapp/sw;

    invoke-direct {v1, p0}, Lcom/whatsapp/sw;-><init>(Lcom/whatsapp/MediaGallery;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 49
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/m5;->b(Ljava/lang/String;)V

    .line 118
    return-void

    :cond_6
    move-object v1, v2

    .line 36
    goto/16 :goto_0

    .line 4
    :cond_7
    const v0, 0x7f0900b7

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 114
    sget-object v0, Lcom/whatsapp/MediaGallery;->z:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 27
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onDestroy()V

    .line 104
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/MediaGallery;->g:Lcom/whatsapp/MediaGallery;

    .line 47
    invoke-virtual {p0}, Lcom/whatsapp/MediaGallery;->c()V

    .line 29
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->i:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/m5;->c(Ljava/lang/String;)V

    .line 124
    invoke-static {}, Lcom/whatsapp/App;->z()V

    .line 134
    return-void
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->o:Lcom/whatsapp/q9;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->o:Lcom/whatsapp/q9;

    invoke-virtual {v0}, Lcom/whatsapp/q9;->a()V

    .line 103
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->o:Lcom/whatsapp/q9;

    invoke-virtual {v0}, Lcom/whatsapp/q9;->interrupt()V

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->o:Lcom/whatsapp/q9;

    .line 41
    :cond_0
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onPause()V

    .line 95
    return-void
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 16
    invoke-super {p0}, Lcom/whatsapp/DialogToastListActivity;->onResume()V

    .line 10
    new-instance v0, Lcom/whatsapp/q9;

    invoke-direct {v0}, Lcom/whatsapp/q9;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/MediaGallery;->o:Lcom/whatsapp/q9;

    .line 116
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->o:Lcom/whatsapp/q9;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/whatsapp/q9;->a:Z

    .line 117
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->o:Lcom/whatsapp/q9;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/q9;->setPriority(I)V

    .line 88
    iget-object v0, p0, Lcom/whatsapp/MediaGallery;->o:Lcom/whatsapp/q9;

    invoke-virtual {v0}, Lcom/whatsapp/q9;->start()V

    .line 26
    return-void
.end method
