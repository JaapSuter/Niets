.class final Lcom/whatsapp/bd;
.super Landroid/os/Handler;
.source "bd.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8
    .parameter

    .prologue
    const-wide/16 v6, 0x1

    const/4 v5, 0x0

    sget v1, Lcom/whatsapp/yq;->e:I

    .line 14
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 27
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 5
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 17
    :pswitch_1
    invoke-static {}, Lcom/whatsapp/fq;->C()Ljava/util/Hashtable;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-static {}, Lcom/whatsapp/fq;->B()Lcom/whatsapp/j;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/whatsapp/j;->a(Ljava/lang/String;)V

    .line 12
    if-eqz v1, :cond_0

    .line 3
    :pswitch_2
    invoke-static {}, Lcom/whatsapp/fq;->A()Lcom/whatsapp/k;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/whatsapp/k;->a(Ljava/lang/String;)V

    .line 23
    invoke-static {}, Lcom/whatsapp/fq;->B()Lcom/whatsapp/j;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/whatsapp/j;->b(Ljava/lang/String;)V

    .line 24
    if-eqz v1, :cond_0

    .line 1
    :pswitch_3
    invoke-static {}, Lcom/whatsapp/fq;->D()Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v2

    .line 7
    :cond_1
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 18
    invoke-static {}, Lcom/whatsapp/fq;->B()Lcom/whatsapp/j;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/whatsapp/j;->a(Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lcom/whatsapp/fq;->D()Ljava/util/Hashtable;

    move-result-object v3

    new-instance v4, Lcom/whatsapp/kq;

    invoke-direct {v4, v5, v6, v7}, Lcom/whatsapp/kq;-><init>(Lcom/whatsapp/sz;J)V

    invoke-virtual {v3, v0, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    invoke-static {}, Lcom/whatsapp/fq;->E()Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    invoke-static {}, Lcom/whatsapp/fq;->C()Ljava/util/Hashtable;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-static {}, Lcom/whatsapp/fq;->B()Lcom/whatsapp/j;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/whatsapp/j;->b(Ljava/lang/String;)V

    if-eqz v1, :cond_1

    .line 21
    :cond_2
    if-eqz v1, :cond_0

    .line 15
    :pswitch_4
    new-instance v0, Ljava/util/HashSet;

    invoke-static {}, Lcom/whatsapp/fq;->D()Ljava/util/Hashtable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Hashtable;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 9
    invoke-static {}, Lcom/whatsapp/fq;->E()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 20
    invoke-static {}, Lcom/whatsapp/fq;->C()Ljava/util/Hashtable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Hashtable;->clear()V

    .line 13
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 26
    const-string v3, "-"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 28
    invoke-static {}, Lcom/whatsapp/fq;->D()Ljava/util/Hashtable;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v1, :cond_5

    .line 22
    :cond_4
    invoke-static {}, Lcom/whatsapp/fq;->D()Ljava/util/Hashtable;

    move-result-object v3

    new-instance v4, Lcom/whatsapp/kq;

    invoke-direct {v4, v5, v6, v7}, Lcom/whatsapp/kq;-><init>(Lcom/whatsapp/sz;J)V

    invoke-virtual {v3, v0, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    :cond_5
    invoke-static {}, Lcom/whatsapp/fq;->B()Lcom/whatsapp/j;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/whatsapp/j;->a(Ljava/lang/String;)V

    .line 10
    invoke-static {}, Lcom/whatsapp/fq;->B()Lcom/whatsapp/j;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/whatsapp/j;->b(Ljava/lang/String;)V

    if-eqz v1, :cond_3

    goto/16 :goto_0

    .line 27
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
