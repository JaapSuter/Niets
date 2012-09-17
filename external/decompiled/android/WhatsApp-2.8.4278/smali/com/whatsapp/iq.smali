.class final Lcom/whatsapp/iq;
.super Lcom/whatsapp/hq;
.source "iq.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const/16 v3, 0x36

    const/16 v1, 0x29

    const/16 v2, 0x21

    const/16 v4, 0x11

    const/4 v6, 0x0

    const/4 v0, 0x2

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0003\u0012\u000bU~GNDDbHLHY\u007fZUFD1K]GYcL\u0005@PeLJ\u0000"

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

    const-string v0, "\u0003\u0012\u000bU~GNDDbHLHY\u007fZUFD>@VESi\tQR\u0016\u007fL_@Bx_]\u0000"

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

    sput-object v9, Lcom/whatsapp/iq;->z:[Ljava/lang/String;

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
    const/16 v0, 0x38

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
    const/16 v0, 0x38

    goto :goto_3

    :pswitch_6
    move v0, v2

    goto :goto_3

    :pswitch_7
    move v0, v3

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

.method constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Lcom/whatsapp/hq;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 7
    invoke-static {p1}, Lcom/whatsapp/gp;->f(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/whatsapp/iq;->a:I

    .line 13
    iget v0, p0, Lcom/whatsapp/iq;->a:I

    if-gez v0, :cond_0

    .line 8
    sget-object v0, Lcom/whatsapp/iq;->z:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 11
    :cond_0
    invoke-static {}, Lcom/whatsapp/Conversations;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Lcom/whatsapp/Conversations;->b()Lcom/whatsapp/Conversations;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/Conversations;->h()V

    .line 19
    :cond_1
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3
    .parameter

    .prologue
    const/4 v1, -0x1

    .line 3
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/fq;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    invoke-static {p1}, Lcom/whatsapp/gp;->g(Ljava/lang/String;)I

    move-result v0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v2, :cond_2

    .line 9
    :cond_0
    iget v0, p0, Lcom/whatsapp/iq;->a:I

    if-ne v0, v1, :cond_1

    .line 14
    sget-object v0, Lcom/whatsapp/iq;->z:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    :cond_1
    move v0, v1

    .line 6
    :cond_2
    invoke-static {}, Lcom/whatsapp/Conversations;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 22
    iget v2, p0, Lcom/whatsapp/iq;->a:I

    if-ne v2, v0, :cond_3

    if-ne v0, v1, :cond_4

    .line 1
    :cond_3
    invoke-static {}, Lcom/whatsapp/Conversations;->b()Lcom/whatsapp/Conversations;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/Conversations;->h()V

    .line 12
    :cond_4
    invoke-static {}, Lcom/whatsapp/Conversations;->b()Lcom/whatsapp/Conversations;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whatsapp/Conversations;->d(Ljava/lang/String;)V

    .line 18
    :cond_5
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1
    .parameter

    .prologue
    .line 21
    sget-object v0, Lcom/whatsapp/App;->z:Lcom/whatsapp/fq;

    invoke-virtual {v0, p1}, Lcom/whatsapp/fq;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    invoke-static {p1}, Lcom/whatsapp/gp;->g(Ljava/lang/String;)I

    .line 16
    invoke-static {}, Lcom/whatsapp/Conversations;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lcom/whatsapp/Conversations;->b()Lcom/whatsapp/Conversations;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whatsapp/Conversations;->h()V

    .line 15
    :cond_0
    return-void
.end method
