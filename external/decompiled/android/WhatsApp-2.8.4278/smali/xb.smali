.class public Lxb;
.super Ljava/lang/Object;
.source "xb.java"

# interfaces
.implements Lyb;


# instance fields
.field protected final a:[B

.field protected b:B

.field protected final c:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lxb;->a:[B

    .line 57
    const/16 v0, 0x3d

    iput-byte v0, p0, Lxb;->b:B

    .line 50
    const/16 v0, 0x80

    new-array v0, v0, [B

    iput-object v0, p0, Lxb;->c:[B

    .line 54
    invoke-virtual {p0}, Lxb;->a()V

    .line 35
    return-void

    .line 91
    :array_0
    .array-data 0x1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data
.end method

.method private a(Ljava/io/OutputStream;CCCC)I
    .locals 5
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 29
    iget-byte v0, p0, Lxb;->b:B

    if-ne p4, v0, :cond_0

    .line 108
    iget-object v0, p0, Lxb;->c:[B

    aget-byte v0, v0, p2

    .line 80
    iget-object v1, p0, Lxb;->c:[B

    aget-byte v1, v1, p3

    .line 42
    shl-int/lit8 v0, v0, 0x2

    shr-int/lit8 v1, v1, 0x4

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 62
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 73
    :cond_0
    iget-byte v0, p0, Lxb;->b:B

    if-ne p5, v0, :cond_1

    .line 46
    iget-object v0, p0, Lxb;->c:[B

    aget-byte v0, v0, p2

    .line 1
    iget-object v1, p0, Lxb;->c:[B

    aget-byte v1, v1, p3

    .line 69
    iget-object v2, p0, Lxb;->c:[B

    aget-byte v2, v2, p4

    .line 92
    shl-int/lit8 v0, v0, 0x2

    shr-int/lit8 v3, v1, 0x4

    or-int/2addr v0, v3

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 101
    shl-int/lit8 v0, v1, 0x4

    shr-int/lit8 v1, v2, 0x2

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 48
    const/4 v0, 0x2

    goto :goto_0

    .line 104
    :cond_1
    iget-object v0, p0, Lxb;->c:[B

    aget-byte v0, v0, p2

    .line 17
    iget-object v1, p0, Lxb;->c:[B

    aget-byte v1, v1, p3

    .line 89
    iget-object v2, p0, Lxb;->c:[B

    aget-byte v2, v2, p4

    .line 2
    iget-object v3, p0, Lxb;->c:[B

    aget-byte v3, v3, p5

    .line 71
    shl-int/lit8 v0, v0, 0x2

    shr-int/lit8 v4, v1, 0x4

    or-int/2addr v0, v4

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 102
    shl-int/lit8 v0, v1, 0x4

    shr-int/lit8 v1, v2, 0x2

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 6
    shl-int/lit8 v0, v2, 0x6

    or-int/2addr v0, v3

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 18
    const/4 v0, 0x3

    goto :goto_0
.end method

.method private a(Ljava/lang/String;II)I
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    sget v1, Lwb;->b:I

    move v0, p2

    .line 56
    :cond_0
    if-ge v0, p3, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-direct {p0, v2}, Lxb;->a(C)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 85
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 12
    :cond_1
    return v0
.end method

.method private a([BII)I
    .locals 3
    .parameter
    .parameter
    .parameter

    .prologue
    sget v1, Lwb;->b:I

    move v0, p2

    .line 10
    :cond_0
    if-ge v0, p3, :cond_1

    aget-byte v2, p1, v0

    int-to-char v2, v2

    invoke-direct {p0, v2}, Lxb;->a(C)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 74
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    .line 87
    :cond_1
    return v0
.end method

.method private a(C)Z
    .locals 1
    .parameter

    .prologue
    .line 19
    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    const/16 v0, 0x9

    if-eq p1, v0, :cond_0

    const/16 v0, 0x20

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/io/OutputStream;)I
    .locals 11
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    sget v7, Lwb;->b:I

    .line 66
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 58
    :cond_0
    if-lez v0, :cond_2

    .line 32
    add-int/lit8 v1, v0, -0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lxb;->a(C)Z

    move-result v1

    if-nez v1, :cond_1

    .line 95
    if-eqz v7, :cond_2

    .line 31
    :cond_1
    add-int/lit8 v0, v0, -0x1

    if-eqz v7, :cond_0

    .line 110
    :cond_2
    add-int/lit8 v3, v0, -0x4

    .line 88
    invoke-direct {p0, p1, v2, v3}, Lxb;->a(Ljava/lang/String;II)I

    move-result v1

    move v10, v1

    move v1, v2

    move v2, v10

    .line 25
    :cond_3
    if-ge v2, v3, :cond_4

    .line 23
    iget-object v4, p0, Lxb;->c:[B

    add-int/lit8 v5, v2, 0x1

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    aget-byte v2, v4, v2

    .line 59
    invoke-direct {p0, p1, v5, v3}, Lxb;->a(Ljava/lang/String;II)I

    move-result v4

    .line 63
    iget-object v5, p0, Lxb;->c:[B

    add-int/lit8 v6, v4, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    aget-byte v4, v5, v4

    .line 105
    invoke-direct {p0, p1, v6, v3}, Lxb;->a(Ljava/lang/String;II)I

    move-result v5

    .line 28
    iget-object v6, p0, Lxb;->c:[B

    add-int/lit8 v8, v5, 0x1

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    aget-byte v5, v6, v5

    .line 103
    invoke-direct {p0, p1, v8, v3}, Lxb;->a(Ljava/lang/String;II)I

    move-result v6

    .line 13
    iget-object v8, p0, Lxb;->c:[B

    add-int/lit8 v9, v6, 0x1

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    aget-byte v6, v8, v6

    .line 65
    shl-int/lit8 v2, v2, 0x2

    shr-int/lit8 v8, v4, 0x4

    or-int/2addr v2, v8

    invoke-virtual {p2, v2}, Ljava/io/OutputStream;->write(I)V

    .line 27
    shl-int/lit8 v2, v4, 0x4

    shr-int/lit8 v4, v5, 0x2

    or-int/2addr v2, v4

    invoke-virtual {p2, v2}, Ljava/io/OutputStream;->write(I)V

    .line 93
    shl-int/lit8 v2, v5, 0x6

    or-int/2addr v2, v6

    invoke-virtual {p2, v2}, Ljava/io/OutputStream;->write(I)V

    .line 99
    add-int/lit8 v1, v1, 0x3

    .line 72
    invoke-direct {p0, p1, v9, v3}, Lxb;->a(Ljava/lang/String;II)I

    move-result v2

    if-eqz v7, :cond_3

    :cond_4
    move v6, v1

    .line 8
    add-int/lit8 v1, v0, -0x4

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/lit8 v1, v0, -0x3

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v1, v0, -0x2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move-object v0, p0

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lxb;->a(Ljava/io/OutputStream;CCCC)I

    move-result v0

    add-int/2addr v0, v6

    .line 49
    sget v1, Lcom/whatsapp/App;->wc:I

    if-eqz v1, :cond_5

    add-int/lit8 v1, v7, 0x1

    sput v1, Lwb;->b:I

    :cond_5
    return v0
.end method

.method public a([BIILjava/io/OutputStream;)I
    .locals 9
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget v1, Lwb;->b:I

    .line 84
    rem-int/lit8 v2, p3, 0x3

    .line 47
    sub-int v3, p3, v2

    move v0, p2

    .line 94
    :cond_0
    add-int v4, p2, v3

    if-ge v0, v4, :cond_1

    .line 60
    aget-byte v4, p1, v0

    and-int/lit16 v4, v4, 0xff

    .line 55
    add-int/lit8 v5, v0, 0x1

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    .line 24
    add-int/lit8 v6, v0, 0x2

    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    .line 86
    iget-object v7, p0, Lxb;->a:[B

    ushr-int/lit8 v8, v4, 0x2

    and-int/lit8 v8, v8, 0x3f

    aget-byte v7, v7, v8

    invoke-virtual {p4, v7}, Ljava/io/OutputStream;->write(I)V

    .line 15
    iget-object v7, p0, Lxb;->a:[B

    shl-int/lit8 v4, v4, 0x4

    ushr-int/lit8 v8, v5, 0x4

    or-int/2addr v4, v8

    and-int/lit8 v4, v4, 0x3f

    aget-byte v4, v7, v4

    invoke-virtual {p4, v4}, Ljava/io/OutputStream;->write(I)V

    .line 43
    iget-object v4, p0, Lxb;->a:[B

    shl-int/lit8 v5, v5, 0x2

    ushr-int/lit8 v7, v6, 0x6

    or-int/2addr v5, v7

    and-int/lit8 v5, v5, 0x3f

    aget-byte v4, v4, v5

    invoke-virtual {p4, v4}, Ljava/io/OutputStream;->write(I)V

    .line 107
    iget-object v4, p0, Lxb;->a:[B

    and-int/lit8 v5, v6, 0x3f

    aget-byte v4, v4, v5

    invoke-virtual {p4, v4}, Ljava/io/OutputStream;->write(I)V

    .line 90
    add-int/lit8 v0, v0, 0x3

    if-eqz v1, :cond_0

    .line 115
    :cond_1
    packed-switch v2, :pswitch_data_0

    .line 70
    :cond_2
    :goto_0
    div-int/lit8 v0, v3, 0x3

    mul-int/lit8 v1, v0, 0x4

    if-nez v2, :cond_3

    const/4 v0, 0x0

    :goto_1
    add-int/2addr v0, v1

    return v0

    .line 41
    :pswitch_0
    if-eqz v1, :cond_2

    .line 97
    :pswitch_1
    add-int v0, p2, v3

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    .line 112
    ushr-int/lit8 v4, v0, 0x2

    and-int/lit8 v4, v4, 0x3f

    .line 45
    shl-int/lit8 v0, v0, 0x4

    and-int/lit8 v0, v0, 0x3f

    .line 30
    iget-object v5, p0, Lxb;->a:[B

    aget-byte v4, v5, v4

    invoke-virtual {p4, v4}, Ljava/io/OutputStream;->write(I)V

    .line 116
    iget-object v4, p0, Lxb;->a:[B

    aget-byte v0, v4, v0

    invoke-virtual {p4, v0}, Ljava/io/OutputStream;->write(I)V

    .line 114
    iget-byte v0, p0, Lxb;->b:B

    invoke-virtual {p4, v0}, Ljava/io/OutputStream;->write(I)V

    .line 53
    iget-byte v0, p0, Lxb;->b:B

    invoke-virtual {p4, v0}, Ljava/io/OutputStream;->write(I)V

    .line 51
    if-eqz v1, :cond_2

    .line 76
    :pswitch_2
    add-int v0, p2, v3

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    .line 37
    add-int v1, p2, v3

    add-int/lit8 v1, v1, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    .line 52
    ushr-int/lit8 v4, v0, 0x2

    and-int/lit8 v4, v4, 0x3f

    .line 44
    shl-int/lit8 v0, v0, 0x4

    ushr-int/lit8 v5, v1, 0x4

    or-int/2addr v0, v5

    and-int/lit8 v0, v0, 0x3f

    .line 81
    shl-int/lit8 v1, v1, 0x2

    and-int/lit8 v1, v1, 0x3f

    .line 61
    iget-object v5, p0, Lxb;->a:[B

    aget-byte v4, v5, v4

    invoke-virtual {p4, v4}, Ljava/io/OutputStream;->write(I)V

    .line 11
    iget-object v4, p0, Lxb;->a:[B

    aget-byte v0, v4, v0

    invoke-virtual {p4, v0}, Ljava/io/OutputStream;->write(I)V

    .line 109
    iget-object v0, p0, Lxb;->a:[B

    aget-byte v0, v0, v1

    invoke-virtual {p4, v0}, Ljava/io/OutputStream;->write(I)V

    .line 106
    iget-byte v0, p0, Lxb;->b:B

    invoke-virtual {p4, v0}, Ljava/io/OutputStream;->write(I)V

    goto :goto_0

    .line 70
    :cond_3
    const/4 v0, 0x4

    goto :goto_1

    .line 115
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected a()V
    .locals 4

    .prologue
    .line 20
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lxb;->a:[B

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 14
    iget-object v1, p0, Lxb;->c:[B

    iget-object v2, p0, Lxb;->a:[B

    aget-byte v2, v2, v0

    int-to-byte v3, v0

    aput-byte v3, v1, v2

    .line 7
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 100
    :cond_0
    return-void
.end method

.method public b([BIILjava/io/OutputStream;)I
    .locals 11
    .parameter
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    sget v3, Lwb;->b:I

    .line 33
    const/4 v2, 0x0

    .line 39
    add-int v0, p2, p3

    .line 16
    :cond_0
    if-le v0, p2, :cond_2

    .line 96
    add-int/lit8 v1, v0, -0x1

    aget-byte v1, p1, v1

    int-to-char v1, v1

    invoke-direct {p0, v1}, Lxb;->a(C)Z

    move-result v1

    if-nez v1, :cond_1

    .line 78
    if-eqz v3, :cond_2

    sget v1, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lcom/whatsapp/App;->wc:I

    .line 77
    :cond_1
    add-int/lit8 v0, v0, -0x1

    if-eqz v3, :cond_0

    .line 4
    :cond_2
    add-int/lit8 v4, v0, -0x4

    .line 64
    invoke-direct {p0, p1, p2, v4}, Lxb;->a([BII)I

    move-result v1

    move v10, v1

    move v1, v2

    move v2, v10

    .line 82
    :cond_3
    if-ge v2, v4, :cond_4

    .line 111
    iget-object v5, p0, Lxb;->c:[B

    add-int/lit8 v6, v2, 0x1

    aget-byte v2, p1, v2

    aget-byte v2, v5, v2

    .line 3
    invoke-direct {p0, p1, v6, v4}, Lxb;->a([BII)I

    move-result v5

    .line 79
    iget-object v6, p0, Lxb;->c:[B

    add-int/lit8 v7, v5, 0x1

    aget-byte v5, p1, v5

    aget-byte v5, v6, v5

    .line 26
    invoke-direct {p0, p1, v7, v4}, Lxb;->a([BII)I

    move-result v6

    .line 98
    iget-object v7, p0, Lxb;->c:[B

    add-int/lit8 v8, v6, 0x1

    aget-byte v6, p1, v6

    aget-byte v6, v7, v6

    .line 68
    invoke-direct {p0, p1, v8, v4}, Lxb;->a([BII)I

    move-result v7

    .line 67
    iget-object v8, p0, Lxb;->c:[B

    add-int/lit8 v9, v7, 0x1

    aget-byte v7, p1, v7

    aget-byte v7, v8, v7

    .line 5
    shl-int/lit8 v2, v2, 0x2

    shr-int/lit8 v8, v5, 0x4

    or-int/2addr v2, v8

    invoke-virtual {p4, v2}, Ljava/io/OutputStream;->write(I)V

    .line 34
    shl-int/lit8 v2, v5, 0x4

    shr-int/lit8 v5, v6, 0x2

    or-int/2addr v2, v5

    invoke-virtual {p4, v2}, Ljava/io/OutputStream;->write(I)V

    .line 36
    shl-int/lit8 v2, v6, 0x6

    or-int/2addr v2, v7

    invoke-virtual {p4, v2}, Ljava/io/OutputStream;->write(I)V

    .line 75
    add-int/lit8 v1, v1, 0x3

    .line 113
    invoke-direct {p0, p1, v9, v4}, Lxb;->a([BII)I

    move-result v2

    if-eqz v3, :cond_3

    :cond_4
    move v6, v1

    .line 22
    add-int/lit8 v1, v0, -0x4

    aget-byte v1, p1, v1

    int-to-char v2, v1

    add-int/lit8 v1, v0, -0x3

    aget-byte v1, p1, v1

    int-to-char v3, v1

    add-int/lit8 v1, v0, -0x2

    aget-byte v1, p1, v1

    int-to-char v4, v1

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, p1, v0

    int-to-char v5, v0

    move-object v0, p0

    move-object v1, p4

    invoke-direct/range {v0 .. v5}, Lxb;->a(Ljava/io/OutputStream;CCCC)I

    move-result v0

    add-int/2addr v0, v6

    .line 21
    return v0
.end method
