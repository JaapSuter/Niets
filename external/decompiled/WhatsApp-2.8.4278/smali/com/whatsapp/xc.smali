.class Lcom/whatsapp/xc;
.super Landroid/os/Handler;
.source "xc.java"


# instance fields
.field final a:Lcom/whatsapp/Conversation;


# direct methods
.method constructor <init>(Lcom/whatsapp/Conversation;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/xc;->a:Lcom/whatsapp/Conversation;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 3
    sget-boolean v0, Lcom/whatsapp/App;->u:Z

    if-nez v0, :cond_1

    .line 8
    invoke-static {v1, v1}, Lcom/whatsapp/App;->a(ZZ)V

    .line 1
    iget-object v0, p0, Lcom/whatsapp/xc;->a:Lcom/whatsapp/Conversation;

    invoke-static {v0}, Lcom/whatsapp/Conversation;->E(Lcom/whatsapp/Conversation;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Lcom/whatsapp/App;->gb:Landroid/app/NotificationManager;

    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/xc;->a:Lcom/whatsapp/Conversation;

    invoke-static {v0, v1}, Lcom/whatsapp/Conversation;->j(Lcom/whatsapp/Conversation;Z)Z

    .line 7
    iget-object v0, p0, Lcom/whatsapp/xc;->a:Lcom/whatsapp/Conversation;

    invoke-static {v0, v2}, Lcom/whatsapp/Conversation;->k(Lcom/whatsapp/Conversation;Z)Z

    .line 5
    :cond_1
    return-void
.end method
