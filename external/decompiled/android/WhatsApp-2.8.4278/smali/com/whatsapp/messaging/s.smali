.class public Lcom/whatsapp/messaging/s;
.super Ljava/lang/Object;
.source "s.java"


# static fields
.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x6f

    const/16 v1, 0x62

    const/16 v3, 0x53

    const/16 v4, 0x52

    const/4 v6, 0x0

    const/16 v0, 0xd

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\r\u0010\n%;\u0018\u0015"

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

    const-string v0, "\u0005\u000f\u001f#?\u000e\u0005@ 7\u0013\u0006@4 \u0012\u0017\u001f|5\u0018\u0016B#3\u000f\u0016\u00060;\r\u0003\u0001\'!G"

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

    const-string v0, "\u0005\u000f\u001f#?\u000e\u0005@ 7\u0013\u0006@4 \u0012\u0017\u001f|>\u0018\u0003\u00196\r\u001a\u0010\u0000&\""

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

    const-string v0, "\u0005\u000f\u001f#?\u000e\u0005@ 7\u0013\u0006@4 \u0012\u0017\u001f|5\u0018\u0016B4 \u0012\u0017\u001fi"

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

    const-string v0, "\u0005\u000f\u001f#?\u000e\u0005@ 7\u0013\u0006@4 \u0012\u0017\u001f|1\u0011\u0007\u000e!\u007f\u0019\u000b\u001d\'+G"

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

    const-string v0, "\u0005\u000f\u001f#?\u000e\u0005@ 7\u0013\u0006@0 \u0018\u0003\u001b6\r\u001a\u0010\u0000&\""

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

    const-string v0, "\u0005\u000f\u001f#?\u000e\u0005@ 7\u0013\u0006@4 \u0012\u0017\u001f|5\u0018\u0016B<%\u0013\u000b\u00014\u007f\u001a\u0010\u0000&\"G"

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

    const-string v0, "\u0005\u000f\u001f#?\u000e\u0005@ 7\u0013\u0006@4 \u0012\u0017\u001f|!\u0018\u00160 \'\u001f\u0008\n0&G"

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

    const-string v0, "\u0017\u000b\u000b"

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

    const-string v0, "\u0010\u0011\u0008:6"

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

    const-string v0, "\u0017\u000b\u000b\u000c1\u0015\u0003\u000147\u0019=\r*"

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

    const-string v0, "\t\u000b\u00026!\t\u0003\u0002#"

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

    const/16 v8, 0xc

    const-string v0, "\u000e\u0016\u000e\'\'\u000e"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_c
    if-gt v6, v7, :cond_c

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_d
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x7d

    goto :goto_d

    :pswitch_1
    move v0, v1

    goto :goto_d

    :pswitch_2
    move v0, v2

    goto :goto_d

    :pswitch_3
    move v0, v3

    goto :goto_d

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x7d

    goto :goto_e

    :pswitch_5
    move v0, v1

    goto :goto_e

    :pswitch_6
    move v0, v2

    goto :goto_e

    :pswitch_7
    move v0, v3

    goto :goto_e

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x7d

    goto :goto_f

    :pswitch_9
    move v0, v1

    goto :goto_f

    :pswitch_a
    move v0, v2

    goto :goto_f

    :pswitch_b
    move v0, v3

    goto :goto_f

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x7d

    goto :goto_10

    :pswitch_d
    move v0, v1

    goto :goto_10

    :pswitch_e
    move v0, v2

    goto :goto_10

    :pswitch_f
    move v0, v3

    goto :goto_10

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_11
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x7d

    goto :goto_11

    :pswitch_11
    move v0, v1

    goto :goto_11

    :pswitch_12
    move v0, v2

    goto :goto_11

    :pswitch_13
    move v0, v3

    goto :goto_11

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x7d

    goto :goto_12

    :pswitch_15
    move v0, v1

    goto :goto_12

    :pswitch_16
    move v0, v2

    goto :goto_12

    :pswitch_17
    move v0, v3

    goto :goto_12

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_13
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    const/16 v0, 0x7d

    goto :goto_13

    :pswitch_19
    move v0, v1

    goto :goto_13

    :pswitch_1a
    move v0, v2

    goto :goto_13

    :pswitch_1b
    move v0, v3

    goto :goto_13

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_14
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    const/16 v0, 0x7d

    goto :goto_14

    :pswitch_1d
    move v0, v1

    goto :goto_14

    :pswitch_1e
    move v0, v2

    goto :goto_14

    :pswitch_1f
    move v0, v3

    goto :goto_14

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_15
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    const/16 v0, 0x7d

    goto :goto_15

    :pswitch_21
    move v0, v1

    goto :goto_15

    :pswitch_22
    move v0, v2

    goto :goto_15

    :pswitch_23
    move v0, v3

    goto :goto_15

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_16
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    const/16 v0, 0x7d

    goto :goto_16

    :pswitch_25
    move v0, v1

    goto :goto_16

    :pswitch_26
    move v0, v2

    goto :goto_16

    :pswitch_27
    move v0, v3

    goto :goto_16

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_17
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    const/16 v0, 0x7d

    goto :goto_17

    :pswitch_29
    move v0, v1

    goto :goto_17

    :pswitch_2a
    move v0, v2

    goto :goto_17

    :pswitch_2b
    move v0, v3

    goto :goto_17

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_18
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    const/16 v0, 0x7d

    goto :goto_18

    :pswitch_2d
    move v0, v1

    goto :goto_18

    :pswitch_2e
    move v0, v2

    goto :goto_18

    :pswitch_2f
    move v0, v3

    goto :goto_18

    :cond_c
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_19
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_c

    :pswitch_30
    const/16 v0, 0x7d

    goto :goto_19

    :pswitch_31
    move v0, v1

    goto :goto_19

    :pswitch_32
    move v0, v2

    goto :goto_19

    :pswitch_33
    move v0, v3

    goto :goto_19

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

