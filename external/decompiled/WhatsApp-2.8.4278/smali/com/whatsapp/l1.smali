.class Lcom/whatsapp/l1;
.super Ljava/lang/Object;
.source "l1.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final a:Lcom/whatsapp/RecordAudio;


# direct methods
.method constructor <init>(Lcom/whatsapp/RecordAudio;)V
    .locals 0
    .parameter

    .prologue
    .line 12
    iput-object p1, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 8
    invoke-virtual {p1, p2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 13
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2
    .parameter

    .prologue
    .line 3
    iget-object v0, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    iget-object v0, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v0}, Lcom/whatsapp/RecordAudio;->a(Lcom/whatsapp/RecordAudio;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 6
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 14
    iget-object v1, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget v1, v1, Lcom/whatsapp/RecordAudio;->f:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    .line 7
    iget-object v1, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    iget-object v2, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getMax()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 11
    iget-object v1, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V

    .line 1
    iget-object v1, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v1}, Lcom/whatsapp/RecordAudio;->a(Lcom/whatsapp/RecordAudio;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 16
    iget-object v1, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    const v2, 0x7f09021e

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(I)V

    if-eqz v0, :cond_2

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, p0, Lcom/whatsapp/l1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getMax()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-static {v1, v2}, Lcom/whatsapp/RecordAudio;->a(Lcom/whatsapp/RecordAudio;I)V

    if-eqz v0, :cond_2

    .line 4
    :cond_1
    invoke-virtual {p1, v5}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 10
    :cond_2
    return-void
.end method
