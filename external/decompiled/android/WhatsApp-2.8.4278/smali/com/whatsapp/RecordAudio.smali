.class public Lcom/whatsapp/RecordAudio;
.super Lcom/whatsapp/DialogToastActivity;
.source "RecordAudio.java"


# static fields
.field private static final z:[Ljava/lang/String;


# instance fields
.field f:I

.field g:J

.field h:J

.field i:Landroid/media/MediaRecorder;

.field j:Landroid/media/MediaPlayer;

.field k:Landroid/widget/TextView;

.field l:Landroid/widget/Button;

.field m:Landroid/widget/Button;

.field n:Landroid/widget/Button;

.field o:Ljava/io/File;

.field p:Landroid/os/Handler;

.field q:Landroid/widget/ProgressBar;

.field r:Landroid/widget/SeekBar;

.field s:Ljava/lang/String;

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Ljava/lang/String;

.field private x:Landroid/os/Handler;

.field y:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const/16 v3, 0x3c

    const/16 v4, 0x2d

    const/16 v2, 0x1f

    const/4 v1, 0x7

    const/4 v6, 0x0

    const/16 v0, 0xa

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "*\u007fkY_!fscK&kzc].sw"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_0
    if-gt v7, v8, :cond_0

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v10, 0x1

    const-string v0, ".r{UBocjNL;npR\u0017"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_1
    if-gt v7, v8, :cond_1

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x2

    const-string v0, "a4xL"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_2
    if-gt v7, v8, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x3

    const-string v0, "=b|S_+X~II&h0LA.~}]N$XyUA*="

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_3
    if-gt v7, v8, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x4

    const-string v0, "=b|S_+fjXD (|NH.sz"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_4
    if-gt v7, v8, :cond_4

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x5

    const-string v0, ")nsY].sw"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_5
    if-gt v7, v8, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/4 v10, 0x6

    const-string v0, "?k~EO.dtcB!kf"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_6
    if-gt v7, v8, :cond_6

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const-string v0, "\"hjRY*c"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_7
    if-gt v7, v8, :cond_7

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v1

    const/16 v10, 0x8

    const-string v0, "%n{"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v5

    move v8, v6

    move-object v5, v0

    :goto_8
    if-gt v7, v8, :cond_8

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v10

    const/16 v8, 0x9

    const-string v0, "&t@L_*qvYZ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    array-length v5, v0

    move v7, v6

    move v6, v5

    move-object v5, v0

    :goto_9
    if-gt v6, v7, :cond_9

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v8

    sput-object v9, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    return-void

    :cond_0
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_0

    move v0, v4

    :goto_a
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_0

    :pswitch_0
    const/16 v0, 0x4f

    goto :goto_a

    :pswitch_1
    move v0, v1

    goto :goto_a

    :pswitch_2
    move v0, v2

    goto :goto_a

    :pswitch_3
    move v0, v3

    goto :goto_a

    :cond_1
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_1

    move v0, v4

    :goto_b
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_1

    :pswitch_4
    const/16 v0, 0x4f

    goto :goto_b

    :pswitch_5
    move v0, v1

    goto :goto_b

    :pswitch_6
    move v0, v2

    goto :goto_b

    :pswitch_7
    move v0, v3

    goto :goto_b

    :cond_2
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_2

    move v0, v4

    :goto_c
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_2

    :pswitch_8
    const/16 v0, 0x4f

    goto :goto_c

    :pswitch_9
    move v0, v1

    goto :goto_c

    :pswitch_a
    move v0, v2

    goto :goto_c

    :pswitch_b
    move v0, v3

    goto :goto_c

    :cond_3
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_3

    move v0, v4

    :goto_d
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_3

    :pswitch_c
    const/16 v0, 0x4f

    goto :goto_d

    :pswitch_d
    move v0, v1

    goto :goto_d

    :pswitch_e
    move v0, v2

    goto :goto_d

    :pswitch_f
    move v0, v3

    goto :goto_d

    :cond_4
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_4

    move v0, v4

    :goto_e
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_4

    :pswitch_10
    const/16 v0, 0x4f

    goto :goto_e

    :pswitch_11
    move v0, v1

    goto :goto_e

    :pswitch_12
    move v0, v2

    goto :goto_e

    :pswitch_13
    move v0, v3

    goto :goto_e

    :cond_5
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_5

    move v0, v4

    :goto_f
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_5

    :pswitch_14
    const/16 v0, 0x4f

    goto :goto_f

    :pswitch_15
    move v0, v1

    goto :goto_f

    :pswitch_16
    move v0, v2

    goto :goto_f

    :pswitch_17
    move v0, v3

    goto :goto_f

    :cond_6
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_6

    move v0, v4

    :goto_10
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_6

    :pswitch_18
    const/16 v0, 0x4f

    goto :goto_10

    :pswitch_19
    move v0, v1

    goto :goto_10

    :pswitch_1a
    move v0, v2

    goto :goto_10

    :pswitch_1b
    move v0, v3

    goto :goto_10

    :cond_7
    aget-char v10, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_7

    move v0, v4

    :goto_11
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_7

    :pswitch_1c
    const/16 v0, 0x4f

    goto :goto_11

    :pswitch_1d
    move v0, v1

    goto :goto_11

    :pswitch_1e
    move v0, v2

    goto :goto_11

    :pswitch_1f
    move v0, v3

    goto :goto_11

    :cond_8
    aget-char v11, v5, v8

    rem-int/lit8 v0, v8, 0x5

    packed-switch v0, :pswitch_data_8

    move v0, v4

    :goto_12
    xor-int/2addr v0, v11

    int-to-char v0, v0

    aput-char v0, v5, v8

    add-int/lit8 v0, v8, 0x1

    move v8, v0

    goto/16 :goto_8

    :pswitch_20
    const/16 v0, 0x4f

    goto :goto_12

    :pswitch_21
    move v0, v1

    goto :goto_12

    :pswitch_22
    move v0, v2

    goto :goto_12

    :pswitch_23
    move v0, v3

    goto :goto_12

    :cond_9
    aget-char v10, v5, v7

    rem-int/lit8 v0, v7, 0x5

    packed-switch v0, :pswitch_data_9

    move v0, v4

    :goto_13
    xor-int/2addr v0, v10

    int-to-char v0, v0

    aput-char v0, v5, v7

    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_9

    :pswitch_24
    const/16 v0, 0x4f

    goto :goto_13

    :pswitch_25
    move v0, v1

    goto :goto_13

    :pswitch_26
    move v0, v2

    goto :goto_13

    :pswitch_27
    move v0, v3

    goto :goto_13

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1b
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1d
        :pswitch_1e
        :pswitch_1f
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_20
        :pswitch_21
        :pswitch_22
        :pswitch_23
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_24
        :pswitch_25
        :pswitch_26
        :pswitch_27
    .end packed-switch
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0}, Lcom/whatsapp/DialogToastActivity;-><init>()V

    .line 27
    iput v0, p0, Lcom/whatsapp/RecordAudio;->f:I

    .line 35
    iput v0, p0, Lcom/whatsapp/RecordAudio;->y:I

    return-void
