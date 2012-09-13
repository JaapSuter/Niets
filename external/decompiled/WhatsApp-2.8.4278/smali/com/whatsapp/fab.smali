.class Lcom/whatsapp/fab;
.super Ljava/util/TimerTask;
.source "fab.java"


# instance fields
.field final a:Lcom/whatsapp/hz;


# direct methods
.method public constructor <init>(Lcom/whatsapp/hz;)V
    .locals 0
    .parameter

    .prologue
    .line 5
    iput-object p1, p0, Lcom/whatsapp/fab;->a:Lcom/whatsapp/hz;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 8
    iget-object v0, p0, Lcom/whatsapp/fab;->a:Lcom/whatsapp/hz;

    invoke-static {v0}, Lcom/whatsapp/hz;->a(Lcom/whatsapp/hz;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    :goto_0
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/fab;->a:Lcom/whatsapp/hz;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/whatsapp/hz;->f:Z

    .line 7
    iget-object v0, p0, Lcom/whatsapp/fab;->a:Lcom/whatsapp/hz;

    iget-boolean v0, v0, Lcom/whatsapp/hz;->k:Z

    if-nez v0, :cond_1

    .line 2
    sget-object v0, Lcom/whatsapp/hz;->l:Landroid/os/Handler;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whatsapp/fab;->a:Lcom/whatsapp/hz;

    iget-object v2, v2, Lcom/whatsapp/hz;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 3
    :cond_1
    invoke-static {}, Lcom/whatsapp/hz;->a()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/fab;->a:Lcom/whatsapp/hz;

    invoke-static {v1}, Lcom/whatsapp/hz;->b(Lcom/whatsapp/hz;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method
