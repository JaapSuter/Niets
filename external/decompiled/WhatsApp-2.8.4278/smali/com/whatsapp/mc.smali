.class final Lcom/whatsapp/mc;
.super Landroid/os/Handler;
.source "mc.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .parameter

    .prologue
    .line 4
    new-instance v0, Lcom/whatsapp/k8;

    invoke-direct {v0, p0}, Lcom/whatsapp/k8;-><init>(Lcom/whatsapp/mc;)V

    .line 2
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 3
    return-void
.end method
