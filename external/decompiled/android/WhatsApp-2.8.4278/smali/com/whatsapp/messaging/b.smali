.class Lcom/whatsapp/messaging/b;
.super Landroid/os/Handler;
.source "b.java"


# instance fields
.field final a:Lcom/whatsapp/messaging/m;


# direct methods
.method private constructor <init>(Lcom/whatsapp/messaging/m;)V
    .locals 0
    .parameter

    .prologue
    .line 6
    iput-object p1, p0, Lcom/whatsapp/messaging/b;->a:Lcom/whatsapp/messaging/m;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/messaging/m;Lcom/whatsapp/messaging/u;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 1
    invoke-direct {p0, p1}, Lcom/whatsapp/messaging/b;-><init>(Lcom/whatsapp/messaging/m;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 10
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/whatsapp/messaging/b;->removeMessages(I)V

    .line 8
    return-void
.end method

.method public a(J)V
    .locals 1
    .parameter

    .prologue
    .line 2
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lcom/whatsapp/messaging/b;->sendEmptyMessageDelayed(IJ)Z

    .line 9
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 1
    .parameter

    .prologue
    .line 3
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 7
    :goto_0
    return-void

    .line 4
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/messaging/b;->a:Lcom/whatsapp/messaging/m;

    invoke-static {v0}, Lcom/whatsapp/messaging/m;->h(Lcom/whatsapp/messaging/m;)V

    goto :goto_0

    .line 3
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
