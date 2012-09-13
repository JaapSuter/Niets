.class public Lcom/whatsapp/fc;
.super Landroid/os/AsyncTask;
.source "fc.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/whatsapp/wf;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/VerifySms;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x5f

    const/16 v3, 0x2b

    const/16 v4, 0x24

    const/4 v2, 0x4

    const/4 v6, 0x0

    const/16 v0, 0xe

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004A\u0001-kY\t\u001e6wXM\u001d8"

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

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004A\u0001-kY\t\u00100jEA\u0010+m]M\u0007&"

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

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004A\u0001-kY"

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

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004A\u0001-kY\t\u00070k\u0006I\u00121}\u0006P\u00016aX"

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

    const-string v0, "\u001a1t^P,2a_L\u001c;"

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

    aput-object v0, v9, v2

    const/4 v10, 0x5

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004R\u0016-mMM\u0016;"

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

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004A\u0001-kY\t\u00113kHO\u0016;"

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

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004A\u0001-kY\t\u00070k\u0006I\u00121}\u0006C\u0006:wXA\u0000"

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

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004M\u001d<kYV\u0016<p"

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

    const-string v0, "\u0016-vDVS2mXW\u001a1c"

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

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a"

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

    const/16 v10, 0xb

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004A\u0001-kY\u0004"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_b
    if-gt v7, v8, :cond_b

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xc

    const-string v0, "\u0001:b^W\u0016;"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_c
    if-gt v7, v8, :cond_c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0xd

    const-string v0, "\u0005:vBB\n)kBG\u0016prNV\u001a9}]K\u001a<a\u0004M\u001c:vYK\u0001\u007f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_d
    if-gt v6, v7, :cond_d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_e
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x73

    goto :goto_e

    :pswitch_1
    move v0, v1

    goto :goto_e

    :pswitch_2
    move v0, v2

    goto :goto_e

    :pswitch_3
    move v0, v3

    goto :goto_e

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x73

    goto :goto_f

    :pswitch_5
    move v0, v1

    goto :goto_f

    :pswitch_6
    move v0, v2

    goto :goto_f

    :pswitch_7
    move v0, v3

    goto :goto_f

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x73

    goto :goto_10

    :pswitch_9
    move v0, v1

    goto :goto_10

    :pswitch_a
    move v0, v2

    goto :goto_10

    :pswitch_b
    move v0, v3

    goto :goto_10

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_11
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x73

    goto :goto_11

    :pswitch_d
    move v0, v1

    goto :goto_11

    :pswitch_e
    move v0, v2

    goto :goto_11

    :pswitch_f
    move v0, v3

    goto :goto_11

    :cond_4
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_12
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x73

    goto :goto_12

    :pswitch_11
    move v0, v1

    goto :goto_12

    :pswitch_12
    move v0, v2

    goto :goto_12

    :pswitch_13
    move v0, v3

    goto :goto_12

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_13
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x73

    goto :goto_13

    :pswitch_15
    move v0, v1

    goto :goto_13

    :pswitch_16
    move v0, v2

    goto :goto_13

    :pswitch_17
    move v0, v3

    goto :goto_13

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_14
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    const/16 v0, 0x73

    goto :goto_14

    :pswitch_19
    move v0, v1

    goto :goto_14

    :pswitch_1a
    move v0, v2

    goto :goto_14

    :pswitch_1b
    move v0, v3

    goto :goto_14

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_15
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    const/16 v0, 0x73

    goto :goto_15

    :pswitch_1d
    move v0, v1

    goto :goto_15

    :pswitch_1e
    move v0, v2

    goto :goto_15

    :pswitch_1f
    move v0, v3

    goto :goto_15

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_16
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    const/16 v0, 0x73

    goto :goto_16

    :pswitch_21
    move v0, v1

    goto :goto_16

    :pswitch_22
    move v0, v2

    goto :goto_16

    :pswitch_23
    move v0, v3

    goto :goto_16

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_17
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    const/16 v0, 0x73

    goto :goto_17

    :pswitch_25
    move v0, v1

    goto :goto_17

    :pswitch_26
    move v0, v2

    goto :goto_17

    :pswitch_27
    move v0, v3

    goto :goto_17

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_18
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    const/16 v0, 0x73

    goto :goto_18

    :pswitch_29
    move v0, v1

    goto :goto_18

    :pswitch_2a
    move v0, v2

    goto :goto_18

    :pswitch_2b
    move v0, v3

    goto :goto_18

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_19
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    const/16 v0, 0x73

    goto :goto_19

    :pswitch_2d
    move v0, v1

    goto :goto_19

    :pswitch_2e
    move v0, v2

    goto :goto_19

    :pswitch_2f
    move v0, v3

    goto :goto_19

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_1a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    const/16 v0, 0x73

    goto :goto_1a

    :pswitch_31
    move v0, v1

    goto :goto_1a

    :pswitch_32
    move v0, v2

    goto :goto_1a

    :pswitch_33
    move v0, v3

    goto :goto_1a

    :cond_d
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_1b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_d

    :pswitch_34
    const/16 v0, 0x73

    goto :goto_1b

    :pswitch_35
    move v0, v1

    goto :goto_1b

    :pswitch_36
    move v0, v2

    goto :goto_1b

    :pswitch_37
    move v0, v3

    goto :goto_1b

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

    :pswitch_data_d
    .packed-switch 0x0
        :pswitch_34
        :pswitch_35
        :pswitch_36
        :pswitch_37
    .end packed-switch
