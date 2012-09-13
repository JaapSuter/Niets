.class public Lcom/whatsapp/wallpaper/WallpaperPicker;
.super Landroid/app/Activity;
.source "WallpaperPicker.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Lcom/whatsapp/CustomVelocityGallery;

.field private b:Landroid/widget/ImageView;

.field c:Landroid/content/pm/PackageManager;

.field private d:Landroid/graphics/Bitmap;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/whatsapp/wallpaper/a;

.field private h:Lcom/whatsapp/wallpaper/b;

.field private i:Z

.field j:Landroid/content/res/Resources;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x4d

    const/16 v4, 0x3a

    const/16 v1, 0x36

    const/16 v3, 0x2d

    const/4 v6, 0x0

    const/16 v0, 0x9

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "W#9_U_)s^_B94C]Ec\u000ehyc\u001f\u0014yci\u001e\u0018yn\u007f\u0003\u001a~"

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

    const-string v0, "W#9_U_)s^_B94C]Ec\u001c}jz\u0004\u001eln\u007f\u0002\u0013ris\u0019\tdtq\u001e"

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

    const-string v0, "Y?4HTB,)DUX"

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

    const-string v0, "D(9d^"

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

    const-string v0, "A,1AJW=8_eF$>F_D"

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

    const-string v0, "U\"0\u0003M^,)^[F=sZ[Z!-LJS?"

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

    const-string v0, "R?<Z[T!8"

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

    const/4 v10, 0x7

    const-string v0, "i>0LVZ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_7
    if-gt v7, v8, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0x8

    const-string v0, "A,1AJW=8_\u0015D(.BOD.8rTY9\u0002KUC#9"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_8
    if-gt v6, v7, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_9
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_9

    :pswitch_1
    move v0, v2

    goto :goto_9

    :pswitch_2
    const/16 v0, 0x5d

    goto :goto_9

    :pswitch_3
    move v0, v3

    goto :goto_9

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_a

    :pswitch_5
    move v0, v2

    goto :goto_a

    :pswitch_6
    const/16 v0, 0x5d

    goto :goto_a

    :pswitch_7
    move v0, v3

    goto :goto_a

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_b

    :pswitch_9
    move v0, v2

    goto :goto_b

    :pswitch_a
    const/16 v0, 0x5d

    goto :goto_b

    :pswitch_b
    move v0, v3

    goto :goto_b

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_c

    :pswitch_d
    move v0, v2

    goto :goto_c

    :pswitch_e
    const/16 v0, 0x5d

    goto :goto_c

    :pswitch_f
    move v0, v3

    goto :goto_c

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_d

    :pswitch_11
    move v0, v2

    goto :goto_d

    :pswitch_12
    const/16 v0, 0x5d

    goto :goto_d

    :pswitch_13
    move v0, v3

    goto :goto_d

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_e

    :pswitch_15
    move v0, v2

    goto :goto_e

    :pswitch_16
    const/16 v0, 0x5d

    goto :goto_e

    :pswitch_17
    move v0, v3

    goto :goto_e

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_f

    :pswitch_19
    move v0, v2

    goto :goto_f

    :pswitch_1a
    const/16 v0, 0x5d

    goto :goto_f

    :pswitch_1b
    move v0, v3

    goto :goto_f

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_10

    :pswitch_1d
    move v0, v2

    goto :goto_10

    :pswitch_1e
    const/16 v0, 0x5d

    goto :goto_10

    :pswitch_1f
    move v0, v3

    goto :goto_10

    :cond_8
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_11
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_11

    :pswitch_21
    move v0, v2

    goto :goto_11

    :pswitch_22
    const/16 v0, 0x5d

    goto :goto_11

    :pswitch_23
    move v0, v3

    goto :goto_11

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
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/16 v1, 0x18

    .line 43
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->e:Ljava/util/ArrayList;

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->f:Ljava/util/ArrayList;

    .line 87
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->i:Z

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->j:Landroid/content/res/Resources;

    .line 41
    return-void
.end method

