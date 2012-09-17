.class final Lcom/whatsapp/sc;
.super Landroid/os/Handler;
.source "sc.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 5
    .parameter
    .parameter

    .prologue
    const/4 v0, 0x1

    const/4 v4, 0x2

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, p1}, Lcom/whatsapp/sc;->hasMessages(ILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 8
    invoke-virtual {p0, v1, p1}, Lcom/whatsapp/sc;->removeMessages(ILjava/lang/Object;)V

    .line 14
    invoke-virtual {p0, v4, p1}, Lcom/whatsapp/sc;->hasMessages(ILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 13
    invoke-static {}, Lcom/whatsapp/App;->yb()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 16
    invoke-static {}, Lcom/whatsapp/App;->zb()Landroid/os/Messenger;

    move-result-object v2

    invoke-static {p1, p2}, Lcom/whatsapp/messaging/s;->c(Ljava/lang/String;Z)Landroid/os/Message;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/whatsapp/messaging/h;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 3
    :cond_0
    invoke-virtual {p0, v4, p1}, Lcom/whatsapp/sc;->removeMessages(ILjava/lang/Object;)V

    .line 11
    if-eqz p2, :cond_2

    :goto_0
    invoke-virtual {p0, v4, v0, v1, p1}, Lcom/whatsapp/sc;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    const-wide/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1, v2}, Lcom/whatsapp/sc;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 9
    :cond_1
    return-void

    :cond_2
    move v0, v1

    .line 11
    goto :goto_0
.end method

.method private b(Ljava/lang/String;Z)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 20
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/whatsapp/sc;->hasMessages(ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-static {}, Lcom/whatsapp/App;->yb()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 19
    invoke-static {}, Lcom/whatsapp/App;->zb()Landroid/os/Messenger;

    move-result-object v0

    invoke-static {p1}, Lcom/whatsapp/messaging/s;->h(Ljava/lang/String;)Landroid/os/Message;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/whatsapp/messaging/h;->a(Landroid/os/Messenger;Landroid/os/Message;)V

    .line 4
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lcom/whatsapp/sc;->removeMessages(ILjava/lang/Object;)V

    .line 6
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/whatsapp/sc;->removeMessages(ILjava/lang/Object;)V

    .line 7
    :cond_1
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .parameter

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 18
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 1
    :cond_0
    :goto_0
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v1, p1, Landroid/os/Message;->arg1:I

    if-ne v1, v2, :cond_1

    move v1, v2

    :goto_1
    invoke-direct {p0, v0, v1}, Lcom/whatsapp/sc;->a(Ljava/lang/String;Z)V

    .line 12
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 15
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v1, p1, Landroid/os/Message;->arg1:I

    if-ne v1, v2, :cond_2

    :goto_2
    invoke-direct {p0, v0, v2}, Lcom/whatsapp/sc;->b(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    move v1, v3

    .line 10
    goto :goto_1

    :cond_2
    move v2, v3

    .line 15
    goto :goto_2

    .line 18
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
