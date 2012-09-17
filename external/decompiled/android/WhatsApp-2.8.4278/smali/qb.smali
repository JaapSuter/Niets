.class public Lqb;
.super Ljava/lang/Object;
.source "qb.java"

# interfaces
.implements Lpb;


# static fields
.field private static f:Ljava/util/Hashtable;

.field public static g:Z

.field private static final z:Ljava/lang/String;


# instance fields
.field private a:Lkb;

.field private b:I

.field private c:I

.field private d:[B

.field private e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/16 v5, 0x80

    const/16 v4, 0x40

    const-string v0, "LWUj<NW\u001e`:^\\MpsIXMw6]\u0003\u001e"

    invoke-static {v0}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v0

    invoke-static {v0}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqb;->z:Ljava/lang/String;

    .line 29
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lqb;->f:Ljava/util/Hashtable;

    .line 14
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "~vmP`\r\u0008\u000f"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 14
    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x20

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "t}\u000c"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 53
    new-instance v2, Ljava/lang/Integer;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "t}\n"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "t}\u000b"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 44
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "kpnA\u001e}\u0008\u000c<"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 15
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "kpnA\u001e}\u0008\u00084"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 21
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "jq\u007f)b"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 10
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "jq\u007f)a\u000b\r"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 52
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "jq\u007f)a\u000c\u000f"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 28
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "jq\u007f)`\u0001\r"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 33
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "jq\u007f)f\u0008\u000b"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 59
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "mPYa!"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 18
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    const-string v1, "nQWv?IVQh"

    .line -1
    invoke-static {v1}, Lqb;->z(Ljava/lang/String;)[C

    move-result-object v1

    invoke-static {v1}, Lqb;->z([C)Ljava/lang/String;

    move-result-object v1

    .line 34
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v4}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    return-void
.end method

.method public constructor <init>(Lkb;)V
    .locals 1
    .parameter

    .prologue
    .line 2
    invoke-static {p1}, Lqb;->a(Lkb;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lqb;-><init>(Lkb;I)V

    .line 6
    return-void
.end method

.method private constructor <init>(Lkb;I)V
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lqb;->a:Lkb;

    .line 57
    invoke-interface {p1}, Lkb;->b()I

    move-result v0

    iput v0, p0, Lqb;->b:I

    .line 36
    iput p2, p0, Lqb;->c:I

    .line 3
    iget v0, p0, Lqb;->c:I

    new-array v0, v0, [B

    iput-object v0, p0, Lqb;->d:[B

    .line 20
    iget v0, p0, Lqb;->c:I

    new-array v0, v0, [B

    iput-object v0, p0, Lqb;->e:[B

    .line 47
    return-void
.end method

.method private static a(Lkb;)I
    .locals 3
    .parameter

    .prologue
    .line 38
    instance-of v0, p0, Lob;

    if-eqz v0, :cond_0

    .line 61
    check-cast p0, Lob;

    invoke-interface {p0}, Lob;->a()I

    move-result v0

    :goto_0
    return v0

    .line 7
    :cond_0
    sget-object v0, Lqb;->f:Ljava/util/Hashtable;

    invoke-interface {p0}, Lkb;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 42
    if-nez v0, :cond_1

    .line 37
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lqb;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p0}, Lkb;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method private static z([C)Ljava/lang/String;
    .locals 5

    const/16 v1, 0x39

    array-length v0, p0

    const/4 v2, 0x0

    move v3, v2

    move v2, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    aget-char v4, p0, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x53

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, p0, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_1

    :pswitch_1
    move v0, v1

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x3e

    goto :goto_1

    :pswitch_3
    const/4 v0, 0x4

    goto :goto_1

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

    xor-int/lit8 v2, v2, 0x53

    int-to-char v2, v2

    aput-char v2, v0, v1

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lqb;->b:I

    return v0
.end method

.method public a([BI)I
    .locals 6
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    sget-boolean v1, Lqb;->g:Z

    .line 46
    iget v2, p0, Lqb;->b:I

    new-array v2, v2, [B

    .line 45
    iget-object v3, p0, Lqb;->a:Lkb;

    invoke-interface {v3, v2, v0}, Lkb;->a([BI)I

    .line 51
    iget-object v3, p0, Lqb;->a:Lkb;

    iget-object v4, p0, Lqb;->e:[B

    iget-object v5, p0, Lqb;->e:[B

    array-length v5, v5

    invoke-interface {v3, v4, v0, v5}, Lkb;->a([BII)V

    .line 54
    iget-object v3, p0, Lqb;->a:Lkb;

    array-length v4, v2

    invoke-interface {v3, v2, v0, v4}, Lkb;->a([BII)V

    .line 9
    iget-object v2, p0, Lqb;->a:Lkb;

    invoke-interface {v2, p1, p2}, Lkb;->a([BI)I

    move-result v2

    .line 65
    invoke-virtual {p0}, Lqb;->a()V

    .line 16
    sget v3, Lcom/whatsapp/App;->wc:I

    if-eqz v3, :cond_0

    if-eqz v1, :cond_1

    :goto_0
    sput-boolean v0, Lqb;->g:Z

    :cond_0
    return v2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public a()V
    .locals 4

    .prologue
    .line 1
    iget-object v0, p0, Lqb;->a:Lkb;

    invoke-interface {v0}, Lkb;->c()V

    .line 4
    iget-object v0, p0, Lqb;->a:Lkb;

    iget-object v1, p0, Lqb;->d:[B

    const/4 v2, 0x0

    iget-object v3, p0, Lqb;->d:[B

    array-length v3, v3

    invoke-interface {v0, v1, v2, v3}, Lkb;->a([BII)V

    .line 24
    return-void
.end method

.method public a(Ljb;)V
    .locals 5
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Lqb;->g:Z

    .line 17
    iget-object v0, p0, Lqb;->a:Lkb;

    invoke-interface {v0}, Lkb;->c()V

    .line 63
    check-cast p1, Lrb;

    invoke-virtual {p1}, Lrb;->a()[B

    move-result-object v3

    .line 12
    array-length v0, v3

    iget v4, p0, Lqb;->c:I

    if-le v0, v4, :cond_2

    .line 23
    iget-object v0, p0, Lqb;->a:Lkb;

    array-length v4, v3

    invoke-interface {v0, v3, v1, v4}, Lkb;->a([BII)V

    .line 55
    iget-object v0, p0, Lqb;->a:Lkb;

    iget-object v4, p0, Lqb;->d:[B

    invoke-interface {v0, v4, v1}, Lkb;->a([BI)I

    .line 48
    iget v0, p0, Lqb;->b:I

    :cond_0
    iget-object v4, p0, Lqb;->d:[B

    array-length v4, v4

    if-ge v0, v4, :cond_1

    .line 25
    iget-object v4, p0, Lqb;->d:[B

    aput-byte v1, v4, v0

    .line 64
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_0

    sget v0, Lcom/whatsapp/App;->wc:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/whatsapp/App;->wc:I

    :cond_1
    if-eqz v2, :cond_4

    .line 58
    :cond_2
    iget-object v0, p0, Lqb;->d:[B

    array-length v4, v3

    invoke-static {v3, v1, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    array-length v0, v3

    :cond_3
    iget-object v3, p0, Lqb;->d:[B

    array-length v3, v3

    if-ge v0, v3, :cond_4

    .line 22
    iget-object v3, p0, Lqb;->d:[B

    aput-byte v1, v3, v0

    .line 27
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_3

    .line 19
    :cond_4
    iget-object v0, p0, Lqb;->d:[B

    array-length v0, v0

    new-array v0, v0, [B

    iput-object v0, p0, Lqb;->e:[B

    .line 32
    iget-object v0, p0, Lqb;->d:[B

    iget-object v3, p0, Lqb;->e:[B

    iget-object v4, p0, Lqb;->d:[B

    array-length v4, v4

    invoke-static {v0, v1, v3, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v1

    .line 60
    :cond_5
    iget-object v3, p0, Lqb;->d:[B

    array-length v3, v3

    if-ge v0, v3, :cond_6

    .line 30
    iget-object v3, p0, Lqb;->d:[B

    aget-byte v4, v3, v0

    xor-int/lit8 v4, v4, 0x36

    int-to-byte v4, v4

    aput-byte v4, v3, v0

    .line 41
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_5

    :cond_6
    move v0, v1

    .line 43
    :cond_7
    iget-object v3, p0, Lqb;->e:[B

    array-length v3, v3

    if-ge v0, v3, :cond_8

    .line 62
    iget-object v3, p0, Lqb;->e:[B

    aget-byte v4, v3, v0

    xor-int/lit8 v4, v4, 0x5c

    int-to-byte v4, v4

    aput-byte v4, v3, v0

    .line 8
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_7

    .line 49
    :cond_8
    iget-object v0, p0, Lqb;->a:Lkb;

    iget-object v2, p0, Lqb;->d:[B

    iget-object v3, p0, Lqb;->d:[B

    array-length v3, v3

    invoke-interface {v0, v2, v1, v3}, Lkb;->a([BII)V

    .line 31
    return-void
.end method

.method public a([BII)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 39
    iget-object v0, p0, Lqb;->a:Lkb;

    invoke-interface {v0, p1, p2, p3}, Lkb;->a([BII)V

    .line 56
    return-void
.end method
