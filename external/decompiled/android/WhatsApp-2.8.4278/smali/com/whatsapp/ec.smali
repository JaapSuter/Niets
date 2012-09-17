.class public Lcom/whatsapp/ec;
.super Landroid/os/AsyncTask;
.source "ec.java"


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

    const/16 v1, 0x5d

    const/16 v4, 0x1d

    const/16 v3, 0x1a

    const/16 v2, 0x10

    const/4 v6, 0x0

    const/16 v0, 0x11

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "+u,s{$c3i2+u,s{$c3i"

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

    const-string v0, "+u,s{$c3i2+u,s{$c3i28b,uo}"

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

    const-string v0, "+u,s{$c3i2+u,s{$c3i24\u007f;ho2b~"

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

    const-string v0, "+u,s{$c3i2+u,s{$c3i2+u,s{4u:"

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

    const-string v0, "+u,s{$c3i2+u,s{$c3i2(~?oi5\u007f,sg8t"

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

    const-string v0, "+u,s{$c3i2+u,s{$c3i2)\u007f17p<~\'7z(u-ix."

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

    const-string v0, "+u,s{$c3i2+u,s{$c3i2>\u007f0tx>d7lt)i"

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

    const-string v0, ".u,lx/=-\u007fs9=*urp}?tdpw+\u007fn.u-"

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

    const-string v0, ".u,lx/=-\u007fs9=3sn0q*yu"

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

    const-string v0, ".u,lx/=-\u007fs9=3sn.y0}"

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

    const-string v0, "+u,s{$c3i2+u,s{$c3i2)\u007f17p<~\'7i/y;i"

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

    const-string v0, "+u,s{$c3i2+u,s{$c3i28b,uo"

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

    const-string v0, "+u,s{$c3i2+u,s{$c3i20y-it3w"

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

    const/16 v10, 0xd

    const-string v0, ".u,lx/=-\u007fs9=*urp}?tdpd,sx."

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_d
    if-gt v7, v8, :cond_d

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xe

    const-string v0, ".u,lx/=-\u007fs9=;ho2bsos.`;yt;y;~"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_e
    if-gt v7, v8, :cond_e

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0xf

    const-string v0, "+u,s{$c3i2+u,s{$c3i2?|1yv8t"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_f
    if-gt v7, v8, :cond_f

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, ".u,lx/=-\u007fs9=<vr>{;~"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_10
    if-gt v6, v7, :cond_10

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v2

    sput-object v9, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_11
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_11

    :pswitch_1
    move v0, v2

    goto :goto_11

    :pswitch_2
    const/16 v0, 0x5e

    goto :goto_11

    :pswitch_3
    move v0, v3

    goto :goto_11

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_12

    :pswitch_5
    move v0, v2

    goto :goto_12

    :pswitch_6
    const/16 v0, 0x5e

    goto :goto_12

    :pswitch_7
    move v0, v3

    goto :goto_12

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_13
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_13

    :pswitch_9
    move v0, v2

    goto :goto_13

    :pswitch_a
    const/16 v0, 0x5e

    goto :goto_13

    :pswitch_b
    move v0, v3

    goto :goto_13

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_14
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_14

    :pswitch_d
    move v0, v2

    goto :goto_14

    :pswitch_e
    const/16 v0, 0x5e

    goto :goto_14

    :pswitch_f
    move v0, v3

    goto :goto_14

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_15
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_15

    :pswitch_11
    move v0, v2

    goto :goto_15

    :pswitch_12
    const/16 v0, 0x5e

    goto :goto_15

    :pswitch_13
    move v0, v3

    goto :goto_15

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_16
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_16

    :pswitch_15
    move v0, v2

    goto :goto_16

    :pswitch_16
    const/16 v0, 0x5e

    goto :goto_16

    :pswitch_17
    move v0, v3

    goto :goto_16

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_17
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_17

    :pswitch_19
    move v0, v2

    goto :goto_17

    :pswitch_1a
    const/16 v0, 0x5e

    goto :goto_17

    :pswitch_1b
    move v0, v3

    goto :goto_17

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_18
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_18

    :pswitch_1d
    move v0, v2

    goto :goto_18

    :pswitch_1e
    const/16 v0, 0x5e

    goto :goto_18

    :pswitch_1f
    move v0, v3

    goto :goto_18

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_19
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_19

    :pswitch_21
    move v0, v2

    goto :goto_19

    :pswitch_22
    const/16 v0, 0x5e

    goto :goto_19

    :pswitch_23
    move v0, v3

    goto :goto_19

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_1a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_1a

    :pswitch_25
    move v0, v2

    goto :goto_1a

    :pswitch_26
    const/16 v0, 0x5e

    goto :goto_1a

    :pswitch_27
    move v0, v3

    goto :goto_1a

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_1b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_1b

    :pswitch_29
    move v0, v2

    goto :goto_1b

    :pswitch_2a
    const/16 v0, 0x5e

    goto :goto_1b

    :pswitch_2b
    move v0, v3

    goto :goto_1b

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_1c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_1c

    :pswitch_2d
    move v0, v2

    goto :goto_1c

    :pswitch_2e
    const/16 v0, 0x5e

    goto :goto_1c

    :pswitch_2f
    move v0, v3

    goto :goto_1c

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_1d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_1d

    :pswitch_31
    move v0, v2

    goto :goto_1d

    :pswitch_32
    const/16 v0, 0x5e

    goto :goto_1d

    :pswitch_33
    move v0, v3

    goto :goto_1d

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_1e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_1e

    :pswitch_35
    move v0, v2

    goto :goto_1e

    :pswitch_36
    const/16 v0, 0x5e

    goto :goto_1e

    :pswitch_37
    move v0, v3

    goto :goto_1e

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_1f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_1f

    :pswitch_39
    move v0, v2

    goto :goto_1f

    :pswitch_3a
    const/16 v0, 0x5e

    goto :goto_1f

    :pswitch_3b
    move v0, v3

    goto :goto_1f

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_20
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_20

    :pswitch_3d
    move v0, v2

    goto :goto_20

    :pswitch_3e
    const/16 v0, 0x5e

    goto :goto_20

    :pswitch_3f
    move v0, v3

    goto :goto_20

    :cond_10
    aget-char v8, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_21
    xor-int/2addr v0, v8

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_21

    :pswitch_41
    move v0, v2

    goto :goto_21

    :pswitch_42
    const/16 v0, 0x5e

    goto :goto_21

    :pswitch_43
    move v0, v3

    goto :goto_21

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

    :pswitch_data_e
    .packed-switch 0x0
        :pswitch_38
        :pswitch_39
        :pswitch_3a
        :pswitch_3b
    .end packed-switch

    :pswitch_data_f
    .packed-switch 0x0
        :pswitch_3c
        :pswitch_3d
        :pswitch_3e
        :pswitch_3f
    .end packed-switch

    :pswitch_data_10
    .packed-switch 0x0
        :pswitch_40
        :pswitch_41
        :pswitch_42
        :pswitch_43
    .end packed-switch