.end method

.method static a(Lcom/whatsapp/RecordAudio;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 24
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->x:Landroid/os/Handler;

    return-object v0
.end method

.method static a(Lcom/whatsapp/RecordAudio;I)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 67
    invoke-direct {p0, p1}, Lcom/whatsapp/RecordAudio;->c(I)V

    return-void
.end method

.method static a(Lcom/whatsapp/RecordAudio;Z)Z
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 93
    iput-boolean p1, p0, Lcom/whatsapp/RecordAudio;->t:Z

    return p1
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 168
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    .line 134
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 138
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/whatsapp/r1;

    invoke-direct {v1, p0}, Lcom/whatsapp/r1;-><init>(Lcom/whatsapp/RecordAudio;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 101
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/whatsapp/s1;

    invoke-direct {v1, p0}, Lcom/whatsapp/s1;-><init>(Lcom/whatsapp/RecordAudio;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 147
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 28
    const/4 v0, 0x5

    iput v0, p0, Lcom/whatsapp/RecordAudio;->f:I

    .line 1
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f090222

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    invoke-virtual {v0, v6}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 62
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    const v1, 0x7f0901f4

    invoke-virtual {p0, v1}, Lcom/whatsapp/RecordAudio;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 80
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 10
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 143
    const v0, 0x7f0902df

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->a(I)V

    goto :goto_0
.end method

.method static b(Lcom/whatsapp/RecordAudio;)Z
    .locals 1
    .parameter

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/whatsapp/RecordAudio;->u:Z

    return v0
.end method

.method private c(I)V
    .locals 2
    .parameter

    .prologue
    .line 33
    invoke-direct {p0}, Lcom/whatsapp/RecordAudio;->b()V

    .line 162
    const/4 v0, 0x4

    iput v0, p0, Lcom/whatsapp/RecordAudio;->f:I

    .line 132
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->x:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 164
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    const v1, 0x7f09021e

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 45
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 144
    if-lez p1, :cond_0

    .line 167
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 135
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 136
    :cond_0
    return-void
.end method

.method static c(Lcom/whatsapp/RecordAudio;)Z
    .locals 1
    .parameter

    .prologue
    .line 130
    iget-boolean v0, p0, Lcom/whatsapp/RecordAudio;->v:Z

    return v0
.end method

.method static d(Lcom/whatsapp/RecordAudio;)Ljava/lang/String;
    .locals 1
    .parameter

    .prologue
    .line 82
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->w:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 5

    .prologue
    .line 165
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V

    .line 4
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/whatsapp/RecordAudio;->h:J

    .line 13
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v1}, Landroid/widget/ProgressBar;->getMax()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 120
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    const v1, 0x7f090221

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const/16 v4, 0x78

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->o:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    :goto_0
    return-void

    .line 126
    :catch_0
    move-exception v0

    .line 52
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 9
    invoke-virtual {p0}, Lcom/whatsapp/RecordAudio;->finish()V

    goto :goto_0
.end method

.method b(I)V
    .locals 11
    .parameter

    .prologue
    const v10, 0x7f09021b

    const/16 v9, 0x8

    const/4 v8, 0x0

    sget-boolean v0, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 125
    packed-switch p1, :pswitch_data_0

    .line 118
    :cond_0
    :goto_0
    return-void

    .line 139
    :pswitch_0
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    const v2, 0x7f09021f

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 102
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->m:Landroid/widget/Button;

    const v2, 0x7f090219

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(I)V

    .line 106
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    invoke-virtual {v1, v9}, Landroid/widget/Button;->setVisibility(I)V

    .line 83
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->n:Landroid/widget/Button;

    invoke-virtual {v1, v8}, Landroid/widget/Button;->setVisibility(I)V

    .line 121
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 129
    if-eqz v0, :cond_0

    .line 95
    :pswitch_1
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    const v2, 0x7f090220

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 103
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->m:Landroid/widget/Button;

    invoke-virtual {v1, v10}, Landroid/widget/Button;->setText(I)V

    .line 94
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    invoke-virtual {v1, v9}, Landroid/widget/Button;->setVisibility(I)V

    .line 17
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->n:Landroid/widget/Button;

    invoke-virtual {v1, v9}, Landroid/widget/Button;->setVisibility(I)V

    .line 159
    if-eqz v0, :cond_0

    .line 3
    :pswitch_2
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    const v2, 0x7f090221

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-wide v4, p0, Lcom/whatsapp/RecordAudio;->h:J

    iget-wide v6, p0, Lcom/whatsapp/RecordAudio;->g:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->m:Landroid/widget/Button;

    const v2, 0x7f09021c

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(I)V

    .line 114
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    invoke-virtual {v1, v8}, Landroid/widget/Button;->setVisibility(I)V

    .line 107
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->n:Landroid/widget/Button;

    invoke-virtual {v1, v8}, Landroid/widget/Button;->setVisibility(I)V

    .line 72
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    iget-object v2, p0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v2}, Landroid/widget/ProgressBar;->getMax()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 53
    if-eqz v0, :cond_0

    .line 64
    :pswitch_3
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    const v2, 0x7f090222

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 123
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->m:Landroid/widget/Button;

    invoke-virtual {v1, v10}, Landroid/widget/Button;->setText(I)V

    .line 90
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    invoke-virtual {v1, v9}, Landroid/widget/Button;->setVisibility(I)V

    .line 111
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->n:Landroid/widget/Button;

    invoke-virtual {v1, v9}, Landroid/widget/Button;->setVisibility(I)V

    .line 128
    if-eqz v0, :cond_0

    .line 31
    :pswitch_4
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    invoke-virtual {v1, v8}, Landroid/widget/Button;->setVisibility(I)V

    .line 5
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    const v2, 0x7f09021a

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(I)V

    .line 149
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->n:Landroid/widget/Button;

    invoke-virtual {v1, v8}, Landroid/widget/Button;->setVisibility(I)V

    .line 63
    iget-boolean v1, p0, Lcom/whatsapp/RecordAudio;->v:Z

    if-eqz v1, :cond_1

    .line 137
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->m:Landroid/widget/Button;

    invoke-virtual {v1, v8}, Landroid/widget/Button;->setVisibility(I)V

    .line 49
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->m:Landroid/widget/Button;

    const v2, 0x7f090248

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(I)V

    .line 47
    :cond_1
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    invoke-virtual {v1, v8}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 22
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    iget-object v2, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setMax(I)V

    .line 26
    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v9}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 42
    if-eqz v0, :cond_0

    .line 146
    :pswitch_5
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    const v1, 0x7f09021d

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    goto/16 :goto_0

    .line 125
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

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10
    .parameter

    .prologue
    const/4 v9, 0x3

    const/16 v4, 0x8

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    sget-boolean v1, Lcom/whatsapp/DialogToastListActivity;->f:Z

    .line 58
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreate(Landroid/os/Bundle;)V

    .line 43
    invoke-virtual {p0, v7}, Lcom/whatsapp/RecordAudio;->requestWindowFeature(I)Z

    .line 88
    const v0, 0x7f030051

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->setContentView(I)V

    .line 38
    sget-object v0, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 156
    sget-object v0, Lcom/whatsapp/App;->bb:Lcom/whatsapp/App$Me;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/whatsapp/App;->c(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v9, :cond_2

    .line 155
    :cond_0
    invoke-virtual {p0}, Lcom/whatsapp/RecordAudio;->finish()V

    .line 98
    :cond_1
    :goto_0
    return-void

    .line 112
    :cond_2
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    .line 127
    sget-object v2, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2
    invoke-virtual {p0, v6}, Lcom/whatsapp/RecordAudio;->showDialog(I)V

    goto :goto_0

    .line 23
    :cond_3
    invoke-virtual {p0}, Lcom/whatsapp/RecordAudio;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-virtual {v0, v2, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/whatsapp/RecordAudio;->u:Z

    .line 86
    invoke-virtual {p0}, Lcom/whatsapp/RecordAudio;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-virtual {v0, v2, v6}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/whatsapp/RecordAudio;->v:Z

    .line 79
    iget-boolean v0, p0, Lcom/whatsapp/RecordAudio;->v:Z

    if-eqz v0, :cond_4

    .line 14
    invoke-virtual {p0}, Lcom/whatsapp/RecordAudio;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    aget-object v2, v2, v4

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->s:Ljava/lang/String;

    .line 122
    :cond_4
    const v0, 0x7f0d015f

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    .line 100
    const v0, 0x7f0d0163

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->n:Landroid/widget/Button;

    .line 11
    const v0, 0x7f0d0161

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    .line 151
    const v0, 0x7f0d0162

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->m:Landroid/widget/Button;

    .line 50
    const v0, 0x7f0d0160

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    .line 84
    const v0, 0x7f0d013d

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    .line 161
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    .line 119
    iget-boolean v0, p0, Lcom/whatsapp/RecordAudio;->u:Z

    if-eqz v0, :cond_8

    .line 70
    invoke-virtual {p0}, Lcom/whatsapp/RecordAudio;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v2, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->w:Ljava/lang/String;

    .line 69
    iget-boolean v0, p0, Lcom/whatsapp/RecordAudio;->v:Z

    if-nez v0, :cond_5

    .line 92
    const v0, 0x7f0d015d

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 75
    const v0, 0x7f0d0050

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    if-eqz v1, :cond_7

    .line 142
    :cond_5
    invoke-static {}, Lcom/whatsapp/Conversation;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 124
    invoke-static {}, Lcom/whatsapp/Conversation;->b()Lcom/whatsapp/Conversation;

    move-result-object v0

    iput-boolean v7, v0, Lcom/whatsapp/Conversation;->Fb:Z

    .line 97
    :cond_6
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x7f090222

    new-array v4, v7, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-virtual {p0, v3, v4}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->m:Landroid/widget/Button;

    const v2, 0x7f090248

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(I)V

    .line 12
    const v0, 0x7f0d015e

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 148
    const v0, 0x7f0d015d

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v2, 0x7f090128

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 46
    const v0, 0x7f0d015e

    invoke-virtual {p0, v0}, Lcom/whatsapp/RecordAudio;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/whatsapp/RecordAudio;->w:Ljava/lang/String;

    iget-object v3, p0, Lcom/whatsapp/RecordAudio;->w:Ljava/lang/String;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    aget-object v2, v2, v9

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/whatsapp/RecordAudio;->w:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whatsapp/g5;->b(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->r:Landroid/widget/SeekBar;

    new-instance v2, Lcom/whatsapp/l1;

    invoke-direct {v2, p0}, Lcom/whatsapp/l1;-><init>(Lcom/whatsapp/RecordAudio;)V

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    if-eqz v1, :cond_b

    .line 19
    :cond_8
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_9

    .line 105
    sget-object v0, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    aget-object v0, v0, v6

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 37
    :cond_9
    if-eqz v0, :cond_a

    .line 150
    new-instance v2, Ljava/io/File;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lcom/whatsapp/RecordAudio;->o:Ljava/io/File;

    .line 16
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    iget-object v2, p0, Lcom/whatsapp/RecordAudio;->q:Landroid/widget/ProgressBar;

    invoke-virtual {v2}, Landroid/widget/ProgressBar;->getMax()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 66
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->k:Landroid/widget/TextView;

    const v2, 0x7f090221

    new-array v3, v7, [Ljava/lang/Object;

    const/16 v4, 0x78

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v6

    invoke-virtual {p0, v2, v3}, Lcom/whatsapp/RecordAudio;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    iget-object v2, p0, Lcom/whatsapp/RecordAudio;->o:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/whatsapp/RecordAudio;->g:J

    .line 60
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    int-to-long v2, v0

    iput-wide v2, p0, Lcom/whatsapp/RecordAudio;->h:J

    .line 34
    iput v8, p0, Lcom/whatsapp/RecordAudio;->f:I

    .line 51
    invoke-virtual {p0, v8}, Lcom/whatsapp/RecordAudio;->b(I)V

    if-eqz v1, :cond_b

    .line 6
    :cond_a
    invoke-static {v8}, Lcom/whatsapp/j5;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    aget-object v1, v1, v8

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Lcom/whatsapp/App;->a(Ljava/lang/String;B)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->o:Ljava/io/File;

    .line 131
    new-instance v0, Landroid/media/MediaRecorder;

    invoke-direct {v0}, Landroid/media/MediaRecorder;-><init>()V

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    .line 153
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    invoke-virtual {v0, v7}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    .line 157
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    invoke-virtual {v0, v7}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    .line 104
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    invoke-virtual {v0, v7}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    .line 77
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->o:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    const v1, 0x1d4c0

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setMaxDuration(I)V

    .line 29
    invoke-virtual {p0, v6}, Lcom/whatsapp/RecordAudio;->b(I)V

    .line 99
    :cond_b
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->n:Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/m1;

    invoke-direct {v1, p0}, Lcom/whatsapp/m1;-><init>(Lcom/whatsapp/RecordAudio;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 169
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->m:Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/n1;

    invoke-direct {v1, p0}, Lcom/whatsapp/n1;-><init>(Lcom/whatsapp/RecordAudio;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    new-instance v1, Lcom/whatsapp/q1;

    invoke-direct {v1, p0}, Lcom/whatsapp/q1;-><init>(Lcom/whatsapp/RecordAudio;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    new-instance v0, Lcom/whatsapp/od;

    invoke-direct {v0, p0}, Lcom/whatsapp/od;-><init>(Lcom/whatsapp/RecordAudio;)V

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->p:Landroid/os/Handler;

    .line 115
    new-instance v0, Lcom/whatsapp/pd;

    invoke-direct {v0, p0}, Lcom/whatsapp/pd;-><init>(Lcom/whatsapp/RecordAudio;)V

    iput-object v0, p0, Lcom/whatsapp/RecordAudio;->x:Landroid/os/Handler;

    .line 96
    iget-boolean v0, p0, Lcom/whatsapp/RecordAudio;->u:Z

    if-eqz v0, :cond_1

    .line 20
    iget-boolean v0, p0, Lcom/whatsapp/RecordAudio;->v:Z

    if-nez v0, :cond_1

    .line 170
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->l:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->performClick()Z

    goto/16 :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 41
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    .line 145
    invoke-virtual {p0}, Lcom/whatsapp/RecordAudio;->finish()V

    goto/16 :goto_0
.end method

.method public onCreateDialog(I)Landroid/app/Dialog;
    .locals 3
    .parameter

    .prologue
    .line 73
    packed-switch p1, :pswitch_data_0

    .line 36
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v0

    .line 140
    :goto_0
    return-object v0

    :pswitch_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f090223

    :goto_1
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-static {}, Lcom/whatsapp/App;->tb()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f090225

    :goto_2
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f09000e

    new-instance v2, Lcom/whatsapp/t1;

    invoke-direct {v2, p0}, Lcom/whatsapp/t1;-><init>(Lcom/whatsapp/RecordAudio;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v0, 0x7f090224

    goto :goto_1

    :cond_1
    const v0, 0x7f090226

    goto :goto_2

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 21
    invoke-super {p0}, Lcom/whatsapp/DialogToastActivity;->onDestroy()V

    .line 57
    iget v0, p0, Lcom/whatsapp/RecordAudio;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 44
    :try_start_0
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V

    .line 160
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->i:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 32
    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->j:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 152
    :cond_1
    return-void

    .line 8
    :catch_0
    move-exception v0

    .line 56
    invoke-static {v0}, Lcom/whatsapp/g5;->d(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .parameter

    .prologue
    .line 116
    invoke-super {p0, p1}, Lcom/whatsapp/DialogToastActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 81
    iget v0, p0, Lcom/whatsapp/RecordAudio;->f:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whatsapp/RecordAudio;->o:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 39
    sget-object v0, Lcom/whatsapp/RecordAudio;->z:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/whatsapp/RecordAudio;->o:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 110
    :cond_0
    return-void
.end method
