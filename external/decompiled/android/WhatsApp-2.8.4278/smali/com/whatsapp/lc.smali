.class Lcom/whatsapp/lc;
.super Landroid/os/Handler;
.source "lc.java"


# instance fields
.field final a:Lcom/whatsapp/qg;


# direct methods
.method constructor <init>(Lcom/whatsapp/qg;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/whatsapp/lc;->a:Lcom/whatsapp/qg;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1
    .parameter

    .prologue
    .line 2
    invoke-virtual {p0}, Lcom/whatsapp/lc;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/whatsapp/lc;->sendMessage(Landroid/os/Message;)Z

    .line 3
    return-void
.end method
