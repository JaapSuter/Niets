.class public Lcom/whatsapp/qp;
.super Ljava/lang/Object;
.source "qp.java"


# static fields
.field private static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation
.end field

.field private static c:Lcom/whatsapp/ar;

.field private static final z:[Ljava/lang/String;


# instance fields
.field private b:Lcom/whatsapp/xq;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v3, 0x63

    const/16 v4, 0x5f

    const/16 v2, 0x50

    const/16 v1, 0x32

    const/4 v6, 0x0

    const/16 v0, 0x16

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "V1\u0017\tn"

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

    const-string v0, "@1\u00147<]>\u0017\t<F\u000f\n\u000c"

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

    const-string v0, "m9\u0007"

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

    const-string v0, "G \u0007\t+W\u0018\u000c\u0004;}%\u0017+0\\$\u0002\u000b+\u001d7\u0006\u001c\u0000\\%\u000f\u0004\u0000E1\u0000\u00071F1\u0000\u001c"

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

    const-string v0, "V1\u0017\tl"

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

    const-string v0, "V1\u0017\tm"

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

    const-string v0, "[><\u001e6A9\u0001\u0004:m7\u0011\u0007*B"

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

    const-string v0, "Q?\r\u001c>Q$<\u0001;\u000fo"

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

    const-string v0, "V9\u0010\u00183S)<\u0006>_5"

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

    const-string v0, "[>\u0007\u0001)Q?\u0016\u0006+\u001d3\u000c\u001d1Fp"

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

    const-string v0, "V1\u0017\tn\u000fo"

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

    const-string v0, "V5\u000f"

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

    const-string v0, "V2\n\u00069]\u007f\u000e\t1S7\u0006\u001apV5\u000f\r+W\u0013\u000c\u0006+S3\u0017\u001b"

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

    const-string v0, "a5\u0011\u001e:@\u0010\u0010F(Z1\u0017\u001b>B M\u0006:F"

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

    const-string v0, "V%\u0013\u00046Q1\u0017\r"

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

    const-string v0, "X9\u0007"

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

    const-string v0, "Q?\u000eF>\\4\u0011\u00076V~\u000f\t*\\3\u000b\r-\u001c1\u0000\u001c6]>M!\u0011a\u0004\"$\u0013m\u0003+\'\rf\u00136<"

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

    const-string v0, "S>\u0007\u001a0[4M\u00011F5\r\u001cqW(\u0017\u001a>\u001c#\u000b\u0007-F3\u0016\u001cq|\u0011.-"

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

    const/16 v10, 0x12

    const-string v0, "S>\u0007\u001a0[4M\u00011F5\r\u001cqW(\u0017\u001a>\u001c#\u000b\u0007-F3\u0016\u001cq{\u001e7-\u0011f"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_12
    if-gt v7, v8, :cond_12

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x13

    const-string v0, "S>\u0007\u001a0[4M\u00011F5\r\u001cqW(\u0017\u001a>\u001c#\u000b\u0007-F3\u0016\u001cq{\u0013,&"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_13
    if-gt v7, v8, :cond_13

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v10, 0x14

    const-string v0, "V9\u0010\u00183S)\r\t2W"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_14
    if-gt v7, v8, :cond_14

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0x15

    const-string v0, "D5\u0011\u001b6]>"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_15
    if-gt v6, v7, :cond_15

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    .line 241
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_16
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_16

    :pswitch_1
    move v0, v2

    goto :goto_16

    :pswitch_2
    move v0, v3

    goto :goto_16

    :pswitch_3
    const/16 v0, 0x68

    goto :goto_16

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_17
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_17

    :pswitch_5
    move v0, v2

    goto :goto_17

    :pswitch_6
    move v0, v3

    goto :goto_17

    :pswitch_7
    const/16 v0, 0x68

    goto :goto_17

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_18
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_18

    :pswitch_9
    move v0, v2

    goto :goto_18

    :pswitch_a
    move v0, v3

    goto :goto_18

    :pswitch_b
    const/16 v0, 0x68

    goto :goto_18

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_19
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_19

    :pswitch_d
    move v0, v2

    goto :goto_19

    :pswitch_e
    move v0, v3

    goto :goto_19

    :pswitch_f
    const/16 v0, 0x68

    goto :goto_19

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_1a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_1a

    :pswitch_11
    move v0, v2

    goto :goto_1a

    :pswitch_12
    move v0, v3

    goto :goto_1a

    :pswitch_13
    const/16 v0, 0x68

    goto :goto_1a

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_1b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_1b

    :pswitch_15
    move v0, v2

    goto :goto_1b

    :pswitch_16
    move v0, v3

    goto :goto_1b

    :pswitch_17
    const/16 v0, 0x68

    goto :goto_1b

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_1c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_1c

    :pswitch_19
    move v0, v2

    goto :goto_1c

    :pswitch_1a
    move v0, v3

    goto :goto_1c

    :pswitch_1b
    const/16 v0, 0x68

    goto :goto_1c

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_1d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_1d

    :pswitch_1d
    move v0, v2

    goto :goto_1d

    :pswitch_1e
    move v0, v3

    goto :goto_1d

    :pswitch_1f
    const/16 v0, 0x68

    goto :goto_1d

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_1e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_1e

    :pswitch_21
    move v0, v2

    goto :goto_1e

    :pswitch_22
    move v0, v3

    goto :goto_1e

    :pswitch_23
    const/16 v0, 0x68

    goto :goto_1e

    :cond_9
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_1f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_9

    :pswitch_24
    move v0, v1

    goto :goto_1f

    :pswitch_25
    move v0, v2

    goto :goto_1f

    :pswitch_26
    move v0, v3

    goto :goto_1f

    :pswitch_27
    const/16 v0, 0x68

    goto :goto_1f

    :cond_a
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_20
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_a

    :pswitch_28
    move v0, v1

    goto :goto_20

    :pswitch_29
    move v0, v2

    goto :goto_20

    :pswitch_2a
    move v0, v3

    goto :goto_20

    :pswitch_2b
    const/16 v0, 0x68

    goto :goto_20

    :cond_b
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_21
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_21

    :pswitch_2d
    move v0, v2

    goto :goto_21

    :pswitch_2e
    move v0, v3

    goto :goto_21

    :pswitch_2f
    const/16 v0, 0x68

    goto :goto_21

    :cond_c
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_c

    move v0, v4

    :goto_22
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_c

    :pswitch_30
    move v0, v1

    goto :goto_22

    :pswitch_31
    move v0, v2

    goto :goto_22

    :pswitch_32
    move v0, v3

    goto :goto_22

    :pswitch_33
    const/16 v0, 0x68

    goto :goto_22

    :cond_d
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_d

    move v0, v4

    :goto_23
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_d

    :pswitch_34
    move v0, v1

    goto :goto_23

    :pswitch_35
    move v0, v2

    goto :goto_23

    :pswitch_36
    move v0, v3

    goto :goto_23

    :pswitch_37
    const/16 v0, 0x68

    goto :goto_23

    :cond_e
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_e

    move v0, v4

    :goto_24
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_e

    :pswitch_38
    move v0, v1

    goto :goto_24

    :pswitch_39
    move v0, v2

    goto :goto_24

    :pswitch_3a
    move v0, v3

    goto :goto_24

    :pswitch_3b
    const/16 v0, 0x68

    goto :goto_24

    :cond_f
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_f

    move v0, v4

    :goto_25
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_f

    :pswitch_3c
    move v0, v1

    goto :goto_25

    :pswitch_3d
    move v0, v2

    goto :goto_25

    :pswitch_3e
    move v0, v3

    goto :goto_25

    :pswitch_3f
    const/16 v0, 0x68

    goto :goto_25

    :cond_10
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_10

    move v0, v4

    :goto_26
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_10

    :pswitch_40
    move v0, v1

    goto :goto_26

    :pswitch_41
    move v0, v2

    goto :goto_26

    :pswitch_42
    move v0, v3

    goto :goto_26

    :pswitch_43
    const/16 v0, 0x68

    goto :goto_26

    :cond_11
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_11

    move v0, v4

    :goto_27
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_11

    :pswitch_44
    move v0, v1

    goto :goto_27

    :pswitch_45
    move v0, v2

    goto :goto_27

    :pswitch_46
    move v0, v3

    goto :goto_27

    :pswitch_47
    const/16 v0, 0x68

    goto :goto_27

    :cond_12
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_12

    move v0, v4

    :goto_28
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_12

    :pswitch_48
    move v0, v1

    goto :goto_28

    :pswitch_49
    move v0, v2

    goto :goto_28

    :pswitch_4a
    move v0, v3

    goto :goto_28

    :pswitch_4b
    const/16 v0, 0x68

    goto :goto_28

    :cond_13
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_13

    move v0, v4

    :goto_29
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_13

    :pswitch_4c
    move v0, v1

    goto :goto_29

    :pswitch_4d
    move v0, v2

    goto :goto_29

    :pswitch_4e
    move v0, v3

    goto :goto_29

    :pswitch_4f
    const/16 v0, 0x68

    goto :goto_29

    :cond_14
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_14

    move v0, v4

    :goto_2a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_14

    :pswitch_50
    move v0, v1

    goto :goto_2a

    :pswitch_51
    move v0, v2

    goto :goto_2a

    :pswitch_52
    move v0, v3

    goto :goto_2a

    :pswitch_53
    const/16 v0, 0x68

    goto :goto_2a

    :cond_15
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_15

    move v0, v4

    :goto_2b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_15

    :pswitch_54
    move v0, v1

    goto :goto_2b

    :pswitch_55
    move v0, v2

    goto :goto_2b

    :pswitch_56
    move v0, v3

    goto :goto_2b

    :pswitch_57
    const/16 v0, 0x68

    goto :goto_2b

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

    :pswitch_data_13
    .packed-switch 0x0
        :pswitch_4c
        :pswitch_4d
        :pswitch_4e
        :pswitch_4f
    .end packed-switch

    :pswitch_data_14
    .packed-switch 0x0
        :pswitch_50
        :pswitch_51
        :pswitch_52
        :pswitch_53
    .end packed-switch

    :pswitch_data_15
    .packed-switch 0x0
        :pswitch_54
        :pswitch_55
        :pswitch_56
        :pswitch_57
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    new-instance v0, Lcom/whatsapp/xq;

    invoke-direct {v0, p1}, Lcom/whatsapp/xq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    .line 5
    return-void
.end method

.method static a(Lcom/whatsapp/qp;)Lcom/whatsapp/xq;
    .locals 1
    .parameter

    .prologue
    .line 93
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    return-object v0
.end method

.method static d(Lcom/whatsapp/zq;)Z
    .locals 2
    .parameter

    .prologue
    .line 140
    sget-object v0, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 270
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static e(Lcom/whatsapp/zq;)V
    .locals 2
    .parameter

    .prologue
    .line 11
    sget-object v0, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    iget-object v1, p0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/uq;)Lcom/whatsapp/zq;
    .locals 5
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 207
    sget-object v2, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    monitor-enter v2

    .line 150
    :try_start_0
    sget-object v0, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 96
    iget-object v4, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    invoke-virtual {p1, v4}, Lcom/whatsapp/uq;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 282
    monitor-exit v2

    :goto_0
    return-object v0

    :cond_1
    if-eqz v1, :cond_0

    .line 58
    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/xq;->a(Lcom/whatsapp/uq;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Lcom/whatsapp/zq;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whatsapp/zq;
    .locals 1
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 225
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/whatsapp/xq;->a(Lcom/whatsapp/zq;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/whatsapp/zq;
    .locals 1
    .parameter

    .prologue
    .line 108
    sget-object v0, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    return-object v0
.end method

.method public a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 16
    invoke-static {p1}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 221
    invoke-virtual {p0}, Lcom/whatsapp/qp;->b()Lcom/whatsapp/ar;

    move-result-object v0

    :cond_0
    :goto_0
    return-object v0

    .line 198
    :cond_1
    sget-object v0, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 94
    if-nez v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 114
    if-nez v0, :cond_0

    .line 131
    new-instance v0, Lcom/whatsapp/zq;

    invoke-direct {v0, p1}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;)V

    .line 257
    sget-object v1, Lcom/whatsapp/App;->y:Lcom/whatsapp/yy;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Lcom/whatsapp/yy;->a(Ljava/lang/String;J)V

    .line 254
    iget-object v1, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/xq;->b(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    goto :goto_0
.end method

.method public a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 203
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0}, Lcom/whatsapp/xq;->c()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 1
    .parameter

    .prologue
    .line 95
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->a(Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 227
    return-void
.end method

.method public a(Landroid/net/Uri;Lcom/whatsapp/zq;)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 181
    new-instance v0, Lcom/whatsapp/rp;

    invoke-direct {v0, p0, p2}, Lcom/whatsapp/rp;-><init>(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/whatsapp/qp;->a(Landroid/net/Uri;Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z

    move-result v0

    .line 206
    if-eqz v0, :cond_0

    .line 105
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090111

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;II)V

    .line 260
    :cond_0
    return-void
.end method

.method public a(Lcom/whatsapp/zq;)V
    .locals 1
    .parameter

    .prologue
    .line 171
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->a(Lcom/whatsapp/zq;)V

    .line 152
    return-void
.end method

.method public a(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 72
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/xq;->b(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 99
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 240
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 231
    iput-object p3, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 279
    if-eqz p4, :cond_0

    .line 78
    iput-object p4, v0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    .line 110
    :cond_0
    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 214
    iget v1, v0, Lcom/whatsapp/zq;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/whatsapp/zq;->a:I

    .line 45
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v1, v0}, Lcom/whatsapp/xq;->b(Lcom/whatsapp/zq;)V

    .line 255
    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 237
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Lcom/whatsapp/xq;->a(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 202
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 161
    invoke-virtual {v0}, Lcom/whatsapp/zq;->i()V

    .line 187
    invoke-virtual {v0}, Lcom/whatsapp/zq;->j()V

    .line 8
    invoke-static {v0}, Lcom/whatsapp/qp;->e(Lcom/whatsapp/zq;)V

    if-eqz v1, :cond_0

    .line 56
    :cond_1
    return-void
.end method

.method public a(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 1
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;",
            "Landroid/database/sqlite/SQLiteTransactionListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 167
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->c(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 273
    return-void
.end method

.method public a(Ljava/util/Collection;)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 73
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 263
    iget-object v1, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/whatsapp/xq;->a(Ljava/util/Collection;Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 244
    sget-object v1, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 53
    :cond_0
    return-void
.end method

.method public a(Ljava/util/Collection;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 7
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/whatsapp/zq;",
            ">;",
            "Landroid/database/sqlite/SQLiteTransactionListener;",
            ")V"
        }
    .end annotation

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 158
    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v0, v0, v2

    sget-object v2, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-static {p1, v0, v2}, Lcom/whatsapp/zq;->a(Ljava/util/Collection;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 80
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 222
    if-eqz v0, :cond_6

    .line 32
    iget-object v4, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    sget-object v5, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v6, 0xd

    aget-object v5, v5, v6

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    :cond_1
    invoke-virtual {v0}, Lcom/whatsapp/zq;->o()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 219
    if-eqz v1, :cond_0

    .line 64
    :cond_2
    iget-boolean v4, v0, Lcom/whatsapp/zq;->k:Z

    if-eqz v4, :cond_5

    iget-object v4, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v5, 0x0

    invoke-virtual {v4, v0, v5}, Lcom/whatsapp/xq;->j(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 195
    iget-object v4, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/whatsapp/gp;->e(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    sget-object v4, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v5, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/whatsapp/fq;->m(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 69
    :cond_3
    iget-object v4, v0, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    if-eqz v4, :cond_6

    .line 119
    iget-object v4, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v4, v0, p2}, Lcom/whatsapp/xq;->i(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    if-eqz v1, :cond_6

    .line 57
    :cond_4
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_6

    .line 186
    :cond_5
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    if-eqz v1, :cond_0

    .line 223
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 41
    invoke-virtual {p0, v2}, Lcom/whatsapp/qp;->a(Ljava/util/ArrayList;)V

    .line 264
    :cond_8
    return-void
.end method

.method public a(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/LinkedList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;>;",
            "Landroid/database/sqlite/SQLiteTransactionListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 4
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/whatsapp/xq;->a(Ljava/util/Collection;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 82
    return-void
.end method

.method public a(Landroid/net/Uri;Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z
    .locals 11
    .parameter
    .parameter
    .parameter

    .prologue
    sget v9, Lcom/whatsapp/yq;->e:I

    .line 63
    const/4 v0, 0x3

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    const/4 v0, 0x1

    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    const/4 v0, 0x2

    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v1, v1, v3

    aput-object v1, v2, v0

    .line 27
    const/4 v0, 0x4

    new-array v10, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v1, v1, v3

    aput-object v1, v10, v0

    const/4 v0, 0x1

    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v1, v1, v3

    aput-object v1, v10, v0

    const/4 v0, 0x2

    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v1, v1, v3

    aput-object v1, v10, v0

    const/4 v0, 0x3

    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v1, v1, v3

    aput-object v1, v10, v0

    .line 265
    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    .line 120
    if-nez p2, :cond_4

    .line 169
    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 275
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/whatsapp/tp;->a(Z)I

    move-result v0

    .line 201
    if-eqz v0, :cond_0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 216
    :cond_0
    sget-object v1, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/whatsapp/g;->c(Z)V

    if-eqz v9, :cond_2

    .line 36
    :cond_1
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 47
    sget-object v0, Lcom/whatsapp/App;->lc:Lcom/whatsapp/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/g;->b(Z)V

    .line 162
    :cond_2
    const/4 v0, 0x1

    .line 190
    :cond_3
    :goto_0
    return v0

    .line 250
    :cond_4
    const/4 v6, 0x0

    .line 54
    const/4 v8, 0x0

    .line 3
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-result-object v7

    .line 281
    if-nez v7, :cond_5

    .line 190
    const/4 v0, 0x1

    .line 277
    if-eqz v7, :cond_3

    .line 155
    :goto_1
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_5
    move v0, v8

    .line 172
    :cond_6
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 128
    const/4 v1, 0x2

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 258
    const/4 v2, 0x1

    if-ne v1, v2, :cond_e

    .line 200
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    .line 197
    const/4 v2, 0x1

    invoke-interface {v7, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 211
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_8

    .line 177
    :cond_7
    const/4 v8, 0x1

    if-eqz v9, :cond_9

    .line 267
    :cond_8
    const/4 v8, 0x0

    .line 10
    iput-object v2, p2, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 75
    :cond_9
    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    const/4 v6, 0x0

    .line 185
    :try_start_2
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sget-object v2, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v3, v2, v3

    const/4 v5, 0x0

    move-object v2, v10

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result-object v1

    .line 238
    if-eqz v1, :cond_c

    .line 100
    :cond_a
    :try_start_3
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 122
    new-instance v0, Lcom/whatsapp/uq;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v3, v4}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    iput-object v0, p2, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 166
    const/4 v0, 0x2

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p2, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 239
    const/4 v0, 0x3

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    .line 33
    if-eqz v8, :cond_b

    .line 164
    iget-object v0, p2, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v0, v0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    iput-object v0, p2, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 179
    :cond_b
    iget-object v0, p2, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v0, v0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    if-eqz v0, :cond_a

    iget-object v0, p2, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v0, v0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_a

    .line 193
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/tp;->a:Z

    .line 88
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p2, p3}, Lcom/whatsapp/xq;->d(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z

    .line 160
    new-instance v0, Lcom/whatsapp/b9;

    invoke-direct {v0, p0, p2}, Lcom/whatsapp/b9;-><init>(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V

    invoke-virtual {v0}, Lcom/whatsapp/b9;->start()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-eqz v9, :cond_a

    .line 170
    :cond_c
    if-eqz v1, :cond_d

    .line 91
    :try_start_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_d
    move v0, v8

    .line 184
    :cond_e
    :goto_2
    if-eqz v9, :cond_6

    .line 277
    :cond_f
    if-eqz v7, :cond_3

    goto/16 :goto_1

    .line 70
    :catch_0
    move-exception v0

    move-object v1, v6

    .line 246
    :goto_3
    :try_start_5
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 170
    if-eqz v1, :cond_10

    .line 91
    :try_start_6
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_10
    move v0, v8

    .line 81
    goto :goto_2

    .line 170
    :catchall_0
    move-exception v0

    move-object v1, v6

    :goto_4
    if-eqz v1, :cond_11

    .line 91
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 170
    :cond_11
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 277
    :catchall_1
    move-exception v0

    move-object v1, v7

    :goto_5
    if-eqz v1, :cond_12

    .line 155
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 277
    :cond_12
    throw v0

    :catchall_2
    move-exception v0

    move-object v1, v6

    goto :goto_5

    .line 170
    :catchall_3
    move-exception v0

    goto :goto_4

    .line 70
    :catch_1
    move-exception v0

    goto :goto_3
.end method

.method public b(Ljava/lang/String;)I
    .locals 1
    .parameter

    .prologue
    .line 136
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->b(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b()Lcom/whatsapp/ar;
    .locals 2

    .prologue
    .line 31
    sget-object v0, Lcom/whatsapp/qp;->c:Lcom/whatsapp/ar;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whatsapp/qp;->c:Lcom/whatsapp/ar;

    iget-object v0, v0, Lcom/whatsapp/ar;->b:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 229
    :cond_0
    new-instance v0, Lcom/whatsapp/ar;

    invoke-direct {v0}, Lcom/whatsapp/ar;-><init>()V

    sput-object v0, Lcom/whatsapp/qp;->c:Lcom/whatsapp/ar;

    .line 220
    :cond_1
    sget-object v0, Lcom/whatsapp/qp;->c:Lcom/whatsapp/ar;

    return-object v0
.end method

.method public b(Lcom/whatsapp/zq;)V
    .locals 2
    .parameter

    .prologue
    .line 188
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    new-instance v1, Lcom/whatsapp/sp;

    invoke-direct {v1, p0, p1}, Lcom/whatsapp/sp;-><init>(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/qp;->b(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z

    .line 234
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v4, 0x0

    .line 18
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, v4}, Lcom/whatsapp/xq;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 39
    if-nez v0, :cond_0

    .line 86
    new-instance v0, Lcom/whatsapp/zq;

    invoke-direct {v0, p1}, Lcom/whatsapp/zq;-><init>(Ljava/lang/String;)V

    .line 148
    sget-object v1, Lcom/whatsapp/App;->y:Lcom/whatsapp/yy;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Lcom/whatsapp/yy;->a(Ljava/lang/String;J)V

    .line 276
    iget-object v1, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v1, v0, v4}, Lcom/whatsapp/xq;->b(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 83
    :cond_0
    iput-object p3, v0, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 199
    iput-object p4, v0, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    .line 153
    iput-object p2, v0, Lcom/whatsapp/zq;->m:Ljava/lang/String;

    .line 23
    iget-object v1, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v1, v0}, Lcom/whatsapp/xq;->b(Lcom/whatsapp/zq;)V

    .line 116
    return-void
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/util/Pair",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/zq;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 145
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->c(Ljava/util/ArrayList;)V

    .line 215
    return-void
.end method

.method public b(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 1
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;",
            "Landroid/database/sqlite/SQLiteTransactionListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 13
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->d(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 60
    return-void
.end method

.method public b(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Lcom/whatsapp/uq;",
            "Lcom/whatsapp/zq;",
            ">;",
            "Landroid/database/sqlite/SQLiteTransactionListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 117
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/xq;->a(Ljava/util/HashMap;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 112
    return-void
.end method

.method public b(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z
    .locals 10
    .parameter
    .parameter

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v1, 0x0

    const/4 v9, 0x1

    sget v7, Lcom/whatsapp/yq;->e:I

    .line 118
    new-array v2, v5, [Ljava/lang/String;

    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    aget-object v0, v0, v9

    aput-object v0, v2, v1

    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    aput-object v0, v2, v9

    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    aget-object v0, v0, v5

    aput-object v0, v2, v3

    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    aput-object v0, v2, v4

    .line 71
    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    .line 30
    const/4 v6, 0x0

    .line 204
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sget-object v3, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v4, 0xa

    aget-object v3, v3, v4

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {p1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 24
    if-eqz v1, :cond_3

    .line 143
    :cond_0
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 113
    const/4 v0, 0x3

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 247
    new-instance v2, Lcom/whatsapp/uq;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    iput-object v2, p1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    .line 252
    const/4 v2, 0x1

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p1, Lcom/whatsapp/zq;->i:Ljava/lang/Integer;

    .line 205
    const/4 v2, 0x2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lcom/whatsapp/zq;->j:Ljava/lang/String;

    .line 174
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 67
    iput-object v0, p1, Lcom/whatsapp/zq;->h:Ljava/lang/String;

    .line 37
    :cond_1
    iget-object v0, p1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v0, v0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v0, v0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 138
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/tp;->a:Z

    .line 149
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->d(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z

    .line 127
    new-instance v0, Lcom/whatsapp/b9;

    invoke-direct {v0, p0, p1}, Lcom/whatsapp/b9;-><init>(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V

    invoke-virtual {v0}, Lcom/whatsapp/b9;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 14
    :cond_2
    if-eqz v7, :cond_0

    .line 182
    :cond_3
    if-eqz v1, :cond_4

    .line 51
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 189
    :cond_4
    return v9

    .line 123
    :catch_0
    move-exception v0

    move-object v1, v6

    .line 25
    :goto_1
    :try_start_2
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 182
    if-eqz v1, :cond_4

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v6

    :goto_2
    if-eqz v1, :cond_5

    .line 51
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 182
    :cond_5
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 123
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public c(Ljava/lang/String;)Lcom/whatsapp/zq;
    .locals 2
    .parameter

    .prologue
    .line 168
    sget-object v0, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/zq;

    .line 28
    if-eqz v0, :cond_0

    .line 9
    :goto_0
    return-object v0

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/xq;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    goto :goto_0
.end method

.method public c()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 87
    sget-object v1, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 104
    iget-object v1, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/whatsapp/xq;->b(Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 210
    sget-object v1, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    monitor-enter v1

    .line 52
    :try_start_0
    sget-object v2, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 248
    monitor-exit v1

    .line 147
    return-object v0

    .line 248
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c(Lcom/whatsapp/zq;)V
    .locals 1
    .parameter

    .prologue
    .line 180
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->b(Lcom/whatsapp/zq;)V

    .line 224
    return-void
.end method

.method public c(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 90
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->c(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 226
    return-void
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 256
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->a(Ljava/util/ArrayList;)V

    .line 84
    return-void
.end method

.method public c(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 1
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;",
            "Landroid/database/sqlite/SQLiteTransactionListener;",
            ")V"
        }
    .end annotation

    .prologue
    .line 232
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->e(Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 196
    return-void
.end method

.method public d()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 269
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/xq;->c(Landroid/database/sqlite/SQLiteTransactionListener;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x1

    .line 132
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->f(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 259
    iget v0, p1, Lcom/whatsapp/zq;->a:I

    if-ne v0, v1, :cond_0

    .line 146
    sget-object v0, Lcom/whatsapp/App;->Ib:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 142
    :cond_0
    return-void
.end method

.method public d(Ljava/util/ArrayList;)V
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 157
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->b(Ljava/util/ArrayList;)V

    .line 103
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 8
    .parameter

    .prologue
    const/4 v5, 0x4

    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v1, 0x0

    const/4 v7, 0x1

    .line 144
    new-array v2, v5, [Ljava/lang/String;

    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    aget-object v0, v0, v7

    aput-object v0, v2, v1

    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    aput-object v0, v2, v7

    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    aget-object v0, v0, v5

    aput-object v0, v2, v3

    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    aput-object v0, v2, v4

    .line 20
    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    .line 126
    const/4 v6, 0x0

    .line 92
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    sget-object v3, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v4, 0xa

    aget-object v3, v3, v4

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 124
    if-eqz v1, :cond_2

    .line 139
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 183
    const/4 v0, 0x3

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 228
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    move-object v0, p1

    .line 251
    :cond_1
    new-instance v2, Lcom/whatsapp/uq;

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-static {p1}, Landroid/telephony/PhoneNumberUtils;->stripSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lcom/whatsapp/uq;-><init>(JLjava/lang/String;)V

    .line 218
    new-instance v3, Lcom/whatsapp/zq;

    const/4 v4, 0x1

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const/4 v5, 0x2

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v2, v0, v4, v5}, Lcom/whatsapp/zq;-><init>(Lcom/whatsapp/uq;Ljava/lang/String;ILjava/lang/String;)V

    .line 62
    iget-object v0, v3, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v0, v0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, v3, Lcom/whatsapp/zq;->g:Lcom/whatsapp/uq;

    iget-object v0, v0, Lcom/whatsapp/uq;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 19
    const/4 v0, 0x1

    sput-boolean v0, Lcom/whatsapp/tp;->a:Z

    .line 272
    new-instance v0, Lcom/whatsapp/a9;

    invoke-direct {v0, p0, v3}, Lcom/whatsapp/a9;-><init>(Lcom/whatsapp/qp;Lcom/whatsapp/zq;)V

    invoke-virtual {v0}, Lcom/whatsapp/a9;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 242
    :cond_2
    if-eqz v1, :cond_3

    .line 274
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 48
    :cond_3
    return v7

    .line 213
    :catch_0
    move-exception v0

    move-object v1, v6

    .line 44
    :goto_1
    :try_start_2
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 242
    if-eqz v1, :cond_3

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v6

    :goto_2
    if-eqz v1, :cond_4

    .line 274
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 242
    :cond_4
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 213
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public e()I
    .locals 9

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x0

    sget v8, Lcom/whatsapp/yq;->e:I

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 59
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v1, 0x15

    aget-object v0, v0, v1

    aput-object v0, v2, v6

    .line 135
    :try_start_0
    sget-object v0, Lcom/whatsapp/App;->ib:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 79
    if-eqz v1, :cond_5

    move v0, v6

    .line 141
    :cond_0
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 262
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v2

    add-int/2addr v0, v2

    if-eqz v8, :cond_0

    .line 194
    :cond_1
    if-eqz v1, :cond_2

    .line 76
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 125
    :cond_2
    :goto_0
    return v0

    .line 34
    :catch_0
    move-exception v0

    move-object v1, v7

    .line 46
    :goto_1
    :try_start_2
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 194
    if-eqz v1, :cond_3

    .line 76
    :goto_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    move v0, v6

    .line 111
    goto :goto_0

    .line 194
    :catchall_0
    move-exception v0

    move-object v1, v7

    :goto_3
    if-eqz v1, :cond_4

    .line 76
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 194
    :cond_4
    throw v0

    :cond_5
    if-eqz v1, :cond_3

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    .line 34
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public e(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 115
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 130
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->g(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 6
    return-void
.end method

.method public f()I
    .locals 4

    .prologue
    .line 173
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0}, Lcom/whatsapp/xq;->a()I

    move-result v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 21
    return v0
.end method

.method public f(Lcom/whatsapp/zq;)Ljava/util/ArrayList;
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whatsapp/zq;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->c(Lcom/whatsapp/zq;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 68
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/xq;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public f(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 89
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->e(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)Z

    .line 106
    return-void
.end method

.method public g(Lcom/whatsapp/zq;)Landroid/content/Intent;
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x0

    .line 192
    invoke-virtual {p1}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/v4;->b(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 217
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v2}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/whatsapp/Conversation;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 165
    const/high16 v2, 0x1000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 191
    const/high16 v2, 0x400

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 235
    sget-object v2, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    iget-object v3, p1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 134
    sget-object v2, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v3, 0x14

    aget-object v2, v2, v3

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 249
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 65
    sget-object v3, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v4, 0x12

    aget-object v3, v3, v4

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 97
    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v3, 0xe

    aget-object v1, v1, v3

    invoke-virtual {v2, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 102
    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v3, 0x11

    aget-object v1, v1, v3

    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 129
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a0006

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->L:F

    invoke-virtual {p1, v0, v1, v5}, Lcom/whatsapp/zq;->a(IFZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 154
    if-nez v0, :cond_0

    .line 278
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whatsapp/zq;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 109
    :cond_0
    sget-object v1, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v3, 0x13

    aget-object v1, v1, v3

    invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 176
    sget-object v0, Lcom/whatsapp/qp;->z:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 66
    return-object v2
.end method

.method public g(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 26
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/xq;->h(Lcom/whatsapp/zq;Landroid/database/sqlite/SQLiteTransactionListener;)V

    .line 38
    return-void
.end method

.method public g()Z
    .locals 2

    .prologue
    .line 245
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/xq;->d(Landroid/database/sqlite/SQLiteTransactionListener;)Z

    move-result v0

    .line 266
    return v0
.end method

.method public h()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 77
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0}, Lcom/whatsapp/xq;->b()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public h(Lcom/whatsapp/zq;)V
    .locals 2
    .parameter

    .prologue
    .line 175
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v0}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/whatsapp/qp;->g(Lcom/whatsapp/zq;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 156
    return-void
.end method

.method public i()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/whatsapp/zq;",
            ">;"
        }
    .end annotation

    .prologue
    .line 209
    iget-object v0, p0, Lcom/whatsapp/qp;->b:Lcom/whatsapp/xq;

    invoke-virtual {v0}, Lcom/whatsapp/xq;->d()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public j()V
    .locals 1

    .prologue
    .line 107
    sget-object v0, Lcom/whatsapp/qp;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 236
    return-void
.end method
