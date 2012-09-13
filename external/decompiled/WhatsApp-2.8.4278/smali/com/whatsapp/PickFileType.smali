.class public Lcom/whatsapp/PickFileType;
.super Lcom/whatsapp/DialogToastActivity;
.source "PickFileType.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field f:Ljava/lang/String;

.field g:Lg;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x5f

    const/16 v1, 0x58

    const/16 v3, 0x4b

    const/16 v2, 0x3f

    const/4 v6, 0x0

    const/16 v0, 0x13

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\r1\\ 9\u00144Z?&\r=\u0010\"2\u001c?Zd<\u001c5Z9>R7P&r\u0018*M$-]"

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

    const-string v0, "\u00171["

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

    const-string v0, "\r1\\ 9\u00144Z?&\r=\u0010\"2\u001c?Zd0\u00125\u0012.-\u000f7Mk"

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

    const-string v0, "\u00137Kf>P1R*8\u0018"

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

    const-string v0, "\u0018<V?\u0000\u001e7Q?>\u001e,`\"1\u001b7"

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

    const-string v0, "\r1\\ 9\u00144Z?&\r=\u0010=6\u0019=Pd6\u0013,Z%+]<^?>]1Lk1\u00084S"

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

    const-string v0, "\r1\\ 9\u00144Z?&\r=\u0010(0\u0013,^(+R;J9,\u0012*\u001f.2\r,F"

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

    const-string v0, "\u00191L;3\u001c!`%>\u0010="

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

    const-string v0, "\"1["

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

    const-string v0, "\r1\\ 9\u00144Z?&\r=\u0010*<\t*Z8*\u0011,\u0010=<\u001c*[k6\u000exQ>3\u0011y"

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

    const-string v0, "\u00127R"

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

    const-string v0, "\r1\\ 9\u00144Z?&\r=\u0010*<\t*Z8*\u0011,\u0010%0\tx^%\u007f\u00145^,:"

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

    const-string v0, "\r1\\ 9\u00144Z?&\r=\u0010>1\u00166P<1]*Z:*\u0018+Kk+\u0004(Z"

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

    const-string v0, "\u00159L\u0014/\u00157Q.\u0000\u0013-R):\u000f"

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

    const-string v0, "\u001e7Q?>\u001e,`\";"

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

    const-string v0, "\r1\\ 9\u00144Z?&\r=\u0010(0\u0013,^(+R1Q?:\u0013,\u001f/>\t9\u001f\",]6J\'3"

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

    const-string v0, "\r1\\ 9\u00144Z?&\r=\u0010*<\t*Z8*\u0011,\u0010.\'\t=M%>\u0011\u0007Y\"3\u0018\u0007V&>\u001a=\u001f/0\u0018+\u001f%0\txZ36\u000e,"

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

    const/16 v10, 0x11

    const-string v0, "\u000b;^9;"

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

    aput-object v0, v9, v10

    const/16 v8, 0x12

    const-string v0, "\t!O."

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

    sput-object v9, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

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
    const/16 v0, 0x7d

    goto :goto_13

    :pswitch_1
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_14

    :pswitch_5
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_15

    :pswitch_9
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_16

    :pswitch_d
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_17

    :pswitch_11
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_18

    :pswitch_15
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_19

    :pswitch_19
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_1a

    :pswitch_1d
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_1b

    :pswitch_21
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_1c

    :pswitch_25
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_1d

    :pswitch_29
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_1e

    :pswitch_2d
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_1f

    :pswitch_31
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_20

    :pswitch_35
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_21

    :pswitch_39
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_22

    :pswitch_3d
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_23

    :pswitch_41
    move v0, v1

    goto :goto_23

    :pswitch_42
    move v0, v2

    goto :goto_23

    :pswitch_43
    move v0, v3

    goto :goto_23

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_24
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    const/16 v0, 0x7d

    goto :goto_24

    :pswitch_45
    move v0, v1

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
    const/16 v0, 0x7d

    goto :goto_25

    :pswitch_49
    move v0, v1

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

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 11
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v10, 0x3

    const/4 v9, 0x1

    const/4 v8, -0x1

    const/4 v7, 0x0

    sget-boolean v6, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 106
    if-nez p2, :cond_1

    .line 134
    :cond_0
    :goto_0
    return-void

    .line 4
    :cond_1
    if-ne p1, v9, :cond_7

    .line 113
    :try_start_0
    invoke-static {}, Lcom/whatsapp/j5;->b()Ljava/io/File;

    move-result-object v0

    .line 3
    const/4 v1, 0x1

    invoke-static {v1, p0}, Lcom/whatsapp/j5;->a(ILandroid/app/Activity;)I

    move-result v1

    sget v2, Lcom/whatsapp/j5;->c:I

    if-ne v1, v2, :cond_6

    .line 43
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    if-nez v1, :cond_4

    .line 129
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_0 .. :try_end_0} :catch_3

    move-result v1

    if-eqz v1, :cond_3

    .line 116
    :try_start_1
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->i:Ljava/lang/String;

    invoke-static {v1, p3, v0}, Lcom/whatsapp/j5;->a(Ljava/lang/String;Landroid/content/Intent;Ljava/io/File;)V

    .line 85
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->setResult(I)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_1 .. :try_end_1} :catch_3

    .line 39
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_0

    .line 88
    :catch_0
    move-exception v0

    .line 49
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 62
    const v0, 0x7f0901f7

    invoke-static {p0, v0, v7}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 79
    :goto_2
    invoke-virtual {p0, v8}, Lcom/whatsapp/PickFileType;->setResult(I)V

    .line 61
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    goto :goto_0

    .line 14
    :catch_1
    move-exception v0

    .line 77
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 9
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 30
    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 52
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/whatsapp/PickFileType;->setResult(ILandroid/content/Intent;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_1

    .line 109
    :catch_2
    move-exception v0

    .line 118
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 50
    const v0, 0x7f0901f7

    invoke-static {p0, v0, v7}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    goto :goto_2

    .line 82
    :cond_3
    :try_start_4
    sget-object v0, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 64
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090209

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_0

    .line 53
    :catch_3
    move-exception v0

    .line 71
    sget-object v0, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 11
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    aget-object v1, v1, v10

    invoke-virtual {v0, v1, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v7, v0}, Lcom/whatsapp/PickFileType;->setResult(ILandroid/content/Intent;)V

    .line 31
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    goto/16 :goto_0

    .line 69
    :cond_4
    :try_start_5
    sput-object p3, Lcom/whatsapp/j5;->b:Landroid/content/Intent;

    .line 75
    sget-object v0, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;B)Landroid/content/Intent;

    .line 81
    const/4 v0, -0x1

    invoke-virtual {p0, v0, p3}, Lcom/whatsapp/PickFileType;->setResult(ILandroid/content/Intent;)V

    .line 126
    invoke-static {}, Lcom/whatsapp/Conversation;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 92
    invoke-static {}, Lcom/whatsapp/Conversation;->b()Lcom/whatsapp/Conversation;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/whatsapp/Conversation;->a(Landroid/content/Intent;)V

    .line 19
    :cond_5
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_5 .. :try_end_5} :catch_3

    goto/16 :goto_0

    .line 27
    :cond_6
    :try_start_6
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->i:Ljava/lang/String;

    invoke-static {v1, p3, v0}, Lcom/whatsapp/j5;->a(Ljava/lang/String;Landroid/content/Intent;Ljava/io/File;)V

    .line 1
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->setResult(I)V
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_6 .. :try_end_6} :catch_3

    .line 66
    :goto_3
    :try_start_7
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    goto/16 :goto_0

    .line 100
    :catch_4
    move-exception v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 15
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 114
    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 37
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/whatsapp/PickFileType;->setResult(ILandroid/content/Intent;)V

    goto :goto_3

    .line 97
    :cond_7
    const/4 v0, 0x5

    if-ne p1, v0, :cond_9

    .line 83
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 59
    if-nez v0, :cond_8

    .line 87
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f090209

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 104
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    if-eqz v6, :cond_0

    .line 42
    :cond_8
    invoke-static {v0}, Lcom/whatsapp/j5;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v3

    .line 125
    iget-object v2, p0, Lcom/whatsapp/PickFileType;->i:Ljava/lang/String;

    const/4 v4, 0x2

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/whatsapp/j5;->a(I)Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lcom/whatsapp/j5;->a(Landroid/app/Activity;Lcom/whatsapp/lr;Ljava/lang/String;Ljava/io/File;BLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->setResult(I)V

    .line 117
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    goto/16 :goto_0

    .line 74
    :cond_9
    const/4 v0, 0x4

    if-ne p1, v0, :cond_b

    .line 136
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 67
    if-nez v0, :cond_a

    .line 78
    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 119
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f090209

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 63
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    if-eqz v6, :cond_0

    .line 7
    :cond_a
    invoke-static {v0}, Lcom/whatsapp/j5;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v3

    .line 84
    iget-object v2, p0, Lcom/whatsapp/PickFileType;->i:Ljava/lang/String;

    const/4 v4, 0x3

    const/4 v0, 0x3

    invoke-static {v0}, Lcom/whatsapp/j5;->a(I)Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lcom/whatsapp/j5;->a(Landroid/app/Activity;Lcom/whatsapp/lr;Ljava/lang/String;Ljava/io/File;BLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->setResult(I)V

    .line 94
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    goto/16 :goto_0

    .line 70
    :cond_b
    const/4 v0, 0x7

    if-ne p1, v0, :cond_11

    .line 46
    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    const/4 v0, 0x1

    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    const/4 v0, 0x2

    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v3, 0xd

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    .line 130
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    .line 57
    if-nez v1, :cond_c

    .line 90
    sget-object v0, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v3, 0xf

    aget-object v0, v0, v3

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 99
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->setResult(I)V

    .line 86
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    .line 93
    :cond_c
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 16
    if-eqz v0, :cond_e

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 98
    new-instance v1, Lg;

    invoke-direct {v1, p0}, Lg;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    .line 28
    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    .line 51
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    iget-object v1, v1, Lg;->c:Lj;

    sget-object v2, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lj;->a:Ljava/lang/String;

    .line 91
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg;->c(Ljava/lang/String;)V

    .line 80
    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_d

    .line 122
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg;->d(Ljava/lang/String;)V

    .line 68
    :cond_d
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg;->e(Ljava/lang/String;)V

    .line 76
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg;->f(Ljava/lang/String;)V

    .line 38
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg;->g(Ljava/lang/String;)V

    .line 36
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg;->h(Ljava/lang/String;)V

    .line 111
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg;->i(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lg;->j(Ljava/lang/String;)V

    .line 55
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    if-eqz v6, :cond_f

    .line 58
    :cond_e
    sget-object v0, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 26
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->setResult(I)V

    .line 10
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    goto/16 :goto_0

    .line 103
    :cond_f
    new-instance v0, Lm;

    invoke-direct {v0}, Lm;-><init>()V
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_0
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_7 .. :try_end_7} :catch_3

    .line 102
    :try_start_8
    iget-object v1, p0, Lcom/whatsapp/PickFileType;->g:Lg;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lm;->a(Lg;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PickFileType;->f:Ljava/lang/String;
    :try_end_8
    .catch Lb; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_8 .. :try_end_8} :catch_3

    .line 112
    :goto_4
    :try_start_9
    iget-object v0, p0, Lcom/whatsapp/PickFileType;->f:Ljava/lang/String;

    if-nez v0, :cond_10

    .line 20
    sget-object v0, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 120
    const v0, 0x7f09012a

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    if-eqz v6, :cond_0

    .line 33
    :cond_10
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/ViewSharedContactActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 25
    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 128
    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 12
    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v2, 0xe

    aget-object v1, v1, v2

    iget-object v2, p0, Lcom/whatsapp/PickFileType;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->startActivity(Landroid/content/Intent;)V

    .line 8
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->setResult(I)V

    .line 133
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    goto/16 :goto_0

    .line 60
    :catch_5
    move-exception v0

    .line 29
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 108
    const v0, 0x7f09022f

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    goto :goto_4

    .line 124
    :cond_11
    sget-object v0, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_9} :catch_0
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catch Lcom/whatsapp/dg; {:try_start_9 .. :try_end_9} :catch_3

    goto/16 :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .parameter

    .prologue
    const v3, 0x7f0d00b7

    const/4 v2, 0x1

    .line 18
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 132
    invoke-virtual {p0, v2}, Lcom/whatsapp/PickFileType;->requestWindowFeature(I)Z

    .line 35
    const v0, 0x7f03004d

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->setContentView(I)V

    .line 34
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-nez v0, :cond_0

    .line 13
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->finish()V

    .line 123
    :goto_0
    return-void

    .line 107
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/PickFileType;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/PickFileType;->z:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/PickFileType;->i:Ljava/lang/String;

    .line 22
    invoke-virtual {p0, v3}, Lcom/whatsapp/PickFileType;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 127
    invoke-virtual {p0, v3}, Lcom/whatsapp/PickFileType;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 135
    invoke-virtual {p0, v3}, Lcom/whatsapp/PickFileType;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ay;

    invoke-direct {v1, p0}, Lcom/whatsapp/ay;-><init>(Lcom/whatsapp/PickFileType;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    const v0, 0x7f0d00b8

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/by;

    invoke-direct {v1, p0}, Lcom/whatsapp/by;-><init>(Lcom/whatsapp/PickFileType;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    const v0, 0x7f0d00b9

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/cy;

    invoke-direct {v1, p0}, Lcom/whatsapp/cy;-><init>(Lcom/whatsapp/PickFileType;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    const v0, 0x7f0d00ba

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/dy;

    invoke-direct {v1, p0}, Lcom/whatsapp/dy;-><init>(Lcom/whatsapp/PickFileType;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    const v0, 0x7f0d00bb

    invoke-virtual {p0, v0}, Lcom/whatsapp/PickFileType;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/ey;

    invoke-direct {v1, p0}, Lcom/whatsapp/ey;-><init>(Lcom/whatsapp/PickFileType;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method
