.class Lcom/whatsapp/cd;
.super Landroid/os/Handler;
.source "cd.java"


# instance fields
.field final a:Lcom/whatsapp/i9;


# direct methods
.method constructor <init>(Lcom/whatsapp/i9;)V
    .locals 0
    .parameter

    .prologue
    .line 22
    iput-object p1, p0, Lcom/whatsapp/cd;->a:Lcom/whatsapp/i9;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 11
    .parameter

    .prologue
    const/4 v10, 0x6

    const/4 v1, 0x0

    const/4 v9, 0x5

    const/4 v8, 0x2

    const/4 v2, 0x1

    sget v4, Lcom/whatsapp/yq;->e:I

    .line 54
    const/4 v0, 0x0

    .line 10
    iget v3, p1, Landroid/os/Message;->what:I

    if-eq v3, v9, :cond_0

    iget v3, p1, Landroid/os/Message;->what:I

    if-eq v3, v10, :cond_0

    iget v3, p1, Landroid/os/Message;->what:I

    const/4 v5, 0x7

    if-eq v3, v5, :cond_0

    iget v3, p1, Landroid/os/Message;->what:I

    const/16 v5, 0x8

    if-eq v3, v5, :cond_0

    .line 32
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/sz;

    .line 28
    :cond_0
    iget v3, p1, Landroid/os/Message;->what:I

    packed-switch v3, :pswitch_data_0

    .line 40
    :cond_1
    :goto_0
    return-void

    .line 17
    :pswitch_0
    :try_start_0
    iget v3, p1, Landroid/os/Message;->arg1:I

    if-ne v3, v9, :cond_8

    move v3, v2

    :goto_1
    invoke-static {v0, v3}, Lcom/whatsapp/fq;->b(Lcom/whatsapp/sz;Z)Lcom/whatsapp/gq;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 14
    if-eqz v3, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, Lcom/whatsapp/g5;->b(Z)V

    .line 56
    iget-boolean v1, v3, Lcom/whatsapp/gq;->a:Z

    if-eqz v1, :cond_4

    .line 44
    iget-boolean v1, v3, Lcom/whatsapp/gq;->b:Z

    if-eqz v1, :cond_3

    .line 61
    invoke-static {}, Lcom/whatsapp/fq;->F()Landroid/os/Handler;

    move-result-object v1

    const/4 v5, 0x4

    iget v6, p1, Landroid/os/Message;->arg1:I

    iget v7, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v5, v6, v7, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 35
    invoke-static {}, Lcom/whatsapp/fq;->F()Landroid/os/Handler;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    if-eqz v4, :cond_5

    .line 3
    :cond_3
    invoke-static {}, Lcom/whatsapp/fq;->F()Landroid/os/Handler;

    move-result-object v1

    iget v5, p1, Landroid/os/Message;->arg1:I

    iget v6, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v9, v5, v6, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 55
    invoke-static {}, Lcom/whatsapp/fq;->F()Landroid/os/Handler;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    if-eqz v4, :cond_5

    .line 29
    :cond_4
    iget-boolean v1, v3, Lcom/whatsapp/gq;->c:Z

    if-eqz v1, :cond_5

    .line 34
    invoke-static {}, Lcom/whatsapp/fq;->F()Landroid/os/Handler;

    move-result-object v1

    const/4 v3, 0x3

    invoke-static {v1, v3, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 16
    invoke-static {}, Lcom/whatsapp/fq;->F()Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 9
    :cond_5
    if-eqz v4, :cond_1

    .line 19
    :pswitch_1
    invoke-static {v0}, Lcom/whatsapp/fq;->i(Lcom/whatsapp/sz;)Z

    .line 48
    if-eqz v4, :cond_1

    .line 53
    :pswitch_2
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/whatsapp/fq;->e(Lcom/whatsapp/sz;I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 30
    invoke-static {}, Lcom/whatsapp/fq;->G()Landroid/os/Handler;

    move-result-object v1

    iget v3, p1, Landroid/os/Message;->arg1:I

    iget v5, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v8, v3, v5, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 12
    invoke-static {}, Lcom/whatsapp/fq;->G()Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    if-eqz v4, :cond_1

    .line 42
    :pswitch_3
    iget-object v1, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v1, v1, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    .line 58
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v3

    invoke-static {v3, v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    .line 21
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 36
    iget-object v3, p0, Lcom/whatsapp/cd;->a:Lcom/whatsapp/i9;

    iget-object v3, v3, Lcom/whatsapp/i9;->b:Lcom/whatsapp/fq;

    invoke-static {v3, v0}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/fq;Lcom/whatsapp/sz;)V

    .line 50
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v3

    invoke-static {v3, v8, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 25
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 5
    if-eqz v4, :cond_1

    .line 59
    :pswitch_4
    iget-object v0, v0, Lcom/whatsapp/sz;->b:Lcom/whatsapp/uz;

    iget-object v0, v0, Lcom/whatsapp/uz;->a:Ljava/lang/String;

    .line 20
    iget-object v1, p0, Lcom/whatsapp/cd;->a:Lcom/whatsapp/i9;

    iget-object v1, v1, Lcom/whatsapp/i9;->b:Lcom/whatsapp/fq;

    invoke-static {v1}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/fq;)V

    .line 11
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-static {v1, v8, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 41
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 43
    if-eqz v4, :cond_1

    .line 37
    :pswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 51
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 23
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 13
    iget-object v1, p0, Lcom/whatsapp/cd;->a:Lcom/whatsapp/i9;

    iget-object v1, v1, Lcom/whatsapp/i9;->b:Lcom/whatsapp/fq;

    invoke-static {v1, v0}, Lcom/whatsapp/fq;->a(Lcom/whatsapp/fq;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 31
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-static {v1, v8, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 33
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 18
    :cond_6
    if-eqz v4, :cond_1

    .line 26
    :pswitch_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 2
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-static {v1, v2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 1
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 52
    iget-object v1, p0, Lcom/whatsapp/cd;->a:Lcom/whatsapp/i9;

    iget-object v1, v1, Lcom/whatsapp/i9;->b:Lcom/whatsapp/fq;

    invoke-static {v1, v0}, Lcom/whatsapp/fq;->b(Lcom/whatsapp/fq;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 6
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-static {v1, v8, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 60
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 46
    :cond_7
    if-eqz v4, :cond_1

    .line 49
    :pswitch_7
    iget-object v0, p0, Lcom/whatsapp/cd;->a:Lcom/whatsapp/i9;

    iget-object v0, v0, Lcom/whatsapp/i9;->b:Lcom/whatsapp/fq;

    invoke-static {v0}, Lcom/whatsapp/fq;->b(Lcom/whatsapp/fq;)V

    .line 15
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0, v10}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 38
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 7
    if-eqz v4, :cond_1

    .line 57
    :pswitch_8
    iget-object v0, p0, Lcom/whatsapp/cd;->a:Lcom/whatsapp/i9;

    iget-object v0, v0, Lcom/whatsapp/i9;->b:Lcom/whatsapp/fq;

    invoke-static {v0}, Lcom/whatsapp/fq;->c(Lcom/whatsapp/fq;)V

    .line 8
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    .line 47
    invoke-static {}, Lcom/whatsapp/fq;->H()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    :cond_8
    move v3, v1

    .line 17
    goto/16 :goto_1

    .line 4
    :catch_0
    move-exception v0

    .line 24
    invoke-static {}, Lcom/whatsapp/fq;->y()V

    .line 27
    throw v0

    .line 28
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_4
    .end packed-switch
.end method
