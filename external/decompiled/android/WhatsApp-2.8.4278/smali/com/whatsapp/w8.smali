.class Lcom/whatsapp/w8;
.super Ljava/lang/Thread;
.source "w8.java"


# instance fields
.field final a:Lcom/whatsapp/eo;


# direct methods
.method constructor <init>(Lcom/whatsapp/eo;)V
    .locals 0
    .parameter

    .prologue
    .line 3
    iput-object p1, p0, Lcom/whatsapp/w8;->a:Lcom/whatsapp/eo;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1
    iget-object v0, p0, Lcom/whatsapp/w8;->a:Lcom/whatsapp/eo;

    iget-object v0, v0, Lcom/whatsapp/eo;->a:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/App;->b(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/whatsapp/w8;->a:Lcom/whatsapp/eo;

    iget-object v0, v0, Lcom/whatsapp/eo;->a:Lcom/whatsapp/Conversations;

    invoke-static {v0}, Lcom/whatsapp/Conversations;->e(Lcom/whatsapp/Conversations;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/whatsapp/fo;

    invoke-direct {v1, p0}, Lcom/whatsapp/fo;-><init>(Lcom/whatsapp/w8;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 4
    return-void
.end method
