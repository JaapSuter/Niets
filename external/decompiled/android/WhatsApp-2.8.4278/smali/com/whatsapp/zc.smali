.class final Lcom/whatsapp/zc;
.super Landroid/os/Handler;
.source "zc.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .parameter

    .prologue
    sget v1, Lcom/whatsapp/yq;->e:I

    .line 7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/sz;

    .line 2
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 5
    :cond_0
    :goto_0
    return-void

    .line 9
    :pswitch_0
    invoke-static {}, Lcom/whatsapp/fq;->A()Lcom/whatsapp/k;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/whatsapp/k;->b(Lcom/whatsapp/sz;)V

    .line 10
    if-eqz v1, :cond_0

    .line 8
    :pswitch_1
    invoke-static {}, Lcom/whatsapp/fq;->B()Lcom/whatsapp/j;

    move-result-object v2

    iget-object v3, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v3, v3, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/whatsapp/j;->c(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/whatsapp/fq;->A()Lcom/whatsapp/k;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v2, v0, v3}, Lcom/whatsapp/k;->a(Lcom/whatsapp/sz;I)V

    .line 6
    if-eqz v1, :cond_0

    .line 1
    :pswitch_2
    invoke-static {}, Lcom/whatsapp/fq;->A()Lcom/whatsapp/k;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v0, v2}, Lcom/whatsapp/k;->a(Lcom/whatsapp/sz;I)V

    .line 3
    invoke-static {}, Lcom/whatsapp/fq;->B()Lcom/whatsapp/j;

    move-result-object v1

    iget-object v2, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v2, v2, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/whatsapp/j;->a(Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lcom/whatsapp/fq;->B()Lcom/whatsapp/j;

    move-result-object v1

    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/whatsapp/j;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 2
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
