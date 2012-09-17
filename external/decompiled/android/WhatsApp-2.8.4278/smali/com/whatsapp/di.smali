.class final Lcom/whatsapp/di;
.super Ljava/lang/Object;
.source "di.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/zq;

.field final b:I


# direct methods
.method constructor <init>(Lcom/whatsapp/zq;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 8
    iput-object p1, p0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iput p2, p0, Lcom/whatsapp/di;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 7
    iget-object v0, p0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    iget v2, p0, Lcom/whatsapp/di;->b:I

    if-eq v0, v2, :cond_0

    move v0, v1

    .line 4
    :goto_0
    iget-object v2, p0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget v2, v2, Lcom/whatsapp/zq;->p:I

    iget v3, p0, Lcom/whatsapp/di;->b:I

    if-eq v2, v3, :cond_1

    .line 1
    :goto_1
    iget-object v2, p0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    invoke-virtual {v2, v0, v1}, Lcom/whatsapp/zq;->a(II)V

    .line 3
    sget-object v0, Lcom/whatsapp/App;->T:Lcom/whatsapp/c5;

    iget-object v1, p0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/c5;->b(Ljava/lang/Object;)Z

    .line 2
    sget-object v0, Lcom/whatsapp/App;->U:Lcom/whatsapp/c5;

    iget-object v1, p0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget-object v1, v1, Lcom/whatsapp/zq;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/whatsapp/c5;->b(Ljava/lang/Object;)Z

    .line 6
    sget-object v0, Lcom/whatsapp/App;->Jb:Landroid/os/Handler;

    new-instance v1, Lcom/whatsapp/ei;

    invoke-direct {v1, p0}, Lcom/whatsapp/ei;-><init>(Lcom/whatsapp/di;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 5
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget v0, v0, Lcom/whatsapp/zq;->o:I

    goto :goto_0

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/di;->a:Lcom/whatsapp/zq;

    iget v1, v1, Lcom/whatsapp/zq;->p:I

    goto :goto_1
.end method
