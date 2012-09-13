.class final Lcom/whatsapp/ad;
.super Landroid/os/Handler;
.source "ad.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .parameter

    .prologue
    .line 6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/whatsapp/sz;

    .line 5
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 1
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 2
    :goto_0
    return-void

    .line 4
    :pswitch_0
    invoke-static {v0, v1}, Lcom/whatsapp/fq;->d(Lcom/whatsapp/sz;I)V

    goto :goto_0

    .line 1
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
