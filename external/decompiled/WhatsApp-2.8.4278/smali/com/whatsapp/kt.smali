.class final Lcom/whatsapp/kt;
.super Ljava/lang/Object;
.source "kt.java"

# interfaces
.implements Lcom/whatsapp/wz;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x1

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 7
    packed-switch p1, :pswitch_data_0

    .line 9
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 6
    :pswitch_1
    sput-boolean v2, Lcom/whatsapp/eu;->d:Z

    .line 5
    invoke-static {}, Lcom/whatsapp/App;->t()V

    .line 1
    if-eqz v0, :cond_0

    .line 2
    :pswitch_2
    sget-object v1, Lcom/whatsapp/GroupChatInfo;->H:Landroid/os/Handler;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 3
    if-eqz v0, :cond_0

    goto :goto_0

    .line 7
    :pswitch_data_0
    .packed-switch 0x190
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
