.class public Ltb;
.super Lsb;
.source "tb.java"


# static fields
.field public static e:Z

.field private static final z:Ljava/lang/String;


# instance fields
.field private d:Lpb;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "|<\u0002LOa!\u0008P\u000ev\'\u0012PZ5%\u0012MZ5*\u0002\u001eOah\u000b[Of<G\u000f\u0000"

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

    sput-object v0, Ltb;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2e

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x15

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x48

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x67

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x3e

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
    .line 40
    new-instance v0, Lmb;

    invoke-direct {v0}, Lmb;-><init>()V

    invoke-direct {p0, v0}, Ltb;-><init>(Lkb;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Lkb;)V
    .locals 2
    .parameter

    .prologue
    sget-boolean v0, Ltb;->e:Z

    .line 36
    invoke-direct {p0}, Lsb;-><init>()V

    .line 4
    new-instance v1, Lqb;

    invoke-direct {v1, p1}, Lqb;-><init>(Lkb;)V

    iput-object v1, p0, Ltb;->d:Lpb;

    .line 5
    sget v1, Lcom/whatsapp/App;->wc:I

    if-eqz v1, :cond_0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ltb;->e:Z

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private a([BI)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 35
    const/4 v0, 0x0

    ushr-int/lit8 v1, p2, 0x18

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 8
    const/4 v0, 0x1

    ushr-int/lit8 v1, p2, 0x10

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 18
    const/4 v0, 0x2

    ushr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    aput-byte v1, p1, v0

    .line 20
    const/4 v0, 0x3

    int-to-byte v1, p2

    aput-byte v1, p1, v0

    .line 7
    return-void
.end method

.method private a([B[BI[B[BI)V
    .locals 9
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v3, Ltb;->e:Z

    .line 41
    iget-object v0, p0, Ltb;->d:Lpb;

    invoke-interface {v0}, Lpb;->a()I

    move-result v0

    new-array v4, v0, [B

    .line 3
    new-instance v5, Lrb;

    invoke-direct {v5, p1}, Lrb;-><init>([B)V

    .line 37
    iget-object v0, p0, Ltb;->d:Lpb;

    invoke-interface {v0, v5}, Lpb;->a(Ljb;)V

    .line 9
    if-eqz p2, :cond_0

    .line 21
    iget-object v0, p0, Ltb;->d:Lpb;

    array-length v2, p2

    invoke-interface {v0, p2, v1, v2}, Lpb;->a([BII)V

    .line 31
    :cond_0
    iget-object v0, p0, Ltb;->d:Lpb;

    array-length v2, p4

    invoke-interface {v0, p4, v1, v2}, Lpb;->a([BII)V

    .line 17
    iget-object v0, p0, Ltb;->d:Lpb;

    invoke-interface {v0, v4, v1}, Lpb;->a([BI)I

    .line 12
    array-length v0, v4

    invoke-static {v4, v1, p5, p6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    if-nez p3, :cond_1

    .line 25
    new-instance v0, Ljava/lang/IllegalArgumentException;

    sget-object v1, Ltb;->z:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 32
    :cond_1
    const/4 v0, 0x1

    move v2, v0

    :goto_0
    if-ge v2, p3, :cond_4

    .line 14
    iget-object v0, p0, Ltb;->d:Lpb;

    invoke-interface {v0, v5}, Lpb;->a(Ljb;)V

    .line 13
    iget-object v0, p0, Ltb;->d:Lpb;

    array-length v6, v4

    invoke-interface {v0, v4, v1, v6}, Lpb;->a([BII)V

    .line 29
    iget-object v0, p0, Ltb;->d:Lpb;

    invoke-interface {v0, v4, v1}, Lpb;->a([BI)I

    move v0, v1

    .line 26
    :cond_2
    array-length v6, v4

    if-eq v0, v6, :cond_3

    .line 10
    add-int v6, p6, v0

    aget-byte v7, p5, v6

    aget-byte v8, v4, v0

    xor-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, p5, v6

    .line 1
    add-int/lit8 v0, v0, 0x1

    if-eqz v3, :cond_2

    .line 15
    :cond_3
    add-int/lit8 v0, v2, 0x1

    if-eqz v3, :cond_5

    .line 19
    :cond_4
    return-void

    :cond_5
    move v2, v0

    goto :goto_0
.end method

.method private a(I)[B
    .locals 11
    .parameter

    .prologue
    sget-boolean v8, Ltb;->e:Z

    .line 30
    iget-object v0, p0, Ltb;->d:Lpb;

    invoke-interface {v0}, Lpb;->a()I

    move-result v9

    .line 38
    add-int v0, p1, v9

    add-int/lit8 v0, v0, -0x1

    div-int v10, v0, v9

    .line 34
    const/4 v0, 0x4

    new-array v4, v0, [B

    .line 24
    mul-int v0, v10, v9

    new-array v5, v0, [B

    .line 23
    const/4 v0, 0x1

    move v7, v0

    :goto_0
    if-gt v7, v10, :cond_0

    .line 22
    invoke-direct {p0, v4, v7}, Ltb;->a([BI)V

    .line 27
    iget-object v1, p0, Ltb;->a:[B

    iget-object v2, p0, Ltb;->b:[B

    iget v3, p0, Ltb;->c:I

    add-int/lit8 v0, v7, -0x1

    mul-int v6, v0, v9

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ltb;->a([B[BI[B[BI)V

    .line 11
    add-int/lit8 v0, v7, 0x1

    if-eqz v8, :cond_1

    .line 6
    :cond_0
    return-object v5

    :cond_1
    move v7, v0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Ljb;
    .locals 5
    .parameter

    .prologue
    sget-boolean v0, Ltb;->e:Z

    .line 33
    div-int/lit8 v1, p1, 0x8

    .line 39
    invoke-direct {p0, v1}, Ltb;->a(I)[B

    move-result-object v2

    .line 2
    new-instance v3, Lrb;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4, v1}, Lrb;-><init>([BII)V

    if-eqz v0, :cond_0

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    :cond_0
    return-object v3
.end method
