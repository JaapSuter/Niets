.class Lcom/whatsapp/n1;
.super Ljava/lang/Object;
.source "n1.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field final a:Lcom/whatsapp/RecordAudio;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, ";\u0006pWu!\u0002ua`$"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    move-object v1, v0

    :goto_0
    if-gt v2, v3, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/whatsapp/n1;->z:Ljava/lang/String;

    return-void

    :cond_0
    aget-char v4, v1, v3

    rem-int/lit8 v0, v3, 0x5

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x5

    :goto_1
    xor-int/2addr v0, v4

    int-to-char v0, v0

    aput-char v0, v1, v3

    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0x53

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x67

    goto :goto_1

    :pswitch_2
    const/4 v0, 0x3

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x8

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method constructor <init>(Lcom/whatsapp/RecordAudio;)V
    .locals 0
    .parameter

    .prologue
    .line 27
    iput-object p1, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 6

    .prologue
    .line 24
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->s:Ljava/lang/String;

    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v4}, Lcom/whatsapp/RecordAudio;->d(Lcom/whatsapp/RecordAudio;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x2

    const/4 v5, 0x2

    invoke-static {v5}, Lcom/whatsapp/j5;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lcom/whatsapp/j5;->a(Landroid/app/Activity;Lcom/whatsapp/lr;Ljava/lang/String;Ljava/io/File;BLjava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 19
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v0}, Lcom/whatsapp/RecordAudio;->finish()V

    .line 38
    return-void

    .line 49
    :catch_0
    move-exception v0

    .line 1
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 58
    :catch_1
    move-exception v0

    .line 39
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .parameter

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x2

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 22
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget v0, v0, Lcom/whatsapp/RecordAudio;->f:I

    packed-switch v0, :pswitch_data_0

    .line 8
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget v1, v1, Lcom/whatsapp/RecordAudio;->f:I

    invoke-virtual {v0, v1}, Lcom/whatsapp/RecordAudio;->b(I)V

    .line 37
    return-void

    .line 44
    :pswitch_0
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v0}, Lcom/whatsapp/RecordAudio;->c(Lcom/whatsapp/RecordAudio;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28
    invoke-direct {p0}, Lcom/whatsapp/n1;->a()V

    if-eqz v1, :cond_0

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->p:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 23
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    const v2, 0x1d4c0

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 7
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/whatsapp/RecordAudio;->g:J

    .line 59
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->prepare()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 26
    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->start()V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    const/4 v2, 0x1

    iput v2, v0, Lcom/whatsapp/RecordAudio;->f:I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 46
    :catch_0
    move-exception v0

    .line 52
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 6
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    const v2, 0x7f0902d7

    new-instance v3, Lcom/whatsapp/o1;

    invoke-direct {v3, p0}, Lcom/whatsapp/o1;-><init>(Lcom/whatsapp/n1;)V

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/RecordAudio;->a(ILcom/whatsapp/nr;)V

    .line 25
    if-eqz v1, :cond_0

    .line 11
    :pswitch_1
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v0}, Lcom/whatsapp/RecordAudio;->a()V

    .line 12
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iput v4, v0, Lcom/whatsapp/RecordAudio;->f:I

    .line 62
    if-eqz v1, :cond_0

    .line 50
    :pswitch_2
    new-instance v0, Lcom/whatsapp/MediaData;

    invoke-direct {v0}, Lcom/whatsapp/MediaData;-><init>()V

    .line 10
    iget-object v2, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->o:Ljava/io/File;

    iput-object v2, v0, Lcom/whatsapp/MediaData;->file:Ljava/io/File;

    .line 20
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 60
    iget-object v2, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->o:Ljava/io/File;

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 54
    sget-object v2, Lcom/whatsapp/n1;->z:Ljava/lang/String;

    invoke-virtual {v0, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 30
    iget-object v2, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    const/4 v3, -0x1

    invoke-virtual {v2, v3, v0}, Lcom/whatsapp/RecordAudio;->setResult(ILandroid/content/Intent;)V

    .line 41
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v0}, Lcom/whatsapp/RecordAudio;->finish()V

    .line 47
    if-eqz v1, :cond_0

    .line 43
    :pswitch_3
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 53
    :try_start_2
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v0, v0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 51
    :goto_2
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iput v4, v0, Lcom/whatsapp/RecordAudio;->f:I

    .line 9
    if-eqz v1, :cond_0

    .line 16
    :pswitch_4
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v0}, Lcom/whatsapp/RecordAudio;->c(Lcom/whatsapp/RecordAudio;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    invoke-direct {p0}, Lcom/whatsapp/n1;->a()V

    if-eqz v1, :cond_0

    .line 15
    :pswitch_5
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v0}, Lcom/whatsapp/RecordAudio;->c(Lcom/whatsapp/RecordAudio;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    :try_start_3
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v1, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    iget-object v2, v2, Lcom/whatsapp/RecordAudio;->s:Ljava/lang/String;

    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-static {v4}, Lcom/whatsapp/RecordAudio;->d(Lcom/whatsapp/RecordAudio;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x2

    const/4 v5, 0x2

    invoke-static {v5}, Lcom/whatsapp/j5;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lcom/whatsapp/j5;->a(Landroid/app/Activity;Lcom/whatsapp/lr;Ljava/lang/String;Ljava/io/File;BLjava/lang/String;)Z
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 57
    :goto_3
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    invoke-virtual {v0}, Lcom/whatsapp/RecordAudio;->finish()V

    goto/16 :goto_0

    .line 48
    :catch_1
    move-exception v0

    .line 32
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto/16 :goto_1

    .line 14
    :catch_2
    move-exception v0

    .line 63
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 61
    :catch_3
    move-exception v0

    .line 64
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 17
    iget-object v0, p0, Lcom/whatsapp/n1;->a:Lcom/whatsapp/RecordAudio;

    const v2, 0x7f090210

    new-instance v3, Lcom/whatsapp/p1;

    invoke-direct {v3, p0}, Lcom/whatsapp/p1;-><init>(Lcom/whatsapp/n1;)V

    invoke-virtual {v0, v2, v3}, Lcom/whatsapp/RecordAudio;->a(ILcom/whatsapp/nr;)V

    goto :goto_2

    .line 33
    :catch_4
    move-exception v0

    .line 42
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 35
    :catch_5
    move-exception v0

    .line 3
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 22
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
