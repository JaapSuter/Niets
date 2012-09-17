.class final Lcom/whatsapp/mq;
.super Lcom/whatsapp/lq;
.source "mq.java"


# static fields
.field private static final z:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v4, 0x75

    const/16 v3, 0x60

    const/16 v2, 0x2c

    const/16 v1, 0xd

    const/4 v6, 0x0

    const/4 v0, 0x6

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "\u0018}\\O\u0018\u001c~_\u0001\u0012\u001c\"^\u0005\u0016\u001cdZ\u0005\u0011ViY\u0010\u0019\u0010nM\u0014\u0010Y"

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

    const-string v0, "Y`I\u0013\u0006\u0018jIZ"

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

    const/4 v10, 0x2

    const-string v0, "\u0014~K\u0001\u0011\u001dhHO\u0013\u000bbA?\u001b\u0018`I@\u001c\n-I\r\u0005\rt\u000c@\u001f\u0010i\u0016"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "\u0018cH\u0012\u001a\u0010i\u0002\u0012\u0010\nbY\u0012\u0016\u001c7\u0003O\u0016\u0016`\u0002\u0017\u001d\u0018y_\u0001\u0005\t\"\u001eQFH=\u0015YCM4"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3
    if-gt v7, v8, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "\u0018}\\O\u0018\u001c~_\u0001\u0012\u001cnD\u0001\u001b\u001ehH@\u0000\u0017fB\u000f\u0002\u0017-X\u0019\u0005\u001c-"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_4
    if-gt v7, v8, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v8, 0x5

    const-string v0, "\u001abAN\u0012\u0016bK\u000c\u0010W}^\u000f\u0016\u001c~_N\u0012\u0018}\\\u0013"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_5
    if-gt v6, v7, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/mq;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_6
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x79

    goto :goto_6

    :pswitch_1
    move v0, v1

    goto :goto_6

    :pswitch_2
    move v0, v2

    goto :goto_6

    :pswitch_3
    move v0, v3

    goto :goto_6

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_7
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x79

    goto :goto_7

    :pswitch_5
    move v0, v1

    goto :goto_7

    :pswitch_6
    move v0, v2

    goto :goto_7

    :pswitch_7
    move v0, v3

    goto :goto_7

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_8
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x79

    goto :goto_8

    :pswitch_9
    move v0, v1

    goto :goto_8

    :pswitch_a
    move v0, v2

    goto :goto_8

    :pswitch_b
    move v0, v3

    goto :goto_8

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_9
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x79

    goto :goto_9

    :pswitch_d
    move v0, v1

    goto :goto_9

    :pswitch_e
    move v0, v2

    goto :goto_9

    :pswitch_f
    move v0, v3

    goto :goto_9

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_a
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x79

    goto :goto_a

    :pswitch_11
    move v0, v1

    goto :goto_a

    :pswitch_12
    move v0, v2

    goto :goto_a

    :pswitch_13
    move v0, v3

    goto :goto_a

    :cond_5
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_b
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x79

    goto :goto_b

    :pswitch_15
    move v0, v1

    goto :goto_b

    :pswitch_16
    move v0, v2

    goto :goto_b

    :pswitch_17
    move v0, v3

    goto :goto_b

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

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/whatsapp/lq;-><init>()V

    return-void
.end method

.method private a(J)V
    .locals 2
    .parameter

    .prologue
    .line 34
    invoke-static {}, Lcom/whatsapp/App;->vb()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/32 v0, 0xdbba0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 25
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/messaging/MessageService;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 46
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/c2dm/C2DMRegistrar;->a(Landroid/content/Context;)V

    .line 48
    sget-object v0, Lcom/whatsapp/mq;->z:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-static {v0}, Lcom/whatsapp/App;->s(Ljava/lang/String;)V

    .line 2
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/whatsapp/App;->g(Z)Z

    .line 22
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/sz;)V
    .locals 4
    .parameter

    .prologue
    .line 40
    iget-boolean v0, p1, Lcom/whatsapp/sz;->v:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/whatsapp/App;->wb()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p1, Lcom/whatsapp/sz;->i:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xdbba0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 13
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/whatsapp/App;->h(Z)Z

    .line 29
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/messaging/MessageService;->c(Landroid/content/Context;)Z

    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 24
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v2}, Lcom/whatsapp/App;->j(Landroid/content/Context;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v1, v2}, Lcom/whatsapp/App;->c(Landroid/content/Context;I)V

    .line 42
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v1}, Lcom/whatsapp/messaging/MessageService;->c(Landroid/content/Context;)Z

    move-result v1

    if-eq v1, v0, :cond_0

    .line 4
    sget-object v0, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/App;->p(Landroid/content/Context;)V

    .line 6
    :cond_0
    return-void
.end method

