.class Lcom/whatsapp/ei;
.super Ljava/lang/Object;
.source "ei.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/di;


# direct methods
.method constructor <init>(Lcom/whatsapp/di;)V
    .locals 0
    .parameter

    .prologue
    .line 7
    iput-object p1, p0, Lcom/whatsapp/ei;->a:Lcom/whatsapp/di;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1
    sget-object v0, Lcom/whatsapp/App;->wb:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/whatsapp/ei;->a:Lcom/whatsapp/di;

    iget-object v1, v1, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whatsapp/ei;->a:Lcom/whatsapp/di;

    iget-object v0, v0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->p:I

    iget-object v1, p0, Lcom/whatsapp/ei;->a:Lcom/whatsapp/di;

    iget v1, v1, Lcom/whatsapp/di;->b:I

    if-eq v0, v1, :cond_2

    const/4 v0, 0x1

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/whatsapp/ei;->a:Lcom/whatsapp/di;

    iget-object v1, v1, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    invoke-virtual {v1}, Lcom/whatsapp/zq;->j()V

    .line 6
    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/whatsapp/ei;->a:Lcom/whatsapp/di;

    iget-object v0, v0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/whatsapp/ei;->a:Lcom/whatsapp/di;

    iget-object v1, v1, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget v1, v1, Lcom/whatsapp/zq;->p:I

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lcom/whatsapp/App;->a(Ljava/lang/String;II)V

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/ei;->a:Lcom/whatsapp/di;

    iget-object v0, v0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget-object v0, v0, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/whatsapp/App;->e(Ljava/lang/String;)V

    .line 4
    :cond_1
    return-void

    .line 1
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method
