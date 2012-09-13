.class public Lcom/whatsapp/pb;
.super Landroid/os/AsyncTask;
.source "pb.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static j:Ljava/util/Timer;

.field private static final z:[Ljava/lang/String;


# instance fields
.field private final a:Lcom/whatsapp/sz;

.field private final b:Lcom/whatsapp/MediaData;

.field private final c:J

.field private d:I

.field private e:Lcom/whatsapp/at;

.field private f:Lcom/whatsapp/bj;

.field private g:Z

.field private h:Z

.field private i:Lcom/whatsapp/a1;

.field private k:Ljava/util/TimerTask;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v1, 0x47

    const/16 v2, 0x2a

    const/16 v4, 0x1c

    const/16 v3, 0xe

    const/4 v6, 0x0

    const/16 v0, 0x9

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "*Oju\n2Zbs\n#\u0005{n\u0007hO|n\u00045\n"

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

    const-string v0, "*Oju\n2Zbs\n#\u0005{n\u0007hDa1\u0003(Yz"

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

    const-string v0, "*C}o\u0002)M.w\u000e>Y.u\u0005g_~p\u0004&N.n\u000e4_bh"

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

    const-string v0, "*Oju\n2Zbs\n#\u0005}h\n5^!x\u0002 O}h\u000e5\n"

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

    const-string v0, "\u0014bO1Yr\u001c"

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

    const-string v0, "*Oju\n2Zbs\n#\u0005mp\u00044O."

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

    const-string v0, "*Oju\n2Zbs\n#\u0005gsF\"X|s\u0019g"

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

    const-string v0, "*Oju\n2Zbs\n#\u0005fh\u001f7O|n\u00045\n"

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

    const/16 v8, 0x8

    const-string v0, "*Oju\n2Zbs\n#\u0005kn\u0019(X."

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_8
    if-gt v6, v7, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    .line 112
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lcom/whatsapp/pb;->j:Ljava/util/Timer;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x6b

    :goto_9
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_9

    :pswitch_1
    move v0, v2

    goto :goto_9

    :pswitch_2
    move v0, v3

    goto :goto_9

    :pswitch_3
    move v0, v4

    goto :goto_9

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x6b

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_a

    :pswitch_5
    move v0, v2

    goto :goto_a

    :pswitch_6
    move v0, v3

    goto :goto_a

    :pswitch_7
    move v0, v4

    goto :goto_a

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x6b

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_b

    :pswitch_9
    move v0, v2

    goto :goto_b

    :pswitch_a
    move v0, v3

    goto :goto_b

    :pswitch_b
    move v0, v4

    goto :goto_b

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    const/16 v0, 0x6b

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    move v0, v1

    goto :goto_c

    :pswitch_d
    move v0, v2

    goto :goto_c

    :pswitch_e
    move v0, v3

    goto :goto_c

    :pswitch_f
    move v0, v4

    goto :goto_c

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    const/16 v0, 0x6b

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    move v0, v1

    goto :goto_d

    :pswitch_11
    move v0, v2

    goto :goto_d

    :pswitch_12
    move v0, v3

    goto :goto_d

    :pswitch_13
    move v0, v4

    goto :goto_d

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    const/16 v0, 0x6b

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    move v0, v1

    goto :goto_e

    :pswitch_15
    move v0, v2

    goto :goto_e

    :pswitch_16
    move v0, v3

    goto :goto_e

    :pswitch_17
    move v0, v4

    goto :goto_e

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    const/16 v0, 0x6b

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    move v0, v1

    goto :goto_f

    :pswitch_19
    move v0, v2

    goto :goto_f

    :pswitch_1a
    move v0, v3

    goto :goto_f

    :pswitch_1b
    move v0, v4

    goto :goto_f

    :cond_7
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    const/16 v0, 0x6b

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    move v0, v1

    goto :goto_10

    :pswitch_1d
    move v0, v2

    goto :goto_10

    :pswitch_1e
    move v0, v3

    goto :goto_10

    :pswitch_1f
    move v0, v4

    goto :goto_10

    :cond_8
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_8

    const/16 v0, 0x6b

    :goto_11
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_8

    :pswitch_20
    move v0, v1

    goto :goto_11

    :pswitch_21
    move v0, v2

    goto :goto_11

    :pswitch_22
    move v0, v3

    goto :goto_11

    :pswitch_23
    move v0, v4

    goto :goto_11

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
.end method

.method public constructor <init>(Lcom/whatsapp/sz;ZLcom/whatsapp/bj;)V
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 53
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 82
    iput-boolean v3, p0, Lcom/whatsapp/pb;->h:Z

    .line 50
    iput-object p1, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    .line 15
    iget-object v0, p1, Lcom/whatsapp/sz;->t:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/MediaData;

    iput-object v0, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    .line 116
    iget-wide v0, p1, Lcom/whatsapp/sz;->m:J

    iput-wide v0, p0, Lcom/whatsapp/pb;->c:J

    .line 56
    iput v3, p0, Lcom/whatsapp/pb;->d:I

    .line 96
    iput-object p3, p0, Lcom/whatsapp/pb;->f:Lcom/whatsapp/bj;

    .line 83
    iput-boolean p2, p0, Lcom/whatsapp/pb;->g:Z

    .line 94
    iput v2, p1, Lcom/whatsapp/sz;->a:I

    .line 72
    iget-object v0, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    iput-boolean v2, v0, Lcom/whatsapp/MediaData;->transferring:Z

    .line 47
    iget-object v0, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/whatsapp/MediaData;->progress:J

    .line 78
    iget-object v0, p0, Lcom/whatsapp/pb;->f:Lcom/whatsapp/bj;

    if-nez v0, :cond_0

    .line 39
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v3, v1}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;ZI)V

    .line 73
    :cond_0
    return-void
