.class Lcom/whatsapp/v8;
.super Ljava/lang/Thread;
.source "v8.java"


# instance fields
.field final a:Lcom/whatsapp/bo;


# direct methods
.method constructor <init>(Lcom/whatsapp/bo;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/v8;->a:Lcom/whatsapp/bo;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 2
    iget-object v0, p0, Lcom/whatsapp/v8;->a:Lcom/whatsapp/bo;

    iget-object v0, v0, Lcom/whatsapp/bo;->a:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/App;->a(Landroid/app/Activity;)V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/v8;->a:Lcom/whatsapp/bo;

    iget-object v0, v0, Lcom/whatsapp/bo;->a:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->e(Lcom/whatsapp/Conversations;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/co;

    invoke-direct {v1, p0}, Lcom/whatsapp/co;-><init>(Lcom/whatsapp/v8;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 3
    return-void
.end method
