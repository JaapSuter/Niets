.class public Lcom/whatsapp/billing/BillingService;
.super Landroid/app/Service;
.source "BillingService.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# static fields
.field private static a:Lcom/b;

.field private static b:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/whatsapp/billing/f;",
            ">;"
        }
    .end annotation
.end field

.field private static c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Long;",
            "Lcom/whatsapp/billing/f;",
            ">;"
        }
    .end annotation
.end field

.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v4, 0x48

    const/16 v2, 0x47

    const/16 v1, 0x25

    const/16 v3, 0xa

    const/4 v6, 0x0

    const/16 v0, 0xe

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "F(gq?M&~,)U7$=!I+c1/\u000b\u0004E\u0011\u000el\u0015G\u0000\u0006j\u0013C\u0019\u0001f\u0006^\u0016\u0007k"

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

    const-string v0, "L)k/8z4c8&@#U;)Q&"

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

    const-string v0, "F(gq)K#x0!Ai|:&A.d8fG.f3!K $\u000f\u001dw\u0004B\u001e\u001b`\u0018Y\u000b\tq\u0002U\u001c\u0000d\tM\u001a\u000c"

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

    const-string v0, "W\"y/\'K4o\u0000+J#o"

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

    const-string v0, "F(gq?M&~,)U7$=!I+c1/\u000b\u0000O\u000b\u0017u\u0012X\u001c\u0000d\u0014O\u0000\u0001k\u0001E\r\u0005d\u0013C\u0010\u0006"

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

    const-string v0, "W\"{*-V3U6,"

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

    const-string v0, "L)k/8z4c8&D3\u007f--"

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

    const-string v0, "F(gq)K#x0!Ai|:&A.d8fG.f3!K $\r\rv\u0017E\u0011\u001b`\u0018I\u0010\u000c`"

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

    const-string v0, "K(~6.L$k+!J)U6,"

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

    const-string v0, "g.f3!K Y::S.i:"

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

    const-string v0, "g.f3!K *,-W1c<-\u0005#c,+J)d:+Q\"n"

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

    aput-object v0, v9, v3

    const/16 v10, 0xb

    const-string v0, "f(\u007f3,\u0005)e+hG.d;hQ(*,-W1c<-\u000b"

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

    const-string v0, "F(gq)K#x0!Ai|:&A.d8fG.f3!K $\u0012)W,o+\nL+f6&B\u0014o->L$oq\nl\tN"

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

    const-string v0, "v\"i*:L3s\u007f-]$o/<L(deh"

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

    sput-object v9, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    .line 71
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Lcom/whatsapp/billing/BillingService;->b:Ljava/util/LinkedList;

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/whatsapp/billing/BillingService;->c:Ljava/util/HashMap;

    return-void

    .line -1
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
    move v0, v3

    goto :goto_e

    :pswitch_3
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_f

    :pswitch_7
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_10

    :pswitch_b
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_11

    :pswitch_f
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_12

    :pswitch_13
    const/16 v0, 0x5f

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
    move v0, v1

    goto :goto_13

    :pswitch_15
    move v0, v2

    goto :goto_13

    :pswitch_16
    move v0, v3

    goto :goto_13

    :pswitch_17
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_14

    :pswitch_1b
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_15

    :pswitch_1f
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_16

    :pswitch_23
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_17

    :pswitch_27
    const/16 v0, 0x5f

    goto :goto_17

    :cond_a
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_a

    move v0, v4

    :goto_18
    xor-int/2addr v0, v10

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
    move v0, v3

    goto :goto_18

    :pswitch_2b
    const/16 v0, 0x5f

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
    move v0, v1

    goto :goto_19

    :pswitch_2d
    move v0, v2

    goto :goto_19

    :pswitch_2e
    move v0, v3

    goto :goto_19

    :pswitch_2f
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_1a

    :pswitch_33
    const/16 v0, 0x5f

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
    move v0, v3

    goto :goto_1b

    :pswitch_37
    const/16 v0, 0x5f

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

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 7
    return-void
.end method

