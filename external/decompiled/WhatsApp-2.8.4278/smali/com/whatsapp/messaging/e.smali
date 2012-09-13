.class public Lcom/whatsapp/messaging/e;
.super Landroid/os/Handler;
.source "e.java"


# instance fields
.field private final a:Lcom/whatsapp/messaging/m;

.field private b:Z


# direct methods
.method public constructor <init>(Lcom/whatsapp/messaging/m;)V
    .locals 1
    .parameter

    .prologue
    .line 9
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 12
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whatsapp/messaging/e;->b:Z

    .line 27
    iput-object p1, p0, Lcom/whatsapp/messaging/e;->a:Lcom/whatsapp/messaging/m;

    .line 22
    return-void
.end method

.method public static a(Landroid/os/Messenger;)V
    .locals 2
    .parameter

    .prologue
    .line 33
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1
    return-void

    .line 36
    :catch_0
    move-exception v0

    .line 14
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a(Landroid/os/Messenger;Landroid/os/Message;)V
    .locals 2
    .parameter
    .parameter

    .prologue
    .line 28
    const/4 v0, 0x0

    iput v0, p1, Landroid/os/Message;->what:I

    .line 15
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-void

    .line 8
    :catch_0
    move-exception v0

    .line 30
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static b(Landroid/os/Messenger;)V
    .locals 2
    .parameter

    .prologue
    .line 20
    const/4 v0, 0x0

    const/4 v1, 0x2

    :try_start_0
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return-void

    .line 10
    :catch_0
    move-exception v0

    .line 16
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static c(Landroid/os/Messenger;)V
    .locals 2
    .parameter

    .prologue
    .line 34
    const/4 v0, 0x0

    const/4 v1, 0x3

    :try_start_0
    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 4
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whatsapp/messaging/e;->b:Z

    .line 24
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 1
    .parameter

    .prologue
    .line 6
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 35
    :cond_0
    :goto_0
    return-void

    .line 13
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/messaging/e;->a:Lcom/whatsapp/messaging/m;

    invoke-static {v0, p1}, Lcom/whatsapp/messaging/m;->a(Lcom/whatsapp/messaging/m;Landroid/os/Message;)V

    goto :goto_0

    .line 3
    :pswitch_1
    iget-boolean v0, p0, Lcom/whatsapp/messaging/e;->b:Z

    if-nez v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/whatsapp/messaging/e;->a:Lcom/whatsapp/messaging/m;

    invoke-static {v0}, Lcom/whatsapp/messaging/m;->b(Lcom/whatsapp/messaging/m;)V

    goto :goto_0

    .line 26
    :pswitch_2
    iget-boolean v0, p0, Lcom/whatsapp/messaging/e;->b:Z

    if-nez v0, :cond_0

    .line 18
    iget-object v0, p0, Lcom/whatsapp/messaging/e;->a:Lcom/whatsapp/messaging/m;

    invoke-static {v0}, Lcom/whatsapp/messaging/m;->c(Lcom/whatsapp/messaging/m;)V

    goto :goto_0

    .line 7
    :pswitch_3
    iget-object v0, p0, Lcom/whatsapp/messaging/e;->a:Lcom/whatsapp/messaging/m;

    invoke-static {v0}, Lcom/whatsapp/messaging/m;->d(Lcom/whatsapp/messaging/m;)V

    goto :goto_0

    .line 6
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
