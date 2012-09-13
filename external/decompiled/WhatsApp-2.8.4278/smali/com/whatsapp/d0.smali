.class Lcom/whatsapp/d0;
.super Lcom/whatsapp/xz;
.source "d0.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/whatsapp/d1;

.field final c:Lcom/whatsapp/wz;

.field final d:Lcom/whatsapp/qz;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v4, 0x59

    const/16 v1, 0x51

    const/16 v3, 0x36

    const/4 v2, 0x3

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "88"

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

    const-string v0, "6.lC)"

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

    sput-object v9, Lcom/whatsapp/d0;->z:[Ljava/lang/String;

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
    const/16 v0, 0x5c

    goto :goto_2

    :pswitch_2
    move v0, v2

    goto :goto_2

    :pswitch_3
    move v0, v3

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
    const/16 v0, 0x5c

    goto :goto_3

    :pswitch_6
    move v0, v2

    goto :goto_3

    :pswitch_7
    move v0, v3

    goto :goto_3

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
.end method

.method constructor <init>(Lcom/whatsapp/qz;Ljava/lang/String;Lcom/whatsapp/d1;Lcom/whatsapp/wz;)V
    .locals 0
    .parameter
    .parameter
    .parameter
    .parameter

    .prologue
    .line 10
    iput-object p1, p0, Lcom/whatsapp/d0;->d:Lcom/whatsapp/qz;

    iput-object p2, p0, Lcom/whatsapp/d0;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/whatsapp/d0;->b:Lcom/whatsapp/d1;

    iput-object p4, p0, Lcom/whatsapp/d0;->c:Lcom/whatsapp/wz;

    invoke-direct {p0}, Lcom/whatsapp/xz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/d0;->c:Lcom/whatsapp/wz;

    if-eqz v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/whatsapp/d0;->c:Lcom/whatsapp/wz;

    invoke-interface {v0, p1}, Lcom/whatsapp/wz;->a(I)V

    .line 6
    :cond_0
    return-void
.end method

.method public a(Lcom/whatsapp/c1;Ljava/lang/String;)V
    .locals 4
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whatsapp/bg;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 5
    invoke-virtual {p1, v3}, Lcom/whatsapp/c1;->a(I)Lcom/whatsapp/c1;

    move-result-object v0

    .line 8
    sget-object v1, Lcom/whatsapp/d0;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, v1}, Lcom/whatsapp/c1;->a(Lcom/whatsapp/c1;Ljava/lang/String;)V

    .line 7
    sget-object v1, Lcom/whatsapp/d0;->z:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Lcom/whatsapp/c1;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/whatsapp/d0;->d:Lcom/whatsapp/qz;

    iget-object v1, v1, Lcom/whatsapp/qz;->k:Lcom/whatsapp/vz;

    iget-object v2, p0, Lcom/whatsapp/d0;->d:Lcom/whatsapp/qz;

    invoke-static {v2, v0}, Lcom/whatsapp/qz;->a(Lcom/whatsapp/qz;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whatsapp/d0;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lcom/whatsapp/vz;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1
    iget-object v1, p0, Lcom/whatsapp/d0;->b:Lcom/whatsapp/d1;

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/whatsapp/d0;->b:Lcom/whatsapp/d1;

    iget-object v2, p0, Lcom/whatsapp/d0;->d:Lcom/whatsapp/qz;

    invoke-static {v2, v0}, Lcom/whatsapp/qz;->a(Lcom/whatsapp/qz;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/whatsapp/d1;->a(Ljava/lang/String;)V

    .line 4
    :cond_0
    return-void
.end method
