.class public Lcom/whatsapp/mb;
.super Landroid/os/AsyncTask;
.source "mb.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static h:I

.field private static final z:[Ljava/lang/String;


# instance fields
.field protected final a:Lcom/whatsapp/sz;

.field private final b:Lcom/whatsapp/MediaData;

.field private final c:Landroid/location/LocationManager;

.field private d:Landroid/location/Location;

.field public e:I

.field private f:[B

.field g:Lcom/whatsapp/bj;

.field i:Landroid/location/LocationListener;

.field j:Landroid/location/LocationListener;

.field k:I

.field l:Landroid/location/Location;

.field m:Landroid/location/Location;

.field n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v3, 0x48

    const/16 v4, 0x1b

    const/16 v1, 0x11

    const/16 v2, 0x10

    const/4 v6, 0x0

    const/16 v0, 0xc

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "|\u001b`,tf\u0014|\'zuUy\'~c\u0008\u007f:;"

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

    const-string v0, "s\u001bthyx\u000e})k1\u0008u+~x\u000cu,"

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

    const-string v0, "y\u000ed8!>U})kbTw\'tv\u0016u)kx\t>+t|U})kbUq8r>\td)ox\u0019})k.\u0019u&ot\u0008-"

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

    const-string v0, "7\ty2~,K\'xc M nht\u0014c\'i,\u000eb=~7\u001c\u007f:vp\u000e-\"kvWr)ht\u0016y&~7\u0017\u007f*r}\u001f-<id\u001f6%zc\u0011u:h,\u0019\u007f$tc@b-\u007f4MS;rk\u001f*%ru_\'\u000b"

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

    const-string v0, "7\u0000\u007f\'v,"

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

    const-string v0, "|\u001b`,tf\u0014|\'zuUv)r}\u001ftgit\u000eb1"

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

    const-string v0, "|\u001b`,tf\u0014|\'zuUs\'zc\tu\u0004tr\u001bd!t\u007fZ"

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

    const-string v0, "v\nc"

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

    const/16 v10, 0x8

    const-string v0, "|\u001b`,tf\u0014|\'zuUs\'zc\tug~c\u0008\u007f:;"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_8
    if-gt v7, v8, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x9

    const-string v0, "|\u001b`,tf\u0014|\'zuUv!utUu:i~\u00080"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_9
    if-gt v7, v8, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xa

    const-string v0, "\u007f\u001fd?tc\u0011"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_a
    if-gt v7, v8, :cond_a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0xb

    const-string v0, "}\u0015s)ox\u0015~"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_b
    if-gt v6, v7, :cond_b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    .line 10
    const/16 v0, 0xf

    sput v0, Lcom/whatsapp/mb;->h:I

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_c
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_c

    :pswitch_1
    const/16 v0, 0x7a

    goto :goto_c

    :pswitch_2
    move v0, v2

    goto :goto_c

    :pswitch_3
    move v0, v3

    goto :goto_c

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_d

    :pswitch_5
    const/16 v0, 0x7a

    goto :goto_d

    :pswitch_6
    move v0, v2

    goto :goto_d

    :pswitch_7
    move v0, v3

    goto :goto_d

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_e

    :pswitch_9
    const/16 v0, 0x7a

    goto :goto_e

    :pswitch_a
    move v0, v2

    goto :goto_e

    :pswitch_b
    move v0, v3

    goto :goto_e

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_f

    :pswitch_d
    const/16 v0, 0x7a

    goto :goto_f

    :pswitch_e
    move v0, v2

    goto :goto_f

    :pswitch_f
    move v0, v3

    goto :goto_f

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_10

    :pswitch_11
    const/16 v0, 0x7a

    goto :goto_10

    :pswitch_12
    move v0, v2

    goto :goto_10

    :pswitch_13
    move v0, v3

    goto :goto_10

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_11
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_11

    :pswitch_15
    const/16 v0, 0x7a

    goto :goto_11

    :pswitch_16
    move v0, v2

    goto :goto_11

    :pswitch_17
    move v0, v3

    goto :goto_11

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_12

    :pswitch_19
    const/16 v0, 0x7a

    goto :goto_12

    :pswitch_1a
    move v0, v2

    goto :goto_12

    :pswitch_1b
    move v0, v3

    goto :goto_12

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_13
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_13

    :pswitch_1d
    const/16 v0, 0x7a

    goto :goto_13

    :pswitch_1e
    move v0, v2

    goto :goto_13

    :pswitch_1f
    move v0, v3

    goto :goto_13

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_14
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_14

    :pswitch_21
    const/16 v0, 0x7a

    goto :goto_14

    :pswitch_22
    move v0, v2

    goto :goto_14

    :pswitch_23
    move v0, v3

    goto :goto_14

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_15
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_15

    :pswitch_25
    const/16 v0, 0x7a

    goto :goto_15

    :pswitch_26
    move v0, v2

    goto :goto_15

    :pswitch_27
    move v0, v3

    goto :goto_15

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_16
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_16

    :pswitch_29
    const/16 v0, 0x7a

    goto :goto_16

    :pswitch_2a
    move v0, v2

    goto :goto_16

    :pswitch_2b
    move v0, v3

    goto :goto_16

    :cond_b
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_17
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_17

    :pswitch_2d
    const/16 v0, 0x7a

    goto :goto_17

    :pswitch_2e
    move v0, v2

    goto :goto_17

    :pswitch_2f
    move v0, v3

    goto :goto_17

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

    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_28
        :pswitch_29
        :pswitch_2a
        :pswitch_2b
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_2c
        :pswitch_2d
        :pswitch_2e
        :pswitch_2f
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/whatsapp/sz;Lcom/whatsapp/bj;)V
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    .line 113
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 32
    sget v0, Lcom/whatsapp/mb;->h:I

    iput v0, p0, Lcom/whatsapp/mb;->e:I

    .line 14
    iput-object v1, p0, Lcom/whatsapp/mb;->f:[B

    .line 136
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/mb;->k:I

    .line 59
    iput-object v1, p0, Lcom/whatsapp/mb;->l:Landroid/location/Location;

    .line 115
    iput-object v1, p0, Lcom/whatsapp/mb;->m:Landroid/location/Location;

    .line 67
    iput-object p2, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    .line 24
    iget-object v0, p2, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    iput-object v0, p0, Lcom/whatsapp/mb;->b:Lcom/whatsapp/MediaData;

    .line 106
    sget-object v0, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lcom/whatsapp/mb;->c:Landroid/location/LocationManager;

    .line 17
    iput-object p3, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    .line 43
    iget-wide v0, p2, Lcom/whatsapp/sz;->q:D

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p2, Lcom/whatsapp/sz;->r:D

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_0

    .line 12
    new-instance v0, Landroid/location/Location;

    const-string v1, ""

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    .line 122
    iget-object v0, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    iget-wide v1, p2, Lcom/whatsapp/sz;->q:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLatitude(D)V

    .line 19
    iget-object v0, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    iget-wide v1, p2, Lcom/whatsapp/sz;->r:D

    invoke-virtual {v0, v1, v2}, Landroid/location/Location;->setLongitude(D)V

    .line 21
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/mb;->n:Z

    .line 83
    :cond_0
    return-void
.end method

.method public static a(DD)[B
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 39
    sget v0, Lcom/whatsapp/mb;->h:I

    invoke-static {p0, p1, p2, p3, v0}, Lcom/whatsapp/mb;->a(DDI)[B

    move-result-object v0

    return-object v0
.end method

.method public static a(DDI)[B
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    .line 1
    const/4 v0, 0x0

    .line 4
    invoke-static {p0, p1, p2, p3, p4}, Lcom/whatsapp/mb;->b(DDI)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 5
    if-eqz v1, :cond_0

    .line 97
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 130
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x50

    invoke-virtual {v1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 61
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 49
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 36
    :cond_0
    return-object v0
.end method

.method public static b(DD)Landroid/graphics/Bitmap;
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 93
    sget v0, Lcom/whatsapp/mb;->h:I

    invoke-static {p0, p1, p2, p3, v0}, Lcom/whatsapp/mb;->b(DDI)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static b(DDI)Landroid/graphics/Bitmap;
    .locals 7
    .parameter
    .parameter
    .parameter

    .prologue
    const/16 v6, 0xaa

    const/4 v0, 0x0

    .line 87
    .line 137
    :try_start_0
    new-instance v1, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 7
    const/16 v2, 0x3a98

    invoke-static {v1, v2}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 27
    const/16 v2, 0x7530

    invoke-static {v1, v2}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 96
    new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v2, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 134
    new-instance v1, Lorg/apache/http/client/methods/HttpGet;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/4 v5, 0x2

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/4 v5, 0x4

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x15

    const/4 v5, 0x1

    invoke-static {v5, p4}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v2, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    .line 31
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    .line 48
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v3

    .line 102
    const/4 v1, 0x0

    :try_start_1
    sget-object v2, Lcom/whatsapp/j5;->i:Landroid/graphics/BitmapFactory$Options;

    invoke-static {v3, v1, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5

    move-result-object v2

    .line 41
    if-eqz v2, :cond_0

    :try_start_2
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-ne v1, v6, :cond_0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-eq v1, v6, :cond_3

    .line 53
    :cond_0
    new-instance v1, Ljava/io/IOException;

    sget-object v4, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/4 v5, 0x1

    aget-object v4, v4, v5

    invoke-direct {v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 71
    :catch_0
    move-exception v1

    .line 76
    :goto_0
    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/4 v6, 0x0

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 75
    if-eqz v2, :cond_1

    if-eqz v2, :cond_1

    .line 33
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 2
    :cond_1
    if-eqz v3, :cond_2

    .line 9
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 94
    :cond_2
    :goto_1
    return-object v0

    .line 90
    :cond_3
    const/16 v1, 0x23

    const/16 v4, 0x23

    const/16 v5, 0x64

    const/16 v6, 0x64

    :try_start_5
    invoke-static {v2, v1, v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    move-result-object v0

    .line 38
    if-eqz v2, :cond_4

    if-eq v2, v0, :cond_4

    .line 95
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 104
    :cond_4
    if-eqz v3, :cond_2

    .line 20
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_1

    .line 129
    :catch_1
    move-exception v1

    goto :goto_1

    .line 138
    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    move-object v0, v1

    :goto_2
    if-eqz v2, :cond_5

    if-eqz v2, :cond_5

    .line 54
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 88
    :cond_5
    if-eqz v3, :cond_6

    .line 118
    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 52
    :cond_6
    :goto_3
    throw v0

    .line 105
    :catch_2
    move-exception v1

    goto :goto_1

    .line 52
    :catch_3
    move-exception v1

    goto :goto_3

    .line 138
    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_2

    :catchall_2
    move-exception v0

    goto :goto_2

    .line 71
    :catch_4
    move-exception v1

    move-object v2, v0

    move-object v3, v0

    goto :goto_0

    :catch_5
    move-exception v1

    move-object v2, v0

    goto :goto_0
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 7
    .parameter

    .prologue
    const/16 v6, 0x63

    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 131
    iget-object v0, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    if-nez v0, :cond_5

    move v0, v1

    move v2, v1

    .line 79
    :cond_0
    iget-boolean v4, p0, Lcom/whatsapp/mb;->n:Z

    if-nez v4, :cond_2

    const/16 v4, 0x28

    if-ge v0, v4, :cond_2

    .line 64
    const-wide/16 v4, 0xfa

    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 15
    iget-object v4, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    if-eqz v4, :cond_0

    .line 25
    iget-object v2, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    invoke-virtual {v2}, Lcom/whatsapp/bj;->b()Z

    move-result v2

    if-nez v2, :cond_1

    .line 62
    mul-int/lit16 v2, v0, 0xfa

    mul-int/lit8 v2, v2, 0x64

    div-int/lit16 v2, v2, 0x3a98

    .line 28
    if-ge v2, v6, :cond_0

    .line 60
    iget-object v4, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    invoke-virtual {v4, v2}, Lcom/whatsapp/bj;->a(I)V

    if-eqz v3, :cond_0

    .line 133
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_1
    return-object v0

    .line 45
    :cond_2
    iget-boolean v0, p0, Lcom/whatsapp/mb;->n:Z

    if-eqz v0, :cond_3

    .line 125
    iget-object v0, p0, Lcom/whatsapp/mb;->l:Landroid/location/Location;

    iput-object v0, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    if-eqz v3, :cond_6

    .line 85
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/mb;->m:Landroid/location/Location;

    if-eqz v0, :cond_4

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/4 v5, 0x6

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/mb;->m:Landroid/location/Location;

    invoke-virtual {v4}, Landroid/location/Location;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/whatsapp/mb;->m:Landroid/location/Location;

    iput-object v0, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    if-eqz v3, :cond_6

    .line 117
    :cond_4
    sget-object v0, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 22
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_5
    move v2, v1

    .line 30
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    if-eqz v0, :cond_7

    if-ge v2, v6, :cond_7

    .line 81
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    invoke-virtual {v0, v6}, Lcom/whatsapp/bj;->a(I)V

    .line 13
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    iget-object v2, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    iget v4, p0, Lcom/whatsapp/mb;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/whatsapp/mb;->a(DDI)[B

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/mb;->f:[B

    .line 65
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    if-eqz v0, :cond_8

    .line 107
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/whatsapp/bj;->a(I)V

    .line 70
    :cond_8
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    .line 98
    :catch_0
    move-exception v4

    goto/16 :goto_0
.end method

.method a()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 112
    iget-object v0, p0, Lcom/whatsapp/mb;->i:Landroid/location/LocationListener;

    if-nez v0, :cond_0

    .line 37
    new-instance v0, Lcom/whatsapp/mw;

    invoke-direct {v0, p0}, Lcom/whatsapp/mw;-><init>(Lcom/whatsapp/mb;)V

    iput-object v0, p0, Lcom/whatsapp/mb;->i:Landroid/location/LocationListener;

    .line 142
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/mb;->j:Landroid/location/LocationListener;

    if-nez v0, :cond_1

    .line 34
    new-instance v0, Lcom/whatsapp/nw;

    invoke-direct {v0, p0}, Lcom/whatsapp/nw;-><init>(Lcom/whatsapp/mb;)V

    iput-object v0, p0, Lcom/whatsapp/mb;->j:Landroid/location/LocationListener;

    .line 99
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/mb;->c:Landroid/location/LocationManager;

    sget-object v1, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    const-wide/16 v2, 0x3e8

    const/high16 v4, 0x3f80

    iget-object v5, p0, Lcom/whatsapp/mb;->i:Landroid/location/LocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/whatsapp/mb;->c:Landroid/location/LocationManager;

    sget-object v1, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    const-wide/16 v2, 0x3e8

    const/high16 v4, 0x3f80

    iget-object v5, p0, Lcom/whatsapp/mb;->j:Landroid/location/LocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    :goto_1
    return-void

    .line 77
    :catch_0
    move-exception v0

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 66
    iput-object v6, p0, Lcom/whatsapp/mb;->i:Landroid/location/LocationListener;

    goto :goto_0

    .line 29
    :catch_1
    move-exception v0

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 6
    iput-object v6, p0, Lcom/whatsapp/mb;->j:Landroid/location/LocationListener;

    goto :goto_1
.end method

.method public a(Ljava/lang/Boolean;)V
    .locals 5
    .parameter

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 100
    iget-object v0, p0, Lcom/whatsapp/mb;->b:Lcom/whatsapp/MediaData;

    iput-boolean v4, v0, Lcom/whatsapp/MediaData;->transferring:Z

    .line 84
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 44
    iget-object v0, p0, Lcom/whatsapp/mb;->b:Lcom/whatsapp/MediaData;

    iput-boolean v3, v0, Lcom/whatsapp/MediaData;->transferred:Z

    .line 46
    iget-object v0, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    iget-object v0, v0, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    .line 116
    iget-object v2, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    iput v3, v2, Lcom/whatsapp/sz;->h:I

    .line 86
    iget-object v2, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    iget-object v3, p0, Lcom/whatsapp/mb;->f:[B

    invoke-virtual {v2, v3}, Lcom/whatsapp/sz;->a([B)V

    .line 42
    iget-object v2, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    iput-object v0, v2, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    .line 139
    iget-object v0, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    iget-object v2, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    iput-wide v2, v0, Lcom/whatsapp/sz;->q:D

    .line 111
    iget-object v0, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    iget-object v2, p0, Lcom/whatsapp/mb;->d:Landroid/location/Location;

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    iput-wide v2, v0, Lcom/whatsapp/sz;->r:D

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    if-nez v0, :cond_1

    .line 119
    iget-object v0, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    invoke-static {v0}, Lcom/whatsapp/App;->h(Lcom/whatsapp/sz;)V

    if-eqz v1, :cond_2

    .line 57
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    iget-object v2, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    invoke-virtual {v0, v2}, Lcom/whatsapp/bj;->a(Lcom/whatsapp/sz;)V

    .line 103
    :cond_2
    if-eqz v1, :cond_7

    .line 68
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    if-nez v0, :cond_4

    .line 114
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v2, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    const/4 v3, -0x1

    invoke-virtual {v0, v2, v4, v3}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;ZI)V

    .line 51
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/mb;->c:Landroid/location/LocationManager;

    sget-object v2, Lcom/whatsapp/mb;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 141
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    if-nez v0, :cond_6

    .line 110
    invoke-static {}, Lcom/whatsapp/Conversation;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/whatsapp/Conversation;->b()Lcom/whatsapp/Conversation;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/Conversation;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v2, v2, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 11
    invoke-static {}, Lcom/whatsapp/Conversation;->b()Lcom/whatsapp/Conversation;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/whatsapp/Conversation;->showDialog(I)V

    if-eqz v1, :cond_7

    .line 40
    :cond_5
    sget-object v0, Lcom/whatsapp/Conversation;->i:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    iget-object v2, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v2, v2, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_7

    .line 121
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    invoke-virtual {v0}, Lcom/whatsapp/bj;->a()V

    .line 72
    :cond_7
    invoke-virtual {p0}, Lcom/whatsapp/mb;->b()V

    .line 56
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 69
    iget-object v0, p0, Lcom/whatsapp/mb;->c:Landroid/location/LocationManager;

    if-eqz v0, :cond_1

    .line 124
    iget-object v0, p0, Lcom/whatsapp/mb;->i:Landroid/location/LocationListener;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/whatsapp/mb;->c:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/whatsapp/mb;->i:Landroid/location/LocationListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 127
    iput-object v2, p0, Lcom/whatsapp/mb;->i:Landroid/location/LocationListener;

    .line 126
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/mb;->j:Landroid/location/LocationListener;

    if-eqz v0, :cond_1

    .line 16
    iget-object v0, p0, Lcom/whatsapp/mb;->c:Landroid/location/LocationManager;

    iget-object v1, p0, Lcom/whatsapp/mb;->j:Landroid/location/LocationListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 101
    iput-object v2, p0, Lcom/whatsapp/mb;->j:Landroid/location/LocationListener;

    .line 120
    :cond_1
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 82
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/mb;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 109
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/whatsapp/mb;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method public onPreExecute()V
    .locals 4

    .prologue
    .line 123
    invoke-virtual {p0}, Lcom/whatsapp/mb;->a()V

    .line 140
    iget-object v0, p0, Lcom/whatsapp/mb;->b:Lcom/whatsapp/MediaData;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/whatsapp/MediaData;->transferring:Z

    .line 35
    iget-object v0, p0, Lcom/whatsapp/mb;->g:Lcom/whatsapp/bj;

    if-nez v0, :cond_0

    .line 91
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/mb;->a:Lcom/whatsapp/sz;

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;ZI)V

    .line 18
    :cond_0
    return-void
.end method
