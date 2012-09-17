.class Lcom/whatsapp/ue;
.super Landroid/widget/CursorAdapter;
.source "ue.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:Ljava/lang/Object;

.field private b:I

.field final c:Lcom/whatsapp/Conversation;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x41

    const/16 v2, 0x2a

    const/16 v1, 0xb

    const/4 v3, 0x5

    const/4 v6, 0x0

    const/16 v0, 0xe

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "o_\u0019h8+G\u0007b`"

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

    const-string v0, "hE\u001as$yY\u0015q(dD\u0015a {^\u0011wnlO\u0000l5nG[u.xC\u0000l.e\u0005\u001dk7jF\u001daa"

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

    const-string v0, "\"\nTv(qON"

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

    const-string v0, "+\u0002"

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

    const-string v0, "\u007fB\u0011kagE\u0015aamX\u001bha\u007fE\u0004%{"

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

    const-string v0, "gE\u0015aamX\u001bhafC\u0010a-n\u0010"

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

    aput-object v0, v9, v3

    const/4 v10, 0x6

    const-string v0, "hE\u0018i {Y\u0011Z,nY\u0007d&n\u0005\u0004w$}\u0005\u0019l2xC\u001ablyG\u0000(2yIN"

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

    const-string v0, "hE\u0018i {Y\u0011Z,nY\u0007d&n\u0005\u001a`9\u007f\u0005\u0019l2xC\u001ablyG\u0000(2yIN"

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

    const-string v0, "+VT"

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

    const-string v0, "H_\u0006v.yc\u001aa$se\u0001q\u000emh\u001bp/oY1}\"nZ\u0000l.e\u0010"

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

    const-string v0, "hE\u001as$yY\u0015q(dD[b$\u007f\\\u001d`6$X\u001brabYTk4gFU%,xMI"

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

    const-string v0, "gK\rj4\u007fu\u001dk\'gK\u0000`3"

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

    aput-object v0, v9, v1

    const/16 v10, 0xc

    const-string v0, "hE\u001as$yY\u0015q(dD[d%a_\u0007q\"jI\u001c`njZ\u0004`/oO\u0010"

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

    const-string v0, "hE\u001as$yY\u0015q(dD\u0015a {^\u0011wneO\u0003%1jX\u0015habYTk4gFU"

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

    sput-object v9, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

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
    move v0, v1

    goto :goto_e

    :pswitch_1
    move v0, v2

    goto :goto_e

    :pswitch_2
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_f

    :pswitch_5
    move v0, v2

    goto :goto_f

    :pswitch_6
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_10

    :pswitch_9
    move v0, v2

    goto :goto_10

    :pswitch_a
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_11

    :pswitch_d
    move v0, v2

    goto :goto_11

    :pswitch_e
    const/16 v0, 0x74

    goto :goto_11

    :pswitch_f
    move v0, v3

    goto :goto_11

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_12

    :pswitch_11
    move v0, v2

    goto :goto_12

    :pswitch_12
    const/16 v0, 0x74

    goto :goto_12

    :pswitch_13
    move v0, v3

    goto :goto_12

    :cond_5
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_13
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_13

    :pswitch_15
    move v0, v2

    goto :goto_13

    :pswitch_16
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_14

    :pswitch_19
    move v0, v2

    goto :goto_14

    :pswitch_1a
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_15

    :pswitch_1d
    move v0, v2

    goto :goto_15

    :pswitch_1e
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_16

    :pswitch_21
    move v0, v2

    goto :goto_16

    :pswitch_22
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_17

    :pswitch_25
    move v0, v2

    goto :goto_17

    :pswitch_26
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_18

    :pswitch_29
    move v0, v2

    goto :goto_18

    :pswitch_2a
    const/16 v0, 0x74

    goto :goto_18

    :pswitch_2b
    move v0, v3

    goto :goto_18

    :cond_b
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_b

    move v0, v4

    :goto_19
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_b

    :pswitch_2c
    move v0, v1

    goto :goto_19

    :pswitch_2d
    move v0, v2

    goto :goto_19

    :pswitch_2e
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_1a

    :pswitch_31
    move v0, v2

    goto :goto_1a

    :pswitch_32
    const/16 v0, 0x74

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
    move v0, v1

    goto :goto_1b

    :pswitch_35
    move v0, v2

    goto :goto_1b

    :pswitch_36
    const/16 v0, 0x74

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

.method public constructor <init>(Lcom/whatsapp/Conversation;Landroid/content/Context;Landroid/database/Cursor;Z)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 142
    iput-object p1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    .line 111
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V

    .line 170
    return-void
.end method

