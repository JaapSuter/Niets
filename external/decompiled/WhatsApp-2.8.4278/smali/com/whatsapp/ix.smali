.class Lcom/whatsapp/ix;
.super Ljava/lang/Object;
.source "ix.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final a:Lcom/whatsapp/MediaView;


# direct methods
.method constructor <init>(Lcom/whatsapp/MediaView;)V
    .locals 0
    .parameter

    .prologue
    .line 13
    iput-object p1, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6
    .parameter
    .parameter

    .prologue
    const/16 v5, 0x15e

    const/4 v4, 0x0

    .line 5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 4
    :cond_0
    :goto_0
    return v4

    .line 10
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    iput v5, v0, Lcom/whatsapp/MediaView;->O:I

    .line 14
    iget-object v0, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    iput v4, v0, Lcom/whatsapp/MediaView;->P:I

    .line 7
    iget-object v0, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/whatsapp/MediaView;->N:J

    .line 2
    iget-object v0, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    iget-object v1, v0, Lcom/whatsapp/MediaView;->Q:Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    iget v2, v2, Lcom/whatsapp/MediaView;->O:I

    int-to-long v2, v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 3
    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 15
    :pswitch_1
    iget-object v0, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    iget-object v1, v0, Lcom/whatsapp/MediaView;->Q:Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 11
    iget-object v0, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    iget v0, v0, Lcom/whatsapp/MediaView;->O:I

    if-ne v0, v5, :cond_1

    .line 1
    iget-object v1, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v1, v0}, Lcom/whatsapp/MediaView;->g(Lcom/whatsapp/MediaView;I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lcom/whatsapp/MediaView;->N:J

    .line 9
    iget-object v0, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    iput v4, v0, Lcom/whatsapp/MediaView;->O:I

    .line 8
    iget-object v0, p0, Lcom/whatsapp/ix;->a:Lcom/whatsapp/MediaView;

    iput v4, v0, Lcom/whatsapp/MediaView;->P:I

    goto :goto_0

    .line 5
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
