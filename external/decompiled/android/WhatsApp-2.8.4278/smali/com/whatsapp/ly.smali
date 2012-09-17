.class Lcom/whatsapp/ly;
.super Ljava/lang/Object;
.source "ly.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final a:Lcom/whatsapp/PopupNotification;


# direct methods
.method constructor <init>(Lcom/whatsapp/PopupNotification;)V
    .locals 0
    .parameter

    .prologue
    .line 2
    iput-object p1, p0, Lcom/whatsapp/ly;->a:Lcom/whatsapp/PopupNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/ly;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->k(Lcom/whatsapp/PopupNotification;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/ly;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->k(Lcom/whatsapp/PopupNotification;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/whatsapp/ly;->a:Lcom/whatsapp/PopupNotification;

    invoke-static {v0}, Lcom/whatsapp/PopupNotification;->k(Lcom/whatsapp/PopupNotification;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 4
    :cond_0
    return-void
.end method
