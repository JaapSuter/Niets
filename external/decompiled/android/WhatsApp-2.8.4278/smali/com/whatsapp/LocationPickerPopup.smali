.class public Lcom/whatsapp/LocationPickerPopup;
.super Landroid/app/Activity;
.source "LocationPickerPopup.java"


# static fields
.field private static o:J

.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/whatsapp/re;

.field private c:Lcom/whatsapp/z9;

.field private d:Landroid/location/Location;

.field private e:Landroid/location/LocationManager;

.field private f:Landroid/location/LocationListener;

.field private g:Landroid/view/View;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;

.field private j:Lcom/whatsapp/kb;

.field private k:Landroid/app/AlertDialog;

.field private l:Landroid/location/Location;

.field private m:Landroid/os/Handler;

.field private n:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v4, 0x6a

    const/16 v2, 0x5e

    const/16 v1, 0x56

    const/16 v3, 0x34

    const/4 v6, 0x0

    const/16 v0, 0x9

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, ":1\u0018U\u001e?1\u0015D\u000355\u001e@E2;\u0008@\u00189\'"

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

    const-string v0, "<7\u001f"

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

    const-string v0, ":?\u0002[\u001f\"\u0001\u0012Z\u000c:?\u000fQ\u0018"

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

    const-string v0, ":1\u0018U\u001e?1\u0015"

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

    const-string v0, ":1\u0018U\u001e?1\u0015D\u000355\u001eFE5,\u001eU\u001e3"

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

    const-string v0, "0?\u0012X\u000f2~\u000f[J$;\nA\u000f%*[s:\u0005~\u0017[\t7*\u0012[\u0004v+\u000bP\u000b\";W\u0014\u000310\u0014F\u000f"

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

    const-string v0, "1.\u0008"

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

    const-string v0, "8;\u000fC\u0005$5"

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

    const-string v0, "0?\u0012XJ\"1[F\u000f\'+\u001eG\u001ev\u0010>`=\u0019\u000c0\u0014\u00069=\u001a@\u000390[A\u001a2?\u000fQFv7\u001cZ\u0005$;"

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

    sput-object v9, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    .line 66
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/whatsapp/LocationPickerPopup;->o:J

    return-void

    .line -1
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
    const/16 v0, 0x7b

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
    const/16 v0, 0x7b

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
    const/16 v0, 0x7b

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
    const/16 v0, 0x7b

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
    const/16 v0, 0x7b

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
    const/16 v0, 0x7b

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
    const/16 v0, 0x7b

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
    const/16 v0, 0x7b

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
    const/16 v0, 0x7b

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
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static a()J
    .locals 2

    .prologue
    .line 64
    sget-wide v0, Lcom/whatsapp/LocationPickerPopup;->o:J

    return-wide v0
.end method

.method static a(J)J
    .locals 0
    .parameter

    .prologue
    .line 70
    sput-wide p0, Lcom/whatsapp/LocationPickerPopup;->o:J

    return-wide p0
.end method

.method static a(Lcom/whatsapp/LocationPickerPopup;)Landroid/location/Location;
    .locals 1
    .parameter

    .prologue
    .line 25
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->l:Landroid/location/Location;

    return-object v0
.end method

.method static a(Lcom/whatsapp/LocationPickerPopup;Lcom/whatsapp/z9;)Lcom/whatsapp/z9;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 10
    iput-object p1, p0, Lcom/whatsapp/LocationPickerPopup;->c:Lcom/whatsapp/z9;

    return-object p1
.end method

.method private a(Landroid/location/Location;)V
    .locals 2
    .parameter

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->c:Lcom/whatsapp/z9;

    if-nez v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->e:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->f:Landroid/location/LocationListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 69
    new-instance v0, Lcom/whatsapp/z9;

    invoke-direct {v0}, Lcom/whatsapp/z9;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->c:Lcom/whatsapp/z9;

    .line 51
    iput-object p1, p0, Lcom/whatsapp/LocationPickerPopup;->d:Landroid/location/Location;

    .line 21
    new-instance v0, Lcom/whatsapp/kb;

    invoke-direct {v0, p0, p1}, Lcom/whatsapp/kb;-><init>(Lcom/whatsapp/LocationPickerPopup;Landroid/location/Location;)V

    iput-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->j:Lcom/whatsapp/kb;

    .line 1
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->j:Lcom/whatsapp/kb;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/kb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 19
    :cond_0
    return-void
.end method

