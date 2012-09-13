.class public Lcom/whatsapp/oz;
.super Ljava/lang/Object;
.source "oz.java"

# interfaces
.implements Lcom/whatsapp/e1;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field a:Lcom/whatsapp/g1;

.field b:Ljava/io/InputStream;

.field c:Ljava/io/InputStream;

.field d:[B

.field e:I

.field f:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x5f

    const/16 v1, 0x4e

    const/16 v4, 0x3d

    const/16 v2, 0x39

    const/4 v6, 0x0

    const/16 v0, 0xd

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "<\\>\u0012n:K6\u0018ZnZ0\u0003Q*Wx\u0002\u001d<\\<\u0019S=M-\u0003^:\u00195\u001fY"

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

    const-string v0, "\u001bm\u0019[\u0005"

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

    const-string v0, "<\\>\u0012n:K6\u0018ZnZ0\u0003Q*Wx\u0002\u001d#X+\u0015UnM0\u001dX "

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

    const-string v0, "c\u0008\u007f\u0002R%\\1VT \u0019-\u0013\\*j+\u0004T ^"

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

    const-string v0, "#X<VP\'J2\u0017I-Q"

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

    const-string v0, "\u000bW<\u0004D>M:\u0012\u001d,U0\u0015Vb\u0019=\u0003InW0V^\'I7\u0013OnX)\u0017T\"X=\u001aX"

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

    const-string v0, "\'W)\u0017Q\']\u007f\u001aT=M\u007f\u0005T4\\\u007f\u001fSnK:\u0017Y\u0002P,\u0002n\'C:L\u001d:V4\u0013Sn"

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

    const-string v0, "\'W)\u0017Q\']\u007f\u0002R%\\1YQ+W8\u0002UnP1VZ+M\u000b\u0019V+W"

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

    const-string v0, "+A/\u0013^:P1\u0011\u001d\u001dm\r3|\u0003f\u000c\"|\u001cm\u007f\u001fSnJ+\u0004X/T\u000c\u0002\\<M"

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

    const-string v0, " L3\u001a"

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

    const-string v0, "=P%\u0013\u001ds\u0019"

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

    const-string v0, "b\u0019"

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

    const-string v0, " \\\'\u0002i<\\:VN+\\,V\rnU6\u0005InV-VS;U3VI/^"

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

    sput-object v9, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

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
    move v0, v1

    goto :goto_d

    :pswitch_1
    move v0, v2

    goto :goto_d

    :pswitch_2
    move v0, v3

    goto :goto_d

    :pswitch_3
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_e

    :pswitch_5
    move v0, v2

    goto :goto_e

    :pswitch_6
    move v0, v3

    goto :goto_e

    :pswitch_7
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_f

    :pswitch_9
    move v0, v2

    goto :goto_f

    :pswitch_a
    move v0, v3

    goto :goto_f

    :pswitch_b
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_10

    :pswitch_d
    move v0, v2

    goto :goto_10

    :pswitch_e
    move v0, v3

    goto :goto_10

    :pswitch_f
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_11

    :pswitch_11
    move v0, v2

    goto :goto_11

    :pswitch_12
    move v0, v3

    goto :goto_11

    :pswitch_13
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_12

    :pswitch_15
    move v0, v2

    goto :goto_12

    :pswitch_16
    move v0, v3

    goto :goto_12

    :pswitch_17
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_13

    :pswitch_19
    move v0, v2

    goto :goto_13

    :pswitch_1a
    move v0, v3

    goto :goto_13

    :pswitch_1b
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_14

    :pswitch_1d
    move v0, v2

    goto :goto_14

    :pswitch_1e
    move v0, v3

    goto :goto_14

    :pswitch_1f
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_15

    :pswitch_21
    move v0, v2

    goto :goto_15

    :pswitch_22
    move v0, v3

    goto :goto_15

    :pswitch_23
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_16

    :pswitch_25
    move v0, v2

    goto :goto_16

    :pswitch_26
    move v0, v3

    goto :goto_16

    :pswitch_27
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_17

    :pswitch_29
    move v0, v2

    goto :goto_17

    :pswitch_2a
    move v0, v3

    goto :goto_17

    :pswitch_2b
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_18

    :pswitch_2d
    move v0, v2

    goto :goto_18

    :pswitch_2e
    move v0, v3

    goto :goto_18

    :pswitch_2f
    const/16 v0, 0x76

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
    move v0, v1

    goto :goto_19

    :pswitch_31
    move v0, v2

    goto :goto_19

    :pswitch_32
    move v0, v3

    goto :goto_19

    :pswitch_33
    const/16 v0, 0x76

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

.method public constructor <init>(Ljava/io/InputStream;[Ljava/lang/String;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    const/16 v0, 0xff

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/whatsapp/oz;->d:[B

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/oz;->e:I

    .line 19
    new-instance v0, Lcom/whatsapp/nf;

    invoke-direct {v0, p1}, Lcom/whatsapp/nf;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/whatsapp/oz;->b:Ljava/io/InputStream;

    .line 30
    iput-object p2, p0, Lcom/whatsapp/oz;->f:[Ljava/lang/String;

    .line 86
    return-void
.end method

.method private static a(Ljava/io/InputStream;)I
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 100
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0
.end method

.method private a(IZ)V
    .locals 8
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x4

    sget-boolean v3, Lcom/whatsapp/nz;->b:Z

    .line 45
    iget-object v0, p0, Lcom/whatsapp/oz;->a:Lcom/whatsapp/g1;

    if-nez v0, :cond_0

    .line 149
    new-instance v0, Lcom/whatsapp/bg;

    sget-object v1, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :cond_0
    add-int/lit8 v4, p1, -0x4

    .line 63
    new-array v5, v1, [B

    .line 135
    if-eqz p2, :cond_1

    .line 33
    iget-object v0, p0, Lcom/whatsapp/oz;->d:[B

    invoke-static {v0, v2, v5, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz v3, :cond_5

    .line 143
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/oz;->d:[B

    add-int/lit8 v6, p1, -0x4

    invoke-static {v0, v6, v5, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v2

    .line 34
    :goto_0
    iget-object v6, p0, Lcom/whatsapp/oz;->a:Lcom/whatsapp/g1;

    iget-object v7, p0, Lcom/whatsapp/oz;->d:[B

    invoke-interface {v6, v7, v0, v4}, Lcom/whatsapp/g1;->b([BII)V

    .line 145
    iget-object v4, p0, Lcom/whatsapp/oz;->a:Lcom/whatsapp/g1;

    invoke-interface {v4}, Lcom/whatsapp/g1;->b()[B

    move-result-object v4

    .line 87
    :cond_2
    if-ge v2, v1, :cond_4

    .line 152
    aget-byte v6, v5, v2

    aget-byte v7, v4, v2

    if-eq v6, v7, :cond_3

    .line 58
    new-instance v0, Lcom/whatsapp/bg;

    sget-object v2, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    aget-object v1, v2, v1

    invoke-direct {v0, v1}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11
    :cond_3
    add-int/lit8 v2, v2, 0x1

    if-eqz v3, :cond_2

    .line 120
    :cond_4
    iget-object v1, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    int-to-long v2, v0

    invoke-virtual {v1, v2, v3}, Ljava/io/InputStream;->skip(J)J

    .line 55
    return-void

    :cond_5
    move v0, v1

    goto :goto_0
.end method

.method private static a([BILjava/io/InputStream;)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    .line 140
    const/4 v0, 0x0

    .line 15
    :cond_0
    if-ge v0, p1, :cond_1

    .line 77
    sub-int v2, p1, v0

    invoke-virtual {p2, p0, v0, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    add-int/2addr v0, v2

    if-eqz v1, :cond_0

    .line 8
    :cond_1
    return-void
.end method

.method private static a([BLjava/io/InputStream;)V
    .locals 1
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 6
    array-length v0, p0

    invoke-static {p0, v0, p1}, Lcom/whatsapp/oz;->a([BILjava/io/InputStream;)V

    .line 60
    return-void
.end method

.method private a(I)Z
    .locals 1
    .parameter

    .prologue
    .line 129
    const/16 v0, 0xf8

    if-eq p1, v0, :cond_0

    if-eqz p1, :cond_0

    const/16 v0, 0xf9

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static b(Ljava/io/InputStream;)I
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 146
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 32
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 69
    shl-int/lit8 v0, v0, 0x8

    add-int/2addr v0, v1

    .line 2
    return v0
.end method

.method private b()Lcom/whatsapp/c1;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 141
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 150
    invoke-direct {p0, v0}, Lcom/whatsapp/oz;->d(I)I

    move-result v0

    .line 85
    iget-object v1, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 117
    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 126
    const/4 v0, 0x0

    .line 128
    :goto_0
    return-object v0

    .line 92
    :cond_0
    invoke-direct {p0, v1}, Lcom/whatsapp/oz;->e(I)Ljava/lang/String;

    move-result-object v1

    .line 110
    if-eqz v0, :cond_1

    if-nez v1, :cond_2

    .line 113
    :cond_1
    new-instance v0, Lcom/whatsapp/bg;

    sget-object v1, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-virtual {p0}, Lcom/whatsapp/oz;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 93
    :cond_2
    add-int/lit8 v2, v0, -0x2

    rem-int/lit8 v3, v0, 0x2

    add-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    .line 127
    invoke-direct {p0, v2}, Lcom/whatsapp/oz;->b(I)[Lcom/whatsapp/w0;

    move-result-object v2

    .line 108
    rem-int/lit8 v0, v0, 0x2

    const/4 v3, 0x1

    if-ne v0, v3, :cond_3

    .line 101
    new-instance v0, Lcom/whatsapp/c1;

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/c1;-><init>(Ljava/lang/String;[Lcom/whatsapp/w0;)V

    goto :goto_0

    .line 61
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v3

    .line 115
    invoke-direct {p0, v3}, Lcom/whatsapp/oz;->a(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 62
    new-instance v0, Lcom/whatsapp/c1;

    invoke-direct {p0, v3}, Lcom/whatsapp/oz;->c(I)[Lcom/whatsapp/c1;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/whatsapp/c1;-><init>(Ljava/lang/String;[Lcom/whatsapp/w0;[Lcom/whatsapp/c1;)V

    goto :goto_0

    .line 78
    :cond_4
    const/16 v0, 0xfc

    if-ne v3, v0, :cond_5

    .line 151
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/whatsapp/oz;->a(Ljava/io/InputStream;)I

    move-result v0

    .line 83
    new-array v3, v0, [B

    .line 121
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v3, v0}, Lcom/whatsapp/oz;->a([BLjava/io/InputStream;)V

    .line 112
    new-instance v0, Lcom/whatsapp/c1;

    invoke-direct {v0, v1, v2, v3}, Lcom/whatsapp/c1;-><init>(Ljava/lang/String;[Lcom/whatsapp/w0;[B)V

    goto :goto_0

    .line 89
    :cond_5
    const/16 v0, 0xfd

    if-ne v3, v0, :cond_6

    .line 75
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/whatsapp/oz;->c(Ljava/io/InputStream;)I

    move-result v0

    .line 48
    new-array v3, v0, [B

    .line 122
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v3, v0}, Lcom/whatsapp/oz;->a([BLjava/io/InputStream;)V

    .line 118
    new-instance v0, Lcom/whatsapp/c1;

    invoke-direct {v0, v1, v2, v3}, Lcom/whatsapp/c1;-><init>(Ljava/lang/String;[Lcom/whatsapp/w0;[B)V

    goto :goto_0

    .line 128
    :cond_6
    new-instance v0, Lcom/whatsapp/c1;

    invoke-direct {p0, v3}, Lcom/whatsapp/oz;->e(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/whatsapp/c1;-><init>(Ljava/lang/String;[Lcom/whatsapp/w0;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(I)[Lcom/whatsapp/w0;
    .locals 6
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    .line 16
    new-array v2, p1, [Lcom/whatsapp/w0;

    .line 7
    const/4 v0, 0x0

    :cond_0
    if-ge v0, p1, :cond_1

    .line 29
    invoke-direct {p0}, Lcom/whatsapp/oz;->d()Ljava/lang/String;

    move-result-object v3

    .line 133
    invoke-direct {p0}, Lcom/whatsapp/oz;->d()Ljava/lang/String;

    move-result-object v4

    .line 5
    new-instance v5, Lcom/whatsapp/w0;

    invoke-direct {v5, v3, v4}, Lcom/whatsapp/w0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v2, v0

    .line 111
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 28
    :cond_1
    return-object v2
.end method

.method private static c(Ljava/io/InputStream;)I
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 103
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    and-int/lit8 v0, v0, 0xf

    .line 91
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 70
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 24
    shl-int/lit8 v0, v0, 0x10

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    .line 35
    return v0
.end method

.method private c(I)[Lcom/whatsapp/c1;
    .locals 5
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    .line 41
    invoke-direct {p0, p1}, Lcom/whatsapp/oz;->d(I)I

    move-result v2

    .line 105
    new-array v3, v2, [Lcom/whatsapp/c1;

    .line 144
    const/4 v0, 0x0

    :cond_0
    if-ge v0, v2, :cond_1

    .line 107
    invoke-direct {p0}, Lcom/whatsapp/oz;->b()Lcom/whatsapp/c1;

    move-result-object v4

    aput-object v4, v3, v0

    .line 18
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 124
    :cond_1
    return-object v3
.end method

.method private d(I)I
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    .line 53
    if-nez p1, :cond_0

    .line 1
    const/4 v0, 0x0

    if-eqz v1, :cond_3

    .line 4
    :cond_0
    const/16 v0, 0xf8

    if-ne p1, v0, :cond_1

    .line 90
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/whatsapp/oz;->a(Ljava/io/InputStream;)I

    move-result v0

    if-eqz v1, :cond_3

    .line 74
    :cond_1
    const/16 v0, 0xf9

    if-ne p1, v0, :cond_2

    .line 82
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/whatsapp/oz;->b(Ljava/io/InputStream;)I

    move-result v0

    if-eqz v1, :cond_3

    .line 102
    :cond_2
    new-instance v0, Lcom/whatsapp/bg;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whatsapp/oz;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_3
    return v0
.end method

.method private d()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    .line 142
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whatsapp/oz;->e(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(I)Ljava/lang/String;
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 147
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 14
    new-instance v0, Lcom/whatsapp/bg;

    sget-object v1, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {p0}, Lcom/whatsapp/oz;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 43
    :cond_0
    const/4 v0, 0x4

    if-le p1, v0, :cond_2

    const/16 v0, 0xf5

    if-ge p1, v0, :cond_2

    .line 104
    invoke-direct {p0, p1}, Lcom/whatsapp/oz;->f(I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0

    .line 136
    :cond_2
    sparse-switch p1, :sswitch_data_0

    .line 123
    new-instance v0, Lcom/whatsapp/bg;

    sget-object v1, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {p0}, Lcom/whatsapp/oz;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 80
    :sswitch_0
    const/4 v0, 0x0

    goto :goto_0

    .line 9
    :sswitch_1
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/whatsapp/oz;->a(Ljava/io/InputStream;)I

    move-result v0

    .line 49
    new-array v1, v0, [B

    .line 139
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v1, v0}, Lcom/whatsapp/oz;->a([BLjava/io/InputStream;)V

    .line 51
    new-instance v0, Ljava/lang/String;

    sget-object v2, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_0

    .line 65
    :sswitch_2
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/whatsapp/oz;->c(Ljava/io/InputStream;)I

    move-result v0

    .line 125
    new-array v1, v0, [B

    .line 138
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-static {v1, v0}, Lcom/whatsapp/oz;->a([BLjava/io/InputStream;)V

    .line 96
    new-instance v0, Ljava/lang/String;

    sget-object v2, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_0

    .line 22
    :sswitch_3
    invoke-direct {p0}, Lcom/whatsapp/oz;->d()Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-direct {p0}, Lcom/whatsapp/oz;->d()Ljava/lang/String;

    move-result-object v0

    .line 46
    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "@"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 50
    :cond_3
    if-nez v0, :cond_1

    .line 52
    new-instance v0, Lcom/whatsapp/bg;

    sget-object v1, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {p0}, Lcom/whatsapp/oz;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 136
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xfa -> :sswitch_3
        0xfc -> :sswitch_1
        0xfd -> :sswitch_2
    .end sparse-switch
.end method

.method private f(I)Ljava/lang/String;
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    .line 23
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/whatsapp/oz;->f:[Ljava/lang/String;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/whatsapp/oz;->f:[Ljava/lang/String;

    aget-object v0, v0, p1

    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    if-eqz v1, :cond_1

    .line 72
    :cond_0
    const/4 v0, 0x0

    .line 17
    :cond_1
    if-nez v0, :cond_2

    .line 54
    new-instance v0, Lcom/whatsapp/bg;

    sget-object v1, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {p0}, Lcom/whatsapp/oz;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 88
    :cond_2
    return-object v0
.end method

.method private g(I)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 134
    iget-object v0, p0, Lcom/whatsapp/oz;->d:[B

    array-length v0, v0

    if-ge v0, p1, :cond_0

    .line 57
    iget-object v0, p0, Lcom/whatsapp/oz;->d:[B

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x3

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 153
    new-array v0, v0, [B

    iput-object v0, p0, Lcom/whatsapp/oz;->d:[B

    .line 39
    :cond_0
    iput p1, p0, Lcom/whatsapp/oz;->e:I

    .line 71
    iget-object v0, p0, Lcom/whatsapp/oz;->d:[B

    iget-object v1, p0, Lcom/whatsapp/oz;->b:Ljava/io/InputStream;

    invoke-static {v0, p1, v1}, Lcom/whatsapp/oz;->a([BILjava/io/InputStream;)V

    .line 13
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Lcom/whatsapp/oz;->d:[B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p1}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    iput-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    .line 84
    return-void
.end method


# virtual methods
.method public a()Lcom/whatsapp/c1;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 97
    iget-object v0, p0, Lcom/whatsapp/oz;->b:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/whatsapp/rz;->a(Ljava/io/InputStream;)I

    move-result v0

    .line 130
    invoke-static {v0}, Lcom/whatsapp/rz;->a(I)Z

    move-result v1

    .line 95
    invoke-static {v0}, Lcom/whatsapp/rz;->b(I)I

    move-result v2

    .line 66
    invoke-direct {p0, v2}, Lcom/whatsapp/oz;->g(I)V

    .line 40
    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/whatsapp/rz;->c(I)Z

    move-result v0

    invoke-direct {p0, v2, v0}, Lcom/whatsapp/oz;->a(IZ)V

    .line 37
    :cond_0
    invoke-direct {p0}, Lcom/whatsapp/oz;->b()Lcom/whatsapp/c1;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/whatsapp/g1;)V
    .locals 0
    .parameter

    .prologue
    .line 27
    iput-object p1, p0, Lcom/whatsapp/oz;->a:Lcom/whatsapp/g1;

    .line 12
    return-void
.end method

.method public b()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/whatsapp/oz;->b:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/whatsapp/rz;->a(Ljava/io/InputStream;)I

    move-result v0

    .line 131
    invoke-static {v0}, Lcom/whatsapp/rz;->b(I)I

    move-result v0

    .line 94
    invoke-direct {p0, v0}, Lcom/whatsapp/oz;->g(I)V

    .line 3
    iget-object v0, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    .line 119
    invoke-direct {p0, v0}, Lcom/whatsapp/oz;->d(I)I

    move-result v0

    .line 25
    iget-object v1, p0, Lcom/whatsapp/oz;->c:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 10
    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    .line 148
    new-instance v0, Lcom/whatsapp/bg;

    sget-object v1, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {p0}, Lcom/whatsapp/oz;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_0
    add-int/lit8 v1, v0, -0x2

    rem-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    .line 47
    invoke-direct {p0, v0}, Lcom/whatsapp/oz;->b(I)[Lcom/whatsapp/w0;

    .line 132
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 5

    .prologue
    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    .line 26
    iget-object v0, p0, Lcom/whatsapp/oz;->d:[B

    if-nez v0, :cond_0

    sget-object v0, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    .line 36
    :goto_0
    return-object v0

    .line 38
    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 137
    sget-object v0, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/16 v3, 0xa

    aget-object v0, v0, v3

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v3, p0, Lcom/whatsapp/oz;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v3, 0x3c

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 79
    const/4 v0, 0x0

    :cond_1
    iget v3, p0, Lcom/whatsapp/oz;->e:I

    if-ge v0, v3, :cond_3

    .line 81
    if-lez v0, :cond_2

    .line 109
    sget-object v3, Lcom/whatsapp/oz;->z:[Ljava/lang/String;

    const/16 v4, 0xb

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 59
    :cond_2
    iget-object v3, p0, Lcom/whatsapp/oz;->d:[B

    aget-byte v3, v3, v0

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 67
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_1

    .line 44
    :cond_3
    const/16 v0, 0x3e

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