.method static a(Lcom/b;)Lcom/b;
    .locals 0
    .parameter

    .prologue
    .line 10
    sput-object p0, Lcom/whatsapp/billing/BillingService;->a:Lcom/b;

    return-object p0
.end method

.method private a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 10
    .parameter
    .parameter
    .parameter

    .prologue
    sget v7, Lcom/whatsapp/billing/i;->b:I

    .line 54
    invoke-static {p2, p3}, Lcom/whatsapp/billing/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 37
    if-nez v0, :cond_1

    .line 53
    :cond_0
    :goto_0
    return-void

    .line 42
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 68
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/billing/p;

    .line 33
    iget-object v1, v0, Lcom/whatsapp/billing/p;->b:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 31
    iget-object v1, v0, Lcom/whatsapp/billing/p;->b:Ljava/lang/String;

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    :cond_3
    iget-object v1, v0, Lcom/whatsapp/billing/p;->a:Lcom/whatsapp/billing/b;

    iget-object v2, v0, Lcom/whatsapp/billing/p;->c:Ljava/lang/String;

    iget-object v3, v0, Lcom/whatsapp/billing/p;->d:Ljava/lang/String;

    iget-wide v4, v0, Lcom/whatsapp/billing/p;->e:J

    iget-object v6, v0, Lcom/whatsapp/billing/p;->f:Ljava/lang/String;

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/whatsapp/billing/m;->a(Landroid/content/Context;Lcom/whatsapp/billing/b;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    if-eqz v7, :cond_2

    .line 36
    :cond_4
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 22
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 61
    invoke-direct {p0, p1, v0}, Lcom/whatsapp/billing/BillingService;->a(I[Ljava/lang/String;)Z

    goto :goto_0
.end method

.method private a(JLcom/whatsapp/billing/c;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 51
    sget-object v0, Lcom/whatsapp/billing/BillingService;->c:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/billing/f;

    .line 16
    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {v0, p3}, Lcom/whatsapp/billing/f;->a(Lcom/whatsapp/billing/c;)V

    .line 55
    :cond_0
    sget-object v0, Lcom/whatsapp/billing/BillingService;->c:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    return-void
.end method

.method private a()Z
    .locals 5

    .prologue
    const/16 v4, 0x9

    const/4 v0, 0x1

    .line 21
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {p0, v1, p0, v2}, Lcom/whatsapp/billing/BillingService;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 44
    :goto_0
    return v0

    .line 56
    :cond_0
    sget-object v0, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    sget-object v1, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 26
    :catch_0
    move-exception v0

    .line 66
    sget-object v1, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    aget-object v1, v1, v4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/16 v4, 0xd

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method private a(I[Ljava/lang/String;)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 73
    new-instance v0, Lcom/whatsapp/billing/g;

    invoke-direct {v0, p0, p1, p2}, Lcom/whatsapp/billing/g;-><init>(Lcom/whatsapp/billing/BillingService;I[Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/whatsapp/billing/g;->b()Z

    move-result v0

    return v0
.end method

.method static a(Lcom/whatsapp/billing/BillingService;)Z
    .locals 1
    .parameter

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/whatsapp/billing/BillingService;->a()Z

    move-result v0

    return v0
.end method

.method private b()V
    .locals 4

    .prologue
    sget v2, Lcom/whatsapp/billing/i;->b:I

    .line 58
    const/4 v0, -0x1

    move v1, v0

    .line 11
    :cond_0
    :goto_0
    sget-object v0, Lcom/whatsapp/billing/BillingService;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/billing/f;

    if-eqz v0, :cond_3

    .line 38
    invoke-virtual {v0}, Lcom/whatsapp/billing/f;->c()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 5
    sget-object v3, Lcom/whatsapp/billing/BillingService;->b:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 1
    invoke-virtual {v0}, Lcom/whatsapp/billing/f;->a()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 41
    invoke-virtual {v0}, Lcom/whatsapp/billing/f;->a()I

    move-result v0

    if-eqz v2, :cond_4

    .line 28
    :cond_1
    invoke-direct {p0}, Lcom/whatsapp/billing/BillingService;->a()Z

    .line 69
    :cond_2
    :goto_1
    return-void

    .line 48
    :cond_3
    if-ltz v1, :cond_2

    .line 63
    invoke-virtual {p0, v1}, Lcom/whatsapp/billing/BillingService;->stopSelf(I)V

    goto :goto_1

    :cond_4
    move v1, v0

    goto :goto_0
.end method

.method private b(I[Ljava/lang/String;)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 65
    new-instance v0, Lcom/whatsapp/billing/h;

    invoke-direct {v0, p0, p1, p2}, Lcom/whatsapp/billing/h;-><init>(Lcom/whatsapp/billing/BillingService;I[Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/whatsapp/billing/h;->b()Z

    move-result v0

    return v0
.end method

.method static c()Ljava/util/LinkedList;
    .locals 1

    .prologue
    .line 9
    sget-object v0, Lcom/whatsapp/billing/BillingService;->b:Ljava/util/LinkedList;

    return-object v0
.end method

.method static d()Lcom/b;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/whatsapp/billing/BillingService;->a:Lcom/b;

    return-object v0
.end method

.method static e()Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/whatsapp/billing/BillingService;->c:Ljava/util/HashMap;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Intent;I)V
    .locals 7
    .parameter
    .parameter

    .prologue
    const/16 v6, 0x8

    const/4 v5, 0x1

    const/4 v4, 0x0

    sget v0, Lcom/whatsapp/billing/i;->b:I

    .line 34
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 23
    sget-object v2, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 13
    sget-object v2, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    aget-object v2, v2, v6

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 57
    invoke-direct {p0, p2, v2}, Lcom/whatsapp/billing/BillingService;->a(I[Ljava/lang/String;)Z

    .line 15
    if-eqz v0, :cond_3

    :cond_0
    sget-object v2, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 47
    sget-object v2, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    aget-object v2, v2, v6

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 20
    new-array v3, v5, [Ljava/lang/String;

    aput-object v2, v3, v4

    invoke-direct {p0, p2, v3}, Lcom/whatsapp/billing/BillingService;->b(I[Ljava/lang/String;)Z

    .line 67
    if-eqz v0, :cond_3

    :cond_1
    sget-object v2, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 8
    sget-object v2, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    aget-object v2, v2, v5

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 72
    sget-object v3, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/4 v4, 0x6

    aget-object v3, v3, v4

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 35
    invoke-direct {p0, p2, v2, v3}, Lcom/whatsapp/billing/BillingService;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 40
    if-eqz v0, :cond_3

    :cond_2
    sget-object v0, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v0, v0, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 27
    sget-object v0, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    .line 25
    sget-object v2, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    sget-object v3, Lcom/whatsapp/billing/c;->g:Lcom/whatsapp/billing/c;

    invoke-virtual {v3}, Lcom/whatsapp/billing/c;->ordinal()I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 64
    invoke-static {v2}, Lcom/whatsapp/billing/c;->a(I)Lcom/whatsapp/billing/c;

    move-result-object v2

    .line 3
    invoke-direct {p0, v0, v1, v2}, Lcom/whatsapp/billing/BillingService;->a(JLcom/whatsapp/billing/c;)V

    .line 30
    :cond_3
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .parameter

    .prologue
    .line 49
    const/4 v0, 0x0

    return-object v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 19
    invoke-static {p2}, Lcom/a;->a(Landroid/os/IBinder;)Lcom/b;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/billing/BillingService;->a:Lcom/b;

    .line 70
    invoke-direct {p0}, Lcom/whatsapp/billing/BillingService;->b()V

    .line 12
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3
    .parameter

    .prologue
    .line 24
    sget-object v0, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    sget-object v1, Lcom/whatsapp/billing/BillingService;->z:[Ljava/lang/String;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    const/4 v0, 0x0

    sput-object v0, Lcom/whatsapp/billing/BillingService;->a:Lcom/b;

    .line 52
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 59
    invoke-virtual {p0, p1, p2}, Lcom/whatsapp/billing/BillingService;->a(Landroid/content/Intent;I)V

    .line 32
    return-void
.end method
