.class public Lcom/whatsapp/pz;
.super Ljava/lang/Object;
.source "pz.java"

# interfaces
.implements Lcom/whatsapp/f1;


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field a:Lcom/whatsapp/g1;

.field b:I

.field c:I

.field d:Ljava/util/Hashtable;

.field e:Ljava/io/OutputStream;

.field f:Lcom/whatsapp/kf;

.field g:I

.field h:[[B


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x6a

    const/4 v2, 0x7

    const/4 v3, 0x1

    const/4 v6, 0x0

    const/16 v1, 0x2f

    const/4 v0, 0x5

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "]br\u0005Z]dd"

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

    const-string v0, "[h"

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

    aput-object v0, v9, v3

    const/4 v10, 0x2

    const-string v0, "zSGG\u0017"

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

    const-string v0, "Fiw\u000bCFc!\u001e@Dbo"

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

    const/4 v8, 0x4

    const-string v0, "mrg\u000cJ]\'u\u0005@\u000fk`\u0018HJ=!"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_4
    if-gt v6, v7, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/pz;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v1

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_5

    :pswitch_1
    move v0, v2

    goto :goto_5

    :pswitch_2
    move v0, v3

    goto :goto_5

    :pswitch_3
    move v0, v4

    goto :goto_5

    :cond_1
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v1

    :goto_6
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_6

    :pswitch_5
    move v0, v2

    goto :goto_6

    :pswitch_6
    move v0, v3

    goto :goto_6

    :pswitch_7
    move v0, v4

    goto :goto_6

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v1

    :goto_7
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_7

    :pswitch_9
    move v0, v2

    goto :goto_7

    :pswitch_a
    move v0, v3

    goto :goto_7

    :pswitch_b
    move v0, v4

    goto :goto_7

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v1

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_8

    :pswitch_d
    move v0, v2

    goto :goto_8

    :pswitch_e
    move v0, v3

    goto :goto_8

    :pswitch_f
    move v0, v4

    goto :goto_8

    :cond_4
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v1

    :goto_9
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_9

    :pswitch_11
    move v0, v2

    goto :goto_9

    :pswitch_12
    move v0, v3

    goto :goto_9

    :pswitch_13
    move v0, v4

    goto :goto_9

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
.end method

.method public constructor <init>(Ljava/io/OutputStream;[Ljava/lang/String;)V
    .locals 5
    .parameter
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const/4 v0, 0x0

    check-cast v0, [[B

    iput-object v0, p0, Lcom/whatsapp/pz;->h:[[B

    .line 55
    iput-object p1, p0, Lcom/whatsapp/pz;->e:Ljava/io/OutputStream;

    .line 9
    new-instance v0, Lcom/whatsapp/kf;

    invoke-direct {v0}, Lcom/whatsapp/kf;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    .line 64
    invoke-direct {p0}, Lcom/whatsapp/pz;->b()V

    .line 103
    new-instance v0, Ljava/util/Hashtable;

    array-length v2, p2

    mul-int/lit8 v2, v2, 0x4

    div-int/lit8 v2, v2, 0x3

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v0, v2}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lcom/whatsapp/pz;->d:Ljava/util/Hashtable;

    .line 23
    const/4 v0, 0x0

    :cond_0
    array-length v2, p2

    if-ge v0, v2, :cond_1

    .line 37
    aget-object v2, p2, v0

    if-nez v2, :cond_2

    .line 15
    :goto_0
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 30
    :cond_1
    return-void

    .line 21
    :cond_2
    iget-object v2, p0, Lcom/whatsapp/pz;->d:Ljava/util/Hashtable;

    aget-object v3, p2, v0

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v3, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method private a(I)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 102
    const/16 v0, 0xf5

    if-ge p1, v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    int-to-byte v1, p1

    invoke-virtual {v0, v1}, Lcom/whatsapp/kf;->write(I)V

    sget-boolean v0, Lcom/whatsapp/nz;->b:Z

    if-eqz v0, :cond_1

    .line 43
    :cond_0
    const/16 v0, 0x1f4

    if-gt p1, v0, :cond_1

    .line 24
    new-instance v0, Ljava/io/IOException;

    sget-object v1, Lcom/whatsapp/pz;->z:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :cond_1
    return-void
.end method

.method private static a(Ljava/io/OutputStream;I)V
    .locals 1
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 19
    const v0, 0xff00

    and-int/2addr v0, p1

    shr-int/lit8 v0, v0, 0x8

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 85
    and-int/lit16 v0, p1, 0xff

    shr-int/lit8 v0, v0, 0x0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 27
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    .line 66
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/pz;->d:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 54
    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->a(I)V

    if-eqz v1, :cond_2

    .line 121
    :cond_0
    const/16 v0, 0x40

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 132
    const/4 v2, 0x1

    if-ge v0, v2, :cond_1

    .line 112
    sget-object v2, Lcom/whatsapp/pz;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/whatsapp/pz;->a([B)V

    if-eqz v1, :cond_2

    .line 94
    :cond_1
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 108
    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 92
    invoke-direct {p0, v0, v1}, Lcom/whatsapp/pz;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    :cond_2
    return-void

    .line 124
    :catch_0
    move-exception v0

    .line 83
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private declared-synchronized a(Z)V
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 38
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/pz;->a:Lcom/whatsapp/g1;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, p1, v0}, Lcom/whatsapp/pz;->a(ZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    monitor-exit p0

    return-void

    .line 38
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized a(ZZ)V
    .locals 7
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 77
    monitor-enter p0

    :try_start_0
    iget v1, p0, Lcom/whatsapp/pz;->g:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/whatsapp/pz;->g:I

    .line 45
    iget-object v1, p0, Lcom/whatsapp/pz;->h:[[B

    if-eqz v1, :cond_0

    .line 89
    invoke-direct {p0}, Lcom/whatsapp/pz;->e()V

    .line 95
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v1}, Lcom/whatsapp/kf;->a()I

    move-result v1

    iget v2, p0, Lcom/whatsapp/pz;->b:I

    iget v3, p0, Lcom/whatsapp/pz;->c:I

    add-int/2addr v2, v3

    sub-int v2, v1, v2

    .line 153
    if-eqz p2, :cond_6

    .line 82
    add-int/lit8 v1, v2, 0x4

    .line 29
    :goto_0
    const v3, 0xfffff

    and-int/2addr v3, v1

    if-eq v3, v1, :cond_1

    .line 131
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/pz;->z:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 47
    :cond_1
    if-eqz p2, :cond_2

    .line 100
    :try_start_1
    iget-object v3, p0, Lcom/whatsapp/pz;->a:Lcom/whatsapp/g1;

    iget-object v4, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v4}, Lcom/whatsapp/kf;->b()[B

    move-result-object v4

    iget v5, p0, Lcom/whatsapp/pz;->b:I

    iget v6, p0, Lcom/whatsapp/pz;->c:I

    add-int/2addr v5, v6

    invoke-interface {v3, v4, v5, v2}, Lcom/whatsapp/g1;->a([BII)V

    .line 71
    iget-object v2, p0, Lcom/whatsapp/pz;->a:Lcom/whatsapp/g1;

    invoke-interface {v2}, Lcom/whatsapp/g1;->a()[B

    move-result-object v2

    .line 130
    iget-object v3, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/4 v4, 0x0

    const/4 v5, 0x4

    invoke-virtual {v3, v2, v4, v5}, Lcom/whatsapp/kf;->write([BII)V

    .line 2
    :cond_2
    iget-object v2, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v2}, Lcom/whatsapp/kf;->b()[B

    move-result-object v2

    .line 31
    if-eqz p2, :cond_3

    const/4 v0, 0x1

    .line 49
    :cond_3
    iget-object v3, p0, Lcom/whatsapp/pz;->h:[[B

    if-eqz v3, :cond_4

    .line 97
    iget v3, p0, Lcom/whatsapp/pz;->b:I

    iget v4, p0, Lcom/whatsapp/pz;->c:I

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x2

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/pz;->a([BI)V

    .line 127
    add-int/lit8 v1, v1, 0x2

    .line 115
    or-int/lit8 v0, v0, 0x2

    .line 35
    :cond_4
    iget v3, p0, Lcom/whatsapp/pz;->b:I

    invoke-static {v2, v3, v0, v1}, Lcom/whatsapp/rz;->a([BIII)V

    .line 117
    if-eqz p1, :cond_5

    .line 10
    invoke-direct {p0}, Lcom/whatsapp/pz;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 133
    :cond_5
    monitor-exit p0

    return-void

    :cond_6
    move v1, v2

    goto :goto_0
.end method

.method private a([B)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 6
    array-length v0, p1

    .line 48
    const/16 v1, 0x100

    if-lt v0, v1, :cond_0

    .line 20
    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/16 v2, 0xfd

    invoke-virtual {v1, v2}, Lcom/whatsapp/kf;->write(I)V

    .line 18
    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->d(I)V

    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    if-eqz v1, :cond_1

    .line 57
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/16 v2, 0xfc

    invoke-virtual {v1, v2}, Lcom/whatsapp/kf;->write(I)V

    .line 110
    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->b(I)V

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v0, p1}, Lcom/whatsapp/kf;->write([B)V

    .line 86
    return-void
.end method

.method private a([Lcom/whatsapp/w0;)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget-boolean v1, Lcom/whatsapp/nz;->b:Z

    .line 36
    if-eqz p1, :cond_1

    .line 151
    const/4 v0, 0x0

    :cond_0
    array-length v2, p1

    if-ge v0, v2, :cond_1

    .line 28
    aget-object v2, p1, v0

    iget-object v2, v2, Lcom/whatsapp/w0;->a:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/whatsapp/pz;->a(Ljava/lang/String;)V

    .line 61
    aget-object v2, p1, v0

    iget-object v2, v2, Lcom/whatsapp/w0;->b:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/whatsapp/pz;->a(Ljava/lang/String;)V

    .line 109
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 107
    :cond_1
    return-void
.end method

.method private declared-synchronized b()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    sget-boolean v2, Lcom/whatsapp/nz;->b:Z

    .line 129
    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v1}, Lcom/whatsapp/kf;->a()I

    move-result v1

    iput v1, p0, Lcom/whatsapp/pz;->b:I

    .line 3
    iget-object v1, p0, Lcom/whatsapp/pz;->h:[[B

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    :goto_0
    add-int/lit8 v1, v1, 0x3

    iput v1, p0, Lcom/whatsapp/pz;->c:I

    .line 41
    :cond_0
    iget v1, p0, Lcom/whatsapp/pz;->c:I

    if-ge v0, v1, :cond_1

    .line 76
    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/whatsapp/kf;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 126
    :cond_1
    monitor-exit p0

    return-void

    :cond_2
    move v1, v0

    .line 3
    goto :goto_0

    .line -1
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private b(I)V
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 81
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    and-int/lit16 v1, p1, 0xff

    invoke-virtual {v0, v1}, Lcom/whatsapp/kf;->write(I)V

    .line 148
    return-void
.end method

.method private b(Lcom/whatsapp/c1;)V
    .locals 5
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    sget-boolean v3, Lcom/whatsapp/nz;->b:Z

    .line 140
    iget-object v0, p1, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    if-nez v0, :cond_4

    move v0, v1

    :goto_0
    add-int/lit8 v4, v0, 0x1

    iget-object v0, p1, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    if-nez v0, :cond_5

    move v0, v1

    :goto_1
    add-int/2addr v0, v4

    iget-object v4, p1, Lcom/whatsapp/c1;->d:[B

    if-nez v4, :cond_0

    move v2, v1

    :cond_0
    add-int/2addr v0, v2

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->e(I)V

    .line 25
    iget-object v0, p1, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->a(Ljava/lang/String;)V

    .line 1
    iget-object v0, p1, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->a([Lcom/whatsapp/w0;)V

    .line 51
    iget-object v0, p1, Lcom/whatsapp/c1;->d:[B

    if-eqz v0, :cond_1

    .line 142
    iget-object v0, p1, Lcom/whatsapp/c1;->d:[B

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->a([B)V

    .line 143
    :cond_1
    iget-object v0, p1, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    if-eqz v0, :cond_3

    .line 11
    iget-object v0, p1, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    array-length v0, v0

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->e(I)V

    .line 125
    :cond_2
    iget-object v0, p1, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    array-length v0, v0

    if-ge v1, v0, :cond_3

    .line 111
    iget-object v0, p1, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->b(Lcom/whatsapp/c1;)V

    .line 138
    add-int/lit8 v1, v1, 0x1

    if-eqz v3, :cond_2

    .line 123
    :cond_3
    return-void

    .line 140
    :cond_4
    iget-object v0, p1, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_1
.end method

.method private static b(Ljava/io/OutputStream;I)V
    .locals 1
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 101
    const/high16 v0, 0xf

    and-int/2addr v0, p1

    shr-int/lit8 v0, v0, 0x10

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 144
    const v0, 0xff00

    and-int/2addr v0, p1

    shr-int/lit8 v0, v0, 0x8

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 5
    and-int/lit16 v0, p1, 0xff

    shr-int/lit8 v0, v0, 0x0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    .line 46
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 106
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/16 v1, 0xfa

    invoke-virtual {v0, v1}, Lcom/whatsapp/kf;->write(I)V

    .line 42
    if-eqz p1, :cond_0

    .line 40
    invoke-direct {p0, p1}, Lcom/whatsapp/pz;->a(Ljava/lang/String;)V

    sget-boolean v0, Lcom/whatsapp/nz;->b:Z

    if-eqz v0, :cond_1

    .line 74
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->a(I)V

    .line 13
    :cond_1
    invoke-direct {p0, p2}, Lcom/whatsapp/pz;->a(Ljava/lang/String;)V

    .line 22
    return-void
.end method

.method private declared-synchronized c()V
    .locals 1

    .prologue
    .line 8
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v0}, Lcom/whatsapp/kf;->reset()V

    .line 7
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/pz;->c:I

    .line 93
    const/4 v0, 0x0

    iput v0, p0, Lcom/whatsapp/pz;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    monitor-exit p0

    return-void

    .line 8
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private c(I)V
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 53
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-static {v0, p1}, Lcom/whatsapp/pz;->a(Ljava/io/OutputStream;I)V

    .line 105
    return-void
.end method

.method private declared-synchronized d()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 145
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/pz;->e:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v1}, Lcom/whatsapp/kf;->b()[B

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v3}, Lcom/whatsapp/kf;->a()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 141
    iget-object v0, p0, Lcom/whatsapp/pz;->e:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 152
    invoke-direct {p0}, Lcom/whatsapp/pz;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    monitor-exit p0

    return-void

    .line 145
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private d(I)V
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 136
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-static {v0, p1}, Lcom/whatsapp/pz;->b(Ljava/io/OutputStream;I)V

    .line 32
    return-void
.end method

.method private e()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 120
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v0}, Lcom/whatsapp/kf;->a()I

    move-result v0

    iget v1, p0, Lcom/whatsapp/pz;->b:I

    iget v2, p0, Lcom/whatsapp/pz;->c:I

    add-int/2addr v1, v2

    sub-int/2addr v0, v1

    .line 58
    iget v1, p0, Lcom/whatsapp/pz;->g:I

    iget-object v2, p0, Lcom/whatsapp/pz;->h:[[B

    array-length v2, v2

    rem-int/2addr v1, v2

    .line 80
    add-int/lit8 v2, v0, 0x5

    new-array v2, v2, [B

    .line 79
    const/4 v3, 0x0

    const/4 v4, 0x2

    add-int/lit8 v5, v0, 0x2

    invoke-static {v2, v3, v4, v5}, Lcom/whatsapp/rz;->a([BIII)V

    .line 122
    const/4 v3, 0x3

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/pz;->a([BI)V

    .line 63
    iget-object v3, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v3}, Lcom/whatsapp/kf;->b()[B

    move-result-object v3

    iget v4, p0, Lcom/whatsapp/pz;->b:I

    iget v5, p0, Lcom/whatsapp/pz;->c:I

    add-int/2addr v4, v5

    const/4 v5, 0x5

    invoke-static {v3, v4, v2, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    iget-object v0, p0, Lcom/whatsapp/pz;->h:[[B

    aput-object v2, v0, v1

    .line 150
    return-void
.end method

.method private e(I)V
    .locals 3
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget-boolean v0, Lcom/whatsapp/nz;->b:Z

    .line 34
    if-nez p1, :cond_0

    .line 65
    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/whatsapp/kf;->write(I)V

    if-eqz v0, :cond_2

    .line 113
    :cond_0
    const/16 v1, 0x100

    if-ge p1, v1, :cond_1

    .line 12
    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/16 v2, 0xf8

    invoke-virtual {v1, v2}, Lcom/whatsapp/kf;->write(I)V

    .line 62
    invoke-direct {p0, p1}, Lcom/whatsapp/pz;->b(I)V

    if-eqz v0, :cond_2

    .line 114
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/16 v1, 0xf9

    invoke-virtual {v0, v1}, Lcom/whatsapp/kf;->write(I)V

    .line 135
    invoke-direct {p0, p1}, Lcom/whatsapp/pz;->c(I)V

    .line 154
    :cond_2
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 139
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/whatsapp/pz;->b()V

    .line 17
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->e(I)V

    .line 84
    iget-object v0, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/whatsapp/kf;->write(I)V

    .line 155
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit p0

    return-void

    .line 139
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/whatsapp/c1;)V
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 33
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/whatsapp/pz;->a(Lcom/whatsapp/c1;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    monitor-exit p0

    return-void

    .line 33
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/whatsapp/c1;Z)V
    .locals 1
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 78
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/whatsapp/pz;->b()V

    .line 56
    if-nez p1, :cond_0

    .line 119
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/whatsapp/pz;->a(ZZ)V

    sget-boolean v0, Lcom/whatsapp/nz;->b:Z

    if-eqz v0, :cond_1

    .line 146
    :cond_0
    invoke-direct {p0, p1}, Lcom/whatsapp/pz;->b(Lcom/whatsapp/c1;)V

    .line 60
    invoke-direct {p0, p2}, Lcom/whatsapp/pz;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_1
    monitor-exit p0

    return-void

    .line 78
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/whatsapp/g1;)V
    .locals 1
    .parameter

    .prologue
    .line 90
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/whatsapp/pz;->a:Lcom/whatsapp/g1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    monitor-exit p0

    return-void

    .line 90
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 91
    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lcom/whatsapp/pz;->c()V

    .line 87
    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    .line 99
    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    invoke-virtual {v1, v0}, Lcom/whatsapp/kf;->write([B)V

    .line 98
    invoke-direct {p0}, Lcom/whatsapp/pz;->b()V

    .line 68
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/whatsapp/w0;

    const/4 v1, 0x0

    new-instance v2, Lcom/whatsapp/w0;

    sget-object v3, Lcom/whatsapp/pz;->z:[Ljava/lang/String;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-direct {v2, v3, p1}, Lcom/whatsapp/w0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/whatsapp/w0;

    sget-object v3, Lcom/whatsapp/pz;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-direct {v2, v3, p2}, Lcom/whatsapp/w0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    .line 44
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v1}, Lcom/whatsapp/pz;->e(I)V

    .line 69
    iget-object v1, p0, Lcom/whatsapp/pz;->f:Lcom/whatsapp/kf;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/whatsapp/kf;->write(I)V

    .line 59
    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->a([Lcom/whatsapp/w0;)V

    .line 72
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whatsapp/pz;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    monitor-exit p0

    return-void

    .line 91
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 87
    nop

    :array_0
    .array-data 0x1
        0x57t
        0x41t
        0x1t
        0x2t
    .end array-data
.end method

.method public a([BI)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 149
    iget v0, p0, Lcom/whatsapp/pz;->g:I

    const v1, 0xff00

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    aput-byte v0, p1, p2

    .line 156
    add-int/lit8 v0, p2, 0x1

    iget v1, p0, Lcom/whatsapp/pz;->g:I

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v1, v1, 0x0

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 128
    return-void
.end method
