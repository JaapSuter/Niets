.class public Lcom/whatsapp/g;
.super Landroid/database/ContentObserver;
.source "g.java"


# static fields
.field protected static a:I

.field protected static b:I

.field protected static c:I

.field public static d:Z

.field public static e:Z

.field private static f:I

.field private static g:Z

.field protected static h:Z

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v2, 0x50

    const/16 v3, 0x3d

    const/16 v4, 0x3b

    const/16 v1, 0x1e

    const/4 v8, 0x0

    const/16 v0, 0xd

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "}?S\u001fZ}$b\u001d^l#T\u0004U"

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

    const-string v0, "}?S\u001fZ}$\u0012\u0004Ym5O\u001d^l\u007fU\nHH5Q\u0004Xw$D?^m$i\u0003I{1YQ"

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

    const-string v0, ">#\\\u001d^zm"

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

    const-string v0, ">\u0013R\u0005O\u007f3I8Bp3\u0013\u0002HA\"H\u0005Uw>ZQ"

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

    const-string v0, "}?S\u001fZ}$\u0012\u0004Ym5O\u001d^l\u007fR\u0005Xv1S\u000c^1&X\u0019Hw?SV"

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

    const-string v0, "m)S\u0008dp5X\u000f^z"

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

    const-string v0, "n\"X\rH1#D\u0005Xk Y\nO{p"

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

    const-string v0, ">6\\\u0002W{4"

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

    const-string v0, "}?S\u001fZ}$\u0012\u0004Ym5O\u001d^l\u007fN\u000eOh5O\u0018Rq>\u0000"

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

    const-string v0, ">xM\u0019^hm"

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

    const/16 v10, 0xa

    const-string v0, "\u007f MDH{$K\u000eIm9R\u0005Hk=\u0012\rZw<X\u000f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_a
    if-gt v6, v7, :cond_a

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xb

    const-string v0, "13H\u0019I{>IV"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_b
    if-gt v6, v7, :cond_b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xc

    const-string v0, "}?S\u001fZ}$\u0012\u0004Ym5O\u001d^l\u007fM\u0019^h9R\u001eH#"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v6, v5

    move v7, v8

    move-object v5, v0

    :goto_c
    if-gt v6, v7, :cond_c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    sput-object v9, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    .line 59
    const/16 v0, 0x1388

    sput v0, Lcom/whatsapp/g;->a:I

    .line 70
    sput v8, Lcom/whatsapp/g;->b:I

    .line 15
    sput v8, Lcom/whatsapp/g;->c:I

    .line 39
    sput-boolean v8, Lcom/whatsapp/g;->d:Z

    .line 63
    sput-boolean v8, Lcom/whatsapp/g;->e:Z

    .line 19
    const/4 v0, -0x1

    sput v0, Lcom/whatsapp/g;->f:I

    .line 81
    sput-boolean v8, Lcom/whatsapp/g;->g:Z

    .line 17
    sput-boolean v8, Lcom/whatsapp/g;->h:Z

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_d
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_d

    :pswitch_1
    move v0, v2

    goto :goto_d

    :pswitch_2
    move v0, v3

    goto :goto_d

    :pswitch_3
    const/16 v0, 0x6b

    goto :goto_d

    :cond_1
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_e

    :pswitch_5
    move v0, v2

    goto :goto_e

    :pswitch_6
    move v0, v3

    goto :goto_e

    :pswitch_7
    const/16 v0, 0x6b

    goto :goto_e

    :cond_2
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_f

    :pswitch_9
    move v0, v2

    goto :goto_f

    :pswitch_a
    move v0, v3

    goto :goto_f

    :pswitch_b
    const/16 v0, 0x6b

    goto :goto_f

    :cond_3
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_10

    :pswitch_d
    move v0, v2

    goto :goto_10

    :pswitch_e
    move v0, v3

    goto :goto_10

    :pswitch_f
    const/16 v0, 0x6b

    goto :goto_10

    :cond_4
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_11
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_11

    :pswitch_11
    move v0, v2

    goto :goto_11

    :pswitch_12
    move v0, v3

    goto :goto_11

    :pswitch_13
    const/16 v0, 0x6b

    goto :goto_11

    :cond_5
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_12

    :pswitch_15
    move v0, v2

    goto :goto_12

    :pswitch_16
    move v0, v3

    goto :goto_12

    :pswitch_17
    const/16 v0, 0x6b

    goto :goto_12

    :cond_6
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_13
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_13

    :pswitch_19
    move v0, v2

    goto :goto_13

    :pswitch_1a
    move v0, v3

    goto :goto_13

    :pswitch_1b
    const/16 v0, 0x6b

    goto :goto_13

    :cond_7
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_14
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_14

    :pswitch_1d
    move v0, v2

    goto :goto_14

    :pswitch_1e
    move v0, v3

    goto :goto_14

    :pswitch_1f
    const/16 v0, 0x6b

    goto :goto_14

    :cond_8
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_15
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_15

    :pswitch_21
    move v0, v2

    goto :goto_15

    :pswitch_22
    move v0, v3

    goto :goto_15

    :pswitch_23
    const/16 v0, 0x6b

    goto :goto_15

    :cond_9
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_16
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_16

    :pswitch_25
    move v0, v2

    goto :goto_16

    :pswitch_26
    move v0, v3

    goto :goto_16

    :pswitch_27
    const/16 v0, 0x6b

    goto :goto_16

    :cond_a
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_17
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_17

    :pswitch_29
    move v0, v2

    goto :goto_17

    :pswitch_2a
    move v0, v3

    goto :goto_17

    :pswitch_2b
    const/16 v0, 0x6b

    goto :goto_17

    :cond_b
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_18
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_18

    :pswitch_2d
    move v0, v2

    goto :goto_18

    :pswitch_2e
    move v0, v3

    goto :goto_18

    :pswitch_2f
    const/16 v0, 0x6b

    goto :goto_18

    :cond_c
    aget-char v11, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_19
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_19

    :pswitch_31
    move v0, v2

    goto :goto_19

    :pswitch_32
    move v0, v3

    goto :goto_19

    :pswitch_33
    const/16 v0, 0x6b

    goto :goto_19

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

    :pswitch_data_c
    .packed-switch 0x0
        :pswitch_30
        :pswitch_31
        :pswitch_32
        :pswitch_33
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 58
    return-void
