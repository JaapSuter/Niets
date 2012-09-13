.class Lcom/whatsapp/od;
.super Landroid/os/Handler;
.source "od.java"


# instance fields
.field final a:Lcom/whatsapp/RecordAudio;


# direct methods
.method constructor <init>(Lcom/whatsapp/RecordAudio;)V
    .locals 0
    .parameter

    .prologue
    .line 4
    iput-object p1, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 14
    .parameter

    .prologue
    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 1
    const/4 v0, 0x0

    .line 12
    iget-object v2, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget v2, v2, Lcom/whatsapp/RecordAudio;->f:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    .line 5
    iget-object v2, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v2

    .line 6
    iget-object v3, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget v3, v3, Lcom/whatsapp/RecordAudio;->y:I

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x64

    iget-object v4, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v4, v4, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Landroid/widget/ProgressBar;->getMax()I

    move-result v4

    div-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    const/4 v4, 0x3

    if-lt v3, v4, :cond_0

    .line 16
    iget-object v3, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v3, v3, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    const v6, 0x7f090222

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    mul-int/lit8 v9, v2, 0x64

    iget-object v10, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v10, v10, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v10}, Landroid/widget/ProgressBar;->getMax()I

    move-result v10

    div-int/2addr v9, v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v5, v6, v7}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "%"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v3, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iput v2, v3, Lcom/whatsapp/RecordAudio;->y:I

    .line 10
    :cond_0
    iget-object v3, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v3, v3, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v3, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 21
    if-eqz v1, :cond_3

    :cond_1
    iget-object v2, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget v2, v2, Lcom/whatsapp/RecordAudio;->f:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-wide v4, v4, Lcom/whatsapp/RecordAudio;->g:J

    sub-long/2addr v2, v4

    .line 11
    const-wide/32 v4, 0x1d4c0

    cmp-long v4, v2, v4

    if-lez v4, :cond_2

    .line 23
    const/4 v0, 0x1

    .line 25
    iget-object v4, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v4}, Lcom/whatsapp/RecordAudio;->a()V

    .line 14
    iget-object v4, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    const/4 v5, 0x2

    iput v5, v4, Lcom/whatsapp/RecordAudio;->f:I

    .line 9
    iget-object v4, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v5, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget v5, v5, Lcom/whatsapp/RecordAudio;->f:I

    invoke-virtual {v4, v5}, Lcom/whatsapp/RecordAudio;->b(I)V

    if-eqz v1, :cond_3

    .line 7
    :cond_2
    iget-object v4, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v4, v4, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    const v7, 0x7f090220

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    iget-object v12, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-wide v12, v12, Lcom/whatsapp/RecordAudio;->g:J

    sub-long/2addr v10, v12

    const-wide/16 v12, 0x64

    mul-long/2addr v10, v12

    iget-object v12, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v12, v12, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v12}, Landroid/widget/ProgressBar;->getMax()I

    move-result v12

    int-to-long v12, v12

    div-long/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v8, v9

    invoke-virtual {v6, v7, v8}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "%"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v4, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v4, v4, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    long-to-int v2, v2

    invoke-virtual {v4, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 19
    :cond_3
    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v0}, Lcom/whatsapp/RecordAudio;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget v0, v0, Lcom/whatsapp/RecordAudio;->f:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget v0, v0, Lcom/whatsapp/RecordAudio;->f:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_6

    .line 18
    :cond_5
    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->p:Landroid/os/Handler;

    const/4 v2, 0x0

    const-wide/16 v3, 0x32

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    if-eqz v1, :cond_7

    .line 2
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget v0, v0, Lcom/whatsapp/RecordAudio;->f:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 15
    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, v1, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getMax()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 13
    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    const v3, 0x7f090222

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const/16 v6, 0x64

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    const/4 v1, 0x2

    iput v1, v0, Lcom/whatsapp/RecordAudio;->f:I

    .line 22
    iget-object v0, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, p0, Lcom/whatsapp/od;->a:Lcom/whatsapp/RecordAudio;

    iget v1, v1, Lcom/whatsapp/RecordAudio;->f:I

    invoke-virtual {v0, v1}, Lcom/whatsapp/RecordAudio;->b(I)V

    .line 3
    :cond_7
    return-void
.end method
