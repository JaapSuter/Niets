.class public Lcom/whatsapp/yy;
.super Ljava/lang/Object;
.source "yy.java"


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/whatsapp/az;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)J
    .locals 2
    .parameter

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/az;

    .line 9
    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    .line 24
    :goto_0
    return-wide v0

    .line 9
    :cond_0
    iget-wide v0, v0, Lcom/whatsapp/az;->b:J

    goto :goto_0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 11
    iget-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 35
    return-void
.end method

.method public a(Ljava/lang/String;J)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 23
    iget-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/az;

    .line 20
    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/whatsapp/az;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/az;-><init>(Lcom/whatsapp/yy;Lcom/whatsapp/zy;)V

    .line 33
    iget-object v1, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    :cond_0
    iput-wide p2, v0, Lcom/whatsapp/az;->b:J

    .line 37
    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/whatsapp/az;->c:J

    .line 34
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 18
    iget-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/az;

    .line 25
    if-nez v0, :cond_1

    .line 22
    new-instance v0, Lcom/whatsapp/az;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/az;-><init>(Lcom/whatsapp/yy;Lcom/whatsapp/zy;)V

    .line 14
    iget-object v1, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v0

    .line 43
    :goto_0
    if-eqz p2, :cond_0

    const-wide/16 v0, 0x1

    :goto_1
    iput-wide v0, v2, Lcom/whatsapp/az;->b:J

    .line 1
    return-void

    .line 43
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    goto :goto_1

    :cond_1
    move-object v2, v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Z)V
    .locals 3
    .parameter
    .parameter

    .prologue
    .line 30
    iget-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/az;

    .line 36
    if-nez v0, :cond_0

    .line 13
    new-instance v0, Lcom/whatsapp/az;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/az;-><init>(Lcom/whatsapp/yy;Lcom/whatsapp/zy;)V

    .line 31
    iget-object v1, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :cond_0
    if-eqz p2, :cond_1

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/az;->c:J

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v1, :cond_2

    .line 4
    :cond_1
    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/whatsapp/az;->c:J

    .line 26
    :cond_2
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 6
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 28
    .line 42
    iget-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/az;

    .line 17
    if-nez v0, :cond_0

    move v0, v1

    .line 32
    :goto_0
    return v0

    .line 17
    :cond_0
    iget-wide v2, v0, Lcom/whatsapp/az;->b:J

    const-wide/16 v4, 0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public c(Ljava/lang/String;Z)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 5
    iget-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/az;

    .line 7
    if-nez v0, :cond_0

    .line 29
    new-instance v0, Lcom/whatsapp/az;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whatsapp/az;-><init>(Lcom/whatsapp/yy;Lcom/whatsapp/zy;)V

    .line 8
    :cond_0
    iput-boolean p2, v0, Lcom/whatsapp/az;->a:Z

    .line 10
    return-void
.end method

.method public c(Ljava/lang/String;)Z
    .locals 6
    .parameter

    .prologue
    const/4 v1, 0x0

    .line 12
    iget-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/az;

    .line 38
    if-nez v0, :cond_0

    move v0, v1

    .line 15
    :goto_0
    return v0

    .line 38
    :cond_0
    iget-wide v2, v0, Lcom/whatsapp/az;->c:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    iget-wide v2, v0, Lcom/whatsapp/az;->c:J

    const-wide/32 v4, 0xea60

    add-long/2addr v2, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1
    .parameter

    .prologue
    .line 19
    iget-object v0, p0, Lcom/whatsapp/yy;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/az;

    .line 39
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 41
    :goto_0
    return v0

    .line 39
    :cond_0
    iget-boolean v0, v0, Lcom/whatsapp/az;->a:Z

    goto :goto_0
.end method