.method static a(Lcom/whatsapp/wallpaper/WallpaperPicker;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 89
    iput-object p1, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->d:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static a(Lcom/whatsapp/wallpaper/WallpaperPicker;Lcom/whatsapp/wallpaper/a;)Lcom/whatsapp/wallpaper/a;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 20
    iput-object p1, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->g:Lcom/whatsapp/wallpaper/a;

    return-object p1
.end method

.method static a(Lcom/whatsapp/wallpaper/WallpaperPicker;)Ljava/util/ArrayList;
    .locals 1
    .parameter

    .prologue
    .line 84
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method private a()V
    .locals 3

    .prologue
    .line 9
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->j:Landroid/content/res/Resources;

    sget-object v1, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/whatsapp/wallpaper/WallpaperPicker;->a(Landroid/content/res/Resources;Ljava/lang/String;)V

    .line 57
    return-void
.end method

.method private a(I)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x2

    .line 61
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 75
    sget-object v0, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v2, v0, v2

    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 56
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    aget-object v2, v2, v4

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 51
    sget-object v2, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 10
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/wallpaper/WallpaperPicker;->setResult(ILandroid/content/Intent;)V

    .line 38
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->finish()V

    .line 65
    return-void
.end method

.method private a(Landroid/content/res/Resources;Ljava/lang/String;)V
    .locals 10
    .parameter
    .parameter

    .prologue
    const/4 v9, 0x3

    const/4 v8, 0x1

    sget-boolean v1, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    .line 19
    const/high16 v0, 0x7f05

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    .line 67
    array-length v3, v2

    const/4 v0, 0x0

    :cond_0
    if-ge v0, v3, :cond_2

    aget-object v4, v2, v0

    .line 70
    sget-object v5, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/4 v6, 0x6

    aget-object v5, v5, v6

    invoke-virtual {p1, v4, v5, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 62
    if-eqz v5, :cond_1

    .line 28
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v6, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/4 v7, 0x7

    aget-object v6, v6, v7

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/4 v7, 0x6

    aget-object v6, v6, v7

    invoke-virtual {p1, v4, v6, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 14
    if-eqz v4, :cond_1

    .line 53
    iget-object v6, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->e:Ljava/util/ArrayList;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    iget-object v4, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->f:Ljava/util/ArrayList;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    :cond_1
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 25
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 79
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->removeDialog(I)V

    .line 12
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->showDialog(I)V

    .line 74
    :goto_0
    return-void

    .line 80
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->h:Lcom/whatsapp/wallpaper/b;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/b;->notifyDataSetChanged()V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 34
    iput-boolean v8, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->i:Z

    goto :goto_0

    .line 76
    :catch_0
    move-exception v0

    .line 40
    sget-object v0, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0, v9}, Lcom/whatsapp/wallpaper/WallpaperPicker;->removeDialog(I)V

    .line 49
    invoke-virtual {p0, v8}, Lcom/whatsapp/wallpaper/WallpaperPicker;->showDialog(I)V

    goto :goto_0

    .line 66
    :catch_1
    move-exception v0

    .line 6
    invoke-virtual {p0, v9}, Lcom/whatsapp/wallpaper/WallpaperPicker;->removeDialog(I)V

    .line 82
    invoke-virtual {p0, v8}, Lcom/whatsapp/wallpaper/WallpaperPicker;->showDialog(I)V

    goto :goto_0
.end method

.method static b(Lcom/whatsapp/wallpaper/WallpaperPicker;)Ljava/util/ArrayList;
    .locals 1
    .parameter

    .prologue
    .line 81
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method static c(Lcom/whatsapp/wallpaper/WallpaperPicker;)Landroid/graphics/Bitmap;
    .locals 1
    .parameter

    .prologue
    .line 47
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->d:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static d(Lcom/whatsapp/wallpaper/WallpaperPicker;)Landroid/widget/ImageView;
    .locals 1
    .parameter

    .prologue
    .line 85
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->b:Landroid/widget/ImageView;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .parameter

    .prologue
    .line 69
    iget-boolean v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->i:Z

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->a:Lcom/whatsapp/CustomVelocityGallery;

    invoke-virtual {v0}, Lcom/whatsapp/CustomVelocityGallery;->getSelectedItemPosition()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->a(I)V

    sget-boolean v0, Lcom/whatsapp/wallpaper/ImageViewTouchBase;->a:Z

    if-eqz v0, :cond_1

    .line 71
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->finish()V

    .line 4
    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .parameter

    .prologue
    .line 18
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 55
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->requestWindowFeature(I)Z

    .line 37
    invoke-virtual {p0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->c:Landroid/content/pm/PackageManager;

    .line 15
    const v0, 0x7f03005d

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->setContentView(I)V

    .line 29
    const v0, 0x7f0d0135

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/CustomVelocityGallery;

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->a:Lcom/whatsapp/CustomVelocityGallery;

    .line 3
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->a:Lcom/whatsapp/CustomVelocityGallery;

    new-instance v1, Lcom/whatsapp/wallpaper/m;

    invoke-direct {v1, p0}, Lcom/whatsapp/wallpaper/m;-><init>(Lcom/whatsapp/wallpaper/WallpaperPicker;)V

    invoke-virtual {v0, v1}, Lcom/whatsapp/CustomVelocityGallery;->a(Lcom/whatsapp/pp;)V

    .line 88
    new-instance v0, Lcom/whatsapp/wallpaper/b;

    invoke-direct {v0, p0, p0}, Lcom/whatsapp/wallpaper/b;-><init>(Lcom/whatsapp/wallpaper/WallpaperPicker;Lcom/whatsapp/wallpaper/WallpaperPicker;)V

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->h:Lcom/whatsapp/wallpaper/b;

    .line 50
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->a:Lcom/whatsapp/CustomVelocityGallery;

    iget-object v1, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->h:Lcom/whatsapp/wallpaper/b;

    invoke-virtual {v0, v1}, Lcom/whatsapp/CustomVelocityGallery;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 22
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->a:Lcom/whatsapp/CustomVelocityGallery;

    invoke-virtual {v0, p0}, Lcom/whatsapp/CustomVelocityGallery;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 23
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->a:Lcom/whatsapp/CustomVelocityGallery;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/CustomVelocityGallery;->setCallbackDuringFling(Z)V

    .line 26
    const v0, 0x7f0d0196

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    const v0, 0x7f0d0195

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->b:Landroid/widget/ImageView;

    .line 83
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->c:Landroid/content/pm/PackageManager;

    sget-object v1, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->j:Landroid/content/res/Resources;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    :goto_0
    return-void

    .line 30
    :catch_0
    move-exception v0

    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 33
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->showDialog(I)V

    goto :goto_0
.end method

.method public onCreateDialog(I)Landroid/app/Dialog;
    .locals 4
    .parameter

    .prologue
    const v3, 0x7f09000e

    .line 11
    packed-switch p1, :pswitch_data_0

    .line 2
    const/4 v0, 0x0

    .line 21
    :goto_0
    return-object v0

    .line 16
    :pswitch_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    sget-object v0, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 1
    :goto_1
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0900ed

    invoke-virtual {p0, v2}, Lcom/whatsapp/wallpaper/WallpaperPicker;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f0901a2

    invoke-virtual {p0, v2}, Lcom/whatsapp/wallpaper/WallpaperPicker;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f090010

    invoke-virtual {p0, v2}, Lcom/whatsapp/wallpaper/WallpaperPicker;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/whatsapp/wallpaper/o;

    invoke-direct {v3, p0, v0}, Lcom/whatsapp/wallpaper/o;-><init>(Lcom/whatsapp/wallpaper/WallpaperPicker;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090011

    invoke-virtual {p0, v1}, Lcom/whatsapp/wallpaper/WallpaperPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/wallpaper/n;

    invoke-direct {v2, p0}, Lcom/whatsapp/wallpaper/n;-><init>(Lcom/whatsapp/wallpaper/WallpaperPicker;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 16
    :cond_0
    sget-object v0, Lcom/whatsapp/wallpaper/WallpaperPicker;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    goto :goto_1

    .line 63
    :pswitch_1
    new-instance v0, Lcom/whatsapp/wallpaper/p;

    invoke-direct {v0, p0}, Lcom/whatsapp/wallpaper/p;-><init>(Lcom/whatsapp/wallpaper/WallpaperPicker;)V

    .line 8
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f090147

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v3, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000c

    new-instance v2, Lcom/whatsapp/wallpaper/r;

    invoke-direct {v2, p0}, Lcom/whatsapp/wallpaper/r;-><init>(Lcom/whatsapp/wallpaper/WallpaperPicker;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/wallpaper/q;

    invoke-direct {v1, p0}, Lcom/whatsapp/wallpaper/q;-><init>(Lcom/whatsapp/wallpaper/WallpaperPicker;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 21
    :pswitch_2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f09000d

    invoke-virtual {p0, v1}, Lcom/whatsapp/wallpaper/WallpaperPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09014b

    invoke-virtual {p0, v1}, Lcom/whatsapp/wallpaper/WallpaperPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0, v3}, Lcom/whatsapp/wallpaper/WallpaperPicker;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whatsapp/wallpaper/s;

    invoke-direct {v2, p0}, Lcom/whatsapp/wallpaper/s;-><init>(Lcom/whatsapp/wallpaper/WallpaperPicker;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto/16 :goto_0

    .line 11
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method protected onDestroy()V
    .locals 2

    .prologue
    .line 27
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 54
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->g:Lcom/whatsapp/wallpaper/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->g:Lcom/whatsapp/wallpaper/a;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/a;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_0

    .line 60
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->g:Lcom/whatsapp/wallpaper/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/wallpaper/a;->cancel(Z)Z

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->g:Lcom/whatsapp/wallpaper/a;

    .line 42
    :cond_0
    return-void
.end method

.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 45
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->g:Lcom/whatsapp/wallpaper/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->g:Lcom/whatsapp/wallpaper/a;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/a;->getStatus()Landroid/os/AsyncTask$Status;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask$Status;->FINISHED:Landroid/os/AsyncTask$Status;

    if-eq v0, v1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->g:Lcom/whatsapp/wallpaper/a;

    invoke-virtual {v0}, Lcom/whatsapp/wallpaper/a;->a()V

    .line 72
    :cond_0
    new-instance v0, Lcom/whatsapp/wallpaper/a;

    invoke-direct {v0, p0}, Lcom/whatsapp/wallpaper/a;-><init>(Lcom/whatsapp/wallpaper/WallpaperPicker;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Integer;

    const/4 v2, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/whatsapp/wallpaper/a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/wallpaper/a;

    iput-object v0, p0, Lcom/whatsapp/wallpaper/WallpaperPicker;->g:Lcom/whatsapp/wallpaper/a;

    .line 7
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .parameter

    .prologue
    .line 86
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 78
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 64
    invoke-direct {p0}, Lcom/whatsapp/wallpaper/WallpaperPicker;->a()V

    .line 32
    return-void
.end method
