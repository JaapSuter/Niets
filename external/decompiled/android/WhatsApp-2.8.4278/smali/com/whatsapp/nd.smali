.class final Lcom/whatsapp/nd;
.super Landroid/os/Handler;
.source "nd.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2
    .parameter

    .prologue
    .line 3
    sget-object v0, Lcom/whatsapp/App;->w:Lcom/whatsapp/qp;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/whatsapp/qp;->a(Ljava/lang/String;Landroid/database/sqlite/SQLiteTransactionListener;)Lcom/whatsapp/zq;

    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 1
    invoke-virtual {v0}, Lcom/whatsapp/zq;->j()V

    .line 2
    :cond_0
    invoke-static {p1}, Lcom/whatsapp/App;->e(Ljava/lang/String;)V

    .line 11
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .parameter

    .prologue
    .line 13
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 8
    :cond_0
    :goto_0
    return-void

    .line 9
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/whatsapp/nd;->a(Ljava/lang/String;)V

    .line 12
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 6
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 14
    invoke-direct {p0, v0}, Lcom/whatsapp/nd;->a(Ljava/lang/String;)V

    .line 15
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/whatsapp/App;->b(Ljava/lang/String;I)V

    .line 7
    sget-object v1, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-virtual {v1}, Lcom/whatsapp/App;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lcom/whatsapp/App;->Mb:Lcom/whatsapp/App;

    invoke-static {v0}, Lcom/whatsapp/eu;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f090182

    :goto_1
    invoke-virtual {v2, v0}, Lcom/whatsapp/App;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/whatsapp/App;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    const v0, 0x7f090183

    goto :goto_1

    .line 13
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
