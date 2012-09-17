.class public Lcom/whatsapp/UserFeedbackActivity;
.super Lcom/whatsapp/DialogToastActivity;
.source "UserFeedbackActivity.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private f:Ljava/lang/String;

.field private g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/bq;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x6b

    const/16 v1, 0x64

    const/16 v4, 0x35

    const/16 v2, 0x15

    const/4 v6, 0x0

    const/16 v0, 0x13

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0011\u0002p\u0019S\u0000\u0013~DE\u0016\u0014e\nG\u0001^{\u0004\u0018\t\u0014f\u0018T\u0003\u0014"

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

    const-string v0, "\u0014\u0010g\u001f\\\u0005\u001d"

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

    const-string v0, "\u0011\u001ft\u001dT\r\u001dt\tY\u0001"

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

    const-string v0, "\u0011\u001f~\u0005Z\u0013\u001f"

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

    const-string v0, "\u0011\u0002p\u0019S\u0000\u0013~DR\u0001\u0005x\u0018R\u0002\u001eg\u0018P\u0016\u0007p\u0019\u001a\n\u001e8\u0018P\u0016\u0007p\u0019\u0018\u0017\u0005t\u001f@\u0017"

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

    const-string v0, "\u0005\u0007t\u0002Y\u0005\u0013y\u000e"

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

    const-string v0, "\u0011\u0002p\u0019S\u0000\u0013~DR\u0001\u0005x\u0018R\u0002\u001eg\u0018P\u0016\u0007p\u0019\u001a\n\u0004y\u0007"

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

    const-string v0, "\u0011\u0002p\u0019S\u0000\u0013~DR\u0001\u0005x\u0018R\u0002\u001eg\u0018P\u0016\u0007p\u0019\u001a\n\u001e8\u0018A\u0005\u0005`\u0018\u0018\u0002\u001egF"

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

    const-string v0, "\u0007\u001exEB\u000c\u0010a\u0018T\u0014\u0001;/P\u0017\u0012g\u0002W\u0001!g\u0004W\u0008\u0014x*V\u0010\u0018c\u0002A\u001d_a\u0012E\u0001"

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

    const-string v0, "\u0007\u001exEB\u000c\u0010a\u0018T\u0014\u0001;/P\u0017\u0012g\u0002W\u0001!g\u0004W\u0008\u0014x*V\u0010\u0018c\u0002A\u001d_s\u0019Z\t"

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

    const-string v0, "\u0007\u001exEB\u000c\u0010a\u0018T\u0014\u0001;/P\u0017\u0012g\u0002W\u0001!g\u0004W\u0008\u0014x*V\u0010\u0018c\u0002A\u001d_f\u000eG\u0012\u0014g\u0018A\u0005\u0005`\u0018"

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

    const-string v0, "\u0011\u0002p\u0019S\u0000\u0013~DP\n\u0005p\u0019Q\u0001\u0002v\u0019\\\u0014\u0005|\u0004[\u0014\u0003p\u001b\u001a\n\u001e8\u0018P\u0016\u0007p\u0019\u0018\u0010\u0008e\u000e"

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

    const-string v0, "\u0011\u0002p\u0019S\u0000\u0013~DP\n\u0005p\u0019Q\u0001\u0002v\u0019\\\u0014\u0005|\u0004[\u0014\u0003p\u001b\u001a\n\u001e8\u0008Z\n\u001fp\u0008A\r\u0007|\u001fL"

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

    const-string v0, "\u0007\u0019t\u001f"

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

    const-string v0, "\u0016\u0014r\u0002F\u0010\u0003t\u001f\\\u000b\u001f"

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

    const-string v0, "\n\u001e8\u0008Z\n\u001fp\u0008A\r\u0007|\u001fL"

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

    const-string v0, "(\u001er\u0018"

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

    const-string v0, "\t\u001e`\u0005A\u0001\u0015"

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

    const-string v0, "\u0013\u0019t\u001fF\u0005\u0001eEY\u000b\u0016"

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

    sput-object v9, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    move v0, v1

    goto :goto_24

    :pswitch_45
    const/16 v0, 0x71

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
    const/16 v0, 0x71

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
    .line 68
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    .line 44
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;)Lcom/whatsapp/q4;
    .locals 9
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/bq;",
            ">;)",
            "Lcom/whatsapp/q4;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/16 v1, 0xe

    const v6, 0x7f090059

    const v5, 0x7f090058

    .line 55
    .line 36
    invoke-static {}, Lcom/whatsapp/App;->sb()Z

    move-result v0

    if-nez v0, :cond_0

    .line 34
    sget-object v0, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 25
    new-instance v0, Lcom/whatsapp/q4;

    const v1, 0x7f090052

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const v4, 0x7f090048

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/16 v3, 0xf

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/q4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    :goto_0
    return-object v0

    .line 50
    :cond_0
    if-nez p1, :cond_1

    .line 59
    sget-object v0, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 63
    new-instance v0, Lcom/whatsapp/q4;

    invoke-direct {v0, v2, v2}, Lcom/whatsapp/q4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_1
    sget-object v0, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 42
    sget-object v0, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    aget-object v1, v0, v1

    const v3, 0x7f090054

    const v4, 0x7f090056

    move-object v0, p0

    move-object v2, p2

    move v7, v5

    move v8, v6

    invoke-static/range {v0 .. v8}, Lcom/whatsapp/UserFeedbackActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;IIIIII)Lcom/whatsapp/q4;

    move-result-object v0

    goto :goto_0

    .line 21
    :cond_2
    sget-object v0, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/16 v1, 0xd

    aget-object v1, v0, v1

    const v3, 0x7f090055

    const v4, 0x7f090057

    move-object v0, p0

    move-object v2, p2

    move v7, v5

    move v8, v6

    invoke-static/range {v0 .. v8}, Lcom/whatsapp/UserFeedbackActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;IIIIII)Lcom/whatsapp/q4;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;IIIIII)Lcom/whatsapp/q4;
    .locals 10
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/bq;",
            ">;IIIIII)",
            "Lcom/whatsapp/q4;"
        }
    .end annotation

    .prologue
    .line 72
    const/4 v3, 0x0

    .line 26
    const/4 v2, 0x0

    .line 32
    if-nez p1, :cond_0

    .line 64
    sget-object v1, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v4, 0x6

    aget-object v1, v1, v4

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_6

    .line 22
    :cond_0
    if-nez p2, :cond_1

    .line 29
    sget-object v1, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v1, v1, v3

    invoke-static {v1}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 23
    sget-object v1, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v1, v1, v3

    move-object v9, v2

    move-object v2, v1

    move-object v1, v9

    .line 95
    :goto_0
    new-instance v3, Lcom/whatsapp/q4;

    invoke-direct {v3, v1, v2}, Lcom/whatsapp/q4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    .line 54
    :cond_1
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whatsapp/bq;

    .line 46
    if-eqz v1, :cond_5

    .line 76
    sget-object v3, Lcom/whatsapp/p4;->a:[I

    iget-object v4, v1, Lcom/whatsapp/bq;->a:Lcom/whatsapp/vf;

    invoke-virtual {v4}, Lcom/whatsapp/vf;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    .line 100
    sget-object v1, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v1, v1, v3

    move-object v9, v2

    move-object v2, v1

    move-object v1, v9

    .line 1
    goto :goto_0

    .line 65
    :pswitch_0
    sget-object v2, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    .line 40
    iget-wide v3, v1, Lcom/whatsapp/bq;->b:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-gtz v3, :cond_2

    .line 53
    invoke-virtual {p0, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 18
    :cond_2
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-wide v5, v1, Lcom/whatsapp/bq;->b:J

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-static {p0, v5, v6}, Lcom/whatsapp/t4;->g(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v4

    invoke-virtual {p0, p3, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 30
    :pswitch_1
    sget-object v2, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    .line 45
    iget-wide v3, v1, Lcom/whatsapp/bq;->b:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-gtz v3, :cond_3

    .line 87
    move/from16 v0, p6

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 28
    :cond_3
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-wide v5, v1, Lcom/whatsapp/bq;->b:J

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-static {p0, v5, v6}, Lcom/whatsapp/t4;->g(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v4

    invoke-virtual {p0, p5, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 41
    :pswitch_2
    sget-object v2, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    .line 84
    iget-wide v3, v1, Lcom/whatsapp/bq;->b:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-gtz v3, :cond_4

    .line 6
    move/from16 v0, p8

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    .line 60
    :cond_4
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-wide v5, v1, Lcom/whatsapp/bq;->b:J

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-static {p0, v5, v6}, Lcom/whatsapp/t4;->g(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v4

    move/from16 v0, p7

    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    .line 5
    :pswitch_3
    sget-object v1, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v1, v1, v3

    move-object v9, v2

    move-object v2, v1

    move-object v1, v9

    .line 91
    goto/16 :goto_0

    .line 14
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v5, 0x7

    aget-object v4, v4, v5

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    :cond_6
    move-object v1, v2

    move-object v2, v3

    goto/16 :goto_0

    .line 76
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static a(Lcom/whatsapp/UserFeedbackActivity;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 67
    iget-object v0, p0, Lcom/whatsapp/UserFeedbackActivity;->f:Ljava/lang/String;

    return-object v0
.end method

.method static a(Lcom/whatsapp/UserFeedbackActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 88
    iput-object p1, p0, Lcom/whatsapp/UserFeedbackActivity;->i:Ljava/lang/String;

    return-object p1
.end method

.method static a(Lcom/whatsapp/UserFeedbackActivity;Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 94
    iput-object p1, p0, Lcom/whatsapp/UserFeedbackActivity;->g:Ljava/util/HashMap;

    return-object p1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 12
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whatsapp/DescribeProblemActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 69
    sget-object v1, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    sget-object v1, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 82
    if-eqz p3, :cond_0

    .line 27
    sget-object v1, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 79
    :cond_0
    const/high16 v1, 0x4000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 4
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 74
    return-void
.end method

.method static b(Lcom/whatsapp/UserFeedbackActivity;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 99
    iget-object v0, p0, Lcom/whatsapp/UserFeedbackActivity;->h:Ljava/lang/String;

    return-object v0
.end method

.method static b(Lcom/whatsapp/UserFeedbackActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 85
    iput-object p1, p0, Lcom/whatsapp/UserFeedbackActivity;->h:Ljava/lang/String;

    return-object p1
.end method

.method private static b()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/16 v5, 0x12

    .line 38
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 90
    sget-object v2, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/16 v3, 0x11

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 48
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v2}, Lcom/whatsapp/App;->getFilesDir()Ljava/io/File;

    move-result-object v2

    sget-object v3, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/16 v4, 0x10

    aget-object v3, v3, v4

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 101
    new-instance v3, Ljava/io/File;

    sget-object v2, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 39
    sget-object v0, Lcom/whatsapp/App;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 10
    sget-object v0, Lcom/whatsapp/App;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 71
    :cond_0
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/whatsapp/App;->c:Ljava/io/File;

    sget-object v4, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    aget-object v4, v4, v5

    invoke-direct {v0, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 52
    :try_start_0
    new-instance v2, Lcom/whatsapp/pf;

    sget-object v4, Lcom/whatsapp/App;->B:Lcom/whatsapp/w5;

    invoke-direct {v2, v4, v0}, Lcom/whatsapp/pf;-><init>(Lcom/whatsapp/w5;Ljava/io/File;)V

    invoke-static {v2}, Ljava/nio/channels/Channels;->newChannel(Ljava/io/OutputStream;)Ljava/nio/channels/WritableByteChannel;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 37
    :try_start_1
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v1

    .line 97
    invoke-static {v1, v2}, Lcom/whatsapp/s4;->a(Ljava/nio/channels/FileChannel;Ljava/nio/channels/WritableByteChannel;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    if-eqz v1, :cond_1

    .line 8
    :try_start_2
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->close()V

    .line 66
    :cond_1
    if-eqz v2, :cond_2

    .line 77
    invoke-interface {v2}, Ljava/nio/channels/WritableByteChannel;->close()V

    .line 33
    :cond_2
    :goto_0
    return-void

    .line 62
    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_1
    if-eqz v1, :cond_3

    .line 8
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->close()V

    .line 66
    :cond_3
    if-eqz v2, :cond_4

    .line 77
    invoke-interface {v2}, Ljava/nio/channels/WritableByteChannel;->close()V

    .line 62
    :cond_4
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 11
    :catch_0
    move-exception v0

    goto :goto_0

    .line 62
    :catchall_1
    move-exception v0

    goto :goto_1
.end method

.method static c(Lcom/whatsapp/UserFeedbackActivity;)Ljava/util/HashMap;
    .locals 1
    .parameter

    .prologue
    .line 92
    iget-object v0, p0, Lcom/whatsapp/UserFeedbackActivity;->g:Ljava/util/HashMap;

    return-object v0
.end method

.method static d(Lcom/whatsapp/UserFeedbackActivity;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 70
    iget-object v0, p0, Lcom/whatsapp/UserFeedbackActivity;->i:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected d(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 57
    iput-object p1, p0, Lcom/whatsapp/UserFeedbackActivity;->f:Ljava/lang/String;

    .line 89
    sget v0, Lcom/whatsapp/App;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 61
    invoke-static {}, Lcom/whatsapp/UserFeedbackActivity;->b()V

    .line 17
    :cond_0
    new-instance v0, Lcom/whatsapp/zb;

    invoke-direct {v0, p0}, Lcom/whatsapp/zb;-><init>(Lcom/whatsapp/UserFeedbackActivity;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/zb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 15
    return-void
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 5
    .parameter

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 9
    packed-switch p1, :pswitch_data_0

    .line 83
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 98
    :goto_0
    return-object v0

    .line 2
    :pswitch_0
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    .line 78
    const v1, 0x7f090051

    invoke-virtual {p0, v1}, Lcom/whatsapp/UserFeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 96
    invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    .line 43
    invoke-virtual {v0, v4}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    goto :goto_0

    .line 56
    :pswitch_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090053

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090020

    new-instance v2, Lcom/whatsapp/n4;

    invoke-direct {v2, p0}, Lcom/whatsapp/n4;-><init>(Lcom/whatsapp/UserFeedbackActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000c

    new-instance v2, Lcom/whatsapp/m4;

    invoke-direct {v2, p0}, Lcom/whatsapp/m4;-><init>(Lcom/whatsapp/UserFeedbackActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 80
    :pswitch_2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f090047

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090052

    new-array v2, v2, [Ljava/lang/Object;

    const v3, 0x7f090048

    invoke-virtual {p0, v3}, Lcom/whatsapp/UserFeedbackActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/UserFeedbackActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000e

    new-instance v2, Lcom/whatsapp/o4;

    invoke-direct {v2, p0}, Lcom/whatsapp/o4;-><init>(Lcom/whatsapp/UserFeedbackActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    .line 9
    :pswitch_data_0
    .packed-switch 0xc8
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected onPrepareDialog(ILandroid/app/Dialog;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 20
    packed-switch p1, :pswitch_data_0

    .line 31
    :cond_0
    :goto_0
    return-void

    .line 86
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/UserFeedbackActivity;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 7
    check-cast p2, Landroid/app/AlertDialog;

    .line 49
    iget-object v0, p0, Lcom/whatsapp/UserFeedbackActivity;->i:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 19
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 35
    :cond_1
    sget-object v0, Lcom/whatsapp/UserFeedbackActivity;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 20
    :pswitch_data_0
    .packed-switch 0xc9
        :pswitch_0
    .end packed-switch
.end method
