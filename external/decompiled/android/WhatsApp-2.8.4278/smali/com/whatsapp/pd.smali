.class Lcom/whatsapp/pd;
.super Landroid/os/Handler;
.source "pd.java"


# instance fields
.field final a:Lcom/whatsapp/RecordAudio;


# direct methods
.method constructor <init>(Lcom/whatsapp/RecordAudio;)V
    .locals 0
    .parameter

    .prologue
    .line 12
    iput-object p1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12
    .parameter

    .prologue
    const v11, 0x7f090222

    const/4 v10, 0x4

    const/4 v9, 0x1

    const/4 v8, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 9
    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget v1, v1, Lcom/whatsapp/RecordAudio;->f:I

    if-ne v1, v10, :cond_1

    .line 8
    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    .line 16
    iget-object v2, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget v2, v2, Lcom/whatsapp/RecordAudio;->y:I

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x64

    iget-object v3, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v3, v3, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    invoke-virtual {v3}, Landroid/widget/SeekBar;->getMax()I

    move-result v3

    div-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v3, 0x3

    if-lt v2, v3, :cond_0

    .line 7
    iget-object v2, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    new-array v5, v9, [Ljava/lang/Object;

    mul-int/lit8 v6, v1, 0x64

    iget-object v7, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v7, v7, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    invoke-virtual {v7}, Landroid/widget/SeekBar;->getMax()I

    move-result v7

    div-int/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-virtual {v4, v11, v5}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v2, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iput v1, v2, Lcom/whatsapp/RecordAudio;->y:I

    .line 15
    :cond_0
    iget-object v2, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    invoke-virtual {v2, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 10
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v1}, Lcom/whatsapp/RecordAudio;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget v1, v1, Lcom/whatsapp/RecordAudio;->f:I

    if-ne v1, v10, :cond_2

    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget v1, v1, Lcom/whatsapp/RecordAudio;->f:I

    const/4 v2, 0x5

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    iget-object v2, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    if-eq v1, v2, :cond_4

    .line 3
    :cond_3
    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v1}, Lcom/whatsapp/RecordAudio;->a(Lcom/whatsapp/RecordAudio;)Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x32

    invoke-virtual {v1, v8, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    if-eqz v0, :cond_6

    .line 1
    :cond_4
    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    new-array v4, v9, [Ljava/lang/Object;

    const/16 v5, 0x64

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v8

    invoke-virtual {v3, v11, v4}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    const v2, 0x7f09021d

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(I)V

    .line 11
    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v1}, Lcom/whatsapp/RecordAudio;->c(Lcom/whatsapp/RecordAudio;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 5
    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v1}, Lcom/whatsapp/RecordAudio;->finish()V

    if-eqz v0, :cond_6

    .line 14
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/whatsapp/pd;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getMax()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 4
    :cond_6
    return-void
.end method
