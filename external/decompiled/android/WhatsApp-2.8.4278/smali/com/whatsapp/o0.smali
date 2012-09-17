.class Lcom/whatsapp/o0;
.super Lcom/whatsapp/xz;
.source "o0.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/b1;

.field final b:Lcom/whatsapp/qz;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v1, 0x72

    const/16 v3, 0x5e

    const/16 v2, 0x5d

    const/16 v4, 0x38

    const/4 v6, 0x0

    const/4 v0, 0x7

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0016\u000c-2Q\u0011\u0018);"

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

    const-string v0, "\u0007\u000b1"

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

    const-string v0, "\u001f\u001c97Y"

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

    const-string v0, "\u001f\u00100;L\u000b\t8"

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

    const-string v0, "\u0000\u001c.+U\u0017"

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

    const-string v0, "\u0001\u0010\';"

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

    const/4 v8, 0x6

    const-string v0, "\u0006\u0000-;"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_6
    if-gt v6, v7, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/o0;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_7
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_7

    :pswitch_1
    const/16 v0, 0x79

    goto :goto_7

    :pswitch_2
    move v0, v2

    goto :goto_7

    :pswitch_3
    move v0, v3

    goto :goto_7

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_8

    :pswitch_5
    const/16 v0, 0x79

    goto :goto_8

    :pswitch_6
    move v0, v2

    goto :goto_8

    :pswitch_7
    move v0, v3

    goto :goto_8

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_9

    :pswitch_9
    const/16 v0, 0x79

    goto :goto_9

    :pswitch_a
    move v0, v2

    goto :goto_9

    :pswitch_b
    move v0, v3

    goto :goto_9

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_a

    :pswitch_d
    const/16 v0, 0x79

    goto :goto_a

    :pswitch_e
    move v0, v2

    goto :goto_a

    :pswitch_f
    move v0, v3

    goto :goto_a

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_b

    :pswitch_11
    const/16 v0, 0x79

    goto :goto_b

    :pswitch_12
    move v0, v2

    goto :goto_b

    :pswitch_13
    move v0, v3

    goto :goto_b

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_c

    :pswitch_15
    const/16 v0, 0x79

    goto :goto_c

    :pswitch_16
    move v0, v2

    goto :goto_c

    :pswitch_17
    move v0, v3

    goto :goto_c

    :cond_6
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_d
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_d

    :pswitch_19
    const/16 v0, 0x79

    goto :goto_d

    :pswitch_1a
    move v0, v2

    goto :goto_d

    :pswitch_1b
    move v0, v3

    goto :goto_d

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
.end method

