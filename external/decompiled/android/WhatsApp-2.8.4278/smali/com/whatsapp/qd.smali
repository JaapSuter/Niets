.class Lcom/whatsapp/qd;
.super Landroid/os/Handler;
.source "qd.java"


# instance fields
.field final a:Lcom/whatsapp/RegisterName;


# direct methods
.method constructor <init>(Lcom/whatsapp/RegisterName;)V
    .locals 0
    .parameter

    .prologue
    .line 16
    iput-object p1, p0, Lcom/whatsapp/qd;->a:Lcom/whatsapp/RegisterName;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5
    .parameter

    .prologue
    const/4 v4, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 1
    invoke-static {}, Lcom/whatsapp/RegisterName;->j()Lcom/whatsapp/s9;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/whatsapp/RegisterName;->j()Lcom/whatsapp/s9;

    move-result-object v1

    iget-boolean v1, v1, Lcom/whatsapp/s9;->b:Z

    if-eqz v1, :cond_2

    .line 5
    invoke-static {}, Lcom/whatsapp/RegisterName;->j()Lcom/whatsapp/s9;

    move-result-object v1

    iget-boolean v1, v1, Lcom/whatsapp/s9;->c:Z

    if-eqz v1, :cond_0

    .line 10
    iget-object v1, p0, Lcom/whatsapp/qd;->a:Lcom/whatsapp/RegisterName;

    invoke-virtual {v1}, Lcom/whatsapp/RegisterName;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    .line 9
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/whatsapp/qd;->a:Lcom/whatsapp/RegisterName;

    const-class v3, Lcom/whatsapp/Main;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    iget-object v2, p0, Lcom/whatsapp/qd;->a:Lcom/whatsapp/RegisterName;

    invoke-virtual {v2, v1}, Lcom/whatsapp/RegisterName;->startActivity(Landroid/content/Intent;)V

    .line 12
    iget-object v1, p0, Lcom/whatsapp/qd;->a:Lcom/whatsapp/RegisterName;

    invoke-virtual {v1}, Lcom/whatsapp/RegisterName;->finish()V

    .line 8
    if-eqz v0, :cond_1

    .line 17
    :cond_0
    invoke-static {}, Lcom/whatsapp/RegisterName;->j()Lcom/whatsapp/s9;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/s9;->d:I

    packed-switch v1, :pswitch_data_0

    .line 13
    :cond_1
    :goto_0
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/qd;->a:Lcom/whatsapp/RegisterName;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterName;->removeDialog(I)V

    .line 14
    invoke-static {v4}, Lcom/whatsapp/RegisterName;->a(Lcom/whatsapp/f;)Lcom/whatsapp/f;

    .line 11
    invoke-static {v4}, Lcom/whatsapp/RegisterName;->a(Lcom/whatsapp/s9;)Lcom/whatsapp/s9;

    .line 4
    :cond_2
    return-void

    .line 15
    :pswitch_1
    iget-object v1, p0, Lcom/whatsapp/qd;->a:Lcom/whatsapp/RegisterName;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/whatsapp/RegisterName;->showDialog(I)V

    .line 2
    if-eqz v0, :cond_1

    .line 3
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/qd;->a:Lcom/whatsapp/RegisterName;

    const/16 v1, 0x6d

    invoke-virtual {v0, v1}, Lcom/whatsapp/RegisterName;->showDialog(I)V

    goto :goto_0

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
