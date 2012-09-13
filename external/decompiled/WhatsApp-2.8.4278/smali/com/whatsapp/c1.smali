.class public final Lcom/whatsapp/c1;
.super Ljava/lang/Object;
.source "c1.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[Lcom/whatsapp/w0;

.field public final c:[Lcom/whatsapp/c1;

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v2, 0x67

    const/16 v4, 0x43

    const/16 v1, 0xd

    const/4 v3, 0x6

    const/4 v6, 0x0

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "X3@nQ"

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

    const-string v0, "-\u0014r1\u0000c\u0000<c"

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

    const-string v0, "k\u0006o/\u000ciGt&\u0018x\u000et&G-\ti\'\u000c7G"

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

    sput-object v9, Lcom/whatsapp/c1;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x69

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

    const/16 v0, 0x69

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

    const/16 v0, 0x69

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

.method public constructor <init>(Ljava/lang/String;[Lcom/whatsapp/w0;)V
    .locals 1
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    .line 24
    iput-object p2, p0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    .line 64
    iput-object v0, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    .line 28
    iput-object v0, p0, Lcom/whatsapp/c1;->d:[B

    .line 57
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Lcom/whatsapp/w0;Lcom/whatsapp/c1;)V
    .locals 2
    .parameter
    .parameter
    .parameter

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    .line 27
    iput-object p2, p0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    .line 1
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/whatsapp/c1;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    iput-object v0, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/c1;->d:[B

    .line 61
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Lcom/whatsapp/w0;Ljava/lang/String;)V
    .locals 3
    .parameter
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    .line 20
    iput-object v2, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    .line 47
    if-eqz p3, :cond_0

    .line 62
    sget-object v0, Lcom/whatsapp/c1;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/c1;->d:[B

    sget-boolean v0, Lcom/whatsapp/nz;->b:Z

    if-eqz v0, :cond_1

    .line 2
    :cond_0
    iput-object v2, p0, Lcom/whatsapp/c1;->d:[B

    .line 4
    :cond_1
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Lcom/whatsapp/w0;[B)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    .line 44
    iput-object p2, p0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    .line 43
    iput-object p3, p0, Lcom/whatsapp/c1;->d:[B

    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Lcom/whatsapp/w0;[Lcom/whatsapp/c1;)V
    .locals 1
    .parameter
    .parameter
    .parameter

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    .line 58
    iput-object p3, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    .line 8
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whatsapp/c1;->d:[B

    .line 52
    return-void
.end method

.method public static a(Lcom/whatsapp/c1;Ljava/lang/String;)V
    .locals 4
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    .line 60
    invoke-static {p0, p1}, Lcom/whatsapp/c1;->b(Lcom/whatsapp/c1;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lcom/whatsapp/bg;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/c1;->z:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/c1;->z:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/whatsapp/bg;-><init>(Ljava/lang/String;)V

    throw v0

    .line 36
    :cond_0
    return-void
.end method

.method public static b(Lcom/whatsapp/c1;Ljava/lang/String;)Z
    .locals 1
    .parameter
    .parameter

    .prologue
    .line 30
    if-eqz p0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(I)Lcom/whatsapp/c1;
    .locals 1
    .parameter

    .prologue
    .line 37
    iget-object v0, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    array-length v0, v0

    if-gt v0, p1, :cond_1

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    aget-object v0, v0, p1

    goto :goto_0
.end method

.method public a()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 6
    iget-object v0, p0, Lcom/whatsapp/c1;->d:[B

    if-nez v0, :cond_0

    .line 46
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/c1;->d:[B

    sget-object v2, Lcom/whatsapp/c1;->z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/nz;->b:Z

    .line 10
    iget-object v0, p0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    if-nez v0, :cond_0

    move-object v0, v1

    .line 40
    :goto_0
    return-object v0

    .line 39
    :cond_0
    const/4 v0, 0x0

    :cond_1
    iget-object v3, p0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    array-length v3, v3

    if-ge v0, v3, :cond_3

    .line 13
    iget-object v3, p0, Lcom/whatsapp/c1;->b:[Lcom/whatsapp/w0;

    aget-object v3, v3, v0

    .line 49
    iget-object v4, v3, Lcom/whatsapp/w0;->a:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 21
    iget-object v0, v3, Lcom/whatsapp/w0;->b:Ljava/lang/String;

    goto :goto_0

    .line 33
    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_1

    :cond_3
    move-object v0, v1

    .line 40
    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Lcom/whatsapp/c1;
    .locals 4
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/nz;->b:Z

    .line 32
    iget-object v0, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    if-nez v0, :cond_0

    move-object v0, v1

    .line 56
    :goto_0
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    :cond_1
    iget-object v3, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    array-length v3, v3

    if-ge v0, v3, :cond_3

    .line 55
    iget-object v3, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 12
    iget-object v1, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    aget-object v0, v1, v0

    goto :goto_0

    .line 31
    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_1

    :cond_3
    move-object v0, v1

    .line 25
    goto :goto_0
.end method

.method public c(Ljava/lang/String;)Ljava/util/Vector;
    .locals 4
    .parameter

    .prologue
    sget-boolean v2, Lcom/whatsapp/nz;->b:Z

    .line 45
    new-instance v1, Ljava/util/Vector;

    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 48
    iget-object v0, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    if-nez v0, :cond_0

    move-object v0, v1

    .line 54
    :goto_0
    return-object v0

    .line 35
    :cond_0
    const/4 v0, 0x0

    :cond_1
    iget-object v3, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    array-length v3, v3

    if-ge v0, v3, :cond_3

    .line 5
    iget-object v3, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/whatsapp/c1;->a:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 26
    iget-object v3, p0, Lcom/whatsapp/c1;->c:[Lcom/whatsapp/c1;

    aget-object v3, v3, v0

    invoke-virtual {v1, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    .line 34
    :cond_2
    add-int/lit8 v0, v0, 0x1

    if-eqz v2, :cond_1

    :cond_3
    move-object v0, v1

    .line 7
    goto :goto_0
.end method
