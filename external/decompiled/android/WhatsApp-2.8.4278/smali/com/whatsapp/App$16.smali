.class Lcom/whatsapp/App$16;
.super Landroid/content/BroadcastReceiver;
.source "App.java"


# instance fields
.field final a:Lcom/whatsapp/App;


# direct methods
.method constructor <init>(Lcom/whatsapp/App;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/App$16;->a:Lcom/whatsapp/App;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 5
    invoke-static {}, Lcom/whatsapp/g5;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/whatsapp/th;

    invoke-direct {v1, p0}, Lcom/whatsapp/th;-><init>(Lcom/whatsapp/App$16;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 4
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 3
    :cond_0
    invoke-static {}, Lcom/whatsapp/g5;->d()V

    .line 7
    return-void
.end method
