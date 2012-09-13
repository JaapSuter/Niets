.class final Lcom/whatsapp/zh;
.super Ljava/lang/Object;
.source "zh.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/zq;


# direct methods
.method constructor <init>(Lcom/whatsapp/zq;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v4, -0x1

    .line 10
    iget-object v0, p0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    if-ne v0, v4, :cond_1

    iget-object v0, p0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->p:I

    if-ne v0, v4, :cond_1

    move v0, v1

    .line 4
    :goto_0
    iget-object v3, p0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    iget v3, v3, Lcom/whatsapp/zq;->o:I

    if-nez v3, :cond_2

    iget-object v3, p0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    iget v3, v3, Lcom/whatsapp/zq;->p:I

    if-nez v3, :cond_2

    .line 3
    :goto_1
    iget-object v2, p0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    invoke-virtual {v2}, Lcom/whatsapp/zq;->i()V

    .line 1
    iget-object v2, p0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    invoke-virtual {v2, v4, v4}, Lcom/whatsapp/zq;->a(II)V

    .line 8
    sget-object v2, Lcom/whatsapp/App;->T:Lcom/whatsapp/c5;

    iget-object v3, p0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    iget-object v3, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/whatsapp/c5;->b(Ljava/lang/Object;)Z

    .line 9
    sget-object v2, Lcom/whatsapp/App;->U:Lcom/whatsapp/c5;

    iget-object v3, p0, Lcom/whatsapp/zh;->a:Lcom/whatsapp/zq;

    iget-object v3, v3, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/whatsapp/c5;->b(Ljava/lang/Object;)Z

    .line 5
    if-nez v0, :cond_0

    .line 2
    sget-object v0, Lcom/whatsapp/App;->Jb:Landroid/os/Handler;

    new-instance v2, Lcom/whatsapp/ai;

    invoke-direct {v2, p0, v1}, Lcom/whatsapp/ai;-><init>(Lcom/whatsapp/zh;Z)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 7
    :cond_0
    return-void

    :cond_1
    move v0, v2

    .line 10
    goto :goto_0

    :cond_2
    move v1, v2

    .line 4
    goto :goto_1
.end method