.method private a()I
    .locals 2

    .prologue
    .line 276
    invoke-virtual {p0}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method private a(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I
    .locals 6
    .parameter
    .parameter
    .parameter

    .prologue
    .line 97
    const/4 v0, 0x0

    .line 19
    new-instance v2, Landroid/text/TextPaint;

    invoke-direct {v2}, Landroid/text/TextPaint;-><init>()V

    .line 146
    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-virtual {v1}, Lcom/whatsapp/Conversation;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0a001a

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v2, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 182
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-virtual {v3}, Lcom/whatsapp/Conversation;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    iget-wide v4, p1, Lcom/whatsapp/sz;->i:J

    invoke-static {v3, v4, v5}, Lcom/whatsapp/t4;->b(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-direct {p0, v1, v2}, Lcom/whatsapp/ue;->a(Ljava/lang/String;Landroid/text/TextPaint;)I

    move-result v1

    add-int/2addr v0, v1

    .line 133
    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-virtual {v1}, Lcom/whatsapp/Conversation;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0a0019

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v2, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 75
    invoke-virtual {p1}, Lcom/whatsapp/sz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, v2}, Lcom/whatsapp/ue;->a(Ljava/lang/String;Landroid/text/TextPaint;)I

    move-result v1

    add-int/2addr v1, v0

    .line 73
    if-eqz p2, :cond_1

    .line 259
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-virtual {v0}, Lcom/whatsapp/Conversation;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f0a001b

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    invoke-virtual {v2, v0}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 187
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v3, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/zq;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Lcom/whatsapp/ue;->a(Ljava/lang/String;Landroid/text/TextPaint;)I

    move-result v0

    .line 42
    int-to-float v2, v0

    iget-object v3, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v3}, Lcom/whatsapp/Conversation;->m(Lcom/whatsapp/Conversation;)Lcom/whatsapp/j4;

    move-result-object v3

    iget v3, v3, Lcom/whatsapp/j4;->R:F

    add-float/2addr v2, v3

    iput v2, p3, Lcom/whatsapp/dj;->c:F

    .line 32
    if-le v0, v1, :cond_0

    .line 98
    :goto_0
    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->m(Lcom/whatsapp/Conversation;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->W:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    move v0, v1

    .line 32
    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method static a(Lcom/whatsapp/ue;)I
    .locals 1
    .parameter

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/whatsapp/ue;->a()I

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;Landroid/text/TextPaint;)I
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 148
    if-nez p1, :cond_0

    .line 168
    :goto_0
    return v0

    .line 184
    :cond_0
    const/4 v1, 0x0

    .line 209
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    new-array v3, v3, [F

    .line 124
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p2, p1, v0, v4, v3}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/String;II[F)I

    .line 103
    :cond_1
    array-length v4, v3

    if-ge v0, v4, :cond_2

    .line 65
    aget v4, v3, v0

    add-float/2addr v1, v4

    .line 228
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_1

    .line 168
    :cond_2
    float-to-int v0, v1

    goto :goto_0
.end method

