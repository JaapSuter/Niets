.class Lcom/whatsapp/v0;
.super Lcom/whatsapp/xz;
.source "v0.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/String;

.field final d:Lcom/whatsapp/qz;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v3, 0x5f

    const/16 v4, 0x5b

    const/16 v2, 0x37

    const/16 v1, 0x20

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "IS"

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

    const/4 v8, 0x1

    const-string v0, "P^<\u0018.RR"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_1
    if-gt v6, v7, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/v0;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_2
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_2

    :pswitch_1
    move v0, v2

    goto :goto_2

    :pswitch_2
    move v0, v3

    goto :goto_2

    :pswitch_3
    const/16 v0, 0x6c

    goto :goto_2

    :cond_1
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_3
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_1

    :pswitch_4
    move v0, v1

    goto :goto_3

    :pswitch_5
    move v0, v2

    goto :goto_3

    :pswitch_6
    move v0, v3

    goto :goto_3

    :pswitch_7
    const/16 v0, 0x6c

    goto :goto_3

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
.end method

.method constructor <init>(Lcom/whatsapp/qz;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 9
    iput-object p1, p0, Lcom/whatsapp/v0;->d:Lcom/whatsapp/qz;

    iput-object p2, p0, Lcom/whatsapp/v0;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/whatsapp/v0;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/whatsapp/v0;->c:Ljava/lang/String;

    invoke-direct {p0}, Lcom/whatsapp/xz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    .line 6
    const/16 v0, 0x194

    if-ne p1, v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/v0;->d:Lcom/whatsapp/qz;

    iget-object v0, v0, Lcom/whatsapp/qz;->j:Lcom/whatsapp/x0;

    iget-object v1, p0, Lcom/whatsapp/v0;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v2, v2}, Lcom/whatsapp/x0;->a(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)V

    sget-boolean v0, Lcom/whatsapp/nz;->b:Z

    if-eqz v0, :cond_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/v0;->d:Lcom/whatsapp/qz;

    iget-object v0, v0, Lcom/whatsapp/qz;->j:Lcom/whatsapp/x0;

    iget-object v1, p0, Lcom/whatsapp/v0;->c:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/whatsapp/x0;->a(Ljava/lang/String;I)V

    .line 7
    :cond_1
    return-void
.end method

.method public a(Lcom/whatsapp/c1;Ljava/lang/String;)V
    .locals 4
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/whatsapp/bg;
        }
    .end annotation

    .prologue
    .line 8
    sget-object v0, Lcom/whatsapp/v0;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Lcom/whatsapp/c1;->b(Ljava/lang/String;)Lcom/whatsapp/c1;

    move-result-object v2

    .line 2
    iget-object v1, p0, Lcom/whatsapp/v0;->a:Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 10
    iget-object v0, v2, Lcom/whatsapp/c1;->d:[B

    .line 13
    sget-object v1, Lcom/whatsapp/v0;->z:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v1, v1, v3

    invoke-virtual {v2, v1}, Lcom/whatsapp/c1;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 5
    :cond_0
    if-eqz p2, :cond_1

    .line 3
    iget-object v2, p0, Lcom/whatsapp/v0;->d:Lcom/whatsapp/qz;

    iget-object v2, v2, Lcom/whatsapp/qz;->j:Lcom/whatsapp/x0;

    iget-object v3, p0, Lcom/whatsapp/v0;->b:Ljava/lang/String;

    invoke-interface {v2, p2, v1, v0, v3}, Lcom/whatsapp/x0;->a(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)V

    .line 11
    :cond_1
    return-void
.end method
