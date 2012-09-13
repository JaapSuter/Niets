.class public abstract Lcom/whatsapp/y0;
.super Ljava/lang/Object;
.source "y0.java"


# static fields
.field static f:Ljava/lang/String;

.field private static final z:[Ljava/lang/String;


# instance fields
.field a:Lcom/whatsapp/i1;

.field b:Lcom/whatsapp/e1;

.field c:Lcom/whatsapp/f1;

.field d:Lcom/whatsapp/qz;

.field e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "\u0015\u0019AHd\u0015"

    invoke-static {v2}, Lcom/whatsapp/y0;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/y0;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "n-`tIa,}\u007fM{=\u000e"

    invoke-static {v2}, Lcom/whatsapp/y0;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/y0;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "\u0003\u001bZSbL\u001d\t\u001e"

    invoke-static {v2}, Lcom/whatsapp/y0;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/y0;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "\rTPUkJ\u000b@\u0011y]\u0011\t\u001e"

    invoke-static {v2}, Lcom/whatsapp/y0;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/y0;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "\rTAOi]\u0016UQi\u0012Z"

    invoke-static {v2}, Lcom/whatsapp/y0;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/y0;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "]\u001dGLcA\u000bQ\u0001"

    invoke-static {v2}, Lcom/whatsapp/y0;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/y0;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "F\u0016B]`F\u001c\u0014_`@\u001b_\u001c\u007fJ\u000c@UbH"

    invoke-static {v2}, Lcom/whatsapp/y0;->z(Ljava/lang/String;)[C

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/y0;->z([C)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lcom/whatsapp/y0;->z:[Ljava/lang/String;

    .line 22
    const-string v0, "A\u0017Z_i\u0012Z"

    .line -1
    invoke-static {v0}, Lcom/whatsapp/y0;->z(Ljava/lang/String;)[C

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/y0;->z([C)Ljava/lang/String;

    move-result-object v0

    .line 22
    sput-object v0, Lcom/whatsapp/y0;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/whatsapp/i1;Lcom/whatsapp/e1;Lcom/whatsapp/f1;)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p2, p0, Lcom/whatsapp/y0;->b:Lcom/whatsapp/e1;

    .line 3
    iput-object p3, p0, Lcom/whatsapp/y0;->c:Lcom/whatsapp/f1;

    .line 50
    iput-object p1, p0, Lcom/whatsapp/y0;->a:Lcom/whatsapp/i1;

    .line 42
    return-void
.end method

.method static a(I)B
    .locals 1
    .parameter

    .prologue
    .line 57
    const/16 v0, 0xa

    if-ge p0, v0, :cond_0

    .line 35
    add-int/lit8 v0, p0, 0x30

    int-to-byte v0, v0

    .line 54
    :goto_0
    return v0

    :cond_0
    add-int/lit8 v0, p0, 0x61

    add-int/lit8 v0, v0, -0xa

    int-to-byte v0, v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whatsapp/i1;)Ljava/lang/String;
    .locals 5
    .parameter
    .parameter
    .parameter
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
    const/16 v4, 0x3a

    sget-boolean v0, Lcom/whatsapp/nz;->b:Z

    .line 6
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 62
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-static {v2, p7}, Lcom/whatsapp/y0;->a([BLcom/whatsapp/i1;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 28
    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 67
    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 38
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/whatsapp/y0;->z:[Ljava/lang/String;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v4, Ljava/lang/String;

    invoke-static {v1, p7}, Lcom/whatsapp/y0;->a([BLcom/whatsapp/i1;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/y0;->b([B)[B

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ":"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v3, Lcom/whatsapp/y0;->z:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v3, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-static {v2, p7}, Lcom/whatsapp/y0;->a([BLcom/whatsapp/i1;)[B

    move-result-object v2

    invoke-static {v2}, Lcom/whatsapp/y0;->b([B)[B

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 60
    new-instance v2, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-static {v1, p7}, Lcom/whatsapp/y0;->a([BLcom/whatsapp/i1;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/whatsapp/y0;->b([B)[B

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([B)V

    .line 16
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 65
    sget-object v3, Lcom/whatsapp/y0;->z:[Ljava/lang/String;

    const/4 v4, 0x5

    aget-object v3, v3, v4

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 69
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 58
    sget-object v2, Lcom/whatsapp/y0;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 56
    sget-object v2, Lcom/whatsapp/y0;->z:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 17
    invoke-virtual {v1, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 70
    sget-object v2, Lcom/whatsapp/y0;->z:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 29
    invoke-virtual {v1, p5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 37
    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    :cond_0
    return-object v1
.end method

.method private static a([BLcom/whatsapp/i1;)[B
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 7
    invoke-interface {p1}, Lcom/whatsapp/i1;->a()V

    .line 25
    invoke-interface {p1, p0}, Lcom/whatsapp/i1;->a([B)V

    .line 66
    invoke-interface {p1}, Lcom/whatsapp/i1;->b()[B

    move-result-object v0

    return-object v0
.end method

.method static b([B)[B
    .locals 6
    .parameter

    .prologue
    const/4 v0, 0x0

    sget-boolean v3, Lcom/whatsapp/nz;->b:Z

    .line 11
    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    new-array v4, v1, [B

    move v1, v0

    .line 1
    :cond_0
    array-length v2, p0

    if-ge v0, v2, :cond_2

    .line 44
    aget-byte v2, p0, v0

    .line 39
    if-gez v2, :cond_1

    .line 15
    add-int/lit16 v2, v2, 0x100

    .line 63
    :cond_1
    shr-int/lit8 v5, v2, 0x4

    invoke-static {v5}, Lcom/whatsapp/y0;->a(I)B

    move-result v5

    aput-byte v5, v4, v1

    .line 74
    add-int/lit8 v1, v1, 0x1

    .line 32
    rem-int/lit8 v2, v2, 0x10

    invoke-static {v2}, Lcom/whatsapp/y0;->a(I)B

    move-result v2

    aput-byte v2, v4, v1

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 20
    add-int/lit8 v0, v0, 0x1

    if-eqz v3, :cond_0

    .line 12
    :cond_2
    return-object v4
.end method

.method private d()[B
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 19
    const-wide/32 v0, 0x3b9aca00

    .line 59
    const-wide v2, 0x2540be400L

    .line 73
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    .line 27
    cmp-long v0, v4, v0

    if-gez v0, :cond_0

    add-long v0, v4, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 40
    :goto_0
    return-object v0

    .line 33
    :cond_0
    cmp-long v0, v4, v2

    if-ltz v0, :cond_1

    new-instance v0, Ljava/io/IOException;

    sget-object v1, Lcom/whatsapp/y0;->z:[Ljava/lang/String;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 40
    :cond_1
    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    goto :goto_0
.end method

.method public static e()Ljava/lang/String;
    .locals 3

    .prologue
    .line 41
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const/16 v2, 0x24

    invoke-static {v0, v1, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static z([C)Ljava/lang/String;
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v1, v0

    :goto_0
    if-gt v1, v2, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    aget-char v3, p0, v2

    rem-int/lit8 v0, v2, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0xc

    :goto_1
    xor-int/2addr v0, v3

    int-to-char v0, v0

    aput-char v0, p0, v2

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x2f

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x78

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x34

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x3c

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static z(Ljava/lang/String;)[C
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    const/4 v1, 0x0

    aget-char v2, v0, v1

    xor-int/lit8 v2, v2, 0xc

    int-to-char v2, v2

    aput-char v2, v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Lcom/whatsapp/f1;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/whatsapp/y0;->c:Lcom/whatsapp/f1;

    return-object v0
.end method

.method public a(Lcom/whatsapp/qz;)V
    .locals 0
    .parameter

    .prologue
    .line 64
    iput-object p1, p0, Lcom/whatsapp/y0;->d:Lcom/whatsapp/qz;

    .line 14
    return-void
.end method

.method protected a([B)[B
    .locals 8
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x0

    .line 46
    .line 49
    iget-object v0, p0, Lcom/whatsapp/y0;->d:Lcom/whatsapp/qz;

    iget-object v0, v0, Lcom/whatsapp/qz;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    .line 47
    invoke-direct {p0}, Lcom/whatsapp/y0;->d()[B

    move-result-object v2

    .line 51
    iget-object v0, p0, Lcom/whatsapp/y0;->e:Ljava/lang/String;

    if-nez v0, :cond_1

    new-array v0, v6, [B

    .line 52
    :goto_0
    array-length v3, p1

    array-length v4, v1

    add-int/2addr v3, v4

    array-length v4, v2

    add-int/2addr v3, v4

    array-length v4, v0

    add-int/2addr v3, v4

    .line 30
    add-int/lit8 v4, v3, 0x4

    new-array v4, v4, [B

    .line 24
    array-length v5, v1

    invoke-static {v1, v6, v4, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    array-length v1, v1

    add-int/2addr v1, v7

    .line 71
    array-length v5, p1

    invoke-static {p1, v6, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    array-length v5, p1

    add-int/2addr v1, v5

    .line 48
    array-length v5, v2

    invoke-static {v2, v6, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    array-length v2, v2

    add-int/2addr v1, v2

    .line 5
    array-length v2, v0

    if-lez v2, :cond_0

    .line 10
    array-length v2, v0

    invoke-static {v0, v6, v4, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/y0;->d:Lcom/whatsapp/qz;

    iget-object v0, v0, Lcom/whatsapp/qz;->h:Lcom/whatsapp/g1;

    invoke-interface {v0, v4, v7, v3}, Lcom/whatsapp/g1;->a([BII)V

    .line 34
    iget-object v0, p0, Lcom/whatsapp/y0;->d:Lcom/whatsapp/qz;

    iget-object v0, v0, Lcom/whatsapp/qz;->h:Lcom/whatsapp/g1;

    invoke-interface {v0}, Lcom/whatsapp/g1;->a()[B

    move-result-object v0

    .line 68
    invoke-static {v0, v6, v4, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    return-object v4

    .line 51
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/y0;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    goto :goto_0
.end method

.method public b()Lcom/whatsapp/e1;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/whatsapp/y0;->b:Lcom/whatsapp/e1;

    return-object v0
.end method

.method abstract c()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/whatsapp/cg;,
            Lcom/whatsapp/bg;
        }
    .end annotation
.end method