.method private a(I)V
    .locals 5
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 15
    invoke-virtual {p0}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v3

    .line 218
    if-ge p1, v3, :cond_2

    move v1, p1

    .line 229
    :goto_0
    if-ge v1, v3, :cond_1

    .line 86
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->f(Lcom/whatsapp/Conversation;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 223
    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->f(Lcom/whatsapp/Conversation;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    :cond_0
    add-int/lit8 v0, v1, 0x1

    if-eqz v2, :cond_4

    .line 236
    :cond_1
    if-eqz v2, :cond_3

    .line 21
    :cond_2
    sget-object v0, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 115
    sub-int v0, p1, v3

    .line 258
    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->e(Lcom/whatsapp/Conversation;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 227
    :cond_3
    return-void

    :cond_4
    move v1, v0

    goto :goto_0
.end method

.method private a(Lcom/whatsapp/dj;IZ)V
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 122
    :goto_0
    if-eqz p1, :cond_0

    .line 188
    invoke-virtual {p1, p2}, Lcom/whatsapp/dj;->a(I)V

    .line 230
    if-eqz p3, :cond_1

    iget-object v0, p1, Lcom/whatsapp/dj;->e:Lcom/whatsapp/dj;

    :goto_1
    if-eqz v1, :cond_2

    .line 208
    :cond_0
    return-void

    .line 230
    :cond_1
    iget-object v0, p1, Lcom/whatsapp/dj;->f:Lcom/whatsapp/dj;

    goto :goto_1

    :cond_2
    move-object p1, v0

    goto :goto_0
.end method

.method static a(Lcom/whatsapp/ue;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 237
    invoke-direct {p0, p1}, Lcom/whatsapp/ue;->a(I)V

    return-void
.end method

.method private a(Lcom/whatsapp/ze;ILcom/whatsapp/sz;Lcom/whatsapp/sz;Lcom/whatsapp/sz;Z)V
    .locals 18
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget-boolean v10, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 104
    const/4 v1, 0x0

    .line 157
    const/4 v2, 0x0

    .line 275
    if-eqz p4, :cond_1

    move-object/from16 v0, p4

    iget-byte v3, v0, Lcom/whatsapp/sz;->l:B

    if-nez v3, :cond_1

    move-object/from16 v0, p4

    iget-object v3, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v3, v3, Lcom/whatsapp/uz;->b:Z

    if-nez v3, :cond_1

    if-eqz p6, :cond_1

    .line 181
    move-object/from16 v0, p4

    iget-object v3, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 123
    move-object/from16 v0, p4

    iget-object v3, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    move-object/from16 v0, p3

    iget-object v4, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 178
    const/4 v1, 0x1

    if-eqz v10, :cond_1

    .line 251
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/4 v5, 0x6

    aget-object v4, v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static/range {p4 .. p4}, Lcom/whatsapp/g5;->a(Lcom/whatsapp/sz;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    :cond_1
    move v3, v1

    .line 41
    if-eqz p5, :cond_11

    move-object/from16 v0, p5

    iget-wide v4, v0, Lcom/whatsapp/sz;->i:J

    move-object/from16 v0, p3

    iget-wide v6, v0, Lcom/whatsapp/sz;->i:J

    invoke-static {v4, v5, v6, v7}, Lcom/whatsapp/t4;->b(JJ)Z

    move-result v1

    .line 141
    :goto_0
    if-eqz p5, :cond_2e

    move-object/from16 v0, p5

    iget-byte v4, v0, Lcom/whatsapp/sz;->l:B

    if-nez v4, :cond_2e

    move-object/from16 v0, p5

    iget-object v4, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v4, v4, Lcom/whatsapp/uz;->b:Z

    if-nez v4, :cond_2e

    if-eqz v1, :cond_2e

    .line 22
    move-object/from16 v0, p5

    iget-object v1, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v1, :cond_2f

    .line 112
    move-object/from16 v0, p5

    iget-object v1, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    move-object/from16 v0, p3

    iget-object v4, v0, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2e

    .line 43
    const/4 v1, 0x1

    if-eqz v10, :cond_2

    .line 1
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/4 v5, 0x7

    aget-object v4, v4, v5

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p5 .. p5}, Lcom/whatsapp/g5;->a(Lcom/whatsapp/sz;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    :cond_2
    move v7, v1

    .line 239
    :goto_2
    if-eqz v3, :cond_2d

    if-eqz v7, :cond_2d

    .line 252
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/4 v4, 0x5

    aget-object v2, v2, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v0, p2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 194
    add-int/lit8 v4, p2, -0x1

    move-object/from16 v2, p4

    move-object/from16 v5, p3

    move v1, v4

    move v4, v3

    move-object/from16 v3, p5

    .line 60
    :goto_3
    if-eqz v4, :cond_2c

    .line 31
    if-ltz v1, :cond_2b

    .line 3
    add-int/lit8 v3, v1, -0x1

    :try_start_0
    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/whatsapp/ue;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/sz;
    :try_end_0
    .catch Landroid/database/CursorIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_4
    move v4, v3

    move-object v3, v1

    .line 91
    :goto_5
    if-eqz v3, :cond_12

    iget-wide v8, v3, Lcom/whatsapp/sz;->i:J

    iget-wide v11, v2, Lcom/whatsapp/sz;->i:J

    invoke-static {v8, v9, v11, v12}, Lcom/whatsapp/t4;->b(JJ)Z

    move-result v1

    .line 10
    :goto_6
    if-eqz v3, :cond_3

    iget-byte v6, v3, Lcom/whatsapp/sz;->l:B

    if-nez v6, :cond_3

    iget-object v6, v3, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v6, v6, Lcom/whatsapp/uz;->b:Z

    if-nez v6, :cond_3

    if-eqz v1, :cond_3

    iget-object v1, v3, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    iget-object v6, v2, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 62
    const/4 v1, 0x1

    if-eqz v10, :cond_29

    .line 77
    :cond_3
    const/4 v1, 0x0

    if-eqz v10, :cond_29

    move/from16 v16, v1

    move-object v1, v5

    move-object v5, v2

    move/from16 v2, v16

    .line 186
    :goto_7
    add-int/lit8 v8, v4, 0x1

    .line 63
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/4 v9, 0x4

    aget-object v6, v6, v9

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 160
    new-instance v11, Lcom/whatsapp/dj;

    const/4 v4, 0x1

    invoke-direct {v11, v4, v5}, Lcom/whatsapp/dj;-><init>(ILcom/whatsapp/sz;)V

    .line 254
    const/4 v4, 0x1

    move-object/from16 v0, p0

    invoke-direct {v0, v5, v4, v11}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I

    move-result v4

    .line 165
    new-instance v6, Lcom/whatsapp/dj;

    const/4 v9, 0x1

    invoke-direct {v6, v11, v9, v1}, Lcom/whatsapp/dj;-><init>(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V

    iput-object v6, v11, Lcom/whatsapp/dj;->f:Lcom/whatsapp/dj;

    .line 154
    sget-object v9, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v12, v5, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v9, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    const/4 v9, 0x0

    .line 113
    add-int/lit8 v8, v8, 0x1

    move/from16 v16, v4

    move-object v4, v5

    move/from16 v5, v16

    move-object/from16 v17, v1

    move v1, v8

    move-object/from16 v8, v17

    .line 200
    :goto_8
    if-eqz v7, :cond_25

    .line 233
    if-nez v8, :cond_4

    .line 49
    if-eqz v10, :cond_25

    .line 271
    :cond_4
    const/4 v4, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, p0

    invoke-direct {v0, v8, v4, v12}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I

    move-result v4

    .line 87
    if-eqz v9, :cond_24

    .line 216
    new-instance v6, Lcom/whatsapp/dj;

    const/4 v12, 0x1

    invoke-direct {v6, v9, v12, v8}, Lcom/whatsapp/dj;-><init>(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V

    .line 126
    iput-object v6, v9, Lcom/whatsapp/dj;->f:Lcom/whatsapp/dj;

    move-object v9, v6

    .line 24
    :goto_9
    if-le v4, v5, :cond_13

    move v6, v4

    .line 215
    :goto_a
    sget-object v4, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v5, v8, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v4, v5, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    const/4 v4, 0x0

    .line 20
    if-ltz v1, :cond_28

    .line 56
    add-int/lit8 v5, v1, 0x1

    :try_start_1
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Lcom/whatsapp/ue;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/sz;
    :try_end_1
    .catch Landroid/database/CursorIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    move v4, v5

    :goto_b
    move-object v5, v1

    move v7, v4

    .line 163
    :goto_c
    if-eqz v5, :cond_14

    iget-wide v12, v5, Lcom/whatsapp/sz;->i:J

    iget-wide v14, v8, Lcom/whatsapp/sz;->i:J

    invoke-static {v12, v13, v14, v15}, Lcom/whatsapp/t4;->b(JJ)Z

    move-result v1

    .line 274
    :goto_d
    if-eqz v5, :cond_5

    iget-byte v4, v5, Lcom/whatsapp/sz;->l:B

    if-nez v4, :cond_5

    iget-object v4, v5, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v4, v4, Lcom/whatsapp/uz;->b:Z

    if-nez v4, :cond_5

    if-eqz v1, :cond_5

    iget-object v1, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    iget-object v4, v8, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 108
    const/4 v4, 0x1

    if-eqz v10, :cond_6

    .line 84
    :cond_5
    const/4 v4, 0x0

    .line 136
    :cond_6
    if-eqz v4, :cond_15

    const/4 v1, 0x2

    :goto_e
    iput v1, v9, Lcom/whatsapp/dj;->a:I

    .line 231
    if-eqz v10, :cond_26

    move v1, v4

    move-object v4, v5

    move v5, v6

    move v6, v7

    .line 257
    :goto_f
    const/4 v7, 0x2

    move-object/from16 v0, p1

    iput v7, v0, Lcom/whatsapp/ze;->m:I

    .line 206
    invoke-virtual/range {p1 .. p1}, Lcom/whatsapp/ze;->f()V

    .line 93
    const/4 v7, 0x0

    move-object/from16 v0, p0

    invoke-direct {v0, v11, v5, v7}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/dj;IZ)V

    .line 174
    if-eqz v10, :cond_10

    move v7, v1

    move v1, v2

    move-object v2, v8

    move-object v8, v4

    move v4, v6

    move-object v6, v3

    :goto_10
    if-eqz v1, :cond_a

    if-nez v7, :cond_a

    .line 47
    new-instance v11, Lcom/whatsapp/dj;

    const/4 v3, 0x3

    invoke-direct {v11, v3, v2}, Lcom/whatsapp/dj;-><init>(ILcom/whatsapp/sz;)V

    .line 156
    const/4 v3, 0x1

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3, v11}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I

    move-result v5

    .line 40
    new-instance v3, Lcom/whatsapp/dj;

    const/4 v9, 0x0

    invoke-direct {v3, v11, v9, v6}, Lcom/whatsapp/dj;-><init>(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V

    iput-object v3, v11, Lcom/whatsapp/dj;->e:Lcom/whatsapp/dj;

    .line 189
    sget-object v9, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v12, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v9, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    const/4 v9, 0x0

    .line 119
    add-int/lit8 v4, v4, -0x1

    move-object/from16 v16, v3

    move v3, v5

    move v5, v1

    move v1, v4

    move-object/from16 v4, v16

    .line 135
    :goto_11
    if-eqz v5, :cond_20

    .line 205
    if-nez v6, :cond_7

    .line 247
    if-eqz v10, :cond_20

    .line 144
    :cond_7
    const/4 v2, 0x0

    const/4 v12, 0x0

    move-object/from16 v0, p0

    invoke-direct {v0, v6, v2, v12}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I

    move-result v2

    .line 212
    if-eqz v9, :cond_1f

    .line 172
    new-instance v4, Lcom/whatsapp/dj;

    const/4 v12, 0x0

    invoke-direct {v4, v9, v12, v6}, Lcom/whatsapp/dj;-><init>(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V

    .line 266
    iput-object v4, v9, Lcom/whatsapp/dj;->e:Lcom/whatsapp/dj;

    move-object v9, v4

    .line 198
    :goto_12
    if-le v2, v3, :cond_16

    move v4, v2

    .line 180
    :goto_13
    sget-object v2, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v3, v6, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v2, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    const/4 v2, 0x0

    .line 273
    if-ltz v1, :cond_23

    .line 185
    add-int/lit8 v3, v1, -0x1

    :try_start_2
    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/whatsapp/ue;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/sz;
    :try_end_2
    .catch Landroid/database/CursorIndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_2

    move v2, v3

    :goto_14
    move-object v5, v1

    move v3, v2

    .line 106
    :goto_15
    if-eqz v5, :cond_17

    iget-wide v1, v5, Lcom/whatsapp/sz;->i:J

    iget-wide v12, v6, Lcom/whatsapp/sz;->i:J

    invoke-static {v1, v2, v12, v13}, Lcom/whatsapp/t4;->b(JJ)Z

    move-result v1

    .line 120
    :goto_16
    if-eqz v5, :cond_8

    iget-byte v2, v5, Lcom/whatsapp/sz;->l:B

    if-nez v2, :cond_8

    iget-object v2, v5, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v2, v2, Lcom/whatsapp/uz;->b:Z

    if-nez v2, :cond_8

    if-eqz v1, :cond_8

    iget-object v1, v5, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    iget-object v2, v6, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 199
    const/4 v2, 0x1

    if-eqz v10, :cond_9

    .line 256
    :cond_8
    const/4 v2, 0x0

    .line 131
    :cond_9
    if-eqz v2, :cond_18

    const/4 v1, 0x2

    :goto_17
    iput v1, v9, Lcom/whatsapp/dj;->a:I

    .line 217
    if-eqz v10, :cond_21

    move v1, v2

    move-object v2, v6

    move/from16 v16, v4

    move v4, v3

    move/from16 v3, v16

    .line 110
    :goto_18
    const/4 v5, 0x3

    move-object/from16 v0, p1

    iput v5, v0, Lcom/whatsapp/ze;->m:I

    .line 226
    invoke-virtual/range {p1 .. p1}, Lcom/whatsapp/ze;->f()V

    .line 7
    const/4 v5, 0x1

    move-object/from16 v0, p0

    invoke-direct {v0, v11, v3, v5}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/dj;IZ)V

    .line 25
    if-eqz v10, :cond_10

    :cond_a
    move v6, v4

    if-nez v1, :cond_10

    if-eqz v7, :cond_10

    .line 139
    new-instance v9, Lcom/whatsapp/dj;

    const/4 v1, 0x1

    invoke-direct {v9, v1, v2}, Lcom/whatsapp/dj;-><init>(ILcom/whatsapp/sz;)V

    .line 221
    const/4 v1, 0x1

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v1, v9}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I

    move-result v3

    .line 147
    new-instance v4, Lcom/whatsapp/dj;

    const/4 v1, 0x1

    invoke-direct {v4, v9, v1, v8}, Lcom/whatsapp/dj;-><init>(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V

    iput-object v4, v9, Lcom/whatsapp/dj;->f:Lcom/whatsapp/dj;

    .line 69
    sget-object v1, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v2, v2, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    const/4 v5, 0x0

    .line 46
    add-int/lit8 v1, v6, 0x1

    move v2, v7

    move-object v6, v8

    .line 82
    :goto_19
    if-eqz v2, :cond_f

    .line 38
    if-nez v6, :cond_b

    .line 101
    if-eqz v10, :cond_f

    .line 128
    :cond_b
    const/4 v2, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    invoke-direct {v0, v6, v2, v7}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/sz;ZLcom/whatsapp/dj;)I

    move-result v2

    .line 164
    if-eqz v5, :cond_1c

    .line 235
    new-instance v4, Lcom/whatsapp/dj;

    const/4 v7, 0x1

    invoke-direct {v4, v5, v7, v6}, Lcom/whatsapp/dj;-><init>(Lcom/whatsapp/dj;ZLcom/whatsapp/sz;)V

    .line 27
    iput-object v4, v5, Lcom/whatsapp/dj;->f:Lcom/whatsapp/dj;

    move-object v5, v4

    .line 59
    :goto_1a
    if-le v2, v3, :cond_19

    move v4, v2

    .line 213
    :goto_1b
    sget-object v2, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v3, v6, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    const/4 v2, 0x0

    .line 51
    if-ltz v1, :cond_1e

    .line 2
    add-int/lit8 v3, v1, 0x1

    :try_start_3
    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/whatsapp/ue;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/sz;
    :try_end_3
    .catch Landroid/database/CursorIndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3

    move v2, v3

    :goto_1c
    move-object v3, v1

    move v7, v2

    .line 242
    :goto_1d
    if-eqz v3, :cond_1a

    iget-wide v1, v3, Lcom/whatsapp/sz;->i:J

    iget-wide v11, v6, Lcom/whatsapp/sz;->i:J

    invoke-static {v1, v2, v11, v12}, Lcom/whatsapp/t4;->b(JJ)Z

    move-result v1

    .line 177
    :goto_1e
    if-eqz v3, :cond_c

    iget-byte v2, v3, Lcom/whatsapp/sz;->l:B

    if-nez v2, :cond_c

    iget-object v2, v3, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v2, v2, Lcom/whatsapp/uz;->b:Z

    if-nez v2, :cond_c

    if-eqz v1, :cond_c

    iget-object v1, v3, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    iget-object v2, v6, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 83
    const/4 v2, 0x1

    if-eqz v10, :cond_d

    .line 197
    :cond_c
    const/4 v2, 0x0

    .line 8
    :cond_d
    if-eqz v2, :cond_1b

    const/4 v1, 0x2

    :goto_1f
    iput v1, v5, Lcom/whatsapp/dj;->a:I

    .line 9
    if-eqz v10, :cond_1d

    :cond_e
    move v3, v4

    .line 241
    :cond_f
    const/4 v1, 0x1

    move-object/from16 v0, p1

    iput v1, v0, Lcom/whatsapp/ze;->m:I

    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/whatsapp/ze;->f()V

    .line 64
    const/4 v1, 0x0

    move-object/from16 v0, p0

    invoke-direct {v0, v9, v3, v1}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/dj;IZ)V

    .line 96
    :cond_10
    return-void

    .line 41
    :cond_11
    const/4 v1, 0x0

    goto/16 :goto_0

    .line 250
    :catch_0
    move-exception v1

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v8, 0x9

    aget-object v6, v6, v8

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v6, v6, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    invoke-virtual {v6}, Lcom/whatsapp/ue;->getCount()I

    move-result v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v6, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v8, 0x8

    aget-object v6, v6, v8

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 45
    if-eqz v10, :cond_2a

    move v4, v3

    move-object v3, v2

    goto/16 :goto_5

    .line 91
    :cond_12
    const/4 v1, 0x0

    goto/16 :goto_6

    :cond_13
    move v6, v5

    .line 24
    goto/16 :goto_a

    .line 243
    :catch_1
    move-exception v1

    .line 245
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v13, 0x9

    aget-object v12, v12, v13

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v12, v12, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    invoke-virtual {v12}, Lcom/whatsapp/ue;->getCount()I

    move-result v12

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v12, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v13, 0x8

    aget-object v12, v12, v13

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 81
    const/4 v1, 0x3

    iput v1, v9, Lcom/whatsapp/dj;->a:I

    .line 272
    if-eqz v10, :cond_27

    move v7, v5

    move-object v5, v4

    goto/16 :goto_c

    .line 163
    :cond_14
    const/4 v1, 0x0

    goto/16 :goto_d

    .line 136
    :cond_15
    const/4 v1, 0x3

    goto/16 :goto_e

    :cond_16
    move v4, v3

    .line 198
    goto/16 :goto_13

    .line 12
    :catch_2
    move-exception v1

    .line 270
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v13, 0x9

    aget-object v12, v12, v13

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v12, v12, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    invoke-virtual {v12}, Lcom/whatsapp/ue;->getCount()I

    move-result v12

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v12, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v13, 0x8

    aget-object v12, v12, v13

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 34
    const/4 v1, 0x1

    iput v1, v9, Lcom/whatsapp/dj;->a:I

    .line 278
    if-eqz v10, :cond_22

    move-object v5, v2

    goto/16 :goto_15

    .line 106
    :cond_17
    const/4 v1, 0x0

    goto/16 :goto_16

    .line 131
    :cond_18
    const/4 v1, 0x1

    goto/16 :goto_17

    :cond_19
    move v4, v3

    .line 59
    goto/16 :goto_1b

    .line 116
    :catch_3
    move-exception v1

    .line 173
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v8, 0x9

    aget-object v7, v7, v8

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v7, v7, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    invoke-virtual {v7}, Lcom/whatsapp/ue;->getCount()I

    move-result v7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v7, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v8, 0x8

    aget-object v7, v7, v8

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 14
    const/4 v1, 0x3

    iput v1, v5, Lcom/whatsapp/dj;->a:I

    .line 246
    if-eqz v10, :cond_e

    move v7, v3

    move-object v3, v2

    goto/16 :goto_1d

    .line 242
    :cond_1a
    const/4 v1, 0x0

    goto/16 :goto_1e

    .line 8
    :cond_1b
    const/4 v1, 0x3

    goto/16 :goto_1f

    :cond_1c
    move-object v5, v4

    goto/16 :goto_1a

    :cond_1d
    move-object v6, v3

    move v1, v7

    move v3, v4

    move-object v4, v5

    goto/16 :goto_19

    :cond_1e
    move-object/from16 v16, v2

    move v2, v1

    move-object/from16 v1, v16

    goto/16 :goto_1c

    :cond_1f
    move-object v9, v4

    goto/16 :goto_12

    :cond_20
    move v4, v1

    move v1, v5

    goto/16 :goto_18

    :cond_21
    move v1, v3

    move v3, v4

    move-object v4, v9

    move-object/from16 v16, v5

    move v5, v2

    move-object v2, v6

    move-object/from16 v6, v16

    goto/16 :goto_11

    :cond_22
    move v1, v5

    move-object v2, v6

    move/from16 v16, v4

    move v4, v3

    move/from16 v3, v16

    goto/16 :goto_18

    :cond_23
    move-object/from16 v16, v2

    move v2, v1

    move-object/from16 v1, v16

    goto/16 :goto_14

    :cond_24
    move-object v9, v6

    goto/16 :goto_9

    :cond_25
    move v6, v1

    move v1, v7

    move-object/from16 v16, v4

    move-object v4, v8

    move-object/from16 v8, v16

    goto/16 :goto_f

    :cond_26
    move v1, v7

    move v7, v4

    move-object v4, v8

    move-object v8, v5

    move v5, v6

    move-object v6, v9

    goto/16 :goto_8

    :cond_27
    move v1, v7

    move/from16 v16, v6

    move v6, v5

    move/from16 v5, v16

    goto/16 :goto_f

    :cond_28
    move-object/from16 v16, v4

    move v4, v1

    move-object/from16 v1, v16

    goto/16 :goto_b

    :cond_29
    move/from16 v16, v1

    move v1, v4

    move/from16 v4, v16

    move-object/from16 v17, v3

    move-object v3, v5

    move-object v5, v2

    move-object/from16 v2, v17

    goto/16 :goto_3

    :cond_2a
    move-object v1, v5

    move-object v5, v2

    move-object/from16 v16, v2

    move v2, v4

    move v4, v3

    move-object/from16 v3, v16

    goto/16 :goto_7

    :cond_2b
    move v3, v1

    move-object v1, v2

    goto/16 :goto_4

    :cond_2c
    move/from16 v16, v4

    move v4, v1

    move-object v1, v3

    move-object v3, v2

    move/from16 v2, v16

    goto/16 :goto_7

    :cond_2d
    move v1, v3

    move-object/from16 v8, p5

    move-object/from16 v6, p4

    move-object/from16 v2, p3

    move/from16 v4, p2

    goto/16 :goto_10

    :cond_2e
    move v7, v2

    goto/16 :goto_2

    :cond_2f
    move v1, v2

    goto/16 :goto_1
.end method


# virtual methods
.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 191
    return-void
.end method

.method public getCount()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 201
    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->J(Lcom/whatsapp/Conversation;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v1

    if-nez v1, :cond_1

    .line 127
    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v1

    iget-object v2, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v2}, Lcom/whatsapp/Conversation;->e(Lcom/whatsapp/Conversation;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v2}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;)I

    move-result v2

    if-lez v2, :cond_2

    const/4 v0, 0x1

    :cond_2
    add-int/2addr v0, v1

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 6
    .parameter

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 52
    invoke-virtual {p0}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v4

    .line 89
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;)I

    move-result v0

    if-lez v0, :cond_2

    move v0, v2

    :goto_0
    sub-int v0, p1, v0

    if-ge v0, v4, :cond_8

    .line 166
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->f(Lcom/whatsapp/Conversation;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 238
    if-nez v0, :cond_1

    .line 260
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;)I

    move-result v0

    if-lez v0, :cond_3

    invoke-direct {p0}, Lcom/whatsapp/ue;->a()I

    move-result v0

    if-ne p1, v0, :cond_3

    .line 234
    iget-object v0, p0, Lcom/whatsapp/ue;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 190
    new-instance v0, Lcom/whatsapp/sz;

    sget-object v2, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2, v1}, Lcom/whatsapp/sz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/whatsapp/ue;->a:Ljava/lang/Object;

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ue;->a:Ljava/lang/Object;

    .line 152
    :cond_1
    :goto_1
    return-object v0

    :cond_2
    move v0, v3

    .line 89
    goto :goto_0

    .line 72
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;)I

    move-result v0

    if-lez v0, :cond_4

    invoke-direct {p0}, Lcom/whatsapp/ue;->a()I

    move-result v0

    if-le p1, v0, :cond_4

    .line 48
    add-int/lit8 v0, p1, -0x1

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_5

    :cond_4
    move v0, p1

    .line 29
    :cond_5
    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    invoke-virtual {v1}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->getPosition()I

    move-result v1

    .line 162
    iget-object v2, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v2, v2, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    invoke-virtual {v2}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v2

    add-int/lit8 v4, v4, -0x1

    sub-int v0, v4, v0

    invoke-interface {v2, v0}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 80
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v0, v0, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    invoke-virtual {v0}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->getPosition()I

    move-result v2

    .line 240
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v4, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v4, v4, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    invoke-virtual {v4}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v4

    iget-object v5, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v5, v5, Lcom/whatsapp/Conversation;->p:Ljava/lang/String;

    invoke-virtual {v0, v4, v5}, Lcom/whatsapp/fq;->b(Landroid/database/Cursor;Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v0

    .line 58
    if-ge v2, v1, :cond_7

    iget v1, p0, Lcom/whatsapp/ue;->b:I

    if-le v2, v1, :cond_6

    iget v1, p0, Lcom/whatsapp/ue;->b:I

    add-int/lit8 v1, v1, 0x32

    if-le v2, v1, :cond_7

    .line 99
    :cond_6
    add-int/lit8 v1, v2, -0x32

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Lcom/whatsapp/ue;->b:I

    .line 35
    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v1, v1, Lcom/whatsapp/Conversation;->Pb:Lcom/whatsapp/ue;

    invoke-virtual {v1}, Lcom/whatsapp/ue;->getCursor()Landroid/database/Cursor;

    move-result-object v1

    iget v2, p0, Lcom/whatsapp/ue;->b:I

    invoke-interface {v1, v2}, Landroid/database/Cursor;->moveToPosition(I)Z

    .line 76
    :cond_7
    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->f(Lcom/whatsapp/Conversation;)Ljava/util/HashMap;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 269
    :cond_8
    sub-int v0, p1, v4

    .line 134
    iget-object v3, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v3}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;)I

    move-result v3

    if-lez v3, :cond_9

    .line 68
    add-int/lit8 v0, v0, -0x1

    .line 155
    :cond_9
    if-ltz v0, :cond_a

    iget-object v3, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v3}, Lcom/whatsapp/Conversation;->e(Lcom/whatsapp/Conversation;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_a

    .line 95
    iget-object v1, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/Conversation;->e(Lcom/whatsapp/Conversation;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    goto/16 :goto_1

    .line 176
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    aget-object v2, v3, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v2}, Lcom/whatsapp/Conversation;->e(Lcom/whatsapp/Conversation;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    move-object v0, v1

    goto/16 :goto_1
.end method

.method public getItemId(I)J
    .locals 2
    .parameter

    .prologue
    .line 67
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1
    .parameter

    .prologue
    .line 249
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->J(Lcom/whatsapp/Conversation;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 203
    const/4 v0, -0x1

    :goto_0
    return v0

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;)I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, Lcom/whatsapp/ue;->a()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 183
    const/16 v0, 0xa

    goto :goto_0

    .line 149
    :cond_1
    invoke-virtual {p0, p1}, Lcom/whatsapp/ue;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 169
    invoke-static {v0}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/sz;)I

    move-result v0

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    const/4 v2, 0x0

    sget-boolean v7, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 264
    invoke-virtual {p0, p1}, Lcom/whatsapp/ue;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whatsapp/sz;

    .line 70
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;)I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, Lcom/whatsapp/ue;->a()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 130
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    sget-object v1, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v3, 0xb

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 30
    const v1, 0x7f030024

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 253
    const v0, 0x7f0d00d8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 207
    sget-object v3, Lcom/whatsapp/App;->Z:Lcom/whatsapp/vu;

    const v5, 0x7f0b0006

    iget-object v6, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v6}, Lcom/whatsapp/Conversation;->K(Lcom/whatsapp/Conversation;)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lcom/whatsapp/vu;->a(II)Ljava/lang/String;

    move-result-object v3

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v5}, Lcom/whatsapp/Conversation;->K(Lcom/whatsapp/Conversation;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 268
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    :cond_0
    :goto_0
    return-object v1

    .line 39
    :cond_1
    if-eqz p2, :cond_9

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {v3}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/sz;)I

    move-result v1

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/sz;)I

    move-result v0

    if-ne v1, v0, :cond_9

    .line 17
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->G(Lcom/whatsapp/Conversation;)Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v0, v0, Lcom/whatsapp/Conversation;->sb:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_2
    move v0, v4

    .line 138
    :goto_1
    check-cast p2, Lcom/whatsapp/ze;

    .line 175
    invoke-virtual {p2, v3, v0}, Lcom/whatsapp/ze;->a(Lcom/whatsapp/sz;Z)V

    .line 210
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->G(Lcom/whatsapp/Conversation;)Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-object v1, p2

    .line 88
    :cond_3
    :goto_2
    if-nez p1, :cond_4

    .line 125
    invoke-virtual {v1, v4}, Lcom/whatsapp/ze;->a(Z)V

    if-eqz v7, :cond_a

    .line 204
    :cond_4
    add-int/lit8 v0, p1, -0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/ue;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/sz;

    .line 153
    iget-wide v5, v0, Lcom/whatsapp/sz;->i:J

    iget-wide v8, v3, Lcom/whatsapp/sz;->i:J

    invoke-static {v5, v6, v8, v9}, Lcom/whatsapp/t4;->b(JJ)Z

    move-result v6

    .line 129
    if-nez v6, :cond_5

    .line 132
    invoke-virtual {v1, v4}, Lcom/whatsapp/ze;->a(Z)V

    if-eqz v7, :cond_6

    .line 53
    :cond_5
    invoke-virtual {v1, v2}, Lcom/whatsapp/ze;->a(Z)V

    :cond_6
    move-object v4, v0

    .line 143
    :goto_3
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->k(Lcom/whatsapp/Conversation;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v3, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_0

    .line 158
    invoke-virtual {v1}, Lcom/whatsapp/ze;->e()V

    .line 232
    iget-byte v0, v3, Lcom/whatsapp/sz;->l:B

    if-nez v0, :cond_0

    .line 61
    sget-object v0, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    iget-object v2, v3, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/dj;

    if-eqz v0, :cond_7

    .line 224
    iget v0, v0, Lcom/whatsapp/dj;->a:I

    iput v0, v1, Lcom/whatsapp/ze;->m:I

    .line 263
    invoke-virtual {v1}, Lcom/whatsapp/ze;->f()V

    if-eqz v7, :cond_0

    .line 100
    :cond_7
    add-int/lit8 v0, p1, 0x1

    invoke-virtual {p0, v0}, Lcom/whatsapp/ue;->getItem(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whatsapp/sz;

    move-object v0, p0

    move v2, p1

    invoke-direct/range {v0 .. v6}, Lcom/whatsapp/ue;->a(Lcom/whatsapp/ze;ILcom/whatsapp/sz;Lcom/whatsapp/sz;Lcom/whatsapp/sz;Z)V

    goto/16 :goto_0

    :cond_8
    move v0, v2

    .line 17
    goto :goto_1

    .line 151
    :cond_9
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0, v3}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)Lcom/whatsapp/ze;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    .line 37
    if-nez v1, :cond_3

    .line 225
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v8, 0xa

    aget-object v6, v6, v8

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Lcom/whatsapp/g5;->a(Lcom/whatsapp/sz;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    .line 114
    :catch_0
    move-exception v0

    .line 220
    :goto_4
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto/16 :goto_2

    .line 114
    :catch_1
    move-exception v0

    move-object v1, v5

    goto :goto_4

    :cond_a
    move v6, v2

    move-object v4, v5

    goto :goto_3
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    add-int/lit8 v0, v0, 0xb

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 90
    const/4 v0, 0x1

    return v0
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 248
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 267
    :cond_0
    sget-object v1, Lcom/whatsapp/ue;->z:[Ljava/lang/String;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 171
    :goto_0
    return-object v0

    .line 277
    :cond_1
    sget-object v1, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v2, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    iget-object v2, v2, Lcom/whatsapp/Conversation;->p:Ljava/lang/String;

    invoke-virtual {v1, p2, v2}, Lcom/whatsapp/fq;->b(Landroid/database/Cursor;Ljava/lang/String;)Lcom/whatsapp/sz;

    move-result-object v1

    .line 117
    :try_start_0
    iget-object v2, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v2, v1}, Lcom/whatsapp/Conversation;->d(Lcom/whatsapp/Conversation;Lcom/whatsapp/sz;)Lcom/whatsapp/ze;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 150
    :catch_0
    move-exception v1

    .line 102
    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public notifyDataSetChanged()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 192
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->H(Lcom/whatsapp/Conversation;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    sget-object v0, Lcom/whatsapp/Conversation;->j:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 145
    invoke-super {p0}, Landroid/widget/CursorAdapter;->notifyDataSetChanged()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->I(Lcom/whatsapp/Conversation;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 214
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0, v1}, Lcom/whatsapp/Conversation;->l(Lcom/whatsapp/Conversation;Z)Z

    .line 196
    iget-object v0, p0, Lcom/whatsapp/ue;->c:Lcom/whatsapp/Conversation;

    invoke-static {v0, v1}, Lcom/whatsapp/Conversation;->n(Lcom/whatsapp/Conversation;Z)Z

    .line 16
    :cond_1
    return-void
.end method

.method protected onContentChanged()V
    .locals 0

    .prologue
    .line 55
    return-void
.end method