.method static a(Lcom/whatsapp/LocationPickerPopup;Landroid/location/Location;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lcom/whatsapp/LocationPickerPopup;->a(Landroid/location/Location;)V

    return-void
.end method

.method static b(Lcom/whatsapp/LocationPickerPopup;Landroid/location/Location;)Landroid/location/Location;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 50
    iput-object p1, p0, Lcom/whatsapp/LocationPickerPopup;->l:Landroid/location/Location;

    return-object p1
.end method

.method static b(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/z9;
    .locals 1
    .parameter

    .prologue
    .line 73
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->c:Lcom/whatsapp/z9;

    return-object v0
.end method

.method static c(Lcom/whatsapp/LocationPickerPopup;)Ljava/lang/Runnable;
    .locals 1
    .parameter

    .prologue
    .line 39
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->n:Ljava/lang/Runnable;

    return-object v0
.end method

.method static d(Lcom/whatsapp/LocationPickerPopup;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->m:Landroid/os/Handler;

    return-object v0
.end method

.method static e(Lcom/whatsapp/LocationPickerPopup;)Landroid/location/Location;
    .locals 1
    .parameter

    .prologue
    .line 49
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->d:Landroid/location/Location;

    return-object v0
.end method

.method static f(Lcom/whatsapp/LocationPickerPopup;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 67
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->a:Ljava/lang/String;

    return-object v0
.end method

.method static g(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/TextView;
    .locals 1
    .parameter

    .prologue
    .line 24
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method static h(Lcom/whatsapp/LocationPickerPopup;)Landroid/widget/ImageView;
    .locals 1
    .parameter

    .prologue
    .line 45
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->h:Landroid/widget/ImageView;

    return-object v0
.end method

.method static i(Lcom/whatsapp/LocationPickerPopup;)Landroid/view/View;
    .locals 1
    .parameter

    .prologue
    .line 13
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->g:Landroid/view/View;

    return-object v0
.end method

.method static j(Lcom/whatsapp/LocationPickerPopup;)Landroid/app/AlertDialog;
    .locals 1
    .parameter

    .prologue
    .line 26
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->k:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static k(Lcom/whatsapp/LocationPickerPopup;)Lcom/whatsapp/re;
    .locals 1
    .parameter

    .prologue
    .line 27
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->b:Lcom/whatsapp/re;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .parameter

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 8
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 29
    sget-object v0, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 44
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-nez v0, :cond_0

    .line 23
    invoke-virtual {p0}, Lcom/whatsapp/LocationPickerPopup;->finish()V

    .line 48
    :goto_0
    return-void

    .line 58
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/LocationPickerPopup;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->a:Ljava/lang/String;

    .line 32
    new-instance v0, Lcom/whatsapp/re;

    invoke-direct {v0, p0, p0}, Lcom/whatsapp/re;-><init>(Lcom/whatsapp/LocationPickerPopup;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->b:Lcom/whatsapp/re;

    .line 60
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 7
    iput-object v5, p0, Lcom/whatsapp/LocationPickerPopup;->l:Landroid/location/Location;

    .line 56
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->m:Landroid/os/Handler;

    .line 17
    new-instance v1, Lcom/whatsapp/cw;

    invoke-direct {v1, p0}, Lcom/whatsapp/cw;-><init>(Lcom/whatsapp/LocationPickerPopup;)V

    iput-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->n:Ljava/lang/Runnable;

    .line 75
    iget-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->m:Landroid/os/Handler;

    iget-object v2, p0, Lcom/whatsapp/LocationPickerPopup;->n:Ljava/lang/Runnable;

    const-wide/16 v3, 0x3a98

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 9
    sget-object v1, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {p0, v1}, Lcom/whatsapp/LocationPickerPopup;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    iput-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->e:Landroid/location/LocationManager;

    .line 38
    new-instance v1, Lcom/whatsapp/dw;

    invoke-direct {v1, p0}, Lcom/whatsapp/dw;-><init>(Lcom/whatsapp/LocationPickerPopup;)V

    iput-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->f:Landroid/location/LocationListener;

    .line 12
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 74
    invoke-virtual {p0}, Lcom/whatsapp/LocationPickerPopup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090190

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 11
    iget-object v2, p0, Lcom/whatsapp/LocationPickerPopup;->b:Lcom/whatsapp/re;

    new-instance v3, Lcom/whatsapp/ew;

    invoke-direct {v3, p0}, Lcom/whatsapp/ew;-><init>(Lcom/whatsapp/LocationPickerPopup;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 55
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->k:Landroid/app/AlertDialog;

    .line 31
    iget-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->k:Landroid/app/AlertDialog;

    new-instance v2, Lcom/whatsapp/fw;

    invoke-direct {v2, p0}, Lcom/whatsapp/fw;-><init>(Lcom/whatsapp/LocationPickerPopup;)V

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 35
    iget-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->k:Landroid/app/AlertDialog;

    invoke-virtual {v1}, Landroid/app/AlertDialog;->getListView()Landroid/widget/ListView;

    move-result-object v2

    .line 20
    invoke-virtual {v2, v6}, Landroid/widget/ListView;->setHeaderDividersEnabled(Z)V

    .line 34
    const v1, 0x7f03003f

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 53
    const v1, 0x7f0d012e

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->i:Landroid/widget/TextView;

    .line 52
    const v1, 0x7f0d012f

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->h:Landroid/widget/ImageView;

    .line 65
    invoke-virtual {v2, v3, v5, v6}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 54
    const v1, 0x7f030040

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->g:Landroid/view/View;

    .line 30
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->g:Landroid/view/View;

    const v1, 0x7f0d0130

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f090193

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 71
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v5, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->k:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 15
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 42
    sget-object v0, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->m:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->n:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 72
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->j:Lcom/whatsapp/kb;

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->j:Lcom/whatsapp/kb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whatsapp/kb;->cancel(Z)Z

    .line 41
    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->e:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/whatsapp/LocationPickerPopup;->f:Landroid/location/LocationListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 22
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 33
    return-void
.end method

.method public onResume()V
    .locals 6

    .prologue
    .line 47
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 36
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->d:Landroid/location/Location;

    if-nez v0, :cond_0

    .line 63
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->e:Landroid/location/LocationManager;

    sget-object v1, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/whatsapp/LocationPickerPopup;->f:Landroid/location/LocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/whatsapp/LocationPickerPopup;->e:Landroid/location/LocationManager;

    sget-object v1, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/whatsapp/LocationPickerPopup;->f:Landroid/location/LocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 61
    :cond_0
    :goto_1
    return-void

    .line 57
    :catch_0
    move-exception v0

    .line 14
    sget-object v1, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 2
    :catch_1
    move-exception v0

    .line 43
    sget-object v1, Lcom/whatsapp/LocationPickerPopup;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-static {v1, v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method