.method constructor <init>(Lcom/whatsapp/qz;Lcom/whatsapp/b1;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/o0;->b:Lcom/whatsapp/qz;

    iput-object p2, p0, Lcom/whatsapp/o0;->a:Lcom/whatsapp/b1;

    invoke-direct {p0}, Lcom/whatsapp/xz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .parameter

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/o0;->a:Lcom/whatsapp/b1;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/whatsapp/o0;->a:Lcom/whatsapp/b1;

    invoke-interface {v0, p1}, Lcom/whatsapp/b1;->a(I)V

    .line 18
    :cond_0
    return-void
.end method

.method public a(Lcom/whatsapp/c1;Ljava/lang/String;)V
    .locals 7
    .parameter
    .parameter

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/nz;->b:Z

    .line 12
    sget-object v0, Lcom/whatsapp/o0;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v0, v0, v3

    invoke-virtual {p1, v0}, Lcom/whatsapp/c1;->b(Ljava/lang/String;)Lcom/whatsapp/c1;

    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 5
    sget-object v3, Lcom/whatsapp/o0;->z:[Ljava/lang/String;

    aget-object v3, v3, v6

    invoke-virtual {v0, v3}, Lcom/whatsapp/c1;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 27
    sget-object v4, Lcom/whatsapp/o0;->z:[Ljava/lang/String;

    const/4 v5, 0x4

    aget-object v4, v4, v5

    invoke-virtual {v0, v4}, Lcom/whatsapp/c1;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    if-nez v0, :cond_9

    move v0, v1

    .line 30
    :goto_0
    iget-object v4, p0, Lcom/whatsapp/o0;->a:Lcom/whatsapp/b1;

    if-eqz v4, :cond_0

    .line 26
    iget-object v4, p0, Lcom/whatsapp/o0;->a:Lcom/whatsapp/b1;

    invoke-interface {v4, v3, v0}, Lcom/whatsapp/b1;->a(Ljava/lang/String;I)V

    .line 20
    :cond_0
    if-eqz v2, :cond_8

    .line 16
    :cond_1
    sget-object v0, Lcom/whatsapp/o0;->z:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Lcom/whatsapp/c1;->b(Ljava/lang/String;)Lcom/whatsapp/c1;

    move-result-object v0

    .line 10
    if-eqz v0, :cond_8

    iget-object v3, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    if-eqz v3, :cond_8

    .line 11
    new-instance v3, Lcom/whatsapp/a1;

    invoke-direct {v3}, Lcom/whatsapp/a1;-><init>()V

    .line 22
    :cond_2
    iget-object v4, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    array-length v4, v4

    if-ge v1, v4, :cond_7

    .line 2
    sget-object v4, Lcom/whatsapp/o0;->z:[Ljava/lang/String;

    const/4 v5, 0x6

    aget-object v4, v4, v5

    iget-object v5, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    aget-object v5, v5, v1

    iget-object v5, v5, Lcom/whatsapp/w0;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 25
    iget-object v4, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    aget-object v4, v4, v1

    iget-object v4, v4, Lcom/whatsapp/w0;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/whatsapp/sz;->a(Ljava/lang/String;)B

    move-result v4

    iput-byte v4, v3, Lcom/whatsapp/a1;->a:B

    if-eqz v2, :cond_6

    .line 31
    :cond_3
    sget-object v4, Lcom/whatsapp/o0;->z:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v4, v4, v5

    iget-object v5, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    aget-object v5, v5, v1

    iget-object v5, v5, Lcom/whatsapp/w0;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 28
    iget-object v4, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    aget-object v4, v4, v1

    iget-object v4, v4, Lcom/whatsapp/w0;->b:Ljava/lang/String;

    iput-object v4, v3, Lcom/whatsapp/a1;->b:Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 6
    :cond_4
    sget-object v4, Lcom/whatsapp/o0;->z:[Ljava/lang/String;

    aget-object v4, v4, v6

    iget-object v5, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    aget-object v5, v5, v1

    iget-object v5, v5, Lcom/whatsapp/w0;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 7
    iget-object v4, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    aget-object v4, v4, v1

    iget-object v4, v4, Lcom/whatsapp/w0;->b:Ljava/lang/String;

    iput-object v4, v3, Lcom/whatsapp/a1;->c:Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 24
    :cond_5
    sget-object v4, Lcom/whatsapp/o0;->z:[Ljava/lang/String;

    const/4 v5, 0x5

    aget-object v4, v4, v5

    iget-object v5, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    aget-object v5, v5, v1

    iget-object v5, v5, Lcom/whatsapp/w0;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 8
    :try_start_0
    iget-object v4, v0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    aget-object v4, v4, v1

    iget-object v4, v4, Lcom/whatsapp/w0;->b:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, v3, Lcom/whatsapp/a1;->d:J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 32
    :cond_6
    :goto_1
    add-int/lit8 v1, v1, 0x1

    if-eqz v2, :cond_2

    .line 21
    :cond_7
    iget-object v0, p0, Lcom/whatsapp/o0;->a:Lcom/whatsapp/b1;

    if-eqz v0, :cond_8

    .line 3
    iget-object v0, p0, Lcom/whatsapp/o0;->a:Lcom/whatsapp/b1;

    invoke-interface {v0, v3}, Lcom/whatsapp/b1;->a(Lcom/whatsapp/a1;)V

    .line 17
    :cond_8
    return-void

    .line 13
    :cond_9
    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    goto/16 :goto_0

    .line 14
    :catch_0
    move-exception v0

    move v0, v1

    .line 19
    goto/16 :goto_0

    .line 23
    :catch_1
    move-exception v4

    goto :goto_1
.end method