.end method

.method public static a()I
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 11
    sget v0, Lcom/whatsapp/g;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 24
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v1, 0x7f090002

    invoke-virtual {v0, v1}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 66
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2
    sget-object v1, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/whatsapp/g;->f:I

    .line 74
    :cond_0
    sget v0, Lcom/whatsapp/g;->f:I

    return v0
.end method

.method public static a(I)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x0

    .line 69
    sget v0, Lcom/whatsapp/g;->f:I

    .line 80
    sput p0, Lcom/whatsapp/g;->f:I

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/whatsapp/g;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 76
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v2, 0x7f090002

    invoke-virtual {v1, v2}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/whatsapp/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 60
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 38
    sget-object v1, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 27
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    .line 34
    sget-object v0, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 54
    :cond_0
    return-void
.end method

.method public static a(Z)V
    .locals 1
    .parameter

    .prologue
    .line 22
    sput-boolean p0, Lcom/whatsapp/g;->g:Z

    .line 31
    sget-boolean v0, Lcom/whatsapp/g;->g:Z

    if-nez v0, :cond_0

    .line 51
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->e()I

    move-result v0

    invoke-static {v0}, Lcom/whatsapp/g;->b(I)Z

    .line 65
    :cond_0
    return-void
.end method

.method private a(ZZ)V
    .locals 6
    .parameter
    .parameter

    .prologue
    const/4 v5, 0x5

    const/4 v1, 0x1

    const/4 v0, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 36
    sget-object v3, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    const v4, 0x7f090002

    invoke-virtual {v3, v4}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 68
    if-eqz v3, :cond_3

    .line 82
    sget-object v4, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v4, v3, v0}, Lcom/whatsapp/App;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 46
    if-eqz v3, :cond_3

    .line 5
    sget-object v4, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    aget-object v4, v4, v5

    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 50
    if-eqz p2, :cond_1

    .line 3
    packed-switch v4, :pswitch_data_0

    move v0, v1

    .line 18
    :cond_0
    if-eqz v2, :cond_5

    .line 30
    :cond_1
    if-eqz p1, :cond_2

    .line 77
    if-eqz v2, :cond_6

    .line 28
    :cond_2
    if-ne v4, v1, :cond_4

    if-nez p1, :cond_4

    .line 71
    :cond_3
    :goto_0
    :pswitch_0
    return-void

    .line 78
    :pswitch_1
    if-eqz v2, :cond_0

    .line 13
    :pswitch_2
    if-eqz p1, :cond_3

    .line 16
    if-eqz v2, :cond_0

    goto :goto_0

    .line 52
    :cond_4
    const/4 v0, 0x2

    .line 10
    :cond_5
    :goto_1
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 8
    sget-object v2, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v1

    if-nez v1, :cond_3

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    move v0, v1

    goto :goto_1

    .line 3
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static b(I)Z
    .locals 3
    .parameter

    .prologue
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/whatsapp/g;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 73
    invoke-static {}, Lcom/whatsapp/g;->a()I

    move-result v0

    if-ne p0, v0, :cond_0

    .line 4
    const/4 v0, 0x0

    .line 62
    :goto_0
    return v0

    .line 67
    :cond_0
    invoke-static {p0}, Lcom/whatsapp/g;->a(I)V

    .line 62
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public b(Z)V
    .locals 1
    .parameter

    .prologue
    .line 7
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/whatsapp/g;->a(ZZ)V

    .line 57
    return-void