.end method

.method protected constructor <init>(Lcom/whatsapp/VerifySms;)V
    .locals 0
    .parameter

    .prologue
    .line 19
    iput-object p1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Lcom/whatsapp/wf;
    .locals 4
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 55
    sget-object v0, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 9
    sget-object v0, Lcom/whatsapp/wf;->c:Lcom/whatsapp/wf;

    .line 44
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->d(Lcom/whatsapp/VerifySms;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->e(Lcom/whatsapp/VerifySms;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/whatsapp/u4;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/mh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v3, p1, v3

    invoke-static {v0, v1, v2, v3}, Lcom/whatsapp/yp;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/cq;

    move-result-object v0

    .line 27
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    iget-object v2, v0, Lcom/whatsapp/cq;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/whatsapp/App;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    iget-object v0, v0, Lcom/whatsapp/cq;->a:Lcom/whatsapp/wf;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 6
    :goto_0
    return-object v0

    .line 21
    :catch_0
    move-exception v0

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 51
    sget-object v0, Lcom/whatsapp/wf;->d:Lcom/whatsapp/wf;

    goto :goto_0

    .line 45
    :catch_1
    move-exception v0

    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whatsapp/wf;->c:Lcom/whatsapp/wf;

    goto :goto_0
.end method

.method protected a(Lcom/whatsapp/wf;)V
    .locals 7
    .parameter

    .prologue
    const/16 v6, 0xc

    const/4 v5, 0x4

    const/4 v4, 0x3

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 30
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->a(Lcom/whatsapp/VerifySms;)V

    .line 38
    sget-object v1, Lcom/whatsapp/wf;->a:Lcom/whatsapp/wf;

    if-ne p1, v1, :cond_0

    .line 32
    sget-object v1, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 23
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/whatsapp/VerifySms;->a(Lcom/whatsapp/VerifySms;Z)V

    if-eqz v0, :cond_a

    .line 24
    :cond_0
    sget-object v1, Lcom/whatsapp/wf;->b:Lcom/whatsapp/wf;

    if-ne p1, v1, :cond_1

    .line 22
    sget-object v1, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 28
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    sget-object v2, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Lcom/whatsapp/VerifySms;->e(Ljava/lang/String;)V

    .line 16
    invoke-static {v4}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 10
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->c(Lcom/whatsapp/VerifySms;)V

    .line 4
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    const/16 v2, 0x1e

    invoke-virtual {v1, v2}, Lcom/whatsapp/VerifySms;->c(I)V

    if-eqz v0, :cond_a

    .line 25
    :cond_1
    sget-object v1, Lcom/whatsapp/wf;->d:Lcom/whatsapp/wf;

    if-ne p1, v1, :cond_2

    .line 13
    sget-object v1, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 37
    invoke-static {v5}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 54
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->c(Lcom/whatsapp/VerifySms;)V

    .line 56
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    const/16 v2, 0x15

    invoke-virtual {v1, v2}, Lcom/whatsapp/VerifySms;->c(I)V

    if-eqz v0, :cond_a

    .line 53
    :cond_2
    sget-object v1, Lcom/whatsapp/wf;->e:Lcom/whatsapp/wf;

    if-ne p1, v1, :cond_3

    .line 42
    sget-object v1, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 14
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    sget-object v2, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Lcom/whatsapp/VerifySms;->e(Ljava/lang/String;)V

    if-eqz v0, :cond_6

    .line 41
    :cond_3
    sget-object v1, Lcom/whatsapp/wf;->f:Lcom/whatsapp/wf;

    if-ne p1, v1, :cond_4

    .line 36
    sget-object v1, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    sget-object v2, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Lcom/whatsapp/VerifySms;->e(Ljava/lang/String;)V

    if-eqz v0, :cond_6

    .line 49
    :cond_4
    sget-object v1, Lcom/whatsapp/wf;->g:Lcom/whatsapp/wf;

    if-ne p1, v1, :cond_5

    .line 46
    sget-object v1, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 47
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    sget-object v2, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/16 v3, 0xd

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Lcom/whatsapp/VerifySms;->e(Ljava/lang/String;)V

    if-eqz v0, :cond_6

    .line 20
    :cond_5
    sget-object v1, Lcom/whatsapp/wf;->c:Lcom/whatsapp/wf;

    if-ne p1, v1, :cond_6

    .line 17
    sget-object v1, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 35
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    sget-object v2, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Lcom/whatsapp/VerifySms;->e(Ljava/lang/String;)V

    .line 3
    :cond_6
    sget-object v1, Lcom/whatsapp/wf;->h:Lcom/whatsapp/wf;

    if-ne p1, v1, :cond_7

    .line 33
    sget-object v1, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 34
    invoke-static {v6}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 5
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->c(Lcom/whatsapp/VerifySms;)V

    .line 26
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    sget-object v2, Lcom/whatsapp/ec;->z:[Ljava/lang/String;

    const/16 v3, 0x10

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Lcom/whatsapp/VerifySms;->e(Ljava/lang/String;)V

    .line 39
    iget-object v1, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v1}, Lcom/whatsapp/VerifySms;->o(Lcom/whatsapp/VerifySms;)V

    if-eqz v0, :cond_8

    .line 8
    :cond_7
    invoke-static {v4}, Lcom/whatsapp/VerifySms;->a(I)I

    .line 48
    iget-object v0, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->c(Lcom/whatsapp/VerifySms;)V

    .line 12
    iget-object v0, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-static {v0}, Lcom/whatsapp/VerifySms;->k(Lcom/whatsapp/VerifySms;)V

    .line 50
    :cond_8
    iget-object v0, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    iget-boolean v0, v0, Lcom/whatsapp/VerifySms;->l:Z

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-virtual {v0}, Lcom/whatsapp/VerifySms;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 52
    :cond_9
    iget-object v0, p0, Lcom/whatsapp/ec;->a:Lcom/whatsapp/VerifySms;

    invoke-virtual {v0}, Lcom/whatsapp/VerifySms;->c()V

    .line 15
    :cond_a
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 31
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/ec;->a([Ljava/lang/String;)Lcom/whatsapp/wf;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 29
    check-cast p1, Lcom/whatsapp/wf;

    invoke-virtual {p0, p1}, Lcom/whatsapp/ec;->a(Lcom/whatsapp/wf;)V

    return-void
.end method
