.class Lcom/whatsapp/k;
.super Landroid/database/Observable;
.source "k.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/database/Observable",
        "<",
        "Lcom/whatsapp/lq;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Landroid/database/Observable;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/h9;)V
    .locals 0
    .parameter

    .prologue
    .line 11
    invoke-direct {p0}, Lcom/whatsapp/k;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/whatsapp/sz;)V
    .locals 3
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 9
    iget-object v0, p0, Lcom/whatsapp/k;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/lq;

    .line 17
    invoke-virtual {v0, p1}, Lcom/whatsapp/lq;->a(Lcom/whatsapp/sz;)V

    if-eqz v1, :cond_0

    .line 16
    :cond_1
    return-void
.end method

.method public a(Lcom/whatsapp/sz;I)V
    .locals 3
    .parameter
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 14
    iget-object v0, p0, Lcom/whatsapp/k;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/lq;

    .line 2
    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/lq;->a(Lcom/whatsapp/sz;I)V

    if-eqz v1, :cond_0

    .line 1
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 7
    iget-object v0, p0, Lcom/whatsapp/k;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/lq;

    .line 3
    invoke-virtual {v0, p1}, Lcom/whatsapp/lq;->a(Ljava/lang/String;)V

    if-eqz v1, :cond_0

    .line 15
    :cond_1
    return-void
.end method

.method public b(Lcom/whatsapp/sz;)V
    .locals 3
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 6
    iget-object v0, p0, Lcom/whatsapp/k;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/lq;

    .line 13
    invoke-virtual {v0, p1}, Lcom/whatsapp/lq;->b(Lcom/whatsapp/sz;)V

    if-eqz v1, :cond_0

    .line 12
    :cond_1
    return-void
.end method

.method public b(Lcom/whatsapp/sz;I)V
    .locals 3
    .parameter
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 5
    iget-object v0, p0, Lcom/whatsapp/k;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whatsapp/lq;

    .line 8
    invoke-virtual {v0, p1, p2}, Lcom/whatsapp/lq;->b(Lcom/whatsapp/sz;I)V

    if-eqz v1, :cond_0

    .line 4
    :cond_1
    return-void
.end method
