.class public Lcom/whatsapp/hz;
.super Lcom/whatsapp/gz;
.source "hz.java"

# interfaces
.implements Lcom/whatsapp/wz;
.implements Lcom/whatsapp/d1;


# static fields
.field private static j:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/hz;",
            ">;"
        }
    .end annotation
.end field

.field public static l:Landroid/os/Handler;

.field private static final z:[Ljava/lang/String;


# instance fields
.field public f:Z

.field private g:Z

.field private h:Ljava/lang/Long;

.field private i:Lcom/whatsapp/fab;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .prologue
    const/16 v3, 0x5d

    const/16 v1, 0x5a

    const/16 v4, 0x3f

    const/4 v2, 0x7

    const/4 v6, 0x0

    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "*u2\u001aV6b-\u0014P.h5\u001dQ>k8\u000e\u0010(b,\tZ)s}\u001a^3k8\u0018\u001f`\'"

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

    const-string v0, "z{}"

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

    const-string v0, "*u2\u001aV6b-\u0014P.h5\u001dQ>k8\u000e\u0010(b,\tZ)s}\u000fJ9d8\u000fLz=}"

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

    sput-object v9, Lcom/whatsapp/hz;->z:[Ljava/lang/String;

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/whatsapp/hz;->j:Ljava/util/HashMap;

    .line 36
    new-instance v0, Lcom/whatsapp/nd;

    invoke-direct {v0}, Lcom/whatsapp/nd;-><init>()V

    sput-object v0, Lcom/whatsapp/hz;->l:Landroid/os/Handler;

    return-void

    .line -1
    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

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
    const/16 v0, 0x7c

    goto :goto_3

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

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
    const/16 v0, 0x7c

    goto :goto_4

    :cond_2
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

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
    const/16 v0, 0x7c

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

.method public constructor <init>(Ljava/lang/String;[B[B)V
    .locals 4
    .parameter
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/whatsapp/gz;-><init>(Ljava/lang/String;[B[BI)V

    .line 33
    iput-boolean v0, p0, Lcom/whatsapp/hz;->f:Z

    .line 32
    iput-boolean v0, p0, Lcom/whatsapp/hz;->g:Z

    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/hz;->h:Ljava/lang/Long;

    .line 35
    sget-object v0, Lcom/whatsapp/hz;->j:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/hz;->h:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    new-instance v0, Lcom/whatsapp/fab;

    invoke-direct {v0, p0}, Lcom/whatsapp/fab;-><init>(Lcom/whatsapp/hz;)V

    iput-object v0, p0, Lcom/whatsapp/hz;->i:Lcom/whatsapp/fab;

    .line 16
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iget-object v1, p0, Lcom/whatsapp/hz;->i:Lcom/whatsapp/fab;

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 23
    return-void
.end method

.method static a()Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/whatsapp/hz;->j:Ljava/util/HashMap;

    return-object v0
.end method

.method static a(Lcom/whatsapp/hz;)Z
    .locals 1
    .parameter

    .prologue
    .line 8
    iget-boolean v0, p0, Lcom/whatsapp/hz;->g:Z

    return v0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 4
    .parameter

    .prologue
    const/4 v1, 0x0

    sget-boolean v2, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 4
    if-nez p0, :cond_0

    move v0, v1

    .line 40
    :goto_0
    return v0

    .line 17
    :cond_0
    sget-object v0, Lcom/whatsapp/hz;->j:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/hz;

    .line 18
    iget-object v0, v0, Lcom/whatsapp/hz;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 25
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_1

    :cond_3
    move v0, v1

    .line 39
    goto :goto_0
.end method

.method static b(Lcom/whatsapp/hz;)Ljava/lang/Long;
    .locals 1
    .parameter

    .prologue
    .line 31
    iget-object v0, p0, Lcom/whatsapp/hz;->h:Ljava/lang/Long;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 4
    .parameter

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/hz;->z:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/hz;->z:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/hz;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 12
    iput-boolean v2, p0, Lcom/whatsapp/hz;->g:Z

    .line 6
    iget-object v0, p0, Lcom/whatsapp/hz;->i:Lcom/whatsapp/fab;

    invoke-virtual {v0}, Lcom/whatsapp/fab;->cancel()Z

    .line 21
    sget-object v0, Lcom/whatsapp/hz;->j:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/hz;->h:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    iget-boolean v0, p0, Lcom/whatsapp/hz;->k:Z

    if-nez v0, :cond_0

    .line 13
    sget-object v0, Lcom/whatsapp/hz;->l:Landroid/os/Handler;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whatsapp/hz;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v3, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 14
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x1

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/hz;->z:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/hz;->z:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/hz;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 3
    iput-boolean v3, p0, Lcom/whatsapp/hz;->g:Z

    .line 15
    iget-object v0, p0, Lcom/whatsapp/hz;->i:Lcom/whatsapp/fab;

    invoke-virtual {v0}, Lcom/whatsapp/fab;->cancel()Z

    .line 19
    sget-object v0, Lcom/whatsapp/hz;->j:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/hz;->h:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    iget-object v1, p0, Lcom/whatsapp/hz;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v1

    .line 9
    if-eqz v1, :cond_2

    .line 2
    if-nez p1, :cond_3

    const/4 v0, -0x1

    .line 30
    :goto_0
    :try_start_0
    invoke-virtual {v1, v0, v0}, Lcom/whatsapp/zq;->a(II)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :goto_1
    iget-boolean v0, p0, Lcom/whatsapp/hz;->k:Z

    if-nez v0, :cond_2

    .line 22
    iget-object v0, p0, Lcom/whatsapp/hz;->b:[B

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/hz;->c:[B

    if-nez v0, :cond_0

    .line 24
    invoke-virtual {v1}, Lcom/whatsapp/zq;->i()V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/hz;->b:[B

    iget-object v2, p0, Lcom/whatsapp/hz;->c:[B

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/zq;->a([B[B)V

    .line 37
    :cond_1
    invoke-virtual {v1}, Lcom/whatsapp/zq;->j()V

    .line 41
    sget-object v0, Lcom/whatsapp/hz;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/whatsapp/hz;->a:Ljava/lang/String;

    invoke-virtual {v0, v3, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 43
    :cond_2
    return-void

    .line 2
    :cond_3
    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    goto :goto_1
.end method
