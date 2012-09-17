.class Lcom/whatsapp/q1;
.super Ljava/lang/Object;
.source "q1.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final a:Lcom/whatsapp/RecordAudio;


# direct methods
.method constructor <init>(Lcom/whatsapp/RecordAudio;)V
    .locals 0
    .parameter

    .prologue
    .line 11
    iput-object p1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .parameter

    .prologue
    const/4 v2, 0x5

    const/4 v5, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 5
    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v1}, Lcom/whatsapp/RecordAudio;->b(Lcom/whatsapp/RecordAudio;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1
    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 12
    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->pause()V

    .line 14
    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iput v2, v1, Lcom/whatsapp/RecordAudio;->f:I

    if-eqz v0, :cond_4

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget v1, v1, Lcom/whatsapp/RecordAudio;->f:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    iget-object v2, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 7
    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    if-eqz v0, :cond_2

    .line 2
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v1, v5}, Lcom/whatsapp/RecordAudio;->a(Lcom/whatsapp/RecordAudio;I)V

    .line 3
    :cond_2
    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    const/4 v2, 0x4

    iput v2, v1, Lcom/whatsapp/RecordAudio;->f:I

    if-eqz v0, :cond_4

    .line 10
    :cond_3
    iget-object v0, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-wide v1, v1, Lcom/whatsapp/RecordAudio;->h:J

    iget-object v3, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-wide v3, v3, Lcom/whatsapp/RecordAudio;->g:J

    sub-long/2addr v1, v3

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 13
    iget-object v0, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    const/4 v1, 0x3

    iput v1, v0, Lcom/whatsapp/RecordAudio;->f:I

    .line 9
    iget-object v0, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->p:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 6
    iget-object v0, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 15
    :cond_4
    iget-object v0, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, p0, Lcom/whatsapp/q1;->a:Lcom/whatsapp/RecordAudio;

    iget v1, v1, Lcom/whatsapp/RecordAudio;->f:I

    invoke-virtual {v0, v1}, Lcom/whatsapp/RecordAudio;->b(I)V

    .line 4
    return-void
.end method