.method public static a(Landroid/os/Message;)I
    .locals 1
    .parameter

    .prologue
    .line 148
    iget v0, p0, Landroid/os/Message;->arg1:I

    return v0
.end method

.method public static a()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 71
    const/4 v0, 0x0

    const/16 v1, 0x9

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(I)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    .line 199
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x16

    invoke-static {v0, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(IJ)Landroid/os/Message;
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 48
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x7

    new-instance v3, Ljava/lang/Long;

    invoke-direct {v3, p1, p2}, Ljava/lang/Long;-><init>(J)V

    invoke-static {v0, v1, v2, p0, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/whatsapp/hz;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 43
    const/4 v0, 0x0

    const/16 v1, 0x1b

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/whatsapp/j2;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 97
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/whatsapp/ju;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 19
    const/4 v0, 0x0

    const/16 v1, 0xd

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/whatsapp/qw;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 65
    const/4 v0, 0x0

    const/16 v1, 0x24

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/whatsapp/sz;)Landroid/os/Message;
    .locals 2
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 89
    const/4 v0, 0x0

    invoke-static {v0, v1, v1, v1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/whatsapp/uz;I)Landroid/os/Message;
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 101
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, p1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/whatsapp/vw;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 54
    const/4 v0, 0x0

    const/16 v1, 0x23

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 184
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;I)Landroid/os/Message;
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 207
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, v1, v2, p1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;II)Landroid/os/Message;
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 113
    const/4 v0, 0x0

    const/16 v1, 0x1c

    new-instance v2, Lcom/whatsapp/gz;

    invoke-direct {v2, p0, p1, p2}, Lcom/whatsapp/gz;-><init>(Ljava/lang/String;II)V

    invoke-static {v0, v3, v1, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;)Landroid/os/Message;
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    .line 141
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 103
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-static {v1, v2, v3, p1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 156
    invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 189
    return-object v1
.end method

.method public static a(Ljava/lang/String;I[BLjava/lang/String;)Landroid/os/Message;
    .locals 5
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 106
    .line 152
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v0

    .line 190
    :goto_0
    const/16 v2, 0xc

    new-instance v3, Lcom/whatsapp/gz;

    invoke-direct {v3, p0, v1, p2, p1}, Lcom/whatsapp/gz;-><init>(Ljava/lang/String;[B[BI)V

    invoke-static {v0, v4, v2, v4, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v1, p2

    move-object p2, v0

    .line 192
    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Message;
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v3, 0x0

    .line 45
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 104
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const/4 v1, 0x0

    const/16 v2, 0x18

    invoke-static {v1, v3, v2, v3, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Landroid/os/Message;
    .locals 4
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 67
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 188
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 2
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0xf

    invoke-static {v1, v2, v3, p3, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Z)Landroid/os/Message;
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    const/4 v3, 0x3

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v2, v1, v3, v0, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public static a(Ljava/util/Hashtable;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 139
    const/4 v0, 0x0

    const/16 v1, 0xb

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/whatsapp/messaging/t;Landroid/os/Message;)V
    .locals 10
    .parameter
    .parameter

    .prologue
    const/16 v9, 0x9

    const/4 v3, 0x0

    const/16 v8, 0x8

    const/4 v2, 0x1

    sget v6, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 50
    iget v0, p1, Landroid/os/Message;->arg1:I

    packed-switch v0, :pswitch_data_0

    .line 86
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 108
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/sz;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/t;->a(Lcom/whatsapp/sz;)V

    .line 41
    if-eqz v6, :cond_0

    .line 76
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/uz;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/messaging/t;->a(Lcom/whatsapp/uz;I)V

    .line 100
    if-eqz v6, :cond_0

    .line 180
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/t;->a(Ljava/lang/String;)V

    .line 164
    if-eqz v6, :cond_0

    .line 206
    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v1, p1, Landroid/os/Message;->arg2:I

    if-ne v1, v2, :cond_1

    move v1, v2

    :goto_1
    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/messaging/t;->a(Ljava/lang/String;Z)V

    .line 22
    if-eqz v6, :cond_0

    .line 56
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/t;->b(Ljava/lang/String;)V

    .line 49
    if-eqz v6, :cond_0

    .line 17
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/t;->c(Ljava/lang/String;)V

    .line 4
    :pswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    .line 62
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    aget-object v1, v1, v8

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v4, p1, Landroid/os/Message;->arg2:I

    sget-object v5, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v7, 0xc

    aget-object v5, v5, v7

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v4, v0}, Lcom/whatsapp/messaging/t;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 174
    if-eqz v6, :cond_0

    .line 145
    :pswitch_8
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/t;->d(Ljava/lang/String;)V

    .line 127
    if-eqz v6, :cond_0

    .line 153
    :pswitch_9
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v1, p1, Landroid/os/Message;->arg2:I

    if-ne v1, v2, :cond_2

    :goto_2
    invoke-virtual {p0, v0, v2}, Lcom/whatsapp/messaging/t;->b(Ljava/lang/String;Z)V

    .line 24
    if-eqz v6, :cond_0

    .line 94
    :pswitch_a
    iget v1, p1, Landroid/os/Message;->arg2:I

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v1, v2, v3}, Lcom/whatsapp/messaging/t;->a(IJ)V

    .line 60
    if-eqz v6, :cond_0

    .line 133
    :pswitch_b
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/t;->e(Ljava/lang/String;)V

    .line 61
    if-eqz v6, :cond_0

    .line 18
    :pswitch_c
    invoke-virtual {p0}, Lcom/whatsapp/messaging/t;->a()V

    .line 144
    if-eqz v6, :cond_0

    .line 70
    :pswitch_d
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/Hashtable;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/t;->a(Ljava/util/Hashtable;)V

    .line 198
    if-eqz v6, :cond_0

    .line 96
    :pswitch_e
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/gz;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/t;->a(Lcom/whatsapp/gz;)V

    .line 42
    if-eqz v6, :cond_0

    .line 23
    :pswitch_f
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/messaging/t;->a(Ljava/lang/String;I)V

    .line 160
    if-eqz v6, :cond_0

    .line 158
    :pswitch_10
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    .line 112
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    aget-object v2, v2, v8

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v4, 0xa

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget v4, p1, Landroid/os/Message;->arg2:I

    sget-object v5, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/16 v7, 0xb

    aget-object v5, v5, v7

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/whatsapp/messaging/t;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    .line 105
    if-eqz v6, :cond_0

    .line 182
    :pswitch_11
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    .line 16
    sget-object v1, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    aget-object v2, v2, v8

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/whatsapp/messaging/t;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    if-eqz v6, :cond_0

    .line 150
    :pswitch_12
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/messaging/t;->b(Ljava/lang/String;I)V

    .line 8
    if-eqz v6, :cond_0

    .line 162
    :pswitch_13
    invoke-virtual {p0}, Lcom/whatsapp/messaging/t;->b()V

    .line 91
    if-eqz v6, :cond_0

    .line 121
    :pswitch_14
    invoke-virtual {p0}, Lcom/whatsapp/messaging/t;->c()V

    .line 146
    if-eqz v6, :cond_0

    .line 136
    :pswitch_15
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/uz;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/messaging/t;->b(Lcom/whatsapp/uz;I)V

    .line 5
    if-eqz v6, :cond_0

    .line 117
    :pswitch_16
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/uz;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {p0, v0, v1}, Lcom/whatsapp/messaging/t;->c(Lcom/whatsapp/uz;I)V

    .line 10
    if-eqz v6, :cond_0

    .line 26
    :pswitch_17
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/t;->a(I)V

    goto/16 :goto_0

    :cond_1
    move v1, v3

    .line 206
    goto/16 :goto_1

    :cond_2
    move v2, v3

    .line 153
    goto/16 :goto_2

    .line 50
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_6
        :pswitch_d
        :pswitch_e
        :pswitch_0
        :pswitch_f
        :pswitch_10
        :pswitch_12
        :pswitch_13
        :pswitch_0
        :pswitch_14
        :pswitch_15
        :pswitch_8
        :pswitch_17
        :pswitch_16
        :pswitch_11
    .end packed-switch
.end method

.method public static a(Lcom/whatsapp/messaging/v;Landroid/os/Message;)V
    .locals 4
    .parameter
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/messaging/MessageService;->C:I

    .line 69
    iget v0, p1, Landroid/os/Message;->arg1:I

    packed-switch v0, :pswitch_data_0

    .line 196
    :cond_0
    :goto_0
    return-void

    .line 163
    :pswitch_0
    invoke-virtual {p0}, Lcom/whatsapp/messaging/v;->a()V

    .line 51
    if-eqz v1, :cond_0

    .line 88
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->a(Ljava/lang/String;)V

    .line 142
    if-eqz v1, :cond_0

    .line 143
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->b(Ljava/lang/String;)V

    .line 83
    if-eqz v1, :cond_0

    .line 79
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/j2;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->a(Lcom/whatsapp/j2;)V

    .line 15
    if-eqz v1, :cond_0

    .line 134
    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/hz;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->a(Lcom/whatsapp/hz;)V

    .line 125
    if-eqz v1, :cond_0

    .line 59
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/gz;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->a(Lcom/whatsapp/gz;)V

    .line 169
    if-eqz v1, :cond_0

    .line 81
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/String;

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->a([Ljava/lang/String;)V

    .line 151
    if-eqz v1, :cond_0

    .line 25
    :pswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->c(Ljava/lang/String;)V

    .line 167
    if-eqz v1, :cond_0

    .line 90
    :pswitch_8
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->d(Ljava/lang/String;)V

    .line 155
    if-eqz v1, :cond_0

    .line 119
    :pswitch_9
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->e(Ljava/lang/String;)V

    .line 55
    if-eqz v1, :cond_0

    .line 197
    :pswitch_a
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/sz;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->a(Lcom/whatsapp/sz;)V

    .line 154
    if-eqz v1, :cond_0

    .line 107
    :pswitch_b
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/sz;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->b(Lcom/whatsapp/sz;)V

    .line 186
    if-eqz v1, :cond_0

    .line 204
    :pswitch_c
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/sz;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->c(Lcom/whatsapp/sz;)V

    .line 166
    if-eqz v1, :cond_0

    .line 58
    :pswitch_d
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/sz;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->d(Lcom/whatsapp/sz;)V

    .line 124
    if-eqz v1, :cond_0

    .line 9
    :pswitch_e
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->f(Ljava/lang/String;)V

    .line 135
    if-eqz v1, :cond_0

    .line 110
    :pswitch_f
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->g(Ljava/lang/String;)V

    .line 179
    if-eqz v1, :cond_0

    .line 130
    :pswitch_10
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->h(Ljava/lang/String;)V

    .line 12
    if-eqz v1, :cond_0

    .line 140
    :pswitch_11
    sget-object v0, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 33
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/ju;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->a(Lcom/whatsapp/ju;)V

    .line 82
    if-eqz v1, :cond_0

    .line 13
    :pswitch_12
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/ju;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->b(Lcom/whatsapp/ju;)V

    .line 28
    if-eqz v1, :cond_0

    .line 14
    :pswitch_13
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/ju;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->c(Lcom/whatsapp/ju;)V

    .line 176
    if-eqz v1, :cond_0

    .line 80
    :pswitch_14
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->i(Ljava/lang/String;)V

    .line 27
    if-eqz v1, :cond_0

    .line 87
    :pswitch_15
    sget-object v0, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 193
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/ju;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->d(Lcom/whatsapp/ju;)V

    .line 128
    if-eqz v1, :cond_0

    .line 57
    :pswitch_16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 34
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->j(Ljava/lang/String;)V

    .line 11
    if-eqz v1, :cond_0

    .line 116
    :pswitch_17
    sget-object v0, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 132
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->k(Ljava/lang/String;)V

    .line 201
    if-eqz v1, :cond_0

    .line 7
    :pswitch_18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->l(Ljava/lang/String;)V

    .line 66
    if-eqz v1, :cond_0

    .line 183
    :pswitch_19
    sget-object v0, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 126
    invoke-virtual {p0}, Lcom/whatsapp/messaging/v;->g()V

    .line 205
    if-eqz v1, :cond_0

    .line 203
    :pswitch_1a
    sget-object v0, Lcom/whatsapp/messaging/s;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p0}, Lcom/whatsapp/messaging/v;->h()V

    .line 30
    if-eqz v1, :cond_0

    .line 39
    :pswitch_1b
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->m(Ljava/lang/String;)V

    .line 149
    if-eqz v1, :cond_0

    .line 159
    :pswitch_1c
    invoke-virtual {p0}, Lcom/whatsapp/messaging/v;->i()V

    .line 172
    if-eqz v1, :cond_0

    .line 29
    :pswitch_1d
    invoke-virtual {p0}, Lcom/whatsapp/messaging/v;->b()V

    .line 52
    if-eqz v1, :cond_0

    .line 195
    :pswitch_1e
    invoke-virtual {p0}, Lcom/whatsapp/messaging/v;->c()V

    .line 98
    if-eqz v1, :cond_0

    .line 53
    :pswitch_1f
    invoke-virtual {p0}, Lcom/whatsapp/messaging/v;->d()V

    .line 194
    if-eqz v1, :cond_0

    .line 123
    :pswitch_20
    invoke-virtual {p0}, Lcom/whatsapp/messaging/v;->e()V

    .line 44
    if-eqz v1, :cond_0

    .line 109
    :pswitch_21
    invoke-virtual {p0}, Lcom/whatsapp/messaging/v;->f()V

    .line 63
    if-eqz v1, :cond_0

    .line 102
    :pswitch_22
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->n(Ljava/lang/String;)V

    .line 92
    if-eqz v1, :cond_0

    .line 147
    :pswitch_23
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/vw;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->a(Lcom/whatsapp/vw;)V

    .line 165
    if-eqz v1, :cond_0

    .line 3
    :pswitch_24
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/qw;

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/v;->a(Lcom/whatsapp/qw;)V

    goto/16 :goto_0

    .line 69
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_e
        :pswitch_f
        :pswitch_1d
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
        :pswitch_1e
        :pswitch_1f
        :pswitch_20
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_21
        :pswitch_c
        :pswitch_d
        :pswitch_22
        :pswitch_13
        :pswitch_23
        :pswitch_24
    .end packed-switch
.end method

.method public static b(Landroid/os/Message;)I
    .locals 1
    .parameter

    .prologue
    .line 177
    iget v0, p0, Landroid/os/Message;->arg1:I

    return v0
.end method

.method public static b()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 187
    const/4 v0, 0x0

    const/16 v1, 0x11

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/whatsapp/ju;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 74
    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/whatsapp/sz;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 202
    const/4 v0, 0x0

    const/4 v1, 0x7

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lcom/whatsapp/uz;I)Landroid/os/Message;
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 131
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x14

    invoke-static {v0, v1, v2, p1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 46
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;I)Landroid/os/Message;
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 38
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-static {v0, v1, v2, p1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Message;
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v4, 0x0

    .line 122
    const/4 v0, 0x0

    const/16 v1, 0x11

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v4, v1, v4, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Z)Landroid/os/Message;
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    const/4 v3, 0x6

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v2, v1, v3, v0, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public static c()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 36
    const/4 v0, 0x0

    const/16 v1, 0x13

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lcom/whatsapp/ju;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 173
    const/4 v0, 0x0

    const/16 v1, 0x22

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lcom/whatsapp/sz;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 191
    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lcom/whatsapp/uz;I)Landroid/os/Message;
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 78
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x17

    invoke-static {v0, v1, v2, p1, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 68
    const/4 v0, 0x0

    const/16 v1, 0x15

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 170
    return-object v0
.end method

.method public static c(Ljava/lang/String;Z)Landroid/os/Message;
    .locals 4
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 171
    const/4 v2, 0x0

    const/4 v3, 0x5

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v2, v1, v3, v0, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public static d()Landroid/os/Message;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 118
    const/4 v0, 0x0

    invoke-static {v0, v1, v1, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static d(Lcom/whatsapp/ju;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 157
    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static d(Lcom/whatsapp/sz;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 138
    const/4 v0, 0x0

    const/16 v1, 0x1f

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 129
    const/4 v0, 0x0

    const/16 v1, 0x8

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static e()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 6
    const/4 v0, 0x0

    const/16 v1, 0x1e

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static e(Lcom/whatsapp/sz;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 64
    const/4 v0, 0x0

    const/16 v1, 0x20

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 32
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static f()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 37
    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static f(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 200
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static g()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 84
    const/4 v0, 0x0

    const/16 v1, 0x17

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static g(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 178
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static h()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 75
    const/4 v0, 0x0

    const/16 v1, 0xb

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static h(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 31
    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static i()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 111
    const/4 v0, 0x0

    const/16 v1, 0x18

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static i(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 77
    const/4 v0, 0x0

    const/16 v1, 0x9

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static j()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 95
    const/4 v0, 0x0

    const/16 v1, 0x19

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static j(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 137
    const/4 v0, 0x0

    const/16 v1, 0xa

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static k()Landroid/os/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 93
    const/4 v0, 0x0

    const/16 v1, 0x1a

    invoke-static {v0, v2, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static k(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 181
    const/4 v0, 0x0

    const/16 v1, 0x12

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static l(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 73
    const/4 v0, 0x0

    const/16 v1, 0x13

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static m(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 120
    const/4 v0, 0x0

    const/16 v1, 0x16

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method

.method public static n(Ljava/lang/String;)Landroid/os/Message;
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 35
    const/4 v0, 0x0

    const/16 v1, 0x21

    invoke-static {v0, v2, v1, v2, p0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method
