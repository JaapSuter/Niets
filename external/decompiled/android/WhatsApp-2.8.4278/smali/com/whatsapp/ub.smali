.class public Lcom/whatsapp/ub;
.super Landroid/os/AsyncTask;
.source "ub.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Lcom/whatsapp/uf;",
        ">;"
    }
.end annotation


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field a:Ljava/lang/String;

.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field final d:Lcom/whatsapp/RegisterPhone;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x52

    const/16 v2, 0x34

    const/16 v4, 0x1a

    const/16 v1, 0x11

    const/4 v6, 0x0

    const/16 v0, 0x13

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, ">\u001fZ!jt\t]4st\u000e"

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

    const-string v0, ">\u0008U67a\u000bF3wt\u001eQ "

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

    const-string v0, ">\u001cQ ix\u0005Z\u007fn~\u0005\u0019=vu"

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

    const-string v0, "b\u000fX47b\u000fZ67\u007f\u0005@\u007fjt\u0018Y;ne\u000fP"

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

    const-string v0, ">\u001fZ!oa\u001a[ nt\u000e\u0019\"vp\u001eR=h|"

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

    const-string v0, ">\u0004[&7a\u000fF?se\u001eQ6"

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

    const-string v0, ">\u0008X=yz\u000fP"

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

    const-string v0, "b\u000fX47b\u000fZ67e\u0005[\u007fwp\u0004M\u007fnc\u0003Q!"

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

    const-string v0, ">\u001e[=7c\u000fW7te"

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

    const-string v0, "c\u000fS;ie\u000fF}jy\u0005Z75c\u000fE\'\u007fb\u001e\u001b"

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

    const-string v0, "s\u000bPrjp\u0018U?\u007fe\u000fF"

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

    const-string v0, ">\u001e[=7|\u000bZ+7e\u0018]7i"

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

    const-string v0, ">\u001e[=7c\u000fW7teE@;wtGZ=n<\u0003Z&"

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

    const-string v0, "|\u000bF9\u007fe"

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

    const-string v0, "b\u000c"

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

    const-string v0, "b\u000fX4"

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

    const/16 v10, 0x10

    const-string v0, "c\u000fR\'it\u000e"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_10
    if-gt v7, v8, :cond_10

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, ">\u000fF ucJ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_11
    if-gt v7, v8, :cond_11

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v1

    const/16 v8, 0x12

    const-string v0, ">\u0003[7hc\u0005Fr"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_12
    if-gt v6, v7, :cond_12

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_13
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_13

    :pswitch_1
    const/16 v0, 0x6a

    goto :goto_13

    :pswitch_2
    move v0, v2

    goto :goto_13

    :pswitch_3
    move v0, v3

    goto :goto_13

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_14
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_14

    :pswitch_5
    const/16 v0, 0x6a

    goto :goto_14

    :pswitch_6
    move v0, v2

    goto :goto_14

    :pswitch_7
    move v0, v3

    goto :goto_14

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_15
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_15

    :pswitch_9
    const/16 v0, 0x6a

    goto :goto_15

    :pswitch_a
    move v0, v2

    goto :goto_15

    :pswitch_b
    move v0, v3

    goto :goto_15

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_16
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_16

    :pswitch_d
    const/16 v0, 0x6a

    goto :goto_16

    :pswitch_e
    move v0, v2

    goto :goto_16

    :pswitch_f
    move v0, v3

    goto :goto_16

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_17
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_17

    :pswitch_11
    const/16 v0, 0x6a

    goto :goto_17

    :pswitch_12
    move v0, v2

    goto :goto_17

    :pswitch_13
    move v0, v3

    goto :goto_17

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_18
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_18

    :pswitch_15
    const/16 v0, 0x6a

    goto :goto_18

    :pswitch_16
    move v0, v2

    goto :goto_18

    :pswitch_17
    move v0, v3

    goto :goto_18

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_19
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_19

    :pswitch_19
    const/16 v0, 0x6a

    goto :goto_19

    :pswitch_1a
    move v0, v2

    goto :goto_19

    :pswitch_1b
    move v0, v3

    goto :goto_19

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_1a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_1a

    :pswitch_1d
    const/16 v0, 0x6a

    goto :goto_1a

    :pswitch_1e
    move v0, v2

    goto :goto_1a

    :pswitch_1f
    move v0, v3

    goto :goto_1a

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_1b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_1b

    :pswitch_21
    const/16 v0, 0x6a

    goto :goto_1b

    :pswitch_22
    move v0, v2

    goto :goto_1b

    :pswitch_23
    move v0, v3

    goto :goto_1b

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_1c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_1c

    :pswitch_25
    const/16 v0, 0x6a

    goto :goto_1c

    :pswitch_26
    move v0, v2

    goto :goto_1c

    :pswitch_27
    move v0, v3

    goto :goto_1c

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_1d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_1d

    :pswitch_29
    const/16 v0, 0x6a

    goto :goto_1d

    :pswitch_2a
    move v0, v2

    goto :goto_1d

    :pswitch_2b
    move v0, v3

    goto :goto_1d

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_1e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_1e

    :pswitch_2d
    const/16 v0, 0x6a

    goto :goto_1e

    :pswitch_2e
    move v0, v2

    goto :goto_1e

    :pswitch_2f
    move v0, v3

    goto :goto_1e

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_1f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_1f

    :pswitch_31
    const/16 v0, 0x6a

    goto :goto_1f

    :pswitch_32
    move v0, v2

    goto :goto_1f

    :pswitch_33
    move v0, v3

    goto :goto_1f

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_20
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_20

    :pswitch_35
    const/16 v0, 0x6a

    goto :goto_20

    :pswitch_36
    move v0, v2

    goto :goto_20

    :pswitch_37
    move v0, v3

    goto :goto_20

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_21
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_21

    :pswitch_39
    const/16 v0, 0x6a

    goto :goto_21

    :pswitch_3a
    move v0, v2

    goto :goto_21

    :pswitch_3b
    move v0, v3

    goto :goto_21

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_22
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_22

    :pswitch_3d
    const/16 v0, 0x6a

    goto :goto_22

    :pswitch_3e
    move v0, v2

    goto :goto_22

    :pswitch_3f
    move v0, v3

    goto :goto_22

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_23
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_23

    :pswitch_41
    const/16 v0, 0x6a

    goto :goto_23

    :pswitch_42
    move v0, v2

    goto :goto_23

    :pswitch_43
    move v0, v3

    goto :goto_23

    :cond_11
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_24
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_24

    :pswitch_45
    const/16 v0, 0x6a

    goto :goto_24

    :pswitch_46
    move v0, v2

    goto :goto_24

    :pswitch_47
    move v0, v3

    goto :goto_24

    :cond_12
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_25
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_25

    :pswitch_49
    const/16 v0, 0x6a

    goto :goto_25

    :pswitch_4a
    move v0, v2

    goto :goto_25

    :pswitch_4b
    move v0, v3

    goto :goto_25

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

    :pswitch_data_11
    .packed-switch 0x0
        :pswitch_44
        :pswitch_45
        :pswitch_46
        :pswitch_47
    .end packed-switch

    :pswitch_data_12
    .packed-switch 0x0
        :pswitch_48
        :pswitch_49
        :pswitch_4a
        :pswitch_4b
    .end packed-switch