.end method

.method static a(Lcom/whatsapp/pb;Lcom/whatsapp/a1;)Lcom/whatsapp/a1;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 7
    iput-object p1, p0, Lcom/whatsapp/pb;->i:Lcom/whatsapp/a1;

    return-object p1
.end method

.method static a(Lcom/whatsapp/pb;Lcom/whatsapp/at;)Lcom/whatsapp/at;
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 123
    iput-object p1, p0, Lcom/whatsapp/pb;->e:Lcom/whatsapp/at;

    return-object p1
.end method

.method private static a(Ljava/io/File;)Ljava/lang/String;
    .locals 9
    .parameter

    .prologue
    const/4 v7, 0x5

    const/4 v0, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 46
    :try_start_0
    sget-object v1, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    move-object v2, v1

    .line 19
    :goto_0
    if-nez v2, :cond_1

    .line 113
    :cond_0
    :goto_1
    return-object v0

    .line 24
    :catch_0
    move-exception v1

    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v4, v4, v5

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    move-object v2, v0

    goto :goto_0

    .line 84
    :cond_1
    const/16 v1, 0x2000

    new-array v4, v1, [B

    .line 34
    :try_start_1
    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 93
    :cond_2
    :try_start_2
    invoke-virtual {v1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    if-lez v5, :cond_3

    .line 119
    const/4 v6, 0x0

    invoke-virtual {v2, v4, v6, v5}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5

    if-eqz v3, :cond_2

    .line 100
    :cond_3
    if-eqz v1, :cond_4

    .line 26
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 113
    :cond_4
    :goto_2
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-static {v1}, Lwb;->a([B)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_1

    .line 13
    :catch_1
    move-exception v0

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    aget-object v3, v3, v7

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_2

    .line 52
    :catch_2
    move-exception v1

    move-object v1, v0

    .line 8
    :goto_3
    if-eqz v1, :cond_0

    .line 2
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1

    .line 89
    :catch_3
    move-exception v1

    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    aget-object v3, v3, v7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 95
    :catchall_0
    move-exception v1

    move-object v8, v1

    move-object v1, v0

    move-object v0, v8

    :goto_4
    if-eqz v1, :cond_5

    .line 58
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 6
    :cond_5
    :goto_5
    throw v0

    .line 32
    :catch_4
    move-exception v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    aget-object v3, v3, v7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_5

    .line 95
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 52
    :catch_5
    move-exception v2

    goto :goto_3
.end method

.method static a(Lcom/whatsapp/pb;)Ljava/util/TimerTask;
    .locals 1
    .parameter

    .prologue
    .line 42
    iget-object v0, p0, Lcom/whatsapp/pb;->k:Ljava/util/TimerTask;

    return-object v0
.end method

.method static a(Lcom/whatsapp/pb;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/whatsapp/pb;->a(Ljava/lang/String;)V

    return-void
.end method

.method static a(Lcom/whatsapp/pb;[Ljava/lang/Object;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 60
    invoke-virtual {p0, p1}, Lcom/whatsapp/pb;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4
    .parameter

    .prologue
    .line 74
    new-instance v0, Lcom/whatsapp/vw;

    invoke-direct {v0, p0}, Lcom/whatsapp/vw;-><init>(Lcom/whatsapp/pb;)V

    .line 25
    iget-object v1, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v1, v1, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/vw;->a:Ljava/lang/String;

    .line 28
    iget-object v1, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    iget-object v1, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/vw;->e:J

    .line 75
    iget-object v1, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iget-byte v1, v1, Lcom/whatsapp/sz;->l:B

    invoke-static {v1}, Lcom/whatsapp/sz;->a(B)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/whatsapp/vw;->d:Ljava/lang/String;

    .line 59
    iput-object p1, v0, Lcom/whatsapp/vw;->b:Ljava/lang/String;

    .line 81
    iget-object v1, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->n:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 111
    iget-object v1, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iput-object p1, v1, Lcom/whatsapp/sz;->n:Ljava/lang/String;

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_1

    .line 76
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->n:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 51
    iget-object v1, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iget-object v1, v1, Lcom/whatsapp/sz;->n:Ljava/lang/String;

    iput-object v1, v0, Lcom/whatsapp/vw;->c:Ljava/lang/String;

    .line 12
    :cond_1
    invoke-static {v0}, Lcom/whatsapp/App;->a(Lcom/whatsapp/vw;)V

    .line 9
    new-instance v0, Lcom/whatsapp/eab;

    invoke-direct {v0, p0}, Lcom/whatsapp/eab;-><init>(Lcom/whatsapp/pb;)V

    iput-object v0, p0, Lcom/whatsapp/pb;->k:Ljava/util/TimerTask;

    .line 36
    sget-object v0, Lcom/whatsapp/pb;->j:Ljava/util/Timer;

    iget-object v1, p0, Lcom/whatsapp/pb;->k:Ljava/util/TimerTask;

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 103
    return-void
.end method

.method static a(Lcom/whatsapp/pb;Z)Z
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 63
    iput-boolean p1, p0, Lcom/whatsapp/pb;->h:Z

    return p1
.end method

.method static b(Lcom/whatsapp/pb;)Lcom/whatsapp/MediaData;
    .locals 1
    .parameter

    .prologue
    .line 18
    iget-object v0, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    return-object v0
.end method

.method static b(Ljava/io/File;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 85
    invoke-static {p0}, Lcom/whatsapp/pb;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static c(Lcom/whatsapp/pb;)Lcom/whatsapp/a1;
    .locals 1
    .parameter

    .prologue
    .line 105
    iget-object v0, p0, Lcom/whatsapp/pb;->i:Lcom/whatsapp/a1;

    return-object v0
.end method

.method static d(Lcom/whatsapp/pb;)Lcom/whatsapp/at;
    .locals 1
    .parameter

    .prologue
    .line 110
    iget-object v0, p0, Lcom/whatsapp/pb;->e:Lcom/whatsapp/at;

    return-object v0
.end method

.method static e(Lcom/whatsapp/pb;)Lcom/whatsapp/sz;
    .locals 1
    .parameter

    .prologue
    .line 23
    iget-object v0, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    return-object v0
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 4
    .parameter

    .prologue
    .line 45
    iget-object v0, p0, Lcom/whatsapp/pb;->e:Lcom/whatsapp/at;

    if-nez v0, :cond_0

    .line 37
    iget-boolean v0, p0, Lcom/whatsapp/pb;->h:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 98
    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/pb;->e:Lcom/whatsapp/at;

    invoke-virtual {v0}, Lcom/whatsapp/at;->a()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/apache/http/HttpException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    goto :goto_0

    .line 86
    :catch_0
    move-exception v0

    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 40
    :goto_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    .line 16
    :catch_1
    move-exception v0

    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lorg/apache/http/HttpException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 22
    :catch_2
    move-exception v0

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public a()V
    .locals 2

    .prologue
    .line 21
    new-instance v0, Lcom/whatsapp/rb;

    iget-object v1, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    iget-object v1, v1, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/rb;-><init>(Lcom/whatsapp/pb;Ljava/io/File;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/whatsapp/rb;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 122
    return-void
.end method

.method public a(Ljava/lang/Boolean;)V
    .locals 10
    .parameter

    .prologue
    const/4 v9, 0x2

    const/4 v0, -0x1

    const/4 v1, 0x1

    const/4 v8, 0x0

    sget-boolean v3, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 117
    iget-object v2, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    iput-boolean v8, v2, Lcom/whatsapp/MediaData;->transferring:Z

    .line 17
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-boolean v2, p0, Lcom/whatsapp/pb;->h:Z

    if-eqz v2, :cond_6

    .line 91
    :try_start_0
    new-instance v2, Ljava/net/URL;

    iget-object v4, p0, Lcom/whatsapp/pb;->i:Lcom/whatsapp/a1;

    iget-object v4, v4, Lcom/whatsapp/a1;->c:Ljava/lang/String;

    invoke-direct {v2, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 79
    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2

    .line 65
    :cond_0
    sget-object v2, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    const/4 v4, 0x1

    aget-object v2, v2, v4

    invoke-static {v2}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 41
    sget-object v2, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v4, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    const/4 v5, 0x0

    const/4 v6, -0x1

    invoke-virtual {v2, v4, v5, v6}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;ZI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    :cond_1
    :goto_0
    return-void

    .line 99
    :catch_0
    move-exception v2

    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    aget-object v5, v5, v8

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 115
    :cond_2
    iget-object v2, p0, Lcom/whatsapp/pb;->i:Lcom/whatsapp/a1;

    iget-object v2, v2, Lcom/whatsapp/a1;->b:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/whatsapp/pb;->i:Lcom/whatsapp/a1;

    iget-object v2, v2, Lcom/whatsapp/a1;->c:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/whatsapp/pb;->i:Lcom/whatsapp/a1;

    iget-wide v4, v2, Lcom/whatsapp/a1;->d:J

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-nez v2, :cond_5

    .line 48
    :cond_3
    sget-object v1, Lcom/whatsapp/pb;->z:[Ljava/lang/String;

    aget-object v1, v1, v9

    invoke-static {v1}, Lcom/whatsapp/g5;->d(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/whatsapp/pb;->f:Lcom/whatsapp/bj;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/whatsapp/pb;->f:Lcom/whatsapp/bj;

    invoke-virtual {v1}, Lcom/whatsapp/bj;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 67
    :cond_4
    sget-object v1, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v2, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    invoke-virtual {v1, v2, v8, v0}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;ZI)V

    goto :goto_0

    .line 10
    :cond_5
    iget-object v2, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iget-object v4, p0, Lcom/whatsapp/pb;->i:Lcom/whatsapp/a1;

    iget-wide v4, v4, Lcom/whatsapp/a1;->d:J

    iput-wide v4, v2, Lcom/whatsapp/sz;->m:J

    .line 49
    iget-object v2, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iget-object v4, p0, Lcom/whatsapp/pb;->i:Lcom/whatsapp/a1;

    iget-object v4, v4, Lcom/whatsapp/a1;->c:Ljava/lang/String;

    iput-object v4, v2, Lcom/whatsapp/sz;->j:Ljava/lang/String;

    .line 38
    iget-object v2, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iget-object v4, p0, Lcom/whatsapp/pb;->i:Lcom/whatsapp/a1;

    iget-object v4, v4, Lcom/whatsapp/a1;->b:Ljava/lang/String;

    iput-object v4, v2, Lcom/whatsapp/sz;->k:Ljava/lang/String;

    .line 55
    iget-object v2, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iput v9, v2, Lcom/whatsapp/sz;->a:I

    .line 121
    iget-object v2, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    iput-boolean v1, v2, Lcom/whatsapp/MediaData;->transferred:Z

    .line 107
    iget-boolean v2, p0, Lcom/whatsapp/pb;->g:Z

    if-nez v2, :cond_7

    .line 92
    iget-object v2, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    invoke-static {v2}, Lcom/whatsapp/j5;->a(Lcom/whatsapp/sz;)V

    if-eqz v3, :cond_7

    .line 101
    :cond_6
    iget-object v2, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    iput v8, v2, Lcom/whatsapp/sz;->a:I

    .line 64
    :cond_7
    iget-object v2, p0, Lcom/whatsapp/pb;->f:Lcom/whatsapp/bj;

    if-nez v2, :cond_9

    .line 29
    sget-object v2, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v4, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_8

    iget-boolean v5, p0, Lcom/whatsapp/pb;->h:Z

    if-eqz v5, :cond_8

    move v0, v1

    :cond_8
    invoke-virtual {v2, v4, v1, v0}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;ZI)V

    if-eqz v3, :cond_1

    .line 88
    :cond_9
    iget-object v0, p0, Lcom/whatsapp/pb;->f:Lcom/whatsapp/bj;

    iget-object v1, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    invoke-virtual {v0, v1}, Lcom/whatsapp/bj;->a(Lcom/whatsapp/sz;)V

    goto/16 :goto_0
.end method

.method public varargs a([Ljava/lang/Integer;)V
    .locals 7
    .parameter

    .prologue
    const/4 v6, 0x0

    .line 120
    aget-object v0, p1, v6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1
    iget v1, p0, Lcom/whatsapp/pb;->d:I

    sub-int v1, v0, v1

    int-to-long v1, v1

    invoke-static {v1, v2, v6}, Lcom/whatsapp/e4;->b(JI)V

    .line 31
    iput v0, p0, Lcom/whatsapp/pb;->d:I

    .line 71
    iget-object v1, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    int-to-long v2, v0

    const-wide/16 v4, 0x64

    mul-long/2addr v2, v4

    iget-wide v4, p0, Lcom/whatsapp/pb;->c:J

    div-long/2addr v2, v4

    iput-wide v2, v1, Lcom/whatsapp/MediaData;->progress:J

    .line 20
    iget-object v0, p0, Lcom/whatsapp/pb;->f:Lcom/whatsapp/bj;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/pb;->f:Lcom/whatsapp/bj;

    invoke-virtual {v0}, Lcom/whatsapp/bj;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/whatsapp/pb;->f:Lcom/whatsapp/bj;

    iget-object v1, p0, Lcom/whatsapp/pb;->b:Lcom/whatsapp/MediaData;

    iget-wide v1, v1, Lcom/whatsapp/MediaData;->progress:J

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/whatsapp/bj;->a(I)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 97
    :cond_0
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    iget-object v1, p0, Lcom/whatsapp/pb;->a:Lcom/whatsapp/sz;

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v6, v2}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/sz;ZI)V

    .line 109
    :cond_1
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .parameter

    .prologue
    .line 68
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/whatsapp/pb;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 124
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/whatsapp/pb;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method public bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0
    .parameter

    .prologue
    .line 14
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/whatsapp/pb;->a([Ljava/lang/Integer;)V

    return-void
.end method
