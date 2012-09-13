.class final Lcom/whatsapp/yc;
.super Landroid/os/Handler;
.source "yc.java"


# instance fields
.field private a:B

.field private b:Landroid/widget/HorizontalScrollView;

.field final c:Lcom/whatsapp/Conversation;


# direct methods
.method private constructor <init>(Lcom/whatsapp/Conversation;)V
    .locals 1
    .parameter

    .prologue
    .line 23
    iput-object p1, p0, Lcom/whatsapp/yc;->c:Lcom/whatsapp/Conversation;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/whatsapp/yc;->a:B

    return-void
.end method

.method constructor <init>(Lcom/whatsapp/Conversation;Lcom/whatsapp/vk;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 4
    invoke-direct {p0, p1}, Lcom/whatsapp/yc;-><init>(Lcom/whatsapp/Conversation;)V

    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x2

    .line 8
    iget-byte v0, p0, Lcom/whatsapp/yc;->a:B

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 20
    :cond_0
    :goto_0
    return-void

    .line 3
    :cond_1
    invoke-virtual {p0, v2}, Lcom/whatsapp/yc;->removeMessages(I)V

    .line 26
    iget-object v0, p0, Lcom/whatsapp/yc;->b:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v0

    .line 15
    iget-object v1, p0, Lcom/whatsapp/yc;->b:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1, v2, v3}, Landroid/widget/HorizontalScrollView;->scrollBy(II)V

    .line 5
    iget-object v1, p0, Lcom/whatsapp/yc;->b:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 18
    const/high16 v0, 0x4296

    iget-object v1, p0, Lcom/whatsapp/yc;->c:Lcom/whatsapp/Conversation;

    invoke-static {v1}, Lcom/whatsapp/j4;->a(Landroid/content/Context;)Lcom/whatsapp/j4;

    move-result-object v1

    iget v1, v1, Lcom/whatsapp/j4;->d:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    int-to-long v0, v0

    invoke-virtual {p0, v2, v0, v1}, Lcom/whatsapp/yc;->sendEmptyMessageDelayed(IJ)Z

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_0

    .line 6
    :cond_2
    iput-byte v3, p0, Lcom/whatsapp/yc;->a:B

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 14
    iget-object v0, p0, Lcom/whatsapp/yc;->c:Lcom/whatsapp/Conversation;

    const v1, 0x7f0d00a8

    invoke-virtual {v0, v1}, Lcom/whatsapp/Conversation;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/whatsapp/yc;->b:Landroid/widget/HorizontalScrollView;

    .line 19
    iget-object v0, p0, Lcom/whatsapp/yc;->b:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->computeScroll()V

    .line 9
    iget-object v0, p0, Lcom/whatsapp/yc;->b:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0, v2, v2}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    .line 10
    const/4 v0, 0x1

    const-wide/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1, v2}, Lcom/whatsapp/yc;->sendEmptyMessageDelayed(IJ)Z

    .line 1
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .parameter

    .prologue
    const/4 v2, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 13
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 22
    :cond_0
    :goto_0
    return-void

    .line 21
    :pswitch_0
    const/4 v1, 0x1

    iput-byte v1, p0, Lcom/whatsapp/yc;->a:B

    .line 12
    iget-object v1, p0, Lcom/whatsapp/yc;->b:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1, v2, v2}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    .line 25
    invoke-direct {p0}, Lcom/whatsapp/yc;->b()V

    .line 24
    if-eqz v0, :cond_0

    .line 16
    :pswitch_1
    invoke-direct {p0}, Lcom/whatsapp/yc;->b()V

    .line 2
    if-eqz v0, :cond_0

    .line 7
    :pswitch_2
    iget-object v0, p0, Lcom/whatsapp/yc;->b:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0, v2, v2}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    goto :goto_0

    .line 13
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
