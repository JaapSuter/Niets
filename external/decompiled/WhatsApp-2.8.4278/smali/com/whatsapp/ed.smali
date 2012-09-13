.class Lcom/whatsapp/ed;
.super Landroid/os/Handler;
.source "ed.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1
    .parameter

    .prologue
    .line 4
    sget-boolean v0, Lcom/whatsapp/App;->u:Z

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Lcom/whatsapp/App;->mb()V

    .line 1
    :cond_0
    return-void
.end method