.end method

.method public c(Z)V
    .locals 1
    .parameter

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/whatsapp/g;->a(ZZ)V

    .line 44
    return-void
.end method

.method public onChange(Z)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x1

    .line 48
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    invoke-virtual {v0}, Lcom/whatsapp/qp;->e()I

    move-result v0

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/whatsapp/g;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 53
    sget-object v1, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-eqz v1, :cond_0

    .line 23
    sget-boolean v1, Lcom/whatsapp/g;->g:Z

    if-eqz v1, :cond_1

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 40
    :cond_1
    invoke-static {}, Lcom/whatsapp/g;->a()I

    move-result v1

    if-eq v1, v0, :cond_0

    .line 21
    sget-object v0, Lcom/whatsapp/App;->wb:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 64
    sget-object v0, Lcom/whatsapp/App;->xb:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 83
    sget-boolean v0, Lcom/whatsapp/g;->h:Z

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-boolean v1, Lcom/whatsapp/g;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/g;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-boolean v1, Lcom/whatsapp/tp;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 35
    sget-boolean v0, Lcom/whatsapp/g;->d:Z

    if-nez v0, :cond_2

    sget-boolean v0, Lcom/whatsapp/tp;->a:Z

    if-nez v0, :cond_2

    .line 9
    new-instance v0, Lcom/whatsapp/m8;

    invoke-direct {v0, p0}, Lcom/whatsapp/m8;-><init>(Lcom/whatsapp/g;)V

    .line 56
    invoke-virtual {v0, v4}, Ljava/lang/Thread;->setPriority(I)V

    .line 26
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 33
    :cond_2
    sput-boolean v4, Lcom/whatsapp/g;->d:Z

    .line 72
    sget v0, Lcom/whatsapp/g;->b:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/g;->b:I

    .line 1
    sget v0, Lcom/whatsapp/g;->c:I

    sget v1, Lcom/whatsapp/g;->b:I

    if-ge v0, v1, :cond_3

    .line 75
    sget v0, Lcom/whatsapp/g;->b:I

    sput v0, Lcom/whatsapp/g;->c:I

    .line 47
    :cond_3
    sget-object v0, Lcom/whatsapp/App;->kc:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method