.method public a(Lcom/whatsapp/sz;I)V
    .locals 12
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    const/4 v11, 0x6

    const/4 v10, 0x0

    const/4 v9, 0x1

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 38
    if-eqz p1, :cond_4

    .line 41
    iget-object v1, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v1, v1, Lcom/whatsapp/uz;->b:Z

    if-nez v1, :cond_a

    .line 61
    invoke-static {p1}, Lcom/whatsapp/App;->k(Lcom/whatsapp/sz;)V

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p1, Lcom/whatsapp/sz;->i:J

    sub-long/2addr v3, v5

    .line 16
    iget-object v1, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v5, v1, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    .line 60
    invoke-static {v5}, Lcom/whatsapp/gp;->a(Ljava/lang/String;)Lcom/whatsapp/zq;

    move-result-object v1

    .line 37
    sget-object v6, Lcom/whatsapp/App;->y:Lcom/whatsapp/yy;

    invoke-virtual {v6, v5}, Lcom/whatsapp/yy;->c(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 54
    sget-object v6, Lcom/whatsapp/App;->y:Lcom/whatsapp/yy;

    invoke-virtual {v6, v5, v10}, Lcom/whatsapp/yy;->b(Ljava/lang/String;Z)V

    .line 7
    invoke-static {v5}, Lcom/whatsapp/App;->f(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-virtual {v1}, Lcom/whatsapp/zq;->o()Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v6, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    if-eqz v6, :cond_1

    sget-object v6, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v7, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-virtual {v6, v7, v0}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 49
    :cond_1
    :goto_0
    iget-object v6, p1, Lcom/whatsapp/sz;->s:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 58
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/whatsapp/mq;->z:[Ljava/lang/String;

    const/4 v8, 0x2

    aget-object v7, v7, v8

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v7, Lcom/whatsapp/mq;->z:[Ljava/lang/String;

    aget-object v7, v7, v9

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    invoke-virtual {v7}, Lcom/whatsapp/uz;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 63
    :cond_2
    if-eqz v0, :cond_3

    iget-object v6, p1, Lcom/whatsapp/sz;->s:Ljava/lang/String;

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    iget-object v6, p1, Lcom/whatsapp/sz;->s:Ljava/lang/String;

    iget-object v7, v0, Lcom/whatsapp/zq;->t:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 65
    iget-object v6, p1, Lcom/whatsapp/sz;->s:Ljava/lang/String;

    iput-object v6, v0, Lcom/whatsapp/zq;->t:Ljava/lang/String;

    .line 31
    new-instance v6, Lcom/whatsapp/nh;

    invoke-direct {v6, p0, v0}, Lcom/whatsapp/nh;-><init>(Lcom/whatsapp/mq;Lcom/whatsapp/zq;)V

    invoke-static {v6}, Lcom/whatsapp/App;->a(Ljava/lang/Runnable;)V

    .line 33
    :cond_3
    invoke-static {}, Lcom/whatsapp/Conversation;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-boolean v0, Lcom/whatsapp/App;->u:Z

    if-nez v0, :cond_7

    invoke-static {}, Lcom/whatsapp/Conversation;->b()Lcom/whatsapp/Conversation;

    move-result-object v0

    iget-object v0, v0, Lcom/whatsapp/Conversation;->p:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 21
    iget-boolean v0, p1, Lcom/whatsapp/sz;->v:Z

    if-eqz v0, :cond_6

    .line 23
    invoke-direct {p0, v3, v4}, Lcom/whatsapp/mq;->a(J)V

    .line 9
    sget-boolean v0, Lcom/whatsapp/App;->tb:Z

    if-eqz v0, :cond_6

    .line 56
    :cond_4
    :goto_1
    return-void

    :cond_5
    move-object v0, v1

    .line 3
    goto :goto_0

    .line 44
    :cond_6
    sput-boolean v9, Lcom/whatsapp/App;->tb:Z

    .line 15
    iget-object v0, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/Conversation;->b()Lcom/whatsapp/Conversation;

    move-result-object v5

    iget-object v5, v5, Lcom/whatsapp/Conversation;->Qb:Lcom/whatsapp/zq;

    iget-object v5, v5, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 32
    sget-object v0, Lcom/whatsapp/App;->gb:Landroid/app/NotificationManager;

    invoke-virtual {v0, v9}, Landroid/app/NotificationManager;->cancel(I)V

    .line 1
    sget-boolean v0, Lcom/whatsapp/Conversation;->s:Z

    if-eqz v0, :cond_9

    .line 8
    sget-object v0, Lcom/whatsapp/mq;->z:[Ljava/lang/String;

    const/4 v5, 0x3

    aget-object v0, v0, v5

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/App;->a(Landroid/net/Uri;)V

    if-eqz v2, :cond_9

    .line 10
    :cond_7
    iget v0, v1, Lcom/whatsapp/zq;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v1, Lcom/whatsapp/zq;->a:I

    .line 18
    new-instance v0, Lcom/whatsapp/oh;

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/oh;-><init>(Lcom/whatsapp/mq;Lcom/whatsapp/zq;)V

    invoke-static {v0}, Lcom/whatsapp/App;->a(Ljava/lang/Runnable;)V

    .line 64
    iget-boolean v0, p1, Lcom/whatsapp/sz;->v:Z

    if-eqz v0, :cond_8

    .line 55
    sget-boolean v0, Lcom/whatsapp/App;->tb:Z

    invoke-static {v9, v0}, Lcom/whatsapp/App;->a(ZZ)V

    .line 57
    invoke-direct {p0, v3, v4}, Lcom/whatsapp/mq;->a(J)V

    .line 51
    sput-boolean v9, Lcom/whatsapp/App;->tb:Z

    if-eqz v2, :cond_9

    .line 68
    :cond_8
    invoke-static {v9, v10}, Lcom/whatsapp/App;->a(ZZ)V

    .line 67
    :cond_9
    if-eqz v2, :cond_4

    .line 17
    :cond_a
    const/4 v0, -0x1

    if-ne p2, v0, :cond_b

    iget v0, p1, Lcom/whatsapp/sz;->a:I

    if-eq v0, v11, :cond_b

    .line 28
    invoke-static {p1}, Lcom/whatsapp/App;->f(Lcom/whatsapp/sz;)V

    .line 59
    :cond_b
    iget v0, p1, Lcom/whatsapp/sz;->a:I

    if-ne v0, v11, :cond_d

    iget-wide v0, p1, Lcom/whatsapp/sz;->m:J

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_d

    .line 26
    iget-object v0, p1, Lcom/whatsapp/sz;->c:Ljava/lang/String;

    invoke-static {}, Lcom/whatsapp/App;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 30
    invoke-static {v9, v10}, Lcom/whatsapp/App;->a(ZZ)V

    .line 66
    :cond_c
    invoke-static {p1}, Lcom/whatsapp/App;->c(Lcom/whatsapp/sz;)V

    .line 19
    :cond_d
    iget v0, p1, Lcom/whatsapp/sz;->a:I

    if-ne v0, v11, :cond_4

    iget-wide v0, p1, Lcom/whatsapp/sz;->m:J

    const-wide/16 v2, 0x4

    cmp-long v0, v0, v2

    if-eqz v0, :cond_e

    iget-wide v0, p1, Lcom/whatsapp/sz;->m:J

    const-wide/16 v2, 0x5

    cmp-long v0, v0, v2

    if-eqz v0, :cond_e

    iget-wide v0, p1, Lcom/whatsapp/sz;->m:J

    const-wide/16 v2, 0x7

    cmp-long v0, v0, v2

    if-eqz v0, :cond_e

    iget-wide v0, p1, Lcom/whatsapp/sz;->m:J

    const-wide/16 v2, 0x6

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 53
    :cond_e
    invoke-static {p1}, Lcom/whatsapp/App;->d(Lcom/whatsapp/sz;)V

    goto/16 :goto_1
.end method

.method public b(Lcom/whatsapp/sz;)V
    .locals 2
    .parameter

    .prologue
    .line 47
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-boolean v0, v0, Lcom/whatsapp/uz;->b:Z

    if-nez v0, :cond_0

    .line 12
    sget-object v0, Lcom/whatsapp/mq;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0, p1}, Lcom/whatsapp/App;->b(Ljava/lang/String;Lcom/whatsapp/sz;)V

    .line 39
    invoke-static {p1}, Lcom/whatsapp/App;->k(Lcom/whatsapp/sz;)V

    .line 62
    :cond_0
    return-void
.end method

.method public b(Lcom/whatsapp/sz;I)V
    .locals 3
    .parameter
    .parameter

    .prologue
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 35
    packed-switch p2, :pswitch_data_0

    .line 69
    :goto_0
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/mq;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->c(Ljava/lang/String;)V

    .line 70
    :cond_0
    return-void

    .line 27
    :pswitch_1
    invoke-static {p1}, Lcom/whatsapp/App;->f(Lcom/whatsapp/sz;)V

    .line 14
    iget-byte v1, p1, Lcom/whatsapp/sz;->l:B

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    iget-byte v1, p1, Lcom/whatsapp/sz;->l:B

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 5
    :cond_1
    invoke-static {p1}, Lcom/whatsapp/j5;->b(Lcom/whatsapp/sz;)V

    if-eqz v0, :cond_0

    .line 50
    :pswitch_2
    invoke-static {p1}, Lcom/whatsapp/j5;->b(Lcom/whatsapp/sz;)V

    .line 36
    if-eqz v0, :cond_0

    .line 20
    :pswitch_3
    if-eqz v0, :cond_0

    goto :goto_0

    .line 35
    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
