.class public Lnb;
.super Ljava/lang/Object;
.source "nb.java"

# interfaces
.implements Lub;


# static fields
.field public static e:I

.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:[B

.field private b:I

.field private c:I

.field private d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x4e

    const/16 v2, 0x3d

    const/16 v1, 0xe

    const/16 v4, 0x8

    const/4 v6, 0x0

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "gS8i\u0004gYnx\t|\\#m\u001ckOnx\t}N+lHzRnZ+:\u001d\'f\u0001z\u001dc("

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

    const-string v0, "gS>}\u001c._;n\u000ekOn|\u0007a\u001d=`\u0007|I"

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

    const/4 v8, 0x2

    const-string v0, "aH:x\u001dz\u001d,}\u000ehX<(\u001caRn{\u0000aO:"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_2
    if-gt v6, v7, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lnb;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x68

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_3

    :pswitch_1
    move v0, v2

    goto :goto_3

    :pswitch_2
    move v0, v3

    goto :goto_3

    :pswitch_3
    move v0, v4

    goto :goto_3

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    const/16 v0, 0x68

    :goto_4
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_4

    :pswitch_5
    move v0, v2

    goto :goto_4

    :pswitch_6
    move v0, v3

    goto :goto_4

    :pswitch_7
    move v0, v4

    goto :goto_4

    :cond_2
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    const/16 v0, 0x68

    :goto_5
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_2

    :pswitch_8
    move v0, v1

    goto :goto_5

    :pswitch_9
    move v0, v2

    goto :goto_5

    :pswitch_a
    move v0, v3

    goto :goto_5

    :pswitch_b
    move v0, v4

    goto :goto_5

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
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    sget v0, Lnb;->e:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object v2, p0, Lnb;->a:[B

    .line 34
    iput v1, p0, Lnb;->b:I

    .line 38
    iput v1, p0, Lnb;->c:I

    .line 1
    iput-object v2, p0, Lnb;->d:[B

    sget v1, Lcom/whatsapp/App;->wc:I

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    sput v0, Lnb;->e:I

    :cond_0
    return-void
.end method

.method private a([B)V
    .locals 8
    .parameter

    .prologue
    const/16 v7, 0x100

    const/4 v0, 0x0

    sget v3, Lnb;->e:I

    .line 2
    iput-object p1, p0, Lnb;->d:[B

    .line 27
    iput v0, p0, Lnb;->b:I

    .line 29
    iput v0, p0, Lnb;->c:I

    .line 32
    iget-object v1, p0, Lnb;->a:[B

    if-nez v1, :cond_0

    .line 19
    new-array v1, v7, [B

    iput-object v1, p0, Lnb;->a:[B

    :cond_0
    move v1, v0

    .line 33
    :cond_1
    if-ge v1, v7, :cond_2

    .line 25
    iget-object v2, p0, Lnb;->a:[B

    int-to-byte v4, v1

    aput-byte v4, v2, v1

    .line 9
    add-int/lit8 v1, v1, 0x1

    if-eqz v3, :cond_1

    :cond_2
    move v1, v0

    move v2, v0

    .line 31
    :cond_3
    if-ge v0, v7, :cond_4

    .line 5
    aget-byte v4, p1, v2

    and-int/lit16 v4, v4, 0xff

    iget-object v5, p0, Lnb;->a:[B

    aget-byte v5, v5, v0

    add-int/2addr v4, v5

    add-int/2addr v1, v4

    and-int/lit16 v1, v1, 0xff

    .line 17
    iget-object v4, p0, Lnb;->a:[B

    aget-byte v4, v4, v0

    .line 23
    iget-object v5, p0, Lnb;->a:[B

    iget-object v6, p0, Lnb;->a:[B

    aget-byte v6, v6, v1

    aput-byte v6, v5, v0

    .line 21
    iget-object v5, p0, Lnb;->a:[B

    aput-byte v4, v5, v1

    .line 4
    add-int/lit8 v2, v2, 0x1

    array-length v4, p1

    rem-int/2addr v2, v4

    .line 28
    add-int/lit8 v0, v0, 0x1

    if-eqz v3, :cond_3

    .line 13
    :cond_4
    return-void
.end method


# virtual methods
.method public a(ZLjb;)V
    .locals 4
    .parameter
    .parameter

    .prologue
    .line 30
    instance-of v0, p2, Lrb;

    if-eqz v0, :cond_0

    .line 37
    check-cast p2, Lrb;

    invoke-virtual {p2}, Lrb;->a()[B

    move-result-object v0

    iput-object v0, p0, Lnb;->d:[B

    .line 18
    iget-object v0, p0, Lnb;->d:[B

    invoke-direct {p0, v0}, Lnb;->a([B)V

    .line 22
    return-void

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lnb;->z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a([BII[BI)V
    .locals 8
    .parameter
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    sget v1, Lnb;->e:I

    .line 35
    add-int v0, p2, p3

    array-length v2, p1

    if-le v0, v2, :cond_0

    .line 3
    new-instance v0, Lbc;

    sget-object v1, Lnb;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Lbc;-><init>(Ljava/lang/String;)V

    throw v0

    .line 24
    :cond_0
    add-int v0, p5, p3

    array-length v2, p4

    if-le v0, v2, :cond_1

    .line 10
    new-instance v0, Lbc;

    sget-object v1, Lnb;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-direct {v0, v1}, Lbc;-><init>(Ljava/lang/String;)V

    throw v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    :cond_2
    if-ge v0, p3, :cond_3

    .line 6
    iget v2, p0, Lnb;->b:I

    add-int/lit8 v2, v2, 0x1

    and-int/lit16 v2, v2, 0xff

    iput v2, p0, Lnb;->b:I

    .line 36
    iget-object v2, p0, Lnb;->a:[B

    iget v3, p0, Lnb;->b:I

    aget-byte v2, v2, v3

    iget v3, p0, Lnb;->c:I

    add-int/2addr v2, v3

    and-int/lit16 v2, v2, 0xff

    iput v2, p0, Lnb;->c:I

    .line 40
    iget-object v2, p0, Lnb;->a:[B

    iget v3, p0, Lnb;->b:I

    aget-byte v2, v2, v3

    .line 14
    iget-object v3, p0, Lnb;->a:[B

    iget v4, p0, Lnb;->b:I

    iget-object v5, p0, Lnb;->a:[B

    iget v6, p0, Lnb;->c:I

    aget-byte v5, v5, v6

    aput-byte v5, v3, v4

    .line 39
    iget-object v3, p0, Lnb;->a:[B

    iget v4, p0, Lnb;->c:I

    aput-byte v2, v3, v4

    .line 16
    add-int v2, v0, p5

    add-int v3, v0, p2

    aget-byte v3, p1, v3

    iget-object v4, p0, Lnb;->a:[B

    iget-object v5, p0, Lnb;->a:[B

    iget v6, p0, Lnb;->b:I

    aget-byte v5, v5, v6

    iget-object v6, p0, Lnb;->a:[B

    iget v7, p0, Lnb;->c:I

    aget-byte v6, v6, v7

    add-int/2addr v5, v6

    and-int/lit16 v5, v5, 0xff

    aget-byte v4, v4, v5

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p4, v2

    .line 41
    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_2

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    .line 8
    :cond_3
    return-void
.end method