.end method

.method protected constructor <init>(Lcom/whatsapp/RegisterPhone;)V
    .locals 2
    .parameter

    .prologue
    .line 30
    iput-object p1, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 36
    sget-object v0, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/whatsapp/ub;->a:Ljava/lang/String;

    .line 45
    sget-object v0, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    .line 50
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Lcom/whatsapp/uf;
    .locals 8
    .parameter

    .prologue
    const/16 v6, 0x9

    .line 80
    sget-object v1, Lcom/whatsapp/uf;->c:Lcom/whatsapp/uf;

    .line 57
    :try_start_0
    invoke-static {}, Lcom/whatsapp/RegisterPhone;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/whatsapp/RegisterPhone;->n()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v3}, Lcom/whatsapp/RegisterPhone;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget-object v3, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iget-object v4, p0, Lcom/whatsapp/ub;->a:Ljava/lang/String;

    sget-object v5, Lcom/whatsapp/VerifyNumber;->j:Ljava/lang/String;

    invoke-static {v0, v2, v3, v4, v5}, Lcom/whatsapp/VerifyNumber;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/aq;

    move-result-object v2

    .line 9
    iget-object v0, v2, Lcom/whatsapp/aq;->a:Lcom/whatsapp/uf;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 88
    :try_start_1
    iget-object v1, v2, Lcom/whatsapp/aq;->b:Ljava/lang/String;

    iput-object v1, p0, Lcom/whatsapp/ub;->c:Ljava/lang/String;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 47
    :cond_0
    :goto_0
    return-object v0

    .line 28
    :catch_0
    move-exception v0

    .line 37
    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v2, v2, v6

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v3, 0x12

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 20
    if-eqz v0, :cond_1

    sget-object v1, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    sget-object v0, Lcom/whatsapp/uf;->c:Lcom/whatsapp/uf;

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_0

    .line 31
    :cond_1
    sget-object v0, Lcom/whatsapp/uf;->d:Lcom/whatsapp/uf;

    goto :goto_0

    .line 6
    :catch_1
    move-exception v0

    move-object v7, v0

    move-object v0, v1

    move-object v1, v7

    .line 83
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v3, v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v4, 0x11

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 6
    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method protected a(Lcom/whatsapp/uf;)V
    .locals 10
    .parameter

    .prologue
    const/16 v7, 0x15

    const/16 v6, 0xf

    const/4 v2, 0x0

    const/4 v1, 0x1

    const/16 v9, 0x9

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 19
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const-string v4, ""

    invoke-virtual {v0, v4}, Lcom/whatsapp/RegisterPhone;->e(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0, v9}, Lcom/whatsapp/RegisterPhone;->removeDialog(I)V

    .line 79
    const/16 v0, 0xe

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->a(I)I

    .line 71
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->a(Lcom/whatsapp/RegisterPhone;)V

    .line 8
    sget-object v0, Lcom/whatsapp/uf;->b:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/whatsapp/ub;->c:Ljava/lang/String;

    if-eqz v0, :cond_9

    move v0, v1

    :goto_0
    invoke-static {v0}, Lcom/whatsapp/g5;->b(Z)V

    .line 39
    iget-object v0, p0, Lcom/whatsapp/ub;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {}, Lcom/whatsapp/RegisterPhone;->p()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/VerifyNumber;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1
    invoke-static {v6}, Lcom/whatsapp/RegisterPhone;->a(I)I

    .line 21
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->a(Lcom/whatsapp/RegisterPhone;)V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iget-boolean v0, v0, Lcom/whatsapp/RegisterPhone;->l:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    .line 48
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0, v7}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    if-eqz v3, :cond_8

    .line 11
    :cond_0
    sget-object v0, Lcom/whatsapp/uf;->a:Lcom/whatsapp/uf;

    if-eq p1, v0, :cond_8

    .line 29
    const/16 v0, 0xe

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->a(I)I

    .line 25
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->a(Lcom/whatsapp/RegisterPhone;)V

    .line 84
    sget-object v0, Lcom/whatsapp/uf;->i:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_1

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v4, v4, v9

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/4 v5, 0x5

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 52
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {}, Lcom/whatsapp/RegisterPhone;->p()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/VerifyNumber;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    invoke-static {v6}, Lcom/whatsapp/RegisterPhone;->a(I)I

    .line 91
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->a(Lcom/whatsapp/RegisterPhone;)V

    .line 60
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iput-boolean v1, v0, Lcom/whatsapp/RegisterPhone;->y:Z

    .line 63
    sget-object v0, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/4 v4, 0x3

    aget-object v0, v0, v4

    sput-object v0, Lcom/whatsapp/VerifyNumber;->j:Ljava/lang/String;

    .line 78
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0, v1}, Lcom/whatsapp/RegisterPhone;->b(Lcom/whatsapp/RegisterPhone;Z)V

    .line 92
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iget-boolean v0, v0, Lcom/whatsapp/RegisterPhone;->l:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    .line 44
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0, v7}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    if-eqz v3, :cond_8

    .line 61
    :cond_1
    sget-object v0, Lcom/whatsapp/uf;->c:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_2

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v4, v4, v9

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iget-boolean v0, v0, Lcom/whatsapp/RegisterPhone;->l:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    .line 43
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const/16 v4, 0x6d

    invoke-virtual {v0, v4}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    if-eqz v3, :cond_8

    .line 4
    :cond_2
    sget-object v0, Lcom/whatsapp/uf;->f:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_3

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v4, v4, v9

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v5, 0xb

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 73
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {}, Lcom/whatsapp/RegisterPhone;->p()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/VerifyNumber;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 49
    invoke-static {v6}, Lcom/whatsapp/RegisterPhone;->a(I)I

    .line 90
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->a(Lcom/whatsapp/RegisterPhone;)V

    .line 68
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iput-boolean v1, v0, Lcom/whatsapp/RegisterPhone;->y:Z

    .line 74
    sget-object v0, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/4 v4, 0x7

    aget-object v0, v0, v4

    sput-object v0, Lcom/whatsapp/VerifyNumber;->j:Ljava/lang/String;

    .line 15
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-static {v0, v1}, Lcom/whatsapp/RegisterPhone;->b(Lcom/whatsapp/RegisterPhone;Z)V

    .line 40
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iget-boolean v0, v0, Lcom/whatsapp/RegisterPhone;->l:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    .line 51
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0, v7}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    if-eqz v3, :cond_8

    .line 46
    :cond_3
    sget-object v0, Lcom/whatsapp/uf;->d:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_4

    .line 22
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iget-object v4, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const v5, 0x7f09004d

    new-array v6, v1, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const v8, 0x7f090048

    invoke-virtual {v7, v8}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    invoke-virtual {v4, v5, v6}, Lcom/whatsapp/RegisterPhone;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)V

    if-eqz v3, :cond_8

    .line 5
    :cond_4
    sget-object v0, Lcom/whatsapp/uf;->j:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_5

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v4, v4, v9

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v4, v4, v1

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 76
    sget-object v0, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v4, 0xa

    aget-object v0, v0, v4

    invoke-static {v0}, Lcom/whatsapp/App;->d(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iget-boolean v0, v0, Lcom/whatsapp/RegisterPhone;->l:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    .line 86
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const/16 v4, 0x16

    invoke-virtual {v0, v4}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    if-eqz v3, :cond_8

    .line 62
    :cond_5
    sget-object v0, Lcom/whatsapp/uf;->h:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_6

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v4, v4, v9

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/4 v5, 0x4

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const v4, 0x7f09008c

    invoke-virtual {v0, v4}, Lcom/whatsapp/RegisterPhone;->d(I)V

    if-eqz v3, :cond_8

    .line 82
    :cond_6
    sget-object v0, Lcom/whatsapp/uf;->g:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_7

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v4, v4, v9

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v4, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v4, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/4 v5, 0x2

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 26
    iget-object v4, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iget-object v5, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const v6, 0x7f09008d

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v0, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v7, 0xd

    aget-object v0, v0, v7

    sget-object v7, Lcom/whatsapp/App;->m:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const v7, 0x7f09008e

    invoke-virtual {v0, v7}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, v1, v2

    invoke-virtual {v5, v6, v1}, Lcom/whatsapp/RegisterPhone;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)V

    if-eqz v3, :cond_8

    .line 89
    :cond_7
    sget-object v0, Lcom/whatsapp/uf;->e:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_b

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 72
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/ub;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    const-wide/32 v4, 0xea60

    mul-long/2addr v0, v4

    .line 42
    iget-object v2, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iget-object v4, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const v5, 0x7f090090

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-static {v0, v1}, Lcom/whatsapp/t4;->a(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v7

    invoke-virtual {v4, v5, v6}, Lcom/whatsapp/RegisterPhone;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    :cond_8
    :goto_2
    return-void

    :cond_9
    move v0, v2

    .line 67
    goto/16 :goto_0

    .line 26
    :cond_a
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const v7, 0x7f09008f

    invoke-virtual {v0, v7}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 77
    :catch_0
    move-exception v0

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    iget-object v1, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const v2, 0x7f090092

    invoke-virtual {v1, v2}, Lcom/whatsapp/RegisterPhone;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)V

    .line 24
    if-eqz v3, :cond_8

    .line 32
    :cond_b
    sget-object v0, Lcom/whatsapp/uf;->k:Lcom/whatsapp/uf;

    if-ne p1, v0, :cond_8

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/ub;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/ub;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const/16 v1, 0x17

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->e(I)V

    goto :goto_2
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 18
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/whatsapp/ub;->a([Ljava/lang/String;)Lcom/whatsapp/uf;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 12
    check-cast p1, Lcom/whatsapp/uf;

    invoke-virtual {p0, p1}, Lcom/whatsapp/ub;->a(Lcom/whatsapp/uf;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 54
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/RegisterPhone;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    invoke-virtual {v0}, Lcom/whatsapp/RegisterPhone;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/whatsapp/ub;->d:Lcom/whatsapp/RegisterPhone;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterPhone;->showDialog(I)V

    .line 35
    :cond_0
    return-void
.end method
