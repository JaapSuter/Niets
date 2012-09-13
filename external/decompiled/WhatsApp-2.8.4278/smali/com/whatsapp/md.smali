.class Lcom/whatsapp/md;
.super Landroid/os/Handler;
.source "md.java"


# instance fields
.field final a:Lcom/whatsapp/MediaView;


# direct methods
.method constructor <init>(Lcom/whatsapp/MediaView;)V
    .locals 0
    .parameter

    .prologue
    .line 8
    iput-object p1, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5
    .parameter

    .prologue
    const/16 v4, 0xc8

    .line 3
    iget-object v0, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    iget v0, v0, Lcom/whatsapp/MediaView;->O:I

    if-le v0, v4, :cond_0

    .line 2
    iget-object v0, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    iget v1, v0, Lcom/whatsapp/MediaView;->O:I

    iget-object v2, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    iget-object v3, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    iget v3, v3, Lcom/whatsapp/MediaView;->P:I

    invoke-static {v2, v3}, Lcom/whatsapp/MediaView;->h(Lcom/whatsapp/MediaView;I)I

    move-result v2

    mul-int/lit8 v2, v2, 0xa

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whatsapp/MediaView;->O:I

    .line 7
    iget-object v0, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    iget v1, v0, Lcom/whatsapp/MediaView;->P:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/whatsapp/MediaView;->P:I

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    if-eqz v0, :cond_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    iput v4, v0, Lcom/whatsapp/MediaView;->O:I

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-static {v0, v1}, Lcom/whatsapp/MediaView;->g(Lcom/whatsapp/MediaView;I)V

    .line 6
    iget-object v0, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    iget-object v0, v0, Lcom/whatsapp/MediaView;->Q:Landroid/os/Handler;

    iget v1, p1, Landroid/os/Message;->what:I

    iget-object v2, p0, Lcom/whatsapp/md;->a:Lcom/whatsapp/MediaView;

    iget v2, v2, Lcom/whatsapp/MediaView;->O:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1
    return-void
.end method