.end method

.method protected constructor <init>(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 48
    iput-object p1, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Lcom/whatsapp/wf;
    .locals 5
    .parameter

    .prologue
    .line 27
    sget-object v0, Lcom/whatsapp/wf;->c:Lcom/whatsapp/wf;

    .line 52
    :try_start_0
    iget-object v1, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->d(Lcom/whatsapp/VerifySms;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v2}, Lcom/whatsapp/VerifySms;->e(Lcom/whatsapp/VerifySms;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/whatsapp/u4;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/mh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aget-object v4, p1, v4

    invoke-static {v1, v2, v3, v4}, Lcom/whatsapp/yp;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/cq;

    move-result-object v1

    .line 44
    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    iget-object v3, v1, Lcom/whatsapp/cq;->b:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/whatsapp/App;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 38
    iget-object v0, v1, Lcom/whatsapp/cq;->a:Lcom/whatsapp/wf;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 40
    :cond_0
    :goto_0
    return-object v0

    .line 67
    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 66
    if-eqz v0, :cond_1

    sget-object v1, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 22
    sget-object v0, Lcom/whatsapp/wf;->c:Lcom/whatsapp/wf;

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_0

    .line 61
    :cond_1
    sget-object v0, Lcom/whatsapp/wf;->d:Lcom/whatsapp/wf;

    goto :goto_0

    .line 13
    :catch_1
    move-exception v1

    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/16 v4, 0xb

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected a(Lcom/whatsapp/wf;)V
    .locals 12
    .parameter

    .prologue
    const/16 v11, 0xb

    const/16 v10, 0xa

    const/4 v9, 0x3

    const/4 v8, 0x0

    const/4 v7, 0x1

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 69
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const/16 v2, 0x18

    invoke-virtual {v0, v2}, Lcom/whatsapp/VerifySms;->removeDialog(I)V

    .line 59
    sget-object v0, Lcom/whatsapp/wf;->a:Lcom/whatsapp/wf;

    if-ne p1, v0, :cond_0

    .line 11
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 49
    invoke-static {v9}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 37
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0, v7}, Lcom/whatsapp/VerifySms;->a(Lcom/whatsapp/VerifySms;Z)V

    if-eqz v1, :cond_a

    .line 56
    :cond_0
    sget-object v0, Lcom/whatsapp/wf;->b:Lcom/whatsapp/wf;

    if-ne p1, v0, :cond_4

    .line 35
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->l(Lcom/whatsapp/VerifySms;)Landroid/widget/EditText;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 20
    invoke-static {}, Lcom/whatsapp/VerifySms;->y()I

    move-result v0

    const/16 v2, 0xd

    if-ne v0, v2, :cond_1

    .line 60
    invoke-static {v9}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 63
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    iget-object v2, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const v3, 0x7f09007d

    new-array v4, v7, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const v6, 0x7f09007a

    invoke-virtual {v5, v6}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/whatsapp/VerifySms;->f(Ljava/lang/String;)V

    .line 73
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v2, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Lcom/whatsapp/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 57
    iget-object v2, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v2}, Lcom/whatsapp/VerifySms;->l(Lcom/whatsapp/VerifySms;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v8}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 4
    if-eqz v1, :cond_a

    .line 12
    :cond_1
    invoke-static {v10}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 43
    invoke-static {}, Lcom/whatsapp/VerifySms;->z()I

    move-result v0

    if-lez v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    iget-object v2, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const v3, 0x7f09005d

    new-array v4, v7, [Ljava/lang/Object;

    invoke-static {}, Lcom/whatsapp/VerifySms;->A()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/whatsapp/VerifySms;->f(Ljava/lang/String;)V

    if-eqz v1, :cond_3

    .line 72
    :cond_2
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    iget-object v2, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const v3, 0x7f09005e

    invoke-virtual {v2, v3}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/whatsapp/VerifySms;->f(Ljava/lang/String;)V

    .line 62
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    iget-object v2, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v2}, Lcom/whatsapp/VerifySms;->t(Lcom/whatsapp/VerifySms;)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/whatsapp/VerifySms;->c(Lcom/whatsapp/VerifySms;J)V

    .line 74
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->t(Lcom/whatsapp/VerifySms;)J

    move-result-wide v2

    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->u(Lcom/whatsapp/VerifySms;)J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 51
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    iget-object v4, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v4}, Lcom/whatsapp/VerifySms;->u(Lcom/whatsapp/VerifySms;)J

    move-result-wide v4

    invoke-static {v0, v4, v5}, Lcom/whatsapp/VerifySms;->d(Lcom/whatsapp/VerifySms;J)J

    .line 21
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0, v2, v3}, Lcom/whatsapp/VerifySms;->e(Lcom/whatsapp/VerifySms;J)J

    .line 32
    if-eqz v1, :cond_a

    .line 14
    :cond_4
    sget-object v0, Lcom/whatsapp/wf;->c:Lcom/whatsapp/wf;

    if-ne p1, v0, :cond_5

    .line 45
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 46
    invoke-static {v11}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 29
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const/16 v2, 0x6d

    invoke-virtual {v0, v2}, Lcom/whatsapp/VerifySms;->e(I)V

    if-eqz v1, :cond_a

    .line 23
    :cond_5
    sget-object v0, Lcom/whatsapp/wf;->e:Lcom/whatsapp/wf;

    if-ne p1, v0, :cond_6

    .line 30
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    aget-object v0, v0, v8

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 58
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/App;->d(Ljava/lang/String;)V

    .line 28
    invoke-static {v9}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 24
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    iget-object v2, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const v3, 0x7f09007d

    new-array v4, v7, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const v6, 0x7f09007a

    invoke-virtual {v5, v6}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/whatsapp/VerifySms;->f(Ljava/lang/String;)V

    if-eqz v1, :cond_a

    .line 2
    :cond_6
    sget-object v0, Lcom/whatsapp/wf;->f:Lcom/whatsapp/wf;

    if-ne p1, v0, :cond_7

    .line 55
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 47
    invoke-static {v9}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 16
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    iget-object v2, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const v3, 0x7f090094

    invoke-virtual {v2, v3}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/whatsapp/VerifySms;->f(Ljava/lang/String;)V

    if-eqz v1, :cond_a

    .line 18
    :cond_7
    sget-object v0, Lcom/whatsapp/wf;->g:Lcom/whatsapp/wf;

    if-ne p1, v0, :cond_8

    .line 6
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    aget-object v0, v0, v9

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 26
    invoke-static {v10}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 8
    invoke-static {v7}, Lcom/whatsapp/VerifySms;->b(Z)Z

    .line 70
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const/16 v2, 0x1b

    invoke-virtual {v0, v2}, Lcom/whatsapp/VerifySms;->e(I)V

    if-eqz v1, :cond_a

    .line 25
    :cond_8
    sget-object v0, Lcom/whatsapp/wf;->d:Lcom/whatsapp/wf;

    if-ne p1, v0, :cond_9

    .line 1
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    aget-object v0, v0, v7

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 31
    invoke-static {v11}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 54
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    iget-object v2, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const v3, 0x7f09004d

    new-array v4, v7, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const v6, 0x7f090048

    invoke-virtual {v5, v6}, Lcom/whatsapp/VerifySms;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/VerifySms;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/whatsapp/VerifySms;->f(Ljava/lang/String;)V

    if-eqz v1, :cond_a

    .line 17
    :cond_9
    sget-object v0, Lcom/whatsapp/wf;->h:Lcom/whatsapp/wf;

    if-ne p1, v0, :cond_a

    .line 5
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 19
    const/16 v0, 0xc

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 33
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->o(Lcom/whatsapp/VerifySms;)V

    .line 39
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->c(Lcom/whatsapp/VerifySms;)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->s(Lcom/whatsapp/VerifySms;)V

    .line 68
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 71
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/fc;->a([Ljava/lang/String;)Lcom/whatsapp/wf;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 9
    check-cast p1, Lcom/whatsapp/wf;

    invoke-virtual {p0, p1}, Lcom/whatsapp/fc;->a(Lcom/whatsapp/wf;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 15
    sget-object v0, Lcom/whatsapp/fc;->z:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    invoke-virtual {v0}, Lcom/whatsapp/VerifySms;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/whatsapp/fc;->a:Lcom/whatsapp/VerifySms;

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Lcom/whatsapp/VerifySms;->showDialog(I)V

    .line 36
    :cond_0
    return-void
.end method
