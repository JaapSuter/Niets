.class public Lmb;
.super Llb;
.source "mb.java"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:[I

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "B\u000b\u000c\u000bI"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lmb;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x78

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x11

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x43

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x4d

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x26

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0}, Llb;-><init>()V

    .line 108
    const/16 v0, 0x50

    new-array v0, v0, [I

    iput-object v0, p0, Lmb;->j:[I

    .line 99
    invoke-virtual {p0}, Lmb;->c()V

    .line 84
    return-void
.end method

.method private a(III)I
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    .line 18
    and-int v0, p1, p2

    xor-int/lit8 v1, p1, -0x1

    and-int/2addr v1, p3

    or-int/2addr v0, v1

    return v0
.end method

.method private b(III)I
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 68
    xor-int v0, p1, p2

    xor-int/2addr v0, p3

    return v0
.end method

.method private c(III)I
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    .line 78
    and-int v0, p1, p2

    and-int v1, p1, p3

    or-int/2addr v0, v1

    and-int v1, p2, p3

    or-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public a([BI)I
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 45
    invoke-virtual {p0}, Lmb;->a()V

    .line 94
    iget v0, p0, Lmb;->e:I

    invoke-static {v0, p1, p2}, Lvb;->a(I[BI)V

    .line 50
    iget v0, p0, Lmb;->f:I

    add-int/lit8 v1, p2, 0x4

    invoke-static {v0, p1, v1}, Lvb;->a(I[BI)V

    .line 5
    iget v0, p0, Lmb;->g:I

    add-int/lit8 v1, p2, 0x8

    invoke-static {v0, p1, v1}, Lvb;->a(I[BI)V

    .line 37
    iget v0, p0, Lmb;->h:I

    add-int/lit8 v1, p2, 0xc

    invoke-static {v0, p1, v1}, Lvb;->a(I[BI)V

    .line 95
    iget v0, p0, Lmb;->i:I

    add-int/lit8 v1, p2, 0x10

    invoke-static {v0, p1, v1}, Lvb;->a(I[BI)V

    .line 4
    invoke-virtual {p0}, Lmb;->c()V

    .line 3
    const/16 v0, 0x14

    return v0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lmb;->z:Ljava/lang/String;

    return-object v0
.end method

.method protected a(J)V
    .locals 4
    .parameter

    .prologue
    const/16 v3, 0xe

    .line 92
    iget v0, p0, Lmb;->k:I

    if-le v0, v3, :cond_0

    .line 93
    invoke-virtual {p0}, Lmb;->b()V

    .line 46
    :cond_0
    iget-object v0, p0, Lmb;->j:[I

    const/16 v1, 0x20

    ushr-long v1, p1, v1

    long-to-int v1, v1

    aput v1, v0, v3

    .line 57
    iget-object v0, p0, Lmb;->j:[I

    const/16 v1, 0xf

    const-wide/16 v2, -0x1

    and-long/2addr v2, p1

    long-to-int v2, v2

    aput v2, v0, v1

    .line 9
    return-void
.end method

.method protected a([BI)V
    .locals 4
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Llb;->d:Z

    .line 58
    aget-byte v1, p1, p2

    shl-int/lit8 v1, v1, 0x18

    .line 7
    add-int/lit8 v2, p2, 0x1

    aget-byte v3, p1, v2

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v1, v3

    .line 60
    add-int/lit8 v2, v2, 0x1

    aget-byte v3, p1, v2

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v1, v3

    .line 16
    add-int/lit8 v2, v2, 0x1

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    .line 43
    iget-object v2, p0, Lmb;->j:[I

    iget v3, p0, Lmb;->k:I

    aput v1, v2, v3

    .line 42
    iget v1, p0, Lmb;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lmb;->k:I

    const/16 v2, 0x10

    if-ne v1, v2, :cond_0

    .line 76
    invoke-virtual {p0}, Lmb;->b()V

    .line 25
    :cond_0
    sget v1, Lcom/whatsapp/App;->wc:I

    if-eqz v1, :cond_1

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Llb;->d:Z

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 35
    const/16 v0, 0x14

    return v0
.end method

.method protected b()V
    .locals 12

    .prologue
    sget-boolean v7, Llb;->d:Z

    .line 105
    const/16 v0, 0x10

    :cond_0
    const/16 v1, 0x50

    if-ge v0, v1, :cond_1

    .line 59
    iget-object v1, p0, Lmb;->j:[I

    add-int/lit8 v2, v0, -0x3

    aget v1, v1, v2

    iget-object v2, p0, Lmb;->j:[I

    add-int/lit8 v3, v0, -0x8

    aget v2, v2, v3

    xor-int/2addr v1, v2

    iget-object v2, p0, Lmb;->j:[I

    add-int/lit8 v3, v0, -0xe

    aget v2, v2, v3

    xor-int/2addr v1, v2

    iget-object v2, p0, Lmb;->j:[I

    add-int/lit8 v3, v0, -0x10

    aget v2, v2, v3

    xor-int/2addr v1, v2

    .line 21
    iget-object v2, p0, Lmb;->j:[I

    shl-int/lit8 v3, v1, 0x1

    ushr-int/lit8 v1, v1, 0x1f

    or-int/2addr v1, v3

    aput v1, v2, v0

    .line 102
    add-int/lit8 v0, v0, 0x1

    if-eqz v7, :cond_0

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    .line 52
    :cond_1
    iget v6, p0, Lmb;->e:I

    .line 22
    iget v5, p0, Lmb;->f:I

    .line 36
    iget v4, p0, Lmb;->g:I

    .line 32
    iget v3, p0, Lmb;->h:I

    .line 49
    iget v2, p0, Lmb;->i:I

    .line 72
    const/4 v1, 0x0

    .line 66
    const/4 v0, 0x0

    move v11, v0

    move v0, v1

    move v1, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v11

    :cond_2
    const/4 v8, 0x4

    if-ge v6, v8, :cond_3

    .line 97
    shl-int/lit8 v8, v5, 0x5

    ushr-int/lit8 v9, v5, 0x1b

    or-int/2addr v8, v9

    invoke-direct {p0, v4, v3, v2}, Lmb;->a(III)I

    move-result v9

    add-int/2addr v8, v9

    iget-object v9, p0, Lmb;->j:[I

    add-int/lit8 v10, v0, 0x1

    aget v0, v9, v0

    add-int/2addr v0, v8

    const v8, 0x5a827999

    add-int/2addr v0, v8

    add-int/2addr v0, v1

    .line 73
    shl-int/lit8 v1, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v1

    .line 61
    shl-int/lit8 v1, v0, 0x5

    ushr-int/lit8 v8, v0, 0x1b

    or-int/2addr v1, v8

    invoke-direct {p0, v5, v4, v3}, Lmb;->a(III)I

    move-result v8

    add-int/2addr v1, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v9, v10, 0x1

    aget v8, v8, v10

    add-int/2addr v1, v8

    const v8, 0x5a827999

    add-int/2addr v1, v8

    add-int/2addr v2, v1

    .line 44
    shl-int/lit8 v1, v5, 0x1e

    ushr-int/lit8 v5, v5, 0x2

    or-int/2addr v5, v1

    .line 33
    shl-int/lit8 v1, v2, 0x5

    ushr-int/lit8 v8, v2, 0x1b

    or-int/2addr v1, v8

    invoke-direct {p0, v0, v5, v4}, Lmb;->a(III)I

    move-result v8

    add-int/2addr v1, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v10, v9, 0x1

    aget v8, v8, v9

    add-int/2addr v1, v8

    const v8, 0x5a827999

    add-int/2addr v1, v8

    add-int/2addr v3, v1

    .line 38
    shl-int/lit8 v1, v0, 0x1e

    ushr-int/lit8 v0, v0, 0x2

    or-int/2addr v1, v0

    .line 47
    shl-int/lit8 v0, v3, 0x5

    ushr-int/lit8 v8, v3, 0x1b

    or-int/2addr v0, v8

    invoke-direct {p0, v2, v1, v5}, Lmb;->a(III)I

    move-result v8

    add-int/2addr v0, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v9, v10, 0x1

    aget v8, v8, v10

    add-int/2addr v0, v8

    const v8, 0x5a827999

    add-int/2addr v0, v8

    add-int/2addr v4, v0

    .line 31
    shl-int/lit8 v0, v2, 0x1e

    ushr-int/lit8 v2, v2, 0x2

    or-int/2addr v2, v0

    .line 69
    shl-int/lit8 v0, v4, 0x5

    ushr-int/lit8 v8, v4, 0x1b

    or-int/2addr v0, v8

    invoke-direct {p0, v3, v2, v1}, Lmb;->a(III)I

    move-result v8

    add-int/2addr v8, v0

    iget-object v10, p0, Lmb;->j:[I

    add-int/lit8 v0, v9, 0x1

    aget v9, v10, v9

    add-int/2addr v8, v9

    const v9, 0x5a827999

    add-int/2addr v8, v9

    add-int/2addr v5, v8

    .line 34
    shl-int/lit8 v8, v3, 0x1e

    ushr-int/lit8 v3, v3, 0x2

    or-int/2addr v3, v8

    .line 77
    add-int/lit8 v6, v6, 0x1

    if-eqz v7, :cond_2

    .line 104
    :cond_3
    const/4 v6, 0x0

    :cond_4
    const/4 v8, 0x4

    if-ge v6, v8, :cond_5

    .line 98
    shl-int/lit8 v8, v5, 0x5

    ushr-int/lit8 v9, v5, 0x1b

    or-int/2addr v8, v9

    invoke-direct {p0, v4, v3, v2}, Lmb;->b(III)I

    move-result v9

    add-int/2addr v8, v9

    iget-object v9, p0, Lmb;->j:[I

    add-int/lit8 v10, v0, 0x1

    aget v0, v9, v0

    add-int/2addr v0, v8

    const v8, 0x6ed9eba1

    add-int/2addr v0, v8

    add-int/2addr v0, v1

    .line 2
    shl-int/lit8 v1, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v1

    .line 15
    shl-int/lit8 v1, v0, 0x5

    ushr-int/lit8 v8, v0, 0x1b

    or-int/2addr v1, v8

    invoke-direct {p0, v5, v4, v3}, Lmb;->b(III)I

    move-result v8

    add-int/2addr v1, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v9, v10, 0x1

    aget v8, v8, v10

    add-int/2addr v1, v8

    const v8, 0x6ed9eba1

    add-int/2addr v1, v8

    add-int/2addr v2, v1

    .line 91
    shl-int/lit8 v1, v5, 0x1e

    ushr-int/lit8 v5, v5, 0x2

    or-int/2addr v5, v1

    .line 81
    shl-int/lit8 v1, v2, 0x5

    ushr-int/lit8 v8, v2, 0x1b

    or-int/2addr v1, v8

    invoke-direct {p0, v0, v5, v4}, Lmb;->b(III)I

    move-result v8

    add-int/2addr v1, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v10, v9, 0x1

    aget v8, v8, v9

    add-int/2addr v1, v8

    const v8, 0x6ed9eba1

    add-int/2addr v1, v8

    add-int/2addr v3, v1

    .line 24
    shl-int/lit8 v1, v0, 0x1e

    ushr-int/lit8 v0, v0, 0x2

    or-int/2addr v1, v0

    .line 75
    shl-int/lit8 v0, v3, 0x5

    ushr-int/lit8 v8, v3, 0x1b

    or-int/2addr v0, v8

    invoke-direct {p0, v2, v1, v5}, Lmb;->b(III)I

    move-result v8

    add-int/2addr v0, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v9, v10, 0x1

    aget v8, v8, v10

    add-int/2addr v0, v8

    const v8, 0x6ed9eba1

    add-int/2addr v0, v8

    add-int/2addr v4, v0

    .line 53
    shl-int/lit8 v0, v2, 0x1e

    ushr-int/lit8 v2, v2, 0x2

    or-int/2addr v2, v0

    .line 23
    shl-int/lit8 v0, v4, 0x5

    ushr-int/lit8 v8, v4, 0x1b

    or-int/2addr v0, v8

    invoke-direct {p0, v3, v2, v1}, Lmb;->b(III)I

    move-result v8

    add-int/2addr v8, v0

    iget-object v10, p0, Lmb;->j:[I

    add-int/lit8 v0, v9, 0x1

    aget v9, v10, v9

    add-int/2addr v8, v9

    const v9, 0x6ed9eba1

    add-int/2addr v8, v9

    add-int/2addr v5, v8

    .line 80
    shl-int/lit8 v8, v3, 0x1e

    ushr-int/lit8 v3, v3, 0x2

    or-int/2addr v3, v8

    .line 1
    add-int/lit8 v6, v6, 0x1

    if-eqz v7, :cond_4

    .line 87
    :cond_5
    const/4 v6, 0x0

    :cond_6
    const/4 v8, 0x4

    if-ge v6, v8, :cond_7

    .line 62
    shl-int/lit8 v8, v5, 0x5

    ushr-int/lit8 v9, v5, 0x1b

    or-int/2addr v8, v9

    invoke-direct {p0, v4, v3, v2}, Lmb;->c(III)I

    move-result v9

    add-int/2addr v8, v9

    iget-object v9, p0, Lmb;->j:[I

    add-int/lit8 v10, v0, 0x1

    aget v0, v9, v0

    add-int/2addr v0, v8

    const v8, -0x70e44324

    add-int/2addr v0, v8

    add-int/2addr v0, v1

    .line 70
    shl-int/lit8 v1, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v1

    .line 71
    shl-int/lit8 v1, v0, 0x5

    ushr-int/lit8 v8, v0, 0x1b

    or-int/2addr v1, v8

    invoke-direct {p0, v5, v4, v3}, Lmb;->c(III)I

    move-result v8

    add-int/2addr v1, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v9, v10, 0x1

    aget v8, v8, v10

    add-int/2addr v1, v8

    const v8, -0x70e44324

    add-int/2addr v1, v8

    add-int/2addr v2, v1

    .line 10
    shl-int/lit8 v1, v5, 0x1e

    ushr-int/lit8 v5, v5, 0x2

    or-int/2addr v5, v1

    .line 51
    shl-int/lit8 v1, v2, 0x5

    ushr-int/lit8 v8, v2, 0x1b

    or-int/2addr v1, v8

    invoke-direct {p0, v0, v5, v4}, Lmb;->c(III)I

    move-result v8

    add-int/2addr v1, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v10, v9, 0x1

    aget v8, v8, v9

    add-int/2addr v1, v8

    const v8, -0x70e44324

    add-int/2addr v1, v8

    add-int/2addr v3, v1

    .line 96
    shl-int/lit8 v1, v0, 0x1e

    ushr-int/lit8 v0, v0, 0x2

    or-int/2addr v1, v0

    .line 101
    shl-int/lit8 v0, v3, 0x5

    ushr-int/lit8 v8, v3, 0x1b

    or-int/2addr v0, v8

    invoke-direct {p0, v2, v1, v5}, Lmb;->c(III)I

    move-result v8

    add-int/2addr v0, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v9, v10, 0x1

    aget v8, v8, v10

    add-int/2addr v0, v8

    const v8, -0x70e44324

    add-int/2addr v0, v8

    add-int/2addr v4, v0

    .line 55
    shl-int/lit8 v0, v2, 0x1e

    ushr-int/lit8 v2, v2, 0x2

    or-int/2addr v2, v0

    .line 89
    shl-int/lit8 v0, v4, 0x5

    ushr-int/lit8 v8, v4, 0x1b

    or-int/2addr v0, v8

    invoke-direct {p0, v3, v2, v1}, Lmb;->c(III)I

    move-result v8

    add-int/2addr v8, v0

    iget-object v10, p0, Lmb;->j:[I

    add-int/lit8 v0, v9, 0x1

    aget v9, v10, v9

    add-int/2addr v8, v9

    const v9, -0x70e44324

    add-int/2addr v8, v9

    add-int/2addr v5, v8

    .line 107
    shl-int/lit8 v8, v3, 0x1e

    ushr-int/lit8 v3, v3, 0x2

    or-int/2addr v3, v8

    .line 82
    add-int/lit8 v6, v6, 0x1

    if-eqz v7, :cond_6

    .line 12
    :cond_7
    const/4 v6, 0x0

    move v11, v6

    move v6, v0

    move v0, v1

    move v1, v2

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v11

    :cond_8
    const/4 v8, 0x3

    if-gt v5, v8, :cond_9

    .line 6
    shl-int/lit8 v8, v4, 0x5

    ushr-int/lit8 v9, v4, 0x1b

    or-int/2addr v8, v9

    invoke-direct {p0, v3, v2, v1}, Lmb;->b(III)I

    move-result v9

    add-int/2addr v8, v9

    iget-object v9, p0, Lmb;->j:[I

    add-int/lit8 v10, v6, 0x1

    aget v6, v9, v6

    add-int/2addr v6, v8

    const v8, -0x359d3e2a

    add-int/2addr v6, v8

    add-int/2addr v0, v6

    .line 17
    shl-int/lit8 v6, v3, 0x1e

    ushr-int/lit8 v3, v3, 0x2

    or-int/2addr v3, v6

    .line 48
    shl-int/lit8 v6, v0, 0x5

    ushr-int/lit8 v8, v0, 0x1b

    or-int/2addr v6, v8

    invoke-direct {p0, v4, v3, v2}, Lmb;->b(III)I

    move-result v8

    add-int/2addr v6, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v9, v10, 0x1

    aget v8, v8, v10

    add-int/2addr v6, v8

    const v8, -0x359d3e2a

    add-int/2addr v6, v8

    add-int/2addr v1, v6

    .line 19
    shl-int/lit8 v6, v4, 0x1e

    ushr-int/lit8 v4, v4, 0x2

    or-int/2addr v4, v6

    .line 64
    shl-int/lit8 v6, v1, 0x5

    ushr-int/lit8 v8, v1, 0x1b

    or-int/2addr v6, v8

    invoke-direct {p0, v0, v4, v3}, Lmb;->b(III)I

    move-result v8

    add-int/2addr v6, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v10, v9, 0x1

    aget v8, v8, v9

    add-int/2addr v6, v8

    const v8, -0x359d3e2a

    add-int/2addr v6, v8

    add-int/2addr v2, v6

    .line 109
    shl-int/lit8 v6, v0, 0x1e

    ushr-int/lit8 v0, v0, 0x2

    or-int/2addr v0, v6

    .line 11
    shl-int/lit8 v6, v2, 0x5

    ushr-int/lit8 v8, v2, 0x1b

    or-int/2addr v6, v8

    invoke-direct {p0, v1, v0, v4}, Lmb;->b(III)I

    move-result v8

    add-int/2addr v6, v8

    iget-object v8, p0, Lmb;->j:[I

    add-int/lit8 v9, v10, 0x1

    aget v8, v8, v10

    add-int/2addr v6, v8

    const v8, -0x359d3e2a

    add-int/2addr v6, v8

    add-int/2addr v3, v6

    .line 26
    shl-int/lit8 v6, v1, 0x1e

    ushr-int/lit8 v1, v1, 0x2

    or-int/2addr v1, v6

    .line 28
    shl-int/lit8 v6, v3, 0x5

    ushr-int/lit8 v8, v3, 0x1b

    or-int/2addr v6, v8

    invoke-direct {p0, v2, v1, v0}, Lmb;->b(III)I

    move-result v8

    add-int/2addr v8, v6

    iget-object v10, p0, Lmb;->j:[I

    add-int/lit8 v6, v9, 0x1

    aget v9, v10, v9

    add-int/2addr v8, v9

    const v9, -0x359d3e2a

    add-int/2addr v8, v9

    add-int/2addr v4, v8

    .line 54
    shl-int/lit8 v8, v2, 0x1e

    ushr-int/lit8 v2, v2, 0x2

    or-int/2addr v2, v8

    .line 40
    add-int/lit8 v5, v5, 0x1

    if-eqz v7, :cond_8

    .line 90
    :cond_9
    iget v5, p0, Lmb;->e:I

    add-int/2addr v4, v5

    iput v4, p0, Lmb;->e:I

    .line 56
    iget v4, p0, Lmb;->f:I

    add-int/2addr v3, v4

    iput v3, p0, Lmb;->f:I

    .line 39
    iget v3, p0, Lmb;->g:I

    add-int/2addr v2, v3

    iput v2, p0, Lmb;->g:I

    .line 79
    iget v2, p0, Lmb;->h:I

    add-int/2addr v1, v2

    iput v1, p0, Lmb;->h:I

    .line 86
    iget v1, p0, Lmb;->i:I

    add-int/2addr v0, v1

    iput v0, p0, Lmb;->i:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lmb;->k:I

    .line 20
    const/4 v0, 0x0

    :cond_a
    const/16 v1, 0x10

    if-ge v0, v1, :cond_b

    .line 103
    iget-object v1, p0, Lmb;->j:[I

    const/4 v2, 0x0

    aput v2, v1, v0

    .line 41
    add-int/lit8 v0, v0, 0x1

    if-eqz v7, :cond_a

    .line 100
    :cond_b
    return-void
.end method

.method public c()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Llb;->d:Z

    .line 8
    invoke-super {p0}, Llb;->c()V

    .line 30
    const v0, 0x67452301

    iput v0, p0, Lmb;->e:I

    .line 65
    const v0, -0x10325477

    iput v0, p0, Lmb;->f:I

    .line 83
    const v0, -0x67452302

    iput v0, p0, Lmb;->g:I

    .line 106
    const v0, 0x10325476

    iput v0, p0, Lmb;->h:I

    .line 27
    const v0, -0x3c2d1e10

    iput v0, p0, Lmb;->i:I

    .line 85
    iput v1, p0, Lmb;->k:I

    move v0, v1

    .line 14
    :cond_0
    iget-object v3, p0, Lmb;->j:[I

    array-length v3, v3

    if-eq v0, v3, :cond_1

    .line 29
    iget-object v3, p0, Lmb;->j:[I

    aput v1, v3, v0

    .line 67
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    .line 13
    :cond_1
    return-void
.end method
